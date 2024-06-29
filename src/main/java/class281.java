import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class281 extends class128 {

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Z")
    public static boolean field4493 = false;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field4492 = 0;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "[I")
    public static int[] field4497 = new int[14];

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field4498 = -1;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field4491 = 0;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4494;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Lcc;")
    public static final class209 method1885(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2352;
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)V")
    public static final void method1886(int arg0) {
        field4499++;
        if (arg0 != 14) {
            method1887((class251) null, -88);
        }
        try {
            if (class22.field272 == 1) {
                int var1 = class84.field1392.method2124((byte) 97);
                if (var1 > 0 && class84.field1392.method2122((byte) 26)) {
                    int var2 = var1 - class129.field2023;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class84.field1392.method2099(var2, (byte) -120);
                } else {
                    class84.field1392.method2119(-994449848);
                    class84.field1392.method2103(-115);
                    if (class62.field1026 == null) {
                        class22.field272 = 0;
                    } else {
                        class22.field272 = 2;
                    }
                    class258.field4162 = null;
                    class156.field2440 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class84.field1392.method2119(-994449848);
            class22.field272 = 0;
            class62.field1026 = null;
            class258.field4162 = null;
            class156.field2440 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ldk;I)Z")
    public static final boolean method1887(class251 arg0, int arg1) {
        if (arg1 == 0) {
            field4496++;
            return arg0.method1698((byte) 119, class163.field2634);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class281() {
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V")
    public static void method1888(int arg0) {
        if (arg0 != 0) {
            method1886(-78);
        }
        field4497 = null;
        field4494 = null;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I)V")
    public class281(int arg0) {
        this.field4495 = arg0;
    }
}
