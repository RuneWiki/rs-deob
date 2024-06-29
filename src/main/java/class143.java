import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class143 extends class182 {

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "Z")
    private boolean field2352 = true;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "Z")
    private boolean field2353 = true;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "[Z")
    public static boolean[] field2351 = new boolean[100];

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "Ljava/lang/String;")
    public static String field2356 = "Ok";

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "Lhg;")
    public static class207 field2358;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class143() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
    public static final int method1058(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Laj;I)V")
    public static final void method1059(class151 arg0, int arg1) {
        ++field2349;
        if (arg1 != 2) {
            field2356 = null;
        }
        class37.field586 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field2357;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field2896 = ~arg1.method1802((byte) -86) == -2;
                }
            } else {
                this.field2353 = arg1.method1802((byte) -128) == 1;
            }
        } else {
            this.field2352 = ~arg1.method1802((byte) 97) == -2;
        }
        if (arg0) {
            method1059((class151) null, -34);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field2350;
        if (arg0) {
            return null;
        } else {
            int[] var3 = super.field2911.method77(arg1, -65);
            if (super.field2911.field287) {
                int[] var4 = this.method1323(0, -17707, this.field2353 ? -arg1 + class107.field1749 : arg1);
                if (this.field2352) {
                    for (int var5 = 0; ~class4.field116 < ~var5; ++var5) {
                        var3[var5] = var4[-var5 + class103.field1644];
                    }
                } else {
                    class75.method532(var4, 0, var3, 0, class4.field116);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V")
    public static void method1060(byte arg0) {
        if (arg0 <= 92) {
            field2351 = null;
        }
        field2351 = null;
        field2358 = null;
        field2356 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        ++field2355;
        int var3 = 121 % ((-64 - arg0) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 121);
        if (super.field2905.field158) {
            int[][] var5 = this.method1327(0, 0, !this.field2353 ? arg1 : -arg1 + class107.field1749);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (!this.field2352) {
                for (int var12 = 0; ~class4.field116 < ~var12; ++var12) {
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                }
            } else {
                for (int var13 = 0; var13 < class4.field116; ++var13) {
                    var9[var13] = var6[-var13 + class103.field1644];
                    var10[var13] = var7[-var13 + class103.field1644];
                    var11[var13] = var8[class103.field1644 - var13];
                }
            }
        }
        return var4;
    }
}
