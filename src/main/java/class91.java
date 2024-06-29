import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class91 {

    @OriginalMember(owner = "client!se", name = "o", descriptor = "J")
    public long field1407 = 0L;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lej;")
    public static class204 field1395 = new class204(64);

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Luf;")
    public static class168 field1402 = class148.method1019(-1720, "::fpson");

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Luf;")
    public static class168 field1411 = class148.method1019(-1720, "Versteckt");

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Luf;")
    public static class168 field1409 = class148.method1019(-1720, "showingVideoAd");

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public int field1394;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public int field1397;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public int field1398;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public int field1404;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public int field1410;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Lf;")
    public class231 field1408;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lfj;")
    public static class283 field1401;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Ltg;", line = 5)
    public static final class292 method644(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class292 var4 = var3.field1969;
            var3.field1969 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V", line = 30)
    public static final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1393++;
        if (arg0 != 0) {
            method646((byte) -54);
        }
        int var8 = arg1 + arg2;
        int var9 = arg5 - arg2;
        for (int var10 = arg1; var10 < var8; var10++) {
            class133.method925(arg0 + 14678, arg3, arg7, arg4, class284.field4810[var10]);
        }
        int var11 = arg2 + arg3;
        int var12 = arg4 - arg2;
        for (int var13 = arg5; var13 > var9; var13--) {
            class133.method925(arg0 + 14678, arg3, arg7, arg4, class284.field4810[var13]);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class284.field4810[var14];
            class133.method925(14678, arg3, arg7, var11, var15);
            class133.method925(14678, var11, arg6, var12, var15);
            class133.method925(arg0 + 14678, var12, arg7, arg4, var15);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 77)
    public static void method646(byte arg0) {
        field1395 = null;
        field1401 = null;
        field1411 = null;
        field1402 = null;
        int var1 = 28 % ((arg0 + 33) / 62);
        field1409 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILj;)Lld;", line = 118)
    public static final class262 method647(int arg0, class153 arg1) {
        if (arg0 != 0) {
            method648(81, 47, -28);
        }
        field1405++;
        return new class262(arg1.method1081((byte) -94), arg1.method1081((byte) -4), arg1.method1081((byte) -23), arg1.method1081((byte) -71), arg1.method1088(-30917), arg1.method1088(-30917), arg1.method1042((byte) -90));
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)J", line = 137)
    public static final long method648(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        return var3 == null || var3.field1969 == null ? 0L : var3.field1969.field4926;
    }
}
