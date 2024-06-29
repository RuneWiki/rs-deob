import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class209 {

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "J")
    public long field3313 = 0L;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lhb;")
    public static class155 field3303 = new class155(16);

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3318 = "Loading...";

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3317 = "flash3:";

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "[C")
    public static char[] field3319 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field3306;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field3308;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public int field3310;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lqk;")
    public class2 field3305;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "Lqk;")
    public class2 field3316;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)V")
    public static final void method1455(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return;
        }
        class301.field4817[arg1] = arg2;
        field3315++;
        class34 var3 = (class34) field3303.method1059(0, (long) arg1);
        if (var3 == null) {
            class34 var4 = new class34(4611686018427387905L);
            field3303.method1052((long) arg1, (byte) -65, var4);
        } else if (var3.field514 != 4611686018427387905L) {
            var3.field514 = class191.method1350((byte) 104) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Z")
    public static final boolean method1456(int arg0, int arg1, int arg2) {
        field3309++;
        if (arg1 != 8216) {
            field3317 = null;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class158 var3 = class5.method29(arg2, true);
        return var3.method1080(false, arg0);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
    public static void method1457(byte arg0) {
        field3318 = null;
        field3317 = null;
        field3303 = null;
        if (arg0 != -80) {
            method1456(-5, 90, -31);
        }
        field3319 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V")
    public static final void method1458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 8225) {
            field3317 = null;
        }
        if ((arg0 - arg4) >= class82.field1374 && class259.field4188 >= (arg0 + arg4) && (arg2 - arg4) >= class85.field1409 && arg2 + arg4 <= class234.field3774) {
            class130.method922(arg4, arg3 - 8211, arg0, arg1, arg2);
        } else {
            class307.method2048(arg3 ^ 0xFFFFF401, arg0, arg2, arg4, arg1);
        }
        field3304++;
    }
}
