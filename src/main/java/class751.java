import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class751 extends class782 {

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    private int field10360;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    private int field10358;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    private int field10362;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    private int field10359;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field10361;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field10363;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field10364;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
    public final void method1938(int arg0, int arg1, int arg2) {
        if (arg0 < 109) {
            this.method1935(-56, (byte) -44, -79);
        }
        ++field10364;
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(IBI)V")
    public final void method1941(int arg0, byte arg1, int arg2) {
        ++field10361;
        int var4 = this.field10362 * arg0 >> 12;
        int var5 = this.field10359 * arg0 >> 12;
        int var6 = this.field10360 * arg2 >> 12;
        int var7 = 102 / ((-62 - arg1) / 56);
        int var8 = this.field10358 * arg2 >> 12;
        class95.method805(var8, var5, var6, super.field10750, (byte) 124, var4);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBI)V")
    public final void method1935(int arg0, byte arg1, int arg2) {
        ++field10363;
        int var4 = this.field10362 * arg0 >> 12;
        int var5 = this.field10359 * arg0 >> 12;
        int var6 = this.field10360 * arg2 >> 12;
        int var7 = this.field10358 * arg2 >> 12;
        class522.method2966(super.field10752, super.field10750, super.field10753, var4, var7, var5, var6, (byte) -115);
        if (arg1 > -110) {
            this.method1938(-9, 69, 126);
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIIII)V")
    public class751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field10360 = arg1;
        this.field10358 = arg3;
        this.field10362 = arg0;
        this.field10359 = arg2;
    }
}
