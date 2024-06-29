import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class595 {

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "Lcea;")
    public static class180 field8628 = new class180("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field8631 = 0;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field8629;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field8630;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "Ldn;")
    public static class438 field8632;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field8627;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "[I")
    public static int[] field8634;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "[Lha;")
    public static class52[] field8633;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lmaa;", line = 3)
    public static final class399 method3448(Throwable arg0, String arg1) {
        field8629++;
        class399 var2;
        if ((arg0 instanceof class399)) {
            var2 = (class399) arg0;
            var2.field5253 = var2.field5253 + ' ' + arg1;
        } else {
            var2 = new class399(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V", line = 22)
    public class595() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Los;[BI)V", line = 31)
    public final void method3449(class374 arg0, byte[] arg1, int arg2) {
        field8630++;
        if (arg0.field4929[arg0.field4966] != 31 || arg0.field4929[arg0.field4966 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field8627 == null) {
            this.field8627 = new Inflater(true);
        }
        try {
            this.field8627.setInput(arg0.field4929, arg0.field4966 + 10, arg0.field4929.length - 10 - (arg0.field4966 + 8));
            if (arg2 >= -27) {
                this.field8627 = null;
            }
            this.field8627.inflate(arg1);
        } catch (Exception var4) {
            this.field8627.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field8627.reset();
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 58)
    public static void method3450(int arg0) {
        field8628 = null;
        field8633 = null;
        if (arg0 == 28933) {
            field8632 = null;
            field8634 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(III)V", line = 86)
    private class595(int arg0, int arg1, int arg2) {
    }
}
