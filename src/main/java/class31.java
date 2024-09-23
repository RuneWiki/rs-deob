import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JHNSGCOV")
public class class31 implements Runnable {

    @OriginalMember(owner = "JHNSGCOV", name = "a", descriptor = "Z")
    private boolean field991 = true;

    @OriginalMember(owner = "JHNSGCOV", name = "b", descriptor = "[I")
    public int[] field992 = new int[500];

    @OriginalMember(owner = "JHNSGCOV", name = "c", descriptor = "[I")
    public int[] field993 = new int[500];

    @OriginalMember(owner = "JHNSGCOV", name = "d", descriptor = "Z")
    public boolean field994 = true;

    @OriginalMember(owner = "JHNSGCOV", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field996 = new Object();

    @OriginalMember(owner = "JHNSGCOV", name = "e", descriptor = "Lclient;")
    public client field995;

    @OriginalMember(owner = "JHNSGCOV", name = "g", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "JHNSGCOV", name = "<init>", descriptor = "(Lclient;I)V")
    public class31(client arg0, int arg1) {
        this.field995 = arg0;
        if (arg1 >= 0) {
            this.field991 = !this.field991;
        }
    }

    @OriginalMember(owner = "JHNSGCOV", name = "run", descriptor = "()V")
    public void run() {
        while (this.field994) {
            Object var1 = this.field996;
            synchronized (this.field996) {
                if (this.field997 < 500) {
                    this.field992[this.field997] = this.field995.field972;
                    this.field993[this.field997] = this.field995.field973;
                    this.field997++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
