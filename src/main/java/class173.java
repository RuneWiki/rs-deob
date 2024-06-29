import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class173 extends class177 {

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    private int field2865 = -32768;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "Lve;")
    public static class255 field2856 = class87.method607(80, "M");

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lve;")
    private static class255 field2858 = class87.method607(71, "Loading)3)3)3");

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Lve;")
    public static class255 field2861 = class87.method607(26, "rect_debug=");

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2855 = 0;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "Lve;")
    public static class255 field2857 = field2858;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public int field2853;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 8)
    public static void method1228(int arg0) {
        int var1 = -109 % ((-arg0 - 64) / 36);
        field2857 = null;
        field2861 = null;
        field2858 = null;
        field2856 = null;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)[Lid;", line = 34)
    public static final class248[] method1229(byte arg0) {
        int var1 = -100 / ((arg0 + 7) / 36);
        if (class111.field1879 == null) {
            class248[] var2 = class22.method121(class221.field3728, -24588);
            class248[] var3 = new class248[var2.length];
            int var4 = 0;
            label55: for (int var5 = 0; var5 < var2.length; var5++) {
                class248 var6 = var2[var5];
                if ((var6.field4160 <= 0 || var6.field4160 >= 24) && var6.field4161 >= 800 && var6.field4150 >= 600) {
                    for (int var7 = 0; var7 < var4; var7++) {
                        class248 var8 = var3[var7];
                        if (var6.field4161 == var8.field4161 && var6.field4150 == var8.field4150) {
                            if (var8.field4160 < var6.field4160) {
                                var3[var7] = var6;
                            }
                            continue label55;
                        }
                    }
                    var3[var4] = var6;
                    var4++;
                }
            }
            class111.field1879 = new class248[var4];
            class36.method212(var3, 0, class111.field1879, 0, var4);
            int[] var9 = new int[class111.field1879.length];
            for (int var10 = 0; var10 < class111.field1879.length; var10++) {
                class248 var11 = class111.field1879[var10];
                var9[var10] = var11.field4161 * var11.field4150;
            }
            class213.method1525(class111.field1879, false, var9);
        }
        field2860++;
        return class111.field1879;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()I", line = 122)
    public final int method176() {
        field2854++;
        return this.field2865;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 132)
    public static final void method1230(int arg0) {
        field2862++;
        if (class160.field2702 == 5) {
            class160.field2702 = arg0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIIIJ)V", line = 146)
    public final void method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class227 var11 = class132.method990((byte) -119, this.field2859).method1330(this.field2853, 0, (class271) null, -129);
        field2863++;
        if (var11 != null) {
            var11.method168(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2865 = var11.method176();
        }
    }
}
