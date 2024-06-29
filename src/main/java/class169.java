import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class169 extends class71 {

    @OriginalMember(owner = "client!wda", name = "n", descriptor = "[I")
    public int[] field2355 = new int[1];

    @OriginalMember(owner = "client!wda", name = "k", descriptor = "[I")
    public int[] field2352 = new int[] { -1 };

    @OriginalMember(owner = "client!wda", name = "j", descriptor = "[[I")
    public static int[][] field2351 = new int[6][];

    @OriginalMember(owner = "client!wda", name = "l", descriptor = "Lst;")
    public static class335 field2353 = new class335(6, -1);

    @OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!wda", name = "o", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!wda", name = "p", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!wda", name = "q", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIILpia;ZILha;Lwh;ZI)Lka;", line = 4)
    public final class284 method1082(int arg0, int arg1, int arg2, class57 arg3, boolean arg4, int arg5, class548 arg6, class41 arg7, boolean arg8, int arg9) {
        field2357++;
        class284 var11 = null;
        int var12 = arg2;
        class32 var13 = null;
        if (arg0 != -1) {
            var13 = class464.field6461.method557(arg0, (byte) 43);
        }
        int[] var14 = this.field2352;
        if (var13 != null && var13.field400 != null) {
            var14 = new int[var13.field400.length];
            for (int var15 = 0; var15 < var13.field400.length; var15++) {
                int var16 = var13.field400[var15];
                if (var16 >= 0 && var16 < this.field2352.length) {
                    var14[var15] = this.field2352[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class526 var24 = null;
        class526 var25 = null;
        if (arg3 != null) {
            var12 = arg2 | 0x20;
            int var26 = arg3.field821[arg5];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class607.field8188.method2996(var27, (byte) -121);
            if (var24 != null) {
                var18 |= var24.method3130(var21, -1);
                var17 |= var24.method3126(var21, true);
                var20 |= var24.method3127(var21, -122);
                var19 |= arg3.field823;
            }
            if ((arg3.field808 || class175.field2409) && arg1 != -1 && arg3.field821.length > arg1) {
                int var28 = arg3.field821[arg1];
                var23 = arg3.field813[arg5];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class607.field8188.method2996(var22 >>> 16, (byte) -126);
                }
                if (var25 != null) {
                    var18 |= var25.method3130(var22, -1);
                    var17 |= var25.method3126(var22, arg8);
                    var20 |= var25.method3127(var22, -104);
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
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method1086(arg4, (byte) 125, arg0, arg7 == null ? null : arg7.field515, var14);
        if (class34.field446 != null) {
            var11 = (class284) class34.field446.method3898((byte) -42, var30);
        }
        if (var11 == null || arg6.method1484(var11.method1703(), var12) != 0) {
            if (var11 != null) {
                var12 = arg6.method1390(var12, var11.method1703());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class291.field4179.method1313(var14[var34], true).method3785(true, arg4)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class133[] var35 = new class133[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class291.field4179.method1313(var14[var36], arg8).method3787(arg4, (byte) 14);
                }
            }
            if (var13 != null && var13.field403 != null) {
                for (int var37 = 0; var37 < var13.field403.length; var37++) {
                    if (var13.field403[var37] != null && var35[var37] != null) {
                        int var38 = var13.field403[var37][0];
                        int var39 = var13.field403[var37][1];
                        int var40 = var13.field403[var37][2];
                        int var41 = var13.field403[var37][3];
                        int var42 = var13.field403[var37][4];
                        int var43 = var13.field403[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method846((byte) 65, var43, var41, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method842(var39, 8137, var38, var40);
                        }
                    }
                }
            }
            if (arg7 != null) {
                var32 = var12 | 0x4000;
            }
            class133 var44 = new class133(var35, var35.length);
            var11 = arg6.method1463(var44, var32, class401.field5749, 64, 850);
            if (arg7 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class195.field2630.length; var46++) {
                        if (class195.field2630[var46][var45].length > arg7.field515[var45]) {
                            var11.method1660(class370.field5230[var46][var45], class195.field2630[var46][var45][arg7.field515[var45]]);
                        }
                    }
                }
            }
            if (class34.field446 != null) {
                var11.method1691(var12);
                class34.field446.method3899(42, var11, var30);
            }
        }
        if (arg3 == null || var24 == null) {
            return var11;
        } else {
            class284 var47 = var11.method1659((byte) 1, var12, arg8);
            var47.method1885(var24, 0, var25, -125, var21, var23, arg3.field823, var22, arg9 - 1);
            return var47;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILha;)V", line = 250)
    public static final void method1083(int arg0, class548 arg1) {
        field2356++;
        class601.field8141 = new class685[class96.field1322.length];
        for (int var2 = 0; var2 < class96.field1322.length; var2++) {
            int var3 = class96.field1322[var2];
            class179 var4 = class363.method2306(var3, class171.field2375, (byte) 114);
            class402 var5 = arg1.method1392(var4, class52.method384(class676.field9378, var3), true);
            class601.field8141[var2] = new class685(var5, var4);
        }
        if (arg0 != 21595) {
            field2351 = null;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIILcea;Lmfa;)V", line = 278)
    public static final void method1084(int arg0, int arg1, int arg2, class96 arg3, class409 arg4) {
        field2358++;
        if ((arg0 & 0x2) != 0) {
            int var5 = arg4.method506(-99);
            if (var5 == 65535) {
                var5 = -1;
            }
            arg3.field7122 = var5;
        }
        byte var6 = -1;
        if ((arg0 & 0x4) != 0) {
            int var7 = arg4.method466(106);
            byte[] var8 = new byte[var7];
            class63 var9 = new class63(var8);
            arg4.method502(108, 0, var7, var8);
            class318.field4426[arg2] = var9;
            arg3.method657(25, var9);
        }
        if ((arg0 & 0x40000) != 0) {
            arg3.field7157 = arg4.method503(true);
            arg3.field7104 = arg4.method504((byte) 68);
            arg3.field7163 = arg4.method491(false);
            arg3.field7145 = (byte) arg4.method466(80);
            arg3.field7154 = class483.field6741 + arg4.method506(-117);
            arg3.field7120 = class483.field6741 + arg4.method455(-122);
        }
        if ((arg0 & 0x10) != 0) {
            class346.field4924[arg2] = arg4.method503(true);
        }
        if ((arg0 & 0x20) != 0) {
            int var10 = arg4.method505((byte) -119);
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg4.method478(-121);
                    if (var15 == 32767) {
                        var15 = arg4.method478(-107);
                        var13 = arg4.method478(-87);
                        var12 = arg4.method478(-112);
                        var14 = arg4.method478(-109);
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg4.method478(-113);
                    }
                    int var16 = arg4.method478(-90);
                    int var17 = arg4.method466(84);
                    arg3.method3083(var12, class483.field6741, var15, var13, var17, var16, (byte) -27, var14);
                }
            }
        }
        if ((arg0 & 0x4000) != 0) {
            int var18 = arg4.method466(-106);
            int[] var19 = new int[var18];
            int[] var20 = new int[var18];
            int[] var21 = new int[var18];
            for (int var22 = 0; var22 < var18; var22++) {
                int var23 = arg4.method506(-112);
                if (var23 == 65535) {
                    var23 = -1;
                }
                var19[var22] = var23;
                var20[var22] = arg4.method498(-99);
                var21[var22] = arg4.method482(-772591672);
            }
            class521.method3105(8930, var21, var19, arg3, var20);
        }
        int var24 = -19 / ((arg1 - 34) / 62);
        if ((arg0 & 0x8000) != 0) {
            int var25 = arg4.method482(-772591672);
            int var26 = arg4.method457(-14532);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var27 = arg4.method466(101);
            int var28 = var27 & 0x7;
            int var29 = (var27 & 0x7D) >> 3;
            if (var29 == 15) {
                var29 = -1;
            }
            arg3.method3078(var28, var26, var29, var25, false, 1);
        }
        if ((arg0 & 0x1) != 0) {
            int var30 = arg4.method500((byte) -16);
            if (var30 == 65535) {
                var30 = -1;
            }
            int var31 = arg4.method469(-4040);
            int var32 = arg4.method505((byte) -119);
            int var33 = var32 & 0x7;
            int var34 = var32 >> 3 & 0xF;
            if (var34 == 15) {
                var34 = -1;
            }
            arg3.method3078(var33, var31, var34, var30, false, 0);
        }
        if ((arg0 & 0x10000) != 0) {
            int var35 = arg4.method498(-68);
            int[] var36 = new int[var35];
            int[] var37 = new int[var35];
            for (int var38 = 0; var38 < var35; var38++) {
                int var39 = arg4.method482(-772591672);
                if ((var39 & 0xC000) == 49152) {
                    int var40 = arg4.method500((byte) -4);
                    var36[var38] = class678.method3817(var40, var39 << 16);
                } else {
                    var36[var38] = var39;
                }
                var37[var38] = arg4.method482(-772591672);
            }
            arg3.method3077(var36, var37, 1);
        }
        if ((arg0 & 0x400) != 0) {
            var6 = arg4.method491(false);
        }
        if ((arg0 & 0x40) != 0) {
            arg3.field1326 = arg4.method455(-81);
            if (arg3.field7203 == 0) {
                arg3.method3086(arg3.field1326, 92);
                arg3.field1326 = -1;
            }
        }
        if ((arg0 & 0x800) != 0) {
            arg3.field1351 = arg4.method498(-51) == 1;
        }
        if ((arg0 & 0x2000) != 0) {
            arg3.field7162 = arg4.method479((byte) -28);
            if (arg3.field7162.charAt(0) == '~') {
                arg3.field7162 = arg3.field7162.substring(1);
                class476.method2904(arg3.field7162, arg3.method658(-127, false), arg3.field1347, arg3.method661(true, (byte) -98), 2, -1, 0);
            } else if (class388.field5601 == arg3) {
                class476.method2904(arg3.field7162, arg3.method658(83, false), arg3.field1347, arg3.method661(true, (byte) -74), 2, -1, 0);
            }
            arg3.field7106 = 0;
            arg3.field7110 = 0;
            arg3.field7124 = 150;
        }
        if ((arg0 & 0x80) != 0) {
            int[] var41 = new int[4];
            for (int var42 = 0; var42 < 4; var42++) {
                var41[var42] = arg4.method500((byte) 126);
                if (var41[var42] == 65535) {
                    var41[var42] = -1;
                }
            }
            int var43 = arg4.method505((byte) -119);
            class43.method237(arg3, (byte) -87, var43, var41);
        }
        if ((arg0 & 0x200) != 0) {
            int var44 = arg4.method506(-106);
            arg3.field7160 = arg4.method505((byte) -119);
            arg3.field7161 = arg4.method498(-121);
            arg3.field7174 = (var44 & 0x8000) != 0;
            arg3.field7144 = var44 & 0x7FFF;
            arg3.field7102 = class483.field6741 + arg3.field7160 + arg3.field7144;
        }
        if ((arg0 & 0x20000) != 0) {
            int var45 = arg4.method506(-103);
            if (var45 == 65535) {
                var45 = -1;
            }
            int var46 = arg4.method457(-14532);
            int var47 = arg4.method498(-85);
            int var48 = var47 & 0x7;
            int var49 = (var47 & 0x7F) >> 3;
            if (var49 == 15) {
                var49 = -1;
            }
            arg3.method3078(var48, var46, var49, var45, false, 2);
        }
        if ((arg0 & 0x100) != 0) {
            arg3.field7129 = arg4.method491(false);
            arg3.field7140 = arg4.method504((byte) 108);
            arg3.field7175 = arg4.method503(true);
            arg3.field7119 = arg4.method491(false);
            arg3.field7107 = arg4.method455(-102) + class483.field6741;
            arg3.field7173 = arg4.method455(-111) + class483.field6741;
            arg3.field7101 = arg4.method498(-45);
            if (arg3.field1354) {
                arg3.field7140 += arg3.field1320;
                arg3.field7175 += arg3.field1362;
                arg3.field7203 = 0;
                arg3.field7119 += arg3.field1320;
                arg3.field7129 += arg3.field1362;
            } else {
                arg3.field7129 += arg3.field7197[0];
                arg3.field7119 += arg3.field7198[0];
                arg3.field7175 += arg3.field7197[0];
                arg3.field7203 = 1;
                arg3.field7140 += arg3.field7198[0];
            }
            arg3.field7199 = 0;
        }
        if (!arg3.field1354) {
            return;
        }
        if (var6 == 127) {
            arg3.method650(arg3.field1362, arg3.field1320, -127);
            return;
        }
        byte var50;
        if (var6 == -1) {
            var50 = class346.field4924[arg2];
        } else {
            var50 = var6;
        }
        class728.method4062(arg3, var50, (byte) 67);
        arg3.method652((byte) -90, arg3.field1362, var50, arg3.field1320);
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)V", line = 648)
    public static void method1085(int arg0) {
        field2353 = null;
        int var1 = -5 / ((arg0 + 3) / 32);
        field2351 = null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZBI[I[I)J", line = 667)
    private final long method1086(boolean arg0, byte arg1, int arg2, int[] arg3, int[] arg4) {
        field2354++;
        long[] var6 = class264.field3865;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) ((var9 ^ (long) arg2) & 0xFFL)];
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg4[var13] >> 24)) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg4[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg4[var13] >> 8)) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg4[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg1 <= 103) {
            this.field2355 = null;
        }
        if (arg3 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg3[var14]) & 0xFFL)];
            }
        }
        return var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }
}
