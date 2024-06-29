import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class170 extends class268 {

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    private int field2363 = -32768;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Z")
    public static boolean field2354 = true;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field2352 = 0;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Z")
    public static boolean field2360 = false;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field2362 = -1;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public int field2355;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public int field2358;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lhc;ZLhc;Lhc;)V")
    public static final void method1111(class235 arg0, boolean arg1, class235 arg2, class235 arg3) {
        class297.field4689 = arg0;
        field2356++;
        class6.field49 = arg3;
        class286.field4517 = arg2;
        if (!arg1) {
            method1111((class235) null, false, (class235) null, (class235) null);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
    public static final void method1112(int arg0, int arg1) {
        field2351++;
        if (~arg0 == arg1 || !class191.field2650[arg0]) {
            return;
        }
        class221.field3323.method1555(-22, arg0);
        if (class158.field2208[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class158.field2208[arg0].length; var3++) {
            if (class158.field2208[arg0][var3] != null) {
                if (class158.field2208[arg0][var3].field3035 == 2) {
                    var2 = false;
                } else {
                    class158.field2208[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class158.field2208[arg0] = null;
        }
        class191.field2650[arg0] = false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)V")
    public static final void method1113(byte arg0, int arg1) {
        if (arg0 < 13) {
            return;
        }
        field2357++;
        if (arg1 == -1 || !class52.method328(19031, arg1)) {
            return;
        }
        class211[] var2 = class158.field2208[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class211 var4 = var2[var3];
            if (var4.field3100 != null) {
                class27 var5 = new class27();
                var5.field341 = var4.field3100;
                var5.field338 = var4;
                class13.method81(var5, 2000000, (byte) -104);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()I")
    public final int method106() {
        field2364++;
        return this.field2363;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIIJILnl;)V")
    public final void method120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class97 arg10) {
        class25 var13 = class73.method463(this.field2355, -31104).method216(-24745, (class240) null, -1, 0, this.field2358, (class144) null, 0);
        field2353++;
        if (var13 != null) {
            var13.method120(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2363 = var13.method106();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
    public final void method170(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2359++;
    }
}
