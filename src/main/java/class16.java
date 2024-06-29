import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GFMKEKCW")
public class class16 implements Runnable {

    @OriginalMember(owner = "client!GFMKEKCW", name = "a", descriptor = "Z")
    public boolean field675 = true;

    @OriginalMember(owner = "client!GFMKEKCW", name = "b", descriptor = "[I")
    public int[] field676 = new int[500];

    @OriginalMember(owner = "client!GFMKEKCW", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field677 = new Object();

    @OriginalMember(owner = "client!GFMKEKCW", name = "d", descriptor = "[I")
    public int[] field678 = new int[500];

    @OriginalMember(owner = "client!GFMKEKCW", name = "e", descriptor = "I")
    private int field679 = 240;

    @OriginalMember(owner = "client!GFMKEKCW", name = "g", descriptor = "Lclient;")
    public client field681;

    @OriginalMember(owner = "client!GFMKEKCW", name = "f", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!GFMKEKCW", name = "run", descriptor = "()V")
    public void run() {
        while (this.field675) {
            Object var1 = this.field677;
            synchronized (this.field677) {
                if (this.field680 < 500) {
                    this.field678[this.field680] = this.field681.field597;
                    this.field676[this.field680] = this.field681.field598;
                    this.field680++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!GFMKEKCW", name = "<init>", descriptor = "(ILclient;)V")
    public class16(int arg0, client arg1) {
        if (arg0 != 0) {
            this.field679 = -44;
        }
        this.field681 = arg1;
    }
}
