import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class484 {

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "[B")
    private byte[] field6974;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "[I")
    private int[] field6970;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "[I")
    private int[] field6971;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "Lew;")
    public static class270 field6966 = new class270(64);

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field6972 = -1;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "[Lwh;")
    public static class420[] field6973 = new class420[14];

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lza;IILc;III[[[B[I[I[I[I[IIBIIZ)V", line = 3)
    public static final void method2867(class295 arg0, int arg1, int arg2, class512 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class77.field1093 = arg0;
        class490.field7078 = arg1;
        class159.field2419 = arg3;
        class79.field1118 = class77.field1093.method502() > 0;
        class39.field578 = arg4 >> class295.field3991;
        class119.field1859 = arg6 >> class295.field3991;
        class104.field1714 = arg4;
        class257.field3495 = arg6;
        class41.field611 = arg5;
        class164.field2525 = class39.field578 - class282.field3832;
        if (class164.field2525 < 0) {
            class185.field2745 = -class164.field2525;
            class164.field2525 = 0;
        } else {
            class185.field2745 = 0;
        }
        class125.field1932 = class119.field1859 - class282.field3832;
        if (class125.field1932 < 0) {
            class58.field830 = -class125.field1932;
            class125.field1932 = 0;
        } else {
            class58.field830 = 0;
        }
        class245.field3356 = class39.field578 + class282.field3832;
        if (class245.field3356 > class124.field1916) {
            class245.field3356 = class124.field1916;
        }
        class215.field3054 = class282.field3832 + class119.field1859;
        if (class215.field3054 > class177.field2664) {
            class215.field3054 = class177.field2664;
        }
        for (int var18 = 0; var18 < class282.field3832 + class282.field3832 + 2; var18++) {
            for (int var23 = 0; var23 < class282.field3832 + class282.field3832 + 2; var23++) {
                int var24 = class39.field578 + var18 - class282.field3832;
                int var25 = class119.field1859 + var23 - class282.field3832;
                if (var24 >= 0 && var25 >= 0 && var24 < class124.field1916 && var25 < class177.field2664) {
                    int var26 = var24 << class295.field3991;
                    int var27 = var25 << class295.field3991;
                    int var28 = class348.field5000[class348.field5000.length - 1].method85(var24, var25) - (0x3E8 << class295.field3991 - 7);
                    int var29 = class36.field554 == null ? class348.field5000[0].method85(var24, var25) + class117.field1845 : class36.field554[0].method85(var24, var25) + class117.field1845;
                    class18.field280[var18][var23] = class77.field1093.method522(var26, var28, var27, var26, var29, var27);
                } else {
                    class18.field280[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class282.field3832 + class282.field3832 + 1; var19++) {
            for (int var22 = 0; var22 < class282.field3832 + class282.field3832 + 1; var22++) {
                class223.field3153[var19][var22] = class18.field280[var19][var22] || class18.field280[var19 + 1][var22] || class18.field280[var19][var22 + 1] || class18.field280[var19 + 1][var22 + 1];
            }
        }
        class451.field6613 = arg8;
        class422.field6136 = arg9;
        class400.field5735 = arg10;
        class509.field7456 = arg11;
        class476.field6880 = arg12;
        class353.method2118();
        class133.method965(-88);
        for (class121 var20 = (class121) class116.field1835.method2600((byte) 11); var20 != null; var20 = (class121) class116.field1835.method2601(109)) {
            var20.method2861((byte) 47);
            class385.method2281(0, var20);
        }
        if (class79.field1118) {
            for (int var21 = 0; var21 < class384.field5507; var21++) {
                class231.field3229[var21].method2566(arg1, arg17, (byte) 87);
            }
        }
        if (arg2 > 1) {
            class77.field1093.method513(0);
            if (class295.field3992 == null || class295.field3992 instanceof class307) {
                class295.field3992 = new class7();
            }
        } else if (class295.field3992 == null || class295.field3992 instanceof class7) {
            class295.field3992 = new class307();
        }
        class295.field3992.method48(arg2, (byte) -76);
        class295.field3992.method42(0);
        if (class239.field3306 != null) {
            class438.method2590(true);
            class295.field3992.method39((byte) 126, 22);
            class454.method2665(arg2, null, 0, (byte) 0, arg15, arg16);
            class295.field3992.method42(0);
            class295.field3992.method39((byte) 127, 23);
            class438.method2590(false);
        }
        class454.method2665(arg2, arg7, arg13, arg14, arg15, arg16);
        class295.field3992.method42(0);
        class295.field3992.method46(15609);
        class295.field3992.method42(0);
        if (arg2 > 1) {
            class77.field1093.method494(0);
        }
        class77.field1093.method503(0, null);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 162)
    public static void method2868(int arg0) {
        if (arg0 == 0) {
            field6973 = null;
            field6966 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "([BIIII[B)I", line = 174)
    public final int method2869(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field6967++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg1 + arg2;
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var7 = this.field6971[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field6971[var7]) < 0) {
                arg5[arg2++] = (byte) (~var11);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field6971[var7];
            }
            int var12;
            if ((var12 = this.field6971[var7]) < 0) {
                arg5[arg2++] = (byte) (~var12);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field6971[var7];
            }
            int var13;
            if ((var13 = this.field6971[var7]) < 0) {
                arg5[arg2++] = (byte) (~var13);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field6971[var7];
            }
            int var14;
            if ((var14 = this.field6971[var7]) < 0) {
                arg5[arg2++] = (byte) (~var14);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field6971[var7];
            }
            int var15;
            if ((var15 = this.field6971[var7]) < 0) {
                arg5[arg2++] = (byte) (~var15);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field6971[var7];
            }
            int var16;
            if ((var16 = this.field6971[var7]) < 0) {
                arg5[arg2++] = (byte) (~var16);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field6971[var7];
            }
            int var17;
            if ((var17 = this.field6971[var7]) < 0) {
                arg5[arg2++] = (byte) (~var17);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field6971[var7];
            }
            int var18;
            if ((var18 = this.field6971[var7]) < 0) {
                arg5[arg2++] = (byte) (~var18);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg4 != 1) {
            field6966 = null;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI[B[BII)I", line = 321)
    public final int method2870(boolean arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field6968++;
        int var7 = 0;
        int var8 = arg1 + arg4;
        int var9 = arg5 << 3;
        while (var8 > arg4) {
            int var10 = arg2[arg4] & 0xFF;
            int var11 = this.field6970[var10];
            byte var12 = this.field6974[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class219.method1367(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        if (!arg0) {
            this.method2870(true, -69, null, null, 57, -15);
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "([B)V", line = 407)
    public class484(byte[] arg0) {
        int var2 = arg0.length;
        this.field6974 = arg0;
        this.field6970 = new int[var2];
        int[] var3 = new int[33];
        this.field6971 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6970[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class219.method1367(var12, var11);
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
                        if (this.field6971[var14] == 0) {
                            this.field6971[var14] = var4;
                        }
                        var14 = this.field6971[var14];
                    }
                    if (this.field6971.length <= var14) {
                        int[] var17 = new int[this.field6971.length * 2];
                        for (int var18 = 0; var18 < this.field6971.length; var18++) {
                            var17[var18] = this.field6971[var18];
                        }
                        this.field6971 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field6971[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
