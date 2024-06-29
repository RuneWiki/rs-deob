import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class99 extends class287 {

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "Ltl;")
    public static class59 field1591 = class85.method639("http:)4)4", 9588);

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field1600 = 255;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "Z")
    public static boolean field1589 = false;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "Lma;")
    public static class263 field1595;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "[I")
    public int[] field1584;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "[I")
    public int[] field1587;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "[I")
    public int[] field1592;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "[Loh;")
    public class257[] field1588;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "[Loh;")
    public class257[] field1593;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "[[[B")
    public byte[][][] field1598;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V", line = 8)
    public static final void method749(int arg0) {
        field1597++;
        int var1 = 84 % ((arg0 - 25) / 55);
        int var2 = 0;
        for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class93.method682(var3, var4, class120.field2010, (byte) 71, var2, true)) {
                    var2++;
                }
                if (var2 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)Z", line = 52)
    public static final boolean method750(int arg0, int arg1, int arg2, int arg3) {
        if (!class227.method1559(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class97.field1558[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class235.field3901) {
                    if (!class123.method913(var4, var6, var5)) {
                        return false;
                    }
                    if (!class123.method913(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class123.method913(var4, var7, var5)) {
                        return false;
                    }
                    if (!class123.method913(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class123.method913(var4, var8, var5)) {
                    return false;
                }
                if (!class123.method913(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class70.field1073) {
                    if (!class123.method913(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class123.method913(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class123.method913(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class123.method913(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class123.method913(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class123.method913(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class235.field3901) {
                    if (!class123.method913(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class123.method913(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class123.method913(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class123.method913(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class123.method913(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class123.method913(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class70.field1073) {
                    if (!class123.method913(var4, var6, var5)) {
                        return false;
                    }
                    if (!class123.method913(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class123.method913(var4, var7, var5)) {
                        return false;
                    }
                    if (!class123.method913(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class123.method913(var4, var8, var5)) {
                    return false;
                }
                if (!class123.method913(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class123.method913(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class123.method913(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class123.method913(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class123.method913(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class123.method913(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Z", line = 237)
    public static final boolean method751(byte arg0) {
        field1585++;
        if (arg0 != 81) {
            method751((byte) -69);
        }
        if (class155.field2542) {
            try {
                return !(Boolean) class45.field729.method461(class308.field5222.field2870, arg0 ^ 0xFFFFDE7D);
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V", line = 258)
    public static void method752(int arg0) {
        if (arg0 != 128) {
            method754(-50, 64);
        }
        field1595 = null;
        field1591 = null;
    }

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "(I)V", line = 282)
    public static final void method753(int arg0) {
        field1596++;
        if (class223.field3613 == 0) {
            return;
        }
        try {
            if ((++class223.field3626) > 1500) {
                if (class21.field284 != null) {
                    class21.field284.method1257(arg0 ^ 0xB955A8D3);
                    class21.field284 = null;
                }
                if (class190.field3174 >= 1) {
                    class223.field3613 = 0;
                    class276.field4753 = -5;
                    return;
                }
                class223.field3613 = 1;
                class190.field3174++;
                class223.field3626 = 0;
                if (field1594 == class14.field201) {
                    class14.field201 = class296.field5079;
                } else {
                    class14.field201 = field1594;
                }
            }
            if (class223.field3613 == 1) {
                class179.field2936 = class308.field5222.method1293(class288.field4954, (byte) 55, class14.field201);
                class223.field3613 = 2;
            }
            if (class223.field3613 == 2) {
                if (class179.field2936.field4256 == 2) {
                    throw new IOException();
                }
                if (class179.field2936.field4256 != 1) {
                    return;
                }
                class21.field284 = new class171((Socket) class179.field2936.field4255, class308.field5222);
                class179.field2936 = null;
                class21.field284.method1267(class234.field3888.field2758, class234.field3888.field2787, 0, (byte) 56);
                if (class227.field3652 != null) {
                    class227.field3652.method558(arg0 ^ 0x76);
                }
                if (class237.field3934 != null) {
                    class237.field3934.method558(arg0 ^ 0xFFFFFF81);
                }
                int var1 = class21.field284.method1258(arg0 - 95);
                if (class227.field3652 != null) {
                    class227.field3652.method558(-33);
                }
                if (class237.field3934 != null) {
                    class237.field3934.method558(arg0 ^ 0xFFFFFFA8);
                }
                if (var1 != 101) {
                    class276.field4753 = var1;
                    class223.field3613 = 0;
                    class21.field284.method1257(1185568552);
                    class21.field284 = null;
                    return;
                }
                class223.field3613 = 3;
            }
            if (arg0 != -5) {
                field1595 = (class263) null;
            }
            if (class223.field3613 == 3) {
                if (class21.field284.method1256(94) >= 2) {
                    int var2 = class21.field284.method1258(-125) << 8 | class21.field284.method1258(-102);
                    class194.method1415(var2, (byte) -5);
                    if (class46.field754 != -1) {
                        class223.field3613 = 0;
                        class21.field284.method1257(arg0 ^ 0xB955A8D3);
                        class21.field284 = null;
                        class235.method1654((byte) -30);
                        return;
                    }
                    class276.field4753 = 6;
                    class223.field3613 = 0;
                    class21.field284.method1257(1185568552);
                    class21.field284 = null;
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class21.field284 != null) {
                class21.field284.method1257(1185568552);
                class21.field284 = null;
            }
            if (class190.field3174 < 1) {
                class223.field3626 = 0;
                class223.field3613 = 1;
                class190.field3174++;
                if (field1594 == class14.field201) {
                    class14.field201 = class296.field5079;
                } else {
                    class14.field201 = field1594;
                }
            } else {
                class223.field3613 = 0;
                class276.field4753 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V", line = 435)
    public static final void method754(int arg0, int arg1) {
        class180.field2959 = new int[arg1];
        class60.field938 = new int[arg1];
        class232.field3824 = new int[arg1];
        if (arg0 != 3) {
            field1589 = false;
        }
        field1590++;
        class103.field1705 = new int[arg1];
        class311.field5276 = new int[arg1];
    }
}
