import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lod;")
    public static class101 field100 = class46.method335(-64, "leuchten1:");

    @OriginalMember(owner = "client!af", name = "f", descriptor = "Lod;")
    public static class101 field101 = class46.method335(75, "Hierhin gehen");

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field103 = 0;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Lod;")
    private static class101 field108 = class46.method335(90, "flash3:");

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Lod;")
    public static class101 field109 = field108;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Lod;")
    public static class101 field112 = field108;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Lod;")
    public static class101 field107 = class46.method335(-100, "Ung-Ultige Session)2ID)3");

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Lod;")
    private static class101 field98 = class46.method335(-79, "Login server offline)3");

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field97 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lod;")
    public static class101 field111 = field98;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "Lod;")
    private static class101 field113 = class46.method335(127, "glow3:");

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lod;")
    public static class101 field106 = field113;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lod;")
    public static class101 field99 = class46.method335(-114, "sl_back");

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lod;")
    public static class101 field102 = field113;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Lrd;")
    public static class122 field115;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Lc;")
    public static class15 field110;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Z")
    public static boolean field105;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIBZLc;I)V")
    public static final void method33(int arg0, int arg1, byte arg2, boolean arg3, class15 arg4, int arg5) {
        field104++;
        class100.field2154 = arg4;
        class49.field1156 = arg1;
        class155.field3532 = arg0;
        if (arg2 < -73) {
            class90.field1962 = 10000;
            class11.field167 = 1;
            class143.field3295 = arg5;
            class158.field3632 = arg3;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method34(int arg0) {
        field112 = null;
        field101 = null;
        field98 = null;
        field99 = null;
        field113 = null;
        field111 = null;
        field100 = null;
        field107 = null;
        field106 = null;
        field102 = null;
        if (arg0 > -119) {
            field99 = null;
        }
        field109 = null;
        field108 = null;
        field110 = null;
        field115 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public static final void method35(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        field96++;
        if (class119.field2631 != null && arg1 >= 0 && arg1 < class119.field2631.length && class119.field2631[arg1] != null) {
            class17.field364.method419(224, (byte) 0);
            class17.field364.method1087(class119.field2631[arg1].field2723, arg0 ^ 0xFFFFFFA4);
            class8.field116++;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IIB[B)Lod;")
    public static final class101 method36(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 > -18) {
            method33(79, 103, (byte) -17, false, null, 106);
        }
        class101 var4 = new class101();
        var4.field2231 = 0;
        var4.field2223 = new byte[arg1];
        for (int var5 = arg0; var5 < arg0 + arg1; var5++) {
            if (arg3[var5] != 0) {
                var4.field2223[var4.field2231++] = arg3[var5];
            }
        }
        field114++;
        return var4;
    }
}
