import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class122 {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lsg;")
    public static class30 field2392 = class167.method1221((byte) 33, ":");

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Lsg;")
    public static class30 field2401 = class167.method1221((byte) 33, "Schlie-8en");

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Lsg;")
    private static class30 field2404 = class167.method1221((byte) 33, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lsg;")
    public static class30 field2396 = field2404;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field2413 = 0;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public int field2399;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public int field2406;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Z")
    public static boolean field2394;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "[B")
    public byte[] field2410;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "[B")
    public byte[] field2411;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Lpj;")
    public static final class152 method929(int arg0) {
        field2412++;
        int var1 = class62.field1329[0] * class2.field33[0];
        int[] var2 = new int[var1];
        byte[] var3 = class222.field3992[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class191.field3475[class68.method612(255, var3[var4])];
        }
        class152 var5 = new class152(class190.field3464, class273.field4774, class142.field2752[0], class37.field895[arg0], class62.field1329[0], class2.field33[0], var2);
        class175.method1285((byte) 53);
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLaa;)Lvf;")
    public static final class259 method930(byte arg0, class8 arg1) {
        field2397++;
        arg1.method63((byte) 82);
        int var2 = arg1.method63((byte) 74);
        class259 var3 = class265.method1821(var2, true);
        var3.field4578 = arg1.method63((byte) 84);
        int var4 = arg1.method63((byte) 94);
        if (arg0 != 113) {
            method932(121);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method63((byte) 57);
            var3.method4(var6, arg0 - 1586849221, arg1);
        }
        var3.method11(42);
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBI)Ldl;")
    public static final class31 method931(int arg0, byte arg1, int arg2) {
        class31 var3 = class272.method1858(arg2, 65535);
        field2408++;
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field732 == null || arg0 >= var3.field732.length) {
            return null;
        } else {
            if (arg1 < 118) {
                field2394 = false;
            }
            return var3.field732[arg0];
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static void method932(int arg0) {
        field2404 = null;
        field2392 = null;
        field2401 = null;
        if (arg0 < 4) {
            method934(-9, 124, -46, -2, 99, 57, -52, 119);
        }
        field2396 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public static final void method933(boolean arg0) {
        field2409++;
        if (arg0) {
            return;
        }
        for (class91 var1 = (class91) class167.field3084.method478(0); var1 != null; var1 = (class91) class167.field3084.method476((byte) 13)) {
            if (var1.field1830) {
                var1.method740((byte) -40);
            }
        }
        for (class91 var2 = (class91) class239.field4254.method478(0); var2 != null; var2 = (class91) class239.field4254.method476((byte) 13)) {
            if (var2.field1830) {
                var2.method740((byte) -40);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2393++;
        if (arg1 < 128 || arg7 < 128 || arg1 > 13056 || arg7 > 13056) {
            class256.field4511 = -1;
            class238.field4245 = -1;
            return;
        }
        int var8 = class31.method303(arg1, arg7, class159.field2998, -4) - arg6;
        if (arg4 != -1) {
            field2401 = null;
        }
        int var9 = arg7 - class150.field2849;
        int var10 = arg1 - class207.field3725;
        int var11 = var8 - class64.field1419;
        int var12 = class213.field3849[class276.field4820];
        int var13 = class213.field3849[class123.field2422];
        int var14 = class213.field3846[class276.field4820];
        int var15 = class213.field3846[class123.field2422];
        int var16 = var9 * var13 + var10 * var15 >> 16;
        int var17 = var9 * var15 - (var10 * var13) >> 16;
        int var19 = var11 * var14 - var12 * var17 >> 16;
        int var20 = var11 * var12 + var14 * var17 >> 16;
        if (var20 < 50) {
            class256.field4511 = -1;
            class238.field4245 = -1;
        } else {
            class238.field4245 = (var16 << 9) / var20 + arg0;
            class256.field4511 = (var19 << 9) / var20 + arg5;
        }
    }
}
