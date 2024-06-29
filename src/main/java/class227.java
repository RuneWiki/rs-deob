import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class227 extends class322 {

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field3058 = new String[5];

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "[I")
    public static int[] field3057;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field3056;
        if (arg1 <= 10) {
            field3057 = null;
        }
        return 3;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        if (arg0 != 0) {
            method1420((byte) 13);
        }
        ++field3055;
        super.field4451 = arg1;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)I")
    public final int method1419(boolean arg0) {
        if (arg0) {
            field3057 = null;
        }
        ++field3060;
        return super.field4451;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lch;)V")
    public class227(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        super.field4451 = this.method17((byte) 125);
        if (arg0) {
            this.method22(-70, -61);
        }
        ++field3054;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
    public static void method1420(byte arg0) {
        field3058 = null;
        field3057 = null;
        if (arg0 != -64) {
            method1420((byte) 105);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(ILch;)V")
    public class227(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field3059;
        int var2 = 101 / ((70 - arg0) / 51);
        return super.field4450.method2749(-21) == class556.field7800 && super.field4450.method2751(-18373) ? 0 : 1;
    }
}
