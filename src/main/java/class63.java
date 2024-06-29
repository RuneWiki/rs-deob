import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class63 extends class115 {

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    private int field1008 = 4096;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    private int field1010 = 0;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "[[[B")
    public static byte[][][] field1014;

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class63() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        ++field1011;
        if (arg0 > -33) {
            return null;
        } else {
            int[][] var3 = super.field1716.method6(arg1, (byte) -125);
            if (super.field1716.field23) {
                int[][] var4 = this.method798(0, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class77.field1178; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (this.field1010 <= var12) {
                        if (this.field1008 >= var12) {
                            var8[var11] = var12;
                        } else {
                            var8[var11] = this.field1008;
                        }
                    } else {
                        var8[var11] = this.field1010;
                    }
                    if (~this.field1010 < ~var13) {
                        var9[var11] = this.field1010;
                    } else if (~var13 < ~this.field1008) {
                        var9[var11] = this.field1008;
                    } else {
                        var9[var11] = var13;
                    }
                    if (this.field1010 <= var14) {
                        if (this.field1008 < var14) {
                            var10[var11] = this.field1008;
                        } else {
                            var10[var11] = var14;
                        }
                    } else {
                        var10[var11] = this.field1010;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(B)V")
    public static void method441(byte arg0) {
        field1014 = null;
        if (arg0 <= 41) {
            method442(false, 67, -91, false, true, 97, 44);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIIZZII)V")
    public static final void method442(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        ++field1007;
        if (arg2 < arg5) {
            int var7 = (arg2 + arg5) / 2;
            int var8 = arg2;
            class55 var9 = class263.field3960[var7];
            class263.field3960[var7] = class263.field3960[arg5];
            class263.field3960[arg5] = var9;
            for (int var10 = arg2; ~arg5 < ~var10; ++var10) {
                if (~class175.method1145(arg6, (byte) -127, var9, arg3, arg4, arg1, class263.field3960[var10]) >= -1) {
                    class55 var11 = class263.field3960[var10];
                    class263.field3960[var10] = class263.field3960[var8];
                    class263.field3960[var8++] = var11;
                }
            }
            class263.field3960[arg5] = class263.field3960[var8];
            class263.field3960[var8] = var9;
            method442(true, arg1, arg2, arg3, arg4, var8 + -1, arg6);
            method442(true, arg1, var8 + 1, arg3, arg4, arg5, arg6);
        }
        if (!arg0) {
            field1014 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field1006;
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int[] var4 = this.method797(0, arg1, -98);
            for (int var5 = 0; var5 < class77.field1178; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field1010) {
                    var3[var5] = this.field1010;
                } else if (this.field1008 < var6) {
                    var3[var5] = this.field1008;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return arg0 != 242152972 ? null : var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        ++field1013;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field1713 = ~arg1.method760(false) == -2;
                }
            } else {
                this.field1008 = arg1.method756(arg0 + -29900);
            }
        } else {
            this.field1010 = arg1.method756(-29901);
        }
        if (arg0 != -1) {
            method442(true, -52, 33, false, true, 50, 76);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)Lij;")
    public static final class69 method443(boolean arg0) {
        ++field1012;
        byte[] var1 = class263.field3965[0];
        int var2 = class282.field4500[0] * class246.field3682[0];
        int[] var3 = new int[var2];
        if (arg0) {
            field1014 = null;
        }
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            var3[var4] = class128.field1883[class184.method1188(255, var1[var4])];
        }
        class244 var5 = new class244(class68.field1056, class141.field2041, class91.field1386[0], class211.field3035[0], class246.field3682[0], class282.field4500[0], var3);
        class290.method1935(0);
        return var5;
    }
}
