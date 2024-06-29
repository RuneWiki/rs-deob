import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class62 {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    private int field1055;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[Lae;")
    private class282[] field1050;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Ljf;")
    public static class229 field1056 = class212.method1457((byte) 119, "ondulation:");

    @OriginalMember(owner = "client!de", name = "l", descriptor = "[Lai;")
    public static class126[] field1060 = new class126[28];

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Ljf;")
    private static class229 field1058 = class212.method1457((byte) 94, "Members object");

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Ljf;")
    public static class229 field1053 = field1058;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "J")
    private long field1049;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lae;")
    private class282 field1051;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "[Lrm;")
    public static class248[] field1061;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Lae;", line = 14)
    public final class282 method461(int arg0) {
        field1062++;
        if (this.field1051 == null) {
            return null;
        }
        class282 var2 = this.field1050[(int) ((long) (this.field1055 + arg0) & this.field1049)];
        while (this.field1051 != var2) {
            if (this.field1051.field4845 == this.field1049) {
                class282 var3 = this.field1051;
                this.field1051 = this.field1051.field4837;
                return var3;
            }
            this.field1051 = this.field1051.field4837;
        }
        this.field1051 = null;
        return null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(JI)Lae;", line = 50)
    public final class282 method462(long arg0, int arg1) {
        field1054++;
        this.field1049 = arg0;
        class282 var4 = this.field1050[(int) (arg0 & (long) (this.field1055 - 1))];
        this.field1051 = var4.field4837;
        if (arg1 != -22349) {
            this.method464((class282) null, -90L, 34);
        }
        while (this.field1051 != var4) {
            if (this.field1051.field4845 == arg0) {
                class282 var5 = this.field1051;
                this.field1051 = this.field1051.field4837;
                return var5;
            }
            this.field1051 = this.field1051.field4837;
        }
        this.field1051 = null;
        return null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIBIIIIZ)Z", line = 80)
    public static final boolean method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class137.field2383[var13][var14] = 0;
                class193.field3346[var13][var14] = 99999999;
            }
        }
        if (arg7 < 39) {
            method467(38);
        }
        int var15 = arg0;
        field1057++;
        int var16 = arg5;
        byte var17 = 0;
        boolean var18 = false;
        int var19 = 0;
        class137.field2383[arg5][arg0] = 99;
        class193.field3346[arg5][arg0] = 0;
        class185.field3224[var17] = arg5;
        int var41 = var17 + 1;
        class319.field5403[var17] = arg0;
        int[][] var20 = class80.field1460[class16.field254].field4331;
        label399: while (var41 != var19) {
            var16 = class185.field3224[var19];
            var15 = class319.field5403[var19];
            var19 = var19 + 1 & 0xFFF;
            if (arg2 == var16 && arg10 == var15) {
                var18 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class80.field1460[class16.field254].method1761(arg2, arg4, arg9, arg8 - 1, var15, arg10, var16, (byte) 106)) {
                    var18 = true;
                    break;
                }
                if (arg8 < 10 && class80.field1460[class16.field254].method1768(var15, arg2, var16, arg8 - 1, (byte) -54, arg9, arg10, arg4)) {
                    var18 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg11 != 0 && class80.field1460[class16.field254].method1762(arg11, arg4, arg10, arg3, arg2, var16, var15, (byte) -117, arg6)) {
                var18 = true;
                break;
            }
            int var21 = class193.field3346[var16][var15] + 1;
            if (var16 > 0 && class137.field2383[var16 - 1][var15] == 0 && (var20[var16 - 1][var15] & 0x12C010E) == 0 && (var20[var16 - 1][var15 + arg4 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if ((arg4 - 1) <= var22) {
                        class185.field3224[var41] = var16 - 1;
                        class319.field5403[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class137.field2383[var16 - 1][var15] = 2;
                        class193.field3346[var16 - 1][var15] = var21;
                        break;
                    }
                    if ((var20[var16 - 1][var15 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var16 < 102 && class137.field2383[var16 + 1][var15] == 0 && (var20[arg4 + var16][var15] & 0x12C0183) == 0 && (var20[arg4 + var16][arg4 + var15 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (arg4 - 1 <= var23) {
                        class185.field3224[var41] = var16 + 1;
                        class319.field5403[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class137.field2383[var16 + 1][var15] = 8;
                        class193.field3346[var16 + 1][var15] = var21;
                        break;
                    }
                    if ((var20[arg4 + var16][var15 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var15 > 0 && class137.field2383[var16][var15 - 1] == 0 && (var20[var16][var15 - 1] & 0x12C010E) == 0 && (var20[var16 + arg4 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= (arg4 - 1)) {
                        class185.field3224[var41] = var16;
                        class319.field5403[var41] = var15 - 1;
                        class137.field2383[var16][var15 - 1] = 1;
                        var41 = var41 + 1 & 0xFFF;
                        class193.field3346[var16][var15 - 1] = var21;
                        break;
                    }
                    if ((var20[var16 + var24][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var15 < 102 && class137.field2383[var16][var15 + 1] == 0 && (var20[var16][var15 + arg4] & 0x12C0138) == 0 && (var20[arg4 + var16 - 1][arg4 + var15] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= arg4 - 1) {
                        class185.field3224[var41] = var16;
                        class319.field5403[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class137.field2383[var16][var15 + 1] = 4;
                        class193.field3346[var16][var15 + 1] = var21;
                        break;
                    }
                    if ((var20[var16 + var25][var15 + arg4] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var16 > 0 && var15 > 0 && class137.field2383[var16 - 1][var15 - 1] == 0 && (var20[var16 - 1][var15 + arg4 - 1 - 1] & 0x12C0138) == 0 && (var20[var16 - 1][var15 - 1] & 0x12C010E) == 0 && (var20[var16 + arg4 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= arg4 - 1) {
                        class185.field3224[var41] = var16 - 1;
                        class319.field5403[var41] = var15 - 1;
                        class137.field2383[var16 - 1][var15 - 1] = 3;
                        class193.field3346[var16 - 1][var15 - 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var16 - 1][var15 + var26 - 1] & 0x12C013E) != 0 || (var20[var16 + var26 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var16 < 102 && var15 > 0 && class137.field2383[var16 + 1][var15 - 1] == 0 && (var20[var16 + 1][var15 - 1] & 0x12C010E) == 0 && (var20[arg4 + var16][var15 - 1] & 0x12C0183) == 0 && (var20[arg4 + var16][arg4 + var15 - 1 - 1] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= (arg4 - 1)) {
                        class185.field3224[var41] = var16 + 1;
                        class319.field5403[var41] = var15 - 1;
                        class137.field2383[var16 + 1][var15 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class193.field3346[var16 + 1][var15 - 1] = var21;
                        break;
                    }
                    if ((var20[arg4 + var16][var27 + var15 - 1] & 0x12C01E3) != 0 || (var20[var16 + var27 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var16 > 0 && var15 < 102 && class137.field2383[var16 - 1][var15 + 1] == 0 && (var20[var16 - 1][var15 + 1] & 0x12C010E) == 0 && (var20[var16 - 1][arg4 + var15] & 0x12C0138) == 0 && (var20[var16][arg4 + var15] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (arg4 - 1 <= var28) {
                        class185.field3224[var41] = var16 - 1;
                        class319.field5403[var41] = var15 + 1;
                        class137.field2383[var16 - 1][var15 + 1] = 6;
                        var41 = var41 + 1 & 0xFFF;
                        class193.field3346[var16 - 1][var15 + 1] = var21;
                        break;
                    }
                    if ((var20[var16 - 1][var15 + var28 + 1] & 0x12C013E) != 0 || (var20[var16 + var28 - 1][arg4 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var16 < 102 && var15 < 102 && class137.field2383[var16 + 1][var15 + 1] == 0 && (var20[var16 + 1][var15 + arg4] & 0x12C0138) == 0 && (var20[arg4 + var16][arg4 + var15] & 0x12C01E0) == 0 && (var20[arg4 + var16][var15 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < arg4 - 1; var29++) {
                    if ((var20[var16 - (-var29 - 1)][var15 + arg4] & 0x12C01F8) != 0 || (var20[arg4 + var16][var15 + var29 + 1] & 0x12C01E3) != 0) {
                        continue label399;
                    }
                }
                class185.field3224[var41] = var16 + 1;
                class319.field5403[var41] = var15 + 1;
                class137.field2383[var16 + 1][var15 + 1] = 12;
                class193.field3346[var16 + 1][var15 + 1] = var21;
                var41 = var41 + 1 & 0xFFF;
            }
        }
        class194.field3365 = 0;
        if (!var18) {
            if (!arg12) {
                return false;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg2 - var32; var33 <= (arg2 + var32); var33++) {
                for (int var34 = arg10 - var32; var34 <= arg10 + var32; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class193.field3346[var33][var34] < 100) {
                        int var35 = 0;
                        int var36 = 0;
                        if (var34 < arg10) {
                            var36 = arg10 - var34;
                        } else if (arg11 + arg10 - 1 < var34) {
                            var36 = var34 + 1 - arg10 - arg11;
                        }
                        if (var33 < arg2) {
                            var35 = arg2 - var33;
                        } else if ((arg2 + arg3 - 1) < var33) {
                            var35 = var33 + 1 - arg2 - arg3;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var37 < var30 || var30 == var37 && class193.field3346[var33][var34] < var31) {
                            var15 = var34;
                            var31 = class193.field3346[var33][var34];
                            var30 = var37;
                            var16 = var33;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return false;
            }
            if (arg5 == var16 && arg0 == var15) {
                return false;
            }
            class194.field3365 = 1;
        }
        byte var38 = 0;
        class185.field3224[var38] = var16;
        int var42 = var38 + 1;
        class319.field5403[var38] = var15;
        int var39;
        int var40 = var39 = class137.field2383[var16][var15];
        while (arg5 != var16 || arg0 != var15) {
            if (var39 != var40) {
                class185.field3224[var42] = var16;
                var39 = var40;
                class319.field5403[var42++] = var15;
            }
            if ((var40 & 0x2) != 0) {
                var16++;
            } else if ((var40 & 0x8) != 0) {
                var16--;
            }
            if ((var40 & 0x1) != 0) {
                var15++;
            } else if ((var40 & 0x4) != 0) {
                var15--;
            }
            var40 = class137.field2383[var16][var15];
        }
        if (var42 > 0) {
            class111.method788(var42, arg1, 58);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lae;JI)V", line = 582)
    public final void method464(class282 arg0, long arg1, int arg2) {
        if (arg0.field4832 != null) {
            arg0.method1986((byte) 86);
        }
        field1052++;
        class282 var5 = this.field1050[(int) (arg1 & (long) (this.field1055 - 1))];
        arg0.field4832 = var5.field4832;
        arg0.field4845 = arg1;
        arg0.field4837 = var5;
        if (arg2 <= 5) {
            method465((byte) 123);
        }
        arg0.field4832.field4837 = arg0;
        arg0.field4837.field4832 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 603)
    public static void method465(byte arg0) {
        field1058 = null;
        field1056 = null;
        field1053 = null;
        if (arg0 >= 7) {
            field1060 = null;
            field1061 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 621)
    public static final void method466(byte arg0) {
        if (arg0 <= 57) {
            field1058 = (class229) null;
        }
        class232.field4025 = null;
        class21.field357 = (byte[][]) null;
        class64.field1115 = null;
        class256.field4473 = null;
        class6.field71 = null;
        field1059++;
        class272.field4659 = null;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(I)V", line = 636)
    public class62(int arg0) {
        this.field1055 = arg0;
        this.field1050 = new class282[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class282 var3 = this.field1050[var2] = new class282();
            var3.field4832 = var3;
            var3.field4837 = var3;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Lwa;", line = 669)
    public static final class82 method467(int arg0) {
        field1063++;
        try {
            return arg0 > -58 ? (class82) null : (class82) Class.forName("sh").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }
}
