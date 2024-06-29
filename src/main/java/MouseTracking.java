import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZIJPRJEC")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "client!ZIJPRJEC", name = "b", descriptor = "Ljava/lang/Object;")
    public Object lock = new Object();

    @OriginalMember(owner = "client!ZIJPRJEC", name = "c", descriptor = "[I")
    public int[] y = new int[500];

    @OriginalMember(owner = "client!ZIJPRJEC", name = "d", descriptor = "Z")
    public boolean active = true;

    @OriginalMember(owner = "client!ZIJPRJEC", name = "e", descriptor = "[I")
    public int[] x = new int[500];

    @OriginalMember(owner = "client!ZIJPRJEC", name = "a", descriptor = "Lclient;")
    public client app;

    @OriginalMember(owner = "client!ZIJPRJEC", name = "f", descriptor = "I")
    public int length;

    @OriginalMember(owner = "client!ZIJPRJEC", name = "run", descriptor = "()V")
    public void run() {
        while (this.active) {
            Object var1 = this.lock;
            synchronized (this.lock) {
                if (this.length < 500) {
                    this.x[this.length] = this.app.mouseX;
                    this.y[this.length] = this.app.mouseY;
                    this.length++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!ZIJPRJEC", name = "<init>", descriptor = "(Lclient;I)V")
    public MouseTracking(client arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        this.app = arg0;
    }
}
