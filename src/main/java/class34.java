import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LLZTMQTZ")
public class class34 implements Runnable {

    @OriginalMember(owner = "client!LLZTMQTZ", name = "a", descriptor = "Ljava/lang/Object;")
    public Object field1030 = new Object();

    @OriginalMember(owner = "client!LLZTMQTZ", name = "b", descriptor = "[I")
    public int[] field1031 = new int[500];

    @OriginalMember(owner = "client!LLZTMQTZ", name = "c", descriptor = "[I")
    public int[] field1032 = new int[500];

    @OriginalMember(owner = "client!LLZTMQTZ", name = "e", descriptor = "Z")
    private boolean field1034 = false;

    @OriginalMember(owner = "client!LLZTMQTZ", name = "f", descriptor = "Z")
    public boolean field1035 = true;

    @OriginalMember(owner = "client!LLZTMQTZ", name = "g", descriptor = "Lclient;")
    public client field1036;

    @OriginalMember(owner = "client!LLZTMQTZ", name = "d", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!LLZTMQTZ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1035) {
            Object var1 = this.field1030;
            synchronized (this.field1030) {
                if (this.field1033 < 500) {
                    this.field1031[this.field1033] = this.field1036.field1180;
                    this.field1032[this.field1033] = this.field1036.field1181;
                    this.field1033++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!LLZTMQTZ", name = "<init>", descriptor = "(ZLclient;)V")
    public class34(boolean arg0, client arg1) {
        if (!arg0) {
            this.field1034 = !this.field1034;
        }
        this.field1036 = arg1;
    }
}
