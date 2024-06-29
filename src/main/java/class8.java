import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class8 {

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field77 = "glow1:";

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "J")
    public static long field73 = 0L;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "[F")
    public static float[] field82 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field83 = 0;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field78 = new CRC32();

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Lqc;")
    public static class99 field84 = new class99(16);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIII)Z", line = 4)
    public static final boolean method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class96.field1302[arg0][var8][var9] == -class24.field300) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class333.field5020[arg0][arg1][arg3] + arg5;
            if (!class143.method1030(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class143.method1030(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class143.method1030(var10, var12, var14)) {
                return false;
            } else if (class143.method1030(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class343.method2363(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class143.method1030(var6 + 1, class333.field5020[arg0][arg1][arg3] + arg5, var7 + 1) && class143.method1030(var6 + 128 - 1, class333.field5020[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class143.method1030(var6 + 128 - 1, class333.field5020[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class143.method1030(var6 + 1, class333.field5020[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZZ)V", line = 64)
    public static final void method42(boolean arg0, boolean arg1) {
        class139.method1004(class53.field715, class28.field349, class203.field2901, class275.field4124);
        class139.method1008(class243.field3478, class168.field2293, arg0);
        field76++;
        class139.method1003((float) class269.field3993, (float) class65.field863, (float) class131.field1792);
        class139.method1002();
        class303.field4560 = class65.field860;
        if (arg1) {
            field83 = 52;
        }
        class303.field4563 = class179.field2407;
        class303.field4564 = class164.field2255;
        class82.field1195 = class123.field1661;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 85)
    public static void method43(int arg0) {
        if (arg0 > -119) {
            method41(-42, -86, 109, -88, -8, -48);
        }
        field77 = null;
        field82 = null;
        field84 = null;
        field78 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)Ljava/lang/String;", line = 103)
    public static final String method44(int arg0, int arg1) {
        if (arg0 == 255) {
            field75++;
            return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFF8885) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 116)
    public static final void method45(String arg0, int arg1, int arg2) {
        String var3 = class286.method1963(false, class338.method2343(arg0, (byte) 124));
        field74++;
        boolean var4 = false;
        if (arg1 != -6) {
            method41(48, -5, -29, 78, 52, 123);
        }
        for (int var5 = 0; var5 < class292.field4352; var5++) {
            class241 var6 = class169.field2306[class4.field35[var5]];
            if (var6 != null && var6.field3439 != null && var6.field3439.equalsIgnoreCase(var3)) {
                if (arg2 == 1) {
                    class301.field4468++;
                    class90.field1264.method2238(255, (byte) -128);
                    class90.field1264.method2184((byte) 89, 0);
                    class90.field1264.method2169(true, class4.field35[var5]);
                } else if (arg2 == 4) {
                    class138.field1891++;
                    class90.field1264.method2238(61, (byte) -128);
                    class90.field1264.method2197((byte) 44, 0);
                    class90.field1264.method2206(class4.field35[var5], arg1 ^ 0x7A);
                } else if (arg2 == 5) {
                    class243.field3480++;
                    class90.field1264.method2238(139, (byte) -128);
                    class90.field1264.method2174((byte) 91, 0);
                    class90.field1264.method2206(class4.field35[var5], -128);
                } else if (arg2 == 6) {
                    class90.field1264.method2238(249, (byte) -128);
                    class171.field2337++;
                    class90.field1264.method2189(-1, class4.field35[var5]);
                    class90.field1264.method2197((byte) 44, 0);
                } else if (arg2 == 7) {
                    class90.field1264.method2238(230, (byte) -128);
                    class90.field1264.method2206(class4.field35[var5], -128);
                    class108.field1464++;
                    class90.field1264.method2174((byte) 91, 0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class93.method695((byte) 120, 0, class136.field1886 + var3, "");
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 199)
    public static final void method46(String arg0, boolean arg1) {
        field80++;
        int var2 = class336.method2326(arg0, -1);
        if (var2 == -1) {
            return;
        }
        if (arg1) {
            method43(111);
        }
        int[] var3 = class135.field1864.method2024(class132.field1811.field2389[var2] >> 14 & 0x3FFF, (byte) 93, class132.field1811.field2389[var2] & 0x3FFF, (class132.field1811.field2389[var2] & 0x3DEC84FF) >> 28);
        class90.method688((byte) -9, var3[1], var3[2]);
    }
}
