import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class35 extends class32 {

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "[B")
    public byte[] field678;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lij;")
    public static class50 field677 = class78.method578(124, "Standort");

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lij;")
    public static class50 field674 = class78.method578(127, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Lij;")
    public static class50 field681 = class78.method578(123, "");

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Lda;")
    public static class22 field682;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "[[Z")
    public static boolean[][] field679;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public static void method279(int arg0) {
        if (arg0 != 26535) {
            field674 = null;
        }
        field682 = null;
        field679 = null;
        field677 = null;
        field674 = null;
        field681 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILtf;Z)V")
    public static final void method280(int arg0, int arg1, class53 arg2, boolean arg3) {
        if (arg3) {
            return;
        }
        if (arg2.field4002 == arg1 && arg1 != -1) {
            class186 var4 = class123.method891(-5664, arg1);
            int var5 = var4.field3059;
            if (var5 == 1) {
                arg2.field3985 = 0;
                arg2.field3989 = arg0;
                arg2.field4034 = 0;
                arg2.field4005 = 0;
                class5.method33(arg2.field4027, arg2.field4034, 0, arg2.field3990, var4, false);
            }
            if (var5 == 2) {
                arg2.field4005 = 0;
            }
        } else if (arg1 == -1 || arg2.field4002 == -1 || class123.method891(-5664, arg1).field3049 >= class123.method891(-5664, arg2.field4002).field3049) {
            arg2.field3985 = 0;
            arg2.field4002 = arg1;
            arg2.field4005 = 0;
            arg2.field4034 = 0;
            arg2.field3989 = arg0;
            arg2.field4032 = arg2.field4015;
            if (arg2.field4002 != -1) {
                class5.method33(arg2.field4027, arg2.field4034, 0, arg2.field3990, class123.method891(-5664, arg2.field4002), false);
            }
        }
        field676++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static final void method281(byte arg0) {
        field680++;
        class33 var1 = class112.field1978;
        synchronized (class112.field1978) {
            class63.field1215++;
            if (arg0 > -116) {
                method279(-28);
            }
            class238.field4039 = class36.field708;
            class69.field1297 = class65.field1256;
            class173.field2904 = class241.field4161;
            class193.field3200 = class103.field1884;
            class56.field1000 = class123.field2158;
            class52.field950 = class24.field534;
            class85.field1638 = class219.field3657;
            class103.field1884 = 0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
    public class35(byte[] arg0) {
        this.field678 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIJIIBLij;)V")
    public static final void method282(int arg0, int arg1, long arg2, int arg3, int arg4, byte arg5, class50 arg6) {
        class217 var8 = new class217(128);
        field675++;
        var8.method1471(10, (byte) 24);
        var8.method1494((int) (Math.random() * 99999.0D), (byte) -65);
        var8.method1494(505, (byte) -86);
        var8.method1464(arg2, 867341416);
        var8.method1446(111, (int) (Math.random() * 9.9999999E7D));
        var8.method1482(arg6, -29586);
        var8.method1446(-3, (int) (Math.random() * 9.9999999E7D));
        var8.method1494(class89.field1693, (byte) -125);
        var8.method1471(arg3, (byte) 24);
        var8.method1471(arg0, (byte) 24);
        var8.method1446(-95, (int) (Math.random() * 9.9999999E7D));
        var8.method1494(arg1, (byte) -115);
        var8.method1494(arg4, (byte) -48);
        var8.method1446(99, (int) (Math.random() * 9.9999999E7D));
        var8.method1481(-5409, class141.field2478, class43.field786);
        class190.field3141.field3581 = 0;
        class190.field3141.method1471(162, (byte) 24);
        class190.field3141.method1471(var8.field3581, (byte) 24);
        if (arg5 < 87) {
            return;
        }
        class190.field3141.method1491(0, var8.field3633, var8.field3581, (byte) 119);
        class233.field3915 = -3;
        class167.field2834 = 1;
        class224.field3765 = 0;
        class162.field2769 = 0;
    }
}
