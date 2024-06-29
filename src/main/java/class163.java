import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public abstract class class163 extends class134 {

    @OriginalMember(owner = "client!ada", name = "A", descriptor = "I")
    private int field1826;

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "F")
    public float field1814;

    @OriginalMember(owner = "client!ada", name = "x", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!ada", name = "w", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
    private int field1810;

    @OriginalMember(owner = "client!ada", name = "u", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "Ldh;")
    public static class320 field1815 = new class320(60, 1);

    @OriginalMember(owner = "client!ada", name = "y", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1824 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ada", name = "r", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ada", name = "s", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ada", name = "t", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ada", name = "v", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ada", name = "B", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ada", name = "z", descriptor = "[Lhu;")
    public static class131[] field1825;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)I", line = 5)
    public final int method1006(int arg0) {
        if (arg0 != 31079) {
            method1008(96);
        }
        field1818++;
        return this.field1822;
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)I", line = 20)
    public final int method1007(int arg0) {
        field1821++;
        int var2 = -17 / ((arg0 + 54) / 46);
        return this.field1810;
    }

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "(I)V", line = 30)
    public static void method1008(int arg0) {
        field1815 = null;
        if (arg0 <= 74) {
            field1824 = null;
        }
        field1825 = null;
        field1824 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "()V", line = 44)
    public static final void method1009() {
        byte var0 = 10;
        byte var1 = 30;
        if (class682.field9652 == 0 || class254.field3055 == null) {
            return;
        }
        class563.field8026.method354(class179.field2102);
        for (int var2 = 0; var2 < class394.field5413.length; var2++) {
            class563.field8026.method412(class439.field6376[var2] + class394.field5413[var2], class179.field2102[1], -256, 19154, class179.field2102[3] - class179.field2102[1]);
        }
        for (int var3 = 0; var3 < class738.field10311; var3++) {
            class464 var11 = class228.field2600[var3];
            class563.field8026.method333(var11.field6627[0], var11.field6625[0], var11.field6635[0], class606.field8613);
            class563.field8026.method333(var11.field6627[1], var11.field6625[1], var11.field6635[1], class435.field6348);
            class563.field8026.method333(var11.field6627[2], var11.field6625[2], var11.field6635[2], class619.field8856);
            class563.field8026.method333(var11.field6627[3], var11.field6625[3], var11.field6635[3], class345.field4477);
            if (class606.field8613[2] != -1 && class435.field6348[2] != -1 && class619.field8856[2] != -1 && class345.field4477[2] != -1) {
                int var12 = -65536;
                if (var11.field6629 == 4) {
                    var12 = -16776961;
                }
                class563.field8026.method397(class606.field8613[0], (byte) -127, class435.field6348[1], class606.field8613[1], var12, class435.field6348[0]);
                class563.field8026.method397(class435.field6348[0], (byte) 65, class619.field8856[1], class435.field6348[1], var12, class619.field8856[0]);
                class563.field8026.method397(class619.field8856[0], (byte) 12, class345.field4477[1], class619.field8856[1], var12, class345.field4477[0]);
                class563.field8026.method397(class345.field4477[0], (byte) 121, class606.field8613[1], class345.field4477[1], var12, class606.field8613[0]);
                class563.field8026.method397(class606.field8613[0], (byte) 63, class619.field8856[1], class606.field8613[1], var12, class619.field8856[0]);
            }
        }
        class254.field3055.method442(var0, -16777216, var1 + 45, -256, "Dynamic: " + class485.field6894 + "/" + 5000, 0);
        class254.field3055.method442(var0, -16777216, var1 + 60, -256, "Total Opaque Onscreen: " + class479.field6842 + "/" + 10000, 0);
        class254.field3055.method442(var0, -16777216, var1 + 75, -256, "Total Trans Onscreen: " + class211.field2489 + "/" + 5000, 0);
        class254.field3055.method442(var0, -16777216, var1 + 90, -256, "Occluders: " + (class410.field5607 + class122.field1285) + " Active: " + class738.field10311, 0);
        class254.field3055.method442(var0, -16777216, var1 + 105, -256, "Occluded: Ground:" + class106.field1115 + " Walls: " + class540.field7779 + " CPs: " + class223.field2557 + " Pixels: " + class542.field7803, 0);
        class254.field3055.method442(var0, -16777216, var1 + 120, -256, "Occlude Calc Took: " + class68.field693 / 1000L + "us", 0);
        if (class682.field9652 != 2 || class707.field9970 == null) {
            return;
        }
        for (int var4 = 0; var4 < class707.field9970.length; var4++) {
            float var6 = (float) class707.field9970[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class707.field9970[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class131 var5 = class563.field8026.method430(class647.field9249, -108, class707.field9970, class244.field2887, class244.field2887, 0);
        var5.method512(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "(I)I", line = 127)
    public final int method1010(int arg0) {
        if (arg0 != -5636) {
            field1815 = null;
        }
        field1813++;
        return this.field1826;
    }

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "(I)F", line = 151)
    public final float method1011(int arg0) {
        if (arg0 != 24617) {
            this.field1822 = -88;
        }
        field1812++;
        return this.field1814;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)I", line = 166)
    public final int method1012(byte arg0) {
        if (arg0 == 127) {
            field1809++;
            return this.field1820;
        } else {
            return -52;
        }
    }

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "(I)I", line = 178)
    public final int method1013(int arg0) {
        if (arg0 != 9179409) {
            this.method1012((byte) -21);
        }
        field1811++;
        return this.field1823;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(IIIIIF)V", line = 189)
    public class163(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field1826 = arg4;
        this.field1814 = arg5;
        this.field1823 = arg2;
        this.field1822 = arg1;
        this.field1810 = arg3;
        this.field1820 = arg0;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IF)V")
    public abstract void method799(int arg0, float arg1);

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(BIII)V")
    public abstract void method801(byte arg0, int arg1, int arg2, int arg3);
}
