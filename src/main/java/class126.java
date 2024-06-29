import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class126 {

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public int field2045;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field2041;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Z")
    public static boolean field2039;

    static {
        new class345(64);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1061(boolean arg0) {
        if (!arg0) {
            field2042++;
            for (int var1 = 0; var1 < 100; var1++) {
                class254.field3685[var1] = true;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 22)
    public static void method1062(int arg0) {
        if (arg0 == -2) {
            field2041 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Llf;", line = 35)
    public static final class339 method1063(int arg0, int arg1) {
        field2038++;
        class339 var2 = (class339) class88.field1410.method2228(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class403.field5892.method1355(arg0, -12607, arg1);
        class339 var4 = new class339();
        if (var3 != null) {
            var4.method2200(new class37(var3), -1);
        }
        class88.field1410.method2226((long) arg0, var4, (byte) -108);
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Lrr;", line = 65)
    public static final class198 method1064(byte arg0) {
        field2036++;
        if (class272.field4075 == null || class349.field4960 == null) {
            return null;
        }
        for (class198 var1 = (class198) class349.field4960.method1629(-1); var1 != null; var1 = (class198) class349.field4960.method1629(-1)) {
            class242 var2 = class1.method3(var1.field2883, 36);
            if (var2 != null && var2.field3531 && var2.method1768(21)) {
                return var1;
            }
        }
        if (arg0 < 61) {
            field2041 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 94)
    public static final String method1065(boolean arg0, String arg1) {
        field2044++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class240.method1754((byte) -91, arg1.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class240.method1754((byte) -91, arg1.charAt(var3 - 1))) {
            var3--;
        }
        if (arg0) {
            return null;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class18.method108(var7, (byte) 99)) {
                char var8 = class280.method1988(var7, -48);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(II)V", line = 158)
    public static final void method1066(int arg0, int arg1) {
        field2040++;
        class221 var2 = class447.method2795(1, (byte) -49, arg0);
        var2.method1689(110);
        if (arg1 <= 104) {
            field2039 = false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBI)I", line = 174)
    public static final int method1067(int arg0, byte arg1, int arg2) {
        field2043++;
        if (arg1 > -48) {
            field2041 = null;
        }
        return arg2 == 4 || arg2 == 5 ? class143.field2241[arg0 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(II)V", line = 189)
    public class126(int arg0, int arg1) {
        this.field2045 = arg1;
        this.field2037 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILsr;)Lsr;")
    public abstract class135 method801(int arg0, int arg1, class135 arg2);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public abstract void method799(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public abstract void method800(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)V")
    public abstract void method808(int arg0, int arg1);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)I")
    public abstract int method809(int arg0, int arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lsr;IIIIZ)V")
    public abstract void method798(class135 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(II)I")
    public abstract int method794(int arg0, int arg1);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    public abstract void method796();

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method812(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lsr;IIIIZ)V")
    public abstract void method811(class135 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Luc;[I)V")
    public abstract void method806(class59 arg0, int[] arg1);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(Lsr;IIIIZ)Z")
    public abstract boolean method802(class135 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public abstract void method805(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11);
}
