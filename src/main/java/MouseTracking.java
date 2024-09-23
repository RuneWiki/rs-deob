import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "b", descriptor = "Z")
    public boolean field981 = true;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field982 = new Object();

    @OriginalMember(owner = "fc", name = "e", descriptor = "[I")
    public int[] field984 = new int[500];

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field985 = new int[500];

    @OriginalMember(owner = "fc", name = "a", descriptor = "Lclient;")
    public client field980;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(ILclient;)V")
    public MouseTracking(int arg0, client arg1) {
        if (arg0 != -16285) {
            throw new NullPointerException();
        }
        this.field980 = arg1;
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field981) {
            Object var1 = this.field982;
            synchronized (this.field982) {
                if (this.field983 < 500) {
                    this.field984[this.field983] = this.field980.field21;
                    this.field985[this.field983] = this.field980.field22;
                    this.field983++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
