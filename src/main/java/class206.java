import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class206 extends class294 {

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3249 = "Loaded sprites";

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3251 = "green:";

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "Lci;")
    public static class327 field3254 = new class327();

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "Len;")
    public static class192 field3258;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "Lci;")
    public static class327 field3260;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lqm;I)V", line = 9)
    public static final void method1570(class227 arg0, int arg1) {
        field3248++;
        byte[] var2 = new byte[24];
        if (class20.field230 != null) {
            try {
                class20.field230.method1794(0L, (byte) 106);
                class20.field230.method1793(var2, (byte) 125);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method1722(-2097152, 24, 0, var2);
        if (arg1 != 1) {
            field3250 = -85;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILth;)V", line = 55)
    public static final void method1571(int arg0, class57 arg1) {
        class40.field586 = arg1.method483(-1, "runes");
        field3252++;
        if (arg0 != -7784) {
            method1571(-76, (class57) null);
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V", line = 67)
    public static final void method1572(byte arg0) {
        field3255++;
        if (class137.method1038(true) != 2) {
            return;
        }
        byte var1 = (byte) (class2.field14 - 4 & 0xFF);
        int var2 = class2.field14 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class274.field4541[var3][var2][var4] = var1;
            }
        }
        if (class186.field2991 == 3) {
            return;
        }
        int var5 = 0;
        if (arg0 > -19) {
            method1573((int[]) null, (Object[]) null, -61, 61, -9);
        }
        while (var5 < 2) {
            class298.field4777[var5] = -1000000;
            class319.field5080[var5] = 1000000;
            class21.field235[var5] = 0;
            class210.field3305[var5] = 1000000;
            class234.field3884[var5] = 0;
            var5++;
        }
        if (class112.field1827 != 1) {
            int var16 = class271.method2034(-1, class229.field3807, class281.field4617, class186.field2991);
            if ((var16 - field3250) < 800 && (class178.field2856[class186.field2991][class281.field4617 >> 7][class229.field3807 >> 7] & 0x4) != 0) {
                class181.method1418(false, class129.field2184, -37, 1, class229.field3807 >> 7, class281.field4617 >> 7);
            }
            return;
        }
        if ((class178.field2856[class186.field2991][class6.field55.field3577 >> 7][class6.field55.field3511 >> 7] & 0x4) != 0) {
            class181.method1418(false, class129.field2184, -126, 0, class6.field55.field3511 >> 7, class6.field55.field3577 >> 7);
        }
        if (class194.field3095 >= 310) {
            return;
        }
        int var6 = class281.field4617 >> 7;
        int var7 = class229.field3807 >> 7;
        int var8 = class6.field55.field3577 >> 7;
        int var9 = class6.field55.field3511 >> 7;
        int var10;
        if (var9 > var7) {
            var10 = var9 - var7;
        } else {
            var10 = var7 - var9;
        }
        int var11;
        if (var6 < var8) {
            var11 = var8 - var6;
        } else {
            var11 = var6 - var8;
        }
        if (var11 == 0 && var10 == 0 || var11 <= -104 || var11 >= 104 || var10 <= -104 || var10 >= 104) {
            class285.method2079((Throwable) null, (byte) -16, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class93.field1562 + "," + class275.field4546);
            return;
        }
        if (var10 >= var11) {
            int var14 = var11 * 65536 / var10;
            int var15 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class178.field2856[class186.field2991][var6][var7] & 0x4) != 0) {
                    class181.method1418(false, class129.field2184, -56, 1, var7, var6);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var8 > var6) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    var15 -= 65536;
                    if ((class178.field2856[class186.field2991][var6][var7] & 0x4) != 0) {
                        class181.method1418(false, class129.field2184, -83, 1, var7, var6);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = 32768;
        int var13 = var10 * 65536 / var11;
        while (var6 != var8) {
            if (var6 < var8) {
                var6++;
            } else if (var8 < var6) {
                var6--;
            }
            if ((class178.field2856[class186.field2991][var6][var7] & 0x4) != 0) {
                class181.method1418(false, class129.field2184, -15, 1, var7, var6);
                break;
            }
            var12 += var13;
            if (var12 >= 65536) {
                var12 -= 65536;
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class178.field2856[class186.field2991][var6][var7] & 0x4) != 0) {
                    class181.method1418(false, class129.field2184, -92, 1, var7, var6);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([I[Ljava/lang/Object;III)V", line = 263)
    public static final void method1573(int[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        field3253++;
        if (arg3 < arg2) {
            int var5 = (arg3 + arg2) / 2;
            int var6 = arg0[var5];
            arg0[var5] = arg0[arg2];
            int var7 = arg3;
            arg0[arg2] = var6;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (((var9 & 0x1) + var6) > arg0[var9]) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var7];
                    arg0[var7] = var10;
                    Object var11 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7++] = var11;
                }
            }
            arg0[arg2] = arg0[var7];
            arg0[var7] = var6;
            arg1[arg2] = arg1[var7];
            arg1[var7] = var8;
            method1573(arg0, arg1, var7 - 1, arg3, -12359);
            method1573(arg0, arg1, arg2, var7 + 1, -12359);
        }
        if (arg4 != -12359) {
            method1571(-106, (class57) null);
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)V", line = 318)
    public static void method1574(boolean arg0) {
        field3251 = null;
        field3254 = null;
        if (arg0) {
            field3254 = (class327) null;
        }
        field3260 = null;
        field3258 = null;
        field3249 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)I", line = 334)
    public static final int method1575(int arg0, byte arg1) {
        field3256++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg1 != 99) {
            field3258 = (class192) null;
        }
        return var6 + 1;
    }
}
