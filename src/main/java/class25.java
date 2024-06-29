import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class25 {

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field505 = 0;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field507 = 127;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[Ldd;")
    public static class35[] field512 = new class35[8];

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Ldd;")
    public static class35 field511 = class180.method1196((byte) -5, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Ldd;")
    public static class35 field513 = class180.method1196((byte) -37, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field502 = 99;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Ldd;")
    public static class35 field510 = class180.method1196((byte) 127, "(U0a )2 in: ");

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lth;")
    public static class187 field503 = new class187();

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method209(byte arg0) {
        field503 = null;
        field513 = null;
        if (arg0 < 50) {
            method212(-76);
        }
        field510 = null;
        field511 = null;
        field512 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static final void method210(int arg0) {
        class13.field233.method813(-126);
        if (arg0 != 7531) {
            method212(-21);
        }
        field509++;
        class58.field1452.method813(-123);
        client.field626.method813(-125);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BII)I")
    public static final int method211(byte arg0, int arg1, int arg2) {
        if (arg0 >= -74) {
            field510 = null;
        }
        field514++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
    public static final void method212(int arg0) {
        for (class14 var1 = (class14) class167.field3371.method1232(arg0 + 21663); var1 != null; var1 = (class14) class167.field3371.method1238(arg0 + 18454)) {
            if (var1.field247 != null) {
                var1.method120(false);
            }
        }
        if (arg0 != 4168) {
            method209((byte) -106);
        }
        field506++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZ)V")
    public static final void method213(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field504++;
        class210 var5 = (class210) class35.field746.method796(arg4, (long) arg3);
        if (var5 == null) {
            var5 = new class210();
            class35.field746.method789(var5, arg4, (long) arg3);
        }
        if (arg2 >= var5.field4156.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field4156.length; var8++) {
                var6[var8] = var5.field4156[var8];
                var7[var8] = var5.field4155[var8];
            }
            for (int var9 = var5.field4156.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4156 = var6;
            var5.field4155 = var7;
        }
        var5.field4156[arg2] = arg0;
        var5.field4155[arg2] = arg1;
    }
}
