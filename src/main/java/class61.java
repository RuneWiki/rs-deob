import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WTODRXXL")
public class class61 implements Runnable {

    @OriginalMember(owner = "WTODRXXL", name = "a", descriptor = "[I")
    public int[] field1581 = new int[500];

    @OriginalMember(owner = "WTODRXXL", name = "b", descriptor = "Z")
    public boolean field1582 = true;

    @OriginalMember(owner = "WTODRXXL", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1583 = new Object();

    @OriginalMember(owner = "WTODRXXL", name = "d", descriptor = "[I")
    public int[] field1584 = new int[500];

    @OriginalMember(owner = "WTODRXXL", name = "e", descriptor = "Lclient;")
    public client field1585;

    @OriginalMember(owner = "WTODRXXL", name = "f", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "WTODRXXL", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1582) {
            Object var1 = this.field1583;
            synchronized (this.field1583) {
                if (this.field1586 < 500) {
                    this.field1581[this.field1586] = this.field1585.field79;
                    this.field1584[this.field1586] = this.field1585.field80;
                    this.field1586++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "WTODRXXL", name = "<init>", descriptor = "(Lclient;I)V")
    public class61(client arg0, int arg1) {
        int var3 = 20 / arg1;
        this.field1585 = arg0;
    }
}
