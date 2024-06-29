import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class81 extends class107 {

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field1303;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "Z")
    public static boolean field1304;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "[Lhb;")
    private class233[] field1305;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "[S")
    public static short[] field1306;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(III)Lua;")
    public static final class122 method581(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        return var3 != null && var3.field1765 != null ? var3.field1765 : null;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(II)I")
    public static int method582(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        ++field1303;
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (arg1 != -117) {
            this.method190(42, (byte) -3);
        }
        if (super.field1662.field3063) {
            int var4 = class24.field443;
            int var5 = class153.field2452;
            int[][][] var6 = super.field1662.method1301((byte) 114);
            int[][] var7 = new int[var5][var4];
            this.method583(1, var7);
            for (int var8 = 0; var8 < class153.field2452; ++var8) {
                int[][] var9 = var6[var8];
                int[] var10 = var9[0];
                int[] var11 = var9[1];
                int[] var12 = var7[var8];
                int[] var13 = var9[2];
                for (int var14 = 0; class24.field443 > var14; ++var14) {
                    int var15 = var12[var14];
                    var13[var14] = class233.method1609(255, var15) << 4;
                    var11[var14] = class233.method1609(var15 >> 4, 4080);
                    var10[var14] = class233.method1609(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field1660 = arg1.method1849(255) == 1;
            }
        } else {
            this.field1305 = new class233[arg1.method1849(255)];
            for (int var4 = 0; ~this.field1305.length < ~var4; ++var4) {
                int var5 = arg1.method1849(255);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field1305[var4] = class291.method2004(arg1, true);
                            }
                        } else {
                            this.field1305[var4] = class177.method1248(arg1, 0);
                        }
                    } else {
                        this.field1305[var4] = class166.method1181(method582(arg2, -38), arg1);
                    }
                } else {
                    this.field1305[var4] = class66.method440(104, arg1);
                }
            }
        }
        if (arg2 == 28) {
            ++field1310;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[[I)V")
    private final void method583(int arg0, int[][] arg1) {
        ++field1307;
        int var3 = class24.field443;
        int var4 = class153.field2452;
        if (arg0 != 1) {
            field1306 = null;
        }
        class13.method120(arg1, (byte) -79);
        class278.method1895(0, class128.field2053, (byte) -53, 0, class107.field1677);
        if (this.field1305 != null) {
            for (int var5 = 0; ~this.field1305.length < ~var5; ++var5) {
                class233 var6 = this.field1305[var5];
                int var7 = var6.field3648;
                int var8 = var6.field3641;
                if (var7 >= 0) {
                    if (~var8 <= -1) {
                        var6.method279(-126, var3, var4);
                    } else {
                        var6.method282(var4, var3, true);
                    }
                } else if (var8 >= 0) {
                    var6.method281(var4, (byte) 44, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
    public static void method584(int arg0) {
        if (arg0 != 726104388) {
            field1309 = 95;
        }
        field1306 = null;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int var3 = 87 / ((-34 - arg0) / 49);
        ++field1308;
        int[] var4 = super.field1661.method894(122, arg1);
        if (super.field1661.field2115) {
            this.method583(1, super.field1661.method893(-129));
        }
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class81() {
        super(0, true);
    }
}
