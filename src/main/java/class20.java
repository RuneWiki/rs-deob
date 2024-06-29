import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class20 {

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Z")
    public boolean field237 = true;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public int field246;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public int field238;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public int field232;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Ljava/lang/String;")
    public static String field240 = " more options";

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Ljava/lang/String;")
    public static String field244 = "M";

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "J")
    public static long field241 = 0L;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Lnm;")
    public static class221 field245;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "[[Z")
    public static boolean[][] field243;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBILs;II)Z", line = 7)
    public static final boolean method123(int arg0, int arg1, byte arg2, int arg3, class126 arg4, int arg5, int arg6) {
        class13 var7 = class337.method2386(arg4.field1922, 25335);
        if (arg2 < 65) {
            field244 = (String) null;
        }
        field236++;
        if (var7.field170 == -1) {
            return true;
        }
        int var9;
        if (arg4.field1931) {
            int var8 = arg4.field1942 + arg1;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class239 var10 = var7.method98(arg4.field1877, 0, var9);
        if (var10 == null) {
            return false;
        }
        int var11 = arg4.field1880;
        int var12 = var10.field2917;
        int var13 = var10.field2909;
        int var14 = arg4.field1929;
        if ((var9 & 0x1) == 1) {
            var11 = arg4.field1929;
            var14 = arg4.field1880;
        }
        if (var7.field167) {
            var13 = var14 * 4;
            var12 = var11 * 4;
        }
        if (var7.field176 == 0) {
            var10.method1676(arg3 * 4 + 48, 48 - -((-arg0 + -var14 + 104) * 4), var12, var13);
        } else {
            var10.method1671(arg3 * 4 + 48, 48 - -((-arg0 + -var14 + 104) * 4), var12, var13, var7.field176);
        }
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 69)
    public static void method124(int arg0) {
        field245 = null;
        if (arg0 == 4) {
            field243 = (boolean[][]) null;
            field240 = null;
            field244 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V", line = 98)
    public static final void method125(int arg0, int arg1) {
        if (!class186.field2903) {
            arg1 = -1;
        }
        field233++;
        if (arg0 != 26039) {
            method124(9);
        }
        if (class250.field3993 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class160 var2 = class296.method2094(arg1, (byte) 55);
            class137 var3 = var2.method1137(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class96.field1382.method1960(new Point(var2.field2562, var2.field2560), var3.field4812, arg0 - 25969, var3.field4805, var3.method962(), class235.field3731);
                class250.field3993 = arg1;
            }
        }
        if (arg1 == -1 && class250.field3993 != -1) {
            class96.field1382.method1960(new Point(), -1, 69, -1, (int[]) null, class235.field3731);
            class250.field3993 = -1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIIZ)V", line = 138)
    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field246 = arg2;
        this.field237 = arg6;
        this.field238 = arg3;
        this.field239 = arg1;
        this.field242 = arg0;
        this.field234 = arg4;
        this.field232 = arg5;
    }
}
