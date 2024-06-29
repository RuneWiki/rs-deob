import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class579 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public int field7956;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
    public boolean field7962;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Z")
    public boolean field7970;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "[S")
    public short[] field7963;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    private int field7957;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public int field7965;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field7960;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    private int field7961;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    private int field7964;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    private int field7966;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    private int field7971;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field7972;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lrh;")
    public class223 field7959;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIILqa;I)V")
    private final void method3312(int arg0, int arg1, int arg2, int arg3, int arg4, class207 arg5, int arg6) {
        if (arg2 == -10) {
            this.field7959 = arg5.method1320(arg6, arg4, arg1, arg3, arg0, 1.0F);
            field7967++;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    private final void method3313(int arg0) {
        if (arg0 != 768) {
            this.method3313(109);
        }
        field7968++;
        int var2 = this.field7965;
        if (var2 == 2) {
            this.field7964 = 2048;
            this.field7971 = 1;
            this.field7966 = 2048;
            this.field7961 = 0;
        } else if (var2 == 3) {
            this.field7971 = 1;
            this.field7961 = 0;
            this.field7966 = 2048;
            this.field7964 = 4096;
        } else if (var2 == 4) {
            this.field7971 = 4;
            this.field7961 = 0;
            this.field7964 = 2048;
            this.field7966 = 2048;
        } else if (var2 == 5) {
            this.field7964 = 8192;
            this.field7961 = 0;
            this.field7971 = 4;
            this.field7966 = 2048;
        } else if (var2 == 12) {
            this.field7964 = 2048;
            this.field7961 = 0;
            this.field7971 = 2;
            this.field7966 = 2048;
        } else if (var2 == 13) {
            this.field7961 = 0;
            this.field7971 = 2;
            this.field7964 = 8192;
            this.field7966 = 2048;
        } else if (var2 == 10) {
            this.field7964 = 2048;
            this.field7961 = 1536;
            this.field7971 = 3;
            this.field7966 = 512;
        } else if (var2 == 11) {
            this.field7961 = 1536;
            this.field7971 = 3;
            this.field7966 = 512;
            this.field7964 = 4096;
        } else if (var2 == 6) {
            this.field7966 = 768;
            this.field7961 = 1280;
            this.field7971 = 3;
            this.field7964 = 2048;
        } else if (var2 == 7) {
            this.field7964 = 4096;
            this.field7971 = 3;
            this.field7961 = 1280;
            this.field7966 = 768;
        } else if (var2 == 8) {
            this.field7961 = 1024;
            this.field7966 = 1024;
            this.field7971 = 3;
            this.field7964 = 2048;
        } else if (var2 == 9) {
            this.field7966 = 1024;
            this.field7961 = 1024;
            this.field7964 = 4096;
            this.field7971 = 3;
        } else if (var2 == 14) {
            this.field7971 = 1;
            this.field7964 = 2048;
            this.field7961 = 1280;
            this.field7966 = 768;
        } else if (var2 == 15) {
            this.field7971 = 1;
            this.field7961 = 1536;
            this.field7964 = 4096;
            this.field7966 = 512;
        } else if (var2 == 16) {
            this.field7971 = 1;
            this.field7961 = 1792;
            this.field7964 = 8192;
            this.field7966 = 256;
        } else {
            this.field7964 = 2048;
            this.field7971 = 0;
            this.field7966 = 2048;
            this.field7961 = 0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3314(String arg0, int arg1) {
        if (arg1 < 12) {
            return;
        }
        field7958++;
        if (!arg0.equals("")) {
            class77.field1235++;
            class351.method2108(class335.field4462, -10511);
            class479.field6754.method108((byte) -128, class452.method2655(120, arg0));
            class479.field6754.method74(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIB)V")
    public final void method3315(boolean arg0, int arg1, byte arg2) {
        if (arg2 != -107) {
            this.field7966 = -21;
        }
        field7960++;
        int var6;
        if (arg0) {
            var6 = 2048;
        } else {
            int var4 = this.field7964 * arg1 / 50 + this.field7957 & 0x7FF;
            int var5 = this.field7971;
            if (var5 == 1) {
                var6 = (class1.field2[var4 << 3] >> 5) + 1024;
            } else if (var5 == 3) {
                var6 = class422.field5926[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field7959.method504((float) ((this.field7966 * var6 >> 11) + this.field7961) / 2048.0F, (byte) 126);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    protected class579() {
        if (class422.field5926 == null) {
            class643.method3707((byte) 91);
        }
        this.method3313(768);
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lqa;Ldaa;I)V")
    public class579(class207 arg0, class11 arg1, int arg2) {
        if (class422.field5926 == null) {
            class643.method3707((byte) 91);
        }
        this.field7956 = arg1.method110((byte) 110);
        this.field7962 = (this.field7956 & 0x8) != 0;
        this.field7970 = (this.field7956 & 0x10) != 0;
        this.field7956 &= 0x7;
        int var4 = arg1.method93((byte) 87) << arg2;
        int var5 = arg1.method93((byte) 106) << arg2;
        int var6 = arg1.method93((byte) 103) << arg2;
        int var7 = arg1.method110((byte) 54);
        int var8 = var7 * 2 + 1;
        this.field7963 = new short[var8];
        for (int var9 = 0; var9 < this.field7963.length; var9++) {
            short var13 = (short) arg1.method93((byte) 78);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field7963[var9] = (short) class73.method578(var14 << 8, var15);
        }
        int var10 = (var7 << class272.field3786) + class194.field2745;
        int var11 = class118.field1940 == null ? class439.field6243[class461.method2687(arg1.method93((byte) 115), -1) & 0xFFFF] : class118.field1940[arg1.method93((byte) 94)];
        int var12 = arg1.method110((byte) 97);
        this.field7957 = (var12 & 0xE0) << 3;
        this.field7965 = var12 & 0x1F;
        if (this.field7965 != 31) {
            this.method3313(768);
        }
        this.method3312(var11, var5, -10, var10, var6, arg0, var4);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIIIILld;I)Z")
    public static final boolean method3316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class145 arg10, int arg11) {
        field7972++;
        int var12 = arg8;
        int var13 = arg1;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg8 - var14;
        class418.field5895[var14][var15] = 99;
        int var17 = arg1 - var15;
        class546.field7558[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class335.field4466[var18] = arg8;
        int var35 = var18 + 1;
        class3.field37[var18] = arg1;
        int[][] var20 = arg10.field2253;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class640.field9315 = var12;
                                    class29.field485 = var13;
                                    if (arg0 != -1) {
                                        return false;
                                    }
                                    return false;
                                }
                                var13 = class3.field37[var19];
                                var12 = class335.field4466[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg10.field2243;
                                var24 = var13 - arg10.field2244;
                                if (arg7 == -4) {
                                    if (arg11 == var12 && arg2 == var13) {
                                        class29.field485 = var13;
                                        class640.field9315 = var12;
                                        return true;
                                    }
                                } else if (arg7 == -3) {
                                    if (class120.method839(var12, arg5, (byte) -12, var13, arg3, arg11, arg6, arg3, arg2)) {
                                        class640.field9315 = var12;
                                        class29.field485 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -2) {
                                    if (arg10.method969(arg3, arg9, (byte) 117, arg11, var12, var13, arg3, arg2, arg5, arg6)) {
                                        class640.field9315 = var12;
                                        class29.field485 = var13;
                                        return true;
                                    }
                                } else if (arg7 == -1) {
                                    if (arg10.method965(arg2, var12, arg11, (byte) 41, arg5, arg3, arg6, arg9, var13)) {
                                        class29.field485 = var13;
                                        class640.field9315 = var12;
                                        return true;
                                    }
                                } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                                    if (arg10.method957(arg2, arg11, var12, arg4, false, arg7, var13, arg3)) {
                                        class29.field485 = var13;
                                        class640.field9315 = var12;
                                        return true;
                                    }
                                } else if (arg10.method963(671744, var13, arg7, arg2, arg3, arg4, var12, arg11)) {
                                    class29.field485 = var13;
                                    class640.field9315 = var12;
                                    return true;
                                }
                                var26 = class546.field7558[var22][var21] + 1;
                                if (var22 > 0 && class418.field5895[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg3 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg3 - 1 <= var27) {
                                            class335.field4466[var35] = var12 - 1;
                                            class3.field37[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class418.field5895[var22 - 1][var21] = 2;
                                            class546.field7558[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < 128 - arg3 && class418.field5895[var22 + 1][var21] == 0 && (var20[var23 + arg3][var24] & 0x60E40000) == 0 && (var20[arg3 + var23][arg3 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg3 - 1 <= var28) {
                                            class335.field4466[var35] = var12 + 1;
                                            class3.field37[var35] = var13;
                                            class418.field5895[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class546.field7558[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg3 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class418.field5895[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg3 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg3 - 1) <= var29) {
                                            class335.field4466[var35] = var12;
                                            class3.field37[var35] = var13 - 1;
                                            class418.field5895[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class546.field7558[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < (128 - arg3) && class418.field5895[var22][var21 + 1] == 0 && (var20[var23][arg3 + var24] & 0x4E240000) == 0 && (var20[arg3 + var23 - 1][var24 + arg3] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg3 - 1) {
                                            class335.field4466[var35] = var12;
                                            class3.field37[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class418.field5895[var22][var21 + 1] = 4;
                                            class546.field7558[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg3 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class418.field5895[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg3) {
                                            class335.field4466[var35] = var12 - 1;
                                            class3.field37[var35] = var13 - 1;
                                            class418.field5895[var22 - 1][var21 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class546.field7558[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg3 > var22 && var21 > 0 && class418.field5895[var22 + 1][var21 - 1] == 0 && (var20[arg3 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (arg3 <= var32) {
                                            class335.field4466[var35] = var12 + 1;
                                            class3.field37[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class418.field5895[var22 + 1][var21 - 1] = 9;
                                            class546.field7558[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + arg3][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg3) && class418.field5895[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg3 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg3; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][var24 + arg3] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class335.field4466[var35] = var12 - 1;
                                    class3.field37[var35] = var13 + 1;
                                    class418.field5895[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class546.field7558[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= (128 - arg3));
                        } while ((128 - arg3) <= var21);
                    } while (class418.field5895[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg3 + var23][var24 + arg3] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg3; var34++) {
                    if ((var20[var23 + var34][arg3 + var24] & 0x7E240000) != 0 || (var20[var23 + arg3][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class335.field4466[var35] = var12 + 1;
                class3.field37[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class418.field5895[var22 + 1][var21 + 1] = 12;
                class546.field7558[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
    public final void method3317(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7971 = arg2;
        field7969++;
        if (arg4 != -16161) {
            this.field7956 = -46;
        }
        this.field7964 = arg3;
        this.field7961 = arg0;
        this.field7966 = arg1;
    }
}
