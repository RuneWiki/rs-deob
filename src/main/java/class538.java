import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class538 {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public int field7906 = 8;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public int field7915 = 16777215;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "Lvr;")
    public static class92 field7913 = new class92(14, 0, 4, 1);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public int field7905;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field7908;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public int field7909;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field7910;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public int field7911;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public int field7912;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public int field7914;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "Z")
    public boolean field7917;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static void method3166(int arg0) {
        if (arg0 != -10523) {
            field7913 = null;
        }
        field7913 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILwn;B)V")
    private final void method3167(int arg0, class519 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field7906 = arg1.method3018(566990904);
        } else if (arg0 == 2) {
            this.field7917 = true;
        } else if (arg0 == 3) {
            this.field7905 = arg1.method3044((byte) -115);
            this.field7914 = arg1.method3044((byte) -84);
            this.field7911 = arg1.method3044((byte) -113);
        } else if (arg0 == 4) {
            this.field7912 = arg1.method3072((byte) -128);
        } else if (arg0 == 5) {
            this.field7909 = arg1.method3018(566990904);
        } else if (arg0 == 6) {
            this.field7915 = arg1.method3040((byte) -3);
        }
        int var4 = -72 % ((arg2 - 87) / 32);
        field7916++;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIB)I")
    public static final int method3168(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        if (arg3 != -93) {
            return 11;
        }
        field7908++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
    public static final void method3169(int arg0) {
        field7910++;
        int var1 = class530.field7811 * 128 + 64;
        int var2 = class370.field5338 * 128 + 64;
        int var3 = class224.method1515(var1, var2, class123.field1944, -631749433) - class306.field4542;
        if (class19.field208 < 100) {
            if (var1 > class315.field4688) {
                class315.field4688 += (var1 - class315.field4688) * class19.field208 / 1000 + class520.field7591;
                if (var1 < class315.field4688) {
                    class315.field4688 = var1;
                }
            }
            if (var1 < class315.field4688) {
                class315.field4688 -= (class315.field4688 - var1) * class19.field208 / 1000 + class520.field7591;
                if (var1 > class315.field4688) {
                    class315.field4688 = var1;
                }
            }
            if (var3 > class62.field1086) {
                class62.field1086 += (var3 - class62.field1086) * class19.field208 / 1000 + class520.field7591;
                if (var3 < class62.field1086) {
                    class62.field1086 = var3;
                }
            }
            if (var2 > class397.field5649) {
                class397.field5649 += (var2 - class397.field5649) * class19.field208 / 1000 + class520.field7591;
                if (class397.field5649 > var2) {
                    class397.field5649 = var2;
                }
            }
            if (class62.field1086 > var3) {
                class62.field1086 -= (class62.field1086 - var3) * class19.field208 / 1000 + class520.field7591;
                if (class62.field1086 < var3) {
                    class62.field1086 = var3;
                }
            }
            if (var2 < class397.field5649) {
                class397.field5649 -= (class397.field5649 - var2) * class19.field208 / 1000 + class520.field7591;
                if (var2 > class397.field5649) {
                    class397.field5649 = var2;
                }
            }
        } else {
            class315.field4688 = class530.field7811 * 128 + 64;
            class397.field5649 = class370.field5338 * 128 + 64;
            class62.field1086 = class224.method1515(class315.field4688, class397.field5649, class123.field1944, -631749433) - class306.field4542;
        }
        int var4 = class52.field964 * 128 + 64;
        int var5 = class133.field2083 * 128 + 64;
        int var6 = class224.method1515(var5, var4, class123.field1944, arg0 ^ 0xDA587B38) - class305.field4525;
        int var7 = var5 - class315.field4688;
        int var8 = var6 - class62.field1086;
        int var9 = var4 - class397.field5649;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = arg0 & (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D);
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class254.field3756 < var11) {
            class254.field3756 += (var11 - class254.field3756 >> 3) * class84.field1331 / 1000 + class27.field386 << 3;
            if (var11 < class254.field3756) {
                class254.field3756 = var11;
            }
        }
        if (var11 < class254.field3756) {
            class254.field3756 -= (class254.field3756 - var11 >> 3) * class84.field1331 / 1000 + class27.field386 << 3;
            if (var11 > class254.field3756) {
                class254.field3756 = var11;
            }
        }
        int var13 = var12 - class171.field2548;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class171.field2548 += class84.field1331 * var14 / 1000 + class27.field386 << 3;
            class171.field2548 &= 0x3FFF;
        }
        if (var14 < 0) {
            class171.field2548 -= -var14 * class84.field1331 / 1000 + class27.field386 << 3;
            class171.field2548 &= 0x3FFF;
        }
        int var15 = var12 - class171.field2548;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class39.field835 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class171.field2548 = var12;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lwn;Z)V")
    public final void method3170(class519 arg0, boolean arg1) {
        field7907++;
        if (arg1) {
            this.field7914 = 113;
        }
        while (true) {
            int var3 = arg0.method3072((byte) -119);
            if (var3 == 0) {
                return;
            }
            this.method3167(var3, arg0, (byte) 121);
        }
    }

    static {
        new class44(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }
}
