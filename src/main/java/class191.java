import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class191 extends class14 {

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    private int field2872;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    private int field2870;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    private int field2862;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    private int field2871;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field2869 = 0;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2868 = null;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2874;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field2865;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BII)V", line = 6)
    public final void method82(byte arg0, int arg1, int arg2) {
        field2876++;
        int var4 = this.field2862 * arg2 >> 12;
        int var5 = this.field2872 * arg2 >> 12;
        if (arg0 > -47) {
            method1307((byte) 55);
        }
        int var6 = this.field2871 * arg1 >> 12;
        int var7 = this.field2870 * arg1 >> 12;
        class161.method1165(var6, var5, var7, this.field146, var4, (byte) 122);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B", line = 25)
    public static final byte[] method1303(Object arg0, int arg1, boolean arg2) {
        field2873++;
        if (arg0 == null) {
            return null;
        } else if ((arg0 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg0);
            return arg2 ? class274.method1972(var4, 0) : var4;
        } else {
            if (arg1 != 2) {
                method1307((byte) -48);
            }
            if (!(arg0 instanceof class115)) {
                throw new IllegalArgumentException();
            }
            class115 var3 = (class115) arg0;
            return var3.method745(false);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(BII)V", line = 62)
    public final void method89(byte arg0, int arg1, int arg2) {
        field2866++;
        int var4 = this.field2862 * arg1 >> 12;
        int var5 = this.field2871 * arg2 >> 12;
        int var6 = this.field2872 * arg1 >> 12;
        int var7 = this.field2870 * arg2 >> 12;
        int var8 = -59 / ((arg0) / 32);
        class205.method1437(var5, var6, this.field138, var4, this.field146, -79, this.field151, var7);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IS)Z", line = 80)
    public static final boolean method1304(int arg0, short arg1) {
        if (arg0 != -4378) {
            field2874 = (String) null;
        }
        field2875++;
        if (arg1 == 35 || arg1 == 34 || arg1 == 31 || arg1 == 51 || arg1 == 16 || arg1 == 50 || arg1 == 7 || arg1 == 30) {
            return true;
        } else if (arg1 == 29 || arg1 == 32 || arg1 == 1001 || arg1 == 1006) {
            return true;
        } else if (arg1 == 26 || arg1 == 12 || arg1 == 38 || arg1 == 23 || arg1 == 47) {
            return true;
        } else {
            return arg1 == 19 || arg1 == 11 || arg1 == 43 || arg1 == 2 || arg1 == 37 || arg1 == 45;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILnk;)[Lch;", line = 107)
    public static final class158[] method1305(int arg0, int arg1, int arg2, class16 arg3) {
        field2864++;
        if (arg1 == 729484588) {
            return class102.method648(arg0, -1000000000, arg2, arg3) ? class33.method227(arg1 - 729484588) : null;
        } else {
            return (class158[]) null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLnk;)V", line = 121)
    public static final void method1306(boolean arg0, class16 arg1) {
        field2867++;
        class258.field4075 = arg1.method93(-90, "runes");
        if (!arg0) {
            method1307((byte) -35);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V", line = 138)
    public final void method84(int arg0, int arg1, int arg2) {
        field2863++;
        int var4 = this.field2862 * arg1 >> 12;
        if (arg2 == 9432) {
            int var5 = this.field2872 * arg1 >> 12;
            int var6 = this.field2870 * arg0 >> 12;
            int var7 = this.field2871 * arg0 >> 12;
            class192.method1310(this.field151, var4, this.field138, (byte) -23, var6, var5, var7);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIII)V", line = 162)
    public class191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2872 = arg2;
        this.field2870 = arg3;
        this.field2862 = arg0;
        this.field2871 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 176)
    public static void method1307(byte arg0) {
        int var1 = -126 % ((-arg0 - 10) / 47);
        field2865 = null;
        field2868 = null;
        field2874 = null;
    }
}
