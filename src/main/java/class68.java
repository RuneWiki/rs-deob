import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class68 extends class59 {

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    private int field1373 = 8192;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    private int field1376 = 2048;

    @OriginalMember(owner = "client!hd", name = "hb", descriptor = "I")
    private int field1388 = 12288;

    @OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
    private int field1389 = 0;

    @OriginalMember(owner = "client!hd", name = "gb", descriptor = "I")
    private int field1387 = 4096;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    private int field1378 = 0;

    @OriginalMember(owner = "client!hd", name = "kb", descriptor = "I")
    private int field1391 = 2048;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "Lsd;")
    public static class166 field1377 = class135.method935("Welt", 0);

    @OriginalMember(owner = "client!hd", name = "jb", descriptor = "Lsd;")
    private static class166 field1390 = class135.method935("FULL", 0);

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lsd;")
    public static class166 field1381 = field1390;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!hd", name = "fb", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lvd;I)V")
    public static final void method550(class193 arg0, int arg1) {
        ++field1385;
        if (arg1 != 15) {
            field1377 = null;
        }
        if (~class93.field1822 == ~arg0.field3821) {
            class30.field556[arg0.field3824] = true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)Z")
    private final boolean method551(byte arg0, int arg1, int arg2) {
        ++field1379;
        int var4 = 43 % ((71 - arg0) / 34);
        int var5 = (-arg1 + arg2) * this.field1388 >> 12;
        int var6 = class92.field1808[(var5 * 255 & 1046812) >> 12];
        int var7 = (var6 << 12) / this.field1388;
        int var8 = (var7 << 12) / this.field1373;
        int var9 = this.field1387 * var8 >> 12;
        return arg1 - -arg2 < var9 && -var9 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI)Z")
    private final boolean method552(int arg0, byte arg1, int arg2) {
        ++field1384;
        int var4 = (arg0 + arg2) * this.field1388 >> 12;
        int var5 = class92.field1808[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1388;
        int var7 = (var6 << 12) / this.field1373;
        int var8 = this.field1387 * var7 >> 12;
        int var9 = 94 % ((-78 - arg1) / 48);
        return ~(-arg0 + arg2) > ~var8 && -arg0 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        if (arg0 == 23459) {
            class92.method718(true);
            ++field1374;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lff;I)V")
    public static final void method553(class53 arg0, int arg1) {
        ++field1386;
        if (class110.field2137 != null) {
            try {
                class110.field2137.method1259((byte) -67, 0L);
                class110.field2137.method1267(24, (byte) 123, arg0.field1000, arg0.field988);
            } catch (Exception var2) {
            }
        }
        arg0.field1000 += 24;
        if (arg1 != 0) {
            field1390 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
    public static void method554(int arg0) {
        field1381 = null;
        field1390 = null;
        if (arg0 >= 75) {
            field1377 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        ++field1375;
        if (arg1 < 18) {
            this.method36(0, (byte) -100);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field1373 = arg0.method405(2);
                                }
                            } else {
                                this.field1387 = arg0.method405(2);
                            }
                        } else {
                            this.field1388 = arg0.method405(2);
                        }
                    } else {
                        this.field1376 = arg0.method405(2);
                    }
                } else {
                    this.field1378 = arg0.method405(2);
                }
            } else {
                this.field1389 = arg0.method405(2);
            }
        } else {
            this.field1391 = arg0.method405(2);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field1382;
        int[] var3 = super.field1219.method721(arg0, -128);
        if (super.field1219.field1816) {
            int var4 = class136.field2657[arg0] + -2048;
            for (int var5 = 0; ~var5 > ~class98.field1879; ++var5) {
                int var6 = this.field1389 + var4;
                int var7 = ~var6 <= 2047 ? var6 : var6 + 4096;
                int var8 = ~var7 < -2049 ? var7 + -4096 : var7;
                int var9 = var4 - -this.field1376;
                int var10 = class187.field3569[var5] + -2048;
                int var11 = ~var9 <= 2047 ? var9 : var9 + 4096;
                int var12 = var10 - -this.field1378;
                int var13 = var11 <= 2048 ? var11 : var11 + -4096;
                int var14 = ~var12 <= 2047 ? var12 : var12 + 4096;
                int var15 = var14 > 2048 ? var14 - 4096 : var14;
                int var16 = this.field1391 + var10;
                int var17 = ~var16 <= 2047 ? var16 : var16 - -4096;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method551((byte) 105, var18, var8) && !this.method552(var15, (byte) 25, var13) ? 0 : 4096;
            }
        }
        return arg1 > -124 ? null : var3;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(III)V")
    public static final void method555(int arg0, int arg1, int arg2) {
        ++field1383;
        if (arg2 <= class160.field3064 || class4.field73 != 0 || class179.field3393) {
            class166 var3;
            if (~class4.field73 == -2 && class160.field3064 < 2) {
                var3 = class22.method148(new class166[] { class72.field1426, class5.field116, class135.field2651, class116.field2250 }, 0);
            } else if (class179.field3393 && ~class160.field3064 > -3) {
                var3 = class22.method148(new class166[] { class102.field1988, class5.field116, class43.field759, class116.field2250 }, 0);
            } else {
                var3 = class56.method466(class160.field3064 + -1, -106);
            }
            if (class160.field3064 > 2) {
                var3 = class22.method148(new class166[] { var3, class32.field587, class174.method1192(false, class160.field3064 + -2), class104.field2040 }, arg2 + -2);
            }
            int var4 = class125.field2464.method165(var3, arg1 + 4, arg0 + 15, 16777215, 0, class14.field258, class58.field1202);
            class27.method201((byte) -127, 15, arg1 + 4, arg0, var4 + class125.field2464.method171(var3));
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)I")
    public static final int method556(int arg0, int arg1, byte arg2) {
        ++field1380;
        int var3 = class39.method266(arg0 + -1, arg1 - 1, -62) + class39.method266(arg0 + -1, arg1 + 1, 44) + (class39.method266(arg0 - -1, arg1 - 1, arg2 ^ -33) - -class39.method266(arg0 + 1, arg1 + 1, 38));
        int var4 = class39.method266(arg0, arg1 + -1, arg2 ^ -48) - -class39.method266(arg0, arg1 + 1, -128) - -class39.method266(arg0 + -1, arg1, 67) + class39.method266(arg0 + 1, arg1, 22);
        int var5 = class39.method266(arg0, arg1, 27);
        if (arg2 != 83) {
            field1390 = null;
        }
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class68() {
        super(0, true);
    }
}
