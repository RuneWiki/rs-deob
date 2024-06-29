import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class311 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Ljf;")
    private static class229 field5225 = class212.method1457((byte) 106, "Choose Option");

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Ljf;")
    public static class229 field5233 = field5225;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field5236 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lpc;")
    public static class91 field5229 = new class91(64);

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Ljf;")
    private static class229 field5238 = class212.method1457((byte) 90, "Loaded title screen");

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Ljf;")
    public static class229 field5237 = field5238;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field5226;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2105(int arg0) {
        class57.field1009.method226((byte) -119);
        field5228++;
        if (arg0 != 1) {
            method2105(57);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILek;I)[Lkb;", line = 24)
    public static final class35[] method2106(int arg0, int arg1, class185 arg2, int arg3) {
        field5231++;
        if (arg3 > -127) {
            field5233 = (class229) null;
        }
        return class208.method1444(arg1, -28236, arg0, arg2) ? class212.method1455(0) : null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[BZ[Lqg;I)V", line = 48)
    public static final void method2107(int arg0, int arg1, byte[] arg2, boolean arg3, class244[] arg4, int arg5) {
        int var6 = arg1;
        class14 var7 = new class14(arg2);
        while (true) {
            int var8 = var7.method134(32767);
            if (var8 == 0) {
                field5230++;
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method104(92);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var7.method93(false);
                int var14 = var13 >> 2;
                int var15 = (var9 & 0xFD6) >> 6;
                int var16 = arg0 + var15;
                int var17 = var13 & 0x3;
                int var18 = arg5 + var11;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class244 var19 = null;
                    if (!arg3) {
                        int var20 = var12;
                        if ((class142.field2464[1][var16][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg4[var20];
                        }
                    }
                    class140.method981(arg3, var12, !arg3, var19, var18, var14, (byte) -109, var17, var12, var6, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V", line = 125)
    public class311() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIIIZIZI)Z", line = 136)
    public static final boolean method2108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, boolean arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class137.field2383[var12][var13] = 0;
                class193.field3346[var12][var13] = 99999999;
            }
        }
        field5227++;
        class137.field2383[arg4][arg1] = 99;
        int var14 = arg4;
        byte var15 = 0;
        class193.field3346[arg4][arg1] = 0;
        class185.field3224[var15] = arg4;
        int var32 = var15 + 1;
        class319.field5403[var15] = arg1;
        int var16 = 0;
        int var17 = arg1;
        int[][] var18 = class80.field1460[class16.field254].field4331;
        boolean var19 = arg8;
        while (var32 != var16) {
            var14 = class185.field3224[var16];
            var17 = class319.field5403[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg5 == var14 && arg0 == var17) {
                var19 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class80.field1460[class16.field254].method1761(arg5, 2, arg7, arg9 - 1, var17, arg0, var14, (byte) 106)) {
                    var19 = true;
                    break;
                }
                if (arg9 < 10 && class80.field1460[class16.field254].method1768(var17, arg5, var14, arg9 - 1, (byte) 46, arg7, arg0, 2)) {
                    var19 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg2 != 0 && class80.field1460[class16.field254].method1762(arg2, 2, arg0, arg3, arg5, var14, var17, (byte) -99, arg6)) {
                var19 = true;
                break;
            }
            int var20 = class193.field3346[var14][var17] + 1;
            if (var14 > 0 && class137.field2383[var14 - 1][var17] == 0 && (var18[var14 - 1][var17] & 0x12C010E) == 0 && (var18[var14 - 1][var17 + 1] & 0x12C0138) == 0) {
                class185.field3224[var32] = var14 - 1;
                class319.field5403[var32] = var17;
                class137.field2383[var14 - 1][var17] = 2;
                var32 = var32 + 1 & 0xFFF;
                class193.field3346[var14 - 1][var17] = var20;
            }
            if (var14 < 102 && class137.field2383[var14 + 1][var17] == 0 && (var18[var14 + 2][var17] & 0x12C0183) == 0 && (var18[var14 + 2][var17 + 1] & 0x12C01E0) == 0) {
                class185.field3224[var32] = var14 + 1;
                class319.field5403[var32] = var17;
                var32 = var32 + 1 & 0xFFF;
                class137.field2383[var14 + 1][var17] = 8;
                class193.field3346[var14 + 1][var17] = var20;
            }
            if (var17 > 0 && class137.field2383[var14][var17 - 1] == 0 && (var18[var14][var17 - 1] & 0x12C010E) == 0 && (var18[var14 + 1][var17 - 1] & 0x12C0183) == 0) {
                class185.field3224[var32] = var14;
                class319.field5403[var32] = var17 - 1;
                class137.field2383[var14][var17 - 1] = 1;
                class193.field3346[var14][var17 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var17 < 102 && class137.field2383[var14][var17 + 1] == 0 && (var18[var14][var17 + 2] & 0x12C0138) == 0 && (var18[var14 + 1][var17 + 2] & 0x12C01E0) == 0) {
                class185.field3224[var32] = var14;
                class319.field5403[var32] = var17 + 1;
                var32 = var32 + 1 & 0xFFF;
                class137.field2383[var14][var17 + 1] = 4;
                class193.field3346[var14][var17 + 1] = var20;
            }
            if (var14 > 0 && var17 > 0 && class137.field2383[var14 - 1][var17 - 1] == 0 && (var18[var14 - 1][var17] & 0x12C0138) == 0 && (var18[var14 - 1][var17 - 1] & 0x12C010E) == 0 && (var18[var14][var17 - 1] & 0x12C0183) == 0) {
                class185.field3224[var32] = var14 - 1;
                class319.field5403[var32] = var17 - 1;
                class137.field2383[var14 - 1][var17 - 1] = 3;
                class193.field3346[var14 - 1][var17 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && var17 > 0 && class137.field2383[var14 + 1][var17 - 1] == 0 && (var18[var14 + 1][var17 - 1] & 0x12C010E) == 0 && (var18[var14 + 2][var17 - 1] & 0x12C0183) == 0 && (var18[var14 + 2][var17] & 0x12C01E0) == 0) {
                class185.field3224[var32] = var14 + 1;
                class319.field5403[var32] = var17 - 1;
                var32 = var32 + 1 & 0xFFF;
                class137.field2383[var14 + 1][var17 - 1] = 9;
                class193.field3346[var14 + 1][var17 - 1] = var20;
            }
            if (var14 > 0 && var17 < 102 && class137.field2383[var14 - 1][var17 + 1] == 0 && (var18[var14 - 1][var17 + 1] & 0x12C010E) == 0 && (var18[var14 - 1][var17 + 2] & 0x12C0138) == 0 && (var18[var14][var17 + 2] & 0x12C01E0) == 0) {
                class185.field3224[var32] = var14 - 1;
                class319.field5403[var32] = var17 + 1;
                class137.field2383[var14 - 1][var17 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class193.field3346[var14 - 1][var17 + 1] = var20;
            }
            if (var14 < 102 && var17 < 102 && class137.field2383[var14 + 1][var17 + 1] == 0 && (var18[var14 + 1][var17 + 2] & 0x12C0138) == 0 && (var18[var14 + 2][var17 + 2] & 0x12C01E0) == 0 && (var18[var14 + 2][var17 + 1] & 0x12C0183) == 0) {
                class185.field3224[var32] = var14 + 1;
                class319.field5403[var32] = var17 + 1;
                var32 = var32 + 1 & 0xFFF;
                class137.field2383[var14 + 1][var17 + 1] = 12;
                class193.field3346[var14 + 1][var17 + 1] = var20;
            }
        }
        class194.field3365 = 0;
        if (!var19) {
            if (!arg10) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg5 - var23; var24 <= arg5 + var23; var24++) {
                for (int var25 = arg0 - var23; var25 <= (arg0 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class193.field3346[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg5 > var24) {
                            var26 = arg5 - var24;
                        } else if (var24 > (arg3 + arg5 - 1)) {
                            var26 = var24 + 1 - arg3 - arg5;
                        }
                        int var27 = 0;
                        if (arg0 > var25) {
                            var27 = arg0 - var25;
                        } else if (var25 > (arg0 + arg2 - 1)) {
                            var27 = var25 + 1 - arg0 - arg2;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class193.field3346[var24][var25]) {
                            var21 = var28;
                            var17 = var25;
                            var14 = var24;
                            var22 = class193.field3346[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg1 == var17) {
                return false;
            }
            class194.field3365 = 1;
        }
        byte var29 = 0;
        class185.field3224[var29] = var14;
        int var33 = var29 + 1;
        class319.field5403[var29] = var17;
        int var30;
        int var31 = var30 = class137.field2383[var14][var17];
        while (arg4 != var14 || arg1 != var17) {
            if (var30 != var31) {
                var30 = var31;
                class185.field3224[var33] = var14;
                class319.field5403[var33++] = var17;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var17++;
            } else if ((var31 & 0x4) != 0) {
                var17--;
            }
            var31 = class137.field2383[var14][var17];
        }
        if (var33 > 0) {
            class111.method788(var33, arg11, -118);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(JIII)Z", line = 531)
    public static final boolean method2109(long arg0, int arg1, int arg2, int arg3) {
        field5234++;
        int var5 = (int) arg0 >> 14 & 0x1F;
        int var6 = (int) arg0 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class83 var8 = class271.method1909(-107, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field1572;
                var9 = var8.field1528;
            } else {
                var9 = var8.field1572;
                var10 = var8.field1528;
            }
            int var11 = var8.field1564;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class329.method2247(2, true, var10, arg1, var11, (byte) -122, 0, class301.field5124.field2018[0], 0, var9, arg3, class301.field5124.field2017[0]);
        } else {
            class329.method2247(2, true, 0, arg1, 0, (byte) 86, var5 + 1, class301.field5124.field2018[0], var6, 0, arg3, class301.field5124.field2017[0]);
        }
        class141.field2445 = class222.field3791;
        client.field4465 = 2;
        class215.field3697 = arg2;
        class52.field904 = class60.field1033;
        return true;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 576)
    public static void method2110(int arg0) {
        if (arg0 <= 48) {
            field5237 = (class229) null;
        }
        field5229 = null;
        field5225 = null;
        field5233 = null;
        field5238 = null;
        field5237 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lkh;I[B)V", line = 598)
    public final void method2111(class14 arg0, int arg1, byte[] arg2) {
        field5232++;
        if (arg0.field174[arg0.field195] != 31 || arg0.field174[arg0.field195 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field5226 == null) {
            this.field5226 = new Inflater(true);
        }
        try {
            this.field5226.setInput(arg0.field174, arg0.field195 + 10, arg0.field174.length + -8 + -arg0.field195 + -10);
            this.field5226.inflate(arg2);
            if (arg1 >= -60) {
                method2109(-47L, 12, 120, -60);
            }
        } catch (Exception var5) {
            this.field5226.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field5226.reset();
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(III)V", line = 630)
    private class311(int arg0, int arg1, int arg2) {
    }
}
