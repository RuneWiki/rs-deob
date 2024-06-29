import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class583 extends class4 {

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    private int field8285;

    @OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
    private int field8288;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "I")
    private int field8293;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
    private int field8283;

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "I")
    private int field8297;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    private int field8286;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "I")
    private int field8291;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "I")
    private int field8292;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "[F")
    public static float[] field8287 = new float[4];

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "F")
    public static float field8294;

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!pda", name = "l", descriptor = "I")
    public static int field8289;

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    public static int field8295;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 5)
    public class583(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field8285 = arg6;
        this.field8288 = arg7;
        this.field8293 = arg0;
        this.field8283 = arg1;
        this.field8297 = arg2;
        this.field8286 = arg4;
        this.field8291 = arg5;
        this.field8292 = arg3;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIB)V", line = 20)
    public final void method22(int arg0, int arg1, byte arg2) {
        if (arg2 > -124) {
            this.field8288 = -94;
        }
        ++field8289;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V", line = 31)
    public static void method3416(int arg0) {
        if (arg0 == 10992) {
            field8287 = null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILqs;)I", line = 42)
    public static final int method3417(int arg0, class560 arg1) {
        ++field8296;
        if (arg0 != 9216) {
            return -47;
        } else if (class74.field936 != arg1) {
            if (class341.field5524 == arg1) {
                return 34065;
            } else if (class304.field4782 == arg1) {
                return 34066;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 9216;
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(III)V", line = 68)
    public final void method21(int arg0, int arg1, int arg2) {
        ++field8290;
        int var4 = this.field8293 * arg0 >> 12;
        int var5 = this.field8283 * arg2 >> 12;
        int var6 = this.field8297 * arg0 >> 12;
        int var7 = this.field8292 * arg2 >> 12;
        int var8 = this.field8286 * arg0 >> 12;
        if (arg1 != 8746) {
            this.field8293 = -58;
        }
        int var9 = this.field8291 * arg2 >> 12;
        int var10 = this.field8285 * arg0 >> 12;
        int var11 = this.field8288 * arg2 >> 12;
        class203.method1573(super.field28, var11, var10, var5, var8, var4, var7, var6, var9, true);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V", line = 102)
    public final void method19(int arg0, int arg1, int arg2) {
        ++field8284;
        if (arg1 != 1) {
            field8287 = null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IBI)V", line = 119)
    public static final void method3418(int arg0, byte arg1, int arg2) {
        if (arg1 != 89) {
            method3418(-115, (byte) -47, 118);
        }
        ++field8295;
        class2.field16 = -class378.field5901 + arg0;
        class55.field717 = arg2 - class378.field5902;
    }
}
