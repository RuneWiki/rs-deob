import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class235 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4271 = 0;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Ldc;")
    private static class37 field4278 = class185.method1233((byte) 86, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
    public static int[] field4274 = new int[1000];

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Ldc;")
    public static class37 field4279 = field4278;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "Ldc;")
    public static class37 field4281 = class185.method1233((byte) 86, "Hidden)2use");

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field4282 = -1;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "Ldc;")
    public static class37 field4284 = class185.method1233((byte) 86, "leuchten3:");

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4275;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "[I")
    public static int[] field4280;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "[[[I")
    public static int[][][] field4283;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1518(int arg0) {
        field4284 = null;
        field4278 = null;
        if (arg0 >= -87) {
            method1518(84);
        }
        field4280 = null;
        field4279 = null;
        field4283 = null;
        field4281 = null;
        field4274 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lwa;Lkd;Lwa;ILwa;)Z")
    public static final boolean method1519(class238 arg0, class112 arg1, class238 arg2, int arg3, class238 arg4) {
        if (arg3 >= -52) {
            field4279 = null;
        }
        client.field663 = arg2;
        class176.field3337 = arg1;
        class64.field1168 = arg4;
        field4277++;
        class101.field1747 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BZLce;)V")
    public final void method1520(byte[] arg0, boolean arg1, class28 arg2) {
        field4273++;
        if (arg2.field502[arg2.field526] != 31 || arg2.field502[arg2.field526 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4275 == null) {
            this.field4275 = new Inflater(true);
        }
        if (arg1) {
            method1519(null, null, null, -9, null);
        }
        try {
            this.field4275.setInput(arg2.field502, arg2.field526 + 10, -arg2.field526 - 8 + arg2.field502.length + -10);
            this.field4275.inflate(arg0);
        } catch (Exception var4) {
            this.field4275.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4275.reset();
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class235() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(III)V")
    private class235(int arg0, int arg1, int arg2) {
    }
}
