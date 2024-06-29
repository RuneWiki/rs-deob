import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class467 extends class683 implements class511 {

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    private int field6132;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lwo;")
    public static class445 field6131 = new class445();

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lag;ILjaclib/memory/Buffer;)V")
    public class467(class469 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field6132 = arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI[BI)V")
    public final void method1557(byte arg0, int arg1, byte[] arg2, int arg3) {
        this.method3877(arg2, arg1);
        ++field6129;
        if (arg0 != 46) {
            this.field6132 = 4;
        }
        this.field6132 = arg3;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lag;I[BI)V")
    public class467(class469 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6132 = arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)I")
    public final int method1558(byte arg0) {
        int var2 = 50 / ((arg0 - 14) / 41);
        ++field6134;
        return 0;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static final void method2600(byte arg0) {
        class86.field1055 = null;
        class8.field67 = null;
        if (arg0 != 48) {
            method2600((byte) -105);
        }
        class124.field1728 = null;
        ++field6133;
        class240.field3179 = null;
        class699.field9857 = false;
        class35.field491 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)I")
    public final int method1560(int arg0) {
        if (arg0 != -4696) {
            field6131 = null;
        }
        ++field6130;
        return this.field6132;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V")
    public static void method2601(boolean arg0) {
        if (!arg0) {
            field6131 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)J")
    public final long method1559(boolean arg0) {
        ++field6135;
        if (arg0) {
            this.field6132 = -12;
        }
        return super.field9683.getAddress();
    }
}
