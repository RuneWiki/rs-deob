import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class601 extends class192 {

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field8099;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)[I", line = 5)
    public final int[] method118(int arg0, byte arg1) {
        ++field8101;
        if (arg1 > -123) {
            return null;
        } else {
            int[] var3 = super.field2448.method2978(arg0, (byte) -56);
            if (super.field2448.field7266) {
                int[] var4 = this.method1253(0, arg0, 0);
                int[] var5 = this.method1253(0, arg0, 1);
                int[] var6 = this.method1253(0, arg0, 2);
                for (int var7 = 0; ~var7 > ~class561.field7319; ++var7) {
                    int var8 = var6[var7];
                    if (~var8 == -4097) {
                        var3[var7] = var4[var7];
                    } else if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)I", line = 61)
    public static final int method3270(int arg0, int arg1) {
        return class176.field2196 != null ? class176.field2196[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I[BIIII)Z", line = 64)
    public static final boolean method3271(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 31724) {
            return true;
        } else {
            ++field8100;
            boolean var6 = true;
            class418 var7 = new class418(arg1);
            int var8 = -1;
            label74: while (true) {
                int var9 = var7.method2415((byte) -122);
                if (var9 == 0) {
                    return var6;
                }
                var8 += var9;
                int var10 = 0;
                boolean var11 = false;
                while (true) {
                    int var15;
                    class698 var18;
                    do {
                        int var16;
                        int var17;
                        do {
                            do {
                                do {
                                    do {
                                        while (var11) {
                                            int var19 = var7.method2400((byte) 36);
                                            if (~var19 == -1) {
                                                continue label74;
                                            }
                                            var7.method2396(27);
                                        }
                                        int var12 = var7.method2400((byte) 36);
                                        if (var12 == 0) {
                                            continue label74;
                                        }
                                        var10 += var12 + -1;
                                        int var13 = var10 & 63;
                                        int var14 = (4047 & var10) >> 6;
                                        var15 = var7.method2396(-111) >> 2;
                                        var16 = arg0 + var14;
                                        var17 = arg3 + var13;
                                    } while (~var16 >= -1);
                                } while (var17 <= 0);
                            } while (arg5 + -1 <= var16);
                        } while (~(arg2 - 1) >= ~var17);
                        var18 = class348.field4436.method1900(arg4 + -31617, var8);
                    } while (var15 == 22 && !class260.field3509.field1267 && var18.field9660 == 0 && var18.field9673 != 1 && !var18.field9670);
                    if (!var18.method3802(0)) {
                        ++class402.field5147;
                        var6 = false;
                    }
                    var11 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V", line = 146)
    public static final void method3272(int arg0) {
        ++field8099;
        class218 var1 = null;
        try {
            class548 var2 = class688.field9413.method1045("3", (byte) -48, false);
            while (var2.field7108 == 0) {
                class122.method905(1L, -6145);
            }
            if (~var2.field7108 == -3) {
                throw new RuntimeException("Error opening file");
            }
            int var3 = -30 % ((arg0 - 59) / 51);
            var1 = (class218) var2.field7113;
            byte[] var4 = new byte[(int) var1.method1391(14)];
            if (~var4.length != -1) {
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var1.method1390(0, var4.length + -var5, var4, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class418 var7 = new class418(var4);
                int var8 = var7.method2396(-102);
                if (~var8 < -61) {
                    throw new RuntimeException("Bad length");
                }
                var7.field5367 = var8 + 1;
                if (!var7.method2378((byte) -119)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var7.field5367 = 1;
                int var9 = var7.method2396(-103);
                if (~var9 < -3) {
                    throw new RuntimeException("Invalid version " + var9);
                }
                class635.field8834 = var7.method2350(16);
                class183.field2346 = var7.method2350(16);
                if (~var9 <= -2) {
                    class579.field7896 = var7.method2393(-30727);
                } else {
                    class579.field7896 = class31.field467;
                }
                if (~var9 <= -3) {
                    class324.field4206 = var7.method2377(-605269408);
                } else {
                    class324.field4206 = class569.field7432;
                }
            } else {
                class183.field2346 = "";
                class635.field8834 = "";
            }
        } catch (Exception var11) {
            class183.field2346 = "";
            class635.field8834 = "";
        }
        try {
            if (var1 != null) {
                var1.method1397(true);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IB)[[I", line = 234)
    public final int[][] method107(int arg0, byte arg1) {
        int var3 = 41 % ((arg1 - -14) / 34);
        ++field8096;
        int[][] var4 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int[] var5 = this.method1253(0, arg0, 2);
            int[][] var6 = this.method1251(0, arg0, (byte) -56);
            int[][] var7 = this.method1251(1, arg0, (byte) -56);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            for (int var17 = 0; ~var17 > ~class561.field7319; ++var17) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var8[var17] = var11[var17];
                    var9[var17] = var12[var17];
                    var10[var17] = var13[var17];
                } else if (~var18 != -1) {
                    int var19 = 4096 - var18;
                    var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                    var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                    var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                } else {
                    var8[var17] = var14[var17];
                    var9[var17] = var15[var17];
                    var10[var17] = var16[var17];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILfd;I)V", line = 312)
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg2 == -12160) {
            ++field8097;
            if (arg0 == 0) {
                super.field2449 = arg1.method2396(-102) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)Ljava/lang/String;", line = 326)
    public static final String method3273(int arg0, int arg1) {
        ++field8098;
        if (arg0 != -31337) {
            method3271(33, (byte[]) null, -42, 119, 10, -107);
        }
        return (arg1 >> 24 & 255) + "." + (arg1 >> 16 & 255) + "." + ((arg1 & 65361) >> 8) + "." + (arg1 & 255);
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 337)
    public class601() {
        super(3, false);
    }
}
