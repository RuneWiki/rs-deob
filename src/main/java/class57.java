import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("TTQEUGTP")
public class class57 implements Runnable {

    @OriginalMember(owner = "TTQEUGTP", name = "b", descriptor = "Z")
    private boolean field1402 = false;

    @OriginalMember(owner = "TTQEUGTP", name = "c", descriptor = "[I")
    public int[] field1403 = new int[500];

    @OriginalMember(owner = "TTQEUGTP", name = "e", descriptor = "[I")
    public int[] field1405 = new int[500];

    @OriginalMember(owner = "TTQEUGTP", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1406 = new Object();

    @OriginalMember(owner = "TTQEUGTP", name = "g", descriptor = "Z")
    public boolean field1407 = true;

    @OriginalMember(owner = "TTQEUGTP", name = "a", descriptor = "Lclient;")
    public client field1401;

    @OriginalMember(owner = "TTQEUGTP", name = "d", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "TTQEUGTP", name = "<init>", descriptor = "(ILclient;)V")
    public class57(int arg0, client arg1) {
        this.field1401 = arg1;
        if (arg0 != 0) {
            this.field1402 = !this.field1402;
        }
    }

    @OriginalMember(owner = "TTQEUGTP", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1407) {
            Object var1 = this.field1406;
            synchronized (this.field1406) {
                if (this.field1404 < 500) {
                    this.field1403[this.field1404] = this.field1401.field1108;
                    this.field1405[this.field1404] = this.field1401.field1109;
                    this.field1404++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
