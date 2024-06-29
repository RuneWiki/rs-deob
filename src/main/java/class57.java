import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class57 extends class371 {

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    private int field697 = 32768;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "Llt;")
    public static class255 field702;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "Ldda;")
    public static class597 field700;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public final void method212(int arg0) {
        class568.method3315(false);
        ++field695;
        if (arg0 != -19103) {
            method364(-84, 61, (byte) 25, 2, -83);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIBII)V")
    public static final void method364(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field693;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        class69.method418(arg3, class47.field558[arg0], arg1 + arg4, (byte) 117, arg1 - arg4);
        int var8 = -1;
        while (~var5 > ~var6) {
            var8 += 2;
            ++var5;
            var7 += var8;
            if (var7 >= 0) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class47.field558[arg0 + var6];
                int[] var10 = class47.field558[-var6 + arg0];
                int var11 = arg1 + var5;
                int var12 = -var5 + arg1;
                class69.method418(arg3, var9, var11, (byte) 117, var12);
                class69.method418(arg3, var10, var11, (byte) 117, var12);
            }
            int var13 = arg1 - -var6;
            int var14 = arg1 - var6;
            int[] var15 = class47.field558[arg0 + var5];
            int[] var16 = class47.field558[-var5 + arg0];
            class69.method418(arg3, var15, var13, (byte) 117, var14);
            class69.method418(arg3, var16, var13, (byte) 117, var14);
        }
        if (arg2 != -67) {
            method364(-31, 56, (byte) -106, -124, -32);
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class57() {
        super(3, false);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
    public static void method365(byte arg0) {
        field700 = null;
        field702 = null;
        int var1 = 74 / ((arg0 - 24) / 58);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field696;
        int var4 = 15 % ((arg1 - -15) / 39);
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field5360 = arg2.method2561((byte) -56) == 1;
            }
        } else {
            this.field697 = arg2.method2620(88) << 4;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field694;
        if (arg0 >= -80) {
            return null;
        } else {
            int[] var3 = super.field5378.method1451(-4, arg1);
            if (super.field5378.field3254) {
                int[] var4 = this.method2260((byte) -81, arg1, 1);
                int[] var5 = this.method2260((byte) -79, arg1, 2);
                for (int var6 = 0; ~class41.field455 < ~var6; ++var6) {
                    int var7 = (4083 & var4[var6]) >> 4;
                    int var8 = var5[var6] * this.field697 >> 12;
                    int var9 = class289.field4252[var7] * var8 >> 12;
                    int var10 = class212.field3118[var7] * var8 >> 12;
                    int var11 = class343.field5013 & (var9 >> 12) + var6;
                    int var12 = class135.field1789 & arg1 - -(var10 >> 12);
                    int[] var13 = this.method2260((byte) -121, var12, 0);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        if (arg0 != 36) {
            this.field697 = 7;
        }
        ++field698;
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (super.field5364.field7632) {
            int[] var4 = this.method2260((byte) -32, arg1, 1);
            int[] var5 = this.method2260((byte) -96, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class41.field455; ++var9) {
                int var10 = var4[var9] * 255 >> 12 & 255;
                int var11 = var5[var9] * this.field697 >> 12;
                int var12 = class289.field4252[var10] * var11 >> 12;
                int var13 = class212.field3118[var10] * var11 >> 12;
                int var14 = class343.field5013 & (var12 >> 12) + var9;
                int var15 = (var13 >> 12) + arg1 & class135.field1789;
                int[][] var16 = this.method2263((byte) -107, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    static {
        new class487("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field699 = 0;
    }
}
