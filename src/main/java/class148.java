import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class148 extends class213 {

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public int field2048 = 0;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lfd;II)V", line = 4)
    private final void method1137(class299 arg0, int arg1, int arg2) {
        if (~arg1 == arg2) {
            this.field2048 = arg0.method2083((byte) -66);
        }
        field2049++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)Lua;", line = 21)
    public static final class157 method1138(int arg0, int arg1) {
        field2055++;
        class157 var2 = (class157) class287.field4120.method2265((long) arg1, (byte) -121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class124.field1650.method1089(class330.method2285(arg1, ~arg0), (byte) 116, class206.method1494(arg1, (byte) 22));
        class157 var4 = new class157();
        var4.field2214 = arg1;
        if (var3 != null) {
            var4.method1208(new class299(var3), (byte) -92);
        }
        var4.method1206(0);
        if (arg0 == -3) {
            class287.field4120.method2257(-126, var4, (long) arg1);
            return var4;
        } else {
            return (class157) null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "(B)V", line = 48)
    public static final void method1139(byte arg0) {
        field2051++;
        if (class160.field2270 == -1 || class297.field4315 == -1) {
            return;
        }
        int var1 = ((class67.field866 - class333.field5166) * class245.field3589 >> 16) + class333.field5166;
        float[] var2 = new float[3];
        class245.field3589 += var1;
        if (class245.field3589 < 65535) {
            class161.field2294 = false;
            class158.field2257 = false;
        } else {
            class245.field3589 = 65535;
            if (class158.field2257) {
                class161.field2294 = false;
            } else {
                class161.field2294 = true;
            }
            class158.field2257 = true;
        }
        int var3 = -27 % ((-arg0 - 7) / 39);
        float var4 = (float) class245.field3589 / 65535.0F;
        int var5 = class125.field1671 * 2;
        for (int var6 = 0; var6 < 3; var6++) {
            int var7 = class138.field1897[class160.field2270][var5][var6] * 3;
            int var8 = class138.field1897[class160.field2270][var5 + 1][var6] * 3;
            int var9 = (class138.field1897[class160.field2270][var5 + 2][var6] + class138.field1897[class160.field2270][var5 + 2][var6] - class138.field1897[class160.field2270][var5 + 3][var6]) * 3;
            int var10 = class138.field1897[class160.field2270][var5][var6];
            int var11 = var8 - var7;
            int var12 = var7 + var9 - (var8 * 2);
            int var13 = class138.field1897[class160.field2270][var5 + 2][var6] + var8 - var10 - var9;
            var2[var6] = (((float) var13 * var4 + (float) var12) * var4 + (float) var11) * var4 + (float) var10;
        }
        class248.field3606 = (int) var2[2] - (class355.field5556 * 128);
        class343.field5332 = (int) var2[1] * -1;
        float[] var14 = new float[3];
        class112.field1453 = (int) var2[0] - (class331.field4867 * 128);
        int var15 = class306.field4475 * 2;
        for (int var16 = 0; var16 < 3; var16++) {
            int var17 = class138.field1897[class297.field4315][var15][var16] * 3;
            int var18 = class138.field1897[class297.field4315][var15 + 1][var16] * 3;
            int var19 = (class138.field1897[class297.field4315][var15 + 2][var16] + class138.field1897[class297.field4315][var15 + 2][var16] - class138.field1897[class297.field4315][var15 + 3][var16]) * 3;
            int var20 = class138.field1897[class297.field4315][var15][var16];
            int var21 = var18 - var17;
            int var22 = class138.field1897[class297.field4315][var15 + 2][var16] + var18 - var20 - var19;
            int var23 = var17 + var19 - (var18 * 2);
            var14[var16] = (((float) var22 * var4 + (float) var23) * var4 + (float) var21) * var4 + (float) var20;
        }
        float var24 = var14[0] - var2[0];
        float var25 = var14[2] - var2[2];
        float var26 = (var14[1] - var2[1]) * -1.0F;
        double var27 = Math.sqrt((double) (var24 * var24 + var25 * var25));
        class40.field504 = (float) Math.atan2((double) var26, var27);
        class13.field156 = -((float) Math.atan2((double) var24, (double) var25));
        class347.field5398 = (int) ((double) class13.field156 * 325.949D) & 0x7FF;
        class94.field1222 = (int) ((double) class40.field504 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(JIILjava/lang/String;Ljava/lang/String;SIB)V", line = 153)
    public static final void method1140(long arg0, int arg1, int arg2, String arg3, String arg4, short arg5, int arg6, byte arg7) {
        field2052++;
        if (class159.field2263) {
            return;
        }
        if (class66.field853 < 500) {
            class185.field2524[class66.field853] = arg4;
            class328.field4805[class66.field853] = arg3;
            class42.field533[class66.field853] = arg6 == -1 ? class99.field1300 : arg6;
            class156.field2169[class66.field853] = arg5;
            class199.field2801[class66.field853] = arg0;
            class95.field1243[class66.field853] = arg1;
            class156.field2159[class66.field853] = arg2;
            class66.field853++;
        }
        int var9 = 17 / ((arg7 + 18) / 34);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 180)
    public static final void method1141(boolean arg0) {
        field2054++;
        int var1 = 0;
        if (arg0) {
            method1141(false);
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class132.method1008(var1, var2, false, true, var3, class345.field5367)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILfd;)V", line = 215)
    public final void method1142(int arg0, class299 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method2096((byte) -122);
            if (var3 == 0) {
                field2053++;
                return;
            }
            this.method1137(arg1, var3, -3);
        }
    }
}
