import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class168 extends InputStream {

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2514 = 0;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2517 = 0;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "F")
    public static float field2516;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lwb;")
    public static class216 field2515;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 3)
    public static void method1107(int arg0) {
        if (arg0 <= 116) {
            method1108((byte) 57);
        }
        field2515 = null;
    }

    @OriginalMember(owner = "client!se", name = "read", descriptor = "()I", line = 18)
    public final int read() {
        class157.method1046(-128, 30000L);
        field2513++;
        return -1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 27)
    public static final void method1108(byte arg0) {
        if (arg0 != -120) {
            return;
        }
        field2512++;
        try {
            if (class88.field1282 == 1) {
                int var1 = class121.field1817.method540(2);
                if (var1 > 0 && class121.field1817.method526(113)) {
                    int var2 = var1 - class449.field6616;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class121.field1817.method548(var2, false);
                } else {
                    class121.field1817.method524(20);
                    class121.field1817.method532(11625);
                    class457.field6710 = null;
                    if (class12.field183 == null) {
                        class88.field1282 = 0;
                    } else {
                        class88.field1282 = 2;
                    }
                    class497.field7248 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class121.field1817.method524(94);
            class88.field1282 = 0;
            class497.field7248 = null;
            class12.field183 = null;
            class457.field6710 = null;
        }
    }
}
