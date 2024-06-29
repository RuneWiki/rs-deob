import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class88 extends class168 implements class87 {

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Z")
    private boolean field1252 = false;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    private int field1255 = 50;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Lnh;")
    private class305 field1256;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "Lnh;")
    private class305 field1269;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Ltd;")
    private class225 field1260;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Ltd;")
    private class225 field1259;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "[C")
    public static char[] field1262 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "Ltd;")
    public static class225 field1263 = new class225(64);

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "[Lrl;")
    public static class310[] field1274 = new class310[32768];

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field1275 = 0;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(FII)[I")
    public final int[] method561(float arg0, int arg1, int arg2) {
        field1254++;
        class304 var4 = this.method567(arg2, 104);
        if (var4 == null) {
            return null;
        } else {
            var4.field4864 = true;
            return arg1 == 1159 ? var4.method2043(this, this.field1256, arg0, this.field1252 || this.method395(arg2, -18098).field4695) : null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method565(byte arg0) {
        field1274 = null;
        if (arg0 > -8) {
            field1274 = null;
        }
        field1262 = null;
        field1263 = null;
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(II)Lmk;")
    public final class227 method566(int arg0, int arg1) {
        field1265++;
        int var3 = 78 % ((-arg1 - 29) / 63);
        class304 var4 = this.method567(arg0, 104);
        return var4 == null ? null : var4.field4865;
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(II)Lwl;")
    private final class304 method567(int arg0, int arg1) {
        if (arg1 != 104) {
            field1262 = null;
        }
        field1267++;
        class304 var3 = (class304) this.field1260.method1486((long) arg0, -19212);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1269.method2050(107, arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            class304 var5 = new class304(new class215(var4));
            this.field1260.method1489((long) arg0, 123, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB)Z")
    public final boolean method563(int arg0, byte arg1) {
        int var3 = 69 % ((arg1 - 81) / 39);
        field1270++;
        return this.method395(arg0, -18098).field4692;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)V")
    public final void method568(byte arg0, int arg1) {
        if (arg0 != -4) {
            field1274 = null;
        }
        for (class304 var3 = (class304) this.field1260.method1492(arg0 + 3); var3 != null; var3 = (class304) this.field1260.method1495((byte) 95)) {
            if (var3.field4864) {
                var3.method2045(arg1);
                var3.field4864 = false;
            }
        }
        field1272++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZFI)Lta;")
    public final class203 method562(int arg0, int arg1, boolean arg2, float arg3, int arg4) {
        field1257++;
        class304 var6 = this.method567(arg4, 104);
        if (arg1 != 116) {
            this.method567(-84, 61);
        }
        if (var6 != null && var6.method2044(this, this.field1256)) {
            return arg2 ? var6.field4865.method1505(arg0, false, this, arg1 - 116, (double) arg3, arg0, this.field1256) : var6.field4865.method1499(arg0, false, arg0, this.field1256, (double) arg3, false, this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public final void method569(int arg0) {
        this.field1260.method1485(true);
        if (arg0 != 113) {
            this.method563(58, (byte) -100);
        }
        field1264++;
        if (this.field1259 != null) {
            this.field1259.method1485(true);
        }
        class304.field4873 = null;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lnh;Lnh;Lnh;IZ)V")
    public class88(class305 arg0, class305 arg1, class305 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field1255 = arg3;
        this.field1252 = arg4;
        this.field1256 = arg2;
        this.field1269 = arg0;
        this.field1260 = new class225(this.field1255);
        this.field1259 = null;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)I")
    public final int method560(int arg0, int arg1) {
        if (arg1 == 65535) {
            field1266++;
            return this.method395(arg0, -18098).field4688 & 0xFFFF;
        } else {
            return 25;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
    public final void method570(boolean arg0, int arg1) {
        this.field1252 = arg0;
        int var3 = -91 % ((arg1 + 35) / 45);
        field1271++;
        this.method569(113);
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(II)Z")
    public final boolean method564(int arg0, int arg1) {
        int var3 = 0 / ((arg0 - 75) / 40);
        field1273++;
        return !this.method395(arg1, -18098).field4696;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILnh;II)Lbf;")
    public static final class108 method571(int arg0, class305 arg1, int arg2, int arg3) {
        if (arg3 <= 50) {
            field1275 = -47;
        }
        field1258++;
        return class131.method832(arg0, arg2, -128, arg1) ? class102.method654(false) : null;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)Z")
    public final boolean method559(int arg0, int arg1) {
        if (arg1 != 112) {
            this.method563(-90, (byte) -66);
        }
        field1253++;
        return this.field1252 || this.method395(arg0, -18098).field4695;
    }
}
