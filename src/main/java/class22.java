import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class22 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static volatile int field638 = -1;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lwd;")
    private static class150 field648 = class2.method9(true, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lwd;")
    public static class150 field643 = field648;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lwd;")
    private static class150 field650 = class2.method9(true, "Loading textures )2 ");

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lwd;")
    public static class150 field651 = field650;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lka;")
    public static class70 field645 = new class70(4096);

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lwd;")
    private static class150 field654 = class2.method9(true, "Loaded interfaces");

    @OriginalMember(owner = "client!d", name = "s", descriptor = "[I")
    public static int[] field655 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lwd;")
    public static class150 field653 = class2.method9(true, "scrollen:");

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field656 = 2;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field652 = 0;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Lwd;")
    public static class150 field658 = field654;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field657 = 0;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Loc;")
    public static class100 field647;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lqd;")
    public static class114 field640;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lv;")
    public static class140 field646;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "[Lhb;")
    public static class51[] field639;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILwb;)Lwd;")
    public static final class150 method183(int arg0, int arg1, class148 arg2) {
        field649++;
        try {
            if (arg1 != 5321) {
                field654 = null;
            }
            class150 var3 = new class150();
            var3.field3718 = arg2.method1144(-124);
            if (var3.field3718 > arg0) {
                var3.field3718 = arg0;
            }
            var3.field3678 = new byte[var3.field3718];
            arg2.field3601 += class99.field2277.method886(0, var3.field3718, arg2.field3601, arg2.field3592, var3.field3678, -4);
            return var3;
        } catch (Exception var4) {
            return class125.field2890;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
    public static final boolean method184(int arg0, int arg1) {
        field641++;
        if (arg0 != -1577600835) {
            field638 = -34;
        }
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILh;IB)V")
    public static final void method185(int arg0, int arg1, class49 arg2, int arg3, byte arg4) {
        field637++;
        if (class17.field464 >= 50 || class23.field663 == 0 || (arg2.field1288 == null || arg0 >= arg2.field1288.length)) {
            return;
        }
        int var5 = arg2.field1288[arg0];
        if (var5 == 0) {
            return;
        }
        int var6 = var5 >> 8;
        int var7 = var5 >> 4 & 0x7;
        if (arg4 > -24) {
            return;
        }
        int var8 = var5 & 0xF;
        class133.field3133[class17.field464] = var6;
        int var9 = (arg1 - 64) / 128;
        class5.field102[class17.field464] = var7;
        class55.field1437[class17.field464] = 0;
        int var10 = (arg3 - 64) / 128;
        class97.field2232[class17.field464] = null;
        class24.field686[class17.field464] = (var10 << 8) + (var9 << 16) + var8;
        class17.field464++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method186(byte arg0) {
        field648 = null;
        field658 = null;
        field645 = null;
        field654 = null;
        if (arg0 != 54) {
            field645 = null;
        }
        field646 = null;
        field650 = null;
        field647 = null;
        field651 = null;
        field640 = null;
        field639 = null;
        field643 = null;
        field653 = null;
        field655 = null;
    }
}
