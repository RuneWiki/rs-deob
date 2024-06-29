import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class106 {

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "J")
    public long field1905 = 0L;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "[I")
    public static int[] field1910 = new int[2000];

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public int field1919;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Laa;")
    public class16 field1901;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Z")
    public static boolean field1920;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Z")
    public static final boolean method795(int arg0) {
        if (arg0 >= -69) {
            method797(-40, 53);
        }
        field1904++;
        if (class219.field3661 != 0) {
            try {
                if ((Boolean) class209.field3465.method378(class186.field3058.field2408, -119)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lff;I)V")
    public static final void method796(class237 arg0, int arg1) {
        arg0.field3996 = arg0.field3965;
        field1911++;
        if (arg0.field4015 == 0) {
            arg0.field4020 = 0;
            return;
        }
        if (arg0.field4002 != -1 && arg0.field3989 == 0) {
            class186 var2 = class123.method891(-5664, arg0.field4002);
            if (arg0.field4032 > 0 && var2.field3041 == 0) {
                arg0.field4020++;
                return;
            }
            if (arg0.field4032 <= 0 && var2.field3031 == 0) {
                arg0.field4020++;
                return;
            }
        }
        int var3 = arg0.field3978[arg0.field4015 - 1] * 128 + arg0.field3976 * 64;
        int var4 = arg0.field4027;
        int var5 = arg0.field3990;
        int var6 = arg0.field3980[arg0.field4015 - 1] * 128 + arg0.field3976 * 64;
        if (arg1 != 2048) {
            return;
        }
        if (var3 - var5 > 256 || var3 - var5 < -256 || (var6 - var4) > 256 || var6 - var4 < -256) {
            arg0.field4027 = var6;
            arg0.field3990 = var3;
            return;
        }
        if (var3 <= var5) {
            if (var5 > var3) {
                if (var6 > var4) {
                    arg0.field3992 = 768;
                } else if (var6 >= var4) {
                    arg0.field3992 = 512;
                } else {
                    arg0.field3992 = 256;
                }
            } else if (var4 < var6) {
                arg0.field3992 = 1024;
            } else if (var4 > var6) {
                arg0.field3992 = 0;
            }
        } else if (var4 < var6) {
            arg0.field3992 = 1280;
        } else if (var4 <= var6) {
            arg0.field3992 = 1536;
        } else {
            arg0.field3992 = 1792;
        }
        int var7 = arg0.field4010;
        int var8 = arg0.field3992 - arg0.field3993 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field4000;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field3977;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field3975;
        }
        if (var7 == -1) {
            var7 = arg0.field4000;
        }
        arg0.field3996 = var7;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class53) {
            var10 = ((class53) arg0).field959.field1196;
        }
        if (var10) {
            if (arg0.field3993 != arg0.field3992 && arg0.field3995 == -1 && arg0.field3968 != 0) {
                var9 = 2;
            }
            if (arg0.field4015 > 2) {
                var9 = 6;
            }
            if (arg0.field4015 > 3) {
                var9 = 8;
            }
            if (arg0.field4020 > 0 && arg0.field4015 > 1) {
                var9 = 8;
                arg0.field4020--;
            }
        } else {
            if (arg0.field4015 > 1) {
                var9 = 6;
            }
            if (arg0.field4015 > 2) {
                var9 = 8;
            }
            if (arg0.field4020 > 0 && arg0.field4015 > 1) {
                arg0.field4020--;
                var9 = 8;
            }
        }
        if (arg0.field3967[arg0.field4015 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var4) {
            arg0.field4027 += var9;
            if (var6 < arg0.field4027) {
                arg0.field4027 = var6;
            }
        } else if (var6 < var4) {
            arg0.field4027 -= var9;
            if (arg0.field4027 < var6) {
                arg0.field4027 = var6;
            }
        }
        if (var5 < var3) {
            arg0.field3990 += var9;
            if (var3 < arg0.field3990) {
                arg0.field3990 = var3;
            }
        } else if (var5 > var3) {
            arg0.field3990 -= var9;
            if (var3 > arg0.field3990) {
                arg0.field3990 = var3;
            }
        }
        if (arg0.field3990 == var3 && arg0.field4027 == var6) {
            if (arg0.field4032 > 0) {
                arg0.field4032--;
            }
            arg0.field4015--;
        }
        if (var9 >= 8 && arg0.field4000 == arg0.field3996 && arg0.field4023 != -1) {
            arg0.field3996 = arg0.field4023;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Lfj;")
    public static final class3 method797(int arg0, int arg1) {
        if (arg1 != 6) {
            return null;
        }
        field1921++;
        class3 var2 = (class3) class155.field2697.method764((byte) 70, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class116.field2047.method190((byte) -25, arg0, 4);
        class3 var4 = new class3();
        if (var3 != null) {
            var4.method21(105, arg0, new class217(var3));
        }
        class155.field2697.method765((byte) -123, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
    public static final void method798(int arg0) {
        class236.field3952.method763(0);
        if (arg0 == 2) {
            field1918++;
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public static void method799(int arg0) {
        if (arg0 != 20663) {
            method798(-58);
        }
        field1910 = null;
    }
}
