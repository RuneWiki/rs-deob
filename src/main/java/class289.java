import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class289 {

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public int field5063 = -1;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "Loa;")
    public static class99 field5057 = class221.method1463(2844, "titlebg");

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Z")
    public static boolean field5055 = false;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Loa;")
    public static class99 field5061 = class221.method1463(2844, "loc");

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Loa;")
    public static class99 field5064 = class221.method1463(2844, "::tele ");

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "Ltf;")
    public static class107 field5058;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Lrb;")
    public class269 field5060;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "[I")
    public int[] field5059;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "[Loa;")
    public class99[] field5062;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public static void method1939(byte arg0) {
        field5058 = null;
        field5064 = null;
        field5057 = null;
        field5061 = null;
        if (arg0 < 23) {
            method1939((byte) 77);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1940(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class253.field4372 * 128) {
            arg0 = class253.field4372 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class172.field3051 * 128) {
            arg2 = class172.field3051 * 128 - 1;
        }
        class247.field4251 = class134.field2339[arg3];
        class193.field3403 = class134.field2344[arg3];
        class57.field963 = class134.field2339[arg4];
        class12.field102 = class134.field2344[arg4];
        class260.field4540 = arg0;
        class240.field4154 = arg1;
        class163.field2869 = arg2;
        class62.field1031 = arg0 / 128;
        class135.field2355 = arg2 / 128;
        class171.field3040 = class62.field1031 - class24.field366;
        if (class171.field3040 < 0) {
            class171.field3040 = 0;
        }
        class273.field4830 = class135.field2355 - class24.field366;
        if (class273.field4830 < 0) {
            class273.field4830 = 0;
        }
        class138.field2441 = class62.field1031 + class24.field366;
        if (class138.field2441 > class253.field4372) {
            class138.field2441 = class253.field4372;
        }
        class149.field2624 = class24.field366 + class135.field2355;
        if (class149.field2624 > class172.field3051) {
            class149.field2624 = class172.field3051;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class24.field366 + class24.field366 + 2; var16++) {
            for (int var19 = 0; var19 < class24.field366 + class24.field366 + 2; var19++) {
                int var20 = (var16 - class24.field366 << 7) - (class260.field4540 & 0x7F);
                int var21 = (var19 - class24.field366 << 7) - (class163.field2869 & 0x7F);
                int var22 = class62.field1031 + var16 - class24.field366;
                int var23 = class135.field2355 + var19 - class24.field366;
                if (var22 >= 0 && var23 >= 0 && var22 < class253.field4372 && var23 < class172.field3051) {
                    int var24;
                    if (class64.field1079 == null) {
                        var24 = class112.field2025[0][var22][var23] + 128 - class240.field4154;
                    } else {
                        var24 = class64.field1079[0][var22][var23] + 128 - class240.field4154;
                    }
                    int var25 = class112.field2025[3][var22][var23] - class240.field4154 - 1000;
                    class74.field1252[var16][var19] = class272.method1802(var20, var25, var24, var21, var15);
                } else {
                    class74.field1252[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class24.field366 + class24.field366 + 1; var17++) {
            for (int var18 = 0; var18 < class24.field366 + class24.field366 + 1; var18++) {
                class196.field3414[var17][var18] = class74.field1252[var17][var18] || class74.field1252[var17 + 1][var18] || class74.field1252[var17][var18 + 1] || class74.field1252[var17 + 1][var18 + 1];
            }
        }
        class167.field2982 = arg6;
        class127.field2208 = arg7;
        class221.field3842 = arg8;
        class230.field3977 = arg9;
        class80.field1421 = arg10;
        class65.method427();
        if (class107.field1925 != null) {
            class12.method82(true);
            class119.method798(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class12.method82(false);
        }
        class119.method798(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1941(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var6 = 0;
        class175.method1174(class124.field2177[arg0], arg4, -7, arg3 - arg2, arg3 - -arg2);
        field5065++;
        int var7 = arg1 * arg1;
        int var8 = arg2 * arg2;
        int var9 = arg1;
        int var10 = var7 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        if (arg5 > -111) {
            return;
        }
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var7 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var7 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg1 - 1) * var15;
        while (var9 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var17 += var16;
                }
            }
            var9--;
            if (var14 < 0) {
                var14 += var19;
                var19 += var16;
                var6++;
                var13 += var17;
                var17 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var20 -= var15;
            int var21 = arg3 + var6;
            int var22 = arg3 - var6;
            var18 -= var15;
            int var23 = arg0 + var9;
            int var24 = arg0 - var9;
            class175.method1174(class124.field2177[var24], arg4, -7, var22, var21);
            class175.method1174(class124.field2177[var23], arg4, -7, var22, var21);
        }
    }
}
