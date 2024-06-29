import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class221 extends class296 {

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    private int field2888;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    private int field2879;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    private int field2885;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    private int field2876;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
    private int field2877;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    private int field2883;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    private int field2882;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "[J")
    public static long[] field2887 = new long[10];

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "[C")
    private static char[] field2884 = new char[64];

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lge;Z)Z")
    public static final boolean method1388(class599 arg0, boolean arg1) {
        ++field2874;
        if (arg1) {
            field2884 = null;
        }
        class600 var2 = class118.field1510.method3921(arg0.method710((byte) 92), -74);
        if (var2.field8300 == -1) {
            return true;
        } else {
            class55 var3 = class291.field3852.method1013(var2.field8300, (byte) 124);
            return ~var3.field717 == 0 ? true : var3.method324((byte) 122);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
    public final void method134(int arg0, int arg1, int arg2) {
        ++field2878;
        if (arg2 > -125) {
            method1388((class599) null, true);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBI)V")
    public final void method135(int arg0, byte arg1, int arg2) {
        ++field2886;
        if (arg1 < 20) {
            this.field2885 = 75;
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2888 = arg6;
        this.field2879 = arg1;
        this.field2885 = arg0;
        this.field2881 = arg2;
        this.field2876 = arg5;
        this.field2877 = arg3;
        this.field2883 = arg4;
        this.field2882 = arg7;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BII)V")
    public final void method136(byte arg0, int arg1, int arg2) {
        ++field2880;
        int var4 = this.field2885 * arg2 >> 12;
        int var5 = this.field2879 * arg1 >> 12;
        if (arg0 != 122) {
            this.method134(9, 35, -16);
        }
        int var6 = this.field2881 * arg2 >> 12;
        int var7 = this.field2877 * arg1 >> 12;
        int var8 = this.field2883 * arg2 >> 12;
        int var9 = this.field2876 * arg1 >> 12;
        int var10 = this.field2888 * arg2 >> 12;
        int var11 = this.field2882 * arg1 >> 12;
        class57.method333(var10, (byte) -33, var6, super.field3919, var4, var7, var8, var5, var11, var9);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method1389(int arg0) {
        field2887 = null;
        field2884 = null;
        if (arg0 != 0) {
            method1388((class599) null, true);
        }
    }

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field2884[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; ++var1) {
            field2884[var1] = (char) (var1 + -26 + 97);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field2884[var2] = (char) (var2 + -4);
        }
        field2884[63] = '-';
        field2884[62] = '*';
    }
}
