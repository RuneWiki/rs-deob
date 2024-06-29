import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class50 extends class273 {

    @OriginalMember(owner = "client!vj", name = "K", descriptor = "Ljh;")
    public static class207 field706 = null;

    @OriginalMember(owner = "client!vj", name = "L", descriptor = "Z")
    public static boolean field707 = false;

    @OriginalMember(owner = "client!vj", name = "M", descriptor = "I")
    public static int field708 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vj", name = "O", descriptor = "I")
    public static int field710 = 0;

    @OriginalMember(owner = "client!vj", name = "J", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!vj", name = "N", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!vj", name = "P", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!vj", name = "Q", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V", line = 18)
    public static final void method342(byte arg0) {
        field709++;
        class277.method1822(4096, field706);
        class207.field3290++;
        if (class152.field2391 && class259.field4032) {
            int var1 = class199.field2985;
            int var2 = var1 - class106.field1624;
            if (class181.field2773 > var2) {
                var2 = class181.field2773;
            }
            int var3 = class107.field1636;
            if ((class181.field2773 + class117.field1809.field3169) < (var2 + field706.field3169)) {
                var2 = class181.field2773 + class117.field1809.field3169 - field706.field3169;
            }
            if (arg0 != 27) {
                field706 = (class207) null;
            }
            int var4 = var3 - class282.field4332;
            int var5 = var2 - class126.field1964;
            if (var4 < class116.field1802) {
                var4 = class116.field1802;
            }
            if (field706.field3239 + var4 > class116.field1802 + class117.field1809.field3239) {
                var4 = class116.field1802 + class117.field1809.field3239 - field706.field3239;
            }
            int var6 = var4 - class181.field2778;
            int var7 = field706.field3242;
            int var8 = var2 + class117.field1809.field3245 - class181.field2773;
            if (field706.field3166 < class207.field3290 && (var7 < var5 || var5 < -var7 || var6 > var7 || (-var7) > var6)) {
                class257.field4000 = true;
            }
            int var9 = var4 + class117.field1809.field3270 - class116.field1802;
            if (field706.field3126 != null && class257.field4000) {
                class120 var10 = new class120();
                var10.field1846 = var9;
                var10.field1843 = var8;
                var10.field1845 = field706;
                var10.field1837 = field706.field3126;
                class122.method834((byte) 61, var10);
            }
            if (class63.field941 == 0) {
                if (class257.field4000) {
                    if (field706.field3198 != null) {
                        class120 var11 = new class120();
                        var11.field1852 = class183.field2803;
                        var11.field1837 = field706.field3198;
                        var11.field1846 = var9;
                        var11.field1843 = var8;
                        var11.field1845 = field706;
                        class122.method834((byte) 45, var11);
                    }
                    if (class183.field2803 != null && client.method892(field706) != null) {
                        class265.field4095.method2064(255, 60);
                        class265.field4095.method2058(class183.field2803.field3250, -21049);
                        class265.field4095.method2044(1247686728, class183.field2803.field3283);
                        class265.field4095.method2012(102, field706.field3250);
                        class265.field4095.method2007(false, field706.field3283);
                        class18.field249++;
                    }
                } else if ((class183.field2797 == 1 || class298.method1959(class168.field2565 - 1, 0)) && class168.field2565 > 2) {
                    class246.method1665((byte) -17);
                } else if (class168.field2565 > 0) {
                    class293.method1912((byte) -76);
                }
                field706 = null;
            }
        } else if (class207.field3290 > 1) {
            field706 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V", line = 139)
    public static void method343(int arg0) {
        if (arg0 != -1) {
            method344(-111, -92);
        }
        field706 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)[I", line = 150)
    public final int[] method331(int arg0, int arg1) {
        field705++;
        if (arg1 != -14650) {
            field712 = 59;
        }
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            class223.method1500(var3, 0, class27.field346, class96.field1473[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V", line = 175)
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)V", line = 179)
    public static final void method344(int arg0, int arg1) {
        if (arg1 == 1) {
            field711++;
            if (arg0 >= 0 && class311.field4934.length > arg0) {
                class311.field4934[arg0] = !class311.field4934[arg0];
            }
        }
    }
}
