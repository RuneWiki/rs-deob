import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class136 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3325 = 0;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lpd;")
    public static class94 field3329 = class28.method249(115, "Nehmen");

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lpd;")
    public static class94 field3333 = class28.method249(-120, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lpd;")
    private static class94 field3327 = class28.method249(-102, "On");

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "[I")
    public static int[] field3341 = new int[5];

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Lpd;")
    public static class94 field3335 = field3327;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "Lpd;")
    public static class94 field3339 = class28.method249(-117, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "Lpd;")
    public static class94 field3342 = class28.method249(-72, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Lpd;")
    public static class94 field3328 = class28.method249(-64, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lpd;")
    public static class94 field3330 = class28.method249(76, "oder benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lpd;")
    public static class94 field3331 = class28.method249(93, "mapscene");

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "Lpd;")
    private static class94 field3332 = class28.method249(-98, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Lpd;")
    public static class94 field3334 = field3332;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lpd;")
    private static class94 field3347 = class28.method249(-99, "Login");

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lpd;")
    public static class94 field3338 = field3347;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "J")
    public long field3345;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Lwd;")
    public class136 field3340;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "Lwd;")
    public class136 field3346;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZI)V", line = 5)
    public static final void method1069(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3336++;
        if (arg3) {
            field3335 = null;
        }
        class75 var5 = (class75) class86.field2185.method19(25239, (long) arg1);
        if (var5 == null) {
            var5 = new class75();
            class86.field2185.method24((long) arg1, var5, -61);
        }
        if (arg2 >= var5.field1831.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field1831.length; var8++) {
                var6[var8] = var5.field1831[var8];
                var7[var8] = var5.field1826[var8];
            }
            for (int var9 = var5.field1831.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1831 = var6;
            var5.field1826 = var7;
        }
        var5.field1831[arg2] = arg0;
        var5.field1826[arg2] = arg4;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)Z", line = 66)
    public final boolean method1070(boolean arg0) {
        field3326++;
        if (this.field3346 == null) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 80)
    public static final void method1071(int arg0) {
        if (arg0 != 7) {
            return;
        }
        class99.field2502.method323(arg0 + 28894);
        int var1 = class99.field2502.method319(1, 8);
        field3343++;
        if (var1 == 0) {
            return;
        }
        int var2 = class99.field2502.method319(2, arg0 ^ 0xF);
        if (var2 == 0) {
            class81.field2060[class66.field1613++] = 2047;
        } else if (var2 == 1) {
            int var3 = class99.field2502.method319(3, 8);
            class80.field2044.method45(false, true, var3);
            int var4 = class99.field2502.method319(1, 8);
            if (var4 == 1) {
                class81.field2060[class66.field1613++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class99.field2502.method319(3, 8);
            class80.field2044.method45(true, true, var5);
            int var6 = class99.field2502.method319(3, arg0 + 1);
            class80.field2044.method45(true, true, var6);
            int var7 = class99.field2502.method319(1, 8);
            if (var7 == 1) {
                class81.field2060[class66.field1613++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class99.field2502.method319(7, arg0 ^ 0xF);
            int var9 = class99.field2502.method319(1, 8);
            if (var9 == 1) {
                class81.field2060[class66.field1613++] = 2047;
            }
            int var10 = class99.field2502.method319(1, arg0 ^ 0xF);
            class64.field1589 = class99.field2502.method319(2, 8);
            int var11 = class99.field2502.method319(7, 8);
            class80.field2044.method46(var10 == 1, var11, 0, var8);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 164)
    public static void method1072(byte arg0) {
        field3342 = null;
        field3331 = null;
        if (arg0 <= 101) {
            method1072((byte) 27);
        }
        field3335 = null;
        field3332 = null;
        field3334 = null;
        field3333 = null;
        field3329 = null;
        field3341 = null;
        field3327 = null;
        field3338 = null;
        field3330 = null;
        field3328 = null;
        field3347 = null;
        field3339 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)V", line = 195)
    public static final void method1073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3348++;
        if (arg1 == 3648 && class98.method741((byte) -89, arg3)) {
            class1.method5(arg5, -1, class108.field2673[arg3], arg0, -83, arg4, 0, 0, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 248)
    public final void method1074(byte arg0) {
        field3337++;
        if (this.field3346 == null) {
            return;
        }
        this.field3346.field3340 = this.field3340;
        if (arg0 != -28) {
            this.method1070(false);
        }
        this.field3340.field3346 = this.field3346;
        this.field3340 = null;
        this.field3346 = null;
    }
}
