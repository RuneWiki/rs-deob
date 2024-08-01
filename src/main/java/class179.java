import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("td")
public class class179 extends class147 {

    @OriginalMember(owner = "td", name = "L", descriptor = "[Lvb;")
    public class195[] field3382;

    @OriginalMember(owner = "td", name = "H", descriptor = "Llf;")
    public static class109 field3378 = class35.method275("60 Sekunden noch einmal)3)3)3", 2);

    @OriginalMember(owner = "td", name = "Q", descriptor = "Llf;")
    private static class109 field3386 = class35.method275("skill)2", 2);

    @OriginalMember(owner = "td", name = "K", descriptor = "Llf;")
    public static class109 field3381 = field3386;

    @OriginalMember(owner = "td", name = "R", descriptor = "Llf;")
    private static class109 field3387 = class35.method275("Username: ", 2);

    @OriginalMember(owner = "td", name = "O", descriptor = "Llf;")
    public static class109 field3385 = field3387;

    @OriginalMember(owner = "td", name = "U", descriptor = "Llf;")
    public static class109 field3390 = class35.method275("sl_flags", 2);

    @OriginalMember(owner = "td", name = "W", descriptor = "Llf;")
    public static class109 field3392 = class35.method275(" ", 2);

    @OriginalMember(owner = "td", name = "T", descriptor = "Z")
    public static boolean field3389 = false;

    @OriginalMember(owner = "td", name = "G", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "td", name = "I", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "td", name = "J", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "td", name = "M", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "td", name = "N", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "td", name = "S", descriptor = "Lhf;")
    public static class75 field3388;

    @OriginalMember(owner = "td", name = "V", descriptor = "[Ldf;")
    public static class37[] field3391;

