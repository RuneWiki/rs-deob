import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class172 extends class36 {

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public int field2116;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIILoa;I)Lba;")
    public static final class327 method987(int arg0, int arg1, int arg2, int arg3, int arg4, class605 arg5, int arg6) {
        field2114++;
        long var7 = (long) arg2;
        class327 var9 = (class327) class30.field344.method1801(arg4 ^ arg4, var7);
        short var10 = 2055;
        if (var9 == null) {
            class557 var11 = class471.method2890(0, arg2, -83, class30.field345);
            if (var11 == null) {
                return null;
            }
            if (var11.field7946 < 13) {
                var11.method3224(-16503, 2);
            }
            var9 = arg5.method326(var11, var10, class456.field6832, 64, 768);
            class30.field344.method1808(var7, var9, (byte) -95);
        }
        class327 var12 = var9.method1382((byte) 2, var10, true);
        if (arg1 != 0) {
            var12.method1385(arg1);
        }
        if (arg6 != 0) {
            var12.method1358(arg6);
        }
        if (arg0 != 0) {
            var12.method1396(arg0);
        }
        if (arg3 != 0) {
            var12.method1354(0, arg3, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method988(boolean arg0);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZLoa;)V")
    public static final void method989(boolean arg0, class605 arg1) {
        for (class211 var2 = (class211) class132.field1661.method3297((byte) 121); var2 != null; var2 = (class211) class132.field1661.method3296((byte) -106)) {
            if (var2.field2814) {
                var2.method1335(arg1);
            }
        }
        field2115++;
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
    public class172(int arg0) {
        this.field2116 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lw;III[Z)Z")
    public static final boolean method990(class252 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class492.field7164 != class435.field6449) {
            int var6 = class544.field7780[arg1].method249(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class132 var8 = class544.field7780[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method249(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method248(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method256(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Z")
    public abstract boolean method991(byte arg0);
}
