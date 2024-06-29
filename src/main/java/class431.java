import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class431 implements Runnable {

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "[Lfr;")
    public volatile class105[] field6281 = new class105[2];

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "Z")
    public volatile boolean field6278 = false;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "Z")
    public volatile boolean field6280 = false;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "Lvq;")
    public static class24 field6279 = new class24(25, 8);

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "Z")
    public static volatile boolean field6283 = false;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "Lgt;")
    public class341 field6282;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "Llf;")
    public static class350 field6284;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 12)
    public static void method2648(int arg0) {
        field6279 = null;
        field6284 = null;
        if (arg0 > -33) {
            field6284 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "run", descriptor = "()V", line = 35)
    public final void run() {
        field6276++;
        this.field6280 = true;
        try {
            while (!this.field6278) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class105 var2 = this.field6281[var1];
                    if (var2 != null) {
                        var2.method748(true);
                    }
                }
                class418.method2587(false, 10L);
                class149.method1025(this.field6282, (Object) null, 20897);
            }
        } catch (Exception var9) {
            class365.method2331((String) null, var9, 28692);
        } finally {
            Object var6 = null;
            this.field6280 = false;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)I", line = 78)
    public static final int method2649(int arg0, int arg1) {
        if (arg1 == -213850777) {
            field6277++;
            return arg0 >>> 7;
        } else {
            return 17;
        }
    }
}
