import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class631 {

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Ltb;")
    private class450 field8847 = new class450(64);

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Lpl;")
    private class612 field8850;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field8854 = 1403;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lpl;")
    public static class612 field8846;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lkp;III)V", line = 4)
    public static final void method3528(class507 arg0, int arg1, int arg2, int arg3) {
        if (class664.field9377) {
            class207 var4 = class355.field4527 == -1 ? null : class705.field9939.method2477((byte) 6, class355.field4527);
            if (client.method3819(arg0).method2017(false) && (class639.field8984 & 0x20) != 0 && (var4 == null || arg0.method2739(124, var4.field2627, class355.field4527) != var4.field2627)) {
                class602.field8476++;
                class326.method1864(arg0.field6834, false, arg0.field6764, arg0.field6832, true, class477.field6046, arg1 ^ 0xFFFFBFC2, 0L, class473.field6007 + " -> " + arg0.field6828, 45, class537.field7208);
            }
        }
        field8853++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class592.method3258(15648, var5, arg0);
            if (var9 != null) {
                class326.method1864(arg0.field6834, false, arg0.field6764, arg0.field6832, true, class417.method2226(arg0, var5, true), 126, (long) (var5 + 1), arg0.field6828, 1011, var9);
                class638.field8937++;
            }
        }
        String var6 = class678.method3798(arg0, (byte) -117);
        if (arg1 != -16452) {
            return;
        }
        if (var6 != null) {
            class6.field144++;
            class326.method1864(arg0.field6834, false, arg0.field6764, arg0.field6832, true, arg0.field6699, arg1 ^ 0xFFFFBF9D, 0L, arg0.field6828, 57, var6);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class592.method3258(15648, var7, arg0);
            if (var8 != null) {
                class326.method1864(arg0.field6834, false, arg0.field6764, arg0.field6832, true, class417.method2226(arg0, var7, true), arg1 + 16578, (long) (var7 + 1), arg0.field6828, 60, var8);
                class638.field8937++;
            }
        }
        if (!client.method3819(arg0).method2022(-128)) {
            return;
        }
        class285.field3548++;
        if (arg0.field6856 == null) {
            class326.method1864(arg0.field6834, false, arg0.field6764, arg0.field6832, true, -1, arg1 + 16325, 0L, "", 50, class83.field1117.method476((byte) -37, class250.field3068));
        } else {
            class326.method1864(arg0.field6834, false, arg0.field6764, arg0.field6832, true, -1, 126, 0L, "", 50, arg0.field6856);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)Lno;", line = 79)
    public final class527 method3529(int arg0, int arg1) {
        field8851++;
        if (arg0 > -55) {
            field8854 = 83;
        }
        class450 var3 = this.field8847;
        class527 var4;
        synchronized (this.field8847) {
            var4 = (class527) this.field8847.method2418((long) arg1, (byte) 100);
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field8850;
        byte[] var6;
        synchronized (this.field8850) {
            var6 = this.field8850.method3365(arg1, -123, 5);
        }
        class527 var7 = new class527();
        if (var6 != null) {
            var7.method2865(new class630(var6), -50);
        }
        class450 var8 = this.field8847;
        synchronized (this.field8847) {
            this.field8847.method2409((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 112)
    public static void method3530(int arg0) {
        if (arg0 == 1403) {
            field8846 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Z", line = 124)
    public static final boolean method3531(int arg0, int arg1, int arg2) {
        field8848++;
        if (arg1 != 0) {
            field8846 = null;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILpk;)Z", line = 138)
    public static final boolean method3532(int arg0, class104 arg1) {
        if (arg0 != 1) {
            method3530(-23);
        }
        field8849++;
        return class193.field2404 == arg1 || class468.field5946 == arg1 || class557.field7737 == arg1 || class512.field6950 == arg1;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lr;IIIIIIZZ)V", line = 150)
    public static final void method3533(class566 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class590.field8291 = arg0;
        class378.field4788 = arg1;
        class184.field2345 = class378.field4788 > 1 && class590.field8291.method1085();
        class52.field775 = arg2;
        class702.field9928 = 0x1 << class52.field775;
        class238.field2979 = class702.field9928 >> 1;
        Math.sqrt((double) (class238.field2979 * class238.field2979 + class238.field2979 * class238.field2979));
        class391.field4927 = arg3;
        class429.field5383 = arg4;
        class37.field508 = arg5;
        class479.field6372 = arg6;
        class46.field612 = class468.method2476(113);
        class233.method1406(1000);
        class582.field8139 = new class75[arg3][class429.field5383][class37.field508];
        class256.field3127 = new class272[arg3];
        if (arg7) {
            class540.field7230 = new int[class429.field5383][class37.field508];
            class319.field4080 = new byte[class429.field5383][class37.field508];
            class180.field2320 = new short[class429.field5383][class37.field508];
            class173.field2260 = new class75[1][class429.field5383][class37.field508];
            class699.field9887 = new class272[1];
        } else {
            class540.field7230 = null;
            class319.field4080 = null;
            class180.field2320 = null;
            class173.field2260 = null;
            class699.field9887 = null;
        }
        if (arg8) {
            class704.field9932 = new long[arg3][arg4][arg5];
            class352.field4498 = new class378[65535];
            class352.field4495 = new boolean[65535];
            class574.field8008 = 0;
        } else {
            class704.field9932 = null;
            class352.field4498 = null;
            class352.field4495 = null;
            class574.field8008 = 0;
        }
        class68.method405(false);
        class102.field1375 = new class488[2][];
        class102.field1375[0] = new class488[class540.field7232[0]];
        class102.field1375[1] = new class488[class540.field7232[1]];
        class593.field8335 = new int[2];
        class337.field4341 = new class488[2][];
        class337.field4341[0] = new class488[class653.field9210[0]];
        class337.field4341[1] = new class488[class653.field9210[1]];
        class173.field2256 = new int[2];
        class252.field3090 = new class488[2][];
        class252.field3090[0] = new class488[class546.field7271[0]];
        class252.field3090[1] = new class488[class546.field7271[1]];
        class469.field5960 = new int[2];
        class610.field8563 = new class488[10000];
        class518.field7075 = 0;
        class341.field4394 = new class488[5000];
        class467.field5939 = 0;
        class11.field191 = new class172[5000];
        class103.field1389 = 0;
        class354.field4511 = new boolean[class479.field6372 + class479.field6372 + 1][class479.field6372 + class479.field6372 + 1];
        class512.field6954 = new boolean[class479.field6372 + class479.field6372 + 2][class479.field6372 + class479.field6372 + 2];
        if (class184.field2345) {
            class396.field4999 = new boolean[arg3][class479.field6372 + class479.field6372 + 1][class479.field6372 + class479.field6372 + 1];
            class560.field7787 = new boolean[arg3][][];
            if (class455.field5825 != null) {
                class632.method3537();
            }
            class455.field5825 = new class251[class378.field4788];
            class590.field8291.method1063(class455.field5825.length + 1);
            class590.field8291.method1040(0);
            for (int var9 = 0; var9 < class455.field5825.length; var9++) {
                class455.field5825[var9] = new class251(var9 + 1, class590.field8291);
                (new Thread(class455.field5825[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class378.field4788 == 2) {
                var10 = 4;
                class257.field3128 = 2;
            } else if (class378.field4788 == 3) {
                var10 = 6;
                class257.field3128 = 3;
            } else {
                var10 = 8;
                class257.field3128 = 4;
            }
            class523.field7115 = new class652[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class523.field7115[var11] = new class652(class488.field6465[class378.field4788 - 2][var11]);
            }
        } else {
            class257.field3128 = 1;
        }
        class678.field9517 = new int[class257.field3128 - 1];
        class204.field2596 = new int[class257.field3128 - 1];
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILr;IBIILfa;)V", line = 280)
    public static final void method3534(int arg0, class566 arg1, int arg2, byte arg3, int arg4, int arg5, class526 arg6) {
        if (arg3 != -34) {
            field8854 = 62;
        }
        if (class294.field3634 < 100) {
            class325.method1862(arg6, arg1, -74);
        }
        field8852++;
        arg1.method1083(arg2, arg0, arg2 + arg5, arg0 + arg4);
        if (class294.field3634 < 100) {
            byte var7 = 20;
            int var8 = arg2 + (arg5 / 2);
            int var9 = arg4 / 2 + arg0 - var7 - 18;
            arg1.method1090(arg2, arg0, arg5, arg4, -16777216, 0);
            arg1.method978(var8 - 152, var9, 304, 34, class266.field3377[class484.field6422].getRGB(), 0);
            arg1.method1090(var8 - 150, var9 - -2, class294.field3634 * 3, 30, class511.field6942[class484.field6422].getRGB(), 0);
            class65.field889.method2199(class695.field9859[class484.field6422].getRGB(), -142, var8, -1, var7 + var9, class83.field1126.method476((byte) -76, class250.field3068));
            return;
        }
        int var10 = class198.field2501 - ((int) ((float) arg5 / class656.field9246));
        int var11 = (int) ((float) arg4 / class656.field9246) + class635.field8898;
        int var12 = (int) ((float) arg5 / class656.field9246) + class198.field2501;
        class447.field5742 = (int) ((float) (arg4 * 2) / class656.field9246);
        class553.field7701 = (int) ((float) (arg5 * 2) / class656.field9246);
        class238.field2970 = class635.field8898 - (int) ((float) arg4 / class656.field9246);
        class239.field2988 = class198.field2501 - ((int) ((float) arg5 / class656.field9246));
        int var13 = class635.field8898 - ((int) ((float) arg4 / class656.field9246));
        class656.method3688(class656.field9265 + var10, class656.field9264 + var11, class656.field9265 + var12, class656.field9264 + var13, arg2, arg0, arg2 + arg5, arg0 + arg4 - -1);
        class656.method3674(arg1);
        class40 var14 = class656.method3685(arg1);
        class440.method2336(0, arg1, var14, 0, 0);
        if (class590.field8287 > 0) {
            class673.field9471--;
            if (class673.field9471 == 0) {
                class590.field8287--;
                class673.field9471 = 20;
            }
        }
        if (!class605.field8512) {
            return;
        }
        int var15 = arg2 + arg5 - 5;
        int var16 = arg0 - (8 - arg4);
        class133.field1729.method2198(var15, var16, "Fps:" + class493.field6520, 16776960, -1, -98);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class133.field1729.method2198(var15, var20, "Mem:" + var18 + "k", var19, -1, -64);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lrf;ILpl;)V", line = 366)
    public class631(class112 arg0, int arg1, class612 arg2) {
        this.field8850 = arg2;
        this.field8850.method3349(5, true);
    }
}
