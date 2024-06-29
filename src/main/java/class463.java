import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class463 extends class292 {

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "Lj;")
    private class504 field6600;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "Lkg;")
    private class249 field6598;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "Z")
    private boolean field6595;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
    public static int field6592 = 0;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "Lja;")
    public static class254 field6596 = new class254(2, 4, 4, 0);

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "Lqh;")
    public static class61 field6588;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "Z")
    private boolean field6597;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        if (arg1 != 54) {
            field6588 = null;
        }
        ++field6594;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Ljq;Lom;Lj;)V")
    public class463(class475 arg0, class344 arg1, class504 arg2) {
        super(arg0);
        this.field6600 = arg2;
        if (arg1 != null && arg0.field6828 && arg0.field6832) {
            class542 var4 = class240.method1591(arg0, -8, 35633, arg1.method2211("gl", 19558, "environment_mapped_water_v"));
            class542 var5 = class240.method1591(arg0, -8, 35632, arg1.method2211("gl", 19558, "environment_mapped_water_f"));
            this.field6598 = class241.method1602(arg0, new class542[] { var4, var5 }, (byte) 112);
            this.field6595 = this.field6598 != null && this.field6600.method2998((byte) 106);
        } else {
            this.field6595 = false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        if (arg0 <= 27) {
            this.method604(-73);
        }
        ++field6589;
        if (this.field6597) {
            super.field4393.method3223(15, 1);
            super.field4393.method3266(-2, (class116) null);
            super.field4393.method3223(15, 0);
            super.field4393.method3266(-2, (class116) null);
            OpenGL.glUseProgramObjectARB(0L);
            this.field6597 = false;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lr;IIIIIIZZ)V")
    public static final void method2769(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class521.field7381 = arg0;
        class531.field7449 = arg1;
        class701.field9863 = class531.field7449 > 1 && class521.field7381.method127();
        class30.field940 = arg2;
        class576.field8369 = 1 << class30.field940;
        class271.field4068 = class576.field8369 >> 1;
        Math.sqrt((double) (class271.field4068 * class271.field4068 + class271.field4068 * class271.field4068));
        class148.field2557 = arg3;
        class520.field7369 = arg4;
        class107.field1852 = arg5;
        class643.field9239 = arg6;
        class436.field6300 = class35.method525(16383);
        class44.method571(true);
        class509.field7213 = new class370[arg3][class520.field7369][class107.field1852];
        class185.field2987 = new class37[arg3];
        if (arg7) {
            class125.field2257 = new int[class520.field7369][class107.field1852];
            class6.field501 = new byte[class520.field7369][class107.field1852];
            class177.field2893 = new short[class520.field7369][class107.field1852];
            class400.field5812 = new class370[1][class520.field7369][class107.field1852];
            class697.field9813 = new class37[1];
        } else {
            class125.field2257 = null;
            class6.field501 = null;
            class177.field2893 = null;
            class400.field5812 = null;
            class697.field9813 = null;
        }
        if (arg8) {
            class335.field5016 = new long[arg3][arg4][arg5];
            class173.field2850 = new class682[65535];
            class397.field5786 = new boolean[65535];
            class6.field503 = 0;
        } else {
            class335.field5016 = null;
            class173.field2850 = null;
            class397.field5786 = null;
            class6.field503 = 0;
        }
        class532.method3091(false);
        class148.field2552 = new class697[2][];
        class148.field2552[0] = new class697[class89.field1647[0]];
        class148.field2552[1] = new class697[class89.field1647[1]];
        class338.field5048 = new int[2];
        class368.field5462 = new class697[2][];
        class368.field5462[0] = new class697[class118.field2110[0]];
        class368.field5462[1] = new class697[class118.field2110[1]];
        class43.field1090 = new int[2];
        class7.field513 = new class697[2][];
        class7.field513[0] = new class697[class54.field1202[0]];
        class7.field513[1] = new class697[class54.field1202[1]];
        class575.field8353 = new int[2];
        class350.field5263 = new class697[10000];
        class265.field3939 = 0;
        class656.field9427 = new class697[5000];
        class292.field4389 = 0;
        class228.field3422 = new class122[5000];
        class200.field3106 = 0;
        class224.field3361 = new boolean[class643.field9239 + class643.field9239 + 1][class643.field9239 + class643.field9239 + 1];
        class115.field2054 = new boolean[class643.field9239 + class643.field9239 + 2][class643.field9239 + class643.field9239 + 2];
        if (class701.field9863) {
            class309.field4555 = new boolean[arg3][class643.field9239 + class643.field9239 + 1][class643.field9239 + class643.field9239 + 1];
            class265.field3941 = new boolean[arg3][][];
            if (class438.field6320 != null) {
                class42.method565();
            }
            class438.field6320 = new class402[class531.field7449];
            class521.field7381.method146(class438.field6320.length + 1);
            class521.field7381.method134(0);
            for (int var9 = 0; var9 < class438.field6320.length; ++var9) {
                class438.field6320[var9] = new class402(var9 + 1, class521.field7381);
                (new Thread(class438.field6320[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class531.field7449 == 2) {
                var10 = 4;
                class202.field3122 = 2;
            } else if (class531.field7449 == 3) {
                var10 = 6;
                class202.field3122 = 3;
            } else {
                var10 = 8;
                class202.field3122 = 4;
            }
            class386.field5664 = new class650[var10];
            for (int var11 = 0; var11 < var10; ++var11) {
                class386.field5664[var11] = new class650(class648.field9344[class531.field7449 - 2][var11]);
            }
        } else {
            class202.field3122 = 1;
        }
        class406.field5859 = new int[class202.field3122 - 1];
        class457.field6507 = new int[class202.field3122 - 1];
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z[[[BIB)V")
    public static final void method2770(boolean arg0, byte[][][] arg1, int arg2, byte arg3) {
        int var4 = arg0 ? 1 : 0;
        class265.field3939 = 0;
        class292.field4389 = 0;
        ++class574.field8339;
        for (int var5 = 0; var5 < class338.field5048[var4]; ++var5) {
            if (!class204.method1437(class148.field2552[var4][var5], arg0, arg1, arg2, arg3)) {
                class247.method1672(class148.field2552[var4][var5]);
                if (class148.field2552[var4][var5].field9808 != -1) {
                    class350.field5263[class265.field3939++] = class148.field2552[var4][var5];
                }
            }
        }
        for (int var6 = 0; var6 < class43.field1090[var4]; ++var6) {
            if (!class204.method1437(class368.field5462[var4][var6], arg0, arg1, arg2, arg3)) {
                class247.method1672(class368.field5462[var4][var6]);
                if (class368.field5462[var4][var6].field9808 != -1) {
                    class656.field9427[class292.field4389++] = class368.field5462[var4][var6];
                }
            }
        }
        for (int var7 = 0; var7 < class575.field8353[var4]; ++var7) {
            if (!class204.method1437(class7.field513[var4][var7], arg0, arg1, arg2, arg3)) {
                if (class7.field513[var4][var7].method524(40)) {
                    class247.method1672(class7.field513[var4][var7]);
                    if (class7.field513[var4][var7].field9808 != -1) {
                        class656.field9427[class292.field4389++] = class7.field513[var4][var7];
                    }
                } else {
                    class247.method1672(class7.field513[var4][var7]);
                    if (class7.field513[var4][var7].field9808 != -1) {
                        class350.field5263[class265.field3939++] = class7.field513[var4][var7];
                    }
                }
            }
        }
        if (!arg0) {
            for (int var8 = 0; var8 < class200.field3106; ++var8) {
                if (!class204.method1437(class228.field3422[var8], arg0, arg1, arg2, arg3)) {
                    class247.method1672(class228.field3422[var8]);
                    if (class228.field3422[var8].field9808 != -1) {
                        if (class228.field3422[var8].method524(-108)) {
                            class656.field9427[class292.field4389++] = class228.field3422[var8];
                        } else {
                            class350.field5263[class265.field3939++] = class228.field3422[var8];
                        }
                    }
                }
            }
        }
        if (class265.field3939 > 0) {
            class1.method71(class350.field5263, 0, class265.field3939 - 1);
            for (int var9 = 0; var9 < class265.field3939; ++var9) {
                class216.method1508(class350.field5263[var9], true);
            }
        }
        if (class146.field2534) {
            class521.field7381.method75(0, (class9[]) null);
        }
        for (int var10 = class294.field4412; var10 < class148.field2557; ++var10) {
            if (var10 >= arg2 && arg1 != null) {
                int var12 = class224.field3361.length;
                if (class224.field3361.length + class74.field1517 > class520.field7369) {
                    var12 -= class224.field3361.length + class74.field1517 - class520.field7369;
                }
                int var13 = class224.field3361[0].length;
                if (class224.field3361[0].length + class168.field2821 > class107.field1852) {
                    var13 -= class224.field3361[0].length + class168.field2821 - class107.field1852;
                }
                boolean[][] var14 = class115.field2054;
                if (class468.field6629) {
                    if (class701.field9863) {
                        var14 = class309.field4555[var10];
                    }
                    for (int var15 = class260.field3822; var15 < var12; ++var15) {
                        int var16 = class74.field1517 + var15 - class260.field3822;
                        for (int var17 = class86.field1624; var17 < var13; ++var17) {
                            var14[var15][var17] = false;
                            if (class224.field3361[var15][var17]) {
                                int var18 = class168.field2821 + var17 - class86.field1624;
                                for (int var19 = var10; var19 >= 0; --var19) {
                                    if (class257.field3792[var19][var16][var18] != null && class257.field3792[var19][var16][var18].field5506 == var10) {
                                        if ((var19 < arg2 || arg1[var19][var16][var18] != arg3) && !class649.method3708(var16, -126, var10, var18)) {
                                            var14[var15][var17] = true;
                                            break;
                                        }
                                        var14[var15][var17] = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class701.field9863) {
                    class485.field6947[var10].method540(0, 0, 0, (boolean[][]) null, false);
                    for (int var20 = 0; var20 < class531.field7449; ++var20) {
                        class386.field5664[var20].method3711(new class632(var10 + 1), true);
                    }
                } else if (class328.field4816) {
                    class485.field6947[var10].method548(class547.field7768, class318.field4685, class643.field9239, class115.field2054, false, class504.field7163);
                } else {
                    class485.field6947[var10].method540(class547.field7768, class318.field4685, class643.field9239, class115.field2054, false);
                }
            } else {
                int var21 = class224.field3361.length;
                if (class224.field3361.length + class74.field1517 > class520.field7369) {
                    var21 -= class224.field3361.length + class74.field1517 - class520.field7369;
                }
                int var22 = class224.field3361[0].length;
                if (class224.field3361[0].length + class168.field2821 > class107.field1852) {
                    var22 -= class224.field3361[0].length + class168.field2821 - class107.field1852;
                }
                boolean[][] var23 = class115.field2054;
                if (class468.field6629) {
                    if (class701.field9863) {
                        var23 = class309.field4555[var10];
                    }
                    for (int var24 = class260.field3822; var24 < var21; ++var24) {
                        int var25 = class74.field1517 + var24 - class260.field3822;
                        for (int var26 = class86.field1624; var26 < var22; ++var26) {
                            if (class224.field3361[var24][var26] && !class649.method3708(var25, -127, var10, class168.field2821 + var26 - class86.field1624)) {
                                var23[var24][var26] = true;
                            } else {
                                var23[var24][var26] = false;
                            }
                        }
                    }
                }
                if (class701.field9863) {
                    class485.field6947[var10].method540(0, 0, 0, (boolean[][]) null, false);
                    for (int var27 = 0; var27 < class531.field7449; ++var27) {
                        class386.field5664[var27].method3711(new class632(var10 + 1), true);
                    }
                } else if (class328.field4816) {
                    class485.field6947[var10].method548(class547.field7768, class318.field4685, class643.field9239, class115.field2054, true, class504.field7163);
                } else {
                    class485.field6947[var10].method540(class547.field7768, class318.field4685, class643.field9239, class115.field2054, true);
                }
            }
        }
        if (class292.field4389 > 0) {
            class559.method3182(class656.field9427, 0, class292.field4389 - 1);
            for (int var11 = 0; var11 < class292.field4389; ++var11) {
                class216.method1508(class656.field9427[var11], true);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        if (arg0 != 24561) {
            method2769((class167) null, 91, -41, 80, -35, -2, -59, false, true);
        }
        ++field6599;
        return this.field6595;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        if (this.field6597) {
            int var4 = 1 << (arg0 & 3);
            float var5 = (float) (1 << (7 & arg0 >> 3)) / 32.0F;
            int var6 = arg2 & 65535;
            float var7 = (float) ((arg2 & 256584) >> 16) / 8.0F;
            long var8 = this.field6598.field3735;
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "time"), (float) (super.field4393.field8123 * var4 % 40000) / 40000.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "scale"), var5);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterDepth"), (float) var6);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var8, "breakWaterOffset"), var7);
        }
        int var10 = -37 % ((-45 - arg1) / 59);
        ++field6593;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        if (!this.field6597) {
            super.field4393.method3266(-2, arg2);
            super.field4393.method3195(-12, arg1);
        }
        if (arg0 <= 28) {
            this.field6597 = false;
        }
        ++field6591;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        ++field6590;
        if (arg1 != -116) {
            field6592 = -65;
        }
        class524 var3 = super.field4393.method3269(false);
        if (this.field6595 && var3 != null) {
            super.field4393.method3223(15, 1);
            super.field4393.method3266(-2, var3);
            super.field4393.method3223(arg1 + 131, 0);
            super.field4393.method3266(-2, this.field6600.field7153);
            long var4 = this.field6598.field3735;
            OpenGL.glUseProgramObjectARB(var4);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "normalSampler"), 0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, "envMapSampler"), 1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, "sunDir"), super.field4393.field8105[0], -super.field4393.field8105[1], -super.field4393.field8105[2]);
            OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, "sunColour"), super.field4393.field8162, super.field4393.field8159, super.field4393.field8133, 1.0F);
            OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, "sunExponent"), 96.0F + 928.0F * Math.abs(super.field4393.field8105[1]));
            this.field6597 = true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V")
    public static void method2771(boolean arg0) {
        if (!arg0) {
            field6588 = null;
            field6596 = null;
        }
    }
}
