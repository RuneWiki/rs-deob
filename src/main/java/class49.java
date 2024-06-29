import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class49 extends class261 {

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    private int field734 = 0;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    private int field738 = 0;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    private int field729 = 20;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    private int field735 = 1365;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "Lve;")
    public static class255 field736 = class87.method607(51, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field737 = 3353893;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "Lve;")
    public static class255 field728 = class87.method607(101, "");

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "Lve;")
    public static class255 field730 = field728;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "Lve;")
    public static class255 field731 = field728;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "Ljava/util/Random;")
    public static Random field732 = new Random();

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "Lve;")
    public static class255 field740 = class87.method607(85, "mem=");

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "[I")
    public static int[] field742 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "Lve;")
    public static class255 field743 = class87.method607(81, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "[I")
    public static int[] field745 = new int[100];

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "[I")
    public static int[] field741 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)[I", line = 6)
    public final int[] method21(byte arg0, int arg1) {
        field739++;
        int var3 = -11 / ((-arg0 - 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            for (int var5 = 0; var5 < class92.field1576; var5++) {
                int var6 = (class20.field324[arg1] << 12) / this.field735 + this.field734;
                int var7 = (class245.field4120[var5] << 12) / this.field735 + this.field738;
                int var8 = var6;
                int var9 = var7;
                int var10 = var7;
                int var11 = var6;
                int var12 = var7 * var7 >> 12;
                int var13 = var6 * var6 >> 12;
                int var14 = 0;
                while (var12 + var13 < 16384 && this.field729 > var14) {
                    var11 = (var10 * var11 >> 12) * 2 + var8;
                    var14++;
                    var10 = var9 + var12 - var13;
                    var12 = var10 * var10 >> 12;
                    var13 = var11 * var11 >> 12;
                }
                var4[var5] = this.field729 - 1 <= var14 ? 0 : (var14 << 12) / this.field729;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V", line = 89)
    public class49() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "(B)V", line = 104)
    public static void method292(byte arg0) {
        field731 = null;
        field736 = null;
        field745 = null;
        field740 = null;
        field743 = null;
        field741 = null;
        field732 = null;
        field742 = null;
        field730 = null;
        field728 = null;
        if (arg0 != 58) {
            field744 = 30;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lpb;BI)V", line = 140)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 >= -115) {
            this.method20((class70) null, (byte) -8, 38);
        }
        if (arg2 == 0) {
            this.field735 = arg0.method423(255);
        } else if (arg2 == 1) {
            this.field729 = arg0.method423(255);
        } else if (arg2 == 2) {
            this.field738 = arg0.method423(255);
        } else if (arg2 == 3) {
            this.field734 = arg0.method423(255);
        }
        field733++;
    }
}
