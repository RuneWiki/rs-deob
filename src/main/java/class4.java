import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class4 {

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field112 = 0;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "[I")
    public static int[] field120 = new int[128];

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "[[[B")
    public static byte[][][] field115;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static final void method31(int arg0) {
        field113++;
        if (class159.field2606 || class27.field470 == 2) {
            return;
        }
        try {
            class288.method2005(class45.field702, (byte) 100, "tbrefresh");
        } catch (Throwable var1) {
        }
        if (arg0 != 11688) {
            method37(-84, 32, 75, 115);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Lsj;")
    public static final class208 method32(byte arg0, int arg1) {
        field119++;
        if (arg0 != 31) {
            field115 = null;
        }
        return class258.field4339 && arg1 >= class280.field4647 && class130.field2146 >= arg1 ? class187.field2992[arg1 - class280.field4647] : null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lvc;")
    public static final class222 method33(int arg0, int arg1) {
        field111++;
        class222 var2 = (class222) class190.field3074.method99((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class166.field2691.method1149(class241.method1730(arg0, (byte) -103), (byte) 36, class167.method1248(123, arg0));
        class222 var4 = new class222();
        if (var3 != null) {
            var4.method1576(new class249(var3), (byte) 103);
        }
        if (arg1 >= -93) {
            method37(15, 61, 49, 12);
        }
        class190.field3074.method100((long) arg0, var4, 58);
        return var4;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static void method34(int arg0) {
        field120 = null;
        if (arg0 != 11889) {
            field120 = null;
        }
        field115 = null;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
    public static final void method35(int arg0, int arg1) {
        if (arg0 < 50) {
            field115 = null;
        }
        field117++;
        class36 var2 = class136.method1013(2, arg1, (byte) -90);
        var2.method221(1);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILjava/lang/String;II)V")
    public static final void method36(int arg0, int arg1, String arg2, int arg3, int arg4) {
        field114++;
        class207 var5 = class107.method798(arg1, arg3, (byte) -71);
        if (var5 == null) {
            return;
        }
        if (var5.field3391 != null) {
            class303 var6 = new class303();
            var6.field4943 = arg0;
            var6.field4931 = var5;
            var6.field4935 = var5.field3391;
            var6.field4933 = arg2;
            class269.method1893(-3725, var6);
        }
        boolean var7 = true;
        if (var5.field3495 > 0) {
            var7 = class283.method1969(205, var5);
        }
        if (!var7 || !client.method732(var5).method125(arg0 - 1, false)) {
            return;
        }
        if (arg0 == 1) {
            class236.field3980.method640((byte) 97, 173);
            class301.field4913++;
            class236.field3980.method1811(arg1, (byte) 51);
            class236.field3980.method1771(arg3, (byte) 30);
        }
        if (arg0 == 2) {
            class236.field3981++;
            class236.field3980.method640((byte) 97, 157);
            class236.field3980.method1811(arg1, (byte) 51);
            class236.field3980.method1771(arg3, (byte) 30);
        }
        if (arg0 == 3) {
            class297.field4854++;
            class236.field3980.method640((byte) 97, 118);
            class236.field3980.method1811(arg1, (byte) 51);
            class236.field3980.method1771(arg3, (byte) 30);
        }
        if (arg0 == 4) {
            class231.field3920++;
            class236.field3980.method640((byte) 97, 55);
            class236.field3980.method1811(arg1, (byte) 51);
            class236.field3980.method1771(arg3, (byte) 30);
        }
        if (arg0 == 5) {
            class236.field3980.method640((byte) 97, 226);
            class236.field3980.method1811(arg1, (byte) 51);
            class236.field3980.method1771(arg3, (byte) 30);
            class158.field2586++;
        }
        if (arg0 == 6) {
            class296.field4848++;
            class236.field3980.method640((byte) 97, 191);
            class236.field3980.method1811(arg1, (byte) 51);
            class236.field3980.method1771(arg3, (byte) 30);
        }
        if (arg0 == 7) {
            class233.field3946++;
            class236.field3980.method640((byte) 97, 212);
            class236.field3980.method1811(arg1, (byte) 51);
            class236.field3980.method1771(arg3, (byte) 30);
        }
        if (arg0 == 8) {
            class236.field3980.method640((byte) 97, 164);
            class3.field109++;
            class236.field3980.method1811(arg1, (byte) 51);
            class236.field3980.method1771(arg3, (byte) 30);
        }
        if (arg0 == arg4) {
            class236.field3980.method640((byte) 97, 67);
            class206.field3321++;
            class236.field3980.method1811(arg1, (byte) 51);
            class236.field3980.method1771(arg3, (byte) 30);
        }
        if (arg0 == 10) {
            class236.field3980.method640((byte) 97, 170);
            class236.field3980.method1811(arg1, (byte) 51);
            class236.field3980.method1771(arg3, (byte) 30);
            class259.field4348++;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)Z")
    public static final boolean method37(int arg0, int arg1, int arg2, int arg3) {
        if (!class136.method1009(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class245.field4123[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class118.field1987) {
                    if (!class61.method422(var4, var6, var5)) {
                        return false;
                    }
                    if (!class61.method422(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class61.method422(var4, var7, var5)) {
                        return false;
                    }
                    if (!class61.method422(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class61.method422(var4, var8, var5)) {
                    return false;
                }
                if (!class61.method422(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class84.field1398) {
                    if (!class61.method422(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class61.method422(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class61.method422(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class61.method422(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class61.method422(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class61.method422(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class118.field1987) {
                    if (!class61.method422(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class61.method422(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class61.method422(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class61.method422(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class61.method422(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class61.method422(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class84.field1398) {
                    if (!class61.method422(var4, var6, var5)) {
                        return false;
                    }
                    if (!class61.method422(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class61.method422(var4, var7, var5)) {
                        return false;
                    }
                    if (!class61.method422(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class61.method422(var4, var8, var5)) {
                    return false;
                }
                if (!class61.method422(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class61.method422(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class61.method422(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class61.method422(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class61.method422(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class61.method422(var4, var8, var5);
        } else {
            return true;
        }
    }
}
