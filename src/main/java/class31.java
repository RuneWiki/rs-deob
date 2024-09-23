import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LZVLFSBA")
public class class31 implements Runnable {

    @OriginalMember(owner = "LZVLFSBA", name = "a", descriptor = "[I")
    public int[] field1056 = new int[500];

    @OriginalMember(owner = "LZVLFSBA", name = "b", descriptor = "[I")
    public int[] field1057 = new int[500];

    @OriginalMember(owner = "LZVLFSBA", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1058 = new Object();

    @OriginalMember(owner = "LZVLFSBA", name = "f", descriptor = "Z")
    public boolean field1061 = true;

    @OriginalMember(owner = "LZVLFSBA", name = "e", descriptor = "Lclient;")
    public client field1060;

    @OriginalMember(owner = "LZVLFSBA", name = "d", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "LZVLFSBA", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1061) {
            Object var1 = this.field1058;
            synchronized (this.field1058) {
                if (this.field1059 < 500) {
                    this.field1057[this.field1059] = this.field1060.field542;
                    this.field1056[this.field1059] = this.field1060.field543;
                    this.field1059++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "LZVLFSBA", name = "<init>", descriptor = "(BLclient;)V")
    public class31(byte arg0, client arg1) {
        this.field1060 = arg1;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        boolean var3 = false;
    }
}
