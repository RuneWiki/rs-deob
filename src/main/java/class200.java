import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class200 extends class596 {

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "Lgn;")
    public class691 field2706;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "Lwo;")
    public static class445 field2705 = new class445();

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "Ljava/lang/String;")
    public static String field2710 = null;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "Z")
    public static boolean field2709 = false;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "Lga;")
    public static class332 field2708;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "Lbda;")
    public static class437 field2711;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(BILrca;I)V")
    public static final void method1283(byte arg0, int arg1, class34 arg2, int arg3) {
        class569.field7760[arg1][arg3] = arg2;
        if (arg0 == -51) {
            field2704++;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)V")
    public static final void method1284(int arg0, int arg1, int arg2) {
        class207 var3 = class153.field2168[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class454.method2557(var3.field2768);
        class454.method2557(var3.field2767);
        if (var3.field2768 != null) {
            var3.field2768 = null;
        }
        if (var3.field2767 != null) {
            var3.field2767 = null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
    public static void method1285(byte arg0) {
        if (arg0 <= 77) {
            field2708 = null;
        }
        field2705 = null;
        field2711 = null;
        field2710 = null;
        field2708 = null;
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lqq;II[B)V")
    public class200(class651 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2706 = arg0.method3653(class635.field8783, arg1, arg3, false, -29799, arg2);
        this.field2706.method846(false, (byte) 105, false);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)Llv;")
    public static final class694 method1286(boolean arg0) {
        field2707++;
        if (class672.field9563 == null || class327.field4401 == null) {
            return null;
        }
        class327.field4401.method1381(class672.field9563, 21085);
        class694 var1 = (class694) class327.field4401.method1380(120);
        if (!arg0) {
            field2708 = null;
        }
        if (var1 == null) {
            return null;
        } else {
            class83 var2 = class672.field9554.method2158(var1.field9786, (byte) -117);
            return var2 != null && var2.field983 && var2.method445(true, class672.field9549) ? var1 : class300.method1772(17956);
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lqq;II[I)V")
    public class200(class651 arg0, int arg1, int arg2, int[] arg3) {
        this.field2706 = arg0.method3662(arg2, false, arg1, -123, arg3);
        this.field2706.method846(false, (byte) 63, false);
    }
}
