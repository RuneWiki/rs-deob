import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class270 extends class111 {

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    private int field4103 = -32768;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[Luo;")
    public static class316[] field4099 = new class316[0];

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Ls;")
    public static class196 field4101 = new class196(16);

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4109 = "glow1:";

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public int field4108;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lin;")
    public static class177 field4100;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 4)
    public static void method1993(int arg0) {
        field4109 = null;
        if (arg0 <= 19) {
            field4107 = 101;
        }
        field4100 = null;
        field4101 = null;
        field4099 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V", line = 26)
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4106++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIJILko;)V", line = 39)
    public final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class155 arg10) {
        field4104++;
        class151 var13 = class175.method1228((byte) 54, this.field4108).method910(-1, (class256) null, 0, (byte) -123, 0, this.field4098, (class248) null);
        if (var13 != null) {
            var13.method380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field4103 = var13.method371();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()I", line = 57)
    public final int method371() {
        field4105++;
        return this.field4103;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V", line = 66)
    public static final void method1994(boolean arg0) {
        field4102++;
        class8.field151++;
        class107.field1533.method1915(arg0, 89);
        for (class98 var1 = (class98) class288.field4360.method1406(0); var1 != null; var1 = (class98) class288.field4360.method1404(-70)) {
            if (var1.field1380 == 0) {
                class343.method2396(-87, var1, true);
            }
        }
        if (class289.field4380 != null) {
            class83.method676(class289.field4380, (byte) 90);
            class289.field4380 = null;
        }
    }
}
