import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class59 extends class12 {

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
    private int[] field844 = new int[this.field89];

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field851 = 0;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "[B")
    private byte[] field853;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V", line = 10)
    public void method526(int arg0, byte arg1) {
        this.field853[this.field852++] = (byte) ((class88.method739(arg1, 255) >> 1) + 127);
        ++field846;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V", line = 18)
    public final void method62(boolean arg0) {
        this.field852 = 0;
        if (arg0) {
            this.method59(-17, 99, 21);
        }
        this.field843 = 0;
        ++field850;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIB)I", line = 33)
    public static final int method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 < 24) {
            return -23;
        } else {
            if (~(arg0 & 1) == -2) {
                int var7 = arg5;
                arg5 = arg2;
                arg2 = var7;
            }
            ++field845;
            int var8 = arg4 & 3;
            if (~var8 == -1) {
                return arg1;
            } else if (~var8 == -2) {
                return arg3;
            } else {
                return var8 == 2 ? -arg1 + 7 + 1 + -arg5 : -arg3 - arg2 + 1 + 7;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIIIIF)V", line = 65)
    public class59(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field89; ++var7) {
            this.field844[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V", line = 83)
    public final void method59(int arg0, int arg1, int arg2) {
        int var4 = -128 % ((arg1 - -67) / 33);
        this.field843 += this.field844[arg0] * arg2 >> 12;
        ++field855;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)I", line = 93)
    public static final int method528(int arg0, byte arg1, int arg2) {
        ++field849;
        if (arg1 < 26) {
            method528(53, (byte) -66, 102);
        }
        int var3 = class133.method990(arg0 - -45365, arg2 + 91923, false, 4) - (128 - (-128 + class133.method990(arg0 + 10294, arg2 - -37821, false, 2) >> 1)) - -(class133.method990(arg0, arg2, false, 1) - 128 >> 2);
        int var4 = (int) ((double) var3 * 0.3D) - -35;
        if (~var4 > -11) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 115)
    public final void method61(int arg0) {
        ++field854;
        this.field843 = Math.abs(this.field843);
        if (arg0 == 4) {
            if (this.field843 >= 4096) {
                this.field843 = 4095;
            }
            this.method526(this.field852++, (byte) (this.field843 >> 4));
            this.field843 = 0;
        }
    }
}
