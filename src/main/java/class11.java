import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class11 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field152 = 0;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field157 = "";

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILjj;I)[Lol;")
    public static final class209[] method64(int arg0, int arg1, class134 arg2, int arg3) {
        field154++;
        if (arg1 != -22808) {
            method64(126, -30, (class134) null, -71);
        }
        return class227.method1499((byte) -74, arg2, arg0, arg3) ? class82.method602(-28119) : null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field155++;
        int var8 = class18.method125(arg5 ^ 0xFFFFFC50, arg7, client.field3617, class156.field2507);
        int var9 = class18.method125(-24914, arg4, client.field3617, class156.field2507);
        int var10 = class18.method125(-24914, arg2, class121.field2042, class58.field817);
        int var11 = class18.method125(arg5 - 50256, arg1, class121.field2042, class58.field817);
        int var12 = class18.method125(-24914, arg3 + arg7, client.field3617, class156.field2507);
        int var13 = class18.method125(-24914, arg4 - arg3, client.field3617, class156.field2507);
        for (int var14 = var8; var14 < var12; var14++) {
            class168.method1184(128, var11, var10, arg0, class85.field1162[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class168.method1184(128, var11, var10, arg0, class85.field1162[var15]);
        }
        int var16 = class18.method125(-24914, arg2 + arg3, class121.field2042, class58.field817);
        int var17 = class18.method125(-24914, arg1 - arg3, class121.field2042, class58.field817);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class85.field1162[var18];
            class168.method1184(128, var16, var10, arg0, var19);
            class168.method1184(arg5 ^ 0x627E, var17, var16, arg6, var19);
            class168.method1184(128, var11, var17, arg0, var19);
        }
        if (arg5 != 25342) {
            method65(127, 120, -51, 66, 3, 126, 42, 101);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static final void method66(int arg0) {
        field153++;
        int var1 = class214.field3450 * 128 + 64;
        int var2 = class99.field1513 * 128 + 64;
        int var3 = class220.method1461(var2, class28.field336, var1, 18) - client.field3599;
        if (class171.field2761 < 100) {
            if (var3 > class193.field3108) {
                class193.field3108 += (var3 - class193.field3108) * class171.field2761 / 1000 + class230.field3659;
                if (class193.field3108 > var3) {
                    class193.field3108 = var3;
                }
            }
            if (var2 > class44.field522) {
                class44.field522 += (var2 - class44.field522) * class171.field2761 / 1000 + class230.field3659;
                if (var2 < class44.field522) {
                    class44.field522 = var2;
                }
            }
            if (class44.field522 > var2) {
                class44.field522 -= (class44.field522 - var2) * class171.field2761 / 1000 + class230.field3659;
                if (class44.field522 < var2) {
                    class44.field522 = var2;
                }
            }
            if (var1 > class119.field2014) {
                class119.field2014 += class230.field3659 + ((var1 - class119.field2014) * class171.field2761 / 1000);
                if (var1 < class119.field2014) {
                    class119.field2014 = var1;
                }
            }
            if (class193.field3108 > var3) {
                class193.field3108 -= class230.field3659 + ((class193.field3108 - var3) * class171.field2761 / 1000);
                if (var3 > class193.field3108) {
                    class193.field3108 = var3;
                }
            }
            if (var1 < class119.field2014) {
                class119.field2014 -= (class119.field2014 - var1) * class171.field2761 / 1000 + class230.field3659;
                if (class119.field2014 < var1) {
                    class119.field2014 = var1;
                }
            }
        } else {
            class119.field2014 = class214.field3450 * 128 + 64;
            class44.field522 = class99.field1513 * 128 + 64;
            class193.field3108 = class220.method1461(class44.field522, class28.field336, class119.field2014, 119) - client.field3599;
        }
        int var4 = class233.field3702 * 128 + 64;
        int var5 = class78.field1064 * 128 + 64;
        int var6 = class220.method1461(var4, class28.field336, var5, 85) - class173.field2799;
        int var7 = var6 - class193.field3108;
        int var8 = var4 - class44.field522;
        int var9 = var5 - class119.field2014;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        if (var11 > 383) {
            var11 = 383;
        }
        int var13 = var12 - class244.field3910;
        if (var11 > class8.field119) {
            class8.field119 += (var11 - class8.field119) * class34.field420 / 1000 + class124.field2075;
            if (var11 < class8.field119) {
                class8.field119 = var11;
            }
        }
        if (class8.field119 > var11) {
            class8.field119 -= (class8.field119 - var11) * class34.field420 / 1000 + class124.field2075;
            if (class8.field119 < var11) {
                class8.field119 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class244.field3910 += class124.field2075 + (class34.field420 * var13 / 1000);
            class244.field3910 &= 0x7FF;
        }
        if (var13 < 0) {
            class244.field3910 -= class124.field2075 + (-var13 * class34.field420 / 1000);
            class244.field3910 &= 0x7FF;
        }
        int var14 = var12 - class244.field3910;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (arg0 <= 18) {
            field152 = -125;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class244.field3910 = var12;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method67(byte arg0) {
        if (arg0 != -125) {
            method64(14, 73, (class134) null, -89);
        }
        field157 = null;
    }
}
