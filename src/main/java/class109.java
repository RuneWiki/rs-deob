import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class109 extends class5 {

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!cq", name = "K", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!cq", name = "N", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!cq", name = "O", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!cq", name = "L", descriptor = "[Lpb;")
    private class404[] field1434;

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
    public class109() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field120 = arg1.method3501(-9268) == 1;
            }
        } else {
            this.field1434 = new class404[arg1.method3501(-9268)];
            for (int var4 = 0; ~this.field1434.length < ~var4; ++var4) {
                int var5 = arg1.method3501(arg0 + -9269);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field1434[var4] = class174.method1098(arg1, false);
                            }
                        } else {
                            this.field1434[var4] = class356.method1955((byte) 1, arg1);
                        }
                    } else {
                        this.field1434[var4] = class455.method2435((byte) -58, arg1);
                    }
                } else {
                    this.field1434[var4] = class319.method1833(arg1, 60);
                }
            }
        }
        if (arg0 == 1) {
            ++field1435;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        ++field1433;
        int[][] var3 = super.field135.method2706(arg0, -68);
        if (!arg1) {
            this.method47(48, (class630) null, -105);
        }
        if (super.field135.field6667) {
            int var4 = class657.field9287;
            int var5 = class622.field8706;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field135.method2707(0);
            this.method612((byte) -112, var6);
            for (int var8 = 0; ~class622.field8706 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class657.field9287; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class695.method3921(var15 << 4, 4080);
                    var12[var14] = class695.method3921(65280, var15) >> 4;
                    var11[var14] = class695.method3921(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        int var3 = -60 % ((arg0 - 81) / 36);
        ++field1432;
        int[] var4 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            this.method612((byte) 5, super.field126.method3282(false));
        }
        return var4;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method611(String arg0, byte arg1) {
        ++field1437;
        return arg1 != 2 ? 39 : 1 + arg0.length();
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B[[I)V")
    private final void method612(byte arg0, int[][] arg1) {
        ++field1431;
        int var3 = class657.field9287;
        int var4 = class622.field8706;
        class205.method1238(arg1, 100);
        int var5 = -36 % ((arg0 - -45) / 49);
        class133.method767(class194.field2440, 0, 0, class669.field9431, 0);
        if (this.field1434 != null) {
            for (int var6 = 0; var6 < this.field1434.length; ++var6) {
                class404 var7 = this.field1434[var6];
                int var8 = var7.field5067;
                int var9 = var7.field5064;
                if (var8 >= 0) {
                    if (var9 < 0) {
                        var7.method1910(var3, -21716, var4);
                    } else {
                        var7.method1911(var3, (byte) -34, var4);
                    }
                } else if (var9 >= 0) {
                    var7.method1912(var4, var3, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method613(int arg0, boolean arg1, int arg2) {
        ++field1438;
        int var3 = arg2 - arg0;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (~var3 > 5) {
            return "<col=ff3000>";
        } else if (~var3 > 2) {
            return "<col=ff7000>";
        } else if (~var3 > -1) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (~var3 < -7) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else {
            if (!arg1) {
                method611((String) null, (byte) -118);
            }
            return ~var3 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIB)Lwd;")
    public static final class356 method614(int arg0, int arg1, byte arg2) {
        if (arg2 >= -64) {
            return null;
        } else {
            ++field1436;
            class356 var3 = new class356();
            var3.field4556 = arg1 + 1 + 5;
            var3.field4547 = -1;
            var3.field4555 = -1;
            var3.field4542 = arg0 + 1 + 5;
            var3.field4537 = new int[var3.field4556][var3.field4542];
            var3.method1954(2097152);
            return var3;
        }
    }
}
