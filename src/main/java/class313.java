import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class313 extends class304 {

    @OriginalMember(owner = "client!vm", name = "V", descriptor = "I")
    public int field4849 = 0;

    @OriginalMember(owner = "client!vm", name = "ab", descriptor = "Z")
    public boolean field4854 = true;

    @OriginalMember(owner = "client!vm", name = "T", descriptor = "I")
    public int field4847 = 4;

    @OriginalMember(owner = "client!vm", name = "X", descriptor = "I")
    public int field4851 = 4;

    @OriginalMember(owner = "client!vm", name = "fb", descriptor = "I")
    public int field4859 = 4;

    @OriginalMember(owner = "client!vm", name = "hb", descriptor = "I")
    public int field4861 = 1638;

    @OriginalMember(owner = "client!vm", name = "eb", descriptor = "[B")
    private byte[] field4858 = new byte[512];

    @OriginalMember(owner = "client!vm", name = "Q", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!vm", name = "R", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!vm", name = "U", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!vm", name = "Y", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!vm", name = "Z", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!vm", name = "bb", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!vm", name = "cb", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!vm", name = "gb", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!vm", name = "ib", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!vm", name = "db", descriptor = "Z")
    public static boolean field4857;

    @OriginalMember(owner = "client!vm", name = "W", descriptor = "[S")
    private short[] field4850;

    @OriginalMember(owner = "client!vm", name = "jb", descriptor = "[S")
    private short[] field4863;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V", line = 4)
    public final void method100(boolean arg0) {
        field4860++;
        this.field4858 = class300.method2067(false, this.field4849);
        this.method2141((byte) -125);
        if (!arg0) {
            this.method2144(41, 23, 59, -7, (byte) -117, -26, 29);
        }
        for (int var2 = this.field4851 - 1; var2 >= 1; var2--) {
            short var3 = this.field4863[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field4851--;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lwm;II)V", line = 37)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field4855++;
        if (arg2 != -2828) {
            this.field4850 = (short[]) null;
        }
        if (arg1 == 0) {
            this.field4854 = arg0.method1774((byte) -113) == 1;
        } else if (arg1 == 1) {
            this.field4851 = arg0.method1774((byte) 90);
        } else if (arg1 == 2) {
            this.field4861 = arg0.method1768(65536);
            if (this.field4861 < 0) {
                this.field4863 = new short[this.field4851];
                for (int var5 = 0; var5 < this.field4851; var5++) {
                    this.field4863[var5] = (short) arg0.method1768(65536);
                }
            }
        } else if (arg1 == 3) {
            this.field4847 = this.field4859 = arg0.method1774((byte) 5);
        } else if (arg1 == 4) {
            this.field4849 = arg0.method1774((byte) 15);
        } else if (arg1 == 5) {
            this.field4847 = arg0.method1774((byte) -122);
        } else if (arg1 == 6) {
            this.field4859 = arg0.method1774((byte) 7);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljd;B)V", line = 132)
    public static final void method2138(class95 arg0, byte arg1) {
        class65.field948 = arg0.method690((byte) -124, "titlebg");
        field4853++;
        if (arg1 >= 0) {
            class223.field3395 = arg0.method690((byte) -118, "logo");
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 145)
    public class313() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II[I)V", line = 152)
    public final void method2139(int arg0, int arg1, int[] arg2) {
        field4862++;
        int var4 = class84.field1225[arg0] * this.field4859;
        if (arg1 != 3228) {
            return;
        }
        if (this.field4851 == 1) {
            int var5 = this.field4850[0] << 12;
            short var6 = this.field4863[0];
            int var7 = this.field4847 * var5 >> 12;
            int var8 = this.field4859 * var5 >> 12;
            int var9 = var4 * var5 >> 12;
            int var10 = var9 >> 12;
            int var11 = var9 & 0xFFF;
            int var12 = class146.field2225[var11];
            int var13 = var10 + 1;
            int var14 = this.field4858[var10 & 0xFF] & 0xFF;
            if (var13 >= var8) {
                var13 = 0;
            }
            int var15 = this.field4858[var13 & 0xFF] & 0xFF;
            if (this.field4854) {
                for (int var16 = 0; var16 < class218.field3333; var16++) {
                    int var17 = class162.field2631[var16] * this.field4847;
                    int var18 = this.method2144(var12, var14, var11, var15, (byte) -18, var5 * var17 >> 12, var7);
                    int var19 = var6 * var18 >> 12;
                    arg2[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class218.field3333; var20++) {
                    int var21 = class162.field2631[var20] * this.field4847;
                    int var22 = this.method2144(var12, var14, var11, var15, (byte) -18, var5 * var21 >> 12, var7);
                    arg2[var20] = var6 * var22 >> 12;
                }
            }
            return;
        }
        short var23 = this.field4863[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field4850[0] << 12;
            int var25 = this.field4859 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = this.field4847 * var24 >> 12;
            int var28 = var26 >> 12;
            int var29 = var26 & 0xFFF;
            int var30 = var28 + 1;
            int var31 = class146.field2225[var29];
            if (var30 >= var25) {
                var30 = 0;
            }
            int var32 = this.field4858[var30 & 0xFF] & 0xFF;
            int var33 = this.field4858[var28 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class218.field3333; var34++) {
                int var35 = class162.field2631[var34] * this.field4847;
                int var36 = this.method2144(var31, var33, var29, var32, (byte) -18, var24 * var35 >> 12, var27);
                arg2[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field4851; var37++) {
            short var38 = this.field4863[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field4850[var37] << 12;
                int var40 = this.field4847 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = this.field4859 * var39 >> 12;
                int var43 = var41 >> 12;
                int var44 = var43 + 1;
                int var45 = var41 & 0xFFF;
                int var46 = this.field4858[var43 & 0xFF] & 0xFF;
                if (var42 <= var44) {
                    var44 = 0;
                }
                int var47 = class146.field2225[var45];
                int var48 = this.field4858[var44 & 0xFF] & 0xFF;
                if (this.field4854 && this.field4851 - 1 == var37) {
                    for (int var49 = 0; var49 < class218.field3333; var49++) {
                        int var50 = class162.field2631[var49] * this.field4847;
                        int var51 = this.method2144(var47, var46, var45, var48, (byte) -18, var39 * var50 >> 12, var40);
                        int var52 = (var38 * var51 >> 12) + arg2[var49];
                        arg2[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class218.field3333; var53++) {
                        int var54 = class162.field2631[var53] * this.field4847;
                        int var55 = this.method2144(var47, var46, var45, var48, (byte) -18, var39 * var54 >> 12, var40);
                        arg2[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[I", line = 321)
    public final int[] method71(int arg0, int arg1) {
        if (arg0 != 7) {
            this.field4863 = (short[]) null;
        }
        field4844++;
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            this.method2139(arg1, 3228, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V", line = 340)
    public static final void method2140(boolean arg0) {
        class149.field2251.method750((byte) 108);
        if (!arg0) {
            field4846++;
        }
    }

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(B)V", line = 352)
    private final void method2141(byte arg0) {
        field4845++;
        if (arg0 > -13) {
            this.method2141((byte) 25);
        }
        if (this.field4861 > 0) {
            this.field4850 = new short[this.field4851];
            this.field4863 = new short[this.field4851];
            for (int var3 = 0; var3 < this.field4851; var3++) {
                this.field4863[var3] = (short) ((int) (Math.pow((double) ((float) this.field4861 / 4096.0F), (double) var3) * 4096.0D));
                this.field4850[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field4863 != null && this.field4863.length == this.field4851) {
            this.field4850 = new short[this.field4851];
            for (int var2 = 0; var2 < this.field4851; var2++) {
                this.field4850[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "([IILth;[I[I)V", line = 399)
    public static final void method2142(int[] arg0, int arg1, class270 arg2, int[] arg3, int[] arg4) {
        field4852++;
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg3[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var8 != 0 && var9 < arg2.field4672.length) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field4672[var9] = null;
                    } else {
                        class28 var10 = client.method1010(var6, (byte) 115);
                        class69 var11 = arg2.field4672[var9];
                        int var12 = var10.field335;
                        if (var11 != null) {
                            if (var11.field978 == var6) {
                                if (var12 == 0) {
                                    var11 = arg2.field4672[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field979 = 0;
                                    var11.field988 = 1;
                                    var11.field992 = 0;
                                    var11.field989 = var7;
                                    var11.field981 = 0;
                                    class146.method1105(0, class39.field575 == arg2, 6924, arg2.field4731, var10, arg2.field4713);
                                } else if (var12 == 2) {
                                    var11.field979 = 0;
                                }
                            } else if (var10.field314 >= client.method1010(var11.field978, (byte) 111).field314) {
                                var11 = arg2.field4672[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class69 var13 = arg2.field4672[var9] = new class69();
                            var13.field988 = 1;
                            var13.field979 = 0;
                            var13.field981 = 0;
                            var13.field989 = var7;
                            var13.field992 = 0;
                            var13.field978 = var6;
                            class146.method1105(0, class39.field575 == arg2, 6924, arg2.field4731, var10, arg2.field4713);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
        if (arg1 > -20) {
            field4857 = true;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)Lsj;", line = 493)
    public static final class206 method2143(byte arg0, int arg1) {
        field4848++;
        class206 var2 = (class206) class298.field4586.method747((long) arg1, (byte) 119);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field580.method696(arg1, (byte) 103, 31);
        class206 var4 = new class206();
        if (arg0 > -21) {
            return (class206) null;
        }
        if (var3 != null) {
            var4.method1488(arg1, 32118, new class254(var3));
        }
        class298.field4586.method744(var4, -15692, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIBII)I", line = 517)
    private final int method2144(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4856++;
        int var8 = arg2 - 4096;
        int var9 = arg5 >> 12;
        int var10 = var9 + 1;
        if (arg6 <= var10) {
            var10 = 0;
        }
        int var11 = var10 & 0xFF;
        int var12 = arg5 & 0xFFF;
        int var13 = var9 & 0xFF;
        int var14 = class146.field2225[var12];
        int var15 = this.field4858[arg1 + var13] & 0x3;
        int var16 = var12 - 4096;
        if (arg4 != -18) {
            this.field4854 = false;
        }
        int var17;
        if (var15 > 1) {
            var17 = var15 == 2 ? var12 - arg2 : -arg2 + -var12;
        } else {
            var17 = var15 == 0 ? var12 + arg2 : arg2 - var12;
        }
        int var18 = this.field4858[var11 + arg1] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var16 - arg2 : -arg2 + -var16;
        } else {
            var19 = var18 == 0 ? arg2 + var16 : -var16 + arg2;
        }
        int var20 = ((var19 - var17) * var14 >> 12) + var17;
        int var21 = this.field4858[arg3 + var13] & 0x3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 == 0 ? var8 + var12 : -var12 + var8;
        } else {
            var22 = var21 == 2 ? var12 - var8 : -var8 + -var12;
        }
        int var23 = this.field4858[arg3 + var11] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var16 : -var16 + var8;
        } else {
            var24 = var23 == 2 ? var16 - var8 : -var8 + -var16;
        }
        int var25 = var22 + ((var24 - var22) * var14 >> 12);
        return var20 + ((var25 - var20) * arg0 >> 12);
    }
}
