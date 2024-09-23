import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HAMMMZGY")
public class class20 implements Runnable {

    @OriginalMember(owner = "HAMMMZGY", name = "a", descriptor = "[I")
    public int[] field901 = new int[500];

    @OriginalMember(owner = "HAMMMZGY", name = "b", descriptor = "Z")
    public boolean field902 = true;

    @OriginalMember(owner = "HAMMMZGY", name = "c", descriptor = "[I")
    public int[] field903 = new int[500];

    @OriginalMember(owner = "HAMMMZGY", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field905 = new Object();

    @OriginalMember(owner = "HAMMMZGY", name = "f", descriptor = "Lclient;")
    public client field906;

    @OriginalMember(owner = "HAMMMZGY", name = "d", descriptor = "I")
    public int field904;

    @OriginalMember(owner = "HAMMMZGY", name = "<init>", descriptor = "(Lclient;I)V")
    public class20(client arg0, int arg1) {
        this.field906 = arg0;
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "HAMMMZGY", name = "run", descriptor = "()V")
    public void run() {
        while (this.field902) {
            Object var1 = this.field905;
            synchronized (this.field905) {
                if (this.field904 < 500) {
                    this.field903[this.field904] = this.field906.field1183;
                    this.field901[this.field904] = this.field906.field1184;
                    this.field904++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
