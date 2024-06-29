import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class169 extends class317 {

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    private int field2296 = 1;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    private int field2301 = 5;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "[S")
    private short[] field2300 = new short[512];

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    private int field2298 = 2;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "[B")
    private byte[] field2302 = new byte[512];

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
    private int field2311 = 5;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    private int field2295 = 2048;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
    private int field2313 = 0;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "[Lfj;")
    public static class241[] field2306 = new class241[2048];

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field2297 = 0;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field2294 = 0;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "[Ljava/lang/String;")
    public static String[] field2309;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILla;III)V", line = 4)
    public static final void method1190(int arg0, int arg1, int arg2, class72 arg3, int arg4, int arg5, int arg6) {
        field2308++;
        if (arg0 != 1) {
            field2297 = 119;
        }
        boolean var7 = true;
        boolean var8 = false;
        long var9 = 0L;
        boolean var11 = false;
        if (arg1 == 0) {
            var9 = class269.method1853(arg4, arg2, arg6);
        } else if (arg1 == 1) {
            var9 = class89.method684(arg4, arg2, arg6);
        } else if (arg1 == 2) {
            var9 = class193.method1352(arg4, arg2, arg6);
        } else if (arg1 == 3) {
            var9 = class317.method2222(arg4, arg2, arg6);
        }
        int var12 = ((int) var9 & 0x37080D) >> 20;
        int var13 = (int) (var9 >>> 32) & Integer.MAX_VALUE;
        int var14 = (int) var9 >> 14 & 0x1F;
        class302 var15 = class153.method1106(var13, (byte) -66);
        if (var15.method2064(0)) {
            method1195(arg2, var15, arg6, arg4, -55);
        }
        if (var9 == 0L) {
            return;
        }
        class132 var16 = null;
        class132 var17 = null;
        if (arg1 == 0) {
            class7 var18 = class73.method544(arg4, arg2, arg6);
            if (var18 != null) {
                var17 = var18.field55;
                var16 = var18.field57;
            }
            if (var15.field4530 != 0) {
                arg3.method536(var14, 32, var12, arg2, arg6, !var15.field4546, var15.field4506);
            }
        } else if (arg1 == 1) {
            class269 var19 = class253.method1731(arg4, arg2, arg6);
            if (var19 != null) {
                var17 = var19.field3995;
                var16 = var19.field3987;
            }
        } else if (arg1 == 2) {
            class280 var20 = class242.method1657(arg4, arg2, arg6);
            if (var20 != null) {
                var16 = var20.field4199;
            }
            if (var15.field4530 != 0 && (arg2 + var15.field4520) < 104 && (var15.field4520 + arg6) < 104 && var15.field4479 + arg2 < 104 && (var15.field4479 + arg6) < 104) {
                arg3.method529(94, arg2, var15.field4479, var12, arg6, var15.field4506, var15.field4520, !var15.field4546);
            }
        } else if (arg1 == 3) {
            class306 var21 = class157.method1135(arg4, arg2, arg6);
            if (var21 != null) {
                var16 = var21.field4586;
            }
            if (var15.field4530 == 1) {
                arg3.method534(arg6, arg2, -72);
            }
        }
        if (var15.field4519 != null) {
            var15 = var15.method2066((byte) -84);
        }
        if (!class67.field908 || var15 == null || !var15.field4507) {
            return;
        }
        if (var14 == 2) {
            if ((var16 instanceof class301)) {
                ((class301) var16).method2050(0);
            } else {
                class338.method2340(var12 + 4, arg5, true, var15, arg6, 0, 0, var14, arg2);
            }
            if ((var17 instanceof class301)) {
                ((class301) var17).method2050(0);
            } else {
                class338.method2340(var12 + 1 & 0x3, arg5, true, var15, arg6, 0, 0, var14, arg2);
            }
        } else if (var14 == 5) {
            if (var16 instanceof class301) {
                ((class301) var16).method2050(0);
            } else {
                class338.method2340(var12, arg5, true, var15, arg6, class185.field2546[var12] * 8, class339.field5092[var12] * 8, 4, arg2);
            }
        } else if (var14 == 6) {
            if ((var16 instanceof class301)) {
                ((class301) var16).method2050(0);
            } else {
                class338.method2340(var12 + 4, arg5, true, var15, arg6, class30.field366[var12] * 8, class211.field3054[var12] * 8, 4, arg2);
            }
        } else if (var14 == 7) {
            if ((var16 instanceof class301)) {
                ((class301) var16).method2050(0);
            } else {
                class338.method2340((var12 + 2 & 0x3) + 4, arg5, true, var15, arg6, 0, 0, 4, arg2);
            }
        } else if (var14 == 8) {
            if ((var16 instanceof class301)) {
                ((class301) var16).method2050(0);
            } else {
                class338.method2340(var12 + 4, arg5, true, var15, arg6, class30.field366[var12] * 8, class211.field3054[var12] * 8, 4, arg2);
            }
            if ((var17 instanceof class301)) {
                ((class301) var17).method2050(0);
            } else {
                class338.method2340((var12 + 2 & 0x3) + 4, arg5, true, var15, arg6, class30.field366[var12] * 8, class211.field3054[var12] * 8, 4, arg2);
            }
        } else if (var14 == 11) {
            if (var16 instanceof class301) {
                ((class301) var16).method2050(arg0 - 1);
            } else {
                class338.method2340(var12 + 4, arg5, true, var15, arg6, 0, 0, 10, arg2);
            }
        } else if ((var16 instanceof class301)) {
            ((class301) var16).method2050(0);
        } else {
            class338.method2340(var12, arg5, true, var15, arg6, 0, 0, var14, arg2);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)[I", line = 209)
    public final int[] method140(int arg0, int arg1) {
        field2303++;
        if (arg0 != 542) {
            field2306 = (class241[]) null;
        }
        int[] var3 = this.field4847.method1387(arg1, (byte) -97);
        if (this.field4847.field2751) {
            int var4 = (class51.field693[arg1] * this.field2301) + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class326.field4933; var7++) {
                class307.field4597 = Integer.MAX_VALUE;
                class25.field319 = Integer.MAX_VALUE;
                class130.field1787 = Integer.MAX_VALUE;
                class257.field3777 = Integer.MAX_VALUE;
                int var8 = class99.field1360[var7] * this.field2311 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field2302[(this.field2301 <= var11 ? var11 - this.field2301 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field2302[var12 + (var13 >= this.field2311 ? var13 - this.field2311 : var13) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field2300[var14] - (var13 << 12);
                        int var16 = var4 - (var11 << 12) - this.field2300[var27];
                        int var17 = this.field2296;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var15 < 0 ? -var15 : var15;
                            int var25 = var16 >= 0 ? var16 : -var16;
                            var18 = var25 >= var24 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var16 * var16;
                            int var20 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var19 + var20) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var16 >= 0 ? var16 : -var16) + (var15 < 0 ? -var15 : var15);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + (var16 * var16)) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class257.field3777) {
                            class307.field4597 = class25.field319;
                            class25.field319 = class130.field1787;
                            class130.field1787 = class257.field3777;
                            class257.field3777 = var18;
                        } else if (var18 < class130.field1787) {
                            class307.field4597 = class25.field319;
                            class25.field319 = class130.field1787;
                            class130.field1787 = var18;
                        } else if (var18 < class25.field319) {
                            class307.field4597 = class25.field319;
                            class25.field319 = var18;
                        } else if (var18 < class307.field4597) {
                            class307.field4597 = var18;
                        }
                    }
                }
                int var26 = this.field2298;
                if (var26 == 0) {
                    var3[var7] = class257.field3777;
                } else if (var26 == 1) {
                    var3[var7] = class130.field1787;
                } else if (var26 == 3) {
                    var3[var7] = class25.field319;
                } else if (var26 == 4) {
                    var3[var7] = class307.field4597;
                } else if (var26 == 2) {
                    var3[var7] = class130.field1787 - class257.field3777;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(B)V", line = 422)
    private final void method1191(byte arg0) {
        field2312++;
        Random var2 = new Random((long) this.field2313);
        int var3 = -48 / ((arg0 - 45) / 48);
        this.field2300 = new short[512];
        if (this.field2295 > 0) {
            for (int var4 = 0; var4 < 512; var4++) {
                this.field2300[var4] = (short) class175.method1217((byte) 100, var2, this.field2295);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 528)
    public class169() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lcg;II)V", line = 468)
    public final void method60(class316 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2311 = this.field2301 = arg0.method2219(16448);
        } else if (arg2 == 1) {
            this.field2313 = arg0.method2219(16448);
        } else if (arg2 == 2) {
            this.field2295 = arg0.method2220((byte) 40);
        } else if (arg2 == 3) {
            this.field2298 = arg0.method2219(16448);
        } else if (arg2 == 4) {
            this.field2296 = arg0.method2219(16448);
        } else if (arg2 == 5) {
            this.field2311 = arg0.method2219(16448);
        } else if (arg2 == 6) {
            this.field2301 = arg0.method2219(16448);
        }
        field2304++;
        int var5 = -35 % ((arg1 + 17) / 40);
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(B)V", line = 543)
    public static void method1192(byte arg0) {
        field2306 = null;
        field2309 = null;
        if (arg0 >= -47) {
            method1194(-90, 4, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(III)V", line = 556)
    public static final void method1193(int arg0, int arg1, int arg2) {
        class324.field4920[arg1] = arg0;
        class276 var3 = (class276) class7.field59.method111(-26, (long) arg1);
        if (var3 == null) {
            class276 var4 = new class276(class29.method174(27763) + 500L);
            class7.field59.method120((long) arg1, var4, -22851);
        } else {
            var3.field4136 = class29.method174(27763) + 500L;
        }
        if (arg2 == 0) {
            field2299++;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 580)
    public final void method546(int arg0) {
        this.field2302 = class112.method825(this.field2313, -92);
        this.method1191((byte) -44);
        field2305++;
        if (arg0 != -21522) {
            this.field2301 = -112;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)V", line = 602)
    public static final void method1194(int arg0, int arg1, byte arg2) {
        if (arg2 != -14) {
            method1192((byte) -91);
        }
        field2310++;
        class143 var3 = class163.method1176((byte) 122, arg0, 7);
        var3.method1032((byte) 108);
        var3.field1965 = arg1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILwj;III)V", line = 622)
    private static final void method1195(int arg0, class302 arg1, int arg2, int arg3, int arg4) {
        field2307++;
        if (arg4 > -41) {
            field2294 = -19;
        }
        for (class98 var5 = (class98) class291.field4344.method1335(1); var5 != null; var5 = (class98) class291.field4344.method1336(3)) {
            if (var5.field1337 == arg3 && arg0 * 128 == var5.field1335 && (arg2 * 128) == var5.field1331 && var5.field1319.field4549 == arg1.field4549) {
                if (var5.field1333 != null) {
                    class160.field2196.method1130(var5.field1333);
                    var5.field1333 = null;
                }
                if (var5.field1339 != null) {
                    class160.field2196.method1130(var5.field1339);
                    var5.field1339 = null;
                }
                var5.method1274((byte) -26);
                return;
            }
        }
    }
}
