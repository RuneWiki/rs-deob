import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class178 extends class252 {

    @OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
    public int field2951 = 0;

    @OriginalMember(owner = "client!wl", name = "x", descriptor = "Z")
    public static boolean field2952 = false;

    @OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "Lrk;")
    public static class292 field2959;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "[I")
    public static int[] field2953;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
    public static final void method1252(int arg0, int arg1) {
        field2950++;
        class291 var2 = class61.method389(arg0, 9, arg1);
        var2.method2010(0);
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V")
    public static final void method1253(int arg0) {
        field2958++;
        class88.field1373.method1873(-7401);
        if (arg0 > 74) {
            class158.field2570.method1873(-7401);
        }
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)V")
    public static void method1254(int arg0) {
        if (arg0 != 9) {
            field2953 = null;
        }
        field2959 = null;
        field2953 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILfj;)V")
    public final void method1255(int arg0, class274 arg1) {
        if (arg0 != -1) {
            this.method1255(-31, (class274) null);
        }
        field2957++;
        while (true) {
            int var3 = arg1.method1849(arg0 + 256);
            if (var3 == 0) {
                return;
            }
            this.method1256(var3, arg1, 2);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILfj;I)V")
    private final void method1256(int arg0, class274 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field2951 = arg1.method1837(252);
        }
        field2954++;
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)Lwe;")
    public static final class16 method1257(int arg0) {
        field2955++;
        try {
            int var1 = -25 % ((arg0 - 75) / 49);
            return (class16) Class.forName("wf").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)Log;")
    public static final class241 method1258(int arg0) {
        class271.field4370 = 0;
        field2949++;
        int var1 = -43 / ((arg0 + 49) / 63);
        return class284.method1926(32309);
    }
}
