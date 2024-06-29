import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class38 {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public int field984 = -1;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lpd;")
    private static class94 field980 = class28.method249(34, "Loading textures )2 ");

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
    public static int[] field985 = new int[2048];

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lpd;")
    private static class94 field982 = class28.method249(-47, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lpd;")
    public static class94 field988 = field980;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "[I")
    public static int[] field995 = new int[500];

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lpd;")
    public static class94 field981 = class28.method249(127, "");

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "Lpd;")
    private static class94 field989 = class28.method249(39, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "Lpd;")
    public static class94 field991 = field989;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field999 = 0;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lpd;")
    public static class94 field992 = field982;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Ldb;")
    public class20 field987;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lad;")
    public static class5 field996;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Lla;")
    public static class66 field986;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Lme;")
    public static class77 field983;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
    public int[] field990;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "[Lpd;")
    public class94[] field993;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILic;Lmb;I)V", line = 4)
    public static final void method291(int arg0, class50 arg1, class73 arg2, int arg3) {
        field998++;
        byte[] var4 = null;
        class119 var5 = class128.field3225;
        synchronized (class128.field3225) {
            for (class33 var6 = (class33) class128.field3225.method895(arg0 ^ 0xFFFFC8B4); var6 != null; var6 = (class33) class128.field3225.method893(true)) {
                if ((long) arg3 == var6.field3345 && var6.field901 == arg1 && var6.field902 == 0) {
                    var4 = var6.field918;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg2.method546(arg3, true, arg1, (byte) -14, var4);
            return;
        }
        byte[] var7 = arg1.method397(arg3, -5989);
        arg2.method546(arg3, true, arg1, (byte) -14, var7);
        if (arg0 != 0) {
            method292(null, false, -95, 112, null);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ls;ZIILs;)Lg;", line = 94)
    public static final class39 method292(class111 arg0, boolean arg1, int arg2, int arg3, class111 arg4) {
        field997++;
        boolean var5 = true;
        int[] var6 = arg4.method809(arg2, arg3 - 9059);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method810(arg3 - 2, arg2, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method810(-1, 0, var9);
                } else {
                    var10 = arg0.method810(-1, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg3 != 1) {
            method291(-20, null, null, 37);
        }
        if (!var5) {
            return null;
        }
        try {
            return new class39(arg4, arg0, arg2, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V", line = 173)
    public static void method293(byte arg0) {
        if (arg0 != 46) {
            method292(null, true, -8, -31, null);
        }
        field989 = null;
        field996 = null;
        field991 = null;
        field980 = null;
        field982 = null;
        field995 = null;
        field988 = null;
        field983 = null;
        field985 = null;
        field981 = null;
        field986 = null;
        field992 = null;
    }
}
