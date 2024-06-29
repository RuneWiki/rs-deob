import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Z")
    public boolean field1005 = true;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1006 = new Object();

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
    public int[] field1008 = new int[500];

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
    public int[] field1009 = new int[500];

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient;")
    public client field1004;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(BLclient;)V")
    public MouseTracking(byte arg0, client arg1) {
        if (arg0 != -41) {
            throw new NullPointerException();
        }
        this.field1004 = arg1;
    }

    @OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1005) {
            Object var1 = this.field1006;
            synchronized (this.field1006) {
                if (this.field1007 < 500) {
                    this.field1008[this.field1007] = this.field1004.field24;
                    this.field1009[this.field1007] = this.field1004.field25;
                    this.field1007++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
