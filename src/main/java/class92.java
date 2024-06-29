import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class92 {

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Z")
    public static boolean field1182 = false;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "B")
    public static byte field1181;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Ltj;")
    public static class108 field1186;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()V")
    public abstract void method355();

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)Ltg;")
    public static final class126 method547(int arg0, byte arg1) {
        field1188++;
        if (arg1 != 18) {
            method549((byte) 58);
        }
        class126 var2 = (class126) class228.field3379.method99(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class135.field2090.method643(0, arg0, true);
        class126 var4 = new class126();
        if (var3 != null) {
            var4.method766((byte) -124, new class130(var3));
        }
        var4.method764(0);
        class228.field3379.method90(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lo;IIIIZ)V")
    public abstract void method357(class21 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method350(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method349(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lpc;[I)V")
    public abstract void method353(class402 arg0, int[] arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static void method548(byte arg0) {
        field1186 = null;
        if (arg0 != 87) {
            field1181 = -16;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
    public abstract int method359(int arg0, int arg1);

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lo;IIIIZ)V")
    public abstract void method352(class21 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(Lo;IIIIZ)Z")
    public abstract boolean method361(class21 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static final void method549(byte arg0) {
        class44.field600 = new class288(8);
        field1185++;
        class450.field6434 = 0;
        for (class328 var1 = (class328) class130.field1904.method1082(arg0 + 200); var1 != null; var1 = (class328) class130.field1904.method1078(false)) {
            var1.method2157();
        }
        if (arg0 != -82) {
            field1186 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method358(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
    public abstract void method362(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)I")
    public abstract int method360(int arg0, int arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLjava/lang/String;Z)V")
    public static final void method550(byte arg0, String arg1, boolean arg2) {
        field1180++;
        if (arg1 == null) {
            return;
        }
        if (class417.field5994 >= 100) {
            class154.method1135(class235.field3457.method2284((byte) -46, class309.field4497), (byte) -113);
        } else if (arg0 >= 20) {
            String var3 = class134.method1029(arg1, (byte) 83);
            if (var3 != null) {
                for (int var4 = 0; var4 < class417.field5994; var4++) {
                    String var8 = class134.method1029(class137.field2109[var4], (byte) 121);
                    if (var8 != null && var8.equals(var3)) {
                        class154.method1135(arg1 + class175.field2460.method2284((byte) -12, class309.field4497), (byte) -125);
                        return;
                    }
                    if (class434.field6200[var4] != null) {
                        String var9 = class134.method1029(class434.field6200[var4], (byte) 106);
                        if (var9 != null && var9.equals(var3)) {
                            class154.method1135(arg1 + class175.field2460.method2284((byte) -59, class309.field4497), (byte) -110);
                            return;
                        }
                    }
                }
                for (int var5 = 0; var5 < class206.field2897; var5++) {
                    String var6 = class134.method1029(class56.field743[var5], (byte) 62);
                    if (var6 != null && var6.equals(var3)) {
                        class154.method1135(class284.field4136.method2284((byte) -125, class309.field4497) + arg1 + class128.field1796.method2284((byte) 117, class309.field4497), (byte) -111);
                        return;
                    }
                    if (class366.field5231[var5] != null) {
                        String var7 = class134.method1029(class366.field5231[var5], (byte) 50);
                        if (var7 != null && var7.equals(var3)) {
                            class154.method1135(class284.field4136.method2284((byte) -95, class309.field4497) + arg1 + class128.field1796.method2284((byte) 114, class309.field4497), (byte) -110);
                            return;
                        }
                    }
                }
                if (class134.method1029(class181.field2555.field1790, (byte) 74).equals(var3)) {
                    class154.method1135(class84.field1073.method2284((byte) -116, class309.field4497), (byte) -114);
                } else {
                    class428.field6096++;
                    class407.field5761.method2048(2040, 158);
                    class407.field5761.method831(class276.method1873(true, arg1) + 1, (byte) 111);
                    class407.field5761.method807((byte) 124, arg1);
                    class407.field5761.method831(arg2 ? 1 : 0, (byte) -71);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(II)V")
    public abstract void method363(int arg0, int arg1);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILo;)Lo;")
    public abstract class21 method351(int arg0, int arg1, class21 arg2);

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(II)V")
    public class92(int arg0, int arg1) {
        this.field1187 = arg0;
        this.field1183 = arg1;
    }
}
