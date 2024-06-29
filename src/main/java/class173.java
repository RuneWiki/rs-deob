import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class173 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2404 = 0;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Z")
    public static boolean field2409 = false;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
    public static int[] field2413 = new int[2];

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lfi;")
    public static class331 field2412 = new class331(50);

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Ldh;")
    public static final class175 method1141(byte arg0) {
        field2411++;
        class113.field1303 = 0;
        if (arg0 < 59) {
            field2413 = null;
        }
        return class218.method1428(-124);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method1142(int arg0) {
        field2412 = null;
        field2413 = null;
        if (arg0 != -22155) {
            field2409 = true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lac;I[[BI[[BILac;Z[[I[[B[[BILen;)V")
    public static final void method1143(class319 arg0, int arg1, byte[][] arg2, int arg3, byte[][] arg4, int arg5, class319 arg6, boolean arg7, int[][] arg8, byte[][] arg9, byte[][] arg10, int arg11, class174 arg12) {
        if (class341.field5018 == arg3 && !class436.field6388) {
            class191.method1224(arg1, 15341, arg12, arg0, arg2, arg4, arg10, arg7, arg6, arg5, arg9, arg11, arg8);
        } else {
            class305.method1916(arg10, arg11, arg9, arg2, arg7, arg8, arg0, (byte) 114, arg4, arg12, arg6, arg5, arg1);
        }
        field2410++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
    public static final void method1144(int arg0, boolean arg1) {
        field2407++;
        if (arg0 != 14130) {
            method1143((class319) null, -98, (byte[][]) null, 63, (byte[][]) null, -3, (class319) null, true, (int[][]) null, (byte[][]) null, (byte[][]) null, 96, (class174) null);
        }
        if (class150.field2111 != arg1) {
            class150.field2111 = arg1;
            class276.method1742((byte) 14);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1145(int arg0, String arg1, int arg2) {
        if (arg2 != 26641) {
            method1145(45, (String) null, -12);
        }
        field2405++;
        class348 var3 = class385.method2464(3, 1302, arg0);
        var3.method2216((byte) 23);
        var3.field5087 = arg1;
    }
}
