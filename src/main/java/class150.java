import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class150 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field2774 = 0;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Ldg;")
    public static class276 field2775 = new class276(200);

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Lak;")
    public static class269 field2779 = new class269(16);

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lvf;")
    public static class265 field2780 = class87.method582(-46, "Weiter");

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILgk;II)V")
    public static final void method1026(int arg0, class6 arg1, int arg2, int arg3) {
        field2777++;
        if (class120.field2129 < 2 && class282.field4969 == 0 && !class25.field695) {
            return;
        }
        class265 var4 = class61.method453(false);
        if (arg1 == null) {
            int var6 = class205.field3692.method769(var4, arg2 + 4, arg3 + 15, 16777215, 0, class240.field4190, class144.field2689);
            class169.method1117(-128, 15, arg3, arg2 + 4, var6 + class205.field3692.method754(var4));
        } else {
            class115 var5 = arg1.method41((byte) 64, class97.field1714);
            if (var5 == null) {
                var5 = class205.field3692;
            }
            var5.method758(var4, arg2, arg3, arg1.field89, arg1.field84, arg1.field168, arg1.field129, arg1.field242, arg1.field118, class240.field4190, class144.field2689, class202.field3621);
            class169.method1117(-9, class202.field3621[3], class202.field3621[1], class202.field3621[0], class202.field3621[2]);
        }
        if (arg0 != 90) {
            method1027((byte) 118);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method1027(byte arg0) {
        field2779 = null;
        int var1 = 4 % ((9 - arg0) / 43);
        field2780 = null;
        field2775 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lfl;ILfl;)V")
    public static final void method1028(class192 arg0, int arg1, class192 arg2) {
        class258.field4440 = arg0;
        class233.field4104 = arg2;
        field2778++;
        if (arg1 != -231) {
            method1026(104, (class6) null, -23, 61);
        }
    }
}
