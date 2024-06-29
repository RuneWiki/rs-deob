import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class119 extends class8 {

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    private int field1950 = 4096;

    @OriginalMember(owner = "client!u", name = "I", descriptor = "[I")
    private int[] field1945 = new int[3];

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    private int field1947 = 4096;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    private int field1952 = 409;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    private int field1953 = 4096;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1954 = "skill: ";

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "[[[B")
    public static byte[][][] field1948;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)[[I")
    public final int[][] method65(int arg0, byte arg1) {
        int var3 = -113 / ((arg1 - -48) / 46);
        ++field1951;
        int[][] var4 = super.field93.method248(arg0, 17416);
        if (super.field93.field470) {
            int[][] var5 = this.method60(arg0, 0, 98);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var4[0];
            int[] var9 = var5[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class231.field3798; ++var12) {
                int var13 = var7[var12];
                int var14 = -this.field1945[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (~var14 < ~this.field1952) {
                    var8[var12] = var13;
                    var10[var12] = var6[var12];
                    var11[var12] = var9[var12];
                } else {
                    int var15 = var6[var12];
                    int var16 = -this.field1945[1] + var15;
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (~this.field1952 > ~var16) {
                        var8[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var9[var12];
                    } else {
                        int var17 = var9[var12];
                        int var18 = -this.field1945[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (~var18 < ~this.field1952) {
                            var8[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var8[var12] = this.field1947 * var13 >> 12;
                            var10[var12] = this.field1953 * var15 >> 12;
                            var11[var12] = this.field1950 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        ++field1949;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg1.method1531(65280);
                            this.field1945[2] = class202.method1393(var5, 255) >> 12;
                            this.field1945[0] = class202.method1393(var5 << 4, 267386880);
                            this.field1945[1] = class202.method1393(var5, 65280) >> 4;
                        }
                    } else {
                        this.field1947 = arg1.method1521((byte) 113);
                    }
                } else {
                    this.field1953 = arg1.method1521((byte) 113);
                }
            } else {
                this.field1950 = arg1.method1521((byte) 113);
            }
        } else {
            this.field1952 = arg1.method1521((byte) 113);
        }
        if (arg0 < 62) {
            this.method65(-89, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
    public static void method870(int arg0) {
        field1948 = null;
        if (arg0 < 54) {
            method870(-35);
        }
        field1954 = null;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class119() {
        super(1, false);
    }
}
