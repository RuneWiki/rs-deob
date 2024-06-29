import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class576 {

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field8374 = 0;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
    public static final void method3319(int arg0) {
        field8373++;
        class217 var1 = (class217) class144.field2079.method1904(false);
        if (arg0 != 512) {
            method3319(118);
        }
        while (var1 != null) {
            class644 var2 = var1.field2895;
            if (class45.field685 > var2.field9268) {
                var1.method2360((byte) 66);
                var2.method3667(0);
            } else if (class45.field685 >= var2.field9284) {
                if (var2.field9278 > 0) {
                    class177 var3 = (class177) class271.field3550.method2002((byte) -122, (long) (var2.field9278 - 1));
                    if (var3 != null) {
                        class53 var4 = var3.field2476;
                        if (var4.field7895 >= 0 && class72.field1144 * 512 > var4.field7895 && var4.field7896 >= 0 && class668.field9444 * 512 > var4.field7896) {
                            var2.method3668(class504.method2870((byte) -127, var4.field7896, var4.field7895, var2.field7905) - var2.field9238, (byte) 82, class45.field685, var4.field7895, var4.field7896);
                        }
                    }
                }
                if (var2.field9278 < 0) {
                    int var5 = -var2.field9278 - 1;
                    class71 var6;
                    if (class478.field6850 == var5) {
                        var6 = class321.field4681;
                    } else {
                        var6 = class35.field551[var5];
                    }
                    if (var6 != null && var6.field7895 >= 0 && var6.field7895 < (class72.field1144 * 512) && var6.field7896 >= 0 && class668.field9444 * 512 > var6.field7896) {
                        var2.method3668(class504.method2870((byte) -123, var6.field7896, var6.field7895, var2.field7905) - var2.field9238, (byte) 78, class45.field685, var6.field7895, var6.field7896);
                    }
                }
                var2.method3669(class255.field3319, (byte) 80);
                class591.method3367(var2, true);
            }
            var1 = (class217) class144.field2079.method1901(125);
        }
    }
}
