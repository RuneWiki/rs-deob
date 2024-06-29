import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class199 extends class137 {

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "J")
    public long field3190;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[I")
    public static int[] field3193 = new int[50];

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field3191 = -1;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field3195 = 0;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "[[[I")
    public static int[][][] field3192;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public static void method1372(int arg0) {
        int var1 = 71 / ((arg0 + 34) / 61);
        field3192 = null;
        field3193 = null;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class199() {
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(J)V")
    public class199(long arg0) {
        this.field3190 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILcj;Lth;)V")
    public static final void method1373(int arg0, class125 arg1, class119 arg2) {
        class2 var3 = arg1.method858((byte) 100);
        field3194++;
        if (var3 == null) {
            return;
        }
        int var4 = arg2.field1875;
        int var5 = arg2.field1876;
        int var6 = 0;
        int var7 = var3.field3179;
        int var8 = 0;
        if (var3.field3181 > var3.field3179) {
            var7 = var3.field3181;
        }
        int var9 = 0;
        if (arg1.field1999 != null) {
            var6 = class183.field3043.method525(arg1.field1999, (int[]) null, class253.field4145);
            for (int var10 = 0; var10 < var6; var10++) {
                String var11 = class253.field4145[var10];
                if (var6 - 1 > var10) {
                    var11 = var11.substring(0, var11.length() - 4);
                }
                int var12 = class117.field1805.method1463(var11);
                if (var9 < var12) {
                    var9 = var12;
                }
            }
            var8 = (var6 - 1) * class117.field1805.method1459() + class117.field1805.method1461() / 2;
        }
        int var13 = arg2.field1876;
        int var14 = arg2.field1875 - (var8 / arg0);
        if ((class262.field4285 + var7) > var5) {
            var13 = var7 / 2 + var9 / 2 + class262.field4285 + var7 + 5;
            var5 = class262.field4285 + var7;
        } else if (var5 > class262.field4293 - var7) {
            var5 = class262.field4293 - var7;
            var13 = class262.field4293 - (var9 / 2) - var7 - (var7 / 2) - 5;
        }
        if ((class262.field4291 + var7) > var4) {
            var4 = class262.field4291 + var7;
            var14 = var7 + (var7 / 2) + class262.field4291 + class117.field1805.method1459();
        } else if (var4 > (class262.field4279 - var7)) {
            var14 = class262.field4279 - var7 - var8 - (var7 / 2);
            var4 = class262.field4279 - var7;
        }
        int var15 = var7 >> 1;
        int var16 = (int) (Math.atan2((double) (var5 - arg2.field1876), (double) (var4 - arg2.field1875)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        int var17 = -2;
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        var3.method16(var3.field3177 << 3, var3.field3178 << 3, (var5 << 4) + var15, (var4 << 4) + var15, var16, 4096);
        if (arg1.field1999 != null) {
            var17 = var13 - (var9 / 2) - 5;
            var18 = var17 + var9 + 10;
            var19 = (var14 - 3) - class117.field1805.method1461();
            var20 = var19 + class117.field1805.method1459() * var6;
            if (arg1.field2002 != 0) {
                class94.method668(var17, var19, var18 - var17, -var19 + var20, arg1.field2002, arg1.field2002 >>> 24);
            }
            if (arg1.field2009 != 0) {
                class94.method665(var17, var19, var18 - var17, -var19 + var20, arg1.field2009, arg1.field2009 >>> 24);
            }
            for (int var21 = 0; var21 < var6; var21++) {
                String var22 = class253.field4145[var21];
                if (var21 < var6 - 1) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                class117.field1805.method1457(var22, var13, var14, arg1.field1990, true);
                var14 += class117.field1805.method1459();
            }
        }
        if (class287.field4640 <= var5 - var15 || class287.field4640 >= (var5 + var15) || class55.field797 <= (var4 - var15) || var4 + var15 <= class55.field797 && var17 >= class287.field4640 || class287.field4640 >= var18 || class55.field797 <= var19 || var20 <= class55.field797) {
            return;
        }
        if (arg1.field1993[4] != null) {
            class205.method1420(arg1.field1993[4], (long) arg2.field1877, arg0 ^ 0x6B, 0, 0, -1, arg1.field2001, (short) 1006);
        }
        if (arg1.field1993[3] != null) {
            class205.method1420(arg1.field1993[3], (long) arg2.field1877, arg0 ^ 0x70, 0, 0, -1, arg1.field2001, (short) 1011);
        }
        if (arg1.field1993[2] != null) {
            class205.method1420(arg1.field1993[2], (long) arg2.field1877, 109, 0, 0, -1, arg1.field2001, (short) 1009);
        }
        if (arg1.field1993[1] != null) {
            class205.method1420(arg1.field1993[1], (long) arg2.field1877, 118, 0, 0, -1, arg1.field2001, (short) 1003);
        }
        if (arg1.field1993[0] != null) {
            class205.method1420(arg1.field1993[0], (long) arg2.field1877, arg0 ^ 0x64, 0, 0, -1, arg1.field2001, (short) 1001);
            return;
        }
    }
}
