import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class188 {

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "B")
    private byte field2820;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public int field2810;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Z")
    public static boolean field2815 = true;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Z")
    public static boolean field2817 = false;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Ll;")
    public static class133 field2819;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[[B")
    public static byte[][] field2812;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[[[I")
    public static int[][][] field2808;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZ)V", line = 13)
    public static final void method1341(boolean arg0, boolean arg1) {
        class242.field3876 = arg1;
        if (arg0) {
            field2811 = 60;
        }
        class33.field501 = !class19.method150(-111);
        field2822++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)I", line = 29)
    public final int method1342(int arg0) {
        field2823++;
        if (arg0 != 29550) {
            this.method1345(35);
        }
        return this.field2820 & 0x7;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 48)
    public static void method1343(int arg0) {
        if (arg0 == 3) {
            field2808 = (int[][][]) null;
            field2819 = null;
            field2812 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIILan;ZI)Z", line = 67)
    public static final boolean method1344(int arg0, int arg1, int arg2, int arg3, class85 arg4, boolean arg5, int arg6) {
        field2813++;
        class264 var7 = class214.method1507((byte) -107, arg4.field1365);
        if (var7.field4102 == -1) {
            return true;
        }
        int var8;
        if (arg4.field1374) {
            int var9 = arg4.field1369 + arg1;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class168 var10 = var7.method1800(arg4.field1327, (byte) -73, var8);
        if (var10 == null) {
            return false;
        }
        int var11 = var10.field3977;
        if (arg5) {
            method1343(30);
        }
        int var12 = arg4.field1390;
        int var13 = arg4.field1385;
        int var14 = var10.field3975;
        if ((var8 & 0x1) == 1) {
            var12 = arg4.field1385;
            var13 = arg4.field1390;
        }
        if (var7.field4108) {
            var14 = var13 * 4;
            var11 = var12 * 4;
        }
        if (var7.field4109 == 0) {
            var10.method1208(arg3 * 4 + 48, (-arg2 + 104 + -var13) * 4 + 48, var11, var14);
        } else {
            var10.method1214(arg3 * 4 + 48, (-arg2 + 104 - var13) * 4 + 48, var11, var14, var7.field4109);
        }
        return true;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)I", line = 123)
    public final int method1345(int arg0) {
        field2821++;
        int var2 = -38 % ((73 - arg0) / 41);
        return (this.field2820 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 134)
    public class188() {
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lkh;)V", line = 139)
    public class188(class166 arg0) {
        this.field2820 = arg0.method1143(-100);
        this.field2814 = arg0.method1151(-89);
        this.field2810 = arg0.method1137(57);
        this.field2807 = arg0.method1137(65);
        this.field2809 = arg0.method1137(115);
        this.field2818 = arg0.method1137(126);
    }
}
