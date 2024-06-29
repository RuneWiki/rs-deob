import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OIFRHCSO")
public class class43 implements Runnable {

    @OriginalMember(owner = "client!OIFRHCSO", name = "a", descriptor = "Z")
    public boolean field1262 = true;

    @OriginalMember(owner = "client!OIFRHCSO", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field1263 = new Object();

    @OriginalMember(owner = "client!OIFRHCSO", name = "c", descriptor = "[I")
    public int[] field1264 = new int[500];

    @OriginalMember(owner = "client!OIFRHCSO", name = "f", descriptor = "[I")
    public int[] field1267 = new int[500];

    @OriginalMember(owner = "client!OIFRHCSO", name = "d", descriptor = "Lclient;")
    public client field1265;

    @OriginalMember(owner = "client!OIFRHCSO", name = "e", descriptor = "I")
    public int field1266;

    @OriginalMember(owner = "client!OIFRHCSO", name = "<init>", descriptor = "(ILclient;)V")
    public class43(int arg0, client arg1) {
        int var3 = 69 / arg0;
        this.field1265 = arg1;
    }

    @OriginalMember(owner = "client!OIFRHCSO", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1262) {
            Object var1 = this.field1263;
            synchronized (this.field1263) {
                if (this.field1266 < 500) {
                    this.field1264[this.field1266] = this.field1265.field33;
                    this.field1267[this.field1266] = this.field1265.field34;
                    this.field1266++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
