import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class515 {

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public int field7563;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Luf;")
    public static class310 field7560 = new class310(44, 6);

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "Lss;")
    public static class295 field7561 = null;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 9)
    public static void method3025(byte arg0) {
        if (arg0 != 0) {
            method3027(true, -4);
        }
        field7561 = null;
        field7560 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZII)I", line = 26)
    public static final int method3026(int arg0, boolean arg1, int arg2, int arg3) {
        field7557++;
        int var4 = 55 / ((2 - arg0) / 60);
        class113 var5 = class223.method1313(arg1, Integer.MIN_VALUE, arg2);
        if (var5 == null) {
            return -1;
        } else if (arg3 >= 0 && var5.field1528.length > arg3) {
            return var5.field1528[arg3];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fm", name = "toString", descriptor = "()Ljava/lang/String;", line = 45)
    public final String toString() {
        field7562++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)I", line = 56)
    public static final int method3027(boolean arg0, int arg1) {
        if (arg0) {
            field7561 = null;
        }
        field7556++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 67)
    public static final void method3028(int arg0) {
        if (arg0 != 255) {
            field7560 = null;
        }
        for (class206 var1 = (class206) class297.field4104.method2306(126); var1 != null; var1 = (class206) class297.field4104.method2302(-110)) {
            var1.method1252();
        }
        field7559++;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(I)V", line = 89)
    public class515(int arg0) {
        this.field7563 = arg0;
    }
}
