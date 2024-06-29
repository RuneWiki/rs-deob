import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class78 {

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Lml;")
    public static class160 field1274 = new class160(64);

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lml;")
    public static class160 field1275 = new class160(30);

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field1277 = 50;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[Lce;")
    public static class126[] field1283 = new class126[field1277];

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "[I")
    public static int[] field1282 = new int[field1277];

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[I")
    public static int[] field1284 = new int[field1277];

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
    public static int[] field1281 = new int[field1277];

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "[I")
    public static int[] field1286 = new int[field1277];

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
    public static int[] field1278 = new int[field1277];

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "[I")
    public static int[] field1285 = new int[field1277];

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "[I")
    public static int[] field1280 = new int[field1277];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Ljk;")
    public static class273 field1271;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 6)
    public static void method556(int arg0) {
        field1282 = null;
        if (arg0 != 2048) {
            return;
        }
        field1271 = null;
        field1274 = null;
        field1284 = null;
        field1281 = null;
        field1280 = null;
        field1285 = null;
        field1275 = null;
        field1283 = null;
        field1278 = null;
        field1286 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Lij;", line = 28)
    public static final class176 method557(int arg0, byte arg1) {
        field1273++;
        class176 var2 = (class176) class203.field3480.method1173(-19839, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class95.field1501.method2173(class136.method989(-120, arg0), class270.method1815(-22, arg0), (byte) -45);
        class176 var4 = new class176();
        if (var3 != null) {
            var4.method1276(new class134(var3), -1);
        }
        class203.field3480.method1179(var4, (long) arg0, (byte) -72);
        if (arg1 > -5) {
            field1284 = (int[]) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIILwi;I)Lwi;", line = 81)
    public static final class196 method560(int arg0, int arg1, int arg2, int arg3, int arg4, class196 arg5, int arg6) {
        long var7 = (long) arg3;
        if (arg6 != -10) {
            field1286 = (int[]) null;
        }
        class196 var9 = (class196) class37.field546.method1173(-19839, var7);
        field1270++;
        if (var9 == null) {
            class146 var10 = class146.method1078(class309.field5239, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1073(64, 768, -50, -10, -50);
            class37.field546.method1179(var9, var7, (byte) -72);
        }
        int var11 = arg5.method229();
        int var12 = arg5.method222();
        int var13 = arg5.method215();
        int var14 = arg5.method236();
        class196 var15 = var9.method226(true, true);
        if (arg0 != 0) {
            var15.method233(arg0);
        }
        if (class56.field846) {
            class62 var18 = (class62) var15;
            if (class174.method1265(arg2 + var13, 8100, class131.field2250, arg1 + var11) != arg4 || arg4 != class174.method1265(arg2 + var14, 8100, class131.field2250, arg1 + var12)) {
                for (int var19 = 0; var19 < var18.field986; var19++) {
                    var18.field998[var19] += class174.method1265(var18.field1009[var19] + arg2, arg6 + 8110, class131.field2250, var18.field984[var19] + arg1) - arg4;
                }
                var18.field996.field4196 = false;
                var18.field995.field1926 = false;
            }
        } else {
            class38 var16 = (class38) var15;
            if (class174.method1265(arg2 + var13, 8100, class131.field2250, arg1 + var11) != arg4 || arg4 != class174.method1265(arg2 + var14, 8100, class131.field2250, arg1 + var12)) {
                for (int var17 = 0; var17 < var16.field606; var17++) {
                    var16.field607[var17] += class174.method1265(var16.field569[var17] + arg2, 8100, class131.field2250, var16.field553[var17] + arg1) - arg4;
                }
                var16.field557 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 166)
    public static final void method561(byte arg0) {
        field1272++;
        int var1 = class207.field3556 * 128 + 64;
        int var2 = class91.field1439 * 128 + 64;
        int var3 = class174.method1265(var2, 8100, class131.field2250, var1) - class68.field1116;
        if (class207.field3553 < 100) {
            if (class223.field3755 < var2) {
                class223.field3755 += (var2 - class223.field3755) * class207.field3553 / 1000 + class214.field3642;
                if (class223.field3755 > var2) {
                    class223.field3755 = var2;
                }
            }
            if (var1 > class152.field2780) {
                class152.field2780 += (var1 - class152.field2780) * class207.field3553 / 1000 + class214.field3642;
                if (class152.field2780 > var1) {
                    class152.field2780 = var1;
                }
            }
            if (var1 < class152.field2780) {
                class152.field2780 -= (class152.field2780 - var1) * class207.field3553 / 1000 + class214.field3642;
                if (class152.field2780 < var1) {
                    class152.field2780 = var1;
                }
            }
            if (class223.field3755 > var2) {
                class223.field3755 -= (class223.field3755 - var2) * class207.field3553 / 1000 + class214.field3642;
                if (class223.field3755 < var2) {
                    class223.field3755 = var2;
                }
            }
            if (var3 > class143.field2600) {
                class143.field2600 += (var3 - class143.field2600) * class207.field3553 / 1000 + class214.field3642;
                if (class143.field2600 > var3) {
                    class143.field2600 = var3;
                }
            }
            if (var3 < class143.field2600) {
                class143.field2600 -= class214.field3642 + ((class143.field2600 - var3) * class207.field3553 / 1000);
                if (class143.field2600 < var3) {
                    class143.field2600 = var3;
                }
            }
        } else {
            class223.field3755 = class91.field1439 * 128 + 64;
            class152.field2780 = class207.field3556 * 128 + 64;
            class143.field2600 = class174.method1265(class223.field3755, arg0 ^ 0x1FB9, class131.field2250, class152.field2780) - class68.field1116;
        }
        int var4 = class190.field3269 * 128 + 64;
        int var5 = class296.field4930 * 128 + 64;
        int var6 = class174.method1265(var5, 8100, class131.field2250, var4) - class40.field648;
        int var7 = var6 - class143.field2600;
        int var8 = var5 - class223.field3755;
        int var9 = var4 - class152.field2780;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        if (class102.field1640 < var11) {
            class102.field1640 += (var11 - class102.field1640) * class252.field4210 / 1000 + class23.field323;
            if (class102.field1640 > var11) {
                class102.field1640 = var11;
            }
        }
        if (class102.field1640 > var11) {
            class102.field1640 -= (class102.field1640 - var11) * class252.field4210 / 1000 + class23.field323;
            if (var11 > class102.field1640) {
                class102.field1640 = var11;
            }
        }
        int var13 = var12 - class29.field404;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class29.field404 += class252.field4210 * var13 / 1000 + class23.field323;
            class29.field404 &= 0x7FF;
        }
        if (arg0 != 29) {
            return;
        }
        if (var13 < 0) {
            class29.field404 -= -var13 * class252.field4210 / 1000 + class23.field323;
            class29.field404 &= 0x7FF;
        }
        int var14 = var12 - class29.field404;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class29.field404 = var12;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method555(byte arg0, Component arg1);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)I")
    public abstract int method558(boolean arg0);

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method559(Component arg0, int arg1);
}
