import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "a", descriptor = "I")
    private int field970 = 9;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Z")
    public boolean field972 = true;

    @OriginalMember(owner = "fc", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field973 = new Object();

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field975 = new int[500];

    @OriginalMember(owner = "fc", name = "g", descriptor = "[I")
    public int[] field976 = new int[500];

    @OriginalMember(owner = "fc", name = "b", descriptor = "Lclient;")
    public client field971;

    @OriginalMember(owner = "fc", name = "e", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(ILclient;)V")
    public MouseTracking(int arg0, client arg1) {
        if (arg0 != 0) {
            this.field970 = -128;
        }
        this.field971 = arg1;
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field972) {
            Object var1 = this.field973;
            synchronized (this.field973) {
                if (this.field974 < 500) {
                    this.field975[this.field974] = this.field971.field23;
                    this.field976[this.field974] = this.field971.field24;
                    this.field974++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
