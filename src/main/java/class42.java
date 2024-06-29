import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class42 extends class206 {

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Loc;")
    private static class151 field863 = class137.method873(2, "Started 3d library");

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "Loc;")
    private static class151 field870 = class137.method873(2, "wishes to trade with you)3");

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "Loc;")
    public static class151 field871 = class137.method873(2, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "Loc;")
    public static class151 field875 = field870;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "Loc;")
    public static class151 field868 = field863;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Lph;")
    public static class166 field864;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Luf;")
    public static class214 field872;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILoc;)V")
    public static final void method298(int arg0, class151 arg1) {
        class85 var2 = method302(arg1, -9605);
        field867++;
        if (var2 == null) {
            return;
        }
        class138.field2508 = var2.field1599 - class63.field1228;
        int var3 = class138.field2508 + (int) ((double) class153.field2778.field4215 / class188.field3339);
        class106.field1877 = class36.field759 + class27.field581 - var2.field1593;
        int var4 = class138.field2508 - (int) ((double) class153.field2778.field4215 / class188.field3339);
        if (var4 < 0) {
            class138.field2508 = (int) ((double) class153.field2778.field4215 / class188.field3339);
        }
        int var5 = class106.field1877 - (int) ((double) class153.field2778.field4216 / class188.field3339);
        int var6 = (int) ((double) class153.field2778.field4216 / class188.field3339) + class106.field1877;
        if (class217.field3788 < var3) {
            class138.field2508 = class217.field3788 - (int) ((double) class153.field2778.field4215 / class188.field3339);
        }
        if (var5 < 0) {
            class106.field1877 = (int) ((double) class153.field2778.field4216 / class188.field3339);
        }
        if (class27.field581 < var6) {
            class106.field1877 = class27.field581 - (int) ((double) class153.field2778.field4216 / class188.field3339);
        }
        if (arg0 != 10) {
            method298(14, null);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JI)Loc;")
    public static final class151 method299(long arg0, int arg1) {
        class94.field1763.setTime(new Date(arg0));
        field873++;
        int var3 = class94.field1763.get(7);
        int var4 = class94.field1763.get(5);
        int var5 = class94.field1763.get(2);
        int var6 = class94.field1763.get(1);
        int var7 = class94.field1763.get(11);
        int var8 = class94.field1763.get(12);
        int var9 = class94.field1763.get(13);
        if (arg1 != 10) {
            method300(-95);
        }
        return class126.method761(new class151[] { class236.field4389[var3 - 1], class118.field2125, class137.method874(var4 / 10, false), class137.method874(var4 % 10, false), class222.field3839, class1.field18[var5], class222.field3839, class137.method874(var6, false), class31.field649, class137.method874(var7 / 10, false), class137.method874(var7 % 10, false), class75.field1443, class137.method874(var8 / 10, false), class137.method874(var8 % 10, false), class75.field1443, class137.method874(var9 / 10, false), class137.method874(var9 % 10, false), class192.field3414 }, 10260);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
    public static void method300(int arg0) {
        field871 = null;
        field868 = null;
        field870 = null;
        field872 = null;
        if (arg0 == 9813) {
            field863 = null;
            field864 = null;
            field875 = null;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([BI)[B")
    public static final byte[] method301(byte[] arg0, int arg1) {
        if (arg1 <= 122) {
            field875 = null;
        }
        field869++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class145.method924(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Loc;I)Lhi;")
    public static final class85 method302(class151 arg0, int arg1) {
        field874++;
        if (arg1 != -9605) {
            field871 = null;
        }
        if (arg0.method988(-1) == 0) {
            return null;
        }
        for (class85 var2 = (class85) class209.field3672.method1358(-29726); var2 != null; var2 = (class85) class209.field3672.method1360(true)) {
            if (var2.field1603.method951(arg0, false)) {
                return var2;
            }
        }
        return null;
    }
}
