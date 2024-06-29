import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class64 extends class276 {

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "[I")
    public static int[] field1109 = new int[32];

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Lwa;")
    public static class75 field1116 = class66.method560(" )2>", false);

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Llb;")
    public static class199 field1112;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)V", line = 11)
    public static void method548(byte arg0) {
        field1109 = null;
        if (arg0 < 7) {
            field1112 = (class199) null;
        }
        field1112 = null;
        field1116 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILcl;)V", line = 30)
    public static final void method549(int arg0, class124 arg1) {
        field1115++;
        class58 var2 = null;
        try {
            if (arg0 != 0) {
                field1112 = (class199) null;
            }
            class77 var3 = arg1.method935("runescape", true);
            while (var3.field1330 == 0) {
                class235.method1708(61, 1L);
            }
            if (var3.field1330 == 1) {
                var2 = (class58) var3.field1329;
                class60 var4 = class178.method1309(arg0 + 3);
                var2.method468(0, arg0 + 127, var4.field1012, var4.field997);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method465(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIJI)Z", line = 69)
    public static final boolean method550(int arg0, int arg1, long arg2, int arg3) {
        field1111++;
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = ((int) arg2 & 0x3B1A1B) >> 20;
        if (arg3 != -6980) {
            field1116 = (class75) null;
        }
        int var7 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class108 var8 = class3.method14((byte) 83, var7);
            int var9 = var8.field1858;
            int var10;
            int var11;
            if (var6 == 0 || var6 == 2) {
                var11 = var8.field1837;
                var10 = var8.field1856;
            } else {
                var10 = var8.field1837;
                var11 = var8.field1856;
            }
            if (var6 != 0) {
                var9 = (var9 << var6 & 0xF) + (var9 >> 4 - var6);
            }
            class112.method870(0, class279.field4831.field3236[0], (byte) 114, var11, true, 0, 2, var10, arg1, var9, class279.field4831.field3205[0], arg0);
        } else {
            class112.method870(var5 + 1, class279.field4831.field3236[0], (byte) 111, 0, true, var6, 2, 0, arg1, 0, class279.field4831.field3205[0], arg0);
        }
        class213.field3624 = class39.field595;
        class89.field1468 = 0;
        class213.field3625 = class271.field4685;
        class99.field1642 = 2;
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILre;)V", line = 121)
    public static final void method551(int arg0, int arg1, int arg2, int arg3, class262 arg4) {
        field1110++;
        if (arg2 != -17679) {
            field1116 = (class75) null;
        }
        class222.method1638(arg3, arg1, arg3 + arg4.field4531, arg4.field4517 + arg1);
        if (class217.field3718 < 3) {
            ((class277) class94.field1526).method1970(arg3, arg1, arg4.field4531, arg4.field4517, class94.field1526.field4318 / 2, class94.field1526.field4320 / 2, class290.field4981, 256, (class277) arg4.method1868(false, false));
        } else {
            class258 var5 = arg4.method1868(false, false);
            if (var5 != null) {
                var5.method157(arg3, arg1);
            }
        }
        class219.field3743[arg0] = true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILbg;[IILsa;I[[F[[F[[FI[[I)V", line = 155)
    public static final void method552(int arg0, class192 arg1, int[] arg2, int arg3, class102 arg4, int arg5, float[][] arg6, float[][] arg7, float[][] arg8, int arg9, int[][] arg10) {
        field1113++;
        int[] var11 = new int[arg2.length / 2];
        for (int var12 = 0; var12 < var11.length; var12++) {
            int var13 = arg2[var12 + var12];
            int var14 = arg2[var12 + var12 + 1];
            if (arg0 == 1) {
                int var15 = var13;
                var13 = var14;
                var14 = 128 - var15;
            } else if (arg0 == 2) {
                var14 = 128 - var14;
                var13 = 128 - var13;
            } else if (arg0 == 3) {
                int var16 = var13;
                var13 = 128 - var14;
                var14 = var16;
            }
            float var17;
            float var18;
            float var19;
            if (var13 == 0 && var14 == 0) {
                var17 = arg8[arg9][arg3];
                var18 = arg7[arg9][arg3];
                var19 = arg6[arg9][arg3];
            } else if (var13 == 128 && var14 == 0) {
                var18 = arg7[arg9 + 1][arg3];
                var19 = arg6[arg9 + 1][arg3];
                var17 = arg8[arg9 + 1][arg3];
            } else if (var13 == 128 && var14 == 128) {
                var18 = arg7[arg9 + 1][arg3 + 1];
                var19 = arg6[arg9 + 1][arg3 + 1];
                var17 = arg8[arg9 + 1][arg3 + 1];
            } else if (var13 == 0 && var14 == 128) {
                var18 = arg7[arg9][arg3 + 1];
                var19 = arg6[arg9][arg3 + 1];
                var17 = arg8[arg9][arg3 + 1];
            } else {
                float var20 = arg6[arg9][arg3];
                float var21 = arg8[arg9][arg3];
                float var22 = arg7[arg9][arg3];
                float var23 = (float) var13 / 128.0F;
                float var24 = (arg7[arg9 + 1][arg3] - var22) * var23 + var22;
                float var25 = (arg8[arg9 + 1][arg3] - var21) * var23 + var21;
                float var26 = (arg6[arg9 + 1][arg3] - var20) * var23 + var20;
                float var27 = (float) var14 / 128.0F;
                float var28 = arg6[arg9][arg3 + 1];
                float var29 = (arg6[arg9 + 1][arg3 + 1] - var28) * var23 + var28;
                var19 = (var29 - var26) * var27 + var26;
                float var30 = arg7[arg9][arg3 + 1];
                float var31 = arg8[arg9][arg3 + 1];
                float var32 = (arg7[arg9 + 1][arg3 + 1] - var30) * var23 + var30;
                var18 = (var32 - var24) * var27 + var24;
                float var33 = (arg8[arg9 + 1][arg3 + 1] - var31) * var23 + var31;
                var17 = (var33 - var25) * var27 + var25;
            }
            int var34 = (arg9 << 7) + var13;
            int var35 = class121.method918(var14, arg3, arg10, var13, 22056, arg9);
            int var36 = (arg3 << 7) + var14;
            var11[var12] = arg1.method1449(arg4, var34, var35, var36, var19, var18, var17);
        }
        if (arg5 == 128) {
            arg1.method1447(var11);
        }
    }
}
