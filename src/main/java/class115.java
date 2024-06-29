import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class115 extends class118 {

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "I")
    private int field1516 = 4096;

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
    private int field1520 = 4096;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
    private int field1521 = 4096;

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
    public static int field1515 = 0;

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
    public static int field1522 = 104;

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "Z")
    public static boolean field1524;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field1518;
        int[][] var3 = super.field1549.method2013(arg1, !arg0);
        if (arg0) {
            method696(26, -84, -105);
        }
        if (super.field1549.field4903) {
            int[][] var4 = this.method708(arg1, (byte) 58, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class440.field6474; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && ~var13 == ~var14) {
                    var8[var11] = this.field1520 * var12 >> 12;
                    var9[var11] = this.field1516 * var13 >> 12;
                    var10[var11] = this.field1521 * var14 >> 12;
                } else {
                    var8[var11] = this.field1520;
                    var9[var11] = this.field1516;
                    var10[var11] = this.field1521;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(III)La;")
    public static final class233 method694(int arg0, int arg1, int arg2) {
        class13 var3 = class277.field4216[arg0][arg1][arg2];
        return var3 == null ? null : var3.field163;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        if (arg1 != 1) {
            field1515 = -91;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field1521 = arg2.method2323(-21);
                }
            } else {
                this.field1516 = arg2.method2323(-62);
            }
        } else {
            this.field1520 = arg2.method2323(-6);
        }
        ++field1517;
    }

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "(I)V")
    public static final void method695(int arg0) {
        ++field1523;
        if (class271.field4157.length() != 0) {
            if (arg0 < 105) {
                field1515 = -123;
            }
            class141.method886(-1, "--> " + class271.field4157);
            class176.method1077(false, true, class271.field4157);
            class339.field5063 = 0;
            class271.field4157 = "";
            class121.field1593 = 0;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
    public class115() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(III)V")
    public static final void method696(int arg0, int arg1, int arg2) {
        ++field1519;
        int var3 = class188.field2828.method1693(-118, class302.field4562.method937((byte) -48, class27.field356));
        for (class306 var4 = (class306) class372.field5433.method2514((byte) 61); var4 != null; var4 = (class306) class372.field5433.method2511(-120)) {
            int var8 = class451.method2780(2, var4);
            if (~var3 > ~var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class149.field2067 * 16 + 21;
        int var6 = arg1 - var3 / 2;
        if (var6 - -var3 > class221.field3368) {
            var6 = class221.field3368 - var3;
        }
        if (~var6 > -1) {
            var6 = 0;
        }
        int var7 = arg0;
        if (~class161.field2232 > ~(arg0 - -var5)) {
            var7 = -var5 + class161.field2232;
        }
        class331.field4957 = var6;
        if (~var7 > -1) {
            var7 = 0;
        }
        class258.field3957 = class149.field2067 * 16 - -(class338.field5046 ? 26 : 22);
        class306.field4628 = true;
        if (arg2 != 1) {
            field1524 = false;
        }
        class353.field5219 = var7;
        class331.field4946 = var3;
    }

    static {
        new class151("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field1524 = false;
    }
}
