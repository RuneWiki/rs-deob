import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class156 extends class124 {

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "[I")
    public static int[] field3583 = new int[256];

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "[I")
    public static int[] field3599 = new int[] { 21, 57, 11, 24, 13, 42, 29, 6 };

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "[I")
    public static int[] field3592 = new int[128];

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "Lpe;")
    private static class109 field3597 = class141.method1120("You need a members account to login to this world)3", 0);

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "Lpe;")
    public static class109 field3602 = class141.method1120("Freie Welt", 0);

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
    public static volatile int field3600 = -1;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "Lpe;")
    public static class109 field3598 = class141.method1120("Bitte geben Sie Ihr Passwort ein)3", 0);

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "Lpe;")
    public static class109 field3595 = class141.method1120("titlebutton", 0);

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "Lpe;")
    public static class109 field3601 = class141.method1120("(U0a )2 in: ", 0);

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "[I")
    public static int[] field3605 = new int[100];

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "Lpe;")
    public static class109 field3603 = field3597;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public int field3586;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    public int field3594;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public int field3596;

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "Lpe;")
    public class109 field3591;

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "Lie;")
    public static class61 field3606;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "[I")
    public int[] field3589;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "[I")
    public int[] field3590;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "[Lpe;")
    public class109[] field3584;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "[[S")
    public static short[][] field3588;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/awt/Component;ILdf;I)Lac;")
    public static final class4 method1222(int arg0, Component arg1, int arg2, class28 arg3, int arg4) {
        field3587++;
        if (class127.field2816 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class4 var5 = (class4) Class.forName("f").getDeclaredConstructor().newInstance();
                var5.field116 = new int[(class35.field772 ? 2 : 1) * 256];
                var5.field126 = arg2;
                var5.method44(arg1);
                var5.field120 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field120 > 16384) {
                    var5.field120 = 16384;
                }
                var5.method35(var5.field120);
                if (class4.field77 > 0 && class46.field969 == null) {
                    class46.field969 = new class43();
                    class46.field969.field915 = arg3;
                    arg3.method252(class4.field77, (byte) 34, class46.field969);
                }
                if (class46.field969 != null) {
                    if (class46.field969.field916[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class46.field969.field916[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class65 var6 = new class65(arg3, arg4);
                    var6.field116 = new int[(class35.field772 ? 2 : 1) * 256];
                    var6.field126 = arg2;
                    var6.method44(arg1);
                    var6.field120 = 16384;
                    var6.method35(var6.field120);
                    if (~class4.field77 < arg0 && class46.field969 == null) {
                        class46.field969 = new class43();
                        class46.field969.field915 = arg3;
                        arg3.method252(class4.field77, (byte) 34, class46.field969);
                    }
                    if (class46.field969 != null) {
                        if (class46.field969.field916[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class46.field969.field916[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class4();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public static void method1223(int arg0) {
        field3595 = null;
        field3602 = null;
        if (arg0 >= -110) {
            method1223(-31);
        }
        field3597 = null;
        field3606 = null;
        field3598 = null;
        field3599 = null;
        field3601 = null;
        field3603 = null;
        field3605 = null;
        field3583 = null;
        field3592 = null;
        field3588 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3583[var0] = var1;
        }
    }
}
