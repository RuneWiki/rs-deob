import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class215 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "J")
    public static long field3579 = 0L;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field3584 = 0;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Loe;BI)V", line = 9)
    public final void method1495(class146 arg0, byte arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1005((byte) 122);
            if (var4 == 0) {
                field3580++;
                if (arg1 != -122) {
                    this.field3585 = -37;
                }
                return;
            }
            this.method1498(arg2, false, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)I", line = 30)
    public static final int method1496(int arg0, int arg1, int arg2) {
        field3581++;
        if (arg1 != -11425) {
            field3579 = 22L;
        }
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Lsc;", line = 70)
    public final class288 method1497(int arg0) {
        field3577++;
        class288 var2 = (class288) class191.field3242.method893((long) this.field3583, arg0 ^ 0x6E);
        if (var2 != null) {
            return var2;
        }
        class288 var3 = class216.method1504(class147.field2509, (byte) -114, arg0, this.field3583);
        if (var3 != null) {
            class191.field3242.method888((long) this.field3583, var3, 16);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZILoe;)V", line = 88)
    private final void method1498(int arg0, boolean arg1, int arg2, class146 arg3) {
        if (arg1) {
            field3584 = -54;
        }
        field3578++;
        if (arg2 == 1) {
            this.field3583 = arg3.method989(126);
        } else if (arg2 == 2) {
            this.field3585 = arg3.method1005((byte) 122);
            this.field3586 = arg3.method1005((byte) 122);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lek;B)V", line = 113)
    public static final void method1499(class206 arg0, byte arg1) {
        class79.field1394 = arg0;
        if (arg1 < 80) {
            field3584 = -73;
        }
        field3587++;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V", line = 133)
    public static final void method1500(int arg0) {
        class133.field2290 = true;
        if (arg0 <= -84) {
            field3582++;
        }
    }
}
