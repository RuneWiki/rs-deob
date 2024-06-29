import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class224 extends class176 {

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "[I")
    public static int[] field3208 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "Ldv;")
    public static class566 field3199 = new class566(43, -1);

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "[I")
    public static int[] field3215 = new int[13];

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field3216 = 0;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "[I")
    public static int[] field3217 = new int[4];

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "Ltl;")
    public static class531 field3214 = new class531("WTWIP", 3);

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field3218 = 0;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "F")
    public static float field3213;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "Lmc;")
    public class114 field3204;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "Lmc;")
    public class114 field3210;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "Ljava/lang/String;")
    public String field3201;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "Z")
    public boolean field3209;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field3207;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method1437(byte arg0) {
        if (arg0 != 88) {
            return;
        }
        field3215 = null;
        field3199 = null;
        field3217 = null;
        field3208 = null;
        field3214 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIII)I")
    public static final int method1438(int arg0, int arg1, int arg2, int arg3) {
        field3205++;
        if (class132.field2109 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class413.field5829;
        int var7 = arg2 - class413.field5826;
        if (arg1 != 43) {
            method1437((byte) -55);
        }
        for (class299 var8 = (class299) class413.field5819.method456((byte) -39); var8 != null; var8 = (class299) class413.field5819.method460((byte) 121)) {
            if (var8.field4088 == arg0) {
                int var9 = var8.field4087;
                int var10 = var8.field4089;
                int var11 = class413.field5826 + var10 | class413.field5829 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IC)Z")
    public static final boolean method1439(int arg0, char arg1) {
        field3203++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg0 <= 97) {
            field3214 = null;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class3.field44;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }
}
