import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class311 extends class41 {

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
    public boolean field4449 = false;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Z")
    public boolean field4454 = false;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field4451;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public int field4457;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field4452 = -1;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lcl;")
    public static class173 field4455;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lat;III)V")
    public static final void method1946(class255 arg0, int arg1, int arg2, int arg3) {
        long var4 = class371.field5544[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field3686 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field3682[arg0.field3686++] = class242.field3512[var8 - 1].field7047;
            var6 += 16L;
        }
        for (int var9 = arg0.field3686; var9 < 4; var9++) {
            arg0.field3682[var9] = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)V")
    public static void method1947(int arg0) {
        field4455 = null;
        if (arg0 < 1) {
            field4452 = 17;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIZZ)V")
    public class311(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field4454 = arg4;
        this.field4449 = arg3;
        this.field4451 = arg1;
        this.field4456 = arg0;
        this.field4457 = arg2;
    }
}
