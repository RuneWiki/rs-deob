import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class112 extends class107 {

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public int field2621 = -1;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public int field2618 = 0;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "Z")
    public boolean field2628 = true;

    @OriginalMember(owner = "client!sd", name = "ob", descriptor = "I")
    public int field2632 = -1;

    @OriginalMember(owner = "client!sd", name = "nb", descriptor = "Lrc;")
    public static class105 field2631 = class43.method374("leuchten1:", 0);

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "Lab;")
    public static class3 field2626 = new class3();

    @OriginalMember(owner = "client!sd", name = "wb", descriptor = "Lrc;")
    public static class105 field2640 = class43.method374("title)3jpg", 0);

    @OriginalMember(owner = "client!sd", name = "xb", descriptor = "[I")
    public static int[] field2641 = new int[128];

    @OriginalMember(owner = "client!sd", name = "yb", descriptor = "I")
    public static int field2642 = 1;

    @OriginalMember(owner = "client!sd", name = "tb", descriptor = "Lrc;")
    public static class105 field2637 = class43.method374(" weitere Optionen", 0);

    @OriginalMember(owner = "client!sd", name = "ub", descriptor = "Lrc;")
    public static class105 field2638 = class43.method374("(U(Y", 0);

    @OriginalMember(owner = "client!sd", name = "zb", descriptor = "I")
    public static int field2643 = 0;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public int field2620;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public int field2622;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!sd", name = "mb", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!sd", name = "pb", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!sd", name = "qb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!sd", name = "rb", descriptor = "I")
    public int field2635;

    @OriginalMember(owner = "client!sd", name = "sb", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!sd", name = "vb", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "[B")
    public static byte[] field2619;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILb;I)V", line = 11)
    private final void method916(int arg0, int arg1, class7 arg2, int arg3) {
        if (arg1 == 1) {
            this.field2618 = arg2.method84(60);
        } else if (arg1 == 2) {
            this.field2632 = arg2.method96(27023);
        } else if (arg1 == 5) {
            this.field2628 = false;
        } else if (arg1 == 7) {
            this.field2621 = arg2.method84(41);
        }
        field2623++;
        if (arg3 != -16000) {
            field2619 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V", line = 46)
    private final void method917(byte arg0, int arg1) {
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field2634++;
        double var7 = var5;
        double var9 = var5;
        if (var5 < var3) {
            var9 = var3;
        }
        double var11 = (double) (arg1 & 0xFF) / 256.0D;
        if (var9 < var11) {
            var9 = var11;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var3 < var5) {
            var7 = var3;
        }
        int var17 = -104 % ((arg0 + 12) / 41);
        if (var7 > var11) {
            var7 = var11;
        }
        double var18 = (var7 + var9) / 2.0D;
        if (var7 != var9) {
            if (var18 < 0.5D) {
                var13 = (var9 - var7) / (var7 + var9);
            }
            if (var5 == var9) {
                var15 = (var3 - var11) / (var9 - var7);
            } else if (var3 == var9) {
                var15 = (var11 - var5) / (-var7 + var9) + 2.0D;
            } else if (var9 == var11) {
                var15 = (var5 - var3) / (var9 - var7) + 4.0D;
            }
            if (var18 >= 0.5D) {
                var13 = (var9 - var7) / (2.0D - var9 - var7);
            }
        }
        this.field2622 = (int) (var13 * 256.0D);
        double var20 = var15 / 6.0D;
        this.field2620 = (int) (var18 * 256.0D);
        if (this.field2620 < 0) {
            this.field2620 = 0;
        } else if (this.field2620 > 255) {
            this.field2620 = 255;
        }
        if (this.field2622 < 0) {
            this.field2622 = 0;
        } else if (this.field2622 > 255) {
            this.field2622 = 255;
        }
        this.field2635 = (int) (var20 * 256.0D);
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V", line = 125)
    public static final void method918(byte arg0) {
        field2625++;
        if (arg0 != -54) {
            field2641 = null;
        }
        for (class42 var1 = (class42) class125.field3052.method31(1280); var1 != null; var1 = (class42) class125.field3052.method26((byte) 108)) {
            if (class73.field1619 != var1.field947 || var1.field948) {
                var1.method551(51);
            } else if (var1.field955 <= class104.field2351) {
                var1.method371(arg0 - 64, class59.field1319);
                if (var1.field948) {
                    var1.method551(88);
                } else {
                    class130.field3161.method509(var1.field947, var1.field943, var1.field946, var1.field963, 60, var1, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V", line = 163)
    public final void method919(boolean arg0) {
        if (this.field2621 != -1) {
            this.method917((byte) 106, this.field2621);
            this.field2617 = this.field2622;
            this.field2629 = this.field2635;
            this.field2633 = this.field2620;
        }
        field2636++;
        this.method917((byte) 72, this.field2618);
        if (!arg0) {
            method918((byte) -108);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILb;B)V", line = 187)
    public final void method920(int arg0, class7 arg1, byte arg2) {
        field2624++;
        while (true) {
            int var4 = arg1.method96(27023);
            if (var4 == 0) {
                int var5 = 119 % ((arg2 - 27) / 33);
                return;
            }
            this.method916(arg0, var4, arg1, -16000);
        }
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)I", line = 207)
    public static final int method921(int arg0) {
        int var1 = class134.method1061(11387, class73.field1619, class113.field2658, class78.field1755);
        field2630++;
        if (arg0 <= 40) {
            method918((byte) -123);
        }
        return var1 - class10.field214 >= 800 || (class57.field1185[class73.field1619][class113.field2658 >> 7][class78.field1755 >> 7] & 0x4) == 0 ? 3 : class73.field1619;
    }

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "(I)V", line = 241)
    public static void method922(int arg0) {
        field2631 = null;
        field2638 = null;
        if (arg0 != -6) {
            method921(-2);
        }
        field2619 = null;
        field2641 = null;
        field2637 = null;
        field2626 = null;
        field2640 = null;
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)V", line = 265)
    public static final void method923(int arg0) {
        field2627++;
        try {
            Graphics var1 = class41.field935.getGraphics();
            class28.field637.method320(0, var1, (byte) -89, 4);
            class81.field1838.method320(0, var1, (byte) -89, 357);
            class130.field3168.method320(722, var1, (byte) -89, 4);
            if (arg0 != 14797) {
                field2643 = 18;
            }
            class9.field154.method320(743, var1, (byte) -89, 205);
            class92.field2134.method320(0, var1, (byte) -89, 0);
            class30.field684.method320(516, var1, (byte) -89, 4);
            class83.field1845.method320(516, var1, (byte) -89, 205);
            class9.field152.method320(496, var1, (byte) -89, 357);
            class105.field2409.method320(0, var1, (byte) -89, 338);
        } catch (Exception var2) {
            class41.field935.repaint();
        }
    }
}
