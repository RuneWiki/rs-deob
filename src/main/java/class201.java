import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class201 extends class261 {

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field3483 = 0;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field3478 = -1;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field3482 = 0;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field3485 = 0;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "[I")
    public static int[] field3488 = new int[1000];

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V", line = 5)
    public static void method1461(int arg0) {
        if (arg0 >= -111) {
            method1462((class197) null, -119);
        }
        field3488 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ltl;I)V", line = 22)
    public static final void method1462(class197 arg0, int arg1) {
        field3481++;
        int var2 = arg0.field3392;
        if (var2 == 324) {
            if (class32.field511 == -1) {
                class32.field511 = arg0.field3337;
                class11.field159 = arg0.field3407;
            }
            if (class34.field543.field5277) {
                arg0.field3337 = class32.field511;
            } else {
                arg0.field3337 = class11.field159;
            }
        } else if (var2 == 325) {
            if (class32.field511 == -1) {
                class11.field159 = arg0.field3407;
                class32.field511 = arg0.field3337;
            }
            if (class34.field543.field5277) {
                arg0.field3337 = class11.field159;
            } else {
                arg0.field3337 = class32.field511;
            }
        } else {
            if (arg1 >= -50) {
                field3478 = 30;
            }
            if (var2 == 327) {
                arg0.field3251 = 150;
                arg0.field3350 = (int) (Math.sin((double) class277.field4768 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field3399 = -1;
                arg0.field3274 = 5;
            } else if (var2 == 328) {
                if (class276.field4742.field4068 == null) {
                    arg0.field3399 = 0;
                } else {
                    arg0.field3251 = 150;
                    arg0.field3350 = (int) (Math.sin((double) class277.field4768 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field3274 = 5;
                    arg0.field3399 = ((int) class276.field4742.field4068.method1764((byte) -124) << 11) + 2047;
                    arg0.field3309 = class276.field4742.field5114;
                    arg0.field3373 = class276.field4742.field5163;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 104)
    public class201() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)[I", line = 115)
    public final int[] method21(byte arg0, int arg1) {
        field3480++;
        int var3 = 42 / ((-arg0 - 49) / 33);
        return class245.field4120;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lve;B)Lsl;", line = 154)
    public static final class91 method1463(class255 arg0, byte arg1) {
        field3486++;
        if (arg1 != -26) {
            return (class91) null;
        }
        for (class91 var2 = (class91) class284.field4884.method1471((byte) -107); var2 != null; var2 = (class91) class284.field4884.method1475((byte) 83)) {
            if (var2.field1568.method1752(true, arg0)) {
                return var2;
            }
        }
        return null;
    }
}
