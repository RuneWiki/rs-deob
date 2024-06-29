import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class195 {

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "[Ljava/lang/String;")
    public String[] field3152;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "[I")
    public int[] field3149;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[I")
    public int[] field3142;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[B")
    public byte[] field3146;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "F")
    public static float field3151 = 128.0F;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "B")
    public static byte field3148;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "[Ldl;")
    public static class46[] field3154;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
    public static final int method1274(int arg0, int arg1) {
        field3155++;
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < arg1) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)I")
    public final int method1275(int arg0, byte arg1) {
        if (arg1 != -24) {
            field3148 = -67;
        }
        field3143++;
        return this.field3146[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)Z")
    public final boolean method1276(int arg0, int arg1) {
        field3150++;
        if (arg0 != -1) {
            this.field3152 = null;
        }
        return (this.field3146[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)Z")
    public final boolean method1277(int arg0, int arg1) {
        field3144++;
        if (arg1 != -32159) {
            this.field3146 = null;
        }
        return (this.field3146[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method1278(byte arg0) {
        field3154 = null;
        if (arg0 != -86) {
            field3151 = 0.85075766F;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method1279(int arg0) {
        if (arg0 > 95) {
            field3156++;
            class67.field1115.method53(true);
            class91.field1609.method53(true);
            class201.field3302.method53(true);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IB)Z")
    public final boolean method1280(int arg0, byte arg1) {
        int var3 = -117 / ((-arg1 - 35) / 49);
        field3141++;
        return (this.field3146[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Lid;")
    public static final class100 method1281(int arg0) {
        if (arg0 != 18170) {
            field3151 = -0.30122834F;
        }
        field3153++;
        class148 var1 = new class148(class79.field1365, class9.field116, class112.field2028[0], class213.field3588[0], class110.field1983[0], class12.field168[0], class199.field3226[0], class54.field941);
        class253.method1679((byte) -84);
        return var1;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static final void method1282(byte arg0) {
        field3145++;
        class267.field4315.method53(true);
        if (arg0 != -84) {
            field3154 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lvh;BII)[Lid;")
    public static final class100[] method1283(class108 arg0, byte arg1, int arg2, int arg3) {
        field3147++;
        if (class127.method876(arg2, arg0, arg3, -8635)) {
            return arg1 >= -63 ? null : class250.method1668(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBII)V")
    public static final void method1284(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 < 57) {
            method1274(-20, -9);
        }
        int var4 = class50.field872 * arg0 >> 8;
        if (var4 != 0 && arg2 != -1) {
            class246.method1647(false, arg2, class181.field2968, 0, var4, -11577);
            class175.field2874 = true;
        }
        field3140++;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V")
    public class195(int arg0) {
        this.field3158 = arg0;
        this.field3152 = new String[this.field3158];
        this.field3149 = new int[this.field3158];
        this.field3142 = new int[this.field3158];
        this.field3146 = new byte[this.field3158];
    }
}
