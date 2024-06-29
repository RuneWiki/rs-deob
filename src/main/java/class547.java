import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class547 extends class308 implements class288 {

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
    public static int field7410 = 0;

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
    public static int field7414 = 0;

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "Lfc;")
    public static class235 field7412 = new class235("LOCAL", 4);

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "B")
    private byte field7418;

    @OriginalMember(owner = "client!ot", name = "y", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!ot", name = "J", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILjava/lang/String;IZZLjava/lang/String;JIII)V", line = 4)
    public static final void method3077(int arg0, int arg1, String arg2, int arg3, boolean arg4, boolean arg5, String arg6, long arg7, int arg8, int arg9, int arg10) {
        if (arg8 >= -47) {
            field7417 = -81;
        }
        ++field7413;
        if (!class541.field7327 && class137.field1948 < 500) {
            int var12 = ~arg3 == 0 ? class112.field1563 : arg3;
            class499 var13 = new class499(arg2, arg6, var12, arg0, arg10, arg7, arg9, arg1, arg5, arg4);
            class588.field8265.method1441(var13, 0);
            ++class137.field1948;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)Z", line = 22)
    public final boolean method1768(int arg0, int arg1, int arg2) {
        this.field7418 = (byte) arg2;
        if (arg1 != -26595) {
            return false;
        } else {
            ++field7415;
            super.method1116(arg0, 27);
            return true;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 41)
    public final Buffer method1769(boolean arg0, int arg1) {
        int var3 = 29 / ((arg1 - 43) / 47);
        ++field7406;
        return super.method1870(super.field4249.field2169, -1, arg0);
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)I", line = 51)
    public final int method905(boolean arg0) {
        ++field7409;
        if (!arg0) {
            this.method1122(-9);
        }
        return super.method905(true);
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(B)I", line = 62)
    public final int method3078(byte arg0) {
        ++field7407;
        if (arg0 != -40) {
            field7414 = 85;
        }
        return this.field7418;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Z", line = 74)
    public final boolean method1771(int arg0) {
        if (arg0 <= 83) {
            field7410 = -55;
        }
        ++field7408;
        return super.method1865(25079, super.field4249.field2169);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Ltba;Z)V", line = 88)
    public class547(class147 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(Z)V", line = 94)
    public static void method3079(boolean arg0) {
        if (arg0) {
            field7417 = -71;
        }
        field7412 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z", line = 114)
    public final boolean method1770(Source arg0, int arg1, int arg2, int arg3) {
        this.field7418 = (byte) arg1;
        ++field7405;
        if (arg3 != -15029) {
            this.method1769(false, 81);
        }
        super.method1869(arg2, arg0, 0);
        return true;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)V", line = 135)
    public final void method1122(int arg0) {
        ++field7411;
        super.method1122(arg0);
    }
}
