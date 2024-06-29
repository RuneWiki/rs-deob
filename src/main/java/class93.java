import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class93 extends Canvas {

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field1767;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lsf;")
    public static class33 field1765 = new class33();

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lia;")
    public static class257 field1769 = class28.method234(-10, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZBIZIIZI)Lte;")
    public static final class184 method683(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, int arg7) {
        class14 var8 = class156.method1090(arg2, 0);
        field1764++;
        if (arg7 > 1 && var8.field269 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg7 >= var8.field313[var10] && var8.field313[var10] != 0) {
                    var9 = var8.field269[var10];
                }
            }
            if (var9 != -1) {
                var8 = class156.method1090(var9, 0);
            }
        }
        class232 var11 = var8.method148((byte) -119);
        if (var11 == null) {
            return null;
        }
        class190 var12 = null;
        if (var8.field287 != -1) {
            var12 = (class190) method683(true, (byte) 108, var8.field262, false, 0, 1, true, 10);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field275 != -1) {
            var12 = (class190) method683(false, (byte) -75, var8.field260, false, arg4, arg5, true, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class23.field445;
        int var14 = class23.field451;
        int var15 = 72 % ((9 - arg1) / 50);
        int[] var16 = new int[4];
        int var17 = class23.field447;
        class23.method195(var16);
        class190 var18 = new class190(36, 32);
        class23.method200(var18.field3263, 36, 32);
        class101.method739();
        class101.method732(16, 16);
        class101.field1860 = false;
        int var19 = var8.field285;
        if (arg0) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg5 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class101.field1872[var8.field305] * var19 >> 16;
        int var21 = class101.field1871[var8.field305] * var19 >> 16;
        var11.method1141(0, var8.field292, var8.field274, var8.field305, var8.field299, (var20 + var8.field324) - (var11.method2() / 2), var8.field324 + var21);
        if (arg5 >= 1) {
            var18.method1290(1);
            if (arg5 >= 2) {
                var18.method1290(16777215);
            }
            class23.method200(var18.field3263, 36, 32);
        }
        if (arg4 != 0) {
            var18.method1282(arg4);
        }
        if (var8.field287 != -1) {
            var12.method486(0, 0);
        } else if (var8.field275 != -1) {
            class23.method200(var12.field3263, 36, 32);
            var18.method486(0, 0);
            var18 = var12;
        }
        if (arg3 && (var8.field255 == 1 || arg7 != 1) && arg7 != -1) {
            class177.field3006.method790(class212.method1427(100000, arg7), 0, 9, 16776960, 1);
        }
        class23.method200(var13, var14, var17);
        class23.method194(var16);
        class101.method739();
        class101.field1860 = true;
        return var18;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method684(int arg0) {
        field1765 = null;
        field1769 = null;
        if (arg0 != 16777215) {
            method683(false, (byte) 106, 73, true, 121, 10, true, -29);
        }
    }

    @OriginalMember(owner = "client!jk", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field1767.paint(arg0);
        field1768++;
    }

    @OriginalMember(owner = "client!jk", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1767.update(arg0);
        field1766++;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)[Lak;")
    public static final class190[] method685(int arg0) {
        class190[] var1 = new class190[class135.field2421];
        if (arg0 >= -116) {
            field1769 = null;
        }
        field1762++;
        for (int var2 = 0; var2 < class135.field2421; var2++) {
            int var3 = class72.field1411[var2] * class193.field3287[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class137.field2454[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class3.field92[class30.method252(255, var5[var6])];
            }
            var1[var2] = new class190(class20.field427, class9.field184, class57.field1212[var2], class154.field2701[var2], class72.field1411[var2], class193.field3287[var2], var4);
        }
        class126.method875(false);
        return var1;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class93(Component arg0) {
        this.field1767 = arg0;
    }
}
