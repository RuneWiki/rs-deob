import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class222 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3325 = "Loading sprites - ";

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field3332 = 0;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field3331 = -1;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "[I")
    public static int[] field3333 = new int[2];

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Lhc;")
    public static class235 field3328;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3330;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[BLql;)V")
    public final void method1429(int arg0, byte[] arg1, class224 arg2) {
        field3326++;
        if (arg2.field3336[arg2.field3402] != 31 || arg2.field3336[arg2.field3402 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3330 == null) {
            this.field3330 = new Inflater(true);
        }
        try {
            this.field3330.setInput(arg2.field3336, arg2.field3402 + 10, -arg2.field3402 - (8 - arg2.field3336.length) + -10);
            if (arg0 != 22074) {
                field3332 = 123;
            }
            this.field3330.inflate(arg1);
        } catch (Exception var4) {
            this.field3330.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3330.reset();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method1430(int arg0) {
        field3333 = null;
        int var1 = -91 / ((-arg0 - 14) / 36);
        field3328 = null;
        field3325 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILql;)V")
    public static final void method1431(int arg0, class224 arg1) {
        field3327++;
        if (arg0 <= 62) {
            field3333 = null;
        }
        while (true) {
            while (arg1.field3402 < arg1.field3336.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1453((byte) -128) == 1) {
                    var2 = true;
                    var3 = arg1.method1453((byte) -127);
                    var4 = arg1.method1453((byte) -127);
                }
                int var5 = arg1.method1453((byte) -127);
                int var6 = arg1.method1453((byte) -128);
                int var7 = class41.field605 - (1 - (class142.field1972 - (var6 * 64)));
                int var8 = var5 * 64 - class164.field2273;
                if (var8 >= 0 && (var7 - 63) >= 0 && class138.field1929 > var8 + 63 && var7 < class41.field605) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && (var3 * 8 + 8) > var11 && var4 * 8 <= var12 && var4 * 8 + 8 > var12) {
                                int var13 = arg1.method1453((byte) -127);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1453((byte) -127);
                                        if (class56.field807[var9][var10] == null) {
                                            class56.field807[var9][var10] = new byte[4096];
                                        }
                                        class56.field807[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1454(-67);
                                        if (class34.field531[var9][var10] == null) {
                                            class34.field531[var9][var10] = new int[4096];
                                        }
                                        class34.field531[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg1.method1454(85);
                                        if (class280.field4333[var9][var10] == null) {
                                            class280.field4333[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class111 var17 = class76.method489(var16, 35);
                                        if (var17.field1597 != null) {
                                            var17 = var17.method726((byte) -89);
                                            if (var17 == null || var17.field1607 == -1) {
                                                continue;
                                            }
                                        }
                                        class280.field4333[var9][var10][(63 - var12 << 6) + var11] = var17.field1579 + 1;
                                        class294 var18 = new class294();
                                        var18.field4622 = var7;
                                        var18.field4628 = var17.field1607;
                                        var18.field4626 = var8;
                                        class109.field1522.method988(var18, (byte) -77);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1453((byte) -127);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field3402++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field3402 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field3402 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z")
    public static final boolean method1432(int arg0, int arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        class111 var3 = class76.method489(arg2, 39);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        field3329++;
        if (arg1 != -3122) {
            field3331 = -63;
        }
        return var3.method714(arg0, (byte) -92);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class222() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
    private class222(int arg0, int arg1, int arg2) {
    }
}
