import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class240 extends class46 {

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field3830 = 5063219;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "[Z")
    public static boolean[] field3831 = new boolean[100];

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field3829 = -1;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "Lql;")
    public static class87 field3835 = new class87();

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "Lpg;")
    public static class320 field3839 = new class320(64);

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public int field3821;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public int field3822;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public int field3824;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "Ltb;")
    public class220 field3834;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "Ltb;")
    public class220 field3838;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "Ljava/lang/String;")
    public String field3823;

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "Z")
    public boolean field3840;

    @OriginalMember(owner = "client!ll", name = "K", descriptor = "[Lqd;")
    public static class252[] field3842;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field3826;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "[[I")
    public static int[][] field3833;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ll;Ll;Z)V", line = 7)
    public static final void method1667(class133 arg0, class133 arg1, boolean arg2) {
        if (!arg2) {
            method1670(-90, 34, -56);
        }
        field3828++;
        class263.field4097 = arg0;
        class190.field2847 = arg1;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 22)
    public static final void method1668(byte arg0) {
        field3820++;
        if (arg0 > 99 && !class19.field259 && class60.field967 != 2) {
            try {
                class3.method16("tbrefresh", class317.field4958, -100);
            } catch (Throwable var2) {
            }
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(Z)V", line = 46)
    public static void method1669(boolean arg0) {
        field3831 = null;
        field3842 = null;
        field3839 = null;
        if (!arg0) {
            method1670(24, 114, -102);
        }
        field3835 = null;
        field3833 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V", line = 72)
    public static final void method1670(int arg0, int arg1, int arg2) {
        field3836++;
        class190 var3 = class320.method2172(arg1, 32370);
        int var4 = var3.field2850;
        int var5 = var3.field2852;
        int var6 = class280.field4307[var5 - var4];
        int var7 = var3.field2848;
        if (arg0 < arg2 || arg0 > var6) {
            arg0 = 0;
        }
        int var8 = var6 << var4;
        class84.method596(var8 & arg0 << var4 | class225.field3589[var7] & ~var8, var7, 95);
    }
}
