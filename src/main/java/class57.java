import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("UTXVFWKJ")
public class class57 implements Runnable {

    @OriginalMember(owner = "UTXVFWKJ", name = "a", descriptor = "B")
    private byte field1363 = 4;

    @OriginalMember(owner = "UTXVFWKJ", name = "b", descriptor = "I")
    private int field1364 = 192;

    @OriginalMember(owner = "UTXVFWKJ", name = "c", descriptor = "[I")
    public int[] field1365 = new int[500];

    @OriginalMember(owner = "UTXVFWKJ", name = "e", descriptor = "[I")
    public int[] field1367 = new int[500];

    @OriginalMember(owner = "UTXVFWKJ", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field1368 = new Object();

    @OriginalMember(owner = "UTXVFWKJ", name = "h", descriptor = "Z")
    public boolean field1370 = true;

    @OriginalMember(owner = "UTXVFWKJ", name = "g", descriptor = "Lclient;")
    public client field1369;

    @OriginalMember(owner = "UTXVFWKJ", name = "d", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "UTXVFWKJ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1370) {
            Object var1 = this.field1368;
            synchronized (this.field1368) {
                if (this.field1366 < 500) {
                    this.field1367[this.field1366] = this.field1369.field1658;
                    this.field1365[this.field1366] = this.field1369.field1659;
                    this.field1366++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "UTXVFWKJ", name = "<init>", descriptor = "(Lclient;B)V")
    public class57(client arg0, byte arg1) {
        this.field1369 = arg0;
        if (this.field1363 != arg1) {
            this.field1364 = -423;
        }
    }
}
