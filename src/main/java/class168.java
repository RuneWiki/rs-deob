import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class168 extends class56 {

    @OriginalMember(owner = "client!wea", name = "K", descriptor = "I")
    private int field2030 = 0;

    @OriginalMember(owner = "client!wea", name = "N", descriptor = "I")
    private int field2033 = 16;

    @OriginalMember(owner = "client!wea", name = "D", descriptor = "I")
    private int field2023 = 4096;

    @OriginalMember(owner = "client!wea", name = "G", descriptor = "I")
    private int field2026 = 0;

    @OriginalMember(owner = "client!wea", name = "E", descriptor = "I")
    private int field2024 = 2000;

    @OriginalMember(owner = "client!wea", name = "F", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!wea", name = "H", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!wea", name = "I", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!wea", name = "J", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!wea", name = "L", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!wea", name = "M", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field2023 = arg2.method2390((byte) -112);
                        }
                    } else {
                        this.field2030 = arg2.method2390((byte) -108);
                    }
                } else {
                    this.field2033 = arg2.method2396((byte) -114);
                }
            } else {
                this.field2024 = arg2.method2390((byte) 22);
            }
        } else {
            this.field2026 = arg2.method2396((byte) -92);
        }
        ++field2028;
        if (arg0 >= -44) {
            this.method145(106, 18);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
    public final void method493(byte arg0) {
        class120.method940((byte) -61);
        ++field2032;
        int var2 = 13 / ((arg0 - 37) / 62);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        if (arg0 != 0) {
            field2029 = -116;
        }
        ++field2031;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int var4 = this.field2023 >> 1;
            int[][] var5 = super.field752.method1304((byte) -70);
            Random var6 = new Random((long) this.field2026);
            for (int var7 = 0; ~var7 > ~this.field2024; ++var7) {
                int var8 = this.field2023 <= 0 ? this.field2030 : this.field2030 - var4 - -class93.method822(var6, -1, this.field2023);
                int var9 = 255 & var8 >> 4;
                int var10 = class93.method822(var6, -1, class642.field8759);
                int var11 = class93.method822(var6, -1, class784.field10832);
                int var12 = (class285.field3332[var9] * this.field2033 >> 12) + var10;
                int var13 = (class737.field10282[var9] * this.field2033 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class93.method822(var6, ~arg0, 4096) >> 2) + 1024;
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = var28 & class446.field5990;
                        int var31 = var21 & class75.field1037;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "()V")
    public class168() {
        super(0, true);
    }
}
