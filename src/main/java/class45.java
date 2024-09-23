import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PTSFQSMJ")
public class class45 implements Runnable {

    @OriginalMember(owner = "PTSFQSMJ", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1385 = new Object();

    @OriginalMember(owner = "PTSFQSMJ", name = "c", descriptor = "[I")
    public int[] field1387 = new int[500];

    @OriginalMember(owner = "PTSFQSMJ", name = "d", descriptor = "Z")
    public boolean field1388 = true;

    @OriginalMember(owner = "PTSFQSMJ", name = "f", descriptor = "[I")
    public int[] field1390 = new int[500];

    @OriginalMember(owner = "PTSFQSMJ", name = "e", descriptor = "Lclient;")
    public client field1389;

    @OriginalMember(owner = "PTSFQSMJ", name = "b", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "PTSFQSMJ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1388) {
            Object var1 = this.field1385;
            synchronized (this.field1385) {
                if (this.field1386 < 500) {
                    this.field1390[this.field1386] = this.field1389.field1562;
                    this.field1387[this.field1386] = this.field1389.field1563;
                    this.field1386++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "PTSFQSMJ", name = "<init>", descriptor = "(Lclient;B)V")
    public class45(client arg0, byte arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field1389 = arg0;
    }
}
