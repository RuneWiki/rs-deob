import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[I")
    public static int[] field179 = new int[64];

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lcd;")
    public static class64 field185 = class44.method335((byte) 71, " loggt sich aus)3");

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lja;")
    public static class60 field180;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 23)
    public static void method74(int arg0) {
        field180 = null;
        field179 = null;
        if (arg0 != 2) {
            method78(-82, (byte) -10, -72, 52);
        }
        field185 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 35)
    public static final void method75(int arg0) {
        field184++;
        if (arg0 > -115) {
            return;
        }
        if (class120.field2174[98]) {
            class131.field2335 += (12 - class131.field2335) / 2;
        } else if (class120.field2174[99]) {
            class131.field2335 += (-class131.field2335 - 12) / 2;
        } else {
            class131.field2335 /= 2;
        }
        int var1 = class139.field2472.field1865 + class181.field3112;
        if (class120.field2174[96]) {
            class250.field4351 += (-class250.field4351 - 24) / 2;
        } else if (class120.field2174[97]) {
            class250.field4351 += (24 - class250.field4351) / 2;
        } else {
            class250.field4351 /= 2;
        }
        class77.field1459 += class131.field2335 / 2;
        class241.field4157 += class250.field4351 / 2;
        int var2 = class44.field719 + class139.field2472.field1859;
        if ((class108.field2006 - var2) < -500 || (class108.field2006 - var2) > 500 || class48.field798 - var1 < -500 || class48.field798 - var1 > 500) {
            class48.field798 = var1;
            class108.field2006 = var2;
        }
        if (class108.field2006 != var2) {
            class108.field2006 += (var2 - class108.field2006) / 16;
        }
        if (class48.field798 != var1) {
            class48.field798 += (var1 - class48.field798) / 16;
        }
        class299.method2090(98048);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lqm;ILfc;Lqm;)V", line = 82)
    public static final void method76(class222 arg0, int arg1, class214 arg2, class222 arg3) {
        class82.field1509 = arg2;
        class184.field3148 = arg3;
        field178++;
        if (arg1 != -10700) {
            method75(106);
        }
        class1.field2 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I", line = 95)
    public static final int method77(int arg0, int arg1) {
        field181++;
        if (arg0 <= 32) {
            field179 = (int[]) null;
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBII)I", line = 109)
    public static final int method78(int arg0, byte arg1, int arg2, int arg3) {
        field183++;
        int var4 = class50.field829[class5.method50(arg0, arg2)];
        if (arg3 > 0) {
            int var5 = class50.field816.method658(arg3 & 0xFFFF, 93);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 <= 127) {
                    var6 = arg2 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class50.field816.method662(arg3 & 0xFFFF, (byte) 102);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                int var12 = (var4 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var10 << 8 & 0xFF0090) + ((var11 & 0xFF00) + (var12 >> 8));
            }
        }
        if (arg1 != -73) {
            method78(-97, (byte) -90, -110, 107);
        }
        return var4;
    }
}
