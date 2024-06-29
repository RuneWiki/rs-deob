import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class514 extends class209 {

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Llc;")
    public static class435 field7439 = new class435(111, 10);

    @OriginalMember(owner = "client!od", name = "F", descriptor = "Llc;")
    public static class435 field7444 = new class435(94, 8);

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field7445 = 16777215;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field7446 = 0;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field7437;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "[B")
    private byte[] field7441;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([BIZFFILqi;FIFIFI)V")
    public static final void method3123(byte[] arg0, int arg1, boolean arg2, float arg3, float arg4, int arg5, class291 arg6, float arg7, int arg8, float arg9, int arg10, float arg11, int arg12) {
        int var13 = 0;
        if (!arg2) {
            field7446 = 126;
        }
        while (arg5 > var13) {
            class81.method657(arg0, arg12, arg9, arg1, arg6, var13, arg3, 0, arg10, arg5, arg4, arg7, arg11, arg8);
            arg1 += arg10 * arg12;
            var13++;
        }
        field7437++;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class514() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3124(int arg0, int arg1, int arg2, int arg3) {
        field7438++;
        this.field7441 = new byte[arg1 * arg2 * arg0 * 2];
        if (arg3 != 4095) {
            field7446 = 14;
        }
        this.method1686(arg0, -105, arg1, arg2);
        return this.field7441;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILla;)I")
    public static final int method3125(int arg0, class423 arg1) {
        field7440++;
        int var2 = 0;
        if (arg1.method2609(arg0, class744.field10384)) {
            var2++;
        }
        if (arg1.method2609(0, class613.field8756)) {
            var2++;
        }
        if (arg1.method2609(arg0, class642.field9132)) {
            var2++;
        }
        if (arg1.method2609(0, class746.field10414)) {
            var2++;
        }
        if (arg1.method2609(0, class663.field9476)) {
            var2++;
        }
        if (arg1.method2609(0, class675.field9609)) {
            var2++;
        }
        if (arg1.method2609(0, class73.field1101)) {
            var2++;
        }
        if (arg1.method2609(0, class91.field1300)) {
            var2++;
        }
        if (arg1.method2609(0, class286.field3980)) {
            var2++;
        }
        if (arg1.method2609(arg0, class647.field9317)) {
            var2++;
        }
        if (arg1.method2609(0, class693.field9814)) {
            var2++;
        }
        if (arg1.method2609(arg0, class490.field7061)) {
            var2++;
        }
        if (arg1.method2609(0, class28.field265)) {
            var2++;
        }
        if (arg1.method2609(0, class558.field8114)) {
            var2++;
        }
        if (arg1.method2609(0, class507.field7372)) {
            var2++;
        }
        if (arg1.method2609(0, class695.field9831)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)V")
    public final void method1489(int arg0, byte arg1, int arg2) {
        field7443++;
        int var4 = arg0 * 2;
        byte var5 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field7441[var10001] = var5;
        if (arg2 >= 59) {
            this.field7441[var6] = var5;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)Z")
    public static final boolean method3126(int arg0, int arg1, int arg2) {
        field7442++;
        if (arg1 != 0) {
            field7439 = null;
        }
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static void method3127(byte arg0) {
        if (arg0 < -35) {
            field7439 = null;
            field7444 = null;
        }
    }
}
