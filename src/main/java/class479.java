import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class479 {

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "Lhi;")
    public static class131 field7312 = new class131(14, 0, 4, 1);

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Ldi;")
    public static class78 field7314 = new class78();

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field7311;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([BILha;)V", line = 6)
    public final void method2892(byte[] arg0, int arg1, class40 arg2) {
        field7313++;
        if (arg2.field536[arg2.field585] != 31 || arg2.field536[arg2.field585 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg1 != 116) {
            this.method2892(null, 28, null);
        }
        if (this.field7311 == null) {
            this.field7311 = new Inflater(true);
        }
        try {
            this.field7311.setInput(arg2.field536, arg2.field585 + 10, arg2.field536.length - (arg2.field585 + 18));
            this.field7311.inflate(arg0);
        } catch (Exception var4) {
            this.field7311.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field7311.reset();
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V", line = 37)
    public class479() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 42)
    public static void method2893(int arg0) {
        field7312 = null;
        field7314 = null;
        if (arg0 != 7884) {
            method2893(48);
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(III)V", line = 60)
    private class479(int arg0, int arg1, int arg2) {
    }
}
