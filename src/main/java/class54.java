import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class54 {

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    private int field913 = 0;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "[[I")
    public int[][] field905;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lcd;")
    public static class64 field879 = class44.method335((byte) 71, "Konfig geladen)3");

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lcd;")
    private static class64 field900 = class44.method335((byte) 71, "Loaded interfaces");

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lcd;")
    public static class64 field891 = field900;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Lcd;")
    public static class64 field897 = class44.method335((byte) 71, "Liste der Welten geladen");

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "[I")
    public static int[] field887 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Lcd;")
    public static class64 field908 = null;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Lod;")
    public static class24 field895;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "[[S")
    public static short[][] field884;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIZII)V", line = 4)
    public final void method404(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field913;
        int var8 = arg4 - this.field885;
        field911++;
        if (arg5 != -1) {
            return;
        }
        int var9 = 256;
        if (arg3) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < (arg0 + var7); var10++) {
            if (var10 >= 0 && var10 < this.field899) {
                for (int var11 = var8; var11 < (arg2 + var8); var11++) {
                    if (var11 >= 0 && var11 < this.field898) {
                        this.method417(var10, var11, var9, (byte) -23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 46)
    public static final void method405(int arg0) {
        field901++;
        if (class218.field3703 == -1 || class113.field2082 == -1) {
            return;
        }
        int var1 = ((class235.field3969 - class154.field2723) * class161.field2829 >> 16) + class154.field2723;
        class161.field2829 += var1;
        if (class161.field2829 < 65535) {
            class25.field413 = false;
            class180.field3078 = false;
        } else {
            class161.field2829 = 65535;
            if (class25.field413) {
                class180.field3078 = false;
            } else {
                class180.field3078 = true;
            }
            class25.field413 = true;
        }
        float var2 = (float) class161.field2829 / 65535.0F;
        int var3 = class255.field4432 * 2;
        float[] var4 = new float[3];
        int var5 = 78 % ((arg0 + 33) / 36);
        for (int var6 = 0; var6 < 3; var6++) {
            int var7 = class3.field34[class218.field3703][var3][var6] * 3;
            int var8 = class3.field34[class218.field3703][var3 + 1][var6] * 3;
            int var9 = (class3.field34[class218.field3703][var3 + 2][var6] + class3.field34[class218.field3703][var3 + 2][var6] - class3.field34[class218.field3703][var3 + 3][var6]) * 3;
            int var10 = class3.field34[class218.field3703][var3][var6];
            int var11 = var8 - var7;
            int var12 = var7 + var9 - (var8 * 2);
            int var13 = var8 + class3.field34[class218.field3703][var3 + 2][var6] - var9 - var10;
            var4[var6] = (((float) var13 * var2 + (float) var12) * var2 + (float) var11) * var2 + (float) var10;
        }
        class268.field4622 = (int) var4[1] * -1;
        class99.field1791 = (int) var4[0] - (class190.field3269 * 128);
        class119.field2156 = (int) var4[2] - (class121.field2184 * 128);
        float[] var14 = new float[3];
        int var15 = class196.field3348 * 2;
        for (int var16 = 0; var16 < 3; var16++) {
            int var17 = class3.field34[class113.field2082][var15][var16] * 3;
            int var18 = class3.field34[class113.field2082][var15 + 1][var16] * 3;
            int var19 = (class3.field34[class113.field2082][var15 + 2][var16] + class3.field34[class113.field2082][var15 - -2][var16] - class3.field34[class113.field2082][var15 + 3][var16]) * 3;
            int var20 = class3.field34[class113.field2082][var15][var16];
            int var21 = var18 - var17;
            int var22 = var17 + var19 - (var18 * 2);
            int var23 = class3.field34[class113.field2082][var15 + 2][var16] + var18 - var20 - var19;
            var14[var16] = (((float) var23 * var2 + (float) var22) * var2 + (float) var21) * var2 + (float) var20;
        }
        float var24 = var14[0] - var4[0];
        float var25 = (var14[1] - var4[1]) * -1.0F;
        float var26 = var14[2] - var4[2];
        double var27 = Math.sqrt((double) (var24 * var24 + var26 * var26));
        class267.field4606 = (float) Math.atan2((double) var25, var27);
        class125.field2252 = -((float) Math.atan2((double) var24, (double) var26));
        class131.field2336 = (int) ((double) class267.field4606 * 325.949D) & 0x7FF;
        class181.field3102 = (int) ((double) class125.field2252 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBIZI)V", line = 152)
    public final void method406(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field913;
        field890++;
        int var8 = arg1 - this.field885;
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method417(var7, var8, 128, (byte) -23);
                this.method417(var7 - 1, var8, 8, (byte) -23);
            }
            if (arg0 == 1) {
                this.method417(var7, var8, 2, (byte) -23);
                this.method417(var7, var8 + 1, 32, (byte) -23);
            }
            if (arg0 == 2) {
                this.method417(var7, var8, 8, (byte) -23);
                this.method417(var7 + 1, var8, 128, (byte) -23);
            }
            if (arg0 == 3) {
                this.method417(var7, var8, 32, (byte) -23);
                this.method417(var7, var8 - 1, 2, (byte) -23);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method417(var7, var8, 1, (byte) -23);
                this.method417(var7 - 1, var8 + 1, 16, (byte) -23);
            }
            if (arg0 == 1) {
                this.method417(var7, var8, 4, (byte) -23);
                this.method417(var7 + 1, var8 + 1, 64, (byte) -23);
            }
            if (arg0 == 2) {
                this.method417(var7, var8, 16, (byte) -23);
                this.method417(var7 + 1, var8 + -1, 1, (byte) -23);
            }
            if (arg0 == 3) {
                this.method417(var7, var8, 64, (byte) -23);
                this.method417(var7 - 1, var8 + -1, 4, (byte) -23);
            }
        }
        if (arg2 != 108) {
            field879 = (class64) null;
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method417(var7, var8, 130, (byte) -23);
                this.method417(var7 - 1, var8, 8, (byte) -23);
                this.method417(var7, var8 + 1, 32, (byte) -23);
            }
            if (arg0 == 1) {
                this.method417(var7, var8, 10, (byte) -23);
                this.method417(var7, var8 + 1, 32, (byte) -23);
                this.method417(var7 + 1, var8, 128, (byte) -23);
            }
            if (arg0 == 2) {
                this.method417(var7, var8, 40, (byte) -23);
                this.method417(var7 + 1, var8, 128, (byte) -23);
                this.method417(var7, var8 - 1, 2, (byte) -23);
            }
            if (arg0 == 3) {
                this.method417(var7, var8, 160, (byte) -23);
                this.method417(var7, var8 - 1, 2, (byte) -23);
                this.method417(var7 - 1, var8, 8, (byte) -23);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method417(var7, var8, 65536, (byte) -23);
                this.method417(var7 - 1, var8, 4096, (byte) -23);
            }
            if (arg0 == 1) {
                this.method417(var7, var8, 1024, (byte) -23);
                this.method417(var7, var8 + 1, 16384, (byte) -23);
            }
            if (arg0 == 2) {
                this.method417(var7, var8, 4096, (byte) -23);
                this.method417(var7 + 1, var8, 65536, (byte) -23);
            }
            if (arg0 == 3) {
                this.method417(var7, var8, 16384, (byte) -23);
                this.method417(var7, var8 - 1, 1024, (byte) -23);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method417(var7, var8, 512, (byte) -23);
                this.method417(var7 - 1, var8 + 1, 8192, (byte) -23);
            }
            if (arg0 == 1) {
                this.method417(var7, var8, 2048, (byte) -23);
                this.method417(var7 + 1, var8 + 1, 32768, (byte) -23);
            }
            if (arg0 == 2) {
                this.method417(var7, var8, 8192, (byte) -23);
                this.method417(var7 + 1, var8 - 1, 512, (byte) -23);
            }
            if (arg0 == 3) {
                this.method417(var7, var8, 32768, (byte) -23);
                this.method417(var7 - 1, var8 + -1, 2048, (byte) -23);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method417(var7, var8, 66560, (byte) -23);
            this.method417(var7 - 1, var8, 4096, (byte) -23);
            this.method417(var7, var8 + 1, 16384, (byte) -23);
        }
        if (arg0 == 1) {
            this.method417(var7, var8, 5120, (byte) -23);
            this.method417(var7, var8 + 1, 16384, (byte) -23);
            this.method417(var7 + 1, var8, 65536, (byte) -23);
        }
        if (arg0 == 2) {
            this.method417(var7, var8, 20480, (byte) -23);
            this.method417(var7 + 1, var8, 65536, (byte) -23);
            this.method417(var7, var8 - 1, 1024, (byte) -23);
        }
        if (arg0 == 3) {
            this.method417(var7, var8, 81920, (byte) -23);
            this.method417(var7, var8 - 1, 1024, (byte) -23);
            this.method417(var7 - 1, var8, 4096, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V", line = 359)
    public static final void method407(int arg0, int arg1) {
        field912++;
        int var2 = -1 % ((-arg0 - 75) / 33);
        class299 var3 = class158.method1135(arg1, 120, 8);
        var3.method2093((byte) -106);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V", line = 381)
    public static final void method408(int arg0, int arg1, int arg2) {
        int var3 = 96 % ((arg1 + 53) / 42);
        field886++;
        if (class169.field2936 != arg0) {
            class74.field1408 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class74.field1408[var4] = (var4 << 12) / arg0;
            }
            class259.field4467 = arg0 == 64 ? 2048 : 4096;
            class169.field2936 = arg0;
            class132.field2356 = arg0 - 1;
        }
        if (class131.field2320 == arg2) {
            return;
        }
        if (class169.field2936 == arg2) {
            class268.field4615 = class74.field1408;
        } else {
            class268.field4615 = new int[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                class268.field4615[var5] = (var5 << 12) / arg2;
            }
        }
        class74.field1407 = arg2 - 1;
        class131.field2320 = arg2;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIBIIIII)Z", line = 425)
    public final boolean method409(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field882++;
        if (arg5 == 1) {
            if (arg1 == arg7 && arg3 == arg6) {
                return true;
            }
        } else if (arg7 >= arg1 && arg7 <= arg1 + arg5 - 1 && arg3 <= arg3 && arg5 + arg3 - 1 >= arg3) {
            return true;
        }
        if (arg2 != -29) {
            this.method421(-87, 71, 95, -29, -56, -82, 79, -55, -92);
        }
        int var9 = arg7 - this.field913;
        int var10 = arg3 - this.field885;
        int var11 = arg6 - this.field885;
        int var12 = arg1 - this.field913;
        if (arg5 == 1) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field905[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field905[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field905[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field905[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field905[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11 && (this.field905[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field905[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field905[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    if (var9 - 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field905[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field905[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - 1 == var12 && var10 == var11 && (this.field905[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11 && (this.field905[var12][var11] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var9 - 1) == var12 && var10 == var11 && (this.field905[var12][var11] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 + 1) == var11 && (this.field905[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 - 1 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var9 - 1) == var12 && var10 == var11) {
                        return true;
                    }
                    if (var9 == var12 && var10 + 1 == var11 && (this.field905[var12][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var10 == var11 && (this.field905[var12][var11] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var12 && (var10 - 1) == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var12 && (var10 + 1) == var11 && (this.field905[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var12 && var10 - 1 == var11 && (this.field905[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var12 && var10 == var11 && (this.field905[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var12 && var10 == var11 && (this.field905[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg5 - 1;
            int var14 = arg5 + var11 - 1;
            if (arg4 == 0) {
                if (arg0 == 0) {
                    if (var9 - arg5 == var12 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11 && (this.field905[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 - arg5 == var11 && (this.field905[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var12 <= var9 && var13 >= var9 && (var10 + 1) == var11) {
                        return true;
                    }
                    if (var9 - arg5 == var12 && var10 >= var11 && var10 <= var14 && (this.field905[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 <= var10 && var14 >= var10 && (this.field905[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 + 1 == var12 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 + 1) == var11 && (this.field905[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && (var10 - arg5) == var11 && (this.field905[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var12 <= var9 && var9 <= var13 && var10 - arg5 == var11) {
                        return true;
                    }
                    if ((var9 - arg5) == var12 && var11 <= var10 && var14 >= var10 && (this.field905[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var11 <= var10 && var14 >= var10 && (this.field905[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    if ((var9 - arg5) == var12 && var11 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 >= var11 && var10 <= var14 && (this.field905[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && var10 - arg5 == var11 && (this.field905[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var9 - arg5 == var12 && var11 <= var10 && var10 <= var14 && (this.field905[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var10 + 1 == var11) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 >= var11 && var10 <= var14) {
                        return true;
                    }
                    if (var12 <= var9 && var13 >= var9 && (var10 - arg5) == var11 && (this.field905[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var9 - arg5 == var12 && var11 <= var10 && var10 <= var14 && (this.field905[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 + 1 == var11 && (this.field905[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var12 && var9 <= var13 && var10 - arg5 == var11) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var9 - arg5 == var12 && var10 >= var11 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var12 && var13 >= var9 && var10 + 1 == var11 && (this.field905[var9][var11] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var12 && var10 >= var11 && var10 <= var14 && (this.field905[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var9 && var9 <= var13 && (var10 - arg5) == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var12 <= var9 && var13 >= var9 && (var10 + 1) == var11 && (this.field905[var9][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 >= var12 && var9 <= var13 && var10 - arg5 == var11 && (this.field905[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg5 == var12 && var10 >= var11 && var14 >= var10 && (this.field905[var13][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var12 && var11 <= var10 && var10 <= var14 && (this.field905[var12][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZIII)V", line = 797)
    public final void method410(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = 29 / ((-arg0 - 26) / 63);
        int var8 = arg5 - this.field913;
        field909++;
        int var9 = arg3 - this.field885;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method412(var9, 20, var8, 128);
                this.method412(var9, 102, var8 - 1, 8);
            }
            if (arg1 == 1) {
                this.method412(var9, 125, var8, 2);
                this.method412(var9 + 1, 97, var8, 32);
            }
            if (arg1 == 2) {
                this.method412(var9, 93, var8, 8);
                this.method412(var9, 57, var8 + 1, 128);
            }
            if (arg1 == 3) {
                this.method412(var9, 124, var8, 32);
                this.method412(var9 - 1, 9, var8, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method412(var9, 81, var8, 1);
                this.method412(var9 + 1, 72, var8 - 1, 16);
            }
            if (arg1 == 1) {
                this.method412(var9, 29, var8, 4);
                this.method412(var9 + 1, 17, var8 + 1, 64);
            }
            if (arg1 == 2) {
                this.method412(var9, 30, var8, 16);
                this.method412(var9 - 1, 67, var8 + 1, 1);
            }
            if (arg1 == 3) {
                this.method412(var9, 89, var8, 64);
                this.method412(var9 - 1, 20, var8 - 1, 4);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method412(var9, 81, var8, 130);
                this.method412(var9, 105, var8 - 1, 8);
                this.method412(var9 + 1, 44, var8, 32);
            }
            if (arg1 == 1) {
                this.method412(var9, 23, var8, 10);
                this.method412(var9 + 1, 95, var8, 32);
                this.method412(var9, 105, var8 + 1, 128);
            }
            if (arg1 == 2) {
                this.method412(var9, 86, var8, 40);
                this.method412(var9, 7, var8 + 1, 128);
                this.method412(var9 - 1, 112, var8, 2);
            }
            if (arg1 == 3) {
                this.method412(var9, 27, var8, 160);
                this.method412(var9 - 1, 97, var8, 2);
                this.method412(var9, 26, var8 - 1, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method412(var9, 89, var8, 65536);
                this.method412(var9, 119, var8 - 1, 4096);
            }
            if (arg1 == 1) {
                this.method412(var9, 50, var8, 1024);
                this.method412(var9 + 1, 14, var8, 16384);
            }
            if (arg1 == 2) {
                this.method412(var9, 42, var8, 4096);
                this.method412(var9, 123, var8 + 1, 65536);
            }
            if (arg1 == 3) {
                this.method412(var9, 77, var8, 16384);
                this.method412(var9 - 1, 85, var8, 1024);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method412(var9, 126, var8, 512);
                this.method412(var9 + 1, 76, var8 - 1, 8192);
            }
            if (arg1 == 1) {
                this.method412(var9, 43, var8, 2048);
                this.method412(var9 + 1, 47, var8 + 1, 32768);
            }
            if (arg1 == 2) {
                this.method412(var9, 114, var8, 8192);
                this.method412(var9 - 1, 116, var8 + 1, 512);
            }
            if (arg1 == 3) {
                this.method412(var9, 18, var8, 32768);
                this.method412(var9 - 1, 53, var8 - 1, 2048);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method412(var9, 29, var8, 66560);
            this.method412(var9, 18, var8 - 1, 4096);
            this.method412(var9 + 1, 39, var8, 16384);
        }
        if (arg1 == 1) {
            this.method412(var9, 94, var8, 5120);
            this.method412(var9 + 1, 103, var8, 16384);
            this.method412(var9, 18, var8 + 1, 65536);
        }
        if (arg1 == 2) {
            this.method412(var9, 48, var8, 20480);
            this.method412(var9, 95, var8 + 1, 65536);
            this.method412(var9 - 1, 96, var8, 1024);
        }
        if (arg1 == 3) {
            this.method412(var9, 113, var8, 81920);
            this.method412(var9 - 1, 33, var8, 1024);
            this.method412(var9, 99, var8 - 1, 4096);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILqm;)V", line = 1008)
    public static final void method411(int arg0, class222 arg1) {
        field907++;
        if (class251.field4378) {
            return;
        }
        if (class123.field2216) {
            class21.method201();
        } else {
            class210.method1457();
        }
        class265.field4558 = class185.method1311(class34.field555, arg0 + 28778, arg1);
        int var2 = class58.field960;
        int var3 = var2 * 956 / 503;
        class265.field4558.method309((class13.field290 - var3) / 2, 0, var3, var2);
        class164.field2881 = class65.method548(arg1, -23677, class226.field3847);
        class164.field2881.method279(class13.field290 / 2 - class164.field2881.field3008 / 2, 18);
        if (arg0 == -28901) {
            class251.field4378 = true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)V", line = 1044)
    private final void method412(int arg0, int arg1, int arg2, int arg3) {
        this.field905[arg2][arg0] = class224.method1614(this.field905[arg2][arg0], ~arg3);
        field892++;
        if (arg1 < 3) {
            field895 = (class24) null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 1055)
    public final void method413(byte arg0) {
        if (arg0 > -94) {
            field884 = (short[][]) ((short[][]) null);
        }
        for (int var2 = 0; var2 < this.field899; var2++) {
            for (int var3 = 0; var3 < this.field898; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field899 - 5) || this.field898 - 5 <= var3) {
                    this.field905[var2][var3] = 16777215;
                } else {
                    this.field905[var2][var3] = 16777216;
                }
            }
        }
        field904++;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)V", line = 1088)
    public final void method414(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field885;
        field889++;
        if (arg0 == -1) {
            int var5 = arg1 - this.field913;
            this.field905[var5][var4] = class224.method1614(this.field905[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIBII)Z", line = 1107)
    private final boolean method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        if (arg7 < 32) {
            return true;
        }
        field903++;
        int var11 = arg4 + arg6;
        int var12 = arg2 + arg3;
        int var13 = arg1 + arg9;
        int var14 = arg5 + arg0;
        if (arg9 <= arg2 && arg2 < var13) {
            if (arg5 == var11 && (arg8 & 0x4) == 0) {
                int var15 = var12 > var13 ? var13 : var12;
                for (int var16 = arg2; var16 < var15; var16++) {
                    if ((this.field905[var16 - this.field913][var11 - this.field885 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var14 && (arg8 & 0x1) == 0) {
                int var17 = arg2;
                int var18 = var12 <= var13 ? var12 : var13;
                while (var17 < var18) {
                    if ((this.field905[var17 - this.field913][arg4 - this.field885] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg9 < var12 && var13 >= var12) {
            if (arg5 == var11 && (arg8 & 0x4) == 0) {
                for (int var19 = arg9; var19 < var12; var19++) {
                    if ((this.field905[var19 - this.field913][var11 - (this.field885 + 1)] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var14 && (arg8 & 0x1) == 0) {
                for (int var20 = arg9; var20 < var12; var20++) {
                    if ((this.field905[var20 - this.field913][arg4 - this.field885] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg5 <= arg4 && arg4 < var14) {
            if (arg9 == var12 && (arg8 & 0x8) == 0) {
                int var21 = arg4;
                int var22 = var14 < var11 ? var14 : var11;
                while (var22 > var21) {
                    if ((this.field905[var12 - (this.field913 + 1)][var21 - this.field885] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg2 == var13 && (arg8 & 0x2) == 0) {
                int var23 = arg4;
                int var24 = var14 >= var11 ? var11 : var14;
                while (var24 > var23) {
                    if ((this.field905[arg2 - this.field913][var23 - this.field885] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg5 < var11 && var14 >= var11) {
            if (arg9 == var12 && (arg8 & 0x8) == 0) {
                for (int var25 = arg5; var25 < var11; var25++) {
                    if ((this.field905[var12 - this.field913 - 1][var25 - this.field885] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var13 && (arg8 & 0x2) == 0) {
                for (int var26 = arg5; var26 < var11; var26++) {
                    if ((this.field905[arg2 - this.field913][var26 - this.field885] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIB)Z", line = 1271)
    public final boolean method416(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field894++;
        if (arg1 == arg2 && arg0 == arg3) {
            return true;
        }
        int var6 = arg1 - this.field913;
        int var7 = arg0 - this.field885;
        if (var6 < 0 || this.field899 <= var6 || var7 < 0 || var7 >= this.field898) {
            return false;
        } else if (arg4 >= -62) {
            return false;
        } else {
            int var8 = arg3 - this.field885;
            int var9 = arg2 - this.field913;
            int var10;
            if (var6 > var9) {
                var10 = var6 - var9;
            } else {
                var10 = var9 - var6;
            }
            int var11;
            if (var7 > var8) {
                var11 = var7 - var8;
            } else {
                var11 = var8 - var7;
            }
            if (var10 > var11) {
                int var12 = 32768;
                int var13 = var11 * 65536 / var10;
                while (var6 != var9) {
                    if (var6 > var9) {
                        if ((this.field905[var9][var8] & 0x12C0108) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var6) {
                        if ((this.field905[var9][var8] & 0x12C0180) != 0) {
                            return false;
                        }
                        var9--;
                    }
                    var12 += var13;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var7 > var8) {
                            if ((this.field905[var9][var8] & 0x12C0102) != 0) {
                                return false;
                            }
                            var8++;
                        } else if (var7 < var8) {
                            if ((this.field905[var9][var8] & 0x12C0120) != 0) {
                                return false;
                            }
                            var8--;
                        }
                    }
                }
            } else {
                int var14 = var10 * 65536 / var11;
                int var15 = 32768;
                while (var7 != var8) {
                    if (var7 > var8) {
                        if ((this.field905[var9][var8] & 0x12C0102) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var7 < var8) {
                        if ((this.field905[var9][var8] & 0x12C0120) != 0) {
                            return false;
                        }
                        var8--;
                    }
                    var15 += var14;
                    if (var15 >= 65536) {
                        var15 -= 65536;
                        if (var9 < var6) {
                            if ((this.field905[var9][var8] & 0x12C0108) != 0) {
                                return false;
                            }
                            var9++;
                        } else if (var6 < var9) {
                            if ((this.field905[var9][var8] & 0x12C0180) != 0) {
                                return false;
                            }
                            var9--;
                        }
                    }
                }
            }
            return (this.field905[var6][var7] & 0x1240100) == 0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIB)V", line = 1428)
    private final void method417(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == -23) {
            this.field905[arg0][arg1] = class11.method91(this.field905[arg0][arg1], arg2);
            field906++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V", line = 1440)
    public static final void method418(int arg0, int arg1) {
        class122.field2197 = 0;
        class121.field2185 = false;
        if (arg1 != 1382) {
            method426((class222) null, (byte) -124, 3);
        }
        field881++;
        class93.field1735 = -1;
        class238.field4072 = 1;
        class17.field332 = arg0;
        class66.field1314 = -1;
        class124.field2242 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)V", line = 1460)
    public final void method419(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field885;
        int var5 = arg0 - this.field913;
        this.field905[var5][var4] = class11.method91(this.field905[var5][var4], 262144);
        if (arg1 < 52) {
            field879 = (class64) null;
        }
        field888++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIZI)V", line = 1482)
    public final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg2 - this.field913;
        int var9 = arg6 - this.field885;
        if (arg1 <= 54) {
            return;
        }
        field896++;
        int var10 = 256;
        if (arg5) {
            var10 += 131072;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg0;
            arg0 = arg4;
            arg4 = var11;
        }
        for (int var12 = var8; var12 < (arg0 + var8); var12++) {
            if (var12 >= 0 && var12 < this.field899) {
                for (int var13 = var9; var13 < var9 + arg4; var13++) {
                    if (var13 >= 0 && var13 < this.field898) {
                        this.method412(var13, 21, var12, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIIII)Z", line = 1533)
    public final boolean method421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field883++;
        if (arg0 <= 1) {
            int var10 = arg5 + arg4 - 1;
            int var11 = arg7 - (-arg3 - arg6);
            if (arg5 <= arg8 && var10 >= arg8 && arg7 <= arg2 && arg2 <= var11) {
                return true;
            } else if ((arg5 - 1) == arg8 && arg7 <= arg2 && var11 >= arg2 && (this.field905[arg8 - this.field913][arg2 - this.field885] & 0x8) == 0 && (arg1 & 0x8) == 0) {
                return true;
            } else if ((var10 + 1) == arg8 && arg2 >= arg7 && var11 >= arg2 && (this.field905[arg8 - this.field913][arg2 - this.field885] & 0x80) == 0 && (arg1 & 0x2) == 0) {
                return true;
            } else if ((arg7 - 1) == arg2 && arg5 <= arg8 && arg8 <= var10 && (this.field905[arg8 - this.field913][arg2 - this.field885] & 0x2) == 0 && (arg1 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg2 && arg8 >= arg5 && arg8 <= var10 && (this.field905[arg8 - this.field913][arg2 - this.field885] & 0x20) == 0 && (arg1 & 0x1) == 0;
            }
        } else if (this.method425(arg8, arg7, arg2, arg4, arg0, arg0, (byte) -126, arg3, arg5)) {
            return true;
        } else {
            return this.method415(arg3, arg4, arg8, arg0, arg2, arg7, arg0, (byte) 76, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIII)Z", line = 1575)
    public final boolean method422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field910++;
        if (arg3 == 1) {
            if (arg2 == arg5 && arg1 == arg4) {
                return true;
            }
        } else if (arg2 <= arg5 && arg5 <= (arg2 + arg3 - 1) && arg1 <= arg1 && (arg1 + arg3 - 1) >= arg1) {
            return true;
        }
        int var9 = arg1 - this.field885;
        int var10 = arg4 - this.field885;
        if (arg0 != 8) {
            this.method419(27, (byte) 78, -92);
        }
        int var11 = arg2 - this.field913;
        int var12 = arg5 - this.field913;
        if (arg3 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field905[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field905[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field905[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field905[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field905[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field905[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field905[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field905[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field905[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var9 - 1) == var10 && (this.field905[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field905[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field905[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 - (1 - arg3);
            int var14 = arg3 + var10 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var12 + 1 == var11 && var10 <= var9 && var14 >= var9 && (this.field905[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 - arg3 == var10 && (this.field905[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var12 - arg3) == var11 && var10 <= var9 && var9 <= var14 && (this.field905[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var9 - arg3 == var10 && (this.field905[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var12 - arg3 == var11 && var9 >= var10 && var9 <= var14 && (this.field905[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var9 + 1 == var10 && (this.field905[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var12 + 1) == var11 && var9 >= var10 && var14 >= var9 && (this.field905[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var9 + 1 == var10 && (this.field905[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var12 >= var11 && var12 <= var13 && (var9 + 1) == var10 && (this.field905[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var11 && var12 <= var13 && (var9 - arg3) == var10 && (this.field905[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg3 == var11 && var10 <= var9 && var14 >= var9 && (this.field905[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 >= var10 && var9 <= var14 && (this.field905[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 1765)
    public static void method423(int arg0) {
        field879 = null;
        field884 = (short[][]) null;
        field900 = null;
        field897 = null;
        field891 = null;
        if (arg0 != -20260) {
            field897 = (class64) null;
        }
        field887 = null;
        field895 = null;
        field908 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IBI)V", line = 1783)
    public final void method424(int arg0, byte arg1, int arg2) {
        int var4 = -61 % ((arg1 + 60) / 58);
        int var5 = arg0 - this.field885;
        field878++;
        int var6 = arg2 - this.field913;
        this.field905[var6][var5] = class11.method91(this.field905[var6][var5], 2097152);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIBII)Z", line = 1813)
    private final boolean method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field880++;
        if (arg0 < (arg3 + arg8) && arg8 < arg0 + arg4) {
            if (arg6 > -125) {
                this.method413((byte) 1);
            }
            return arg2 < (arg1 + arg7) && arg1 < arg2 + arg5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lqm;BI)[Lnm;", line = 1830)
    public static final class176[] method426(class222 arg0, byte arg1, int arg2) {
        field902++;
        if (arg1 > -65) {
            method405(-73);
        }
        return class56.method432(arg0, arg2, 2011695404) ? class213.method1500((byte) -48) : null;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(II)V", line = 1855)
    public class54(int arg0, int arg1) {
        this.field898 = arg1;
        this.field899 = arg0;
        this.field905 = new int[this.field899][this.field898];
        this.field885 = 0;
        this.method413((byte) -104);
    }
}
