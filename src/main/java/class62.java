import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 extends class145 {

    @OriginalMember(owner = "client!j", name = "V", descriptor = "I")
    public static int field1316 = 0;

    @OriginalMember(owner = "client!j", name = "X", descriptor = "Ltd;")
    public static class136 field1318 = class145.method1172("title_mute", 45);

    @OriginalMember(owner = "client!j", name = "bb", descriptor = "Ltd;")
    public static class136 field1322 = class145.method1172("Startseite auf (WSpielkonto wiederherstellen(W)3", 45);

    @OriginalMember(owner = "client!j", name = "U", descriptor = "Ltd;")
    public static class136 field1315 = class145.method1172("Ung-Ultiger Benutzername", 45);

    @OriginalMember(owner = "client!j", name = "ab", descriptor = "Ltd;")
    public static class136 field1321 = class145.method1172("Okay", 45);

    @OriginalMember(owner = "client!j", name = "ib", descriptor = "Ltd;")
    public static class136 field1329 = class145.method1172("p12_full", 45);

    @OriginalMember(owner = "client!j", name = "W", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!j", name = "Z", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!j", name = "cb", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!j", name = "db", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!j", name = "gb", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!j", name = "hb", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!j", name = "kb", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!j", name = "lb", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!j", name = "Y", descriptor = "Lpd;")
    public static class108 field1319;

    @OriginalMember(owner = "client!j", name = "fb", descriptor = "Lnb;")
    public static class92 field1326;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILsb;I)V")
    private final void method466(int arg0, class127 arg1, int arg2) {
        field1327++;
        if (~arg2 == arg0) {
            this.field1330 = arg1.method1020(false);
            this.field1325 = arg1.method1011(arg0 ^ 0xFFFFFF9D);
            this.field1332 = arg1.method1011(19);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public static void method467(byte arg0) {
        field1315 = null;
        field1326 = null;
        field1319 = null;
        field1322 = null;
        field1321 = null;
        field1329 = null;
        field1318 = null;
        if (arg0 > -102) {
            method469(-66);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lsb;I)V")
    public final void method468(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1011(53);
            if (var3 == 0) {
                field1317++;
                if (arg1 != -20435) {
                    method467((byte) 102);
                    return;
                }
                return;
            }
            this.method466(-2, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
    public static final void method469(int arg0) {
        class64.field1370 = 0;
        int var1 = (class24.field555.field3580 >> 7) + class91.field2145;
        field1328++;
        int var2 = (class24.field555.field3578 >> 7) + class52.field1176;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class64.field1370 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class64.field1370 = 1;
        }
        if (class64.field1370 == arg0 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class64.field1370 = 0;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILsb;)Ltd;")
    public static final class136 method470(int arg0, class127 arg1) {
        field1323++;
        if (arg0 != -3119) {
            method467((byte) 14);
        }
        return class141.method1146(arg1, 7, 32767);
    }
}
