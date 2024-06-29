import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class121 extends class366 {

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lsd;")
    public static class74 field1499 = new class74(92, 6);

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field1506 = 0;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "F")
    public static float field1507;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BII)V")
    public final void method375(byte arg0, int arg1, int arg2) {
        if (arg0 <= 44) {
            field1506 = -13;
        }
        ++field1497;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1503 = arg1;
        this.field1496 = arg0;
        this.field1501 = arg5;
        this.field1500 = arg6;
        this.field1502 = arg4;
        this.field1504 = arg2;
        this.field1495 = arg7;
        this.field1508 = arg3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZ)V")
    public final void method370(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field1498;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static void method584(int arg0) {
        field1499 = null;
        if (arg0 != 27399) {
            method584(-8);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZII)V")
    public final void method374(boolean arg0, int arg1, int arg2) {
        ++field1494;
        int var4 = this.field1496 * arg2 >> 12;
        int var5 = this.field1503 * arg1 >> 12;
        int var6 = this.field1504 * arg2 >> 12;
        int var7 = this.field1508 * arg1 >> 12;
        int var8 = this.field1502 * arg2 >> 12;
        if (arg0) {
            this.field1501 = -3;
        }
        int var9 = this.field1501 * arg1 >> 12;
        int var10 = this.field1500 * arg2 >> 12;
        int var11 = this.field1495 * arg1 >> 12;
        class430.method2578(-46, var8, var10, var4, var6, var5, var11, super.field5241, var7, var9);
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
    public static final int method585(int arg0) {
        ++field1505;
        class280 var1 = class231.field3205;
        boolean var2 = false;
        if (class375.field5347 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class280.method1757(0, 0, (class355) null, (class394) null, 0, var3);
        }
        long var4 = class434.method2591(-19310);
        for (int var6 = 0; ~var6 > -10001; ++var6) {
            var1.method1338(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = 1 % ((-51 - arg0) / 56);
        int var8 = (int) (-var4 + class434.method2591(-19310));
        var1.method1759(-6923, 100, 100, 0, -16777216, 0);
        if (var2) {
            var1.method1754(1);
        }
        return var8;
    }
}
