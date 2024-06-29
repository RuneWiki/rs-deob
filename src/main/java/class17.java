import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!FDKYSOCX")
public class class17 implements Runnable {

    @OriginalMember(owner = "client!FDKYSOCX", name = "a", descriptor = "[I")
    public int[] field887 = new int[500];

    @OriginalMember(owner = "client!FDKYSOCX", name = "d", descriptor = "Z")
    public boolean field890 = true;

    @OriginalMember(owner = "client!FDKYSOCX", name = "e", descriptor = "[I")
    public int[] field891 = new int[500];

    @OriginalMember(owner = "client!FDKYSOCX", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field892 = new Object();

    @OriginalMember(owner = "client!FDKYSOCX", name = "b", descriptor = "Lclient;")
    public client field888;

    @OriginalMember(owner = "client!FDKYSOCX", name = "c", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!FDKYSOCX", name = "<init>", descriptor = "(BLclient;)V")
    public class17(byte arg0, client arg1) {
        this.field888 = arg1;
        if (arg0 != -60) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!FDKYSOCX", name = "run", descriptor = "()V")
    public void run() {
        while (this.field890) {
            Object var1 = this.field892;
            synchronized (this.field892) {
                if (this.field889 < 500) {
                    this.field891[this.field889] = this.field888.field803;
                    this.field887[this.field889] = this.field888.field804;
                    this.field889++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
