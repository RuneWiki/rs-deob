import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "b", descriptor = "Z")
    public boolean field1006 = true;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1007 = new Object();

    @OriginalMember(owner = "fc", name = "e", descriptor = "[I")
    public int[] field1009 = new int[500];

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field1010 = new int[500];

    @OriginalMember(owner = "fc", name = "a", descriptor = "Lclient;")
    public client field1005;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    public int field1008;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(ZLclient;)V")
    public MouseTracking(boolean arg0, client arg1) {
        this.field1005 = arg1;
        if (arg0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1006) {
            Object var1 = this.field1007;
            synchronized (this.field1007) {
                if (this.field1008 < 500) {
                    this.field1009[this.field1008] = this.field1005.field27;
                    this.field1010[this.field1008] = this.field1005.field28;
                    this.field1008++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
