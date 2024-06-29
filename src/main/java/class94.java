import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class94 {

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "[I")
    private int[] field1703;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "[I")
    private int[] field1694;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[B")
    private byte[] field1693;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "Lcf;")
    public static class93 field1701 = class147.method1066(")2", -48);

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lnh;")
    public static class54 field1697 = new class54(20);

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "[J")
    public static long[] field1706 = new long[32];

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Lcf;")
    public static class93 field1707 = class147.method1066("<br>(X", -48);

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lcf;")
    public static class93 field1708 = class147.method1066(")4", -48);

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "[I")
    public static int[] field1705;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
    public static final int method689(int arg0, int arg1) {
        field1692++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg1 != 128) {
            field1697 = null;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static void method690(int arg0) {
        field1705 = null;
        field1708 = null;
        field1701 = null;
        field1707 = null;
        field1706 = null;
        if (arg0 != 4) {
            method696(-89, false);
        }
        field1697 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[B[BIZI)I")
    public final int method691(int arg0, byte[] arg1, byte[] arg2, int arg3, boolean arg4, int arg5) {
        field1700++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field1703[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1703[var8]) < 0) {
                arg1[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1703[var8];
            }
            int var12;
            if ((var12 = this.field1703[var8]) < 0) {
                arg1[arg3++] = (byte) (~var12);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1703[var8];
            }
            int var13;
            if ((var13 = this.field1703[var8]) < 0) {
                arg1[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1703[var8];
            }
            int var14;
            if ((var14 = this.field1703[var8]) < 0) {
                arg1[arg3++] = (byte) (~var14);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1703[var8];
            }
            int var15;
            if ((var15 = this.field1703[var8]) < 0) {
                arg1[arg3++] = (byte) (~var15);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1703[var8];
            }
            int var16;
            if ((var16 = this.field1703[var8]) < 0) {
                arg1[arg3++] = (byte) (~var16);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1703[var8];
            }
            int var17;
            if ((var17 = this.field1703[var8]) < 0) {
                arg1[arg3++] = (byte) (~var17);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1703[var8];
            }
            int var18;
            if ((var18 = this.field1703[var8]) < 0) {
                arg1[arg3++] = (byte) (~var18);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg4) {
            this.field1693 = null;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lgl;III)V")
    public static final void method692(class211 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class210.field3821) {
            class41 var4 = class232.field4138[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field652 != null && var4.field652.field459.method444()) {
                arg0.method432(var4.field652.field459, 128, 0, 0, true);
            }
        }
        if (arg3 < class210.field3821) {
            class41 var5 = class232.field4138[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field652 != null && var5.field652.field459.method444()) {
                arg0.method432(var5.field652.field459, 0, 0, 128, true);
            }
        }
        if (arg2 < class210.field3821 && arg3 < class256.field4623) {
            class41 var6 = class232.field4138[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field652 != null && var6.field652.field459.method444()) {
                arg0.method432(var6.field652.field459, 128, 0, 128, true);
            }
        }
        if (arg2 < class210.field3821 && arg3 > 0) {
            class41 var7 = class232.field4138[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field652 != null && var7.field652.field459.method444()) {
                arg0.method432(var7.field652.field459, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III[BI[B)I")
    public final int method693(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        int var7 = arg2 + arg4;
        field1695++;
        int var8 = 0;
        int var9 = arg1 << 3;
        if (arg0 != -1795109117) {
            this.field1694 = null;
        }
        while (arg4 < var7) {
            int var10 = arg5[arg4] & 0xFF;
            int var11 = this.field1694[var10];
            byte var12 = this.field1693[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var8 = class270.method1797(var16, var11 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var8 = var11 >>> var14);
                if (var15 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var15) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIBIIIII)Z")
    public static final boolean method694(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        long var8 = class90.method625(arg3, arg4 + arg6, arg1 + arg7);
        field1699++;
        if (var8 != 0L) {
            int var10 = (int) var8 >> 14 & 0x1F;
            int var11 = (int) (var8 >>> 32) & Integer.MAX_VALUE;
            class240 var12 = class34.method197(-122, var11);
            int var13 = ((int) var8 & 0x3A5F0F) >> 20;
            if (var12.field4269 == -1) {
                int var14 = arg5;
                int[] var15 = class75.field1397;
                int var16 = (103 - arg1) * 512 * 4 + arg4 * 4 + 24624;
                if (var8 > 0L) {
                    var14 = arg0;
                }
                if (var10 == 0 || var10 == 2) {
                    if (var13 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var13 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var13 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 515] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var13 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var13 == 0) {
                        var15[var16] = var14;
                    } else if (var13 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var13 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var13 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var13 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var13 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var13 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var13 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1 + 1536] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
            } else if (!class29.method159(arg1, arg6, var12, var13, arg7, 46, arg4)) {
                return false;
            }
        }
        if (arg2 != 126) {
            method696(70, false);
        }
        long var17 = class180.method1324(arg3, arg4 + arg6, arg1 - -arg7);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x33A74E) >> 20;
            int var20 = ((int) var17 & 0x7FE95) >> 14;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            class240 var22 = class34.method197(-123, var21);
            if (var22.field4269 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class75.field1397;
                    int var25 = (52736 - (arg1 * 512)) * 4 + arg4 * 4 + 24624;
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1 + 1024] = var23;
                        var24[var25 + 514] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 512 + 1] = var23;
                        var24[var25 + 2 + 1024] = var23;
                        var24[var25 + 3 + 1536] = var23;
                    }
                }
            } else if (!class29.method159(arg1, arg6, var22, var19, arg7, 78, arg4)) {
                return false;
            }
        }
        long var26 = class269.method1795(arg3, arg4 + arg6, arg1 + arg7);
        if (var26 != 0L) {
            int var28 = ((int) var26 & 0x3DA7BB) >> 20;
            int var29 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class240 var30 = class34.method197(-110, var29);
            if (var30.field4269 != -1 && !class29.method159(arg1, arg6, var30, var28, arg7, 55, arg4)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B[Lvf;IIIIIZ[BII)V")
    public static final void method695(byte arg0, class102[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, byte[] arg8, int arg9, int arg10) {
        class280 var11 = new class280(arg8);
        field1698++;
        int var12 = -1;
        int var13 = -126 / ((44 - arg0) / 52);
        while (true) {
            int var14 = var11.method1915(2029724776);
            if (var14 == 0) {
                return;
            }
            var12 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var11.method1924(8100);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var11.method1907(16832);
                int var20 = var15 >> 12;
                int var21 = var19 >> 2;
                int var22 = var19 & 0x3;
                if (arg10 == var20 && var18 >= arg2 && var18 < arg2 + 8 && var17 >= arg4 && var17 < (arg4 + 8)) {
                    class240 var23 = class34.method197(-126, var12);
                    int var24 = arg5 + class38.method222(var17 & 0x7, false, arg3, var22, var18 & 0x7, var23.field4288, var23.field4285);
                    int var25 = class248.method1688(var17 & 0x7, var23.field4288, var22, var18 & 0x7, var23.field4285, (byte) 105, arg3) + arg6;
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        class102 var26 = null;
                        if (!arg7) {
                            int var27 = arg9;
                            if ((class4.field53[1][var24][var25] & 0x2) == 2) {
                                var27 = arg9 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg1[var27];
                            }
                        }
                        class90.method627(arg9, var26, var21, -117, arg9, var24, arg3 + var22 & 0x3, !arg7, var12, arg7, var25);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
    public static final void method696(int arg0, boolean arg1) {
        for (class43 var2 = (class43) class70.field1278.method1151(103); var2 != null; var2 = (class43) class70.field1278.method1159(54)) {
            if (var2.field671 != null) {
                class35.field543.method1657(var2.field671);
                var2.field671 = null;
            }
            if (var2.field690 != null) {
                class35.field543.method1657(var2.field690);
                var2.field690 = null;
            }
            var2.method1544((byte) -40);
        }
        field1696++;
        if (arg1) {
            for (class43 var3 = (class43) class58.field990.method1151(116); var3 != null; var3 = (class43) class58.field990.method1159(arg0 + 77)) {
                if (var3.field671 != null) {
                    class35.field543.method1657(var3.field671);
                    var3.field671 = null;
                }
                var3.method1544((byte) -108);
            }
            for (class43 var4 = (class43) class117.field2064.method132((byte) 103); var4 != null; var4 = (class43) class117.field2064.method136(-125)) {
                if (var4.field671 != null) {
                    class35.field543.method1657(var4.field671);
                    var4.field671 = null;
                }
                var4.method1544((byte) -76);
            }
        }
        if (arg0 != 0) {
            field1705 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method697(byte arg0) {
        field1704++;
        if (arg0 == 18) {
            ;
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([B)V")
    public class94(byte[] arg0) {
        int var2 = arg0.length;
        this.field1703 = new int[8];
        this.field1694 = new int[var2];
        this.field1693 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1694[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class270.method1797(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1703[var14] == 0) {
                            this.field1703[var14] = var3;
                        }
                        var14 = this.field1703[var14];
                    }
                    if (var14 >= this.field1703.length) {
                        int[] var17 = new int[this.field1703.length * 2];
                        for (int var18 = 0; var18 < this.field1703.length; var18++) {
                            var17[var18] = this.field1703[var18];
                        }
                        this.field1703 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field1703[var14] = ~var5;
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
            }
        }
    }
}
