import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class216 extends class223 {

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field3305 = 1;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3307 = "glow2:";

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field3314 = 0;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "I")
    public static int field3315 = -1;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "Z")
    public static boolean field3309 = true;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!se", name = "U", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Z")
    public static boolean field3308;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
    public static final void method1489(int arg0, int arg1) {
        ++field3317;
        if (~arg1 != 0) {
            if (class153.field2257[arg1]) {
                class125.field1878.method714(arg1, (byte) 91);
                if (class8.field144[arg1] != null) {
                    if (arg0 != -24005) {
                        field3309 = true;
                    }
                    boolean var2 = true;
                    for (int var3 = 0; var3 < class8.field144[arg1].length; ++var3) {
                        if (class8.field144[arg1][var3] != null) {
                            if (class8.field144[arg1][var3].field3552 == 2) {
                                var2 = false;
                            } else {
                                class8.field144[arg1][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class8.field144[arg1] = null;
                    }
                    class153.field2257[arg1] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
    public static void method1490(byte arg0) {
        if (arg0 != 88) {
            field3308 = true;
        }
        field3307 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lah;IIIB)V")
    public static final void method1491(class295 arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -38) {
            method1493(-124, 60, -65, -111, -101);
        }
        ++field3311;
        for (class80 var5 = (class80) class58.field922.method6(-127); var5 != null; var5 = (class80) class58.field922.method11((byte) 86)) {
            if (var5.field1211 == arg3 && arg1 * 128 == var5.field1222 && ~(arg2 * 128) == ~var5.field1233 && var5.field1230.field4584 == arg0.field4584) {
                if (var5.field1220 != null) {
                    class83.field1251.method243(var5.field1220);
                    var5.field1220 = null;
                }
                if (var5.field1219 != null) {
                    class83.field1251.method243(var5.field1219);
                    var5.field1219 = null;
                }
                var5.method995((byte) -95);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class216() {
        super(0, true);
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)[Lig;")
    public static final class9[] method1492(int arg0) {
        ++field3310;
        class9[] var1 = new class9[class174.field2682];
        for (int var2 = arg0; ~class174.field2682 < ~var2; ++var2) {
            var1[var2] = new class13(class214.field3278, class234.field3705, class196.field3069[var2], class125.field1877[var2], class104.field1621[var2], class170.field2583[var2], class301.field4847[var2], class102.field1585);
        }
        class30.method254(2);
        return var1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V")
    public static final void method1493(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3316;
        class66.method524(arg1, arg4, arg1 - -arg0, arg4 - -arg3);
        class66.method532(arg1, arg4, arg0, arg3, 0);
        if (~class298.field4807 <= arg2) {
            if (class23.field409 == null || class23.field409.field3273 != arg0 || class23.field409.field3265 != arg3) {
                class51 var5 = new class51(arg0, arg3);
                class66.method527(var5.field822, arg0, arg3);
                class78.method614(0, arg3, 0, (byte) -19, 0, class152.field2247, arg0, class92.field1475, 0);
                class23.field409 = var5;
                class143.field2140.method1862(false);
            }
            class23.field409.method441(arg1, arg4);
            int var6 = class293.field4540 * arg0 / class152.field2247 + arg1;
            int var7 = class104.field1619 * arg3 / class92.field1475 + arg4;
            int var8 = class266.field4203 * arg0 / class152.field2247;
            int var9 = class117.field1784 * arg3 / class92.field1475;
            int var10 = 16711680;
            if (~class152.field2248 == -2) {
                var10 = 16777215;
            }
            class66.method520(var6, var7, var8, var9, var10, 128);
            class66.method533(var6, var7, var8, var9, var10);
            if (~class105.field1644 < -1) {
                int var11;
                if (class308.field4935 > 10) {
                    var11 = -(class308.field4935 * 25) + 500;
                } else {
                    var11 = class308.field4935 * 25;
                }
                for (class135 var12 = (class135) class176.field2708.method6(-126); var12 != null; var12 = (class135) class176.field2708.method11((byte) 102)) {
                    if (~class31.field532 == ~var12.field2020) {
                        int var13 = arg1 - -(var12.field2024 * arg0 / class152.field2247);
                        int var14 = arg4 - -(var12.field2023 * arg3 / class92.field1475);
                        class66.method520(var13 + -2, var14 + -2, 4, 4, 16776960, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)Ljava/lang/String;")
    public static final String method1494(int arg0) {
        String var1 = "";
        ++field3306;
        if (arg0 >= -108) {
            return null;
        } else {
            String var2 = "www";
            if (class253.field4038 != null) {
                var1 = "/p=" + class253.field4038;
            }
            if (~class110.field1709 != -1) {
                var2 = "www-wtqa";
            }
            return "http://" + var2 + ".runescape.com/l=" + class130.field1939 + "/a=" + class178.field2734 + var1 + "/";
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        ++field3313;
        if (arg0 < 14) {
            return null;
        } else {
            int[] var3 = super.field3588.method1611(0, arg1);
            if (super.field3588.field3722) {
                class81.method633(var3, 0, class250.field4008, class307.field4925[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method1495(int arg0, Random arg1, int arg2) {
        ++field3312;
        if (~arg2 >= -1) {
            throw new IllegalArgumentException();
        } else if (class259.method1741((byte) -113, arg2)) {
            return (int) (((long) arg1.nextInt() & 4294967295L) * (long) arg2 >> 32);
        } else {
            if (arg0 != -2) {
                method1492(-4);
            }
            int var3 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class147.method1058((byte) 119, var4, arg2);
        }
    }
}
