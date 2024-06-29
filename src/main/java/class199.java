import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class199 {

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "[I")
    private int[] field3173;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[B")
    private byte[] field3168;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "[I")
    private int[] field3174;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Z")
    public static boolean field3165 = false;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lnk;")
    public static class326 field3166 = new class326(79, 3);

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field3176 = 0;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lqs;")
    public static class496 field3169;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static void method1317(byte arg0) {
        field3166 = null;
        field3169 = null;
        int var1 = -44 % ((-arg0 - 76) / 41);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static final void method1318(int arg0) {
        field3175++;
        if (class107.field1903) {
            return;
        }
        class346.method2238(6327, class417.field6321);
        if (arg0 == 79) {
            if (class213.field3395 != null) {
                class346.method2238(6327, class213.field3395);
            }
            class107.field1903 = true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1319(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (class472.field6996 >= arg3 && arg2 >= class29.field460) {
            boolean var6;
            if (class182.field2877 > arg0) {
                var6 = false;
                arg0 = class182.field2877;
            } else if (arg0 <= class235.field4076) {
                var6 = true;
            } else {
                arg0 = class235.field4076;
                var6 = false;
            }
            boolean var7;
            if (class182.field2877 > arg1) {
                arg1 = class182.field2877;
                var7 = false;
            } else if (class235.field4076 >= arg1) {
                var7 = true;
            } else {
                var7 = false;
                arg1 = class235.field4076;
            }
            if (arg3 < class29.field460) {
                arg3 = class29.field460;
            } else {
                class357.method2291(arg0, arg5, class209.field3294[arg3++], arg1, -1);
            }
            if (arg2 <= class472.field6996) {
                class357.method2291(arg0, arg5, class209.field3294[arg2--], arg1, -1);
            } else {
                arg2 = class472.field6996;
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg2; var8++) {
                    int[] var9 = class209.field3294[var8];
                    var9[arg0] = var9[arg1] = arg5;
                }
            } else if (var6) {
                for (int var10 = arg3; var10 <= arg2; var10++) {
                    class209.field3294[var10][arg0] = arg5;
                }
            } else if (var7) {
                for (int var11 = arg3; var11 <= arg2; var11++) {
                    class209.field3294[var11][arg1] = arg5;
                }
            }
        }
        if (arg4 < 121) {
            method1317((byte) -123);
        }
        field3167++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([BIB[BII)I")
    public final int method1320(byte[] arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5) {
        field3172++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg1 + arg5;
        int var9 = arg4;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field3174[var7];
            }
            int var11;
            if ((var11 = this.field3174[var7]) < 0) {
                arg0[arg1++] = (byte) (~var11);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field3174[var7];
            }
            int var12;
            if ((var12 = this.field3174[var7]) < 0) {
                arg0[arg1++] = (byte) (~var12);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field3174[var7];
            }
            int var13;
            if ((var13 = this.field3174[var7]) < 0) {
                arg0[arg1++] = (byte) (~var13);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field3174[var7];
            }
            int var14;
            if ((var14 = this.field3174[var7]) < 0) {
                arg0[arg1++] = (byte) (~var14);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field3174[var7];
            }
            int var15;
            if ((var15 = this.field3174[var7]) < 0) {
                arg0[arg1++] = (byte) (~var15);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field3174[var7];
            }
            int var16;
            if ((var16 = this.field3174[var7]) < 0) {
                arg0[arg1++] = (byte) (~var16);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field3174[var7];
            }
            int var17;
            if ((var17 = this.field3174[var7]) < 0) {
                arg0[arg1++] = (byte) (~var17);
                if (var8 <= arg1) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field3174[var7];
            }
            int var18;
            if ((var18 = this.field3174[var7]) < 0) {
                arg0[arg1++] = (byte) (~var18);
                if (arg1 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg2 >= -37) {
            method1318(-32);
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Z")
    public static final boolean method1321(int arg0) {
        field3163++;
        if (class193.field3011) {
            try {
                if ((Boolean) class456.method2735(-27001, "showingVideoAd", class419.field6342.field7203)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 >= -86 ? true : true;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IC)Z")
    public static final boolean method1322(int arg0, char arg1) {
        field3170++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        } else if (arg0 == 6428) {
            if (arg1 != '\u0000') {
                char[] var2 = class362.field5643;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([B)V")
    public class199(byte[] arg0) {
        int var2 = arg0.length;
        this.field3173 = new int[var2];
        this.field3168 = arg0;
        int[] var3 = new int[33];
        this.field3174 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3173[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class338.method2141(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3174[var14] == 0) {
                            this.field3174[var14] = var4;
                        }
                        var14 = this.field3174[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field3174.length <= var14) {
                        int[] var18 = new int[this.field3174.length * 2];
                        for (int var19 = 0; var19 < this.field3174.length; var19++) {
                            var18[var19] = this.field3174[var19];
                        }
                        this.field3174 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field3174[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI[BIII)I")
    public final int method1323(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field3171++;
        int var7 = arg5;
        int var8 = arg3 << 3;
        int var9 = arg1 + arg4;
        while (var9 > arg1) {
            int var10 = arg0[arg1] & 0xFF;
            int var11 = this.field3173[var10];
            byte var12 = this.field3168[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 - (1 - var12) >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class338.method2141(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg1++;
        }
        return (var8 + 7 >> 3) - arg3;
    }
}
