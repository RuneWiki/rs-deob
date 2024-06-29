import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 extends class200 {

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Z")
    public boolean field466 = true;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Liv;")
    public static class64 field465 = new class64(20, 0);

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field468 = 0;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "[[I")
    public static int[][] field481 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field483 = 0;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "F")
    public static float field478;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lvu;")
    public class222 field462;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "[I")
    private int[] field469;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "[I")
    public int[] field472;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "[Ljava/lang/String;")
    private String[] field464;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "[[I")
    private int[][] field471;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lcu;I)V", line = 3)
    public final void method186(class145 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1063((byte) -128);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.field466 = true;
                }
                field463++;
                return;
            }
            this.method192(arg0, var3, -10488);
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)I", line = 23)
    public final int method187(int arg0) {
        if (arg0 == 0) {
            field476++;
            return this.field469 == null ? 0 : this.field469.length;
        } else {
            return 101;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lob;IZ)V", line = 38)
    public static final void method188(class517 arg0, int arg1, boolean arg2) {
        field473++;
        class435 var3 = arg0.method3094(-115);
        if (arg0.field7690 == 0) {
            class465.field6947 = -1;
            class213.field3073 = 0;
            arg0.field7695 = 0;
            return;
        }
        if (~arg0.field7642 != arg1 && arg0.field7664 == 0) {
            class165 var4 = class431.field6419.method1137(66, arg0.field7642);
            if (arg0.field7687 > 0 && var4.field2566 == 0) {
                arg0.field7695++;
                class213.field3073 = 0;
                class465.field6947 = -1;
                return;
            }
            if (arg0.field7687 <= 0 && var4.field2556 == 0) {
                class465.field6947 = -1;
                arg0.field7695++;
                class213.field3073 = 0;
                return;
            }
        }
        if (arg0.field7617 != -1 && arg0.field7679 <= class531.field7821) {
            class110 var5 = class140.field2233.method2249(arg0.field7617, -12502);
            if (var5.field1852 && var5.field1853 != -1) {
                class165 var6 = class431.field6419.method1137(51, var5.field1853);
                if (arg0.field7687 > 0 && var6.field2566 == 0) {
                    arg0.field7695++;
                    class213.field3073 = 0;
                    class465.field6947 = -1;
                    return;
                }
                if (arg0.field7687 <= 0 && var6.field2556 == 0) {
                    class213.field3073 = 0;
                    class465.field6947 = -1;
                    arg0.field7695++;
                    return;
                }
            }
        }
        if (arg0.field7617 != -1 && arg0.field7679 <= class531.field7821) {
            class110 var7 = class140.field2233.method2249(arg0.field7617, -12502);
            if (var7.field1852 && var7.field1853 != -1) {
                class165 var8 = class431.field6419.method1137(-111, var7.field1853);
                if (arg0.field7687 > 0 && var8.field2566 == 0) {
                    class213.field3073 = 0;
                    arg0.field7695++;
                    class465.field6947 = -1;
                    return;
                }
                if (arg0.field7687 <= 0 && var8.field2556 == 0) {
                    class213.field3073 = 0;
                    class465.field6947 = -1;
                    arg0.field7695++;
                    return;
                }
            }
        }
        int var9 = arg0.field6228;
        int var10 = arg0.field6233;
        int var11 = arg0.field7692[arg0.field7690 - 1] * 128 + arg0.method1654(arg1 ^ 0x60) * 64;
        int var12 = arg0.field7694[arg0.field7690 - 1] * 128 + arg0.method1654(126) * 64;
        if (var9 < var11) {
            if (var12 > var10) {
                arg0.method3088(10240, -123);
            } else if (var10 <= var12) {
                arg0.method3088(12288, arg1 ^ 0xFFFFFF8D);
            } else {
                arg0.method3088(14336, -51);
            }
        } else if (var11 < var9) {
            if (var10 < var12) {
                arg0.method3088(6144, -41);
            } else if (var10 > var12) {
                arg0.method3088(2048, -62);
            } else {
                arg0.method3088(4096, arg1 - 58);
            }
        } else if (var12 > var10) {
            arg0.method3088(8192, -73);
        } else if (var10 > var12) {
            arg0.method3088(0, -78);
        }
        byte var13 = arg0.field7691[arg0.field7690 - 1];
        if (!arg2 && var11 - var9 > 256 || (var11 - var9) < -256 || (var12 - var10) > 256 || (var12 - var10) < -256) {
            arg0.field6233 = var12;
            arg0.field6228 = var11;
            arg0.method3085(arg0.field7674, 2090249552);
            class213.field3073 = 0;
            if (arg0.field7687 > 0) {
                arg0.field7687--;
            }
            arg0.field7690--;
            class465.field6947 = -1;
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg0 instanceof class255) {
            var15 = ((class255) arg0).field3677.field810;
        }
        if (var15) {
            int var16 = arg0.field7674 - arg0.field7676.field4965;
            if (var16 != 0 && arg0.field7602 == -1 && arg0.field7638 != 0) {
                var14 = 2;
            }
            if (!arg2 && arg0.field7690 > 2) {
                var14 = 6;
            }
            if (!arg2 && arg0.field7690 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg2 && arg0.field7690 > 1) {
                var14 = 6;
            }
            if (!arg2 && arg0.field7690 > 2) {
                var14 = 8;
            }
        }
        if (arg0.field7695 > 0 && arg0.field7690 > 1) {
            arg0.field7695--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field6464 != -1) {
            int var17 = var14 << 7;
            if (arg0.field7690 == 1) {
                int var18 = arg0.field7685 * arg0.field7685;
                int var19 = (var11 < arg0.field6228 ? arg0.field6228 - var11 : -arg0.field6228 + var11) << 7;
                int var20 = (var12 < arg0.field6233 ? arg0.field6233 - var12 : -arg0.field6233 + var12) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field6464 * var21 * 2;
                if (var22 < var18) {
                    arg0.field7685 /= 2;
                } else if (var21 < var18 / 2) {
                    arg0.field7685 -= var3.field6464;
                    if (arg0.field7685 < 0) {
                        arg0.field7685 = 0;
                    }
                } else if (arg0.field7685 < var17) {
                    arg0.field7685 += var3.field6464;
                    if (var17 < arg0.field7685) {
                        arg0.field7685 = var17;
                    }
                }
            } else if (var17 > arg0.field7685) {
                arg0.field7685 += var3.field6464;
                if (var17 < arg0.field7685) {
                    arg0.field7685 = var17;
                }
            } else if (arg0.field7685 > 0) {
                arg0.field7685 -= var3.field6464;
                if (arg0.field7685 < 0) {
                    arg0.field7685 = 0;
                }
            }
            var14 = arg0.field7685 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class213.field3073 = 0;
        if (var9 < var11) {
            class213.field3073 |= 0x4;
            arg0.field6228 += var14;
            if (arg0.field6228 > var11) {
                arg0.field6228 = var11;
            }
        } else if (var11 < var9) {
            arg0.field6228 -= var14;
            class213.field3073 |= 0x8;
            if (arg0.field6228 < var11) {
                arg0.field6228 = var11;
            }
        }
        if (var10 < var12) {
            arg0.field6233 += var14;
            class213.field3073 |= 0x1;
            if (arg0.field6233 > var12) {
                arg0.field6233 = var12;
            }
        } else if (var10 > var12) {
            arg0.field6233 -= var14;
            class213.field3073 |= 0x2;
            if (var12 > arg0.field6233) {
                arg0.field6233 = var12;
            }
        }
        if (arg0.field6228 == var11 && arg0.field6233 == var12) {
            arg0.field7690--;
            if (arg0.field7687 > 0) {
                arg0.field7687--;
            }
        }
        if (var14 < 8) {
            class465.field6947 = var13;
        } else {
            class465.field6947 = 2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I", line = 370)
    public final int method189(int arg0, int arg1, int arg2) {
        field475++;
        if (this.field469 == null || arg1 < 0 || arg1 > this.field469.length) {
            return -1;
        } else {
            if (arg2 <= 61) {
                this.method186(null, 15);
            }
            return this.field471[arg1] == null || arg0 < 0 || arg0 > this.field471[arg1].length ? -1 : this.field471[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLcu;)Ljava/lang/String;", line = 391)
    public final String method190(byte arg0, class145 arg1) {
        field480++;
        if (arg0 < 67) {
            return null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field469 != null) {
            for (int var4 = 0; var4 < this.field469.length; var4++) {
                var3.append(this.field464[var4]);
                var3.append(this.field462.method1472(arg1.method1108(-119, class315.method2057((byte) -44, this.field469[var4]).field5053), this.field471[var4], 1, this.method195(-127, var4)));
            }
        }
        var3.append(this.field464[this.field464.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Ljava/lang/String;", line = 419)
    public final String method191(int arg0) {
        field461++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field464 == null) {
            return "";
        }
        var2.append(this.field464[0]);
        if (arg0 != -2) {
            return null;
        }
        for (int var3 = 1; var3 < this.field464.length; var3++) {
            var2.append("...");
            var2.append(this.field464[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lcu;II)V", line = 446)
    private final void method192(class145 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field464 = class139.method1043(arg0.method1101((byte) -110), 0, '<');
        } else if (arg1 == 2) {
            int var9 = arg0.method1063((byte) -102);
            this.field472 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field472[var10] = arg0.method1069((byte) -50);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1063((byte) 121);
            this.field469 = new int[var4];
            this.field471 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1069((byte) -111);
                class335 var7 = class315.method2057((byte) -46, var6);
                if (var7 != null) {
                    this.field469[var5] = var6;
                    this.field471[var5] = new int[var7.field5055];
                    for (int var8 = 0; var8 < var7.field5055; var8++) {
                        this.field471[var5][var8] = arg0.method1069((byte) -21);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field466 = false;
        }
        if (arg2 == -10488) {
            field470++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V", line = 526)
    public static void method193(int arg0) {
        field481 = null;
        field465 = null;
        if (arg0 != 1) {
            field478 = 0.8528551F;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 541)
    public final void method194(byte arg0) {
        if (this.field472 != null) {
            for (int var2 = 0; var2 < this.field472.length; var2++) {
                this.field472[var2] = class121.method909(this.field472[var2], 32768);
            }
        }
        field467++;
        if (arg0 != 89) {
            this.method187(20);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Lef;", line = 575)
    public final class335 method195(int arg0, int arg1) {
        int var3 = 1 % ((arg0 + 75) / 42);
        field479++;
        return this.field469 == null || arg1 < 0 || arg1 > this.field469.length ? null : class315.method2057((byte) -30, this.field469[arg1]);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILcu;[I)V", line = 597)
    public final void method196(int arg0, class145 arg1, int[] arg2) {
        field477++;
        if (this.field469 == null) {
            return;
        }
        for (int var4 = 0; this.field469.length > var4 && var4 < arg2.length; var4++) {
            int var5 = this.method195(-122, var4).field5051;
            if (var5 > 0) {
                arg1.method1121(var5, 116, (long) arg2[var4]);
            }
        }
        if (arg0 != 8) {
            this.field471 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZILmq;B)V", line = 629)
    public static final void method197(int arg0, boolean arg1, int arg2, class350 arg3, byte arg4) {
        field482++;
        int var5 = arg3.field5329;
        int var6 = arg3.field5269;
        if (arg3.field5244 == 0) {
            arg3.field5329 = arg3.field5280;
        } else if (arg3.field5244 == 1) {
            arg3.field5329 = arg2 - arg3.field5280;
        } else if (arg3.field5244 == 2) {
            arg3.field5329 = arg3.field5280 * arg2 >> 14;
        }
        if (arg3.field5235 == 0) {
            arg3.field5269 = arg3.field5232;
        } else if (arg3.field5235 == 1) {
            arg3.field5269 = arg0 - arg3.field5232;
        } else if (arg3.field5235 == 2) {
            arg3.field5269 = arg3.field5232 * arg0 >> 14;
        }
        if (arg3.field5244 == 4) {
            arg3.field5329 = arg3.field5274 * arg3.field5269 / arg3.field5298;
        }
        if (arg3.field5235 == 4) {
            arg3.field5269 = arg3.field5329 * arg3.field5298 / arg3.field5274;
        }
        if (class210.field3027 && (client.method1349(arg3).field3585 != 0 || arg3.field5215 == 0)) {
            if (arg3.field5269 < 5 && arg3.field5329 < 5) {
                arg3.field5329 = 5;
                arg3.field5269 = 5;
            } else {
                if (arg3.field5329 <= 0) {
                    arg3.field5329 = 5;
                }
                if (arg3.field5269 <= 0) {
                    arg3.field5269 = 5;
                }
            }
        }
        if (class128.field2041 == arg3.field5219) {
            class28.field579 = arg3;
        }
        if (arg1 && arg3.field5238 != null && (arg3.field5329 != var5 || arg3.field5269 != var6)) {
            class207 var7 = new class207();
            var7.field2996 = arg3.field5238;
            var7.field2995 = arg3;
            class378.field5715.method2417(123, var7);
        }
        if (arg4 != 69) {
            field465 = null;
        }
    }
}
