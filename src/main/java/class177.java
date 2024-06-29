import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class177 extends class540 {

    @OriginalMember(owner = "client!cfa", name = "A", descriptor = "Lwr;")
    private class480 field2698;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "I")
    public int field2683;

    @OriginalMember(owner = "client!cfa", name = "t", descriptor = "[I")
    private int[] field2691;

    @OriginalMember(owner = "client!cfa", name = "p", descriptor = "Lkv;")
    private class280 field2687;

    @OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!cfa", name = "y", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!cfa", name = "w", descriptor = "F")
    public float field2694;

    @OriginalMember(owner = "client!cfa", name = "u", descriptor = "Lvv;")
    private class341 field2692;

    @OriginalMember(owner = "client!cfa", name = "o", descriptor = "Z")
    public static boolean field2686 = false;

    @OriginalMember(owner = "client!cfa", name = "x", descriptor = "[I")
    public static int[] field2695 = new int[3];

    @OriginalMember(owner = "client!cfa", name = "s", descriptor = "Lke;")
    public static class622 field2690 = new class622(100, 5);

    @OriginalMember(owner = "client!cfa", name = "G", descriptor = "Lpb;")
    public static class680 field2704 = new class680("LIVE", "", "", 0);

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "F")
    public static float field2703;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!cfa", name = "q", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!cfa", name = "r", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!cfa", name = "v", descriptor = "Lkb;")
    private class717 field2693;

    @OriginalMember(owner = "client!cfa", name = "B", descriptor = "Ljaclib/memory/Stream;")
    private Stream field2699;

    @OriginalMember(owner = "client!cfa", name = "D", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field2701;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I[IB)V", line = 14)
    public final void method1336(int arg0, int[] arg1, byte arg2) {
        field2697++;
        if (arg2 < 11) {
            return;
        }
        int var4 = 0;
        class186 var5 = this.field2687.field4231;
        var5.field1521 = 0;
        if (this.field2687.field4230) {
            for (int var12 = 0; var12 < arg0; var12++) {
                int var13 = arg1[var12];
                int var14 = this.field2691[var13];
                short[] var15 = this.field2698.field6825[var13];
                if (var14 != 0 && var15 != null) {
                    int var16 = 0;
                    int var17 = 0;
                    while (var17 < var15.length) {
                        if ((0x1 << var16++ & var14) == 0) {
                            var17 += 3;
                        } else {
                            var4++;
                            var5.method860(var15[var17++] & 0xFFFF, (byte) 122);
                            var5.method860(var15[var17++] & 0xFFFF, (byte) 127);
                            var4++;
                            var5.method860(var15[var17++] & 0xFFFF, (byte) 118);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg0; var6++) {
                int var7 = arg1[var6];
                short[] var8 = this.field2698.field6825[var7];
                int var9 = this.field2691[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var11 < var8.length) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var4++;
                            var5.method868(var8[var11++] & 0xFFFF, 849257384);
                            var4++;
                            var5.method868(var8[var11++] & 0xFFFF, 849257384);
                            var5.method868(var8[var11++] & 0xFFFF, 849257384);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 <= 0) {
            return;
        }
        this.field2692.method1776((byte) 121, var5.field1521, 5123, var5.field1556);
        this.field2687.method1865(this.field2698.field6832, 32888, this.field2698.field6837, this.field2693, this.field2698.field6834);
        this.field2687.method1851(this.field2683, -76, (this.field2698.field6822 & 0x8) != 0, (this.field2698.field6822 & 0x7) != 0);
        if (this.field2687.field4308) {
            this.field2687.method411(Integer.MAX_VALUE, this.field2696, this.field2681, this.field2700);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(1.0F / this.field2694, 1.0F / this.field2694, 1.0F);
        OpenGL.glMatrixMode(5888);
        this.field2687.method1865(this.field2698.field6832, 32888, this.field2698.field6837, this.field2693, this.field2698.field6834);
        this.field2687.method1899(this.field2692, 7, 4, var4, 0);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V", line = 141)
    public static void method1337(boolean arg0) {
        field2695 = null;
        field2690 = null;
        field2704 = null;
        if (arg0) {
            method1341((byte) 45);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIII)V", line = 155)
    public final void method1338(int arg0, int arg1, int arg2, int arg3) {
        field2689++;
        this.field2691[this.field2698.field4420 * arg0 + arg1] = class281.method1904(this.field2691[this.field2698.field4420 * arg0 + arg1], 0x1 << arg2);
        if (arg3 >= -19) {
            this.method1338(-71, -10, -46, -128);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)V", line = 167)
    public final void method1339(int arg0, int arg1) {
        this.field2699.method3954(arg0 * 4 + 3);
        if (arg1 >= -102) {
            field2704 = null;
        }
        field2680++;
        this.field2699.method3951(-1);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BIIIF)V", line = 190)
    public final void method1340(byte arg0, int arg1, int arg2, int arg3, float arg4) {
        field2682++;
        if (this.field2683 != -1) {
            class181 var6 = this.field2687.field883.method1263(this.field2683, (byte) 118);
            int var7 = var6.field2748 & 0xFF;
            if (var7 != 0 && var6.field2745 != 4) {
                int var8;
                if (arg2 < 0) {
                    var8 = 0;
                } else if (arg2 <= 127) {
                    var8 = arg2 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg1 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg1 = ((var8 & 0xFF00) * var7 + ((arg1 & 0xFF00) * var10) & 0xFF0000) + ((arg1 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2739 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = ((arg1 & 0xFF0000) >> 16) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg1 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg1 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg1 = (var12 << 8 & 0xFF0093) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        if (arg4 != 1.0F) {
            int var15 = arg1 >> 16 & 0xFF;
            int var16 = arg1 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg4);
            int var18 = arg1 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg4);
            int var20 = (int) ((float) var18 * arg4);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg1 = var20 | var19 << 8 | var17 << 16;
        }
        this.field2699.method3954(arg3 * 4);
        this.field2699.method3951((byte) (arg1 >> 16));
        this.field2699.method3951((byte) (arg1 >> 8));
        if (arg0 >= -16) {
            field2690 = null;
        }
        this.field2699.method3951((byte) arg1);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)Ljava/lang/String;", line = 300)
    public static final String method1341(byte arg0) {
        if (arg0 != 101) {
            method1343(100, 70, 0, (byte) 111, 116);
        }
        field2688++;
        return class422.field5962 || class50.field723 == null ? "" : class50.field723.field4644;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZ)V", line = 316)
    public final void method1342(int arg0, boolean arg1) {
        this.field2701 = this.field2687.field4163.method3946(arg0 * 4, true);
        if (arg1) {
            method1341((byte) -11);
        }
        field2684++;
        this.field2699 = new Stream(this.field2701);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIBI)Z", line = 331)
    public static final boolean method1343(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2702++;
        if ((class617.field8700[0][arg1][arg2] & 0x2) != 0) {
            return true;
        }
        if (arg3 != 72) {
            field2703 = 1.8278177F;
        }
        if ((class617.field8700[arg0][arg1][arg2] & 0x10) == 0) {
            return class90.method635(arg1, arg0, arg3 + 928, arg2) == arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lwr;IIIII)V", line = 352)
    public class177(class480 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2698 = arg0;
        this.field2681 = arg4;
        this.field2683 = arg1;
        this.field2691 = new int[this.field2698.field4425 * this.field2698.field4420];
        this.field2687 = this.field2698.field6816;
        this.field2700 = arg5;
        this.field2696 = arg3;
        this.field2694 = arg2;
        this.field2692 = new class341(this.field2687, 5123, null, 1);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BI)V", line = 368)
    public final void method1344(byte arg0, int arg1) {
        field2685++;
        this.field2699.method3959();
        class726 var3 = this.field2687.method1822(false, arg1 * 4, 100, 4, this.field2701);
        this.field2693 = new class717(var3, 5121, 4, 0);
        this.field2701 = null;
        int var4 = -87 / ((arg0 - 53) / 34);
        this.field2699 = null;
    }
}
