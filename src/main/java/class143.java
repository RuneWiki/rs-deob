import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class143 extends class51 {

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    private int field2505 = -32768;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "Lke;")
    public static class256 field2504 = class316.method2202("D-Bmarrage de la librairie 3D", 27626);

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field2511 = 0;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public int field2508;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "[Lrm;")
    public static class171[] field2502;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIJILfk;)V", line = 4)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class283 arg10) {
        field2507++;
        class26 var13 = class254.method1753(this.field2508, true).method262(this.field2503, (class117) null, false, 0);
        if (var13 != null) {
            var13.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field2505 = var13.method154();
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()I", line = 19)
    public final int method154() {
        field2509++;
        return this.field2505;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)Lsk;", line = 30)
    public static final class269 method1044(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4641; var4++) {
            class269 var5 = var3.field4624[var4];
            if ((var5.field4601 >> 29 & 0x3L) == 2L && var5.field4594 == arg1 && var5.field4587 == arg2) {
                class316.method2199(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V", line = 72)
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2510++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 79)
    public static void method1045(boolean arg0) {
        if (arg0) {
            field2511 = 9;
        }
        field2504 = null;
        field2502 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)I", line = 92)
    public static final int method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg0;
            arg0 = arg3;
            arg3 = var8;
        }
        field2501++;
        if (var7 == 0) {
            return arg2;
        }
        if (arg6 != 2) {
            field2502 = (class171[]) null;
        }
        if (var7 == 1) {
            return 1 - (arg0 + arg5 - 7);
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg3;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ[Lsd;IB[B)V", line = 128)
    public static final void method1047(int arg0, boolean arg1, class37[] arg2, int arg3, byte arg4, byte[] arg5) {
        if (arg4 <= 68) {
            method1044(-38, 75, 10);
        }
        class41 var6 = new class41(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method306(false);
            if (var8 == 0) {
                field2506++;
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method354((byte) -126);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var6.method357(false);
                int var14 = var13 & 0x3;
                int var15 = arg0 + var11;
                int var16 = arg3 + var12;
                int var17 = var9 >> 12;
                int var18 = var13 >> 2;
                if (var16 > 0 && var15 > 0 && var16 < 103 && var15 < 103) {
                    class37 var19 = null;
                    if (!arg1) {
                        int var20 = var17;
                        if ((class308.field5296[1][var16][var15] & 0x2) == 2) {
                            var20 = var17 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class290.method2019(var15, var14, !arg1, var18, var7, var17, var19, (byte) 102, arg1, var17, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 206)
    public static final void method1048(int arg0) {
        if (arg0 != 1) {
            method1045(false);
        }
        int var1 = class137.field2389;
        int var2 = class148.field2609;
        int var3 = class85.field1538;
        field2500++;
        int var4 = 6116423;
        int var5 = class173.field3074;
        if (class253.field4323) {
            class60.method482(var1, var2, var3, var5, var4);
            class60.method482(var1 + 1, var2 - -1, var3 - 2, 16, 0);
            class60.method474(var1 + 1, var2 - -18, var3 - 2, var5 + -19, 0);
        } else {
            class178.method1299(var1, var2, var3, var5, var4);
            class178.method1299(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class178.method1301(var1 + 1, var2 - -18, var3 - 2, var5 + -19, 0);
        }
        class17.field215.method2042(class64.field1142, var1 + 3, var2 + 14, var4, -1);
        int var6 = class208.field3762;
        int var7 = class286.field4963;
        for (int var8 = 0; var8 < class17.field244; var8++) {
            int var9 = (class17.field244 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var7 && var7 < (var1 + var3) && var6 > var9 - 13 && var9 + 3 > var6) {
                var10 = 16776960;
            }
            class17.field215.method2042(class191.method1387(var8, (byte) -104), var1 + 3, var9, var10, 0);
        }
        class96.method692(class173.field3074, class85.field1538, class137.field2389, class148.field2609, -106);
    }
}
