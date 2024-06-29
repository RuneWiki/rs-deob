import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class224 {

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "[I")
    public static int[] field2985 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "I")
    public static int field2988 = 1;

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V", line = 11)
    public static void method1445(int arg0) {
        if (arg0 == 10) {
            field2985 = null;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILjava/lang/String;)I", line = 22)
    public static final int method1446(int arg0, String arg1) {
        field2986++;
        return arg0 == 0 ? arg1.length() + 2 : -48;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(B[Lria;I)V", line = 33)
    public static final void method1447(byte arg0, class288[] arg1, int arg2) {
        field2987++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class288 var4 = arg1[var3];
            if (var4 != null && var4.field3743 == arg2 && !client.method1821(var4)) {
                if (var4.field3655 == 0) {
                    method1447((byte) 109, arg1, var4.field3696);
                    if (var4.field3779 != null) {
                        method1447((byte) 126, var4.field3779, var4.field3696);
                    }
                    class491 var5 = (class491) class290.field3804.method1160((long) var4.field3696, 122);
                    if (var5 != null) {
                        class422.method2353(-1, var5.field6978);
                    }
                }
                if (var4.field3655 == 6 && var4.field3648 != -1) {
                    class56 var6 = class66.field941.method1299((byte) -89, var4.field3648);
                    if (var6 != null) {
                        var4.field3748 += class602.field8367;
                        int var7 = var4.field3776;
                        while (var4.field3748 > var6.field773[var4.field3776]) {
                            var4.field3748 -= var6.field773[var4.field3776];
                            var4.field3776++;
                            if (var4.field3776 >= var6.field771.length) {
                                var4.field3776 -= var6.field791;
                                if (var4.field3776 < 0 || var6.field771.length <= var4.field3776) {
                                    var4.field3776 = 0;
                                }
                            }
                            var4.field3616 = var4.field3776 + 1;
                            if (var6.field771.length <= var4.field3616) {
                                var4.field3616 -= var6.field791;
                                if (var4.field3616 < 0 || var6.field771.length <= var4.field3616) {
                                    var4.field3616 = -1;
                                }
                            }
                            class207.method1332((byte) -81, var4);
                        }
                        if (var4.field3776 != var7) {
                            class484.method2857(true, var6, var4.field3776);
                        }
                    }
                }
            }
        }
        if (arg0 < 32) {
            method1446(53, null);
        }
    }
}
