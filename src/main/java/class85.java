import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class85 {

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field1117 = 7759444;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field1120 = 0;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1124 = "green:";

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public int field1109;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public int field1111;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field1114;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public int field1116;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public int field1119;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public int field1127;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Lnk;")
    public static class16 field1115;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "[Lkg;")
    public static class85[] field1102;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZII[Lne;[B)V", line = 22)
    public static final void method539(int arg0, boolean arg1, int arg2, int arg3, class262[] arg4, byte[] arg5) {
        field1128++;
        int var6 = -64 / ((23 - arg3) / 63);
        class143 var7 = new class143(arg5);
        int var8 = -1;
        while (true) {
            int var9 = var7.method1019(25180);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method1027(false);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method1043(true);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg0 + var12;
                int var19 = arg2 + var13;
                if (var19 > 0 && var18 > 0 && var19 < 103 && var18 < 103) {
                    class262 var20 = null;
                    if (!arg1) {
                        int var21 = var14;
                        if ((class225.field3398[1][var19][var18] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg4[var21];
                        }
                    }
                    class100.method638(var14, arg1, -5, var16, var14, var20, var8, var18, !arg1, var17, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 101)
    public static void method540(int arg0) {
        field1115 = null;
        if (arg0 <= 108) {
            method542((byte) -16);
        }
        field1102 = null;
        field1124 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 114)
    public static final void method541(boolean arg0) {
        class52.field600 = -1;
        class71.field890 = 0;
        field1103++;
        class334.field5338 = arg0;
        class90.field1189 = 0;
        class231.field3500 = 1;
        class60.field712 = 0;
        class30.field353 = -3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 132)
    public static final void method542(byte arg0) {
        field1106++;
        int var1 = class11.field118 * 128 + 64;
        int var2 = class93.field1222 * 128 + 64;
        int var3 = class14.method80(var2, class219.field3290, var1, (byte) -126) - class163.field2516;
        if (class55.field658 < 100) {
            if (var2 > class280.field4415) {
                class280.field4415 += (var2 - class280.field4415) * class55.field658 / 1000 + class222.field3359;
                if (class280.field4415 > var2) {
                    class280.field4415 = var2;
                }
            }
            if (class119.field1657 < var3) {
                class119.field1657 += (var3 - class119.field1657) * class55.field658 / 1000 + class222.field3359;
                if (var3 < class119.field1657) {
                    class119.field1657 = var3;
                }
            }
            if (class119.field1657 > var3) {
                class119.field1657 -= class222.field3359 + ((class119.field1657 - var3) * class55.field658 / 1000);
                if (class119.field1657 < var3) {
                    class119.field1657 = var3;
                }
            }
            if (var2 < class280.field4415) {
                class280.field4415 -= (class280.field4415 - var2) * class55.field658 / 1000 + class222.field3359;
                if (var2 > class280.field4415) {
                    class280.field4415 = var2;
                }
            }
            if (class10.field96 < var1) {
                class10.field96 += class222.field3359 + ((var1 - class10.field96) * class55.field658 / 1000);
                if (class10.field96 > var1) {
                    class10.field96 = var1;
                }
            }
            if (var1 < class10.field96) {
                class10.field96 -= class222.field3359 + ((class10.field96 - var1) * class55.field658 / 1000);
                if (var1 > class10.field96) {
                    class10.field96 = var1;
                }
            }
        } else {
            class10.field96 = class11.field118 * 128 + 64;
            class280.field4415 = class93.field1222 * 128 + 64;
            class119.field1657 = class14.method80(class280.field4415, class219.field3290, class10.field96, (byte) -126) - class163.field2516;
        }
        int var4 = class211.field3196 * 128 + 64;
        int var5 = class267.field4199 * 128 + 64;
        int var6 = class14.method80(var5, class219.field3290, var4, (byte) -126) - class295.field4642;
        int var7 = var4 - class10.field96;
        int var8 = var5 - class280.field4415;
        int var9 = var6 - class119.field1657;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        int var13 = var12 - class257.field4067;
        if (var11 > class283.field4508) {
            class283.field4508 += (var11 - class283.field4508) * class140.field2159 / 1000 + class233.field3525;
            if (class283.field4508 > var11) {
                class283.field4508 = var11;
            }
        }
        if (class283.field4508 > var11) {
            class283.field4508 -= (class283.field4508 - var11) * class140.field2159 / 1000 + class233.field3525;
            if (class283.field4508 < var11) {
                class283.field4508 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class257.field4067 += class233.field3525 + (class140.field2159 * var13 / 1000);
            class257.field4067 &= 0x7FF;
        }
        if (var13 < 0) {
            class257.field4067 -= class233.field3525 + (-var13 * class140.field2159 / 1000);
            class257.field4067 &= 0x7FF;
        }
        int var14 = var12 - class257.field4067;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class257.field4067 = var12;
        }
        if (arg0 > -97) {
            method541(true);
        }
    }
}
