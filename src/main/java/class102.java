import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class102 {

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "[[I")
    public static int[][] field1646 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "Lfja;")
    public static class783 field1644 = new class783(39, -2);

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "J")
    public static long field1648;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1650;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "[Llha;")
    public static class652[] field1651;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZII)Z")
    public static final boolean method886(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field1646 = null;
        }
        field1645++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
    public static void method887(int arg0) {
        field1650 = null;
        field1651 = null;
        if (arg0 < 37) {
            method888(117, 67L);
        }
        field1646 = null;
        field1644 = null;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IJ)V")
    public static final void method888(int arg0, long arg1) {
        field1649++;
        int var3 = 109 / ((15 - arg0) / 50);
        int var4 = class624.field8706 + class235.field3379.field7396;
        int var5 = class645.field8917 + class235.field3379.field7398;
        if ((class97.field1557 - var4) < -2000 || class97.field1557 - var4 > 2000 || (class488.field6593 - var5) < -2000 || class488.field6593 - var5 > 2000) {
            class97.field1557 = var4;
            class488.field6593 = var5;
        }
        if (class97.field1557 != var4) {
            int var6 = var4 - class97.field1557;
            int var7 = (int) ((long) var6 * arg1 / 320L);
            if (var6 > 0) {
                if (var7 == 0) {
                    var7 = 1;
                } else if (var7 > var6) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = -1;
            } else if (var7 < var6) {
                var7 = var6;
            }
            class97.field1557 += var7;
        }
        class53.field763 += (float) arg1 * class58.field809 / 6.0F;
        class43.field682 += (float) arg1 * class663.field9212 / 6.0F;
        if (class488.field6593 != var5) {
            int var8 = var5 - class488.field6593;
            int var9 = (int) ((long) var8 * arg1 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var8 > var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var8 < var9) {
                var9 = var8;
            }
            class488.field6593 += var9;
        }
        class559.method3245((byte) 120);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
    public static final String method889(int arg0, int arg1, long arg2) {
        field1647++;
        class127.method1087((byte) 83, arg2);
        int var4 = class60.field821.get(5);
        int var5 = arg0 + class60.field821.get(2);
        int var6 = class60.field821.get(1);
        return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
    }
}
