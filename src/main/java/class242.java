import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class242 {

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Lvf;")
    public static class166 field3316 = new class166();

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "Lg;")
    public static class470 field3319;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3317;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 5)
    public static void method1326(int arg0) {
        if (arg0 != 1000000) {
            method1326(-46);
        }
        field3316 = null;
        field3319 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ILvt;[B)V", line = 17)
    public final void method1327(int arg0, class179 arg1, byte[] arg2) {
        field3318++;
        if (arg1.field2159[arg1.field2206] != 31 || arg1.field2159[arg1.field2206 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3317 == null) {
            this.field3317 = new Inflater(true);
        }
        try {
            if (arg0 != 1) {
                this.method1327(-62, (class179) null, (byte[]) null);
            }
            this.field3317.setInput(arg1.field2159, arg1.field2206 + 10, arg1.field2159.length + -8 + -arg1.field2206 + -10);
            this.field3317.inflate(arg2);
        } catch (Exception var4) {
            this.field3317.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3317.reset();
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(III)V", line = 56)
    private class242(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V", line = 69)
    public class242() {
        this(-1, 1000000, 1000000);
    }
}
