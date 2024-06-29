import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class343 implements class351 {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lgj;")
    private class662 field4620;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Ljava/lang/String;")
    private String field4615;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lfja;")
    public static class783 field4614 = new class783(65, 3);

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4618 = new String[100];

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method2128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class236.field3392 = arg1;
        field4619++;
        int var5 = -103 % ((arg3 - 51) / 52);
        class706.field9700 = arg4;
        class223.field3260 = arg0;
        class268.field3766 = arg2;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 22)
    public static void method2129(byte arg0) {
        if (arg0 >= -24) {
            field4618 = null;
        }
        field4614 = null;
        field4618 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IFFLmfa;IIFIFFI)[B", line = 33)
    public static final byte[] method2130(int arg0, float arg1, float arg2, class643 arg3, int arg4, int arg5, float arg6, int arg7, float arg8, float arg9, int arg10) {
        field4621++;
        byte[] var11 = new byte[arg0 * arg10 * arg5];
        class596.method3397(true, arg7, arg3, arg0, arg8, arg5, arg6, arg2, arg1, arg9, var11, arg10, arg4);
        return var11;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I", line = 44)
    public final int method1501(byte arg0) {
        field4616++;
        if (arg0 != 5) {
            this.method1501((byte) 88);
        }
        return this.field4620.method3725(-12831, this.field4615) ? 100 : this.field4620.method3728(this.field4615, (byte) -102);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Lgb;", line = 62)
    public final class228 method1499(int arg0) {
        if (arg0 != 27291) {
            this.field4615 = null;
        }
        field4617++;
        return class228.field3324;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lgj;Ljava/lang/String;)V", line = 79)
    public class343(class662 arg0, String arg1) {
        this.field4620 = arg0;
        this.field4615 = arg1;
    }
}
