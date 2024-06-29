import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class400 extends class262 {

    @OriginalMember(owner = "client!st", name = "o", descriptor = "Z")
    private boolean field5635 = false;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "Z")
    private boolean field5636;

    @OriginalMember(owner = "client!st", name = "v", descriptor = "[Lgi;")
    private class629[] field5642;

    @OriginalMember(owner = "client!st", name = "u", descriptor = "Lwo;")
    public static class690 field5641 = new class690(7, 1);

    @OriginalMember(owner = "client!st", name = "y", descriptor = "[I")
    public static int[] field5645 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!st", name = "C", descriptor = "Ljk;")
    public static class585 field5649 = new class585(14, -1);

    @OriginalMember(owner = "client!st", name = "D", descriptor = "[I")
    public static int[] field5650 = new int[32];

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!st", name = "s", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!st", name = "t", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!st", name = "w", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!st", name = "x", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!st", name = "z", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!st", name = "A", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!st", name = "B", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZI)V")
    public final void method373(int arg0, boolean arg1, int arg2) {
        if (this.field5635) {
            super.field3601.method2318(1, -30954);
            super.field3601.method2316((byte) 115, this.field5642[arg0 + -1]);
            super.field3601.method2318(0, -30954);
        }
        ++field5637;
        if (!arg1) {
            this.method372(false, 82);
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lifa;)V")
    public class400(class393 arg0) {
        super(arg0);
        if (arg0.field5526) {
            this.field5636 = ~arg0.field5499 > -4;
            int var2 = !this.field5636 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (~var14 != -2) {
                            if (var14 != 2) {
                                if (var14 != 3) {
                                    if (~var14 != -5) {
                                        var15 = -var11;
                                    } else {
                                        var15 = var11;
                                    }
                                } else {
                                    var15 = -var13;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field5642 = new class629[3];
            this.field5642[0] = super.field3601.method470(64, false, var4, 12482);
            this.field5642[1] = super.field3601.method470(64, false, var5, 12482);
            this.field5642[2] = super.field3601.method470(64, false, var3, 12482);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILoa;B)V")
    public final void method371(int arg0, class644 arg1, byte arg2) {
        ++field5646;
        if (arg2 > 80) {
            super.field3601.method2316((byte) 104, arg1);
            super.field3601.method2362(arg0, false);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILun;I)V")
    public static final void method2417(int arg0, class389 arg1, int arg2) {
        ++field5640;
        if (class23.field570 != null) {
            try {
                class23.field570.method2698((byte) -96, 0L);
                class23.field570.method2702(24, 8, arg2, arg1.field5205);
            } catch (Exception var3) {
            }
        }
        if (arg0 != -679) {
            field5649 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V")
    public final void method374(int arg0) {
        if (this.field5635) {
            super.field3601.method2318(1, -30954);
            super.field3601.method2316((byte) 87, (class644) null);
            super.field3601.method471(class620.field8888, -19);
            super.field3601.method2305(20921);
            if (this.field5636) {
                super.field3601.method2303((byte) 41, class652.field9230, class652.field9230);
                super.field3601.method2301(0, class519.field7612, 2);
                super.field3601.method2348(0, 6655, class519.field7612);
            } else {
                super.field3601.method2303((byte) -76, class652.field9230, class652.field9230);
                super.field3601.method2301(0, class519.field7612, 2);
                super.field3601.method2318(2, -30954);
                super.field3601.method2303((byte) 108, class652.field9230, class652.field9230);
                super.field3601.method2301(0, class519.field7612, 2);
                super.field3601.method2301(1, class141.field1760, 2);
                super.field3601.method2348(0, 6655, class519.field7612);
                super.field3601.method2316((byte) 121, (class644) null);
            }
            super.field3601.method2318(0, -30954);
            this.field5635 = false;
        } else {
            super.field3601.method2348(0, 6655, class519.field7612);
        }
        if (arg0 < 42) {
            this.field5635 = false;
        }
        ++field5638;
        super.field3601.method2303((byte) -93, class652.field9230, class652.field9230);
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(B)V")
    public static void method2418(byte arg0) {
        field5641 = null;
        if (arg0 < 85) {
            method2421(-58);
        }
        field5645 = null;
        field5649 = null;
        field5650 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "([BLdda;II)Lqd;")
    public static final class415 method2419(byte[] arg0, class349 arg1, int arg2, int arg3) {
        ++field5648;
        if (arg0 == null) {
            return null;
        } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg3, var4);
            if (arg2 > -6) {
                return null;
            } else {
                OpenGL.glProgramRawARB(arg3, 34933, arg0);
                OpenGL.glGetIntegerv(34379, class399.field5627, 0);
                if (~class399.field5627[0] != 0) {
                    OpenGL.glBindProgramARB(arg3, 0);
                    return null;
                } else {
                    OpenGL.glBindProgramARB(arg3, 0);
                    return new class415(arg1, arg3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)Ln;")
    public static final class17 method2420(byte arg0, int arg1) {
        ++field5639;
        int var2 = arg1 >> 16;
        if (arg0 >= -94) {
            method2419((byte[]) null, (class349) null, -96, 44);
        }
        int var3 = 65535 & arg1;
        if (class516.field7555[var2] == null || class516.field7555[var2][var3] == null) {
            boolean var4 = class62.method607((byte) -106, var2);
            if (!var4) {
                return null;
            }
        }
        return class516.field7555[var2][var3];
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V")
    public final void method372(boolean arg0, int arg1) {
        ++field5634;
        if (arg1 != 0) {
            this.method375(47);
        }
        super.field3601.method2303((byte) -74, class231.field3011, class652.field9230);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IZ)V")
    public final void method377(int arg0, boolean arg1) {
        if (arg0 < 37) {
            field5649 = null;
        }
        if (this.field5642 != null && arg1) {
            super.field3601.method2318(1, -30954);
            super.field3601.method471(class216.field2806, -99);
            class653 var3 = super.field3601.method2373((byte) -111);
            var3.method721(1024);
            super.field3601.method2319((byte) 88, class582.field8475);
            if (!this.field5636) {
                super.field3601.method2303((byte) -121, class652.field9230, class231.field3011);
                super.field3601.method2301(0, class141.field1760, 2);
                super.field3601.method2318(2, -30954);
                super.field3601.method2303((byte) 30, class231.field3011, class698.field9875);
                super.field3601.method2301(0, class141.field1760, 2);
                super.field3601.method512(true, 1, 9494, class141.field1760, false);
                super.field3601.method2348(0, 6655, class366.field4928);
                super.field3601.method2316((byte) 100, super.field3601.field5502);
            } else {
                super.field3601.method2303((byte) 116, class231.field3011, class698.field9875);
                super.field3601.method512(true, 0, 9494, class519.field7612, false);
                super.field3601.method2348(0, 6655, class366.field4928);
            }
            super.field3601.method2318(0, -30954);
            this.field5635 = true;
        } else {
            super.field3601.method2348(0, 6655, class366.field4928);
        }
        ++field5644;
    }

    @OriginalMember(owner = "client!st", name = "h", descriptor = "(I)V")
    public static final void method2421(int arg0) {
        class346.method1979(false);
        ++field5643;
        class78.method655(2, 22050, 8000, class221.field2851.field4138);
        class600.field8656 = class567.method3322(class517.field7570, 22050, arg0 ^ -1394, 0, class646.field9190);
        class346.method1980((byte) -125, true, class553.method3243((class364) null, (byte) 6));
        class247.field3389 = class567.method3322(class517.field7570, 2048, -1024, 1, class646.field9190);
        class247.field3389.method1490(class399.field5624, 0);
        if (arg0 != 1678) {
            method2418((byte) 49);
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Z")
    public final boolean method375(int arg0) {
        ++field5647;
        if (arg0 != -18095) {
            this.field5635 = false;
        }
        return true;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; ++var1) {
            field5650[var1] = var0 + -1;
            var0 += var0;
        }
    }
}
