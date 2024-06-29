import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[[B")
    public static byte[][] field1384 = new byte[250][];

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lta;")
    public static class131 field1382 = new class131(512);

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1393 = -1;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1387 = 0;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lkd;")
    public static class73 field1391 = class126.method1070((byte) -66, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lkd;")
    public static class73 field1392 = class126.method1070((byte) -66, "::gc");

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lkd;")
    public static class73 field1390 = class126.method1070((byte) -66, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "[I")
    public static int[] field1389;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method419(byte arg0) {
        field1389 = null;
        field1390 = null;
        field1392 = null;
        int var1 = 28 / ((-arg0 - 14) / 60);
        field1382 = null;
        field1384 = null;
        field1391 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lq;Z)V")
    public static final void method420(class111 arg0, boolean arg1) {
        class26.field759 = arg0;
        field1385++;
        if (arg1) {
            field1389 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lkd;")
    public static final class73 method421(int arg0, int arg1) {
        if (arg1 != 124291536) {
            method420(null, false);
        }
        field1386++;
        return class32.method258(-85, new class73[] { class78.method676(arg0 >> 24 & 0xFF, -69), class2.field144, class78.method676(arg0 >> 16 & 0xFF, arg1 ^ -124291465), class2.field144, class78.method676(arg0 >> 8 & 0xFF, arg1 ^ -124291572), class2.field144, class78.method676(arg0 & 0xFF, -38) });
    }
}
