import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Lje;")
    private static class67 field1213 = class85.method592(255, "Please reload this page)3");

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lje;")
    public static class67 field1212 = field1213;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "J")
    public static long field1219 = 0L;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1222 = 0;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "[Z")
    public static boolean[] field1220 = new boolean[100];

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "[I")
    public static int[] field1226 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Lje;")
    public static class67 field1221 = class85.method592(255, " )2>");

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lqb;")
    public static class113 field1215;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Lfd;")
    public static class40 field1214;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "[Lqb;")
    public static class113[] field1218;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
    public static final int method422(int arg0, int arg1) {
        if (arg1 != 524287) {
            field1219 = 80L;
        }
        field1224++;
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method423(byte arg0) {
        field1213 = null;
        field1221 = null;
        field1220 = null;
        if (arg0 < 105) {
            method423((byte) 100);
        }
        field1214 = null;
        field1215 = null;
        field1218 = null;
        field1212 = null;
        field1226 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BIII)I")
    public static final int method424(byte arg0, int arg1, int arg2, int arg3) {
        field1223++;
        if (arg0 != 118) {
            method425(true, 11, null);
        }
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class61() {
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZILid;)V")
    public static final void method425(boolean arg0, int arg1, class60 arg2) {
        field1211++;
        if (arg1 < 76) {
            method422(-102, 11);
        }
        int var3 = arg2.field1201;
        int var4 = (int) arg2.field300;
        arg2.method115(26851);
        if (arg0) {
            class106.method839(-114, var3);
        }
        class118.method942(49, var3);
        class72 var5 = class67.method467((byte) -13, var4);
        if (var5 != null) {
            class23.method160((byte) -29, var5);
        }
        class69.field1419 = 0;
        class12.field222 = false;
        class115.method930(class3.field25, 103, class58.field1166, class58.field1154, class123.field2740);
        if (class112.field2519 != -1) {
            class91.method636(1, class112.field2519, -7771);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lie;)V")
    public class61(class61 arg0) {
        this.field1210 = arg0.field1210;
        this.field1217 = arg0.field1217;
        this.field1225 = arg0.field1225;
        this.field1216 = arg0.field1216;
    }
}
