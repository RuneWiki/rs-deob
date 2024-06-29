import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 extends class130 {

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "Lsd;")
    private static class166 field154 = class135.method935("Loading title screen )2 ", 0);

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "Lsd;")
    private static class166 field165 = class135.method935("Please try using a different world)3", 0);

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "Lsd;")
    public static class166 field141 = field165;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "Lsd;")
    public static class166 field139 = field165;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Lsd;")
    public static class166 field143 = field165;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "Lsd;")
    public static class166 field157 = field154;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "Lsd;")
    public static class166 field155 = field165;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "Lsd;")
    public static class166 field161 = field165;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "Lsd;")
    public static class166 field156 = field165;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "Z")
    public static boolean field163 = false;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public int field166;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "Lqa;")
    public class145 field142;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "Lre;")
    public static class158 field152;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Lef;")
    public class44 field140;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "Lef;")
    public class44 field145;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "[I")
    public int[] field144;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lfg;ZZ)V")
    public static final void method52(class54 arg0, boolean arg1, boolean arg2) {
        field150++;
        int var3 = arg0.field1023;
        int var4 = (int) arg0.field2541;
        arg0.method915(0);
        if (arg2) {
            class34.method244(var3, 0);
        }
        class153.method1032(2071615536, var3);
        class193 var5 = class90.method701(-31355, var4);
        if (var5 != null) {
            class68.method550(var5, 15);
        }
        class192.field3654 = false;
        class160.field3064 = 0;
        class27.method201((byte) -124, class59.field1226, class128.field2510, class154.field2967, class146.field2873);
        if (class146.field2884 != -1) {
            class166.method1120(-65, 1, class146.field2884);
        }
        if (!arg1) {
            field143 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public final void method53(boolean arg0) {
        if (arg0) {
            this.field164 = -17;
        }
        int var2 = this.field160;
        field147++;
        class145 var3 = this.field142.method993(-11016);
        if (var3 == null) {
            this.field144 = null;
            this.field162 = 0;
            this.field160 = -1;
            this.field148 = 0;
            this.field164 = 0;
        } else {
            this.field162 = var3.field2852;
            this.field164 = var3.field2814 * 128;
            this.field160 = var3.field2867;
            this.field144 = var3.field2821;
            this.field148 = var3.field2865;
        }
        if (this.field160 != var2 && this.field145 != null) {
            class11.field206.method1010(this.field145);
            this.field145 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method54(byte arg0) {
        field152 = null;
        field156 = null;
        field157 = null;
        field155 = null;
        if (arg0 <= 8) {
            field143 = null;
        }
        field141 = null;
        field154 = null;
        field143 = null;
        field161 = null;
        field165 = null;
        field139 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method55(int arg0, KeyEvent arg1) {
        field159++;
        int var2 = -53 % ((54 - arg0) / 59);
        int var3 = arg1.getKeyChar();
        if (var3 == 8364) {
            return 128;
        } else {
            if (var3 <= 0 || var3 >= 256) {
                var3 = -1;
            }
            return var3;
        }
    }
}
