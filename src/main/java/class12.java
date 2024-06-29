import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class12 extends class303 {

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Leb;")
    public static class116 field221 = class18.method149(115);

    @OriginalMember(owner = "client!se", name = "U", descriptor = "[S")
    public static short[] field233 = new short[500];

    @OriginalMember(owner = "client!se", name = "V", descriptor = "I")
    public static int field234 = -1;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "S")
    public static short field231 = 32767;

    @OriginalMember(owner = "client!se", name = "X", descriptor = "[I")
    public static int[] field236 = new int[5];

    @OriginalMember(owner = "client!se", name = "W", descriptor = "Lcg;")
    public static class42 field235 = new class42(0, -1);

    @OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
    public static int field239 = 0;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!se", name = "bb", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!se", name = "P", descriptor = "Ltd;")
    public static class241 field229;

    @OriginalMember(owner = "client!se", name = "cb", descriptor = "Lja;")
    public static class64 field241;

    @OriginalMember(owner = "client!se", name = "Z", descriptor = "[Z")
    public static boolean[] field238;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(JZILjava/lang/String;IIBZIZLjava/lang/String;)V", line = 8)
    public static final void method108(long arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5, byte arg6, boolean arg7, int arg8, boolean arg9, String arg10) {
        field224++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        if (arg6 != 87) {
            field221 = (class116) null;
        }
        class101 var14 = new class101(128);
        var14.method772((byte) -96, 10);
        var14.method728((arg9 ? 1 : 0) | (arg7 ? 2 : 0) | (arg1 ? 4 : 0), 1234856744);
        var14.method760(arg0, true);
        var14.method784(111, var12[0]);
        var14.method754((byte) 67, arg10);
        var14.method784(107, var12[1]);
        var14.method728(class132.field2118, 1234856744);
        var14.method772((byte) -97, arg8);
        var14.method772((byte) -67, arg5);
        var14.method784(-44, var12[2]);
        var14.method728(arg4, 1234856744);
        var14.method728(arg2, 1234856744);
        var14.method784(-58, var12[3]);
        var14.method750(class127.field2019, class256.field3958, (byte) 118);
        class101 var15 = new class101(128);
        var15.method754((byte) 96, arg3);
        int var16 = 8 - (class307.method2123((byte) -122, arg3) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method772((byte) -108, (int) (Math.random() * 255.0D));
        }
        var15.method730(var12, 0);
        class269.field4191.field1667 = 0;
        class269.field4191.method772((byte) -84, 22);
        class269.field4191.method772((byte) -125, var15.field1667 + var14.field1667 + 2);
        class269.field4191.method728(533, 1234856744);
        class269.field4191.method743(var14.field1661, var14.field1667, 0, -117);
        class269.field4191.method743(var15.field1661, var15.field1667, 0, arg6 ^ 0xFFFFFFDF);
        class70.field1113 = 0;
        class316.field4932 = 1;
        class279.field4313 = 0;
        class231.field3671 = -3;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)Ljava/lang/String;", line = 65)
    public static final String method109(int arg0, int arg1) {
        field228++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else {
            if (arg0 <= 40) {
                field237 = 55;
            }
            return arg1 < 10000000 ? "<col=ffffff>" + arg1 / 1000 + class329.field5086 + "</col>" : "<col=00ff80>" + arg1 / 1000000 + class50.field811 + "</col>";
        }
    }

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(III)V", line = 82)
    private final void method110(int arg0, int arg1, int arg2) {
        field227++;
        int var4 = class291.field4427[arg1];
        int var5 = class36.field591[arg0];
        int var6 = -35 / ((-arg2 - 77) / 49);
        float var7 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if (-3.141592653589793D <= (double) var7 && (double) var7 <= -2.356194490192345D) {
            class103.field1743 = arg0;
            class190.field3011 = arg1;
        } else if ((double) var7 <= -1.5707963267948966D && -2.356194490192345D <= (double) var7) {
            class103.field1743 = arg1;
            class190.field3011 = arg0;
        } else if ((double) var7 <= -0.7853981633974483D && (double) var7 >= -1.5707963267948966D) {
            class103.field1743 = arg1;
            class190.field3011 = class70.field1108 - arg0;
        } else if (var7 <= 0.0F && (double) var7 >= -0.7853981633974483D) {
            class103.field1743 = class247.field3815 - arg0;
            class190.field3011 = arg1;
        } else if (var7 >= 0.0F && (double) var7 <= 0.7853981633974483D) {
            class190.field3011 = class70.field1108 - arg1;
            class103.field1743 = class247.field3815 - arg0;
        } else if ((double) var7 >= 0.7853981633974483D && (double) var7 <= 1.5707963267948966D) {
            class103.field1743 = class247.field3815 - arg1;
            class190.field3011 = class70.field1108 - arg0;
        } else if ((double) var7 >= 1.5707963267948966D && (double) var7 <= 2.356194490192345D) {
            class190.field3011 = arg0;
            class103.field1743 = class247.field3815 - arg1;
        } else if ((double) var7 >= 2.356194490192345D && (double) var7 <= 3.141592653589793D) {
            class103.field1743 = arg0;
            class190.field3011 = class70.field1108 - arg1;
        }
        class103.field1743 &= field240;
        class190.field3011 &= class40.field724;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILja;)Lgk;", line = 156)
    public static final class7 method111(int arg0, int arg1, class64 arg2) {
        field226++;
        if (class289.method2030(arg2, 128, arg0)) {
            return arg1 == 27143 ? class39.method324((byte) -108) : (class7) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(II)Z", line = 173)
    public static final boolean method112(int arg0, int arg1) {
        byte var2 = 0;
        field220++;
        byte var3 = 0;
        if (class307.field4822 == null) {
            if (class265.field4126 || class329.field5088 == null) {
                class307.field4822 = new class7(512, 512);
            } else {
                class307.field4822 = (class7) class329.field5088;
            }
            int[] var4 = class307.field4822.field117;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < (104 - var3 - 1); var7++) {
                int var8 = (var3 + 103 - var7) * 512 * 4 + 24628;
                for (int var9 = var2 + 1; var9 < 103 - var2; var9++) {
                    if ((class250.field3857[arg1][var9][var7] & 0x18) == 0) {
                        class103.method795(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class250.field3857[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class103.method795(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class231.field3666 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class34.method239(class41.field734, var2 + var10, var3 + var11);
                    if (var12 != 0L) {
                        class6 var14 = class28.method190(124, Integer.MAX_VALUE & (int) (var12 >>> 32));
                        int var15 = var14.field104;
                        if (var14.field56 != null) {
                            for (int var16 = 0; var16 < var14.field56.length; var16++) {
                                if (var14.field56[var16] != -1) {
                                    class6 var17 = class28.method190(-109, var14.field56[var16]);
                                    if (var17.field104 >= 0) {
                                        var15 = var17.field104;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var2 + var10;
                            int var19 = var3 + var11;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class244.field3772[class41.field734].field879;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var10 - 3 < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && var18 < var10 + 3 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var19 > (var11 - 3) && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var19 < var11 + 3 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class151.field2434[class231.field3666] = var14.field106;
                            class247.field3819[class231.field3666] = var18 - var2;
                            class276.field4284[class231.field3666] = var19 - var3;
                            class231.field3666++;
                        }
                    }
                }
            }
        }
        class307.field4822.method60();
        int var23 = ((int) (Math.random() * 20.0D) + 228 << 16) + (((int) (Math.random() * 20.0D) - 10) + 238 << 8) + (int) (Math.random() * 20.0D) + 228;
        int var24 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class250.field3857[arg1][var2 + var26][var3 + var25] & 0x18) == 0 && !class173.method1278(var3, var23, var26, arg0 ^ 0x2230, var24, var25, var2, arg1)) {
                    if (class265.field4126) {
                        class182.field2913 = null;
                    } else {
                        class222.field3556.method1503(32);
                    }
                    return false;
                }
                if (arg1 < 3 && (class250.field3857[arg1 + 1][var2 + var26][var3 + var25] & 0x8) != 0 && !class173.method1278(var3, var23, var26, -1024, var24, var25, var2, arg1 + 1)) {
                    if (class265.field4126) {
                        class182.field2913 = null;
                    } else {
                        class222.field3556.method1503(32);
                    }
                    return false;
                }
            }
        }
        if (class265.field4126) {
            int[] var27 = class307.field4822.field117;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class329.field5088 = new class105(class307.field4822);
        } else {
            class329.field5088 = class307.field4822;
        }
        if (arg0 != -8656) {
            method112(75, -77);
        }
        if (class265.field4126) {
            class182.field2913 = null;
        } else {
            class222.field3556.method1503(32);
        }
        class307.field4822 = null;
        return true;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[I", line = 411)
    public final int[] method67(int arg0, int arg1) {
        field230++;
        int[] var3 = this.field4763.method394(arg0 ^ arg0, arg1);
        if (this.field4763.field863) {
            for (int var4 = 0; var4 < class70.field1108; var4++) {
                this.method110(arg1, var4, arg0 + 67);
                int[] var5 = this.method2107(class103.field1743, 0, 0);
                var3[var4] = var5[class190.field3011];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V", line = 441)
    public static void method113(byte arg0) {
        field241 = null;
        field235 = null;
        field221 = null;
        field229 = null;
        field233 = null;
        field238 = null;
        if (arg0 >= 13) {
            field236 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILpe;I)V", line = 459)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field232++;
        if (arg2 == 0) {
            this.field4773 = arg1.method741(77) == 1;
        }
        if (arg0 != -4004) {
            field239 = 100;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V", line = 474)
    public class12() {
        super(1, false);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[[I", line = 482)
    public final int[][] method74(int arg0, int arg1) {
        field222++;
        int[][] var3 = this.field4772.method1175(arg1 ^ 0xFFFFFFE9, arg0);
        if (arg1 != 82) {
            field238 = (boolean[]) null;
        }
        if (this.field4772.field2488) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class70.field1108; var7++) {
                this.method110(arg0, var7, -128);
                int[][] var8 = this.method2106(class103.field1743, 0, 117);
                var4[var7] = var8[0][class190.field3011];
                var5[var7] = var8[1][class190.field3011];
                var6[var7] = var8[2][class190.field3011];
            }
        }
        return var3;
    }
}
