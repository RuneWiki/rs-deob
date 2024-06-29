import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class486 {

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "B")
    private byte field6990;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public int field6986;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public int field6982;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public int field6991;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
    public int field6994;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
    public int field6992;

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "Lhi;")
    public static class45 field6988 = new class45(36, 7);

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field6998 = 0;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "S")
    public static short field6996 = 256;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "J")
    public static long field6995 = -1L;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "Lwt;")
    public static class17 field6993;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public static void method2874(int arg0) {
        field6988 = null;
        if (arg0 != 15191) {
            method2875(null, (byte) 95);
        }
        field6993 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([BB)[B")
    public static final byte[] method2875(byte[] arg0, byte arg1) {
        field6987++;
        class319 var2 = new class319(arg0);
        if (arg1 != 26) {
            return null;
        }
        int var3 = var2.method1869(-79);
        int var4 = var2.method1863(arg1 ^ 0xFFFFFFE5);
        if (var4 < 0 || class299.field4097 != 0 && var4 > class299.field4097) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1887(0, var7, var4, true);
            return var7;
        } else {
            int var5 = var2.method1863(arg1 - 27);
            if (var5 < 0 || !(class299.field4097 == 0 || class299.field4097 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class324.method1924(var6, var5, arg0, var4, 9);
            } else {
                class323.field4434.method2686(var6, var2, (byte) 96);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIILoi;I)V")
    public static final void method2876(int arg0, int arg1, int arg2, class170 arg3, int arg4) {
        field6985++;
        long var5 = (long) (arg1 << 14 | arg0 << 28 | arg4);
        class292 var7 = (class292) class484.field6966.method1592((byte) -25, var5);
        if (var7 == null) {
            class292 var8 = new class292();
            class484.field6966.method1586(var8, var5, 1);
            var8.field3957.method3139(0, arg3);
            return;
        }
        class297 var9 = class534.field7872.method3089(arg3.field2586, -114);
        int var10 = var9.field4013;
        if (var9.field4044 == 1) {
            var10 = (arg3.field2589 + 1) * var10;
        }
        for (class170 var11 = (class170) var7.field3957.method3137(0); var11 != null; var11 = (class170) var7.field3957.method3132(0)) {
            class297 var12 = class534.field7872.method3089(var11.field2586, -120);
            int var13 = var12.field4013;
            if (var12.field4044 == 1) {
                var13 = (var11.field2589 + 1) * var13;
            }
            if (var10 > var13) {
                class416.method2457(arg3, (byte) 66, var11);
                return;
            }
        }
        if (arg2 < 84) {
            method2875(null, (byte) 25);
        }
        var7.field3957.method3139(0, arg3);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZIB)I")
    public static final int method2877(int arg0, boolean arg1, int arg2, byte arg3) {
        field6989++;
        class412 var4 = class379.method2261(3597, arg1, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var4.field5866.length) {
            if (arg3 != 2) {
                method2877(-117, true, -105, (byte) -63);
            }
            return var4.field5866[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public static final void method2878(int arg0) {
        class527.field7690 = 0;
        if (arg0 > 38) {
            field7000++;
            class391.field5638.method3143(true);
            class526.field7677 = false;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BIII)I")
    public static final int method2879(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = 47 / ((arg0 + 35) / 50);
        field6984++;
        if (arg3 > arg1) {
            return arg3;
        } else if (arg1 > arg2) {
            return arg2;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)I")
    public final int method2880(int arg0) {
        if (arg0 != -9) {
            this.method2881((byte) -95);
        }
        field6983++;
        return (this.field6990 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
    public class486() {
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lsv;)V")
    public class486(class319 arg0) {
        this.field6990 = arg0.method1894(-2018);
        this.field6986 = arg0.method1844(-106);
        this.field6982 = arg0.method1863(-1);
        this.field6991 = arg0.method1863(-1);
        this.field6994 = arg0.method1863(-1);
        this.field6992 = arg0.method1863(-1);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)I")
    public final int method2881(byte arg0) {
        field6999++;
        if (arg0 != -111) {
            this.field6991 = -123;
        }
        return this.field6990 & 0x7;
    }
}
