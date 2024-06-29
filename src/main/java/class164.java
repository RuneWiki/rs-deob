import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class164 {

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
    public boolean field2783 = false;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Lok;")
    public static class146 field2775 = class235.method1724(-12908, "mapdots");

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2776 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public int field2773;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public int field2781;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public int field2782;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "J")
    public long field2787;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lbf;")
    public class322 field2785;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "[[[B")
    public static byte[][][] field2777;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lih;ZZ)V", line = 5)
    public static final void method1274(class30 arg0, boolean arg1, boolean arg2) {
        if (!arg2) {
            method1276(-59, 90, -121, -2);
        }
        field2774++;
        if (class271.field4640 || arg1) {
            int var3 = class56.field997;
            int var4 = var3 * 956 / 503;
            class32.field622.method58((class148.field2518 - var4) / 2, 0, var4, var3);
            class119.field1939.method180(class148.field2518 / 2 - (class119.field1939.field480 / 2), 18);
        }
        arg0.method209(class207.field3457, class148.field2518 / 2, class56.field997 / 2 - 26, 16777215, -1);
        int var5 = class56.field997 / 2 - 18;
        if (class271.field4640) {
            class131.method965(class148.field2518 / 2 - 152, var5, 304, 34, 9179409);
            class131.method965(class148.field2518 / 2 - 151, var5 + 1, 302, 32, 0);
            class131.method978(class148.field2518 / 2 - 150, var5 + 2, class40.field723 * 3, 30, 9179409);
            class131.method978(class148.field2518 / 2 + class40.field723 * 3 - 150, var5 - -2, 300 - (class40.field723 * 3), 30, 0);
        } else {
            class181.method1435(class148.field2518 / 2 - 152, var5, 304, 34, 9179409);
            class181.method1435(class148.field2518 / 2 - 151, var5 + 1, 302, 32, 0);
            class181.method1416(class148.field2518 / 2 - 150, var5 + 2, class40.field723 * 3, 30, 9179409);
            class181.method1416(class40.field723 * 3 + class148.field2518 / 2 - 150, var5 + 2, 300 - (class40.field723 * 3), 30, 0);
        }
        arg0.method209(class225.field3754, class148.field2518 / 2, class56.field997 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Loh;B)V", line = 53)
    public static final void method1275(class15 arg0, byte arg1) {
        if (arg1 < -106) {
            class238.field3977 = arg0;
            field2788++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)Z", line = 71)
    public static final boolean method1276(int arg0, int arg1, int arg2, int arg3) {
        if (!class26.method173(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class174.field2914[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class82.field1311) {
                    if (!class112.method755(var4, var6, var5)) {
                        return false;
                    }
                    if (!class112.method755(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class112.method755(var4, var7, var5)) {
                        return false;
                    }
                    if (!class112.method755(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class112.method755(var4, var8, var5)) {
                    return false;
                }
                if (!class112.method755(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class287.field4923) {
                    if (!class112.method755(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class112.method755(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class112.method755(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class112.method755(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class112.method755(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class112.method755(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class82.field1311) {
                    if (!class112.method755(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class112.method755(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class112.method755(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class112.method755(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class112.method755(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class112.method755(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class287.field4923) {
                    if (!class112.method755(var4, var6, var5)) {
                        return false;
                    }
                    if (!class112.method755(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class112.method755(var4, var7, var5)) {
                        return false;
                    }
                    if (!class112.method755(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class112.method755(var4, var8, var5)) {
                    return false;
                }
                if (!class112.method755(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class112.method755(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class112.method755(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class112.method755(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class112.method755(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class112.method755(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIZ)V", line = 263)
    public static final void method1277(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class56.field999 = arg1;
        class211.field3492 = arg2;
        class263.field4374 = arg4;
        field2778++;
        class223.field3717 = arg3;
        class211.field3498 = arg0;
        if (!arg5) {
            field2777 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIII)I", line = 279)
    public static final int method1278(int arg0, int arg1, int arg2, int arg3) {
        field2779++;
        int var4 = arg2 & 0x3;
        if (~var4 == arg3) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIILbf;Lbf;IIIIJ)V", line = 301)
    public static final void method1279(int arg0, int arg1, int arg2, int arg3, class322 arg4, class322 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class19 var12 = new class19();
        var12.field364 = arg10;
        var12.field379 = arg1 * 128 + 64;
        var12.field375 = arg2 * 128 + 64;
        var12.field370 = arg3;
        var12.field371 = arg4;
        var12.field373 = arg5;
        var12.field377 = arg6;
        var12.field376 = arg7;
        var12.field366 = arg8;
        var12.field369 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class203.field3382[var13][arg1][arg2] == null) {
                class203.field3382[var13][arg1][arg2] = new class11(var13, arg1, arg2);
            }
        }
        class203.field3382[arg0][arg1][arg2].field223 = var12;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLr;)V", line = 330)
    public static final void method1280(boolean arg0, class264 arg1) {
        if (class7.field167 == arg1.field4505) {
            class14.field264[arg1.field4388] = true;
        }
        if (arg0) {
            field2776 = -120;
        }
        field2780++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([SB)[S", line = 350)
    public static final short[] method1281(short[] arg0, byte arg1) {
        field2786++;
        if (arg0 == null) {
            return null;
        }
        short[] var2 = new short[arg0.length];
        if (arg1 != -69) {
            method1283(-48);
        }
        class244.method1763(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIII)Lok;", line = 371)
    public static final class146 method1282(boolean arg0, int arg1, int arg2, int arg3) {
        field2784++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        int var4 = arg3 / arg1;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg1;
            var5++;
        }
        int var6 = var5;
        if (arg3 < 0 || arg0) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = arg3 % arg1;
            arg3 /= arg1;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class146 var10 = new class146();
        var10.field2462 = var7;
        if (arg2 == -9502) {
            var10.field2461 = var6;
            return var10;
        } else {
            return (class146) null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 436)
    public static void method1283(int arg0) {
        field2775 = null;
        if (arg0 == 0) {
            field2777 = (byte[][][]) null;
        }
    }
}
