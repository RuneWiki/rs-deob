import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class163 {

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "J")
    public long field2448 = 0L;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "[I")
    public static int[] field2454 = new int[2];

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field2451 = 0;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field2463 = 0;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Lnf;")
    public static class162 field2457 = new class162(50);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lnh;")
    public class55 field2456;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Lnh;")
    public class55 field2459;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2450;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "[[S")
    public static short[][] field2467;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BZII[Lai;[B)V")
    public static final void method1178(byte arg0, boolean arg1, int arg2, int arg3, class89[] arg4, byte[] arg5) {
        field2452++;
        class31 var6 = new class31(arg5);
        int var7 = 69 % ((67 - arg0) / 51);
        int var8 = -1;
        while (true) {
            int var9 = var6.method298(87);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var6.method276((byte) 61);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var6.method265(-109);
                int var16 = arg2 + var13;
                int var17 = var15 & 0x3;
                int var18 = var15 >> 2;
                int var19 = arg3 + var12;
                if (var16 > 0 && var19 > 0 && var16 < 103 && var19 < 103) {
                    class89 var20 = null;
                    if (!arg1) {
                        int var21 = var14;
                        if ((client.field2390[1][var16][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg4[var21];
                        }
                    }
                    class219.method1505(var20, var8, var16, arg1, var19, var18, (byte) 107, var14, var17, var14, !arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lub;ZILub;I)Lsj;")
    public static final class50 method1179(class92 arg0, boolean arg1, int arg2, class92 arg3, int arg4) {
        field2461++;
        if (arg4 >= -60) {
            return null;
        }
        boolean var5 = true;
        int[] var6 = arg3.method724(arg2, -74);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg3.method720(var6[var7], arg2, -118);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg0.method720(var9, 0, -108);
                } else {
                    var10 = arg0.method720(0, var9, 101);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class50(arg3, arg0, arg2, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1180(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class31.field573 * arg3 + class239.field3770 * arg0 >> 16;
        int var6 = class239.field3770 * arg3 - class31.field573 * arg0 >> 16;
        int var7 = class39.field662 * arg1 + class257.field4092 * var6 >> 16;
        int var8 = class257.field4092 * arg1 - class39.field662 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class39.field662 * arg2 + class257.field4092 * var6 >> 16;
        int var12 = class257.field4092 * arg2 - class39.field662 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class206.field3169 && var13 < class206.field3169) {
            return false;
        } else if (var9 > class238.field3752 && var13 > class238.field3752) {
            return false;
        } else if (var10 < class86.field1284 && var14 < class86.field1284) {
            return false;
        } else {
            return var10 <= class170.field2572 || var14 <= class170.field2572;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method1181(int arg0) {
        field2450 = null;
        field2454 = null;
        if (arg0 == 255) {
            field2467 = null;
            field2457 = null;
        }
    }
}
