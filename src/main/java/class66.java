import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("VCAZMAEX")
public class class66 implements Runnable {

    @OriginalMember(owner = "VCAZMAEX", name = "a", descriptor = "Z")
    private boolean field1644 = true;

    @OriginalMember(owner = "VCAZMAEX", name = "b", descriptor = "[I")
    public int[] field1645 = new int[500];

    @OriginalMember(owner = "VCAZMAEX", name = "d", descriptor = "[I")
    public int[] field1647 = new int[500];

    @OriginalMember(owner = "VCAZMAEX", name = "e", descriptor = "Z")
    public boolean field1648 = true;

    @OriginalMember(owner = "VCAZMAEX", name = "f", descriptor = "Z")
    private boolean field1649 = true;

    @OriginalMember(owner = "VCAZMAEX", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field1651 = new Object();

    @OriginalMember(owner = "VCAZMAEX", name = "c", descriptor = "Lclient;")
    public client field1646;

    @OriginalMember(owner = "VCAZMAEX", name = "g", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "VCAZMAEX", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1648) {
            Object var1 = this.field1651;
            synchronized (this.field1651) {
                if (this.field1650 < 500) {
                    this.field1647[this.field1650] = this.field1646.field103;
                    this.field1645[this.field1650] = this.field1646.field104;
                    this.field1650++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "VCAZMAEX", name = "<init>", descriptor = "(ZLclient;)V")
    public class66(boolean arg0, client arg1) {
        this.field1646 = arg1;
        if (!arg0) {
            this.field1649 = !this.field1649;
        }
    }
}
