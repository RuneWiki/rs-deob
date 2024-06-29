import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class24 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lck;")
    public static class119 field368 = class298.method1987((byte) 57, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lck;")
    public static class119 field366 = class298.method1987((byte) 51, "gm");

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lck;")
    public static class119 field367 = class298.method1987((byte) 30, "Mem:");

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lck;")
    public static class119 field370 = class298.method1987((byte) 85, "bear lake b");

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[[Lib;")
    public static class145[][] field364;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILck;ILck;Lck;I)V", line = 7)
    public static final void method184(int arg0, class119 arg1, int arg2, class119 arg3, class119 arg4, int arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class230.field3725[var6] = class230.field3725[var6 - 1];
            class109.field1673[var6] = class109.field1673[var6 - 1];
            class162.field2567[var6] = class162.field2567[var6 - 1];
            class20.field271[var6] = class20.field271[var6 - 1];
            class118.field1776[var6] = class118.field1776[var6 - 1];
        }
        field365++;
        class230.field3725[0] = arg2;
        class296.field4920 = class94.field1456;
        class177.field2837++;
        class118.field1776[0] = arg5;
        class109.field1673[0] = arg3;
        if (arg0 < 118) {
            field368 = (class119) null;
        }
        class162.field2567[0] = arg1;
        class20.field271[0] = arg4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[Lnc;[BIZII)V", line = 57)
    public static final void method185(int arg0, int arg1, class266[] arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field371++;
        byte var8;
        if (arg5) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg5) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg4 + var11 > 0 && arg4 + var11 < 103) {
                            arg2[var9].field4356[arg1 + var10][arg4 + var11] = class19.method151(arg2[var9].field4356[arg1 + var10][arg4 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class3 var12 = new class3(arg3);
        if (arg7 != 64) {
            return;
        }
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class100.method668(arg1 + var14, var12, arg6, var13, arg4 + var15, arg7 ^ 0x1, arg0, arg5, 0);
                }
            }
        }
        if (arg5) {
            return;
        }
        class176 var16 = null;
        while (true) {
            while (var12.field101.length > var12.field44) {
                int var17 = var12.method64((byte) -127);
                if (var17 == 0) {
                    var16 = new class176(var12);
                } else if (var17 == 1) {
                    int var18 = var12.method64((byte) -89);
                    if (var18 > 0) {
                        for (int var19 = 0; var19 < var18; var19++) {
                            class243 var20 = new class243(var12);
                            var20.field3906 += arg4 << 7;
                            var20.field3929 += arg1 << 7;
                            int var21 = var20.field3906 >> 7;
                            int var22 = var20.field3929 >> 7;
                            if (var22 >= 0 && var21 >= 0 && var22 < 104 && var21 < 104) {
                                var20.field3903 = class57.field926[var20.field3928][var22][var21] - var20.field3903;
                                class125.method835(var20);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var16 == null) {
                var16 = new class176();
            }
            for (int var23 = 0; var23 < 8; var23++) {
                for (int var24 = 0; var24 < 8; var24++) {
                    int var25 = (arg4 >> 3) + var24;
                    int var26 = (arg1 >> 3) + var23;
                    if (var26 >= 0 && var26 < 13 && var25 >= 0 && var25 < 13) {
                        class198.field3165[var26][var25] = var16;
                    }
                }
            }
            break;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 226)
    public static void method186(int arg0) {
        field364 = (class145[][]) null;
        field367 = null;
        field370 = null;
        if (arg0 == 104) {
            field368 = null;
            field366 = null;
        }
    }
}
