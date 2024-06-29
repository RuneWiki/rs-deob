import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class488 implements class343 {

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "Ltf;")
    private class701 field7095;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Ljava/lang/String;")
    private String field7094;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "Lho;")
    public static class463 field7097;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Ldea;")
    public final class446 method584(byte arg0) {
        if (arg0 >= -64) {
            this.field7095 = null;
        }
        field7093++;
        return class446.field6289;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
    public static void method2831(int arg0) {
        field7097 = null;
        if (arg0 != 0) {
            method2832(-41, 28, 91);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I")
    public final int method587(int arg0) {
        field7099++;
        if (this.field7095.method3866((byte) 1, this.field7094)) {
            return 100;
        } else if (arg0 == 9856) {
            return 0;
        } else {
            return 89;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(III)V")
    public static final void method2832(int arg0, int arg1, int arg2) {
        field7100++;
        if (class312.field3886 == class246.field3031) {
            if (class285.method1662(0, 0, -2, 1, 1, (byte) -91, arg0, false, arg1)) {
                return;
            }
            class285.method1662(0, 0, -3, 1, 1, (byte) 10, arg0, false, arg1);
        } else if (class285.method1662(0, 0, -3, 1, 1, (byte) 113, arg0, false, arg1)) {
            return;
        } else {
            class285.method1662(0, 0, -2, 1, 1, (byte) 125, arg0, false, arg1);
        }
        if (arg2 != 0) {
            method2832(-5, -14, 82);
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
    public static final void method2833(int arg0) {
        class490.field7121 = class436.field6153.field6601 + class436.field6153.field6596 + 2;
        class257.field3236 = field7097.field6601 + field7097.field6596 + 2;
        class210.field2549 = new String[500];
        field7096++;
        if (arg0 != 22256) {
            method2832(-126, 46, -38);
        }
        for (int var1 = 0; var1 < class210.field2549.length; var1++) {
            class210.field2549[var1] = "";
        }
        class415.method2335(class198.field2286.method1195((byte) 62, class504.field7267), 11);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ltf;Ljava/lang/String;)V")
    public class488(class701 arg0, String arg1) {
        this.field7095 = arg0;
        this.field7094 = arg1;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILtf;)Lbn;")
    public static final class410 method2834(int arg0, int arg1, class701 arg2) {
        if (arg1 != 1) {
            field7097 = null;
        }
        field7101++;
        byte[] var3 = arg2.method3859((byte) 119, arg0);
        return var3 == null ? null : new class410(var3);
    }
}
