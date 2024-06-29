import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class303 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field4832 = 0;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field4829 = 0;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field4834 = 0;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4833 = "Loaded input handler";

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field4838 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[[[B")
    public static byte[][][] field4830;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V", line = 4)
    public static final void method2152() {
        GL var0 = class162.field2654;
        var0.glDisableClientState(32886);
        class162.method1205(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class162.method1196();
        for (int var1 = 0; var1 < class12.field267[0].length; var1++) {
            class256 var2 = class12.field267[0][var1];
            if (var2.field3792 >= 0 && class12.method170((byte) -35, class40.field614.method257(var2.field3792, 255))) {
                var0.glColor4fv(class301.method2130(16743834, var2.field3786), 0);
                float var3 = 201.5F - (var2.field3785 ? 1.0F : 0.5F);
                var2.method1769(class34.field521, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class162.method1199();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class162.method1203();
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V", line = 37)
    public static final void method2153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class3.field80 = arg5;
        class306.field4863 = arg0;
        class176.field2812 = arg2;
        field4835++;
        class294.field4620 = arg4;
        class241.field3610 = arg3;
        if (class294.field4620 >= 100) {
            int var6 = class176.field2812 * 128 + 64;
            int var7 = class3.field80 * 128 + 64;
            int var8 = class170.method1265(var6, var7, class75.field1153, 1) - class306.field4863;
            int var9 = var6 - class152.field2498;
            int var10 = var8 - class332.field5180;
            int var11 = var7 - class137.field2239;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class43.field683 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class64.field943 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 0x7FF;
            if (class43.field683 < 128) {
                class43.field683 = 128;
            }
            if (class43.field683 > 383) {
                class43.field683 = 383;
            }
        }
        if (arg1 != 1) {
            method2153(-65, -26, 37, 24, -38, 24);
        }
        class73.field1112 = 2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpk;IZI)Lwk;", line = 83)
    public static final class186 method2154(class120 arg0, int arg1, boolean arg2, int arg3) {
        field4837++;
        if (class107.method854(arg0, arg3, arg1, (byte) 99)) {
            return arg2 ? (class186) null : class131.method1014(1567682540);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 111)
    public static final void method2155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4828++;
        for (int var6 = arg5; var6 <= (arg4 + arg5); var6++) {
            for (int var7 = arg0; var7 <= (arg0 + arg3); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class253.field3745[arg1][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg5; var8 < (arg4 + arg5); var8++) {
            for (int var9 = arg0; var9 < arg0 + arg3; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class85.field1374[arg1][var9][var8] = arg1 <= 0 ? 0 : class85.field1374[arg1 - 1][var9][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var10 = arg5 + 1; var10 < (arg4 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class85.field1374[arg1][arg0][var10] = class85.field1374[arg1][arg0 - 1][var10];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var11 = arg0 + 1; var11 < arg0 + arg3; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class85.field1374[arg1][var11][arg5] = class85.field1374[arg1][var11][arg5 - 1];
                }
            }
        }
        if (arg2 <= 8) {
            method2155(-120, 76, 38, 103, 113, 12);
        }
        if (arg0 < 0 || arg5 < 0 || arg0 >= 104 || arg5 >= 104) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 > 0 && class85.field1374[arg1][arg0 - 1][arg5] != 0) {
                class85.field1374[arg1][arg0][arg5] = class85.field1374[arg1][arg0 - 1][arg5];
            } else if (arg5 > 0 && class85.field1374[arg1][arg0][arg5 - 1] != 0) {
                class85.field1374[arg1][arg0][arg5] = class85.field1374[arg1][arg0][arg5 - 1];
            } else if (arg0 > 0 && arg5 > 0 && class85.field1374[arg1][arg0 - 1][arg5 - 1] != 0) {
                class85.field1374[arg1][arg0][arg5] = class85.field1374[arg1][arg0 - 1][arg5 - 1];
            }
        } else if (arg0 > 0 && class85.field1374[arg1 - 1][arg0 - 1][arg5] != class85.field1374[arg1][arg0 - 1][arg5]) {
            class85.field1374[arg1][arg0][arg5] = class85.field1374[arg1][arg0 - 1][arg5];
        } else if (arg5 > 0 && class85.field1374[arg1 - 1][arg0][arg5 - 1] != class85.field1374[arg1][arg0][arg5 - 1]) {
            class85.field1374[arg1][arg0][arg5] = class85.field1374[arg1][arg0][arg5 - 1];
        } else if (arg0 > 0 && arg5 > 0 && class85.field1374[arg1][arg0 - 1][arg5 - 1] != class85.field1374[arg1 - 1][arg0 - 1][arg5 - 1]) {
            class85.field1374[arg1][arg0][arg5] = class85.field1374[arg1][arg0 - 1][arg5 - 1];
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZJ)V", line = 236)
    public static final void method2156(boolean arg0, long arg1) {
        field4836++;
        if (!arg0) {
            try {
                Thread.sleep(arg1);
            } catch (InterruptedException var4) {
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILtk;I)V", line = 250)
    public static final void method2157(int arg0, int arg1, class266 arg2, int arg3) {
        field4831++;
        if (~arg2.field4011 == arg1) {
            arg2.field4099 = arg2.field4012;
        } else if (arg2.field4011 == 1) {
            arg2.field4099 = (arg0 - arg2.field3941) / 2 + arg2.field4012;
        } else if (arg2.field4011 == 2) {
            arg2.field4099 = arg0 - arg2.field3941 - arg2.field4012;
        } else if (arg2.field4011 == 3) {
            arg2.field4099 = arg2.field4012 * arg0 >> 14;
        } else if (arg2.field4011 == 4) {
            arg2.field4099 = (arg2.field4012 * arg0 >> 14) + (arg0 - arg2.field3941) / 2;
        } else {
            arg2.field4099 = arg0 - (arg2.field4012 * arg0 >> 14) - arg2.field3941;
        }
        if (arg2.field4103 == 0) {
            arg2.field4087 = arg2.field4036;
        } else if (arg2.field4103 == 1) {
            arg2.field4087 = (arg3 - arg2.field3939) / 2 + arg2.field4036;
        } else if (arg2.field4103 == 2) {
            arg2.field4087 = arg3 - arg2.field4036 - arg2.field3939;
        } else if (arg2.field4103 == 3) {
            arg2.field4087 = arg2.field4036 * arg3 >> 14;
        } else if (arg2.field4103 == 4) {
            arg2.field4087 = (arg3 - arg2.field3939) / 2 + (arg2.field4036 * arg3 >> 14);
        } else {
            arg2.field4087 = arg3 - (arg2.field4036 * arg3 >> 14) - arg2.field3939;
        }
        if (!class320.field5011 || !(client.method1867(arg2).field3822 != 0 || arg2.field4084 == 0)) {
            return;
        }
        if (arg2.field4099 < 0) {
            arg2.field4099 = 0;
        } else if (arg0 < arg2.field4099 + arg2.field3941) {
            arg2.field4099 = arg0 - arg2.field3941;
        }
        if (arg2.field4087 < 0) {
            arg2.field4087 = 0;
        } else if ((arg2.field4087 + arg2.field3939) > arg3) {
            arg2.field4087 = arg3 - arg2.field3939;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 330)
    public static void method2158(int arg0) {
        field4830 = (byte[][][]) null;
        if (arg0 != -1) {
            field4838 = 103;
        }
        field4833 = null;
    }
}
