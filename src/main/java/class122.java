import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class122 implements Runnable {

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[Leq;")
    public volatile class509[] field1896 = new class509[2];

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Z")
    public volatile boolean field1891 = false;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Z")
    public volatile boolean field1895 = false;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field1894 = 0;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lsn;")
    public static class205 field1890 = new class205(0, 5);

    @OriginalMember(owner = "client!af", name = "h", descriptor = "[I")
    public static int[] field1897 = new int[2];

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Z")
    public static boolean field1899 = false;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lrb;")
    public static class283 field1898 = new class283(45, 12);

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lor;")
    public class173 field1892;

    @OriginalMember(owner = "client!af", name = "run", descriptor = "()V")
    public final void run() {
        field1893++;
        this.field1895 = true;
        try {
            while (!this.field1891) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class509 var2 = this.field1896[var1];
                    if (var2 != null) {
                        var2.method3015(0);
                    }
                }
                class334.method2047(10L, 0);
                class522.method3103(8, this.field1892, null);
            }
        } catch (Exception var9) {
            class187.method1255(var9, null, -74);
        } finally {
            Object var6 = null;
            this.field1895 = false;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method889(int arg0) {
        if (arg0 != 2) {
            method889(46);
        }
        field1890 = null;
        field1898 = null;
        field1897 = null;
    }
}
