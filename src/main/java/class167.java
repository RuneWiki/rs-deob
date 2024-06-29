import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class167 extends class92 {

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    private int field2565;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    private int field2571;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    private int field2564;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[I")
    public static int[] field2561 = new int[50];

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "[I")
    public static int[] field2566;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI[B)I")
    public static final int method1043(byte arg0, int arg1, byte[] arg2) {
        if (arg0 >= -11) {
            return 66;
        } else {
            ++field2562;
            return class261.method1747(arg1, 0, -74, arg2);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)V")
    public final void method45(int arg0, byte arg1, int arg2) {
        ++field2569;
        int var4 = this.field2563 * arg2 >> 12;
        int var5 = this.field2571 * arg2 >> 12;
        int var6 = this.field2564 * arg0 >> 12;
        int var7 = this.field2565 * arg0 >> 12;
        if (arg1 != 124) {
            method1043((byte) -58, -121, (byte[]) null);
        }
        class254.method1675((byte) 61, var7, var4, super.field1457, super.field1460, var6, var5, super.field1454);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(CBLjava/lang/String;)I")
    public static final int method1044(char arg0, byte arg1, String arg2) {
        ++field2567;
        int var3 = 0;
        int var4 = arg2.length();
        if (arg1 < 88) {
            field2561 = null;
        }
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            if (~arg2.charAt(var5) == ~arg0) {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        ++field2568;
        int var4 = this.field2564 * arg1 >> 12;
        int var5 = this.field2571 * arg0 >> 12;
        if (arg2 != -7368) {
            this.field2564 = 62;
        }
        int var6 = this.field2565 * arg1 >> 12;
        int var7 = this.field2563 * arg0 >> 12;
        class53.method361(var6, super.field1457, var5, 109, var7, var4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIZ)V")
    public final void method49(int arg0, int arg1, boolean arg2) {
        ++field2570;
        if (arg2) {
            int var4 = this.field2571 * arg1 >> 12;
            int var5 = this.field2563 * arg1 >> 12;
            int var6 = this.field2564 * arg0 >> 12;
            int var7 = this.field2565 * arg0 >> 12;
            class114.method733(var7, super.field1460, var6, var5, var4, super.field1454, -5755);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIIII)V")
    public class167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2565 = arg3;
        this.field2571 = arg2;
        this.field2564 = arg1;
        this.field2563 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static void method1045(int arg0) {
        field2566 = null;
        if (arg0 == -835145108) {
            field2561 = null;
        }
    }
}
