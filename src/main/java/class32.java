import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class32 {

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "Lak;")
    private class498 field306 = new class498();

    @OriginalMember(owner = "client!faa", name = "s", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "Lqp;")
    private class715 field305;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "[[I")
    public static int[][] field303 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "Lnca;")
    public static class627 field302 = new class627("LIVE", 0);

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILqd;)V", line = 3)
    private final void method160(int arg0, class574 arg1) {
        field293++;
        if (arg0 <= 124) {
            method163(-119);
        }
        if (arg1 != null) {
            arg1.method2656((byte) 122);
            arg1.method2381(15735);
            this.field310 += arg1.field8269;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V", line = 24)
    public final void method161(int arg0) {
        field309++;
        this.field306.method3031(17294);
        if (arg0 < -125) {
            this.field305.method4013(-3);
            this.field310 = this.field298;
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lut;Ljava/lang/Object;IZ)V", line = 38)
    private final void method162(class688 arg0, Object arg1, int arg2, boolean arg3) {
        if (arg3) {
            method170(-76, true);
        }
        field292++;
        if (this.field298 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method165(arg0, -22238);
        this.field310 -= arg2;
        while (this.field310 < 0) {
            class574 var6 = (class574) this.field306.method3030(-41);
            this.method160(127, var6);
        }
        class513 var5 = new class513(arg0, arg1, arg2);
        this.field305.method4022(var5, -35, arg0.method101((byte) -103));
        this.field306.method3029(0, var5);
        var5.field5602 = 0L;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V", line = 70)
    public static void method163(int arg0) {
        if (arg0 != 0) {
            method164(49, 127, true, 34, 114, -84);
        }
        field303 = null;
        field302 = null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIZIII)V", line = 85)
    public static final void method164(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field297++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg3 * arg3;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        if (!arg2) {
            field302 = null;
        }
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - 1) * var15;
        if (class377.field5458 <= arg1 && class362.field5291 >= arg1) {
            int var21 = class183.method1292(class200.field2976, -1, class204.field3061, arg0 + arg3);
            int var22 = class183.method1292(class200.field2976, -1, class204.field3061, arg0 - arg3);
            class518.method3153(var21, var22, class193.field2839[arg1], -7, arg4);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var23 = arg1 - var7;
            int var24 = arg1 + var7;
            if (class377.field5458 <= var24 && class362.field5291 >= var23) {
                int var25 = class183.method1292(class200.field2976, -1, class204.field3061, arg0 + var6);
                int var26 = class183.method1292(class200.field2976, -1, class204.field3061, arg0 - var6);
                if (var23 >= class377.field5458) {
                    class518.method3153(var25, var26, class193.field2839[var23], -7, arg4);
                }
                if (var24 <= class362.field5291) {
                    class518.method3153(var25, var26, class193.field2839[var24], -7, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lut;I)V", line = 189)
    private final void method165(class688 arg0, int arg1) {
        field299++;
        long var3 = arg0.method101((byte) -103);
        if (arg1 != -22238) {
            this.field305 = null;
        }
        for (class574 var5 = (class574) this.field305.method4020(var3, (byte) -75); var5 != null; var5 = (class574) this.field305.method4018((byte) 102)) {
            if (var5.field8267.method100(arg0, arg1 + 18463)) {
                this.method160(arg1 + 22365, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V", line = 216)
    public final void method166(byte arg0) {
        field295++;
        for (class574 var2 = (class574) this.field306.method3025(false); var2 != null; var2 = (class574) this.field306.method3026(true)) {
            if (var2.method3116((byte) -5)) {
                var2.method2656((byte) 123);
                var2.method2381(15735);
                this.field310 += var2.field8269;
            }
        }
        if (arg0 >= -6) {
            this.method171(true);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IB)V", line = 243)
    public final void method167(int arg0, byte arg1) {
        if (arg1 != 87) {
            field303 = null;
        }
        field300++;
        if (class522.field7588 == null) {
            return;
        }
        for (class574 var3 = (class574) this.field306.method3025(false); var3 != null; var3 = (class574) this.field306.method3026(true)) {
            if (var3.method3116((byte) -5)) {
                if (var3.method3121(arg1 - 203) == null) {
                    var3.method2656((byte) 123);
                    var3.method2381(arg1 ^ 0x3D20);
                    this.field310 += var3.field8269;
                }
            } else if (++var3.field5602 > (long) arg0) {
                class574 var4 = class522.field7588.method3412(-13826, var3);
                this.field305.method4022(var4, -62, var3.field6188);
                class589.method3465(var4, var3, 53);
                var3.method2656((byte) 123);
                var3.method2381(15735);
            }
        }
    }

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)V", line = 295)
    public static final void method168(int arg0) {
        field294++;
        if (class693.method3912(-18935, class369.field5392) || class488.method2970(class369.field5392, false)) {
            class340.method2091(class123.field1698 >> 12, 5000, 160, class518.field7473 >> 12);
        } else {
            int var1 = class108.field1536.field4646[0] >> 3;
            int var2 = class108.field1536.field4645[0] >> 3;
            if (var1 >= 0 && (class184.field2546 >> 3) > var1 && var2 >= 0 && (class240.field3555 >> 3) > var2) {
                class340.method2091(var2, 5000, 160, var1);
            } else {
                class340.method2091(class240.field3555 >> 4, 0, 160, class184.field2546 >> 4);
            }
        }
        class739.method4128(false);
        class108.method798((byte) -64);
        class543.method3262(1);
        if (arg0 != -4897) {
            method163(-104);
        }
        class67.method592(0);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lut;B)Ljava/lang/Object;", line = 324)
    public final Object method169(class688 arg0, byte arg1) {
        field296++;
        long var3 = arg0.method101((byte) -103);
        for (class574 var5 = (class574) this.field305.method4020(var3, (byte) -66); var5 != null; var5 = (class574) this.field305.method4018((byte) 78)) {
            if (var5.field8267.method100(arg0, arg1 - 3875)) {
                Object var6 = var5.method3121(102);
                if (var6 != null) {
                    if (var5.method3116((byte) -5)) {
                        class513 var7 = new class513(arg0, var6, var5.field8269);
                        this.field305.method4022(var7, -74, var5.field6188);
                        this.field306.method3029(0, var7);
                        var7.field5602 = 0L;
                        var5.method2656((byte) 119);
                        var5.method2381(arg1 + 15635);
                    } else {
                        this.field306.method3029(0, var5);
                        var5.field5602 = 0L;
                    }
                    return var6;
                }
                var5.method2656((byte) 124);
                var5.method2381(arg1 ^ 0x3D13);
                this.field310 += var5.field8269;
            }
        }
        if (arg1 != 100) {
            this.field298 = 123;
        }
        return null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IZ)I", line = 385)
    public static final int method170(int arg0, boolean arg1) {
        field304++;
        if (!arg1) {
            method168(47);
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xF2) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)I", line = 439)
    public final int method171(boolean arg0) {
        field307++;
        return arg0 ? -66 : this.field310;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lut;Ljava/lang/Object;I)V", line = 451)
    public final void method172(class688 arg0, Object arg1, int arg2) {
        field301++;
        int var4 = -17 / ((arg2 - 58) / 51);
        this.method162(arg0, arg1, 1, false);
    }

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)I", line = 466)
    public final int method173(int arg0) {
        if (arg0 < 117) {
            this.field310 = -114;
        }
        field308++;
        return this.field298;
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(I)V", line = 480)
    public class32(int arg0) {
        this.field310 = arg0;
        this.field298 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field305 = new class715(var2);
    }
}
