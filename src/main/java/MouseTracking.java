import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "b", descriptor = "Z")
    public boolean field982 = true;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field983 = new Object();

    @OriginalMember(owner = "fc", name = "e", descriptor = "[I")
    public int[] field985 = new int[500];

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field986 = new int[500];

    @OriginalMember(owner = "fc", name = "a", descriptor = "Lclient;")
    public client field981;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    public int field984;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(Lclient;I)V")
    public MouseTracking(client arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        this.field981 = arg0;
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field982) {
            Object var1 = this.field983;
            synchronized (this.field983) {
                if (this.field984 < 500) {
                    this.field985[this.field984] = this.field981.field23;
                    this.field986[this.field984] = this.field981.field24;
                    this.field984++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
