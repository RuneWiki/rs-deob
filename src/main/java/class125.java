import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class125 implements Runnable {

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "[Lbn;")
    public volatile class177[] field1955 = new class177[2];

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Z")
    public volatile boolean field1952 = false;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "Z")
    public volatile boolean field1956 = false;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1950 = "Loaded fonts";

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1951 = "Take";

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Lwe;")
    public class224 field1953;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "Lwf;")
    public static class306 field1959;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "[I")
    public static int[] field1958;

    @OriginalMember(owner = "client!bm", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        this.field1956 = true;
        try {
            while (!this.field1952) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class177 var2 = this.field1955[var1];
                    if (var2 != null) {
                        var2.method1199((byte) 87);
                    }
                }
                class96.method657(10L, (byte) -115);
                class220.method1468(1001, this.field1953, (Object) null);
            }
        } catch (Exception var7) {
            class291.method1892((String) null, var7, -2);
        } finally {
            this.field1956 = false;
        }
        field1954++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 51)
    public static void method842(int arg0) {
        field1959 = null;
        field1950 = null;
        field1958 = null;
        if (arg0 >= 14) {
            field1951 = null;
        }
    }
}
