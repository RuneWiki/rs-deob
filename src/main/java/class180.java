import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class180 extends class117 {

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    private int field3258 = 0;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    private int field3266 = 2000;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
    private int field3265 = 0;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    private int field3264 = 4096;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    private int field3260 = 16;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "[[I")
    public static int[][] field3256 = new int[104][104];

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "Lpa;")
    public static class123 field3262;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "Lqh;")
    public static class69 field3261;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "[I")
    public static int[] field3267;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "[[I")
    public static int[][] field3259;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field3255;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int var4 = this.field3264 >> 1;
            int[][] var5 = super.field2218.method1046(true);
            Random var6 = new Random((long) this.field3265);
            for (int var7 = 0; ~this.field3266 < ~var7; ++var7) {
                int var8 = this.field3264 <= 0 ? this.field3258 : this.field3258 - (var4 + -class127.method1012(this.field3264, var6, -22067));
                int var9 = 255 & var8 >> 4;
                int var10 = class127.method1012(class143.field2702, var6, arg0 + -674);
                int var11 = class127.method1012(class1.field26, var6, arg0 + -674);
                int var12 = (class46.field775[var9] * this.field3260 >> 12) + var11;
                int var13 = var10 - -(class26.field412[var9] * this.field3260 >> 12);
                int var14 = -var10 + var13;
                int var15 = -var11 + var12;
                if (~var14 != -1 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 > var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var13;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (~var10 < ~var13) {
                        int var19 = var10;
                        var10 = var13;
                        var13 = var19;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = var13 - var10;
                    int var23 = 1024 - (class127.method1012(4096, var6, arg0 ^ 1442) >> 2);
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = ~var12 < ~var11 ? 1 : -1;
                    int var27 = -var11 + var12;
                    if (~var27 > -1) {
                        var27 = -var27;
                    }
                    for (int var28 = var10; ~var13 < ~var28; ++var28) {
                        int var29 = class54.field884 & var28;
                        int var30 = (-var10 + var28) * var25 + var23 + 1024;
                        var24 += var27;
                        int var31 = class258.field4520 & var21;
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 += var26;
                        }
                        if (!var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                    }
                }
            }
        }
        if (arg0 != -21393) {
            this.method60(12, 113, (class81) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)V")
    public static void method1319(byte arg0) {
        field3259 = null;
        field3261 = null;
        field3256 = null;
        field3267 = null;
        int var1 = 45 / ((arg0 - -87) / 38);
        field3262 = null;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        if (arg0 > -92) {
            this.method57((byte) 98);
        }
        ++field3263;
        class223.method1578(true);
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class180() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field3257;
        if (arg0 != 0) {
            method1319((byte) -119);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field3264 = arg2.method658(-125);
                        }
                    } else {
                        this.field3258 = arg2.method658(88);
                    }
                } else {
                    this.field3260 = arg2.method622(true);
                }
            } else {
                this.field3266 = arg2.method658(-63);
            }
        } else {
            this.field3265 = arg2.method622(true);
        }
    }
}
