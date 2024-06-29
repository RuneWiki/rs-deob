import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class662 extends class766 {

    @OriginalMember(owner = "client!co", name = "t", descriptor = "Ljava/lang/String;")
    public String field9327;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "I")
    public static int field9326 = 0;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "Ljj;")
    public static class265 field9323;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public static void method3708(byte arg0) {
        field9323 = null;
        if (arg0 > -78) {
            field9323 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V")
    public static final void method3709(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9325++;
        class371 var5 = class490.method2867((byte) -35, arg2, (long) arg1);
        var5.method2212(-98);
        var5.field5225 = arg3;
        var5.field5233 = arg4;
        var5.field5232 = arg0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
    public static final void method3710(int arg0, byte arg1) {
        class630.field8932 = -1;
        if (arg1 != 87) {
            field9323 = null;
        }
        class488.field6705 = arg0;
        field9324++;
        class630.field8932 = -1;
        class274.method1744(1);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Z")
    public static final boolean method3711(int arg0, int arg1) {
        field9321++;
        if (arg1 == 23 || arg1 == 25 || arg1 == 6 || arg1 == 47 || arg1 == 60) {
            return true;
        } else if (arg1 == 13 || arg1 == 1007) {
            return true;
        } else {
            return arg0 != 25;
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
    public class662() {
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class662(String arg0) {
        this.field9327 = arg0;
    }
}
