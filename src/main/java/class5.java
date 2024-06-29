import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class360 implements class583 {

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    private int field31;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Ldh;")
    public static class320 field38 = new class320(31, -1);

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "[I")
    public static int[] field40 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lnv;ILjaclib/memory/Buffer;IZ)V")
    public class5(class417 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field31 = arg1;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[BII)V")
    public final void method16(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method2118(35040, arg1, arg3);
        ++field37;
        this.field31 = arg0;
        if (arg2 >= -126) {
            method19(true);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        ++field35;
        if (arg0 != 82) {
            this.method18(63);
        }
        return super.field4607;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public final void method18(int arg0) {
        super.field4602.method2544(this, (byte) 4);
        if (arg0 == 1) {
            ++field32;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lnv;I[BIZ)V")
    public class5(class417 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field31 = arg1;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V")
    public static void method19(boolean arg0) {
        field38 = null;
        field40 = null;
        if (arg0) {
            field40 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)J")
    public final long method20(int arg0) {
        ++field36;
        if (arg0 != -22317) {
            field38 = null;
        }
        return 0L;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
    public static final void method21(byte arg0, int arg1) {
        ++field34;
        if (arg0 == 14) {
            class47 var2 = class258.method1546(12, arg1, (byte) 121);
            var2.method274(false);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
    public final int method22(boolean arg0) {
        if (!arg0) {
            return -5;
        } else {
            ++field33;
            return this.field31;
        }
    }
}
