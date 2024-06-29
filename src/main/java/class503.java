import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class503 extends class388 {

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Ljn;")
    public class503 field6933;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Ljn;")
    public class503 field6934;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "Z")
    public static boolean field6932;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "[Lf;")
    public static class529[] field6935;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
    public static void method2871(int arg0) {
        field6935 = null;
        if (arg0 != 0) {
            field6932 = false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public final void method2872(byte arg0) {
        if (arg0 != -9) {
            return;
        }
        field6931++;
        if (this.field6934 != null) {
            this.field6934.field6933 = this.field6933;
            this.field6933.field6934 = this.field6934;
            this.field6934 = null;
            this.field6933 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lbi;III)V")
    public static final void method2873(class334 arg0, int arg1, int arg2, int arg3) {
        long var4 = class203.field2818[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field4383 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field4380[arg0.field4383++] = class37.field586[var8 - 1].field4867;
            var6 += 16L;
        }
        for (int var9 = arg0.field4383; var9 < 4; var9++) {
            arg0.field4380[var9] = null;
        }
    }
}
