import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class106 extends class55 {

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "[Ljb;")
    public class56[] field2249;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field2247 = 0;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "Lo;")
    public static class84 field2251 = class15.method124("Last password change:*6n@gre@Never changed", 255);

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lo;")
    public static class84 field2255 = null;

    @OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!sb", name = "P", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "Lad;")
    public static class5 field2244;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "Lpd;")
    public static class93 field2246;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V", line = 9)
    private static final void method782(byte arg0) {
        field2243++;
        class8.field147.method707(-65);
        class17.field311.method732(0, 0);
        if (arg0 >= 25) {
            class4.field66 = class7.method51(class4.field66);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lob;I)V", line = 23)
    public static final void method783(class86 arg0, int arg1) {
        class116.field2541 = arg0;
        if (arg1 >= -103) {
            method787(126);
        }
        field2245++;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V", line = 34)
    public static void method784(byte arg0) {
        if (arg0 <= 45) {
            method787(86);
        }
        field2244 = null;
        field2255 = null;
        field2251 = null;
        field2246 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I", line = 48)
    public static int method785(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILbb;Z)Z", line = 75)
    public static final boolean method786(boolean arg0, int arg1, class9 arg2, boolean arg3) {
        field2239++;
        if (!arg0) {
            method784((byte) -91);
        }
        if (class36.method330(arg2, arg3, (byte) 117)) {
            if (arg1 > 0) {
                class44.field919 = new class97(arg1);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V", line = 95)
    public static final void method787(int arg0) {
        field2241++;
        int var1 = -45 / ((arg0 + 47) / 50);
        class6.field118 = true;
        method782((byte) 35);
        if (class78.field1657 != -1) {
            boolean var2 = class26.method198(0, -1, class78.field1657, 1, 0, 261, 0, 190, 2);
            if (!var2) {
                class39.field798 = true;
            }
        } else if (class3.field32[class74.field1546] != -1) {
            boolean var3 = class26.method198(0, -1, class3.field32[class74.field1546], 1, 0, 261, 0, 190, 2);
            if (!var3) {
                class39.field798 = true;
            }
        }
        if (class116.field2529 && class1.field24 == 1) {
            class28.method262(30307);
        }
        class85.method678(44, class30.field593);
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)V", line = 140)
    public static final void method788(int arg0) {
        class24.field403.method742(4);
        field2253++;
        if (arg0 <= 109) {
            field2255 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Z", line = 158)
    public final boolean method789(int arg0, int arg1) {
        if (arg0 <= 108) {
            field2255 = null;
        }
        field2240++;
        return this.field2249[arg1].field1164;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B[Lo;)[Lo;", line = 171)
    public static final class84[] method790(byte arg0, class84[] arg1) {
        class84[] var2 = new class84[5];
        if (arg0 != 112) {
            return null;
        }
        field2238++;
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class97.method746(0, new class84[] { class62.method489(var3, (byte) -125), class1.field26 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class97.method746(0, new class84[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lud;Lud;IZ)V", line = 205)
    public class106(class118 arg0, class118 arg1, int arg2, boolean arg3) {
        class88 var5 = new class88();
        int var6 = arg0.method917(arg2, (byte) 120);
        this.field2249 = new class56[var6];
        int[] var7 = arg0.method922((byte) -75, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method909((byte) -118, var7[var8], arg2);
            int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            class38 var11 = null;
            for (class38 var12 = (class38) var5.method695((byte) -115); var12 != null; var12 = (class38) var5.method702(0)) {
                if (var12.field740 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method902(0, var10, -1);
                } else {
                    var13 = arg1.method902(var10, 0, -1);
                }
                var11 = new class38(var10, var13);
                var5.method692((byte) -98, var11);
            }
            this.field2249[var7[var8]] = new class56(var9, var11);
        }
    }
}
