import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GAUMGPFH")
public class class22 implements Runnable {

    @OriginalMember(owner = "GAUMGPFH", name = "a", descriptor = "[I")
    public int[] field777 = new int[500];

    @OriginalMember(owner = "GAUMGPFH", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field778 = new Object();

    @OriginalMember(owner = "GAUMGPFH", name = "d", descriptor = "[I")
    public int[] field780 = new int[500];

    @OriginalMember(owner = "GAUMGPFH", name = "e", descriptor = "Z")
    public boolean field781 = true;

    @OriginalMember(owner = "GAUMGPFH", name = "c", descriptor = "Lclient;")
    public client field779;

    @OriginalMember(owner = "GAUMGPFH", name = "f", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "GAUMGPFH", name = "run", descriptor = "()V")
    public void run() {
        while (this.field781) {
            Object var1 = this.field778;
            synchronized (this.field778) {
                if (this.field782 < 500) {
                    this.field780[this.field782] = this.field779.field1057;
                    this.field777[this.field782] = this.field779.field1058;
                    this.field782++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "GAUMGPFH", name = "<init>", descriptor = "(Lclient;B)V")
    public class22(client arg0, byte arg1) {
        this.field779 = arg0;
        if (arg1 != 8) {
            throw new NullPointerException();
        }
        boolean var3 = false;
    }
}
