import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class367 extends class338 {

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
    public int[] field5137 = new int[1];

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[I")
    public int[] field5141 = new int[] { -1 };

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Lmk;")
    public static class154 field5136 = new class154();

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field5143 = new String[5];

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field5142 = 1;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public static void method2221(byte arg0) {
        field5136 = null;
        field5143 = null;
        if (arg0 != 36) {
            field5136 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([IIZ[II)J")
    private final long method2222(int[] arg0, int arg1, boolean arg2, int[] arg3, int arg4) {
        field5138++;
        long[] var6 = class149.field1897;
        if (arg1 != 15) {
            field5136 = null;
        }
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg4 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg4 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg3.length; var13++) {
            long var17 = var6[(int) (((long) (arg3[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg3[var13] >> 16)) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg3[var13] >> 8)) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg3[var13] ^ var21) & 0xFFL)];
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg0[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var6[(int) ((var11 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public static final void method2223(byte arg0) {
        field5135++;
        if (arg0 <= 29) {
            return;
        }
        for (class319 var1 = (class319) class98.field1158.method814((byte) 90); var1 != null; var1 = (class319) class98.field1158.method827(-126)) {
            if (var1.field4267) {
                var1.method1843(0);
            }
        }
        for (class319 var2 = (class319) class296.field4034.method814((byte) 90); var2 != null; var2 = (class319) class296.field4034.method827(-128)) {
            if (var2.field4267) {
                var2.method1843(0);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILol;IZBLvm;ILlb;)Ljn;")
    public final class396 method2224(int arg0, int arg1, int arg2, class335 arg3, int arg4, boolean arg5, byte arg6, class322 arg7, int arg8, class208 arg9) {
        field5139++;
        class396 var11 = null;
        int var12 = arg1;
        class70 var13 = null;
        if (arg2 != -1) {
            var13 = class298.method1761(arg2, 29514);
        }
        int[] var14 = this.field5141;
        if (var13 != null && var13.field766 != null) {
            var14 = new int[var13.field766.length];
            for (int var15 = 0; var15 < var13.field766.length; var15++) {
                int var16 = var13.field766[var15];
                if (var16 >= 0 && var16 < this.field5141.length) {
                    var14[var15] = this.field5141[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        if (arg6 >= -48) {
            this.field5141 = null;
        }
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class127 var23 = null;
        class127 var24 = null;
        if (arg9 != null) {
            var12 = arg1 | 0x20;
            int var25 = arg9.field2823[arg0];
            int var26 = var25 >>> 16;
            var20 = var25 & 0xFFFF;
            var23 = class451.method2800(var26, 0);
            if (var23 != null) {
                var18 |= var23.method685(var20, -1);
                var17 |= var23.method686(var20, true);
                var19 |= arg9.field2811;
            }
            if ((arg9.field2803 || class83.field926) && arg8 != -1 && arg9.field2823.length > arg8) {
                int var27 = arg9.field2823[arg8];
                var22 = arg9.field2818[arg0];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class451.method2800(var21 >>> 16, 0);
                }
                if (var24 != null) {
                    var18 |= var24.method685(var21, -1);
                    var17 |= var24.method686(var21, true);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        long var29 = this.method2222(arg3 == null ? null : arg3.field4450, 15, arg5, var14, arg2);
        if (class427.field6253 != null) {
            var11 = (class396) class427.field6253.method616(-57, var29);
        }
        if (var11 == null || arg7.method1620(var11.method2312(), var12) != 0) {
            if (var11 != null) {
                var12 = arg7.method1634(var12, var11.method2312());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class65.method368(var14[var33], -115).method670(0, arg5)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class390[] var34 = new class390[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class65.method368(var14[var35], -124).method659((byte) -69, arg5);
                }
            }
            if (var13 != null && var13.field760 != null) {
                for (int var36 = 0; var36 < var13.field760.length; var36++) {
                    if (var13.field760[var36] != null && var34[var36] != null) {
                        int var37 = var13.field760[var36][0];
                        int var38 = var13.field760[var36][1];
                        int var39 = var13.field760[var36][2];
                        int var40 = var13.field760[var36][3];
                        int var41 = var13.field760[var36][4];
                        int var42 = var13.field760[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method2426(var40, var42, (byte) -101, var41);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method2422(var39, var38, var37, 117);
                        }
                    }
                }
            }
            class390 var43 = new class390(var34, var34.length);
            if (arg3 != null) {
                var31 = var12 | 0x2000;
            }
            var11 = arg7.method1651(var43, var31, class390.field5598, 64, 850);
            if (arg3 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class309.field4178[var44].length > arg3.field4450[var44]) {
                        var11.method2307(class392.field5647[var44], class309.field4178[var44][arg3.field4450[var44]]);
                    }
                    if (arg3.field4450[var44] < class38.field395[var44].length) {
                        var11.method2307(class188.field2368[var44], class38.field395[var44][arg3.field4450[var44]]);
                    }
                }
            }
            if (class427.field6253 != null) {
                var11.method2267(var12);
                class427.field6253.method615((byte) -124, var29, var11);
            }
        }
        if (arg9 == null || var23 == null) {
            return var11;
        } else {
            class396 var45 = var11.method2297((byte) 1, var12, true);
            var45.method2474(var24, arg4 - 1, var23, 0, 65535, arg9.field2811, var20, var22, var21);
            return var45;
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
    public static final int method2225(int arg0) {
        int var1 = 59 % ((arg0 - 40) / 57);
        field5140++;
        return 15;
    }
}
