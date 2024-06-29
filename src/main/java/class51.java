import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class51 {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lh;")
    public static class69 field936 = new class69();

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "Lnd;")
    public static class127 field938 = new class127(50);

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "[I")
    public static int[] field940 = new int[256];

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "[Lpc;")
    public static class144[] field941 = new class144[16];

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "Ltg;")
    private static class184 field942 = class135.method812("Please subscribe)1 or use a different world)3", 3);

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Ltg;")
    public static class184 field943 = field942;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Ltg;")
    public static class184 field944 = class135.method812("<img=1>", 3);

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Ltg;")
    public static class184 field945 = class135.method812("http:)4)4", 3);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V")
    public static final void method280(int arg0, int arg1) {
        class150.field2697 = 1000 / arg0;
        field935++;
        if (arg1 != 32601) {
            field936 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lrh;I)Z")
    public static final boolean method281(class167 arg0, int arg1) {
        if (arg1 >= -74) {
            return false;
        }
        field939++;
        if (arg0.field3030 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field3030.length; var2++) {
            int var3 = class177.method1086(var2, arg0, (byte) 17);
            int var4 = arg0.field3048[var2];
            if (arg0.field3030[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field3030[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field3030[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public static void method282(int arg0) {
        field942 = null;
        field940 = null;
        field945 = null;
        field936 = null;
        field944 = null;
        field938 = null;
        if (arg0 != -23473) {
            method282(-127);
        }
        field941 = null;
        field943 = null;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)I")
    public static int method283(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)Lhd;")
    public static final class73 method284(int arg0, int arg1) {
        field934++;
        class73 var2 = (class73) class10.field179.method773((long) arg1, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class174.field3291.method1249((byte) -90, 0, arg1);
        if (var3 == null) {
            return null;
        }
        class73 var4 = new class73();
        class97 var5 = new class97(var3);
        int var6 = 0;
        var5.field1834 = var5.field1809.length - 12;
        int var7 = var5.method599(-16003);
        var4.field1373 = var5.method611(false);
        var4.field1361 = var5.method611(false);
        var4.field1359 = var5.method611(false);
        if (arg0 != 38) {
            field938 = null;
        }
        var4.field1358 = var5.method611(false);
        var5.field1834 = 0;
        var4.field1357 = var5.method598(false);
        var4.field1364 = new class184[var7];
        var4.field1365 = new int[var7];
        var4.field1360 = new int[var7];
        while (var5.field1834 < var5.field1809.length - 12) {
            int var8 = var5.method611(false);
            if (var8 == 3) {
                var4.field1364[var6] = var5.method596(-1);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var4.field1365[var6] = var5.method588((byte) -52);
            } else {
                var4.field1365[var6] = var5.method599(-16003);
            }
            var4.field1360[var6++] = var8;
        }
        class10.field179.method776(var4, (long) arg1, (byte) -108);
        return var4;
    }
}
