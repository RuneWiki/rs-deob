import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class445 {

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    private int field6151;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "[Ljs;")
    private class117[] field6140;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "S")
    public static short field6143 = 256;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Ltm;")
    public static class112 field6141 = new class112("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Lfn;")
    public static class52 field6148 = new class52(88, 8);

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public static int field6147;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field6150;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "J")
    private long field6149;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Ljs;")
    private class117 field6139;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 7)
    public static final void method2587(boolean arg0, String arg1) {
        class172.field2556 = arg1;
        field6142++;
        if (class343.field4703.field234 == null) {
            return;
        }
        try {
            String var2 = class343.field4703.field234.getParameter("cookieprefix");
            String var3 = class343.field4703.field234.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class23.method189(-27315, class193.method1237(-9581) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class207.method1298((byte) -72, "document.cookie=\"" + var5 + "\"", class343.field4703.field234);
        } catch (Throwable var6) {
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(JI)Ljs;", line = 46)
    public final class117 method2588(long arg0, int arg1) {
        if (arg1 != 28248) {
            method2591(true);
        }
        field6144++;
        this.field6149 = arg0;
        class117 var4 = this.field6140[(int) ((long) (this.field6151 - 1) & arg0)];
        for (this.field6139 = var4.field1640; this.field6139 != var4; this.field6139 = this.field6139.field1640) {
            if (this.field6139.field1649 == arg0) {
                class117 var5 = this.field6139;
                this.field6139 = this.field6139.field1640;
                return var5;
            }
        }
        this.field6139 = null;
        return null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Ljs;", line = 82)
    public final class117 method2589(int arg0) {
        int var2 = 94 % ((1 - arg0) / 33);
        field6145++;
        if (this.field6139 == null) {
            return null;
        }
        class117 var3 = this.field6140[(int) (this.field6149 & (long) (this.field6151 - 1))];
        while (this.field6139 != var3) {
            if (this.field6139.field1649 == this.field6149) {
                class117 var4 = this.field6139;
                this.field6139 = this.field6139.field1640;
                return var4;
            }
            this.field6139 = this.field6139.field1640;
        }
        this.field6139 = null;
        return null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V", line = 113)
    public static final void method2590(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class256.field3582 != 0 && arg4 != 0 && class345.field4718 < 50 && arg3 != -1) {
            class325.field4478[class345.field4718] = arg3;
            class317.field4304[class345.field4718] = arg4;
            class189.field2715[class345.field4718] = arg1;
            class400.field5593[class345.field4718] = null;
            class468.field6565[class345.field4718] = 0;
            class197.field2835[class345.field4718] = arg2;
            class345.field4718++;
        }
        field6147++;
        if (arg0 == 10683) {
            ;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V", line = 145)
    public static final void method2591(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class477.field6744; var1++) {
            int var2 = class454.field6278[var1];
            class196 var3 = class256.field3581[var2];
            int var4 = class388.field5458.method2503(!arg0);
            if ((var4 & 0x4) != 0) {
                var4 += class388.field5458.method2503(true) << 8;
            }
            if ((var4 & 0x100) != 0) {
                int var5 = class388.field5458.method2503(!arg0);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class388.field5458.method2483(-2103088664);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class388.field5458.method2459(-105);
                    var8[var9] = class388.field5458.method2492((byte) -48);
                }
                class294.method1820(-3721, var3, var7, var6, var8);
            }
            if ((var4 & 0x8) != 0) {
                int var11 = class388.field5458.method2492((byte) -48);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = class388.field5458.method2512((byte) -56);
                class473.method2775(var3, var12, 0, var11);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field2789.method776(0)) {
                    class7.method87(-122, var3);
                }
                var3.method1248(class467.field6550.method1359(class388.field5458.method2492((byte) -48), true), -2);
                var3.method506(-64, var3.field2789.field1786);
                var3.field1063 = var3.field2789.field1806 << 3;
                if (var3.field2789.method776(0)) {
                    class167.method1024((class23) null, var3, 128, var3.field6766, var3.field1144[0], 0, (class475) null, var3.field1140[0]);
                }
            }
            if ((var4 & 0x40) != 0) {
                int var13 = class388.field5458.method2474((byte) 68);
                int var14 = class388.field5458.method2459(-92);
                var3.method514(class356.field4972, var13, var14, (byte) -122);
                var3.field1069 = class356.field4972 + 300;
                var3.field1113 = class388.field5458.method2512((byte) -56);
            }
            if ((var4 & 0x10) != 0) {
                var3.field1096 = class388.field5458.method2483(-2103088664);
                if (var3.field1096 == 65535) {
                    var3.field1096 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var15 = class388.field5458.method2474((byte) -70);
                int var16 = class388.field5458.method2459(-117);
                var3.method514(class356.field4972, var15, var16, (byte) -125);
            }
            if ((var4 & 0x200) != 0) {
                var3.field2780 = class388.field5458.method2500(104);
                var3.field2775 = class388.field5458.method2500(89);
            }
            if ((var4 & 0x80) != 0) {
                int var17 = class388.field5458.method2500(100);
                if (var17 == 65535) {
                    var17 = -1;
                }
                int var18 = class388.field5458.method2484(-108);
                boolean var19 = true;
                if (var17 != -1 && var3.field1079 != -1) {
                    if (var3.field1079 == var17) {
                        class321 var24 = class163.field2348.method548(var17, (byte) -89);
                        if (var24.field4392 && var24.field4391 != -1) {
                            class372 var25 = class31.field505.method950(true, var24.field4391);
                            int var26 = var25.field5271;
                            if (var26 == 0) {
                                var19 = false;
                            } else if (var26 == 1) {
                                var19 = true;
                            } else if (var26 == 2) {
                                var19 = false;
                                var3.field1071 = 0;
                            }
                        }
                    } else {
                        class321 var20 = class163.field2348.method548(var17, (byte) 89);
                        class321 var21 = class163.field2348.method548(var3.field1079, (byte) -98);
                        if (var20.field4391 != -1 && var21.field4391 != -1) {
                            class372 var22 = class31.field505.method950(true, var20.field4391);
                            class372 var23 = class31.field505.method950(true, var21.field4391);
                            if (var22.field5260 < var23.field5260) {
                                var19 = false;
                            }
                        }
                    }
                }
                if (var19) {
                    var3.field1132 = var18 >> 16;
                    var3.field1121 = (var18 & 0xFFFF) + class356.field4972;
                    var3.field1125 = 0;
                    var3.field1074 = 1;
                    var3.field1079 = var17;
                    var3.field1091 = 0;
                    if (class356.field4972 < var3.field1121) {
                        var3.field1091 = -1;
                    }
                    if (var3.field1079 != -1 && class356.field4972 == var3.field1121) {
                        int var27 = class163.field2348.method548(var3.field1079, (byte) 8).field4391;
                        if (var27 != -1) {
                            class372 var28 = class31.field505.method950(!arg0, var27);
                            if (var28 != null && var28.field5278 != null) {
                                class272.method1706(var3.field6766, var28, false, (byte) 31, var3.field6765, var3.field6746, 0);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1118 = class388.field5458.method2464(false);
                var3.field1084 = 100;
            }
            if ((var4 & 0x400) != 0) {
                int var29 = class388.field5458.method2483(-2103088664);
                var3.field1067 = class388.field5458.method2503(true);
                var3.field1130 = class388.field5458.method2512((byte) -56);
                var3.field1112 = var29 & 0x7FFF;
                var3.field1122 = (var29 & 0x8000) != 0;
                var3.field1066 = class356.field4972 + var3.field1112 + var3.field1067;
            }
        }
        field6152++;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V", line = 389)
    public static void method2592(int arg0) {
        field6141 = null;
        if (arg0 == -65536) {
            field6148 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljs;JI)V", line = 406)
    public final void method2593(class117 arg0, long arg1, int arg2) {
        if (arg0.field1638 != null) {
            arg0.method738(-13002);
        }
        field6153++;
        class117 var5 = this.field6140[(int) ((long) (this.field6151 - 1) & arg1)];
        arg0.field1638 = var5.field1638;
        arg0.field1640 = var5;
        arg0.field1638.field1640 = arg0;
        if (arg2 <= 72) {
            this.method2588(-79L, 87);
        }
        arg0.field1640.field1638 = arg0;
        arg0.field1649 = arg1;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V", line = 431)
    public class445(int arg0) {
        this.field6151 = arg0;
        this.field6140 = new class117[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class117 var3 = this.field6140[var2] = new class117();
            var3.field1638 = var3;
            var3.field1640 = var3;
        }
    }
}
