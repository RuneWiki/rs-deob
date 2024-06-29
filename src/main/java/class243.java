import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class243 {

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "[I")
    public static int[] field3518 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field3519 = 0;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "[Lha;")
    public static class116[] field3521;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)I")
    public static final int method1546(int arg0, int arg1) {
        field3522++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg0 != -26367) {
            field3518 = null;
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
    public static void method1547(byte arg0) {
        field3521 = null;
        field3518 = null;
        if (arg0 != 23) {
            method1547((byte) 23);
        }
    }
}
