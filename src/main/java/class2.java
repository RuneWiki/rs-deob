import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 extends class222 {

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Lsb;")
    private static class98 field16 = class47.method368("Feb", 0);

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lsb;")
    private static class98 field19 = class47.method368("Apr", 0);

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "Lsb;")
    private static class98 field28 = class47.method368("Jun", 0);

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
    public static int field30 = 0;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "Lsb;")
    private static class98 field25 = class47.method368("May", 0);

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "Lsb;")
    public static class98 field29 = class47.method368("<col=c0ff00>", 0);

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "Lsb;")
    private static class98 field23 = class47.method368("Sep", 0);

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "Lsb;")
    private static class98 field21 = class47.method368("Aug", 0);

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "Lsb;")
    private static class98 field26 = class47.method368("Oct", 0);

    @OriginalMember(owner = "client!ie", name = "qb", descriptor = "Lsb;")
    private static class98 field35 = class47.method368("Jan", 0);

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "Lsb;")
    private static class98 field22 = class47.method368("Nov", 0);

    @OriginalMember(owner = "client!ie", name = "rb", descriptor = "Lsb;")
    private static class98 field36 = class47.method368("Dec", 0);

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "Lsb;")
    private static class98 field27 = class47.method368("Mar", 0);

    @OriginalMember(owner = "client!ie", name = "pb", descriptor = "Z")
    public static boolean field34 = false;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "[I")
    public static int[] field31 = new int[100];

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "Lsb;")
    private static class98 field33 = class47.method368("Jul", 0);

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "[Lsb;")
    public static class98[] field24 = new class98[] { field35, field16, field27, field19, field25, field28, field33, field21, field23, field26, field22, field36 };

    @OriginalMember(owner = "client!ie", name = "tb", descriptor = "Lvf;")
    public static class48 field38 = new class48();

    @OriginalMember(owner = "client!ie", name = "ub", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ie", name = "sb", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Ltg;")
    public static class75 field15;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static final void method9(boolean arg0) {
        if (arg0) {
            ++field18;
            if (class56.field892) {
                class148 var1 = class157.method1138(class105.field1872, (byte) -107, class202.field3438);
                if (var1 != null && var1.field2750 != null) {
                    class28 var2 = new class28();
                    var2.field517 = var1;
                    var2.field514 = var1.field2750;
                    class192.method1327(var2, 200000);
                }
                class56.field892 = false;
                class72.method512(var1, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lne;I)V")
    public static final void method10(class108 arg0, int arg1) {
        if (arg1 == -978) {
            ++field32;
            for (class60 var2 = (class60) field38.method371((byte) 61); var2 != null; var2 = (class60) field38.method370(true)) {
                if (var2.field978 == arg0) {
                    if (var2.field997 != null) {
                        class36.field606.method1213(var2.field997);
                        var2.field997 = null;
                    }
                    var2.method1611((byte) 21);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class2() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field17;
        if (arg0 <= 35) {
            method10((class108) null, -93);
        }
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int[] var4 = this.method1537((byte) 108, 0, arg1);
            int[] var5 = this.method1537((byte) 83, 1, arg1);
            int[] var6 = this.method1537((byte) 55, 2, arg1);
            for (int var7 = 0; var7 < class13.field253; ++var7) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 != 0) {
                    var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                } else {
                    var3[var7] = var5[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
    public static void method11(boolean arg0) {
        field31 = null;
        field16 = null;
        field23 = null;
        field25 = null;
        field24 = null;
        field15 = null;
        field28 = null;
        field22 = null;
        field36 = null;
        field21 = null;
        field35 = null;
        field26 = null;
        field38 = null;
        if (arg0) {
            field36 = null;
        }
        field29 = null;
        field19 = null;
        field27 = null;
        field33 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            super.field3842 = arg0.method1446(5350) == 1;
        }
        if (!arg1) {
            ++field20;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field37;
        if (arg1 != 1) {
            this.method4(25, 65);
        }
        int[][] var3 = super.field3834.method627(arg1 ^ 4102, arg0);
        if (super.field3834.field1486) {
            int[] var4 = this.method1537((byte) 95, 2, arg0);
            int[][] var5 = this.method1531(arg0, 0, 122);
            int[][] var6 = this.method1531(arg0, 1, 124);
            int[] var7 = var6[0];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            int[] var11 = var5[1];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~class13.field253 < ~var16; ++var16) {
                int var17 = var4[var16];
                if (var17 != 4096) {
                    if (var17 != 0) {
                        int var18 = 4096 - var17;
                        var8[var16] = var7[var16] * var18 + var12[var16] * var17 >> 12;
                        var10[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var13[var16] * var17 + var15[var16] * var18 >> 12;
                    } else {
                        var8[var16] = var7[var16];
                        var10[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    }
                } else {
                    var8[var16] = var12[var16];
                    var10[var16] = var11[var16];
                    var9[var16] = var13[var16];
                }
            }
        }
        return var3;
    }
}
