import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YIKMTKBL")
public class class69 implements Runnable {

    @OriginalMember(owner = "client!YIKMTKBL", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1695 = new Object();

    @OriginalMember(owner = "client!YIKMTKBL", name = "b", descriptor = "[I")
    public int[] field1696 = new int[500];

    @OriginalMember(owner = "client!YIKMTKBL", name = "c", descriptor = "Z")
    public boolean field1697 = true;

    @OriginalMember(owner = "client!YIKMTKBL", name = "e", descriptor = "[I")
    public int[] field1699 = new int[500];

    @OriginalMember(owner = "client!YIKMTKBL", name = "d", descriptor = "Lclient;")
    public client field1698;

    @OriginalMember(owner = "client!YIKMTKBL", name = "f", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!YIKMTKBL", name = "<init>", descriptor = "(ILclient;)V")
    public class69(int arg0, client arg1) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        this.field1698 = arg1;
    }

    @OriginalMember(owner = "client!YIKMTKBL", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1697) {
            Object var1 = this.field1695;
            synchronized (this.field1695) {
                if (this.field1700 < 500) {
                    this.field1699[this.field1700] = this.field1698.field1127;
                    this.field1696[this.field1700] = this.field1698.field1128;
                    this.field1700++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
