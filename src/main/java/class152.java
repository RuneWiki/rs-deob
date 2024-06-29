import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class152 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Ltd;")
    private static class136 field3472 = class145.method1172("Use", 45);

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Ltd;")
    public static class136 field3483 = field3472;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "J")
    public static long field3476 = 0L;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Ltd;")
    public static class136 field3481 = class145.method1172("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 45);

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[Ltd;")
    public static class136[] field3486 = new class136[100];

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Ltd;")
    public static class136 field3485 = class145.method1172("Hidden)2", 45);

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "Z")
    public static volatile boolean field3484 = true;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public static void method1195(int arg0) {
        field3481 = null;
        field3483 = null;
        if (arg0 != -35) {
            field3484 = false;
        }
        field3472 = null;
        field3486 = null;
        field3485 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public static final void method1196(int arg0, int arg1) {
        field3478++;
        if (arg1 > 48) {
            class79 var2 = (class79) class88.field2088.method109(44, (long) arg0);
            if (var2 != null) {
                var2.method674(32);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method1197(KeyEvent arg0, byte arg1) {
        int var2 = arg0.getKeyChar();
        field3477++;
        int var3 = -32 % ((34 - arg1) / 34);
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZILbe;)V")
    public static final void method1198(int arg0, boolean arg1, int arg2, class13 arg3) {
        if (arg1) {
            return;
        }
        field3475++;
        if (arg3.field3585 == arg0 && arg0 != -1) {
            int var4 = class29.method252(!arg1, arg0).field2675;
            if (var4 == 1) {
                arg3.field3591 = 0;
                arg3.field3598 = arg2;
                arg3.field3588 = 0;
                arg3.field3546 = 0;
            }
            if (var4 == 2) {
                arg3.field3591 = 0;
            }
        } else if (arg0 == -1 || arg3.field3585 == -1 || class29.method252(true, arg0).field2672 >= class29.method252(!arg1, arg3.field3585).field2672) {
            arg3.field3536 = arg3.field3564;
            arg3.field3588 = 0;
            arg3.field3591 = 0;
            arg3.field3546 = 0;
            arg3.field3598 = arg2;
            arg3.field3585 = arg0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static final void method1199(int arg0) {
        class91.field2157 = new int[151];
        class24.field570 = new int[33];
        field3473++;
        class53.field1180 = new int[33];
        class71.field1491 = new int[151];
        for (int var1 = 0; var1 < 33; var1++) {
            int var6 = 999;
            int var7 = 0;
            for (int var8 = 0; var8 < 34; var8++) {
                if (class35.field806.field2169[class35.field806.field2170 * var1 + var8] == 0) {
                    if (var6 == 999) {
                        var6 = var8;
                    }
                } else if (var6 != 999) {
                    var7 = var8;
                    break;
                }
            }
            class24.field570[var1] = var6;
            class53.field1180[var1] = var7 - var6;
        }
        int var2 = 5;
        if (arg0 != 25) {
            return;
        }
        while (var2 < 156) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; var5 < 172; var5++) {
                if (class35.field806.field2169[class35.field806.field2170 * var2 + var5] == 0 && (var5 > 34 || var2 > 34)) {
                    if (var3 == 999) {
                        var3 = var5;
                    }
                } else if (var3 != 999) {
                    var4 = var5;
                    break;
                }
            }
            class71.field1491[var2 - 5] = var3 - 25;
            class91.field2157[var2 - 5] = var4 - var3;
            var2++;
        }
    }
}
