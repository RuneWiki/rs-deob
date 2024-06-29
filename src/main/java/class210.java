import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class210 extends class243 {

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    private int field2742;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    private int field2740;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    private int field2745;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    private int field2743;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2741 = new Rectangle[100];

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "Lkr;")
    public static class602 field2747;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field2746;

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field2741[var0] = new Rectangle();
        }
        field2747 = new class602(75, -1);
        field2748 = 0;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(IIIIIII)V", line = 4)
    public class210(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2742 = arg0;
        this.field2740 = arg3;
        this.field2745 = arg1;
        this.field2743 = arg2;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1249(int arg0) {
        class486.field6806 = -1;
        ++field2746;
        class171.field2378 = -1;
        class728.field10131 = 0;
        if (arg0 != 1728073164) {
            method1249(79);
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 31)
    public static final void method1250(int arg0) {
        class685.method3859(21538);
        ++field2744;
        if (arg0 != -25369) {
            method1252();
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)V", line = 42)
    public static void method1251(byte arg0) {
        field2747 = null;
        int var1 = -126 / ((arg0 - -53) / 45);
        field2741 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB)V", line = 54)
    public final void method87(int arg0, int arg1, byte arg2) {
        ++field2737;
        int var4 = this.field2742 * arg1 >> 12;
        int var5 = this.field2743 * arg1 >> 12;
        int var6 = this.field2745 * arg0 >> 12;
        if (arg2 < 92) {
            this.method92(75, -118, 63);
        }
        int var7 = this.field2740 * arg0 >> 12;
        class332.method2126(super.field3607, var5, var6, (byte) 77, var7, super.field3614, var4, super.field3610);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)V", line = 78)
    public final void method90(int arg0, int arg1, int arg2) {
        ++field2739;
        int var4 = this.field2742 * arg0 >> 12;
        int var5 = this.field2743 * arg0 >> 12;
        int var6 = this.field2745 * arg1 >> 12;
        if (arg2 != 10893) {
            method1250(52);
        }
        int var7 = this.field2740 * arg1 >> 12;
        class265.method1812(var6, var7, super.field3614, var4, (byte) 51, var5);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(III)V", line = 111)
    public final void method92(int arg0, int arg1, int arg2) {
        ++field2738;
        int var4 = 89 / ((arg1 - -20) / 33);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()V", line = 123)
    public static final void method1252() {
        for (int var0 = class259.field3750; var0 < class370.field5229; ++var0) {
            for (int var1 = 0; var1 < class61.field877; ++var1) {
                for (int var2 = 0; var2 < class713.field9959; ++var2) {
                    class262 var3 = class137.field1948[var0][var1][var2];
                    if (var3 != null) {
                        class91 var4 = var3.field3845;
                        class91 var5 = var3.field3842;
                        if (var4 != null && var4.method642((byte) 2)) {
                            class273.method1834(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method642((byte) 2)) {
                                class273.method1834(var5, var0, var1, var2, 1, 1);
                                var5.method648((byte) -65, class441.field6132, false, 0, var4, 0, 0);
                                var5.method641(116);
                            }
                            var4.method641(105);
                        }
                        for (class638 var6 = var3.field3846; var6 != null; var6 = var6.field8564) {
                            class395 var8 = var6.field8567;
                            if (var8 != null && var8.method642((byte) 2)) {
                                class273.method1834(var8, var0, var1, var2, var8.field5683 - var8.field5680 + 1, var8.field5679 - var8.field5673 + 1);
                                var8.method641(112);
                            }
                        }
                        class441 var7 = var3.field3844;
                        if (var7 != null && var7.method642((byte) 2)) {
                            class709.method3993(var7, var0, var1, var2);
                            var7.method641(118);
                        }
                    }
                }
            }
        }
    }
}
