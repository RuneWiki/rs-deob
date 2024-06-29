import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class class452 {

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public int field6589;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public int field6585;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public int field6582;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Ljava/lang/String;")
    public static String field6584 = "scroll:";

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field6588 = 0;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field6590 = -1;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lc;ZIILc;IZ)I")
    public static final int method2824(class159 arg0, boolean arg1, int arg2, int arg3, class159 arg4, int arg5, boolean arg6) {
        field6583++;
        int var7 = class355.method2330(arg1, arg3, arg0, true, arg4);
        if (var7 == 0) {
            if (arg5 != -30906) {
                method2827((byte) 5);
            }
            if (arg2 == -1) {
                return 0;
            } else {
                int var8 = class355.method2330(arg6, arg2, arg0, true, arg4);
                return arg6 ? -var8 : var8;
            }
        } else if (arg1) {
            return -var7;
        } else {
            return var7;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB)V")
    public abstract void method496(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method2825(byte arg0) {
        if (arg0 > -113) {
            method2825((byte) 90);
        }
        field6584 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IZI)V")
    public abstract void method493(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILqj;)V")
    public static final void method2826(int arg0, class238 arg1) {
        int var2 = -13 / ((arg0 + 74) / 50);
        field6586++;
        class94.field1294 = arg1;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
    public abstract void method492(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    public static final void method2827(byte arg0) {
        field6587++;
        class24 var1 = class169.field2235;
        synchronized (class169.field2235) {
            class169.field2235.method212(-105);
        }
        if (arg0 != 86) {
            method2827((byte) 118);
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(III)V")
    public class452(int arg0, int arg1, int arg2) {
        this.field6589 = arg0;
        this.field6585 = arg1;
        this.field6582 = arg2;
    }
}
