import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class141 {

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public int field1925 = 0;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field1923 = 0;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public int field1934 = 2048;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public int field1932 = 2048;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Z")
    public static boolean field1924 = false;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1921 = "";

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lfl;")
    public static class300 field1931 = new class300(0, -1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lkm;")
    public static class133 field1933;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lgn;")
    public static class77 field1927;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "[Lbc;")
    public static class4[] field1935;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(DB)V", line = 4)
    public static final void method1016(double arg0, byte arg1) {
        field1928++;
        if (class249.field3584 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class296.field4395[var3] = var4 <= 255 ? var4 : 255;
            }
            class249.field3584 = arg0;
        }
        int var5 = -37 % ((4 - arg1) / 47);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLcg;)V", line = 29)
    public final void method1017(int arg0, byte arg1, class316 arg2) {
        field1936++;
        while (true) {
            int var4 = arg2.method2219(arg1 + 16570);
            if (var4 == 0) {
                if (arg1 != -122) {
                    field1931 = (class300) null;
                }
                return;
            }
            this.method1020(var4, arg0, arg1 + 101, arg2);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V", line = 51)
    public static final void method1018(boolean arg0, int arg1) {
        field1920++;
        byte[][] var2;
        byte var3;
        if (class67.field908 && arg0) {
            var2 = class231.field3270;
            var3 = 1;
        } else {
            var2 = class41.field468;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class15.method98(-124);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class199.field2840[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFE01A) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class256.field3702.length; var13++) {
                                if (class256.field3702[var13] == var12 && var2[var13] != null) {
                                    class307.method2085(var9, var5 * 8, var2[var13], var8, var4, arg0, var6 * 8, class312.field4714, -42, (var10 & 0x7) * 8, (var11 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 < 10) {
            field1935 = (class4[]) null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 149)
    public static void method1019(int arg0) {
        field1931 = null;
        field1933 = null;
        field1935 = null;
        field1927 = null;
        if (arg0 != 0) {
            field1927 = (class77) null;
        }
        field1921 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILcg;)V", line = 163)
    private final void method1020(int arg0, int arg1, int arg2, class316 arg3) {
        if (arg2 >= -17) {
            return;
        }
        if (arg0 == 1) {
            this.field1925 = arg3.method2219(16448);
        } else if (arg0 == 2) {
            this.field1934 = arg3.method2220((byte) 91);
        } else if (arg0 == 3) {
            this.field1932 = arg3.method2220((byte) 109);
        } else if (arg0 == 4) {
            this.field1923 = arg3.method2161(28984);
        }
        field1930++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V", line = 196)
    public static final void method1021(String arg0, String arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg3 > -14) {
            method1021((String) null, (String) null, -28, -79, (String) null, -31);
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class208.field2987[var6] = class208.field2987[var6 - 1];
            class312.field4719[var6] = class312.field4719[var6 - 1];
            class33.field392[var6] = class33.field392[var6 - 1];
            class88.field1246[var6] = class88.field1246[var6 - 1];
            class90.field1267[var6] = class90.field1267[var6 - 1];
        }
        class312.field4719[0] = arg1;
        class231.field3274 = class185.field2549;
        class256.field3741++;
        class208.field2987[0] = arg5;
        class90.field1267[0] = arg2;
        field1926++;
        class33.field392[0] = arg0;
        class88.field1246[0] = arg4;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)I", line = 240)
    public static final int method1022(int arg0) {
        field1929++;
        class89.field1255 = 0;
        int var1 = -89 % ((-arg0 - 91) / 33);
        return class143.method1029(122);
    }
}
