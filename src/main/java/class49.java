import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PDGRVIXR")
public class class49 implements Runnable {

    @OriginalMember(owner = "client!PDGRVIXR", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1362 = new Object();

    @OriginalMember(owner = "client!PDGRVIXR", name = "c", descriptor = "[I")
    public int[] field1364 = new int[500];

    @OriginalMember(owner = "client!PDGRVIXR", name = "d", descriptor = "[I")
    public int[] field1365 = new int[500];

    @OriginalMember(owner = "client!PDGRVIXR", name = "e", descriptor = "Z")
    public boolean field1366 = true;

    @OriginalMember(owner = "client!PDGRVIXR", name = "f", descriptor = "Lclient;")
    public client field1367;

    @OriginalMember(owner = "client!PDGRVIXR", name = "b", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!PDGRVIXR", name = "<init>", descriptor = "(Lclient;I)V")
    public class49(client arg0, int arg1) {
        if (arg1 != 45345) {
            throw new NullPointerException();
        }
        this.field1367 = arg0;
    }

    @OriginalMember(owner = "client!PDGRVIXR", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1366) {
            Object var1 = this.field1362;
            synchronized (this.field1362) {
                if (this.field1363 < 500) {
                    this.field1364[this.field1363] = this.field1367.field896;
                    this.field1365[this.field1363] = this.field1367.field897;
                    this.field1363++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
