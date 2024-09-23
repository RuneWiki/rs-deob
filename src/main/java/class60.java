import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("STZSJMNC")
public class class60 implements Runnable {

    @OriginalMember(owner = "STZSJMNC", name = "a", descriptor = "Z")
    private boolean field1462 = true;

    @OriginalMember(owner = "STZSJMNC", name = "b", descriptor = "Z")
    public boolean field1463 = true;

    @OriginalMember(owner = "STZSJMNC", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1464 = new Object();

    @OriginalMember(owner = "STZSJMNC", name = "d", descriptor = "[I")
    public int[] field1465 = new int[500];

    @OriginalMember(owner = "STZSJMNC", name = "f", descriptor = "[I")
    public int[] field1467 = new int[500];

    @OriginalMember(owner = "STZSJMNC", name = "e", descriptor = "Lclient;")
    public client field1466;

    @OriginalMember(owner = "STZSJMNC", name = "g", descriptor = "I")
    public int field1468;

    @OriginalMember(owner = "STZSJMNC", name = "<init>", descriptor = "(BLclient;)V")
    public class60(byte arg0, client arg1) {
        if (arg0 == 2) {
            boolean var3 = false;
        } else {
            this.field1462 = !this.field1462;
        }
        this.field1466 = arg1;
    }

    @OriginalMember(owner = "STZSJMNC", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1463) {
            Object var1 = this.field1464;
            synchronized (this.field1464) {
                if (this.field1468 < 500) {
                    this.field1467[this.field1468] = this.field1466.field811;
                    this.field1465[this.field1468] = this.field1466.field812;
                    this.field1468++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
