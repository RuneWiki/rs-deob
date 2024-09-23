import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "c", descriptor = "Z")
    public boolean field985 = true;

    @OriginalMember(owner = "fc", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field986 = new Object();

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field988 = new int[500];

    @OriginalMember(owner = "fc", name = "g", descriptor = "[I")
    public int[] field989 = new int[500];

    @OriginalMember(owner = "fc", name = "b", descriptor = "Lclient;")
    public client field984;

    @OriginalMember(owner = "fc", name = "a", descriptor = "I")
    private int field983;

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(ILclient;)V")
    public MouseTracking(int arg0, client arg1) {
        this.field984 = arg1;
        if (arg0 != 0) {
            this.field983 = 195;
        }
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field985) {
            Object var1 = this.field986;
            synchronized (this.field986) {
                if (this.field987 < 500) {
                    this.field988[this.field987] = this.field984.field22;
                    this.field989[this.field987] = this.field984.field23;
                    this.field987++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
