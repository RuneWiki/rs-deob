import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class502 {

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "[Lnf;")
    public static class604[] field161;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(II)V")
    public final void method52(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method53((byte) -1);
        }
        super.field6865 = arg0;
        ++field160;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)I")
    public final int method53(byte arg0) {
        if (arg0 <= 49) {
            field161 = null;
        }
        ++field159;
        return super.field6865;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
    public static void method54(int arg0) {
        field161 = null;
        if (arg0 != -5) {
            field161 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
    public final int method55(int arg0) {
        ++field162;
        if (arg0 != -2) {
            field161 = null;
        }
        return 3;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lcn;[Lbq;)V")
    public static final void method56(class543 arg0, class307[] arg1) {
        if (class453.field6186) {
            int var2 = arg0.method2262(arg1, false);
            class112.field2107.method542(var2, arg1);
        }
        if (class745.field10286 == class178.field2805) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class597) {
                var5 = ((class597) arg0).field8368;
                var6 = ((class597) arg0).field8369;
            } else {
                var5 = arg0.field7396 >> class654.field9055;
                var6 = arg0.field7398 >> class654.field9055;
            }
            class112.field2107.method569(class142.field2418[0].method1907(arg0.field7396, (byte) 107, arg0.field7398), class755.method4184(var5, var6), class576.method3323(var5, var6), class27.method179(var5, var6));
        }
        class186 var7 = arg0.method898((byte) 125, class112.field2107);
        if (var7 != null) {
            if (arg0.field7397) {
                class144[] var8 = var7.field2877;
                for (int var9 = 0; var9 < var8.length; ++var9) {
                    class144 var10 = var8[var9];
                    if (var10.field2428) {
                        class686.method3861(var10.field2433 - var10.field2432, var10.field2432 + var10.field2429, 22738, var10.field2430 - var10.field2432, var10.field2432 + var10.field2431);
                    }
                }
            }
            if (var7.field2880) {
                var7.field2878 = arg0;
                if (class120.field2186) {
                    class375 var11 = class677.field9437;
                    synchronized (class677.field9437) {
                        class677.field9437.method2274(6, var7);
                        return;
                    }
                }
                class677.field9437.method2274(119, var7);
                return;
            }
            class287.method1839(var7, 8792);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        ++field158;
        return arg1 != 0 ? 115 : 1;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(ILeka;)V")
    public class8(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Leka;)V")
    public class8(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        if (arg0) {
            if (~super.field6865 > -1 || ~super.field6865 < -5) {
                super.field6865 = this.method55(-2);
            }
            ++field163;
        }
    }
}
