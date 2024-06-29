import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NZNLPNYM")
public class class38 implements Runnable {

    @OriginalMember(owner = "client!NZNLPNYM", name = "b", descriptor = "[I")
    public int[] field1035 = new int[500];

    @OriginalMember(owner = "client!NZNLPNYM", name = "c", descriptor = "[I")
    public int[] field1036 = new int[500];

    @OriginalMember(owner = "client!NZNLPNYM", name = "d", descriptor = "Z")
    public boolean field1037 = true;

    @OriginalMember(owner = "client!NZNLPNYM", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field1038 = new Object();

    @OriginalMember(owner = "client!NZNLPNYM", name = "f", descriptor = "B")
    private byte field1039 = 6;

    @OriginalMember(owner = "client!NZNLPNYM", name = "g", descriptor = "Lclient;")
    public client field1040;

    @OriginalMember(owner = "client!NZNLPNYM", name = "a", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "client!NZNLPNYM", name = "<init>", descriptor = "(Lclient;B)V")
    public class38(client arg0, byte arg1) {
        this.field1040 = arg0;
        if (this.field1039 != arg1) {
            throw new NullPointerException();
        }
        boolean var3 = false;
    }

    @OriginalMember(owner = "client!NZNLPNYM", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1037) {
            Object var1 = this.field1038;
            synchronized (this.field1038) {
                if (this.field1034 < 500) {
                    this.field1036[this.field1034] = this.field1040.field942;
                    this.field1035[this.field1034] = this.field1040.field943;
                    this.field1034++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
