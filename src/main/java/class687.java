import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class687 extends class632 {

    @OriginalMember(owner = "client!gha", name = "n", descriptor = "I")
    private int field9587;

    @OriginalMember(owner = "client!gha", name = "l", descriptor = "I")
    private int field9585;

    @OriginalMember(owner = "client!gha", name = "q", descriptor = "I")
    private int field9590;

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "I")
    private int field9582;

    @OriginalMember(owner = "client!gha", name = "o", descriptor = "I")
    public static int field9588 = 0;

    @OriginalMember(owner = "client!gha", name = "s", descriptor = "[I")
    public static int[] field9592 = new int[32];

    @OriginalMember(owner = "client!gha", name = "r", descriptor = "I")
    public static int field9591 = -2;

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!gha", name = "j", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!gha", name = "k", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!gha", name = "m", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!gha", name = "p", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(BII)V", line = 8)
    public final void method1992(byte arg0, int arg1, int arg2) {
        ++field9583;
        if (arg0 > 96) {
            int var4 = this.field9590 * arg2 >> 12;
            int var5 = this.field9585 * arg2 >> 12;
            int var6 = this.field9587 * arg1 >> 12;
            int var7 = this.field9582 * arg1 >> 12;
            class361.method2269(var7, var5, super.field8834, var4, super.field8836, var6, 512, super.field8835);
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V", line = 30)
    public static void method3909(byte arg0) {
        field9592 = null;
        int var1 = -97 / ((arg0 - -42) / 40);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IBI)V", line = 41)
    public final void method1994(int arg0, byte arg1, int arg2) {
        int var4 = 39 % ((33 - arg1) / 62);
        ++field9581;
    }

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(IIIIIII)V", line = 53)
    public class687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9587 = arg1;
        this.field9585 = arg2;
        this.field9590 = arg0;
        this.field9582 = arg3;
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIB)V", line = 65)
    public final void method1993(int arg0, int arg1, byte arg2) {
        ++field9589;
        int var4 = this.field9590 * arg0 >> 12;
        int var5 = this.field9585 * arg0 >> 12;
        int var6 = this.field9587 * arg1 >> 12;
        int var7 = this.field9582 * arg1 >> 12;
        class650.method3722(var7, var4, 8865, var6, var5, super.field8835);
        if (arg2 > -79) {
            field9584 = 101;
        }
    }
}
