import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class170 {

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Ljp;")
    private class236 field2488 = new class236(64);

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public int field2489 = 0;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lpc;")
    private class473 field2477;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Lcu;")
    public static class145 field2474 = new class145(38, 4);

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "[Z")
    public static boolean[] field2485 = new boolean[8];

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "Lff;")
    public static class9 field2482;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Lclient;")
    public static client field2476;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)V")
    public final void method1134(int arg0, byte arg1) {
        class236 var3 = this.field2488;
        synchronized (this.field2488) {
            if (arg1 != -69) {
                this.method1135(79);
            }
            this.field2488.method1461(-5, arg0);
        }
        field2478++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public final void method1135(int arg0) {
        class236 var2 = this.field2488;
        synchronized (this.field2488) {
            this.field2488.method1459(19088);
            if (arg0 != 8) {
                method1136((byte) 56);
            }
        }
        field2487++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I")
    public static final int method1136(byte arg0) {
        field2481++;
        if (arg0 < 72) {
            method1136((byte) -5);
        }
        if (class297.field3882 == null) {
            return class72.field1094 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2475++;
        int var8 = arg0 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class454.field6160 - class494.field6864) * var8 / 100 + class494.field6864;
        int var10 = arg6 * var9 >> 8;
        int var11 = 16384 - arg4 & 0x3FFF;
        int var12 = 16384 - arg3 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class305.field4019[var11] * -var10 >> 15;
            var15 = class305.field4022[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class305.field4019[var12] * var15 >> 15;
            var15 = class305.field4022[var12] * var15 >> 15;
        }
        class365.field4937 = arg5 - var14;
        class47.field699 = 0;
        class168.field2438 = arg2 - var15;
        class207.field2854 = arg3;
        class168.field2439 = arg4;
        if (arg1 == 890660175) {
            class430.field5888 = arg7 - var13;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(IB)Ldq;")
    public final class490 method1138(int arg0, byte arg1) {
        if (arg1 != 12) {
            return null;
        }
        field2479++;
        class236 var3 = this.field2488;
        class490 var4;
        synchronized (this.field2488) {
            var4 = (class490) this.field2488.method1456((long) arg0, 125);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2477.method2708(4, arg0, (byte) 54);
        class490 var6 = new class490();
        var6.field6816 = this;
        var6.field6815 = arg0;
        if (var5 != null) {
            var6.method2829(new class379(var5), (byte) 45);
        }
        var6.method2828(1);
        class236 var7 = this.field2488;
        synchronized (this.field2488) {
            this.field2488.method1462(var6, (long) arg0, -87);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method1139(int arg0) {
        field2476 = null;
        field2482 = null;
        field2474 = null;
        field2485 = null;
        int var1 = 18 % ((arg0 + 55) / 43);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public final void method1140(int arg0) {
        if (arg0 <= 112) {
            field2485 = null;
        }
        field2486++;
        class236 var2 = this.field2488;
        synchronized (this.field2488) {
            this.field2488.method1458((byte) -125);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class170(class234 arg0, int arg1, class473 arg2) {
        this.field2477 = arg2;
        this.field2483 = this.field2477.method2710(4, (byte) -101);
    }
}
