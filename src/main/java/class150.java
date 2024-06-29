import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class150 {

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lsc;")
    private class166 field2074 = new class166();

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    private int field2087;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "Lue;")
    private class222 field2076;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2088 = "Created gameworld";

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "[Lne;")
    public static class83[] field2090 = new class83[29];

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "Lnh;")
    public static class305 field2079;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(JBLjava/lang/Object;)V")
    public final void method942(long arg0, byte arg1, Object arg2) {
        this.method951(arg0, 0);
        if (this.field2082 == 0) {
            class123 var5 = (class123) this.field2074.method1063((byte) -69);
            var5.method962(128);
            var5.method819((byte) -12);
        } else {
            this.field2082--;
        }
        class100 var6 = new class100(arg2);
        this.field2076.method1452(arg0, var6, 0);
        field2073++;
        this.field2074.method1068(var6, (byte) -45);
        if (arg1 <= 3) {
            field2077 = -122;
        }
        var6.field1793 = 0L;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
    public final void method943(int arg0, boolean arg1) {
        if (class228.field3566 != null) {
            for (class123 var3 = (class123) this.field2074.method1059((byte) -106); var3 != null; var3 = (class123) this.field2074.method1064((byte) -111)) {
                if (var3.method644((byte) -19)) {
                    if (var3.method645(0) == null) {
                        var3.method962(128);
                        var3.method819((byte) -12);
                        this.field2082++;
                    }
                } else if ((++var3.field1793) > ((long) arg0)) {
                    class123 var4 = class228.field3566.method504((byte) -105, var3);
                    this.field2076.method1452(var3.field2141, var4, 0);
                    class292.method1959(var3, arg1, var4);
                    var3.method962(128);
                    var3.method819((byte) -12);
                }
            }
        }
        if (arg1) {
            field2089++;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
    public final void method944(int arg0) {
        field2078++;
        this.field2074.method1065(0);
        this.field2076.method1456(0);
        int var2 = 6 % ((14 - arg0) / 59);
        this.field2082 = this.field2087;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BIILim;)V")
    public static final void method945(byte arg0, int arg1, int arg2, class178 arg3) {
        field2091++;
        if (arg0 != 49 || class179.field2721 < 2 && class265.field4266 == 0 && !class193.field2950) {
            return;
        }
        String var4 = class255.method1664((byte) 119);
        if (arg3 == null) {
            int var5 = class261.field4201.method216(var4, arg2 + 4, arg1 + 15, 16777215, 0, class272.field4341, class288.field4611);
            class166.method1055(class261.field4201.method230(var4) + var5, 15, arg1, arg2 + 4, true);
            return;
        }
        class33 var6 = arg3.method1138((byte) 93, class260.field4196);
        if (var6 == null) {
            var6 = class261.field4201;
        }
        var6.method212(var4, arg2, arg1, arg3.field2529, arg3.field2571, arg3.field2544, arg3.field2640, arg3.field2595, arg3.field2536, class272.field4341, class288.field4611, class93.field1362);
        class166.method1055(class93.field1362[2], class93.field1362[3], class93.field1362[1], class93.field1362[0], true);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
    public static final void method946(int arg0) {
        field2075++;
        if (class84.field1180 == 0) {
            return;
        }
        try {
            if (arg0 < ++class44.field662) {
                if (class272.field4332 != null) {
                    class272.field4332.method1211((byte) -100);
                    class272.field4332 = null;
                }
                if (class21.field343 >= 1) {
                    class84.field1180 = 0;
                    class174.field2457 = -5;
                    return;
                }
                if (class288.field4600 == class215.field3259) {
                    class215.field3259 = class290.field4627;
                } else {
                    class215.field3259 = class288.field4600;
                }
                class21.field343++;
                class44.field662 = 0;
                class84.field1180 = 1;
            }
            if (class84.field1180 == 1) {
                class35.field536 = class45.field667.method318(class268.field4299, 0, class215.field3259);
                class84.field1180 = 2;
            }
            if (class84.field1180 == 2) {
                if (class35.field536.field4570 == 2) {
                    throw new IOException();
                }
                if (class35.field536.field4570 != 1) {
                    return;
                }
                class272.field4332 = new class191((Socket) class35.field536.field4567, class45.field667);
                class35.field536 = null;
                class272.field4332.method1202((byte) -118, 0, class231.field3614.field3280, class231.field3614.field3287);
                if (class156.field2158 != null) {
                    class156.field2158.method886(500000);
                }
                if (class110.field1585 != null) {
                    class110.field1585.method886(500000);
                }
                int var1 = class272.field4332.method1206(-12);
                if (class156.field2158 != null) {
                    class156.field2158.method886(500000);
                }
                if (class110.field1585 != null) {
                    class110.field1585.method886(500000);
                }
                if (var1 != 101) {
                    class174.field2457 = var1;
                    class84.field1180 = 0;
                    class272.field4332.method1211((byte) 118);
                    class272.field4332 = null;
                    return;
                }
                class84.field1180 = 3;
            }
            if (class84.field1180 == 3 && class272.field4332.method1213((byte) 106) >= 2) {
                int var2 = class272.field4332.method1206(-83) << 8 | class272.field4332.method1206(-36);
                class221.method1449(arg0 - 1500, var2);
                if (class211.field3178 == -1) {
                    class84.field1180 = 0;
                    class174.field2457 = 6;
                    class272.field4332.method1211((byte) -30);
                    class272.field4332 = null;
                } else {
                    class84.field1180 = 0;
                    class272.field4332.method1211((byte) -27);
                    class272.field4332 = null;
                    class114.method724(-124);
                }
            }
        } catch (IOException var3) {
            if (class272.field4332 != null) {
                class272.field4332.method1211((byte) -94);
                class272.field4332 = null;
            }
            if (class21.field343 < 1) {
                if (class288.field4600 == class215.field3259) {
                    class215.field3259 = class290.field4627;
                } else {
                    class215.field3259 = class288.field4600;
                }
                class44.field662 = 0;
                class21.field343++;
                class84.field1180 = 1;
            } else {
                class84.field1180 = 0;
                class174.field2457 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method947(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2083++;
        int var6 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg0);
        int var7 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg4);
        int var8 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg1);
        if (!arg5) {
            method947(-86, 112, -106, -62, 118, true);
        }
        int var9 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg2);
        for (int var10 = var6; var10 <= var7; var10++) {
            class129.method822(class247.field3876[var10], var8, -2426, arg3, var9);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public final void method948(byte arg0) {
        field2085++;
        if (arg0 != 58) {
            return;
        }
        for (class123 var2 = (class123) this.field2074.method1059((byte) -106); var2 != null; var2 = (class123) this.field2074.method1064((byte) -52)) {
            if (var2.method644((byte) -19)) {
                var2.method962(128);
                var2.method819((byte) -12);
                this.field2082++;
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BZ)V")
    public static final void method949(byte arg0, boolean arg1) {
        class26.field414 = arg1;
        class280.field4453 = !class294.method1973(2);
        field2080++;
        if (arg0 < 49) {
            field2079 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(JB)Ljava/lang/Object;")
    public final Object method950(long arg0, byte arg1) {
        if (arg1 != -45) {
            this.method944(-100);
        }
        field2084++;
        class123 var4 = (class123) this.field2076.method1453(true, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method645(0);
        if (var5 == null) {
            var4.method962(128);
            var4.method819((byte) -12);
            this.field2082++;
            return null;
        }
        if (var4.method644((byte) -19)) {
            class100 var6 = new class100(var5);
            this.field2076.method1452(var4.field2141, var6, 0);
            this.field2074.method1068(var6, (byte) -45);
            var6.field1793 = 0L;
            var4.method962(arg1 + 173);
            var4.method819((byte) -12);
        } else {
            this.field2074.method1068(var4, (byte) -45);
            var4.field1793 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(JI)V")
    public final void method951(long arg0, int arg1) {
        class123 var4 = (class123) this.field2076.method1453(true, arg0);
        field2086++;
        if (var4 != null) {
            var4.method962(arg1 ^ 0x80);
            var4.method819((byte) -12);
            this.field2082++;
        }
        if (arg1 != 0) {
            method946(-110);
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V")
    public static void method952(int arg0) {
        if (arg0 != 16777215) {
            method949((byte) 38, true);
        }
        field2088 = null;
        field2090 = null;
        field2079 = null;
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)I")
    public final int method953(int arg0) {
        field2081++;
        int var2 = arg0;
        for (class123 var3 = (class123) this.field2074.method1059((byte) -106); var3 != null; var3 = (class123) this.field2074.method1064((byte) -55)) {
            if (!var3.method644((byte) -19)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V")
    public class150(int arg0) {
        this.field2087 = arg0;
        this.field2082 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field2076 = new class222(var2);
    }
}
