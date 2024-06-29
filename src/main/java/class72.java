import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZZMUCPQP")
public class class72 implements Runnable {

    @OriginalMember(owner = "client!ZZMUCPQP", name = "a", descriptor = "[I")
    public int[] field1724 = new int[500];

    @OriginalMember(owner = "client!ZZMUCPQP", name = "c", descriptor = "Z")
    private boolean field1726 = false;

    @OriginalMember(owner = "client!ZZMUCPQP", name = "d", descriptor = "[I")
    public int[] field1727 = new int[500];

    @OriginalMember(owner = "client!ZZMUCPQP", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field1728 = new Object();

    @OriginalMember(owner = "client!ZZMUCPQP", name = "f", descriptor = "Z")
    public boolean field1729 = true;

    @OriginalMember(owner = "client!ZZMUCPQP", name = "b", descriptor = "Lclient;")
    public client field1725;

    @OriginalMember(owner = "client!ZZMUCPQP", name = "g", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!ZZMUCPQP", name = "<init>", descriptor = "(ILclient;)V")
    public class72(int arg0, client arg1) {
        if (arg0 != 17029) {
            this.field1726 = !this.field1726;
        }
        this.field1725 = arg1;
    }

    @OriginalMember(owner = "client!ZZMUCPQP", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1729) {
            Object var1 = this.field1728;
            synchronized (this.field1728) {
                if (this.field1730 < 500) {
                    this.field1727[this.field1730] = this.field1725.field586;
                    this.field1724[this.field1730] = this.field1725.field587;
                    this.field1730++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
