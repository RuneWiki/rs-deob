import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class474 {

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
    public boolean field6381 = false;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "Lkg;")
    public static class275 field6376 = new class275(54, -2);

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6385 = new BigInteger("9bc07162af2ce2a686e2113c86fb5f306892dcc9a3c7571da1d90a109f7c852d56afe0eca956552abb88432b3d63b90ea6fbea6376656d228723875cdebd5e36246dc473f24e0495708f8221a952e1a4616b39bfcbeb215e87869323b6c801d563fa9fbe89c3dd46f2aaaa28c14da7798ee9bf3926f40a84d73a2ceab38701f0a8b15fb0aa8e841874d44ce16965d69a1a66c3a95eb078f67b1193fe11ff0fa1a82097b72f208343389aa723057b5f887902b290ef8b1b9135e2bfd7c7167c0fcc5df7e69868604b8190aefe9c2f3c86fb7b5a5ee15511b6548cea40bfa0a446b0a2b9219623bfec64f007a3820dc3c8606135bfceb887e919927ddf8605cb5f8bbf0a57d5117436f8caf2e47db218fa37af47953710d98a574cd56386021b50f2c194754e00c76624069d707d6bb988524cf8cacffcc586e5962714b5ebcf3b64ec153a2962a6e44c653281d2ff3d11a110f666ab7010d708b5091d7a4cc56314a1b706ffe12e065c19b1491757598bb763ca8e62e74fca68cf3e213f9fb21822557e82b26f39c054a1e98c7e27e7e427d5e9f8517bdb947e73adbcc76e24318d4bc22f14305c7d0822c12986662026057c6e139b3b233522ed5abd67094f7313e11ac42bcb721445f2ec9d06dc5b28679c18a018b138a163aca6508347ba8e1abbd3a2da59e8536979a3ca108b875218788bd49c1b270a097a68dad7563453", 16);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Lnd;")
    public static class547 field6388;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
    public static int[] field6386;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[ZIZILeg;ILeg;Lvia;ZI[I)V", line = 14)
    private final void method2706(int arg0, boolean[] arg1, int arg2, boolean arg3, int arg4, class110 arg5, int arg6, class110 arg7, class565 arg8, boolean arg9, int arg10, int[] arg11) {
        field6383++;
        if (arg7 == null || arg2 == 0) {
            for (int var38 = 0; var38 < arg5.field1590; var38++) {
                short var39 = arg5.field1588[var38];
                if (arg1 == null || arg3 == arg1[var39] || arg8.field7942[var39] == 0) {
                    short var40 = arg5.field1597[var38];
                    if (var40 != -1) {
                        this.method2712(0, 0, arg8.field7941[var40] & arg0, arg4, (byte) -115, arg11, 0, arg9, arg8.field7936[var40], 0);
                    }
                    this.method2712(arg5.field1596[var38], arg8.field7942[var39], arg0 & arg8.field7941[var39], arg4, (byte) -115, arg11, arg5.field1587[var38], arg9, arg8.field7936[var39], arg5.field1598[var38]);
                }
            }
            return;
        }
        int var13 = 0;
        if (arg10 != 16383) {
            field6386 = null;
        }
        int var14 = 0;
        for (int var15 = 0; var15 < arg8.field7945; var15++) {
            boolean var16 = false;
            if (arg5.field1590 > var13 && arg5.field1588[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg7.field1590 && arg7.field1588[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg1 == null || arg1[var15] == arg3 || arg8.field7942[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg8.field7942[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    byte var23;
                    short var24;
                    if (var16) {
                        var20 = arg5.field1597[var13];
                        var21 = arg5.field1587[var13];
                        var22 = arg5.field1598[var13];
                        var23 = arg5.field1592[var13];
                        var24 = arg5.field1596[var13];
                        var13++;
                    } else {
                        var23 = 0;
                        var22 = var18;
                        var21 = var18;
                        var20 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    short var27;
                    short var28;
                    byte var29;
                    if (var17) {
                        var27 = arg7.field1597[var14];
                        var28 = arg7.field1587[var14];
                        var26 = arg7.field1596[var14];
                        var25 = arg7.field1598[var14];
                        var29 = arg7.field1592[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = var18;
                        var27 = -1;
                        var28 = var18;
                        var29 = 0;
                    }
                    int var30;
                    int var31;
                    int var32;
                    if ((var23 & 0x2) != 0 || (var29 & 0x1) != 0) {
                        var31 = var24;
                        var32 = var22;
                        var30 = var21;
                    } else if (var19 == 2) {
                        int var35 = var26 - var24 & 0x3FFF;
                        int var36 = var25 - var22 & 0x3FFF;
                        if (var35 >= 8192) {
                            var35 -= 16384;
                        }
                        int var37 = var28 - var21 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var32 = var22 + (arg2 * var36 / arg6) & 0x3FFF;
                        if (var37 >= 8192) {
                            var37 -= 16384;
                        }
                        var31 = arg2 * var35 / arg6 + var24 & 0x3FFF;
                        var30 = arg2 * var37 / arg6 + var21 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var34 = var26 - var24 & 0x3FFF;
                        if (var34 >= 8192) {
                            var34 -= 16384;
                        }
                        var31 = arg2 * var34 / arg6 + var24 & 0x3FFF;
                        var30 = 0;
                        var32 = 0;
                    } else if (var19 == 7) {
                        int var33 = var26 - var24 & 0x3F;
                        if (var33 >= 32) {
                            var33 -= 64;
                        }
                        var31 = arg2 * var33 / arg6 + var24 & 0x3F;
                        var30 = var21 + ((var28 - var21) * arg2 / arg6);
                        var32 = (var25 - var22) * arg2 / arg6 + var22;
                    } else {
                        var30 = var21 + ((var28 - var21) * arg2 / arg6);
                        var31 = (var26 - var24) * arg2 / arg6 + var24;
                        var32 = (var25 - var22) * arg2 / arg6 + var22;
                    }
                    if (var20 != -1) {
                        this.method2712(0, 0, arg0 & arg8.field7941[var20], arg4, (byte) -115, arg11, 0, arg9, arg8.field7936[var20], 0);
                    } else if (var27 != -1) {
                        this.method2712(0, 0, arg0 & arg8.field7941[var27], arg4, (byte) -115, arg11, 0, arg9, arg8.field7936[var27], 0);
                    }
                    this.method2712(var31, var19, arg8.field7941[var15] & arg0, arg4, (byte) -115, arg11, var30, arg9, arg8.field7936[var15], var32);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLic;IILic;IIII)V", line = 233)
    public final void method2707(boolean arg0, class701 arg1, int arg2, int arg3, class701 arg4, int arg5, int arg6, int arg7, int arg8) {
        field6387++;
        if (arg3 == -1) {
            return;
        }
        this.method282();
        if (!this.method278()) {
            this.method247();
            return;
        }
        class110 var10 = arg4.field9750[arg3];
        if (arg6 < 29) {
            field6388 = null;
        }
        class565 var11 = var10.field1585;
        class110 var12 = null;
        if (arg1 != null) {
            var12 = arg1.field9750[arg5];
            if (var12.field1585 != var11) {
                var12 = null;
            }
        }
        this.method2706(65535, null, arg8, false, arg2, var10, arg7, var12, var11, arg0, 16383, null);
        this.method252();
        this.method247();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZIILtd;I)V", line = 275)
    public static final void method2708(int arg0, boolean arg1, int arg2, int arg3, class456 arg4, int arg5) {
        if (!arg1) {
            method2710((byte) 9);
        }
        field6375++;
        if (arg5 < 1 || arg0 < 1 || (class409.field5183 - 2) < arg5 || class543.field7597 - 2 < arg0) {
            return;
        }
        if (class197.field2689 == null) {
            return;
        }
        class457 var6 = class197.field2685.method1336((byte) -3, arg0, arg2, arg5, arg3);
        if (var6 == null) {
            return;
        }
        if (!(var6 instanceof class214)) {
            if ((var6 instanceof class718)) {
                ((class718) var6).method4014(876931081, arg4);
            } else if (var6 instanceof class359) {
                ((class359) var6).method2083(true, arg4);
                return;
            } else if (var6 instanceof class625) {
                ((class625) var6).method3506(-52, arg4);
                return;
            }
            return;
        }
        ((class214) var6).method1372(true, arg4);
        return;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ls;IIIIIIII)V", line = 327)
    public final void method2709(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6378++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg4 / 2;
        int var14 = -arg3 / 2;
        int var15 = arg0.method1676(arg1 + var13, true, arg6 + var14);
        int var16 = arg4 / 2;
        int var17 = -arg3 / 2;
        int var18 = arg0.method1676(arg1 + var16, true, arg6 + var17);
        int var19 = -arg4 / 2;
        int var20 = arg3 / 2;
        int var21 = arg0.method1676(arg1 + var19, true, arg6 + var20);
        int var22 = arg4 / 2;
        int var23 = arg3 / 2;
        int var24 = arg0.method1676(arg1 + var22, true, arg6 + var23);
        int var25 = var15 < var18 ? var15 : var18;
        int var26 = var24 > var21 ? var21 : var24;
        int var27 = var24 > var18 ? var18 : var24;
        if (arg3 != 0) {
            int var28 = (int) (Math.atan2((double) (var25 - var26), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                if (arg5 != 0) {
                    if (var28 > 8192) {
                        int var29 = 16384 - arg5;
                        if (var29 > var28) {
                            var28 = var29;
                        }
                    } else if (arg5 < var28) {
                        var28 = arg5;
                    }
                }
                this.method257(var28);
            }
        }
        if (arg8 != 16) {
            return;
        }
        int var30 = var15 >= var21 ? var21 : var15;
        if (arg4 != 0) {
            int var31 = (int) (Math.atan2((double) (var30 - var27), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
            if (var31 != 0) {
                if (arg2 != 0) {
                    if (var31 > 8192) {
                        int var32 = 16384 - arg2;
                        if (var32 > var31) {
                            var31 = var32;
                        }
                    } else if (var31 > arg2) {
                        var31 = arg2;
                    }
                }
                this.method276(var31);
            }
        }
        int var33 = var15 + var24;
        if ((var18 + var21) < var33) {
            var33 = var18 + var21;
        }
        int var34 = (var33 >> 1) - arg7;
        if (var34 != 0) {
            this.method281(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 456)
    public static void method2710(byte arg0) {
        field6388 = null;
        if (arg0 != 105) {
            method2715(-49, 103, -1.0951781F, -44, (byte) 102, null, -1.6668948F, 1.039063F, -107, -0.8595098F, -0.55652535F, 50, 118, null);
        }
        field6386 = null;
        field6376 = null;
        field6385 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lic;Lic;ILic;IIZI[ZILic;IIII)V", line = 487)
    public final void method2711(class701 arg0, class701 arg1, int arg2, class701 arg3, int arg4, int arg5, boolean arg6, int arg7, boolean[] arg8, int arg9, class701 arg10, int arg11, int arg12, int arg13, int arg14) {
        field6377++;
        if (~arg11 == arg12) {
            return;
        }
        if (arg8 == null || arg9 == -1) {
            this.method2707(arg6, arg10, 0, arg11, arg3, arg5, arg12 ^ 0x4C, arg14, arg2);
            return;
        }
        this.method282();
        if (!this.method278()) {
            this.method247();
            return;
        }
        class110 var16 = arg3.field9750[arg11];
        class565 var17 = var16.field1585;
        class110 var18 = null;
        if (arg10 != null) {
            var18 = arg10.field9750[arg5];
            if (var18.field1585 != var17) {
                var18 = null;
            }
        }
        this.method2706(65535, arg8, arg2, false, 0, var16, arg14, var18, var17, arg6, arg12 ^ 0x3FFF, null);
        class110 var19 = arg1.field9750[arg9];
        class110 var20 = null;
        if (arg0 != null) {
            var20 = arg0.field9750[arg7];
            if (var20.field1585 != var17) {
                var20 = null;
            }
        }
        this.method292(0, new int[0], 0, 0, 0, 0, arg6);
        this.method2706(65535, arg8, arg4, true, 0, var19, arg13, var20, var19.field1585, arg6, 16383, null);
        this.method252();
        this.method247();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIB[IIZ[II)V", line = 552)
    private final void method2712(int arg0, int arg1, int arg2, int arg3, byte arg4, int[] arg5, int arg6, boolean arg7, int[] arg8, int arg9) {
        if (arg4 != -115) {
            this.field6381 = false;
        }
        if (arg3 == 1) {
            if (arg1 == 0 || arg1 == 1) {
                int var16 = -arg0;
                arg0 = arg6;
                arg6 = var16;
            } else if (arg1 == 3) {
                int var15 = arg0;
                arg0 = arg6;
                arg6 = var15;
            } else if (arg1 == 2) {
                int var14 = arg0;
                arg0 = -arg6 & 0x3FFF;
                arg6 = var14 & 0x3FFF;
            }
        } else if (arg3 == 2) {
            if (arg1 == 0 || arg1 == 1) {
                arg6 = -arg6;
                arg0 = -arg0;
            } else if (arg1 == 2) {
                arg6 = -arg6 & 0x3FFF;
                arg0 = -arg0 & 0x3FFF;
            }
        } else if (arg3 == 3) {
            if (arg1 == 0 || arg1 == 1) {
                int var13 = arg0;
                arg0 = -arg6;
                arg6 = var13;
            } else if (arg1 == 3) {
                int var12 = arg0;
                arg0 = arg6;
                arg6 = var12;
            } else if (arg1 == 2) {
                int var11 = arg0;
                arg0 = arg6 & 0x3FFF;
                arg6 = -var11 & 0x3FFF;
            }
        }
        field6379++;
        if (arg2 == 65535) {
            this.method292(arg1, arg8, arg0, arg9, arg6, arg3, arg7);
        } else {
            this.method290(arg1, arg8, arg0, arg9, arg6, arg7, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZIII[IIIZLic;ILic;)V", line = 647)
    public final void method2713(boolean arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, boolean arg7, class701 arg8, int arg9, class701 arg10) {
        field6380++;
        if (arg2 == -1) {
            return;
        }
        this.method282();
        if (!this.method278()) {
            this.method247();
            return;
        }
        class110 var12 = arg8.field9750[arg2];
        class565 var13 = var12.field1585;
        class110 var14 = null;
        if (arg10 != null) {
            var14 = arg10.field9750[arg1];
            if (var14.field1585 != var13) {
                var14 = null;
            }
        }
        this.method2706(arg5, null, arg9, arg0, arg3, var12, arg6, var14, var13, arg7, 16383, arg4);
        this.method252();
        this.method247();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lic;II)V", line = 690)
    public final void method2714(class701 arg0, int arg1, int arg2) {
        if (arg2 < 43) {
            this.method2711(null, null, 99, null, 123, -27, false, 28, null, 0, null, 41, -85, -107, -53);
        }
        field6382++;
        if (arg1 == -1) {
            return;
        }
        this.method282();
        if (!this.method278()) {
            this.method247();
            return;
        }
        class110 var4 = arg0.field9750[arg1];
        class565 var5 = var4.field1585;
        for (int var6 = 0; var6 < var4.field1590; var6++) {
            short var7 = var4.field1588[var6];
            if (var5.field7939[var7]) {
                if (var4.field1597[var6] != -1) {
                    this.method267(0, 0, 0, 0);
                }
                this.method267(var5.field7942[var7], var4.field1596[var6], var4.field1598[var6], var4.field1587[var6]);
            }
        }
        this.method252();
        this.method247();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIFIBLsb;FFIFFII[B)V", line = 736)
    public static final void method2715(int arg0, int arg1, float arg2, int arg3, byte arg4, class294 arg5, float arg6, float arg7, int arg8, float arg9, float arg10, int arg11, int arg12, byte[] arg13) {
        field6384++;
        int var14 = arg3 * arg12;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg1; var16++) {
            arg5.method1769(arg8, (byte) -109, arg3, arg7 / (float) arg3, arg12, arg2 / (float) arg12, arg9 * 127.0F, arg10 / (float) arg8, 0, var15, arg0);
            int var19 = arg11;
            arg7 *= 2.0F;
            arg10 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg13[var19] = (byte) ((int) ((float) arg13[var19] + var15[var20]));
                var19++;
            }
            arg9 = arg6 * arg9;
            arg2 *= 2.0F;
        }
        if (arg4 < 34) {
            return;
        }
        int var17 = arg11;
        for (int var18 = 0; var18 < var14; var18++) {
            arg13[var17] = (byte) (arg13[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
    public abstract void method251(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
    public abstract int method288();

    @OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
    public abstract void method257(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpda;)V")
    public abstract void method271(class631 arg0);

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
    public abstract int method242();

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
    public abstract void method262(int arg0);

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
    public abstract void method245();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lka;")
    public abstract class474 method273(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lka;IIIZ)V")
    public abstract void method241(class474 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpda;Lwt;I)V")
    public abstract void method250(class631 arg0, class314 arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
    public abstract void method265(int arg0);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
    public abstract void method282();

    @OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
    public abstract int method284();

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
    public abstract void method290(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
    public abstract int method280();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
    public abstract void method260(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
    public abstract int method269();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILpda;ZII)Z")
    public abstract boolean method275(int arg0, int arg1, class631 arg2, boolean arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
    public abstract int method285();

    @OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
    public abstract int method286();

    @OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lr;)Lr;")
    public abstract class185 method289(class185 arg0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "()Z")
    public abstract boolean method249();

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
    public abstract void method247();

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
    public abstract int method263();

    @OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
    public abstract int method279();

    @OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
    public abstract void method293(short arg0, short arg1);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()[Lqi;")
    public abstract class569[] method268();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpda;Lwt;II)V")
    public abstract void method255(class631 arg0, class314 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILpda;ZI)Z")
    public abstract boolean method258(int arg0, int arg1, class631 arg2, boolean arg3, int arg4);

    @OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
    public abstract int method248();

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
    public abstract void method243();

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
    public abstract void method281(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lhv;")
    public abstract class521[] method253();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public abstract void method270(int arg0);

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
    public abstract void method267(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
    public abstract boolean method278();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpda;IZ)V")
    public abstract void method254(class631 arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
    public abstract void method259(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
    public abstract boolean method287();

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
    public abstract void method246(int arg0);

    @OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
    public abstract void method252();

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
    public abstract boolean method244();

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method292(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
    public abstract void method276(int arg0);

    @OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
    public abstract int method272();

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILs;Ls;III)V")
    public abstract void method277(int arg0, int arg1, class282 arg2, class282 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
    public abstract void method266(int arg0);
}
