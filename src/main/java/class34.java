import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 {

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Z")
    public static boolean field392 = false;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "Z")
    public static boolean field393 = true;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Loe;")
    public static class137 field394;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BFIFIIIF)[F", line = 8)
    public static final float[] method233(byte arg0, float arg1, int arg2, float arg3, int arg4, int arg5, int arg6, float arg7) {
        field390++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
        var8[0] = var10;
        var8[5] = 0.0F;
        var8[6] = -var11;
        var8[3] = 0.0F;
        var8[7] = 0.0F;
        float var12 = 1.0F - var10;
        var8[4] = 1.0F;
        var8[8] = var10;
        var8[1] = 0.0F;
        var8[2] = var11;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg4 / 32767.0F;
        if (arg0 != 36) {
            method233((byte) 78, -0.6947034F, 77, 0.69500947F, 32, 81, 69, -0.070682876F);
        }
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - var16 * var16)));
        float var19 = (float) Math.sqrt((double) (arg5 * arg5 + arg6 * arg6));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg6) / var19;
                var15 = (float) arg5 / var19;
            }
            var13[7] = -var14 * var18;
            var13[8] = var15 * var15 * var17 + var16;
            var13[1] = var15 * var18;
            var13[5] = var14 * var18;
            var13[3] = -var15 * var18;
            var13[6] = var14 * var15 * var17;
            var13[2] = var14 * var15 * var17;
            var13[4] = var16;
            var13[0] = var14 * var14 * var17 + var16;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[1] * var13[5] + var8[0] * var13[2];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[1] *= arg3;
        var9[3] *= arg1;
        var9[4] *= arg1;
        var9[6] *= arg7;
        var9[0] *= arg3;
        var9[8] *= arg7;
        var9[5] *= arg1;
        var9[2] *= arg3;
        var9[7] *= arg7;
        return var9;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZLkk;I)V", line = 93)
    public static final void method234(boolean arg0, class129 arg1, int arg2) {
        field391++;
        class376 var3 = arg1.method948(false);
        if (arg1.field1981 == 0) {
            class455.field6630 = -1;
            arg1.field1985 = 0;
            class202.field3367 = 0;
            return;
        }
        if (arg1.field1959 != -1 && arg1.field1907 == 0) {
            class189 var4 = class242.field3846.method2238(arg1.field1959, (byte) 78);
            if (arg1.field1983 > 0 && var4.field3187 == 0) {
                arg1.field1985++;
                class202.field3367 = 0;
                class455.field6630 = -1;
                return;
            }
            if (arg1.field1983 <= 0 && var4.field3176 == 0) {
                class455.field6630 = -1;
                arg1.field1985++;
                class202.field3367 = 0;
                return;
            }
        }
        if (arg1.field1904 != -1 && class475.field6854 >= arg1.field1897) {
            class316 var5 = class123.field1839.method1490(arg1.field1904, true);
            if (var5.field4771 && var5.field4775 != -1) {
                class189 var6 = class242.field3846.method2238(var5.field4775, (byte) 78);
                if (arg1.field1983 > 0 && var6.field3187 == 0) {
                    class202.field3367 = 0;
                    class455.field6630 = -1;
                    arg1.field1985++;
                    return;
                }
                if (arg1.field1983 <= 0 && var6.field3176 == 0) {
                    arg1.field1985++;
                    class455.field6630 = -1;
                    class202.field3367 = 0;
                    return;
                }
            }
        }
        if (arg1.field1904 != -1 && arg1.field1897 <= class475.field6854) {
            class316 var7 = class123.field1839.method1490(arg1.field1904, true);
            if (var7.field4771 && var7.field4775 != -1) {
                class189 var8 = class242.field3846.method2238(var7.field4775, (byte) 78);
                if (arg1.field1983 > 0 && var8.field3187 == 0) {
                    class455.field6630 = -1;
                    class202.field3367 = 0;
                    arg1.field1985++;
                    return;
                }
                if (arg1.field1983 <= 0 && var8.field3176 == 0) {
                    class202.field3367 = 0;
                    arg1.field1985++;
                    class455.field6630 = -1;
                    return;
                }
            }
        }
        int var9 = arg1.field5837;
        int var10 = arg1.field5833;
        int var11 = arg1.field1978[arg1.field1981 - 1] * 128 + (arg1.method953(arg2 ^ 0xFFFFFFD2) * 64);
        int var12 = arg1.field1976[arg1.field1981 - 1] * 128 + (arg1.method953(-74) * 64);
        if (var11 > var9) {
            if (var12 > var10) {
                arg1.method947(10240, -2);
            } else if (var10 <= var12) {
                arg1.method947(12288, -2);
            } else {
                arg1.method947(14336, -2);
            }
        } else if (var9 <= var11) {
            if (var10 < var12) {
                arg1.method947(8192, -2);
            } else if (var10 > var12) {
                arg1.method947(0, -2);
            }
        } else if (var12 > var10) {
            arg1.method947(6144, -2);
        } else if (var12 >= var10) {
            arg1.method947(4096, arg2 ^ 0xFFFFFFF6);
        } else {
            arg1.method947(2048, arg2 ^ 0xFFFFFFF6);
        }
        byte var13 = arg1.field1984[arg1.field1981 - 1];
        if (!arg0 && (var11 - var9 > 256 || var11 - var9 < -256 || (var12 - var10) > 256 || var12 - var10 < -256)) {
            arg1.field5833 = var12;
            arg1.field5837 = var11;
            arg1.method952(arg2 - 443277072, arg1.field1901);
            class202.field3367 = 0;
            if (arg1.field1983 > 0) {
                arg1.field1983--;
            }
            arg1.field1981--;
            class455.field6630 = -1;
            return;
        }
        if (arg2 != 8) {
            field392 = true;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg1 instanceof class116) {
            var15 = ((class116) arg1).field1763.field504;
        }
        if (var15) {
            int var16 = arg1.field1901 - arg1.field1949.field1788;
            if (var16 != 0 && arg1.field1968 == -1 && arg1.field1934 != 0) {
                var14 = 2;
            }
            if (!arg0 && arg1.field1981 > 2) {
                var14 = 6;
            }
            if (!arg0 && arg1.field1981 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg0 && arg1.field1981 > 1) {
                var14 = 6;
            }
            if (!arg0 && arg1.field1981 > 2) {
                var14 = 8;
            }
        }
        if (arg1.field1985 > 0 && arg1.field1981 > 1) {
            arg1.field1985--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field5679 != -1) {
            int var17 = var14 << 7;
            if (arg1.field1981 == 1) {
                int var18 = arg1.field1977 * arg1.field1977;
                int var19 = (var11 < arg1.field5837 ? arg1.field5837 - var11 : -arg1.field5837 + var11) << 7;
                int var20 = (var12 >= arg1.field5833 ? var12 - arg1.field5833 : -var12 + arg1.field5833) << 7;
                int var21 = var19 > var20 ? var19 : var20;
                int var22 = var3.field5679 * 2 * var21;
                if (var22 < var18) {
                    arg1.field1977 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg1.field1977 -= var3.field5679;
                    if (arg1.field1977 < 0) {
                        arg1.field1977 = 0;
                    }
                } else if (arg1.field1977 < var17) {
                    arg1.field1977 += var3.field5679;
                    if (arg1.field1977 > var17) {
                        arg1.field1977 = var17;
                    }
                }
            } else if (arg1.field1977 < var17) {
                arg1.field1977 += var3.field5679;
                if (var17 < arg1.field1977) {
                    arg1.field1977 = var17;
                }
            } else if (arg1.field1977 > 0) {
                arg1.field1977 -= var3.field5679;
                if (arg1.field1977 < 0) {
                    arg1.field1977 = 0;
                }
            }
            var14 = arg1.field1977 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class202.field3367 = 0;
        if (var9 < var11) {
            arg1.field5837 += var14;
            class202.field3367 |= 0x4;
            if (var11 < arg1.field5837) {
                arg1.field5837 = var11;
            }
        } else if (var11 < var9) {
            arg1.field5837 -= var14;
            class202.field3367 |= 0x8;
            if (var11 > arg1.field5837) {
                arg1.field5837 = var11;
            }
        }
        if (var10 < var12) {
            class202.field3367 |= 0x1;
            arg1.field5833 += var14;
            if (var12 < arg1.field5833) {
                arg1.field5833 = var12;
            }
        } else if (var12 < var10) {
            class202.field3367 |= 0x2;
            arg1.field5833 -= var14;
            if (arg1.field5833 < var12) {
                arg1.field5833 = var12;
            }
        }
        if (arg1.field5837 == var11 && arg1.field5833 == var12) {
            if (arg1.field1983 > 0) {
                arg1.field1983--;
            }
            arg1.field1981--;
        }
        if (var14 >= 8) {
            class455.field6630 = 2;
        } else {
            class455.field6630 = var13;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V", line = 443)
    public static void method235(int arg0) {
        field394 = null;
        if (arg0 != 8108) {
            method235(126);
        }
    }
}
