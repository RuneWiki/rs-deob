import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BORSVOPG")
public class MouseTracking implements Runnable {

    @OriginalMember(owner = "client!BORSVOPG", name = "a", descriptor = "Z")
    public boolean field94 = true;

    @OriginalMember(owner = "client!BORSVOPG", name = "b", descriptor = "[I")
    public int[] field95 = new int[500];

    @OriginalMember(owner = "client!BORSVOPG", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field96 = new Object();

    @OriginalMember(owner = "client!BORSVOPG", name = "e", descriptor = "I")
    private int field98 = 8;

    @OriginalMember(owner = "client!BORSVOPG", name = "g", descriptor = "[I")
    public int[] field100 = new int[500];

    @OriginalMember(owner = "client!BORSVOPG", name = "d", descriptor = "Lclient;")
    public client field97;

    @OriginalMember(owner = "client!BORSVOPG", name = "f", descriptor = "I")
    public int field99;

    @OriginalMember(owner = "client!BORSVOPG", name = "<init>", descriptor = "(Lclient;B)V")
    public MouseTracking(client arg0, byte arg1) {
        if (arg1 != -116) {
            this.field98 = 294;
        }
        this.field97 = arg0;
    }

    @OriginalMember(owner = "client!BORSVOPG", name = "run", descriptor = "()V")
    public void run() {
        while (this.field94) {
            Object var1 = this.field96;
            synchronized (this.field96) {
                if (this.field99 < 500) {
                    this.field100[this.field99] = this.field97.field959;
                    this.field95[this.field99] = this.field97.field960;
                    this.field99++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
