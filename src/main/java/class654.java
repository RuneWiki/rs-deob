import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class654 {

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "Z")
    public boolean field9097;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Let;")
    public static class596 field9096 = new class596(3);

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
    public static int field9100 = 0;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "[I")
    public static int[] field9102 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "Lkg;")
    public static class275 field9106 = new class275(120, 4);

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field9098;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field9103;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "Liaa;")
    public class497 field9094;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "Liaa;")
    public class497 field9105;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Lea;")
    public static class549 field9099;

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "Lclient;")
    public static client field9104;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "Z")
    public boolean field9101;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 3)
    public static void method3673(int arg0) {
        field9099 = null;
        if (arg0 == 47) {
            field9096 = null;
            field9104 = null;
            field9102 = null;
            field9106 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BI)Z", line = 17)
    public static final boolean method3674(byte arg0, int arg1) {
        field9093++;
        if (arg0 != 107) {
            method3674((byte) -74, 19);
        }
        return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLwg;Lka;III)V", line = 33)
    public static final void method3675(byte arg0, class428 arg1, class474 arg2, int arg3, int arg4, int arg5) {
        field9095++;
        if (arg2 != null) {
            arg1.method2454(arg2.method269(), arg4, arg5, arg2.method263(), arg2.method242(), arg3, arg2.method280(), arg2.method285(), arg2.method288(), (byte) 113, arg2.method286());
            if (arg0 > -114) {
                field9106 = null;
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V", line = 48)
    public final void method3676(int arg0) {
        field9103++;
        if (this.field9105 != null) {
            this.field9105.method294((byte) 44);
        }
        if (arg0 <= -4) {
            this.field9101 = false;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)Z", line = 76)
    public final boolean method3677(byte arg0) {
        field9098++;
        if (arg0 != 81) {
            this.field9094 = null;
        }
        return this.field9101 && !this.field9097;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Z)V", line = 87)
    public class654(boolean arg0) {
        this.field9097 = arg0;
    }
}
