import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ULPROSHL")
public class class59 implements Runnable {

    @OriginalMember(owner = "ULPROSHL", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1408 = new Object();

    @OriginalMember(owner = "ULPROSHL", name = "d", descriptor = "[I")
    public int[] field1411 = new int[500];

    @OriginalMember(owner = "ULPROSHL", name = "e", descriptor = "Z")
    public boolean field1412 = true;

    @OriginalMember(owner = "ULPROSHL", name = "f", descriptor = "[I")
    public int[] field1413 = new int[500];

    @OriginalMember(owner = "ULPROSHL", name = "b", descriptor = "Lclient;")
    public client field1409;

    @OriginalMember(owner = "ULPROSHL", name = "c", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "ULPROSHL", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1412) {
            Object var1 = this.field1408;
            synchronized (this.field1408) {
                if (this.field1410 < 500) {
                    this.field1413[this.field1410] = this.field1409.field92;
                    this.field1411[this.field1410] = this.field1409.field93;
                    this.field1410++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "ULPROSHL", name = "<init>", descriptor = "(ILclient;)V")
    public class59(int arg0, client arg1) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field1409 = arg1;
    }
}
