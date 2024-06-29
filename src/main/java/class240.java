import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class240 {

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
    public static int[] field4268 = new int[2000];

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lwf;")
    public static class16 field4266 = new class16(30);

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lha;")
    public static class46 field4274 = class271.method1828("Lade Wordpack )2 ", -46);

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Lha;")
    public static class46 field4276 = class271.method1828("Verbindung abgebrochen)3", -46);

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lha;")
    public static class46 field4272 = class271.method1828("Clientscript error )2 check log for details", -46);

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lha;")
    public static class46 field4275 = class271.method1828("", -46);

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lhi;")
    public static class24 field4277 = null;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Z")
    public static boolean field4278 = false;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[S")
    public static short[] field4279 = new short[256];

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[Lrk;")
    public static class179[] field4273;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1648(boolean arg0, int arg1) {
        field4265++;
        if (!arg0) {
            field4266 = null;
        }
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method1649(byte arg0) {
        field4277 = null;
        int var1 = -22 % (arg0 / 33);
        field4274 = null;
        field4266 = null;
        field4279 = null;
        field4272 = null;
        field4275 = null;
        field4276 = null;
        field4268 = null;
        field4273 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BJ)V")
    public static final void method1650(byte arg0, long arg1) {
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        if (arg0 <= 62) {
            method1649((byte) 53);
        }
        field4269++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)I")
    public static final int method1651(byte arg0, int arg1) {
        int var2 = arg1 * 6 - 61440;
        int var3 = -56 % ((37 - arg0) / 44);
        field4270++;
        int var4 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var5 = (arg1 * var2 >> 12) + 40960;
        return var4 * var5 >> 12;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public static final void method1652(int arg0, int arg1, int arg2) {
        class146 var3 = class6.method22((byte) 16, 7, arg2);
        field4271++;
        var3.method1088(arg0 ^ 0xFFFFD459);
        if (arg0 != -249) {
            field4279 = null;
        }
        var3.field2640 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
    public static final void method1653(int arg0, int arg1, int arg2) {
        if (class252.field4442 > 0) {
            class190.method1374(class252.field4442, -1);
            class252.field4442 = 0;
        }
        field4267++;
        if (arg0 != -28053) {
            method1648(true, 52);
        }
        int var3 = 0;
        int var4 = class262.field4561 * arg2;
        short var5 = 256;
        int var6 = 0;
        for (int var7 = 1; var7 < var5 - 1; var7++) {
            int var8 = (var5 - var7) * class111.field2099[var7] / var5;
            if (var8 < 0) {
                var8 = 0;
            }
            var3 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class262.field4564[var4++ + arg1];
                int var12 = class158.field2808[var3++];
                if (var12 == 0) {
                    class32.field603.field277[var6++] = var11;
                } else {
                    int var13 = 256 - var12 - 18;
                    int var14 = var12 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var15 = class120.field2256[var12];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class32.field603.field277[var6++] = class50.method369(-16711936, class50.method369(16711935, var15) * var14 + (class50.method369(16711935, var11) * var13)) + class50.method369(16711680, var13 * class50.method369(65280, var11) + class50.method369(var15, 65280) * var14) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class32.field603.field277[var6++] = class262.field4564[arg1 + var4++];
            }
            var4 += class262.field4561 - 128;
        }
        class32.field603.method127(arg1, arg2);
    }
}
