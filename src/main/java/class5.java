import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ANTLOSVZ")
public class class5 implements Runnable {

    @OriginalMember(owner = "ANTLOSVZ", name = "b", descriptor = "[I")
    public int[] field120 = new int[500];

    @OriginalMember(owner = "ANTLOSVZ", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field122 = new Object();

    @OriginalMember(owner = "ANTLOSVZ", name = "e", descriptor = "[I")
    public int[] field123 = new int[500];

    @OriginalMember(owner = "ANTLOSVZ", name = "f", descriptor = "Z")
    public boolean field124 = true;

    @OriginalMember(owner = "ANTLOSVZ", name = "a", descriptor = "Lclient;")
    public client field119;

    @OriginalMember(owner = "ANTLOSVZ", name = "c", descriptor = "I")
    public int field121;

    @OriginalMember(owner = "ANTLOSVZ", name = "<init>", descriptor = "(ZLclient;)V")
    public class5(boolean arg0, client arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        this.field119 = arg1;
    }

    @OriginalMember(owner = "ANTLOSVZ", name = "run", descriptor = "()V")
    public void run() {
        while (this.field124) {
            Object var1 = this.field122;
            synchronized (this.field122) {
                if (this.field121 < 500) {
                    this.field123[this.field121] = this.field119.field1046;
                    this.field120[this.field121] = this.field119.field1047;
                    this.field121++;
                }
            }
            try {
                Thread.sleep(50L);
            } catch (Exception var2) {
            }
        }
    }
}
