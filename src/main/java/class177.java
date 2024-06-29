import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class177 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lea;")
    public static class38 field3578 = class9.method46((byte) 126, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lea;")
    private static class38 field3588 = class9.method46((byte) 115, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Lea;")
    public static class38 field3589 = field3588;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lda;")
    public static class29 field3580 = new class29(8);

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
    public static int field3593 = 0;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field3594 = 0;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field3596 = 128;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public int field3575;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public int field3577;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Lff;")
    public class52 field3576;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lff;")
    public class52 field3585;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Lff;")
    public class52 field3586;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "[Lk;")
    public static class89[] field3592;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1222(int arg0) {
        if (arg0 != 2) {
            field3595 = -65;
        }
        field3589 = null;
        field3578 = null;
        field3580 = null;
        field3592 = null;
        field3588 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static final void method1223(byte arg0) {
        if (class39.field876 != null) {
            class39.field876.method366((byte) -128);
            class39.field876 = null;
        }
        field3583++;
        class141.method1016((byte) 75);
        class101.field2268.method1138();
        for (int var1 = 0; var1 < 4; var1++) {
            class160.field3337[var1].method392(false);
        }
        System.gc();
        class80.method679(-119, 2);
        class179.field3615 = -1;
        if (arg0 < -69) {
            class134.field2826 = false;
            class101.method826(-15581);
            class7.method31(10, 27931);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)Lwa;")
    public static final class198 method1224(byte arg0, int arg1) {
        field3582++;
        class198 var2 = (class198) class7.field179.method1078((byte) 107, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 <= 54) {
            return null;
        } else {
            byte[] var3 = class30.field592.method215(arg1, 13, 1);
            class198 var4 = new class198();
            var4.field3919 = arg1;
            if (var3 != null) {
                var4.method1305(new class66(var3), -181);
            }
            class7.field179.method1076((long) arg1, -4, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
    public static final void method1225(byte arg0) {
        field3579++;
        if (arg0 != -39) {
            method1223((byte) -31);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class94.field2121 - 1; var2++) {
                if (class132.field2810[var2] < 1000 && class132.field2810[var2 + 1] > 1000) {
                    var1 = false;
                    class38 var3 = class205.field4031[var2];
                    class205.field4031[var2] = class205.field4031[var2 + 1];
                    class205.field4031[var2 + 1] = var3;
                    class38 var4 = class98.field2186[var2];
                    class98.field2186[var2] = class98.field2186[var2 + 1];
                    class98.field2186[var2 + 1] = var4;
                    int var5 = class132.field2810[var2];
                    class132.field2810[var2] = class132.field2810[var2 + 1];
                    class132.field2810[var2 + 1] = var5;
                    int var6 = class141.field2972[var2];
                    class141.field2972[var2] = class141.field2972[var2 + 1];
                    class141.field2972[var2 + 1] = var6;
                    int var7 = class149.field3090[var2];
                    class149.field3090[var2] = class149.field3090[var2 + 1];
                    class149.field3090[var2 + 1] = var7;
                    int var8 = class150.field3104[var2];
                    class150.field3104[var2] = class150.field3104[var2 + 1];
                    class150.field3104[var2 + 1] = var8;
                }
            }
        }
    }
}
