import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class225 extends class223 {

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public int field3296;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "[I")
    public static int[] field3298 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lsl;")
    public static class318 field3297 = new class318(76, 3);

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lsl;")
    public static class318 field3299 = new class318(18, 6);

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field3301 = new String[100];

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lya;")
    public static class38 field3300;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1530(int arg0) {
        field3300 = null;
        field3297 = null;
        field3298 = null;
        field3301 = null;
        if (arg0 == -1) {
            field3299 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(II)V")
    public class225(int arg0, int arg1) {
        this.field3296 = arg1;
        this.field3294 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZI[Luu;)V")
    public static final void method1531(boolean arg0, int arg1, class188[] arg2) {
        if (arg0) {
            method1530(-59);
        }
        field3295++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class188 var4 = arg2[var3];
            if (var4 != null && var4.field2745 == arg1 && !client.method1375(var4)) {
                if (var4.field2727 == 0) {
                    method1531(false, var4.field2678, arg2);
                    if (var4.field2758 != null) {
                        method1531(false, var4.field2678, var4.field2758);
                    }
                    class305 var5 = (class305) class49.field545.method875((long) var4.field2678, 124);
                    if (var5 != null) {
                        class85.method755((byte) -25, var5.field4333);
                    }
                }
                if (var4.field2727 == 6 && var4.field2639 != -1) {
                    class267 var6 = class153.field2169.method1585(3, var4.field2639);
                    if (var6 != null) {
                        var4.field2705 += class406.field6056;
                        while (var6.field3940[var4.field2686] < var4.field2705) {
                            var4.field2705 -= var6.field3940[var4.field2686];
                            var4.field2686++;
                            if (var6.field3919.length <= var4.field2686) {
                                var4.field2686 -= var6.field3926;
                                if (var4.field2686 < 0 || var4.field2686 >= var6.field3919.length) {
                                    var4.field2686 = 0;
                                }
                            }
                            var4.field2628 = var4.field2686 + 1;
                            if (var6.field3919.length <= var4.field2628) {
                                var4.field2628 -= var6.field3926;
                                if (var4.field2628 < 0 || var4.field2628 >= var6.field3919.length) {
                                    var4.field2628 = -1;
                                }
                            }
                            class120.method951(var4, (byte) -109);
                        }
                    }
                }
            }
        }
    }
}
