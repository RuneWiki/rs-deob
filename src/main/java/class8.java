import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 extends class157 {

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    private int field153 = 4096;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    private int field163 = 0;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    private int field155 = 2000;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    private int field161 = 16;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    private int field157 = 0;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field158 = 0;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "[Z")
    public static boolean[] field156 = new boolean[200];

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public static int field154 = 0;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "Lcc;")
    public static class209 field162 = class95.method669(107, "<br>");

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public static int field164 = -2;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "Lcc;")
    public static class209 field160 = class95.method669(122, "");

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "(I)V")
    public static void method78(int arg0) {
        if (arg0 != 255) {
            method78(-53);
        }
        field162 = null;
        field160 = null;
        field156 = null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field165;
        if (arg1 > -29) {
            field158 = 68;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field153 = arg2.method736(125);
                        }
                    } else {
                        this.field157 = arg2.method736(121);
                    }
                } else {
                    this.field161 = arg2.method774((byte) 118);
                }
            } else {
                this.field155 = arg2.method736(126);
            }
        } else {
            this.field163 = arg2.method774((byte) 116);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        int var2 = -67 % ((arg0 - -51) / 52);
        class257.method1773(0);
        ++field152;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        int[] var3 = super.field2879.method1269(arg1, arg0 + 17983);
        ++field166;
        if (arg0 != -98) {
            field156 = null;
        }
        if (super.field2879.field3363) {
            int var4 = this.field153 >> 1;
            int[][] var5 = super.field2879.method1268((byte) 100);
            Random var6 = new Random((long) this.field163);
            for (int var7 = 0; ~this.field155 < ~var7; ++var7) {
                int var8 = this.field153 > 0 ? this.field157 - (-class39.method295(-61, var6, this.field153) + var4) : this.field157;
                int var9 = class39.method295(-61, var6, class226.field4124);
                int var10 = var8 >> 4 & 255;
                int var11 = class39.method295(-61, var6, class79.field1469);
                int var12 = (class223.field4073[var10] * this.field161 >> 12) + var11;
                int var13 = var9 - -(class209.field3785[var10] * this.field161 >> 12);
                int var14 = -var9 + var13;
                int var15 = -var11 + var12;
                if (var14 != 0 || var15 != 0) {
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = var15 > var14;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var13;
                        var9 = var11;
                        var11 = var17;
                        var13 = var12;
                        var12 = var18;
                    }
                    if (var9 > var13) {
                        int var19 = var9;
                        int var20 = var11;
                        var9 = var13;
                        var13 = var19;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var9 + var13;
                    int var23 = var12 - var11;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class39.method295(-61, var6, 4096) >> 2);
                    int var27 = ~var12 >= ~var11 ? -1 : 1;
                    for (int var28 = var9; ~var28 > ~var13; ++var28) {
                        int var29 = class249.field4490 & var28;
                        int var30 = (-var9 + var28) * var25 + var26 + 1024;
                        var24 += var23;
                        int var31 = var21 & class42.field859;
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 += var27;
                        }
                        if (var16) {
                            var5[var31][var29] = var30;
                        } else {
                            var5[var29][var31] = var30;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(BII)I")
    public static final int method79(byte arg0, int arg1, int arg2) {
        ++field168;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 127) * arg2 >> 7;
            if (arg0 >= -106) {
                method78(-124);
            }
            if (~var3 > -3) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (65408 & arg1) + var3;
        }
    }
}
