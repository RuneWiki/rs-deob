import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class441 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public int field6434;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public int field6436;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public int field6441;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public int field6438;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "S")
    public static short field6439 = 1;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Liu;")
    public static class390 field6437 = new class390(90, 12);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field6440;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/lang/String;)V", line = 10)
    public static final void method2578(int arg0, String arg1) {
        int var2 = 76 / ((arg0 - 67) / 46);
        class477.field6870 = arg1;
        field6435++;
        if (class86.field1182.field668 == null) {
            return;
        }
        try {
            String var3 = class86.field1182.field668.getParameter("cookieprefix");
            String var4 = class86.field1182.field668.getParameter("cookiehost");
            String var5 = var3 + "settings=" + arg1 + "; version=1; path=/; domain=" + var4;
            String var6;
            if (arg1.length() == 0) {
                var6 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var6 = var5 + "; Expires=" + class368.method2244(class109.method653(false) + 94608000000L, 1) + "; Max-Age=" + 94608000L;
            }
            class123.method696("document.cookie=\"" + var6 + "\"", -3386, class86.field1182.field668);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V", line = 44)
    public static void method2579(boolean arg0) {
        field6437 = null;
        if (!arg0) {
            method2578(37, null);
        }
        field6440 = null;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V", line = 76)
    public class441(int arg0, int arg1, int arg2) {
        this.field6434 = arg0;
        this.field6436 = arg1;
        while (arg2 > 1) {
            this.field6441++;
            arg2 >>= 0x1;
        }
        this.field6438 = 0x1 << this.field6441;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
    public abstract void method847();

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lss;IIIIZ)V")
    public abstract void method857(class283 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
    public abstract void method851(int arg0, int arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ldq;[I)V")
    public abstract void method854(class472 arg0, int[] arg1);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Lss;IIIIZ)Z")
    public abstract boolean method858(class283 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(Lss;IIIIZ)V")
    public abstract void method849(class283 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)I")
    public abstract int method855(int arg0, int arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILss;)Lss;")
    public abstract class283 method860(int arg0, int arg1, class283 arg2);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method862(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
    public abstract void method863(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)I")
    public abstract int method848(int arg0, int arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method859(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method865(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);
}
