import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XSRHTFUZ")
public class class65 implements Runnable {

    @OriginalMember(owner = "client!XSRHTFUZ", name = "a", descriptor = "Z")
    public boolean field1608 = true;

    @OriginalMember(owner = "client!XSRHTFUZ", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1610 = new Object();

    @OriginalMember(owner = "client!XSRHTFUZ", name = "d", descriptor = "Z")
    private boolean field1611 = true;

    @OriginalMember(owner = "client!XSRHTFUZ", name = "e", descriptor = "[I")
    public int[] field1612 = new int[500];

    @OriginalMember(owner = "client!XSRHTFUZ", name = "f", descriptor = "[I")
    public int[] field1613 = new int[500];

    @OriginalMember(owner = "client!XSRHTFUZ", name = "g", descriptor = "Lclient;")
    public client field1614;

    @OriginalMember(owner = "client!XSRHTFUZ", name = "b", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!XSRHTFUZ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field1608) {
            Object var1 = this.field1610;
            synchronized (this.field1610) {
                if (this.field1609 < 500) {
                    this.field1612[this.field1609] = this.field1614.field1346;
                    this.field1613[this.field1609] = this.field1614.field1347;
                    this.field1609++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!XSRHTFUZ", name = "<init>", descriptor = "(Lclient;Z)V")
    public class65(client arg0, boolean arg1) {
        this.field1614 = arg0;
        if (arg1) {
            this.field1611 = !this.field1611;
        }
    }
}
