import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class6 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field59 = 0;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field60 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "[[I")
    public static int[][] field65 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lqd;")
    public static class173 field63 = new class173(4);

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lt;")
    public static class235 field68;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(CI)Z")
    public static final boolean method30(char arg0, int arg1) {
        field64++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            return arg1 > -90;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ldk;Ldk;ILdk;Ldk;)V")
    public static final void method31(class251 arg0, class251 arg1, int arg2, class251 arg3, class251 arg4) {
        class280.field4487 = arg4;
        class126.field1988 = arg0;
        if (arg2 != 0) {
            method32(false);
        }
        field56++;
        class82.field1375 = arg1;
        class156.field2441 = arg3;
        class34.field519 = new class211[class126.field1988.method1671((byte) -23)][];
        class251.field3983 = new boolean[class126.field1988.method1671((byte) -23)];
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)[Lsa;")
    public static final class260[] method32(boolean arg0) {
        field61++;
        class260[] var1 = new class260[class183.field3014];
        int var2 = 0;
        if (arg0) {
            return null;
        }
        while (class183.field3014 > var2) {
            var1[var2] = new class260(class255.field4128, class111.field1749, class273.field4380[var2], class314.field5058[var2], class246.field3916[var2], class60.field976[var2], class70.field1192[var2], class243.field3870);
            var2++;
        }
        class28.method156(-27424);
        return var1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public static final void method33(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field58++;
        for (int var5 = arg1; var5 < class250.field3971; var5++) {
            if ((class74.field1241[var5] + class15.field164[var5]) > arg3 && class74.field1241[var5] < (arg3 + arg4) && arg0 < (class190.field3075[var5] + class132.field2088[var5]) && arg0 + arg2 > class132.field2088[var5]) {
                class85.field1415[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
    public static final int method34(int arg0) {
        if (arg0 >= -94) {
            field65 = null;
        }
        field62++;
        return 14;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
    public static final void method35(int arg0, byte arg1) {
        class175 var2 = class182.method1317(12, arg0, false);
        if (arg1 <= 24) {
            field63 = null;
        }
        var2.method1278((byte) 112);
        field66++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method36(byte arg0) {
        field63 = null;
        field68 = null;
        field60 = null;
        if (arg0 != 36) {
            method34(-84);
        }
        field65 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)Lmk;")
    public static final class228 method37(int arg0, int arg1, int arg2, int arg3) {
        field57++;
        int var4 = arg2 | arg1 << 8;
        class228 var5 = (class228) class63.field1048.method694((long) var4 << 16, false);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class10.field105.method1689(class10.field105.method1682(-2, var4), -128);
        if (var6 == null) {
            int var8 = arg2 | arg0 + 65536 << 8;
            class228 var9 = (class228) class63.field1048.method694((long) var8 << 16, false);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class10.field105.method1689(class10.field105.method1682(-2, var8), arg3 - 124);
            if (var10 == null) {
                int var12 = arg2 | 0xFFFF00;
                class228 var13 = (class228) class63.field1048.method694((long) var12 << 16, false);
                if (var13 != null) {
                    return var13;
                }
                if (arg3 != 0) {
                    method35(-44, (byte) 116);
                }
                byte[] var14 = class10.field105.method1689(class10.field105.method1682(-2, var12), -126);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class228 var15 = class236.method1604(var14, (byte) 9);
                    var15.field3686 = arg2;
                    class63.field1048.method693((long) var12 << 16, 121, var15);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class228 var11 = class236.method1604(var10, (byte) 127);
                var11.field3686 = arg2;
                class63.field1048.method693((long) var8 << 16, 109, var11);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class228 var7 = class236.method1604(var6, (byte) 126);
            var7.field3686 = arg2;
            class63.field1048.method693((long) var4 << 16, -17, var7);
            return var7;
        }
    }
}
