import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Z")
    private boolean field989 = true;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
    public boolean field991 = true;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field992 = new Object();

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
    public int[] field994 = new int[500];

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
    public int[] field995 = new int[500];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient;")
    public client field990;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILclient;)V")
    public MouseTracking(int arg0, client arg1) {
        this.field990 = arg1;
        if (arg0 != -39788) {
            this.field989 = !this.field989;
        }
    }

    @OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field991) {
            Object var1 = this.field992;
            synchronized (this.field992) {
                if (this.field993 < 500) {
                    this.field994[this.field993] = this.field990.field22;
                    this.field995[this.field993] = this.field990.field23;
                    this.field993++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
