import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class238 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Z")
    public static boolean field3920 = false;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field3923 = 0;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "J")
    public static long field3921 = 0L;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "D")
    public static double field3924 = -1.0D;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lqd;")
    public static class40 field3925 = class147.method1106(" )2> <col=ff9040>", (byte) -114);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZZ)V", line = 7)
    public static final void method1642(boolean arg0, boolean arg1) {
        field3919++;
        byte[][] var2;
        byte var3;
        if (class21.field350 && arg1) {
            var2 = class109.field1903;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class139.field2355;
        }
        if (arg0) {
            method1644(60, -73, -34);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class194.method1385(4);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class125.field2160[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class5.field70.length; var14++) {
                                if (class5.field70[var14] == var13 && var2[var14] != null) {
                                    class41.method377((var12 & 0x7) * 8, (byte) -103, (var11 & 0x7) * 8, arg1, class255.field4247, var2[var14], var9, var10, var4, var5 * 8, var6 * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class227.method1589(var6 * 8, var4, 8, var5 * 8, 8, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 118)
    public static void method1643(int arg0) {
        if (arg0 == 8) {
            field3925 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Lgd;", line = 130)
    public static final class299 method1644(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class299 var4 = var3.field232;
            var3.field232 = null;
            return var4;
        }
    }
}
