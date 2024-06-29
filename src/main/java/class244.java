import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class244 extends class751 {

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "Z")
    private boolean field3508 = true;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "Z")
    private boolean field3507 = true;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 6)
    public class244() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)[[I", line = 13)
    public final int[][] method147(int arg0, byte arg1) {
        if (arg1 != 57) {
            method1654(100, (String) null);
        }
        ++field3504;
        int[][] var3 = super.field10409.method3474(arg1 + 2075, arg0);
        if (super.field10409.field8481) {
            int[][] var4 = this.method4172(0, this.field3507 ? -arg0 + class348.field5094 : arg0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field3508) {
                for (int var11 = 0; class673.field9452 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; class673.field9452 > var12; ++var12) {
                    var8[var12] = var5[-var12 + class407.field5754];
                    var9[var12] = var6[-var12 + class407.field5754];
                    var10[var12] = var7[class407.field5754 - var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILrv;I)V", line = 78)
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field3506;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field10415 = arg1.method842(2384) == 1;
                }
            } else {
                this.field3507 = arg1.method842(2384) == 1;
            }
        } else {
            this.field3508 = arg1.method842(2384) == 1;
        }
        int var5 = -124 % ((arg0 - 25) / 63);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[I", line = 121)
    public final int[] method365(int arg0, int arg1) {
        ++field3509;
        if (arg1 != 4095) {
            this.method309(-119, (class120) null, 20);
        }
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int[] var4 = this.method4173(!this.field3507 ? arg0 : -arg0 + class348.field5094, (byte) -116, 0);
            if (!this.field3508) {
                class42.method289(var4, 0, var3, 0, class673.field9452);
            } else {
                for (int var5 = 0; ~class673.field9452 < ~var5; ++var5) {
                    var3[var5] = var4[class407.field5754 - var5];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;)V", line = 160)
    public static final void method1654(int arg0, String arg1) {
        ++field3510;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class221.method1524(arg1, -91);
            if (var2 != null) {
                int var3 = 0;
                if (arg0 != 1) {
                    field3505 = 109;
                }
                while (var3 < class50.field719) {
                    String var4 = class662.field9293[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class221.method1524(var4, -86);
                    if (var5 != null && var5.equals(var2)) {
                        --class50.field719;
                        for (int var6 = var3; var6 < class50.field719; ++var6) {
                            class662.field9293[var6] = class662.field9293[var6 + 1];
                            class738.field10303[var6] = class738.field10303[var6 + 1];
                            class146.field1861[var6] = class146.field1861[var6 + 1];
                            class792.field10868[var6] = class792.field10868[var6 + 1];
                            class291.field4414[var6] = class291.field4414[var6 + 1];
                            class10.field223[var6] = class10.field223[var6 + 1];
                        }
                        ++class135.field1750;
                        class543.field7610 = class717.field10086;
                        class731 var7 = class155.method1222(260, class602.field8488, class237.field3417);
                        var7.field10211.method851((byte) -2, class233.method1612(arg0, arg1));
                        var7.field10211.method880(true, arg1);
                        class533.method3088(var7, 0);
                        return;
                    }
                    ++var3;
                }
            }
        }
    }
}
