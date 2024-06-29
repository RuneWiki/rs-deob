import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class102 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field1872 = 0;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lij;")
    private static class50 field1879 = class78.method578(121, "level)2");

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lij;")
    public static class50 field1871 = field1879;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lij;")
    public static class50 field1880 = class78.method578(123, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public int field1867;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "J")
    public long field1868;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Laa;")
    public class16 field1870;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lwi;")
    public static class21 field1877;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "[S")
    public static short[] field1875;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[[[B")
    public static byte[][][] field1869;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method776(boolean arg0) {
        field1879 = null;
        field1871 = null;
        field1869 = null;
        field1877 = null;
        if (arg0) {
            field1879 = null;
        }
        field1880 = null;
        field1875 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZ)Lij;")
    public static final class50 method777(int arg0, int arg1, int arg2, boolean arg3) {
        field1874++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        if (arg2 <= 107) {
            field1869 = null;
        }
        int var4 = 1;
        for (int var5 = arg0 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg0 % arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            arg0 /= arg1;
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class50 var9 = new class50();
        var9.field898 = var6;
        var9.field909 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method778(int arg0) {
        class140.method979((byte) 41, class206.field3413);
        field1881++;
        class126.field2215++;
        if (class220.field3683 && class211.field3516) {
            int var1 = class173.field2904;
            int var2 = class69.field1297;
            int var3 = var1 - class120.field2114;
            if (var3 < class124.field2167) {
                var3 = class124.field2167;
            }
            if (class124.field2167 + class60.field1103.field242 < class206.field3413.field242 + var3) {
                var3 = class124.field2167 - (class206.field3413.field242 - class60.field1103.field242);
            }
            int var4 = var3 - class53.field962;
            int var5 = class206.field3413.field231;
            int var6 = var3 + class60.field1103.field239 - class124.field2167;
            int var7 = var2 - class121.field2133;
            if (class238.field4037 > var7) {
                var7 = class238.field4037;
            }
            if ((class206.field3413.field243 + var7) > (class238.field4037 + class60.field1103.field243)) {
                var7 = class238.field4037 - (class206.field3413.field243 - class60.field1103.field243);
            }
            int var8 = var7 - class258.field4495;
            if (class126.field2215 > class206.field3413.field295 && (var5 < var8 || var8 < (-var5) || var4 > var5 || -var5 > var4)) {
                class69.field1296 = true;
            }
            if (arg0 != 23877) {
                field1875 = null;
            }
            int var9 = class60.field1103.field156 + var7 - class238.field4037;
            if (class206.field3413.field258 != null && class69.field1296) {
                class93 var10 = new class93();
                var10.field1740 = class206.field3413;
                var10.field1741 = var9;
                var10.field1734 = var6;
                var10.field1739 = class206.field3413.field258;
                class214.method1422(var10, -15181);
            }
            if (class238.field4039 == 0) {
                if (class69.field1296) {
                    if (class206.field3413.field161 != null) {
                        class93 var11 = new class93();
                        var11.field1743 = class22.field470;
                        var11.field1740 = class206.field3413;
                        var11.field1741 = var9;
                        var11.field1734 = var6;
                        var11.field1739 = class206.field3413.field161;
                        class214.method1422(var11, arg0 ^ 0xFFFF99F6);
                    }
                    if (class22.field470 != null && client.method618(class206.field3413) != null) {
                        class190.field3141.method1598((byte) -127, 96);
                        class190.field3141.method1446(119, class206.field3413.field155);
                        class166.field2817++;
                        class190.field3141.method1480(class206.field3413.field216, (byte) -128);
                        class190.field3141.method1480(class22.field470.field216, (byte) -118);
                        class190.field3141.method1457(class22.field470.field155, arg0 - 407827293);
                    }
                } else if ((class231.field3888 == 1 || class86.method685((byte) -126, class136.field2368 - 1)) && class136.field2368 > 2) {
                    class119.method863(-28459);
                } else if (class136.field2368 > 0) {
                    class250.method1695(class136.field2368 - 1, -87);
                }
                class206.field3413 = null;
            }
        } else if (class126.field2215 > 1) {
            class206.field3413 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILda;)[Loe;")
    public static final class207[] method779(int arg0, int arg1, int arg2, class22 arg3) {
        field1882++;
        if (arg1 >= -86) {
            method780(120, 122);
        }
        return class79.method581((byte) -118, arg2, arg3, arg0) ? class68.method519(true) : null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I")
    public static final int method780(int arg0, int arg1) {
        field1873++;
        if (class44.field804 == 1) {
            return 7;
        } else if (arg0 == 77) {
            return 1;
        } else if (arg0 == 38) {
            return 2;
        } else if (arg0 == 16) {
            return 3;
        } else if (arg0 == 161) {
            return 4;
        } else if (arg0 == 191) {
            return 5;
        } else if (arg0 == 69) {
            return 6;
        } else {
            if (arg1 != -70) {
                field1872 = -101;
            }
            return 0;
        }
    }
}
