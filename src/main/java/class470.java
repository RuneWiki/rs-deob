import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class470 {

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    private int field6355 = 32;

    @OriginalMember(owner = "client!lv", name = "n", descriptor = "Z")
    private boolean field6362 = false;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "J")
    private long field6357 = class197.method1423(1);

    @OriginalMember(owner = "client!lv", name = "p", descriptor = "J")
    private long field6364 = 0L;

    @OriginalMember(owner = "client!lv", name = "v", descriptor = "[Lri;")
    private class123[] field6370 = new class123[8];

    @OriginalMember(owner = "client!lv", name = "r", descriptor = "I")
    private int field6366 = 0;

    @OriginalMember(owner = "client!lv", name = "w", descriptor = "J")
    private long field6371 = 0L;

    @OriginalMember(owner = "client!lv", name = "y", descriptor = "Z")
    private boolean field6373 = true;

    @OriginalMember(owner = "client!lv", name = "D", descriptor = "[Lri;")
    private class123[] field6378 = new class123[8];

    @OriginalMember(owner = "client!lv", name = "C", descriptor = "I")
    private int field6377 = 0;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "I")
    private int field6368 = 0;

    @OriginalMember(owner = "client!lv", name = "E", descriptor = "I")
    private int field6379 = 0;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
    public int field6365;

    @OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!lv", name = "u", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!lv", name = "x", descriptor = "I")
    private int field6372;

    @OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
    public int field6374;

    @OriginalMember(owner = "client!lv", name = "A", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!lv", name = "B", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "Lri;")
    private class123 field6354;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "[I")
    public int[] field6358;

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field6353;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "()V")
    public void method2037() throws Exception {
        field6361++;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "()I")
    public int method2038() throws Exception {
        field6367++;
        return this.field6365;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BI)V")
    private final void method2701(byte arg0, int arg1) {
        field6351++;
        if (arg0 != 3) {
            method2707(-18, -86, -15);
        }
        this.field6368 -= arg1;
        if (this.field6368 < 0) {
            this.field6368 = 0;
        }
        if (this.field6354 != null) {
            this.field6354.method351(arg1);
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
    public final synchronized void method2702(int arg0) {
        this.field6373 = true;
        if (arg0 != 0) {
            return;
        }
        field6375++;
        try {
            this.method2037();
        } catch (Exception var2) {
            this.method2041();
            this.field6364 = class197.method1423(arg0 ^ 0x1) + 2000L;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lri;II)V")
    private final void method2703(class123 arg0, int arg1, int arg2) {
        field6360++;
        int var4 = arg1 >> 5;
        if (arg2 != 458752) {
            method2707(-88, -124, 69);
        }
        class123 var5 = this.field6370[var4];
        if (var5 == null) {
            this.field6378[var4] = arg0;
        } else {
            var5.field2201 = arg0;
        }
        this.field6370[var4] = arg0;
        arg0.field2202 = arg1;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method2040(Component arg0) throws Exception {
        field6352++;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILri;)V")
    public final synchronized void method2704(int arg0, class123 arg1) {
        field6359++;
        if (arg0 != 0) {
            this.field6373 = false;
        }
        this.field6354 = arg1;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
    public static void method2705(byte arg0) {
        field6353 = null;
        if (arg0 >= -62) {
            field6353 = null;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "([II)V")
    private final void method2706(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class137.field2352) {
            var3 = arg1 << 1;
        }
        class275.method1774(arg0, 0, var3);
        this.field6368 -= arg1;
        if (this.field6354 != null && this.field6368 <= 0) {
            this.field6368 += class55.field782 >> 4;
            class45.method333(this.field6354, true);
            this.method2703(this.field6354, this.field6354.method1070(), 458752);
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
                        class123 var10 = null;
                        class123 var11 = this.field6378[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class595 var12 = var11.field2200;
                                if (var12 == null || var12.field8349 <= var8) {
                                    var11.field2203 = true;
                                    int var13 = var11.method354();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field8349 += var13;
                                    }
                                    if (var4 >= this.field6355) {
                                        break label107;
                                    }
                                    class123 var14 = var11.method362();
                                    if (var14 != null) {
                                        int var15 = var11.field2202;
                                        while (var14 != null) {
                                            this.method2703(var14, var15 * var14.method1070() >> 8, 458752);
                                            var14 = var11.method355();
                                        }
                                    }
                                    class123 var16 = var11.field2201;
                                    var11.field2201 = null;
                                    if (var10 == null) {
                                        this.field6378[var7] = var16;
                                    } else {
                                        var10.field2201 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field6370[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2201;
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
                class123 var18 = this.field6378[var17];
                this.field6378[var17] = this.field6370[var17] = null;
                while (var18 != null) {
                    class123 var19 = var18.field2201;
                    var18.field2201 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field6368 < 0) {
            this.field6368 = 0;
        }
        if (this.field6354 != null) {
            this.field6354.method356(arg0, 0, arg1);
        }
        this.field6357 = class197.method1423(1);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Z")
    public static final boolean method2707(int arg0, int arg1, int arg2) {
        int var3 = 89 / ((arg0 - 19) / 56);
        field6369++;
        return (arg1 & 0x70000) != 0 | class104.method896(12992, arg1, arg2) || class614.method3479(arg2, -118, arg1);
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "()V")
    public void method2039() throws Exception {
        field6349++;
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)V")
    public final synchronized void method2708(byte arg0) {
        if (arg0 != 96) {
            return;
        }
        field6376++;
        if (class556.field7849 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class556.field7849.field2122[var3] == this) {
                    class556.field7849.field2122[var3] = null;
                }
                if (class556.field7849.field2122[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class556.field7849.field2120 = true;
                while (class556.field7849.field2123) {
                    class643.method3577(50L, 0);
                }
                class556.field7849 = null;
            }
        }
        this.method2041();
        this.field6362 = true;
        this.field6358 = null;
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(B)V")
    public final synchronized void method2709(byte arg0) {
        field6363++;
        if (this.field6362) {
            return;
        }
        long var2 = class197.method1423(1);
        try {
            if (this.field6357 + 6000L < var2) {
                this.field6357 = var2 - 6000L;
            }
            while (var2 > this.field6357 + 5000L) {
                this.method2701((byte) 3, 256);
                this.field6357 += (256000 / class55.field782);
                var2 = class197.method1423(1);
            }
        } catch (Exception var7) {
            this.field6357 = var2;
        }
        if (this.field6358 == null) {
            return;
        }
        try {
            if (this.field6364 != 0L) {
                if (var2 < this.field6364) {
                    return;
                }
                this.method2036(this.field6365);
                this.field6364 = 0L;
                this.field6373 = true;
            }
            if (arg0 != -114) {
                this.method2706(null, 7);
            }
            int var4 = this.method2038();
            if (this.field6379 - var4 > this.field6366) {
                this.field6366 = this.field6379 - var4;
            }
            int var5 = this.field6374 + this.field6372;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field6365 < (var5 + 256)) {
                this.field6365 += 1024;
                if (this.field6365 > 16384) {
                    this.field6365 = 16384;
                }
                this.method2041();
                var4 = 0;
                this.method2036(this.field6365);
                this.field6373 = true;
                if ((var5 + 256) > this.field6365) {
                    var5 = this.field6365 - 256;
                    this.field6372 = var5 - this.field6374;
                }
            }
            while (var5 > var4) {
                this.method2706(this.field6358, 256);
                this.method2039();
                var4 += 256;
            }
            if (this.field6371 < var2) {
                if (this.field6373) {
                    this.field6373 = false;
                } else if (this.field6366 == 0 && this.field6377 == 0) {
                    this.method2041();
                    this.field6364 = var2 + 2000L;
                    return;
                } else {
                    this.field6372 = Math.min(this.field6377, this.field6366);
                    this.field6377 = this.field6366;
                }
                this.field6371 = var2 + 2000L;
                this.field6366 = 0;
            }
            this.field6379 = var4;
        } catch (Exception var6) {
            this.method2041();
            this.field6364 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
    public void method2036(int arg0) throws Exception {
        field6350++;
    }

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "()V")
    public void method2041() {
        field6356++;
    }
}
