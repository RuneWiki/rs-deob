import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class238 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "[I")
    private int[] field4304;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[I")
    private int[] field4307;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[B")
    private byte[] field4310;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lla;")
    public static class95 field4308 = new class95(32);

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[I")
    public static int[] field4313 = new int[50];

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lsj;")
    public static class49 field4305;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLcc;ILcc;)V")
    public static final void method1649(byte arg0, class209 arg1, int arg2, class209 arg3) {
        class94.method655(arg3, -1, (class209) null, arg1, -116, arg2);
        if (arg0 > -116) {
            method1652(-35, 81, 29);
        }
        field4311++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[BI[BB)I")
    public final int method1650(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte arg5) {
        int var7 = arg1 + arg3;
        field4312++;
        int var8 = arg0 << 3;
        int var9 = 0;
        int var10 = -109 % ((-arg5 - 65) / 39);
        while (arg3 < var7) {
            int var11 = arg4[arg3] & 0xFF;
            int var12 = this.field4304[var11];
            byte var13 = this.field4310[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var8 & 0x7;
            int var15 = var8 >> 3;
            int var16 = var9 & -var14 >> 31;
            var8 += var13;
            int var17 = var15 + (var14 + var13 - 1 >> 3);
            int var18 = var14 + 24;
            arg2[var15] = (byte) (var9 = class6.method63(var16, var12 >>> var18));
            if (var15 < var17) {
                var14 = var18 - 8;
                var15++;
                arg2[var15] = (byte) (var9 = var12 >>> var14);
                if (var15 < var17) {
                    var15++;
                    var14 -= 8;
                    arg2[var15] = (byte) (var9 = var12 >>> var14);
                    if (var17 > var15) {
                        var15++;
                        var14 -= 8;
                        arg2[var15] = (byte) (var9 = var12 >>> var14);
                        if (var15 < var17) {
                            var15++;
                            var14 -= 8;
                            arg2[var15] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var8 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI[BI[B)I")
    public final int method1651(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field4309++;
        if (arg1 <= 107) {
            return -68;
        } else if (arg0 == 0) {
            return 0;
        } else {
            int var7 = arg0 + arg4;
            int var8 = 0;
            int var9 = arg2;
            while (true) {
                byte var10 = arg5[var9];
                if (var10 < 0) {
                    var8 = this.field4307[var8];
                } else {
                    var8++;
                }
                int var11;
                if ((var11 = this.field4307[var8]) < 0) {
                    arg3[arg4++] = (byte) (~var11);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field4307[var8];
                }
                int var12;
                if ((var12 = this.field4307[var8]) < 0) {
                    arg3[arg4++] = (byte) (~var12);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field4307[var8];
                }
                int var13;
                if ((var13 = this.field4307[var8]) < 0) {
                    arg3[arg4++] = (byte) (~var13);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field4307[var8];
                }
                int var14;
                if ((var14 = this.field4307[var8]) < 0) {
                    arg3[arg4++] = (byte) (~var14);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field4307[var8];
                }
                int var15;
                if ((var15 = this.field4307[var8]) < 0) {
                    arg3[arg4++] = (byte) (~var15);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field4307[var8];
                }
                int var16;
                if ((var16 = this.field4307[var8]) < 0) {
                    arg3[arg4++] = (byte) (~var16);
                    if (var7 <= arg4) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field4307[var8];
                }
                int var17;
                if ((var17 = this.field4307[var8]) < 0) {
                    arg3[arg4++] = (byte) (~var17);
                    if (var7 <= arg4) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field4307[var8];
                }
                int var18;
                if ((var18 = this.field4307[var8]) < 0) {
                    arg3[arg4++] = (byte) (~var18);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg2;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
    public static final void method1652(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class50.field983; var3++) {
            for (int var4 = 0; var4 < class56.field1154; var4++) {
                for (int var5 = 0; var5 < class277.field4879; var5++) {
                    class109 var6 = class106.field2089[var3][var4][var5];
                    if (var6 != null) {
                        class187 var7 = var6.field2213;
                        if (var7 != null && var7.field3377.method909()) {
                            class213.method1500(var7.field3377, var3, var4, var5, 1, 1);
                            if (var7.field3387 != null && var7.field3387.method909()) {
                                class213.method1500(var7.field3387, var3, var4, var5, 1, 1);
                                var7.field3377.method910(var7.field3387, 0, 0, 0, false);
                                var7.field3387 = var7.field3387.method906(arg0, arg1, arg2);
                            }
                            var7.field3377 = var7.field3377.method906(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2203; var8++) {
                            class264 var10 = var6.field2189[var8];
                            if (var10 != null && var10.field4735.method909()) {
                                class213.method1500(var10.field4735, var3, var4, var5, var10.field4747 + 1 - var10.field4746, var10.field4731 - var10.field4741 + 1);
                                var10.field4735 = var10.field4735.method906(arg0, arg1, arg2);
                            }
                        }
                        class230 var9 = var6.field2198;
                        if (var9 != null && var9.field4183.method909()) {
                            class181.method1239(var9.field4183, var3, var4, var5);
                            var9.field4183 = var9.field4183.method906(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1653(byte arg0) {
        field4308 = null;
        if (arg0 == -76) {
            field4313 = null;
            field4305 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BIIIII)V")
    public static final void method1654(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4306++;
        int var6 = (arg1 - 32) * arg1 / arg4;
        class206.field3688[0].method1330(arg5, arg2);
        class206.field3688[1].method1330(arg5, arg2 - (16 - arg1));
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg1 - var6 - 32) * arg3 / (arg4 - arg1);
        class4.method39(arg5, arg2 + 16, 16, arg1 - 32, class42.field854);
        class4.method39(arg5, arg2 + var7 + 16, 16, var6, class200.field3590);
        class4.method24(arg5, arg2 + var7 + 16, var6, class128.field2468);
        class4.method24(arg5 + 1, var7 + 16 + arg2, var6, class128.field2468);
        class4.method21(arg5, arg2 + var7 + 16, 16, class128.field2468);
        class4.method21(arg5, var7 + arg2 + 17, 16, class128.field2468);
        class4.method24(arg5 + 15, arg2 + 16 + var7, var6, class27.field489);
        if (arg0 == -78) {
            class4.method24(arg5 + 14, arg2 + var7 - -17, var6 - 1, class27.field489);
            class4.method21(arg5, var7 + var6 + arg2 + 15, 16, class27.field489);
            class4.method21(arg5 + 1, arg2 + var7 + var6 + 14, 15, class27.field489);
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "([B)V")
    public class238(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = 0;
        int var4 = arg0.length;
        this.field4304 = new int[var4];
        this.field4307 = new int[8];
        this.field4310 = arg0;
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field4304[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class6.method63(var11, var12);
                    }
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field4307[var14] == 0) {
                            this.field4307[var14] = var3;
                        }
                        var14 = this.field4307[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field4307.length) {
                        int[] var18 = new int[this.field4307.length * 2];
                        for (int var19 = 0; var19 < this.field4307.length; var19++) {
                            var18[var19] = this.field4307[var19];
                        }
                        this.field4307 = var18;
                    }
                }
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
                this.field4307[var14] = ~var5;
            }
        }
    }
}
