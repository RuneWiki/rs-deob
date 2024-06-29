import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class467 extends class260 {

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    private int field6726;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    private int field6737;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    private int field6728;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    private int field6738;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "I")
    private int field6733;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    private int field6734;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "I")
    private int field6729;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "I")
    private int field6724;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "Liu;")
    public static class517 field6725 = new class517(42, 4);

    @OriginalMember(owner = "client!os", name = "x", descriptor = "Liu;")
    public static class517 field6739 = new class517(58, 1);

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZII)V")
    public final void method33(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            ++field6731;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
    public final void method30(int arg0, int arg1, int arg2) {
        ++field6735;
        int var4 = this.field6734 * arg0 >> 12;
        int var5 = this.field6729 * arg1 >> 12;
        int var6 = this.field6737 * arg0 >> 12;
        int var7 = this.field6728 * arg1 >> 12;
        int var8 = this.field6726 * arg0 >> 12;
        int var9 = this.field6738 * arg1 >> 12;
        if (arg2 != 0) {
            this.field6726 = 69;
        }
        int var10 = this.field6724 * arg0 >> 12;
        int var11 = this.field6733 * arg1 >> 12;
        class548.method3070(var5, var7, var8, var6, var11, var9, var4, var10, super.field3783, true);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)I")
    public static final int method2715(byte arg0) {
        ++field6730;
        if ((double) class212.field3108 == 3.0D) {
            return 37;
        } else if ((double) class212.field3108 == 4.0D) {
            return 50;
        } else if ((double) class212.field3108 == 6.0D) {
            return 75;
        } else if ((double) class212.field3108 == 8.0D) {
            return 100;
        } else {
            int var1 = 47 / ((arg0 - -62) / 62);
            return 200;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field6726 = arg4;
        this.field6737 = arg2;
        this.field6728 = arg3;
        this.field6738 = arg5;
        this.field6733 = arg7;
        this.field6734 = arg0;
        this.field6729 = arg1;
        this.field6724 = arg6;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI)V")
    public final void method32(int arg0, byte arg1, int arg2) {
        ++field6727;
        if (arg1 <= 6) {
            field6725 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "c", descriptor = "(Z)[Liu;")
    public static final class517[] method2716(boolean arg0) {
        ++field6736;
        if (arg0) {
            method2717(6, -5);
        }
        return new class517[] { class88.field1593, class219.field3294, class79.field1431, class584.field8325, class444.field6484, class321.field4651, class23.field323, class328.field4734, class417.field6139, class10.field112, class230.field3404, class528.field7351, class1.field3, class112.field1864, class206.field2904, class121.field1949, class121.field1947, class308.field4467, class258.field3754, class489.field6883, class614.field8709, class264.field3842, class299.field4329, class230.field3406, class608.field8644, class155.field2339, class294.field4253, class642.field9331, class432.field6309, class413.field6117, class92.field1636, class551.field7814, class442.field6462, class280.field4090, class555.field7856, class597.field8495, class586.field8356, class223.field3352, class464.field6702, class602.field8568, class437.field6383, class218.field3285, field6725, class426.field6226, class483.field6847, class88.field1592, class167.field2444, class234.field3445, class611.field8686, class294.field4240, class604.field8604, class587.field8366, class644.field9381, class258.field3750, class646.field9386, class266.field3883, class181.field2618, class2.field19, field6739, class389.field5809, class338.field4856, class241.field3502, class407.field6044, class336.field4805, class163.field2422, class325.field4682, class21.field303, class488.field6874, class644.field9378, class388.field5794, class242.field3516, class586.field8353, class204.field2883, class402.field6006, class361.field5135, class5.field46, class82.field1454, class167.field2447, class158.field2369, class159.field2375, class324.field4671, class65.field923, class167.field2445, class522.field7249, class606.field8626, class534.field7459, class382.field5683, class527.field7329, class646.field9384, class355.field5078, class600.field8516, class252.field3683, class167.field2434, class111.field1842, class227.field3388, class215.field3247, class566.field8092, class525.field7293, class536.field7481, class278.field4072, class259.field3774, class623.field8787, class50.field749, class387.field5758, client.field8782, class471.field6772, class54.field775, class440.field6421, class624.field8806, class457.field6591, class410.field6092, class590.field8385, class377.field5535, class498.field6974 };
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)V")
    public static final void method2717(int arg0, int arg1) {
        ++field6732;
        class395 var2 = class557.field7878;
        synchronized (class557.field7878) {
            int var3 = 40 / ((47 - arg1) / 52);
            class557.field7878.method2397(arg0, (byte) -60);
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public static void method2718(int arg0) {
        field6725 = null;
        if (arg0 != -473328628) {
            method2718(33);
        }
        field6739 = null;
    }
}
