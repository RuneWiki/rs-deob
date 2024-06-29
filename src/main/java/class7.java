import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class7 extends class161 {

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lal;")
    public static class52 field92 = new class52(4);

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field95 = 0;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "J")
    public long field86;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Lff;")
    public class7 field89;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Lff;")
    public class7 field90;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "[I")
    public static int[] field91;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)Z")
    public final boolean method87(boolean arg0) {
        field88++;
        if (this.field90 == null) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)I")
    public static final int method88(int arg0) {
        if (arg0 != 22800) {
            method91((byte) -111, -126);
        }
        field93++;
        return class86.field1104;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
    public static void method89(int arg0) {
        field92 = null;
        if (arg0 != 0) {
            method91((byte) -92, -62);
        }
        field91 = null;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public final void method90(byte arg0) {
        field87++;
        if (this.field90 == null) {
            return;
        }
        this.field90.field89 = this.field89;
        this.field89.field90 = this.field90;
        this.field90 = null;
        if (arg0 != -53) {
            this.field89 = null;
        }
        this.field89 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
    public static final void method91(byte arg0, int arg1) {
        if (arg0 >= -126) {
            method91((byte) -57, -47);
        }
        field94++;
        class52 var2 = class234.field3912;
        synchronized (class234.field3912) {
            class234.field3912.method337(arg1, (byte) -117);
        }
    }
}
