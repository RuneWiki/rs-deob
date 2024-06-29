import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class390 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Lni;")
    public static class367 field5949 = new class367(44, -1);

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Lla;")
    public static class319 field5953 = new class319(9, 14);

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Lla;")
    public static class319 field5954 = new class319(97, 16);

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "[I")
    public static int[] field5957 = new int[1000];

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field5956 = -1;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "[I")
    public static int[] field5958 = new int[2];

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5951;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Z")
    public static boolean field5955;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Z")
    public static boolean field5960;

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
    public class390() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lnj;Z[B)V")
    public final void method2438(class164 arg0, boolean arg1, byte[] arg2) {
        field5952++;
        if (arg0.field2219[arg0.field2185] != 31 || arg0.field2219[arg0.field2185 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5951 == null) {
            this.field5951 = new Inflater(true);
        }
        try {
            if (!arg1) {
                return;
            }
            this.field5951.setInput(arg0.field2219, arg0.field2185 + 10, -arg0.field2185 - 10 + -8 + arg0.field2219.length);
            this.field5951.inflate(arg2);
        } catch (Exception var4) {
            this.field5951.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5951.reset();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method2439(int arg0) {
        field5954 = null;
        field5949 = null;
        field5953 = null;
        int var1 = -2 % ((arg0 + 12) / 47);
        field5957 = null;
        field5958 = null;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(III)V")
    private class390(int arg0, int arg1, int arg2) {
    }
}
