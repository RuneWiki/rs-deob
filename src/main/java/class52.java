import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OQEOESGS")
public class class52 implements Runnable {

    @OriginalMember(owner = "OQEOESGS", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1281 = new Object();

    @OriginalMember(owner = "OQEOESGS", name = "c", descriptor = "[I")
    public int[] field1283 = new int[500];

    @OriginalMember(owner = "OQEOESGS", name = "d", descriptor = "Z")
    public boolean field1284 = true;

    @OriginalMember(owner = "OQEOESGS", name = "e", descriptor = "[I")
    public int[] field1285 = new int[500];

    @OriginalMember(owner = "OQEOESGS", name = "f", descriptor = "Lclient;")
    public client field1286;

    @OriginalMember(owner = "OQEOESGS", name = "b", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "OQEOESGS", name = "<init>", descriptor = "(Lclient;B)V")
    public class52(client arg0, byte arg1) {
        if (arg1 != -116) {
            throw new NullPointerException();
        }
        this.field1286 = arg0;
    }

    @OriginalMember(owner = "OQEOESGS", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1284) {
            Object var1 = this.field1281;
            synchronized (this.field1281) {
                if (this.field1282 < 500) {
                    this.field1283[this.field1282] = this.field1286.field769;
                    this.field1285[this.field1282] = this.field1286.field770;
                    this.field1282++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
