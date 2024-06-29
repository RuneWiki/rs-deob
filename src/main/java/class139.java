import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class139 extends class153 {

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "[B")
    public byte[] field2402;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "[I")
    public static int[] field2400 = new int[5];

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "[I")
    public static int[] field2397 = new int[128];

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "[I")
    public static int[] field2398;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "[Lpj;")
    public static class237[] field2399;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
    public static final void method957(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class270 var5 = class202.method1368(-15, 8, arg3);
        if (arg4 != 11142) {
            field2400 = null;
        }
        var5.method1793(13);
        var5.field4617 = arg2;
        var5.field4628 = arg0;
        var5.field4619 = arg1;
        field2394++;
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V")
    public static void method958(int arg0) {
        field2400 = null;
        if (arg0 != 8) {
            field2400 = null;
        }
        field2398 = null;
        field2399 = null;
        field2397 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)Lpj;")
    public static final class237 method959(boolean arg0, int arg1) {
        if (arg0) {
            field2398 = null;
        }
        field2396++;
        return class238.method1626(new class237[] { class14.method130(arg1 >> 24 & 0xFF, (byte) 117), class80.field1497, class14.method130(arg1 >> 16 & 0xFF, (byte) 117), class80.field1497, class14.method130((arg1 & 0xFFD2) >> 8, (byte) 117), class80.field1497, class14.method130(arg1 & 0xFF, (byte) 117) }, -89);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
    public static final void method960() {
        if (class115.field2027 != null) {
            for (int var0 = 0; var0 < class115.field2027.length; var0++) {
                for (int var1 = 0; var1 < class224.field3852; var1++) {
                    for (int var2 = 0; var2 < class182.field3211; var2++) {
                        class115.field2027[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class69.field1355 != null) {
            for (int var3 = 0; var3 < class69.field1355.length; var3++) {
                for (int var4 = 0; var4 < class224.field3852; var4++) {
                    for (int var5 = 0; var5 < class182.field3211; var5++) {
                        class69.field1355[var3][var4][var5] = null;
                    }
                }
            }
        }
        class27.field489 = 0;
        if (class164.field2926 != null) {
            for (int var6 = 0; var6 < class27.field489; var6++) {
                class164.field2926[var6] = null;
            }
        }
        if (class185.field3239 != null) {
            for (int var7 = 0; var7 < class85.field1579; var7++) {
                class185.field3239[var7] = null;
            }
            class85.field1579 = 0;
        }
        if (class261.field4476 != null) {
            for (int var8 = 0; var8 < class261.field4476.length; var8++) {
                class261.field4476[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)I")
    public static final int method961(int arg0, int arg1) {
        if (arg1 != 1214261064) {
            field2397 = null;
        }
        field2401++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method962(int arg0, int arg1, int arg2, int arg3) {
        if (!class143.method983(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class99.field1773[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class249.field4311) {
                    if (!class272.method1813(var4, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1813(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1813(var4, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1813(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1813(var4, var8, var5)) {
                    return false;
                }
                if (!class272.method1813(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class101.field1800) {
                    if (!class272.method1813(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class272.method1813(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1813(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class272.method1813(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1813(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class272.method1813(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class249.field4311) {
                    if (!class272.method1813(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1813(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1813(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1813(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class272.method1813(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class272.method1813(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class101.field1800) {
                    if (!class272.method1813(var4, var6, var5)) {
                        return false;
                    }
                    if (!class272.method1813(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class272.method1813(var4, var7, var5)) {
                        return false;
                    }
                    if (!class272.method1813(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class272.method1813(var4, var8, var5)) {
                    return false;
                }
                if (!class272.method1813(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class272.method1813(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class272.method1813(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class272.method1813(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class272.method1813(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class272.method1813(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "([B)V")
    public class139(byte[] arg0) {
        this.field2402 = arg0;
    }

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)Z")
    public static final boolean method963(int arg0) {
        if (arg0 != 230) {
            method961(-103, -2);
        }
        field2395++;
        try {
            return class46.method430(-45);
        } catch (IOException var4) {
            class182.method1250((byte) -102);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class209.field3571 + "," + class204.field3493 + "," + class167.field2946 + " - " + class120.field2130 + "," + (class229.field3911.field3715[0] + class235.field4087) + "," + (class229.field3911.field3743[0] + class27.field494) + " - ";
            for (int var3 = 0; class120.field2130 > var3 && var3 < 50; var3++) {
                var2 = var2 + class65.field1288.field644[var3] + ",";
            }
            class158.method1123(var2, (byte) -122, var5);
            class127.method900(true);
            return true;
        }
    }
}
