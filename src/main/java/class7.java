import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("CNFMYDSL")
public class class7 implements Runnable {

    @OriginalMember(owner = "CNFMYDSL", name = "c", descriptor = "Z")
    public boolean field605 = true;

    @OriginalMember(owner = "CNFMYDSL", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field606 = new Object();

    @OriginalMember(owner = "CNFMYDSL", name = "e", descriptor = "[I")
    public int[] field607 = new int[500];

    @OriginalMember(owner = "CNFMYDSL", name = "f", descriptor = "[I")
    public int[] field608 = new int[500];

    @OriginalMember(owner = "CNFMYDSL", name = "b", descriptor = "Lclient;")
    public client field604;

    @OriginalMember(owner = "CNFMYDSL", name = "a", descriptor = "I")
    public int field603;

    @OriginalMember(owner = "CNFMYDSL", name = "<init>", descriptor = "(ILclient;)V")
    public class7(int arg0, client arg1) {
        this.field604 = arg1;
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "CNFMYDSL", name = "run", descriptor = "()V")
    public void run() {
        while (this.field605) {
            Object var1 = this.field606;
            synchronized (this.field606) {
                if (this.field603 < 500) {
                    this.field607[this.field603] = this.field604.field913;
                    this.field608[this.field603] = this.field604.field914;
                    this.field603++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
