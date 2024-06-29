import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 {

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public int field2959 = 0;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public int field2951 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lqf;")
    public static class117 field2940 = class72.method514(115, " (X");

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2949 = 78;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lqf;")
    public static class117 field2947 = class72.method514(107, "(U(Y");

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Z")
    public static boolean field2963 = false;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "Leb;")
    public static class31 field2962 = new class31(64);

    @OriginalMember(owner = "client!s", name = "B", descriptor = "Lqf;")
    private static class117 field2965 = class72.method514(127, "level)2");

    @OriginalMember(owner = "client!s", name = "E", descriptor = "Lqf;")
    public static class117 field2968 = field2965;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "Lqf;")
    private static class117 field2967 = class72.method514(114, "Select a world");

    @OriginalMember(owner = "client!s", name = "A", descriptor = "Lqf;")
    public static class117 field2964 = field2967;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2966 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!s", name = "F", descriptor = "Lqf;")
    public static class117 field2969 = class72.method514(119, "blinken1:");

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field2938;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field2939;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lee;")
    public class34 field2941;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "Lnc;")
    public static class93 field2957;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lha;IILca;)V")
    public static final void method989(class50 arg0, int arg1, int arg2, class16 arg3) {
        class124 var4 = new class124();
        var4.field1495 = arg2;
        var4.field2918 = arg0;
        var4.field2914 = arg3;
        field2948++;
        var4.field2929 = arg1;
        class5 var5 = class34.field710;
        synchronized (class34.field710) {
            class34.field710.method22(var4, (byte) 48);
        }
        class75.method543(-127);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZB)V")
    public static final void method990(boolean arg0, byte arg1) {
        field2958++;
        class52.field1075 = arg0;
        if (class52.field1075) {
            int var15 = class96.field2338.method574((byte) -106);
            int var16 = class96.field2338.method589((byte) -128);
            int var17 = class96.field2338.method574((byte) -118);
            int var18 = class96.field2338.method596(112);
            int var19 = class96.field2338.method597(39);
            class96.field2338.method960(-1);
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class96.field2338.method963(-73, 1);
                        if (var37 == 1) {
                            class149.field3707[var20][var35][var36] = class96.field2338.method963(-71, 26);
                        } else {
                            class149.field3707[var20][var35][var36] = -1;
                        }
                    }
                }
            }
            class96.field2338.method956(13656);
            int var21 = (class71.field1502 - class96.field2338.field1691) / 16;
            class124.field2935 = new int[var21][4];
            for (int var22 = 0; var22 < var21; var22++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class124.field2935[var22][var34] = class96.field2338.method584(255);
                }
            }
            class34.field718 = new byte[var21][];
            class100.field2412 = new int[var21];
            class58.field1174 = new byte[var21][];
            class18.field283 = new int[var21];
            class53.field1093 = new int[var21];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        int var27 = class149.field3707[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = var27 >> 14 & 0x3FF;
                            int var29 = var27 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + (var29 / 8);
                            for (int var31 = 0; var31 < var23; var31++) {
                                if (class18.field283[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                int var32 = var30 >> 8 & 0xFF;
                                int var33 = var30 & 0xFF;
                                class18.field283[var23] = var30;
                                class100.field2412[var23] = class133.field3147.method447((byte) 55, class73.method530((byte) -83, new class117[] { client.field396, class79.method614(15591, var32), class89.field2060, class79.method614(15591, var33) }));
                                class53.field1093[var23] = class133.field3147.method447((byte) 110, class73.method530((byte) -83, new class117[] { class101.field2436, class79.method614(arg1 + 15575, var32), class89.field2060, class79.method614(15591, var33) }));
                                var23++;
                            }
                        }
                    }
                }
            }
            class152.method1210(var16, var17, 112, var15, var19, var18);
        } else {
            int var2 = class96.field2338.method589((byte) -128);
            int var3 = class96.field2338.method587(false);
            int var4 = (class71.field1502 - class96.field2338.field1691) / 16;
            class124.field2935 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class124.field2935[var5][var14] = class96.field2338.method567(false);
                }
            }
            int var6 = class96.field2338.method589((byte) -128);
            int var7 = class96.field2338.method559((byte) -73);
            int var8 = class96.field2338.method587(false);
            class18.field283 = new int[var4];
            boolean var9 = false;
            if ((var6 / 8 == 48 || var6 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            class53.field1093 = new int[var4];
            class100.field2412 = new int[var4];
            class34.field718 = new byte[var4][];
            if (var6 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            class58.field1174 = new byte[var4][];
            int var10 = 0;
            for (int var11 = (var6 - 6) / 8; var11 <= (var6 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class18.field283[var10] = var13;
                        class100.field2412[var10] = class133.field3147.method447((byte) 14, class73.method530((byte) -83, new class117[] { client.field396, class79.method614(15591, var11), class89.field2060, class79.method614(arg1 + 15575, var12) }));
                        class53.field1093[var10] = class133.field3147.method447((byte) 93, class73.method530((byte) -83, new class117[] { class101.field2436, class79.method614(class138.method1074(arg1, 15607), var11), class89.field2060, class79.method614(15591, var12) }));
                        var10++;
                    }
                }
            }
            class152.method1210(var6, var8, 90, var2, var3, var7);
        }
        if (arg1 != 16) {
            field2952 = -49;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method991(int arg0) {
        field2967 = null;
        field2966 = null;
        field2962 = null;
        field2940 = null;
        field2968 = null;
        field2947 = null;
        if (arg0 != 8) {
            field2965 = null;
        }
        field2964 = null;
        field2969 = null;
        field2965 = null;
        field2957 = null;
    }
}
