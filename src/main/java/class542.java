import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class542 {

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
    public static int field7735 = 0;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lov;)V")
    public static final void method3172(class668 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class668 var2 = null;
            for (class668 var3 = class335.field4904[var1]; var3 != null; var3 = var3.field9472) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class335.field4904[var1] = var3.field9472;
                    } else {
                        var2.field9472 = var3.field9472;
                    }
                    class245.field3947 = true;
                    return;
                }
                var2 = var3;
            }
            class668 var4 = null;
            for (class668 var5 = class231.field3722[var1]; var5 != null; var5 = var5.field9472) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class231.field3722[var1] = var5.field9472;
                    } else {
                        var4.field9472 = var5.field9472;
                    }
                    class245.field3947 = true;
                    return;
                }
                var4 = var5;
            }
            class668 var6 = null;
            for (class668 var7 = class24.field240[var1]; var7 != null; var7 = var7.field9472) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class24.field240[var1] = var7.field9472;
                    } else {
                        var6.field9472 = var7.field9472;
                    }
                    class245.field3947 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILs;)V")
    public static final void method3173(int arg0, class339 arg1) {
        class211.field3511[arg0] = arg1;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V")
    public static final void method3174(byte arg0) {
        int var1 = 88 % ((-arg0 - 5) / 50);
        field7736++;
        if (!class643.field9186) {
            return;
        }
        while (true) {
            while (class501.field7276 < class94.field1406.length) {
                class225 var2 = class94.field1406[class501.field7276];
                if (var2 != null && var2.field3625 == -1) {
                    if (class372.field5640 == null) {
                        class372.field5640 = class688.field9778.method2522(var2.field3622, (byte) 57);
                    }
                    int var3 = class372.field5640.field5583;
                    if (var3 == -1) {
                        return;
                    }
                    class372.field5640 = null;
                    var2.field3625 = var3;
                    class501.field7276++;
                } else {
                    class501.field7276++;
                }
            }
            return;
        }
    }
}
