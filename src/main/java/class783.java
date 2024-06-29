import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public class class783 implements class167 {

    @OriginalMember(owner = "client!fja", name = "f", descriptor = "Lvn;")
    public class332 field10799;

    @OriginalMember(owner = "client!fja", name = "i", descriptor = "Lbt;")
    private class48 field10802;

    @OriginalMember(owner = "client!fja", name = "o", descriptor = "Z")
    public static boolean field10808 = true;

    @OriginalMember(owner = "client!fja", name = "l", descriptor = "I")
    public static int field10805 = 0;

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "Llja;")
    public static class744 field10795 = new class744(79, 6);

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "I")
    public static int field10794;

    @OriginalMember(owner = "client!fja", name = "c", descriptor = "I")
    public static int field10796;

    @OriginalMember(owner = "client!fja", name = "d", descriptor = "I")
    public static int field10797;

    @OriginalMember(owner = "client!fja", name = "g", descriptor = "I")
    public static int field10800;

    @OriginalMember(owner = "client!fja", name = "h", descriptor = "I")
    public static int field10801;

    @OriginalMember(owner = "client!fja", name = "j", descriptor = "I")
    public static int field10803;

    @OriginalMember(owner = "client!fja", name = "k", descriptor = "I")
    public static int field10804;

    @OriginalMember(owner = "client!fja", name = "m", descriptor = "I")
    public static int field10806;

    @OriginalMember(owner = "client!fja", name = "n", descriptor = "I")
    public static int field10807;

    @OriginalMember(owner = "client!fja", name = "p", descriptor = "I")
    public static int field10809;

    @OriginalMember(owner = "client!fja", name = "q", descriptor = "I")
    public static int field10810;

    @OriginalMember(owner = "client!fja", name = "s", descriptor = "I")
    public static int field10812;

    @OriginalMember(owner = "client!fja", name = "e", descriptor = "Ltf;")
    public class312 field10798;

    @OriginalMember(owner = "client!fja", name = "r", descriptor = "Ltp;")
    public static class560 field10811;

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(IIIZ)V")
    public static final void method4334(int arg0, int arg1, int arg2, boolean arg3) {
        field10794++;
        if (class328.field4056 == arg1 && class769.field10561 == arg2 && class60.field800 == arg0) {
            return;
        }
        class328.field4056 = arg1;
        class257.field3034 = arg3;
        class769.field10561 = arg2;
        class60.field800 = arg0;
        double var4 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class408.field5353 = var8 * var12;
        class613.field8245 = 0.0D;
        class571.field7828 = -var8 * var14;
        class171.field2047 = var14;
        class588.field8008 = var8;
        class6.field72 = var10;
        class459.field6469 = -var10 * var12;
        class690.field9393 = var10 * var14;
        class17.field323 = var12;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lbn;B)V")
    public static final void method4335(class468 arg0, byte arg1) {
        field10810++;
        arg0.method2800(8);
        int var2 = class782.field10790;
        class521 var3 = class300.field3596 = class61.field825[var2] = new class521();
        var3.field3393 = var2;
        int var4 = arg0.method2802(30, -20468);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field3453[0] = var6 - class632.field8626;
        var3.field823 = (var3.field3453[0] << 9) + (var3.method1665(1720746760) << 8);
        var3.field3455[0] = var7 - class620.field8435;
        var3.field813 = (var3.field3455[0] << 9) + (var3.method1665(1720746760) << 8);
        class581.field7921 = var3.field808 = var3.field811 = var5;
        if (arg1 > -14) {
            field10811 = null;
        }
        if (class77.method708(var3.field3453[0], -184949524, var3.field3455[0])) {
            var3.field811++;
        }
        if (class323.field4015[var2] != null) {
            var3.method3128((byte) 121, class323.field4015[var2]);
        }
        class235.field2787 = 0;
        class75.field1040[class235.field2787++] = var2;
        class159.field1975[var2] = 0;
        class218.field2563 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method2802(18, -20468);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class643 var13 = class320.field3971[var8] = new class643();
                var13.field8771 = false;
                var13.field8770 = 0;
                var13.field8769 = (var11 << 14) + ((var10 << 28) + var12);
                var13.field8767 = false;
                var13.field8768 = -1;
                class486.field6775[class218.field2563++] = var8;
                class159.field1975[var8] = 0;
            }
        }
        arg0.method2806(-23187);
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(Ljava/lang/String;IC)I")
    public static final int method4336(String arg0, int arg1, char arg2) {
        if (arg1 != 10799) {
            method4335(null, (byte) -117);
        }
        field10803++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(IB)I")
    public static final int method4337(int arg0, byte arg1) {
        int var7 = arg0 - 1;
        field10797++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return arg1 < 4 ? -13 : var6 + 1;
    }

    @OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lbt;Lvn;)V")
    public class783(class48 arg0, class332 arg1) {
        this.field10799 = arg1;
        this.field10802 = arg0;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(B)V")
    public static void method4338(byte arg0) {
        field10795 = null;
        field10811 = null;
        if (arg0 >= -1) {
            field10811 = null;
        }
    }

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "(I)V")
    public final void method684(int arg0) {
        this.field10798 = class481.method2858(this.field10799.field4104, -1, this.field10802);
        field10807++;
        if (arg0 != 30573) {
            field10806 = 78;
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(IZ)V")
    public void method821(int arg0, boolean arg1) {
        int var3 = -34 % ((arg0 - 53) / 52);
        field10804++;
        if (arg1) {
            int var4 = this.field10799.field4105.method860((byte) -62, class243.field2870, this.field10798.method1634()) + this.field10799.field4109;
            int var5 = this.field10799.field4107.method102(this.field10798.method1636(), (byte) 126, class412.field5381) + this.field10799.field4106;
            this.field10798.method1838(var4, var5);
        }
    }

    @OriginalMember(owner = "client!fja", name = "b", descriptor = "(B)V")
    public static final void method4339(byte arg0) {
        class589.field8014 = null;
        class256.field3026 = null;
        class787.field10857 = null;
        field10796++;
        class522.field7403 = null;
        class86.field1148 = null;
        class648.field8843 = null;
        class56.field764 = null;
        class662.field9090 = null;
        class662.field9084 = null;
        if (arg0 <= 105) {
            method4336(null, 38, '*');
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(II)Z")
    public static final boolean method4340(int arg0, int arg1) {
        field10809++;
        if (arg0 < 38) {
            method4337(-33, (byte) 17);
        }
        return arg1 == 8 || arg1 == 51 || arg1 == 48 || arg1 == 30 || arg1 == 44 || arg1 == 58 || arg1 == 5;
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)Z")
    public final boolean method685(int arg0) {
        if (arg0 == -18299) {
            field10801++;
            return this.field10802.method433((byte) -95, this.field10799.field4104);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fja", name = "a", descriptor = "(BI)Z")
    public static final boolean method4341(byte arg0, int arg1) {
        if (arg0 > -52) {
            return false;
        } else {
            field10800++;
            return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
        }
    }
}
