import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class271 {

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field4538 = 0;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field4539 = 0;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lph;")
    public static class229 field4541 = class266.method1858("settings", 0);

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lph;")
    public static class229 field4537 = class266.method1858("<img=0>", 0);

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4542;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 21)
    public static void method1881(byte arg0) {
        field4537 = null;
        if (arg0 >= 6) {
            field4541 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lhb;[BB)V", line = 33)
    public final void method1882(class164 arg0, byte[] arg1, byte arg2) {
        field4543++;
        if (arg0.field2668[arg0.field2670] != 31 || arg0.field2668[arg0.field2670 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4542 == null) {
            this.field4542 = new Inflater(true);
        }
        try {
            this.field4542.setInput(arg0.field2668, arg0.field2670 + 10, -arg0.field2670 - 8 + -10 + arg0.field2668.length);
            this.field4542.inflate(arg1);
        } catch (Exception var5) {
            this.field4542.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4542.reset();
        if (arg2 != -43) {
            this.method1882((class164) null, (byte[]) null, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V", line = 73)
    public class271() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(III)V", line = 92)
    private class271(int arg0, int arg1, int arg2) {
    }
}