    @OriginalMember(owner = "td", name = "b", descriptor = "(I)V")
    public static final void method1217(int arg0) {
        if (arg0 != 127) {
            return;
        }
        field3377++;
        if (class126.field2428 != null && class109.field2173 != null) {
            return;
        }
        class109.field2173 = new int[256];
        class126.field2428 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class126.field2428[var1] = (int) (Math.sin(var2) * 4096.0D);
            class109.field2173[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "td", name = "a", descriptor = "(Lbg;ILbg;Lbg;)V")
    public static final void method1218(class18 arg0, int arg1, class18 arg2, class18 arg3) {
        if (arg1 != 1156412167) {
            field3392 = null;
        }
        class185.field3530 = arg2;
        class71.field1379 = arg3;
        field3383++;
        class29.field625 = arg0;
    }

    @OriginalMember(owner = "td", name = "a", descriptor = "(BI)Z")
    public final boolean method1219(byte arg0, int arg1) {
        int var3 = -120 % ((arg0 - 48) / 51);
        field3380++;
        return this.field3382[arg1].field3737;
    }

    @OriginalMember(owner = "td", name = "a", descriptor = "(II[Lvg;)V")
    public static final void method1220(int arg0, int arg1, class200[] arg2) {
        field3379++;
        if (arg0 != -1682905504) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class200 var4 = arg2[var3];
            if (var4 != null && var4.field3868 == arg1 && (!var4.field3946 || !class113.method834((byte) -121, var4))) {
                if (var4.field3875 == 0) {
                    if (!var4.field3946 && class113.method834((byte) -123, var4) && class209.field4069 != var4) {
                        continue;
                    }
                    method1220(-1682905504, var4.field3866, arg2);
                    if (var4.field3898 != null) {
                        method1220(arg0, var4.field3866, var4.field3898);
                    }
                    class60 var5 = (class60) class113.field2236.method337((long) var4.field3866, (byte) -126);
                    if (var5 != null) {
                        class127.method924(112, var5.field1174);
                    }
                }
                if (var4.field3875 == 6) {
                    if (var4.field3896 != -1 || var4.field3857 != -1) {
                        boolean var6 = class23.method207(var4, arg0 + 1682905504);
                        int var7;
                        if (var6) {
                            var7 = var4.field3857;
                        } else {
                            var7 = var4.field3896;
                        }
                        if (var7 != -1) {
                            class20 var8 = client.method246(12, var7);
                            var4.field3822 += class193.field3694;
                            while (var8.field442[var4.field3939] < var4.field3822) {
                                var4.field3822 -= var8.field442[var4.field3939];
                                var4.field3939++;
                                if (var4.field3939 >= var8.field440.length) {
                                    var4.field3939 -= var8.field454;
                                    if (var4.field3939 < 0 || var8.field440.length <= var4.field3939) {
                                        var4.field3939 = 0;
                                    }
                                }
                                class115.method851(var4, -23101);
                            }
                        }
                    }
                    if (var4.field3919 != 0 && !var4.field3946) {
                        int var9 = var4.field3919 >> 16;
                        int var10 = var4.field3919 << 16 >> 16;
                        int var11 = class193.field3694 * var9;
                        int var12 = class193.field3694 * var10;
                        var4.field3873 = var4.field3873 + var11 & 0x7FF;
                        var4.field3893 = var4.field3893 + var12 & 0x7FF;
                        class115.method851(var4, -23101);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "td", name = "c", descriptor = "(I)V")
    public static void method1221(int arg0) {
        field3392 = null;
        field3386 = null;
        field3385 = null;
        field3391 = null;
        if (arg0 > -9) {
            field3385 = null;
        }
        field3378 = null;
        field3388 = null;
        field3390 = null;
        field3387 = null;
        field3381 = null;
    }

    @OriginalMember(owner = "td", name = "a", descriptor = "(BZ)V")
    public static final void method1222(byte arg0, boolean arg1) {
        for (int var2 = 0; var2 < class1.field10; var2++) {
            class139 var3 = class183.field3444[class1.field8[var2]];
            long var4 = (long) class1.field8[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method996(0) && arg1 == var3.field2691.field3150 && var3.field2691.method1143(-102)) {
                int var6 = var3.field3549 >> 7;
                int var7 = var3.field3609 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field3612 == 1 && (var3.field3549 & 0x7F) == 64 && (var3.field3609 & 0x7F) == 64) {
                        if (class84.field1710[var6][var7] == class55.field1115) {
                            continue;
                        }
                        class84.field1710[var6][var7] = class55.field1115;
                    }
                    if (!var3.field2691.field3192) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field3584 = class19.method180(var3.field3609 + (var3.field3612 - 1) * 64, false, class72.field1405, (var3.field3612 - 1) * 64 + var3.field3549);
                    class95.method684(class72.field1405, var3.field3549, var3.field3609, var3.field3584, (var3.field3612 - 1) * 64 + 60, var3, var3.field3556, var4, var3.field3601);
                }
            }
        }
        if (arg0 >= -5) {
            method1218(null, -34, null, null);
        }
        field3384++;
    }

    @OriginalMember(owner = "td", name = "<init>", descriptor = "(Lbg;Lbg;IZ)V")
    public class179(class18 arg0, class18 arg1, int arg2, boolean arg3) {
        class181 var5 = new class181();
        int var6 = arg0.method167((byte) 101, arg2);
        this.field3382 = new class195[var6];
        int[] var7 = arg0.method149((byte) 117, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class70 var9 = null;
            byte[] var10 = arg0.method147(0, var7[var8], arg2);
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            for (class70 var12 = (class70) var5.method1230(89); var12 != null; var12 = (class70) var5.method1234(-1)) {
                if (var12.field1351 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method148(var11, 55, 0);
                } else {
                    var13 = arg1.method148(0, 99, var11);
                }
                var9 = new class70(var11, var13);
                var5.method1231(var9, 0);
            }
            this.field3382[var7[var8]] = new class195(var10, var9);
        }
    }
}
