import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class313 {

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "Lgi;")
    private class583 field4214;

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "Z")
    public static boolean field4218 = false;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "[I")
    public static int[] field4219 = new int[1];

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "Lan;")
    public static class21 field4217;

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "Lclient;")
    public static client field4221;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static final void method1955(int arg0) {
        field4215++;
        int var1 = class559.field7738;
        int[] var2 = class358.field4825;
        if (arg0 < 66) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class188 var4 = class349.field4696[var2[var3]];
            if (var4 != null) {
                class168.method1077(6621, var4, var4.method337(0));
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4216++;
        this.field4214.method3351(125, this.field4220);
        super.finalize();
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
    public static void method1956(int arg0) {
        field4221 = null;
        field4217 = null;
        if (arg0 > -31) {
            method1955(-77);
        }
        field4219 = null;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lgi;II)V")
    public class313(class583 arg0, int arg1, int arg2) {
        this.field4214 = arg0;
        this.field4220 = arg2;
    }
}
