import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JUGCSXVJ")
public class class26 implements Runnable {

    @OriginalMember(owner = "JUGCSXVJ", name = "a", descriptor = "[I")
    public int[] field884 = new int[500];

    @OriginalMember(owner = "JUGCSXVJ", name = "c", descriptor = "Z")
    public boolean field886 = true;

    @OriginalMember(owner = "JUGCSXVJ", name = "d", descriptor = "[I")
    public int[] field887 = new int[500];

    @OriginalMember(owner = "JUGCSXVJ", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field888 = new Object();

    @OriginalMember(owner = "JUGCSXVJ", name = "g", descriptor = "I")
    private int field890 = -965;

    @OriginalMember(owner = "JUGCSXVJ", name = "b", descriptor = "Lclient;")
    public client field885;

    @OriginalMember(owner = "JUGCSXVJ", name = "f", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "JUGCSXVJ", name = "<init>", descriptor = "(ILclient;)V")
    public class26(int arg0, client arg1) {
        if (arg0 != 0) {
            this.field890 = -244;
        }
        this.field885 = arg1;
    }

    @OriginalMember(owner = "JUGCSXVJ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field886) {
            Object var1 = this.field888;
            synchronized (this.field888) {
                if (this.field889 < 500) {
                    this.field884[this.field889] = this.field885.field1527;
                    this.field887[this.field889] = this.field885.field1528;
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
