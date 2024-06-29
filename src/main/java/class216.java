import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class216 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Z")
    public boolean field3046 = true;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Z")
    public boolean field3048 = true;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field3047 = 8;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public int field3051 = -1;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field3050 = 0;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field3055 = 1190717;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field3052 = 16;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Z")
    public boolean field3049 = false;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public int field3059 = -1;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public int field3058 = 128;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Lkk;")
    public static class295 field3057;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 13)
    public static final void method1569(int arg0, int arg1) {
        class318.field4684.method2264((byte) -94, arg1);
        if (arg0 != -1) {
            method1572((byte) 36);
        }
        field3056++;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)I", line = 24)
    public static final int method1570(int arg0, int arg1) {
        field3045++;
        if (arg1 > 0) {
            return 1;
        } else if (arg0 < ~arg1) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILfd;I)V", line = 63)
    public final void method1571(int arg0, class299 arg1, int arg2) {
        if (arg2 != -1) {
            this.field3048 = false;
        }
        field3053++;
        while (true) {
            int var4 = arg1.method2096((byte) -122);
            if (var4 == 0) {
                return;
            }
            this.method1573(var4, -119, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 84)
    public static void method1572(byte arg0) {
        if (arg0 != 16) {
            method1570(10, -62);
        }
        field3057 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIILfd;)V", line = 104)
    private final void method1573(int arg0, int arg1, int arg2, class299 arg3) {
        field3054++;
        if (arg0 == 1) {
            this.field3050 = class90.method653(arg3.method2085((byte) 82), 1624671788);
        } else if (arg0 == 2) {
            this.field3059 = arg3.method2096((byte) -122);
        } else if (arg0 == 3) {
            this.field3059 = arg3.method2083((byte) -123);
            if (this.field3059 == 65535) {
                this.field3059 = -1;
            }
        } else if (arg0 == 5) {
            this.field3048 = false;
        } else if (arg0 == 7) {
            this.field3051 = class90.method653(arg3.method2085((byte) 72), 1624671788);
        } else if (arg0 == 8) {
            class154.field2144 = arg2;
        } else if (arg0 == 9) {
            this.field3058 = arg3.method2083((byte) -108);
        } else if (arg0 == 10) {
            this.field3046 = false;
        } else if (arg0 == 11) {
            this.field3047 = arg3.method2096((byte) -122);
        } else if (arg0 == 12) {
            this.field3049 = true;
        } else if (arg0 == 13) {
            this.field3055 = arg3.method2085((byte) 84);
        } else if (arg0 == 14) {
            this.field3052 = arg3.method2096((byte) -122);
        }
        if (arg1 > -51) {
            this.field3050 = -48;
        }
    }
}
