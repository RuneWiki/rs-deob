import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class13 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[I")
    public static int[] field238 = new int[32];

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Llc;")
    private static class143 field244;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
    public static int[] field245;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[J")
    public static long[] field251;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Llc;")
    public static class143 field246;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Llc;")
    public static class143 field252;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Z")
    public static boolean field248;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILvh;)Llc;")
    public static final class143 method102(int arg0, class43 arg1) {
        field239++;
        if (arg0 != 32767) {
            method106(39);
        }
        if (class239.method1603(client.method1514(arg1), true) == 0) {
            return null;
        } else if (arg1.field797 == null || arg1.field797.method890(16277).method913((byte) 45) == 0) {
            return class184.field3341 ? class164.field2954 : null;
        } else {
            return arg1.field797;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Lkk;")
    public static final class204 method103(int arg0, int arg1) {
        field247++;
        if (arg0 < 9) {
            field252 = null;
        }
        class204 var2 = (class204) class179.field3207.method1168((long) arg1, (byte) 96);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class257.field4618.method41(-18328, 1, arg1);
        } else {
            var3 = class279.field4923.method41(-18328, 1, arg1 & 0x7FFF);
        }
        class204 var4 = new class204();
        if (var3 != null) {
            var4.method1400(new class190(var3), -1);
        }
        if (arg1 >= 32768) {
            var4.method1395(-28684);
        }
        class179.field3207.method1163(var4, (long) arg1, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)J")
    public static final long method104(int arg0, int arg1, int arg2) {
        class120 var3 = class7.field122[arg0][arg1][arg2];
        return var3 == null || var3.field2131 == null ? 0L : var3.field2131.field1096;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZ)I")
    public static final int method105(int arg0, int arg1, boolean arg2) {
        field241++;
        if (arg0 == -2) {
            return 12345678;
        } else if (!arg2) {
            return 85;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method106(int arg0) {
        field238 = null;
        field246 = null;
        field245 = null;
        field244 = null;
        field252 = null;
        field251 = null;
        if (arg0 != 3) {
            method104(-44, 1, 5);
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(III)V")
    public static final void method107(int arg0, int arg1, int arg2) {
        int var3 = arg0;
        if (arg0 > 25) {
            var3 = 25;
        }
        arg0--;
        field242++;
        int var4 = class1.field28[arg0];
        int var5 = class221.field4000[arg0];
        if (arg2 == 0) {
            class207.field3801++;
            class285.field5010.method799(103, 206);
            class285.field5010.method1276(844519173, var3 + var3 + 3);
        }
        if (arg2 == 1) {
            class285.field5010.method799(103, 234);
            class285.field5010.method1276(844519173, var3 + var3 + 17);
            class55.field1058++;
        }
        if (arg2 == 2) {
            class285.field5010.method799(103, 196);
            class285.field5010.method1276(844519173, var3 + var3 + 3);
            class279.field4917++;
        }
        class285.field5010.method1277(class128.field2264[82] ? 1 : 0, 435273936);
        class285.field5010.method1278(var4 + class141.field2466, (byte) 55);
        class123.field2154 = class1.field28[0];
        class177.field3170 = class221.field4000[arg1];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class285.field5010.method1238(class221.field4000[arg0] - var5, false);
            class285.field5010.method1276(844519173, class1.field28[arg0] - var4);
        }
        class285.field5010.method1245(class148.field2733 + var5, 91);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)V")
    public static final void method108(int arg0, boolean arg1) {
        field240++;
        short var2 = 256;
        if (arg0 > var2) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class172.field3083 += arg0 * 128;
        if (class172.field3083 > class63.field1197.length) {
            class172.field3083 -= class63.field1197.length;
            int var3 = (int) (Math.random() * 12.0D);
            class266.method1770(-118, class23.field381[var3]);
        }
        int var4 = arg0 * 128;
        int var5 = (var2 - arg0) * 128;
        int var6 = 0;
        int var7 = 0;
        if (arg1) {
            return;
        }
        while (var7 < var5) {
            int var26 = class67.field1268[var4 + var6] - (class63.field1197[class172.field3083 + var6 & class63.field1197.length - 1] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class67.field1268[var6++] = var26;
            var7++;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class67.field1268[var23 + var24] = 255;
                } else {
                    class67.field1268[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var2 - arg0); var9++) {
            class261.field4662[var9] = class261.field4662[arg0 + var9];
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class261.field4662[var10] = (int) (Math.sin((double) class274.field4876 / 14.0D) * 16.0D + Math.sin((double) class274.field4876 / 15.0D) * 14.0D + Math.sin((double) class274.field4876 / 16.0D) * 12.0D);
            class274.field4876++;
        }
        class56.field1090 += arg0;
        int var11 = ((class146.field2635 & 0x1) + arg0) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class56.field1090; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class67.field1268[(var22 << 7) + var21] = 192;
        }
        class56.field1090 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var11 + var20 < 128) {
                    var18 += class67.field1268[var20 + var11 + var19];
                }
                if (var20 - var11 - 1 >= 0) {
                    var18 -= class67.field1268[var19 + var20 - (var11 + 1)];
                }
                if (var20 >= 0) {
                    class190.field3488[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > (var11 + var16)) {
                    var15 += class190.field3488[var14 + var17 + (var11 * 128)];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class190.field3488[var17 + var14 - var11 * 128 - 128];
                }
                if (var16 >= 0) {
                    class67.field1268[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field238[var1] = var0 - 1;
            var0 += var0;
        }
        field244 = class66.method374(" from your friend list first)3", -1);
        field245 = new int[2];
        field251 = new long[200];
        field249 = 1;
        field246 = field244;
        field250 = 0;
        field252 = class66.method374("<col=80ff00>", -1);
    }
}
