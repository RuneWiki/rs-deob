import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class541 {

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "Laj;")
    private class333 field7352;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    public int field7350;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "Lur;")
    public static class564 field7351 = new class564();

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "Lda;")
    public static class66 field7353;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
    public static void method3086(byte arg0) {
        field7353 = null;
        if (arg0 != 116) {
            field7353 = null;
        }
        field7351 = null;
    }

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lgia;ILaj;)V")
    public class541(class285 arg0, int arg1, class333 arg2) {
        new class239(64);
        this.field7352 = arg2;
        this.field7350 = this.field7352.method2090(15, false);
    }
}
