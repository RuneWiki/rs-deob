import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class263 extends OutputStream {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field4283 = 50;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method1742(byte arg0) {
        class248.field4074 = false;
        class248.field4080 = -1;
        class101.field1747 = 0;
        field4280++;
        if (arg0 >= -56) {
            return;
        }
        class79.field1364 = 0;
        class87.field1558 = -1;
        class211.field3564 = -1;
        class114.field2058 = 0;
        class104.field1822 = 0;
        class168.field2778.field1762 = 0;
        class295.field4694 = -1;
        class248.field4058.field1762 = 0;
        class275.field4399 = 0;
        class264.field4293 = 0;
        for (int var1 = 0; var1 < class105.field1874.length; var1++) {
            if (class105.field1874[var1] != null) {
                class105.field1874[var1].field1426 = -1;
            }
        }
        for (int var2 = 0; var2 < class42.field625.length; var2++) {
            if (class42.field625[var2] != null) {
                class42.field625[var2].field1426 = -1;
            }
        }
        class173.method1159(118);
        class241.field3970 = 1;
        class217.method1441(30, -31239);
        for (int var3 = 0; var3 < 100; var3++) {
            class23.field367[var3] = true;
        }
        class85.method556(0);
    }

    @OriginalMember(owner = "client!hf", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4282++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
    public static final void method1743(byte arg0) {
        class134.field2325.method53(true);
        if (arg0 != -78) {
            field4283 = -64;
        }
        field4284++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Leh;Z)V")
    public static final void method1744(class101 arg0, boolean arg1) {
        field4281++;
        int var2 = class4.field54 >> 2 << 10;
        byte[][] var3 = new byte[class203.field3318][class83.field1514];
        int var4 = class187.field3028 >> 1;
        while (arg0.field1730.length > arg0.field1762) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method669((byte) 36) == 1) {
                var33 = true;
                var34 = arg0.method669((byte) 36);
                var35 = arg0.method669((byte) 36);
            }
            int var36 = arg0.method669((byte) 36);
            int var37 = arg0.method669((byte) 36);
            int var38 = var36 * 64 - class124.field2184;
            int var39 = class83.field1514 + class193.field3114 - (var37 * 64) - 1;
            if (var38 >= 0 && var39 - 63 >= 0 && class203.field3318 > (var38 + 63) && var39 < class83.field1514) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var3[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var34 * 8 <= var40 && var40 < var34 * 8 + 8 && var42 >= (var35 * 8) && var35 * 8 + 8 > var42) {
                            var41[var39 - var42] = arg0.method646(-120);
                        }
                    }
                }
            } else if (var33) {
                arg0.field1762 += 64;
            } else {
                arg0.field1762 += 4096;
            }
        }
        int var5 = class203.field3318;
        int var6 = class83.field1514;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        if (arg1) {
            method1742((byte) -83);
        }
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var3[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class151 var29 = class20.method144((byte) -52, var28 - 1);
                        var8[var13] += var29.field2526;
                        var7[var13] += var29.field2520;
                        var11[var13] += var29.field2532;
                        var9[var13] += var29.field2527;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var3[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class151 var32 = class20.method144((byte) -52, var31 - 1);
                        var8[var13] -= var32.field2526;
                        var7[var13] -= var32.field2520;
                        var11[var13] -= var32.field2532;
                        var9[var13] -= var32.field2527;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int[][] var15 = class45.field635[var12 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    int var22 = var20 - 5;
                    if (var21 < var6) {
                        var16 += var7[var21];
                        var14 += var8[var21];
                        var19 += var9[var21];
                        var17 += var11[var21];
                        var18 += var10[var21];
                    }
                    if (var22 >= 0) {
                        var19 -= var9[var22];
                        var16 -= var7[var22];
                        var17 -= var11[var22];
                        var18 -= var10[var22];
                        var14 -= var8[var22];
                    }
                    if (var20 >= 0 && var18 > 0) {
                        int[] var23 = var15[var20 >> 6];
                        int var24 = var19 == 0 ? 0 : class173.method1157(var16 / var18, (byte) 90, var14 * 256 / var19, var17 / var18);
                        if (var3[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var15[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var4;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class113.method791(4032, var20 << 6) + class113.method791(63, var12)] = class287.field4559[class37.method248(var26, 96, (byte) -57)];
                        } else if (var23 != null) {
                            var23[(class113.method791(63, var20) << 6) + class113.method791(var12, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
    public static final void method1745(int arg0, int arg1) {
        class123.field2176.method63(0, arg0);
        if (arg1 >= -36) {
            field4283 = 102;
        }
        class272.field4362.method63(0, arg0);
        field4285++;
    }
}
