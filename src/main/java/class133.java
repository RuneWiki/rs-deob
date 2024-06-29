import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class133 extends class143 {

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "Lup;")
    public class489 field2152;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "Lvh;")
    public static class125 field2153 = new class125(30, -1);

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "Lvh;")
    public static class125 field2154 = new class125(9, 2);

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIBI)V")
    public static final void method1026(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg1 >= class198.field3084 && arg1 <= class627.field8931) {
            int var5 = class367.method2203(class512.field7620, class94.field1398, arg4, true);
            int var6 = class367.method2203(class512.field7620, class94.field1398, arg0, true);
            class525.method3095(arg2, var6, (byte) 119, arg1, var5);
        }
        if (arg3 == 125) {
            field2151++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lup;)V")
    public class133(class489 arg0) {
        this.field2152 = arg0;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(B)V")
    public static void method1027(byte arg0) {
        int var1 = 23 % ((arg0 + 61) / 50);
        field2153 = null;
        field2154 = null;
    }
}
