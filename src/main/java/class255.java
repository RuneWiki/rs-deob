import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class255 extends class287 {

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Ljava/lang/String;")
    public String field4034;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "[Z")
    public static boolean[] field4032 = new boolean[8];

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field4035 = -1;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4038 = "Loaded defaults";

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lug;")
    public static class253 field4030;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Ldl;")
    public static class29 field4031;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILvl;)Lbi;", line = 4)
    public static final class214 method1848(int arg0, class6 arg1) {
        if (arg0 != 3) {
            return (class214) null;
        }
        field4037++;
        class214 var2 = new class214();
        var2.field3381 = arg1.method39((byte) 112);
        var2.field3375 = class142.method1059(-91, var2.field3381);
        return var2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;ZIJIIZLjava/lang/String;IIZ)V", line = 28)
    public static final void method1849(String arg0, boolean arg1, int arg2, long arg3, int arg4, int arg5, boolean arg6, String arg7, int arg8, int arg9, boolean arg10) {
        field4036++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class6 var14 = new class6(128);
        var14.method81((byte) -117, 10);
        var14.method65((byte) -9, (arg6 ? 4 : 0) | (arg1 ? 1 : 0) | (arg10 ? 2 : 0));
        var14.method53((byte) 106, arg3);
        var14.method34(var12[0], 294335144);
        var14.method48(128, arg0);
        var14.method34(var12[1], 294335144);
        var14.method65((byte) -9, class105.field1393);
        var14.method81((byte) -127, arg8);
        var14.method81((byte) -107, arg2);
        var14.method34(var12[2], 294335144);
        var14.method65((byte) -9, arg9);
        var14.method65((byte) -9, arg5);
        var14.method34(var12[3], 294335144);
        var14.method76(class80.field1087, class95.field1257, 56);
        class6 var15 = new class6(350);
        var15.method48(128, arg7);
        int var16 = 8 - (class159.method1182(arg7, -91) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method81((byte) -117, (int) (Math.random() * 255.0D));
        }
        var15.method75(var12, 0);
        class183.field2965.field111 = 0;
        class183.field2965.method81((byte) -101, 22);
        class183.field2965.method65((byte) -9, var14.field111 + var15.field111 + 2);
        class183.field2965.method65((byte) -9, 536);
        class183.field2965.method67(var14.field111, 0, (byte) -126, var14.field115);
        class183.field2965.method67(var15.field111, 0, (byte) -126, var15.field115);
        class46.field605 = 0;
        class52.field665 = 1;
        if (arg4 <= 105) {
            method1848(-120, (class6) null);
        }
        class150.field2354 = -3;
        class2.field24 = 0;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 85)
    public static void method1850(int arg0) {
        if (arg0 != -13262) {
            field4038 = (String) null;
        }
        field4038 = null;
        field4030 = null;
        field4032 = null;
        field4031 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(CB)Z", line = 107)
    public static final boolean method1851(char arg0, byte arg1) {
        field4033++;
        if (arg1 != 122) {
            field4035 = -15;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V", line = 116)
    public class255() {
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 121)
    public class255(String arg0, int arg1) {
        this.field4034 = arg0;
    }
}
