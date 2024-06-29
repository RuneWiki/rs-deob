import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class class637 extends class49 {

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "Z")
    public volatile boolean field8952 = true;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "Lqk;")
    public static class1 field8956 = new class1(31, 3);

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
    public static int field8957 = 0;

    @OriginalMember(owner = "client!sr", name = "G", descriptor = "I")
    public static int field8958 = 0;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "I")
    public static int field8950;

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
    public static int field8953;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "Z")
    public boolean field8951;

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "Z")
    public boolean field8954;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Z")
    public static final boolean method3659(int arg0) {
        if (arg0 == 1) {
            field8950++;
            return class20.field171 == 0 ? class493.field6796.method593(-111) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)[B")
    public abstract byte[] method2735(int arg0);

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)I")
    public abstract int method2736(byte arg0);

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "(I)V")
    public static final void method3660(int arg0) {
        field8955++;
        class688.field9602.method3503(class688.field9602.field8539, -125, 1);
        class688.field9602.method3503(class688.field9602.field8542, -125, 1);
        class688.field9602.method3503(class688.field9602.field8530, -127, 1);
        class688.field9602.method3503(class688.field9602.field8532, -128, 1);
        class688.field9602.method3503(class688.field9602.field8508, -124, 1);
        class688.field9602.method3503(class688.field9602.field8551, -123, 1);
        class688.field9602.method3503(class688.field9602.field8501, -123, 0);
        class688.field9602.method3503(class688.field9602.field8512, -128, 0);
        class688.field9602.method3503(class688.field9602.field8547, -124, 0);
        class688.field9602.method3503(class688.field9602.field8538, -128, 0);
        class688.field9602.method3503(class688.field9602.field8506, -126, 0);
        class688.field9602.method3503(class688.field9602.field8528, -123, 0);
        class688.field9602.method3503(class688.field9602.field8507, -128, 0);
        class688.field9602.method3503(class688.field9602.field8499, -128, 0);
        class688.field9602.method3503(class688.field9602.field8540, -128, 0);
        class688.field9602.method3503(class688.field9602.field8529, -128, 0);
        class688.field9602.method3503(class688.field9602.field8541, -127, 0);
        class688.field9602.method3503(class688.field9602.field8516, -123, 0);
        class688.field9602.method3503(class688.field9602.field8544, -124, 0);
        class679.method3864(true);
        class688.field9602.method3503(class688.field9602.field8523, -124, 2);
        int var1 = 17 / ((47 - arg0) / 45);
        class688.field9602.method3503(class688.field9602.field8553, -123, 2);
        class511.method3009(-14603);
        class271.method1768((byte) -70);
        class501.field6854 = true;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBLjava/lang/String;ZI)V")
    public static final void method3661(int arg0, byte arg1, String arg2, boolean arg3, int arg4) {
        field8953++;
        class734.method4077(arg4, false, arg0, null, arg2, (byte) 24, arg3);
        int var5 = -39 % ((20 - arg1) / 53);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
    public static void method3662(boolean arg0) {
        if (!arg0) {
            method3662(false);
        }
        field8956 = null;
    }
}
