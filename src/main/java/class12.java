import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FFRFJBIR")
public class class12 {

    @OriginalMember(owner = "client!FFRFJBIR", name = "a", descriptor = "I")
    private int field614 = -48253;

    @OriginalMember(owner = "client!FFRFJBIR", name = "b", descriptor = "Z")
    private boolean field615 = false;

    @OriginalMember(owner = "client!FFRFJBIR", name = "c", descriptor = "I")
    private int field616 = 859;

    @OriginalMember(owner = "client!FFRFJBIR", name = "f", descriptor = "LEDVKOEOK;")
    private class9 field619 = new class9();

    @OriginalMember(owner = "client!FFRFJBIR", name = "j", descriptor = "LAAITTAMV;")
    private class1 field623 = new class1((byte) -113);

    @OriginalMember(owner = "client!FFRFJBIR", name = "g", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!FFRFJBIR", name = "h", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!FFRFJBIR", name = "i", descriptor = "LGUGSPPMO;")
    private class18 field622;

    @OriginalMember(owner = "client!FFRFJBIR", name = "d", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!FFRFJBIR", name = "e", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client!FFRFJBIR", name = "<init>", descriptor = "(II)V")
    public class12(int arg0, int arg1) {
        this.field620 = arg0;
        if (arg1 != -2745) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field621 = arg0;
        this.field622 = new class18(1024, 1);
    }

    @OriginalMember(owner = "client!FFRFJBIR", name = "a", descriptor = "(J)LEDVKOEOK;")
    public class9 method198(long arg0) {
        class9 var3 = (class9) this.field622.method292(arg0);
        if (var3 == null) {
            this.field617++;
        } else {
            this.field623.method1(var3);
            this.field618++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!FFRFJBIR", name = "a", descriptor = "(JLEDVKOEOK;Z)V")
    public void method199(long arg0, class9 arg1, boolean arg2) {
        if (this.field621 == 0) {
            class9 var5 = this.field623.method2();
            var5.method418();
            var5.method188();
            if (this.field619 == var5) {
                class9 var6 = this.field623.method2();
                var6.method418();
                var6.method188();
            }
        } else {
            this.field621--;
        }
        this.field622.method293(arg1, arg0, 927);
        this.field623.method1(arg1);
        if (!arg2 && class41.field1195) {
        }
    }

    @OriginalMember(owner = "client!FFRFJBIR", name = "a", descriptor = "()V")
    public void method200() {
        while (true) {
            class9 var1 = this.field623.method2();
            if (var1 == null) {
                this.field621 = this.field620;
                return;
            }
            var1.method418();
            var1.method188();
        }
    }
}
