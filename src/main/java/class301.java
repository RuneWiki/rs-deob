import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class301 {

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "[I")
    public static int[] field4542 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "[I")
    public static int[] field4545 = new int[2];

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "Lsf;")
    public static class398 field4541 = new class398();

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "Lkd;")
    public static class359 field4543;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1856(String arg0, byte arg1) {
        field4544++;
        if (class196.field2964 == null) {
            return;
        }
        if (arg1 >= -115) {
            method1857(-40, 71, 17, (class316) null);
        }
        class177.method1082(class422.field6215, 0);
        class192.field2912++;
        class189.field2840.method2366(class386.method2384(-4580, arg0), true);
        class189.field2840.method2375(15, arg0);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIILo;)V")
    public static final void method1857(int arg0, int arg1, int arg2, class316 arg3) {
        class13 var4 = class230.method1395(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field166 = arg3;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public static void method1858(int arg0) {
        field4545 = null;
        field4542 = null;
        field4541 = null;
        field4543 = null;
        int var1 = -82 / ((83 - arg0) / 37);
    }
}
