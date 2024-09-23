import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "b", descriptor = "Z")
    public boolean field1000 = true;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1001 = new Object();

    @OriginalMember(owner = "fc", name = "e", descriptor = "[I")
    public int[] field1003 = new int[500];

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field1004 = new int[500];

    @OriginalMember(owner = "fc", name = "a", descriptor = "Lclient;")
    public client field999;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(ILclient;)V")
    public MouseTracking(int arg0, client arg1) {
        this.field999 = arg1;
        int var3 = 80 / arg0;
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1000) {
            Object var1 = this.field1001;
            synchronized (this.field1001) {
                if (this.field1002 < 500) {
                    this.field1003[this.field1002] = this.field999.field23;
                    this.field1004[this.field1002] = this.field999.field24;
                    this.field1002++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
