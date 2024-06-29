import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class class124 extends class27 {

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Lec;")
    public static class28 field2699 = class28.method210(-46, "@yel@");

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "Lec;")
    public static class28 field2696 = class28.method210(-46, "Malformed login packet)3");

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    private static int field2698 = 256;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "Lec;")
    public static class28 field2688 = class28.method210(-46, "cross");

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "Lec;")
    public static class28 field2702 = class28.method210(-46, "slide:");

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "Lec;")
    public static class28 field2703 = class28.method210(-46, "Please reload this page)3");

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "Lj;")
    public static class54 field2697;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "Lj;")
    public static class54 field2700;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvb;BI)Lwc;")
    public static final class128 method953(class122 arg0, byte arg1, int arg2) {
        field2689++;
        if (arg1 != 110) {
            method953(null, (byte) -39, -15);
        }
        return class129.method986(65536, arg0, arg2) ? class37.method303(-99) : null;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
    public static void method954(byte arg0) {
        field2697 = null;
        field2703 = null;
        field2696 = null;
        int var1 = 41 / ((arg0 + 27) / 57);
        field2702 = null;
        field2699 = null;
        field2688 = null;
        field2700 = null;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)I")
    private static final int method955(int arg0) {
        int var1 = class47.field1075[arg0];
        int var2 = (field2698 * var1 >> 8) * var1;
        return (int) (Math.sqrt((double) var2) + 0.5D);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(JZ)V")
    public final void method956(long arg0, boolean arg1) {
        field2695++;
        field2698 = 256;
        int var4 = 0;
        if (!arg1) {
            return;
        }
        while (var4 < 16) {
            class47.field1075[var4] = 12800;
            var4++;
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method295(var5 + 176, 7, 100, arg0);
            this.method295(var5 + 176, 39, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(JB)V")
    public final void method957(long arg0, byte arg1) {
        for (int var4 = 0; var4 < 16; var4++) {
            this.method295(var4 + 176, 123, 0, arg0);
        }
        for (int var5 = 0; var5 < 16; var5++) {
            this.method295(var5 + 176, 120, 0, arg0);
        }
        for (int var6 = 0; var6 < 16; var6++) {
            this.method295(var6 + 176, 121, 0, arg0);
        }
        field2694++;
        if (arg1 < 72) {
            field2703 = null;
        }
        for (int var7 = 0; var7 < 16; var7++) {
            this.method295(var7 + 176, 0, 0, arg0);
        }
        for (int var8 = 0; var8 < 16; var8++) {
            this.method295(var8 + 176, 32, 0, arg0);
        }
        for (int var9 = 0; var9 < 16; var9++) {
            this.method295(var9 + 192, 0, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLec;Lec;Z)V")
    public static final void method958(byte arg0, class28 arg1, class28 arg2, boolean arg3) {
        field2690++;
        short var4 = 151;
        if (class117.field2492) {
            class117.field2492 = false;
            class110.method756(true, class117.field2493);
            class43.method341(class117.field2493, 0);
            class64.method513(false, class117.field2493);
            class129.method987(-63, class117.field2493);
            class103.method723(class16.field317, class112.field2418, class117.field2493, arg0 ^ 0xFFFFB9E8, class126.field2735, field2697);
            class50.method405(class117.field2493, 2, class7.field120, -1, class57.field1307 == -1, class127.field2743);
            class74.field1647 = true;
            class36.field820 = true;
            class78.field1817 = true;
        }
        int var6 = var4 - 3;
        class22.method157(arg0 ^ 0xFFFFFFEE);
        field2697.method435(arg1, 257, var6, 0);
        field2697.method435(arg1, 256, var6 - 1, 16777215);
        if (arg2 != null) {
            var6 += 15;
            if (arg3) {
                int var5 = field2697.method437(arg2) + 4;
                class120.method915(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            field2697.method435(arg2, 257, var6, 0);
            field2697.method435(arg2, 256, var6 - 1, 16777215);
        }
        if (arg0 == 62) {
            class61.method497(class117.field2493, 0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(B)V")
    public static final void method959(byte arg0) {
        Object var1 = class96.field2129;
        synchronized (class96.field2129) {
            while (class76.field1716 != 0) {
                class76.field1716 = -1;
                try {
                    class96.field2129.wait();
                } catch (InterruptedException var3) {
                }
            }
            int var2 = -79 / ((arg0 + 62) / 37);
        }
        field2701++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IJII)V")
    public final void method960(int arg0, long arg1, int arg2, int arg3) {
        int var6 = (int) (Math.pow(0.1D, (double) arg3 * 5.0E-4D) * (double) arg0 + 0.5D);
        if (arg2 != 0) {
            return;
        }
        field2692++;
        if (field2698 == var6) {
            return;
        }
        field2698 = var6;
        for (int var7 = 0; var7 < 16; var7++) {
            int var8 = method955(var7);
            this.method295(var7 + 176, 7, var8 >> 7, arg1);
            this.method295(var7 + 176, 39, var8 & 0x7F, arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIJ)V")
    public abstract void method295(int arg0, int arg1, int arg2, long arg3);

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIJ)Z")
    public final boolean method961(int arg0, int arg1, int arg2, long arg3) {
        if ((arg0 & 0xF0) == 176) {
            if (arg1 == 121) {
                this.method295(arg0, arg1, arg2, arg3);
                int var6 = arg0 & 0xF;
                class47.field1075[var6] = 12800;
                int var7 = method955(var6);
                this.method295(arg0, 7, var7 >> 7, arg3);
                this.method295(arg0, 39, var7 & 0x7F, arg3);
                return true;
            }
            if (arg1 == 7 || arg1 == 39) {
                int var8 = arg0 & 0xF;
                if (arg1 == 7) {
                    class47.field1075[var8] = (arg2 << 7) + (class47.field1075[var8] & 0x7F);
                } else {
                    class47.field1075[var8] = (class47.field1075[var8] & 0x3F80) + arg2;
                }
                int var9 = method955(var8);
                this.method295(arg0, 7, var9 >> 7, arg3);
                this.method295(arg0, 39, var9 & 0x7F, arg3);
                return true;
            }
        }
        return false;
    }
}
