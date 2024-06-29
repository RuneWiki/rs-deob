import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class656 extends class337 {

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "I")
    private int field9262 = -1;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
    private int field9263 = -1;

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "I")
    public int field9267;

    @OriginalMember(owner = "client!gfa", name = "A", descriptor = "I")
    public static int field9268 = -1;

    @OriginalMember(owner = "client!gfa", name = "x", descriptor = "F")
    public static float field9265;

    @OriginalMember(owner = "client!gfa", name = "w", descriptor = "I")
    public static int field9264;

    @OriginalMember(owner = "client!gfa", name = "y", descriptor = "I")
    public static int field9266;

    @OriginalMember(owner = "client!gfa", name = "B", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIBI)V")
    public final void method3703(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field9264;
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg4, super.field4687, arg1);
        this.field9263 = arg0;
        if (arg3 != -57) {
            this.method1475(110);
        }
        this.field9262 = arg2;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Lsj;II)V")
    public static final void method3704(class373 arg0, int arg1, int arg2) {
        ++field9269;
        boolean var3 = arg0.method2231(1, 114) == 1;
        if (var3) {
            class657.field9276[class3.field38++] = arg2;
        }
        if (arg1 != 15) {
            method3704((class373) null, 74, 112);
        }
        int var4 = arg0.method2231(2, 104);
        class270 var5 = class76.field1186[arg2];
        if (~var4 == -1) {
            if (var3) {
                var5.field3887 = false;
            } else if (class609.field8749 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class359 var6 = class340.field4725[arg2] = new class359();
                var6.field5010 = (var5.field2454[0] + class143.field2474 >> 6 << 14) + (var5.field3158 << 28) + (var5.field2459[0] + class63.field917 >> 6);
                if (var5.field3884 != -1) {
                    var6.field5006 = var5.field3884;
                } else {
                    var6.field5006 = var5.field2410.method1720(16383);
                }
                var6.field5007 = var5.field2434;
                var6.field5008 = var5.field3886;
                if (~var5.field3868 < -1) {
                    class384.method2345(var5, 27081);
                }
                class76.field1186[arg2] = null;
                if (~arg0.method2231(1, 120) != -1) {
                    class503.method3002(arg2, arg0, 123);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method2231(3, -88);
            int var8 = var5.field2454[0];
            int var9 = var5.field2459[0];
            if (var7 == 0) {
                --var9;
                --var8;
            } else if (var7 != 1) {
                if (var7 == 2) {
                    ++var8;
                    --var9;
                } else if (~var7 == -4) {
                    --var8;
                } else if (var7 == 4) {
                    ++var8;
                } else if (~var7 != -6) {
                    if (~var7 != -7) {
                        if (~var7 == -8) {
                            ++var8;
                            ++var9;
                        }
                    } else {
                        ++var9;
                    }
                } else {
                    ++var9;
                    --var8;
                }
            } else {
                --var9;
            }
            if (!var3) {
                var5.method1704(1, var9, var8, class569.field8317[arg2]);
            } else {
                var5.field3842 = var9;
                var5.field3887 = true;
                var5.field3870 = var8;
            }
        } else if (~var4 == -3) {
            int var10 = arg0.method2231(4, 115);
            int var11 = var5.field2454[0];
            int var12 = var5.field2459[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                --var11;
                var12 -= 2;
            } else if (var10 != 2) {
                if (~var10 != -4) {
                    if (~var10 == -5) {
                        var11 += 2;
                        var12 -= 2;
                    } else if (~var10 == -6) {
                        --var12;
                        var11 -= 2;
                    } else if (var10 != 6) {
                        if (~var10 == -8) {
                            var11 -= 2;
                        } else if (var10 == 8) {
                            var11 += 2;
                        } else if (var10 != 9) {
                            if (var10 == 10) {
                                ++var12;
                                var11 += 2;
                            } else if (~var10 == -12) {
                                var12 += 2;
                                var11 -= 2;
                            } else if (var10 != 12) {
                                if (~var10 != -14) {
                                    if (var10 == 14) {
                                        var12 += 2;
                                        ++var11;
                                    } else if (~var10 == -16) {
                                        var11 += 2;
                                        var12 += 2;
                                    }
                                } else {
                                    var12 += 2;
                                }
                            } else {
                                --var11;
                                var12 += 2;
                            }
                        } else {
                            ++var12;
                            var11 -= 2;
                        }
                    } else {
                        --var12;
                        var11 += 2;
                    }
                } else {
                    var12 -= 2;
                    ++var11;
                }
            } else {
                var12 -= 2;
            }
            if (!var3) {
                var5.method1704(1, var12, var11, class569.field8317[arg2]);
            } else {
                var5.field3842 = var12;
                var5.field3887 = true;
                var5.field3870 = var11;
            }
        } else {
            int var13 = arg0.method2231(1, -76);
            if (var13 == 0) {
                int var14 = arg0.method2231(12, 98);
                int var15 = var14 >> 10;
                int var16 = var14 >> 5 & 31;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = 31 & var14;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field2454[0] + var16;
                int var19 = var5.field2459[0] + var17;
                if (!var3) {
                    var5.method1704(1, var19, var18, class569.field8317[arg2]);
                } else {
                    var5.field3842 = var19;
                    var5.field3887 = true;
                    var5.field3870 = var18;
                }
                var5.field3158 = var5.field3163 = (byte) (var5.field3158 + var15 & 3);
                if (class151.method1151(var19, var18, (byte) -49)) {
                    ++var5.field3163;
                }
                if (class609.field8749 == arg2) {
                    class416.field5926 = var5.field3158;
                }
            } else {
                int var20 = arg0.method2231(30, 92);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 16383;
                int var23 = 16383 & var20;
                int var24 = (16383 & var5.field2454[0] + var22 + class143.field2474) + -class143.field2474;
                int var25 = (16383 & var5.field2459[0] + var23 + class63.field917) + -class63.field917;
                if (!var3) {
                    var5.method1704(1, var25, var24, class569.field8317[arg2]);
                } else {
                    var5.field3870 = var24;
                    var5.field3887 = true;
                    var5.field3842 = var25;
                }
                var5.field3158 = var5.field3163 = (byte) (3 & var5.field3158 + var21);
                if (class151.method1151(var25, var24, (byte) -49)) {
                    ++var5.field3163;
                }
                if (~class609.field8749 == ~arg2) {
                    class416.field5926 = var5.field3158;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
    public final void method1475(int arg0) {
        ++field9266;
        if (arg0 <= 49) {
            method3704((class373) null, 103, 92);
        }
        OpenGL.glFramebufferTexture2DEXT(this.field9263, this.field9262, 3553, 0, 0);
        this.field9262 = -1;
        this.field9263 = -1;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lkfa;IIZ[[I)V")
    public class656(class382 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field9267 = arg2;
        super.field4696.method2295((byte) 125, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field4685, arg2, arg2, 0, 32993, super.field4696.field5509, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class529.method3115(arg2, super.field4685, 32993, arg4[var7], var7 + 34069, (byte) -92, arg2, super.field4696.field5509);
            }
        }
        this.method2001(540800, true);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lkfa;IIZ[[BI)V")
    public class656(class382 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field9267 = arg2;
        super.field4696.method2295((byte) -124, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field4685, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2001(540800, true);
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lkfa;II)V")
    public class656(class382 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field9267 = arg2;
        super.field4696.method2295((byte) 9, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field4685, arg2, arg2, 0, class701.method3942(super.field4685, -128), 5121, (byte[]) null, 0);
        }
        this.method2001(540800, true);
    }
}
