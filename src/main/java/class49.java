import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 extends class99 {

    @OriginalMember(owner = "client!h", name = "R", descriptor = "[Lpc;")
    public class107[] field1173;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Laf;")
    public static class7 field1175 = class48.method406(40, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "Laf;")
    public static class7 field1181 = class48.method406(40, "Welt");

    @OriginalMember(owner = "client!h", name = "U", descriptor = "Laf;")
    public static class7 field1176 = class48.method406(40, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "Lgd;")
    public static class46 field1184 = new class46(64);

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "[I")
    public static int[] field1187 = new int[2000];

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
    public static volatile int field1189 = -1;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "Laf;")
    private static class7 field1188 = class48.method406(40, "Attack");

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "Laf;")
    public static class7 field1186 = field1188;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "Lo;")
    public static class97 field1178;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "[Lfd;")
    public static class40[] field1185;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Lcc;")
    public static final class18 method408(int arg0, int arg1) {
        class18 var2 = (class18) class102.field2421.method395(arg1 ^ 0x7B, (long) arg0);
        field1174++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class94.field2203.method572(arg1, false, arg0);
        class18 var4 = new class18();
        if (var3 != null) {
            var4.method172(arg0, -10385, new class122(var3));
        }
        var4.method173(-24845);
        class102.field2421.method388(var4, (long) arg0, 2047);
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)Z")
    public final boolean method409(boolean arg0, int arg1) {
        if (arg0) {
            field1183++;
            return this.field1173[arg1].field2628;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static void method410(int arg0) {
        field1178 = null;
        field1187 = null;
        field1188 = null;
        if (arg0 != -8490) {
            method410(44);
        }
        field1181 = null;
        field1185 = null;
        field1184 = null;
        field1186 = null;
        field1176 = null;
        field1175 = null;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lkb;Lkb;IZ)V")
    public class49(class71 arg0, class71 arg1, int arg2, boolean arg3) {
        class94 var5 = new class94();
        int var6 = arg0.method562((byte) 30, arg2);
        this.field1173 = new class107[var6];
        int[] var7 = arg0.method574(23, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method572(arg2, false, var7[var8]);
            class86 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class86 var12 = (class86) var5.method758(255); var12 != null; var12 = (class86) var5.method766(-116)) {
                if (var12.field2016 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method563((byte) 125, 0, var11);
                } else {
                    var13 = arg1.method563((byte) 99, var11, 0);
                }
                var10 = new class86(var11, var13);
                var5.method765(var10, 0);
            }
            this.field1173[var7[var8]] = new class107(var9, var10);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(JB)V")
    public static final void method411(long arg0, byte arg1) {
        field1179++;
        if (arg0 == 0L) {
            return;
        }
        if (class105.field2573 >= 100) {
            class53.method432(class149.field3519, 0, class52.field1243, arg1 - 6);
            return;
        }
        class7 var3 = class86.method708(arg1 + 84, arg0).method96(arg1 ^ 0xFFFFFFCC);
        if (arg1 != -115) {
            field1185 = null;
        }
        for (int var4 = 0; var4 < class105.field2573; var4++) {
            if (class39.field968[var4] == arg0) {
                class53.method432(class116.method905(new class7[] { var3, class45.field1074 }, 1), 0, class52.field1243, arg1 - 5);
                return;
            }
        }
        for (int var5 = 0; var5 < class21.field546; var5++) {
            if (class98.field2340[var5] == arg0) {
                class53.method432(class116.method905(new class7[] { class51.field1240, var3, class71.field1567 }, 1), 0, class52.field1243, arg1 ^ 0x9);
                return;
            }
        }
        if (var3.method76(-119, class21.field531.field2121)) {
            class53.method432(class54.field1320, 0, class52.field1243, -120);
            return;
        }
        class39.field968[class105.field2573++] = arg0;
        class98.field2346++;
        class95.field2260 = class69.field1508;
        class47.field1150.method1131(91, 2027385224);
        class47.field1150.method956(arg0, -822368080);
    }
}
