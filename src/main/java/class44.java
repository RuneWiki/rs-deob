import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class44 extends class37 {

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    private int field963 = 32768;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "[[[I")
    public static int[][][] field954 = new int[4][13][13];

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "[I")
    public static int[] field957 = new int[200];

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "B")
    public static byte field965 = 0;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "Lld;")
    public static class111 field960 = new class111(64);

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "Lo;")
    public static class134 field964;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field961;
        if (arg0 != 75) {
            field964 = null;
        }
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            int[] var4 = this.method369(1, arg1, (byte) 124);
            int[] var5 = this.method369(2, arg1, (byte) 122);
            for (int var6 = 0; ~class72.field1719 < ~var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field963 >> 12;
                int var9 = class3.field43[var7] * var8 >> 12;
                int var10 = class51.field1155[var7] * var8 >> 12;
                int var11 = class71.field1691 & (var9 >> 12) + var6;
                int var12 = class105.field2348 & (var10 >> 12) + arg1;
                int[] var13 = this.method369(0, var12, (byte) 127);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public final void method11(boolean arg0) {
        if (arg0) {
            method405((byte) -60);
        }
        ++field955;
        class75.method591(4096);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIILce;III)V")
    public static final void method404(int arg0, int arg1, int arg2, int arg3, class26 arg4, int arg5, int arg6, int arg7) {
        ++field959;
        if (~arg3 <= -1 && ~arg3 > -105 && ~arg0 <= -1 && ~arg0 > -105) {
            class40.field894[arg5][arg3][arg0] = 0;
            while (true) {
                int var8 = arg4.method221(-106);
                if (~var8 == -1) {
                    if (~arg5 == -1) {
                        class206.field4109[0][arg3][arg0] = -class179.method1190(arg0 + arg2 + 556238, -20279, 932731 - -arg7 + arg3) * 8;
                    } else {
                        class206.field4109[arg5][arg3][arg0] = class206.field4109[arg5 - 1][arg3][arg0] + -240;
                    }
                    break;
                }
                if (~var8 == -2) {
                    int var9 = arg4.method221(-115);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg5 == 0) {
                        class206.field4109[0][arg3][arg0] = -var9 * 8;
                    } else {
                        class206.field4109[arg5][arg3][arg0] = class206.field4109[arg5 + -1][arg3][arg0] + -(var9 * 8);
                    }
                    break;
                }
                if (~var8 >= -50) {
                    class145.field3054[arg5][arg3][arg0] = arg4.method225((byte) -115);
                    class191.field3836[arg5][arg3][arg0] = (byte) ((var8 + -2) / 4);
                    class23.field458[arg5][arg3][arg0] = (byte) class208.method1372(var8 - 2 + arg1, 3);
                } else if (~var8 >= -82) {
                    class40.field894[arg5][arg3][arg0] = (byte) (var8 + -49);
                } else {
                    class69.field1672[arg5][arg3][arg0] = (byte) (var8 + -81);
                }
            }
        } else {
            while (true) {
                int var10 = arg4.method221(-90);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg4.method221(-112);
                    break;
                }
                if (var10 <= 49) {
                    arg4.method221(-118);
                }
            }
        }
        if (arg6 < 36) {
            field965 = -39;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILce;)V")
    public final void method1(int arg0, int arg1, class26 arg2) {
        ++field962;
        if (arg1 == 1) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    super.field825 = arg2.method221(-80) == 1;
                }
            } else {
                this.field963 = arg2.method256((byte) -78) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class44() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
    public static void method405(byte arg0) {
        field957 = null;
        field954 = null;
        field964 = null;
        field960 = null;
        if (arg0 < 119) {
            method404(15, -84, -2, 76, (class26) null, 81, 60, 107);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 < 5) {
            method405((byte) 45);
        }
        ++field958;
        int[][] var3 = super.field832.method653(-30711, arg0);
        if (super.field832.field1978) {
            int[] var4 = this.method369(1, arg0, (byte) 126);
            int[] var5 = this.method369(2, arg0, (byte) 125);
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class72.field1719; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field963 >> 12;
                int var12 = class3.field43[var10] * var11 >> 12;
                int var13 = class51.field1155[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class71.field1691;
                int var15 = class105.field2348 & (var13 >> 12) + arg0;
                int[][] var16 = this.method370(var15, 0, 3);
                var7[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var6[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
