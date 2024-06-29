import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class class352 extends class443 {

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "Z")
    public volatile boolean field5227 = true;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "Ljava/lang/String;")
    public static String field5223 = "Loading sprites - ";

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field5222 = 0;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field5229;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field5230;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Z")
    public boolean field5220;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "Z")
    public boolean field5226;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2325(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILlk;)Z", line = 5)
    public static final boolean method2319(int arg0, class56 arg1) {
        field5219++;
        class212 var2 = class372.method2447(arg1.method116(arg0 ^ 0x410), (byte) -87);
        if (var2.field2978 == -1) {
            return true;
        }
        if (arg0 != 23146) {
            method2322(62, true);
        }
        class237 var3 = class90.method717((byte) -60, var2.field2978);
        return var3.field3311 == -1 ? true : var3.method1539(-75);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V", line = 31)
    public static final void method2320(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -26799) {
            method2321((Object[]) null, -126, (int[]) null);
        }
        field5229++;
        if (arg2 == 1001) {
            class293.method1985(10, arg3, arg1);
        } else if (arg2 == 1007) {
            class293.method1985(11, arg3, arg1);
        } else if (arg2 == 1012) {
            class293.method1985(12, arg3, arg1);
        } else if (arg2 == 1004) {
            class293.method1985(13, arg3, arg1);
        } else if (arg2 == 1006) {
            class293.method1985(14, arg3, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([Ljava/lang/Object;I[I)V", line = 60)
    public static final void method2321(Object[] arg0, int arg1, int[] arg2) {
        if (arg1 <= 14) {
            field5222 = -60;
        }
        field5221++;
        class333.method2175(arg0, (byte) 94, arg2, arg2.length - 1, 0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)I", line = 71)
    public static final int method2322(int arg0, boolean arg1) {
        if (arg1) {
            field5218 = -52;
        }
        field5228++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 83)
    public static final void method2323(int arg0) {
        while (true) {
            class362 var1 = (class362) class185.field2502.method1569(24502);
            if (var1 == null) {
                field5224++;
                int var22 = -19 / ((79 - arg0) / 39);
                return;
            }
            if (class106.field1405 != null) {
                class162 var3;
                if (var1.field5355 >= 0) {
                    int var2 = var1.field5355 - 1;
                    var3 = class388.field5670[var2];
                } else {
                    int var4 = -var1.field5355 - 1;
                    if (class400.field5853 == var4) {
                        var3 = class383.field5609;
                    } else {
                        var3 = class176.field2382[var4];
                    }
                }
                if (var3 != null) {
                    class212 var5 = class372.method2447(var1.field5369, (byte) -122);
                    int var6;
                    int var7;
                    if (var1.field5370 == 1 || var1.field5370 == 3) {
                        var7 = var5.field2946;
                        var6 = var5.field2970;
                    } else {
                        var6 = var5.field2946;
                        var7 = var5.field2970;
                    }
                    int var8 = var1.field5360 + (var6 >> 1);
                    int var9 = (var6 + 1 >> 1) + var1.field5360;
                    int var10 = var1.field5366 + (var7 >> 1);
                    int var11 = var1.field5366 + (var7 + 1 >> 1);
                    class193 var12 = class266.field3950[var3.field5922];
                    int var13 = var12.method722(var8, var10) + var12.method722(var9, var10) + var12.method722(var8, var11) + var12.method722(var9, var11) >> 2;
                    class56 var14 = null;
                    int var15 = class162.field2141[var1.field5358];
                    if (var15 == 0) {
                        var14 = (class56) class57.method421(var3.field5922, var1.field5360, var1.field5366);
                    } else if (var15 == 1) {
                        var14 = (class56) class235.method1526(var3.field5922, var1.field5360, var1.field5366);
                    } else if (var15 == 2) {
                        var14 = (class56) class31.method243(var3.field5922, var1.field5360, var1.field5366, field5230 == null ? (field5230 = method2325("lk")) : field5230);
                    } else if (var15 == 3) {
                        var14 = (class56) class104.method792(var3.field5922, var1.field5360, var1.field5366);
                    }
                    if (var14 != null) {
                        class349.method2307(0, 0, var1.field5365 + 1, var1.field5356, var1.field5360, var1.field5366, var15, (byte) -59, var3.field5922, -1);
                        var3.field2195 = class231.field3179 + var1.field5356;
                        var3.field2194 = var1.field5360 * 128 + var6 * 64;
                        var3.field2199 = var1.field5366 * 128 + var7 * 64;
                        var3.field2193 = class231.field3179 + var1.field5365;
                        var3.field2205 = var13;
                        var3.field2204 = var14;
                        int var16 = var1.field5357;
                        int var17 = var1.field5353;
                        int var18 = var1.field5352;
                        if (var16 > var17) {
                            int var19 = var16;
                            var16 = var17;
                            var17 = var19;
                        }
                        int var20 = var1.field5364;
                        var3.field2196 = var1.field5360 + var16;
                        var3.field2191 = var1.field5360 + var17;
                        if (var18 > var20) {
                            int var21 = var18;
                            var18 = var20;
                            var20 = var21;
                        }
                        var3.field2197 = var1.field5366 + var20;
                        var3.field2192 = var1.field5366 + var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V", line = 232)
    public static void method2324(int arg0) {
        if (arg0 < -90) {
            field5223 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)[B")
    public abstract byte[] method569(int arg0);

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
    public abstract int method565(int arg0);
}
