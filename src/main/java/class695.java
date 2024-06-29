import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class695 {

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Z")
    public boolean field9802 = false;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Luf;")
    private class380 field9807 = new class380(64);

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "Luf;")
    public class380 field9813 = new class380(500);

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Luf;")
    public class380 field9814 = new class380(30);

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Luf;")
    public class380 field9815 = new class380(50);

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
    public boolean field9798;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lga;")
    private class332 field9801;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Lga;")
    public class332 field9811;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
    public static int[] field9806 = new int[13];

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lng;")
    public static class219 field9800 = new class219();

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field9794;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field9797;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field9810;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public int field9816;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
    public final void method3916(int arg0, int arg1) {
        this.field9816 = arg0;
        field9795++;
        if (arg1 != 0) {
            field9812 = -121;
        }
        class380 var3 = this.field9813;
        synchronized (this.field9813) {
            this.field9813.method2168((byte) -68);
        }
        class380 var4 = this.field9814;
        synchronized (this.field9814) {
            this.field9814.method2168((byte) -104);
        }
        class380 var5 = this.field9815;
        synchronized (this.field9815) {
            this.field9815.method2168((byte) -115);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)V")
    public final void method3917(byte arg0, int arg1) {
        this.field9807 = new class380(arg1);
        field9809++;
        if (arg0 <= 36) {
            field9800 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
    public final void method3918(int arg0, int arg1) {
        field9808++;
        class380 var3 = this.field9807;
        synchronized (this.field9807) {
            this.field9807.method2179(false, arg0);
        }
        class380 var4 = this.field9813;
        synchronized (this.field9813) {
            this.field9813.method2179(false, arg0);
            if (arg1 != 30) {
                this.method3925(-76, false);
            }
        }
        class380 var5 = this.field9814;
        synchronized (this.field9814) {
            this.field9814.method2179(false, arg0);
        }
        class380 var6 = this.field9815;
        synchronized (this.field9815) {
            this.field9815.method2179(false, arg0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method3919(boolean arg0, int arg1, int arg2) {
        field9810++;
        if (arg0 && arg1 >= 0) {
            if (arg2 != -1) {
                method3919(true, 92, -32);
            }
            return class5.method39(10, arg1, arg0, arg2 ^ 0x7C84);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BZ)V")
    public final void method3920(byte arg0, boolean arg1) {
        field9805++;
        if (this.field9798 != arg1 && arg0 < -35) {
            this.field9798 = arg1;
            this.method3923(-84);
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)Ltc;")
    public final class600 method3921(int arg0, int arg1) {
        if (arg1 > -51) {
            this.method3920((byte) -3, true);
        }
        field9804++;
        class380 var3 = this.field9807;
        class600 var4;
        synchronized (this.field9807) {
            var4 = (class600) this.field9807.method2176(-127, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field9801;
        byte[] var6;
        synchronized (this.field9801) {
            var6 = this.field9801.method1938(class190.method1250(-22670, arg0), class60.method339(arg0, false), -17);
        }
        class600 var7 = new class600();
        var7.field8345 = arg0;
        var7.field8302 = this;
        if (var6 != null) {
            var7.method3340(0, new class157(var6));
        }
        var7.method3326(27837);
        if (var7.field8342) {
            var7.field8338 = false;
            var7.field8327 = 0;
        }
        if (!this.field9798 && var7.field8299) {
            var7.field8276 = null;
            var7.field8333 = null;
        }
        class380 var8 = this.field9807;
        synchronized (this.field9807) {
            this.field9807.method2174(var7, (long) arg0, (byte) 122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3922(byte arg0, String arg1) {
        int var2 = -55 % ((-arg0 - 66) / 51);
        field9803++;
        if (!class38.field507 || (class544.field7442 & 0x18) == 0) {
            return;
        }
        boolean var3 = false;
        int var4 = class426.field5750;
        int[] var5 = class586.field8104;
        for (int var6 = 0; var6 < var4; var6++) {
            class573 var7 = class513.field7145[var5[var6]];
            if (var7.field7791 != null && var7.field7791.equalsIgnoreCase(arg1) && (class408.field5369 == var7 && (class544.field7442 & 0x10) != 0 || var7 != null && (class544.field7442 & 0x8) != 0)) {
                class226.field2938++;
                class229 var8 = class97.method550(class71.field841, false, class19.field243);
                var8.field2971.method946((byte) -77, class390.field5225);
                var8.field2971.method914(5, 0);
                var8.field2971.method939(class369.field4847, (byte) 79);
                var8.field2971.method946((byte) -77, var5[var6]);
                var8.field2971.method957(-18807, class351.field4679);
                class307.method1805(var8, -14704);
                class134.method776(var7.method1435((byte) 73), 0, var7.field3088[0], -25, true, 0, -2, var7.field3086[0], var7.method1435((byte) 107));
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class642.method3555((byte) -101, class371.field4900.method2141(class422.field5539, true) + arg1, 4);
        }
        if (class38.field507) {
            class364.method2122((byte) 3);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public final void method3923(int arg0) {
        int var2 = -113 % ((-arg0 - 18) / 41);
        class380 var3 = this.field9807;
        synchronized (this.field9807) {
            this.field9807.method2168((byte) -100);
        }
        field9796++;
        class380 var4 = this.field9813;
        synchronized (this.field9813) {
            this.field9813.method2168((byte) -72);
        }
        class380 var5 = this.field9814;
        synchronized (this.field9814) {
            this.field9814.method2168((byte) -123);
        }
        class380 var6 = this.field9815;
        synchronized (this.field9815) {
            this.field9815.method2168((byte) -112);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIIII)V")
    public static final void method3924(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field9799++;
        int var5 = 8 % ((arg0 + 80) / 40);
        class256 var6 = class592.method3279((byte) -113, 4, arg3);
        var6.method1549(-32042);
        var6.field3354 = arg4;
        var6.field3358 = arg1;
        var6.field3359 = arg2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)V")
    public final void method3925(int arg0, boolean arg1) {
        if (arg0 != -9524) {
            this.method3925(70, false);
        }
        field9797++;
        if (this.field9802 != arg1) {
            this.field9802 = arg1;
            this.method3923(arg0 ^ 0x256C);
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public final void method3926(int arg0) {
        field9794++;
        class380 var2 = this.field9807;
        synchronized (this.field9807) {
            this.field9807.method2172(-15112);
        }
        class380 var3 = this.field9813;
        synchronized (this.field9813) {
            this.field9813.method2172(-15112);
        }
        class380 var4 = this.field9814;
        synchronized (this.field9814) {
            this.field9814.method2172(-15112);
        }
        if (arg0 < 93) {
            method3922((byte) 13, null);
        }
        class380 var5 = this.field9815;
        synchronized (this.field9815) {
            this.field9815.method2172(-15112);
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    public static void method3927(int arg0) {
        if (arg0 == 0) {
            field9806 = null;
            field9800 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lnq;IZLga;Lga;)V")
    public class695(class650 arg0, int arg1, boolean arg2, class332 arg3, class332 arg4) {
        this.field9798 = arg2;
        this.field9801 = arg3;
        this.field9811 = arg4;
        if (this.field9801 != null) {
            int var6 = this.field9801.method1933(-115) - 1;
            this.field9801.method1939(0, var6);
        }
    }
}
