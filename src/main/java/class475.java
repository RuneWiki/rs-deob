import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class475 {

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "Lwi;")
    private class330 field7048 = new class330(64);

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "Lwi;")
    public class330 field7061 = new class330(30);

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "Luu;")
    public class191 field7055;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "Luu;")
    private class191 field7057;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field7044 = 0;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "[Lrt;")
    public static class153[] field7049 = new class153[50];

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "[I")
    public static int[] field7056 = new int[5];

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field7052;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field7060;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public int field7062;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 9)
    public static void method2829(boolean arg0) {
        if (arg0) {
            method2829(true);
        }
        field7049 = null;
        field7056 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)V", line = 20)
    public static final void method2830(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << 3;
        int var5 = arg1 << 3;
        field7058++;
        if (arg3 < 32) {
            field7056 = null;
        }
        int var6 = arg2 << 3;
        class53.field744 = var4;
        if (class340.field5269 == 2) {
            class49.field702 = var4;
            class296.field4378 = var5;
            class334.field5197 = var6;
        }
        class536.field7870 = var5;
        class89.method598((byte) -102);
        class508.field7475 = true;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V", line = 47)
    private final void method2831(int arg0) {
        field7053++;
        class330 var2 = this.field7048;
        synchronized (this.field7048) {
            this.field7048.method2127((byte) 12);
        }
        class330 var3 = this.field7061;
        synchronized (this.field7061) {
            this.field7061.method2127((byte) -48);
        }
        if (arg0 > -111) {
            this.field7057 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 65)
    public final void method2832(int arg0) {
        class330 var2 = this.field7048;
        synchronized (this.field7048) {
            this.field7048.method2135(arg0);
        }
        field7052++;
        class330 var3 = this.field7061;
        synchronized (this.field7061) {
            this.field7061.method2135(0);
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V", line = 78)
    public static final void method2833(int arg0) {
        class225.field3116.method911(1);
        field7054++;
        class306.field4441.method958(false);
        class183.field2487.method1425(2);
        class432.field6575.method1874(30);
        class137.field1834.method1627((byte) 72);
        class103.field1489.method1602(true);
        class201.field2707.method487(arg0 - 109);
        class239.field3360.method2831(-112);
        class102.field1481.method202(-4160);
        class431.field6567.method192(arg0 ^ 0x4F);
        class509.field7483.method1560(true);
        class244.field3413.method975((byte) 56);
        class509.field7484.method1847(false);
        class529.field7758.method1583(arg0 + arg0);
        class83.field1218.method3122(-22776);
        class332.field5172.method2213(127);
        class182.field2469.method2286(1);
        class448.field6743.method2173(arg0 ^ 0xFFFFFFD7);
        class77.field1120.method2964(-19493);
        class319.field4623.method864(false);
        class137.method923(112);
        class120.method731(true);
        class353.method2270(arg0 + 91);
        if (class476.field7072 != class116.field1601) {
            for (int var1 = 0; var1 < class381.field5818.length; var1++) {
                class381.field5818[var1] = null;
            }
            class323.field4678 = 0;
        }
        class433.method2641(-127);
        class391.method2440(-105);
        class526.method3117(true);
        class222.method1499((byte) -96);
        class254.method1645(arg0 + 1);
        class343.field5307.method2127((byte) 126);
        class400.field6090.method817();
        class478.field7073.method2918(arg0 ^ 0x8);
        class263.method1698((byte) 22);
        class293.field4270.method1269(arg0 ^ 0x7B);
        class339.field5257.method1269(99);
        class315.field4587.method1269(arg0 + 122);
        class247.field3447.method1269(113);
        class149.field1964.method1269(104);
        class79.field1131.method1269(arg0 + 119);
        class162.field2111.method1269(123);
        class288.field4210.method1269(arg0 ^ 0x76);
        class266.field3709.method1269(122);
        class229.field3273.method1269(123);
        class22.field327.method1269(114);
        class41.field612.method1269(120);
        class350.field5399.method1269(121);
        class381.field5811.method1269(arg0 ^ 0x78);
        class359.field5511.method1269(arg0 ^ 0x78);
        class256.field3536.method1269(arg0 + 125);
        class467.field6983.method1269(118);
        class532.field7829.method1269(arg0 ^ 0x7B);
        class126.field1714.method1269(101);
        class502.field7407.method1269(124);
        class273.field3801.method1269(102);
        class304.field4439.method1269(arg0 ^ 0x70);
        class63.field895.method1269(108);
        class502.field7409.method1269(118);
        class359.field5509.method1269(124);
        class21.field324.method1269(107);
        class474.field7041.method1269(arg0 + 106);
        class526.field7722.method1269(122);
        class359.field5514.method1269(100);
        class103.field1486.method1269(arg0 + 106);
        class359.field5512.method2127((byte) 121);
        class172.field2318.method2127((byte) 127);
        class317.field4604.method2127((byte) -50);
        class10.field177.method2127((byte) 124);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V", line = 164)
    public final void method2834(int arg0, int arg1) {
        if (arg1 != 14581) {
            return;
        }
        this.field7062 = arg0;
        field7059++;
        class330 var3 = this.field7061;
        synchronized (this.field7061) {
            this.field7061.method2127((byte) -31);
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)I", line = 181)
    public static final int method2835(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field7046++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return arg1 == -1 ? var6 + 1 : -27;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)Lds;", line = 198)
    public final class11 method2836(byte arg0, int arg1) {
        field7060++;
        class330 var3 = this.field7048;
        class11 var4;
        synchronized (this.field7048) {
            var4 = (class11) this.field7048.method2133((long) arg1, (byte) 87);
        }
        if (var4 != null) {
            return var4;
        }
        int var5 = -13 % ((-arg0 - 48) / 38);
        class191 var6 = this.field7057;
        byte[] var7;
        synchronized (this.field7057) {
            var7 = this.field7057.method1281(class367.method2336(arg1, -89), class236.method1565(arg1, (byte) -110), 120);
        }
        class11 var8 = new class11();
        var8.field185 = this;
        var8.field182 = arg1;
        if (var7 != null) {
            var8.method108(new class164(var7), (byte) -55);
        }
        class330 var9 = this.field7048;
        synchronized (this.field7048) {
            this.field7048.method2131(var8, (long) arg1, false);
            return var8;
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Liv;ILuu;Luu;)V", line = 269)
    public class475(class65 arg0, int arg1, class191 arg2, class191 arg3) {
        this.field7055 = arg3;
        this.field7057 = arg2;
        int var5 = this.field7057.method1294(-1) - 1;
        this.field7057.method1290(false, var5);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)V", line = 248)
    public final void method2837(int arg0, byte arg1) {
        field7045++;
        class330 var3 = this.field7048;
        synchronized (this.field7048) {
            this.field7048.method2140(-112, arg0);
        }
        if (arg1 >= -67) {
            field7051 = 92;
        }
        class330 var4 = this.field7061;
        synchronized (this.field7061) {
            this.field7061.method2140(-116, arg0);
        }
    }
}
