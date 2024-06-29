import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class133 extends class143 {

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "[J")
    private long[] field2218 = new long[10];

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    private int field2215 = 256;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    private int field2212 = 1;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    private int field2211 = 0;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "J")
    private long field2209 = class7.method31((byte) -88);

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field2216 = 0;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    private int field2214;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public final void method834(byte arg0) {
        field2213++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2218[var2] = 0L;
        }
        int var3 = 91 % ((-arg0 - 39) / 49);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)I")
    public final int method833(int arg0, int arg1, int arg2) {
        int var4 = this.field2215;
        int var5 = this.field2212;
        field2220++;
        this.field2215 = 300;
        this.field2212 = 1;
        this.field2209 = class7.method31((byte) -88);
        if (this.field2218[this.field2214] == 0L) {
            this.field2215 = var4;
            this.field2212 = var5;
        } else if (this.field2209 > this.field2218[this.field2214]) {
            this.field2215 = (int) ((long) (arg2 * 2560) / (this.field2209 - this.field2218[this.field2214]));
        }
        if (this.field2215 < 25) {
            this.field2215 = 25;
        }
        if (this.field2215 > 256) {
            this.field2215 = 256;
            this.field2212 = (int) ((long) arg2 - ((this.field2209 - this.field2218[this.field2214]) / 10L));
        }
        if (arg2 < this.field2212) {
            this.field2212 = arg2;
        }
        this.field2218[this.field2214] = this.field2209;
        this.field2214 = (this.field2214 + 1) % 10;
        if (this.field2212 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2218[var6] != 0L) {
                    this.field2218[var6] += (long) this.field2212;
                }
            }
        }
        int var7 = 0;
        if (this.field2212 < arg0) {
            this.field2212 = arg0;
        }
        class147.method1066((long) this.field2212, arg1 ^ arg1);
        while (this.field2211 < 256) {
            this.field2211 += this.field2215;
            var7++;
        }
        this.field2211 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Z")
    public static final boolean method975(int arg0) {
        long var1 = class7.method31((byte) -88);
        field2222++;
        int var3 = (int) (var1 - class75.field1189);
        if (var3 > 200) {
            var3 = 200;
        }
        class75.field1189 = var1;
        class201.field3364 += var3;
        if (class182.field2999 == 0 && class195.field3270 == 0 && class131.field2194 == 0 && class146.field2439 == 0) {
            return true;
        } else if (class247.field4276 == null) {
            return false;
        } else {
            try {
                if (class201.field3364 > 30000) {
                    throw new IOException();
                }
                while (class195.field3270 < 20 && class146.field2439 > 0) {
                    class228 var4 = (class228) class202.field3366.method1451(arg0 + 5291);
                    class121 var5 = new class121(4);
                    var5.method919(-4742, 1);
                    var5.method883((int) var4.field1760, (byte) 114);
                    class247.field4276.method840(0, -782, var5.field2014, 4);
                    class135.field2244.method1447(arg0 + 5202, var4.field1760, var4);
                    class195.field3270++;
                    class146.field2439--;
                }
                while (class182.field2999 < 20 && class131.field2194 > 0) {
                    class228 var6 = (class228) class169.field2752.method405((byte) 74);
                    class121 var7 = new class121(4);
                    var7.method919(-4742, 0);
                    var7.method883((int) var6.field1760, (byte) 114);
                    class247.field4276.method840(0, -782, var7.field2014, 4);
                    var6.method134(arg0 + 5384);
                    class233.field4058.method1447(-107, var6.field1760, var6);
                    class131.field2194--;
                    class182.field2999++;
                }
                if (arg0 != -5320) {
                    field2210 = 76;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class247.field4276.method837(false);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    class201.field3364 = 0;
                    if (class129.field2156 == null) {
                        var10 = 8;
                    } else if (class142.field2388 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class138.field2319.field2026;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class247.field4276.method841(class138.field2319.field2026, class138.field2319.field2014, var11, (byte) -97);
                        if (class50.field804 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class138.field2319.field2014[class138.field2319.field2026 + var12] = (byte) class167.method1163(class138.field2319.field2014[class138.field2319.field2026 + var12], class50.field804);
                            }
                        }
                        class138.field2319.field2026 += var11;
                        if (class138.field2319.field2026 < var10) {
                            break;
                        }
                        if (class129.field2156 == null) {
                            class138.field2319.field2026 = 0;
                            int var13 = class138.field2319.method897(108);
                            int var14 = class138.field2319.method876(false);
                            int var15 = class138.field2319.method897(-33);
                            long var16 = (long) ((var13 << 16) + var14);
                            int var18 = class138.field2319.method865((byte) 8);
                            class228 var19 = (class228) class135.field2244.method1453(var16, 1);
                            class40.field622 = true;
                            if (var19 == null) {
                                var19 = (class228) class233.field4058.method1453(var16, 1);
                                class40.field622 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class129.field2156 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class237.field4139 = new class121(class129.field2156.field3976 + var18 + var20);
                            class237.field4139.method919(-4742, var15);
                            class237.field4139.method870(var18, (byte) 12);
                            class138.field2319.field2026 = 0;
                            class142.field2388 = 8;
                        } else if (class142.field2388 == 0) {
                            if (class138.field2319.field2014[0] == -1) {
                                class142.field2388 = 1;
                                class138.field2319.field2026 = 0;
                            } else {
                                class129.field2156 = null;
                            }
                        }
                    } else {
                        int var21 = 512 - class142.field2388;
                        int var22 = class237.field4139.field2014.length - class129.field2156.field3976;
                        if (var21 > var22 - class237.field4139.field2026) {
                            var21 = var22 - class237.field4139.field2026;
                        }
                        if (var21 > var9) {
                            var21 = var9;
                        }
                        class247.field4276.method841(class237.field4139.field2026, class237.field4139.field2014, var21, (byte) -127);
                        if (class50.field804 != 0) {
                            for (int var23 = 0; var23 < var21; var23++) {
                                class237.field4139.field2014[class237.field4139.field2026 + var23] = (byte) class167.method1163(class237.field4139.field2014[class237.field4139.field2026 + var23], class50.field804);
                            }
                        }
                        class237.field4139.field2026 += var21;
                        class142.field2388 += var21;
                        if (class237.field4139.field2026 == var22) {
                            if (class129.field2156.field1760 == 16711935L) {
                                class36.field561 = class237.field4139;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class55 var25 = class215.field3735[var24];
                                    if (var25 != null) {
                                        class36.field561.field2026 = var24 * 8 + 5;
                                        int var26 = class36.field561.method865((byte) 8);
                                        int var27 = class36.field561.method865((byte) 8);
                                        var25.method359(-1751, var26, var27);
                                    }
                                }
                            } else {
                                class213.field3698.reset();
                                class213.field3698.update(class237.field4139.field2014, 0, var22);
                                int var28 = (int) class213.field3698.getValue();
                                if (class129.field2156.field3980 != var28) {
                                    try {
                                        class247.field4276.method838(-128);
                                    } catch (Exception var30) {
                                    }
                                    class50.field804 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    class31.field445++;
                                    class247.field4276 = null;
                                    return false;
                                }
                                class31.field445 = 0;
                                class22.field332 = 0;
                                class129.field2156.field3979.method357((class129.field2156.field1760 & 0xFF0000L) == 16711680L, class237.field4139.field2014, class40.field622, (int) (class129.field2156.field1760 & 0xFFFFL), -1);
                            }
                            class129.field2156.method764((byte) -128);
                            class142.field2388 = 0;
                            class129.field2156 = null;
                            if (class40.field622) {
                                class195.field3270--;
                            } else {
                                class182.field2999--;
                            }
                            class237.field4139 = null;
                        } else {
                            if (class142.field2388 != 512) {
                                break;
                            }
                            class142.field2388 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class247.field4276.method838(-128);
                } catch (Exception var29) {
                }
                class247.field4276 = null;
                class22.field332++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class133() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2218[var1] = this.field2209;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Ltg;")
    public static final class171 method976(int arg0) {
        field2219++;
        byte[] var1 = class67.field1100[0];
        if (arg0 != 1) {
            return null;
        }
        int var2 = class221.field3837[0] * class106.field1751[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class139.field2327[class191.method1366(255, var1[var4])];
        }
        class254 var5 = new class254(class13.field194, class122.field2078, class96.field1591[0], class125.field2123[0], class221.field3837[0], class106.field1751[0], var3);
        class111.method804((byte) -14);
        return var5;
    }
}
