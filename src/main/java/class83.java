import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 extends class125 {

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lod;")
    public static class101 field1805 = class46.method335(-97, "Bitte versuchen Sie es erneut)3");

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lod;")
    private static class101 field1808 = class46.method335(-87, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Lod;")
    public static class101 field1809 = class46.method335(-125, "runes");

    @OriginalMember(owner = "client!m", name = "x", descriptor = "Lod;")
    public static class101 field1814 = class46.method335(-60, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!m", name = "C", descriptor = "Lod;")
    public static class101 field1819 = field1808;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field1821 = 0;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "Z")
    public static boolean field1820 = false;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static volatile int field1816 = -1;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Llb;")
    public static class78 field1804 = new class78();

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Lt;")
    public class132 field1812;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "Lnf;")
    public class96 field1813;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "Z")
    public static boolean field1815;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "[B")
    public byte[] field1810;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "[[[B")
    public static byte[][][] field1807;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
    public static final void method607(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1806++;
        if (arg4 != -8) {
            method608(true);
        }
        if (class86.field1909 == 1) {
            class147.field3368[field1817 / 100].method937(class27.field718 - 8, class140.field3228 + -8);
        }
        if (class86.field1909 == 2) {
            class147.field3368[field1817 / 100 + 4].method937(class27.field718 - 8, class140.field3228 + -8);
        }
        class94.method653(7);
        if (!class158.field3639) {
            return;
        }
        int var5 = arg3 + 507;
        int var6 = arg1 + 20;
        class157.field3625.method849(class15.method101(101, new class101[] { class132.field3031, class82.method592(false, class131.field3003) }), var5, var6, 16776960, -1);
        int var10 = var6 + 15;
        int var7 = 16776960;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        if (var9 > 32768 && class10.field152) {
            var7 = 16711680;
        }
        if (var9 > 65536 && !class10.field152) {
            var7 = 16711680;
        }
        class157.field3625.method849(class15.method101(120, new class101[] { class12.field243, class82.method592(false, var9), class150.field3435 }), var5, var10, var7, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static void method608(boolean arg0) {
        if (arg0) {
            method608(true);
        }
        field1808 = null;
        field1805 = null;
        field1804 = null;
        field1807 = null;
        field1819 = null;
        field1814 = null;
        field1809 = null;
    }
}
