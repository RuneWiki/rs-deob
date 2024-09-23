import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NIZPXICY")
public class class40 implements Runnable {

    @OriginalMember(owner = "NIZPXICY", name = "a", descriptor = "Z")
    public boolean field1133 = true;

    @OriginalMember(owner = "NIZPXICY", name = "b", descriptor = "[I")
    public int[] field1134 = new int[500];

    @OriginalMember(owner = "NIZPXICY", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field1136 = new Object();

    @OriginalMember(owner = "NIZPXICY", name = "f", descriptor = "[I")
    public int[] field1138 = new int[500];

    @OriginalMember(owner = "NIZPXICY", name = "c", descriptor = "Lclient;")
    public client field1135;

    @OriginalMember(owner = "NIZPXICY", name = "e", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "NIZPXICY", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1133) {
            Object var1 = this.field1136;
            synchronized (this.field1136) {
                if (this.field1137 < 500) {
                    this.field1138[this.field1137] = this.field1135.field812;
                    this.field1134[this.field1137] = this.field1135.field813;
                    this.field1137++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "NIZPXICY", name = "<init>", descriptor = "(Lclient;I)V")
    public class40(client arg0, int arg1) {
        if (arg1 != -14552) {
            throw new NullPointerException();
        }
        this.field1135 = arg0;
    }
}
