import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class222 extends class346 {

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field3067 = -1;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "[Lff;")
    private class437[] field3066;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field3064;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[[I)V")
    private final void method1451(int arg0, int[][] arg1) {
        ++field3063;
        int var3 = class134.field1753;
        int var4 = class370.field5474;
        class3.method15(arg1, -120);
        class17.method130(0, class188.field2572, class215.field3000, 0, -25111);
        if (arg0 == 1) {
            if (this.field3066 != null) {
                for (int var5 = 0; var5 < this.field3066.length; ++var5) {
                    class437 var6 = this.field3066[var5];
                    int var7 = var6.field6353;
                    int var8 = var6.field6349;
                    if (var7 < 0) {
                        if (var8 >= 0) {
                            var6.method290(var4, 8224, var3);
                        }
                    } else if (var8 < 0) {
                        var6.method294(352, var4, var3);
                    } else {
                        var6.method295(var3, var4, -11654);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        ++field3068;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (super.field5170.field6288) {
            int var4 = class134.field1753;
            int var5 = class370.field5474;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field5170.method2704(56);
            this.method1451(1, var6);
            for (int var8 = 0; class370.field5474 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class134.field1753 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class394.method2529(var15, 255) << 4;
                    var12[var14] = class394.method2529(65280, var15) >> 4;
                    var11[var14] = class394.method2529(var15, 16711680) >> 12;
                }
            }
        }
        if (arg1 >= -3) {
            this.method45(-71, -68);
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field3066 = new class437[arg0.method2233((byte) 104)];
            for (int var4 = 0; ~this.field3066.length < ~var4; ++var4) {
                int var5 = arg0.method2233((byte) 104);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field3066[var4] = class171.method1146(arg0, false);
                            }
                        } else {
                            this.field3066[var4] = class165.method1111(arg0, -1);
                        }
                    } else {
                        this.field3066[var4] = class421.method2651(0, arg0);
                    }
                } else {
                    this.field3066[var4] = class198.method1309(arg0, (byte) 56);
                }
            }
        } else if (arg2 == 1) {
            super.field5151 = arg0.method2233((byte) 104) == 1;
        }
        ++field3061;
        if (arg1) {
            method1452(-36, (String) null);
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    public class222() {
        super(0, true);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1452(int arg0, String arg1) {
        int var2 = -3 % ((arg0 - 14) / 35);
        ++field3062;
        String var3 = class237.method1534(-663656095, class337.method2194(arg1, 1));
        if (var3 == null) {
            var3 = "";
        }
        return var3;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public static void method1453(byte arg0) {
        field3064 = null;
        int var1 = -65 % ((arg0 - -4) / 61);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field3065;
        if (arg1 != 3) {
            field3064 = null;
        }
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            this.method1451(1, super.field5152.method1414((byte) -114));
        }
        return var3;
    }
}
