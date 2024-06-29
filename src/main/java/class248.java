import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class248 {

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public int field4411 = -1;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Z")
    public static boolean field4408 = false;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lhc;")
    public static class171 field4407 = new class171(100);

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "Lud;")
    public static class279 field4415 = class130.method1024("Verbindung mit Update)2Server)3)3)3", 255);

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "[Lud;")
    public static class279[] field4417 = new class279[100];

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Lhb;")
    public class35 field4410;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "[I")
    public int[] field4413;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "[Lud;")
    public class279[] field4404;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZII)Lul;", line = 7)
    public static final class43 method1775(boolean arg0, int arg1, int arg2) {
        field4412++;
        class43 var3 = (class43) class119.field2144.method2248(109);
        if (arg0) {
            return (class43) null;
        }
        while (var3 != null) {
            if (var3.field891 && var3.method366(115, arg2, arg1)) {
                return var3;
            }
            var3 = (class43) class119.field2144.method2240(1138);
        }
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Lt;", line = 30)
    public static final class251 method1776(int arg0) {
        field4406++;
        if (arg0 != -16211) {
            return (class251) null;
        }
        try {
            return (class251) Class.forName("ej").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class28();
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 48)
    public static final void method1777(int arg0) {
        field4414++;
        if (class8.field338 == -1 || class318.field5583 == -1 || arg0 != 3) {
            return;
        }
        int var1 = ((class101.field1893 - class102.field1906) * class215.field3783 >> 16) + class102.field1906;
        class215.field3783 += var1;
        float[] var2 = new float[3];
        if (class215.field3783 < 65535) {
            class35.field788 = false;
            class26.field637 = false;
        } else {
            class215.field3783 = 65535;
            if (class26.field637) {
                class35.field788 = false;
            } else {
                class35.field788 = true;
            }
            class26.field637 = true;
        }
        float var3 = (float) class215.field3783 / 65535.0F;
        int var4 = class130.field2361 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class91.field1717[class8.field338][var4][var5] * 3;
            int var7 = (class91.field1717[class8.field338][var4 + 2][var5] + class91.field1717[class8.field338][var4 + 2][var5] - class91.field1717[class8.field338][var4 + 3][var5]) * 3;
            int var8 = class91.field1717[class8.field338][var4][var5];
            int var9 = class91.field1717[class8.field338][var4 + 1][var5] * 3;
            int var10 = var6 + var7 - (var9 * 2);
            int var11 = var9 - var6;
            int var12 = class91.field1717[class8.field338][var4 + 2][var5] + var9 - var8 - var7;
            var2[var5] = (((float) var12 * var3 + (float) var10) * var3 + (float) var11) * var3 + (float) var8;
        }
        class92.field1747 = (int) var2[2] - (class12.field396 * 128);
        class21.field589 = (int) var2[0] - class112.field2058 * 128;
        class306.field5438 = (int) var2[1] * -1;
        int var13 = class287.field5127 * 2;
        float[] var14 = new float[3];
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class91.field1717[class318.field5583][var13][var15] * 3;
            int var17 = class91.field1717[class318.field5583][var13 + 1][var15] * 3;
            int var18 = (class91.field1717[class318.field5583][var13 + 2][var15] + class91.field1717[class318.field5583][var13 + 2][var15] - class91.field1717[class318.field5583][var13 + 3][var15]) * 3;
            int var19 = class91.field1717[class318.field5583][var13][var15];
            int var20 = var16 + var18 - var17 * 2;
            int var21 = var17 - var16;
            int var22 = class91.field1717[class318.field5583][var13 + 2][var15] + var17 - var19 - var18;
            var14[var15] = (((float) var22 * var3 + (float) var20) * var3 + (float) var21) * var3 + (float) var19;
        }
        float var23 = var14[0] - var2[0];
        float var24 = (var14[1] - var2[1]) * -1.0F;
        float var25 = var14[2] - var2[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class185.field3393 = (float) Math.atan2((double) var24, var26);
        class293.field5240 = -((float) Math.atan2((double) var23, (double) var25));
        class62.field1278 = (int) ((double) class185.field3393 * 325.949D) & 0x7FF;
        class5.field124 = (int) ((double) class293.field5240 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIILsf;JLsf;Lsf;)V", line = 165)
    public static final void method1778(int arg0, int arg1, int arg2, int arg3, class108 arg4, long arg5, class108 arg6, class108 arg7) {
        class153 var9 = new class153();
        var9.field2782 = arg4;
        var9.field2775 = arg1 * 128 + 64;
        var9.field2770 = arg2 * 128 + 64;
        var9.field2777 = arg3;
        var9.field2780 = arg5;
        var9.field2778 = arg6;
        var9.field2779 = arg7;
        int var10 = 0;
        class191 var11 = class24.field619[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3451; var12++) {
                class18 var13 = var11.field3455[var12];
                if ((var13.field546 & 0x400000L) == 4194304L) {
                    int var14 = var13.field563.method184();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2774 = -var10;
        if (class24.field619[arg0][arg1][arg2] == null) {
            class24.field619[arg0][arg1][arg2] = new class191(arg0, arg1, arg2);
        }
        class24.field619[arg0][arg1][arg2].field3442 = var9;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 213)
    public static final void method1779(byte arg0) {
        if (class307.field5444 != -1) {
            class212.method1561(class307.field5444, -1);
        }
        for (int var1 = 0; var1 < class14.field434; var1++) {
            if (class71.field1398[var1]) {
                class249.field4446[var1] = true;
            }
            class271.field4834[var1] = class71.field1398[var1];
            class71.field1398[var1] = false;
        }
        class11.field372 = class8.field279;
        class121.field2182 = null;
        if (class97.field1824) {
            class280.field5006 = true;
        }
        class126.field2341 = -1;
        class306.field5439 = -1;
        if (arg0 < 125) {
            return;
        }
        field4405++;
        if (class307.field5444 != -1) {
            class14.field434 = 0;
            class266.method1909(0);
        }
        if (class97.field1824) {
            class256.method1838();
        } else {
            class146.method1122();
        }
        class121.field2187 = 0;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V", line = 264)
    public static void method1780(int arg0) {
        field4417 = null;
        field4415 = null;
        int var1 = -13 % ((85 - arg0) / 32);
        field4407 = null;
    }
}
