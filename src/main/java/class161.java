import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class161 {

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "Luaa;")
    public static class395 field2395 = new class395(10);

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2398;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "Z")
    public static boolean field2392;

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V")
    public class161() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B[BLco;)V")
    public final void method1129(byte arg0, byte[] arg1, class268 arg2) {
        field2393++;
        if (arg2.field3952[arg2.field3913] != 31 || arg2.field3952[arg2.field3913 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2398 == null) {
            this.field2398 = new Inflater(true);
        }
        try {
            this.field2398.setInput(arg2.field3952, arg2.field3913 + 10, -arg2.field3913 + -8 - 10 + arg2.field3952.length);
            this.field2398.inflate(arg1);
        } catch (Exception var4) {
            this.field2398.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 != -61) {
            method1132((byte) 69, -37, 113);
        }
        this.field2398.reset();
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)J")
    public static final long method1130(byte arg0) {
        int var1 = 110 % ((-arg0 - 78) / 47);
        field2394++;
        return class258.field3749.method721(2259880);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lbi;I)V")
    public static final void method1131(class465 arg0, int arg1) {
        field2396++;
        if (arg1 != 10) {
            field2395 = null;
        }
        arg0.field6710 = null;
        int var2 = arg0.field6707.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field6707[var3].field4595 = false;
        }
        class115[] var4 = class616.field8718;
        synchronized (class616.field8718) {
            if (var2 < class616.field8718.length && class79.field1426[var2] < 200) {
                class616.field8718[var2].method952((byte) 91, arg0);
                int var10002 = class79.field1426[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(BII)Z")
    public static final boolean method1132(byte arg0, int arg1, int arg2) {
        field2397++;
        if (arg0 != -22) {
            field2399 = -49;
        }
        return false;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method1133(int arg0) {
        field2395 = null;
        if (arg0 != -1) {
            method1131(null, 40);
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(III)V")
    private class161(int arg0, int arg1, int arg2) {
    }
}
