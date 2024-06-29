import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class214 {

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Lak;")
    private class269 field3833 = new class269(256);

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lak;")
    private class269 field3843 = new class269(256);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lfl;")
    private class192 field3826;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lfl;")
    private class192 field3836;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Z")
    public static boolean field3830 = true;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lvf;")
    public static class265 field3832 = class87.method582(-46, "<img=1>");

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lvf;")
    public static class265 field3831 = class87.method582(-46, "clignotant3:");

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Lvf;")
    public static class265 field3828 = class87.method582(-46, "(R");

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field3835 = -1;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3829 = new CRC32();

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field3844 = 0;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Lvf;")
    public static class265 field3845 = class87.method582(-46, "cookiehost");

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Lvf;")
    public static class265 field3846 = class87.method582(-46, ")2");

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Lnc;")
    public static class122 field3827;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lsb;")
    public static class92 field3837;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II[I)Lfi;")
    public final class222 method1455(int arg0, int arg1, int[] arg2) {
        field3839++;
        if (this.field3836.method1315(arg0 - 15000) == 1) {
            return this.method1457(arg2, arg1, 0, -1);
        }
        if (arg0 != 15000) {
            this.field3826 = null;
        }
        if (this.field3836.method1331(arg1, (byte) 116) != 1) {
            throw new RuntimeException();
        }
        return this.method1457(arg2, 0, arg1, arg0 ^ 0xFFFFC567);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static final void method1456(int arg0) {
        if (class219.field3935 != null) {
            class112.method741(18188, class219.field3935);
            class219.field3935 = null;
        }
        if (arg0 >= -83) {
            method1456(-114);
        }
        field3841++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([IIII)Lfi;")
    private final class222 method1457(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            method1461(11, -78);
        }
        field3825++;
        int var5 = arg1 ^ ((arg2 & 0xE0000FFF) << 4 | arg2 >>> 12);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class222 var9 = (class222) this.field3843.method1842(arg3, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class173 var10 = class173.method1137(this.field3836, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class222 var11 = var10.method1138();
            this.field3843.method1838(var7, var11, (byte) 8);
            if (arg0 != null) {
                arg0[0] -= var11.field3974.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    public static final void method1458(int arg0, int arg1) {
        class137 var2 = class200.field3577[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class137 var4 = class200.field3577[var3][arg0][arg1] = class200.field3577[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2519--;
                for (int var5 = 0; var5 < var4.field2502; var5++) {
                    class146 var6 = var4.field2506[var5];
                    if ((var6.field2720 >> 29 & 0x3L) == 2L && var6.field2728 == arg0 && var6.field2719 == arg1) {
                        var6.field2732--;
                    }
                }
            }
        }
        if (class200.field3577[0][arg0][arg1] == null) {
            class200.field3577[0][arg0][arg1] = new class137(0, arg0, arg1);
        }
        class200.field3577[0][arg0][arg1].field2512 = var2;
        class200.field3577[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III[I)Lfi;")
    private final class222 method1459(int arg0, int arg1, int arg2, int[] arg3) {
        field3840++;
        int var5 = arg2 ^ (arg1 << 4 & 0xFFF7 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class222 var9 = (class222) this.field3843.method1842(arg0 - 2, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class151 var10 = (class151) this.field3833.method1842(arg0 - 2, var7);
            if (var10 == null) {
                var10 = class151.method1038(this.field3826, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field3833.method1838(var7, var10, (byte) 8);
            }
            class222 var11 = var10.method1033(arg3);
            if (var11 == null) {
                return null;
            }
            var10.method97(158);
            this.field3843.method1838(var7, var11, (byte) 8);
            if (arg0 != 1) {
                this.method1455(54, -43, (int[]) null);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([IIB)Lfi;")
    public final class222 method1460(int[] arg0, int arg1, byte arg2) {
        field3838++;
        if (this.field3826.method1315(0) == 1) {
            return this.method1459(1, 0, arg1, arg0);
        }
        if (arg2 >= -120) {
            this.method1460((int[]) null, -47, (byte) -99);
        }
        if (this.field3826.method1331(arg1, (byte) 123) != 1) {
            throw new RuntimeException();
        }
        return this.method1459(1, arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)I")
    public static final int method1461(int arg0, int arg1) {
        field3842++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        if (arg0 > -37) {
            field3832 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static void method1462(int arg0) {
        field3829 = null;
        field3846 = null;
        field3845 = null;
        field3837 = null;
        field3828 = null;
        if (arg0 != -11061) {
            field3829 = null;
        }
        field3831 = null;
        field3832 = null;
        field3827 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lfl;Lfl;)V")
    public class214(class192 arg0, class192 arg1) {
        this.field3826 = arg1;
        this.field3836 = arg0;
    }
}
