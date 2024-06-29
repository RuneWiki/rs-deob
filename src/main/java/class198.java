import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class198 {

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2815 = "yellow:";

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Z")
    public static boolean field2820 = false;

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "Lik;")
    public static class410 field2827 = new class410(4);

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public int field2824;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "[B")
    public byte[] field2822;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "[B")
    public byte[] field2825;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
    public static void method1399(int arg0) {
        field2815 = null;
        field2827 = null;
        int var1 = 73 % ((63 - arg0) / 48);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BIIII)V")
    public static final void method1400(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field2818++;
        if (arg0 != -60) {
            method1400((byte) -60, 58, -82, -106, -104);
        }
        for (int var5 = 0; var5 < class352.field4817; var5++) {
            Rectangle var6 = class395.field5530[var5];
            if (arg3 < (var6.x + var6.width) && arg2 + arg3 > var6.x && var6.y + var6.height > arg4 && (arg1 + arg4) > var6.y) {
                class199.field2844[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
    public static final void method1401(int arg0) {
        if (class304.field4121.toLowerCase().indexOf("microsoft") == -1) {
            if (class304.field4128 == null) {
                class241.field3332[192] = 58;
                class241.field3332[222] = 59;
            } else {
                class241.field3332[222] = 58;
                class241.field3332[520] = 59;
                class241.field3332[192] = 28;
            }
            class241.field3332[59] = 57;
            class241.field3332[61] = 27;
            class241.field3332[46] = 72;
            class241.field3332[93] = 43;
            class241.field3332[45] = 26;
            class241.field3332[44] = 71;
            class241.field3332[92] = 74;
            class241.field3332[91] = 42;
            class241.field3332[47] = 73;
        } else {
            class241.field3332[191] = 73;
            class241.field3332[220] = 74;
            class241.field3332[189] = 26;
            class241.field3332[219] = 42;
            class241.field3332[186] = 57;
            class241.field3332[223] = 28;
            class241.field3332[222] = 59;
            class241.field3332[190] = 72;
            class241.field3332[188] = 71;
            class241.field3332[221] = 43;
            class241.field3332[187] = 27;
            class241.field3332[192] = 58;
        }
        int var1 = -39 % ((-arg0 - 43) / 53);
        field2817++;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)I")
    public static final int method1402(int arg0) {
        field2826++;
        if ((double) class99.field1420 == 3.0D) {
            return 37;
        } else if ((double) class99.field1420 == 4.0D) {
            return 50;
        } else if ((double) class99.field1420 == 6.0D) {
            return 75;
        } else if (arg0 == 45) {
            return (double) class99.field1420 == 8.0D ? 100 : 200;
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BIII)V")
    public static final void method1403(byte arg0, int arg1, int arg2, int arg3) {
        field2814++;
        int var4 = 72 % ((-arg0 - 44) / 59);
        String var5 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg3 >> 6) + "," + (arg2 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var5);
        class368.method2297(true, var5, (byte) 58);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I")
    public static final int method1404(int arg0, int arg1) {
        if (class105.field1540 != null) {
            class105.field1540.method2736(5000);
            class105.field1540 = null;
        }
        field2821++;
        class338.field4594++;
        if (class338.field4594 > 4) {
            class257.field3472 = 0;
            class338.field4594 = 0;
            return arg1;
        }
        class257.field3472 = 0;
        if (class229.field3189 == class124.field1736) {
            class124.field1736 = class401.field5601;
        } else {
            class124.field1736 = class229.field3189;
        }
        if (arg0 != 28468) {
            field2820 = false;
        }
        return -1;
    }
}
