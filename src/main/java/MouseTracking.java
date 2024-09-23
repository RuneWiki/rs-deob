import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "a", descriptor = "Z")
    private boolean field991 = false;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Z")
    public boolean field993 = true;

    @OriginalMember(owner = "fc", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field994 = new Object();

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field996 = new int[500];

    @OriginalMember(owner = "fc", name = "g", descriptor = "[I")
    public int[] field997 = new int[500];

    @OriginalMember(owner = "fc", name = "b", descriptor = "Lclient;")
    public client field992;

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public int field995;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(ILclient;)V")
    public MouseTracking(int arg0, client arg1) {
        this.field992 = arg1;
        if (arg0 != 0) {
            this.field991 = !this.field991;
        }
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field993) {
            Object var1 = this.field994;
            synchronized (this.field994) {
                if (this.field995 < 500) {
                    this.field996[this.field995] = this.field992.field24;
                    this.field997[this.field995] = this.field992.field25;
                    this.field995++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
