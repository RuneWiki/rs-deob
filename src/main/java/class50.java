import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QVSTBDDY")
public class class50 implements Runnable {

    @OriginalMember(owner = "client!QVSTBDDY", name = "a", descriptor = "[I")
    public int[] field1500 = new int[500];

    @OriginalMember(owner = "client!QVSTBDDY", name = "b", descriptor = "[I")
    public int[] field1501 = new int[500];

    @OriginalMember(owner = "client!QVSTBDDY", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1502 = new Object();

    @OriginalMember(owner = "client!QVSTBDDY", name = "e", descriptor = "Z")
    public boolean field1504 = true;

    @OriginalMember(owner = "client!QVSTBDDY", name = "f", descriptor = "I")
    private int field1505 = 25912;

    @OriginalMember(owner = "client!QVSTBDDY", name = "d", descriptor = "Lclient;")
    public client field1503;

    @OriginalMember(owner = "client!QVSTBDDY", name = "g", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!QVSTBDDY", name = "<init>", descriptor = "(ZLclient;)V")
    public class50(boolean arg0, client arg1) {
        if (!arg0) {
            this.field1505 = 286;
        }
        this.field1503 = arg1;
    }

    @OriginalMember(owner = "client!QVSTBDDY", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1504) {
            Object var1 = this.field1502;
            synchronized (this.field1502) {
                if (this.field1506 < 500) {
                    this.field1500[this.field1506] = this.field1503.field88;
                    this.field1501[this.field1506] = this.field1503.field89;
                    this.field1506++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
