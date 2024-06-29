import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class775 extends class396 {

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    private int field10649;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    private int field10654;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    private int field10650;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    private int field10651;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public static int field10648;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public static int field10652;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public static int field10653;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(III)V", line = 4)
    public final void method1583(int arg0, int arg1, int arg2) {
        ++field10653;
        if (arg1 != 126) {
            this.field10651 = 72;
        }
        int var4 = this.field10651 * arg0 >> 12;
        int var5 = this.field10650 * arg0 >> 12;
        int var6 = this.field10654 * arg2 >> 12;
        int var7 = this.field10649 * arg2 >> 12;
        class21.method222(var6, var5, var4, var7, super.field5451, (byte) 79);
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)V", line = 23)
    public final void method1580(int arg0, int arg1, int arg2) {
        if (arg1 < -5) {
            ++field10648;
            int var4 = this.field10651 * arg0 >> 12;
            int var5 = this.field10650 * arg0 >> 12;
            int var6 = this.field10654 * arg2 >> 12;
            int var7 = this.field10649 * arg2 >> 12;
            class425.method2570(var5, super.field5451, super.field5448, var6, var7, 29592, super.field5449, var4);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V", line = 45)
    public final void method1584(int arg0, int arg1, int arg2) {
        ++field10652;
        int var4 = this.field10651 * arg1 >> 12;
        if (arg2 != -1791337721) {
            this.field10650 = -90;
        }
        int var5 = this.field10650 * arg1 >> 12;
        int var6 = this.field10654 * arg0 >> 12;
        int var7 = this.field10649 * arg0 >> 12;
        class40.method302(-72, var4, super.field5448, var5, var7, super.field5449, var6);
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIII)V", line = 66)
    public class775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field10649 = arg3;
        this.field10654 = arg1;
        this.field10650 = arg2;
        this.field10651 = arg0;
    }
}
