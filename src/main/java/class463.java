import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class463 {

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[B")
    private byte[] field6614;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[I")
    private int[] field6611;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[I")
    private int[] field6616;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lsq;")
    public static class178 field6615 = new class178(10, 2, 2, 0);

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "[F")
    public static float[] field6620 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Lpia;")
    public static class94 field6619 = new class94(35, 11);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Ldea;")
    public static class246 field6618;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[Lbk;")
    public static class374[] field6621;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lha;IIIIIBI)V")
    public static final void method2815(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field6617++;
        class574.field8144 = arg0;
        class624.field8947 = class574.field8144.method352();
        class541.field7790 = class574.field8144.method352();
        class227.field2589 = class574.field8144.method352();
        class261.field3244 = 0;
        class3.field27 = 1;
        class603.field8573 = arg5;
        class459.field6559 = arg2;
        class515.field7347 = 0;
        class125.field1313 = arg4;
        int var8 = 33 / ((arg6 - 45) / 48);
        class541.field7787 = arg1;
        class688.field9708 = null;
        class85.method598(arg7, -1, arg3);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method2816(boolean arg0) {
        field6618 = null;
        field6621 = null;
        field6620 = null;
        field6619 = null;
        field6615 = null;
        if (!arg0) {
            field6620 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lha;B)V")
    public static final void method2817(class58 arg0, byte arg1) {
        if (class149.field1652) {
            class68.method498(arg0, (byte) -80);
        } else {
            class149.method924(false, arg0);
        }
        if (arg1 != 70) {
            method2815(null, 26, 109, -43, 23, 115, (byte) -92, 63);
        }
        field6608++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[B)[B")
    public static final byte[] method2818(int arg0, int arg1, byte[] arg2) {
        if (arg1 != 11585) {
            method2820(-128, false);
        }
        field6606++;
        byte[] var3 = new byte[arg0];
        class143.method894(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I[B[BIII)I")
    public final int method2819(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field6610++;
        int var7 = -112 / ((arg0 - 11) / 43);
        int var8 = 0;
        int var9 = arg3 << 3;
        int var10 = arg4 + arg5;
        while (var10 > arg4) {
            int var11 = arg2[arg4] & 0xFF;
            int var12 = this.field6611[var11];
            byte var13 = this.field6614[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 >> 3;
            int var15 = var9 & 0x7;
            int var16 = var8 & -var15 >> 31;
            int var17 = (var13 + var15 - 1 >> 3) + var14;
            int var18 = var15 + 24;
            arg1[var14] = (byte) (var8 = class695.method3919(var16, var12 >>> var18));
            if (var17 > var14) {
                var14++;
                var15 = var18 - 8;
                arg1[var14] = (byte) (var8 = var12 >>> var15);
                if (var17 > var14) {
                    var14++;
                    var15 -= 8;
                    arg1[var14] = (byte) (var8 = var12 >>> var15);
                    if (var14 < var17) {
                        var14++;
                        var15 -= 8;
                        arg1[var14] = (byte) (var8 = var12 >>> var15);
                        if (var14 < var17) {
                            var14++;
                            var15 -= 8;
                            arg1[var14] = (byte) (var8 = var12 << -var15);
                        }
                    }
                }
            }
            var9 += var13;
            arg4++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2820(int arg0, boolean arg1) {
        field6613++;
        if (arg0 != 1) {
            method2816(true);
        }
        boolean var2 = class275.field3370.method358();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class275.field3370.method351();
        } else if (!class275.field3370.method431()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class654.field9334.method3924(true, class654.field9334.field9826, arg1 ? 1 : 0);
            class37.method168((byte) 114);
            return true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
    public static final String method2821(byte[] arg0, int arg1, byte arg2, int arg3) {
        field6612++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        if (arg2 != -39) {
            field6618 = null;
        }
        int var6 = arg1;
        int var7 = arg1 + arg3;
        while (var6 < var7) {
            int var8 = arg0[var6++] & 0xFF;
            int var10;
            if (var8 >= 128) {
                if (var8 < 192) {
                    var10 = 65533;
                } else if (var8 >= 224) {
                    if (var8 >= 240) {
                        if (var8 >= 248) {
                            var10 = 65533;
                        } else if (var7 > (var6 + 2) && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128 && (arg0[var6 + 2] & 0xC0) == 128) {
                            int var9 = arg0[var6++] & 0x3F << 12 | (var8 & 0x7) << 18 | (arg0[var6++] & 0x3F) << 6 | arg0[var6++] & 0x3F;
                            if (var9 >= 65536 && var9 <= 1114111) {
                                var10 = 65533;
                            } else {
                                var10 = 65533;
                            }
                        } else {
                            var10 = 65533;
                        }
                    } else if (var7 > (var6 + 1) && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128) {
                        var10 = arg0[var6++] & 0x3F << 6 | (var8 & 0xF) << 12 | arg0[var6++] & 0x3F;
                        if (var10 < 2048) {
                            var10 = 65533;
                        }
                    } else {
                        var10 = 65533;
                    }
                } else if (var7 > var6 && (arg0[var6] & 0xC0) == 128) {
                    var10 = (var8 & 0x1F) << 6 | arg0[var6++] & 0x3F;
                    if (var10 < 128) {
                        var10 = 65533;
                    }
                } else {
                    var10 = 65533;
                }
            } else if (var8 == 0) {
                var10 = 65533;
            } else {
                var10 = var8;
            }
            var4[var5++] = (char) var10;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[B[BII)I")
    public final int method2822(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field6609++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg5;
        int var8 = arg1 + arg4;
        int var9 = arg0;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var7 = this.field6616[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field6616[var7]) < 0) {
                arg2[arg4++] = (byte) (~var11);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field6616[var7];
            }
            int var12;
            if ((var12 = this.field6616[var7]) < 0) {
                arg2[arg4++] = (byte) (~var12);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field6616[var7];
            }
            int var13;
            if ((var13 = this.field6616[var7]) < 0) {
                arg2[arg4++] = (byte) (~var13);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field6616[var7];
            }
            int var14;
            if ((var14 = this.field6616[var7]) < 0) {
                arg2[arg4++] = (byte) (~var14);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field6616[var7];
            }
            int var15;
            if ((var15 = this.field6616[var7]) < 0) {
                arg2[arg4++] = (byte) (~var15);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field6616[var7];
            }
            int var16;
            if ((var16 = this.field6616[var7]) < 0) {
                arg2[arg4++] = (byte) (~var16);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field6616[var7];
            }
            int var17;
            if ((var17 = this.field6616[var7]) < 0) {
                arg2[arg4++] = (byte) (~var17);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field6616[var7];
            }
            int var18;
            if ((var18 = this.field6616[var7]) < 0) {
                arg2[arg4++] = (byte) (~var18);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "([B)V")
    public class463(byte[] arg0) {
        int var2 = arg0.length;
        this.field6614 = arg0;
        this.field6611 = new int[var2];
        this.field6616 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6611[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class695.method3919(var12, var11);
                    }
                    var9 = var7 | var8;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field6616[var14] == 0) {
                            this.field6616[var14] = var4;
                        }
                        var14 = this.field6616[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field6616.length <= var14) {
                        int[] var18 = new int[this.field6616.length * 2];
                        for (int var19 = 0; var19 < this.field6616.length; var19++) {
                            var18[var19] = this.field6616[var19];
                        }
                        this.field6616 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field6616[var14] = ~var5;
            }
        }
    }
}
