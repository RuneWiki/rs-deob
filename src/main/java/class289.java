import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class289 {

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
    public static int[] field4703 = new int[1000];

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field4704 = 100;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Lsf;")
    public static class124 field4699 = new class124(50);

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Lag;")
    public static class131 field4698;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BIZ)Ljava/lang/String;", line = 6)
    public static final String method2055(byte arg0, int arg1, boolean arg2) {
        field4700++;
        if (arg2 && arg1 >= 0) {
            if (arg0 != -109) {
                field4698 = (class131) null;
            }
            return class223.method1560(arg1, 10, arg2, (byte) 113);
        } else {
            return Integer.toString(arg1);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)I", line = 27)
    public static final int method2056(byte arg0, String arg1) {
        field4705++;
        if (arg0 > -106) {
            return -3;
        }
        int var2 = 0;
        int var3 = arg1.length();
        for (int var4 = 0; var4 < var3; var4++) {
            var2 = (var2 << 5) + (class148.method1065(arg1.charAt(var4), -1) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI[B[Lrm;II)V", line = 52)
    public static final void method2057(boolean arg0, int arg1, byte[] arg2, class273[] arg3, int arg4, int arg5) {
        class146 var6 = new class146(arg2);
        int var7 = 3 % ((arg1 + 36) / 40);
        field4701++;
        int var8 = -1;
        while (true) {
            int var9 = var6.method1016((byte) 44);
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var6.method1020(true);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 >> 6 & 0x3F;
                int var13 = arg4 + var12;
                int var14 = var6.method1005((byte) 122);
                int var15 = var14 >> 2;
                int var16 = var10 & 0x3F;
                int var17 = var14 & 0x3;
                int var18 = var10 >> 12;
                int var19 = arg5 + var16;
                if (var13 > 0 && var19 > 0 && var13 < 103 && var19 < 103) {
                    class273 var20 = null;
                    if (!arg0) {
                        int var21 = var18;
                        if ((class282.field4615[1][var13][var19] & 0x2) == 2) {
                            var21 = var18 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    class227.method1579(var18, var13, !arg0, -15255, var17, var19, var15, var8, arg0, var20, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lg;III)V", line = 125)
    public static final void method2058(class181 arg0, int arg1, int arg2, int arg3) {
        field4702++;
        int var4 = -93 % ((74 - arg2) / 36);
        if (class323.field5231 != null || class5.field87 || arg0 == null || class282.method2008(arg0, -1) == null) {
            return;
        }
        class323.field5231 = arg0;
        class16.field476 = class282.method2008(arg0, -1);
        class97.field1760 = arg3;
        class269.field4377 = arg1;
        class264.field4327 = false;
        class110.field2019 = 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 149)
    public static void method2059(byte arg0) {
        if (arg0 == 124) {
            field4703 = null;
            field4698 = null;
            field4699 = null;
        }
    }
}
