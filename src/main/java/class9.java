import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EKUSXTUB")
public class class9 implements Runnable {

    @OriginalMember(owner = "client!EKUSXTUB", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field646 = new Object();

    @OriginalMember(owner = "client!EKUSXTUB", name = "c", descriptor = "[I")
    public int[] field647 = new int[500];

    @OriginalMember(owner = "client!EKUSXTUB", name = "e", descriptor = "Z")
    private boolean field649 = true;

    @OriginalMember(owner = "client!EKUSXTUB", name = "f", descriptor = "Z")
    public boolean field650 = true;

    @OriginalMember(owner = "client!EKUSXTUB", name = "g", descriptor = "[I")
    public int[] field651 = new int[500];

    @OriginalMember(owner = "client!EKUSXTUB", name = "d", descriptor = "Lclient;")
    public client field648;

    @OriginalMember(owner = "client!EKUSXTUB", name = "a", descriptor = "I")
    public int field645;

    @OriginalMember(owner = "client!EKUSXTUB", name = "run", descriptor = "()V")
    public void run() {
        while (this.field650) {
            Object var1 = this.field646;
            synchronized (this.field646) {
                if (this.field645 < 500) {
                    this.field647[this.field645] = this.field648.field1084;
                    this.field651[this.field645] = this.field648.field1085;
                    this.field645++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!EKUSXTUB", name = "<init>", descriptor = "(Lclient;Z)V")
    public class9(client arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        this.field648 = arg0;
    }
}
