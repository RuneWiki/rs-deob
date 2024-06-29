import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class150 extends class328 {

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field2458 = -1;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "[I")
    public static int[] field2459 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field2455 = 0;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[I")
    public static int[] field2449;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V", line = 6)
    public static void method1246(byte arg0) {
        field2459 = null;
        field2449 = null;
        if (arg0 < 93) {
            method1246((byte) 32);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II[BB)Z", line = 17)
    public static final boolean method1247(int arg0, int arg1, byte[] arg2, byte arg3) {
        field2456++;
        if (arg3 != -16) {
            return false;
        }
        boolean var4 = true;
        class25 var5 = new class25(arg2);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method308((byte) -111);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var5.method270(false);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var9 += var11 - 1;
                    int var12 = var9 & 0x3F;
                    int var13 = var5.method281(77) >> 2;
                    int var14 = var12 + arg0;
                    int var15 = var9 >> 6 & 0x3F;
                    int var16 = arg1 + var15;
                    if (var16 > 0 && var14 > 0 && var16 < 103 && var14 < 103) {
                        class212 var17 = class43.method437(78, var6);
                        if (var13 != 22 || class327.field5034 || var17.field3254 != 0 || var17.field3329 == 1 || var17.field3279) {
                            var8 = true;
                            if (!var17.method1580(-49)) {
                                var4 = false;
                                class148.field2432++;
                            }
                        }
                    }
                }
                int var10 = var5.method270(false);
                if (var10 == 0) {
                    break;
                }
                var5.method281(80);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[S)[S", line = 100)
    public static final short[] method1248(int arg0, short[] arg1) {
        if (arg0 != 3) {
            return (short[]) null;
        }
        field2457++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class65.method643(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)V", line = 124)
    public static final void method1249(byte arg0) {
        field2451++;
        class244.field3791.method655(-1);
        if (arg0 >= -25) {
            field2459 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([II[J)V", line = 135)
    public static final void method1250(int[] arg0, int arg1, long[] arg2) {
        field2453++;
        class215.method1611(arg2, arg2.length - 1, 0, arg0, 12179);
        if (arg1 > -75) {
            field2459 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([BI)[B", line = 150)
    public static final byte[] method1251(byte[] arg0, int arg1) {
        field2454++;
        if (arg1 > -36) {
            method1247(-57, -109, (byte[]) null, (byte) 121);
        }
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class65.method642(arg0, 0, var3, 0, var2);
        return var3;
    }
}
