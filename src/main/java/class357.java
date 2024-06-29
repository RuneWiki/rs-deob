import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class357 extends class214 {

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    private int field4984 = 4;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    private int field4980 = 4;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4981 = null;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "Lfn;")
    public static class52 field4986 = new class52(65, 17);

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "Lfc;")
    public static class343 field4988;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field4984 = arg0.method2503(true);
            }
        } else {
            this.field4980 = arg0.method2503(true);
        }
        if (arg1 >= -114) {
            field4988 = null;
        }
        ++field4983;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class357() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method11(int arg0, byte arg1) {
        ++field4985;
        if (arg1 != 92) {
            field4986 = null;
        }
        int[][] var3 = super.field3030.method2780(false, arg0);
        if (super.field3030.field6644) {
            int var4 = class399.field5585 / this.field4980;
            int var5 = class490.field6924 / this.field4984;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1354(0, class490.field6924 * var6 / var5, (byte) 23);
            } else {
                var7 = this.method1354(0, 0, (byte) 23);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class399.field5585; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class399.field5585 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
    public static final int method2143(int arg0, int arg1) {
        return class132.field1860 != null ? class132.field1860[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field4987;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (arg0 != 123) {
            method2143(90, -71);
        }
        if (super.field3024.field6135) {
            int var4 = class399.field5585 / this.field4980;
            int var5 = class490.field6924 / this.field4984;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1352(class490.field6924 * var6 / var5, 0, arg0 + -197);
            } else {
                var7 = this.method1352(0, 0, arg0 ^ -103);
            }
            for (int var8 = 0; ~class399.field5585 < ~var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class399.field5585 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V")
    public static void method2144(int arg0) {
        field4988 = null;
        if (arg0 >= -60) {
            field4981 = null;
        }
        field4981 = null;
        field4986 = null;
    }

    static {
        new class112("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }
}
