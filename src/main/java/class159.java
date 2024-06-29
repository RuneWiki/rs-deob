import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class159 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public int field2204 = -1;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Z")
    public boolean field2218 = true;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public int field2217 = 0;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public int field2210 = -1;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2213 = "Members object";

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field2216 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2208 = 0;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field2220 = "Connecting to update server";

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field2214 = 0;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "J")
    public static volatile long field2219 = 0L;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lnh;")
    public static class305 field2205;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[I")
    public static int[] field2209;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZI[Lej;[BII)[I")
    public static final int[] method988(int arg0, int arg1, boolean arg2, int arg3, class213[] arg4, byte[] arg5, int arg6, int arg7) {
        field2212++;
        if (!arg2) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg0 + var9) > 0 && (arg0 + var9) < 103 && (arg7 + var10) > 0 && (arg7 + var10) < 103) {
                            arg4[var8].field3204[arg0 + var9][arg7 + var10] = class32.method199(arg4[var8].field3204[arg0 + var9][arg7 + var10], -2097153);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg2) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class215 var12 = new class215(arg5);
        int var13 = arg6 + arg0;
        int var14 = arg3 + arg7;
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var40 = 0; var40 < 64; var40++) {
                for (int var41 = 0; var41 < 64; var41++) {
                    class10.method62(var12, 0, var41 + arg7, 0, 0, arg2, var13 + var40, var15, var14 + var41, false, 0, arg0 + var40);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var12.field3280 < var12.field3287.length) {
            int var18 = var12.method1374((byte) -60);
            if (var18 == 128) {
                class20.field328[0] = var12.method1379(-127);
                class20.field328[1] = var12.method1356(false);
                class20.field328[2] = var12.method1356(false);
                class20.field328[3] = var12.method1356(false);
                var16 = true;
                class20.field328[4] = var12.method1379(-72);
            } else {
                if (var18 != 129) {
                    var12.field3280--;
                    break;
                }
                var17 = true;
                for (int var19 = 0; var19 < 4; var19++) {
                    byte var20 = var12.method1350((byte) 85);
                    if (var20 == 0) {
                        int var30 = arg0;
                        int var31 = arg0 + 64;
                        if (arg0 < 0) {
                            var30 = 0;
                        } else if (arg0 >= 104) {
                            var30 = 104;
                        }
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        int var32 = arg7 + 64;
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        int var33 = arg7;
                        if (arg7 < 0) {
                            var33 = 0;
                        } else if (arg7 >= 104) {
                            var33 = 104;
                        }
                        while (var31 > var30) {
                            while (var33 < var32) {
                                class151.field2097[var19][var30][var33] = 0;
                                var33++;
                            }
                            var30++;
                        }
                    } else if (var20 == 1) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            for (int var26 = 0; var26 < 64; var26 += 4) {
                                byte var27 = var12.method1350((byte) -116);
                                for (int var28 = var25 + arg0; var28 < (arg0 + var25 + 4); var28++) {
                                    for (int var29 = var26 + arg7; var29 < (arg7 + var26 + 4); var29++) {
                                        if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                                            class151.field2097[var19][var28][var29] = var27;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var20 == 2 && var19 > 0) {
                        int var21 = arg0;
                        if (arg0 < 0) {
                            var21 = 0;
                        } else if (arg0 >= 104) {
                            var21 = 104;
                        }
                        int var22 = arg0 + 64;
                        if (var22 < 0) {
                            var22 = 0;
                        } else if (var22 >= 104) {
                            var22 = 104;
                        }
                        int var23 = arg7;
                        if (arg7 < 0) {
                            var23 = 0;
                        } else if (arg7 >= 104) {
                            var23 = 104;
                        }
                        int var24 = arg7 + 64;
                        if (var24 < 0) {
                            var24 = 0;
                        } else if (var24 >= 104) {
                            var24 = 104;
                        }
                        while (var21 < var22) {
                            while (var24 > var23) {
                                class151.field2097[var19][var21][var23] = class151.field2097[var19 - 1][var21][var23];
                                var23++;
                            }
                            var21++;
                        }
                    }
                }
            }
        }
        if (!var17) {
            for (int var34 = 0; var34 < 4; var34++) {
                for (int var35 = 0; var35 < 16; var35++) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        int var37 = (arg0 >> 2) + var35;
                        int var38 = (arg7 >> 2) + var36;
                        if (var37 >= 0 && var37 < 26 && var38 >= 0 && var38 < 26) {
                            class151.field2097[var34][var37][var38] = 0;
                        }
                    }
                }
            }
        }
        int var39 = -9 / ((24 - arg1) / 59);
        if (var16) {
            return class20.field328;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lbj;II)V")
    public final void method989(class215 arg0, int arg1, int arg2) {
        if (arg2 != 22253) {
            method992(46);
        }
        while (true) {
            int var4 = arg0.method1374((byte) -60);
            if (var4 == 0) {
                field2211++;
                return;
            }
            this.method990(arg0, -11, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lbj;III)V")
    private final void method990(class215 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field2217 = class17.method122(true, arg0.method1403(arg1 + 6602));
        } else if (arg3 == 2) {
            this.field2204 = arg0.method1374((byte) -60);
        } else if (arg3 == 3) {
            this.field2204 = arg0.method1379(-128);
            if (this.field2204 == 65535) {
                this.field2204 = -1;
            }
        } else if (arg3 == 5) {
            this.field2218 = false;
        } else if (arg3 == 7) {
            this.field2210 = class17.method122(true, arg0.method1403(6591));
        } else if (arg3 == 8) {
            class175.field2473 = arg2;
        } else if (arg3 == 9) {
            arg0.method1379(-85);
        } else if (arg3 != 10) {
            if (arg3 == 11) {
                arg0.method1374((byte) -60);
            } else if (arg3 != 12) {
                if (arg3 == 13) {
                    arg0.method1403(6591);
                } else if (arg3 == 14) {
                    arg0.method1374((byte) -60);
                }
            }
        }
        if (arg1 == -11) {
            field2215++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static final void method991(boolean arg0) {
        field2207++;
        if (class29.field453) {
            return;
        }
        class29.field453 = true;
        class115.field1653 = true;
        if (class78.field1085) {
            class160.field2239 = (float) ((int) class160.field2239 + 47 & 0xFFFFFFF0);
        } else {
            class254.field3960 += (12.0F - class254.field3960) / 2.0F;
        }
        if (arg0) {
            field2213 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method992(int arg0) {
        if (arg0 <= 62) {
            method991(false);
        }
        field2216 = null;
        field2213 = null;
        field2205 = null;
        field2209 = null;
        field2220 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)V")
    public static final void method993(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field2209 = null;
        }
        field2206++;
        if (arg1 >= class261.field4204 && class18.field310 >= arg1) {
            int var5 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg2);
            int var6 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg0);
            class192.method1219(var6, arg3, arg1, -1, var5);
        }
    }
}
