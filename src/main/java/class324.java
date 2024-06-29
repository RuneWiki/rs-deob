import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class324 {

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "[Ljj;")
    public static class44[] field5033 = new class44[2048];

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field5031 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[[[Lkb;")
    public static class204[][][] field5032;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2268(int arg0) {
        field5035++;
        if (class149.field2318 == arg0) {
            return;
        }
        try {
            if ((++class215.field3507) > 2000) {
                if (class320.field4966 != null) {
                    class320.field4966.method91(-57);
                    class320.field4966 = null;
                }
                if (class25.field342 >= 1) {
                    class149.field2318 = 0;
                    class31.field416 = -5;
                    return;
                }
                class215.field3507 = 0;
                if (class288.field4613 == class109.field1625) {
                    class288.field4613 = class165.field2755;
                } else {
                    class288.field4613 = class109.field1625;
                }
                class149.field2318 = 1;
                class25.field342++;
            }
            if (class149.field2318 == 1) {
                class108.field1608 = class14.field159.method904(class34.field451, 59, class288.field4613);
                class149.field2318 = 2;
            }
            if (class149.field2318 == 2) {
                if (class108.field1608.field2661 == 2) {
                    throw new IOException();
                }
                if (class108.field1608.field2661 != 1) {
                    return;
                }
                class320.field4966 = new class15((Socket) class108.field1608.field2664, class14.field159);
                class108.field1608 = null;
                class320.field4966.method85((byte) -125, class194.field3175.field586, class194.field3175.field573, 0);
                if (class198.field3225 != null) {
                    class198.field3225.method2219(113);
                }
                if (class49.field693 != null) {
                    class49.field693.method2219(112);
                }
                int var1 = class320.field4966.method86((byte) 118);
                if (class198.field3225 != null) {
                    class198.field3225.method2219(85);
                }
                if (class49.field693 != null) {
                    class49.field693.method2219(91);
                }
                if (var1 != 21) {
                    class149.field2318 = 0;
                    class31.field416 = var1;
                    class320.field4966.method91(-93);
                    class320.field4966 = null;
                    return;
                }
                class149.field2318 = 3;
            }
            if (class149.field2318 == 3) {
                if (class320.field4966.method87(arg0 + 5000) < 1) {
                    return;
                }
                class287.field4596 = new String[class320.field4966.method86((byte) 118)];
                class149.field2318 = 4;
            }
            if (class149.field2318 == 4) {
                if (class320.field4966.method87(5000) < (class287.field4596.length * 8)) {
                    return;
                }
                class247.field3898.field586 = 0;
                class320.field4966.method89(class287.field4596.length * 8, true, class247.field3898.field573, 0);
                for (int var2 = 0; var2 < class287.field4596.length; var2++) {
                    class287.field4596[var2] = class33.method179(37, class247.field3898.method276((byte) 102));
                }
                class149.field2318 = 0;
                class31.field416 = 21;
                class320.field4966.method91(arg0 ^ 0xFFFFFFB2);
                class320.field4966 = null;
                return;
            }
        } catch (IOException var4) {
            if (class320.field4966 != null) {
                class320.field4966.method91(-82);
                class320.field4966 = null;
            }
            if (class25.field342 >= 1) {
                class31.field416 = -4;
                class149.field2318 = 0;
            } else {
                class25.field342++;
                class215.field3507 = 0;
                class149.field2318 = 1;
                if (class288.field4613 == class109.field1625) {
                    class288.field4613 = class165.field2755;
                } else {
                    class288.field4613 = class109.field1625;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIBLog;IIII)V", line = 158)
    public static final void method2269(int arg0, int arg1, byte arg2, class157 arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class327.field5053) {
            class295.field4674 = 32;
        } else {
            class295.field4674 = 0;
        }
        class327.field5053 = false;
        if (arg2 <= 73) {
            return;
        }
        if (class99.field1446 != 0) {
            if (arg5 <= arg1 && arg1 < arg5 + 16 && arg0 >= arg4 && arg0 < arg4 + 16) {
                arg3.field2591 -= 4;
                class320.method2252(arg3, 0);
            } else if (arg1 >= arg5 && (arg5 + 16) > arg1 && (arg4 + arg7 - 16) <= arg0 && arg0 < arg4 + arg7) {
                arg3.field2591 += 4;
                class320.method2252(arg3, 0);
            } else if (arg1 >= arg5 - class295.field4674 && (class295.field4674 + arg5 + 16) > arg1 && (arg4 + 16) <= arg0 && arg0 < (arg4 + arg7 - 16)) {
                int var8 = (arg7 - 32) * arg7 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg0 - arg4 - (var8 / 2) - 16;
                int var10 = arg7 - var8 - 32;
                arg3.field2591 = (arg6 - arg7) * var9 / var10;
                class320.method2252(arg3, 0);
                class327.field5053 = true;
            }
        }
        if (class34.field452 != 0) {
            int var11 = arg3.field2468;
            if (arg5 - var11 <= arg1 && arg4 <= arg0 && arg1 < (arg5 + 16) && (arg4 + arg7) >= arg0) {
                arg3.field2591 += class34.field452 * 45;
                class320.method2252(arg3, 0);
            }
        }
        field5036++;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 224)
    public static void method2270(int arg0) {
        field5033 = null;
        field5032 = (class204[][][]) null;
        if (arg0 != -16) {
            method2271((byte) -63, -110, -92);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V", line = 238)
    public static final void method2271(byte arg0, int arg1, int arg2) {
        field5030++;
        if (class287.field4599 != arg1) {
            class48.field669 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class48.field669[var3] = (var3 << 12) / arg1;
            }
            class101.field1473 = arg1 * 32;
            class112.field1717 = arg1 - 1;
            class287.field4599 = arg1;
        }
        if (class27.field372 != arg2) {
            if (class287.field4599 == arg2) {
                class27.field382 = class48.field669;
            } else {
                class27.field382 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class27.field382[var4] = (var4 << 12) / arg2;
                }
            }
            class27.field372 = arg2;
            class32.field432 = arg2 - 1;
        }
        if (arg0 >= -3) {
            field5031 = 21;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljj;B)Lje;", line = 291)
    public static final class123 method2272(class44 arg0, byte arg1) {
        if (arg1 != 98) {
            return (class123) null;
        }
        field5029++;
        class123 var2 = new class123();
        var2.field1926 = arg0.method271(21081);
        var2.field1925 = class310.method2188(var2.field1926, false);
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V", line = 308)
    public static final void method2273(int arg0, int arg1) {
        if (arg0 != 4) {
            field5031 = 112;
        }
        class74.field1039.method708(arg1, true);
        field5034++;
    }
}
