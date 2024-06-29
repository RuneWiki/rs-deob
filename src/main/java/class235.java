import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class235 extends class263 {

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public int field3042;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field3045;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Llh;")
    public static class492 field3043 = new class492("LOCAL", 4);

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field3044;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field3046;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1421(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1418(int arg0) {
        for (int var1 = 0; var1 < class94.field1209; var1++) {
            int var2 = class374.field4827[var1];
            class506 var3 = ((class704) class168.field1973.method3828((long) var2, (byte) -91)).field9854;
            int var4 = class222.field2585.method3097((byte) 12);
            if ((var4 & 0x2) != 0) {
                var4 += class222.field2585.method3097((byte) 12) << 8;
            }
            if ((var4 & 0x100) != 0) {
                int var5 = class222.field2585.method3054(-2);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class222.field2585.method3040(arg0 - 16771608);
                int var7 = class222.field2585.method3063(0);
                var3.method216(var7, var6, arg0 ^ 0xFFFFEA18, var5, true);
            }
            if ((var4 & 0x400) != 0) {
                int var8 = class222.field2585.method3096(-106);
                var3.field500 = class222.field2585.method3068((byte) 40);
                var3.field421 = class222.field2585.method3076((byte) -43);
                var3.field486 = (var8 & 0x8000) != 0;
                var3.field459 = var8 & 0x7FFF;
                var3.field479 = class665.field9027 + var3.field459 + var3.field500;
            }
            if ((var4 & 0x2000) != 0) {
                var3.field456 = class222.field2585.method3066(27382);
                var3.field449 = class222.field2585.method3087(86);
                var3.field437 = class222.field2585.method3066(arg0 ^ 0xFFFF80EE);
                var3.field410 = class222.field2585.method3087(arg0 ^ 0xFFFFEA46);
                var3.field470 = class222.field2585.method3031(-1) + class665.field9027;
                var3.field445 = class222.field2585.method3031(-1) + class665.field9027;
                var3.field409 = class222.field2585.method3076((byte) -52);
                var3.field437 += var3.field508[0];
                var3.field506 = 0;
                var3.field503 = 1;
                var3.field410 += var3.field511[0];
                var3.field449 += var3.field511[0];
                var3.field456 += var3.field508[0];
            }
            if ((var4 & 0x1000) != 0) {
                var3.field423 = class222.field2585.method3095(0);
                var3.field412 = class222.field2585.method3095(0);
                var3.field419 = class222.field2585.method3066(27382);
                var3.field416 = (byte) class222.field2585.method3076((byte) 98);
                var3.field493 = class665.field9027 + class222.field2585.method3031(-1);
                var3.field439 = class665.field9027 + class222.field2585.method3031(-1);
            }
            if ((var4 & 0x200) != 0) {
                int var9 = class222.field2585.method3076((byte) 102);
                int[] var10 = new int[var9];
                int[] var11 = new int[var9];
                int[] var12 = new int[var9];
                for (int var13 = 0; var13 < var9; var13++) {
                    int var14 = class222.field2585.method3054(-2);
                    if (var14 == 65535) {
                        var14 = -1;
                    }
                    var10[var13] = var14;
                    var11[var13] = class222.field2585.method3076((byte) 123);
                    var12[var13] = class222.field2585.method3084((byte) 88);
                }
                class179.method1061(var10, var3, var12, var11, 0);
            }
            if ((var4 & 0x40) != 0) {
                int[] var15 = new int[4];
                for (int var16 = 0; var16 < 4; var16++) {
                    var15[var16] = class222.field2585.method3054(-2);
                    if (var15[var16] == 65535) {
                        var15[var16] = -1;
                    }
                }
                int var17 = class222.field2585.method3068((byte) 45);
                class292.method1765(var15, arg0 + 5506, var3, var17);
            }
            if ((var4 & 0x20) != 0) {
                int var18 = class222.field2585.method3033((byte) 91);
                int var19 = class222.field2585.method3076((byte) 113);
                var3.method225(class665.field9027, var19, (byte) 115, var18);
                var3.field434 = class665.field9027 + 300;
                var3.field427 = class222.field2585.method3068((byte) 86);
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field6326.method3814(true)) {
                    class550.method2944((byte) -93, var3);
                }
                var3.method2759(0, class46.field620.method3763(class222.field2585.method3084((byte) 114), arg0 ^ 0x15E6));
                var3.method223(21969, var3.field6326.field9495);
                var3.field480 = var3.field6326.field9518 << 3;
                if (var3.field6326.method3814(true)) {
                    class132.method859(null, var3.field508[0], var3, var3.field8010, null, var3.field511[0], 0, 3);
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field6329 = class222.field2585.method3096(-8);
                var3.field6324 = class222.field2585.method3031(-1);
            }
            if ((var4 & 0x10) != 0) {
                int var20 = class222.field2585.method3031(-1);
                int var21 = class222.field2585.method3094((byte) 100);
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var22 = class222.field2585.method3068((byte) 31);
                var3.method216(var22, var21, 0, var20, false);
            }
            if ((var4 & 0x800) != 0) {
                int var23 = class222.field2585.method3033((byte) 91);
                int var24 = class222.field2585.method3068((byte) -128);
                var3.method225(class665.field9027, var24, (byte) 122, var23);
            }
            if ((var4 & 0x8) != 0) {
                var3.field491 = class222.field2585.method3084((byte) 114);
                if (var3.field491 == 65535) {
                    var3.field491 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field494 = class222.field2585.method3072(255);
                var3.field485 = 100;
            }
        }
        if (arg0 != -5608) {
            method1418(31);
        }
        field3044++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 219)
    public static void method1419(boolean arg0) {
        field3043 = null;
        if (arg0) {
            field3043 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIII)V", line = 232)
    public static final void method1420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3041++;
        if (arg3 >= 0 && arg0 >= 0 && arg3 < class85.field1090 - 1 && class656.field8932 - 1 > arg0) {
            if (class407.field5237 == null) {
                return;
            }
            if (arg4 == 0) {
                class310 var8 = (class310) class593.method3281(arg7, arg3, arg0);
                class310 var9 = (class310) class229.method1382(arg7, arg3, arg0);
                if (var8 != null && arg2 != 2) {
                    if (var8 instanceof class509) {
                        ((class509) var8).field6369.method897(arg5, arg6 + 5746);
                    } else {
                        class38.method247(arg3, (byte) -96, arg2, arg0, var8.method131((byte) -97), arg4, arg5, arg7, arg1);
                    }
                }
                if (var9 != null) {
                    if (var9 instanceof class509) {
                        ((class509) var9).field6369.method897(arg5, 5743);
                    } else {
                        class38.method247(arg3, (byte) -96, arg2, arg0, var9.method131((byte) -97), arg4, arg5, arg7, arg1);
                    }
                }
            } else if (arg4 == 1) {
                class310 var12 = (class310) class546.method2924(arg7, arg3, arg0);
                if (var12 != null) {
                    if (var12 instanceof class591) {
                        ((class591) var12).field7942.method897(arg5, 5743);
                    } else {
                        int var13 = var12.method131((byte) -97);
                        if (arg2 == 4 || arg2 == 5) {
                            class38.method247(arg3, (byte) -96, 4, arg0, var13, arg4, arg5, arg7, arg1);
                        } else if (arg2 == 6) {
                            class38.method247(arg3, (byte) -96, 4, arg0, var13, arg4, arg5, arg7, arg1 + 4);
                        } else if (arg2 == 7) {
                            class38.method247(arg3, (byte) -96, 4, arg0, var13, arg4, arg5, arg7, (arg1 + 2 & 0x3) + 4);
                        } else if (arg2 == 8) {
                            class38.method247(arg3, (byte) -96, 4, arg0, var13, arg4, arg5, arg7, arg1 + 4);
                            class38.method247(arg3, (byte) -96, 4, arg0, var13, arg4, arg5, arg7, (arg1 + 2 & 0x3) + 4);
                        }
                    }
                }
            } else if (arg4 == 2) {
                class310 var11 = (class310) class513.method2796(arg7, arg3, arg0, field3046 == null ? (field3046 = method1421("pba")) : field3046);
                if (var11 != null) {
                    if (arg2 == 11) {
                        arg2 = 10;
                    }
                    if ((var11 instanceof class623)) {
                        ((class623) var11).field8451.method897(arg5, arg6 ^ 0xFFFFE992);
                    } else {
                        class38.method247(arg3, (byte) -96, arg2, arg0, var11.method131((byte) -97), arg4, arg5, arg7, arg1);
                    }
                }
            } else if (arg4 == 3) {
                class310 var10 = (class310) class618.method3444(arg7, arg3, arg0);
                if (var10 != null) {
                    if (var10 instanceof class710) {
                        ((class710) var10).field9914.method897(arg5, 5743);
                    } else {
                        class38.method247(arg3, (byte) -96, arg2, arg0, var10.method131((byte) -97), arg4, arg5, arg7, arg1);
                    }
                }
            }
        }
        if (arg6 != -3) {
            method1418(83);
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(II)V", line = 348)
    public class235(int arg0, int arg1) {
        this.field3042 = arg1;
        this.field3045 = arg0;
    }
}
