import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class524 {

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Z")
    public boolean field7748;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "S")
    public short field7742;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "S")
    public short field7743;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public int field7749;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "B")
    public byte field7738;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "S")
    public short field7745;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "B")
    public byte field7740;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lpg;")
    public static class492 field7741 = new class492(64, 20);

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lui;")
    public static class375 field7746 = new class375("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V", line = 18)
    public static final void method3106(int arg0, byte arg1) {
        field7747++;
        if (class144.field2077 == arg0) {
            return;
        }
        if (class144.field2077 == 0) {
            class366.method2298((byte) 99);
        }
        if (arg0 == 40) {
            class487.method2901(88);
        }
        if (arg0 != 40 && class81.field1090 != null) {
            class81.field1090.method2994(-1);
            class81.field1090 = null;
        }
        if (class144.field2077 == 25 || class144.field2077 == 28) {
            class338.field5355.field6511 = 2;
            class354.field5499.field6511 = 2;
            class359.field5553.field6511 = 2;
            class261.field3633.field6511 = 2;
            class498.field7275.field6511 = 2;
            class99.field1427.field6511 = 2;
            class508.field7553.field6511 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class223.field3149 = 0;
            class178.field2538 = 0;
            class394.field5990 = 1;
            class488.field7154 = 0;
            class224.field3160 = 1;
            class530.method3131(true, 64);
            class338.field5355.field6511 = 1;
            class354.field5499.field6511 = 1;
            class359.field5553.field6511 = 1;
            class261.field3633.field6511 = 1;
            class498.field7275.field6511 = 1;
            class99.field1427.field6511 = 1;
            class508.field7553.field6511 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class145.method966((byte) -23);
        }
        if (arg0 == 5) {
            class529.method3124(class113.field1576, (byte) 78, class337.field5242);
        } else {
            class11.method96(0);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg1 < 7) {
            field7741 = null;
        }
        boolean var3 = class144.field2077 == 5 || class144.field2077 == 10 || class144.field2077 == 28;
        if (var2 != var3) {
            if (var2) {
                class102.field1459 = class397.field6031;
                if (class96.field1399.field5226 == 0) {
                    class13.method114(2, 15);
                } else {
                    class367.method2300(class96.field1399.field5226, (byte) 114, class438.field6532, 0, class397.field6031, false, 2);
                }
                class514.field7617.method2247(false, (byte) 127);
            } else {
                class13.method114(2, 15);
                class514.field7617.method2247(true, (byte) 127);
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class337.field5242.method1058();
        }
        class144.field2077 = arg0;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)V", line = 120)
    public static final void method3107(int arg0, boolean arg1) {
        int var2 = -5 / ((-arg0 - 40) / 62);
        class209.field2966 = 0;
        class32.field486 = 0;
        field7744++;
        class19.method144(1);
        class380.method2356((byte) 18, arg1);
        class511.method3043(-31212);
        for (int var3 = 0; var3 < class32.field486; var3++) {
            int var5 = class189.field2654[var3];
            if (class405.field6116 != class151.field2174[var5].field5330) {
                if (class151.field2174[var5].field2768.method2129(5035)) {
                    class394.method2423(class151.field2174[var5], 112);
                }
                class151.field2174[var5].method1364(null, -123);
                class151.field2174[var5] = null;
            }
        }
        if (class461.field6755 != class486.field7134.field1292) {
            throw new RuntimeException("gnp1 pos:" + class486.field7134.field1292 + " psize:" + class461.field6755);
        }
        for (int var4 = 0; var4 < class25.field411; var4++) {
            if (class151.field2174[class259.field3609[var4]] == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class25.field411);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 172)
    public static void method3108(int arg0) {
        int var1 = -33 % ((arg0 - 47) / 47);
        field7741 = null;
        field7746 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)Lqf;", line = 187)
    public final class524 method3109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7739++;
        int var6 = -55 % ((arg3 - 13) / 52);
        return new class524(arg4, arg1, arg2, arg0, this.field7745, this.field7743, this.field7742, this.field7738, this.field7740, this.field7748);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 197)
    public class524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field7748 = arg9;
        this.field7742 = (short) arg6;
        this.field7743 = (short) arg5;
        this.field7749 = arg0;
        this.field7738 = (byte) arg7;
        this.field7745 = (short) arg4;
        this.field7740 = (byte) arg8;
    }
}
