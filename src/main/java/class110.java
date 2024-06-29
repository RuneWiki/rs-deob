import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class110 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lhb;")
    private static class44 field2747 = class102.method810(" has logged out)3", -28606);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field2746 = 0;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lhb;")
    public static class44 field2752 = class102.method810("Fallen lassen", -28606);

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lhb;")
    public static class44 field2754 = field2747;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lhb;")
    public static class44 field2748 = class102.method810("Empf-=nger:", -28606);

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Lhb;")
    public static class44 field2757 = class102.method810(" Millionen", -28606);

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lhb;")
    public static class44 field2758 = class102.method810("redstone2", -28606);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "J")
    public static long field2750;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILqd;IIBZ)V", line = 8)
    public static final void method843(int arg0, int arg1, class100 arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        field2756++;
        long var7 = (long) ((arg4 << arg0) + arg1);
        class129 var9 = (class129) class40.field895.method154(arg0 ^ 0xA9E03EEF, var7);
        if (var9 != null) {
            return;
        }
        class129 var10 = (class129) class41.field915.method154(-1, var7);
        if (var10 != null) {
            return;
        }
        class129 var11 = (class129) class11.field201.method154(-1, var7);
        if (var11 == null) {
            if (!arg6) {
                class129 var12 = (class129) class74.field1866.method154(-1, var7);
                if (var12 != null) {
                    return;
                }
            }
            class129 var13 = new class129();
            var13.field3091 = arg3;
            var13.field3086 = arg5;
            var13.field3100 = arg2;
            if (arg6) {
                class40.field895.method158(var7, var13, -22711);
                class55.field1364++;
            } else {
                class71.field1736.method125((byte) -112, var13);
                class11.field201.method158(var7, var13, -22711);
                class22.field485++;
            }
        } else if (arg6) {
            var11.method39(arg0 ^ 0x561FC111);
            class40.field895.method158(var7, var11, -22711);
            class55.field1364++;
            class22.field485--;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I", line = 76)
    public static final int method844(int arg0, int arg1) {
        class117 var2 = class101.method801(arg1, -5045);
        field2755++;
        int var3 = var2.field2872;
        if (arg0 <= 5) {
            field2757 = null;
        }
        int var4 = var2.field2854;
        int var5 = var2.field2873;
        int var6 = class2.field80[var5 - var4];
        return class21.field440[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 101)
    public static void method845(int arg0) {
        field2758 = null;
        field2748 = null;
        if (arg0 != -13020) {
            method847(59, null, null);
        }
        field2754 = null;
        field2747 = null;
        field2752 = null;
        field2757 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 178)
    public static final void method846(byte arg0) {
        class98 var1 = class18.field358;
        synchronized (class18.field358) {
            class75.field1899 = class4.field110;
            if (class96.field2440 >= 0) {
                while (class96.field2440 != class111.field2762) {
                    int var2 = class13.field261[class111.field2762];
                    class111.field2762 = class111.field2762 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class13.field257[var2] = true;
                    } else {
                        class13.field257[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class13.field257[var3] = false;
                }
                class96.field2440 = class111.field2762;
            }
            if (arg0 != -32) {
                return;
            }
            class4.field110 = class35.field855;
        }
        field2751++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILhb;Lm;)Lhb;", line = 227)
    public static final class44 method847(int arg0, class44 arg1, class72 arg2) {
        if (arg1.method388(0, class75.field1894) != -1) {
            label62: while (true) {
                int var3 = arg1.method388(0, class42.field961);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method388(0, class77.field1945);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method388(0, class121.field2964);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method388(0, class107.field2702);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method388(0, class116.field2819);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method388(0, class95.field2408);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class44 var9 = class51.field1274;
                                                        if (class89.field2289 != null) {
                                                            var9 = class4.method33(265, class89.field2289.field2997);
                                                            try {
                                                                if (class89.field2289.field2995 != null) {
                                                                    byte[] var10 = ((String) class89.field2289.field2995).getBytes("ISO-8859-1");
                                                                    var9 = class11.method78(-1224, var10, 0, var10.length);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class117.method903(new class44[] { arg1.method396((byte) -123, 0, var8), var9, arg1.method380(var8 + 4, (byte) 118) }, false);
                                                    }
                                                }
                                                arg1 = class117.method903(new class44[] { arg1.method396((byte) -121, 0, var7), class19.method145(-47, class13.method86((byte) -108, 4, arg2)), arg1.method380(var7 + 2, (byte) 118) }, false);
                                            }
                                        }
                                        arg1 = class117.method903(new class44[] { arg1.method396((byte) -94, 0, var6), class19.method145(-12, class13.method86((byte) -108, 3, arg2)), arg1.method380(var6 + 2, (byte) 127) }, false);
                                    }
                                }
                                arg1 = class117.method903(new class44[] { arg1.method396((byte) -82, 0, var5), class19.method145(-57, class13.method86((byte) -108, 2, arg2)), arg1.method380(var5 + 2, (byte) 126) }, false);
                            }
                        }
                        arg1 = class117.method903(new class44[] { arg1.method396((byte) -112, 0, var4), class19.method145(-55, class13.method86((byte) -108, 1, arg2)), arg1.method380(var4 + 2, (byte) 119) }, false);
                    }
                }
                arg1 = class117.method903(new class44[] { arg1.method396((byte) -121, 0, var3), class19.method145(126, class13.method86((byte) -108, 0, arg2)), arg1.method380(var3 + 2, (byte) 113) }, false);
            }
        }
        field2745++;
        if (arg0 > -50) {
            method845(118);
        }
        return arg1;
    }
}
