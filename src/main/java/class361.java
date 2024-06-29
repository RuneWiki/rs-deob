import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class361 {

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Z")
    public boolean field5143 = true;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field5145 = -1;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    private int field5157 = 0;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public int field5156 = 128;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "[I")
    public static int[] field5140 = new int[1000];

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field5152 = "M";

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field5151 = -1;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field5154 = 0;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field5142;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public int field5144;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field5146;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field5155;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Ldp;")
    public static class174 field5141;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lec;III)V")
    private final void method2313(class37 arg0, int arg1, int arg2, int arg3) {
        field5147++;
        if (arg3 == 1) {
            this.field5157 = arg0.method295(true);
            this.method2314(21012, this.field5157);
        } else if (arg3 == 2) {
            this.field5145 = arg0.method320((byte) -87);
            if (this.field5145 == 65535) {
                this.field5145 = -1;
            }
        } else if (arg3 == 3) {
            this.field5156 = arg0.method320((byte) -87);
        } else if (arg3 == 4) {
            this.field5143 = false;
        }
        if (arg1 != 12666) {
            this.method2314(18, -49);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    private final void method2314(int arg0, int arg1) {
        field5149++;
        double var3 = (double) ((arg1 & 0xFF5155) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFF2) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (arg0 != 21012) {
            return;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
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
        this.field5155 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field5146 = (int) (var17 * 256.0D);
        if (var17 > 0.5D) {
            this.field5142 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5142 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field5146 < 0) {
            this.field5146 = 0;
        } else if (this.field5146 > 255) {
            this.field5146 = 255;
        }
        if (this.field5155 < 0) {
            this.field5155 = 0;
        } else if (this.field5155 > 255) {
            this.field5155 = 255;
        }
        if (this.field5142 < 1) {
            this.field5142 = 1;
        }
        this.field5144 = (int) ((double) this.field5142 * var19);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method2315(boolean arg0) {
        field5152 = null;
        if (arg0) {
            method2315(true);
        }
        field5140 = null;
        field5141 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILec;I)V")
    public final void method2316(int arg0, class37 arg1, int arg2) {
        if (arg0 < 89) {
            this.field5155 = 50;
        }
        field5150++;
        while (true) {
            int var4 = arg1.method271((byte) 114);
            if (var4 == 0) {
                return;
            }
            this.method2313(arg1, 12666, arg2, var4);
        }
    }
}
