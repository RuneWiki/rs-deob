import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TLCMWCVC")
public class class57 implements Runnable {

    @OriginalMember(owner = "client!TLCMWCVC", name = "a", descriptor = "[I")
    public int[] field1484 = new int[500];

    @OriginalMember(owner = "client!TLCMWCVC", name = "c", descriptor = "Z")
    public boolean field1486 = true;

    @OriginalMember(owner = "client!TLCMWCVC", name = "e", descriptor = "[I")
    public int[] field1488 = new int[500];

    @OriginalMember(owner = "client!TLCMWCVC", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1489 = new Object();

    @OriginalMember(owner = "client!TLCMWCVC", name = "d", descriptor = "Lclient;")
    public client field1487;

    @OriginalMember(owner = "client!TLCMWCVC", name = "b", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!TLCMWCVC", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1486) {
            Object var1 = this.field1489;
            synchronized (this.field1489) {
                if (this.field1485 < 500) {
                    this.field1484[this.field1485] = this.field1487.field1250;
                    this.field1488[this.field1485] = this.field1487.field1251;
                    this.field1485++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!TLCMWCVC", name = "<init>", descriptor = "(ILclient;)V")
    public class57(int arg0, client arg1) {
        this.field1487 = arg1;
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }
}
