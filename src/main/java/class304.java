import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class304 {

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Z")
    public boolean field4626 = true;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    private int field4630 = 0;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public int field4636 = -1;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "I")
    public int field4637 = 128;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field4624 = 3353893;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field4625 = 0;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field4634 = 0;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field4641 = 0;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "[[B")
    public static byte[][] field4631;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2104(int arg0) {
        Container var1;
        if (class90.field1344 != null) {
            var1 = class90.field1344;
        } else if (class106.field1661 == null) {
            var1 = class274.field4200.field3963;
        } else {
            var1 = class106.field1661;
        }
        field4629++;
        class13.field152 = var1.getSize().width;
        class40.field480 = var1.getSize().height;
        if (class106.field1661 == var1) {
            Insets var2 = class106.field1661.getInsets();
            class40.field480 -= var2.top + var2.bottom;
            class13.field152 -= var2.right + var2.left;
        }
        if (class48.method329((byte) 81) < 2) {
            class251.field3747 = 503;
            class136.field2071 = 765;
            class147.field2210 = (class13.field152 - 765) / 2;
            class301.field4604 = 0;
        } else {
            class147.field2210 = 0;
            class136.field2071 = class13.field152;
            class251.field3747 = class40.field480;
            class301.field4604 = 0;
        }
        if (class117.field1817) {
            class117.method832(class136.field2071, class251.field3747);
        }
        class315.field4764.setSize(class136.field2071, class251.field3747);
        int var3 = 124 / ((37 - arg0) / 51);
        if (class106.field1661 == var1) {
            Insets var4 = class106.field1661.getInsets();
            class315.field4764.setLocation(var4.left + class147.field2210, class301.field4604 + var4.top);
        } else {
            class315.field4764.setLocation(class147.field2210, class301.field4604);
        }
        if (class123.field1926 != -1) {
            class136.method995(true, 31456);
        }
        class281.method1964(-19123);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 81)
    public static void method2105(int arg0) {
        field4631 = (byte[][]) null;
        if (arg0 != 765) {
            field4633 = 11;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)V", line = 100)
    private final void method2106(int arg0, byte arg1) {
        field4642++;
        double var3 = (double) ((arg0 & 0xFF4327) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF9C) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var11 < var7) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field4627 = (int) (var15 * 256.0D);
        if (this.field4627 < 0) {
            this.field4627 = 0;
        } else if (this.field4627 > 255) {
            this.field4627 = 255;
        }
        if (var17 > 0.5D) {
            this.field4632 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4632 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4632 < 1) {
            this.field4632 = 1;
        }
        this.field4639 = (int) (var17 * 256.0D);
        if (arg1 > -96) {
            this.method2107(39, (class263) null, 65);
        }
        this.field4635 = (int) ((double) this.field4632 * var19);
        if (this.field4639 < 0) {
            this.field4639 = 0;
        } else if (this.field4639 > 255) {
            this.field4639 = 255;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILre;I)V", line = 214)
    public final void method2107(int arg0, class263 arg1, int arg2) {
        field4640++;
        if (arg0 != -15296) {
            field4641 = 105;
        }
        while (true) {
            int var4 = arg1.method1787(false);
            if (var4 == 0) {
                return;
            }
            this.method2108(765, arg2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIILre;)V", line = 243)
    private final void method2108(int arg0, int arg1, int arg2, class263 arg3) {
        if (arg2 == 1) {
            this.field4630 = arg3.method1824(false);
            this.method2106(this.field4630, (byte) -123);
        } else if (arg2 == 2) {
            this.field4636 = arg3.method1830((byte) -77);
            if (this.field4636 == 65535) {
                this.field4636 = -1;
            }
        } else if (arg2 == 3) {
            this.field4637 = arg3.method1830((byte) -77);
        } else if (arg2 == 4) {
            this.field4626 = false;
        }
        field4638++;
        if (arg0 != 765) {
            field4641 = 89;
        }
    }
}
