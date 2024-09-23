import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "a", descriptor = "I")
    private int field997 = -1399;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Z")
    public boolean field999 = true;

    @OriginalMember(owner = "fc", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field1000 = new Object();

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field1002 = new int[500];

    @OriginalMember(owner = "fc", name = "g", descriptor = "[I")
    public int[] field1003 = new int[500];

    @OriginalMember(owner = "fc", name = "b", descriptor = "Lclient;")
    public client field998;

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(ZLclient;)V")
    public MouseTracking(boolean arg0, client arg1) {
        this.field998 = arg1;
        if (arg0) {
            this.field997 = 28;
        }
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field999) {
            Object var1 = this.field1000;
            synchronized (this.field1000) {
                if (this.field1001 < 500) {
                    this.field1002[this.field1001] = this.field998.field22;
                    this.field1003[this.field1001] = this.field998.field23;
                    this.field1001++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
