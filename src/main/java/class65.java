import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XAXJBOWU")
public class class65 implements Runnable {

    @OriginalMember(owner = "XAXJBOWU", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1591 = new Object();

    @OriginalMember(owner = "XAXJBOWU", name = "b", descriptor = "[I")
    public int[] field1592 = new int[500];

    @OriginalMember(owner = "XAXJBOWU", name = "d", descriptor = "[I")
    public int[] field1594 = new int[500];

    @OriginalMember(owner = "XAXJBOWU", name = "f", descriptor = "Z")
    public boolean field1596 = true;

    @OriginalMember(owner = "XAXJBOWU", name = "e", descriptor = "Lclient;")
    public client field1595;

    @OriginalMember(owner = "XAXJBOWU", name = "c", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "XAXJBOWU", name = "<init>", descriptor = "(ILclient;)V")
    public class65(int arg0, client arg1) {
        this.field1595 = arg1;
        if (arg0 != 6) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "XAXJBOWU", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1596) {
            Object var1 = this.field1591;
            synchronized (this.field1591) {
                if (this.field1593 < 500) {
                    this.field1594[this.field1593] = this.field1595.field1510;
                    this.field1592[this.field1593] = this.field1595.field1511;
                    this.field1593++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
