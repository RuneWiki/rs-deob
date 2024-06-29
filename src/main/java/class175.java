import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class175 extends class45 {

    @OriginalMember(owner = "client!rt", name = "w", descriptor = "I")
    private int field2490;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    private int field2476;

    @OriginalMember(owner = "client!rt", name = "s", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
    private int field2488;

    @OriginalMember(owner = "client!rt", name = "v", descriptor = "I")
    private int field2489;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    private int field2485;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!rt", name = "t", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "([IBII)V", line = 5)
    public final void method1193(int[] arg0, byte arg1, int arg2, int arg3) {
        field2487++;
        arg0[1] = this.field2483 + arg3 - this.field2489;
        arg0[2] = this.field2486 + arg2 - this.field2485;
        if (arg1 != -64) {
            this.field2480 = 99;
        }
        arg0[0] = 0;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BII)Z", line = 18)
    public final boolean method1194(byte arg0, int arg1, int arg2) {
        if (arg0 >= -53) {
            this.field2478 = 3;
        }
        field2477++;
        return this.field2483 <= arg1 && arg1 <= this.field2478 && this.field2486 <= arg2 && this.field2480 >= arg2;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Z", line = 42)
    public final boolean method1195(int arg0, int arg1, int arg2) {
        field2484++;
        if (arg2 != 0) {
            this.field2485 = 4;
        }
        return arg0 >= this.field2489 && arg0 <= this.field2490 && this.field2485 <= arg1 && this.field2488 >= arg1;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIZI)Z", line = 58)
    public final boolean method1196(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.method1195(25, -112, -15);
        }
        field2479++;
        return this.field2476 == arg0 && arg3 >= this.field2489 && arg3 <= this.field2490 && arg1 >= this.field2485 && arg1 <= this.field2488;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[III)V", line = 73)
    public final void method1197(int arg0, int[] arg1, int arg2, int arg3) {
        field2482++;
        arg1[1] = -this.field2483 - (-this.field2489 - arg2);
        arg1[0] = this.field2476;
        arg1[arg0] = this.field2485 + arg3 - this.field2486;
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIIIIIII)V", line = 87)
    public class175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2490 = arg3;
        this.field2478 = arg7;
        this.field2480 = arg8;
        this.field2483 = arg5;
        this.field2476 = arg0;
        this.field2486 = arg6;
        this.field2488 = arg4;
        this.field2489 = arg1;
        this.field2485 = arg2;
    }
}
