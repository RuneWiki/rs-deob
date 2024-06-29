import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class class14 {

    @OriginalMember(owner = "mapview!ga", name = "c", descriptor = "Ln;")
    public static class26 field225 = class9.method82(255, "75(U");

    @OriginalMember(owner = "mapview!ga", name = "g", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "mapview!ga", name = "i", descriptor = "[[B")
    public static byte[][] field231 = new byte[250][];

    @OriginalMember(owner = "mapview!ga", name = "f", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "mapview!ga", name = "e", descriptor = "J")
    public long field227;

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "Lga;")
    public class14 field224;

    @OriginalMember(owner = "mapview!ga", name = "d", descriptor = "Lga;")
    public class14 field226;

    @OriginalMember(owner = "mapview!ga", name = "h", descriptor = "La;")
    public static class1 field230;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "[I")
    public static int[] field223;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(B)V", line = 60)
    public static void method109(byte arg0) {
        field230 = null;
        if (arg0 > -126) {
            method111(null, -31);
        }
        field225 = null;
        field223 = null;
        field231 = null;
    }

    @OriginalMember(owner = "mapview!ga", name = "b", descriptor = "(B)V", line = 81)
    public final void method110(byte arg0) {
        if (this.field224 == null) {
            return;
        }
        this.field224.field226 = this.field226;
        this.field226.field224 = this.field224;
        if (arg0 == 80) {
            this.field226 = null;
            this.field224 = null;
        }
    }

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "(Ljava/lang/String;I)Ln;", line = 100)
    public static final class26 method111(String arg0, int arg1) {
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class26 var4 = new class26();
        var4.field354 = var2;
        var4.field347 = 0;
        for (int var5 = arg1; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field347++] = var2[var5];
            }
        }
        return var4;
    }
}
