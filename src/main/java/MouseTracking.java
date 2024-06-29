import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Z")
    public boolean field977 = true;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field978 = new Object();

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[I")
    public int[] field980 = new int[500];

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[I")
    public int[] field981 = new int[500];

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient;")
    public client field976;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(ILclient;)V")
    public MouseTracking(int arg0, client arg1) {
        this.field976 = arg1;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "run", descriptor = "()V")
    public void run() {
        while (this.field977) {
            Object var1 = this.field978;
            synchronized (this.field978) {
                if (this.field979 < 500) {
                    this.field980[this.field979] = this.field976.field23;
                    this.field981[this.field979] = this.field976.field24;
                    this.field979++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
