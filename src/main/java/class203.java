import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class203 {

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lkk;")
    public class248 field3136;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[I")
    public static int[] field3127 = new int[2];

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field3132 = 0;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field3134 = 0;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[[[I")
    public static int[][][] field3133;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static final void method1428(int arg0) {
        while (true) {
            if (class183.field2900.method1766(class95.field1528, (byte) 83) >= 11) {
                int var1 = class183.field2900.method1765(11, (byte) -116);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class233.field3682[var1] == null) {
                        class233.field3682[var1] = new class136();
                        var2 = true;
                        if (class98.field1575[var1] != null) {
                            class233.field3682[var1].method1011((byte) -33, class98.field1575[var1]);
                        }
                    }
                    class26.field455[class259.field4112++] = var1;
                    class136 var3 = class233.field3682[var1];
                    var3.field4761 = class41.field686;
                    int var4 = class183.field2900.method1765(5, (byte) 9);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class156.field2334[class183.field2900.method1765(3, (byte) -119)];
                    if (var2) {
                        var3.field4696 = var3.field4719 = var5;
                    }
                    int var6 = class183.field2900.method1765(5, (byte) 34);
                    int var7 = class183.field2900.method1765(1, (byte) -119);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var7 == 1) {
                        class147.field2179[class122.field1840++] = var1;
                    }
                    int var8 = class183.field2900.method1765(1, (byte) 125);
                    var3.method1014(class263.field4168.field4673[0] + var6, (byte) 88, var8 == 1, class263.field4168.field4749[0] + var4);
                    continue;
                }
            }
            if (arg0 != -2) {
                return;
            }
            field3137++;
            class183.field2900.method1769(arg0 ^ 0x7);
            return;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBII)V")
    public static final void method1429(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (class184.field2914 <= arg2 && arg0 <= class2.field42 && class112.field1727 <= arg1 && class278.field4410 >= arg4) {
            class268.method1813(arg0, arg1, arg2, arg4, 9967, arg5);
        } else {
            class201.method1420((byte) -113, arg4, arg5, arg1, arg0, arg2);
        }
        int var6 = 76 / ((-arg3 - 53) / 63);
        field3128++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBII)V")
    public static final void method1430(int arg0, byte arg1, int arg2, int arg3) {
        field3126++;
        int var4 = -9 / ((arg1 + 9) / 41);
        String var5 = "::tele " + arg2 + "," + (arg3 >> 6) + "," + (arg0 >> 6) + "," + (arg3 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var5);
        class277.method1890((byte) 109, var5);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method1431(byte arg0) {
        int var1 = 7 % ((arg0 - 34) / 56);
        field3133 = null;
        field3127 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)V")
    public static final void method1432(int arg0, int arg1) {
        field3135++;
        class255 var2 = class240.field3813;
        synchronized (class240.field3813) {
            class160.field2408 = arg0;
            if (arg1 != -16) {
                method1429(4, 74, -93, (byte) 49, -15, -118);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V")
    public class203(int arg0, int arg1) {
        this.field3136 = class213.method1474(true, arg0);
        this.field3129 = arg1;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lkk;I)V")
    public class203(class248 arg0, int arg1) {
        this.field3136 = arg0;
        this.field3129 = arg1;
    }
}
