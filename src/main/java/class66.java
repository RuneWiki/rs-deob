import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YBAERVYW")
public class class66 implements Runnable {

    @OriginalMember(owner = "YBAERVYW", name = "b", descriptor = "Z")
    public boolean field1688 = true;

    @OriginalMember(owner = "YBAERVYW", name = "c", descriptor = "I")
    private int field1689 = 885;

    @OriginalMember(owner = "YBAERVYW", name = "d", descriptor = "[I")
    public int[] field1690 = new int[500];

    @OriginalMember(owner = "YBAERVYW", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field1691 = new Object();

    @OriginalMember(owner = "YBAERVYW", name = "f", descriptor = "[I")
    public int[] field1692 = new int[500];

    @OriginalMember(owner = "YBAERVYW", name = "a", descriptor = "Lclient;")
    public client field1687;

    @OriginalMember(owner = "YBAERVYW", name = "g", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "YBAERVYW", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1688) {
            Object var1 = this.field1691;
            synchronized (this.field1691) {
                if (this.field1693 < 500) {
                    this.field1692[this.field1693] = this.field1687.field723;
                    this.field1690[this.field1693] = this.field1687.field724;
                    this.field1693++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "YBAERVYW", name = "<init>", descriptor = "(ILclient;)V")
    public class66(int arg0, client arg1) {
        int var3 = 4 / arg0;
        this.field1687 = arg1;
    }
}
