import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class173 {

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field2416 = null;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field2410 = 0;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field2405 = -1;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Z")
    public static boolean field2418 = true;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public int field2403;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public int field2417;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public int field2426;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public int field2428;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "Lq;")
    public static class128 field2430;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field2415;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method1132(int arg0) {
        field2415 = null;
        field2430 = null;
        if (arg0 == 0) {
            field2416 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public static final void method1133(int arg0, int arg1) {
        int var2 = 110 % ((arg0 + 17) / 58);
        field2401++;
        class69 var3 = (class69) class75.field1051.method23(216, (long) arg1);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field941.length; var4++) {
                var3.field941[var4] = -1;
                var3.field942[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V")
    public static final void method1134(int arg0, byte arg1) {
        field2414++;
        if (arg1 == 84) {
            class269 var2 = class87.field1182;
            synchronized (class87.field1182) {
                class5.field43 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lhc;Lhc;Lhc;ILhc;)V")
    public static final void method1135(class235 arg0, class235 arg1, class235 arg2, int arg3, class235 arg4) {
        class221.field3323 = arg0;
        field2408++;
        class19.field281 = arg2;
        class149.field2061 = arg4;
        if (arg3 != 17055) {
            field2415 = null;
        }
        class1.field1 = arg1;
        class158.field2208 = new class211[class221.field3323.method1561(-24367)][];
        class191.field2650 = new boolean[class221.field3323.method1561(-24367)];
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Li;")
    public static final class57 method1136(byte arg0, int arg1) {
        field2419++;
        class57 var2 = (class57) class293.field4609.method961((long) arg1, 9156);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class184.field2551.method1576(-125, arg1, 0);
        if (var3 == null) {
            return null;
        }
        class57 var4 = new class57();
        class224 var5 = new class224(var3);
        var5.field3402 = var5.field3336.length - 2;
        int var6 = var5.method1445(false);
        int var7 = var5.field3336.length - var6 - 2 - 12;
        var5.field3402 = var7;
        int var8 = var5.method1483((byte) 46);
        var4.field814 = var5.method1445(false);
        var4.field818 = var5.method1445(false);
        var4.field820 = var5.method1445(false);
        var4.field816 = var5.method1445(false);
        int var9 = var5.method1453((byte) -127);
        if (var9 > 0) {
            var4.field824 = new class4[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1445(false);
                class4 var12 = new class4(class89.method567(var11, -1989));
                var4.field824[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1483((byte) 46);
                    int var14 = var5.method1483((byte) 46);
                    var12.method20(new class47(var14), (long) var13, arg0 ^ 0xFFFFFF88);
                }
            }
        }
        var5.field3402 = 0;
        var4.field821 = var5.method1450(113);
        var4.field823 = new int[var8];
        if (arg0 != -120) {
            field2415 = null;
        }
        var4.field815 = new int[var8];
        var4.field813 = new String[var8];
        int var15 = 0;
        while (var7 > var5.field3402) {
            int var16 = var5.method1445(false);
            if (var16 == 3) {
                var4.field813[var15] = var5.method1455(-87).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field823[var15] = var5.method1453((byte) -127);
            } else {
                var4.field823[var15] = var5.method1483((byte) 46);
            }
            var4.field815[var15++] = var16;
        }
        class293.field4609.method957(21915, (long) arg1, var4);
        return var4;
    }
}
