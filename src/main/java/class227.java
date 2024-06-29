import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class227 {

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field2966 = -1;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2959 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field2973 = 0;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "Lcb;")
    public static class318 field2976 = new class318(83, 8);

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Ljj;")
    public static class398 field2977 = new class398(4, 1);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field2964;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public int field2968;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lek;")
    public static class540 field2972;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "[B")
    public byte[] field2967;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "[B")
    public byte[] field2974;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)V")
    public static final void method1389(int arg0, boolean arg1) {
        field2961++;
        if (arg1 && class561.field7647 != null) {
            class127.field1613 = class561.field7647.field3377;
        } else {
            class127.field1613 = -1;
        }
        class626.field8524 = null;
        class143.field1820 = 0;
        class29.field285 = null;
        class561.field7647 = null;
        class561.method3147();
        class561.field7658.method365(arg0 ^ 0xFFFFFFBF);
        class282.field3781 = null;
        class85.field1050 = null;
        class2.field16 = null;
        class522.field7230 = -1;
        field2972 = null;
        class92.field1131 = -1;
        class426.field5925 = null;
        class531.field7340 = null;
        class561.field7656 = null;
        class436.field6033 = null;
        class654.field9262 = null;
        class643.field9113 = null;
        if (class561.field7649 != null) {
            class561.field7649.method221(arg0 ^ 0x4D3A);
            class561.field7649.method219(128, (byte) -127, 64);
        }
        if (class561.field7646 != null) {
            class561.field7646.method1011(64, 34, 64);
        }
        if (class561.field7643 != null) {
            class561.field7643.method1743((byte) 120, 64);
        }
        class150.field1888.method3003(arg0, (byte) -92);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1390(int arg0, byte arg1, int arg2) {
        field2970++;
        if (arg1 >= -58) {
            field2965 = -68;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)I")
    public static final int method1391(int arg0) {
        if (arg0 == 14) {
            field2958++;
            return 14;
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static void method1392(int arg0) {
        field2976 = null;
        field2977 = null;
        field2959 = null;
        if (arg0 != 2048) {
            field2959 = null;
        }
        field2972 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Z")
    public static final boolean method1393(int arg0, int arg1, int arg2) {
        field2969++;
        if (arg2 == 64) {
            return class644.method3585((byte) 125, arg0, arg1) || class4.method25(-1, arg1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(III)Z")
    public static final boolean method1394(int arg0, int arg1, int arg2) {
        field2963++;
        if (arg1 != -1) {
            method1389(28, false);
        }
        return (arg0 & 0x800) != 0;
    }
}
