import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class83 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[[[I")
    public static int[][][] field1131 = new int[2][][];

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1134 = "";

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "Z")
    public static boolean field1136 = false;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1135 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
    public static int[] field1140 = new int[100];

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1139 = "yellow:";

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[[[Lsm;")
    public static class124[][][] field1138;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[Lqd;Z[BII)V", line = 7)
    public static final void method604(int arg0, class200[] arg1, boolean arg2, byte[] arg3, int arg4, int arg5) {
        field1142++;
        int var6 = 109 % ((arg0 + 24) / 59);
        int var7 = -1;
        class6 var8 = new class6(arg3);
        while (true) {
            int var9 = var8.method49((byte) 73);
            if (var9 == 0) {
                return;
            }
            var7 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var8.method52(-32768);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = (var10 & 0xFE9) >> 6;
                int var13 = var10 >> 12;
                int var14 = var10 & 0x3F;
                int var15 = var8.method58(-288140008);
                int var16 = var15 >> 2;
                int var17 = arg4 + var12;
                int var18 = var15 & 0x3;
                int var19 = var14 + arg5;
                if (var17 > 0 && var19 > 0 && var17 < 103 && var19 < 103) {
                    class200 var20 = null;
                    if (!arg2) {
                        int var21 = var13;
                        if ((class134.field1969[1][var17][var19] & 0x2) == 2) {
                            var21 = var13 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg1[var21];
                        }
                    }
                    class305.method2116(var19, var18, var13, arg2, 10768, !arg2, var20, var16, var17, var7, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 83)
    public static void method605(byte arg0) {
        field1134 = null;
        field1140 = null;
        if (arg0 == -121) {
            field1139 = null;
            field1138 = (class124[][][]) null;
            field1131 = (int[][][]) null;
            field1135 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z[I[Ljava/lang/Object;)V", line = 100)
    public static final void method606(boolean arg0, int[] arg1, Object[] arg2) {
        field1132++;
        if (!arg0) {
            method605((byte) -99);
        }
        class316.method2216(arg1.length - 1, arg2, arg1, 0, (byte) 112);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lgh;IIIII)V", line = 130)
    public static final void method607(class248 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class314.field4916 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class131.field1938) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class308.field4794 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class124 var14 = field1138[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class172.field2843[var11][var12 + 1][var13] + class172.field2843[var11][var12][var13] + class172.field2843[var11][var12][var13 + 1] + class172.field2843[var11][var12 + 1][var13 + 1]) / 4 - (class172.field2843[arg1][arg2 + 1][arg3] + class172.field2843[arg1][arg2][arg3] + class172.field2843[arg1][arg2][arg3 + 1] + class172.field2843[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class102 var16 = var14.field1775;
                                    if (var16 != null) {
                                        if (var16.field1362.method1237()) {
                                            arg0.method1213(var16.field1362, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1365 != null && var16.field1365.method1237()) {
                                            arg0.method1213(var16.field1365, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field1798; var17++) {
                                        class263 var18 = var14.field1783[var17];
                                        if (var18 != null && var18.field4118.method1237() && (var18.field4124 == var12 || var7 == var12) && (var18.field4127 == var13 || var9 == var13)) {
                                            int var19 = var18.field4115 + 1 - var18.field4124;
                                            int var20 = var18.field4126 + 1 - var18.field4127;
                                            arg0.method1213(var18.field4118, (var18.field4124 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4127 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;B)J", line = 226)
    public static final long method608(String arg0, byte arg1) {
        field1137++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 'A');
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        int var7 = -72 / ((arg1 - 1) / 50);
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }
}
