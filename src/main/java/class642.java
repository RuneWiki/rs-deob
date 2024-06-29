import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class642 {

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field8982 = -1;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "[I")
    public static int[] field8986 = new int[1];

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "F")
    public static float field8990 = 1024.0F;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public int field8981;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field8985;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public int field8988;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public int field8989;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "Z")
    public boolean field8983;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "Z")
    public boolean field8984;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
    public static void method3659(int arg0) {
        field8986 = null;
        if (arg0 >= -86) {
            method3660(71, true, true, null, null);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method3660(int arg0, boolean arg1, boolean arg2, String arg3, String arg4) {
        class209.field3246 = arg1;
        if (!arg2) {
            class449.field6142 = -1;
        }
        if (arg0 != 11084) {
            method3659(112);
        }
        class691.field9661 = arg4;
        field8985++;
        class246.field3648 = arg2;
        class694.field9678 = arg3;
        if (!class246.field3648 && (class691.field9661.equals("") || class694.field9678.equals(""))) {
            class757.method4204(3, 1);
            return;
        }
        class100.field1157 = false;
        if (class104.field1206 != 1) {
            class715.field9936 = 0;
            class596.field8370 = -1;
        }
        class757.method4204(-3, arg0 - 11083);
        class632.field8877 = 1;
        class66.field816 = 0;
        class277.field4034 = 0;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V")
    public static final void method3661(boolean arg0, int arg1) {
        field8987++;
        class313 var2 = class312.method1998((long) arg1, 14, -1);
        var2.method2006(112);
        if (arg0) {
            method3659(-31);
        }
    }
}
