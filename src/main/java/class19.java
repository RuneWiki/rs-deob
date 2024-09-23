import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("EIPZGSZT")
public class class19 implements Runnable {

    @OriginalMember(owner = "EIPZGSZT", name = "a", descriptor = "[I")
    public int[] field666 = new int[500];

    @OriginalMember(owner = "EIPZGSZT", name = "b", descriptor = "[I")
    public int[] field667 = new int[500];

    @OriginalMember(owner = "EIPZGSZT", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field668 = new Object();

    @OriginalMember(owner = "EIPZGSZT", name = "e", descriptor = "Z")
    public boolean field670 = true;

    @OriginalMember(owner = "EIPZGSZT", name = "d", descriptor = "Lclient;")
    public client field669;

    @OriginalMember(owner = "EIPZGSZT", name = "f", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "EIPZGSZT", name = "<init>", descriptor = "(Lclient;I)V")
    public class19(client arg0, int arg1) {
        this.field669 = arg0;
        if (arg1 != -13743) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "EIPZGSZT", name = "run", descriptor = "()V")
    public void run() {
        while (this.field670) {
            Object var1 = this.field668;
            synchronized (this.field668) {
                if (this.field671 < 500) {
                    this.field667[this.field671] = this.field669.field1630;
                    this.field666[this.field671] = this.field669.field1631;
                    this.field671++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
