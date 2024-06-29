import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class10 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lod;")
    private static class101 field140 = class46.method335(-94, "Select a world");

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Lod;")
    public static class101 field146 = field140;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lod;")
    public static class101 field143 = class46.method335(113, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lod;")
    public static class101 field139 = class46.method335(110, "weiss:");

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field148 = 0;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "[I")
    public static int[] field151 = new int[32];

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Z")
    public static boolean field152 = false;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lod;")
    public static class101 field142 = class46.method335(68, "Unerwartete Antwort vom Anmelde)2Server");

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "J")
    private static long field149;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lc;")
    public static class15 field144;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "[I")
    public static int[] field147;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[S")
    public static short[] field141;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)I")
    public static final int method46(int arg0, int arg1, int arg2) {
        field138++;
        int var3 = -97 / ((-arg1 - 40) / 43);
        if (arg2 >= 2) {
            int var4 = method46(arg0 * arg0, -84, arg2 >> 1);
            if ((arg2 & 0x1) != 0) {
                var4 = arg0 * var4;
            }
            return var4;
        } else if (arg2 == 1) {
            return arg0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)J")
    public static final synchronized long method47(int arg0) {
        field145++;
        if (arg0 != 18889) {
            field148 = 46;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < field149) {
            class24.field593 += field149 - var1;
        }
        field149 = var1;
        return class24.field593 + var1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static void method48(boolean arg0) {
        field141 = null;
        field146 = null;
        field140 = null;
        field144 = null;
        field139 = null;
        field147 = null;
        field151 = null;
        field142 = null;
        field143 = null;
        if (!arg0) {
            field139 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lsa;B)Lsa;")
    public static final class126 method49(class126 arg0, byte arg1) {
        if (arg1 != 110) {
            field149 = 38L;
        }
        field150++;
        int var2 = class138.method1050(class42.method313(arg0, (byte) -70), arg1 + 12659);
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class78.method532(0, arg0.field2794);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }
}
