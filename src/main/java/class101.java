import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class101 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Ldc;")
    private static class37 field1749 = class185.method1233((byte) 86, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "Ldc;")
    public static class37 field1746 = class185.method1233((byte) 86, "Hidden)2");

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Ldc;")
    public static class37 field1751 = field1749;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[I")
    public static int[] field1745 = new int[] { 2, 2, 4, 2, 1, 8, 4 };

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lwa;")
    public static class238 field1747;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[[S")
    public static short[][] field1752;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method663(int arg0) {
        field1752 = null;
        field1749 = null;
        field1747 = null;
        field1746 = null;
        field1745 = null;
        if (arg0 != 21150) {
            method665(126);
        }
        field1751 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
    public static final void method664(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field299 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static final void method665(int arg0) {
        field1753++;
        if (class195.field3650 > 0) {
            class84.method574(true);
        } else {
            class236.method1525(40, 27172);
            class206.field3828 = class180.field3352;
            class180.field3352 = null;
            int var1 = 4 % ((arg0 - 59) / 56);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
    public static final void method666(int arg0, int arg1, byte arg2) {
        field1748++;
        class203 var3 = class183.field3389[class125.field2246][arg0][arg1];
        if (var3 == null) {
            class68.method498(class125.field2246, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class6 var5 = (class6) var3.method1338(65);
        class6 var6 = null;
        while (var5 != null) {
            class125 var13 = class223.method1471(123, var5.field66.field1295);
            int var14 = var13.field2283;
            if (var13.field2225 == 1) {
                var14 = (var5.field66.field1299 + 1) * var14;
            }
            if (var14 > var4) {
                var6 = var5;
                var4 = var14;
            }
            var5 = (class6) var3.method1332((byte) -89);
        }
        if (var6 == null) {
            class68.method498(class125.field2246, arg0, arg1);
            return;
        }
        if (arg2 <= 112) {
            field1745 = null;
        }
        var3.method1335(var6, -1);
        class6 var7 = (class6) var3.method1338(-122);
        class73 var8 = null;
        class73 var9 = null;
        while (var7 != null) {
            class73 var12 = var7.field66;
            if (var6.field66.field1295 != var12.field1295) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field1295 != var12.field1295 && var9 == null) {
                    var9 = var12;
                }
            }
            var7 = (class6) var3.method1332((byte) -89);
        }
        long var10 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class94.method633(class125.field2246, arg0, arg1, class145.method1008(class125.field2246, arg0 * 128 + 64, arg1 * 128 + 64, (byte) -52), var6.field66, var10, var8, var9);
    }
}
