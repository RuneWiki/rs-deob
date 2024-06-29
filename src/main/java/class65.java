import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class65 {

    @OriginalMember(owner = "client!om", name = "q", descriptor = "J")
    public long field1264 = 0L;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Lmh;")
    public static class128 field1256 = class22.method156(123, "Titelbild geladen)3");

    @OriginalMember(owner = "client!om", name = "h", descriptor = "[I")
    public static int[] field1255 = new int[] { 0, 0, 5, 0, 0, 0, 4, 0, 0, 0, 0, -2, 0, 10, 0, 0, 5, 0, 1, 0, 0, 2, 0, 0, 0, 0, 6, 0, 4, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, -1, 2, 0, 20, 0, 0, -1, 9, 0, 0, 0, 0, 2, 0, 0, 0, 2, 2, 5, 0, 0, -2, -1, 15, 7, 0, 0, 0, -2, 0, -1, 3, 7, -2, 0, 0, 10, 0, -1, 0, -2, -2, 0, 0, 0, 0, 0, -1, 4, 0, 0, 0, 6, 0, 14, 0, -1, 1, 0, 5, 8, 0, 0, -2, 6, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, -1, 10, 0, 0, 12, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 14, -2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -2, -1, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, -2, 0, 0, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 8, 0, 6, 0, 8, -2, 0, 0, 0, 4, 0, 15, 0, 0, 9, 6, -1, 0, 0, 0, 0, 1, 0, 5, 0, 0, 0, 8, 6, 0, 0, 4, 0, 7, 5, 0, 0, 24, 8, 5, 3, 12, 0, 0, 10, 0, 0, 0, -1, 1, 0, 0, 0, 0, 2, 0, 6, -2 };

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field1250 = 0;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field1257 = -1;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "Lmh;")
    public static class128 field1260 = class22.method156(126, "leuchten3:");

    @OriginalMember(owner = "client!om", name = "r", descriptor = "Lmh;")
    public static class128 field1265 = class22.method156(122, "loc");

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public int field1254;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Ljm;")
    public class226 field1251;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "Ljm;")
    public class226 field1252;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method440(int arg0, int arg1, int arg2, int arg3) {
        class229 var4 = class241.method1638(arg2, -17, arg0);
        field1263++;
        var4.method1574(3199);
        var4.field3981 = arg3;
        var4.field3980 = arg1;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 19)
    public static void method441(int arg0) {
        field1256 = null;
        field1255 = null;
        field1260 = null;
        if (arg0 != 0) {
            field1253 = -113;
        }
        field1265 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljm;III)V", line = 32)
    public static final void method442(class226 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class297.field5067) {
            class150 var4 = class182.field3184[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2586 != null && var4.field2586.field1572.method771()) {
                arg0.method779(var4.field2586.field1572, 128, 0, 0, true);
            }
        }
        if (arg3 < class297.field5067) {
            class150 var5 = class182.field3184[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2586 != null && var5.field2586.field1572.method771()) {
                arg0.method779(var5.field2586.field1572, 0, 0, 128, true);
            }
        }
        if (arg2 < class297.field5067 && arg3 < class155.field2670) {
            class150 var6 = class182.field3184[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2586 != null && var6.field2586.field1572.method771()) {
                arg0.method779(var6.field2586.field1572, 128, 0, 128, true);
            }
        }
        if (arg2 < class297.field5067 && arg3 > 0) {
            class150 var7 = class182.field3184[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2586 != null && var7.field2586.field1572.method771()) {
                arg0.method779(var7.field2586.field1572, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lmh;B)V", line = 93)
    public static final void method443(class128 arg0, byte arg1) {
        field1259++;
        if (class208.field3694 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method819((byte) 94);
        if (var3 == 0L) {
            return;
        }
        if (arg1 > -40) {
            method442((class226) null, -112, -63, 121);
        }
        while (var2 < class208.field3694.length && class208.field3694[var2].field4915 != var3) {
            var2++;
        }
        if (var2 < class208.field3694.length && class208.field3694[var2] != null) {
            class308.field5234++;
            class71.field1320.method570(135, -1);
            class71.field1320.method1344(48, class208.field3694[var2].field4915);
        }
    }
}
