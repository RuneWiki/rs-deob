import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class325 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lbi;")
    public static class104 field5105 = new class104(6, 8);

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Z")
    public static boolean field5107 = false;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method2173(byte arg0) {
        field5105 = null;
        int var1 = 81 / ((85 - arg0) / 38);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static final void method2174(int arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class51.field689[var1] = false;
        }
        field5106++;
        class292.field4605 = -1;
        class334.field5222 = arg0;
        class240.field3913 = 0;
        class460.field7101 = 0;
        class132.field1797 = -1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2175(int arg0, int arg1, int arg2, int arg3) {
        if (class216.method1591(arg0, arg1, arg2)) {
            int var4 = arg1 << class56.field908;
            int var5 = arg2 << class56.field908;
            return class31.method200(var4 + 1, class53.field732[arg0].method688(arg1, arg2) + arg3, var5 + 1) && class31.method200(class42.field454 + var4 - 1, class53.field732[arg0].method688(arg1 + 1, arg2) + arg3, var5 + 1) && class31.method200(class42.field454 + var4 - 1, class53.field732[arg0].method688(arg1 + 1, arg2 + 1) + arg3, class42.field454 + var5 - 1) && class31.method200(var4 + 1, class53.field732[arg0].method688(arg1, arg2 + 1) + arg3, class42.field454 + var5 - 1);
        } else {
            return false;
        }
    }
}
