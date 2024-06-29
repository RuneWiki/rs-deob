import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JAGFVRIK")
public class class20 implements Runnable {

    @OriginalMember(owner = "client!JAGFVRIK", name = "b", descriptor = "[I")
    public int[] field878 = new int[500];

    @OriginalMember(owner = "client!JAGFVRIK", name = "c", descriptor = "Z")
    public boolean field879 = true;

    @OriginalMember(owner = "client!JAGFVRIK", name = "d", descriptor = "[I")
    public int[] field880 = new int[500];

    @OriginalMember(owner = "client!JAGFVRIK", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field881 = new Object();

    @OriginalMember(owner = "client!JAGFVRIK", name = "f", descriptor = "Lclient;")
    public client field882;

    @OriginalMember(owner = "client!JAGFVRIK", name = "a", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!JAGFVRIK", name = "run", descriptor = "()V")
    public void run() {
        while (this.field879) {
            Object var1 = this.field881;
            synchronized (this.field881) {
                if (this.field877 < 500) {
                    this.field880[this.field877] = this.field882.field1573;
                    this.field878[this.field877] = this.field882.field1574;
                    this.field877++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!JAGFVRIK", name = "<init>", descriptor = "(Lclient;B)V")
    public class20(client arg0, byte arg1) {
        this.field882 = arg0;
        if (arg1 != 4) {
            throw new NullPointerException();
        }
        boolean var3 = false;
    }
}
