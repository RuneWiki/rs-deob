import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class9 {

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Z")
    public boolean field120 = false;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field102 = 0;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[S")
    public static short[] field109 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Z")
    public static boolean field113 = false;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Lna;")
    private static class26 field119 = class69.method505("glow1:", (byte) -118);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lna;")
    public static class26 field105 = field119;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lna;")
    public static class26 field108 = field119;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public int field107;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public int field110;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "[Lpc;")
    public static class91[] field121;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(SI)Z", line = 4)
    public static final boolean method55(short arg0, int arg1) {
        field104++;
        if (arg0 == 47 || arg0 == 5 || arg0 == 43 || arg0 == 35 || arg0 == 58 || arg0 == 22 || arg0 == 40 || arg0 == 3) {
            return true;
        } else if (arg0 == 9 || arg0 == 12 || arg0 == 1006 || arg0 == 1003) {
            return true;
        } else {
            if (arg1 <= 42) {
                field102 = 1;
            }
            if (arg0 == 25 || arg0 == 23 || arg0 == 48 || arg0 == 7 || arg0 == 13) {
                return true;
            } else {
                return arg0 == 8 || arg0 == 32 || arg0 == 28 || arg0 == 59 || arg0 == 51 || arg0 == 41;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLwa;I)V", line = 31)
    public final void method56(byte arg0, class82 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method642((byte) -34);
            if (var4 == 0) {
                field118++;
                if (arg0 > -108) {
                    this.method56((byte) 85, (class82) null, 63);
                }
                return;
            }
            this.method61(var4, arg1, arg2, 95);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([Lbe;ZI)V", line = 61)
    public static final void method57(class297[] arg0, boolean arg1, int arg2) {
        if (!arg1) {
            return;
        }
        field106++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class297 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field4988 == 0) {
                    if (var4.field5068 != null) {
                        method57(var4.field5068, true, arg2);
                    }
                    class174 var5 = (class174) class74.field1132.method1827((long) var4.field5088, 0);
                    if (var5 != null) {
                        class294.method2063(49, arg2, var5.field2721);
                    }
                }
                if (arg2 == 0 && var4.field5010 != null) {
                    class263 var6 = new class263();
                    var6.field4306 = var4.field5010;
                    var6.field4307 = var4;
                    class215.method1442(1073376993, var6);
                }
                if (arg2 == 1 && var4.field4975 != null) {
                    if (var4.field4994 >= 0) {
                        class297 var7 = class178.method1226((byte) 121, var4.field5088);
                        if (var7 == null || var7.field5068 == null || var4.field4994 >= var7.field5068.length || var7.field5068[var4.field4994] != var4) {
                            continue;
                        }
                    }
                    class263 var8 = new class263();
                    var8.field4306 = var4.field4975;
                    var8.field4307 = var4;
                    class215.method1442(1073376993, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIZIIIIII)Z", line = 134)
    public static final boolean method58(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class124.field1923[var12][var13] = 0;
                class314.field5375[var12][var13] = 99999999;
            }
        }
        field117++;
        class124.field1923[arg11][arg3] = 99;
        class314.field5375[arg11][arg3] = 0;
        int var14 = arg3;
        int var15 = arg11;
        byte var16 = 0;
        class190.field2988[var16] = arg11;
        boolean var17 = false;
        int var18 = 0;
        int var32 = var16 + 1;
        class7.field79[var16] = arg3;
        int[][] var19 = class218.field3479[class279.field4651].field3605;
        while (var32 != var18) {
            var15 = class190.field2988[var18];
            var14 = class7.field79[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg8 == var15 && arg4 == var14) {
                var17 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class218.field3479[class279.field4651].method1523(arg4, var15, false, var14, arg8, arg1 - 1, 2, arg7)) {
                    var17 = true;
                    break;
                }
                if (arg1 < 10 && class218.field3479[class279.field4651].method1527(arg4, arg1 - 1, arg8, var14, 2, arg7, var15, 88)) {
                    var17 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg6 != 0 && class218.field3479[class279.field4651].method1533(true, arg8, var14, var15, 2, arg0, arg2, arg4, arg6)) {
                var17 = true;
                break;
            }
            int var20 = class314.field5375[var15][var14] + 1;
            if (var15 > 0 && class124.field1923[var15 - 1][var14] == 0 && (var19[var15 - 1][var14] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + 1] & 0x12C0138) == 0) {
                class190.field2988[var32] = var15 - 1;
                class7.field79[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class124.field1923[var15 - 1][var14] = 2;
                class314.field5375[var15 - 1][var14] = var20;
            }
            if (var15 < 102 && class124.field1923[var15 + 1][var14] == 0 && (var19[var15 + 2][var14] & 0x12C0183) == 0 && (var19[var15 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class190.field2988[var32] = var15 + 1;
                class7.field79[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class124.field1923[var15 + 1][var14] = 8;
                class314.field5375[var15 + 1][var14] = var20;
            }
            if (var14 > 0 && class124.field1923[var15][var14 - 1] == 0 && (var19[var15][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + 1][var14 - 1] & 0x12C0183) == 0) {
                class190.field2988[var32] = var15;
                class7.field79[var32] = var14 - 1;
                class124.field1923[var15][var14 - 1] = 1;
                class314.field5375[var15][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && class124.field1923[var15][var14 + 1] == 0 && (var19[var15][var14 + 2] & 0x12C0138) == 0 && (var19[var15 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class190.field2988[var32] = var15;
                class7.field79[var32] = var14 + 1;
                class124.field1923[var15][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class314.field5375[var15][var14 + 1] = var20;
            }
            if (var15 > 0 && var14 > 0 && class124.field1923[var15 - 1][var14 - 1] == 0 && (var19[var15 - 1][var14] & 0x12C0138) == 0 && (var19[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15][var14 - 1] & 0x12C0183) == 0) {
                class190.field2988[var32] = var15 - 1;
                class7.field79[var32] = var14 - 1;
                class124.field1923[var15 - 1][var14 - 1] = 3;
                class314.field5375[var15 - 1][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && var14 > 0 && class124.field1923[var15 + 1][var14 - 1] == 0 && (var19[var15 + 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + 2][var14 - 1] & 0x12C0183) == 0 && (var19[var15 + 2][var14] & 0x12C01E0) == 0) {
                class190.field2988[var32] = var15 + 1;
                class7.field79[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class124.field1923[var15 + 1][var14 - 1] = 9;
                class314.field5375[var15 + 1][var14 - 1] = var20;
            }
            if (var15 > 0 && var14 < 102 && class124.field1923[var15 - 1][var14 + 1] == 0 && (var19[var15 - 1][var14 + 1] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + 2] & 0x12C0138) == 0 && (var19[var15][var14 + 2] & 0x12C01E0) == 0) {
                class190.field2988[var32] = var15 - 1;
                class7.field79[var32] = var14 + 1;
                class124.field1923[var15 - 1][var14 + 1] = 6;
                class314.field5375[var15 - 1][var14 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && var14 < 102 && class124.field1923[var15 + 1][var14 + 1] == 0 && (var19[var15 + 1][var14 + 2] & 0x12C0138) == 0 && (var19[var15 + 2][var14 + 2] & 0x12C01E0) == 0 && (var19[var15 + 2][var14 + 1] & 0x12C0183) == 0) {
                class190.field2988[var32] = var15 + 1;
                class7.field79[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class124.field1923[var15 + 1][var14 + 1] = 12;
                class314.field5375[var15 + 1][var14 + 1] = var20;
            }
        }
        class271.field4529 = 0;
        if (!var17) {
            if (!arg5) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg8 - var23; var24 <= (arg8 + var23); var24++) {
                for (int var25 = arg4 - var23; var25 <= (arg4 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class314.field5375[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (var24 < arg8) {
                            var26 = arg8 - var24;
                        } else if (var24 > (arg0 + arg8 - 1)) {
                            var26 = var24 + 1 - arg0 - arg8;
                        }
                        if (arg4 > var25) {
                            var27 = arg4 - var25;
                        } else if (var25 > (arg4 + arg6 - 1)) {
                            var27 = var25 + 1 - arg4 - arg6;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && class314.field5375[var24][var25] < var22) {
                            var14 = var25;
                            var22 = class314.field5375[var24][var25];
                            var21 = var28;
                            var15 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg11 == var15 && arg3 == var14) {
                return false;
            }
            class271.field4529 = 1;
        }
        byte var29 = 0;
        class190.field2988[var29] = var15;
        int var33 = var29 + 1;
        class7.field79[var29] = var14;
        int var30;
        int var31 = var30 = class124.field1923[var15][var14];
        if (arg10 <= 2) {
            field105 = (class26) null;
        }
        while (arg11 != var15 || arg3 != var14) {
            if (var30 != var31) {
                class190.field2988[var33] = var15;
                class7.field79[var33++] = var14;
                var30 = var31;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class124.field1923[var15][var14];
        }
        if (var33 > 0) {
            class309.method2162(113, var33, arg9);
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Lek;", line = 529)
    public final class183 method59(int arg0, byte arg1) {
        field115++;
        class183 var3 = (class183) class194.field3016.method1989((long) (arg0 << 16 | this.field110), (byte) 121);
        if (var3 != null) {
            return var3;
        }
        class22.field323.method1900(0, this.field110);
        int var4 = 125 % ((arg1 + 21) / 50);
        class183 var5 = class26.method170(0, true, this.field110, class22.field323);
        if (var5 != null) {
            var5.method1259(class13.field211, class191.field2993, class170.field2671);
            var5.field2352 = var5.field2341;
            var5.field2349 = var5.field2351;
            for (int var6 = 0; var6 < arg0; var6++) {
                var5.method1265();
            }
            class194.field3016.method1978((byte) -125, var5, (long) (arg0 << 16 | this.field110));
        }
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZI)V", line = 561)
    public static final void method60(int arg0, boolean arg1, int arg2) {
        class266.field4363++;
        class114.field1789.method1431(0, 132);
        class114.field1789.method614(arg2, 1437452424);
        field103++;
        if (!arg1) {
            class114.field1789.method635(-1, arg0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILwa;II)V", line = 590)
    private final void method61(int arg0, class82 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field110 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field107 = arg1.method633((byte) 96);
        } else if (arg0 == 3) {
            this.field120 = true;
        } else if (arg0 == 4) {
            this.field110 = -1;
        }
        if (arg3 <= 7) {
            field111 = 123;
        }
        field112++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 627)
    public static void method62(int arg0) {
        field105 = null;
        field109 = null;
        if (arg0 != -27401) {
            field111 = 93;
        }
        field119 = null;
        field121 = null;
        field108 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLbe;)V", line = 643)
    public static final void method63(byte arg0, class297 arg1) {
        if (arg0 != -128) {
            method57((class297[]) null, true, 21);
        }
        field116++;
        int var2 = arg1.field4990;
        if (var2 == 324) {
            if (class135.field2062 == -1) {
                class135.field2062 = arg1.field5028;
                class124.field1933 = arg1.field5107;
            }
            if (class14.field232.field3257) {
                arg1.field5028 = class135.field2062;
            } else {
                arg1.field5028 = class124.field1933;
            }
        } else if (var2 == 325) {
            if (class135.field2062 == -1) {
                class124.field1933 = arg1.field5107;
                class135.field2062 = arg1.field5028;
            }
            if (class14.field232.field3257) {
                arg1.field5028 = class124.field1933;
            } else {
                arg1.field5028 = class135.field2062;
            }
        } else if (var2 == 327) {
            arg1.field4983 = 150;
            arg1.field5120 = (int) (Math.sin((double) class229.field3626 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field5005 = 5;
            arg1.field5004 = -1;
        } else if (var2 == 328) {
            if (class13.field221.field2495 == null) {
                arg1.field5004 = 0;
            } else {
                arg1.field4983 = 150;
                arg1.field5120 = (int) (Math.sin((double) class229.field3626 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field5005 = 5;
                arg1.field5004 = ((int) class13.field221.field2495.method209(arg0 + 18) << 11) + 2047;
                arg1.field5066 = class13.field221.field3930;
                arg1.field5073 = 0;
                arg1.field5117 = class13.field221.field3901;
                arg1.field5093 = class13.field221.field3956;
            }
        }
    }
}
