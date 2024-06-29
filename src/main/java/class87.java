import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class87 {

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "B")
    private byte field1731;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lsg;")
    public static class162 field1722 = new class162();

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[B")
    public static byte[] field1736;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Lcc;")
    public static class209 field1739;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lcc;")
    public static class209 field1740;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "[[[B")
    public static byte[][][] field1737;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZI)V")
    public static final void method624(boolean arg0, int arg1) {
        field1734++;
        for (class92 var2 = (class92) class273.field4846.method1119(20896); var2 != null; var2 = (class92) class273.field4846.method1120(93)) {
            if (var2.field1830 != null) {
                class47.field906.method1519(var2.field1830);
                var2.field1830 = null;
            }
            if (var2.field1811 != null) {
                class47.field906.method1519(var2.field1811);
                var2.field1811 = null;
            }
            var2.method269(-214950896);
        }
        if (arg1 >= -31) {
            method625((byte) 102);
        }
        if (!arg0) {
            return;
        }
        for (class92 var3 = (class92) field1722.method1119(20896); var3 != null; var3 = (class92) field1722.method1120(118)) {
            if (var3.field1830 != null) {
                class47.field906.method1519(var3.field1830);
                var3.field1830 = null;
            }
            var3.method269(-214950896);
        }
        for (class92 var4 = (class92) class210.field3823.method1759((byte) 43); var4 != null; var4 = (class92) class210.field3823.method1767((byte) 41)) {
            if (var4.field1830 != null) {
                class47.field906.method1519(var4.field1830);
                var4.field1830 = null;
            }
            var4.method269(-214950896);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method625(byte arg0) {
        field1740 = null;
        field1739 = null;
        field1737 = null;
        field1722 = null;
        if (arg0 == -124) {
            field1736 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
    public static final void method626(int arg0, int arg1) {
        class154.field2805.method662(32768, arg1);
        class261.field4699.method662(32768, arg1);
        if (arg0 > -56) {
            method631(-103, true);
        }
        field1723++;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)I")
    public final int method627(boolean arg0) {
        field1725++;
        if (!arg0) {
            field1739 = null;
        }
        return (this.field1731 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)[Lal;")
    public static final class231[] method628(boolean arg0) {
        field1733++;
        class231[] var1 = new class231[class191.field3465];
        if (arg0) {
            field1732 = -12;
        }
        for (int var2 = 0; var2 < class191.field3465; var2++) {
            int var3 = class185.field3332[var2] * class110.field2226[var2];
            byte[] var4 = class202.field3638[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class117.field2341[class27.method220(var4[var6], 255)];
            }
            var1[var2] = new class269(class241.field4360, class50.field996, class182.field3289[var2], class271.field4815[var2], class110.field2226[var2], class185.field3332[var2], var5);
        }
        class63.method468(116);
        return var1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILsj;)V")
    public static final void method629(int arg0, class49 arg1) {
        field1735++;
        class223.field4067 = arg1.method364(-1, class149.field2731);
        if (arg0 != -8) {
            method631(3, true);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)I")
    public final int method630(int arg0) {
        field1729++;
        if (arg0 != 7) {
            this.field1726 = -91;
        }
        return this.field1731 & 0x7;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class87() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ltf;)V")
    public class87(class106 arg0) {
        this.field1731 = arg0.method777(99);
        this.field1738 = arg0.method736(127);
        this.field1724 = arg0.method746((byte) -100);
        this.field1727 = arg0.method746((byte) -100);
        this.field1730 = arg0.method746((byte) -100);
        this.field1726 = arg0.method746((byte) -100);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V")
    public static final void method631(int arg0, boolean arg1) {
        field1728++;
        if (class10.field194 == arg1) {
            return;
        }
        if (arg0 != 255) {
            method626(-103, -116);
        }
        class10.field194 = arg1;
        class252.method1741(-28543);
    }

    static {
        int var0 = 0;
        field1736 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1736[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field1739 = class95.method669(93, "www");
        field1740 = class95.method669(82, " <col=00ff80>");
    }
}
