import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class397 extends class318 {

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "Luo;")
    private class408 field5939;

    @OriginalMember(owner = "client!pu", name = "p", descriptor = "Lrn;")
    private class178 field5940;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "[F")
    private static float[] field5943 = new float[4];

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!pu", name = "q", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!pu", name = "r", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "Lrj;")
    public static class424 field5936;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "(B)V", line = 3)
    public static void method2501(byte arg0) {
        field5943 = null;
        field5936 = null;
        if (arg0 != -58) {
            field5941 = -94;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V", line = 17)
    public final void method723(byte arg0) {
        ++field5933;
        if (arg0 >= 91) {
            this.field5940.method1191('\u0001', (byte) -17);
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1289(-19391, (class454) null);
            super.field4800.method1307(0, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)V", line = 36)
    public final void method722(int arg0, boolean arg1) {
        ++field5938;
        int var3 = 11 % ((arg0 - -23) / 46);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)Z", line = 47)
    public final boolean method721(int arg0) {
        ++field5944;
        if (arg0 != 0) {
            this.method718(false, true);
        }
        return true;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[[[BIBII)V", line = 58)
    public static final void method2502(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class221.field3620;
        class180.field2707 = 0;
        for (int var6 = class475.field6862; var6 < class213.field3467; ++var6) {
            class138[][] var17 = client.field3311[var6];
            for (int var18 = class233.field3768; var18 < class222.field3640; ++var18) {
                for (int var19 = class313.field4715; var19 < class376.field5649; ++var19) {
                    class138 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (!class265.field4070[var18 - class395.field5900 + class46.field602][var19 - class284.field4314 + class46.field602] || arg1 != null && var6 >= arg2 && arg1[var6][var18][var19] == arg3) {
                            var20.field2111 = false;
                            var20.field2103 = false;
                            var20.field2100 = 0;
                            if (var18 >= class395.field5900 - 16 && var18 <= class395.field5900 + 16 && var19 >= class284.field4314 - 16 && var19 <= class284.field4314 + 16 && (var20.field2114 != null || var20.field2104 != null || var20.field2115 != null || var20.field2106 != null || var20.field2105 != null || var20.field2118 != null)) {
                                class358.field5320.method1429(var20, 5000);
                            }
                        } else {
                            var20.field2111 = true;
                            var20.field2103 = true;
                            if (var20.field2118 != null) {
                                var20.field2107 = true;
                            } else {
                                var20.field2107 = false;
                            }
                            ++class180.field2707;
                        }
                    }
                }
            }
        }
        boolean var7 = class491.field7059 == class290.field4367;
        for (int var8 = class475.field6862; var8 < class213.field3467; ++var8) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class291.field4407.method347() && var8 >= arg2 && arg1 != null) {
                int var10 = class265.field4070.length;
                if (class265.field4070.length + class233.field3768 > class497.field7147) {
                    var10 -= class265.field4070.length + class233.field3768 - class497.field7147;
                }
                int var11 = class265.field4070[0].length;
                if (class265.field4070[0].length + class313.field4715 > class385.field5799) {
                    var11 -= class265.field4070[0].length + class313.field4715 - class385.field5799;
                }
                int var12 = class133.field2043;
                while (true) {
                    if (var12 >= var10) {
                        class358.field5320.method1432(var9, true, var8, class491.field7059[var8], -20295);
                        break;
                    }
                    int var13 = class233.field3768 + var12 - class133.field2043;
                    for (int var14 = class262.field4022; var14 < var11; ++var14) {
                        class60.field721[var12][var14] = false;
                        if (class265.field4070[var12][var14]) {
                            int var15 = class313.field4715 + var14 - class262.field4022;
                            for (int var16 = var8; var16 >= 0; --var16) {
                                if (client.field3311[var16][var13][var15] != null && client.field3311[var16][var13][var15].field2119 == var8) {
                                    class60.field721[var12][var14] = client.field3311[var16][var13][var15].field2111;
                                    break;
                                }
                            }
                        }
                    }
                    ++var12;
                }
            } else {
                class358.field5320.method1432(var9, false, var8, class491.field7059[var8], -20295);
            }
            class358.field5320.method1435(120);
        }
        if (!class196.method1367(true)) {
            class196.method1367(false);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lav;IB)V", line = 195)
    public final void method715(class454 arg0, int arg1, byte arg2) {
        ++field5937;
        super.field4800.method1289(-19391, arg0);
        if (arg2 > -108) {
            this.method719(-13, 21, -78);
        }
        super.field4800.method1248(arg1, true);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZZ)V", line = 207)
    public final void method718(boolean arg0, boolean arg1) {
        ++field5942;
        this.field5940.method1191('\u0000', (byte) 99);
        if (this.field5939.field6091) {
            super.field4800.method1307(1, (byte) 92);
            super.field4800.method1289(-19391, this.field5939.field6089);
            super.field4800.method1307(0, (byte) 92);
        }
        if (arg1) {
            this.method719(34, -35, 116);
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZIIIII)V", line = 226)
    public static final void method2503(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5934;
        int var6 = -arg4 + arg1;
        int var7 = arg3 - arg5;
        if (~var6 != -1) {
            if (~var7 == -1) {
                class20.method163(arg2, arg1, arg5, (byte) 112, arg4);
            } else {
                if (!arg0) {
                    method2501((byte) -54);
                }
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg4 * var8 >> 12) + arg5;
                int var10;
                int var11;
                if (~class327.field4931 >= ~arg4) {
                    if (~class184.field2777 <= ~arg4) {
                        var10 = arg4;
                        var11 = arg5;
                    } else {
                        var10 = class184.field2777;
                        var11 = var9 - -(class184.field2777 * var8 >> 12);
                    }
                } else {
                    var11 = (class327.field4931 * var8 >> 12) + var9;
                    var10 = class327.field4931;
                }
                int var12;
                int var13;
                if (arg1 < class327.field4931) {
                    var12 = (class327.field4931 * var8 >> 12) + var9;
                    var13 = class327.field4931;
                } else if (~arg1 >= ~class184.field2777) {
                    var12 = arg3;
                    var13 = arg1;
                } else {
                    var12 = (class184.field2777 * var8 >> 12) + var9;
                    var13 = class184.field2777;
                }
                if (~var11 <= ~class404.field5987) {
                    if (var11 > class433.field6414) {
                        var11 = class433.field6414;
                        var10 = (class433.field6414 - var9 << 12) / var8;
                    }
                } else {
                    var10 = (-var9 + class404.field5987 << 12) / var8;
                    var11 = class404.field5987;
                }
                if (class404.field5987 > var12) {
                    var13 = (-var9 + class404.field5987 << 12) / var8;
                    var12 = class404.field5987;
                } else if (~class433.field6414 > ~var12) {
                    var12 = class433.field6414;
                    var13 = (-var9 + class433.field6414 << 12) / var8;
                }
                class121.method905(var13, var10, var12, (byte) 120, arg2, var11);
            }
        } else {
            if (var7 != 0) {
                class474.method2850(true, arg3, arg5, arg2, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lkd;Luo;)V", line = 332)
    public class397(class188 arg0, class408 arg1) {
        super(arg0);
        this.field5939 = arg1;
        this.field5940 = new class178(arg0, 2);
        this.field5940.method1192(0, (byte) 120);
        super.field4800.method1307(1, (byte) 92);
        if (this.field5939.field6091) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field4800.method1307(0, (byte) 92);
        this.field5940.method1196(118);
        this.field5940.method1192(1, (byte) 82);
        super.field4800.method1307(1, (byte) 92);
        if (this.field5939.field6091) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field4800.method1307(0, (byte) 92);
        this.field5940.method1196(112);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V", line = 368)
    public final void method719(int arg0, int arg1, int arg2) {
        ++field5935;
        float var4 = (float) ((arg1 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((arg1 >> 3 & 3) - -1) * 5.0E-4F;
        float var6 = (64 & arg1) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(arg1 & 128) != -1;
        super.field4800.method1307(1, (byte) 92);
        if (var7) {
            field5943[0] = var6;
            field5943[3] = 0.0F;
            field5943[2] = 0.0F;
            field5943[1] = 0.0F;
        } else {
            field5943[0] = 0.0F;
            field5943[1] = 0.0F;
            field5943[3] = 0.0F;
            field5943[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, field5943, 0);
        field5943[0] = 0.0F;
        field5943[2] = 0.0F;
        field5943[1] = var6;
        field5943[3] = (float) super.field4800.field3027 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, field5943, arg2);
        if (this.field5939.field6091) {
            field5943[2] = 0.0F;
            field5943[0] = 0.0F;
            field5943[1] = 0.0F;
            field5943[3] = (float) super.field4800.field3027 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, field5943, 0);
        } else {
            int var8 = (int) ((float) super.field4800.field3027 * var5 * 16.0F);
            super.field4800.method1289(-19391, this.field5939.field6096[var8 % 16]);
        }
        super.field4800.method1307(0, (byte) 92);
    }
}
