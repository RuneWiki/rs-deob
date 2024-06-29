import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class27 extends class326 {

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    private int field393 = 4096;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    private int field396 = 4096;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    private int field401 = 4096;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public static int field399 = 2;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field403 = 0;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "Lrm;")
    public static class184 field395 = new class184(20);

    @OriginalMember(owner = "client!da", name = "V", descriptor = "Z")
    public static boolean field406 = false;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!da", name = "X", descriptor = "Lbi;")
    public static class214 field408;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "[Luj;")
    public static class169[] field398;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V", line = 11)
    public static final void method250(int arg0) {
        field400++;
        int var1 = class295.field4575;
        int var2 = class281.field4343;
        if (arg0 != 256) {
            field395 = (class184) null;
        }
        int var3 = class95.field1264 - 3;
        int var4 = class138.field2197;
        byte var5 = 20;
        if (class232.field3626 == null || class303.field4702 == null) {
            if (class256.field4042.method1837(85, class167.field2742) && class256.field4042.method1837(94, class153.field2362)) {
                class232.field3626 = class187.method1378(0, -106, class256.field4042, class167.field2742);
                class303.field4702 = class187.method1378(0, -111, class256.field4042, class153.field2362);
                if (class109.field1458) {
                    if ((class232.field3626 instanceof class186)) {
                        class232.field3626 = new class19((class190) class232.field3626);
                    } else {
                        class232.field3626 = new class239((class190) class232.field3626);
                    }
                    if (class303.field4702 instanceof class186) {
                        class303.field4702 = new class19((class190) class303.field4702);
                    } else {
                        class303.field4702 = new class239((class190) class303.field4702);
                    }
                }
            } else if (class109.field1458) {
                class122.method893(var1, var2, var4, var5, class107.field1412, 256 - class282.field4368);
            } else {
                class280.method1970(var1, var2, var4, var5, class107.field1412, 256 - class282.field4368);
            }
        }
        if (class232.field3626 != null && class303.field4702 != null) {
            int var6 = (var4 - class303.field4702.field2788 * 2) / class232.field3626.field2788;
            for (int var7 = 0; var7 < var6; var7++) {
                class232.field3626.method1273(class232.field3626.field2788 * var7 + class303.field4702.field2788 + var1, var2);
            }
            class303.field4702.method1273(var1, var2);
            class303.field4702.method1267(var1 + var4 - class303.field4702.field2788, var2);
        }
        class270.field4197.method2252(class232.field3623, var1 + 3, var2 + 14, class39.field552, -1);
        if (class109.field1458) {
            class122.method893(var1, var2 + var5, var4, var3 - var5, class107.field1412, 256 - class282.field4368);
        } else {
            class280.method1970(var1, var2 + var5, var4, var3 - var5, class107.field1412, 256 - class282.field4368);
        }
        int var8 = class82.field1129;
        int var9 = class25.field381;
        for (int var10 = 0; var10 < class78.field1046; var10++) {
            int var11 = (class78.field1046 - var10 - 1) * 15 + var5 + var2 + 13;
            if (var9 > var1 && var9 < var1 + var4 && var8 > (var11 - 13) && var8 < var11 + 3) {
                if (class109.field1458) {
                    class122.method893(var1, var11 - 12, var4, 15, class335.field5222, 256 - class294.field4566);
                } else {
                    class280.method1970(var1, var11 - 12, var4, 15, class335.field5222, 256 - class294.field4566);
                }
            }
        }
        if ((class117.field1637 == null || class194.field3104 == null || class279.field4302 == null) && class256.field4042.method1837(105, class5.field61) && class256.field4042.method1837(126, class269.field4177) && class256.field4042.method1837(123, class298.field4594)) {
            class117.field1637 = class187.method1378(0, -112, class256.field4042, class5.field61);
            class194.field3104 = class187.method1378(0, -108, class256.field4042, class269.field4177);
            class279.field4302 = class187.method1378(0, -122, class256.field4042, class298.field4594);
            if (class109.field1458) {
                if (class117.field1637 instanceof class186) {
                    class117.field1637 = new class19((class190) class117.field1637);
                } else {
                    class117.field1637 = new class239((class190) class117.field1637);
                }
                if ((class194.field3104 instanceof class186)) {
                    class194.field3104 = new class19((class190) class194.field3104);
                } else {
                    class194.field3104 = new class239((class190) class194.field3104);
                }
                if (class279.field4302 instanceof class186) {
                    class279.field4302 = new class19((class190) class279.field4302);
                } else {
                    class279.field4302 = new class239((class190) class279.field4302);
                }
            }
        }
        if (class117.field1637 != null && class194.field3104 != null && class279.field4302 != null) {
            int var12 = (var4 - class279.field4302.field2788 * 2) / class117.field1637.field2788;
            for (int var13 = 0; var13 < var12; var13++) {
                class117.field1637.method1273(class117.field1637.field2788 * var13 + (var1 + class279.field4302.field2788), var2 + var3 + -class117.field1637.field2791);
            }
            int var14 = (var3 - var5 - class279.field4302.field2791) / class194.field3104.field2791;
            for (int var15 = 0; var15 < var14; var15++) {
                class194.field3104.method1273(var1, class194.field3104.field2791 * var15 + (var2 + var5));
                class194.field3104.method1267(var1 + var4 - class194.field3104.field2788, class194.field3104.field2791 * var15 + var2 + var5);
            }
            class279.field4302.method1273(var1, var2 + var3 - class279.field4302.field2791);
            class279.field4302.method1267(var1 + var4 - class279.field4302.field2788, var2 + var3 + -class279.field4302.field2791);
        }
        for (int var16 = 0; var16 < class78.field1046; var16++) {
            int var17 = var2 + var5 + ((-var16 + class78.field1046 + -1) * 15) + 13;
            int var18 = class39.field552;
            if (var1 < var9 && var9 < (var1 + var4) && var8 > (var17 - 13) && var8 < (var17 + 3)) {
                var18 = class248.field3912;
            }
            class270.field4197.method2252(class207.method1525(8, var16), var1 + 3, var17, var18, 0);
        }
        class96.method683(class281.field4343, class138.field2197, class95.field1264, class295.field4575, -22156);
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 251)
    public class27() {
        super(1, false);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)Lnn;", line = 189)
    public static final class187 method251(boolean arg0) {
        field394++;
        if (arg0) {
            field403 = -35;
        }
        return class253.field3974 >= class318.field5036.length ? null : class318.field5036[class253.field3974++];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZLvl;)V", line = 206)
    public final void method98(int arg0, boolean arg1, class6 arg2) {
        field405++;
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field393 = arg2.method39((byte) 86);
        } else if (arg0 == 1) {
            this.field401 = arg2.method39((byte) 49);
        } else if (arg0 == 2) {
            this.field396 = arg2.method39((byte) 66);
        }
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(B)V", line = 255)
    public static void method252(byte arg0) {
        field395 = null;
        field408 = null;
        if (arg0 == -65) {
            field398 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)[[I", line = 282)
    public final int[][] method253(int arg0, byte arg1) {
        int[][] var3 = this.field5104.method2365((byte) 42, arg0);
        int var4 = -32 / ((60 - arg1) / 51);
        if (this.field5104.field5325) {
            int[][] var5 = this.method2293(-15033, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var3[0];
            int[] var9 = var5[1];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class166.field2731; var12++) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var9[var12];
                if (var13 == var14 && var14 == var15) {
                    var8[var12] = this.field393 * var13 >> 12;
                    var10[var12] = this.field401 * var14 >> 12;
                    var11[var12] = this.field396 * var15 >> 12;
                } else {
                    var8[var12] = this.field393;
                    var10[var12] = this.field401;
                    var11[var12] = this.field396;
                }
            }
        }
        field402++;
        return var3;
    }
}
