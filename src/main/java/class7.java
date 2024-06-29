import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class326 {

    @OriginalMember(owner = "client!il", name = "P", descriptor = "Lmc;")
    public static class78 field84 = new class78(17, 8);

    @OriginalMember(owner = "client!il", name = "W", descriptor = "Lgd;")
    public static class206 field91 = new class206("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!il", name = "X", descriptor = "[I")
    public static int[] field92 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!il", name = "Y", descriptor = "[I")
    public static int[] field93 = new int[500];

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!il", name = "U", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!il", name = "Z", descriptor = "Lrn;")
    public static class161 field94;

    @OriginalMember(owner = "client!il", name = "V", descriptor = "[I")
    public static int[] field90;

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 4)
    public class7() {
        super(3, false);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILbt;I)V", line = 10)
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field89;
        if (arg2 <= -3) {
            if (~arg0 == -1) {
                super.field4358 = ~arg1.method201((byte) -106) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IIB)V", line = 24)
    public static final void method44(int arg0, int arg1, byte arg2) {
        int var3 = 3 / ((43 - arg2) / 60);
        ++field85;
        class106 var4 = class250.method1400(6, 122, arg0);
        var4.method658(0);
        var4.field1589 = arg1;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(Z)V", line = 38)
    public static void method45(boolean arg0) {
        field84 = null;
        if (!arg0) {
            field90 = null;
            field94 = null;
            field91 = null;
            field93 = null;
            field92 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 53)
    public static final String method46(boolean arg0, int arg1) {
        ++field88;
        if (arg0) {
            method46(false, -125);
        }
        return (255 & arg1 >> 24) + "." + ((16724088 & arg1) >> 16) + "." + ((arg1 & 65295) >> 8) + "." + (arg1 & 255);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)[Lkk;", line = 64)
    public static final class114[] method47(byte arg0) {
        ++field87;
        if (arg0 != -123) {
            field90 = null;
        }
        return new class114[] { class278.field3682, class84.field1101, class231.field3073, client.field2455, class374.field5160, class300.field4010 };
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)[I", line = 81)
    public final int[] method30(byte arg0, int arg1) {
        ++field83;
        if (arg0 >= -6) {
            method46(false, -19);
        }
        int[] var3 = super.field4344.method130(arg1, 21);
        if (super.field4344.field286) {
            int[] var4 = this.method1824(0, false, arg1);
            int[] var5 = this.method1824(1, false, arg1);
            int[] var6 = this.method1824(2, false, arg1);
            for (int var7 = 0; var7 < class181.field2495; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (~var8 != -1) {
                        var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IB)[[I", line = 135)
    public final int[][] method48(int arg0, byte arg1) {
        ++field82;
        int[][] var3 = super.field4343.method2356(arg0, 120);
        if (arg1 > -52) {
            field91 = null;
        }
        if (super.field4343.field5336) {
            int[] var4 = this.method1824(2, false, arg0);
            int[][] var5 = this.method1828(0, true, arg0);
            int[][] var6 = this.method1828(1, true, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class181.field2495; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                }
            }
        }
        return var3;
    }
}
