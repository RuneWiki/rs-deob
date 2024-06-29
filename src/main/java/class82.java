import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class82 extends class571 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Loia;")
    public class51 field1111;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "[I")
    public static int[] field1116 = new int[3];

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Lju;")
    public static class102 field1114 = new class102(10, 4);

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1117 = new String[200];

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "[[B")
    public static byte[][] field1119;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method486(int arg0, byte[] arg1) {
        int var2 = 0 % ((arg0 - 36) / 44);
        field1112++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var3 = new byte[arg1.length];
            class34.method245(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
    public static final void method487(int arg0, int arg1, int arg2) {
        if (arg0 != 22351) {
            field1116 = null;
        }
        field1113++;
        int var3 = class514.field7181.method4134((byte) 61, class138.field1860.method891(-2041650704, class369.field4721));
        int var5;
        if (class229.field3185) {
            for (class480 var4 = (class480) class314.field4033.method667(true); var4 != null; var4 = (class480) class314.field4033.method662((byte) 127)) {
                int var6;
                if (var4.field6524 == 1) {
                    var6 = class90.method544(-58437792, (class6) var4.field6519.field1417.field3781);
                } else {
                    var6 = class611.method3570(var4, (byte) -41);
                }
                if (var6 > var3) {
                    var3 = var6;
                }
            }
            var5 = class367.field4714 * 16 + 21;
            var3 += 8;
            class148.field2046 = (class33.field496 ? 26 : 22) + class367.field4714 * 16;
        } else {
            for (class6 var7 = (class6) class478.field6510.method3118((byte) 73); var7 != null; var7 = (class6) class478.field6510.method3111(118)) {
                int var10 = class90.method544(-58437792, var7);
                if (var3 < var10) {
                    var3 = var10;
                }
            }
            var3 += 8;
            var5 = class605.field8642 * 16 + 21;
            class148.field2046 = (class33.field496 ? 26 : 22) + class605.field8642 * 16;
        }
        int var8 = arg2 - var3 / 2;
        if (var3 + var8 > class58.field807) {
            var8 = class58.field807 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (class582.field8281 < arg1 + var5) {
            var9 = class582.field8281 - var5;
        }
        class463.field6345 = var8;
        if (var9 < 0) {
            var9 = 0;
        }
        class248.field3438 = var3;
        class484.field6549 = true;
        class140.field1930 = var9;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method488(int arg0) {
        if (arg0 != 0) {
            field1118 = -6;
        }
        field1116 = null;
        field1117 = null;
        field1114 = null;
        field1119 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILwu;ZIBI)V")
    public static final void method489(int arg0, class557 arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        if (arg4 == -31) {
            field1115++;
            class550.method3288(arg2, arg1, arg3, 0L, arg5, 0, arg0);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lpga;II[B)V")
    public class82(class492 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1111 = arg0.method2883(false, arg2, arg1, (byte) -63, arg3, class197.field2845);
        this.field1111.method355(false, (byte) -106, false);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lpga;II[I)V")
    public class82(class492 arg0, int arg1, int arg2, int[] arg3) {
        this.field1111 = arg0.method2936(false, arg1, arg2, arg3, (byte) 103);
        this.field1111.method355(false, (byte) -125, false);
    }
}
