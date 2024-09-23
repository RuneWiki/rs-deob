import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HFNJDDXC")
public class class18 implements Runnable {

    @OriginalMember(owner = "HFNJDDXC", name = "c", descriptor = "Z")
    public boolean field853 = true;

    @OriginalMember(owner = "HFNJDDXC", name = "d", descriptor = "[I")
    public int[] field854 = new int[500];

    @OriginalMember(owner = "HFNJDDXC", name = "e", descriptor = "[I")
    public int[] field855 = new int[500];

    @OriginalMember(owner = "HFNJDDXC", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field856 = new Object();

    @OriginalMember(owner = "HFNJDDXC", name = "b", descriptor = "Lclient;")
    public client field852;

    @OriginalMember(owner = "HFNJDDXC", name = "a", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "HFNJDDXC", name = "run", descriptor = "()V")
    public void run() {
        while (this.field853) {
            Object var1 = this.field856;
            synchronized (this.field856) {
                if (this.field851 < 500) {
                    this.field855[this.field851] = this.field852.field925;
                    this.field854[this.field851] = this.field852.field926;
                    this.field851++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "HFNJDDXC", name = "<init>", descriptor = "(ILclient;)V")
    public class18(int arg0, client arg1) {
        if (arg0 != 1) {
            throw new NullPointerException();
        }
        this.field852 = arg1;
    }
}
