import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class417 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lgj;")
    private class593 field5711;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field5714;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lrc;")
    private class504 field5713;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqb;", line = 4)
    public static final class209 method2385(Throwable arg0, String arg1) {
        field5707++;
        class209 var2;
        if (arg0 instanceof class209) {
            var2 = (class209) arg0;
            var2.field2993 = var2.field2993 + ' ' + arg1;
        } else {
            var2 = new class209(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Lrc;", line = 27)
    public final class504 method2386(int arg0) {
        field5709++;
        class504 var2 = this.field5711.field7850.field6722;
        if (arg0 != 32) {
            field5708 = 81;
        }
        if (this.field5711.field7850 == var2) {
            this.field5713 = null;
            return null;
        } else {
            this.field5713 = var2.field6722;
            return var2;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lgj;Z)V", line = 51)
    public final void method2387(class593 arg0, boolean arg1) {
        field5714++;
        this.field5711 = arg0;
        if (!arg1) {
            this.method2388(-86);
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Lrc;", line = 62)
    public final class504 method2388(int arg0) {
        field5710++;
        class504 var2 = this.field5713;
        if (this.field5711.field7850 == var2) {
            this.field5713 = null;
            return null;
        } else {
            this.field5713 = var2.field6722;
            int var3 = 19 / ((arg0 - 72) / 48);
            return var2;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 82)
    public class417() {
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lgj;)V", line = 85)
    public class417(class593 arg0) {
        this.field5711 = arg0;
    }
}
