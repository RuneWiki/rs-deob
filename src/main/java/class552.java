import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public abstract class class552 extends class381 {

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "F")
    public static float field8125 = 0.25F;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "Lmea;")
    public static class355 field8121 = new class355("", 14);

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
    public int field8122;

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "I")
    public int field8123;

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "Lnr;")
    public static class19 field8124;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "Lf;")
    public static class256 field8120;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "[I")
    public int[] field8119;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
    public static void method3217(byte arg0) {
        field8120 = null;
        field8124 = null;
        field8121 = null;
        if (arg0 != -104) {
            method3219((byte) 0, null, null);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(CI)Z")
    public static final boolean method3218(char arg0, int arg1) {
        if (arg1 == -91) {
            field8126++;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BLcea;[[B)V")
    public static final void method3219(byte arg0, class94 arg1, byte[][] arg2) {
        field8118++;
        if (arg0 != -21) {
            return;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg2[var5];
            if (var10 != null) {
                class540 var11 = new class540(var10);
                int var12 = class505.field7147[var5] >> 8;
                int var13 = class505.field7147[var5] & 0xFF;
                int var14 = var12 * 64 - class397.field6005;
                int var15 = var13 * 64 - class403.field6049;
                class413.method2520(false);
                arg1.method3865(var11, var15, class397.field6005, arg0 + 22, class629.field9104, var14, class403.field6049);
                arg1.method590((byte) 0, var15, var11, class332.field4821, var3, var14);
                if (!arg1.field9738 && class697.field9827 / 8 == var12 && class22.field426 / 8 == var13 && var3[0] != -1) {
                    class383.field5750 = class251.field3294.method375(var3[2], arg0 - 1925, var3[0], var3[3], var3[1], class274.field3588);
                    class500.field7077 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class505.field7147[var6] >> 8) * 64 - class397.field6005;
            int var8 = (class505.field7147[var6] & 0xFF) * 64 - class403.field6049;
            byte[] var9 = arg2[var6];
            if (var9 == null && class22.field426 < 800) {
                class413.method2520(false);
                arg1.method3862(var8, arg0 + 24, 64, var7, 64);
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method2013(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method2012(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public abstract void method2017(int arg0, Graphics arg1, int arg2, byte arg3);
}
