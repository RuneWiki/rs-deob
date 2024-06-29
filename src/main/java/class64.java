import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VXFBFZWJ")
public class class64 implements Runnable {

    @OriginalMember(owner = "client!VXFBFZWJ", name = "a", descriptor = "Z")
    public boolean field1562 = true;

    @OriginalMember(owner = "client!VXFBFZWJ", name = "d", descriptor = "[I")
    public int[] field1565 = new int[500];

    @OriginalMember(owner = "client!VXFBFZWJ", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field1566 = new Object();

    @OriginalMember(owner = "client!VXFBFZWJ", name = "f", descriptor = "[I")
    public int[] field1567 = new int[500];

    @OriginalMember(owner = "client!VXFBFZWJ", name = "b", descriptor = "Lclient;")
    public client field1563;

    @OriginalMember(owner = "client!VXFBFZWJ", name = "c", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!VXFBFZWJ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1562) {
            Object var1 = this.field1566;
            synchronized (this.field1566) {
                if (this.field1564 < 500) {
                    this.field1565[this.field1564] = this.field1563.field19;
                    this.field1567[this.field1564] = this.field1563.field20;
                    this.field1564++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!VXFBFZWJ", name = "<init>", descriptor = "(ZLclient;)V")
    public class64(boolean arg0, client arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field1563 = arg1;
    }
}
