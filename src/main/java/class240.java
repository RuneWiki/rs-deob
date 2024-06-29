import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class240 {

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3834 = 0;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3836 = "";

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "[Z")
    public static boolean[] field3838 = new boolean[200];

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "Z")
    public static boolean field3837 = false;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Lhb;")
    public static class155 field3835;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Ldk;")
    public static class251 field3833;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method1617(byte arg0) {
        field3836 = null;
        field3835 = null;
        if (arg0 == 68) {
            field3838 = null;
            field3833 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lpd;I)V")
    public static final void method1618(class194 arg0, int arg1) {
        if (arg0.field3147 != null) {
            arg0.field3147.field4512 = 0;
        }
        arg0.field3149 = false;
        for (class194 var2 = arg0.method728(); var2 != null; var2 = arg0.method714()) {
            method1618(var2, 0);
        }
        if (arg1 != 0) {
            field3835 = null;
        }
        field3839++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static final void method1619(int arg0) {
        if (arg0 != 17998) {
            return;
        }
        while (class131.field2053.method824(0, class47.field793) >= 11) {
            int var1 = class131.field2053.method831(11, true);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class270.field4355[var1] == null) {
                class270.field4355[var1] = new class299();
                if (class131.field2069[var1] != null) {
                    class270.field4355[var1].method1977(class131.field2069[var1], 0, var1);
                }
                var2 = true;
            }
            class259.field4176[class13.field145++] = var1;
            class299 var3 = class270.field4355[var1];
            var3.field695 = class29.field360;
            int var4 = class131.field2053.method831(5, true);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class131.field2053.method831(5, true);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class70.field1157[class131.field2053.method831(3, true)];
            if (var2) {
                var3.field702 = var3.field652 = var6;
            }
            int var7 = class131.field2053.method831(1, true);
            if (var7 == 1) {
                class40.field584[class69.field1145++] = var1;
            }
            int var8 = class131.field2053.method831(1, true);
            var3.method1975(class239.field3829.field709[0] + var4, (byte) -67, var8 == 1, class239.field3829.field704[0] + var5);
        }
        class131.field2053.method825(-3);
        field3832++;
    }
}
