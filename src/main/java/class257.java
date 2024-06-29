import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class257 extends class152 {

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public int field3036 = 0;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
    public int field3040 = 12800;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
    public int field3037 = -1;

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "Z")
    public boolean field3041 = true;

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "I")
    public int field3038 = -1;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "I")
    public int field3045 = 12800;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
    public int field3053 = 0;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "Ljava/lang/String;")
    public String field3039;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    public int field3044;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "Ljava/lang/String;")
    public String field3042;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "Lifa;")
    public class450 field3047;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "Z")
    public static boolean field3034 = true;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "Lbja;")
    public static class34 field3046 = new class34(15, 0, 1, 0);

    @OriginalMember(owner = "client!bj", name = "P", descriptor = "Z")
    public static boolean field3052 = false;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "Lbt;")
    public static class48 field3050;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)Z", line = 4)
    public final boolean method1544(int arg0, int arg1, int arg2) {
        field3048++;
        if (arg1 != 0) {
            this.field3036 = 103;
        }
        for (class367 var4 = (class367) this.field3047.method2725(37); var4 != null; var4 = (class367) this.field3047.method2726(-120)) {
            if (var4.method2138(arg0, arg2, -40)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII[I)Z", line = 29)
    public final boolean method1545(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field3035++;
        class367 var6 = (class367) this.field3047.method2725(37);
        if (arg2 >= -96) {
            this.method1545(-120, 21, 80, -116, null);
        }
        while (var6 != null) {
            if (var6.method2137(arg0, arg3, arg1, 2)) {
                var6.method2136((byte) -109, arg4, arg1, arg0);
                return true;
            }
            var6 = (class367) this.field3047.method2726(-128);
        }
        return false;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZII[I)Z", line = 55)
    public final boolean method1546(boolean arg0, int arg1, int arg2, int[] arg3) {
        if (!arg0) {
            this.field3040 = -121;
        }
        field3051++;
        for (class367 var5 = (class367) this.field3047.method2725(37); var5 != null; var5 = (class367) this.field3047.method2726(-126)) {
            if (var5.method2134(arg1, (byte) -77, arg2)) {
                var5.method2140(arg3, 0, arg2, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 206)
    public class257(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3039 = arg2;
        this.field3044 = arg0;
        this.field3041 = arg5;
        this.field3042 = arg1;
        this.field3033 = arg3;
        this.field3037 = arg6;
        this.field3038 = arg4;
        if (this.field3037 == 255) {
            this.field3037 = 0;
        }
        this.field3047 = new class450();
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 92)
    public static void method1547(byte arg0) {
        if (arg0 != -126) {
            method1547((byte) -81);
        }
        field3046 = null;
        field3050 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 113)
    public final void method1548(int arg0) {
        this.field3045 = 12800;
        field3043++;
        this.field3040 = 12800;
        this.field3036 = 0;
        if (arg0 <= 98) {
            this.method1544(-31, -21, 104);
        }
        this.field3053 = 0;
        for (class367 var2 = (class367) this.field3047.method2725(37); var2 != null; var2 = (class367) this.field3047.method2726(-114)) {
            if (var2.field4557 > this.field3053) {
                this.field3053 = var2.field4557;
            }
            if (this.field3040 > var2.field4552) {
                this.field3040 = var2.field4552;
            }
            if (var2.field4551 > this.field3036) {
                this.field3036 = var2.field4551;
            }
            if (this.field3045 > var2.field4550) {
                this.field3045 = var2.field4550;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BII[I)Z", line = 165)
    public final boolean method1549(byte arg0, int arg1, int arg2, int[] arg3) {
        field3049++;
        if (arg0 != 59) {
            this.method1548(2);
        }
        for (class367 var5 = (class367) this.field3047.method2725(37); var5 != null; var5 = (class367) this.field3047.method2726(-121)) {
            if (var5.method2138(arg2, arg1, 93)) {
                var5.method2136((byte) -109, arg3, arg2, arg1);
                return true;
            }
        }
        return false;
    }
}
