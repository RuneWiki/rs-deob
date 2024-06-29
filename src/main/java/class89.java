import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class89 {

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public int field1414 = 0;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Z")
    public boolean field1419 = false;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public int field1420 = 0;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "Lhd;")
    public static class117 field1421 = new class117(4);

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1424 = 0;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Lok;")
    public static class146 field1425 = class235.method1724(-12908, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "Lok;")
    private static class146 field1427 = class235.method1724(-12908, " has logged in)3");

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field1422 = 0;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Lok;")
    public static class146 field1429 = class235.method1724(-12908, "blinken1:");

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "Lok;")
    public static class146 field1431 = field1427;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "Lok;")
    public static class146 field1430 = class235.method1724(-12908, "Examiner");

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "Lok;")
    public static class146 field1432 = class235.method1724(-12908, "d-Broulement:");

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Lqj;")
    public static class246 field1423;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Lsg;")
    public class34 field1417;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field1415;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "[[[Lse;")
    public static class11[][][] field1426;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 17)
    public static final void method616(int arg0) {
        field1416++;
        if (arg0 == -1212) {
            for (int var1 = 0; var1 < 100; var1++) {
                class14.field264[var1] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lwe;I)V", line = 42)
    public static final void method617(class47 arg0, int arg1) {
        for (int var2 = 0; var2 < class157.field2649; var2++) {
            int var3 = arg0.method350(-32768);
            int var4 = arg0.method379(-2);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class279.field4783[var3] != null) {
                class279.field4783[var3].field3154 = var4;
            }
        }
        if (arg1 != 25527) {
            method617((class47) null, -33);
        }
        field1412++;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 80)
    public static void method618(int arg0) {
        field1430 = null;
        field1425 = null;
        field1421 = null;
        if (arg0 != -1) {
            field1421 = (class117) null;
        }
        field1432 = null;
        field1423 = null;
        field1431 = null;
        field1426 = (class11[][][]) null;
        field1429 = null;
        field1427 = null;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)I", line = 103)
    public static final int method619(int arg0) {
        field1413++;
        if (arg0 != -3) {
            method618(89);
        }
        return class115.field1851 && class113.field1813[81] && class45.field763 > 2 ? class21.field405[class45.field763 - 2] : class21.field405[class45.field763 - 1];
    }
}
