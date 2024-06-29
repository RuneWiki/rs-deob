import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class112 extends class397 {

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    private int field1463 = 4;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    private int field1459 = 4;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "Lwt;")
    public static class194 field1460 = new class194("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "[I")
    public static int[] field1466 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "Lqj;")
    public static class336 field1468 = null;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "S")
    public static short field1469 = 256;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "Ltq;")
    public static class426 field1467 = new class426(1, 15);

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field1462;
        int[] var3 = super.field5854.method465(arg1, 108);
        if (arg0 != -780833076) {
            method660(-57);
        }
        if (super.field5854.field991) {
            int var4 = class164.field2152 / this.field1459;
            int var5 = class508.field7746 / this.field1463;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method2376(68, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2376(115, 0, class508.field7746 * var7 / var5);
            }
            for (int var8 = 0; class164.field2152 > var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class164.field2152 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class112() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BZ)V")
    public static final void method659(byte arg0, boolean arg1) {
        class45.field678 = 0;
        ++field1464;
        class389.field5771 = 0;
        class334.method2022(3);
        class217.method1338(arg1, (byte) -77);
        class16.method120(arg0 + -18324);
        for (int var2 = 0; ~class45.field678 < ~var2; ++var2) {
            int var4 = class253.field3658[var2];
            if (~class263.field3748 != ~class504.field7697[var4].field4243) {
                if (class504.field7697[var4].field1825.method1662(0)) {
                    class286.method1733(class504.field7697[var4], 67);
                }
                class504.field7697[var4].method876(0, (class272) null);
                class504.field7697[var4] = null;
            }
        }
        if (arg0 == -19) {
            if (class359.field5330 != class234.field3288.field2018) {
                throw new RuntimeException("gnp1 pos:" + class234.field3288.field2018 + " psize:" + class359.field5330);
            } else {
                for (int var3 = 0; ~class339.field4942 < ~var3; ++var3) {
                    if (class504.field7697[class263.field3749[var3]] == null) {
                        throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class339.field4942);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public static void method660(int arg0) {
        field1468 = null;
        field1460 = null;
        field1466 = null;
        int var1 = -31 / ((arg0 - 69) / 42);
        field1467 = null;
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)Z")
    public static final boolean method661(int arg0) {
        if (arg0 != 2) {
            field1466 = null;
        }
        ++field1457;
        return class371.field5567 != class339.field4941 || class118.field1535 >= 2;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        ++field1461;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field1463 = arg2.method941((byte) 126);
            }
        } else {
            this.field1459 = arg2.method941((byte) 123);
        }
        if (arg1 != 80) {
            this.field1463 = 95;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        ++field1458;
        int[][] var3 = super.field5848.method1692(arg1, 38);
        if (arg0 <= 81) {
            method659((byte) 7, false);
        }
        if (super.field5848.field3939) {
            int var4 = class164.field2152 / this.field1459;
            int var5 = class508.field7746 / this.field1463;
            int[][] var6;
            if (var5 <= 0) {
                var6 = this.method2377(0, -32, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2377(class508.field7746 * var7 / var5, -101, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class164.field2152 < ~var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class164.field2152 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }
}
