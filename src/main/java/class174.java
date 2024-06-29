import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class174 extends class115 {

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    private int field3052 = 2000;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    private int field3059 = 4096;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    private int field3054 = 0;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    private int field3060 = 16;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    private int field3061 = 0;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field3055 = 0;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "Lqe;")
    public static class168 field3051 = class66.method448("_", -121);

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "Lqe;")
    public static class168 field3048 = class66.method448("blaugr-Un:", -117);

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        ++field3049;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            this.field3059 = arg1.method731(false);
                        }
                    } else {
                        this.field3061 = arg1.method731(false);
                    }
                } else {
                    this.field3060 = arg1.method758(true);
                }
            } else {
                this.field3052 = arg1.method731(false);
            }
        } else {
            this.field3054 = arg1.method758(true);
        }
        if (arg0 != 107) {
            this.method170(80);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        if (arg1 <= 37) {
            method1155(-114);
        }
        ++field3058;
        int[] var3 = super.field1872.method182((byte) -101, arg0);
        if (super.field1872.field341) {
            int var4 = this.field3059 >> 1;
            int[][] var5 = super.field1872.method181((byte) 77);
            Random var6 = new Random((long) this.field3054);
            for (int var7 = 0; ~var7 > ~this.field3052; ++var7) {
                int var8 = ~this.field3059 >= -1 ? this.field3061 : -var4 + this.field3061 + class163.method1056(var6, this.field3059, 100);
                int var9 = (4091 & var8) >> 4;
                int var10 = class163.method1056(var6, class130.field2297, 95);
                int var11 = class163.method1056(var6, class62.field855, 127);
                int var12 = (class170.field2961[var9] * this.field3060 >> 12) + var10;
                int var13 = -var10 + var12;
                int var14 = (class234.field3980[var9] * this.field3060 >> 12) + var11;
                int var15 = -var11 + var14;
                if (~var13 != -1 || var15 != 0) {
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 < ~var13;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var14;
                        var14 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var14;
                        var14 = var20;
                    }
                    int var21 = var14 - var11;
                    int var22 = var12 - var10;
                    int var23 = 2048 / var22;
                    int var24 = -var22 / 2;
                    if (var21 < 0) {
                        var21 = -var21;
                    }
                    int var25 = var11;
                    int var26 = var14 <= var11 ? -1 : 1;
                    int var27 = -(class163.method1056(var6, 4096, 115) >> 2) + 1024;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        var24 += var21;
                        int var29 = (-var10 + var28) * var23 + (var27 - -1024);
                        int var30 = class38.field522 & var25;
                        if (var24 > 0) {
                            var24 -= var22;
                            var25 -= -var26;
                        }
                        int var31 = var28 & class134.field2350;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)V")
    public static void method1155(int arg0) {
        field3051 = null;
        if (arg0 == 255) {
            field3048 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class174() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "(I)Lfe;")
    public static final class15 method1156(int arg0) {
        ++field3056;
        int var1 = class85.field1332[arg0] * class69.field978[0];
        byte[] var2 = class7.field84[0];
        class15 var5;
        if (!class69.field981[0]) {
            int[] var3 = new int[var1];
            for (int var4 = 0; ~var4 > ~var1; ++var4) {
                var3[var4] = class92.field1457[class86.method571(255, var2[var4])];
            }
            var5 = new class15(class243.field4225, class150.field2597, class33.field415[0], class54.field746[0], class85.field1332[0], class69.field978[0], var3);
        } else {
            int[] var6 = new int[var1];
            byte[] var7 = class21.field256[0];
            for (int var8 = 0; var8 < var1; ++var8) {
                var6[var8] = class102.method675(class86.method571(var7[var8] << 24, -16777216), class92.field1457[class86.method571(255, var2[var8])]);
            }
            var5 = new class183(class243.field4225, class150.field2597, class33.field415[0], class54.field746[0], class85.field1332[0], class69.field978[0], var6);
        }
        class246.method1613(arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        ++field3053;
        if (arg0 != 395462996) {
            method1157(-71, (byte) 90);
        }
        class142.method969(-15046);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)V")
    public static final void method1157(int arg0, byte arg1) {
        ++field3050;
        class151.field2629 = arg0;
        class68.field971 = -1;
        if (arg1 >= -38) {
            field3055 = 127;
        }
        class27.field342 = -1;
        class55.method386((byte) 44);
    }
}
