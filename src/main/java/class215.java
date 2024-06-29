import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class215 {

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public int field2861;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public int field2860;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "Lkg;")
    public class215 field2867;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lvj;")
    public class177 field2870;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "[I")
    public static int[] field2859 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "Z")
    public static boolean field2868 = false;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "[B")
    public static byte[] field2871 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "J")
    public static volatile long field2864 = 0L;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public int field2862;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[[IZILii;)V", line = 7)
    public static final void method1265(int arg0, int[][] arg1, boolean arg2, int arg3, class405 arg4) {
        field2865++;
        if (arg3 <= 102) {
            field2859 = null;
        }
        for (int var5 = 0; var5 < arg0; var5++) {
            int[][] var6;
            if (arg1 == null) {
                var6 = null;
            } else {
                var6 = new int[class192.field2574 + 1][class364.field5262 + 1];
                for (int var7 = 0; var7 <= class364.field5262; var7++) {
                    for (int var11 = 0; var11 <= class192.field2574; var11++) {
                        var6[var11][var7] = class331.field4817[var5][var11][var7] - arg1[var11][var7];
                    }
                }
            }
            int var8 = 0;
            int var9 = 0;
            if (!arg2) {
                if (class211.field2801) {
                    var8 |= 0x2;
                }
                if (class213.field2853) {
                    var9 |= 0x8;
                }
                if (class423.field6238 != 0) {
                    if (var5 == 0 || class134.field1867 >= 96) {
                        var9 |= 0x10;
                    }
                    var8 |= 0x1;
                }
            }
            if (class211.field2801) {
                var9 |= 0x7;
            }
            class351 var10 = arg4.method1688(class192.field2574, class364.field5262, class331.field4817[var5], var6, 128, var8, var9);
            class219.method1281(var5, var10);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I", line = 90)
    public static final int method1266(int arg0) {
        if (arg0 != 2) {
            method1265(-62, (int[][]) null, false, -96, (class405) null);
        }
        field2869++;
        if (class103.field1428 == null) {
            return class214.field2857 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V", line = 116)
    public static void method1267(int arg0) {
        field2871 = null;
        if (arg0 != 2) {
            field2866 = 17;
        }
        field2859 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II)V", line = 141)
    public class215(int arg0, int arg1) {
        this.field2861 = arg1;
        this.field2860 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lkg;I)V", line = 149)
    public class215(class215 arg0, int arg1) {
        this.field2867 = arg0;
        this.field2861 = this.field2867.field2861 + arg1;
        this.field2860 = this.field2867.field2860;
        this.field2870 = this.field2867.field2870;
    }
}
