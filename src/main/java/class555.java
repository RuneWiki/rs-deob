import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class555 {

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Lap;")
    private class435 field7905;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "J")
    public long field7904;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "[I")
    public static int[] field7908 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Z")
    public static boolean field7909 = false;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field7901;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field7902;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field7907;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I", line = 5)
    public static int method3127(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 12)
    public static final void method3128(byte arg0) {
        field7901++;
        if (class377.field4901) {
            return;
        }
        if (class601.field8530.field2880) {
            class90.field1041 = ((int) class90.field1041 - 65 & 0xFFFFFF80);
        } else {
            class574.field8149 += (-24.0F - class574.field8149) / 2.0F;
        }
        if (arg0 <= -117) {
            class356.field4671 = true;
            class377.field4901 = true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILiaa;)Ldu;", line = 38)
    public static final class323 method3129(int arg0, class452 arg1) {
        if (arg0 != -27077) {
            field7900 = 22;
        }
        field7902++;
        return new class323(arg1.method2549((byte) 32), arg1.method2549((byte) 32), arg1.method2549((byte) 32), arg1.method2549((byte) 32), arg1.method2549((byte) 32), arg1.method2549((byte) 32), arg1.method2549((byte) 32), arg1.method2549((byte) 32), arg1.method2524(3), arg1.method2541(79));
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V", line = 49)
    public static void method3130(byte arg0) {
        int var1 = -67 % ((arg0 - 39) / 40);
        field7908 = null;
    }

    @OriginalMember(owner = "client!lj", name = "finalize", descriptor = "()V", line = 65)
    protected final void finalize() throws Throwable {
        field7907++;
        this.field7905.method2326(this.field7904, false);
        super.finalize();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIILep;)V", line = 77)
    public static final void method3131(byte arg0, int arg1, int arg2, class382 arg3) {
        field7903++;
        if (arg3.field5022 == 0) {
            arg3.field4996 = arg3.field5101;
        } else if (arg3.field5022 == 1) {
            arg3.field4996 = (arg1 - arg3.field5035) / 2 + arg3.field5101;
        } else if (arg3.field5022 == 2) {
            arg3.field4996 = arg1 - arg3.field5101 - arg3.field5035;
        } else if (arg3.field5022 == 3) {
            arg3.field4996 = arg3.field5101 * arg1 >> 14;
        } else if (arg3.field5022 == 4) {
            arg3.field4996 = (arg1 - arg3.field5035) / 2 + (arg3.field5101 * arg1 >> 14);
        } else {
            arg3.field4996 = arg1 - arg3.field5035 - (arg3.field5101 * arg1 >> 14);
        }
        if (arg3.field5120 == 0) {
            arg3.field4987 = arg3.field5030;
        } else if (arg3.field5120 == 1) {
            arg3.field4987 = (arg2 - arg3.field4958) / 2 + arg3.field5030;
        } else if (arg3.field5120 == 2) {
            arg3.field4987 = arg2 - arg3.field4958 - arg3.field5030;
        } else if (arg3.field5120 == 3) {
            arg3.field4987 = arg3.field5030 * arg2 >> 14;
        } else if (arg3.field5120 == 4) {
            arg3.field4987 = (arg2 - arg3.field4958) / 2 + (arg3.field5030 * arg2 >> 14);
        } else {
            arg3.field4987 = arg2 - (arg3.field4958 + (arg3.field5030 * arg2 >> 14));
        }
        if (arg0 != -110 || !class87.field933 || client.method1530(arg3).field3339 == 0 && arg3.field5112 != 0) {
            return;
        }
        if (arg3.field4996 < 0) {
            arg3.field4996 = 0;
        } else if (arg1 < (arg3.field5035 + arg3.field4996)) {
            arg3.field4996 = arg1 - arg3.field5035;
        }
        if (arg3.field4987 < 0) {
            arg3.field4987 = 0;
        } else if ((arg3.field4987 + arg3.field4958) > arg2) {
            arg3.field4987 = arg2 - arg3.field4958;
            return;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lap;J[Ldl;)V", line = 150)
    public class555(class435 arg0, long arg1, class58[] arg2) {
        this.field7905 = arg0;
        this.field7904 = arg1;
    }
}
