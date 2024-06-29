import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class25 extends class263 {

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Lhi;")
    private static class82 field338 = class95.method664((byte) -54, "Allocating memory");

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field333 = 0;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "[I")
    public static int[] field339 = new int[100];

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "[I")
    public static int[] field341 = new int[1000];

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "Lhi;")
    public static class82 field344 = field338;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "Lsm;")
    public static class120 field334;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)I", line = 3)
    public static final int method159(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBII)Lak;", line = 32)
    public static final class146 method160(int arg0, byte arg1, int arg2, int arg3) {
        field340++;
        class146 var4 = new class146();
        var4.field2474 = arg2;
        var4.field2469 = arg3;
        class191.field3195.method503((long) arg0, -110, var4);
        class133.method913(false, arg2);
        class75 var5 = class282.method1965(arg0, (byte) 6);
        int var6 = 74 % ((arg1 + 24) / 48);
        if (var5 != null) {
            class138.method937(var5, 16);
        }
        if (class99.field1789 != null) {
            class138.method937(class99.field1789, 16);
            class99.field1789 = null;
        }
        int var7 = class309.field5262;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class34.method262(-82, class135.field2333[var8])) {
                class243.method1745(var8, 1);
            }
        }
        if (class309.field5262 == 1) {
            class187.field3153 = false;
            class143.method977(class33.field495, class88.field1563, class164.field2874, true, class28.field367);
        } else {
            class143.method977(class33.field495, class88.field1563, class164.field2874, true, class28.field367);
            int var9 = class253.field4354.method124(class287.field4831);
            for (int var10 = 0; var10 < class309.field5262; var10++) {
                int var11 = class253.field4354.method124(class207.method1484(var10, (byte) 112));
                if (var9 < var11) {
                    var9 = var11;
                }
            }
            class88.field1563 = var9 + 8;
            class164.field2874 = class309.field5262 * 15 + 22;
        }
        if (var5 != null) {
            class177.method1253((byte) -55, var5, false);
        }
        class107.method733(-127, arg2);
        if (class255.field4382 != -1) {
            class143.method976(class255.field4382, 256, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IJII)Z", line = 111)
    public static final boolean method161(int arg0, long arg1, int arg2, int arg3) {
        int var5 = ((int) arg1 & 0x32B875) >> 20;
        if (arg2 >= -28) {
            field334 = (class120) null;
        }
        int var6 = (int) arg1 >> 14 & 0x1F;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        field335++;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class157 var8 = class99.method682(var7, (byte) -91);
            int var9 = var8.field2706;
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field2704;
                var11 = var8.field2725;
            } else {
                var10 = var8.field2725;
                var11 = var8.field2704;
            }
            if (var5 != 0) {
                var9 = (var9 << var5 & 0xF) + (var9 >> 4 - var5);
            }
            class55.method384(var9, 2, 0, true, var10, arg3, (byte) -106, 0, arg0, class168.field2932.field1723[0], class168.field2932.field1720[0], var11);
        } else {
            class55.method384(0, 2, var6 + 1, true, 0, arg3, (byte) -106, var5, arg0, class168.field2932.field1723[0], class168.field2932.field1720[0], 0);
        }
        class43.field758 = class166.field2904;
        class45.field774 = class255.field4394;
        class193.field3277 = 2;
        class233.field4049 = 0;
        return true;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)I", line = 162)
    public static final int method162(int arg0, int arg1, int arg2) {
        field343++;
        if (arg0 == -1) {
            return 12345678;
        } else if (arg2 == -1) {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        } else {
            return -125;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIIII)V", line = 185)
    public static final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg8 && arg1 == arg4 && arg6 == arg9 && arg0 == arg5) {
            class34.method265(arg2, arg0, arg9, arg3, arg1, -779049524);
        } else {
            int var10 = arg2;
            int var11 = arg1 * 3;
            int var12 = arg1;
            int var13 = arg2 * 3;
            int var14 = arg8 * 3;
            int var15 = arg4 * 3;
            int var16 = arg6 * 3;
            int var17 = arg5 * 3;
            int var18 = arg0 + var15 - var17 - arg1;
            int var19 = var14 + arg9 - var16 - arg2;
            int var20 = var17 + var11 - var15 - var15;
            int var21 = var14 - var13;
            int var22 = var16 + var13 - (var14 + var14);
            int var23 = var15 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var22 * var25;
                int var29 = var18 * var26;
                int var30 = var20 * var25;
                int var31 = var21 * var24;
                int var32 = var23 * var24;
                int var33 = arg2 + (var27 + var28 + var31 >> 12);
                int var34 = (var29 + var30 + var32 >> 12) + arg1;
                class34.method265(var10, var34, var33, arg3, var12, arg7 ^ 0xD190A5CF);
                var12 = var34;
                var10 = var33;
            }
        }
        field337++;
        if (arg7 != 3) {
            method166(true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 266)
    public static void method164(int arg0) {
        field341 = null;
        field344 = null;
        if (arg0 != 3) {
            method162(-80, 34, -23);
        }
        field338 = null;
        field334 = null;
        field339 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III[B)I", line = 290)
    public static final int method165(int arg0, int arg1, int arg2, byte[] arg3) {
        field336++;
        int var4 = -1;
        if (arg1 != 100) {
            method166(true);
        }
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class90.field1627[(arg3[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)Z", line = 319)
    public static final boolean method166(boolean arg0) {
        field342++;
        class26 var1 = class67.field1046;
        synchronized (class67.field1046) {
            if (class197.field3365 == class144.field2465) {
                return false;
            }
            class124.field2180 = class300.field5089[class144.field2465];
            class199.field3414 = class92.field1650[class144.field2465];
            class144.field2465 = class144.field2465 + 1 & 0x7F;
            if (!arg0) {
                method161(35, -90L, 79, 123);
            }
            return true;
        }
    }
}
