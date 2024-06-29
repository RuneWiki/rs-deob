import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class29 extends class175 {

    @OriginalMember(owner = "client!u", name = "U", descriptor = "Lmb;")
    public static class96 field477 = class243.method1708("null", (byte) 105);

    @OriginalMember(owner = "client!u", name = "W", descriptor = "Lmb;")
    public static class96 field479 = class243.method1708("<img=0>", (byte) 106);

    @OriginalMember(owner = "client!u", name = "X", descriptor = "Lmb;")
    private static class96 field480 = class243.method1708("Loading sprites )2 ", (byte) 96);

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "Lmb;")
    public static class96 field481 = field480;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
    public static void method188(boolean arg0) {
        field480 = null;
        field481 = null;
        if (arg0) {
            field481 = null;
        }
        field477 = null;
        field479 = null;
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
    public static final void method189(int arg0) {
        if (class153.field2681 == null || class103.field1741 == null) {
            class103.field1741 = new int[256];
            class153.field2681 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class153.field2681[var1] = (int) (Math.sin(var2) * 4096.0D);
                class103.field1741[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field482++;
        if (arg0 != 4096) {
            field477 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BZIIII)V")
    public static final void method190(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class51.field899++;
        if (!arg1) {
            class229.method1566(10845, true);
            class237.method1612(true, 953291916);
            class229.method1566(10845, false);
        }
        class237.method1612(false, 953291916);
        if (!arg1) {
            class37.method290(arg0 ^ 0x6FB);
        }
        class25.method173(false);
        if (class179.field3095 == 1) {
            int var6 = class117.field2170;
            if (class40.field690 / 256 > var6) {
                var6 = class40.field690 / 256;
            }
            if (class208.field3583[4] && (class171.field3005[4] + 128) > var6) {
                var6 = class171.field3005[4] + 128;
            }
            int var7 = class277.field4832 + class235.field4033 & 0x7FF;
            class94.method663(class3.field69, class44.field752, (var6 * 3) + 600, true, class137.method1025(class216.field3712, class236.field4047.field4533, class236.field4047.field4511, (byte) -94) - 50, var6, var7, arg5);
        }
        field473++;
        int var8 = class178.field3078;
        int var9 = class22.field389;
        if (arg0 != -57) {
            field480 = null;
        }
        int var10 = class140.field2501;
        int var11 = class23.field392;
        int var12 = class105.field1767;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class208.field3583[var13]) {
                int var19 = (int) ((double) (-class80.field1371[var13]) + (double) (class80.field1371[var13] * 2 + 1) * Math.random() + Math.sin((double) class93.field1542[var13] / 100.0D * (double) class25.field426[var13]) * (double) class171.field3005[var13]);
                if (var13 == 1) {
                    class105.field1767 += var19;
                }
                if (var13 == 3) {
                    class23.field392 = class23.field392 + var19 & 0x7FF;
                }
                if (var13 == 2) {
                    class22.field389 += var19;
                }
                if (var13 == 0) {
                    class178.field3078 += var19;
                }
                if (var13 == 4) {
                    class140.field2501 += var19;
                    if (class140.field2501 < 128) {
                        class140.field2501 = 128;
                    }
                    if (class140.field2501 > 383) {
                        class140.field2501 = 383;
                    }
                }
            }
        }
        class247.method1728(-1250974457);
        class84.method593(arg2, arg4, arg2 + arg3, arg4 + arg5);
        class240.method1679();
        if (class170.field2981 || class146.field2601 < arg2 || (arg2 + arg3) <= class146.field2601 || class122.field2267 < arg4 || class122.field2267 >= arg4 + arg5) {
            class214.field3680 = false;
            class227.field3861 = 0;
        } else {
            class227.field3861 = 0;
            class214.field3680 = true;
            int var14 = class260.field4545;
            int var15 = class245.field4263;
            int var16 = class224.field3819;
            class148.field2622 = (class146.field2601 - arg2) * (var15 - var16) / arg3 + var16;
            int var17 = class256.field4469;
            class165.field2928 = (class122.field2267 - arg4) * (var17 - var14) / arg5 + var14;
        }
        class135.method1009((byte) 3);
        byte var18 = class262.method1812(true) == 2 ? (byte) class51.field899 : 1;
        class84.method598(arg2, arg4, arg3, arg5, 0);
        class11.method90(class178.field3078, class105.field1767, class22.field389, class140.field2501, class23.field392, class153.field2690, class138.field2471, class9.field144, class2.field19, class50.field875, class56.field966, class216.field3712 + 1, var18, class236.field4047.field4511 >> 7, class236.field4047.field4533 >> 7);
        class135.method1009((byte) 3);
        class120.method927();
        class276.method1873(256, 256, arg5, arg2, arg4, arg3, (byte) 106);
        class138.method1033(arg2, arg5, arg4, arg3, 256, -15808, 256);
        ((class114) class240.field4167).method898(class62.field1063, (byte) -58);
        class89.method630(arg5, arg2, arg4, arg3, 100);
        class105.field1767 = var12;
        class23.field392 = var11;
        class22.field389 = var9;
        class178.field3078 = var8;
        class140.field2501 = var10;
        if (class37.field633 && class181.field3128.method736(55) == 0) {
            class37.field633 = false;
        }
        if (class37.field633) {
            class84.method598(arg2, arg4, arg3, arg5, 0);
            class241.method1698(arg0 ^ 0xFFFFDFD0, class103.field1742, false);
        }
        if (!arg1 && !class37.field633 && !class170.field2981 && class146.field2601 >= arg2 && (arg2 + arg3) > class146.field2601 && arg4 <= class122.field2267 && class122.field2267 < arg4 + arg5) {
            class50.method380(arg3, arg5, class146.field2601, (byte) -86, arg4, class122.field2267, arg2);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method191(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg0 + arg5;
        int var9 = arg4 + arg5;
        if (arg2) {
            method191(-82, 95, false, 115, 31, 102, -40, 85);
        }
        int var10 = arg3 - arg5;
        for (int var11 = arg0; var11 < var8; var11++) {
            class36.method283(arg4, class229.field3939[var11], arg7, (byte) -64, arg1);
        }
        field478++;
        int var12 = arg7 - arg5;
        for (int var13 = arg3; var13 > var10; var13--) {
            class36.method283(arg4, class229.field3939[var13], arg7, (byte) -106, arg1);
        }
        for (int var14 = var8; var14 <= var10; var14++) {
            int[] var15 = class229.field3939[var14];
            class36.method283(arg4, var15, var9, (byte) -101, arg1);
            class36.method283(var9, var15, var12, (byte) -64, arg6);
            class36.method283(var12, var15, arg7, (byte) -118, arg1);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIZII)V")
    public static final void method192(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = arg0 - arg1;
        int var7 = arg5 - arg2;
        field475++;
        if (var7 == 0) {
            if (var6 != 0) {
                class151.method1108(arg1, arg4, arg0, arg2, -1);
            }
        } else if (var6 == 0) {
            class231.method1577(arg2, arg1, arg4, arg5, 8);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                int var10 = arg5;
                arg2 = arg1;
                arg5 = arg0;
                arg1 = var9;
                arg0 = var10;
            }
            if (arg5 < arg2) {
                int var11 = arg2;
                int var12 = arg1;
                arg1 = arg0;
                arg2 = arg5;
                arg5 = var11;
                arg0 = var12;
            }
            int var13 = arg1;
            if (arg3) {
                method189(-98);
            }
            int var14 = arg5 - arg2;
            int var15 = -(var14 >> 1);
            int var16 = arg0 - arg1;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = arg1 >= arg0 ? -1 : 1;
            if (var8) {
                for (int var18 = arg2; var18 <= arg5; var18++) {
                    var15 += var16;
                    class229.field3939[var18][var13] = arg4;
                    if (var15 > 0) {
                        var13 += var17;
                        var15 -= var14;
                    }
                }
            } else {
                for (int var19 = arg2; var19 <= arg5; var19++) {
                    class229.field3939[var13][var19] = arg4;
                    var15 += var16;
                    if (var15 > 0) {
                        var15 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILmb;Lmb;IILmb;)V")
    public static final void method193(int arg0, class96 arg1, class96 arg2, int arg3, int arg4, class96 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class91.field1508[var6] = class91.field1508[var6 - 1];
            class83.field1416[var6] = class83.field1416[var6 - 1];
            class192.field3319[var6] = class192.field3319[var6 - 1];
            class197.field3437[var6] = class197.field3437[var6 - 1];
            class98.field1673[var6] = class98.field1673[var6 - 1];
        }
        if (arg0 != -1) {
            return;
        }
        class57.field1009++;
        field472++;
        class83.field1416[0] = arg5;
        class91.field1508[0] = arg4;
        class92.field1530 = class67.field1137;
        class192.field3319[0] = arg2;
        class98.field1673[0] = arg3;
        class197.field3437[0] = arg1;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class29() {
        super(0, true);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)Z")
    public static final boolean method194(byte arg0, int arg1, int arg2) {
        field474++;
        class196 var3 = class132.method995(arg2, 0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg0 <= 74) {
            return true;
        } else {
            if (arg1 >= 5 && arg1 <= 8) {
                arg1 = 4;
            }
            return var3.method1363(0, arg1);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        field476++;
        int var3 = 51 / ((arg0 - 62) / 54);
        return class244.field4240;
    }
}
