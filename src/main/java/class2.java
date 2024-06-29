import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
    public static int[] field34 = new int[1000];

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "Lic;")
    public static class59 field35 = class59.method433(0, " weitere Optionen");

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field42 = -1;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Lic;")
    public static class59 field48 = class59.method433(0, "me");

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lic;")
    private static class59 field45 = class59.method433(0, "skill)2");

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "[I")
    public static int[] field49 = new int[100];

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Lic;")
    public static class59 field47 = field45;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lm;")
    public static class83 field31 = new class83();

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Lic;")
    private static class59 field52 = class59.method433(0, "Malformed login packet)3");

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "Lic;")
    public static class59 field51 = field52;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public int field50;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Lic;")
    public class59 field46;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Z")
    public boolean field40;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public static void method8(byte arg0) {
        field52 = null;
        field47 = null;
        field35 = null;
        field48 = null;
        field31 = null;
        field34 = null;
        if (arg0 != -86) {
            method11(-28, 73, (byte) -11);
        }
        field45 = null;
        field51 = null;
        field49 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lbb;")
    public static final class10 method9(int arg0, int arg1) {
        class10 var2 = (class10) class147.field3203.method675((long) arg1, 26431);
        field36++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class154.field3332.method193(false, 0, arg1);
        if (var3 == null) {
            return null;
        }
        int var4 = 0;
        class10 var5 = new class10();
        class157 var6 = new class157(var3);
        if (arg0 != 11111) {
            return null;
        }
        var6.field3457 = var6.field3473.length - 12;
        int var7 = var6.method1175((byte) -99);
        var5.field210 = var6.method1161((byte) 60);
        var5.field219 = var6.method1161((byte) 60);
        var5.field215 = var6.method1161((byte) 60);
        var5.field221 = var6.method1161((byte) 60);
        var6.field3457 = 0;
        var5.field220 = var6.method1176(-1);
        var5.field209 = new class59[var7];
        var5.field211 = new int[var7];
        var5.field222 = new int[var7];
        while (var6.field3473.length - 12 > var6.field3457) {
            int var8 = var6.method1161((byte) 60);
            if (var8 == 3) {
                var5.field209[var4] = var6.method1214((byte) -46);
            } else if (var8 >= 100 || var8 == 21 || var8 == 38 || var8 == 39) {
                var5.field222[var4] = var6.method1194(false);
            } else {
                var5.field222[var4] = var6.method1175((byte) -116);
            }
            var5.field211[var4++] = var8;
        }
        class147.field3203.method672(arg0 - 41575, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method10(int arg0) {
        client.field488 = null;
        if (arg0 != -6) {
            field45 = null;
        }
        class100.field2471 = null;
        field43++;
        class15.field298 = null;
        class34.field918 = null;
        class136.field3037 = null;
        class44.field1120 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)Z")
    public static final boolean method11(int arg0, int arg1, byte arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        field44++;
        if (arg2 < 99) {
            method8((byte) 88);
        }
        class19 var3 = class53.method397(arg0, 13415);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method103(arg1, 0);
    }
}
