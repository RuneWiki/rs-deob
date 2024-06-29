import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class252 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lli;")
    public static class185 field4477 = class245.method1649("Interfaces charg-Bes", -26);

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "[S")
    public static short[] field4479 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field4478 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lli;")
    public static class185 field4476 = class245.method1649("hint_headicons", 124);

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lqh;")
    public static class256 field4483 = new class256();

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field4480;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "[I")
    public int[] field4486;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILgb;)V")
    public static final void method1709(int arg0, class142 arg1) {
        field4484++;
        if (class211.field3851 == arg1.field2672 || arg1.field2655 == -1 || arg1.field2691 != 0 || (arg1.field2658 + 1) > class253.method1712(arg1.field2655, arg0 - 254).field51[arg1.field2663]) {
            int var2 = arg1.field2672 - arg1.field2702;
            int var3 = class211.field3851 - arg1.field2702;
            int var4 = arg1.field2708 * 128 + (arg1.method1014(-1) * 64);
            int var5 = arg1.field2685 * 128 + arg1.method1014(-1) * 64;
            int var6 = arg1.field2682 * 128 + (arg1.method1014(-1) * 64);
            int var7 = arg1.field2659 * 128 + (arg1.method1014(-1) * 64);
            arg1.field2694 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg1.field2687 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg1.field2706 == 0) {
            arg1.field2683 = 1024;
        }
        if (arg1.field2706 == 1) {
            arg1.field2683 = 1536;
        }
        arg1.field2677 = 0;
        if (arg0 != 128) {
            return;
        }
        if (arg1.field2706 == 2) {
            arg1.field2683 = 0;
        }
        if (arg1.field2706 == 3) {
            arg1.field2683 = 512;
        }
        arg1.field2695 = arg1.field2683;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public final void method1710(boolean arg0) {
        field4487++;
        class159.method1147(this.field4486, this.field4488, this.field4485);
        if (arg0) {
            this.method274(92, (Graphics) null, 52, 93);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method274(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method1711(byte arg0) {
        field4476 = null;
        field4483 = null;
        if (arg0 <= -29) {
            field4479 = null;
            field4477 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    protected class252() {
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method276(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
    public abstract void method281(Graphics arg0, int arg1, int arg2, byte arg3, int arg4, int arg5);
}
