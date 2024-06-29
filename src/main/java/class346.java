import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class346 {

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "Z")
    public boolean field4946 = false;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
    public int field4947 = 1190717;

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "Z")
    public boolean field4949 = true;

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "I")
    public int field4954 = 127;

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "I")
    public int field4952 = 64;

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "Z")
    public boolean field4948 = true;

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
    public int field4961 = 0;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public int field4957 = -1;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
    public int field4955 = -1;

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "I")
    public int field4962 = -1;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
    public int field4958 = 8;

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
    public int field4965 = 512;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "Lig;")
    public static class206 field4953 = new class206(51, -2);

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "I")
    public int field4963;

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "Lpp;")
    public class333 field4956;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V", line = 9)
    public final void method2216(byte arg0) {
        this.field4958 = this.field4958 << 8 | this.field4963;
        if (arg0 == -33) {
            if (this.field4955 == -1) {
                this.field4955 = this.field4957;
            }
            field4960++;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ILrt;)V", line = 45)
    public final void method2217(int arg0, class194 arg1) {
        if (arg0 != -7463) {
            this.field4961 = 92;
        }
        field4950++;
        while (true) {
            int var3 = arg1.method1177(255);
            if (var3 == 0) {
                return;
            }
            this.method2218((byte) 126, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BILrt;)V", line = 66)
    private final void method2218(byte arg0, int arg1, class194 arg2) {
        field4951++;
        if (arg1 == 1) {
            this.field4961 = class518.method3068((byte) -49, arg2.method1180(-832631516));
        } else if (arg1 == 2) {
            this.field4957 = arg2.method1177(255);
        } else if (arg1 == 3) {
            this.field4957 = arg2.method1220(-12);
            if (this.field4957 == 65535) {
                this.field4957 = -1;
            }
        } else if (arg1 == 5) {
            this.field4948 = false;
        } else if (arg1 == 7) {
            this.field4962 = class518.method3068((byte) -52, arg2.method1180(-832631516));
        } else if (arg1 == 8) {
            this.field4956.field4795 = this.field4963;
        } else if (arg1 == 9) {
            this.field4965 = arg2.method1220(112) << 2;
        } else if (arg1 == 10) {
            this.field4949 = false;
        } else if (arg1 == 11) {
            this.field4958 = arg2.method1177(255);
        } else if (arg1 == 12) {
            this.field4946 = true;
        } else if (arg1 == 13) {
            this.field4947 = arg2.method1180(-832631516);
        } else if (arg1 == 14) {
            this.field4952 = arg2.method1177(255) << 2;
        } else if (arg1 == 15) {
            this.field4955 = arg2.method1220(112);
            if (this.field4955 == 65535) {
                this.field4955 = -1;
            }
        } else if (arg1 == 16) {
            this.field4954 = arg2.method1177(255);
        }
        if (arg0 <= 125) {
            this.field4957 = 36;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 163)
    public static void method2219(int arg0) {
        field4953 = null;
        if (arg0 != 21339) {
            method2219(57);
        }
    }
}
