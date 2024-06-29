import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class16 extends class425 {

    @OriginalMember(owner = "client!tda", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field145;

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!tda", name = "r", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!tda", name = "s", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!tda", name = "u", descriptor = "I")
    public static int field144;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tda", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field146;

    @OriginalMember(owner = "client!tda", name = "t", descriptor = "[I")
    public static int[] field143;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)V")
    public final void method72(boolean arg0) {
        field142++;
        this.field145.method3322();
        if (!arg0) {
            field143 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lqa;B)V")
    public static final void method73(class167 arg0, byte arg1) {
        field140++;
        int var2 = class290.field4257;
        int var3 = class218.field3232;
        int var4 = class452.field6607;
        int var5 = class475.field7252;
        int var6 = -10660793;
        arg0.method1066((byte) 110, var3, var6, var2, var5, var4);
        arg0.method1066((byte) 107, var3 + 1, -16777216, var2 + 1, 16, var4 - 2);
        arg0.method1067(var4 - 2, (byte) -55, -16777216, var5 - 19, var3 + 18, var2 + 1);
        class179.field2757.method1683(var6, -1, class88.field1126.method2953(3181, class77.field889), var2 + 3, var3 - -14, 19945);
        if (arg1 != 92) {
            return;
        }
        int var7 = class350.field5071.method635(-192);
        int var8 = class350.field5071.method633((byte) 29);
        int var9 = 0;
        for (class548 var10 = (class548) class272.field4014.method2496((byte) 24); var10 != null; var10 = (class548) class272.field4014.method2494(97)) {
            int var11 = (class487.field7385 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var2 + var4 > var7 && var11 - 13 < var8 && (var11 + 3) > var8 && var10.field8172) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class647.method3732(var10.field8163, (byte) -80)) {
                var13 = class216.field3204.method3357((int) var10.field8171, (byte) -76).field5965;
            } else if (var10.field8174 != -1) {
                var13 = class216.field3204.method3357(var10.field8174, (byte) -45).field5965;
            } else if (class555.method3242(var10.field8163, (byte) 106)) {
                class234 var16 = (class234) class627.field9185.method1333((long) ((int) var10.field8171), false);
                if (var16 != null) {
                    class383 var17 = var16.field3443;
                    class429 var18 = var17.field5601;
                    if (var18.field6238 != null) {
                        var18 = var18.method2629(class406.field5823, (byte) 97);
                    }
                    if (var18 != null) {
                        var13 = var18.field6253;
                    }
                }
            } else if (class340.method2113((byte) -82, var10.field8163)) {
                Object var14 = null;
                class158 var15;
                if (var10.field8163 == 1006) {
                    var15 = class312.field4690.method2004(false, (int) var10.field8171);
                } else {
                    var15 = class312.field4690.method2004(false, (int) (var10.field8171 >>> 32 & 0x7FFFFFFFL));
                }
                if (var15.field2035 != null) {
                    var15 = var15.method923(-119, class406.field5823);
                }
                if (var15 != null) {
                    var13 = var15.field2104;
                }
            }
            String var19 = class105.method606((byte) 66, var10);
            if (var13 != null) {
                var19 = var19 + class148.method874(23965, var13);
            }
            class179.field2757.method1678(class465.field6720, (byte) 124, var12, 0, var2 + 3, var11, var19, class427.field6112);
            if (var10.field8169) {
                class148.field1920.method723(class511.field7585.method1053((byte) -124, var19) + var2 + 5, var11 + -12);
            }
            var9++;
        }
        class265.method1698(class290.field4257, class475.field7252, class218.field3232, class452.field6607, (byte) 75);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIIIIILqa;)V")
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class167 arg8) {
        if (arg2 != 3) {
            method74(-37, -45, 73, 55, -45, 63, 113, -24, null);
        }
        field144++;
        class438 var9 = (class438) class491.method2972(arg6, arg7, arg0);
        if (var9 != null) {
            class158 var10 = class312.field4690.method2004(false, var9.method173(55));
            int var11 = var9.method170(-5527) & 0x3;
            int var12 = var9.method171(true);
            if (var10.field2040 == -1) {
                int var13 = arg1;
                if (var10.field2028 > 0) {
                    var13 = arg5;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method1069(4, var13, arg3, arg4, 1);
                    } else if (var11 == 1) {
                        arg8.method1068(1, var13, arg3, arg4, 4);
                    } else if (var11 == 2) {
                        arg8.method1069(4, var13, arg3, arg4 + 3, arg2 + -2);
                    } else if (var11 == 3) {
                        arg8.method1068(1, var13, arg3 + 3, arg4, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method1066((byte) 88, arg3, var13, arg4, 1, 1);
                    } else if (var11 == 1) {
                        arg8.method1066((byte) 111, arg3, var13, arg4 + 3, 1, 1);
                    } else if (var11 == 2) {
                        arg8.method1066((byte) 59, arg3 + 3, var13, arg4 + 3, 1, 1);
                    } else if (var11 == 3) {
                        arg8.method1066((byte) 96, arg3 + 3, var13, arg4, 1, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method1068(1, var13, arg3, arg4, 4);
                    } else if (var11 == 1) {
                        arg8.method1069(4, var13, arg3, arg4 + 3, 1);
                    } else if (var11 == 2) {
                        arg8.method1068(1, var13, arg3 + 3, arg4, 4);
                    } else if (var11 == 3) {
                        arg8.method1069(4, var13, arg3, arg4, 1);
                    }
                }
            } else {
                class502.method3016(arg3, 0, arg4, var11, var10, arg8);
            }
        }
        class438 var14 = (class438) class488.method2956(arg6, arg7, arg0, field146 == null ? (field146 = method77("ej")) : field146);
        if (var14 != null) {
            class158 var15 = class312.field4690.method2004(false, var14.method173(120));
            int var16 = var14.method170(-5527) & 0x3;
            int var17 = var14.method171(true);
            if (var15.field2040 != -1) {
                class502.method3016(arg3, arg2 ^ 0x3, arg4, var16, var15, arg8);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field2028 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method1065(arg3, arg4 + 3, var18, 76, arg4, arg3 + 3);
                } else {
                    arg8.method1065(arg3 + 3, arg4 + 3, var18, -124, arg4, arg3);
                }
            }
        }
        class438 var19 = (class438) class287.method1784(arg6, arg7, arg0);
        if (var19 == null) {
            return;
        }
        class158 var20 = class312.field4690.method2004(false, var19.method173(arg2 ^ 0x49));
        int var21 = var19.method170(arg2 ^ 0xFFFFEA6A) & 0x3;
        if (var20.field2040 != -1) {
            class502.method3016(arg3, arg2 ^ 0x3, arg4, var21, var20, arg8);
            return;
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
    public static void method75(int arg0) {
        field143 = null;
        if (arg0 != 1) {
            field143 = null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILwca;ZII)V")
    public static final void method76(int arg0, class311 arg1, boolean arg2, int arg3, int arg4) {
        field141++;
        int var5 = arg1.field4543;
        if (arg0 != -1117) {
            method75(-125);
        }
        int var6 = arg1.field4620;
        if (arg1.field4679 == 0) {
            arg1.field4543 = arg1.field4546;
        } else if (arg1.field4679 == 1) {
            arg1.field4543 = arg4 - arg1.field4546;
        } else if (arg1.field4679 == 2) {
            arg1.field4543 = arg1.field4546 * arg4 >> 14;
        }
        if (arg1.field4617 == 0) {
            arg1.field4620 = arg1.field4536;
        } else if (arg1.field4617 == 1) {
            arg1.field4620 = arg3 - arg1.field4536;
        } else if (arg1.field4617 == 2) {
            arg1.field4620 = arg1.field4536 * arg3 >> 14;
        }
        if (arg1.field4679 == 4) {
            arg1.field4543 = arg1.field4677 * arg1.field4620 / arg1.field4588;
        }
        if (arg1.field4617 == 4) {
            arg1.field4620 = arg1.field4588 * arg1.field4543 / arg1.field4677;
        }
        if (class220.field3252 && (client.method3619(arg1).field8904 != 0 || arg1.field4655 == 0)) {
            if (arg1.field4620 < 5 && arg1.field4543 < 5) {
                arg1.field4543 = 5;
                arg1.field4620 = 5;
            } else {
                if (arg1.field4543 <= 0) {
                    arg1.field4543 = 5;
                }
                if (arg1.field4620 <= 0) {
                    arg1.field4620 = 5;
                }
            }
        }
        if (class480.field7291 == arg1.field4678) {
            class168.field2273 = arg1;
        }
        if (arg2 && arg1.field4517 != null && arg1.field4543 != var5 || arg1.field4620 != var6) {
            class355 var7 = new class355();
            var7.field5150 = arg1;
            var7.field5160 = arg1.field4517;
            class50.field595.method2492(var7, (byte) -99);
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(I)V")
    public class16(int arg0) {
        this.field145 = new NativeHeap(arg0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method77(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
