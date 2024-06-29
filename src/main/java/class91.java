import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class91 extends class37 {

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    private int field2023 = 0;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    private int field2025 = 16;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    private int field2026 = 2000;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    private int field2033 = 4096;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    private int field2029 = 0;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field2028 = 2;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "[[I")
    public static int[][] field2031 = new int[104][104];

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "Lbg;")
    public static class18 field2024;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        ++field2022;
        if (arg0) {
            method669((class8) null, 58, (class8) null);
        }
        class75.method591(4096);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lag;ILag;)V")
    public static final void method669(class8 arg0, int arg1, class8 arg2) {
        class203.field4051 = arg2;
        ++field2036;
        class35.field708 = arg0;
        if (arg1 != 0) {
            field2024 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)V")
    public static void method670(int arg0) {
        field2024 = null;
        if (arg0 != 0) {
            field2031 = null;
        }
        field2031 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int var4 = this.field2033 >> 1;
            int[][] var5 = super.field816.method1187(-65);
            Random var6 = new Random((long) this.field2029);
            for (int var7 = 0; var7 < this.field2026; ++var7) {
                int var8 = this.field2033 > 0 ? -var4 + this.field2023 + class183.method1218(1804454752, this.field2033, var6) : this.field2023;
                int var9 = (var8 & 4087) >> 4;
                int var10 = class183.method1218(1804454752, class72.field1719, var6);
                int var11 = class183.method1218(1804454752, class35.field782, var6);
                int var12 = (class3.field43[var9] * this.field2025 >> 12) + var10;
                int var13 = (class51.field1155[var9] * this.field2025 >> 12) + var11;
                int var14 = -var10 + var12;
                int var15 = -var11 + var13;
                if (~var14 != -1 || var15 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = var14 < var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var24 = 2048 / var22;
                    int var25 = -var22 / 2;
                    int var26 = -(class183.method1218(arg0 ^ 1804454699, 4096, var6) >> 2) + 1024;
                    int var27 = ~var13 < ~var11 ? 1 : -1;
                    for (int var28 = var10; var12 > var28; ++var28) {
                        var25 += var23;
                        int var29 = (-var10 + var28) * var24 + var26 + 1024;
                        int var30 = class71.field1691 & var28;
                        int var31 = class105.field2348 & var21;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var25 > 0) {
                            var25 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        if (arg0 != 75) {
            this.field2023 = -53;
        }
        ++field2032;
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        if (arg1 != 1) {
            this.method7((byte) 22, -117);
        }
        ++field2035;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 == -5) {
                            this.field2033 = arg2.method256((byte) -78);
                        }
                    } else {
                        this.field2023 = arg2.method256((byte) -78);
                    }
                } else {
                    this.field2025 = arg2.method221(-81);
                }
            } else {
                this.field2026 = arg2.method256((byte) -78);
            }
        } else {
            this.field2029 = arg2.method221(-120);
        }
    }
}
