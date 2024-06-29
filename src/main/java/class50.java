import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class50 extends class54 {

    @OriginalMember(owner = "client!qga", name = "u", descriptor = "I")
    private int field600 = -1;

    @OriginalMember(owner = "client!qga", name = "y", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!qga", name = "x", descriptor = "[F")
    public static float[] field603 = new float[4];

    @OriginalMember(owner = "client!qga", name = "r", descriptor = "B")
    private byte field597;

    @OriginalMember(owner = "client!qga", name = "p", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!qga", name = "q", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!qga", name = "s", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!qga", name = "t", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!qga", name = "v", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!qga", name = "w", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!qga", name = "o", descriptor = "Ljava/lang/String;")
    private String field594;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)V", line = 5)
    public static final void method418(byte arg0) {
        class688.field9602.method3503(class688.field9602.field8539, -122, 1);
        field598++;
        class688.field9602.method3503(class688.field9602.field8542, -123, 1);
        class688.field9602.method3503(class688.field9602.field8530, -128, 2);
        class688.field9602.method3503(class688.field9602.field8532, -123, 2);
        class688.field9602.method3503(class688.field9602.field8508, -125, 1);
        class688.field9602.method3503(class688.field9602.field8551, -126, 1);
        class688.field9602.method3503(class688.field9602.field8501, -128, 1);
        class688.field9602.method3503(class688.field9602.field8512, -126, 1);
        class688.field9602.method3503(class688.field9602.field8547, arg0 - 97, 1);
        class688.field9602.method3503(class688.field9602.field8506, -127, 1);
        class688.field9602.method3503(class688.field9602.field8538, -128, 1);
        class688.field9602.method3503(class688.field9602.field8528, -128, 1);
        class688.field9602.method3503(class688.field9602.field8507, -126, 0);
        class688.field9602.method3503(class688.field9602.field8499, arg0 - 96, 1);
        class688.field9602.method3503(class688.field9602.field8540, arg0 - 99, 0);
        class688.field9602.method3503(class688.field9602.field8529, -125, 0);
        class688.field9602.method3503(class688.field9602.field8541, arg0 ^ 0x66, 1);
        if (arg0 != -28) {
            method423(6, 101, 106, 35, 69, 41, 99);
        }
        class688.field9602.method3503(class688.field9602.field8516, -128, 0);
        class688.field9602.method3503(class688.field9602.field8544, -127, 0);
        class679.method3864(true);
        class688.field9602.method3503(class688.field9602.field8523, -126, 1);
        class688.field9602.method3503(class688.field9602.field8553, -127, 3);
        class511.method3009(-14603);
        class271.method1768((byte) -70);
        class501.field6854 = true;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lag;I)V", line = 42)
    public final void method419(class459 arg0, int arg1) {
        if (arg1 != -33) {
            return;
        }
        field605++;
        class74 var3 = arg0.field6422[this.field600];
        var3.field830 = this.field595;
        var3.field831 = this.field597;
        var3.field828 = this.field594;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IB)Z", line = 68)
    public static final boolean method420(int arg0, byte arg1) {
        if (arg1 != 41) {
            field602 = -5;
        }
        field601++;
        return arg0 == 15 || arg0 == 12 || arg0 == 47 || arg0 == 46 || arg0 == 8 || arg0 == 6 || arg0 == 22;
    }

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "(B)V", line = 79)
    public static void method421(byte arg0) {
        if (arg0 > 21) {
            field603 = null;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lgga;B)V", line = 89)
    public final void method422(class511 arg0, byte arg1) {
        field599++;
        this.field600 = arg0.method3002(arg1 ^ 0x14);
        this.field597 = arg0.method3030(-25984);
        this.field595 = arg0.method3002(-1);
        arg0.method3020(true);
        this.field594 = arg0.method2993((byte) -66);
        if (arg1 != -21) {
            this.field600 = -48;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIIIII)J", line = 113)
    public static final long method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 0) {
            method423(2, 41, 77, 104, -68, -47, -109);
        }
        class448.field6278.clear();
        field596++;
        class448.field6278.set(arg0, arg4, arg3, arg1, arg5, arg6);
        return class448.field6278.getTime().getTime();
    }
}
