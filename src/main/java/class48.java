import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RQLSQIAP")
public class class48 implements Runnable {

    @OriginalMember(owner = "client!RQLSQIAP", name = "a", descriptor = "Z")
    public boolean field1196 = true;

    @OriginalMember(owner = "client!RQLSQIAP", name = "b", descriptor = "[I")
    public int[] field1197 = new int[500];

    @OriginalMember(owner = "client!RQLSQIAP", name = "c", descriptor = "[I")
    public int[] field1198 = new int[500];

    @OriginalMember(owner = "client!RQLSQIAP", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field1199 = new Object();

    @OriginalMember(owner = "client!RQLSQIAP", name = "e", descriptor = "Lclient;")
    public client field1200;

    @OriginalMember(owner = "client!RQLSQIAP", name = "f", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "client!RQLSQIAP", name = "<init>", descriptor = "(Lclient;B)V")
    public class48(client arg0, byte arg1) {
        this.field1200 = arg0;
        if (arg1 != -88) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!RQLSQIAP", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1196) {
            Object var1 = this.field1199;
            synchronized (this.field1199) {
                if (this.field1201 < 500) {
                    this.field1197[this.field1201] = this.field1200.field617;
                    this.field1198[this.field1201] = this.field1200.field618;
                    this.field1201++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
