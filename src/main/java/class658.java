import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class658 {

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public int field9361 = 64;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public int field9362 = 1190717;

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "Z")
    public boolean field9363 = false;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
    public int field9359 = -1;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public int field9366 = 8;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public int field9356 = 127;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "Z")
    public boolean field9367 = true;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    public int field9371 = 512;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
    public int field9374 = -1;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
    public int field9372 = 0;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "Z")
    public boolean field9360 = true;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "J")
    public static long field9365 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "Z")
    public static boolean field9364 = false;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "Ljava/lang/String;")
    public static String field9375 = null;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field9357;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field9358;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    public int field9368;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "Lqha;")
    public class231 field9370;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lofa;I)V", line = 4)
    public final void method3700(class301 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1987(-90);
            if (var3 == 0) {
                int var4 = -106 / ((31 - arg1) / 46);
                field9373++;
                return;
            }
            this.method3703(arg0, -81, var3);
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 23)
    public static void method3701(int arg0) {
        if (arg0 <= 117) {
            field9365 = -88L;
        }
        field9375 = null;
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V", line = 46)
    public final void method3702(int arg0) {
        field9369++;
        this.field9366 = this.field9366 << 8 | this.field9368;
        if (arg0 != -11) {
            this.field9368 = 0;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lofa;II)V", line = 58)
    private final void method3703(class301 arg0, int arg1, int arg2) {
        if (arg1 > -18) {
            return;
        }
        if (arg2 == 1) {
            this.field9372 = class526.method3128(true, arg0.method1952(22085));
        } else if (arg2 == 2) {
            this.field9374 = arg0.method1987(-76);
        } else if (arg2 == 3) {
            this.field9374 = arg0.method1989((byte) -57);
            if (this.field9374 == 65535) {
                this.field9374 = -1;
            }
        } else if (arg2 == 5) {
            this.field9367 = false;
        } else if (arg2 == 7) {
            this.field9359 = class526.method3128(true, arg0.method1952(22085));
        } else if (arg2 == 8) {
            this.field9370.field3721 = this.field9368;
        } else if (arg2 == 9) {
            this.field9371 = arg0.method1989((byte) -103) << 2;
        } else if (arg2 == 10) {
            this.field9360 = false;
        } else if (arg2 == 11) {
            this.field9366 = arg0.method1987(-3);
        } else if (arg2 == 12) {
            this.field9363 = true;
        } else if (arg2 == 13) {
            this.field9362 = arg0.method1952(22085);
        } else if (arg2 == 14) {
            this.field9361 = arg0.method1987(-63) << 2;
        } else if (arg2 == 16) {
            this.field9356 = arg0.method1987(-118);
        }
        field9358++;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)V", line = 137)
    public static final void method3704(int arg0, int arg1) {
        field9357++;
        if (class521.field7529 == arg1) {
            return;
        }
        if (arg1 == 13) {
            if (field9375 == null) {
                class292.method1904(class355.field5377, class18.field190, class1.field4, -10);
            } else {
                class668.method3742(class355.field5377, arg0 + 5579);
            }
        }
        if (arg1 != 13 && class639.field8967 != null) {
            class639.field8967.method3118(25);
            class639.field8967 = null;
        }
        if (arg1 == 3) {
            class453.method2775(class706.field9964 != class673.field9523, (byte) -92);
        }
        if (arg1 == 7) {
            class563.method3256(true, class673.field9523 != class575.field8159);
        }
        if (arg1 == 5) {
            if (field9375 == null) {
                class177.method1383((byte) 23, class1.field4, class18.field190);
            } else {
                class81.method723(true);
            }
        } else if (arg1 == 6) {
            if (field9375 == null) {
                class292.method1904(class355.field5377, class18.field190, class1.field4, -55);
            } else {
                class668.method3742(class355.field5377, -119);
            }
        } else if (arg1 == 9) {
            if (field9375 == null) {
                class292.method1904(class355.field5377, class18.field190, class1.field4, arg0 ^ 0x1614);
            } else {
                class668.method3742(class355.field5377, -27);
            }
        } else if (arg1 == 12) {
            if (field9375 == null) {
                class177.method1383((byte) 23, class1.field4, class18.field190);
            } else {
                class81.method723(true);
            }
        }
        if (class616.method3509(class521.field7529, 104)) {
            class564.field7992.field6219 = 2;
            class68.field1065.field6219 = 2;
            class86.field1267.field6219 = 2;
            class17.field182.field6219 = 2;
            class666.field9462.field6219 = 2;
            class383.field5748.field6219 = 2;
            class602.field8511.field6219 = 2;
        }
        if (arg0 != -5697) {
            field9375 = null;
        }
        if (class616.method3509(arg1, 94)) {
            class348.field5128 = 0;
            class205.field3447 = 1;
            class559.field7939 = 0;
            class190.field3194 = 0;
            class620.field8723 = 1;
            class520.method3097(true, 16);
            class564.field7992.field6219 = 1;
            class68.field1065.field6219 = 1;
            class86.field1267.field6219 = 1;
            class17.field182.field6219 = 1;
            class666.field9462.field6219 = 1;
            class383.field5748.field6219 = 1;
            class602.field8511.field6219 = 1;
        }
        if (arg1 == 11 || arg1 == 3) {
            class708.method3926(-119);
        }
        boolean var2 = arg1 == 2 || class356.method2276(arg1, (byte) 54) || class563.method3255(arg1, (byte) -40);
        boolean var3 = class521.field7529 == 2 || class356.method2276(class521.field7529, (byte) 54) || class563.method3255(class521.field7529, (byte) -40);
        if (var2 != var3) {
            if (var2) {
                class647.field9210 = class643.field9184;
                if (class654.field9289.field5425.method155(3) == 0) {
                    class340.method2167(0, 2);
                } else {
                    class486.method2949(class521.field7518, 1, 0, false, 2, class643.field9184, class654.field9289.field5425.method155(3));
                    class384.method2409(false);
                }
                class570.field8089.method2944((byte) 77, false);
            } else {
                class340.method2167(arg0 + 5697, 2);
                class570.field8089.method2944((byte) 84, true);
            }
        }
        if (class616.method3509(arg1, 107) || arg1 == 13) {
            class364.field5573.method1265();
        }
        class521.field7529 = arg1;
    }
}
