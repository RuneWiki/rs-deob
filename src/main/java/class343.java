import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class343 extends class529 {

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lbi;")
    public static class104 field5349 = new class104(82, -1);

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public int field5345;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public int field5346;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
    public int[] field5347;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "[I")
    public static int[] field5350;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method2273(int arg0) {
        field5348++;
        class471.method2930(22050, 2, class141.field1911.field6122, -16919);
        class332.field5191 = new class53();
        class332.field5191.method369(9, 8336242, 128);
        class119.field1631 = class4.method43(0, 22050, class339.field5294, class320.field4980, -3869);
        class119.field1631.method1800(class332.field5191, 13845);
        class365.method2398(class300.field4717, class332.field5191, class116.field1621, class71.field1074, arg0 - 1084461830);
        class164.field2370 = class4.method43(1, 2048, class339.field5294, class320.field4980, arg0 - 1084493597);
        class411.field6231 = new class66();
        class164.field2370.method1800(class411.field6231, 13845);
        if (arg0 != 1084489728) {
            field5350 = null;
        }
        class73.field1105 = new class239(22050, class221.field3742);
        class317.field4937 = class305.field4799.method1014(true, "scape main");
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method527(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method529(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method528(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILsj;IIBIIIIII)Z")
    public static final boolean method2274(int arg0, class284 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5351++;
        int var11 = arg10;
        int var12 = arg3;
        byte var13 = 64;
        if (arg4 < 96) {
            method2273(-107);
        }
        byte var14 = 64;
        int var15 = arg10 - var13;
        class258.field4160[var13][var14] = 99;
        int var16 = arg3 - var14;
        class418.field6347[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class21.field248[var17] = arg10;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class299.field4713[var10001] = arg3;
        int[][] var19 = arg1.field4485;
        while (var26 != var18) {
            var11 = class21.field248[var18];
            var12 = class299.field4713[var18];
            int var20 = var11 - var15;
            int var21 = var12 - arg1.field4480;
            int var22 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var11 - arg1.field4494;
            if (arg5 == -4) {
                if (arg7 == var11 && arg8 == var12) {
                    class525.field7746 = var12;
                    class300.field4716 = var11;
                    return true;
                }
            } else if (arg5 == -3) {
                if (class263.method1805(var11, 1, arg2, arg8, (byte) 86, arg7, 1, var12, arg9)) {
                    class525.field7746 = var12;
                    class300.field4716 = var11;
                    return true;
                }
            } else if (arg5 == -2) {
                if (arg1.method1911(var12, arg2, arg7, 1, arg8, arg9, var11, 1, arg6, (byte) 123)) {
                    class525.field7746 = var12;
                    class300.field4716 = var11;
                    return true;
                }
            } else if (arg5 == -1) {
                if (arg1.method1912(arg2, (byte) 103, var11, var12, arg7, arg9, arg8, arg6, 1)) {
                    class525.field7746 = var12;
                    class300.field4716 = var11;
                    return true;
                }
            } else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
                if (arg1.method1921(1, var12, arg8, arg7, arg0, var11, arg5, 2883872)) {
                    class300.field4716 = var11;
                    class525.field7746 = var12;
                    return true;
                }
            } else if (arg1.method1918(var11, arg8, 1, arg7, arg0, arg5, var12, 115)) {
                class300.field4716 = var11;
                class525.field7746 = var12;
                return true;
            }
            int var25 = class418.field6347[var20][var22] + 1;
            if (var20 > 0 && class258.field4160[var20 - 1][var22] == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0) {
                class21.field248[var26] = var11 - 1;
                class299.field4713[var26] = var12;
                class258.field4160[var20 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class418.field6347[var20 - 1][var22] = var25;
            }
            if (var20 < 127 && class258.field4160[var20 + 1][var22] == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0) {
                class21.field248[var26] = var11 + 1;
                class299.field4713[var26] = var12;
                class258.field4160[var20 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class418.field6347[var20 + 1][var22] = var25;
            }
            if (var22 > 0 && class258.field4160[var20][var22 - 1] == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class21.field248[var26] = var11;
                class299.field4713[var26] = var12 - 1;
                class258.field4160[var20][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class418.field6347[var20][var22 - 1] = var25;
            }
            if (var22 < 127 && class258.field4160[var20][var22 + 1] == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class21.field248[var26] = var11;
                class299.field4713[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class258.field4160[var20][var22 + 1] = 4;
                class418.field6347[var20][var22 + 1] = var25;
            }
            if (var20 > 0 && var22 > 0 && class258.field4160[var20 - 1][var22 - 1] == 0 && (var19[var23 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class21.field248[var26] = var11 - 1;
                class299.field4713[var26] = var12 - 1;
                class258.field4160[var20 - 1][var22 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class418.field6347[var20 - 1][var22 - 1] = var25;
            }
            if (var20 < 127 && var22 > 0 && class258.field4160[var20 + 1][var22 - 1] == 0 && (var19[var23 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class21.field248[var26] = var11 + 1;
                class299.field4713[var26] = var12 - 1;
                class258.field4160[var20 + 1][var22 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class418.field6347[var20 + 1][var22 - 1] = var25;
            }
            if (var20 > 0 && var22 < 127 && class258.field4160[var20 - 1][var22 + 1] == 0 && (var19[var23 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class21.field248[var26] = var11 - 1;
                class299.field4713[var26] = var12 + 1;
                class258.field4160[var20 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class418.field6347[var20 - 1][var22 + 1] = var25;
            }
            if (var20 < 127 && var22 < 127 && class258.field4160[var20 + 1][var22 + 1] == 0 && (var19[var23 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class21.field248[var26] = var11 + 1;
                class299.field4713[var26] = var12 + 1;
                class258.field4160[var20 + 1][var22 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class418.field6347[var20 + 1][var22 + 1] = var25;
            }
        }
        class525.field7746 = var12;
        class300.field4716 = var11;
        return false;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method2275(byte arg0) {
        if (arg0 != 103) {
            field5350 = null;
        }
        field5349 = null;
        field5350 = null;
    }

    static {
        new class213("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }
}
