import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class428 extends class504 implements class293 {

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    public static int field5883 = -1;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "C")
    public char field5875;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "F")
    public static float field5882;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public int field5869;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public int field5870;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public int field5872;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "J")
    public long field5871;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "Lbi;")
    public static class449 field5868;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "Lef;")
    public static class456 field5877;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)C", line = 4)
    public final char method1805(int arg0) {
        if (arg0 == 18449) {
            field5885++;
            return this.field5875;
        } else {
            return 'd';
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILbi;)V", line = 18)
    public static final void method2441(int arg0, class449 arg1) {
        class109.field1597 = arg1;
        if (arg0 >= -19) {
            field5882 = -0.23474103F;
        }
        field5873++;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)J", line = 32)
    public final long method1808(boolean arg0) {
        field5879++;
        if (arg0) {
            method2441(-68, null);
        }
        return this.field5871;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)I", line = 50)
    public final int method1806(byte arg0) {
        field5881++;
        int var2 = -19 % ((arg0 + 18) / 49);
        return this.field5869;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)I", line = 60)
    public final int method1807(int arg0) {
        if (arg0 != -10117) {
            this.field5875 = (char) 65494;
        }
        field5878++;
        return this.field5870;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)I", line = 74)
    public final int method1809(int arg0) {
        field5884++;
        if (arg0 != 13772) {
            method2443(true);
        }
        return this.field5872;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII)V", line = 85)
    public static final void method2442(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class525.field7000 = arg2;
        field5874++;
        class695.field9757 = arg4;
        class362.field4874 = arg3;
        class168.field2598 = arg1;
        if (arg0 != -1) {
            method2442(63, -70, 64, -39, 84);
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V", line = 100)
    public static final void method2443(boolean arg0) {
        class169.field2612.method2916((byte) 95);
        field5876++;
        class375.field5058.method2916((byte) 85);
        if (arg0) {
            field5882 = -0.79950696F;
        }
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)V", line = 112)
    public static void method2444(int arg0) {
        field5877 = null;
        field5868 = null;
        if (arg0 >= -7) {
            method2445(12);
        }
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V", line = 124)
    public static final void method2445(int arg0) {
        field5880++;
        if (class216.field3087 != null) {
            return;
        }
        int var1 = class367.field4976;
        int var2 = class251.field3464;
        if (arg0 < 90) {
            return;
        }
        int var3 = class559.field7427 - class627.field8461 - var1;
        int var4 = class164.field2569 - class149.field2387 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class490.field6611 != null) {
                var5 = class490.field6611;
            } else if (class486.field6574 == null) {
                var5 = class619.field8207;
            } else {
                var5 = class486.field6574;
            }
            int var6 = 0;
            int var7 = 0;
            if (class490.field6611 == var5) {
                Insets var8 = class490.field6611.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class164.field2569);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class559.field7427, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 - (var3 - class559.field7427), var7, var3, class164.field2569);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class164.field2569 + var7 - var4, class559.field7427, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}
