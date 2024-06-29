import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class109 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field1643 = 0;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Z")
    public static boolean field1646 = false;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)I", line = 4)
    public static final int method829(int arg0) {
        field1647++;
        try {
            if (class151.field2284 == 0) {
                if (class261.field4013 > (class105.method789((byte) 55) - 5000L)) {
                    return 0;
                }
                class296.field4569 = class330.field5074.method65((byte) -31, class75.field1092, class203.field3114);
                class16.field205 = class105.method789((byte) 55);
                class151.field2284 = 1;
            }
            if (class105.method789((byte) 55) > class16.field205 + 30000L) {
                return class4.method29(1000, (byte) -55);
            } else if (arg0 >= -125) {
                return 71;
            } else {
                if (class151.field2284 == 1) {
                    if (class296.field4569.field3185 == 2) {
                        return class4.method29(1001, (byte) -55);
                    }
                    if (class296.field4569.field3185 != 1) {
                        return -1;
                    }
                    class1.field20 = new class237((Socket) class296.field4569.field3186, class330.field5074);
                    class85.field1236.field3866 = 0;
                    int var1 = 0;
                    class296.field4569 = null;
                    if (class132.field2012) {
                        var1 = class151.field2293;
                    }
                    class85.field1236.method1752(23, -98);
                    class85.field1236.method1773(var1, false);
                    class1.field20.method1651(0, class85.field1236.field3866, class85.field1236.field3840, (byte) -85);
                    if (class250.field3778 != null) {
                        class250.field3778.method2298((byte) 42);
                    }
                    if (class234.field3567 != null) {
                        class234.field3567.method2298((byte) 42);
                    }
                    int var2 = class1.field20.method1655(0);
                    if (class250.field3778 != null) {
                        class250.field3778.method2298((byte) 42);
                    }
                    if (class234.field3567 != null) {
                        class234.field3567.method2298((byte) 42);
                    }
                    if (var2 != 0) {
                        return class4.method29(var2, (byte) -55);
                    }
                    class151.field2284 = 2;
                }
                if (class151.field2284 == 2) {
                    if (class1.field20.method1648(0) < 2) {
                        return -1;
                    }
                    class277.field4313 = class1.field20.method1655(0);
                    class277.field4313 <<= 0x8;
                    class277.field4313 += class1.field20.method1655(0);
                    class305.field4675 = 0;
                    class151.field2284 = 3;
                    class275.field4281 = new byte[class277.field4313];
                }
                if (class151.field2284 != 3) {
                    return -1;
                }
                int var3 = class1.field20.method1648(0);
                if (var3 < 1) {
                    return -1;
                }
                if ((class277.field4313 - class305.field4675) < var3) {
                    var3 = class277.field4313 - class305.field4675;
                }
                class1.field20.method1656(var3, true, class305.field4675, class275.field4281);
                class305.field4675 += var3;
                if (class305.field4675 < class277.field4313) {
                    return -1;
                } else if (class87.method645(class275.field4281, -70)) {
                    class157.field2393 = new class163[class338.field5253];
                    int var4 = 0;
                    for (int var5 = class41.field591; var5 <= class320.field4957; var5++) {
                        class163 var6 = class25.method194((byte) 43, var5);
                        if (var6 != null) {
                            class157.field2393[var4++] = var6;
                        }
                    }
                    class1.field20.method1653(-19746);
                    class275.field4281 = null;
                    class151.field2284 = 0;
                    class323.field4990 = 0;
                    class1.field20 = null;
                    class261.field4013 = class105.method789((byte) 55);
                    return 0;
                } else {
                    return class4.method29(1002, (byte) -55);
                }
            }
        } catch (IOException var8) {
            return class4.method29(1003, (byte) -55);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)Lj;", line = 141)
    public static final class242 method830(int arg0, int arg1, int arg2, int arg3) {
        class242 var4 = new class242();
        if (arg0 <= 97) {
            return (class242) null;
        }
        var4.field3683 = arg1;
        field1649++;
        var4.field3689 = arg2;
        class222.field3383.method1708((long) arg3, (byte) -79, var4);
        class149.method1122(arg2, 13438);
        class161 var5 = class331.method2308((byte) -124, arg3);
        if (var5 != null) {
            class254.method1776(4, var5);
        }
        if (class29.field352 != null) {
            class254.method1776(4, class29.field352);
            class29.field352 = null;
        }
        int var6 = class32.field393;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class63.method429(class118.field1843[var7], (byte) -52)) {
                class165.method1256((byte) 94, var7);
            }
        }
        if (class32.field393 == 1) {
            class330.field5089 = false;
            class278.method1927(class139.field2095, class61.field821, (byte) -90, class205.field3145, class183.field2901);
        } else {
            class278.method1927(class139.field2095, class61.field821, (byte) -90, class205.field3145, class183.field2901);
            int var8 = class167.field2703.method2281(class130.field2002);
            for (int var9 = 0; var9 < class32.field393; var9++) {
                int var10 = class167.field2703.method2281(class90.method656(3, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class139.field2095 = class32.field393 * 15 + (class264.field4093 ? 26 : 22);
            class183.field2901 = var8 + 8;
        }
        if (var5 != null) {
            class255.method1793((byte) -108, var5, false);
        }
        class85.method642(5, arg2);
        if (class28.field334 != -1) {
            class153.method1155(1, -1, class28.field334);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V", line = 222)
    public static final void method831(byte arg0) {
        while (true) {
            if (class204.field3136.method1135(class241.field3679, (byte) 42) >= 27) {
                int var1 = class204.field3136.method1132(15, 111);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class264.field4064[var1] == null) {
                        var2 = true;
                        class264.field4064[var1] = new class76();
                    }
                    class76 var3 = class264.field4064[var1];
                    class272.field4252[class52.field702++] = var1;
                    var3.field4711 = class233.field3542;
                    if (var3.field1104 != null && var3.field1104.method2327((byte) 73)) {
                        class28.method208(true, var3);
                    }
                    int var4 = class204.field3136.method1132(5, 113);
                    int var5 = class204.field3136.method1132(1, 112);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    if (var5 == 1) {
                        class219.field3351[class67.field970++] = var1;
                    }
                    int var6 = class204.field3136.method1132(5, 127);
                    int var7 = class324.field5000[class204.field3136.method1132(3, 117)];
                    if (var2) {
                        var3.field4674 = var3.field4682 = var7;
                    }
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    var3.method597((byte) -63, class242.method1676(class204.field3136.method1132(14, arg0 ^ 0x18), 64));
                    int var8 = class204.field3136.method1132(1, 124);
                    var3.method2094(var3.field1104.field5181, 7);
                    var3.field4767 = var3.field1104.field5138;
                    var3.field4758 = var3.field1104.field5123;
                    if (var3.field4758 == 0) {
                        var3.field4682 = 0;
                    }
                    var3.method2089(class39.field575.field4676[0] + var6, var3.method1897(8), false, var8 == 1, class39.field575.field4744[0] + var4);
                    if (var3.field1104.method2327((byte) 82)) {
                        class83.method635(var3, var3.field4676[0], (class270) null, -70, 0, class265.field4112, (class32) null, var3.field4744[0]);
                    }
                    continue;
                }
            }
            if (arg0 != 99) {
                return;
            }
            class204.field3136.method1133(8);
            field1651++;
            return;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V", line = 302)
    public static final void method832(byte arg0) {
        field1645++;
        class48.method369((byte) 92, class245.field3705);
        int var1 = (class190.field2976 >> 10) + (class327.field5054 >> 3);
        byte var2 = 0;
        byte var3 = 8;
        int var4 = (class293.field4522 >> 3) + (class197.field3028 >> 10);
        byte var5 = 8;
        byte var6 = 18;
        class5.field67 = new byte[var6][];
        class238.field3623 = new byte[var6][];
        class322.field4963 = new byte[var6][];
        class137.field2069 = new byte[var6][];
        class63.field854 = new int[var6];
        class51.field683 = new int[var6];
        class331.field5116 = new int[var6];
        class139.field2087 = new int[var6];
        class187.field2946 = new int[var6][4];
        class226.field3459 = new int[var6];
        int var7 = 91 % ((arg0 + 61) / 51);
        class110.field1653 = new int[var6];
        class299.field4605 = new byte[var6][];
        int var8 = 0;
        for (int var9 = (var1 - 6) / 8; var9 <= ((var1 + 6) / 8); var9++) {
            for (int var10 = (var4 - 6) / 8; var10 <= (var4 + 6) / 8; var10++) {
                int var11 = (var9 << 8) + var10;
                class139.field2087[var8] = var11;
                class63.field854[var8] = class153.field2329.method690((byte) -125, "m" + var9 + "_" + var10);
                class51.field683[var8] = class153.field2329.method690((byte) -124, "l" + var9 + "_" + var10);
                class110.field1653[var8] = class153.field2329.method690((byte) -114, "n" + var9 + "_" + var10);
                class331.field5116[var8] = class153.field2329.method690((byte) -123, "um" + var9 + "_" + var10);
                class226.field3459[var8] = class153.field2329.method690((byte) -112, "ul" + var9 + "_" + var10);
                if (class110.field1653[var8] == -1) {
                    class63.field854[var8] = -1;
                    class51.field683[var8] = -1;
                    class331.field5116[var8] = -1;
                    class226.field3459[var8] = -1;
                }
                var8++;
            }
        }
        for (int var12 = var8; var12 < class110.field1653.length; var12++) {
            class110.field1653[var12] = -1;
            class63.field854[var12] = -1;
            class51.field683[var12] = -1;
            class331.field5116[var12] = -1;
            class226.field3459[var12] = -1;
        }
        class214.method1534(true, var2, var4, false, (byte) -76, var3, var1, var5);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V", line = 383)
    public static final void method833(byte arg0) {
        field1644++;
        class65.field938.method750((byte) 126);
        if (arg0 != 106) {
            method832((byte) 46);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[F", line = 414)
    public static final float[] method834(int arg0, int arg1) {
        field1652++;
        if (arg0 != 8514) {
            method831((byte) 94);
        }
        float var2 = class179.method1342() + class179.method1336();
        int var3 = class179.method1337();
        class136.field2058[3] = 1.0F;
        float var4 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var5 = (float) ((var3 & 0xFFA1) >> 8) / 255.0F;
        float var6 = 0.58823526F;
        class136.field2058[0] = (float) (class149.method1117(16757767, arg1) >> 16) / 255.0F * var4 * var6 * var2;
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        class136.field2058[1] = var2 * var6 * var5 * ((float) class149.method1117(255, arg1 >> 8) / 255.0F);
        class136.field2058[2] = var7 * ((float) class149.method1117(arg1, 255) / 255.0F) * var6 * var2;
        return class136.field2058;
    }
}
