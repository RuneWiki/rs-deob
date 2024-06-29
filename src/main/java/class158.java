import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class158 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public int field2750 = -1;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "[I")
    public static int[] field2751 = new int[32768];

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[I")
    public static int[] field2749 = new int[100];

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field2755 = 0;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Z")
    public static boolean field2758 = false;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Ldj;")
    public static class44 field2753 = class89.method650(255, "leuchten1:");

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Lkh;")
    public class117 field2756;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Z")
    public static boolean field2748;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "[I")
    public int[] field2757;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "[Lod;")
    public static class155[] field2752;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[Ldj;")
    public class44[] field2745;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[Ldj;")
    public static class44[] field2746;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static final void method1034(byte arg0) {
        if (class119.field2117 != null) {
            class153 var1 = class119.field2117;
            synchronized (class119.field2117) {
                class119.field2117 = null;
            }
        }
        if (arg0 != -71) {
            field2758 = true;
        }
        field2747++;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static void method1035(byte arg0) {
        int var1 = -34 % ((arg0 - 64) / 49);
        field2751 = null;
        field2752 = null;
        field2746 = null;
        field2753 = null;
        field2749 = null;
    }
}
