import java.awt.Component;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class18 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Lea;")
    private static class38 field362 = class9.method46((byte) 114, " more options");

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lea;")
    public static class38 field370 = field362;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "Lea;")
    private static class38 field368 = class9.method46((byte) 120, "scroll:");

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lea;")
    public static class38 field361 = field368;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lea;")
    public static class38 field367 = field368;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Lda;")
    public static class29 field366 = new class29(4096);

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Lea;")
    public static class38 field371 = class9.method46((byte) 121, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "Lea;")
    public static class38 field372 = class9.method46((byte) 105, "Versteckt");

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Ldd;")
    public static class32 field374;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field365;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B[BLhc;)V")
    public final void method102(byte arg0, byte[] arg1, class66 arg2) {
        field363++;
        if (arg2.field1627[arg2.field1620] != 31 || arg2.field1627[arg2.field1620 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field365 == null) {
            this.field365 = new Inflater(true);
        }
        try {
            this.field365.setInput(arg2.field1627, arg2.field1620 + 10, arg2.field1627.length + -arg2.field1620 + -18);
            this.field365.inflate(arg1);
            if (arg0 != 126) {
                field362 = null;
            }
        } catch (Exception var4) {
            this.field365.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field365.reset();
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static void method103(int arg0) {
        if (arg0 != 1000000) {
            return;
        }
        field371 = null;
        field367 = null;
        field370 = null;
        field372 = null;
        field374 = null;
        field362 = null;
        field366 = null;
        field368 = null;
        field361 = null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class18() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method104(int arg0, Component arg1) {
        arg1.removeMouseListener(class155.field3213);
        if (arg0 != 593) {
            field368 = null;
        }
        arg1.removeMouseMotionListener(class155.field3213);
        field369++;
        arg1.removeFocusListener(class155.field3213);
        class166.field3426 = 0;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(III)V")
    private class18(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILdd;)Lk;")
    public static final class89 method105(int arg0, int arg1, int arg2, class32 arg3) {
        field364++;
        if (class74.method592(arg2, arg3, (byte) 124, arg1)) {
            return arg0 < 93 ? null : class87.method721(-115);
        } else {
            return null;
        }
    }
}
