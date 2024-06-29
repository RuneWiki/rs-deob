import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Loc;")
    private static class151 field93 = class137.method873(2, "FULL");

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field98 = 0;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Loc;")
    public static class151 field96 = field93;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Loc;")
    public static class151 field99 = class137.method873(2, "<br>");

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Loc;")
    public static class151 field101 = class137.method873(2, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Loc;")
    public class151 field97;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Z")
    public boolean field92;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Z")
    public static boolean field95;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field94++;
        int var5 = 0;
        if (arg2 != -9529) {
            field93 = null;
        }
        while (var5 < class147.field2628) {
            if (arg3 < class222.field3858[var5] + class121.field2176[var5] && arg3 + arg4 > class222.field3858[var5] && class210.field3679[var5] + class192.field3407[var5] > arg0 && class192.field3407[var5] < arg0 + arg1) {
                class224.field3911[var5] = true;
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Lig;")
    public static final class93 method32(byte arg0, int arg1) {
        if (arg0 <= 20) {
            return null;
        }
        field87++;
        class93 var2 = (class93) class20.field448.method1318((byte) -41, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class51.field1023.method1208(class210.method1310(arg1, 255), (byte) -69, class117.method715(arg1, (byte) -73));
        class93 var4 = new class93();
        var4.field1709 = arg1;
        if (var3 != null) {
            var4.method588(-888, new class229(var3));
        }
        var4.method594(true);
        if (var4.field1732) {
            var4.field1714 = false;
            var4.field1719 = 0;
        }
        class20.field448.method1324(var4, 18373, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static void method33(boolean arg0) {
        field93 = null;
        field96 = null;
        field99 = null;
        field101 = null;
        if (!arg0) {
            method32((byte) -83, -125);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method34(int arg0) {
        field91++;
        class57.field1140.method319(-118);
        for (int var1 = 0; var1 < 32; var1++) {
            class116.field2093[var1] = 0L;
        }
        int var2 = 0;
        if (arg0 <= 57) {
            field93 = null;
        }
        while (var2 < 32) {
            class27.field578[var2] = 0L;
            var2++;
        }
        class133.field2422 = 0;
    }
}
