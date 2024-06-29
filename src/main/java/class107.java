import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class107 extends InputStream {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "[Lli;")
    public static class185[] field1922 = new class185[500];

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lli;")
    public static class185 field1928 = class245.method1649("brillant2:", 126);

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lli;")
    private static class185 field1932 = class245.method1649("Attack", -8);

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Lli;")
    public static class185 field1924 = field1932;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lhi;")
    public static class250 field1926;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "Lhi;")
    public static class250 field1931;

    @OriginalMember(owner = "client!sk", name = "read", descriptor = "()I")
    public final int read() {
        field1927++;
        class212.method1488(30000L, -70);
        return -1;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILli;II)V")
    public static final void method753(int arg0, int arg1, class185 arg2, int arg3, int arg4) {
        field1923++;
        class82 var5 = class157.method1115(6684, arg3, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field1496 != null) {
            class121 var6 = new class121();
            var6.field2206 = arg2;
            var6.field2196 = var5;
            var6.field2198 = var5.field1496;
            var6.field2201 = arg0;
            class274.method1877(var6, (byte) -77);
        }
        boolean var7 = true;
        if (var5.field1599 > 0) {
            var7 = class271.method1856(250, var5);
        }
        if (!var7 || !class145.method1038(arg0 - 1, client.method1502(var5), 15975)) {
            return;
        }
        if (arg0 == 1) {
            class214.field3906++;
            class182.field3349.method577(248, 0);
            class182.field3349.method842(arg3, -6596);
            class182.field3349.method856(31133, arg1);
        }
        if (arg0 == 2) {
            class182.field3349.method577(50, 0);
            class173.field3170++;
            class182.field3349.method842(arg3, -6596);
            class182.field3349.method856(31133, arg1);
        }
        if (arg0 == 3) {
            class26.field432++;
            class182.field3349.method577(24, 0);
            class182.field3349.method842(arg3, -6596);
            class182.field3349.method856(31133, arg1);
        }
        if (arg0 == 4) {
            class182.field3349.method577(6, 0);
            class259.field4599++;
            class182.field3349.method842(arg3, -6596);
            class182.field3349.method856(31133, arg1);
        }
        if (arg0 == 5) {
            class182.field3349.method577(71, 0);
            class248.field4409++;
            class182.field3349.method842(arg3, -6596);
            class182.field3349.method856(31133, arg1);
        }
        if (arg4 <= 25) {
            return;
        }
        if (arg0 == 6) {
            class182.field3349.method577(82, 0);
            class77.field1351++;
            class182.field3349.method842(arg3, -6596);
            class182.field3349.method856(31133, arg1);
        }
        if (arg0 == 7) {
            class182.field3349.method577(177, 0);
            class40.field636++;
            class182.field3349.method842(arg3, -6596);
            class182.field3349.method856(31133, arg1);
        }
        if (arg0 == 8) {
            class274.field4868++;
            class182.field3349.method577(59, 0);
            class182.field3349.method842(arg3, -6596);
            class182.field3349.method856(31133, arg1);
        }
        if (arg0 == 9) {
            class184.field3385++;
            class182.field3349.method577(231, 0);
            class182.field3349.method842(arg3, -6596);
            class182.field3349.method856(31133, arg1);
        }
        if (arg0 == 10) {
            class182.field3349.method577(242, 0);
            class229.field4163++;
            class182.field3349.method842(arg3, -6596);
            class182.field3349.method856(31133, arg1);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method754(int arg0) {
        field1926 = null;
        field1922 = null;
        if (arg0 != -1209290141) {
            method753(-116, -8, (class185) null, 23, 126);
        }
        field1928 = null;
        field1931 = null;
        field1932 = null;
        field1924 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)I")
    public static final int method755(boolean arg0) {
        field1929++;
        return arg0 ? -35 : ((~class250.field4461 == -1 ? 0 : 1) << 20) + ((class140.field2634 ? 1 : 0) << 19) + ((class217.field3979 ? 1 : 0) << 13) + ((class152.field2884 ? 1 : 0) << 9) + ((class7.field160 ? 1 : 0) << 8) + ((class1.field30 ? 1 : 0) << 7) + (((class32.field533 ? 1 : 0) << 5) + (class215.field3951 & 0x7) + ((class156.field2962 ? 1 : 0) << 3) - (-((class163.field3055 ? 1 : 0) << 4) + -((class225.field4116 ? 1 : 0) << 6))) + (((class194.field3578 ? 1 : 0) << 10) + (class84.field1666 & 0x3 << 11) - (-((class14.field237 ? 1 : 0) << 15) + -((class178.field3262 ? 1 : 0) << 16) - (((class193.field3568 == 0 ? 0 : 1) << 21) - -((~class280.field4965 == -1 ? 0 : 1) << 22)))) + (class16.method121() << 23);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BII[B)Z")
    public static final boolean method756(byte arg0, int arg1, int arg2, byte[] arg3) {
        field1934++;
        if (arg0 >= -33) {
            method759(-17);
        }
        class118 var4 = new class118(arg3);
        int var5 = -1;
        boolean var6 = true;
        label58: while (true) {
            int var7 = var4.method823((byte) -104);
            if (var7 == 0) {
                return var6;
            }
            boolean var8 = false;
            int var9 = 0;
            var5 += var7;
            while (true) {
                while (!var8) {
                    int var11 = var4.method836((byte) 111);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var9 += var11 - 1;
                    int var12 = var4.method867(false) >> 2;
                    int var13 = var9 >> 6 & 0x3F;
                    int var14 = var9 & 0x3F;
                    int var15 = var13 + arg2;
                    int var16 = arg1 + var14;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class135 var17 = class184.method1294(var5, -28916);
                        if (var12 != 22 || class32.field533 || var17.field2482 != 0 || var17.field2516 == 1 || var17.field2533) {
                            var8 = true;
                            if (!var17.method963(2)) {
                                var6 = false;
                                class148.field2808++;
                            }
                        }
                    }
                }
                int var10 = var4.method836((byte) 126);
                if (var10 == 0) {
                    break;
                }
                var4.method867(false);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLhi;)I")
    public static final int method757(byte arg0, class250 arg1) {
        field1935++;
        int var2 = 0;
        if (arg1.method1701(class280.field4956, -2)) {
            var2++;
        }
        if (arg1.method1701(class144.field2740, -2)) {
            var2++;
        }
        if (arg1.method1701(class174.field3184, -2)) {
            var2++;
        }
        if (arg1.method1701(class262.field4659, -2)) {
            var2++;
        }
        if (arg1.method1701(class268.field4742, arg0 - 81)) {
            var2++;
        }
        if (arg1.method1701(class123.field2220, arg0 ^ 0xFFFFFFB1)) {
            var2++;
        }
        if (arg1.method1701(class250.field4460, arg0 ^ 0xFFFFFFB1)) {
            var2++;
        }
        if (arg1.method1701(class237.field4243, -2)) {
            var2++;
        }
        if (arg1.method1701(class147.field2782, -2)) {
            var2++;
        }
        if (arg1.method1701(class162.field3050, -2)) {
            var2++;
        }
        if (arg1.method1701(class193.field3559, -2)) {
            var2++;
        }
        if (arg1.method1701(class265.field4705, -2)) {
            var2++;
        }
        if (arg1.method1701(class3.field70, -2)) {
            var2++;
        }
        if (arg1.method1701(class45.field715, -2)) {
            var2++;
        }
        if (arg1.method1701(class182.field3344, arg0 ^ 0xFFFFFFB1)) {
            var2++;
        }
        if (arg1.method1701(class158.field2993, -2)) {
            var2++;
        }
        if (arg0 != 79) {
            field1931 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public static final void method758(int arg0) {
        field1930++;
        if (class253.field4491 == 0) {
            return;
        }
        try {
            if ((++class150.field2832) > 1500) {
                if (class125.field2252 != null) {
                    class125.field2252.method994((byte) -33);
                    class125.field2252 = null;
                }
                if (class158.field2997 >= 1) {
                    class195.field3588 = -5;
                    class253.field4491 = 0;
                    return;
                }
                class253.field4491 = 1;
                if (class6.field137 == class138.field2601) {
                    class138.field2601 = class174.field3192;
                } else {
                    class138.field2601 = class6.field137;
                }
                class150.field2832 = 0;
                class158.field2997++;
            }
            if (class253.field4491 == 1) {
                class183.field3370 = class124.field2238.method1163((byte) -91, class138.field2601, class141.field2636);
                class253.field4491 = 2;
            }
            if (class253.field4491 == 2) {
                if (class183.field3370.field487 == 2) {
                    throw new IOException();
                }
                if (class183.field3370.field487 != 1) {
                    return;
                }
                class125.field2252 = new class138((Socket) class183.field3370.field486, class124.field2238);
                class183.field3370 = null;
                class125.field2252.method995(class182.field3349.field2115, 0, arg0 + 26474, class182.field3349.field2155);
                if (class196.field3596 != null) {
                    class196.field3596.method146((byte) 122);
                }
                if (class42.field643 != null) {
                    class42.field643.method146((byte) 119);
                }
                int var1 = class125.field2252.method988((byte) -57);
                if (class196.field3596 != null) {
                    class196.field3596.method146((byte) 119);
                }
                if (class42.field643 != null) {
                    class42.field643.method146((byte) 127);
                }
                if (var1 != 101) {
                    class253.field4491 = 0;
                    class195.field3588 = var1;
                    class125.field2252.method994((byte) -47);
                    class125.field2252 = null;
                    return;
                }
                class253.field4491 = 3;
            }
            if (class253.field4491 == 3) {
                if (class125.field2252.method991((byte) -61) < 2) {
                    return;
                }
                int var2 = class125.field2252.method988((byte) -57) << 8 | class125.field2252.method988((byte) -57);
                class86.method562(var2, (byte) -103);
                if (class138.field2588 == -1) {
                    class253.field4491 = 0;
                    class195.field3588 = 6;
                    class125.field2252.method994((byte) -60);
                    class125.field2252 = null;
                    return;
                }
                class253.field4491 = 0;
                class125.field2252.method994((byte) -41);
                class125.field2252 = null;
                class223.method1548(8);
                return;
            }
        } catch (IOException var3) {
            if (class125.field2252 != null) {
                class125.field2252.method994((byte) -114);
                class125.field2252 = null;
            }
            if (class158.field2997 < 1) {
                class158.field2997++;
                if (class6.field137 == class138.field2601) {
                    class138.field2601 = class174.field3192;
                } else {
                    class138.field2601 = class6.field137;
                }
                class253.field4491 = 1;
                class150.field2832 = 0;
            } else {
                class195.field3588 = -4;
                class253.field4491 = 0;
            }
        }
        if (arg0 != -26454) {
            method758(-66);
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public static final void method759(int arg0) {
        field1925++;
        if (class111.field1990 == 0) {
            return;
        }
        if (arg0 != -7) {
            method755(false);
        }
        try {
            if ((++class99.field1828) > 2000) {
                if (class125.field2252 != null) {
                    class125.field2252.method994((byte) -107);
                    class125.field2252 = null;
                }
                if (class136.field2552 >= 1) {
                    class111.field1990 = 0;
                    class2.field42 = -5;
                    return;
                }
                class111.field1990 = 1;
                class136.field2552++;
                if (class255.field4524 == class184.field3394) {
                    class255.field4524 = class21.field350;
                } else {
                    class255.field4524 = class184.field3394;
                }
                class99.field1828 = 0;
            }
            if (class111.field1990 == 1) {
                class183.field3370 = class124.field2238.method1163((byte) -91, class255.field4524, class33.field545);
                class111.field1990 = 2;
            }
            if (class111.field1990 == 2) {
                if (class183.field3370.field487 == 2) {
                    throw new IOException();
                }
                if (class183.field3370.field487 != 1) {
                    return;
                }
                class125.field2252 = new class138((Socket) class183.field3370.field486, class124.field2238);
                class183.field3370 = null;
                class125.field2252.method995(class182.field3349.field2115, 0, 20, class182.field3349.field2155);
                if (class196.field3596 != null) {
                    class196.field3596.method146((byte) 119);
                }
                if (class42.field643 != null) {
                    class42.field643.method146((byte) 119);
                }
                int var1 = class125.field2252.method988((byte) -57);
                if (class196.field3596 != null) {
                    class196.field3596.method146((byte) 127);
                }
                if (class42.field643 != null) {
                    class42.field643.method146((byte) 126);
                }
                if (var1 != 21) {
                    class2.field42 = var1;
                    class111.field1990 = 0;
                    class125.field2252.method994((byte) -106);
                    class125.field2252 = null;
                    return;
                }
                class111.field1990 = 3;
            }
            if (class111.field1990 == 3) {
                if (class125.field2252.method991((byte) -109) < 1) {
                    return;
                }
                class210.field3826 = new class185[class125.field2252.method988((byte) -57)];
                class111.field1990 = 4;
            }
            if (class111.field1990 == 4 && class125.field2252.method991((byte) -128) >= (class210.field3826.length * 8)) {
                class142.field2669.field2155 = 0;
                class125.field2252.method993(class210.field3826.length * 8, class142.field2669.field2115, arg0 ^ 0xFFFFEA0E, 0);
                for (int var2 = 0; var2 < class210.field3826.length; var2++) {
                    class210.field3826[var2] = class271.method1859((byte) -108, class142.field2669.method862(false));
                }
                class2.field42 = 21;
                class111.field1990 = 0;
                class125.field2252.method994((byte) -124);
                class125.field2252 = null;
            }
        } catch (IOException var3) {
            if (class125.field2252 != null) {
                class125.field2252.method994((byte) -43);
                class125.field2252 = null;
            }
            if (class136.field2552 >= 1) {
                class2.field42 = -4;
                class111.field1990 = 0;
            } else {
                class99.field1828 = 0;
                if (class255.field4524 == class184.field3394) {
                    class255.field4524 = class21.field350;
                } else {
                    class255.field4524 = class184.field3394;
                }
                class136.field2552++;
                class111.field1990 = 1;
            }
        }
    }
}
