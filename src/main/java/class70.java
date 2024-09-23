import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZEOHBQWT")
public class class70 implements Runnable {

    @OriginalMember(owner = "ZEOHBQWT", name = "a", descriptor = "[I")
    public int[] field1702 = new int[500];

    @OriginalMember(owner = "ZEOHBQWT", name = "b", descriptor = "Z")
    public boolean field1703 = true;

    @OriginalMember(owner = "ZEOHBQWT", name = "c", descriptor = "[I")
    public int[] field1704 = new int[500];

    @OriginalMember(owner = "ZEOHBQWT", name = "d", descriptor = "I")
    private int field1705 = 28787;

    @OriginalMember(owner = "ZEOHBQWT", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field1708 = new Object();

    @OriginalMember(owner = "ZEOHBQWT", name = "e", descriptor = "Lclient;")
    public client field1706;

    @OriginalMember(owner = "ZEOHBQWT", name = "f", descriptor = "I")
    public int field1707;

    @OriginalMember(owner = "ZEOHBQWT", name = "<init>", descriptor = "(Lclient;Z)V")
    public class70(client arg0, boolean arg1) {
        this.field1706 = arg0;
        if (arg1) {
            this.field1705 = -228;
        }
    }

    @OriginalMember(owner = "ZEOHBQWT", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1703) {
            Object var1 = this.field1708;
            synchronized (this.field1708) {
                if (this.field1707 < 500) {
                    this.field1702[this.field1707] = this.field1706.field22;
                    this.field1704[this.field1707] = this.field1706.field23;
                    this.field1707++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
