import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class23 implements Runnable {

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "[Lni;")
    public volatile class20[] field386 = new class20[2];

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Z")
    public volatile boolean field387 = false;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "Z")
    public volatile boolean field384 = false;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field377 = 0;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[Lnk;")
    public static class11[] field385 = new class11[50];

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "[I")
    public static int[] field383 = new int[1000];

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Luc;")
    public class160 field380;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lp;")
    public static class82 field379;

    @OriginalMember(owner = "client!sd", name = "run", descriptor = "()V")
    public final void run() {
        this.field384 = true;
        try {
            while (!this.field387) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class20 var2 = this.field386[var1];
                    if (var2 != null) {
                        var2.method140(16384);
                    }
                }
                class212.method1488(10L, -18);
                class197.method1418((Object) null, -28826, this.field380);
            }
        } catch (Exception var9) {
            class3.method33((String) null, var9, (byte) 127);
        } finally {
            Object var6 = null;
            this.field384 = false;
        }
        field382++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method157(byte arg0) {
        if (arg0 == -80) {
            field383 = null;
            field379 = null;
            field385 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static final void method158(boolean arg0) {
        class240.field4277.method80(-14113);
        class81.field1407.method80(-14113);
        field378++;
        if (!arg0) {
            method157((byte) 110);
        }
    }
}
