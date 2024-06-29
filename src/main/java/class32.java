import java.awt.Component;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lqf;")
    public static class117 field688 = class72.method514(105, "mod_icons");

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lqf;")
    public static class117 field692 = class72.method514(125, "(U0a )2 in: ");

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lqf;")
    private static class117 field694 = class72.method514(125, "Hidden");

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lqf;")
    public static class117 field685 = class72.method514(124, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lqf;")
    public static class117 field693 = field694;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field695 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field679 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public int field687;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lqf;")
    public class117 field682;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Ldf;")
    public static class28 field683;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Ldf;")
    public static class28 field691;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Z")
    public boolean field684;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[[[I")
    public static int[][][] field696;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII[BLqb;I[Ltd;I)V")
    public static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class113 arg7, int arg8, class135[] arg9, int arg10) {
        field689++;
        int var11 = -1;
        if (arg5 != 0) {
            method259(null, (byte) -45);
        }
        class77 var12 = new class77(arg6);
        while (true) {
            int var13 = var12.method582(-74);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method582(79);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var12.method570((byte) 123);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg10 == var18 && var17 >= arg3 && var17 < arg3 + 8 && var16 >= arg4 && arg4 + 8 > var16) {
                    class148 var22 = class23.method181((byte) -106, var11);
                    int var23 = arg1 + class136.method1060(var22.field3665, var17 & 0x7, var22.field3649, var16 & 0x7, arg2, -90, var21);
                    int var24 = class144.method1169(arg2, var17 & 0x7, var22.field3649, true, var16 & 0x7, var22.field3665, var21) + arg8;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg0;
                        if ((class73.field1606[1][var23][var24] & 0x2) == 2) {
                            var25 = arg0 - 1;
                        }
                        class135 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg9[var25];
                        }
                        class124.method983(var21 + arg2 & 0x3, var24, arg7, var23, var11, var26, var20, (byte) 73, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method258(byte arg0) {
        field685 = null;
        field693 = null;
        field692 = null;
        field691 = null;
        field694 = null;
        if (arg0 <= -100) {
            field688 = null;
            field683 = null;
            field696 = null;
            field679 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method259(Component arg0, byte arg1) {
        arg0.addMouseListener(class8.field131);
        if (arg1 > 68) {
            field686++;
            arg0.addMouseMotionListener(class8.field131);
            arg0.addFocusListener(class8.field131);
        }
    }
}
