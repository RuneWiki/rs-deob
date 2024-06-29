import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class class187 {

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2912 = "Connected to update server";

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field2907;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field2913;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public int field2915;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "Lnm;")
    public static class221 field2908;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 7)
    public static void method1288(byte arg0) {
        if (arg0 <= 69) {
            field2912 = (String) null;
        }
        field2912 = null;
        field2908 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III[BILjava/lang/String;)I", line = 21)
    public static final int method1289(int arg0, int arg1, int arg2, byte[] arg3, int arg4, String arg5) {
        int var6 = arg1 - arg2;
        field2914++;
        if (arg0 <= 95) {
            method1289(118, -31, -107, (byte[]) null, -118, (String) null);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg4 + var7] = -97;
            } else {
                arg3[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Lpd;", line = 171)
    public static final class113 method1290(int arg0, int arg1) {
        field2905++;
        if (arg0 != 63) {
            field2912 = (String) null;
        }
        class113 var2 = (class113) class143.field2297.method652((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class50.field751.method1504(arg1, true, 16);
        class113 var4 = new class113();
        if (var3 != null) {
            var4.method742(new class313(var3), 0);
        }
        class143.field2297.method642(var4, (long) arg1, -91);
        return var4;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lfh;I)Lie;", line = 201)
    public static final class3 method1291(class313 arg0, int arg1) {
        arg0.method2224(-124);
        field2906++;
        int var2 = arg0.method2224(arg1 - 121);
        class3 var3 = class268.method1892(var2, -115);
        var3.field22 = arg0.method2224(-127);
        int var4 = arg0.method2224(-125);
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method2224(-120);
            var3.method14(arg0, var6, false);
        }
        var3.method20((byte) 121);
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI[B[Lgd;BI)V", line = 232)
    public static final void method1292(boolean arg0, int arg1, byte[] arg2, class154[] arg3, byte arg4, int arg5) {
        field2911++;
        if (arg4 != -128) {
            return;
        }
        class313 var6 = new class313(arg2);
        int var7 = -1;
        while (true) {
            int var8 = var6.method2217(103);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method2201(128);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method2224(-127);
                int var15 = var14 >> 2;
                int var16 = arg1 + var12;
                int var17 = arg5 + var11;
                int var18 = var14 & 0x3;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    class154 var19 = null;
                    if (!arg0) {
                        int var20 = var13;
                        if ((class148.field2392[1][var16][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    client.method899(!arg0, var18, var7, var13, var15, arg0, var16, var13, 0, var17, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
    public abstract void method570(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
    public abstract void method572(int arg0, int arg1);
}
