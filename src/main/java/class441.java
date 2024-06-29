import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class441 extends class425 {

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Lqfa;")
    public static class85 field6344 = new class85(33, -2);

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "Lsb;")
    public static class266 field6345 = new class266(54, 7);

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lus;B)V")
    public static final void method2657(class1 arg0, byte arg1) {
        if (class471.field6680 == null) {
            class143 var2 = new class143();
            byte[] var3 = var2.method1149(128, 16, 128, 4096);
            class471.field6680 = class515.method3039(false, var3, -1);
        }
        field6342++;
        if (arg1 > -97) {
            return;
        }
        if (class634.field9113 == null) {
            class680 var4 = new class680();
            byte[] var5 = var4.method3823(128, 128, 16, -8198);
            class634.field9113 = class515.method3039(false, var5, -1);
        }
        class343 var6 = arg0.field213;
        if (var6.method2207(-30) && class38.field1054 == null) {
            byte[] var7 = class459.method2753(8, 128, new class338(419684), 4.0F, 16.0F, 0.6F, 128, 4.0F, -127, 16, 0.5F);
            class38.field1054 = class515.method3039(false, var7, -1);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V")
    public static final void method2658(int arg0, boolean arg1) {
        if (arg1) {
            method2660(-128);
        }
        field6343++;
        class19 var2 = class373.method2355(74, arg0, 2);
        var2.method438(806);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)I")
    public abstract int method1094(boolean arg0);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public static void method2659(byte arg0) {
        field6344 = null;
        field6345 = null;
        if (arg0 != 107) {
            field6344 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I")
    public abstract int method1092(int arg0);

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)I")
    public static final int method2660(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class202.field3122 - 1; var2++) {
            if (arg0 < class457.field6507[var2] + class406.field5859[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class202.field3122 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)I")
    public abstract int method1091(byte arg0);

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)I")
    public abstract int method1093(int arg0);

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "(I)J")
    public abstract long method1090(int arg0);
}
