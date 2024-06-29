import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class24 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
    private boolean field213 = false;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    private int field230 = 32;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "J")
    private long field226 = class652.method3700(-1);

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    private int field234 = 0;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    private int field236 = 0;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    private int field235 = 0;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "[Leia;")
    private class241[] field242 = new class241[8];

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "J")
    private long field243 = 0L;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "[Leia;")
    private class241[] field244 = new class241[8];

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    private int field239 = 0;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "Z")
    private boolean field240 = true;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "J")
    private long field237 = 0L;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "[Lmn;")
    public static class366[] field224 = new class366[37];

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Leia;")
    private class241 field214;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
    public int[] field223;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "[[B")
    public static byte[][] field232;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V", line = 6)
    public void method105() throws Exception {
        field216++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([II)V", line = 14)
    private final void method106(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class54.field556) {
            var3 = arg1 << 1;
        }
        class143.method893(arg0, 0, var3);
        this.field236 -= arg1;
        if (this.field214 != null && this.field236 <= 0) {
            this.field236 += class277.field3387 >> 4;
            class489.method2942(this.field214, (byte) -85);
            this.method111(this.field214, this.field214.method640(), (byte) 3);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class241 var10 = null;
                        class241 var11 = this.field242[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class130 var12 = var11.field2875;
                                if (var12 == null || var12.field1357 <= var8) {
                                    var11.field2877 = true;
                                    int var13 = var11.method669();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1357 += var13;
                                    }
                                    if (var4 >= this.field230) {
                                        break label107;
                                    }
                                    class241 var14 = var11.method678();
                                    if (var14 != null) {
                                        int var15 = var11.field2874;
                                        while (var14 != null) {
                                            this.method111(var14, var15 * var14.method640() >> 8, (byte) 3);
                                            var14 = var11.method681();
                                        }
                                    }
                                    class241 var16 = var11.field2876;
                                    var11.field2876 = null;
                                    if (var10 == null) {
                                        this.field242[var7] = var16;
                                    } else {
                                        var10.field2876 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field244[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2876;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class241 var18 = this.field242[var17];
                this.field242[var17] = this.field244[var17] = null;
                while (var18 != null) {
                    class241 var19 = var18.field2876;
                    var18.field2876 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field236 < 0) {
            this.field236 = 0;
        }
        if (this.field214 != null) {
            this.field214.method659(arg0, 0, arg1);
        }
        this.field226 = class652.method3700(-1);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 177)
    public static void method107(int arg0) {
        field232 = null;
        field224 = null;
        if (arg0 != -7820) {
            field232 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Leia;I)V", line = 188)
    public final synchronized void method108(class241 arg0, int arg1) {
        this.field214 = arg0;
        if (arg1 > -111) {
            this.method106(null, -74);
        }
        field221++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIII)V", line = 204)
    public static final void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field231++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg6 - arg5;
        int var12 = arg1 - arg5;
        if (arg4 >= -77) {
            field232 = null;
        }
        int var13 = arg6 * arg6;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg1 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg1 - 1) * var27;
        int var37 = var30;
        if (class224.field2571 <= arg7 && arg7 <= class578.field8182) {
            int[] var38 = class408.field5585[arg7];
            int var39 = class211.method1255(class338.field4355, arg3 - arg6, false, class744.field10385);
            int var40 = class211.method1255(class338.field4355, arg3 + arg6, false, class744.field10385);
            int var41 = class211.method1255(class338.field4355, arg3 - var11, false, class744.field10385);
            int var42 = class211.method1255(class338.field4355, arg3 + var11, false, class744.field10385);
            class223.method1297(var38, -7, var39, arg0, var41);
            class223.method1297(var38, -7, var41, arg2, var42);
            class223.method1297(var38, -7, var42, arg0, var40);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var25 += -var43;
                var26 += -var34;
                var43 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg7 - var9;
            int var46 = arg7 + var9;
            if (var46 >= class224.field2571 && var45 <= class578.field8182) {
                int var47 = class211.method1255(class338.field4355, arg3 + var8, false, class744.field10385);
                int var48 = class211.method1255(class338.field4355, arg3 - var8, false, class744.field10385);
                if (var44) {
                    int var49 = class211.method1255(class338.field4355, arg3 + var10, false, class744.field10385);
                    int var50 = class211.method1255(class338.field4355, arg3 - var10, false, class744.field10385);
                    if (var45 >= class224.field2571) {
                        int[] var51 = class408.field5585[var45];
                        class223.method1297(var51, -7, var48, arg0, var50);
                        class223.method1297(var51, -7, var50, arg2, var49);
                        class223.method1297(var51, -7, var49, arg0, var47);
                    }
                    if (var46 <= class578.field8182) {
                        int[] var52 = class408.field5585[var46];
                        class223.method1297(var52, -7, var48, arg0, var50);
                        class223.method1297(var52, -7, var50, arg2, var49);
                        class223.method1297(var52, -7, var49, arg0, var47);
                    }
                } else {
                    if (class224.field2571 <= var45) {
                        class223.method1297(class408.field5585[var45], -7, var48, arg0, var47);
                    }
                    if (var46 <= class578.field8182) {
                        class223.method1297(class408.field5585[var46], -7, var48, arg0, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 408)
    public final synchronized void method110(byte arg0) {
        if (class341.field4405 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class341.field4405.field9133[var3] == this) {
                    class341.field4405.field9133[var3] = null;
                }
                if (class341.field4405.field9133[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class341.field4405.field9131 = true;
                while (class341.field4405.field9132) {
                    class524.method3076(1, 50L);
                }
                class341.field4405 = null;
            }
        }
        field220++;
        if (arg0 != 79) {
            this.method111(null, 125, (byte) -42);
        }
        this.method118();
        this.field223 = null;
        this.field213 = true;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Leia;IB)V", line = 457)
    private final void method111(class241 arg0, int arg1, byte arg2) {
        field233++;
        int var4 = arg1 >> 5;
        class241 var5 = this.field244[var4];
        if (var5 == null) {
            this.field242[var4] = arg0;
        } else {
            var5.field2876 = arg0;
        }
        this.field244[var4] = arg0;
        if (arg2 != 3) {
            method107(-49);
        }
        arg0.field2874 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()I", line = 478)
    public int method112() throws Exception {
        field222++;
        return this.field241;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 486)
    public final synchronized void method113(int arg0) {
        field217++;
        if (this.field213) {
            return;
        }
        long var2 = class652.method3700(-1);
        try {
            if ((this.field226 + 6000L) < var2) {
                this.field226 = var2 - 6000L;
            }
            while ((this.field226 + 5000L) < var2) {
                this.method120(0, 256);
                this.field226 += (256000 / class277.field3387);
                var2 = class652.method3700(-1);
            }
        } catch (Exception var7) {
            this.field226 = var2;
        }
        if (this.field223 == null) {
            return;
        }
        try {
            if (arg0 > -48) {
                this.field240 = true;
            }
            if (this.field237 != 0L) {
                if (this.field237 > var2) {
                    return;
                }
                this.method115(this.field241);
                this.field237 = 0L;
                this.field240 = true;
            }
            int var4 = this.method112();
            if (this.field239 < (this.field235 - var4)) {
                this.field239 = this.field235 - var4;
            }
            int var5 = this.field245 + this.field238;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field241 < (var5 + 256)) {
                this.field241 += 1024;
                if (this.field241 > 16384) {
                    this.field241 = 16384;
                }
                this.method118();
                this.method115(this.field241);
                var4 = 0;
                if (var5 + 256 > this.field241) {
                    var5 = this.field241 - 256;
                    this.field238 = var5 - this.field245;
                }
                this.field240 = true;
            }
            while (var4 < var5) {
                this.method106(this.field223, 256);
                var4 += 256;
                this.method119();
            }
            if (var2 > this.field243) {
                if (this.field240) {
                    this.field240 = false;
                } else if (this.field239 == 0 && this.field234 == 0) {
                    this.method118();
                    this.field237 = var2 + 2000L;
                    return;
                } else {
                    this.field238 = Math.min(this.field234, this.field239);
                    this.field234 = this.field239;
                }
                this.field239 = 0;
                this.field243 = var2 + 2000L;
            }
            this.field235 = var4;
        } catch (Exception var6) {
            this.method118();
            this.field237 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 601)
    public void method114(Component arg0) throws Exception {
        field225++;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V", line = 611)
    public void method115(int arg0) throws Exception {
        field215++;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)Z", line = 620)
    public static final boolean method116(int arg0) {
        field228++;
        if (arg0 == 1) {
            return class446.field6457 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V", line = 632)
    public final synchronized void method117(int arg0) {
        field229++;
        this.field240 = true;
        try {
            this.method105();
            if (arg0 != -7088) {
                field232 = null;
            }
        } catch (Exception var2) {
            this.method118();
            this.field237 = class652.method3700(-1) + 2000L;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()V", line = 651)
    public void method118() {
        field227++;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()V", line = 665)
    public void method119() throws Exception {
        field218++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V", line = 672)
    private final void method120(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field214 = null;
        }
        field219++;
        this.field236 -= arg1;
        if (this.field236 < 0) {
            this.field236 = 0;
        }
        if (this.field214 != null) {
            this.field214.method649(arg1);
        }
    }
}
