import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class5 extends class202 {

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    private int field53 = 0;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    private int field63 = 1;

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "I")
    private int field64 = 0;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "Z")
    public static boolean field55 = false;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "[[I")
    public static int[][] field54 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "[I")
    public static int[] field59 = new int[50];

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    public static int field61 = 0;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!lj", name = "Y", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "Lep;")
    public static class344 field62;

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        ++field56;
        int var4 = -106 / ((arg1 - -46) / 50);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 3) {
                    this.field63 = arg0.method1445(93);
                }
            } else {
                this.field64 = arg0.method1445(-114);
            }
        } else {
            this.field53 = arg0.method1445(125);
        }
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "(I)V")
    public static void method46(int arg0) {
        if (arg0 != 4096) {
            method50(97);
        }
        field59 = null;
        field62 = null;
        field54 = null;
    }

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)I")
    public static final int method47(int arg0) {
        ++field65;
        if (class216.field3671 != null) {
            return 3;
        } else if (arg0 != -1129530388) {
            return 67;
        } else {
            return class209.field3229 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILza;IILla;ZZ)V")
    public static final void method48(int arg0, class497 arg1, int arg2, int arg3, class299 arg4, boolean arg5, boolean arg6) {
        if (arg5) {
            class62.field973.method852((class489.field7400 + -class62.field973.method623()) / 2, (class219.field3715 + -class62.field973.method618()) / 2);
            class307.field4820.method852((class489.field7400 + -class307.field4820.method623()) / 2, 18);
        }
        ++field51;
        String var7 = "";
        if (class516.field7674 != class153.field2042) {
            if (class516.field7674 == class261.field4216) {
                var7 = class345.field5378.method1583(124, class12.field131);
            }
        } else {
            var7 = class422.field6394.method1583(82, class12.field131);
        }
        arg4.method2006(var7, class489.field7400 / 2, class219.field3715 / 2 + -26, arg2, true, -1);
        int var8 = class219.field3715 / 2 + -18;
        arg1.method1284(class489.field7400 / 2 + -152, var8, 304, 34, arg3, 0);
        arg1.method1284(class489.field7400 / 2 + -151, var8 + 1, 302, 32, 0, 0);
        arg1.method1260(class489.field7400 / 2 + -150, var8 + 2, class280.field4431 * 3, 30, arg0, 0);
        arg1.method1260(class489.field7400 / 2 + class280.field4431 * 3 - 150, var8 + 2, -(class280.field4431 * 3) + 300, 30, 0, 0);
        arg4.method2006(class365.field5657, class489.field7400 / 2, class219.field3715 / 2 + 4, arg2, arg6, -1);
    }

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)V")
    public static final void method49(int arg0) {
        class54.method414(true);
        ++field57;
        class141.field1909 = null;
        class183.field2649 = null;
        class137.field1885 = null;
        if (arg0 < -39) {
            class307.field4813 = null;
            class234.field3854 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)I")
    public static final int method50(int arg0) {
        if (arg0 != 4) {
            return 87;
        } else {
            ++field58;
            return 2;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        ++field60;
        class62.method461(86);
        int var2 = 49 % ((arg0 - 80) / 46);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field52;
        int[] var3 = super.field3064.method2452((byte) 63, arg0);
        if (!arg1) {
            this.method41(51, false);
        }
        if (super.field3064.field5837) {
            int var4 = class521.field7716[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; class276.field4375 > var6; ++var6) {
                int var7 = class476.field7271[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field53 == 0) {
                    var9 = (-var4 + var7) * this.field63;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field63 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field64 == 0) {
                    var12 = class425.field6440[255 & var12 >> 4] - -4096 >> 1;
                } else if (this.field64 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
