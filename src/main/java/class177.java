import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class177 {

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Lcd;")
    private static class23 field3516 = class54.method414("Please wait 5 minutes before trying again)3", -1);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lcd;")
    public static class23 field3508 = field3516;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Lcd;")
    private static class23 field3522 = class54.method414("Connection lost)3", -1);

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lcd;")
    public static class23 field3520 = field3522;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "[I")
    public static int[] field3524 = new int[500];

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Z")
    public static boolean field3526 = false;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lcd;")
    public static class23 field3517 = class54.method414("null", -1);

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Lcd;")
    public static class23 field3514 = class54.method414("auf einer freien Welt zu spielen)3", -1);

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public int field3512;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public int field3513;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public int field3523;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lsh;")
    public class169 field3511;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lsh;")
    public class169 field3521;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "Lsh;")
    public class169 field3525;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILkh;)V")
    public static final void method1109(int arg0, class97 arg1) {
        field3509++;
        if (arg0 != 4813) {
            field3514 = null;
        }
        class182.field3601 = arg1;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1110(int arg0) {
        if (arg0 != -536028569) {
            return;
        }
        field3514 = null;
        field3517 = null;
        field3508 = null;
        field3524 = null;
        field3520 = null;
        field3516 = null;
        field3522 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([Lcd;I)[Lcd;")
    public static final class23[] method1111(class23[] arg0, int arg1) {
        if (arg1 < 6) {
            field3508 = null;
        }
        field3510++;
        class23[] var2 = new class23[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class3.method14(true, new class23[] { class184.method1132(-1, var3), class139.field2870 });
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class3.method14(true, new class23[] { var2[var3], arg0[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBII)V")
    public static final void method1112(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class191 var5 = (class191) class204.field4021.method260((long) arg4, (byte) 28);
        if (var5 == null) {
            var5 = new class191();
            class204.field4021.method262((long) arg4, -105, var5);
        }
        if (var5.field3790.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field3790.length; var8++) {
                var6[var8] = var5.field3790[var8];
                var7[var8] = var5.field3786[var8];
            }
            for (int var9 = var5.field3790.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3790 = var6;
            var5.field3786 = var7;
        }
        int var10 = 112 / ((20 - arg2) / 43);
        field3515++;
        var5.field3790[arg3] = arg1;
        var5.field3786[arg3] = arg0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIB)V")
    public static final void method1113(int arg0, int arg1, byte arg2) {
        field3527++;
        int var3 = 40 / ((89 - arg2) / 34);
        if (class113.field2380 == 2) {
            class131.method839(-3846, class153.field3067 * 2, (class68.field1612 - class155.field3099 << 7) + class75.field1711, (-class94.field1989 + class29.field645 << 7) + class174.field3448);
            if (class5.field94 > -1 && class15.field339 % 20 < 10) {
                class8.field165[0].method315(arg0 + class5.field94 - 12, arg1 - -class132.field2726 - 28);
            }
        }
    }
}
