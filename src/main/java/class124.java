import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class124 implements Runnable {

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[Lcd;")
    public volatile class36[] field1843 = new class36[2];

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Z")
    public volatile boolean field1844 = false;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Z")
    public volatile boolean field1847 = false;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field1837 = -1;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Z")
    public static volatile boolean field1838 = true;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "[I")
    public static int[] field1839 = new int[5];

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field1846 = 0;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field1842 = 0;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lag;")
    public class211 field1845;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "[[B")
    public static byte[][] field1840;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 18)
    public static void method877(int arg0) {
        field1840 = (byte[][]) null;
        if (arg0 >= -14) {
            field1842 = 47;
        }
        field1839 = null;
    }

    @OriginalMember(owner = "client!aj", name = "run", descriptor = "()V", line = 29)
    public final void run() {
        field1841++;
        this.field1847 = true;
        try {
            while (!this.field1844) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class36 var2 = this.field1843[var1];
                    if (var2 != null) {
                        var2.method250(false);
                    }
                }
                class300.method2068(119, 10L);
                class28.method185((Object) null, this.field1845, (byte) 96);
            }
        } catch (Exception var7) {
            class104.method719((String) null, var7, false);
        } finally {
            this.field1847 = false;
        }
    }
}
