import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class219 {

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    private int field3710;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "Lbi;")
    public static class104 field3713 = new class104(100, 4);

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "Lqu;")
    public static class219 field3717 = new class219(76, -1);

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!qu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3714++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)I")
    public final int method1603(int arg0) {
        if (arg0 != -1) {
            method1605(false);
        }
        field3716++;
        return this.field3710;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public static final void method1604(byte arg0) {
        int var1 = 108 % ((arg0 - 70) / 35);
        field3712++;
        for (class209 var2 = (class209) class286.field4506.method2123(73); var2 != null; var2 = (class209) class286.field4506.method2126((byte) 61)) {
            class414 var3 = var2.field3227;
            if (var3.field6257) {
                var2.method3149(97);
                var3.method2641(0);
            } else if (var3.field6250 <= class88.field1278) {
                var3.method2642(class376.field5786, true);
                if (var3.field6257) {
                    var2.method3149(98);
                } else {
                    class186.method1160(var3, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Z)V")
    public static void method1605(boolean arg0) {
        field3717 = null;
        field3713 = null;
        if (!arg0) {
            field3715 = 105;
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(II)V")
    public class219(int arg0, int arg1) {
        this.field3710 = arg0;
    }
}
