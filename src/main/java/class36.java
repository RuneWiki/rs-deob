import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class36 extends class287 {

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Ltl;")
    private static class59 field526 = class85.method639("Loading sprites )2 ", 9588);

    @OriginalMember(owner = "client!je", name = "u", descriptor = "J")
    public static long field527 = 0L;

    @OriginalMember(owner = "client!je", name = "I", descriptor = "Ltl;")
    public static class59 field540 = class85.method639("<col=ffb000>", 9588);

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Ltl;")
    public static class59 field531 = field526;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Ltl;")
    public static class59 field521 = class85.method639("Bitte warten Sie)3)3)3", 9588);

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Lkl;")
    public static class64 field529 = new class64();

    @OriginalMember(owner = "client!je", name = "P", descriptor = "[I")
    public static int[] field547 = new int[32];

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field520;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public int field539;

    @OriginalMember(owner = "client!je", name = "J", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!je", name = "L", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "Luc;")
    public class107 field538;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Lke;")
    public class115 field544;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "Lng;")
    public class162 field535;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Lee;")
    public class207 field522;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V", line = 9)
    public static final void method239(int arg0) {
        field532++;
        int var1 = class30.field421;
        int var2 = class264.field4553;
        int var3 = class59.field915 - class53.field792 - var2;
        if (arg0 < 42) {
            return;
        }
        int var4 = class312.field5289 - class152.field2498 - var1;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class232.field3811 != null) {
                var5 = class232.field3811;
            } else if (class253.field4209 == null) {
                var5 = class308.field5222.field2870;
            } else {
                var5 = class253.field4209;
            }
            int var6 = 0;
            int var7 = 0;
            if (class253.field4209 == var5) {
                Insets var8 = class253.field4209.getInsets();
                var6 = var8.top;
                var7 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class59.field915);
            }
            if (var2 > 0) {
                var9.fillRect(var7, var6, class312.field5289, var2);
            }
            if (var4 > 0) {
                var9.fillRect(var7 + class312.field5289 - var4, var6, var4, class59.field915);
            }
            if (var3 > 0) {
                var9.fillRect(var7, class59.field915 + var6 - var3, class312.field5289, var3);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 87)
    public final void method240(byte arg0) {
        this.field544 = null;
        this.field522 = null;
        this.field535 = null;
        field528++;
        if (arg0 != -82) {
            this.field535 = (class162) null;
        }
        this.field538 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V", line = 133)
    public static final void method241(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class174.method1283(arg4 ^ 0xE3DC23E6, arg1, class163.field2662[arg0], arg2 - arg3, arg2 + arg3);
        field517++;
        if (arg4 != -472112159) {
            return;
        }
        int var5 = arg3;
        int var6 = -arg3;
        int var7 = 0;
        int var8 = -1;
        while (var5 > var7) {
            var7++;
            var8 += 2;
            var6 += var8;
            if (var6 >= 0) {
                var5--;
                var6 -= var5 << 1;
                int[] var9 = class163.field2662[arg0 + var5];
                int[] var10 = class163.field2662[arg0 - var5];
                int var11 = arg2 - var7;
                int var12 = arg2 + var7;
                class174.method1283(7, arg1, var9, var11, var12);
                class174.method1283(7, arg1, var10, var11, var12);
            }
            int var13 = arg2 - var5;
            int[] var14 = class163.field2662[arg0 + var7];
            int[] var15 = class163.field2662[arg0 - var7];
            int var16 = arg2 + var5;
            class174.method1283(7, arg1, var14, var13, var16);
            class174.method1283(7, arg1, var15, var13, var16);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 196)
    public static void method242(byte arg0) {
        field531 = null;
        int var1 = 62 / ((-arg0 - 53) / 55);
        field547 = null;
        field526 = null;
        field540 = null;
        field529 = null;
        field521 = null;
    }
}
