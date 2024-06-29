import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class129 extends class183 {

    @OriginalMember(owner = "client!li", name = "I", descriptor = "[I")
    private int[] field2304;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "[B")
    public byte[] field2296;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "[Lhi;")
    public class86[] field2295;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "[B")
    public byte[] field2301;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "[Lti;")
    public class209[] field2288;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "[B")
    public byte[] field2302;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "[S")
    public short[] field2292;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public int field2291;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "Ldj;")
    public static class44 field2290 = class89.method650(255, "details)3dat");

    @OriginalMember(owner = "client!li", name = "y", descriptor = "Ll;")
    public static class120 field2294 = new class120(8);

    @OriginalMember(owner = "client!li", name = "H", descriptor = "I")
    public static int field2303 = 0;

    @OriginalMember(owner = "client!li", name = "L", descriptor = "Ldj;")
    public static class44 field2307 = class89.method650(255, ")2");

    @OriginalMember(owner = "client!li", name = "J", descriptor = "Ldj;")
    private static class44 field2305 = class89.method650(255, "You have only just left another world)3");

    @OriginalMember(owner = "client!li", name = "K", descriptor = "Ldj;")
    public static class44 field2306 = field2305;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Ldj;")
    public static class44 field2308 = class89.method650(255, ":");

    @OriginalMember(owner = "client!li", name = "N", descriptor = "Z")
    public static boolean field2309 = false;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!li", name = "C", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[BLaf;B)V")
    public static final void method879(int arg0, byte[] arg1, class7 arg2, byte arg3) {
        int var4 = 54 / ((55 - arg3) / 56);
        field2299++;
        class224 var5 = new class224();
        var5.field4185 = 0;
        var5.field3186 = arg0;
        var5.field4179 = arg2;
        var5.field4177 = arg1;
        class190 var6 = class13.field245;
        synchronized (class13.field245) {
            class13.field245.method1185(var5, (byte) -110);
        }
        class226.method1486(20);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "([BZ[ILc;)Z")
    public final boolean method880(byte[] arg0, boolean arg1, int[] arg2, class23 arg3) {
        field2289++;
        boolean var5 = true;
        int var6 = 0;
        class209 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2304[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method167(var9 >> 2, arg2, (byte) -128);
                        } else {
                            var7 = arg3.method164(arg1, var9 >> 2, arg2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2288[var8] = var7;
                        this.field2304[var8] = 0;
                    }
                }
            }
        }
        if (arg1) {
            return false;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public final void method881(int arg0) {
        this.field2304 = null;
        if (arg0 != 0) {
            method882(true);
        }
        field2286++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method882(boolean arg0) {
        field2306 = null;
        if (arg0) {
            method882(false);
        }
        field2290 = null;
        field2308 = null;
        field2307 = null;
        field2305 = null;
        field2294 = null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method883(byte arg0, Component arg1) {
        if (arg0 < 1) {
            return;
        }
        field2297++;
        Method var2 = class229.field4304;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class17.field309);
        arg1.addFocusListener(class17.field309);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class129() {
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIZIIIII)Z")
    public static final boolean method884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2293++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class39.field721[var12][var36] = 0;
                class122.field2174[var12][var36] = 99999999;
            }
        }
        int var13 = arg1;
        if (arg4 != -129) {
            field2287 = -66;
        }
        class39.field721[arg1][arg5] = 99;
        int var14 = arg5;
        class122.field2174[arg1][arg5] = 0;
        byte var15 = 0;
        class40.field761[var15] = arg1;
        int var37 = var15 + 1;
        class83.field1615[var15] = arg5;
        int var16 = 0;
        boolean var17 = false;
        int var18 = class40.field761.length;
        int[][] var19 = class73.field1390[class194.field3403].field3908;
        while (var37 != var16) {
            var13 = class40.field761[var16];
            var14 = class83.field1615[var16];
            var16 = (var16 + 1) % var18;
            if (arg8 == var13 && arg7 == var14) {
                var17 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class73.field1390[class194.field3403].method1396(arg3 - 1, var13, arg7, 1, arg8, var14, arg9)) {
                    var17 = true;
                    break;
                }
                if (arg3 < 10 && class73.field1390[class194.field3403].method1400(var13, (byte) 73, arg7, var14, arg8, arg3 - 1, arg9)) {
                    var17 = true;
                    break;
                }
            }
            if (arg10 != 0 && arg11 != 0 && class73.field1390[class194.field3403].method1410(arg4 + 226, arg11, arg10, var13, arg0, var14, arg7, arg8)) {
                var17 = true;
                break;
            }
            int var35 = class122.field2174[var13][var14] + 1;
            if (var13 > 0 && class39.field721[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class40.field761[var37] = var13 - 1;
                class83.field1615[var37] = var14;
                var37 = (var37 + 1) % var18;
                class39.field721[var13 - 1][var14] = 2;
                class122.field2174[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class39.field721[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class40.field761[var37] = var13 + 1;
                class83.field1615[var37] = var14;
                class39.field721[var13 + 1][var14] = 8;
                var37 = (var37 + 1) % var18;
                class122.field2174[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class39.field721[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class40.field761[var37] = var13;
                class83.field1615[var37] = var14 - 1;
                class39.field721[var13][var14 - 1] = 1;
                var37 = (var37 + 1) % var18;
                class122.field2174[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class39.field721[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class40.field761[var37] = var13;
                class83.field1615[var37] = var14 + 1;
                class39.field721[var13][var14 + 1] = 4;
                class122.field2174[var13][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var14 > 0 && class39.field721[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class40.field761[var37] = var13 - 1;
                class83.field1615[var37] = var14 - 1;
                class39.field721[var13 - 1][var14 - 1] = 3;
                var37 = (var37 + 1) % var18;
                class122.field2174[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class39.field721[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class40.field761[var37] = var13 + 1;
                class83.field1615[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class39.field721[var13 + 1][var14 - 1] = 9;
                class122.field2174[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class39.field721[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class40.field761[var37] = var13 - 1;
                class83.field1615[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class39.field721[var13 - 1][var14 + 1] = 6;
                class122.field2174[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class39.field721[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class40.field761[var37] = var13 + 1;
                class83.field1615[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class39.field721[var13 + 1][var14 + 1] = 12;
                class122.field2174[var13 + 1][var14 + 1] = var35;
            }
        }
        class205.field3680 = 0;
        if (!var17) {
            if (!arg6) {
                return false;
            }
            int var20 = 100;
            byte var21 = 10;
            int var22 = 1000;
            for (int var23 = arg8 - var21; var23 <= arg8 + var21; var23++) {
                for (int var24 = arg7 - var21; var24 <= arg7 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class122.field2174[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg8) {
                            var25 = arg8 - var23;
                        } else if (arg8 + arg10 - 1 < var23) {
                            var25 = var23 + 1 - arg8 - arg10;
                        }
                        int var26 = 0;
                        if (arg7 > var24) {
                            var26 = arg7 - var24;
                        } else if (var24 > arg11 + arg7 - 1) {
                            var26 = var24 + 1 - arg11 - arg7;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var22 > var27 || var22 == var27 && class122.field2174[var23][var24] < var20) {
                            var20 = class122.field2174[var23][var24];
                            var14 = var24;
                            var13 = var23;
                            var22 = var27;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg5 == var14) {
                return false;
            }
            class205.field3680 = 1;
        }
        byte var28 = 0;
        class40.field761[var28] = var13;
        int var38 = var28 + 1;
        class83.field1615[var28] = var14;
        int var29;
        int var30 = var29 = class39.field721[var13][var14];
        while (arg1 != var13 || arg5 != var14) {
            if (var29 != var30) {
                class40.field761[var38] = var13;
                class83.field1615[var38++] = var14;
                var29 = var30;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class39.field721[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class40.field761[var38];
            int var33 = class83.field1615[var38];
            if (arg2 == 0) {
                class86.field1656++;
                class200.field3542.method1170(245, (byte) -108);
                class200.field3542.method488(arg4 + 255, var31 - -var31 + 3);
            }
            if (arg2 == 1) {
                class102.field1857++;
                class200.field3542.method1170(255, (byte) -74);
                class200.field3542.method488(122, var31 + var31 + 3 + 14);
            }
            if (arg2 == 2) {
                class200.field3542.method1170(247, (byte) -101);
                class153.field2659++;
                class200.field3542.method488(125, var31 + var31 + 3);
            }
            class200.field3542.method526(class222.field4020 + var32, -81);
            class198.field3511 = class40.field761[0];
            class38.field668 = class83.field1615[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class200.field3542.method488(arg4 ^ 0xFFFFFF03, class40.field761[var38] - var32);
                class200.field3542.method484((byte) -98, class83.field1615[var38] - var33);
            }
            class200.field3542.method493(class143.field2550 + var33, 44);
            class200.field3542.method479(class130.field2324[82] ? 1 : 0, -121);
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
    public class129(byte[] arg0) {
        this.field2304 = new int[128];
        this.field2296 = new byte[128];
        this.field2295 = new class86[128];
        this.field2301 = new byte[128];
        this.field2288 = new class209[128];
        this.field2302 = new byte[128];
        this.field2292 = new short[128];
        class66 var2 = new class66(arg0);
        int var3;
        for (var3 = 0; var2.field1219[var2.field1195 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method505(false);
        }
        var2.field1195++;
        var3++;
        int var6 = var2.field1195;
        var2.field1195 += var3;
        int var7;
        for (var7 = 0; var2.field1219[var2.field1195 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method505(false);
        }
        var7++;
        var2.field1195++;
        int var10 = var2.field1195;
        int var11 = 0;
        var2.field1195 += var7;
        while (var2.field1219[var2.field1195 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method505(false);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var2.field1195++;
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method506(255);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class86[] var19 = new class86[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class86 var103 = var19[var20] = new class86();
            int var104 = var2.method506(255);
            if (var104 > 0) {
                var103.field1646 = new byte[var104 * 2];
            }
            int var105 = var2.method506(255);
            if (var105 > 0) {
                var103.field1647 = new byte[var105 * 2 + 2];
                var103.field1647[1] = 64;
            }
        }
        int var21 = var2.method506(255);
        int var22 = 0;
        byte[] var23 = var21 > 0 ? new byte[var21 * 2] : null;
        int var24 = var2.method506(255);
        while (var2.field1219[var2.field1195 + var22] != 0) {
            var22++;
        }
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        byte[] var26 = new byte[var22];
        for (int var27 = 0; var27 < var22; var27++) {
            var26[var27] = var2.method505(false);
        }
        int var28 = 0;
        var2.field1195++;
        var22++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method506(255);
            this.field2292[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method506(255);
            this.field2292[var31] = (short) (this.field2292[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method501((byte) 30);
            }
            this.field2292[var35] = (short) (this.field2292[var35] + class29.method202(32768, var34 - 1 << 14));
            var32--;
            this.field2304[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2304[var39] != 0) {
                if (var38 == 0) {
                    var37 = var2.field1219[var6++] - 1;
                    if (var36 < var4.length) {
                        var38 = var4[var36++];
                    } else {
                        var38 = -1;
                    }
                }
                var38--;
                this.field2302[var39] = (byte) var37;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2304[var43] != 0) {
                if (var40 == 0) {
                    if (var41 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                    var42 = var2.field1219[var10++] + 16 << 2;
                }
                this.field2296[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class86 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2304[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field2295[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length <= var48) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field2304[var51] > 0) {
                    var50 = var2.method506(255) + 1;
                }
            }
            this.field2301[var51] = (byte) var50;
            var49--;
        }
        this.field2291 = var2.method506(255) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class86 var100 = var19[var52];
            if (var100.field1646 != null) {
                for (int var101 = 1; var101 < var100.field1646.length; var101 += 2) {
                    var100.field1646[var101] = var2.method505(false);
                }
            }
            if (var100.field1647 != null) {
                for (int var102 = 3; var102 < var100.field1647.length - 2; var102 += 2) {
                    var100.field1647[var102] = var2.method505(false);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method505(false);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var2.method505(false);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class86 var97 = var19[var55];
            if (var97.field1647 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1647.length; var99 += 2) {
                    var98 = var98 + var2.method506(255) + 1;
                    var97.field1647[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class86 var94 = var19[var56];
            if (var94.field1646 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1646.length; var96 += 2) {
                    var95 = var2.method506(255) + var95 + 1;
                    var94.field1646[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var2.method506(255);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 = var57 + var2.method506(255) + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2301[var61] = (byte) (this.field2301[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var23.length > var62) {
                byte var65 = var23[var62];
                int var66 = (var65 - var59) * var60 + (var65 - var59) / 2;
                byte var67 = var23[var62 + 1];
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class61.method463(true, var65 - var59, var66);
                    this.field2301[var68] = (byte) (this.field2301[var68] * var69 + 32 >> 6);
                    var66 += var67 - var60;
                }
                var62 += 2;
                var60 = var67;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2301[var63] = (byte) (this.field2301[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var2.method506(255);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var2.method506(255) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2296[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2296[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                int var79 = var25[var75 + 1] << 1;
                byte var80 = var25[var75];
                int var81 = (var80 - var72) / 2 + (var80 - var72) * var73;
                var75 += 2;
                for (int var82 = var72; var82 < var80; var82++) {
                    int var83 = class61.method463(true, var80 - var72, var81);
                    var81 += var79 - var73;
                    int var84 = (this.field2296[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2296[var82] = (byte) var84;
                }
                var73 = var79;
                var72 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field2296[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2296[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1651 = var2.method506(255);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class86 var93 = var19[var87];
            if (var93.field1646 != null) {
                var93.field1657 = var2.method506(255);
            }
            if (var93.field1647 != null) {
                var93.field1649 = var2.method506(255);
            }
            if (var93.field1651 > 0) {
                var93.field1648 = var2.method506(255);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1650 = var2.method506(255);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class86 var92 = var19[var89];
            if (var92.field1650 > 0) {
                var92.field1660 = var2.method506(255);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class86 var91 = var19[var90];
            if (var91.field1660 > 0) {
                var91.field1653 = var2.method506(255);
            }
        }
    }
}
