import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class88 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "[[I")
    public static int[][] field1334 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lvj;")
    public static class304 field1335 = new class304(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Lra;")
    public static class70 field1338 = new class70(6, 0, 4, 2);

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1341 = null;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lpc;")
    public static class473 field1340;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
    public static int[] field1339;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 8)
    public static void method640(byte arg0) {
        field1341 = null;
        if (arg0 != 9) {
            return;
        }
        field1335 = null;
        field1340 = null;
        field1338 = null;
        field1339 = null;
        field1334 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V", line = 26)
    public static final void method641(byte arg0) {
        if (class487.field6768 != null) {
            class487.field6768.method2473(0);
        }
        field1336++;
        if (arg0 > 103 && class322.field4216 != null) {
            class322.field4216.method2473(0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Z", line = 52)
    public static final boolean method642(int arg0) {
        field1337++;
        try {
            if (class342.field4520 == 2) {
                if (class387.field5263 == null) {
                    class387.field5263 = class512.method3017(class60.field943, class433.field5910, class49.field759);
                    if (class387.field5263 == null) {
                        return false;
                    }
                }
                if (class20.field331 == null) {
                    class20.field331 = new class192(class378.field5113, class406.field5586);
                }
                if (class399.field5369.method1957(22050, class20.field331, false, class120.field1752, class387.field5263)) {
                    class399.field5369.method1941(true);
                    class399.field5369.method1932((byte) 127, class528.field7808);
                    class399.field5369.method1939(class387.field5263, (byte) 106, class177.field2570);
                    class387.field5263 = null;
                    class20.field331 = null;
                    class342.field4520 = 0;
                    class60.field943 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class399.field5369.method1951((byte) 112);
            class60.field943 = null;
            class387.field5263 = null;
            class342.field4520 = 0;
            class20.field331 = null;
        }
        return arg0 <= 64;
    }
}
