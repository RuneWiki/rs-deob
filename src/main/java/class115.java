import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class115 {

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[I")
    public static int[] field1657 = new int[32];

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field1663 = 0;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "Lcc;")
    public static class216 field1666;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Lui;")
    public static class235 field1667;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "[I")
    public static int[] field1668;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public int field1654;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public int field1660;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
    public abstract void method20(int arg0, int arg1);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public static final void method844(boolean arg0) {
        field1653++;
        class96.field1414.method1556((byte) 75);
        if (!arg0) {
            field1657 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V")
    public abstract void method23(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method845(int arg0) {
        field1666 = null;
        field1667 = null;
        field1668 = null;
        if (arg0 == -3667) {
            field1657 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public static final void method846(int arg0) {
        field1658++;
        int var1 = class61.field853;
        int var2 = class80.field1168 - class23.field265 - var1;
        int var3 = 14 / ((-arg0 - 42) / 49);
        int var4 = class178.field2886;
        int var5 = class164.field2670 - class154.field2543 - var4;
        if (var1 <= 0 && var2 <= 0 && var4 <= 0 && var5 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class175.field2847 != null) {
                var6 = class175.field2847;
            } else if (class85.field1240 == null) {
                var6 = class138.field2241.field63;
            } else {
                var6 = class85.field1240;
            }
            int var7 = 0;
            int var8 = 0;
            if (class85.field1240 == var6) {
                Insets var9 = class85.field1240.getInsets();
                var8 = var9.top;
                var7 = var9.left;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var1 > 0) {
                var10.fillRect(var7, var8, var1, class164.field2670);
            }
            if (var4 > 0) {
                var10.fillRect(var7, var8, class80.field1168, var4);
            }
            if (var2 > 0) {
                var10.fillRect(var7 + class80.field1168 - var2, var8, var2, class164.field2670);
            }
            if (var5 > 0) {
                var10.fillRect(var7, class164.field2670 + var8 - var5, class80.field1168, var5);
                return;
            }
        } catch (Exception var11) {
            return;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method847(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field1661++;
        if (arg5 >= 1 && arg6 >= 1 && arg5 <= 102 && arg6 <= 102) {
            if (!class77.method566((byte) -108) && (class86.field1277[0][arg5][arg6] & 0x2) == 0) {
                int var8 = arg2;
                if ((class86.field1277[arg2][arg5][arg6] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class11.field134 != var8) {
                    return;
                }
            }
            int var9 = arg2;
            if (arg2 < 3 && (class86.field1277[1][arg5][arg6] & 0x2) == 2) {
                var9 = arg2 + 1;
            }
            class46.method343(arg0, class138.field2237[arg2], arg6, arg2, var9, -13427, arg5);
            if (arg4 >= 0) {
                boolean var10 = class207.field3334;
                class207.field3334 = true;
                class16.method115(arg6, arg4, false, class138.field2237[arg2], arg2, false, var9, arg5, (byte) -127, arg7, arg1);
                class207.field3334 = var10;
            }
        }
        if (arg3 >= -41) {
            method846(60);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1657[var1] = var0 - 1;
            var0 += var0;
        }
        field1664 = 0;
        field1665 = 0;
        field1666 = new class216(64);
        field1667 = new class235();
        field1668 = new int[1000];
    }
}
