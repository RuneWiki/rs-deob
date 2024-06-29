import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class184 {

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "J")
    public long field2945 = 0L;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "[I")
    public static int[] field2939 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2932 = new String[500];

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "[I")
    public static int[] field2946 = new int[1000];

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public int field2941;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lda;")
    public class312 field2935;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Lda;")
    public class312 field2937;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[I")
    public static int[] field2947;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "[[[Lmc;")
    public static class174[][][] field2943;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III[B)Z")
    public static final boolean method1334(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg2 != 15419) {
            return true;
        }
        field2936++;
        boolean var4 = true;
        class249 var5 = new class249(arg3);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1777(127);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var6 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1819(arg2 - 1741477267);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var5.method1802((byte) 44) >> 2;
                    int var14 = var8 >> 6 & 0x3F;
                    int var15 = var14 + arg0;
                    int var16 = arg1 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class1 var17 = class110.method827(var6, (byte) -100);
                        if (var13 != 22 || class162.field2636 || var17.field2 != 0 || var17.field36 == 1 || var17.field61) {
                            if (!var17.method19(0)) {
                                var4 = false;
                                class292.field4790++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1819(-1741461848);
                if (var10 == 0) {
                    break;
                }
                var5.method1802((byte) -85);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1335(int arg0) {
        field2946 = null;
        field2932 = null;
        field2943 = null;
        field2939 = null;
        if (arg0 != -9027) {
            field2932 = null;
        }
        field2947 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Laj;IB)Lhh;")
    public static final class200 method1336(class151 arg0, int arg1, byte arg2) {
        byte[] var3 = arg0.method1119(-2, arg1);
        field2938++;
        if (var3 == null) {
            return null;
        } else {
            int var4 = 31 % ((arg2 + 46) / 46);
            return new class200(var3);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Lsj;")
    public static final class208 method1337(byte arg0) {
        field2931++;
        if (class104.field1689 < class201.field3241.length) {
            return class201.field3241[class104.field1689++];
        } else if (arg0 >= -92) {
            return null;
        } else {
            return null;
        }
    }
}
