import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class82 extends class283 {

    @OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
    public static int field1468 = -1;

    @OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
    public static int field1471 = 0;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!wl", name = "q", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!wl", name = "r", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!wl", name = "t", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lql;B)V", line = 5)
    public static final void method520(class16 arg0, byte arg1) {
        field1467++;
        int var2 = arg0.field426 - class293.field5011;
        int var3 = arg0.field421 * 128 + (arg0.method118(-1) * 64);
        int var4 = arg0.field440 * 128 + arg0.method118(-1) * 64;
        if (arg0.field413 == 0) {
            arg0.field476 = 1024;
        }
        arg0.field459 = 0;
        arg0.field418 += (var4 - arg0.field418) / var2;
        arg0.field478 += (var3 - arg0.field478) / var2;
        if (arg0.field413 == 1) {
            arg0.field476 = 1536;
        }
        if (arg0.field413 == 2) {
            arg0.field476 = 0;
        }
        if (arg1 >= -12) {
            field1471 = 72;
        }
        if (arg0.field413 == 3) {
            arg0.field476 = 512;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V", line = 39)
    public static final void method521(int arg0, int arg1) {
        class276.field4774.method1833(arg0, (byte) 73);
        if (arg1 == 3826) {
            field1470++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIII)Z", line = 65)
    public static final boolean method522(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class306.field5210 * arg3 + class291.field4974 * arg0 >> 16;
        int var6 = class291.field4974 * arg3 - class306.field5210 * arg0 >> 16;
        int var7 = class50.field990 * var6 + class266.field4613 * arg1 >> 16;
        int var8 = class50.field990 * arg1 - class266.field4613 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class50.field990 * var6 + class266.field4613 * arg2 >> 16;
        int var12 = class50.field990 * arg2 - class266.field4613 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class170.field2965 && var13 < class170.field2965) {
            return false;
        } else if (var9 > class98.field1704 && var13 > class98.field1704) {
            return false;
        } else if (var10 < class262.field4550 && var14 < class262.field4550) {
            return false;
        } else {
            return var10 <= class8.field189 || var14 <= class8.field189;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLdj;)V", line = 116)
    public static final void method523(byte arg0, class314 arg1) {
        class53.field1036 = arg1;
        field1469++;
        if (arg0 != 21) {
            method523((byte) -5, (class314) null);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[I[III)V", line = 128)
    public static final void method524(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            field1471 = -60;
        }
        field1472++;
        if (arg3 >= arg4) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg3;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg4];
        arg2[arg4] = var7;
        int var8 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var8;
        for (int var9 = arg3; var9 < arg4; var9++) {
            if (var7 + (var9 & 0x1) < arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                int var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg2[arg4] = arg2[var6];
        arg2[var6] = var7;
        arg1[arg4] = arg1[var6];
        arg1[var6] = var8;
        method524(0, arg1, arg2, arg3, var6 - 1);
        method524(0, arg1, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I", line = 184)
    public static final int method525(int arg0) {
        field1464++;
        return arg0 == 0 ? ((class158.field2699 == 0 ? 0 : 1) << 22) + ((class139.field2391 == 0 ? 0 : 1) << 21) + (class238.field4073 & 0x3 << 17) + (class182.field3197 & 0x3 << 11) + ((class114.field1916 ? 1 : 0) << 10) + ((class22.field545 ? 1 : 0) << 7) + ((class228.field3968 ? 1 : 0) << 5) + ((class116.field1969 ? 1 : 0) << 4) + ((class17.field496 ? 1 : 0) << 3) + (class254.field4378 & 0x7) + (((class1.field12 ? 1 : 0) << 6) - (-((class260.field4512 ? 1 : 0) << 8) - ((class121.field2039 ? 1 : 0) << 9) - (((class90.field1536 ? 1 : 0) << 13) - (-((class240.field4101 ? 1 : 0) << 15) + (-((class271.field4693 ? 1 : 0) << 16) - ((class31.field689 ? 1 : 0) << 19)) - ((class214.field3778 == 0 ? 0 : 1) << 20))))) : 42;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lmh;Z)Lmh;", line = 202)
    public static final class128 method526(class128 arg0, boolean arg1) {
        int var2 = class163.method1070(arg0, -1);
        if (arg1) {
            field1468 = 38;
        }
        field1465++;
        return var2 == -1 ? class153.field2627 : class144.field2465.field1049[var2].method842(class207.field3635, 0, class54.field1054);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIII)V", line = 221)
    public static final void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1466++;
        if (arg3 != -7142) {
            field1471 = -101;
        }
        class199[] var7 = class260.field4489;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class199 var9 = var7[var8];
            if (var9 != null && var9.field3475 == 2) {
                class284.method1966(true, (var9.field3471 - class4.field72 << 7) + var9.field3479, (var9.field3478 - class221.field3889 << 7) + var9.field3481, arg4, var9.field3469 * 2, arg6 >> 1, arg2 >> 1, arg5);
                if (class128.field2205 > -1 && (class293.field5011 % 20) < 10) {
                    class242.field4147[var9.field3474].method273(arg0 - (12 - class128.field2205), class193.field3339 + arg1 - 28);
                }
            }
        }
    }
}
