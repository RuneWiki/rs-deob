import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class300 extends class649 implements class7 {

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    private int field4417;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Lkca;")
    public static class73 field4416 = new class73(35, 7);

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "Ltg;")
    public static class197 field4421;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I")
    public final int method39(int arg0) {
        ++field4422;
        int var2 = -15 % (arg0 / 42);
        return this.field4417;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)Z")
    public static final boolean method1995(int arg0, int arg1, int arg2) {
        ++field4418;
        if (arg2 > -63) {
            return true;
        } else {
            return ~(1408 & arg1) != -1;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I")
    public final int method36(int arg0) {
        if (arg0 != -16829) {
            method1996(117);
        }
        ++field4420;
        return 0;
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
    public static void method1996(int arg0) {
        if (arg0 < -47) {
            field4421 = null;
            field4416 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)J")
    public final long method37(boolean arg0) {
        if (arg0) {
            field4421 = null;
        }
        ++field4423;
        return super.field9374.getAddress();
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1997(String arg0, byte arg1) {
        ++field4419;
        if (!arg0.equals("")) {
            class308.method2044(class240.field3405, -7434);
            ++class568.field8157;
            class468.field6960.method1205((byte) -69, class456.method2816(-97, arg0));
            if (arg1 > -111) {
                field4416 = null;
            }
            class468.field6960.method1237(1049279824, arg0);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lad;I[BI)V")
    public class300(class362 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4417 = arg1;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([BIIZ)V")
    public final void method38(byte[] arg0, int arg1, int arg2, boolean arg3) {
        this.method3711(arg0, arg1);
        if (arg3) {
            ++field4424;
            this.field4417 = arg2;
        }
    }
}
