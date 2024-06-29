import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OUOWXDXZ")
public class class42 implements Runnable {

    @OriginalMember(owner = "client!OUOWXDXZ", name = "a", descriptor = "[I")
    public int[] field1256 = new int[500];

    @OriginalMember(owner = "client!OUOWXDXZ", name = "b", descriptor = "Z")
    public boolean field1257 = true;

    @OriginalMember(owner = "client!OUOWXDXZ", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field1260 = new Object();

    @OriginalMember(owner = "client!OUOWXDXZ", name = "f", descriptor = "[I")
    public int[] field1261 = new int[500];

    @OriginalMember(owner = "client!OUOWXDXZ", name = "g", descriptor = "Z")
    private boolean field1262 = true;

    @OriginalMember(owner = "client!OUOWXDXZ", name = "c", descriptor = "Lclient;")
    public client field1258;

    @OriginalMember(owner = "client!OUOWXDXZ", name = "d", descriptor = "I")
    public int field1259;

    @OriginalMember(owner = "client!OUOWXDXZ", name = "<init>", descriptor = "(ILclient;)V")
    public class42(int arg0, client arg1) {
        if (arg0 < 6 || arg0 > 6) {
            this.field1262 = !this.field1262;
        }
        this.field1258 = arg1;
    }

    @OriginalMember(owner = "client!OUOWXDXZ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1257) {
            Object var1 = this.field1260;
            synchronized (this.field1260) {
                if (this.field1259 < 500) {
                    this.field1256[this.field1259] = this.field1258.field1112;
                    this.field1261[this.field1259] = this.field1258.field1113;
                    this.field1259++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
