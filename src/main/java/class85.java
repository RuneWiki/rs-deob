import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class85 extends class62 {

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "Leg;")
    public static class37 field1342 = class174.method1167("::clientjs5drop", 77);

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "Leg;")
    public static class37 field1343 = class174.method1167("<img=0>", -44);

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Leg;")
    public static class37 field1333 = class174.method1167("mem=", -44);

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field1344 = 0;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field1345 = 0;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "Ljl;")
    public static class101 field1331;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "Lnc;")
    public static class11 field1330;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Lpe;")
    public class237 field1329;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "Lpe;")
    public class237 field1346;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Leg;")
    public class37 field1328;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "Z")
    public boolean field1347;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "[Ljava/lang/Object;")
    public Object[] field1339;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static void method563(boolean arg0) {
        field1330 = null;
        field1343 = null;
        field1342 = null;
        field1333 = null;
        if (!arg0) {
            field1331 = null;
        }
        field1331 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BZ)V")
    public static final void method564(byte arg0, boolean arg1) {
        field1337++;
        int var2 = class138.field2360;
        if (class82.field1285.field1799 >> 7 == class73.field1159 && (class82.field1285.field1793 >> 7) == class59.field975) {
            class73.field1159 = 0;
        }
        int var3 = 57 / ((-arg0 - 49) / 33);
        if (arg1) {
            var2 = 1;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class188 var7;
            if (arg1) {
                var5 = 8791798054912L;
                var7 = class82.field1285;
            } else {
                var7 = class98.field1526[class285.field5020[var4]];
                var5 = (long) class285.field5020[var4] << 32;
            }
            if (var7 != null && var7.method767(false)) {
                var7.field3213 = false;
                int var8 = var7.field1799 >> 7;
                if ((client.field1895 && class138.field2360 > 200 || class138.field2360 > 50) && !arg1 && var7.field1789 == var7.field1767) {
                    var7.field3213 = true;
                }
                int var9 = var7.field1793 >> 7;
                if (var8 >= 0 && var8 < 104 && var9 >= 0 && var9 < 104) {
                    if (var7.field3242 == null || class72.field1146 < var7.field3206 || var7.field3233 <= class72.field1146) {
                        if (var7.method763(-1) == 1 && (var7.field1799 & 0x7F) == 64 && (var7.field1793 & 0x7F) == 64) {
                            if (class218.field3753[var8][var9] == class8.field137) {
                                continue;
                            }
                            class218.field3753[var8][var9] = class8.field137;
                        }
                        var7.field1822 = class262.method1768(class237.field4140, var7.field1799, var7.field1793, (byte) -105);
                        class278.method1866(class237.field4140, var7.field1799, var7.field1793, var7.field1822, var7.method763(-1) * 64 + 60 - 64, var7, var7.field1798, var5, var7.field1820);
                    } else {
                        var7.field3213 = false;
                        var7.field1822 = class262.method1768(class237.field4140, var7.field1799, var7.field1793, (byte) -113);
                        class231.method1591(class237.field4140, var7.field1799, var7.field1793, var7.field1822, var7, var7.field1798, var5, var7.field3211, var7.field3218, var7.field3229, var7.field3236);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I")
    public static final int method565(int arg0, int arg1) {
        field1336++;
        return arg0 == 28872 ? arg1 >>> 10 : 117;
    }
}
