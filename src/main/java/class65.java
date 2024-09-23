import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YMDQNWFI")
public class class65 implements Runnable {

    @OriginalMember(owner = "YMDQNWFI", name = "a", descriptor = "[I")
    public int[] field1642 = new int[500];

    @OriginalMember(owner = "YMDQNWFI", name = "b", descriptor = "Z")
    public boolean field1643 = true;

    @OriginalMember(owner = "YMDQNWFI", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field1646 = new Object();

    @OriginalMember(owner = "YMDQNWFI", name = "f", descriptor = "[I")
    public int[] field1647 = new int[500];

    @OriginalMember(owner = "YMDQNWFI", name = "c", descriptor = "Lclient;")
    public client field1644;

    @OriginalMember(owner = "YMDQNWFI", name = "d", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "YMDQNWFI", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1643) {
            Object var1 = this.field1646;
            synchronized (this.field1646) {
                if (this.field1645 < 500) {
                    this.field1647[this.field1645] = this.field1644.field1203;
                    this.field1642[this.field1645] = this.field1644.field1204;
                    this.field1645++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "YMDQNWFI", name = "<init>", descriptor = "(BLclient;)V")
    public class65(byte arg0, client arg1) {
        if (arg0 != 117) {
            throw new NullPointerException();
        }
        this.field1644 = arg1;
    }
}
