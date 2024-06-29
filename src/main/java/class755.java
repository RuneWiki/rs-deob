import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class755 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[I")
    public int[] field10444;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Z")
    public static boolean field10445 = false;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field10443;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lrv;B)V")
    private final void method4179(class120 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method842(2384);
            if (var3 == 0) {
                int var4 = -92 % ((-arg1 - 65) / 52);
                field10443++;
                return;
            }
            if (var3 == 1) {
                int var5 = arg0.method842(2384);
                this.field10444 = new int[var5];
                for (int var6 = 0; var6 < this.field10444.length; var6++) {
                    this.field10444[var6] = arg0.method842(2384);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lcb;)V")
    public class755(class544 arg0) {
        byte[] var2 = arg0.method3149(6, -99);
        this.method4179(new class120(var2), (byte) -119);
        if (this.field10444 == null) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    protected class755() {
        this.field10444 = new int[0];
    }
}
