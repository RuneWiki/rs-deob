import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class533 extends class540 {

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Ljava/lang/String;")
    public String field7530;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field7528 = 0;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Z")
    public static boolean field7529 = false;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "[[I")
    public static int[][] field7532 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 3)
    public static void method3087(byte arg0) {
        if (arg0 < -71) {
            field7532 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ldd;I)V", line = 17)
    public static final void method3088(class731 arg0, int arg1) {
        field7531++;
        class187.field2806.method2510(arg0, false);
        arg0.field10214 = arg0.field10211.field1521;
        arg0.field10211.field1521 = arg1;
        class445.field6330 += arg0.field10214;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 29)
    public static final void method3089(int arg0, String arg1, int arg2) {
        class203.field2969++;
        field7533++;
        class731 var3 = class155.method1222(260, class792.field10866, class237.field3417);
        var3.field10211.method851((byte) -2, class233.method1612(arg0, arg1) + 1);
        var3.field10211.method836(-30411, arg2);
        var3.field10211.method880(true, arg1);
        method3088(var3, 0);
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 50)
    public class533() {
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 54)
    public class533(String arg0) {
        this.field7530 = arg0;
    }
}
