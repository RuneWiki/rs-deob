import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class748 extends class578 {

    @OriginalMember(owner = "client!gfa", name = "j", descriptor = "I")
    private int field10362;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
    private int field10358;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
    private int field10361;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    private int field10363;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "Z")
    public static boolean field10364 = false;

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public static int field10359;

    @OriginalMember(owner = "client!gfa", name = "h", descriptor = "I")
    public static int field10360;

    @OriginalMember(owner = "client!gfa", name = "m", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "I")
    public static int field10366;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)V")
    public final void method399(int arg0, int arg1, int arg2) {
        ++field10359;
        int var4 = this.field10362 * arg0 >> 12;
        int var5 = this.field10363 * arg0 >> 12;
        int var6 = this.field10358 * arg1 >> 12;
        if (arg2 > -98) {
            field10364 = false;
        }
        int var7 = this.field10361 * arg1 >> 12;
        class96.method897(super.field7936, var6, var4, super.field7937, (byte) -123, super.field7934, var5, var7);
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)V")
    public static final void method4175(int arg0) {
        ++field10360;
        class511.field7109 = arg0;
        class746.field10334 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(IIIIIII)V")
    public class748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field10362 = arg0;
        this.field10358 = arg1;
        this.field10361 = arg3;
        this.field10363 = arg2;
    }

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "(III)V")
    public final void method400(int arg0, int arg1, int arg2) {
        ++field10366;
        int var4 = this.field10362 * arg1 >> 12;
        if (arg2 <= -29) {
            int var5 = this.field10363 * arg1 >> 12;
            int var6 = this.field10358 * arg0 >> 12;
            int var7 = this.field10361 * arg0 >> 12;
            class136.method1109(super.field7937, 1, super.field7934, var6, var7, var5, var4);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(III)V")
    public final void method402(int arg0, int arg1, int arg2) {
        ++field10365;
        int var4 = this.field10362 * arg1 >> 12;
        int var5 = this.field10363 * arg1 >> 12;
        if (arg0 <= 87) {
            this.field10362 = 56;
        }
        int var6 = this.field10358 * arg2 >> 12;
        int var7 = this.field10361 * arg2 >> 12;
        class424.method2600(0, var5, super.field7936, var7, var4, var6);
    }
}
