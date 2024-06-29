import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "[I")
    public static int[] field18 = new int[8];

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "Llca;")
    public static class597 field11 = new class597(1);

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static void method8(int arg0) {
        field18 = null;
        field11 = null;
        if (arg0 != 1) {
            field17 = 39;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)I")
    public static final int method9(int arg0, int arg1) {
        int var8 = arg0 - 1;
        field16++;
        int var2 = var8 | var8 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = -13 / ((23 - arg1) / 55);
        int var5 = var3 | var3 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B[B)Z")
    public static final boolean method10(byte arg0, byte[] arg1) {
        field13++;
        class695 var2 = new class695(arg1);
        int var3 = var2.method3826(false);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method3826(false) == 1;
        if (var4) {
            class56.method611(-75, var2);
        }
        int var5 = -121 / ((arg0 - 72) / 54);
        class672.method3725(var2, (byte) 111);
        return true;
    }
}
