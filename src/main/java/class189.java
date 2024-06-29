import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class189 {

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Lkfa;")
    public static class549 field2297 = new class549(60, 6);

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static void method1096(int arg0) {
        field2297 = null;
        if (arg0 != 0) {
            method1100((byte) -42, 107);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Loa;ILep;IZ)V")
    public static final void method1097(class635 arg0, int arg1, class382 arg2, int arg3, boolean arg4) {
        field2294++;
        class213 var5 = arg2.method2091((byte) -83, arg0);
        if (var5 == null) {
            return;
        }
        if (arg4) {
            field2297 = null;
        }
        arg0.method314(arg1, arg3, arg1 + arg2.field5035, arg3 - -arg2.field4958);
        if (class550.field7847 == 2 || class550.field7847 == 5 || class126.field1430 == null) {
            arg0.method328(-16777216, var5, arg1, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class5.field41 == 4) {
            var7 = (int) (-class90.field1041) & 0x3FFF;
            var8 = class437.field6085;
            var6 = 4096;
            var9 = class638.field9053;
        } else {
            var6 = 4096 - (class599.field8520 * 16);
            var7 = (int) (-class90.field1041) + class628.field8908 & 0x3FFF;
            var8 = class377.field4914.field4647;
            var9 = class377.field4914.field4641;
        }
        int var10 = var9 / 128 + 48 + 208 - (class399.field5338 * 2);
        int var11 = (class349.field4567 * 4) + 48 + 208 - (class349.field4567 * 2) - var8 / 128;
        class126.field1430.method2615((float) arg2.field5035 / 2.0F + (float) arg1, (float) arg2.field4958 / 2.0F + (float) arg3, (float) var10, (float) var11, var6, var7 << 2, var5, arg1, arg3);
        for (class337 var12 = (class337) class418.field5555.method3174((byte) 49); var12 != null; var12 = (class337) class418.field5555.method3168(arg4)) {
            int var58 = var12.field4415;
            int var59 = ((class65.field691.field139[var58] & 0xFFFCD73) >> 14) - class682.field9685;
            int var60 = (class65.field691.field139[var58] & 0x3FFF) - class146.field1642;
            int var61 = var59 * 4 + 2 - (var9 / 128);
            int var62 = var60 * 4 + 2 - (var8 / 128);
            class289.method1635(arg3, arg0, arg1, var61, var5, arg2, class65.field691.field138[var58], var62, false);
        }
        for (int var13 = 0; var13 < class349.field4549; var13++) {
            int var55 = class120.field1361[var13] * 4 + 2 - var9 / 128;
            int var56 = class132.field1473[var13] * 4 + 2 - (var8 / 128);
            class335 var57 = class195.field2339.method3729(class653.field9332[var13], (byte) 109);
            if (var57.field4342 != null) {
                var57 = var57.method1889(1, class491.field7127);
                if (var57 == null || var57.field4364 == -1) {
                    continue;
                }
            }
            class289.method1635(arg3, arg0, arg1, var55, var5, arg2, var57.field4364, var56, arg4);
        }
        for (class43 var14 = (class43) class152.field1725.method3232(-1); var14 != null; var14 = (class43) class152.field1725.method3236(-27646)) {
            int var50 = (int) (var14.field3405 >> 28 & 0x3L);
            if (class644.field9114 == var50) {
                int var51 = (int) (var14.field3405 & 0x3FFFL) - class682.field9685;
                int var52 = (int) (var14.field3405 >> 14 & 0x3FFFL) - class146.field1642;
                int var53 = var51 * 4 + 2 - (var9 / 128);
                int var54 = var52 * 4 + 2 - (var8 / 128);
                class406.method2206(class13.field121[0], arg3, arg1, var5, var54, 16383, var53, arg2);
            }
        }
        for (int var15 = 0; var15 < class118.field1356; var15++) {
            class443 var45 = (class443) class392.field5223.method3234((byte) -99, (long) class664.field9449[var15]);
            if (var45 != null) {
                class625 var46 = var45.field6107;
                if (var46.method3503(false) && class377.field4914.field4638 == var46.field4638) {
                    class23 var47 = var46.field8855;
                    if (var47 != null && var47.field229 != null) {
                        var47 = var47.method108(0, class491.field7127);
                    }
                    if (var47 != null && var47.field268 && var47.field212) {
                        int var48 = var46.field4641 / 128 - (var9 / 128);
                        int var49 = var46.field4647 / 128 - (var8 / 128);
                        if (var47.field272 == -1) {
                            class406.method2206(class13.field121[1], arg3, arg1, var5, var49, 16383, var48, arg2);
                        } else {
                            class289.method1635(arg3, arg0, arg1, var48, var5, arg2, var47.field272, var49, false);
                        }
                    }
                }
            }
        }
        int var16 = class11.field111;
        int[] var17 = class79.field827;
        for (int var18 = 0; var18 < var16; var18++) {
            class455 var37 = class362.field4726[var17[var18]];
            if (var37 != null && var37.method2592(false) && class377.field4914 != var37 && class377.field4914.field4638 == var37.field4638) {
                int var38 = var37.field4641 / 128 - (var9 / 128);
                int var39 = var37.field4647 / 128 - var8 / 128;
                boolean var40 = false;
                for (int var41 = 0; var41 < class210.field2549; var41++) {
                    if (var37.field6324.equals(class314.field4077[var41]) && class270.field3396[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class525.field7506; var43++) {
                    if (var37.field6324.equals(class37.field414[var43].field7750)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class377.field4914.field6340 != 0 && var37.field6340 != 0 && class377.field4914.field6340 == var37.field6340) {
                    var44 = true;
                }
                if (var37.field6315) {
                    class406.method2206(class13.field121[6], arg3, arg1, var5, var39, 16383, var38, arg2);
                } else if (var40) {
                    class406.method2206(class13.field121[3], arg3, arg1, var5, var39, 16383, var38, arg2);
                } else if (var42) {
                    class406.method2206(class13.field121[5], arg3, arg1, var5, var39, 16383, var38, arg2);
                } else if (var44) {
                    class406.method2206(class13.field121[4], arg3, arg1, var5, var39, 16383, var38, arg2);
                } else {
                    class406.method2206(class13.field121[2], arg3, arg1, var5, var39, 16383, var38, arg2);
                }
            }
        }
        class492[] var19 = class81.field863;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class492 var23 = var19[var20];
            if (var23 != null && var23.field7141 != 0 && class469.field6549 % 20 < 10) {
                if (var23.field7141 == 1) {
                    class443 var24 = (class443) class392.field5223.method3234((byte) -63, (long) var23.field7134);
                    if (var24 != null) {
                        class625 var25 = var24.field6107;
                        int var26 = var25.field4641 / 128 - var9 / 128;
                        int var27 = var25.field4647 / 128 - var8 / 128;
                        class523.method2989(var5, var27, arg2, arg3, 360000L, arg4, arg1, var23.field7135, var26);
                    }
                }
                if (var23.field7141 == 2) {
                    int var28 = var23.field7139 / 128 - (var9 / 128);
                    int var29 = var23.field7144 / 128 - var8 / 128;
                    long var30 = (long) (var23.field7137 << 7);
                    long var32 = var30 * var30;
                    class523.method2989(var5, var29, arg2, arg3, var32, false, arg1, var23.field7135, var28);
                }
                if (var23.field7141 == 10 && var23.field7134 >= 0 && class362.field4726.length > var23.field7134) {
                    class455 var34 = class362.field4726[var23.field7134];
                    if (var34 != null) {
                        int var35 = var34.field4641 / 128 - (var9 / 128);
                        int var36 = var34.field4647 / 128 - (var8 / 128);
                        class523.method2989(var5, var36, arg2, arg3, 360000L, false, arg1, var23.field7135, var35);
                    }
                }
            }
        }
        if (class5.field41 == 4) {
            return;
        }
        if (class377.field4897 != 0) {
            int var21 = class377.field4897 * 4 + ((class377.field4914.method1656(true) - 1) * 2) + 2 - var9 / 128;
            int var22 = class319.field4130 * 4 + ((class377.field4914.method1656(!arg4) + -1) * 2) + 2 - (var8 / 128);
            class406.method2206(class157.field1766[class607.field8573 ? 1 : 0], arg3, arg1, var5, var22, 16383, var21, arg2);
        }
        arg0.method3552(3, 3, 7, -1, arg2.field4958 / 2 + arg3 - 1, arg2.field5035 / 2 + arg1 + -1);
        return;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILjo;)Lqda;")
    public static final class90 method1098(int arg0, int arg1, int arg2, class303 arg3) {
        field2298++;
        if (arg2 != 1) {
            field2297 = null;
        }
        byte[] var4 = arg3.method1719(arg1, arg0, 4);
        return var4 == null ? null : new class90(var4);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)I")
    public static final int method1099(int arg0) {
        if (arg0 > -116) {
            return -121;
        } else {
            field2296++;
            return class220.field2666;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I")
    public static final int method1100(byte arg0, int arg1) {
        field2295++;
        if (arg0 != 72) {
            field2297 = null;
        }
        return (arg1 & 0x3F9E5) >> 11;
    }
}
