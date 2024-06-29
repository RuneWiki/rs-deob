import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class127 extends class86 {

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[I")
    public int[] field1989 = new int[1];

    @OriginalMember(owner = "client!q", name = "y", descriptor = "[I")
    public int[] field1998 = new int[] { -1 };

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field1996 = 0;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "Luf;")
    public static class176 field1992;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static final void method901(byte arg0) {
        class167.field2523.method1782(97);
        field1988++;
        if (arg0 != 74) {
            method902(-43);
        }
        class6.field110.method1782(-102);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public static void method902(int arg0) {
        if (arg0 != 65535) {
            method904(-95, -35);
        }
        field1992 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method903(byte arg0, String arg1) {
        if (arg0 >= -85) {
            field1996 = -70;
        }
        field1990++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
    public static final void method904(int arg0, int arg1) {
        field1994++;
        class295 var2 = class250.method1673(-126, arg1, arg0);
        var2.method1979(-8205);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIII)Lnl;")
    public static final class96 method905(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1999++;
        long var5 = (long) arg4 & 0xFFFFL | 0xFFFFL << 16 & (long) arg3 << 16 | (long) arg2 << 32 & 0xFFFFL << 32 | ((long) arg1 & 0xFFFFL) << 48;
        class96 var7 = (class96) class220.field3438.method1780(var5, (byte) -116);
        if (var7 != null) {
            return var7;
        }
        class14[] var8 = null;
        class76 var9 = class25.method202(arg4, -281);
        if (var9.field1274 != null) {
            var8 = new class14[var9.field1274.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class75 var11 = class165.method1095(var9.field1274[var10], (byte) 53);
                var8[var10] = new class14(var11.field1261, var11.field1258, var11.field1269, var11.field1259, var11.field1263, var11.field1271, var11.field1266, var11.field1268);
            }
        }
        class96 var12 = new class96(var9.field1280, var8, var9.field1276, arg1, arg2, arg3);
        class220.field3438.method1784(var12, false, var5);
        if (arg0 != 39) {
            field1997 = -63;
        }
        return var12;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
    public static final void method906(int arg0, byte arg1) {
        field1991++;
        for (class86 var2 = class90.field1454.method1410(-128); var2 != null; var2 = class90.field1454.method1413(-1)) {
            if (((long) arg0) == (var2.field1408 >> 48 & 0xFFFFL)) {
                var2.method693(-72);
            }
        }
        if (arg1 < 49) {
            method901((byte) 84);
        }
    }
}
