import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "a", descriptor = "I")
    private int field982 = 11300;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Z")
    public boolean field984 = true;

    @OriginalMember(owner = "fc", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field985 = new Object();

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field987 = new int[500];

    @OriginalMember(owner = "fc", name = "g", descriptor = "[I")
    public int[] field988 = new int[500];

    @OriginalMember(owner = "fc", name = "b", descriptor = "Lclient;")
    public client field983;

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(Lclient;Z)V")
    public MouseTracking(client arg0, boolean arg1) {
        if (!arg1) {
            this.field982 = 217;
        }
        this.field983 = arg0;
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field984) {
            Object var1 = this.field985;
            synchronized (this.field985) {
                if (this.field986 < 500) {
                    this.field987[this.field986] = this.field983.field21;
                    this.field988[this.field986] = this.field983.field22;
                    this.field986++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
