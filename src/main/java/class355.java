import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class355 extends class323 implements class231 {

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "Luj;")
    public class323 field4836;

    @OriginalMember(owner = "client!nv", name = "C", descriptor = "I")
    public static int field4839 = 0;

    @OriginalMember(owner = "client!nv", name = "A", descriptor = "Llu;")
    public static class610 field4837 = new class610(33, 4);

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!nv", name = "B", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!nv", name = "D", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!nv", name = "E", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!nv", name = "F", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!nv", name = "G", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!nv", name = "H", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!nv", name = "I", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!nv", name = "J", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!nv", name = "L", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!nv", name = "M", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!nv", name = "N", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!nv", name = "O", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!nv", name = "K", descriptor = "[I")
    public static int[] field4847;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        field4840++;
        if (arg0 >= -120) {
            field4847 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lqa;I)Lpl;")
    public final class558 method189(class208 arg0, int arg1) {
        field4842++;
        return arg1 == 31733 ? this.field4836.method189(arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(IIIIILuj;)V")
    public class355(int arg0, int arg1, int arg2, int arg3, int arg4, class323 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class310.method1895(arg0, (byte) 126, arg1));
        this.field4836 = arg5;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BCLjava/lang/String;)I")
    public static final int method2142(byte arg0, char arg1, String arg2) {
        field4850++;
        int var3 = 0;
        int var4 = arg2.length();
        if (arg0 > -49) {
            return -74;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLqa;)V")
    public final void method174(byte arg0, class208 arg1) {
        if (arg0 > -36) {
            this.method170(0);
        }
        field4831++;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method2143(int arg0, int arg1, byte[] arg2) {
        field4845++;
        if (arg1 != 100) {
            field4847 = null;
        }
        byte[] var3 = new byte[arg0];
        class648.method3737(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLkda;)V")
    public static final void method2144(boolean arg0, class328 arg1) {
        class19.field189 = 0;
        field4841++;
        class555.field8274 = 0;
        class515.field7349 = new class374();
        class636.field9306 = new class434[1024];
        class6.field57 = new class206[class330.field4548[class647.field9400] + 1];
        class65.field803 = 0;
        class450.field6324 = 0;
        class554.method3347(21260, arg1);
        class602.method3556((byte) -6, arg1);
        if (!arg0) {
            field4837 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        if (arg3 <= 44) {
            this.method192((byte) 46);
        }
        field4846++;
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILqa;)V")
    public final void method194(int arg0, class208 arg1) {
        field4843++;
        if (arg0 != 0) {
            field4839 = 29;
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
    public final void method172(int arg0) {
        field4832++;
        if (arg0 <= 95) {
            this.method178((byte) -3, null);
        }
    }

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "(I)V")
    public static void method2145(int arg0) {
        field4837 = null;
        field4847 = null;
        if (arg0 != 33) {
            field4839 = 73;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V")
    public static final void method2146(int arg0, int arg1) {
        class276.field3881 = 100;
        class90.field1352 = -1;
        field4849++;
        class572.field8429 = 3;
        if (arg0 >= -38) {
            method2144(true, null);
        }
        class383.field5268 = arg1;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(ILqa;)Lin;")
    public final class77 method181(int arg0, class208 arg1) {
        field4835++;
        return arg0 <= 0 ? null : null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)I")
    public final int method1941(boolean arg0) {
        if (arg0) {
            this.method183(52);
        }
        field4833++;
        return 0;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        if (arg0 == -41) {
            field4848++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I")
    public final int method183(int arg0) {
        if (arg0 != -19248) {
            method2143(1, 127, null);
        }
        field4851++;
        return 0;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BILqa;)Lr;")
    public final class159 method190(byte arg0, int arg1, class208 arg2) {
        field4844++;
        if (arg0 < 40) {
            field4837 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)I")
    public final int method173(byte arg0) {
        field4838++;
        int var2 = 67 % ((arg0 + 43) / 49);
        return 0;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(BLqa;)V")
    public final void method178(byte arg0, class208 arg1) {
        if (arg0 != 115) {
            field4847 = null;
        }
        field4834++;
    }
}
