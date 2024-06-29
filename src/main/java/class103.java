import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class103 {

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    private int field1735 = 65000;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "Lrb;")
    private class221 field1738 = null;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Lrb;")
    private class221 field1747 = null;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1731 = "glow3:";

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field1743 = 0;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Lik;")
    public static class259 field1740 = new class259(500);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "Lja;")
    public static class64 field1736;

    @OriginalMember(owner = "client!pm", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field1741++;
        return "Cache:" + this.field1739;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 16)
    public static final void method789(int arg0) {
        field1737++;
        for (int var1 = 0; var1 < 5; var1++) {
            class211.field3373[var1] = false;
        }
        class96.field1581 = -1;
        class11.field187 = 0;
        class143.field2256 = -1;
        class62.field960 = 1;
        class250.field3861 = 0;
        int var2 = -124 % ((84 - arg0) / 35);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lui;Lja;ILja;Z)V", line = 39)
    public static final void method790(class266 arg0, class64 arg1, int arg2, class64 arg3, boolean arg4) {
        if (arg2 > -105) {
            field1731 = (String) null;
        }
        class137.field2181 = arg1;
        class145.field2277 = arg4;
        field1733++;
        class13.field250 = arg3;
        int var5 = class13.field250.method466((byte) 23) - 1;
        class134.field2122 = class13.field250.method465(var5, 0) + var5 * 256;
        class177.field2779 = new String[] { null, null, null, null, class26.field436 };
        class3.field13 = arg0;
        class160.field2526 = new String[] { null, null, class124.field1985, null, null };
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[BIZI)Z", line = 62)
    private final boolean method791(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4) {
        field1734++;
        class221 var6 = this.field1747;
        synchronized (this.field1747) {
            try {
                int var7;
                boolean var10000;
                if (arg3) {
                    if (((long) (arg2 * 6 + 6)) > this.field1738.method1601((byte) 68)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field1738.method1603((byte) -76, (long) (arg2 * 6));
                    this.field1738.method1602(6, class189.field2997, 0, arg0 ^ 0xFFFFFF8A);
                    var7 = (class189.field2997[3] & 0xFF << 16) + (class189.field2997[4] & 0xFF << 8) + (class189.field2997[5] & 0xFF);
                    if (var7 <= 0 || this.field1747.method1601((byte) 68) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field1747.method1601((byte) 68) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class189.field2997[arg0] = (byte) (var7 >> 8);
                class189.field2997[3] = (byte) (var7 >> 16);
                class189.field2997[1] = (byte) (arg4 >> 8);
                int var8 = 0;
                class189.field2997[2] = (byte) arg4;
                class189.field2997[5] = (byte) var7;
                class189.field2997[0] = (byte) (arg4 >> 16);
                this.field1738.method1603((byte) -105, (long) (arg2 * 6));
                int var9 = 0;
                this.field1738.method1606(0, class189.field2997, 6, -104);
                while (true) {
                    if (arg4 > var8) {
                        label131: {
                            int var10 = 0;
                            if (arg3) {
                                label150: {
                                    this.field1747.method1603((byte) 75, (long) (var7 * 520));
                                    try {
                                        this.field1747.method1602(8, class189.field2997, 0, -106);
                                    } catch (EOFException var18) {
                                        break label131;
                                    }
                                    var10 = (class189.field2997[5] & 0xFF << 8) + ((class189.field2997[4] & 0xFF) << 16) + (class189.field2997[6] & 0xFF);
                                    int var12 = ((class189.field2997[0] & 0xFF) << 8) + (class189.field2997[1] & 0xFF);
                                    int var13 = ((class189.field2997[2] & 0xFF) << 8) + (class189.field2997[3] & 0xFF);
                                    int var14 = class189.field2997[7] & 0xFF;
                                    if (arg2 == var12 && var9 == var13 && this.field1739 == var14) {
                                        if (var10 >= 0 && this.field1747.method1601((byte) 68) / 520L >= (long) var10) {
                                            break label150;
                                        }
                                        var10000 = false;
                                        return var10000;
                                    }
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field1747.method1601((byte) 68) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                                arg3 = false;
                            }
                            int var15 = arg4 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class189.field2997[0] = (byte) (arg2 >> 8);
                            class189.field2997[3] = (byte) var9;
                            class189.field2997[1] = (byte) arg2;
                            class189.field2997[7] = (byte) this.field1739;
                            if ((arg4 - var8) <= 512) {
                                var10 = 0;
                            }
                            class189.field2997[5] = (byte) (var10 >> 8);
                            class189.field2997[2] = (byte) (var9 >> 8);
                            class189.field2997[6] = (byte) var10;
                            var9++;
                            class189.field2997[4] = (byte) (var10 >> 16);
                            this.field1747.method1603((byte) 125, (long) (var7 * 520));
                            var7 = var10;
                            this.field1747.method1606(0, class189.field2997, 8, 63);
                            this.field1747.method1606(var8, arg1, var15, -118);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([BB)[B", line = 181)
    public static final byte[] method792(byte[] arg0, byte arg1) {
        field1748++;
        int var2 = arg0.length;
        if (arg1 >= -52) {
            return (byte[]) null;
        } else {
            byte[] var3 = new byte[var2];
            class271.method1959(arg0, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)[B", line = 203)
    public final byte[] method793(boolean arg0, int arg1) {
        field1742++;
        class221 var3 = this.field1747;
        synchronized (this.field1747) {
            try {
                Object var10000;
                if (((long) (arg1 * 6 + 6)) > this.field1738.method1601((byte) 68)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                if (!arg0) {
                    method790((class266) null, (class64) null, 76, (class64) null, false);
                }
                this.field1738.method1603((byte) 46, (long) (arg1 * 6));
                this.field1738.method1602(6, class189.field2997, 0, -93);
                int var4 = (class189.field2997[2] & 0xFF) + ((class189.field2997[0] & 0xFF << 16) + (class189.field2997[1] & 0xFF << 8));
                int var5 = ((class189.field2997[3] & 0xFF) << 16) + (class189.field2997[4] & 0xFF << 8) + (class189.field2997[5] & 0xFF);
                if (var4 < 0 || var4 > this.field1735) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 > 0 && (this.field1747.method1601((byte) 68) / 520L) >= ((long) var5)) {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    label100: while (var4 > var7) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        int var9 = var4 - var7;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field1747.method1603((byte) -98, (long) (var5 * 520));
                        this.field1747.method1602(var9 + 8, class189.field2997, 0, -127);
                        int var10 = (class189.field2997[0] & 0xFF << 8) + (class189.field2997[1] & 0xFF);
                        int var11 = ((class189.field2997[2] & 0xFF) << 8) + (class189.field2997[3] & 0xFF);
                        int var12 = (class189.field2997[6] & 0xFF) + ((class189.field2997[4] & 0xFF << 16) + (class189.field2997[5] & 0xFF << 8));
                        int var13 = class189.field2997[7] & 0xFF;
                        if (arg1 == var10 && var8 == var11 && this.field1739 == var13) {
                            if (var12 >= 0 && (this.field1747.method1601((byte) 68) / 520L) >= ((long) var12)) {
                                var8++;
                                var5 = var12;
                                int var14 = 0;
                                while (true) {
                                    if (var9 <= var14) {
                                        continue label100;
                                    }
                                    var6[var7++] = class189.field2997[var14 + 8];
                                    var14++;
                                }
                            }
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var10000 = null;
                        return (byte[]) var10000;
                    }
                    byte[] var19 = var6;
                    return var19;
                } else {
                    var10000 = null;
                    return (byte[]) var10000;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III[B)Z", line = 283)
    public final boolean method794(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != -513) {
            field1740 = (class259) null;
        }
        field1732++;
        class221 var5 = this.field1747;
        synchronized (this.field1747) {
            if (arg0 < 0 || arg0 > this.field1735) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method791(4, arg3, arg2, true, arg0);
            if (!var6) {
                var6 = this.method791(4, arg3, arg2, false, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILrb;Lrb;I)V", line = 521)
    public class103(int arg0, class221 arg1, class221 arg2, int arg3) {
        this.field1739 = arg0;
        this.field1738 = arg2;
        this.field1735 = arg3;
        this.field1747 = arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([IIIIII)V", line = 312)
    public static final void method795(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class272 var6 = class60.field946[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class298 var7 = var6.field4235;
        if (var7 != null) {
            int var8 = var7.field4699;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class194 var10 = var6.field4222;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3077;
        int var12 = var10.field3080;
        int var13 = var10.field3094;
        int var14 = var10.field3086;
        int[] var15 = class259.field4014[var11];
        int[] var16 = class151.field2433[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ldg;III)V", line = 410)
    public static final void method796(class320 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class323.field5009) {
            class272 var4 = class60.field946[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4213 != null && var4.field4213.field1325.method983()) {
                arg0.method989(var4.field4213.field1325, 128, 0, 0, true);
            }
        }
        if (arg3 < class323.field5009) {
            class272 var5 = class60.field946[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4213 != null && var5.field4213.field1325.method983()) {
                arg0.method989(var5.field4213.field1325, 0, 0, 128, true);
            }
        }
        if (arg2 < class323.field5009 && arg3 < class196.field3122) {
            class272 var6 = class60.field946[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4213 != null && var6.field4213.field1325.method983()) {
                arg0.method989(var6.field4213.field1325, 128, 0, 128, true);
            }
        }
        if (arg2 < class323.field5009 && arg3 > 0) {
            class272 var7 = class60.field946[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4213 != null && var7.field4213.field1325.method983()) {
                arg0.method989(var7.field4213.field1325, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 466)
    public static final void method797(byte arg0) {
        field1745++;
        class191.method1414(false, false);
        System.gc();
        class320.method2196(25, arg0 + 80);
        if (arg0 != -80) {
            field1744 = 97;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V", line = 480)
    public static void method798(int arg0) {
        if (arg0 != 1) {
            method790((class266) null, (class64) null, 73, (class64) null, true);
        }
        field1736 = null;
        field1731 = null;
        field1740 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)J", line = 496)
    public static final long method799(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4220; var4++) {
            class45 var5 = var3.field4217[var4];
            if ((var5.field776 >> 29 & 0x3L) == 2L && var5.field770 == arg1 && var5.field772 == arg2) {
                return var5.field776;
            }
        }
        return 0L;
    }
}
