import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class166 extends class287 {

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public int field2725 = 0;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "[I")
    public static int[] field2733 = new int[2000];

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "S")
    public static short field2737 = 256;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field2736 = new String[200];

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public int field2714;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public int field2717;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public int field2720;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public int field2723;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    public int field2728;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public int field2732;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public int field2738;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    public int field2739;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "Lmm;")
    public class121 field2735;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Lud;")
    public class17 field2721;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "Lud;")
    public class17 field2729;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "Lnm;")
    public class212 field2719;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Lql;")
    public class337 field2718;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Z")
    public static boolean field2716;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Z")
    public boolean field2722;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[I")
    public int[] field2727;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V", line = 13)
    public final void method1246(boolean arg0) {
        field2724++;
        if (arg0) {
            this.field2713 = -16;
        }
        int var2 = this.field2740;
        if (this.field2735 != null) {
            class121 var3 = this.field2735.method878((byte) 62);
            if (var3 == null) {
                this.field2732 = 0;
                this.field2740 = -1;
                this.field2720 = 0;
                this.field2713 = 0;
                this.field2727 = null;
                this.field2738 = 0;
            } else {
                this.field2713 = var3.field1684;
                this.field2727 = var3.field1731;
                this.field2732 = var3.field1740;
                this.field2720 = var3.field1752 * 128;
                this.field2738 = var3.field1729;
                this.field2740 = var3.field1688;
            }
        } else if (this.field2719 != null) {
            int var4 = class213.method1549(this.field2719, 47);
            if (var2 != var4) {
                this.field2740 = var4;
                class161 var5 = this.field2719.field3346;
                if (var5.field2585 != null) {
                    var5 = var5.method1192(-1);
                }
                if (var5 == null) {
                    this.field2738 = this.field2720 = 0;
                } else {
                    this.field2720 = var5.field2593 * 128;
                    this.field2738 = var5.field2605;
                }
            }
        } else if (this.field2718 != null) {
            this.field2740 = method1247((byte) -68, this.field2718);
            this.field2738 = this.field2718.field5267;
            this.field2720 = this.field2718.field5262 * 128;
        }
        if (this.field2740 != var2 && this.field2721 != null) {
            class86.field1174.method1313(this.field2721);
            this.field2721 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLql;)I", line = 95)
    public static final int method1247(byte arg0, class337 arg1) {
        field2730++;
        if (arg0 > -37) {
            return 52;
        }
        int var2 = arg1.field5250;
        class107 var3 = arg1.method2100(2000117776);
        if (arg1.field4724 == var3.field1451) {
            var2 = arg1.field5271;
        } else if (arg1.field4724 == var3.field1420 || arg1.field4724 == var3.field1431 || arg1.field4724 == var3.field1446 || arg1.field4724 == var3.field1408) {
            var2 = arg1.field5251;
        } else if (arg1.field4724 == var3.field1415 || arg1.field4724 == var3.field1427 || arg1.field4724 == var3.field1435 || arg1.field4724 == var3.field1409) {
            var2 = arg1.field5274;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 135)
    public static void method1248(int arg0) {
        field2736 = null;
        field2733 = null;
        if (arg0 != 0) {
            field2715 = -29;
        }
    }
}
