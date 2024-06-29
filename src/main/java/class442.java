import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class442 extends class335 {

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "[I")
    private int[] field5865 = new int[3];

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    private int field5870 = 4096;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    private int field5872 = 4096;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    private int field5864 = 409;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    private int field5867 = 4096;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field5873 = -1;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field5866;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILio;I)V")
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            int var5 = arg1.method933((byte) 1);
                            this.field5865[0] = class15.method97(267386880, var5 << 4);
                            this.field5865[1] = class15.method97(var5, 65280) >> 4;
                            this.field5865[2] = class15.method97(255, var5) >> 12;
                        }
                    } else {
                        this.field5872 = arg1.method963(arg2 ^ 60);
                    }
                } else {
                    this.field5867 = arg1.method963(-124);
                }
            } else {
                this.field5870 = arg1.method963(arg2 + -57);
            }
        } else {
            this.field5864 = arg1.method963(-125);
        }
        if (arg2 != -66) {
            this.field5864 = -124;
        }
        ++field5869;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class442() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1(int arg0, boolean arg1) {
        ++field5868;
        if (arg1) {
            method2497(-59);
        }
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (super.field4527.field1468) {
            int[][] var4 = this.method1968(arg0, 3, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class649.field8968 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field5865[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field5864 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field5865[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var15 < ~this.field5864) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field5865[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field5864 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field5872 * var12 >> 12;
                            var9[var11] = this.field5867 * var14 >> 12;
                            var10[var11] = this.field5870 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
    public static final void method2497(int arg0) {
        class389.field5221 = new class354(class371.field4883.method2141(class422.field5539, true), "", class689.field9739, 1007, -1, 0L, 0, 0, true, false);
        ++field5866;
        if (arg0 >= -125) {
            field5873 = 23;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2498(int arg0, String arg1) {
        ++field5871;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class55.method328(arg1, (byte) -64);
            if (var2 != null) {
                for (int var3 = 0; ~var3 > ~class52.field662; ++var3) {
                    String var4 = class204.field2746[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class55.method328(var4, (byte) -64);
                    if (var5 != null && var5.equals(var2)) {
                        --class52.field662;
                        for (int var6 = var3; var6 < class52.field662; ++var6) {
                            class204.field2746[var6] = class204.field2746[var6 + 1];
                            class420.field5517[var6] = class420.field5517[var6 + 1];
                            class104.field1242[var6] = class104.field1242[var6 + 1];
                            class152.field2089[var6] = class152.field2089[var6 + 1];
                            class85.field1029[var6] = class85.field1029[var6 + 1];
                        }
                        class303.field4026 = class155.field2183;
                        ++class423.field5582;
                        class229 var7 = class97.method550(class71.field841, false, class244.field3201);
                        var7.field2971.method915(-31914, class206.method1313((byte) -58, arg1));
                        var7.field2971.method936(arg1, 120);
                        class307.method1805(var7, -14704);
                        break;
                    }
                }
                if (arg0 >= -41) {
                    method2498(79, (String) null);
                }
            }
        }
    }
}
