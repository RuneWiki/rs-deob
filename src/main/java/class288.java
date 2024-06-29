import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class288 extends class354 {

    @OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
    private int field4206 = 0;

    @OriginalMember(owner = "client!fr", name = "T", descriptor = "I")
    private int field4214 = 4096;

    @OriginalMember(owner = "client!fr", name = "Q", descriptor = "I")
    public static int field4211 = 0;

    @OriginalMember(owner = "client!fr", name = "R", descriptor = "Lla;")
    public static class319 field4212 = new class319(100, 12);

    @OriginalMember(owner = "client!fr", name = "M", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!fr", name = "O", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!fr", name = "S", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!fr", name = "U", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!fr", name = "P", descriptor = "Luu;")
    public static class191 field4210;

    @OriginalMember(owner = "client!fr", name = "N", descriptor = "Ldi;")
    public static class83 field4208;

    @OriginalMember(owner = "client!fr", name = "K", descriptor = "Ljava/lang/Object;")
    public static Object field4205;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)V")
    public static void method1846(byte arg0) {
        field4205 = null;
        field4210 = null;
        if (arg0 >= 17) {
            field4208 = null;
            field4212 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)[[I")
    public final int[][] method354(int arg0, byte arg1) {
        ++field4213;
        int[][] var3 = super.field5474.method2414((byte) -77, arg0);
        int var4 = 50 % ((arg1 - 48) / 60);
        if (super.field5474.field5870) {
            int[][] var5 = this.method2274((byte) 84, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; class531.field7814 > var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (~var13 <= ~this.field4206) {
                    if (var13 > this.field4214) {
                        var9[var12] = this.field4214;
                    } else {
                        var9[var12] = var13;
                    }
                } else {
                    var9[var12] = this.field4206;
                }
                if (~var14 <= ~this.field4206) {
                    if (~this.field4214 > ~var14) {
                        var10[var12] = this.field4214;
                    } else {
                        var10[var12] = var14;
                    }
                } else {
                    var10[var12] = this.field4206;
                }
                if (~this.field4206 < ~var15) {
                    var11[var12] = this.field4206;
                } else if (this.field4214 >= var15) {
                    var11[var12] = var15;
                } else {
                    var11[var12] = this.field4214;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(BI)[I")
    public final int[] method270(byte arg0, int arg1) {
        ++field4209;
        if (arg0 >= -74) {
            field4215 = 85;
        }
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int[] var4 = this.method2275((byte) 76, 0, arg1);
            for (int var5 = 0; ~var5 > ~class531.field7814; ++var5) {
                int var6 = var4[var5];
                if (var6 < this.field4206) {
                    var3[var5] = this.field4206;
                } else if (this.field4214 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field4214;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lnj;II)V")
    public final void method272(class164 arg0, int arg1, int arg2) {
        if (arg2 != 1638) {
            field4208 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field5466 = ~arg0.method1087(false) == -2;
                }
            } else {
                this.field4214 = arg0.method1074(arg2 ^ -635988730);
            }
        } else {
            this.field4206 = arg0.method1074(-635989152);
        }
        ++field4207;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    public class288() {
        super(1, false);
    }
}
