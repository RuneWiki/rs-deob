import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "gc", name = "a", descriptor = "Z")
    private boolean field993 = false;

    @OriginalMember(owner = "gc", name = "c", descriptor = "Z")
    public boolean field995 = true;

    @OriginalMember(owner = "gc", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field996 = new Object();

    @OriginalMember(owner = "gc", name = "f", descriptor = "[I")
    public int[] field998 = new int[500];

    @OriginalMember(owner = "gc", name = "g", descriptor = "[I")
    public int[] field999 = new int[500];

    @OriginalMember(owner = "gc", name = "b", descriptor = "Lclient;")
    public client field994;

    @OriginalMember(owner = "gc", name = "e", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "gc", name = "<init>", descriptor = "(Lclient;I)V")
    public MouseTracking(client arg0, int arg1) {
        this.field994 = arg0;
        if (arg1 >= 0) {
            this.field993 = !this.field993;
        }
    }

    @OriginalMember(owner = "gc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field995) {
            Object var1 = this.field996;
            synchronized (this.field996) {
                if (this.field997 < 500) {
                    this.field998[this.field997] = this.field994.field21;
                    this.field999[this.field997] = this.field994.field22;
                    this.field997++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
