import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class171 {

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    private int field3410 = 0;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    private int field3422 = -1;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Ln;")
    private class118 field3404 = new class118();

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "Z")
    public boolean field3428 = false;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    private int field3401;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "[[[I")
    private int[][][] field3419;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[Lcc;")
    private class24[] field3412;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    private int field3413;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field3402 = 0;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[[[I")
    public static int[][][] field3403 = new int[4][13][13];

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "[I")
    public static int[] field3405 = new int[500];

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "Led;")
    private static class43 field3416 = class191.method1219("Choose Option", false);

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field3417 = 0;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "Led;")
    public static class43 field3418 = field3416;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Led;")
    private static class43 field3415 = class191.method1219("Players", false);

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Led;")
    public static class43 field3406 = field3415;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Ln;")
    public static class118 field3407 = new class118();

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "Led;")
    private static class43 field3423 = class191.method1219("To create a new account you need to", false);

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "[I")
    public static int[] field3425 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "Led;")
    public static class43 field3427 = field3423;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "Led;")
    private static class43 field3430 = class191.method1219("red:", false);

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "Led;")
    public static class43 field3424 = field3430;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "Led;")
    public static class43 field3426 = field3430;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "[I")
    public static int[] field3429;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIZIILqh;ILte;)V")
    public static final void method1084(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, class153 arg7, int arg8, class177 arg9) {
        field3411++;
        class23 var10 = class92.method592(arg1, (byte) 127);
        int var11;
        int var12;
        if (arg5 == 1 || arg5 == 3) {
            var12 = var10.field423;
            var11 = var10.field424;
        } else {
            var11 = var10.field423;
            var12 = var10.field424;
        }
        int var13;
        int var14;
        if (arg2 + var12 > 104) {
            var13 = arg2 + 1;
            var14 = arg2;
        } else {
            var13 = (var12 + 1 >> 1) + arg2;
            var14 = arg2 + (var12 >> 1);
        }
        int[][] var15 = class158.field3203[arg6];
        int var16;
        int var17;
        if (arg3 + var11 <= 104) {
            var16 = (var11 + 1 >> 1) + arg3;
            var17 = (var11 >> 1) + arg3;
        } else {
            var17 = arg3;
            var16 = arg3 + 1;
        }
        int var18 = var15[var16][var14] + var15[var17][var14] + var15[var17][var13] + var15[var16][var13] >> 2;
        int var19 = (arg3 << 7) + (var11 << 6);
        int var20 = (arg2 << 7) + (var12 << 6);
        int var21 = (arg5 << 6) + arg0;
        if (var10.field421 == 1) {
            var21 += 256;
        }
        int var22 = (arg1 << 14) + (arg2 << 7) + arg3 + 1073741824;
        if (var10.field422 == 0) {
            var22 += Integer.MIN_VALUE;
        }
        if (arg0 == 22) {
            class92 var23;
            if (var10.field417 == -1 && var10.field438 == null) {
                var23 = var10.method109(var19, -82, arg5, var18, var15, var20, 22);
            } else {
                var23 = new class157(arg1, 22, arg5, arg6, arg3, arg2, var10.field417, true, null);
            }
            arg9.method1140(arg8, arg3, arg2, var18, var23, var22, var21);
            if (var10.field406 == 1) {
                arg7.method973((byte) -18, arg3, arg2);
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class92 var46;
            if (var10.field417 == -1 && var10.field438 == null) {
                var46 = var10.method109(var19, 116, arg5, var18, var15, var20, 10);
            } else {
                var46 = new class157(arg1, 10, arg5, arg6, arg3, arg2, var10.field417, true, null);
            }
            if (var46 != null) {
                arg9.method1132(arg8, arg3, arg2, var18, var11, var12, var46, arg0 == 11 ? 256 : 0, var22, var21);
            }
            if (var10.field406 != 0) {
                arg7.method971(arg2, var10.field396, arg3, (byte) 4, var11, var12);
            }
        } else if (arg0 >= 12) {
            class92 var24;
            if (var10.field417 == -1 && var10.field438 == null) {
                var24 = var10.method109(var19, -113, arg5, var18, var15, var20, arg0);
            } else {
                var24 = new class157(arg1, arg0, arg5, arg6, arg3, arg2, var10.field417, true, null);
            }
            arg9.method1132(arg8, arg3, arg2, var18, 1, 1, var24, 0, var22, var21);
            if (var10.field406 != 0) {
                arg7.method971(arg2, var10.field396, arg3, (byte) -126, var11, var12);
            }
        } else if (arg0 == 0) {
            class92 var25;
            if (var10.field417 == -1 && var10.field438 == null) {
                var25 = var10.method109(var19, -46, arg5, var18, var15, var20, 0);
            } else {
                var25 = new class157(arg1, 0, arg5, arg6, arg3, arg2, var10.field417, true, null);
            }
            arg9.method1138(arg8, arg3, arg2, var18, var25, null, class184.field3625[arg5], 0, var22, var21);
            if (var10.field406 != 0) {
                arg7.method963(-25812, arg5, arg3, arg2, var10.field396, arg0);
            }
        } else if (arg0 == 1) {
            class92 var26;
            if (var10.field417 == -1 && var10.field438 == null) {
                var26 = var10.method109(var19, -48, arg5, var18, var15, var20, 1);
            } else {
                var26 = new class157(arg1, 1, arg5, arg6, arg3, arg2, var10.field417, true, null);
            }
            arg9.method1138(arg8, arg3, arg2, var18, var26, null, class61.field1251[arg5], 0, var22, var21);
            if (var10.field406 != 0) {
                arg7.method963(-25812, arg5, arg3, arg2, var10.field396, arg0);
            }
        } else if (arg0 == 2) {
            int var27 = arg5 + 1 & 0x3;
            class92 var28;
            class92 var29;
            if (var10.field417 == -1 && var10.field438 == null) {
                var28 = var10.method109(var19, -75, arg5 + 4, var18, var15, var20, 2);
                var29 = var10.method109(var19, -119, var27, var18, var15, var20, 2);
            } else {
                var28 = new class157(arg1, 2, arg5 + 4, arg6, arg3, arg2, var10.field417, true, null);
                var29 = new class157(arg1, 2, var27, arg6, arg3, arg2, var10.field417, true, null);
            }
            arg9.method1138(arg8, arg3, arg2, var18, var28, var29, class184.field3625[arg5], class184.field3625[var27], var22, var21);
            if (var10.field406 != 0) {
                arg7.method963(-25812, arg5, arg3, arg2, var10.field396, arg0);
            }
        } else if (arg0 == 3) {
            class92 var30;
            if (var10.field417 == -1 && var10.field438 == null) {
                var30 = var10.method109(var19, 93, arg5, var18, var15, var20, 3);
            } else {
                var30 = new class157(arg1, 3, arg5, arg6, arg3, arg2, var10.field417, true, null);
            }
            arg9.method1138(arg8, arg3, arg2, var18, var30, null, class61.field1251[arg5], 0, var22, var21);
            if (var10.field406 != 0) {
                arg7.method963(-25812, arg5, arg3, arg2, var10.field396, arg0);
            }
        } else if (arg0 == 9) {
            class92 var31;
            if (var10.field417 == -1 && var10.field438 == null) {
                var31 = var10.method109(var19, 107, arg5, var18, var15, var20, arg0);
            } else {
                var31 = new class157(arg1, arg0, arg5, arg6, arg3, arg2, var10.field417, true, null);
            }
            arg9.method1132(arg8, arg3, arg2, var18, 1, 1, var31, 0, var22, var21);
            if (var10.field406 != 0) {
                arg7.method971(arg2, var10.field396, arg3, (byte) 59, var11, var12);
            }
        } else if (arg0 == 4) {
            class92 var32;
            if (var10.field417 == -1 && var10.field438 == null) {
                var32 = var10.method109(var19, 112, arg5, var18, var15, var20, 4);
            } else {
                var32 = new class157(arg1, 4, arg5, arg6, arg3, arg2, var10.field417, true, null);
            }
            arg9.method1115(arg8, arg3, arg2, var18, var32, null, class184.field3625[arg5], 0, 0, 0, var22, var21);
        } else if (arg0 == 5) {
            int var33 = 16;
            int var34 = arg9.method1113(arg8, arg3, arg2);
            if (var34 != 0) {
                var33 = class92.method592(var34 >> 14 & 0x7FFF, (byte) 100).field430;
            }
            class92 var35;
            if (var10.field417 == -1 && var10.field438 == null) {
                var35 = var10.method109(var19, 119, arg5, var18, var15, var20, 4);
            } else {
                var35 = new class157(arg1, 4, arg5, arg6, arg3, arg2, var10.field417, true, null);
            }
            arg9.method1115(arg8, arg3, arg2, var18, var35, null, class184.field3625[arg5], 0, class23.field452[arg5] * var33, field3425[arg5] * var33, var22, var21);
        } else {
            if (arg4) {
                method1086(null, 1, null);
            }
            if (arg0 == 6) {
                int var36 = 8;
                int var37 = arg9.method1113(arg8, arg3, arg2);
                if (var37 != 0) {
                    var36 = class92.method592(var37 >> 14 & 0x7FFF, (byte) 89).field430 / 2;
                }
                class92 var38;
                if (var10.field417 == -1 && var10.field438 == null) {
                    var38 = var10.method109(var19, -68, arg5 + 4, var18, var15, var20, 4);
                } else {
                    var38 = new class157(arg1, 4, arg5 + 4, arg6, arg3, arg2, var10.field417, true, null);
                }
                arg9.method1115(arg8, arg3, arg2, var18, var38, null, 256, arg5, class57.field1117[arg5] * var36, class108.field2060[arg5] * var36, var22, var21);
            } else if (arg0 == 7) {
                int var39 = arg5 + 2 & 0x3;
                class92 var40;
                if (var10.field417 == -1 && var10.field438 == null) {
                    var40 = var10.method109(var19, -41, var39 + 4, var18, var15, var20, 4);
                } else {
                    var40 = new class157(arg1, 4, var39 + 4, arg6, arg3, arg2, var10.field417, true, null);
                }
                arg9.method1115(arg8, arg3, arg2, var18, var40, null, 256, var39, 0, 0, var22, var21);
            } else if (arg0 == 8) {
                int var41 = arg9.method1113(arg8, arg3, arg2);
                int var42 = 8;
                int var43 = arg5 + 2 & 0x3;
                if (var41 != 0) {
                    var42 = class92.method592(var41 >> 14 & 0x7FFF, (byte) 103).field430 / 2;
                }
                class92 var44;
                class92 var45;
                if (var10.field417 == -1 && var10.field438 == null) {
                    var44 = var10.method109(var19, 126, arg5 + 4, var18, var15, var20, 4);
                    var45 = var10.method109(var19, 110, var43 + 4, var18, var15, var20, 4);
                } else {
                    var44 = new class157(arg1, 4, arg5 + 4, arg6, arg3, arg2, var10.field417, true, null);
                    var45 = new class157(arg1, 4, var43 + 4, arg6, arg3, arg2, var10.field417, true, null);
                }
                arg9.method1115(arg8, arg3, arg2, var18, var44, var45, 256, arg5, class57.field1117[arg5] * var42, class108.field2060[arg5] * var42, var22, var21);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method1085(byte arg0) {
        field3407 = null;
        field3427 = null;
        field3406 = null;
        field3423 = null;
        field3415 = null;
        field3425 = null;
        field3426 = null;
        field3430 = null;
        field3418 = null;
        field3429 = null;
        if (arg0 <= -100) {
            field3403 = null;
            field3416 = null;
            field3405 = null;
            field3424 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method1086(String arg0, int arg1, Throwable arg2) {
        field3409++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class16.method71((byte) -123, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (client.field557.field3231 != null) {
                class141 var8 = client.field557.method1012(new URL(client.field557.field3231.getCodeBase(), "clienterror.ws?c=" + class110.field2130 + "&u=" + class9.field162 + "&v1=" + class160.field3235 + "&v2=" + class160.field3232 + "&e=" + var7), arg1 ^ arg1);
                while (var8.field2927 == 0) {
                    class38.method209(1L, arg1 - 4367);
                }
                if (var8.field2927 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2930;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[[I")
    public final int[][] method1087(int arg0, int arg1) {
        field3420++;
        if (arg1 != -2) {
            return null;
        } else if (this.field3413 == this.field3401) {
            this.field3428 = this.field3412[arg0] == null;
            this.field3412[arg0] = class163.field3266;
            return this.field3419[arg0];
        } else if (this.field3401 == 1) {
            this.field3428 = this.field3422 != arg0;
            this.field3422 = arg0;
            return this.field3419[0];
        } else {
            class24 var3 = this.field3412[arg0];
            if (this.field3428 = var3 == null) {
                if (this.field3401 <= this.field3410) {
                    class24 var4 = (class24) this.field3404.method749((byte) 112);
                    var3 = new class24(arg0, var4.field460);
                    this.field3412[var4.field459] = null;
                    var4.method417(118);
                } else {
                    var3 = new class24(arg0, this.field3410);
                    this.field3410++;
                }
                this.field3412[arg0] = var3;
            }
            this.field3404.method752(var3, 22);
            return this.field3419[var3.field460];
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V")
    public final void method1088(boolean arg0) {
        field3408++;
        for (int var2 = 0; var2 < this.field3401; var2++) {
            this.field3419[var2][0] = null;
            this.field3419[var2][1] = null;
            this.field3419[var2][2] = null;
            this.field3419[var2] = null;
        }
        if (arg0) {
            this.method1087(8, 7);
        }
        this.field3419 = null;
        this.field3412 = null;
        this.field3404.method751(-15085);
        this.field3404 = null;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(III)V")
    public class171(int arg0, int arg1, int arg2) {
        this.field3401 = arg0;
        this.field3419 = new int[arg0][3][arg2];
        this.field3412 = new class24[arg1];
        this.field3413 = arg1;
    }
}
