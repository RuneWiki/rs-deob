import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class7 {

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "[[I")
    private int[][] field163;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "Lti;")
    public static class5 field158 = new class5(16);

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Lse;")
    public static class221 field166;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "[La;")
    public static class50[] field167;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[B)[B")
    public final byte[] method67(int arg0, byte[] arg1) {
        if (this.field163 != null) {
            int var3 = 0;
            int var4 = (int) ((long) arg1.length * (long) this.field157 / (long) this.field155) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field163[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field157 + var6;
                int var14 = var13 / this.field155;
                var6 = var13 - this.field155 * var14;
                var3 += var14;
            }
            arg1 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        field159++;
        if (arg0 != 104) {
            field158 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public static final void method68(byte arg0) {
        class106.field1652.method1876((byte) 118);
        class179.field2964.method1876((byte) 119);
        if (arg0 != 35) {
            field158 = null;
        }
        field168++;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public static final void method69(int arg0) {
        if (arg0 == 1260583304) {
            class254.field4199.method1873(-7401);
            field169++;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)I")
    public static final int method70(byte arg0, int arg1) {
        field161++;
        if (class18.field322 != null) {
            class18.field322.method416(64);
            class18.field322 = null;
        }
        if (arg0 != -62) {
            field158 = null;
        }
        class224.field3527++;
        if (class224.field3527 > 4) {
            class224.field3527 = 0;
            class48.field713 = 0;
            return arg1;
        }
        if (class174.field2910 == class140.field2281) {
            class140.field2281 = class239.field3743;
        } else {
            class140.field2281 = class174.field2910;
        }
        class48.field713 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZZ)V")
    public static final void method71(boolean arg0, boolean arg1) {
        class159.field2599 = new int[104];
        field164++;
        class166.field2750 = new int[104];
        if (arg0) {
            method68((byte) 79);
        }
        class272.field4390 = 99;
        class93.field1474 = new int[5];
        class169.field2769 = new int[104];
        class48.field702 = new int[104];
        class33.field549 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class255.field4213 = new byte[var2][105][105];
        class202.field3280 = new byte[var2][104][104];
        class27.field480 = new byte[var2][104][104];
        class68.field1084 = new byte[var2][104][104];
        class44.field657 = new int[var2][105][105];
        class250.field4102 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)I")
    public static final int method72(int arg0, int arg1) {
        if (arg1 == 105) {
            field162++;
            return arg0 >>> 8;
        } else {
            return 94;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
    public static void method73(boolean arg0) {
        field158 = null;
        if (arg0) {
            field166 = null;
            field167 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(II)V")
    public class7(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class27.method212(false, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field163 = new int[var4][14];
            this.field155 = var4;
            this.field157 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                double var7 = (double) var6 / (double) var4 + 6.0D;
                int[] var9 = this.field163[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                double var12 = (double) var5 / (double) var4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)I")
    public final int method74(int arg0, byte arg1) {
        if (arg1 != -103) {
            field166 = null;
        }
        field160++;
        if (this.field163 != null) {
            arg0 = (int) ((long) this.field157 * (long) arg0 / (long) this.field155) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lgi;I)V")
    public static final void method75(class164 arg0, int arg1) {
        class90.field1401 = arg0;
        field165++;
        class307.field4986 = class90.field1401.method1145((byte) 125, 4);
        if (arg1 >= -124) {
            method75((class164) null, -86);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)I")
    public final int method76(int arg0, int arg1) {
        field156++;
        if (this.field163 != null) {
            arg1 = (int) ((long) this.field157 * (long) arg1 / (long) this.field155);
        }
        if (arg0 != 0) {
            method68((byte) -23);
        }
        return arg1;
    }
}
