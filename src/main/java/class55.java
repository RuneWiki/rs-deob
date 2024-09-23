import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UWFCTTCD")
public class class55 implements Runnable {

    @OriginalMember(owner = "UWFCTTCD", name = "a", descriptor = "[I")
    public int[] field1373 = new int[500];

    @OriginalMember(owner = "UWFCTTCD", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field1374 = new Object();

    @OriginalMember(owner = "UWFCTTCD", name = "e", descriptor = "[I")
    public int[] field1377 = new int[500];

    @OriginalMember(owner = "UWFCTTCD", name = "f", descriptor = "Z")
    public boolean field1378 = true;

    @OriginalMember(owner = "UWFCTTCD", name = "g", descriptor = "Z")
    private boolean field1379 = true;

    @OriginalMember(owner = "UWFCTTCD", name = "d", descriptor = "Lclient;")
    public client field1376;

    @OriginalMember(owner = "UWFCTTCD", name = "c", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "UWFCTTCD", name = "<init>", descriptor = "(Lclient;I)V")
    public class55(client arg0, int arg1) {
        if (arg1 != 14271) {
            this.field1379 = !this.field1379;
        }
        this.field1376 = arg0;
    }

    @OriginalMember(owner = "UWFCTTCD", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1378) {
            Object var1 = this.field1374;
            synchronized (this.field1374) {
                if (this.field1375 < 500) {
                    this.field1377[this.field1375] = this.field1376.field1187;
                    this.field1373[this.field1375] = this.field1376.field1188;
                    this.field1375++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
