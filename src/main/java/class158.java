import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class158 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[[[I")
    public static int[][][] field3613 = new int[4][13][13];

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Lid;")
    public static class60 field3618 = class11.method72("http:)4)4www)3runescape)3com", (byte) -47);

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lid;")
    public static class60 field3620 = class11.method72("title_mute", (byte) 103);

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field3624 = 2301979;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field3622 = 2;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lid;")
    public static class60 field3626 = class11.method72("Bitte laden Sie die Seite neu)3", (byte) -90);

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lid;")
    public static class60 field3625 = class11.method72("<col=ff3000>", (byte) 115);

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lid;")
    private static class60 field3627 = class11.method72("You are standing in a members)2only area)3", (byte) -81);

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lid;")
    public static class60 field3619 = field3627;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lpa;")
    public static class105 field3617;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Z")
    public static boolean field3621;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lvb;IIIII)V")
    public static final void method1216(class148 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3616++;
        class144 var6 = new class144();
        var6.field3244 = arg3 * 128;
        var6.field3259 = arg0.field3311;
        int var7 = arg0.field3306;
        var6.field3256 = arg0.field3356;
        var6.field3248 = arg4;
        int var8 = arg0.field3330;
        if (arg2 == 1 || arg2 == 3) {
            var7 = arg0.field3330;
            var8 = arg0.field3306;
        }
        if (arg1 != -32225) {
            return;
        }
        var6.field3242 = (arg5 + var8) * 128;
        var6.field3238 = (arg3 + var7) * 128;
        var6.field3246 = arg0.field3335;
        var6.field3251 = arg0.field3362;
        var6.field3245 = arg5 * 128;
        var6.field3257 = arg0.field3319 * 128;
        if (arg0.field3364 != null) {
            var6.field3235 = arg0;
            var6.method1108(-115);
        }
        class152.field3400.method508(var6, (byte) 93);
        if (var6.field3251 != null) {
            var6.field3254 = (int) ((double) (var6.field3246 - var6.field3256) * Math.random()) + var6.field3256;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static void method1217(byte arg0) {
        field3620 = null;
        field3626 = null;
        field3613 = null;
        field3618 = null;
        field3619 = null;
        if (arg0 != -11) {
            field3619 = null;
        }
        field3627 = null;
        field3625 = null;
        field3617 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Lfd;")
    public static final class40 method1218(int arg0, int arg1, int arg2) {
        field3623++;
        class40 var3 = class132.method1041(true, arg2);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field1052 == null || arg1 >= var3.field1052.length) {
            return null;
        } else {
            if (arg0 != 12777) {
                method1217((byte) 25);
            }
            return var3.field1052[arg1];
        }
    }
}
