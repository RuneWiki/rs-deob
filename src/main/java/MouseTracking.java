import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "b", descriptor = "Z")
    public boolean field997 = true;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field998 = new Object();

    @OriginalMember(owner = "fc", name = "e", descriptor = "[I")
    public int[] field1000 = new int[500];

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field1001 = new int[500];

    @OriginalMember(owner = "fc", name = "a", descriptor = "Lclient;")
    public client field996;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(ILclient;)V")
    public MouseTracking(int arg0, client arg1) {
        int var3 = 31 / arg0;
        this.field996 = arg1;
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field997) {
            Object var1 = this.field998;
            synchronized (this.field998) {
                if (this.field999 < 500) {
                    this.field1000[this.field999] = this.field996.field21;
                    this.field1001[this.field999] = this.field996.field22;
                    this.field999++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
