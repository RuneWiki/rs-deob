import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class180 extends class4 {

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Ljf;")
    public class64 field2825;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field2826 = 0;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Laf;")
    public static class68 field2827 = new class68(64);

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(Z)V")
    public static void method1224(boolean arg0) {
        field2827 = null;
        if (!arg0) {
            field2827 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Ljf;)V")
    public class180(class64 arg0) {
        this.field2825 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
    public static final void method1225(int arg0) {
        field2829++;
        int var1 = class262.field4165.method1822(class47.field849);
        for (int var2 = 0; var2 < class205.field3291; var2++) {
            int var6 = class262.field4165.method1822(class141.method978(arg0 ^ 0xFFFFFF9C, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        int var3 = class205.field3291 * 15 + 21;
        var1 += 8;
        int var4 = class146.field2339;
        if (class279.field4423 < var3 + var4) {
            var4 = class279.field4423 - var3;
        }
        int var5 = class90.field1487 - (var1 / 2);
        if (class84.field1326 < (var1 + var5)) {
            var5 = class84.field1326 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class253.field4036 == 1) {
            if (class90.field1487 == class274.field4339 && class183.field2875 == class146.field2339) {
                class68.field1134 = var1;
                class145.field2322 = (class240.field3892 ? 26 : 22) + class205.field3291 * 15;
                class279.field4404 = var5;
                class23.field386 = var4;
                class253.field4036 = 0;
                class199.field3181 = true;
            }
        } else if (class90.field1487 == class248.field3953 && class235.field3829 == class146.field2339) {
            class279.field4404 = var5;
            class145.field2322 = (class240.field3892 ? 26 : 22) + class205.field3291 * 15;
            class253.field4036 = 0;
            class68.field1134 = var1;
            class199.field3181 = true;
            class23.field386 = var4;
        } else {
            class253.field4036 = 1;
            class274.field4339 = class248.field3953;
            class183.field2875 = class235.field3829;
        }
        if (arg0 != 22) {
            method1225(-83);
        }
    }
}
