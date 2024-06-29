import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class577 extends class142 {

    @OriginalMember(owner = "client!kba", name = "v", descriptor = "[I")
    private int[] field8061 = new int[this.field1832];

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "Ltb;")
    public static class450 field8054 = new class450(4);

    @OriginalMember(owner = "client!kba", name = "x", descriptor = "Lwp;")
    public static class453 field8063 = new class453(96, -2);

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "I")
    private int field8053;

    @OriginalMember(owner = "client!kba", name = "p", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!kba", name = "q", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!kba", name = "r", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!kba", name = "s", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!kba", name = "t", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!kba", name = "u", descriptor = "I")
    private int field8060;

    @OriginalMember(owner = "client!kba", name = "y", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!kba", name = "A", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!kba", name = "w", descriptor = "[B")
    private byte[] field8062;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IBB)V", line = 7)
    public void method2041(int arg0, byte arg1, byte arg2) {
        if (arg1 != -76) {
            method3183(47);
        }
        this.field8062[this.field8053++] = (byte) (127 + class695.method3921(127, arg2 >> 1));
        ++field8064;
    }

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V", line = 18)
    public final void method836(int arg0) {
        this.field8053 = 0;
        ++field8055;
        this.field8060 = 0;
        int var2 = 64 / ((arg0 - -84) / 39);
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IIIIIF)V", line = 30)
    public class577(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field1832; ++var7) {
            this.field8061[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BI)V", line = 49)
    public static final void method3180(byte arg0, int arg1) {
        ++field8066;
        class592 var2 = class61.method371(6, arg1, (byte) -104);
        var2.method3253(0);
        if (arg0 != -43) {
            field8054 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BII)V", line = 63)
    public final void method838(byte arg0, int arg1, int arg2) {
        if (arg0 < 111) {
            this.method2041(57, (byte) 46, (byte) -53);
        }
        ++field8059;
        this.field8060 += this.field8061[arg1] * arg2 >> 12;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 85)
    public static final String method3181(byte arg0, long arg1) {
        if (arg0 >= -53) {
            return null;
        } else {
            ++field8065;
            if (~arg1 < -1L && arg1 < 6582952005840035281L) {
                if (~(arg1 % 37L) == -1L) {
                    return null;
                } else {
                    int var3 = 0;
                    for (long var4 = arg1; ~var4 != -1L; var4 /= 37L) {
                        ++var3;
                    }
                    StringBuffer var6 = new StringBuffer(var3);
                    while (~arg1 != -1L) {
                        long var7 = arg1;
                        arg1 /= 37L;
                        var6.append(class491.field6484[(int) (var7 - arg1 * 37L)]);
                    }
                    return var6.reverse().toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Ldt;Lpl;Lpl;Lpl;I)Z", line = 124)
    public static final boolean method3182(class223 arg0, class612 arg1, class612 arg2, class612 arg3, int arg4) {
        class598.field8405 = arg0;
        ++field8056;
        class70.field949 = arg1;
        class636.field8925 = arg2;
        if (arg4 > -67) {
            return false;
        } else {
            class488.field6467 = arg3;
            return true;
        }
    }

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)V", line = 142)
    public static void method3183(int arg0) {
        field8054 = null;
        field8063 = null;
        if (arg0 != 0) {
            method3181((byte) 38, 17L);
        }
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V", line = 156)
    public final void method835(int arg0) {
        this.field8060 = Math.abs(this.field8060);
        ++field8058;
        if (~this.field8060 <= -4097) {
            this.field8060 = 4095;
        }
        this.method2041(this.field8053++, (byte) -76, (byte) (this.field8060 >> 4));
        this.field8060 = 0;
        if (arg0 != 1) {
            method3182((class223) null, (class612) null, (class612) null, (class612) null, 20);
        }
    }
}
