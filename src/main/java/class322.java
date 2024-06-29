import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class322 extends class265 {

    @OriginalMember(owner = "client!nq", name = "V", descriptor = "I")
    public int field4089;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "Z")
    public boolean field4081;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "F")
    public float field4080;

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "F")
    public float field4082;

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "I")
    public int field4084;

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "I")
    public static int field4086 = 0;

    @OriginalMember(owner = "client!nq", name = "U", descriptor = "[I")
    public static int[] field4088 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!nq", name = "W", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!nq", name = "T", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lug;IIIIIZ)V")
    public class322(class395 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field4089 = arg5;
        if (~super.field1604 == -34038) {
            this.field4081 = false;
            this.field4080 = (float) arg4;
            this.field4082 = (float) arg5;
        } else {
            this.field4080 = this.field4082 = 1.0F;
            this.field4081 = true;
        }
        this.field4084 = arg4;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lug;IIIIIIZ)V")
    public class322(class395 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4084 = arg3;
        this.field4081 = false;
        this.field4082 = (float) arg4 / (float) arg6;
        this.field4080 = (float) arg3 / (float) arg5;
        this.field4089 = arg4;
        this.method1578(false, 0, false);
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lug;IIII[I)V")
    public class322(class395 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4089 = arg2;
        this.field4084 = arg1;
        this.method1582(4, arg2, arg5, 0, 0, arg1, true, 0, 0);
        this.field4080 = (float) arg1 / (float) arg3;
        this.field4082 = (float) arg2 / (float) arg4;
        this.field4081 = false;
        this.method1578(false, 0, false);
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lug;IIIII[BI)V")
    public class322(class395 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4089 = arg3;
        this.field4084 = arg2;
        this.method1575(arg3, arg6, arg2, arg7, 0, true, 0, 0, (byte) 109, 0);
        this.field4080 = (float) arg2 / (float) arg4;
        this.field4081 = false;
        this.field4082 = (float) arg3 / (float) arg5;
        this.method1578(false, 0, false);
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lug;IIIIZ[BI)V")
    public class322(class395 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field1604 == -34038) {
            this.field4080 = (float) arg3;
            this.field4081 = false;
            this.field4082 = (float) arg4;
        } else {
            this.field4080 = this.field4082 = 1.0F;
            this.field4081 = true;
        }
        this.field4084 = arg3;
        this.field4089 = arg4;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lug;IIIZ[I)V")
    public class322(class395 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (super.field1604 != 34037) {
            this.field4080 = this.field4082 = 1.0F;
            this.field4081 = true;
        } else {
            this.field4080 = (float) arg2;
            this.field4081 = false;
            this.field4082 = (float) arg3;
        }
        this.field4084 = arg2;
        this.field4089 = arg3;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIII)V")
    public static final void method1888(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 1007) {
            if (~arg1 == -1007) {
                class239.method1445(class515.field7470, arg0, arg3);
            } else if (arg1 != 1011) {
                if (~arg1 != -1011) {
                    if (arg1 == 1009) {
                        class239.method1445(class401.field5716, arg0, arg3);
                    }
                } else {
                    class239.method1445(class25.field368, arg0, arg3);
                }
            } else {
                class239.method1445(class193.field2496, arg0, arg3);
            }
        } else {
            class239.method1445(class36.field484, arg0, arg3);
        }
        if (arg2 != 99) {
            field4086 = 19;
        }
        ++field4085;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V")
    public static void method1889(int arg0) {
        field4088 = null;
        if (arg0 != 26899) {
            method1890(70);
        }
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)V")
    public static final void method1890(int arg0) {
        class2.field13.method2383(true);
        ++field4083;
        class359.field4633.method2629(105);
        class360.field4654.method2046((byte) -67);
        class315.field4017.method1959((byte) 110);
        class390.field5244.method1332(true);
        class376.field4949.method618(3);
        class404.field5756.method552(30);
        class120.field1624.method1840(true);
        class242.field3132.method1685(76);
        class436.field6239.method2960(arg0);
        class327.field4134.method2577((byte) 96);
        class72.field931.method954(-99);
        class505.field7281.method1623(36);
        class143.field1839.method3027((byte) -27);
        class199.field2592.method2584(arg0 ^ -952);
        class456.field6572.method750(true);
        class375.field4840.method2425(122);
        class38.field503.method1602(true);
        class72.field927.method1724(true);
        class100.field1217.method1050((byte) -103);
        class500.method3010((byte) 110);
        class51.method515(arg0 ^ 262144);
        class125.method881((byte) -4);
        class506.method3038(-2);
        class515.field7469.method2640(123);
        class489.field7110.method2640(109);
        class505.field7279.method2640(122);
        class42.field518.method2640(arg0 ^ 88);
        class239.field3077.method2640(118);
    }

    static {
        new class335("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field4090 = -1;
        field4091 = 1338;
    }
}
