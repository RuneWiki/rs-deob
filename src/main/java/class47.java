import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class47 {

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "J")
    public long field853 = 0L;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Lr;")
    public static class66 field847 = class93.method641(43, "::fpson");

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "[[[B")
    public static byte[][][] field846 = new byte[4][104][104];

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Lr;")
    public static class66 field856 = class93.method641(43, "sch-Utteln:");

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field858 = 0;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field859 = 5063219;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "La;")
    public class20 field849;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "La;")
    public class20 field852;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "[I")
    public static int[] field848;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZI[B)I")
    public static final int method333(int arg0, boolean arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        field861++;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = class80.field1561[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return arg1 ? -46 : ~var4;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public static void method334(int arg0) {
        if (arg0 == -1154) {
            field846 = null;
            field848 = null;
            field856 = null;
            field847 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)Luc;")
    public static final class224 method335(byte arg0, int arg1) {
        field850++;
        class224 var2 = (class224) class114.field2162.method1617(14366, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class144.field2622.method135(class38.method208(arg1, (byte) 65), 0, class212.method1371(arg1, -840517817));
        class224 var4 = new class224();
        if (var3 != null) {
            var4.method1432(new class249(var3), arg0 ^ 0xFFFFA20A);
        }
        if (arg0 == -36) {
            var4.method1428((byte) -1);
            class114.field2162.method1615(var4, arg0 + 134, (long) arg1);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static final void method336(int arg0) {
        class174.field3066.method1613((byte) 94);
        class209.field3626.method1613((byte) 94);
        field857++;
        if (arg0 == -27434) {
            class182.field3192.method1613((byte) 94);
        }
    }
}
