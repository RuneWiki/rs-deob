import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class283 extends class1 {

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4235 = "flash3:";

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field4231 = -1;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "I")
    public static int field4232 = 0;

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "[I")
    public static int[] field4236 = new int[100];

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "S")
    public static short field4240 = 320;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "Lpf;")
    public static class294 field4243;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "Ljava/lang/String;")
    public String field4225;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "[I")
    public int[] field4229;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "[I")
    public int[] field4238;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "[Ljl;")
    public class253[] field4227;

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "[Ljava/lang/String;")
    public String[] field4241;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "[[B")
    public static byte[][] field4233;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lrf;IZII)V")
    public static final void method1864(class289 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        int var5 = 106 % ((18 - arg1) / 56);
        field4226++;
        int var6 = arg0.field4478;
        if (arg0.field4475 == 0) {
            arg0.field4478 = arg0.field4493;
        } else if (arg0.field4475 == 1) {
            arg0.field4478 = arg4 - arg0.field4493;
        } else if (arg0.field4475 == 2) {
            arg0.field4478 = arg0.field4493 * arg4 >> 14;
        } else if (arg0.field4475 == 3) {
            if (arg0.field4394 == 2) {
                arg0.field4478 = (arg0.field4493 - 1) * arg0.field4499 + arg0.field4493 * 32;
            } else if (arg0.field4394 == 7) {
                arg0.field4478 = arg0.field4493 * 115 + ((arg0.field4493 - 1) * arg0.field4499);
            }
        }
        int var7 = arg0.field4444;
        if (arg0.field4477 == 0) {
            arg0.field4444 = arg0.field4561;
        } else if (arg0.field4477 == 1) {
            arg0.field4444 = arg3 - arg0.field4561;
        } else if (arg0.field4477 == 2) {
            arg0.field4444 = arg0.field4561 * arg3 >> 14;
        } else if (arg0.field4477 == 3) {
            if (arg0.field4394 == 2) {
                arg0.field4444 = (arg0.field4561 - 1) * arg0.field4442 + arg0.field4561 * 32;
            } else if (arg0.field4394 == 7) {
                arg0.field4444 = (arg0.field4561 - 1) * arg0.field4442 + arg0.field4561 * 12;
            }
        }
        if (arg0.field4475 == 4) {
            arg0.field4478 = arg0.field4463 * arg0.field4444 / arg0.field4481;
        }
        if (arg0.field4477 == 4) {
            arg0.field4444 = arg0.field4481 * arg0.field4478 / arg0.field4463;
        }
        if (class64.field1009 && (client.method972(arg0).field4049 != 0 || arg0.field4394 == 0)) {
            if (arg0.field4444 < 5 && arg0.field4478 < 5) {
                arg0.field4444 = 5;
                arg0.field4478 = 5;
            } else {
                if (arg0.field4478 <= 0) {
                    arg0.field4478 = 5;
                }
                if (arg0.field4444 <= 0) {
                    arg0.field4444 = 5;
                }
            }
        }
        if (arg0.field4496 == 1337) {
            class56.field899 = arg0;
        }
        if (arg2 && arg0.field4426 != null && arg0.field4478 != var6 || arg0.field4444 != var7) {
            class234 var8 = new class234();
            var8.field3533 = arg0.field4426;
            var8.field3528 = arg0;
            class292.field4603.method987(var8, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V")
    public static void method1865(byte arg0) {
        field4233 = null;
        field4243 = null;
        field4235 = null;
        if (arg0 == 7) {
            field4236 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(B)Z")
    public static final boolean method1866(byte arg0) {
        field4237++;
        class200 var1 = class284.field4244;
        synchronized (class284.field4244) {
            if (class75.field1221 == class176.field2695) {
                return false;
            } else if (arg0 >= -99) {
                return true;
            } else {
                class183.field2773 = class52.field838[class176.field2695];
                class178.field2724 = class261.field3964[class176.field2695];
                class176.field2695 = class176.field2695 + 1 & 0x7F;
                return true;
            }
        }
    }
}
