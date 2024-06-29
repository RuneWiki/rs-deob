import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class131 extends class176 {

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Z")
    public static boolean field2849 = false;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2852 = 0;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "Lgg;")
    private static class63 field2860 = class116.method911(43, "Members object");

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lgg;")
    public static class63 field2851 = field2860;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public int field2863;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "Lrc;")
    public static class156 field2858;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "Lff;")
    public class54 field2848;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "Lff;")
    public class54 field2862;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "Lgg;")
    public class63 field2861;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field2853;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)Z")
    public static final boolean method964(int arg0, boolean arg1) {
        if (!arg1) {
            method965((byte) -103);
        }
        field2859++;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method965(byte arg0) {
        field2851 = null;
        field2858 = null;
        if (arg0 != 91) {
            method967(11, 91, 7, true, 97, null);
        }
        field2860 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method966(int arg0, int arg1, int arg2, long arg3) {
        class96 var5 = class148.field3117[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2277 != null && var5.field2277.field2598 == arg3) {
            return true;
        } else if (var5.field2271 != null && var5.field2271.field2449 == arg3) {
            return true;
        } else if (var5.field2294 != null && var5.field2294.field961 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2272; var6++) {
                if (var5.field2284[var6].field2319 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIZILah;)V")
    public static final void method967(int arg0, int arg1, int arg2, boolean arg3, int arg4, class9 arg5) {
        field2847++;
        if (class161.field3317 >= 50 || (arg5.field185 == null || arg5.field185.length <= arg4)) {
            return;
        }
        int var6 = arg5.field185[arg4];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 8;
        int var8 = var6 & 0xF;
        int var9 = var6 >> 4 & 0x7;
        if (var8 == 0) {
            if (arg3) {
                class101.method845(var9, 0, 0, var7);
            }
        } else if (class110.field2471 != 0) {
            class43.field1043[class161.field3317] = var7;
            if (arg2 != -1305870236) {
                method966(-72, -96, -74, 25L);
            }
            int var10 = (arg1 - 64) / 128;
            class21.field498[class161.field3317] = var9;
            class10.field242[class161.field3317] = 0;
            class126.field2778[class161.field3317] = null;
            int var11 = (arg0 - 64) / 128;
            class136.field2948[class161.field3317] = (var10 << 16) + (var11 << 8) + var8;
            class161.field3317++;
        }
    }
}
