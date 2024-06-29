import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 extends class13 {

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "[Lff;")
    public class42[] field2873;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lec;")
    public static class32 field2865 = class73.method594("Versteckt", true);

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "[I")
    public static int[] field2870 = new int[500];

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "Lec;")
    public static class32 field2876 = class73.method594("rot:", true);

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "[I")
    public static int[] field2879 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "Lnf;")
    public static class96 field2878;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "Z")
    public static boolean field2872;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIBI)V")
    public static final void method957(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2874++;
        if (class62.field1423 == arg3 && class142.field3253 == arg2 && (class115.field2745 == arg0 || !class154.field3531)) {
            return;
        }
        class115.field2745 = arg0;
        if (!class154.field3531) {
            class115.field2745 = 0;
        }
        class62.field1423 = arg3;
        class142.field3253 = arg2;
        class54.method426(0, 25);
        class14.method72(class48.field1136, 16777215, true);
        int var6 = class72.field1701;
        class72.field1701 = arg3 * 8 - 48;
        int var7 = class118.field2838;
        class118.field2838 = (arg2 - 6) * 8;
        int var8 = class72.field1701 - var6;
        int var9 = class72.field1701;
        int var10 = class118.field2838 - var7;
        int var11 = class118.field2838;
        for (int var12 = 0; var12 < 32768; var12++) {
            class111 var28 = class14.field230[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field2761[var29] -= var8;
                    var28.field2738[var29] -= var10;
                }
                var28.field2749 -= var8 * 128;
                var28.field2700 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class70 var26 = class52.field1176[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field2761[var27] -= var8;
                    var26.field2738[var27] -= var10;
                }
                var26.field2749 -= var8 * 128;
                var26.field2700 -= var10 * 128;
            }
        }
        class43.field990 = arg0;
        class20.field373.method904(arg1, 19403, false, arg5);
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 1;
        byte var17 = 0;
        if (var8 < 0) {
            var14 = 103;
            var16 = -1;
            var15 = -1;
        }
        byte var18 = 1;
        byte var19 = 104;
        if (var10 < 0) {
            var17 = 103;
            var19 = -1;
            var18 = -1;
        }
        if (arg4 >= -127) {
            method961(66, 51);
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var19; var22 += var18) {
                int var23 = var10 + var22;
                int var24 = var8 + var20;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class23.field397[var25][var20][var22] = class23.field397[var25][var24][var23];
                    } else {
                        class23.field397[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class23 var21 = (class23) class45.field1077.method1213(114); var21 != null; var21 = (class23) class45.field1077.method1211(-3)) {
            var21.field405 -= var8;
            var21.field420 -= var10;
            if (var21.field405 < 0 || var21.field420 < 0 || var21.field405 >= 104 || var21.field420 >= 104) {
                var21.method1093(0);
            }
        }
        if (class45.field1067 != 0) {
            class45.field1067 -= var8;
            class31.field615 -= var10;
        }
        class23.field418 = false;
        class143.field3279 = 0;
        class5.field92 = -1;
        class157.field3596.method1206((byte) -19);
        class88.field2040.method1206((byte) -19);
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public static final void method958(int arg0) {
        class80 var1 = class38.field920;
        synchronized (class38.field920) {
            class1.field8 = class39.field937;
            if (arg0 != 103) {
                method959(-64);
            }
            if (class14.field231 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class107.field2542[var2] = false;
                }
                class14.field231 = class114.field2662;
            } else {
                while (class14.field231 != class114.field2662) {
                    int var3 = class4.field55[class114.field2662];
                    class114.field2662 = class114.field2662 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class107.field2542[var3] = true;
                    } else {
                        class107.field2542[~var3] = false;
                    }
                }
            }
            class39.field937 = class62.field1397;
        }
        field2869++;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public static void method959(int arg0) {
        field2870 = null;
        field2876 = null;
        field2879 = null;
        field2865 = null;
        field2878 = null;
        int var1 = -91 % ((arg0 + 13) / 51);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Z")
    public final boolean method960(int arg0, byte arg1) {
        if (arg1 < 123) {
            method957(57, -46, -120, 116, (byte) 70, -78);
        }
        field2875++;
        return this.field2873[arg0].field978;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)I")
    public static final int method961(int arg0, int arg1) {
        field2867++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        if (arg0 > -49) {
            method959(-72);
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lea;Lea;IZ)V")
    public class121(class30 arg0, class30 arg1, int arg2, boolean arg3) {
        class157 var5 = new class157();
        int var6 = arg0.method200((byte) 53, arg2);
        this.field2873 = new class42[var6];
        int[] var7 = arg0.method207(arg2, 20);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class92 var9 = null;
            byte[] var10 = arg0.method206(arg2, var7[var8], -104);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class92 var12 = (class92) var5.method1213(105); var12 != null; var12 = (class92) var5.method1211(-3)) {
                if (var12.field2110 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method217(var11, -73, 0);
                } else {
                    var13 = arg1.method217(0, 110, var11);
                }
                var9 = new class92(var11, var13);
                var5.method1216(var9, (byte) 59);
            }
            this.field2873[var7[var8]] = new class42(var10, var9);
        }
    }
}
