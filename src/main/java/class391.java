import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public abstract class class391 {

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "Z")
    public static boolean field5527 = false;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public abstract void method1092(int arg0);

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Z")
    public final boolean method2458(int arg0) {
        if (arg0 != -1) {
            this.method1091(100);
        }
        field5530++;
        return this.method1098(0) || this.method1091(-1) || this.method1090((byte) 46);
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
    public abstract void method1096(int arg0);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2459(int arg0, String arg1, boolean arg2) {
        if (arg0 != 17936) {
            field5527 = true;
        }
        field5524++;
        class645.method3561(arg1, arg2, -127, -1, -1);
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)Loaa;")
    public static final class287 method2460(int arg0) {
        field5525++;
        class504.field7236 = arg0;
        return class759.method4214(1554);
    }

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)Z")
    public abstract boolean method1098(int arg0);

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)Les;")
    public abstract class382 method1097(int arg0);

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "(I)Z")
    public static final boolean method2461(int arg0) {
        if (arg0 != 0) {
            return false;
        }
        field5528++;
        if (class100.field1195) {
            try {
                class113.method797("showVideoAd", 85, class213.field2800);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)Z")
    public abstract boolean method1091(int arg0);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)I")
    public abstract int method1089(byte arg0);

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "(I)I")
    public abstract int method1094(int arg0);

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)I")
    public static final int method2462(boolean arg0, int arg1) {
        field5529++;
        if (arg1 != 0) {
            field5527 = true;
        }
        int var2 = class221.field2883;
        if (var2 == 0) {
            return arg0 ? 0 : class155.field2166;
        } else if (var2 == 1) {
            return class155.field2166;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V")
    public static final void method2463(int arg0, Object[] arg1, int[] arg2) {
        int var3 = 104 / ((arg0 - 64) / 41);
        class65.method545(0, arg1, arg2, true, arg2.length - 1);
        field5526++;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)Z")
    public abstract boolean method1090(byte arg0);
}
