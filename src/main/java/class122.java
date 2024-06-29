import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class122 implements Runnable {

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Z")
    public boolean field2152 = true;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Ljava/lang/Object;")
    public Object field2155 = new Object();

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "[I")
    public int[] field2157 = new int[500];

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "[I")
    public int[] field2156 = new int[500];

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public int field2158 = 0;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[I")
    public static int[] field2143 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lp;")
    private static class280 field2147 = class18.method140((byte) -121, "Loading title screen )2 ");

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Lp;")
    public static class280 field2142 = field2147;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field2153 = -1;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
    public static int[] field2145 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Lp;")
    private static class280 field2151 = class18.method140((byte) -121, "Loaded textures");

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Lp;")
    public static class280 field2150 = field2151;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Z")
    public static boolean field2148;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ltg;II)Z")
    public static final boolean method857(class180 arg0, int arg1, int arg2) {
        field2141++;
        byte[] var3 = arg0.method1254(true, arg1);
        if (arg2 != -19478) {
            field2150 = null;
        }
        if (var3 == null) {
            return false;
        } else {
            class54.method394(var3, 10961);
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Llj;I)V")
    public static final void method858(class25 arg0, int arg1) {
        if (arg1 < 105) {
            method859(25);
        }
        field2144++;
        while (true) {
            while (arg0.field481 < arg0.field475.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method189((byte) -103) == 1) {
                    var3 = true;
                    var2 = arg0.method189((byte) -103);
                    var4 = arg0.method189((byte) -103);
                }
                int var5 = arg0.method189((byte) -103);
                int var6 = arg0.method189((byte) -103);
                int var7 = var5 * 64 - class113.field2023;
                int var8 = class243.field4268 + class74.field1222 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class47.field779 > var7 + 63 && class74.field1222 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || (var2 * 8) <= var11 && var11 < var2 * 8 + 8 && var12 >= (var4 * 8) && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method189((byte) -103);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method189((byte) -103);
                                        if (class55.field902[var10][var9] == null) {
                                            class55.field902[var10][var9] = new byte[4096];
                                        }
                                        class55.field902[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method193((byte) 77);
                                        if (class229.field3960[var10][var9] == null) {
                                            class229.field3960[var10][var9] = new short[4096];
                                        }
                                        class229.field3960[var10][var9][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = ((arg0.method189((byte) -103) & 0xFF) << 16) + ((arg0.method189((byte) -103) & 0xFF) << 8) + (arg0.method189((byte) -103) & 0xFF);
                                        if (class280.field4944[var10][var9] == null) {
                                            class280.field4944[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class130 var17 = class32.method277((byte) -71, var16);
                                        if (var17.field2269 != null) {
                                            var17 = var17.method891(0);
                                            if (var17 == null || var17.field2266 == -1) {
                                                continue;
                                            }
                                        }
                                        class280.field4944[var10][var9][(63 - var12 << 6) + var11] = var17.field2290 + 1;
                                        class68 var18 = new class68();
                                        var18.field1129 = var17.field2266;
                                        var18.field1127 = var7;
                                        var18.field1123 = var8;
                                        class244.field4290.method649(var18, (byte) 96);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var3 ? 64 : 4096); var19++) {
                        int var20 = arg0.method189((byte) -103);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field481++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field481 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field481 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method859(int arg0) {
        field2145 = null;
        field2142 = null;
        field2147 = null;
        field2143 = null;
        field2150 = null;
        field2151 = null;
        if (arg0 != 1) {
            method860((class142) null, -35);
        }
    }

    @OriginalMember(owner = "client!dl", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2152) {
            Object var1 = this.field2155;
            synchronized (this.field2155) {
                if (this.field2158 < 500) {
                    this.field2156[this.field2158] = class229.field3957;
                    this.field2157[this.field2158] = class154.field2673;
                    this.field2158++;
                }
            }
            class159.method1130(50L, 0);
        }
        field2149++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Loe;I)V")
    public static final void method860(class142 arg0, int arg1) {
        if (arg1 <= 21) {
            field2150 = null;
        }
        field2154++;
        class23 var2 = (class23) class83.field1370.method150(arg0.field2458.method1896(68), 119);
        if (var2 == null) {
            return;
        }
        if (var2.field411 != null) {
            class234.field4082.method1823(var2.field411);
            var2.field411 = null;
        }
        var2.method1146(26159);
    }
}
