import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class35 extends class147 {

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Lpn;")
    public static class72 field421 = new class72(48, 3);

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "J")
    public static long field436 = -1L;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "Lec;")
    public static class40 field428 = new class40("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "Lpn;")
    public static class72 field437 = new class72(52, 3);

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field438 = -1;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "[I")
    public static int[] field439 = new int[14];

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public int field419;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public int field427;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public int field433;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Lab;")
    public class256 field424;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "Lab;")
    public class256 field429;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Ljava/lang/String;")
    public String field425;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "Z")
    public boolean field434;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "[Ljava/lang/Object;")
    public Object[] field435;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
    public static final void method175(int arg0) {
        field432++;
        class206.field2821.method1165((byte) 118);
        if (arg0 > -34) {
            method178(true);
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public static void method176(int arg0) {
        if (arg0 == -22341) {
            field421 = null;
            field439 = null;
            field428 = null;
            field437 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
    public static final int method177(int arg0, int arg1) {
        return class275.field3914 == null ? 0 : class275.field3914[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)V")
    public static final void method178(boolean arg0) {
        class190.field2597 = null;
        class349.field5000 = null;
        if (!arg0) {
            return;
        }
        class230.field3182 = null;
        class307.field4514 = null;
        class240.field3305 = null;
        class89.field1114 = null;
        class361.field5207 = null;
        field426++;
        client.field3922 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V")
    public static final void method179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field422++;
        int var6 = arg5;
        int var7 = arg0;
        int var8 = arg3 * arg3;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((arg5 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (arg5 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        if (class357.field5123 <= arg2 && arg2 <= class328.field4729) {
            int var21 = class353.method2142((byte) -116, class453.field6396, arg3 + arg4, class75.field912);
            int var22 = class353.method2142((byte) -90, class453.field6396, arg4 - arg3, class75.field912);
            class270.method1633(class240.field3303[arg2], var21, arg1, var22, 108);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var23 = arg2 - var7;
            int var24 = arg2 + var7;
            if (class357.field5123 <= var24 && var23 <= class328.field4729) {
                int var25 = class353.method2142((byte) -116, class453.field6396, arg4 + var6, class75.field912);
                int var26 = class353.method2142((byte) 82, class453.field6396, arg4 - var6, class75.field912);
                if (class357.field5123 <= var23) {
                    class270.method1633(class240.field3303[var23], var25, arg1, var26, arg5 ^ 0x71);
                }
                if (var24 <= class328.field4729) {
                    class270.method1633(class240.field3303[var24], var25, arg1, var26, 121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(CB)Z")
    public static final boolean method180(char arg0, byte arg1) {
        field423++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            int var2 = 19 % ((arg1 - 49) / 49);
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ldb;I)Z")
    public static final boolean method181(class29 arg0, int arg1) {
        field431++;
        if (arg1 == 14) {
            return class258.field3733 == arg0 || class157.field1872 == arg0 || class451.field6387 == arg0;
        } else {
            return false;
        }
    }
}
