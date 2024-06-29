import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public abstract class class292 {

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "Lwl;")
    public static class452 field4440 = new class452(33, 10);

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "Ljg;")
    public static class241 field4451 = new class241(20);

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "[Ltm;")
    public static class354[] field4454 = new class354[5];

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "[[I")
    public static int[][] field4448;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public abstract void method1261(int arg0);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BIZ)Lwp;")
    public abstract class292 method1264(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V")
    public abstract void method1279(int arg0);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
    public static final void method1806(byte arg0) {
        field4449++;
        if (class351.field5206) {
            return;
        }
        class424.field6235 = true;
        class351.field5206 = true;
        if (arg0 > -81) {
            field4448 = null;
        }
        if (class212.field3193) {
            class462.field6810 = (float) ((int) class462.field6810 + 191 & 0xFFFFFF80);
        } else {
            class1.field16 += (24.0F - class1.field16) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILdm;Ldm;[IIIIIIZI)V")
    public final void method1807(int arg0, class265 arg1, class265 arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field4436++;
        if (~arg4 == arg6 || !this.method1262()) {
            return;
        }
        class340 var12 = arg2.field4035[arg4];
        class168 var13 = var12.field5075;
        class340 var14 = null;
        if (arg1 != null) {
            var14 = arg1.field4035[arg5];
            if (var14.field5075 != var13) {
                var14 = null;
            }
        }
        this.method1809(arg0, var13, (byte) -100, var14, var12, arg9, arg8, arg7, (boolean[]) null, false, arg3, arg10);
        this.method1281();
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "()Z")
    public abstract boolean method1275();

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)V")
    public static final void method1808(int arg0, int arg1, int arg2, int arg3) {
        field4444++;
        if (class277.field4216 == null) {
            return;
        }
        long var4 = (long) (arg3 << 28 | arg2 << 14 | arg1);
        class429 var6 = (class429) class45.field557.method2302(var4, 23576);
        if (var6 == null) {
            class210.method1234(arg3, arg1, arg2);
            return;
        }
        class146 var7 = (class146) var6.field6304.method2514((byte) 61);
        int var8 = 2 / ((-arg0 - 9) / 56);
        if (var7 == null) {
            class210.method1234(arg3, arg1, arg2);
            return;
        }
        class212 var9 = (class212) class210.method1234(arg3, arg1, arg2);
        if (var9 == null) {
            var9 = new class212();
        } else {
            var9.field3184 = var9.field3190 = -1;
        }
        var9.field3183 = var7.field2025;
        var9.field3182 = var7.field2022;
        label44: while (true) {
            class146 var10 = (class146) var6.field6304.method2511(38);
            if (var10 == null) {
                break;
            }
            if (var9.field3183 != var10.field2025) {
                var9.field3179 = var10.field2022;
                var9.field3184 = var10.field2025;
                while (true) {
                    class146 var11 = (class146) var6.field6304.method2511(-118);
                    if (var11 == null) {
                        break label44;
                    }
                    if (var9.field3183 != var11.field2025 && var9.field3184 != var11.field2025) {
                        var9.field3190 = var11.field2025;
                        var9.field3191 = var11.field2022;
                    }
                }
            }
        }
        int var12 = class437.method2686(arg3, 0, (arg2 << 7) + 64, (arg1 << 7) + 64);
        class34.method198(arg3, arg1, arg2, var12, var9);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILjd;Z)Z")
    public abstract boolean method1297(int arg0, int arg1, class361 arg2, boolean arg3);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1300(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "()I")
    public abstract int method1284();

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILah;BLli;Lli;ZII[ZZ[II)V")
    private final void method1809(int arg0, class168 arg1, byte arg2, class340 arg3, class340 arg4, boolean arg5, int arg6, int arg7, boolean[] arg8, boolean arg9, int[] arg10, int arg11) {
        field4450++;
        if (arg3 == null || arg11 == 0) {
            for (int var38 = 0; var38 < arg4.field5080; var38++) {
                short var39 = arg4.field5070[var38];
                if (arg8 == null || arg8[var39] == arg9 || arg1.field2410[var39] == 0) {
                    short var40 = arg4.field5074[var38];
                    if (var40 != -1) {
                        this.method1814(arg5, 0, 0, 0, 0, arg1.field2414[var40], arg1.field2400[var40] & arg7, arg6, 0, arg10);
                    }
                    this.method1814(arg5, arg4.field5068[var38], 0, arg4.field5076[var38], arg4.field5073[var38], arg1.field2414[var39], arg7 & arg1.field2400[var39], arg6, arg1.field2410[var39], arg10);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg1.field2411; var15++) {
            boolean var17 = false;
            if (var13 < arg4.field5080 && arg4.field5070[var13] == var15) {
                var17 = true;
            }
            boolean var18 = false;
            if (var14 < arg3.field5080 && arg3.field5070[var14] == var15) {
                var18 = true;
            }
            if (var17 || var18) {
                if (arg8 == null || arg8[var15] == arg9 || arg1.field2410[var15] == 0) {
                    short var19 = 0;
                    int var20 = arg1.field2410[var15];
                    if (var20 == 3) {
                        var19 = 128;
                    }
                    short var21;
                    short var22;
                    short var23;
                    short var24;
                    byte var25;
                    if (var17) {
                        var21 = arg4.field5068[var13];
                        var22 = arg4.field5076[var13];
                        var23 = arg4.field5074[var13];
                        var24 = arg4.field5073[var13];
                        var25 = arg4.field5081[var13];
                        var13++;
                    } else {
                        var22 = var19;
                        var24 = var19;
                        var21 = var19;
                        var23 = -1;
                        var25 = 0;
                    }
                    short var26;
                    short var27;
                    short var28;
                    short var29;
                    byte var30;
                    if (var18) {
                        var26 = arg3.field5073[var14];
                        var27 = arg3.field5068[var14];
                        var28 = arg3.field5074[var14];
                        var29 = arg3.field5076[var14];
                        var30 = arg3.field5081[var14];
                        var14++;
                    } else {
                        var26 = var19;
                        var29 = var19;
                        var30 = 0;
                        var27 = var19;
                        var28 = -1;
                    }
                    if (var23 != -1) {
                        this.method1814(arg5, 0, 0, 0, 0, arg1.field2414[var23], arg7 & arg1.field2400[var23], arg6, 0, arg10);
                    } else if (var28 != -1) {
                        this.method1814(arg5, 0, 0, 0, 0, arg1.field2414[var28], arg7 & arg1.field2400[var28], arg6, 0, arg10);
                    }
                    int var34;
                    int var35;
                    int var36;
                    if ((var25 & 0x2) != 0 || (var30 & 0x1) != 0) {
                        var36 = var24;
                        var34 = var22;
                        var35 = var21;
                    } else if (var20 == 2) {
                        int var31 = var29 - var22 & 0x3FFF;
                        int var32 = var27 - var21 & 0x3FFF;
                        int var33 = var26 - var24 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var34 = var22 + (arg11 * var31 / arg0) & 0x3FFF;
                        var35 = var21 + (arg11 * var32 / arg0) & 0x3FFF;
                        if (var33 >= 8192) {
                            var33 -= 16384;
                        }
                        var36 = var24 + (arg11 * var33 / arg0) & 0x3FFF;
                    } else if (var20 == 7) {
                        int var37 = var29 - var22 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var35 = var21 + ((var27 - var21) * arg11 / arg0);
                        var34 = arg11 * var37 / arg0 + var22 & 0x3F;
                        var36 = (var26 - var24) * arg11 / arg0 + var24;
                    } else {
                        var36 = var24 + ((var26 - var24) * arg11 / arg0);
                        var35 = (var27 - var21) * arg11 / arg0 + var21;
                        var34 = (var29 - var22) * arg11 / arg0 + var22;
                    }
                    this.method1814(arg5, var35, 0, var34, var36, arg1.field2414[var15], arg1.field2400[var15] & arg7, arg6, var20, arg10);
                } else {
                    if (var17) {
                        var13++;
                    }
                    if (var18) {
                        var14++;
                    }
                }
            }
        }
        int var16 = -59 / ((-arg2 - 27) / 48);
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "()I")
    public abstract int method1274();

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
    public static final void method1810(int arg0, int arg1) {
        field4441++;
        if (!class345.method2100(-1, arg0)) {
            return;
        }
        class170[] var2 = class130.field1650[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class170 var4 = var2[var3];
            if (var4 != null) {
                var4.field2489 = 0;
                var4.field2609 = 0;
                var4.field2619 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1260(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "()V")
    public abstract void method1281();

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lqn;)Lqn;")
    public abstract class380 method1305(class380 arg0);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljd;Lid;I)V")
    public abstract void method1282(class361 arg0, class158 arg1, int arg2);

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "()I")
    public abstract int method1301();

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "()I")
    public abstract int method1270();

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "()[Ltr;")
    public abstract class219[] method1302();

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)V")
    public abstract void method1291(int arg0);

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(IIII)V")
    public static final void method1811(int arg0, int arg1, int arg2, int arg3) {
        field4446++;
        if (arg0 != 16383) {
            method1815(114, 3);
        }
        class32 var4 = class136.method854(11, (byte) 95, arg2);
        var4.method194(false);
        var4.field412 = arg3;
        var4.field404 = arg1;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lwp;IIIZ)V")
    public abstract void method1273(class292 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "()[Lmp;")
    public abstract class95[] method1271();

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "()V")
    public abstract void method1288();

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "()I")
    public abstract int method1289();

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljd;Lid;II)V")
    public abstract void method1283(class361 arg0, class158 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "()Z")
    public abstract boolean method1262();

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(IIII)V")
    public abstract void method1252(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V")
    public static final void method1812(int arg0) {
        class351.field5208 = false;
        if (arg0 > -65) {
            method1812(65);
        }
        class201.field3028 = 0;
        class298.field4511 = -3;
        field4447++;
        client.field6663 = 0;
        class19.field259 = 0;
        class6.field67 = 1;
        class109.field1442 = -1;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILdm;ZIILdm;IILdm;III[ZLdm;I)V")
    public final void method1813(int arg0, class265 arg1, boolean arg2, int arg3, int arg4, class265 arg5, int arg6, int arg7, class265 arg8, int arg9, int arg10, int arg11, boolean[] arg12, class265 arg13, int arg14) {
        field4453++;
        if (arg6 == -1) {
            return;
        }
        if (arg12 == null || arg3 == -1) {
            this.method1817(arg10, arg9, 0, (byte) 111, arg13, arg14, arg8, arg2, arg6);
        } else if (this.method1262()) {
            class340 var16 = arg8.field4035[arg6];
            class168 var17 = var16.field5075;
            class340 var18 = null;
            if (arg13 != null) {
                var18 = arg13.field4035[arg9];
                if (var18.field5075 != var17) {
                    var18 = null;
                }
            }
            class340 var19 = arg1.field4035[arg3];
            class340 var20 = null;
            if (arg5 != null) {
                var20 = arg5.field4035[arg0];
                if (var20.field5075 != var17) {
                    var20 = null;
                }
            }
            this.method1809(arg10, var17, (byte) 96, var18, var16, arg2, 0, 65535, arg12, false, (int[]) null, arg14);
            this.method1260(0, new int[0], arg7, 0, 0, 0, arg2);
            this.method1809(arg4, var17, (byte) 42, var20, var19, arg2, 0, 65535, arg12, true, (int[]) null, arg11);
            this.method1281();
        }
    }

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "()V")
    public abstract void method1249();

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZIIII[IIII[I)V")
    private final void method1814(boolean arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int[] arg9) {
        if (arg7 == 1) {
            if (arg8 == 0 || arg8 == 1) {
                int var16 = -arg3;
                arg3 = arg4;
                arg4 = var16;
            } else if (arg8 == 3) {
                int var15 = arg3;
                arg3 = arg4;
                arg4 = var15;
            } else if (arg8 == 2) {
                int var14 = arg3;
                arg3 = -arg4 & 0x3FFF;
                arg4 = var14 & 0x3FFF;
            }
        } else if (arg7 == 2) {
            if (arg8 == 0 || arg8 == 1) {
                arg3 = -arg3;
                arg4 = -arg4;
            } else if (arg8 == 2) {
                arg4 = -arg4 & 0x3FFF;
                arg3 = -arg3 & 0x3FFF;
            }
        } else if (arg7 == 3) {
            if (arg8 == 0 || arg8 == 1) {
                int var13 = arg3;
                arg3 = -arg4;
                arg4 = var13;
            } else if (arg8 == 3) {
                int var11 = arg3;
                arg3 = arg4;
                arg4 = var11;
            } else if (arg8 == 2) {
                int var12 = arg3;
                arg3 = arg4 & 0x3FFF;
                arg4 = -var12 & 0x3FFF;
            }
        }
        field4439++;
        if (arg6 == 65535) {
            this.method1260(arg8, arg5, arg3, arg1, arg4, arg7, arg0);
        } else {
            this.method1300(arg8, arg5, arg3, arg1, arg4, arg0, arg6, arg9);
        }
        if (arg2 != 0) {
            this.method1264((byte) -16, -17, true);
        }
    }

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "()I")
    public abstract int method1263();

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)Leq;")
    public static final class446 method1815(int arg0, int arg1) {
        field4438++;
        class446 var2 = (class446) class131.field1670.method1491((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field6680.method823(4, -20334, arg1);
        class446 var4 = new class446();
        if (arg0 >= -92) {
            field4448 = null;
        }
        if (var3 != null) {
            var4.method2753(arg1, new class385(var3), (byte) 75);
        }
        var4.method2752(79, arg1);
        class131.field1670.method1488(128, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILdm;)V")
    public final void method1816(int arg0, int arg1, class265 arg2) {
        field4443++;
        if (arg0 == -1 || !this.method1262()) {
            return;
        }
        if (arg1 <= 23) {
            field4451 = null;
        }
        class340 var4 = arg2.field4035[arg0];
        class168 var5 = var4.field5075;
        for (int var6 = 0; var6 < var4.field5080; var6++) {
            short var7 = var4.field5070[var6];
            if (var5.field2407[var7]) {
                if (var4.field5074[var6] != -1) {
                    this.method1252(0, 0, 0, 0);
                }
                this.method1252(var5.field2410[var7], var4.field5076[var6], var4.field5068[var6], var4.field5073[var6]);
            }
        }
        this.method1281();
    }

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "()I")
    public abstract int method1253();

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)V")
    public abstract void method1268(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(SS)V")
    public abstract void method1257(short arg0, short arg1);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIBLdm;ILdm;ZI)V")
    public final void method1817(int arg0, int arg1, int arg2, byte arg3, class265 arg4, int arg5, class265 arg6, boolean arg7, int arg8) {
        field4445++;
        if (arg8 == -1) {
            return;
        }
        if (arg3 < 77) {
            field4454 = null;
        }
        if (!this.method1262()) {
            return;
        }
        class340 var10 = arg6.field4035[arg8];
        class168 var11 = var10.field5075;
        class340 var12 = null;
        if (arg4 != null) {
            var12 = arg4.field4035[arg1];
            if (var12.field5075 != var11) {
                var12 = null;
            }
        }
        this.method1809(arg0, var11, (byte) 104, var12, var10, arg7, arg2, 65535, (boolean[]) null, false, (int[]) null, arg5);
        this.method1281();
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(III)V")
    public abstract void method1266(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(SS)V")
    public abstract void method1259(short arg0, short arg1);

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "()I")
    public abstract int method1298();

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "(I)V")
    public abstract void method1295(int arg0);

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "()I")
    public abstract int method1304();

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)V")
    public abstract void method1277(int arg0);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILs;Ls;III)V")
    public abstract void method1280(int arg0, int arg1, class143 arg2, class143 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "(I)V")
    public abstract void method1254(int arg0);

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "(I)V")
    public abstract void method1286(int arg0);

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "(I)V")
    public static void method1818(int arg0) {
        field4440 = null;
        field4454 = null;
        field4448 = null;
        int var1 = -17 / ((arg0 - 41) / 58);
        field4451 = null;
    }

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "()I")
    public abstract int method1306();

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILs;IIIII)V")
    public final void method1819(int arg0, class143 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4442++;
        boolean var8 = false;
        if (arg3 != 16383) {
            field4440 = null;
        }
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg0 / 2;
        int var12 = -arg5 / 2;
        int var13 = arg1.method100(arg4 + var11, arg2 + var12);
        int var14 = arg0 / 2;
        int var15 = -arg5 / 2;
        int var16 = arg1.method100(arg4 + var14, arg2 + var15);
        int var17 = -arg0 / 2;
        int var18 = arg5 / 2;
        int var19 = arg1.method100(arg4 + var17, arg2 + var18);
        int var20 = arg0 / 2;
        int var21 = arg5 / 2;
        int var22 = arg1.method100(arg4 + var20, arg2 + var21);
        int var23 = var16 > var13 ? var13 : var16;
        int var24 = var22 <= var19 ? var22 : var19;
        int var25 = var16 < var22 ? var16 : var22;
        int var26 = var19 > var13 ? var13 : var19;
        if (arg5 != 0) {
            int var27 = (int) (Math.atan2((double) (var23 - var24), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
            if (var27 != 0) {
                this.method1254(var27);
            }
        }
        if (arg0 != 0) {
            int var28 = (int) (Math.atan2((double) (var26 - var25), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var28 != 0) {
                this.method1291(var28);
            }
        }
        int var29 = var13 + var22;
        if (var29 > (var16 + var19)) {
            var29 = var16 + var19;
        }
        int var30 = (var29 >> 1) - arg6;
        if (var30 != 0) {
            this.method1266(0, var30, 0);
        }
    }

    static {
        for (int var0 = 0; var0 < field4454.length; var0++) {
            field4454[var0] = new class354();
        }
    }
}
