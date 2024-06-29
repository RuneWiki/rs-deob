import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 extends class123 {

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "[B")
    public byte[] field860;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "Loa;")
    public static class98 field861 = class38.method349(255, "scape main");

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Loa;")
    public static class98 field858 = class38.method349(255, "Hidden)2use");

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    public static volatile int field872 = 0;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "Loa;")
    public static class98 field868 = class38.method349(255, "mapscene");

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "Loa;")
    public static class98 field869 = class38.method349(255, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Loa;")
    private static class98 field871 = class38.method349(255, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Loa;")
    public static class98 field873 = class38.method349(255, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "Loa;")
    public static class98 field863 = field871;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "Loa;")
    public static class98 field874 = class38.method349(255, "leuchten1:");

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Loc;")
    public static class100 field859;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "Ll;")
    public static class76 field864;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field866++;
        if (!client.method202(arg4, -642990672)) {
            return false;
        }
        class11.field244 = null;
        boolean var7 = class55.method449((byte) 92, class36.field901[arg4], arg2, 0, arg5, arg1, 0, arg0, arg6, -1);
        if (class11.field244 != null) {
            class55.method449((byte) 29, class11.field244, arg2, class1.field10, arg5, arg1, class124.field2770, arg0, arg6, -1412584499);
        }
        if (arg3 != 10616) {
            field859 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILkd;Z)V")
    public static final void method335(int arg0, class73 arg1, boolean arg2) {
        field870++;
        if (class55.field1230 == null) {
            class44.method378((byte) 0, 255, 255, 0, arg2, -86, null);
            class132.field3185[arg0] = arg1;
        } else {
            class55.field1230.field182 = arg0 * 4 + 5;
            int var3 = class55.field1230.method70(!arg2);
            arg1.method598(22695, var3);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static void method336(boolean arg0) {
        field859 = null;
        if (arg0) {
            return;
        }
        field864 = null;
        field863 = null;
        field861 = null;
        field874 = null;
        field873 = null;
        field869 = null;
        field871 = null;
        field868 = null;
        field858 = null;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
    public static final void method337(byte arg0) {
        class21.field466.method734(-224779128);
        int var1 = 69 / ((arg0 - 67) / 58);
        field867++;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)[Lid;")
    public static final class60[] method338(int arg0) {
        field862++;
        class60[] var1 = new class60[class73.field1543];
        for (int var2 = 0; var2 < class73.field1543; var2++) {
            class60 var4 = var1[var2] = new class60();
            var4.field1314 = class78.field1713;
            var4.field1309 = class102.field2351;
            var4.field1315 = class55.field1207[var2];
            var4.field1310 = class83.field1928[var2];
            var4.field1313 = class62.field1318[var2];
            var4.field1312 = class91.field2103[var2];
            int var5 = var4.field1313 * var4.field1312;
            byte[] var6 = class138.field3382[var2];
            var4.field1311 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                var4.field1311[var7] = class83.field1934[class150.method1211(var6[var7], 255)];
            }
        }
        int var3 = -116 / ((57 - arg0) / 56);
        class150.method1203(-1454146233);
        return var1;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([B)V")
    public class35(byte[] arg0) {
        this.field860 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z")
    public static final boolean method339(int arg0, int arg1) {
        field865++;
        if (arg1 != 159) {
            return false;
        } else if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }
}
