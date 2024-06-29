import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!IJIEJOTK")
public class class25 implements Runnable {

    @OriginalMember(owner = "client!IJIEJOTK", name = "b", descriptor = "Z")
    public boolean field840 = true;

    @OriginalMember(owner = "client!IJIEJOTK", name = "c", descriptor = "[I")
    public int[] field841 = new int[500];

    @OriginalMember(owner = "client!IJIEJOTK", name = "e", descriptor = "[I")
    public int[] field843 = new int[500];

    @OriginalMember(owner = "client!IJIEJOTK", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field844 = new Object();

    @OriginalMember(owner = "client!IJIEJOTK", name = "d", descriptor = "Lclient;")
    public client field842;

    @OriginalMember(owner = "client!IJIEJOTK", name = "a", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!IJIEJOTK", name = "run", descriptor = "()V")
    public void run() {
        while (this.field840) {
            Object var1 = this.field844;
            synchronized (this.field844) {
                if (this.field839 < 500) {
                    this.field843[this.field839] = this.field842.field1137;
                    this.field841[this.field839] = this.field842.field1138;
                    this.field839++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!IJIEJOTK", name = "<init>", descriptor = "(ILclient;)V")
    public class25(int arg0, client arg1) {
        this.field842 = arg1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }
}
