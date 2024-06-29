import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class165 extends InputStream {

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lwk;")
    public static class273 field2888 = new class273(50);

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Loa;")
    public static class99 field2891 = class221.method1463(2844, "Schlie-8en");

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field2890 = 0;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field2895 = 0;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Loa;")
    private static class99 field2896 = class221.method1463(2844, "flash1:");

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Loa;")
    public static class99 field2893 = field2896;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Loa;")
    public static class99 field2894 = field2896;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "Lgk;")
    public static class157 field2899;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)I")
    public static final int method1108(int arg0) {
        field2887++;
        if (arg0 <= 121) {
            return -18;
        }
        try {
            if (class103.field1752 == 0) {
                if (class138.field2437 > (class231.method1513(-60) - 5000L)) {
                    return 0;
                }
                class115.field2038 = class24.field368.method586(class129.field2260, 31, class202.field3523);
                class13.field122 = class231.method1513(-30);
                class103.field1752 = 1;
            }
            if (class13.field122 + 30000L < class231.method1513(-48)) {
                return class51.method358((byte) 80, 1000);
            }
            if (class103.field1752 == 1) {
                if (class115.field2038.field4844 == 2) {
                    return class51.method358((byte) 80, 1001);
                }
                if (class115.field2038.field4844 != 1) {
                    return -1;
                }
                class133.field2322 = new class7((Socket) class115.field2038.field4843, class24.field368);
                class115.field2038 = null;
                class131.field2277.field4587 = 0;
                int var1 = 0;
                if (class30.field554) {
                    var1 = class133.field2328;
                }
                class131.field2277.method1691(125, (byte) 53);
                class131.field2277.method1701(var1, 4994);
                class133.field2322.method55(class131.field2277.field4619, (byte) -104, 0, class131.field2277.field4587);
                if (class226.field3917 != null) {
                    class226.field3917.method1367(0);
                }
                if (class125.field2204 != null) {
                    class125.field2204.method1367(0);
                }
                int var2 = class133.field2322.method57(-66);
                if (class226.field3917 != null) {
                    class226.field3917.method1367(0);
                }
                if (class125.field2204 != null) {
                    class125.field2204.method1367(0);
                }
                if (var2 != 0) {
                    return class51.method358((byte) 80, var2);
                }
                class103.field1752 = 2;
            }
            if (class103.field1752 == 2) {
                if (class133.field2322.method62(-1) < 2) {
                    return -1;
                }
                class152.field2677 = class133.field2322.method57(-88);
                class152.field2677 <<= 0x8;
                class152.field2677 += class133.field2322.method57(-104);
                class232.field4002 = new byte[class152.field2677];
                class234.field4024 = 0;
                class103.field1752 = 3;
            }
            if (class103.field1752 != 3) {
                return -1;
            }
            int var3 = class133.field2322.method62(-1);
            if (var3 < 1) {
                return -1;
            }
            if ((class152.field2677 - class234.field4024) < var3) {
                var3 = class152.field2677 - class234.field4024;
            }
            class133.field2322.method61(-78, class232.field4002, class234.field4024, var3);
            class234.field4024 += var3;
            if (class234.field4024 < class152.field2677) {
                return -1;
            } else if (class174.method1168(class232.field4002, (byte) 59)) {
                class106.field1776 = new class144[class54.field884];
                int var4 = 0;
                for (int var5 = class141.field2487; var5 <= class69.field1142; var5++) {
                    class144 var6 = class254.method1647(var5, (byte) -56);
                    if (var6 != null) {
                        class106.field1776[var4++] = var6;
                    }
                }
                class133.field2322.method54((byte) -67);
                class265.field4691 = 0;
                class103.field1752 = 0;
                class232.field4002 = null;
                class133.field2322 = null;
                class138.field2437 = class231.method1513(-39);
                return 0;
            } else {
                return class51.method358((byte) 80, 1002);
            }
        } catch (IOException var7) {
            return class51.method358((byte) 80, 1003);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public static void method1109(boolean arg0) {
        field2896 = null;
        if (arg0) {
            field2890 = 9;
        }
        field2891 = null;
        field2899 = null;
        field2894 = null;
        field2893 = null;
        field2888 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)I")
    public static final int method1110(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ek", name = "read", descriptor = "()I")
    public final int read() {
        class100.method711(0, 30000L);
        field2892++;
        return -1;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)Loa;")
    public static final class99 method1111(int arg0, int arg1) {
        field2897++;
        return arg1 > ~class122.field2147[arg0].method659(arg1 ^ 0x41) ? class198.method1332(arg1 ^ 0xFFFFFFB0, new class99[] { class219.field3812[arg0], class199.field3469, class122.field2147[arg0] }) : class219.field3812[arg0];
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)V")
    public static final void method1112(int arg0, int arg1) {
        field2889++;
        class4 var2;
        if (class170.field3031 == null) {
            var2 = new class4(512, 512);
        } else {
            var2 = (class4) class170.field3031;
        }
        int[] var3 = var2.field35;
        int var4 = var3.length;
        for (int var5 = arg0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = ((103 - var6) * 512 * 4) + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class230.field3973[arg1][var25][var6] & 0x18) == 0) {
                    class182.method1223(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (class230.field3973[arg1 + 1][var25][var6] & 0x8) != 0) {
                    class182.method1223(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = (((int) (Math.random() * 20.0D) - 10) + 238 << 16) + 238 - (10 - ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - ((int) (Math.random() * 20.0D)));
        var2.method27();
        int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class230.field3973[arg1][var23][var9] & 0x18) == 0) {
                    class13.method86(arg1, var9, var7, var23, (byte) -50, var8);
                }
                if (arg1 < 3 && (class230.field3973[arg1 + 1][var23][var9] & 0x8) != 0) {
                    class13.method86(arg1 + 1, var9, var7, var23, (byte) -50, var8);
                }
            }
        }
        class152.field2665 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class226.method1488(class255.field4407, var10, var11);
                if (var12 != 0L) {
                    class153 var14 = class247.method1601(arg0 ^ 0x659C, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                    int var15 = var14.field2689;
                    if (var14.field2696 != null) {
                        for (int var16 = 0; var16 < var14.field2696.length; var16++) {
                            if (var14.field2696[var16] != -1) {
                                class153 var17 = class247.method1601(26012, var14.field2696[var16]);
                                if (var17.field2689 >= 0) {
                                    var15 = var17.field2689;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class177.field3091[class255.field4407].field2272;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && var10 - 3 < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var22 == 1 && var18 < 103 && var10 + 3 > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var22 == 2 && var19 > 0 && (var11 - 3) < var19 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                    var19--;
                                }
                                if (var22 == 3 && var19 < 103 && var19 < (var11 + 3) && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                    var19++;
                                }
                            }
                        }
                        class190.field3340[class152.field2665] = var14.field2709;
                        class101.field1722[class152.field2665] = var18;
                        class180.field3132[class152.field2665] = var19;
                        class152.field2665++;
                    }
                }
            }
        }
        class170.field3031 = var2;
        class123.field2156.method105(arg0 ^ 0x7C96);
    }
}
