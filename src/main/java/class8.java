import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 extends class23 {

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "I")
    private int field116 = 0;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    private int field114 = 0;

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "I")
    private int field124 = 20;

    @OriginalMember(owner = "client!aa", name = "ob", descriptor = "I")
    private int field128 = 1365;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "Lqd;")
    private static class40 field113 = class147.method1106("fr", (byte) -103);

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "Lqd;")
    private static class40 field117 = class147.method1106("en", (byte) -96);

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "Lqd;")
    private static class40 field118 = class147.method1106("de", (byte) -127);

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "Lqd;")
    private static class40 field122 = class147.method1106(")3fr", (byte) -71);

    @OriginalMember(owner = "client!aa", name = "rb", descriptor = "Lqd;")
    private static class40 field131 = class147.method1106(")3de", (byte) -125);

    @OriginalMember(owner = "client!aa", name = "ub", descriptor = "Lqd;")
    private static class40 field134 = class147.method1106(")3en", (byte) -71);

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "[Lqd;")
    public static class40[] field115 = new class40[] { field117, field118, field113 };

    @OriginalMember(owner = "client!aa", name = "mb", descriptor = "[Lqd;")
    private static class40[] field126 = new class40[] { field134, field131, field122 };

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!aa", name = "nb", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!aa", name = "qb", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!aa", name = "sb", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!aa", name = "tb", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!aa", name = "pb", descriptor = "Lce;")
    public static class239 field129;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "Ljava/lang/Thread;")
    public static Thread field112;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILsd;)V", line = 5)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg1 != 0) {
            return;
        }
        field119++;
        if (arg0 == 0) {
            this.field128 = arg2.method197(-1);
        } else if (arg0 == 1) {
            this.field124 = arg2.method197(-1);
        } else if (arg0 == 2) {
            this.field116 = arg2.method197(-1);
        } else if (arg0 == 3) {
            this.field114 = arg2.method197(-1);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILce;)I", line = 68)
    public static final int method42(int arg0, class239 arg1) {
        if (arg0 != -1) {
            method46(19, (class239) null);
        }
        int var2 = 0;
        if (arg1.method1676(class297.field4961, -20034)) {
            var2++;
        }
        if (arg1.method1676(class160.field2679, -20034)) {
            var2++;
        }
        field133++;
        if (arg1.method1676(class140.field2367, -20034)) {
            var2++;
        }
        if (arg1.method1676(class29.field623, arg0 ^ 0x4E41)) {
            var2++;
        }
        if (arg1.method1676(class90.field1635, arg0 ^ 0x4E41)) {
            var2++;
        }
        if (arg1.method1676(class33.field665, -20034)) {
            var2++;
        }
        if (arg1.method1676(class257.field4282, -20034)) {
            var2++;
        }
        if (arg1.method1676(class202.field3203, -20034)) {
            var2++;
        }
        if (arg1.method1676(class142.field2385, -20034)) {
            var2++;
        }
        if (arg1.method1676(class249.field4126, -20034)) {
            var2++;
        }
        if (arg1.method1676(class56.field1081, -20034)) {
            var2++;
        }
        if (arg1.method1676(class98.field1749, -20034)) {
            var2++;
        }
        if (arg1.method1676(class40.field711, -20034)) {
            var2++;
        }
        if (arg1.method1676(class71.field1270, arg0 ^ 0x4E41)) {
            var2++;
        }
        if (arg1.method1676(class243.field4009, -20034)) {
            var2++;
        }
        if (arg1.method1676(class3.field31, -20034)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)Ltc;", line = 138)
    public static final class37 method43(boolean arg0) {
        field132++;
        if (arg0) {
            return (class37) null;
        }
        try {
            return (class37) Class.forName("tl").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V", line = 153)
    public static final void method44(byte arg0) {
        field121++;
        class89.field1608.method1347(0);
        if (arg0 != 81) {
            field134 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V", line = 169)
    public static final void method45(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field130++;
        for (class65 var1 = (class65) class121.field2086.method1971(arg0 ^ 0xFFFFFF9B); var1 != null; var1 = (class65) class121.field2086.method1967(100)) {
            if (var1.field1215 > 0) {
                var1.field1215--;
            }
            if (var1.field1215 != 0) {
                if (var1.field1208 > 0) {
                    var1.field1208--;
                }
                if (var1.field1208 == 0 && var1.field1205 >= 1 && var1.field1228 >= 1 && var1.field1205 <= 102 && var1.field1228 <= 102 && (var1.field1210 < 0 || class17.method99(var1.field1210, var1.field1227, (byte) -78))) {
                    class278.method1944(var1.field1228, var1.field1227, var1.field1224, var1.field1210, var1.field1219, var1.field1207, -112, var1.field1205);
                    var1.field1208 = -1;
                    if (var1.field1217 == var1.field1210 && var1.field1217 == -1) {
                        var1.method2095(0);
                    } else if (var1.field1217 == var1.field1210 && var1.field1207 == var1.field1203 && var1.field1227 == var1.field1213) {
                        var1.method2095(0);
                    }
                }
            } else if (var1.field1217 < 0 || class17.method99(var1.field1217, var1.field1213, (byte) -102)) {
                class278.method1944(var1.field1228, var1.field1213, var1.field1224, var1.field1217, var1.field1219, var1.field1203, -126, var1.field1205);
                var1.method2095(0);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)[I", line = 233)
    public final int[] method32(byte arg0, int arg1) {
        field127++;
        int[] var3 = this.field403.method724((byte) -35, arg1);
        if (arg0 != -94) {
            return (int[]) null;
        }
        if (this.field403.field1760) {
            for (int var4 = 0; var4 < class52.field1007; var4++) {
                int var5 = (class315.field5345[var4] << 12) / this.field128 + this.field116;
                int var6 = (class150.field2509[arg1] << 12) / this.field128 + this.field114;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while ((var11 + var12) < 16384 && var13 < this.field124) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var12 + var7 - var11;
                    var13++;
                    var12 = var9 * var9 >> 12;
                    var11 = var10 * var10 >> 12;
                }
                var3[var4] = var13 < this.field124 - 1 ? (var13 << 12) / this.field124 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 324)
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(ILce;)V", line = 311)
    public static final void method46(int arg0, class239 arg1) {
        field123++;
        class92.field1679 = arg1;
        int var2 = 119 / ((arg0 + 73) / 53);
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)V", line = 336)
    public static void method47(int arg0) {
        field118 = null;
        field134 = null;
        field131 = null;
        field117 = null;
        field115 = null;
        field113 = null;
        field129 = null;
        field112 = null;
        int var1 = -81 / ((arg0 + 14) / 60);
        field126 = null;
        field122 = null;
    }
}
