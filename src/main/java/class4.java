import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 implements Runnable {

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[Lfg;")
    public volatile class13[] field99 = new class13[2];

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Z")
    public volatile boolean field97 = false;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "Z")
    public volatile boolean field101 = false;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Z")
    public static boolean field95 = true;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "[Lii;")
    public static class279[] field98 = new class279[50];

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field104 = -1;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "J")
    public static long field96 = 0L;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Ljava/lang/String;")
    public static String field105 = "Opened title screen";

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Lgi;")
    public static class164 field100;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Ltl;")
    public class69 field93;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field103;

    @OriginalMember(owner = "client!vd", name = "run", descriptor = "()V")
    public final void run() {
        this.field101 = true;
        field94++;
        try {
            while (!this.field97) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class13 var2 = this.field99[var1];
                    if (var2 != null) {
                        var2.method115(255);
                    }
                }
                class33.method250(10L, 256);
                class161.method1109((Object) null, this.field93, (byte) 31);
            }
        } catch (Exception var9) {
            class284.method1930(93, (String) null, var9);
        } finally {
            Object var6 = null;
            this.field101 = false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V")
    public static final void method56(int arg0, byte arg1) {
        if (arg1 >= 117) {
            field102++;
            client.field2666.method1880(-92, arg0);
            class312.field5034.method1880(-83, arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public static void method57(boolean arg0) {
        field103 = null;
        field105 = null;
        field98 = null;
        field100 = null;
        if (!arg0) {
            method56(86, (byte) 44);
        }
    }
}
