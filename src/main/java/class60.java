import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class60 extends class30 {

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    private int field768 = 0;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "I")
    private int field770 = 1;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
    private int field775 = 0;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field771 = "level: ";

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field766 = 0;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljg;II)V", line = 6)
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field774;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field770 = arg0.method1322(false);
                }
            } else {
                this.field768 = arg0.method1322(false);
            }
        } else {
            this.field775 = arg0.method1322(false);
        }
        if (arg1 != 6456) {
            this.field775 = 44;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lne;I)V", line = 50)
    public static final void method390(class172 arg0, int arg1) {
        ++field776;
        class172 var2 = class213.method1497(arg0, 18758);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class369.field5615;
            var4 = class430.field6324;
        } else {
            var4 = var2.field2834;
            var3 = var2.field2705;
        }
        class35.method229(10, false, arg0, var3, var4);
        client.method1147(var3, false, arg0, var4);
        if (arg1 < 100) {
            method392(-34, 91);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)[I", line = 78)
    public final int[] method116(int arg0, byte arg1) {
        ++field767;
        int[] var3 = super.field371.method2367((byte) 84, arg0);
        if (arg1 <= 49) {
            return null;
        } else {
            if (super.field371.field5586) {
                int var4 = class132.field2064[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; class369.field5610 > var6; ++var6) {
                    int var7 = class79.field995[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (~this.field775 != -1) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field770 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field770;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (this.field768 != 0) {
                        if (this.field768 == 2) {
                            var12 -= 2048;
                            if (var12 < 0) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class232.field3877[(var12 & 4080) >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V", line = 147)
    public final void method111(byte arg0) {
        ++field764;
        class173.method1208(4096);
        if (arg0 < 90) {
            this.field768 = -12;
        }
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V", line = 158)
    public static final void method391(byte arg0) {
        if (arg0 < -74) {
            ++field769;
            if (class279.field4458.toLowerCase().indexOf("microsoft") == -1) {
                class421.field6219[93] = 43;
                class421.field6219[59] = 57;
                class421.field6219[44] = 71;
                class421.field6219[46] = 72;
                class421.field6219[45] = 26;
                class421.field6219[61] = 27;
                if (class279.field4476 == null) {
                    class421.field6219[222] = 59;
                    class421.field6219[192] = 58;
                } else {
                    class421.field6219[222] = 58;
                    class421.field6219[520] = 59;
                    class421.field6219[192] = 28;
                }
                class421.field6219[47] = 73;
                class421.field6219[91] = 42;
                class421.field6219[92] = 74;
            } else {
                class421.field6219[221] = 43;
                class421.field6219[223] = 28;
                class421.field6219[220] = 74;
                class421.field6219[222] = 59;
                class421.field6219[190] = 72;
                class421.field6219[188] = 71;
                class421.field6219[219] = 42;
                class421.field6219[187] = 27;
                class421.field6219[189] = 26;
                class421.field6219[186] = 57;
                class421.field6219[192] = 58;
                class421.field6219[191] = 73;
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Ljava/lang/String;", line = 208)
    public static final String method392(int arg0, int arg1) {
        ++field773;
        String var2 = Integer.toString(arg0);
        if (arg1 < 67) {
            field766 = -22;
        }
        for (int var3 = var2.length() - 3; ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class58.field749 + " (" + var2 + ")</col>";
        } else {
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, -4 + var2.length()) + class52.field653 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 387)
    public class60() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V", line = 242)
    public static void method393(int arg0) {
        if (arg0 < 22) {
            method392(-7, 2);
        }
        field771 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([IZI)[I", line = 261)
    public static final int[] method394(int[] arg0, boolean arg1, int arg2) {
        ++field772;
        int[] var3 = new int[1152];
        int var4 = 0;
        if (!arg1) {
            method391((byte) 56);
        }
        for (int var5 = 0; ~var5 > -33; ++var5) {
            for (int var6 = 0; var6 < 36; ++var6) {
                int var7 = arg0[var4];
                if (var7 == 0) {
                    if (var6 > 0 && ~arg0[var4 + -1] != -1) {
                        var7 = arg2;
                    } else if (var5 > 0 && arg0[var4 + -36] != 0) {
                        var7 = arg2;
                    } else if (~var6 > -36 && ~arg0[var4 - -1] != -1) {
                        var7 = arg2;
                    } else if (~var5 > -32 && arg0[var4 + 36] != 0) {
                        var7 = arg2;
                    }
                }
                var3[var4++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[II[II)V", line = 321)
    public static final void method395(int arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 < arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg4; var9 < arg0; ++var9) {
                if (arg1[var9] < (1 & var9) + var7) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method395(var6 + -1, arg1, -1, arg3, arg4);
            method395(arg0, arg1, -1, arg3, var6 + 1);
        }
        ++field765;
        if (arg2 != -1) {
            method390((class172) null, -86);
        }
    }
}
