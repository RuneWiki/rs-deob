import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class730 extends class379 {

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "[Ljava/awt/Color;")
    public static Color[] field10228 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field10230 = 64;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field10232 = 0;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "Z")
    public static boolean field10234 = false;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field10227;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field10229;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field10231;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static final void method4123(int arg0) {
        if (arg0 != 16711935) {
            field10234 = true;
        }
        if (class47.field629 >= 0) {
            long var1 = class349.method2069(true);
            class47.field629 = (int) ((long) class47.field629 - (var1 - class228.field2706));
            if (class47.field629 > 0) {
                int var3 = (class47.field629 << 8) / class297.field3539;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class93.field1226 = ((class611.field8199 & 0xFF00) * var3 + (class725.field10167.field1748 & 0xFF00) * var4 & 0xFF0000) + ((class611.field8199 & 0xFF00FF) * var3 + (class725.field10167.field1748 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class112.field1415 = (class725.field10167.field1740 - class741.field10311) * var6 + class741.field10311;
                class591.field8034 = (class725.field10167.field1741 - class622.field8542) * var6 + class622.field8542;
                class394.field5103 = (class725.field10167.field1738 - class77.field1047) * var6 + class77.field1047;
                class369.field4592 = (class725.field10167.field1743 - class417.field5442) * var6 + class417.field5442;
                class228.field2708 = class188.field2270 * var3 + class725.field10167.field1749 * var4 >> 8;
                class361.field4490 = ((class593.field8048 & 0xFF00FF) * var3 + ((class725.field10167.field1739 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class593.field8048 & 0xFF00) * var3 + (class725.field10167.field1739 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class349.field4351 = (class725.field10167.field1746 - class272.field3203) * var6 + class272.field3203;
                class173.field2066 = (class725.field10167.field1750 - class225.field2632) * var6 + class225.field2632;
                if (class777.field10738 != class725.field10167.field1747) {
                    class731.field10241 = class390.field5065.method65(class777.field10738, class725.field10167.field1747, var6, class731.field10241);
                }
            } else {
                class173.field2066 = class725.field10167.field1750;
                class47.field629 = -1;
                class394.field5103 = class725.field10167.field1738;
                class361.field4490 = class725.field10167.field1739;
                class731.field10241 = class725.field10167.field1747;
                class349.field4351 = class725.field10167.field1746;
                class112.field1415 = class725.field10167.field1740;
                class591.field8034 = class725.field10167.field1741;
                class369.field4592 = class725.field10167.field1743;
                class228.field2708 = class725.field10167.field1749;
                class93.field1226 = class725.field10167.field1748;
            }
            class228.field2706 = var1;
        }
        field10229++;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)J")
    public abstract long method1938(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
    public static void method4124(byte arg0) {
        field10228 = null;
        if (arg0 != -91) {
            field10232 = 35;
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)I")
    public abstract int method1937(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIB)V")
    public static final void method4125(int arg0, int arg1, byte arg2) {
        field10231++;
        class714 var3 = class350.method2072((long) arg0, 1, (byte) 116);
        var3.method4043(arg2 ^ 0x18D5);
        if (arg2 != 57) {
            field10228 = null;
        }
        var3.field10021 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)I")
    public abstract int method1936(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Z")
    public static final boolean method4126(int arg0, int arg1) {
        if (arg0 != -18060) {
            field10234 = false;
        }
        field10227++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)I")
    public abstract int method1941(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method4127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field10233++;
        if (arg2 == arg7 && arg1 == arg5 && arg0 == arg4 && arg3 == arg9) {
            class151.method1085(arg2, arg5, arg3, -1, arg4, arg6);
        } else {
            int var10 = arg2;
            int var11 = arg5;
            int var12 = arg2 * 3;
            int var13 = arg5 * 3;
            int var14 = arg7 * 3;
            int var15 = arg1 * 3;
            int var16 = arg0 * 3;
            int var17 = arg9 * 3;
            int var18 = arg4 - var16 - (-var14 - -arg2);
            int var19 = arg3 - (arg5 - var15) - var17;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var29 + var31 + var27 >> 12) + arg2;
                int var34 = (var30 + var32 + var28 >> 12) + arg5;
                class151.method1085(var10, var11, var34, arg8 + 4, var33, arg6);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg8 != -5) {
            field10232 = -126;
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)I")
    public abstract int method1944(byte arg0);
}
