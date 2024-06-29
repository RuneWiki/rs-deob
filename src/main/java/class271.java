import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class271 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field4318 = 0;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4325 = "level: ";

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field4322 = 0;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field4319 = 0;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Lim;")
    public static class178 field4315;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "Lnh;")
    public static class305 field4323;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "[I")
    public static int[] field4324;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "[[I")
    public static int[][] field4320;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static void method1767(int arg0) {
        field4315 = null;
        field4324 = null;
        field4320 = null;
        field4325 = null;
        if (arg0 <= 31) {
            field4319 = 43;
        }
        field4323 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1768(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field4321++;
        int var2 = -12 / ((-arg1 - 28) / 47);
        System.exit(1);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static final void method1769(byte arg0) {
        if (class156.field2158 != null) {
            class156.field2158.method867(arg0 - 21);
        }
        field4317++;
        if (arg0 != -50) {
            return;
        }
        if (class110.field1585 != null) {
            class110.field1585.method867(arg0 - 61);
        }
        class98.method636(class37.field570, 22050, (byte) -41, 2);
        class156.field2158 = class276.method1792(class45.field667, 22050, 0, class291.field4645, (byte) -87);
        class156.field2158.method877((byte) 39, class267.field4291);
        class110.field1585 = class276.method1792(class45.field667, 2048, 1, class291.field4645, (byte) -95);
        class110.field1585.method877((byte) 39, class116.field1671);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[B")
    public static final byte[] method1770(int arg0, int arg1) {
        field4326++;
        class276 var2 = (class276) class226.field3534.method1486((long) arg1, -19212);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class137.method863(var4, (byte) 124, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class276(var3);
            class226.field3534.method1489((long) arg1, arg0 - 12962, var2);
        }
        return arg0 == 13080 ? var2.field4389 : null;
    }
}
