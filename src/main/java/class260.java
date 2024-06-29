import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class260 extends class210 implements class343 {

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    private int field3851;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!dea", name = "p", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!dea", name = "q", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!dea", name = "o", descriptor = "Ljb;")
    public static class519 field3856;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)I")
    public final int method1761(int arg0) {
        ++field3852;
        int var2 = 25 % ((-7 - arg0) / 44);
        return super.field2703;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I[BBI)V")
    public final void method1762(int arg0, byte[] arg1, byte arg2, int arg3) {
        if (arg2 >= 48) {
            ++field3853;
            this.method1370(0, arg1, arg0);
            this.field3851 = arg3;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lofa;III)V")
    public static final void method1763(class347 arg0, int arg1, int arg2, int arg3) {
        ++field3857;
        class502.field7071 = arg3;
        class474.field6659 = arg0;
        if (arg2 < -92) {
            class570.field7770 = arg1;
        }
    }

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "(I)V")
    public static void method1764(int arg0) {
        field3856 = null;
        if (arg0 >= -92) {
            field3856 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Llf;I[BIZ)V")
    public class260(class250 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field3851 = arg1;
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)I")
    public final int method1765(int arg0) {
        ++field3855;
        int var2 = 17 % ((63 - arg0) / 38);
        return this.field3851;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)J")
    public final long method1766(byte arg0) {
        if (arg0 >= -110) {
            method1763((class347) null, -116, 102, -108);
        }
        ++field3854;
        return 0L;
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)V")
    public final void method1369(int arg0) {
        super.field2704.method1640(34963, this);
        ++field3858;
        if (arg0 != 32503) {
            this.method1369(80);
        }
    }
}
