import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class25 extends OutputStream {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field299 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field304 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Lhi;")
    public static class264 field305 = new class264(new byte[5000]);

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field306 = -1;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Z")
    public static boolean field309 = false;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Leg;")
    public static class272 field310 = new class272(30);

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Z")
    public static boolean field311 = false;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "[[[B")
    public static byte[][][] field308;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IJ)V")
    public static final void method175(int arg0, long arg1) {
        field300++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg0 != -12664) {
            method178(55, (byte) -88, -17, 110, -19, false, 8, false, 21, (class264) null, -31, 100);
        }
        while (class33.field399 > var3) {
            if (class140.field2301[var3] == arg1) {
                class93.field1327++;
                class33.field399--;
                for (int var4 = var3; var4 < class33.field399; var4++) {
                    class140.field2301[var4] = class140.field2301[var4 + 1];
                    class242.field3883[var4] = class242.field3883[var4 + 1];
                    class225.field3570[var4] = class225.field3570[var4 + 1];
                }
                class204.field3273 = class64.field906;
                class83.field1148.method1238(210, arg0 ^ 0x8224FCB);
                class83.field1148.method1762(arg1, (byte) -96);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method176(int arg0) {
        field308 = null;
        if (arg0 == 0) {
            field304 = null;
            field305 = null;
            field310 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIIIII)V")
    public static final void method177(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 51) {
            return;
        }
        field303++;
        for (int var6 = arg3; var6 <= (arg1 + arg3); var6++) {
            for (int var11 = arg2; var11 <= (arg2 + arg5); var11++) {
                if (var11 >= 0 && var11 < 104 && var6 >= 0 && var6 < 104) {
                    class109.field1896[arg4][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg3; var7 < arg1 + arg3; var7++) {
            for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
                if (var10 >= 0 && var10 < 104 && var7 >= 0 && var7 < 104) {
                    class229.field3641[arg4][var10][var7] = arg4 <= 0 ? 0 : class229.field3641[arg4 - 1][var10][var7];
                }
            }
        }
        if (arg2 > 0 && arg2 < 104) {
            for (int var8 = arg3 + 1; var8 < (arg1 + arg3); var8++) {
                if (var8 >= 0 && var8 < 104) {
                    class229.field3641[arg4][arg2][var8] = class229.field3641[arg4][arg2 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104) {
                    class229.field3641[arg4][var9][arg3] = class229.field3641[arg4][var9][arg3 - 1];
                }
            }
        }
        if (arg2 < 0 || arg3 < 0 || arg2 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 > 0 && class229.field3641[arg4][arg2 - 1][arg3] != 0) {
                class229.field3641[arg4][arg2][arg3] = class229.field3641[arg4][arg2 - 1][arg3];
                return;
            }
            if (arg3 > 0 && class229.field3641[arg4][arg2][arg3 - 1] != 0) {
                class229.field3641[arg4][arg2][arg3] = class229.field3641[arg4][arg2][arg3 - 1];
                return;
            }
            if (arg2 > 0 && arg3 > 0 && class229.field3641[arg4][arg2 - 1][arg3 - 1] != 0) {
                class229.field3641[arg4][arg2][arg3] = class229.field3641[arg4][arg2 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg2 > 0 && class229.field3641[arg4 - 1][arg2 - 1][arg3] != class229.field3641[arg4][arg2 - 1][arg3]) {
            class229.field3641[arg4][arg2][arg3] = class229.field3641[arg4][arg2 - 1][arg3];
            return;
        }
        if (arg3 > 0 && class229.field3641[arg4][arg2][arg3 - 1] != class229.field3641[arg4 - 1][arg2][arg3 - 1]) {
            class229.field3641[arg4][arg2][arg3] = class229.field3641[arg4][arg2][arg3 - 1];
            return;
        }
        if (arg2 > 0 && arg3 > 0 && class229.field3641[arg4][arg2 - 1][arg3 - 1] != class229.field3641[arg4 - 1][arg2 - 1][arg3 - 1]) {
            class229.field3641[arg4][arg2][arg3] = class229.field3641[arg4][arg2 - 1][arg3 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIIIZIZILhi;II)V")
    public static final void method178(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, boolean arg7, int arg8, class264 arg9, int arg10, int arg11) {
        int var12 = 69 / ((arg1 + 83) / 42);
        field297++;
        if (arg0 < 0 || arg0 >= 104 || arg2 < 0 || arg2 >= 104) {
            while (true) {
                int var15 = arg9.method1779(-112);
                if (var15 == 0) {
                    return;
                }
                if (var15 == 1) {
                    arg9.method1779(-75);
                    return;
                }
                if (var15 <= 49) {
                    arg9.method1779(-52);
                }
            }
        }
        if (!arg5 && !arg7) {
            class134.field2251[arg3][arg0][arg2] = 0;
        }
        while (true) {
            int var13 = arg9.method1779(-122);
            if (var13 == 0) {
                if (arg5) {
                    class229.field3641[0][arg0 + arg10][arg2 + arg11] = class34.field423[0][arg0 + arg10][arg2 + arg11];
                    return;
                } else if (arg3 == 0) {
                    class229.field3641[0][arg0 + arg10][arg2 + arg11] = -class229.method1522((byte) -24, arg8 + 556238, 932731 - -arg6) * 8;
                    return;
                } else {
                    class229.field3641[arg3][arg0 + arg10][arg2 + arg11] = class229.field3641[arg3 - 1][arg0 + arg10][arg2 + arg11] - 240;
                    return;
                }
            }
            if (var13 == 1) {
                int var14 = arg9.method1779(-118);
                if (arg5) {
                    class229.field3641[0][arg0 + arg10][arg2 + arg11] = var14 * 8 + class34.field423[0][arg0 + arg10][arg2 + arg11];
                    return;
                }
                if (var14 == 1) {
                    var14 = 0;
                }
                if (arg3 != 0) {
                    class229.field3641[arg3][arg0 + arg10][arg2 + arg11] = class229.field3641[arg3 - 1][arg0 + arg10][arg2 + arg11] - (var14 * 8);
                    return;
                }
                class229.field3641[0][arg0 + arg10][arg2 + arg11] = -var14 * 8;
                return;
            }
            if (var13 <= 49) {
                if (arg7) {
                    arg9.method1779(-74);
                } else {
                    class265.field4259[arg3][arg0][arg2] = arg9.method1767(16711680);
                    class281.field4501[arg3][arg0][arg2] = (byte) ((var13 - 2) / 4);
                    class197.field3178[arg3][arg0][arg2] = (byte) class204.method1369(3, arg4 + var13 - 2);
                }
            } else if (var13 <= 81) {
                if (!arg5 && !arg7) {
                    class134.field2251[arg3][arg0][arg2] = (byte) (var13 - 49);
                }
            } else if (!arg7) {
                class161.field2624[arg3][arg0][arg2] = (byte) (var13 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field301++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjj;BI)Ljg;")
    public static final class271 method179(int arg0, class134 arg1, byte arg2, int arg3) {
        if (arg2 == 84) {
            field298++;
            return class227.method1499((byte) -39, arg1, arg3, arg0) ? class3.method24(-1140) : null;
        } else {
            return null;
        }
    }
}
