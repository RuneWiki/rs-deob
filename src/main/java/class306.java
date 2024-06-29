import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class306 extends class14 {

    @OriginalMember(owner = "client!bn", name = "R", descriptor = "I")
    private int field4033 = -1;

    @OriginalMember(owner = "client!bn", name = "V", descriptor = "Lvj;")
    public static class304 field4037 = new class304("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!bn", name = "W", descriptor = "Lub;")
    public static class18 field4038 = new class18(32);

    @OriginalMember(owner = "client!bn", name = "Y", descriptor = "[I")
    public static int[] field4040 = new int[4096];

    @OriginalMember(owner = "client!bn", name = "J", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!bn", name = "N", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!bn", name = "O", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!bn", name = "P", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!bn", name = "Q", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!bn", name = "S", descriptor = "I")
    public int field4034;

    @OriginalMember(owner = "client!bn", name = "T", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!bn", name = "X", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!bn", name = "U", descriptor = "[I")
    public int[] field4036;

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V", line = 8)
    public class306() {
        super(0, false);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)[[I", line = 11)
    public int[][] method141(int arg0, int arg1) {
        ++field4029;
        if (arg0 != -30909) {
            this.method136(-114);
        }
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091 && this.method1778((byte) -1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class494.field6866 != this.field4028 ? this.field4028 * arg1 / class494.field6866 : arg1) * this.field4034;
            if (class115.field1637 != this.field4034) {
                for (int var8 = 0; var8 < class115.field1637; ++var8) {
                    int var9 = this.field4034 * var8 / class115.field1637;
                    int var10 = this.field4036[var7 + var9];
                    var6[var8] = class494.method2839(var10, 255) << 4;
                    var5[var8] = class494.method2839(var10, 65280) >> 4;
                    var4[var8] = class494.method2839(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; ~class115.field1637 < ~var11; ++var11) {
                    int var12 = this.field4036[var7++];
                    var6[var11] = class494.method2839(255, var12) << 4;
                    var5[var11] = class494.method2839(4080, var12 >> 4);
                    var4[var11] = class494.method2839(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(Z)V", line = 85)
    public static final void method1776(boolean arg0) {
        class344.method2003(9, 2, class154.field2244.field7765, 22050);
        ++field4031;
        class26.field449 = new class340();
        class26.field449.method1955(9, -122, 128);
        class487.field6768 = class99.method705(0, class389.field5281, arg0, class518.field7663, 22050);
        class487.field6768.method2469(false, class26.field449);
        class212.method1342(class496.field6878, 8741, class26.field449, class50.field774, class204.field2826);
        class322.field4216 = class99.method705(1, class389.field5281, true, class518.field7663, 2048);
        class318.field4175 = new class521();
        class322.field4216.method2469(false, class318.field4175);
        class516.field7649 = new class309(22050, class296.field3877);
        class400.field5371 = class449.field6118.method2704("scape main", true);
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILpc;I)Lkl;", line = 103)
    public static final class54 method1777(int arg0, int arg1, class473 arg2, int arg3) {
        if (arg3 >= -48) {
            field4037 = null;
        }
        ++field4039;
        class379 var4 = new class379(arg2.method2708(arg0, arg1, (byte) 54));
        class54 var5 = new class54(arg1, var4.method2218(45), var4.method2218(-39), var4.method2232((byte) 127), var4.method2232((byte) 125), var4.method2238(255) == 1, var4.method2238(255), var4.method2238(255));
        int var6 = var4.method2238(255);
        for (int var7 = 0; var7 < var6; ++var7) {
            var5.field847.method1666((byte) -125, new class148(var4.method2238(255), var4.method2212((byte) 83), var4.method2212((byte) 83), var4.method2212((byte) 83), var4.method2212((byte) 83), var4.method2212((byte) 83), var4.method2212((byte) 83), var4.method2212((byte) 83), var4.method2212((byte) 83)));
        }
        var5.method399((byte) -78);
        return var5;
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "(B)Z", line = 131)
    public final boolean method1778(byte arg0) {
        ++field4035;
        if (this.field4036 != null) {
            return true;
        } else if (~this.field4033 <= -1) {
            class134 var2 = ~class148.field2100 > -1 ? class134.method943(class101.field1499, this.field4033) : class134.method939(class101.field1499, class148.field2100, this.field4033);
            var2.method940();
            this.field4036 = var2.method946();
            this.field4034 = var2.field1926;
            this.field4028 = var2.field1925;
            return true;
        } else {
            return arg0 != -1 ? false : false;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBLmd;)V", line = 156)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (arg0 == 0) {
            this.field4033 = arg2.method2212((byte) 83);
        }
        int var4 = 106 / ((-51 - arg1) / 37);
        ++field4026;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)V", line = 168)
    public final void method146(byte arg0) {
        if (arg0 >= -36) {
            this.method136(110);
        }
        ++field4027;
        super.method146((byte) -121);
        this.field4036 = null;
    }

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "(I)V", line = 184)
    public static void method1779(int arg0) {
        field4038 = null;
        field4040 = null;
        field4037 = null;
        if (arg0 != 0) {
            method1776(false);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I", line = 197)
    public final int method136(int arg0) {
        int var2 = 91 % ((arg0 - -23) / 58);
        ++field4032;
        return this.field4033;
    }
}
