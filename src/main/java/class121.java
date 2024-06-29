import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class121 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1963 = new String[100];

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1962 = 0;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field1966 = 104;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field1968 = 1;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Lrn;")
    public static class174 field1971 = new class174(28, 4);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "()I")
    public abstract int method889();

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(SS)V")
    public abstract void method890(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "()I")
    public abstract int method891();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method892(int arg0) {
        field1965++;
        class201.field2939.method159(arg0);
        class504.field7439.method1677(489772293);
        class148.field2360.method1677(489772293);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()[Lwv;")
    public abstract class26[] method893();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIBILna;III)V")
    public final void method894(int arg0, int arg1, int arg2, byte arg3, int arg4, class35 arg5, int arg6, int arg7, int arg8) {
        field1960++;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = -arg1 / 2;
        int var14 = -arg2 / 2;
        int var15 = arg5.method371(arg7 + var13, arg0 + var14);
        int var16 = arg1 / 2;
        int var17 = -arg2 / 2;
        int var18 = arg5.method371(arg7 + var16, arg0 + var17);
        int var19 = -arg1 / 2;
        int var20 = arg2 / 2;
        int var21 = arg5.method371(arg7 + var19, arg0 + var20);
        int var22 = arg1 / 2;
        if (arg3 != -15) {
            return;
        }
        int var23 = arg2 / 2;
        int var24 = arg5.method371(arg7 + var22, arg0 - -var23);
        int var25 = var15 >= var18 ? var18 : var15;
        int var26 = var21 >= var24 ? var24 : var21;
        int var27 = var24 <= var18 ? var24 : var18;
        int var28 = var21 <= var15 ? var21 : var15;
        if (arg2 != 0) {
            int var29 = (int) (Math.atan2((double) (var25 - var26), (double) arg2) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                if (arg8 != 0) {
                    if (var29 > 8192) {
                        int var30 = 16384 - arg8;
                        if (var30 > var29) {
                            var29 = var30;
                        }
                    } else if (arg8 < var29) {
                        var29 = arg8;
                    }
                }
                this.method922(var29);
            }
        }
        int var31 = var15 + var24;
        if (arg1 != 0) {
            int var32 = (int) (Math.atan2((double) (var28 - var27), (double) arg1) * 2607.5945876176133D) & 0x3FFF;
            if (var32 != 0) {
                if (arg6 != 0) {
                    if (var32 > 8192) {
                        int var33 = 16384 - arg6;
                        if (var32 < var33) {
                            var32 = var33;
                        }
                    } else if (arg6 < var32) {
                        var32 = arg6;
                    }
                }
                this.method895(var32);
            }
        }
        if ((var18 + var21) < var31) {
            var31 = var18 + var21;
        }
        int var34 = (var31 >> 1) - arg4;
        if (var34 != 0) {
            this.method923(0, var34, 0);
        }
    }

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(I)V")
    public abstract void method895(int arg0);

    @OriginalMember(owner = "client!c", name = "FA", descriptor = "()Z")
    public abstract boolean method896();

    @OriginalMember(owner = "client!c", name = "sa", descriptor = "()V")
    public abstract void method897();

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()V")
    public abstract void method898();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Llc;II)V")
    public abstract void method899(class414 arg0, class456 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(IILna;Lna;III)V")
    public abstract void method900(int arg0, int arg1, class35 arg2, class35 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwg;IZILwg;I[IBIII)V")
    public final void method901(class291 arg0, int arg1, boolean arg2, int arg3, class291 arg4, int arg5, int[] arg6, byte arg7, int arg8, int arg9, int arg10) {
        field1974++;
        if (arg3 == -1 || !this.method896()) {
            return;
        }
        class191 var12 = arg4.field4143[arg3];
        class498 var13 = var12.field2842;
        class191 var14 = null;
        if (arg0 != null) {
            var14 = arg0.field4143[arg8];
            if (var14.field2842 != var13) {
                var14 = null;
            }
        }
        this.method914(false, var13, arg1, arg9, var12, arg6, arg2, 0, arg10, arg5, var14, null);
        int var15 = 4 / ((arg7 + 72) / 44);
        this.method934();
    }

    @OriginalMember(owner = "client!c", name = "ZA", descriptor = "(I)V")
    public abstract void method902(int arg0);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()[Lnk;")
    public abstract class501[] method903();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ[IIII[III)V")
    private final void method904(byte arg0, int arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        field1959++;
        if (arg8 == 1) {
            if (arg9 == 0 || arg9 == 1) {
                int var16 = -arg1;
                arg1 = arg5;
                arg5 = var16;
            } else if (arg9 == 3) {
                int var14 = arg1;
                arg1 = arg5;
                arg5 = var14;
            } else if (arg9 == 2) {
                int var15 = arg1;
                arg1 = -arg5 & 0x3FFF;
                arg5 = var15 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg9 == 0 || arg9 == 1) {
                arg5 = -arg5;
                arg1 = -arg1;
            } else if (arg9 == 2) {
                arg5 = -arg5 & 0x3FFF;
                arg1 = -arg1 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg9 == 0 || arg9 == 1) {
                int var13 = arg1;
                arg1 = -arg5;
                arg5 = var13;
            } else if (arg9 == 3) {
                int var11 = arg1;
                arg1 = arg5;
                arg5 = var11;
            } else if (arg9 == 2) {
                int var12 = arg1;
                arg1 = arg5 & 0x3FFF;
                arg5 = -var12 & 0x3FFF;
            }
        }
        if (arg0 != -20) {
            field1962 = -104;
        }
        if (arg4 == 65535) {
            this.method917(arg9, arg7, arg1, arg6, arg5, arg8, arg2);
        } else {
            this.method919(arg9, arg7, arg1, arg6, arg5, arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!c", name = "fa", descriptor = "()I")
    public abstract int method905();

    @OriginalMember(owner = "client!c", name = "u", descriptor = "(I)V")
    public abstract void method906(int arg0);

    @OriginalMember(owner = "client!c", name = "la", descriptor = "()I")
    public abstract int method907();

    @OriginalMember(owner = "client!c", name = "oa", descriptor = "(I)V")
    public abstract void method908(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I")
    public static int method909(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
    public static final void method910(int arg0, int arg1, int arg2) {
        if (class259.field3768 != arg0) {
            class69.field1199 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class69.field1199[var3] = (var3 << 12) / arg0;
            }
            class65.field1124 = arg0 * 32;
            class290.field4128 = arg0 - 1;
            class259.field3768 = arg0;
        }
        field1964++;
        if (arg2 >= -86) {
            method926(122, 20, -62, 123, -45, -58);
        }
        if (class457.field6849 == arg1) {
            return;
        }
        if (class259.field3768 == arg1) {
            class433.field6429 = class69.field1199;
        } else {
            class433.field6429 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class433.field6429[var4] = (var4 << 12) / arg1;
            }
        }
        class457.field6849 = arg1;
        class506.field7463 = arg1 - 1;
    }

    @OriginalMember(owner = "client!c", name = "VA", descriptor = "()I")
    public abstract int method911();

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(I)V")
    public abstract void method912(int arg0);

    @OriginalMember(owner = "client!c", name = "ia", descriptor = "(I)V")
    public abstract void method913(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLki;IILtr;[IZIIILtr;[Z)V")
    private final void method914(boolean arg0, class498 arg1, int arg2, int arg3, class191 arg4, int[] arg5, boolean arg6, int arg7, int arg8, int arg9, class191 arg10, boolean[] arg11) {
        field1970++;
        if (arg10 == null || arg8 == 0) {
            for (int var38 = 0; var38 < arg4.field2848; var38++) {
                short var39 = arg4.field2850[var38];
                if (arg11 == null || arg0 == arg11[var39] || arg1.field7350[var39] == 0) {
                    short var40 = arg4.field2852[var38];
                    if (var40 != -1) {
                        this.method904((byte) -20, 0, arg6, arg5, arg2 & arg1.field7354[var40], 0, 0, arg1.field7356[var40], arg3, 0);
                    }
                    this.method904((byte) -20, arg4.field2845[var38], arg6, arg5, arg2 & arg1.field7354[var39], arg4.field2847[var38], arg4.field2840[var38], arg1.field7356[var39], arg3, arg1.field7350[var39]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = arg7;
        for (int var15 = 0; var15 < arg1.field7352; var15++) {
            boolean var16 = false;
            if (var13 < arg4.field2848 && arg4.field2850[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (var14 < arg10.field2848 && arg10.field2850[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg11 == null || arg11[var15] == arg0 || arg1.field7350[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg1.field7350[var15];
                    if (var19 == 3 || var19 == 10) {
                        var18 = 128;
                    }
                    short var20;
                    short var21;
                    short var22;
                    short var23;
                    byte var24;
                    if (var16) {
                        var20 = arg4.field2847[var13];
                        var21 = arg4.field2852[var13];
                        var22 = arg4.field2845[var13];
                        var23 = arg4.field2840[var13];
                        var24 = arg4.field2849[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = -1;
                        var23 = var18;
                        var22 = var18;
                        var24 = 0;
                    }
                    short var25;
                    byte var26;
                    short var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var28 = arg10.field2840[var14];
                        var29 = arg10.field2852[var14];
                        var25 = arg10.field2847[var14];
                        var26 = arg10.field2849[var14];
                        var27 = arg10.field2845[var14];
                        var14++;
                    } else {
                        var25 = var18;
                        var26 = 0;
                        var27 = var18;
                        var28 = var18;
                        var29 = -1;
                    }
                    if (var21 != -1) {
                        this.method904((byte) -20, 0, arg6, arg5, arg2 & arg1.field7354[var21], 0, 0, arg1.field7356[var21], arg3, 0);
                    } else if (var29 != -1) {
                        this.method904((byte) -20, 0, arg6, arg5, arg2 & arg1.field7354[var29], 0, 0, arg1.field7356[var29], arg3, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var24 & 0x2) != 0 || (var26 & 0x1) != 0) {
                        var35 = var20;
                        var34 = var22;
                        var33 = var23;
                    } else if (var19 == 2) {
                        int var30 = var27 - var22 & 0x3FFF;
                        int var31 = var28 - var23 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        int var32 = var25 - var20 & 0x3FFF;
                        var33 = arg8 * var31 / arg9 + var23 & 0x3FFF;
                        var34 = arg8 * var30 / arg9 + var22 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = arg8 * var32 / arg9 + var20 & 0x3FFF;
                    } else if (var19 == 9) {
                        int var36 = var27 - var22 & 0x3FFF;
                        if (var36 >= 8192) {
                            var36 -= 16384;
                        }
                        var34 = arg8 * var36 / arg9 + var22 & 0x3FFF;
                        var35 = 0;
                        var33 = 0;
                    } else if (var19 == 7) {
                        int var37 = var27 - var22 & 0x3F;
                        if (var37 >= 32) {
                            var37 -= 64;
                        }
                        var34 = var22 + (arg8 * var37 / arg9) & 0x3F;
                        var33 = (var28 - var23) * arg8 / arg9 + var23;
                        var35 = var20 + ((var25 - var20) * arg8 / arg9);
                    } else {
                        var34 = (var27 - var22) * arg8 / arg9 + var22;
                        var33 = (var28 - var23) * arg8 / arg9 + var23;
                        var35 = (var25 - var20) * arg8 / arg9 + var20;
                    }
                    this.method904((byte) -20, var34, arg6, arg5, arg2 & arg1.field7354[var15], var35, var33, arg1.field7356[var15], arg3, var19);
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

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()Z")
    public abstract boolean method915();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwg;ZLwg;IIIIII)V")
    public final void method916(class291 arg0, boolean arg1, class291 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1972++;
        if (arg4 == -1 || !this.method896()) {
            return;
        }
        class191 var10 = arg0.field4143[arg4];
        class498 var11 = var10.field2842;
        class191 var12 = null;
        if (arg2 != null) {
            var12 = arg2.field4143[arg8];
            if (var12.field2842 != var11) {
                var12 = null;
            }
        }
        this.method914(false, var11, 65535, arg6, var10, null, arg1, 0, arg5, arg3, var12, null);
        if (arg7 >= -27) {
            field1968 = 41;
        }
        this.method934();
    }

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "(I[IIIIIZ)V")
    public abstract void method917(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method918(boolean arg0) {
        field1971 = null;
        field1963 = null;
        if (!arg0) {
            method918(false);
        }
    }

    @OriginalMember(owner = "client!c", name = "va", descriptor = "(I[IIIIZI[I)V")
    public abstract void method919(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "()I")
    public abstract int method920();

    @OriginalMember(owner = "client!c", name = "C", descriptor = "()I")
    public abstract int method921();

    @OriginalMember(owner = "client!c", name = "WA", descriptor = "(I)V")
    public abstract void method922(int arg0);

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(III)V")
    public abstract void method923(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILia;Z)Z")
    public abstract boolean method924(int arg0, int arg1, class414 arg2, boolean arg3);

    @OriginalMember(owner = "client!c", name = "XA", descriptor = "(III)V")
    public abstract void method925(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V")
    public static final void method926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -105 % ((arg5 - 39) / 59);
        class236.field3423 = arg0;
        class184.field2758 = arg4;
        class152.field2416 = arg3;
        field1961++;
        class255.field3660 = arg1;
        class420.field6283 = arg2;
        if (class255.field3660 >= 100) {
            int var7 = class420.field6283 * 128 + 64;
            int var8 = class184.field2758 * 128 + 64;
            int var9 = class343.method2188(class163.field2525, var7, (byte) -102, var8) - class152.field2416;
            int var10 = var7 - class40.field732;
            int var11 = var9 - class222.field3184;
            int var12 = var8 - class405.field6075;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class122.field1982 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 0x3FFF;
            class291.field4148 = (int) (-2607.5945876176133D * Math.atan2((double) var10, (double) var12)) & 0x3FFF;
            if (class122.field1982 < 1024) {
                class122.field1982 = 1024;
            }
            class291.field4137 = 0;
            if (class122.field1982 > 3072) {
                class122.field1982 = 3072;
            }
        }
        class85.field1473 = 2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lia;Llc;I)V")
    public abstract void method927(class414 arg0, class456 arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lc;IIIZ)V")
    public abstract void method928(class121 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(IIII)V")
    public abstract void method929(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
    public abstract int method930();

    @OriginalMember(owner = "client!c", name = "X", descriptor = "()I")
    public abstract int method931();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwg;IIZILwg;I[ZLwg;IIIIILwg;)V")
    public final void method932(class291 arg0, int arg1, int arg2, boolean arg3, int arg4, class291 arg5, int arg6, boolean[] arg7, class291 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, class291 arg14) {
        field1969++;
        if (arg10 == -1) {
            return;
        }
        if (arg7 == null || arg9 == -1) {
            this.method916(arg14, arg3, arg0, arg13, arg10, arg11, 0, arg6 ^ 0xFFFFFF81, arg4);
        } else if (this.method896()) {
            class191 var16 = arg14.field4143[arg10];
            class498 var17 = var16.field2842;
            class191 var18 = null;
            if (arg0 != null) {
                var18 = arg0.field4143[arg4];
                if (var18.field2842 != var17) {
                    var18 = null;
                }
            }
            this.method914(false, var17, 65535, 0, var16, null, arg3, 0, arg11, arg13, var18, arg7);
            class191 var19 = arg5.field4143[arg9];
            class191 var20 = null;
            if (arg8 != null) {
                var20 = arg8.field4143[arg2];
                if (var20.field2842 != var17) {
                    var20 = null;
                }
            }
            this.method917(0, new int[0], 0, 0, arg6, 0, arg3);
            this.method914(true, var19.field2842, 65535, 0, var19, null, arg3, arg6, arg12, arg1, var20, arg7);
            this.method934();
        }
    }

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(SS)V")
    public abstract void method933(short arg0, short arg1);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "()V")
    public abstract void method934();

    @OriginalMember(owner = "client!c", name = "E", descriptor = "()I")
    public abstract int method935();

    @OriginalMember(owner = "client!c", name = "ua", descriptor = "(Lj;)Lj;")
    public abstract class377 method936(class377 arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lwg;II)V")
    public final void method937(class291 arg0, int arg1, int arg2) {
        field1967++;
        if (arg1 == -1 || !this.method896()) {
            return;
        }
        class191 var4 = arg0.field4143[arg1];
        class498 var5 = var4.field2842;
        for (int var6 = 0; var6 < var4.field2848; var6++) {
            short var7 = var4.field2850[var6];
            if (var5.field7351[var7]) {
                if (var4.field2852[var6] != -1) {
                    this.method929(0, 0, 0, 0);
                }
                this.method929(var5.field7350[var7], var4.field2845[var6], var4.field2840[var6], var4.field2847[var6]);
            }
        }
        this.method934();
        if (arg2 != -10988) {
            field1971 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIZ)Lc;")
    public abstract class121 method938(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
    public abstract void method939(int arg0, int arg1, int arg2, int arg3);
}
