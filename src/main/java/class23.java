import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IKKPZVXM")
public class class23 implements Runnable {

    @OriginalMember(owner = "client!IKKPZVXM", name = "a", descriptor = "[I")
    public int[] field895 = new int[500];

    @OriginalMember(owner = "client!IKKPZVXM", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field896 = new Object();

    @OriginalMember(owner = "client!IKKPZVXM", name = "c", descriptor = "Z")
    public boolean field897 = true;

    @OriginalMember(owner = "client!IKKPZVXM", name = "f", descriptor = "[I")
    public int[] field900 = new int[500];

    @OriginalMember(owner = "client!IKKPZVXM", name = "e", descriptor = "Lclient;")
    public client field899;

    @OriginalMember(owner = "client!IKKPZVXM", name = "d", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!IKKPZVXM", name = "run", descriptor = "()V")
    public void run() {
        while (this.field897) {
            Object var1 = this.field896;
            synchronized (this.field896) {
                if (this.field898 < 500) {
                    this.field895[this.field898] = this.field899.field785;
                    this.field900[this.field898] = this.field899.field786;
                    this.field898++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!IKKPZVXM", name = "<init>", descriptor = "(Lclient;I)V")
    public class23(client arg0, int arg1) {
        if (arg1 != -30992) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field899 = arg0;
    }
}
