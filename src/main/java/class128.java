import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class128 implements class27 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lok;")
    private class160 field2049 = new class160(256);

    @OriginalMember(owner = "client!el", name = "k", descriptor = "Lpk;")
    private class120 field2057;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "Lpk;")
    private class120 field2059;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[Laa;")
    private class10[] field2051;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Z")
    public static boolean field2052 = false;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Ltk;")
    public static class266 field2056 = null;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(BI)Lbe;", line = 11)
    public class314 method997(byte arg0, int arg1) {
        class123 var3 = this.field2049.method1183((long) arg1, (byte) -119);
        if (arg0 != 20) {
            return (class314) null;
        }
        field2055++;
        if (var3 != null) {
            return (class314) var3;
        }
        byte[] var4 = this.field2059.method950(-1516, arg1);
        if (var4 == null) {
            return null;
        } else {
            class314 var5 = new class314(new class1(var4));
            this.field2049.method1182((byte) 64, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(BI)I", line = 36)
    public static final int method998(byte arg0, int arg1) {
        field2047++;
        if (arg0 <= 67) {
            field2060 = 108;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)Z", line = 48)
    public final boolean method243(int arg0, int arg1) {
        class314 var3 = this.method997((byte) 20, arg0);
        if (arg1 < 32) {
            return false;
        } else {
            field2053++;
            return var3 != null && var3.method2212(this.field2057, 4, this);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Laa;", line = 68)
    public final class10 method241(int arg0, int arg1) {
        field2061++;
        return arg1 == 5 ? this.field2051[arg0] : (class10) null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIIIIB)V", line = 80)
    public static final void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field2048++;
        class43 var10 = null;
        int var11 = 118 / ((arg9 + 7) / 49);
        for (class43 var12 = (class43) class181.field2876.method268(-1); var12 != null; var12 = (class43) class181.field2876.method278(1)) {
            if (var12.field687 == arg0 && var12.field686 == arg1 && var12.field688 == arg8 && var12.field680 == arg2) {
                var10 = var12;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class43();
            var10.field687 = arg0;
            var10.field680 = arg2;
            var10.field688 = arg8;
            var10.field686 = arg1;
            class81.method632(var10, -28284);
            class181.field2876.method277(var10, (byte) -119);
        }
        var10.field685 = arg7;
        var10.field678 = arg5;
        var10.field676 = arg4;
        var10.field682 = arg3;
        var10.field677 = arg6;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 121)
    public static final void method1000(byte arg0) {
        class190.method1370(5, -121);
        field2054++;
        class11.method162(5, -1);
        class204.method1464(5, true);
        class57.method480(5, -23892);
        class91.method724(12800, 5);
        class6.method100(-119, 5);
        class170.method1268(5, (byte) -55);
        class160.method1179(5, 0);
        class339.method2352(5, 100);
        if (arg0 != -77) {
            return;
        }
        class174.method1291(32652, 5);
        class39.method342(46, 5);
        class87.method692(false, 5);
        class286.method2002(0, 5);
        class255.method1761(5, arg0 ^ 0x4C);
        class65.method516(false, 5);
        class100.method807(5, 127);
        class47.method405((byte) 69, 5);
        class47.method407((byte) -123, 50);
        class83.method655(false, 5);
        class280.method1975(5, 12551);
        class209.field3303.method2285(5, (byte) 113);
        class38.field578.method2285(5, (byte) 97);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 154)
    public static void method1001(boolean arg0) {
        field2056 = null;
        if (arg0) {
            method1000((byte) 114);
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lpk;Lpk;Lpk;)V", line = 190)
    public class128(class120 arg0, class120 arg1, class120 arg2) {
        this.field2057 = arg2;
        this.field2059 = arg1;
        class1 var4 = new class1(arg0.method967(0, 0, 65280));
        int var5 = var4.method56(19612);
        this.field2051 = new class10[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method15((byte) -127) == 1) {
                this.field2051[var6] = new class10();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2051[var7] != null) {
                this.field2051[var7].field232 = var4.method15((byte) 70) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2051[var8] != null) {
                this.field2051[var8].field222 = var4.method15((byte) 98) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2051[var9] != null) {
                this.field2051[var9].field228 = var4.method15((byte) 87) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2051[var10] != null) {
                this.field2051[var10].field227 = var4.method15((byte) -110) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2051[var11] != null) {
                this.field2051[var11].field223 = var4.method55(4);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2051[var12] != null) {
                this.field2051[var12].field238 = var4.method55(4);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2051[var13] != null) {
                this.field2051[var13].field236 = var4.method55(4);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2051[var14] != null) {
                this.field2051[var14].field231 = var4.method55(4);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2051[var15] != null) {
                this.field2051[var15].field233 = (short) var4.method56(19612);
            }
        }
        if (var4.field48 < var4.field34.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field2051[var16] != null) {
                    var4.method55(4);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field2051[var17] != null) {
                    var4.method55(4);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field2051[var18] != null) {
                    var4.method15((byte) -58);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field2051[var19] != null) {
                    this.field2051[var19].field230 = var4.method15((byte) 125) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field2051[var20] != null) {
                    var4.method55(4);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field2051[var21] != null) {
                    var4.method15((byte) -43);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field2051[var22] != null) {
                    var4.method15((byte) -102);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field2051[var23] != null) {
                    var4.method15((byte) 120);
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIZIIF)[I", line = 174)
    public final int[] method242(int arg0, int arg1, boolean arg2, int arg3, int arg4, float arg5) {
        field2050++;
        return arg4 == 0 ? this.method997((byte) 20, arg1).method2213((double) arg5, arg3, this.field2057, (byte) -93, arg0, this, arg2, this.field2051[arg1].field230) : (int[]) null;
    }
}
