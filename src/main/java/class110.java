import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class110 {

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public int field1427 = -1;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Z")
    public static boolean field1416 = false;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[[S")
    public static short[][] field1421 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field1425 = 0;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Lpm;")
    public static class349 field1428 = new class349("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lhk;")
    public class54 field1420;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[I")
    public int[] field1430;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "[Lvj;")
    public static class256[] field1426;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field1423;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method670(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 == arg8 && arg0 == arg7 && arg2 == arg9 && arg3 == arg6) {
            class417.method2630(arg6, arg7, arg8, arg1, arg9, (byte) 32);
        } else {
            int var10 = arg8;
            int var11 = arg7;
            int var12 = arg8 * 3;
            int var13 = arg7 * 3;
            int var14 = arg5 * 3;
            int var15 = arg0 * 3;
            int var16 = arg2 * 3;
            int var17 = arg3 * 3;
            int var18 = arg9 + var14 - var16 - arg8;
            int var19 = var15 + arg6 - arg7 - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg8 + (var27 + var29 + var31 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg7;
                class417.method2630(var34, var11, var10, arg1, var33, (byte) 32);
                var10 = var33;
                var11 = var34;
            }
        }
        field1431++;
        if (arg4 < 106) {
            method671(15, -120);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lb;")
    public static final class183 method671(int arg0, int arg1) {
        field1429++;
        class15 var2 = class317.field4658;
        class183 var3;
        synchronized (class317.field4658) {
            var3 = (class183) class317.field4658.method99(true, (long) arg1);
            if (arg0 != -21965) {
                method673((byte) -95);
            }
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class393.field5532.method643(class54.method347(arg0 + 43476, arg1), class88.method526(arg0 ^ 0xA07, arg1), true);
        class183 var5 = new class183();
        var5.field2598 = arg1;
        if (var4 != null) {
            var5.method1316(arg0 + 21838, new class130(var4));
        }
        var5.method1312((byte) -8);
        class15 var6 = class317.field4658;
        synchronized (class317.field4658) {
            class317.field4658.method90(var5, (long) arg1, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public static final void method672(int arg0, int arg1, int arg2) {
        class139.field2125 = arg0 - class176.field2493;
        if (arg2 != -14256) {
            field1421 = null;
        }
        field1424++;
        class209.field2986 = arg1 - class176.field2486;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method673(byte arg0) {
        field1426 = null;
        field1421 = null;
        if (arg0 < -61) {
            field1428 = null;
        }
    }
}
