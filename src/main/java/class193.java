import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class193 extends class102 {

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "Ldc;")
    public static class36 field3590 = new class36();

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "[I")
    public static int[] field3598 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "Lsg;")
    public static class201 field3597;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "[Lnb;")
    public static class143[] field3593;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "[Lpe;")
    private class168[] field3595;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)V")
    public static void method1293(boolean arg0) {
        field3597 = null;
        if (arg0) {
            field3598 = null;
        }
        field3590 = null;
        field3598 = null;
        field3593 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != 64) {
            return null;
        } else {
            ++field3588;
            int[][] var3 = super.field1950.method598((byte) -102, arg0);
            if (super.field1950.field1724) {
                int var4 = class155.field2796;
                int var5 = class117.field2216;
                int[][][] var6 = super.field1950.method596(11443);
                int[][] var7 = new int[var5][var4];
                this.method1294(var7, -66);
                for (int var8 = 0; class117.field2216 > var8; ++var8) {
                    int[] var9 = var7[var8];
                    int[][] var10 = var6[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; var14 < class155.field2796; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class107.method696(var15 << 4, 4080);
                        var12[var14] = class107.method696(var15, 65280) >> 4;
                        var11[var14] = class107.method696(var15, 16711680) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([[II)V")
    private final void method1294(int[][] arg0, int arg1) {
        ++field3596;
        int var3 = class117.field2216;
        int var4 = -49 % ((arg1 - -3) / 53);
        int var5 = class155.field2796;
        class195.method1309(3, arg0);
        class107.method695(0, true, class233.field4296, 0, class227.field4193);
        if (this.field3595 != null) {
            for (int var6 = 0; this.field3595.length > var6; ++var6) {
                class168 var7 = this.field3595[var6];
                int var8 = var7.field3026;
                int var9 = var7.field3027;
                if (var8 < 0) {
                    if (var9 >= 0) {
                        var7.method471(var3, var5, (byte) 106);
                    }
                } else if (~var9 <= -1) {
                    var7.method474(24730, var5, var3);
                } else {
                    var7.method473(false, var5, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field3594;
        if (!arg0) {
            this.method14(118, 88);
        }
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            this.method1294(super.field1960.method700((byte) -67), 88);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            if (~arg1 == -1) {
                this.field3595 = new class168[arg0.method1243(3)];
                for (int var4 = 0; ~this.field3595.length < ~var4; ++var4) {
                    int var5 = arg0.method1243(3);
                    if (var5 != 0) {
                        if (var5 != 1) {
                            if (var5 != 2) {
                                if (var5 == 3) {
                                    this.field3595[var4] = class124.method780(-119, arg0);
                                }
                            } else {
                                this.field3595[var4] = class89.method591(arg0, -1);
                            }
                        } else {
                            this.field3595[var4] = class207.method1384(-88, arg0);
                        }
                    } else {
                        this.field3595[var4] = class23.method157(arg0, (byte) 124);
                    }
                }
            } else if (~arg1 == -2) {
                super.field1957 = ~arg0.method1243(3) == -2;
            }
            ++field3592;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)I")
    public static final int method1295(byte arg0, int arg1) {
        ++field3591;
        int var2 = -106 / ((32 - arg0) / 43);
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBI)V")
    public static final void method1296(int arg0, byte arg1, int arg2) {
        if (arg1 <= 37) {
            method1296(-95, (byte) -82, 10);
        }
        ++field3589;
        if (class152.method976(true, arg0)) {
            class240.method1555(class199.field3710[arg0], -1, arg2);
        }
    }
}
