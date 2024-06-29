import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class203 extends class745 {

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "S")
    public short field3005;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "Lda;")
    public static class443 field3004;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[Lmfa;)I")
    public final int method1424(int arg0, class217[] arg1) {
        ++field2998;
        if (arg0 != 4) {
            this.field3005 = 123;
        }
        return this.method4113(arg1, super.field10350 >> class679.field9600, (byte) 122, super.field10347 >> class679.field9600);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/awt/Canvas;Lgga;BLd;)Lha;")
    public static final class475 method1425(int arg0, Canvas arg1, class513 arg2, byte arg3, class103 arg4) {
        ++field3000;
        if (!class420.method2480(13753)) {
            throw new RuntimeException("");
        } else if (arg3 != 31) {
            return null;
        } else if (!class27.method224(arg3 + 82, "jaggl")) {
            throw new RuntimeException("");
        } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg1, 8, 8, 8, 24, 0, arg0);
            if (~var6 == -1L) {
                throw new RuntimeException("");
            } else {
                class642 var8 = new class642(var5, arg1, var6, arg4, arg2, arg0);
                var8.method980((byte) 125);
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
    public static final int method1426(int arg0, int arg1) {
        return class97.field1386 != null ? class97.field1386[arg0][arg1] & 255 : 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILuf;IIJLaa;II)V")
    public static final void method1427(int arg0, int arg1, class519 arg2, int arg3, int arg4, long arg5, class88 arg6, int arg7, int arg8) {
        if (arg7 >= -9) {
            field3004 = null;
        }
        ++field3003;
        int var10 = arg3 * arg3 + arg4 * arg4;
        if (~arg5 <= ~((long) var10)) {
            int var11 = Math.min(arg2.field7128 / 2, arg2.field7255 / 2);
            if (var11 * var11 >= var10) {
                class406.method2403(arg2, arg0, (byte) 59, arg6, arg1, arg4, arg3, class143.field2327[arg8]);
            } else {
                var11 -= 10;
                int var12;
                if (~class783.field10725 != -5) {
                    var12 = 16383 & (int) class98.field1423 + class654.field9251;
                } else {
                    var12 = (int) class98.field1423 & 16383;
                }
                int var13 = class253.field3634[var12];
                int var14 = class253.field3633[var12];
                if (~class783.field10725 != -5) {
                    var14 = var14 * 256 / (class592.field8487 - -256);
                    var13 = var13 * 256 / (class592.field8487 - -256);
                }
                int var15 = arg4 * var13 - -(arg3 * var14) >> 14;
                int var16 = arg4 * var14 + -(arg3 * var13) >> 14;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) ((double) var11 * Math.sin(var17));
                int var20 = (int) ((double) var11 * Math.cos(var17));
                class664.field9358[arg8].method751((float) arg2.field7128 / 2.0F + (float) arg0 + (float) var19, (float) arg2.field7255 / 2.0F + (float) arg1 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLha;)Z")
    public final boolean method1428(byte arg0, class475 arg1) {
        ++field3008;
        return arg0 >= -88 ? false : class291.method1845(super.field10350 >> class679.field9600, (byte) -53, super.field10347 >> class679.field9600, super.field10349);
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(B)Z")
    public final boolean method1429(byte arg0) {
        if (arg0 <= 123) {
            return false;
        } else {
            ++field3002;
            return class737.field10233[(super.field10347 >> class679.field9600) + -class277.field3995 + class162.field2499][(super.field10350 >> class679.field9600) - -class162.field2499 + -class3.field47];
        }
    }

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "(I)V")
    public static final void method1430(int arg0) {
        if (class138.field2289 != null) {
            class138.field2289.method2709(11309);
        }
        ++field3001;
        if (class254.field3642 != null) {
            while (true) {
                try {
                    class254.field3642.join();
                    break;
                } catch (InterruptedException var1) {
                }
            }
        }
        if (arg0 != 187) {
            method1427(104, -114, (class519) null, 3, 86, -38L, (class88) null, 120, -74);
        }
    }

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "(I)V")
    public static void method1431(int arg0) {
        if (arg0 != 256) {
            method1426(84, 117);
        }
        field3004 = null;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(Z)V")
    public static final void method1432(boolean arg0) {
        if (!arg0) {
            if (class111.field1591.toLowerCase().indexOf("microsoft") != -1) {
                class231.field3377[192] = 58;
                class231.field3377[221] = 43;
                class231.field3377[189] = 26;
                class231.field3377[223] = 28;
                class231.field3377[187] = 27;
                class231.field3377[186] = 57;
                class231.field3377[190] = 72;
                class231.field3377[191] = 73;
                class231.field3377[219] = 42;
                class231.field3377[222] = 59;
                class231.field3377[220] = 74;
                class231.field3377[188] = 71;
            } else {
                class231.field3377[91] = 42;
                class231.field3377[47] = 73;
                class231.field3377[44] = 71;
                class231.field3377[61] = 27;
                class231.field3377[93] = 43;
                class231.field3377[92] = 74;
                class231.field3377[59] = 57;
                class231.field3377[45] = 26;
                class231.field3377[46] = 72;
                if (class111.field1610 == null) {
                    class231.field3377[192] = 58;
                    class231.field3377[222] = 59;
                } else {
                    class231.field3377[222] = 58;
                    class231.field3377[520] = 59;
                    class231.field3377[192] = 28;
                }
            }
            ++field2999;
        }
    }

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "(I)V")
    public static final void method1433(int arg0) {
        ++field3007;
        if (arg0 <= 43) {
            field3004 = null;
        }
        class694 var1 = null;
        try {
            var1 = class111.method919(0, "2");
            class431 var2 = new class431(3 - -(class652.field9237 * 6));
            var2.method2524(false, 1);
            var2.method2546(true, class652.field9237);
            for (int var3 = 0; ~var3 > ~class362.field5135.length; ++var3) {
                if (class769.field10616[var3]) {
                    var2.method2546(true, var3);
                    var2.method2548(class362.field5135[var3], (byte) -126);
                }
            }
            var1.method3898(var2.field6002, (byte) -107, var2.field5983, 0);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3900(95);
            }
        } catch (Exception var4) {
        }
        class20.field198 = class337.method2062(false);
        class193.field2899 = false;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIII)V")
    public class203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field10350 = arg2;
        this.field3005 = (short) arg5;
        super.field10349 = (byte) arg4;
        super.field10358 = arg1;
        super.field10347 = arg0;
        super.field10361 = (byte) arg3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZ)I")
    public static final int method1434(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 != 222) {
            return -71;
        } else {
            ++field3006;
            class393 var4 = class275.method1745(arg3, (byte) -100, arg0);
            if (var4 == null) {
                return 0;
            } else if (~arg1 == 0) {
                return 0;
            } else {
                int var5 = 0;
                for (int var6 = 0; ~var6 > ~var4.field5460.length; ++var6) {
                    if (var4.field5458[var6] == arg1) {
                        var5 += var4.field5460[var6];
                    }
                }
                return var5;
            }
        }
    }
}
