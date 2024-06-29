import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class336 {

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "F")
    public float field5160 = 0.25F;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "F")
    public float field5156 = 1.0F;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "F")
    public float field5159 = 1.0F;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public int field5157;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public int field5151;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public int field5166;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "F")
    public float field5158;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public int field5169;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "F")
    public float field5167;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public int field5150;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "F")
    public float field5164;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Lih;")
    public class143 field5149;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field5148 = -1;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "[I")
    public static int[] field5154 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field5162 = -1;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "F")
    public static float field5153;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "F")
    public static float field5161;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "[[[I")
    public static int[][][] field5155;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IC)Z", line = 19)
    public static final boolean method2317(int arg0, char arg1) {
        if (arg0 != 4659) {
            field5162 = -68;
        }
        field5147++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 106)
    public class336() {
        this.field5157 = class65.field1247;
        this.field5151 = -50;
        this.field5165 = -50;
        this.field5166 = class65.field1238;
        this.field5158 = 1.1523438F;
        this.field5169 = 0;
        this.field5167 = 0.69921875F;
        this.field5150 = -60;
        this.field5164 = 1.2F;
        if (class101.field1776 != null) {
            this.field5149 = class143.method930(class101.field1776[0], class101.field1776[1], class101.field1776[2], class101.field1776[3], class101.field1776[4], class101.field1776[5]);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lag;)V", line = 124)
    public class336(class202 arg0) {
        int var2 = arg0.method1317((byte) -94);
        if ((var2 & 0x1) == 0) {
            this.field5157 = class65.field1247;
        } else {
            this.field5157 = arg0.method1346(83);
        }
        if ((var2 & 0x2) == 0) {
            this.field5158 = 1.1523438F;
        } else {
            this.field5158 = (float) arg0.method1315(14289) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field5167 = 0.69921875F;
        } else {
            this.field5167 = (float) arg0.method1315(14289) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field5164 = 1.2F;
        } else {
            this.field5164 = (float) arg0.method1315(14289) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5150 = -60;
            this.field5165 = -50;
            this.field5151 = -50;
        } else {
            this.field5151 = arg0.method1356(false);
            this.field5150 = arg0.method1356(false);
            this.field5165 = arg0.method1356(false);
        }
        if ((var2 & 0x20) == 0) {
            this.field5166 = class65.field1238;
        } else {
            this.field5166 = arg0.method1346(67);
        }
        if ((var2 & 0x40) == 0) {
            this.field5169 = 0;
        } else {
            this.field5169 = arg0.method1315(14289);
        }
        if ((var2 & 0x80) != 0) {
            this.field5149 = class143.method930(arg0.method1315(14289), arg0.method1315(14289), arg0.method1315(14289), arg0.method1315(14289), arg0.method1315(14289), arg0.method1315(14289));
        } else if (class101.field1776 != null) {
            this.field5149 = class143.method930(class101.field1776[0], class101.field1776[1], class101.field1776[2], class101.field1776[3], class101.field1776[4], class101.field1776[5]);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V", line = 58)
    public static void method2318(byte arg0) {
        if (arg0 >= -112) {
            field5155 = (int[][][]) ((int[][][]) null);
        }
        field5155 = (int[][][]) null;
        field5154 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V", line = 74)
    public static final void method2319(int arg0, byte arg1) {
        class255.field3971.method1883(2047773287, arg0);
        field5163++;
        if (arg1 > -87) {
            method2317(41, 'N');
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILag;)V", line = 88)
    public final void method2320(int arg0, class202 arg1) {
        this.field5159 = (float) (arg1.method1317((byte) -101) * 8) / 255.0F;
        field5152++;
        this.field5160 = (float) (arg1.method1317((byte) -120) * 8) / 255.0F;
        if (arg0 != 0) {
            this.field5158 = 0.5572528F;
        }
        this.field5156 = (float) (arg1.method1317((byte) -118) * 8) / 255.0F;
    }
}
