import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class258 {

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4165 = new String[200];

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field4171 = 0;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "[I")
    public static int[] field4172 = new int[100];

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Ldk;")
    public static class251 field4169;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Lci;")
    public static class65 field4162;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)V")
    public static final void method1733(byte arg0, int arg1, int arg2) {
        field4164++;
        if (arg0 != 95) {
            method1737(false, 95, -25, -47, 47, 96);
        }
        if (class67.method473(arg1, (byte) 31)) {
            class195.method1369(class34.field519[arg1], arg2, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[I[III)V")
    public static final void method1734(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field4166++;
        if (arg3 <= 86) {
            method1736(110);
        }
        if (arg4 <= arg0) {
            return;
        }
        int var5 = arg0;
        int var6 = (arg0 + arg4) / 2;
        int var7 = arg1[var6];
        arg1[var6] = arg1[arg4];
        arg1[arg4] = var7;
        int var8 = arg2[var6];
        arg2[var6] = arg2[arg4];
        arg2[arg4] = var8;
        for (int var9 = arg0; var9 < arg4; var9++) {
            if (((var9 & 0x1) + var7) > arg1[var9]) {
                int var10 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5] = var10;
                int var11 = arg2[var9];
                arg2[var9] = arg2[var5];
                arg2[var5++] = var11;
            }
        }
        arg1[arg4] = arg1[var5];
        arg1[var5] = var7;
        arg2[arg4] = arg2[var5];
        arg2[var5] = var8;
        method1734(arg0, arg1, arg2, 120, var5 - 1);
        method1734(var5 + 1, arg1, arg2, 91, arg4);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)Lsa;")
    public static final class260 method1735(byte arg0) {
        class260 var1 = new class260(class255.field4128, class111.field1749, class273.field4380[0], class314.field5058[0], class246.field3916[0], class60.field976[0], class70.field1192[0], class243.field3870);
        class28.method156(-27424);
        if (arg0 <= 12) {
            return null;
        } else {
            field4163++;
            return var1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static void method1736(int arg0) {
        if (arg0 != 0) {
            method1733((byte) -43, 114, 52);
        }
        field4172 = null;
        field4165 = null;
        field4162 = null;
        field4169 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1737(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class286.field4575++;
        if (class239.field3829 != null && class239.field3829.field637 - ((class239.field3829.method279(23397) - 1) * 64) >> 7 == class237.field3804 && (class239.field3829.field710 + 64 - (class239.field3829.method279(23397) * 64) >> 7) == class86.field1418) {
            class130.field2033 = false;
            class237.field3804 = 0;
        }
        field4167++;
        class158.method1093(-89);
        if (!arg0) {
            class108.method768(91);
        }
        class272.method1824(-1);
        class171.field2781 = arg4;
        class171.field2784 = arg2;
        if (class120.field1919 == 1) {
            int var6 = (int) class20.field240;
            if (var6 < (class230.field3731 / 256)) {
                var6 = class230.field3731 / 256;
            }
            if (class195.field3155[4] && (class179.field2928[4] + 128) > var6) {
                var6 = class179.field2928[4] + 128;
            }
            int var7 = (int) class90.field1456 + class46.field779 & 0x7FF;
            class243.method1626(var6, class163.field2646, var6 * 3 + 600, arg5, class162.field2580, true, class155.method1060((byte) -12, class56.field941, class239.field3829.field710, class239.field3829.field637) - 50, var7);
        } else if (class120.field1919 == 4) {
            int var8 = (int) class90.field1456 & 0x7FF;
            int var9 = (int) class20.field240;
            if (var9 < class230.field3731 / 256) {
                var9 = class230.field3731 / 256;
            }
            if (class195.field3155[4] && var9 < (class179.field2928[4] + 128)) {
                var9 = class179.field2928[4] + 128;
            }
            class243.method1626(var9, class163.field2646, var9 * 3 + 600, arg5, class162.field2580, true, class155.method1060((byte) -12, class56.field941, class95.field1537, class256.field4149) - 50, var8);
        } else if (class120.field1919 == 5) {
            class175.method1276(6472, arg5);
        }
        int var10 = class148.field2314;
        int var11 = class104.field1666;
        int var12 = class46.field776;
        int var13 = class264.field4245;
        int var14 = class71.field1207;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class195.field3155[var15]) {
                int var22 = (int) ((double) (class151.field2365[var15] * 2 + 1) * Math.random() + Math.sin((double) class153.field2376[var15] / 100.0D * (double) class234.field3773[var15]) * (double) class179.field2928[var15] - (double) class151.field2365[var15]);
                if (var15 == 4) {
                    class264.field4245 += var22;
                    if (class264.field4245 < 128) {
                        class264.field4245 = 128;
                    }
                    if (class264.field4245 > 383) {
                        class264.field4245 = 383;
                    }
                }
                if (var15 == 1) {
                    class46.field776 += var22;
                }
                if (var15 == 3) {
                    class71.field1207 = class71.field1207 + var22 & 0x7FF;
                }
                if (var15 == 2) {
                    class104.field1666 += var22;
                }
                if (var15 == 0) {
                    class148.field2314 += var22;
                }
            }
        }
        class169.method1229(125);
        class127.method904(arg4, arg2, arg3 + arg4, arg2 + arg5);
        class302.method2008();
        if (class67.field1116 < 0) {
            class127.method886(arg4, arg2, arg3, arg5, 0);
        } else {
            class21 var16 = class192.method1357(class206.field3284, class175.field2866, class67.field1116, class255.field4118, (byte) 110);
            var16.method117(class163.field2648, arg4, arg2, arg3, arg5, class264.field4245, class71.field1207, 0);
        }
        if (class286.field4537 || class236.field3792 < arg4 || (arg3 + arg4) <= class236.field3792 || arg2 > class177.field2905 || arg2 + arg5 <= class177.field2905) {
            class19.field233 = false;
            class71.field1206 = 0;
            class67.field1111 = true;
        } else {
            class67.field1111 = true;
            class71.field1206 = 0;
            int var17 = class123.field1960;
            int var18 = class46.field773;
            int var19 = class183.field3010;
            field4171 = (class236.field3792 - arg4) * (var18 - var17) / arg3 + var17;
            class19.field233 = true;
            int var20 = class251.field4001;
            class296.field4728 = (class177.field2905 - arg2) * (var19 - var20) / arg5 + var20;
        }
        class276.method1859((byte) 112);
        byte var21 = class128.method910(-107) == 2 ? (byte) class286.field4575 : 1;
        class78.method538(class148.field2314, class46.field776, class104.field1666, class264.field4245, class71.field1207, class151.field2369, class25.field307, class56.field927, class155.field2420, class92.field1480, class96.field1550, class56.field941 + 1, var21, class239.field3829.field637 >> 7, class239.field3829.field710 >> 7);
        class276.method1859((byte) 123);
        class208.method1452();
        if (arg1 < 110) {
            method1735((byte) -122);
        }
        class174.method1268(256, arg4, arg2, 256, false, arg3, arg5);
        class26.method143(arg2, arg4, 256, arg5, 256, arg3, true);
        ((class20) class302.field4828).method111(18, class223.field3630);
        class22.method123(arg4, arg3, 929192351, arg2, arg5);
        class46.field776 = var12;
        class148.field2314 = var10;
        class71.field1207 = var14;
        class104.field1666 = var11;
        class264.field4245 = var13;
        if (class168.field2744 && class90.field1472.method429(false) == 0) {
            class168.field2744 = false;
        }
        if (class168.field2744) {
            class127.method886(arg4, arg2, arg3, arg5, 0);
            class249.method1660(class47.field797, false, false);
        }
        if (!arg0 && !class168.field2744 && !class286.field4537 && class236.field3792 >= arg4 && class236.field3792 < arg3 + arg4 && class177.field2905 >= arg2 && (arg2 + arg5) > class177.field2905) {
            class307.method2051(101, arg4, arg3, class177.field2905, arg5, class236.field3792, arg2);
        }
    }
}
