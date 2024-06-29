import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class49 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    private int field699 = 0;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    private int field706 = -1;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Llh;")
    private class58 field707 = new class58();

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Z")
    public boolean field710 = false;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    private int field709;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    private int field700;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[[I")
    private int[][] field703;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "[Ljd;")
    private class244[] field704;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[I")
    public final int[] method302(int arg0, int arg1) {
        field708++;
        if (arg1 > -104) {
            method303(-90, -71);
        }
        if (this.field709 == this.field700) {
            this.field710 = this.field704[arg0] == null;
            this.field704[arg0] = class183.field2775;
            return this.field703[arg0];
        } else if (this.field709 == 1) {
            this.field710 = this.field706 != arg0;
            this.field706 = arg0;
            return this.field703[0];
        } else {
            class244 var3 = this.field704[arg0];
            if (var3 == null) {
                this.field710 = true;
                if (this.field709 > this.field699) {
                    var3 = new class244(arg0, this.field699);
                    this.field699++;
                } else {
                    class244 var4 = (class244) this.field707.method363(128);
                    var3 = new class244(arg0, var4.field3831);
                    this.field704[var4.field3832] = null;
                    var4.method962(128);
                }
                this.field704[arg0] = var3;
            } else {
                this.field710 = false;
            }
            this.field707.method368((byte) -49, var3);
            return this.field703[var3.field3831];
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)Z")
    public static final boolean method303(int arg0, int arg1) {
        if (arg0 < 39) {
            return false;
        } else {
            field702++;
            return (-arg1 & arg1) == arg1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lim;IIIIIIZ)V")
    public static final void method304(class178 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (!arg7) {
            return;
        }
        field705++;
        int var8 = arg1 * arg1 + arg2 * arg2;
        if (var8 > arg4) {
            return;
        }
        int var9 = Math.min(arg0.field2529 / 2, arg0.field2571 / 2);
        if (var8 <= var9 * var9) {
            class247.method1614(arg1, class21.field342[arg6], arg2, arg3, arg0, 2, arg5);
            return;
        }
        var9 -= 10;
        int var10;
        if (class12.field203 == 4) {
            var10 = (int) class123.field1743 & 0x7FF;
        } else {
            var10 = (int) class123.field1743 + class179.field2712 & 0x7FF;
        }
        int var11 = class118.field1697[var10];
        int var12 = class118.field1690[var10];
        if (class12.field203 != 4) {
            var12 = var12 * 256 / (class42.field627 + 256);
            var11 = var11 * 256 / (class42.field627 + 256);
        }
        int var13 = arg1 * var11 + arg2 * var12 >> 16;
        int var14 = arg1 * var12 - (arg2 * var11) >> 16;
        double var15 = Math.atan2((double) var13, (double) var14);
        int var17 = (int) ((double) var9 * Math.sin(var15));
        int var18 = (int) ((double) var9 * Math.cos(var15));
        ((class203) class166.field2357[arg6]).method1263(arg0.field2529 / 2 + var17 + arg3 - 10, arg0.field2571 / 2 + -var18 + -10 + arg5, 20, 20, 15, 15, var15, 256);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public final void method305(int arg0) {
        if (arg0 > -91) {
            this.method305(127);
        }
        for (int var2 = 0; var2 < this.field709; var2++) {
            this.field703[var2] = null;
        }
        field701++;
        this.field703 = null;
        this.field704 = null;
        this.field707.method365((byte) -45);
        this.field707 = null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)[[I")
    public final int[][] method306(int arg0) {
        field698++;
        if (this.field709 != this.field700) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field709; var2++) {
            this.field704[var2] = class183.field2775;
        }
        return this.field703;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(III)V")
    public class49(int arg0, int arg1, int arg2) {
        this.field709 = arg0;
        this.field700 = arg1;
        this.field703 = new int[this.field709][arg2];
        this.field704 = new class244[this.field700];
    }
}
