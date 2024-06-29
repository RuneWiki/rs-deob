import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class793 extends class741 {

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "Z")
    private boolean field10866 = false;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "Z")
    private boolean field10867;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "[Lfp;")
    private class596[] field10870;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "[[I")
    public static int[][] field10865 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field10860;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field10861;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field10862;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field10863;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
    public static int field10864;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "I")
    public static int field10868;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field10869;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    public static int field10871;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public static int field10872;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    public static int field10873;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "Ltt;")
    public static class528 field10874;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method4338(String arg0, int arg1, int arg2) {
        ++class623.field8735;
        int var3 = 50 % ((arg1 - -92) / 34);
        ++field10864;
        class116 var4 = class248.method1672(class84.field1023, class54.field648, -20647);
        var4.field1575.method3005(255, 1 - -class395.method2435(arg0, 1));
        var4.field1575.method3005(255, arg2);
        var4.field1575.method3037(0, arg0);
        class443.method2655(0, var4);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
    public final void method430(int arg0, boolean arg1) {
        super.field10209.method1494(class785.field10763, 775, class92.field1073);
        ++field10863;
        if (arg0 <= 96) {
            this.field10870 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Llba;)V")
    public class793(class223 arg0) {
        super(arg0);
        if (arg0.field3356) {
            this.field10867 = ~arg0.field3361 > -4;
            int var2 = !this.field10867 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
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
                            if (var14 == 2) {
                                var15 = var13;
                            } else if (var14 == 3) {
                                var15 = -var13;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field10870 = new class596[3];
            this.field10870[0] = super.field10209.method1385(false, 64, (byte) -44, var4);
            this.field10870[1] = super.field10209.method1385(false, 64, (byte) 82, var5);
            this.field10870[2] = super.field10209.method1385(false, 64, (byte) -48, var3);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILml;)V")
    public final void method433(int arg0, int arg1, class34 arg2) {
        if (arg0 != -1) {
            method4340(-112);
        }
        ++field10871;
        super.field10209.method1492(arg2, arg0 ^ -3);
        super.field10209.method1509(arg0 + 5, arg1);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        if (this.field10866) {
            super.field10209.method1473(1, (byte) 13);
            super.field10209.method1492(this.field10870[arg0 - 1], 2);
            super.field10209.method1473(0, (byte) 37);
        }
        ++field10872;
        int var4 = 124 / ((-18 - arg2) / 51);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)Z")
    public final boolean method425(byte arg0) {
        if (arg0 >= -37) {
            return false;
        } else {
            ++field10860;
            return true;
        }
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(III)Z")
    public static final boolean method4339(int arg0, int arg1, int arg2) {
        if (arg0 > -10) {
            return true;
        } else {
            ++field10869;
            return ~(1024 & arg1) != -1;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(BZ)V")
    public final void method429(byte arg0, boolean arg1) {
        if (arg0 <= 15) {
            field10868 = -87;
        }
        if (this.field10870 != null && arg1) {
            super.field10209.method1473(1, (byte) 44);
            super.field10209.method1434(class444.field6143, (byte) 71);
            class517 var3 = super.field10209.method1470(98);
            var3.method40(1024);
            super.field10209.method1475(49, class347.field5057);
            if (this.field10867) {
                super.field10209.method1494(class587.field8280, 775, class92.field1073);
                super.field10209.method1469(false, 0, false, class157.field2039, true);
                super.field10209.method1455(0, -3, class656.field9260);
            } else {
                super.field10209.method1494(class92.field1073, 775, class785.field10763);
                super.field10209.method1409(class224.field3416, 0, -108);
                super.field10209.method1473(2, (byte) 36);
                super.field10209.method1494(class587.field8280, 775, class92.field1073);
                super.field10209.method1409(class224.field3416, 0, -119);
                super.field10209.method1469(false, 1, false, class224.field3416, true);
                super.field10209.method1455(0, -3, class656.field9260);
                super.field10209.method1492(super.field10209.field3346, 2);
            }
            super.field10209.method1473(0, (byte) 30);
            this.field10866 = true;
        } else {
            super.field10209.method1455(0, -3, class656.field9260);
        }
        ++field10862;
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V")
    public final void method434(int arg0) {
        if (this.field10866) {
            super.field10209.method1473(1, (byte) 92);
            super.field10209.method1492((class34) null, 2);
            super.field10209.method1434(class213.field2940, (byte) 71);
            super.field10209.method1377(true);
            if (this.field10867) {
                super.field10209.method1494(class785.field10763, 775, class785.field10763);
                super.field10209.method1409(class157.field2039, 0, -113);
                super.field10209.method1455(0, -3, class157.field2039);
            } else {
                super.field10209.method1494(class785.field10763, 775, class785.field10763);
                super.field10209.method1409(class157.field2039, 0, -120);
                super.field10209.method1473(2, (byte) 86);
                super.field10209.method1494(class785.field10763, 775, class785.field10763);
                super.field10209.method1409(class157.field2039, 0, -113);
                super.field10209.method1409(class224.field3416, 1, -115);
                super.field10209.method1455(0, -3, class157.field2039);
                super.field10209.method1492((class34) null, 2);
            }
            super.field10209.method1473(0, (byte) 78);
            this.field10866 = false;
        } else {
            super.field10209.method1455(0, -3, class157.field2039);
        }
        int var2 = 127 / ((10 - arg0) / 44);
        ++field10873;
        super.field10209.method1494(class785.field10763, 775, class785.field10763);
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
    public static void method4340(int arg0) {
        field10865 = null;
        if (arg0 != 32574) {
            field10868 = 0;
        }
        field10874 = null;
    }
}
