import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 extends class157 {

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "Lcc;")
    public static class209 field380 = class95.method669(90, "Fermer");

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "[J")
    public static long[] field386 = new long[32];

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "Lla;")
    public static class95 field382 = new class95(64);

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "[Lcc;")
    public static class209[] field391 = new class209[500];

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "[J")
    public static long[] field392 = new long[1000];

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class20() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZII)V")
    public static final void method177(boolean arg0, int arg1, int arg2) {
        field383++;
        if (class161.method1111((byte) 26, arg1) && arg0) {
            class122.method898(arg2, -28098, class50.field984[arg1]);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILsj;)V")
    public static final void method178(int arg0, class49 arg1) {
        field388++;
        class93.field1847 = arg1;
        if (arg0 > -90) {
            method181((class42) null, -16, (class209) null);
        }
    }

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "(I)V")
    public static final void method179(int arg0) {
        field385++;
        if (class14.field262 == -1 || class181.field3263 == -1) {
            return;
        }
        int var1 = ((class33.field587 - class95.field1878) * class144.field2662 >> 16) + class95.field1878;
        class144.field2662 += var1;
        if (class144.field2662 >= 65535) {
            if (class60.field1201) {
                class251.field4519 = false;
            } else {
                class251.field4519 = true;
            }
            class144.field2662 = 65535;
            class60.field1201 = true;
        } else {
            class251.field4519 = false;
            class60.field1201 = false;
        }
        float var2 = (float) class144.field2662 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class160.field2910 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class25.field476[class14.field262][var4][var5] * 3;
            int var22 = class25.field476[class14.field262][var4 + 1][var5] * 3;
            int var23 = (class25.field476[class14.field262][var4 + 2][var5] - (class25.field476[class14.field262][var4 + 3][var5] - class25.field476[class14.field262][var4 + 2][var5])) * 3;
            int var24 = class25.field476[class14.field262][var4][var5];
            int var25 = var21 + var23 - (var22 * 2);
            int var26 = var22 - var21;
            int var27 = class25.field476[class14.field262][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var25) * var2 + (float) var26) * var2 + (float) var24;
        }
        class183.field3312 = (int) var3[1] * -1;
        class60.field1213 = (int) var3[0] - class174.field3178 * 128;
        class103.field1990 = (int) var3[2] - (class245.field4444 * 128);
        int var6 = class155.field2843 * arg0;
        float[] var7 = new float[3];
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class25.field476[class181.field3263][var6][var8] * 3;
            int var15 = class25.field476[class181.field3263][var6 + 1][var8] * 3;
            int var16 = (class25.field476[class181.field3263][var6 + 2][var8] + class25.field476[class181.field3263][var6 + 2][var8] - class25.field476[class181.field3263][var6 + 3][var8]) * 3;
            int var17 = class25.field476[class181.field3263][var6][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class25.field476[class181.field3263][var6 + 2][var8] + var15 - var17 - var16;
            var7[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var7[0] - var3[0];
        float var10 = (var7[1] - var3[1]) * -1.0F;
        float var11 = var7[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class86.field1700 = (float) Math.atan2((double) var10, var12);
        class161.field2923 = -((float) Math.atan2((double) var9, (double) var11));
        class182.field3304 = (int) ((double) class86.field1700 * 325.949D) & 0x7FF;
        class179.field3256 = (int) ((double) class161.field2923 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method180(boolean arg0) {
        field382 = null;
        if (arg0) {
            method179(-99);
        }
        field386 = null;
        field391 = null;
        field392 = null;
        field380 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lji;ILcc;)Lcc;")
    public static final class209 method181(class42 arg0, int arg1, class209 arg2) {
        if (arg1 != -15808) {
            field392 = null;
        }
        if (arg2.method1443(true, class168.field3033) != -1) {
            label62: while (true) {
                int var3 = arg2.method1443(true, class201.field3602);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method1443(true, class14.field265);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method1443(true, class219.field3991);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method1443(true, class161.field2920);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method1443(true, class9.field177);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method1443(true, class27.field491);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class209 var9 = class246.field4451;
                                                        if (class170.field3100 != null) {
                                                            var9 = class38.method285((byte) -119, class170.field3100.field3645);
                                                            try {
                                                                if (class170.field3100.field3642 != null) {
                                                                    byte[] var10 = ((String) class170.field3100.field3642).getBytes("ISO-8859-1");
                                                                    var9 = class281.method1897(0, var10.length, -29806, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class229.method1604(new class209[] { arg2.method1466(125, var8, 0), var9, arg2.method1461(-65, var8 + 4) }, (byte) 89);
                                                    }
                                                }
                                                arg2 = class229.method1604(new class209[] { arg2.method1466(121, var7, 0), class52.method397(class177.method1222(0, 4, arg0), arg1 + 15615), arg2.method1461(arg1 + 15692, var7 - -2) }, (byte) 57);
                                            }
                                        }
                                        arg2 = class229.method1604(new class209[] { arg2.method1466(122, var6, 0), class52.method397(class177.method1222(0, 3, arg0), -193), arg2.method1461(arg1 ^ 0x3DA6, var6 + 2) }, (byte) 76);
                                    }
                                }
                                arg2 = class229.method1604(new class209[] { arg2.method1466(arg1 + 15929, var5, 0), class52.method397(class177.method1222(0, 2, arg0), -193), arg2.method1461(-63, var5 + 2) }, (byte) 42);
                            }
                        }
                        arg2 = class229.method1604(new class209[] { arg2.method1466(arg1 ^ 0xFFFFC239, var4, 0), class52.method397(class177.method1222(0, 1, arg0), -193), arg2.method1461(-37, var4 + 2) }, (byte) 120);
                    }
                }
                arg2 = class229.method1604(new class209[] { arg2.method1466(122, var3, 0), class52.method397(class177.method1222(0, 0, arg0), -193), arg2.method1461(-37, var3 + 2) }, (byte) 53);
            }
        }
        field389++;
        return arg2;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method182(boolean arg0, byte[] arg1, int arg2) {
        field384++;
        int var3 = 4 / ((-arg2 - 28) / 39);
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class79.field1456) {
            try {
                class160 var4 = (class160) Class.forName("of").getDeclaredConstructor().newInstance();
                var4.method1106(arg1, (byte) 122);
                return var4;
            } catch (Throwable var5) {
                class79.field1456 = true;
            }
        }
        return arg0 ? class2.method9(arg1, (byte) 97) : arg1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        if (arg0 == -98) {
            field381++;
            return class50.field987;
        } else {
            return null;
        }
    }
}
