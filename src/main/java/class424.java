import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class424 extends class86 {

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)I")
    public final int method2445(boolean arg0) {
        ++field5579;
        return arg0 ? -88 : super.field1200;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(ILsf;)V")
    public class424(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I")
    public final int method73(int arg0) {
        ++field5580;
        if (arg0 != 0) {
            return 29;
        } else {
            return !super.field1203.method2981(arg0 + -14) ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)I")
    public final int method72(int arg0, int arg1) {
        if (arg1 != -2) {
            return 43;
        } else {
            ++field5582;
            return 3;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method2446(byte arg0, byte[] arg1) {
        ++field5578;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            int var3 = 119 / (arg0 / 48);
            class642.method3480(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lsf;)V")
    public class424(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)V")
    public final void method76(int arg0, boolean arg1) {
        ++field5583;
        super.field1200 = arg0;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public final void method71(byte arg0) {
        super.field1200 = this.method73(arg0 ^ -65);
        ++field5581;
        if (arg0 == -65) {
            ;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2447(String arg0, int arg1) {
        if (arg1 > -38) {
            method2447((String) null, 110);
        }
        ++field5584;
        return class232.field3128.containsKey(arg0);
    }
}
