import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UVFIVFPB")
public class class53 implements Runnable {

    @OriginalMember(owner = "client!UVFIVFPB", name = "a", descriptor = "Z")
    public boolean field1540 = true;

    @OriginalMember(owner = "client!UVFIVFPB", name = "b", descriptor = "I")
    private int field1541 = 49578;

    @OriginalMember(owner = "client!UVFIVFPB", name = "c", descriptor = "[I")
    public int[] field1542 = new int[500];

    @OriginalMember(owner = "client!UVFIVFPB", name = "e", descriptor = "[I")
    public int[] field1544 = new int[500];

    @OriginalMember(owner = "client!UVFIVFPB", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field1546 = new Object();

    @OriginalMember(owner = "client!UVFIVFPB", name = "f", descriptor = "Lclient;")
    public client field1545;

    @OriginalMember(owner = "client!UVFIVFPB", name = "d", descriptor = "I")
    public int field1543;

    @OriginalMember(owner = "client!UVFIVFPB", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1540) {
            Object var1 = this.field1546;
            synchronized (this.field1546) {
                if (this.field1543 < 500) {
                    this.field1544[this.field1543] = this.field1545.field946;
                    this.field1542[this.field1543] = this.field1545.field947;
                    this.field1543++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!UVFIVFPB", name = "<init>", descriptor = "(Lclient;I)V")
    public class53(client arg0, int arg1) {
        if (arg1 >= 0) {
            this.field1541 = -188;
        }
        this.field1545 = arg0;
    }
}
