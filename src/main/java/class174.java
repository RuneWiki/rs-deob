import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class174 extends class512 implements Runnable {

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public int field2684 = -1;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "Z")
    private boolean field2688 = true;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Lhn;")
    private class64 field2687;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "[S")
    public static short[] field2683 = new short[256];

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field2685 = 0;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public final void method1239(int arg0) {
        (new Thread(this, "a")).start();
        if (arg0 == 256) {
            field2686++;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
    public final void method1240(boolean arg0) {
        if (!arg0) {
            method1242((byte) 19);
        }
        field2682++;
        this.field2688 = false;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V")
    public static final void method1241(int arg0, int arg1, int arg2) {
        class281 var3 = class348.field5192[arg0][arg1][arg2];
        if (var3 != null && var3.field4371 != null) {
            var3.field4371 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "run", descriptor = "()V")
    public final void run() {
        field2681++;
        while (this.field2688) {
            this.field2687.method428(this, -38);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
    public static void method1242(byte arg0) {
        if (arg0 >= 33) {
            field2683 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lhn;)V")
    public class174(class64 arg0) {
        this.field2687 = arg0;
    }
}
