import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class341 extends class32 {

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Ljava/lang/String;")
    public static String field5321 = "";

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public int field5319;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "Lsf;")
    public static class197 field5324;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "Ljava/lang/String;")
    public String field5315;

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "Ljava/lang/String;")
    public String field5320;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Z")
    public static boolean field5317;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "Z")
    public static boolean field5322;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BZ)V", line = 4)
    public static final void method2361(byte arg0, boolean arg1) {
        if (arg0 != -52) {
            method2362(111);
        }
        field5325++;
        class170.method1225((byte) -97);
        if (class131.field2052 != 30 && class131.field2052 != 25) {
            return;
        }
        class152.field2288++;
        if (class152.field2288 < 50 && !arg1) {
            return;
        }
        class152.field2288 = 0;
        if (!class158.field2379 && class295.field4568 != null) {
            class240.field3837++;
            class106.field1642.method753(125, 245);
            try {
                class295.field4568.method370(1, class106.field1642.field2500, 0, class106.field1642.field2532);
                class106.field1642.field2532 = 0;
            } catch (IOException var3) {
                class158.field2379 = true;
            }
        }
        class170.method1225((byte) -97);
    }

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V", line = 38)
    public static void method2362(int arg0) {
        field5324 = null;
        field5321 = null;
        if (arg0 > -82) {
            method2361((byte) 65, true);
        }
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)Ldc;", line = 55)
    public final class152 method2363(byte arg0) {
        int var2 = -26 % ((9 - arg0) / 58);
        field5316++;
        return class97.field1539[this.field459];
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V", line = 69)
    public static final void method2364(byte arg0) {
        class165.field2477.method2176((byte) -115);
        if (arg0 != -79) {
            method2362(123);
        }
        field5323++;
    }
}
