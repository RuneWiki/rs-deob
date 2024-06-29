import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class552 extends class179 {

    @OriginalMember(owner = "client!wb", name = "Eb", descriptor = "[Llt;")
    public static class310[] field7756 = new class310[50];

    @OriginalMember(owner = "client!wb", name = "Db", descriptor = "Lmq;")
    public static class78 field7755 = new class78(23, -1);

    @OriginalMember(owner = "client!wb", name = "Hb", descriptor = "Lus;")
    public static class328 field7759 = new class328(32, -1);

    @OriginalMember(owner = "client!wb", name = "Fb", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!wb", name = "Gb", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!wb", name = "Ib", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!wb", name = "Jb", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!wb", name = "Kb", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3141(byte arg0, String arg1) {
        ++field7757;
        return arg0 < 117 ? 43 : 2 + arg1.length();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Z")
    public static final boolean method3142(int arg0, int arg1, int arg2) {
        ++field7760;
        if (arg2 != 65536) {
            return true;
        } else {
            return ~(arg1 & 65536) != -1;
        }
    }

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "(I)V")
    public static void method3143(int arg0) {
        if (arg0 != -493833480) {
            method3142(0, -78, -115);
        }
        field7756 = null;
        field7755 = null;
        field7759 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(FZ)V")
    public final void method3144(float arg0, boolean arg1) {
        ++field7762;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field2325[super.field2354++] = (byte) (var3 >> 24);
        super.field2325[super.field2354++] = (byte) (var3 >> 16);
        super.field2325[super.field2354++] = (byte) (var3 >> 8);
        if (arg1) {
            method3143(-69);
        }
        super.field2325[super.field2354++] = (byte) var3;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
    public class552(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(FI)V")
    public final void method3145(float arg0, int arg1) {
        if (arg1 != -1) {
            field7759 = null;
        }
        ++field7758;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field2325[super.field2354++] = (byte) var3;
        super.field2325[super.field2354++] = (byte) (var3 >> 8);
        super.field2325[super.field2354++] = (byte) (var3 >> 16);
        super.field2325[super.field2354++] = (byte) (var3 >> 24);
    }
}
