import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class447 extends class256 {

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public int field6519;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "S")
    public short field6513;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "B")
    public byte field6510;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "Z")
    public boolean field6517;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public int field6520;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public int field6506;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "S")
    public short field6504;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "S")
    public short field6526;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "B")
    public byte field6509;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "S")
    public short field6508;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "Ljava/lang/String;")
    public static String field6518 = "Close";

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[Lri;")
    public static class98[] field6512 = new class98[32768];

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field6525 = 0;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "Ljava/lang/String;")
    public static String field6521 = "skill: ";

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Lvg;")
    public static class108 field6522 = null;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lfg;")
    public static class18 field6511 = new class18(64);

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public int field6505;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "Ldp;")
    public static class174 field6527;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "Ljava/lang/String;")
    public static String field6515;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIII)V", line = 9)
    public static final void method2794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6524++;
        int var8 = class102.method843(arg1, class383.field5497, class308.field4507, arg7);
        int var9 = class102.method843(arg0, class383.field5497, class308.field4507, 0);
        int var10 = class102.method843(arg6, class278.field4184, class185.field2727, arg7);
        int var11 = class102.method843(arg2, class278.field4184, class185.field2727, arg7);
        int var12 = class102.method843(arg1 + arg3, class383.field5497, class308.field4507, 0);
        int var13 = class102.method843(arg0 - arg3, class383.field5497, class308.field4507, arg7);
        for (int var14 = var8; var14 < var12; var14++) {
            class47.method379(var11, (byte) 125, arg5, class286.field4283[var14], var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class47.method379(var11, (byte) 103, arg5, class286.field4283[var15], var10);
        }
        int var16 = class102.method843(arg3 + arg6, class278.field4184, class185.field2727, 0);
        int var17 = class102.method843(arg2 - arg3, class278.field4184, class185.field2727, 0);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class286.field4283[var18];
            class47.method379(var16, (byte) 60, arg5, var19, var10);
            class47.method379(var17, (byte) 119, arg4, var19, var16);
            class47.method379(var11, (byte) 123, arg5, var19, var17);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)Liq;", line = 67)
    public static final class221 method2795(int arg0, byte arg1, int arg2) {
        field6516++;
        class221 var3 = (class221) class403.field5890.method1219((long) arg0 << 32 | (long) arg2, -98);
        if (var3 == null) {
            var3 = new class221(arg0, arg2);
            class403.field5890.method1217(1, var3.field499, var3);
        }
        if (arg1 != -49) {
            field6512 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)V", line = 94)
    public static final void method2796(int arg0, int arg1) {
        if (arg1 > -86) {
            method2796(-15, -3);
        }
        field6514++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class102.field1572 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V", line = 112)
    public static void method2797(byte arg0) {
        field6527 = null;
        field6512 = null;
        field6522 = null;
        field6511 = null;
        field6521 = null;
        int var1 = 121 % ((arg0 + 17) / 50);
        field6518 = null;
        field6515 = null;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V", line = 129)
    public void method1547(byte arg0) {
        field6507++;
        if (arg0 != -115) {
            method2797((byte) 72);
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)I", line = 141)
    public static final int method2798(int arg0, int arg1) {
        if (arg0 != 0) {
            method2797((byte) -2);
        }
        field6503++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(Z)V", line = 166)
    public static final void method2799(boolean arg0) {
        field6523++;
        class32 var1 = (class32) class346.field4881.method157((byte) -125);
        if (arg0) {
            field6512 = null;
        }
        while (var1 != null) {
            if (var1.field454 > 0) {
                var1.field454--;
            }
            if (var1.field454 != 0) {
                if (var1.field451 > 0) {
                    var1.field451--;
                }
                if (var1.field451 == 0 && var1.field459 >= 1 && var1.field462 >= 1 && (class183.field2703 - 2) >= var1.field459 && var1.field462 <= (class66.field1056 - 2) && (var1.field446 < 0 || class107.method944(var1.field446, (byte) -23, var1.field450))) {
                    class425.method2668(var1.field462, var1.field458, var1.field459, var1.field448, var1.field460, -6384, -1, var1.field450, var1.field446);
                    var1.field451 = -1;
                    if (var1.field456 == var1.field446 && var1.field456 == -1) {
                        var1.method251(127);
                    } else if (var1.field456 == var1.field446 && var1.field461 == var1.field448 && var1.field455 == var1.field450) {
                        var1.method251(30);
                    }
                }
            } else if (var1.field456 < 0 || class107.method944(var1.field456, (byte) -29, var1.field455)) {
                class425.method2668(var1.field462, var1.field458, var1.field459, var1.field461, var1.field460, -6384, -1, var1.field455, var1.field456);
                var1.method251(14);
            }
            var1 = (class32) class346.field4881.method145(-124);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 229)
    public class447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6519 = (short) arg3;
        this.field6513 = (short) arg6;
        this.field6510 = arg9;
        this.field6517 = arg8;
        this.field6520 = (short) arg1;
        this.field6506 = (short) arg2;
        this.field6504 = (short) arg5;
        this.field6526 = (short) arg4;
        this.field6509 = (byte) arg0;
        this.field6508 = (short) arg7;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)I")
    public abstract int method136(int arg0);
}
