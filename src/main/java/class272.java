import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class272 extends class200 {

    @OriginalMember(owner = "client!h", name = "V", descriptor = "Lsi;")
    public final class199 field4807;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "Lkg;")
    private final class136 field4806;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Z")
    public static boolean field4792 = true;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Loa;")
    public static class99 field4802 = class221.method1463(2844, "<col=80ff00>");

    @OriginalMember(owner = "client!h", name = "X", descriptor = "Lwk;")
    public static class273 field4809 = new class273(64);

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "Loa;")
    public static class99 field4814 = class221.method1463(2844, "loginscreen");

    @OriginalMember(owner = "client!h", name = "db", descriptor = "Loa;")
    public static class99 field4815 = class221.method1463(2844, ")1");

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    public int field4793;

    @OriginalMember(owner = "client!h", name = "I", descriptor = "I")
    public int field4794;

    @OriginalMember(owner = "client!h", name = "J", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!h", name = "K", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!h", name = "L", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public int field4800;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public int field4801;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public int field4803;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    public int field4804;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
    public int field4810;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "Ltf;")
    public static class107 field4812;

    @OriginalMember(owner = "client!h", name = "M", descriptor = "[[B")
    public static byte[][] field4798;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1802(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class57.field963 * arg3 + class12.field102 * arg0 >> 16;
        int var6 = class12.field102 * arg3 - class57.field963 * arg0 >> 16;
        int var7 = class247.field4251 * arg1 + class193.field3403 * var6 >> 16;
        int var8 = class193.field3403 * arg1 - class247.field4251 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class247.field4251 * arg2 + class193.field3403 * var6 >> 16;
        int var12 = class193.field3403 * arg2 - class247.field4251 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class86.field1492 && var13 < class86.field1492) {
            return false;
        } else if (var9 > class238.field4119 && var13 > class238.field4119) {
            return false;
        } else if (var10 < class119.field2108 && var14 < class119.field2108) {
            return false;
        } else {
            return var10 <= class254.field4386 || var14 <= class254.field4386;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IB)V")
    public static final void method1803(int arg0, byte arg1) {
        class90.field1545 = false;
        class161.field2860 = null;
        class48.field797 = 0;
        field4811++;
        class53.field873 = 1;
        if (arg1 > 96) {
            class34.field614 = arg0;
            class47.field790 = -1;
            class145.field2546 = -1;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BJ)V")
    public static final void method1804(byte arg0, long arg1) {
        field4805++;
        if (arg1 == 0L) {
            return;
        }
        class17.field184++;
        class131.field2277.method966((byte) 49, 39);
        if (arg0 <= -103) {
            class131.field2277.method1699(arg1, -110);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
    public final void method1805(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -3) {
            method1804((byte) 0, 63L);
        }
        this.field4801 = arg0;
        field4797++;
        this.field4800 = arg1;
        this.field4804 = arg2;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public static void method1806(int arg0) {
        field4809 = null;
        field4812 = null;
        field4802 = null;
        if (arg0 != 0) {
            field4815 = null;
        }
        field4814 = null;
        field4798 = null;
        field4815 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
    public static final boolean method1807(int arg0, int arg1) {
        field4799++;
        if (arg1 >= 0 && class218.field3796.length > arg1) {
            if (arg0 != -8488) {
                method1804((byte) -3, -1L);
            }
            return class218.field3796[arg1];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lsi;Lkg;)V")
    public class272(class199 arg0, class136 arg1) {
        this.field4807 = arg0;
        this.field4806 = arg1;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Z")
    public static final boolean method1808(int arg0, int arg1) {
        if (arg0 != -123) {
            field4812 = null;
        }
        field4808++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }
}
