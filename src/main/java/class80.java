import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class80 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lli;")
    public static class185 field1390 = class245.method1649("::shiftclick", 124);

    @OriginalMember(owner = "client!q", name = "h", descriptor = "Lli;")
    private static class185 field1397 = class245.method1649("", 125);

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lli;")
    public static class185 field1391 = field1397;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "Lgf;")
    public static class7 field1395 = new class7(64);

    @OriginalMember(owner = "client!q", name = "k", descriptor = "[I")
    public static int[] field1400 = new int[4096];

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Lgf;")
    public static class7 field1402;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "[I")
    public static int[] field1404;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
    public static boolean field1403;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lmh;")
    public static class114 field1401;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method514(int arg0) {
        field1404 = null;
        field1391 = null;
        field1400 = null;
        field1390 = null;
        field1401 = null;
        field1402 = null;
        int var1 = -46 / ((15 - arg0) / 58);
        field1395 = null;
        field1397 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljd;I)Lli;")
    public static final class185 method515(class118 arg0, int arg1) {
        if (arg1 != 32767) {
            method514(-91);
        }
        field1396++;
        return class103.method722(arg0, 32767, 1);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIILic;B)Lic;")
    public static final class98 method516(int arg0, int arg1, int arg2, int arg3, int arg4, class98 arg5, byte arg6) {
        field1398++;
        long var7 = (long) arg3;
        class98 var9 = (class98) class217.field3977.method82(6, var7);
        if (var9 == null) {
            class4 var10 = class4.method68(class36.field560, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method64(64, 768, -50, -10, -50);
            class217.field3977.method84(arg6 ^ 0x72, var7, var9);
        }
        int var11 = arg5.method645();
        int var12 = arg5.method640();
        int var13 = arg5.method633();
        int var14 = arg5.method636();
        class98 var15 = var9.method639(true, true);
        if (arg6 != 4) {
            return null;
        }
        if (arg1 != 0) {
            var15.method643(arg1);
        }
        class222 var16 = (class222) var15;
        if (class236.method1606(arg6 ^ 0x28, arg4 + var13, arg0 + var11, class265.field4703) != arg2 || class236.method1606(66, arg4 + var14, arg0 + var12, class265.field4703) != arg2) {
            for (int var17 = 0; var17 < var16.field4028; var17++) {
                var16.field4027[var17] += class236.method1606(class260.method1766(arg6, 62), var16.field4035[var17] + arg4, var16.field4032[var17] + arg0, class265.field4703) - arg2;
            }
            var16.field4034 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLjd;)V")
    public static final void method517(boolean arg0, class118 arg1) {
        if (class211.field3858 != null) {
            try {
                class211.field3858.method8(16197, 0L);
                class211.field3858.method13(arg1.field2115, 0, 24, arg1.field2155);
            } catch (Exception var2) {
            }
        }
        field1394++;
        if (arg0) {
            field1403 = true;
        }
        arg1.field2155 += 24;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1400[var0] = class102.method721((byte) -44, var0);
        }
        field1402 = new class7(64);
        field1404 = new int[2048];
        field1403 = false;
    }
}
