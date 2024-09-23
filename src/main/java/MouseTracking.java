import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "fc", name = "b", descriptor = "Z")
    public boolean field986 = true;

    @OriginalMember(owner = "fc", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field987 = new Object();

    @OriginalMember(owner = "fc", name = "e", descriptor = "[I")
    public int[] field989 = new int[500];

    @OriginalMember(owner = "fc", name = "f", descriptor = "[I")
    public int[] field990 = new int[500];

    @OriginalMember(owner = "fc", name = "a", descriptor = "Lclient;")
    public client field985;

    @OriginalMember(owner = "fc", name = "d", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "fc", name = "<init>", descriptor = "(Lclient;I)V")
    public MouseTracking(client arg0, int arg1) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field985 = arg0;
    }

    @OriginalMember(owner = "fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field986) {
            Object var1 = this.field987;
            synchronized (this.field987) {
                if (this.field988 < 500) {
                    this.field989[this.field988] = this.field985.field22;
                    this.field990[this.field988] = this.field985.field23;
                    this.field988++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
