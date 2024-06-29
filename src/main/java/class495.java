import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class495 extends class679 {

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    private int field6546;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    private int field6542;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
    private int field6550;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    private int field6540;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "[Lvr;")
    public static class409[] field6533 = new class409[128];

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6538 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    private int field6535;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    private int field6539;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    private int field6547;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    private int field6548;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "[B")
    private byte[] field6534;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public final void method2343(byte arg0) {
        this.field6547 = 0;
        this.field6535 = 0;
        int var2 = -65 / ((arg0 - 14) / 40);
        field6543++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V")
    public final void method2344(int arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field6548 = this.field6546 - (arg0 < 0 ? -arg0 : arg0);
            this.field6548 = this.field6548 * this.field6548 >> 12;
            this.field6539 = 4096;
            this.field6535 = this.field6548;
        } else {
            this.field6539 = this.field6548 * this.field6542 >> 12;
            if (this.field6539 < 0) {
                this.field6539 = 0;
            } else if (this.field6539 > 4096) {
                this.field6539 = 4096;
            }
            this.field6548 = this.field6546 - (arg0 < 0 ? -arg0 : arg0);
            this.field6548 = this.field6548 * this.field6548 >> 12;
            this.field6548 = this.field6548 * this.field6539 >> 12;
            this.field6535 += this.field6548 * this.field6540 >> 12;
            this.field6540 = this.field6550 * this.field6540 >> 12;
        }
        if (arg2) {
            field6537++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V")
    public static final void method2695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~class260.field3509.field1289 != arg5 && arg3 != 0 && class202.field2639 < 50 && arg4 != -1) {
            class47.field666[class202.field2639++] = new class64((byte) 1, arg4, arg3, arg0, arg2, arg1);
        }
        field6536++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public static final void method2696(int arg0, int arg1, String arg2, int arg3, String arg4, String arg5, String arg6) {
        class647.method3562(arg1, null, 8192, arg5, arg0, arg6, arg2, arg3, arg4);
        field6545++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BZ)V")
    public static final void method2697(byte arg0, boolean arg1) {
        field6549++;
        if (arg1 && class706.field9826 != null) {
            class259.field3490 = class706.field9826.field3064;
        } else {
            class259.field3490 = -1;
        }
        class484.field6455 = 0;
        class178.field2217 = null;
        class706.field9826 = null;
        class453.field5907 = null;
        class706.method3866();
        class706.field9838.method2085((byte) 9);
        class491.field6511 = null;
        class337.field4353 = null;
        class706.field9840 = null;
        class186.field2378 = null;
        class103.field1375 = null;
        class693.field9478 = -1;
        class82.field1112 = -1;
        class422.field5461 = null;
        class222.field2901 = null;
        class315.field4099 = null;
        class454.field5927 = null;
        class483.field6428 = null;
        if (class706.field9833 != null) {
            class706.field9833.method2290(1);
            class706.field9833.method2292(-119, 64, 128);
        }
        if (class706.field9832 != null) {
            class706.field9832.method2891(64, 34, 64);
        }
        if (class706.field9828 != null) {
            class706.field9828.method1903((byte) -127, 64);
        }
        class388.field4971.method2188(true, 64);
        int var2 = -86 % ((arg0 - 58) / 56);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)V")
    public void method2061(int arg0, int arg1, byte arg2) {
        field6544++;
        if (arg0 >= -29) {
            this.field6550 = 65;
        }
        this.field6534[arg1] = arg2;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    public final void method2345(int arg0) {
        field6541++;
        this.field6540 = this.field6550;
        this.field6535 >>= 0x4;
        if (this.field6535 < 0) {
            this.field6535 = 0;
        } else if (this.field6535 > 255) {
            this.field6535 = 255;
        }
        if (arg0 == -1810733887) {
            this.method2061(-103, this.field6547++, (byte) this.field6535);
            this.field6535 = 0;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class495(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6546 = (int) (arg6 * 4096.0F);
        this.field6542 = (int) (arg7 * 4096.0F);
        this.field6540 = this.field6550 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V")
    public static void method2698(byte arg0) {
        field6533 = null;
        field6538 = null;
        int var1 = 31 % ((arg0 - 22) / 58);
    }
}
