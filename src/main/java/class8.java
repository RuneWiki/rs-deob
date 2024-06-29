import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class8 extends class35 {

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "[I")
    public static int[] field108 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
    public static int field110 = 0;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public int field109;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public int field113;

    @OriginalMember(owner = "client!kp", name = "w", descriptor = "I")
    public int field114;

    @OriginalMember(owner = "client!kp", name = "x", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!kp", name = "y", descriptor = "I")
    public int field116;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V", line = 7)
    public static void method55(int arg0) {
        field108 = null;
        if (arg0 != 45) {
            method56(-104, -34, 39, -100, 71, 28);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIII)V", line = 22)
    public static final void method56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field105++;
        int var6 = (arg4 - 32) * arg4 / arg5;
        if (arg2 >= -87) {
            method57(93);
        }
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg1 / (arg5 - arg4);
        class121.field1899[0].method2645(arg0, arg3);
        class121.field1899[1].method2645(arg0, arg3 + arg4 - 16);
        class73.field1235.method736(arg4 - 32, (byte) -40, class168.field2489, 16, arg0, arg3 + 16);
        class73.field1235.method736(var6, (byte) -40, class403.field5896, 16, arg0, arg3 - (-var7 - 16));
        class73.field1235.method692(arg3 + var7 + 16, arg0, 1, var6, class451.field6557);
        class73.field1235.method692(arg3 + var7 + 16, arg0 + 1, 1, var6, class451.field6557);
        class73.field1235.method718(16, 6, arg3 + var7 + 16, arg0, class451.field6557);
        class73.field1235.method718(16, 6, arg3 + var7 + 17, arg0, class451.field6557);
        class73.field1235.method692(arg3 + var7 + 16, arg0 + 15, 1, var6, class409.field5969);
        class73.field1235.method692(arg3 + var7 + 17, arg0 + 14, 1, var6 - 1, class409.field5969);
        class73.field1235.method718(16, 6, arg3 + var6 - (-var7 + -15), arg0, class409.field5969);
        class73.field1235.method718(15, 6, var7 + arg3 + var6 + 14, arg0 + 1, class409.field5969);
    }

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V", line = 64)
    public static final void method57(int arg0) {
        field115++;
        class13.field216.method2781(false, arg0);
        class423.field6150++;
        class13.field216.method267(class285.method2015(arg0 + 6027), false);
        class13.field216.method324(class113.field1819, -64);
        class13.field216.method324(class277.field4170, -99);
        class13.field216.method267(class319.field4614, false);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)Z", line = 79)
    public static final boolean method58(int arg0, int arg1) {
        if (arg1 != 12015) {
            field108 = null;
        }
        field103++;
        if (arg0 == 43 || arg0 == 45 || arg0 == 59 || arg0 == 31 || arg0 == 46) {
            return true;
        } else {
            return arg0 == 2 || arg0 == 38 || arg0 == 1008;
        }
    }
}
