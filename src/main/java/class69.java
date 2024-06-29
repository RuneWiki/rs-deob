import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class69 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[I")
    public static int[] field954 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "J")
    public long field962;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lwd;")
    public class69 field959;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lwd;")
    public class69 field960;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
    public static int[] field958;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[Lhj;")
    public static class26[] field961;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
    public static final void method543(boolean arg0) {
        if (arg0) {
            class83.field1148.method1238(6, -136478397);
            class83.field1148.method1762(0L, (byte) 55);
            field955++;
            class21.field258++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public final void method544(int arg0) {
        field963++;
        if (this.field959 == null) {
            return;
        }
        this.field959.field960 = this.field960;
        int var2 = -119 % ((arg0 - 34) / 46);
        this.field960.field959 = this.field959;
        this.field960 = null;
        this.field959 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static void method545(int arg0) {
        if (arg0 != 0) {
            field958 = null;
        }
        field958 = null;
        field954 = null;
        field961 = null;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Z")
    public final boolean method546(int arg0) {
        field956++;
        if (this.field959 == null) {
            return false;
        } else {
            if (arg0 != 15271) {
                this.method544(-58);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method547(String arg0, boolean arg1, String arg2, String arg3) {
        field957++;
        for (int var4 = arg2.indexOf(arg0); var4 != -1; var4 = arg2.indexOf(arg0, arg3.length() + var4)) {
            arg2 = arg2.substring(0, var4) + arg3 + arg2.substring(var4 + arg0.length());
        }
        if (!arg1) {
            field954 = null;
        }
        return arg2;
    }
}
