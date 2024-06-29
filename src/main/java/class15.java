import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lrd;")
    private static class173 field342 = class133.method843("Loaded sprites", 20);

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field351 = 99;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Lrd;")
    public static class173 field346 = field342;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field352 = -1;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field348 = 3;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lha;")
    public static class71 field343 = new class71();

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lsa;")
    public static class180 field345;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "La;")
    public static class1 field347;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method145(int arg0) {
        field347 = null;
        if (arg0 < 69) {
            method146((byte) 7);
        }
        field345 = null;
        field343 = null;
        field342 = null;
        field346 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
    public static final int method146(byte arg0) {
        field350++;
        int var1 = class56.method361(class172.field3347, class97.field1778, (byte) 100, class62.field1225);
        if (arg0 != -37) {
            field342 = null;
        }
        return var1 - class168.field3246 >= 800 || (class21.field462[class172.field3347][class62.field1225 >> 7][class97.field1778 >> 7] & 0x4) == 0 ? 3 : class172.field3347;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIZ)I")
    public static final int method147(int arg0, int arg1, boolean arg2) {
        field349++;
        if (arg2) {
            int var3 = arg0 - 1 & arg1 >> 31;
            return ((arg1 >>> 31) + arg1) % arg0 + var3;
        } else {
            return 85;
        }
    }
}
