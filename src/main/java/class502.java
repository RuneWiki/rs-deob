import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class502 extends class405 {

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field7404 = 0;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Z")
    public static boolean field7405 = false;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "[I")
    public static int[] field7407 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static final void method2973(int arg0) {
        for (class387 var1 = (class387) class534.field7857.method3089(98); var1 != null; var1 = (class387) class534.field7857.method3088((byte) -65)) {
            var1.method2322();
        }
        field7406++;
        if (arg0 != 29459) {
            method2973(-122);
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
    public static void method2974(int arg0) {
        if (arg0 == 0) {
            field7407 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
    public static final void method2975(boolean arg0) {
        if (arg0) {
            class236.field3305 = class435.field6422;
            class249.field3405 = class420.field6281;
        } else {
            class236.field3305 = class175.field2574;
            class249.field3405 = class213.field3048;
        }
        class349.field5377 = class236.field3305.length;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/Object;ILec;)V")
    public static final void method2976(Object arg0, int arg1, class109 arg2) {
        field7403++;
        if (arg2.field1614 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field1614.peekEvent() != null; var3++) {
            class389.method2332(-121, 1L);
        }
        if (arg1 == 1 && arg0 != null) {
            arg2.field1614.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILta;)V")
    public static final void method2977(int arg0, class337 arg1) {
        class249.field3405[arg0] = arg1;
    }
}
