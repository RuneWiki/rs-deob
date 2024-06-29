import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class248 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "[I")
    public static int[] field4126 = new int[4096];

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field4135 = 0;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field4124 = 0;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Ltl;")
    private static class59 field4139 = class85.method639("scroll:", 9588);

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Ltl;")
    public static class59 field4125 = field4139;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Ltl;")
    public static class59 field4138 = field4139;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[S")
    public static short[] field4127 = new short[256];

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Lsc;")
    public class18 field4132;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Lme;")
    public static class295 field4137;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Z")
    public static boolean field4140;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "[I")
    public int[] field4128;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "[[[B")
    public static byte[][][] field4134;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIII)V", line = 5)
    public static final void method1742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4136++;
        int var6 = arg4 - arg1;
        int var7 = arg5 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class266.method1839(arg2, true, arg3, arg1, arg4);
            }
        } else if (var6 == 0) {
            class163.method1157(arg3, arg1, arg5, (byte) -104, arg2);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (~var7 > arg0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg3;
                arg3 = arg1;
                int var10 = arg5;
                arg1 = var9;
                arg5 = arg4;
                arg4 = var10;
            }
            if (arg3 > arg5) {
                int var11 = arg1;
                int var12 = arg3;
                arg1 = arg4;
                arg3 = arg5;
                arg5 = var12;
                arg4 = var11;
            }
            int var13 = arg1;
            int var14 = arg4 - arg1;
            int var15 = arg5 - arg3;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var16 = -(var15 >> 1);
            int var17 = arg4 <= arg1 ? -1 : 1;
            if (var8) {
                for (int var19 = arg3; var19 <= arg5; var19++) {
                    var16 += var14;
                    class163.field2662[var19][var13] = arg2;
                    if (var16 > 0) {
                        var16 -= var15;
                        var13 += var17;
                    }
                }
            } else {
                for (int var18 = arg3; var18 <= arg5; var18++) {
                    var16 += var14;
                    class163.field2662[var13][var18] = arg2;
                    if (var16 > 0) {
                        var16 -= var15;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([BB)Z", line = 142)
    public static final boolean method1743(byte[] arg0, byte arg1) {
        field4129++;
        class170 var2 = new class170(arg0);
        int var3 = var2.method1221(87);
        if (var3 != 1) {
            return false;
        }
        if (arg1 != 38) {
            field4138 = (class59) null;
        }
        boolean var4 = var2.method1221(106) == 1;
        if (var4) {
            class295.method2056(var2, (byte) -108);
        }
        class262.method1809((byte) 12, var2);
        return true;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIBI)V", line = 169)
    public static final void method1744(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4130++;
        if (arg3 != -27) {
            method1745((byte) 87);
        }
        if ((arg4 - arg1) >= class69.field1061 && class153.field2504 >= (arg1 + arg4) && arg0 - arg1 >= class28.field369 && class62.field957 >= arg0 + arg1) {
            class36.method241(arg0, arg2, arg4, arg1, -472112159);
        } else {
            class294.method2031(arg0, arg4, arg1, 55, arg2);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 208)
    public static void method1745(byte arg0) {
        field4138 = null;
        field4139 = null;
        field4137 = null;
        field4134 = (byte[][][]) null;
        field4127 = null;
        if (arg0 != -37) {
            method1743((byte[]) null, (byte) -55);
        }
        field4125 = null;
        field4126 = null;
    }
}
