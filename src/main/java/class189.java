import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class189 {

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field3175 = 5;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public int field3176 = -1;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Z")
    public boolean field3190 = false;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public int field3183 = 99;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "Z")
    public boolean field3189 = false;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public int field3178 = -1;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "Z")
    public boolean field3188 = false;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "Z")
    public boolean field3195 = false;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public int field3192 = 2;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public int field3191 = -1;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
    public int field3202 = -1;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public int field3187 = -1;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "Z")
    public static boolean field3194 = false;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "Lob;")
    public static class521 field3201 = new class521(59, 7);

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Ljq;")
    public class357 field3177;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "[I")
    public int[] field3181;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "[I")
    private int[] field3197;

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "[I")
    public int[] field3204;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "[Z")
    public boolean[] field3198;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "[[I")
    public int[][] field3179;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIILt;)Lt;", line = 7)
    public final class475 method1324(int arg0, int arg1, int arg2, int arg3, int arg4, class475 arg5) {
        field3200++;
        int var7 = this.field3204[arg4];
        int var8 = this.field3181[arg4];
        class22 var9 = this.field3177.method2239(var8 >> 16, (byte) -72);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method449((byte) 1, arg2, true);
        }
        class22 var11 = null;
        if ((this.field3190 || class55.field685) && arg3 != -1 && arg3 < this.field3181.length) {
            int var12 = this.field3181[arg3];
            var11 = this.field3177.method2239(var12 >> 16, (byte) -49);
            arg3 = var12 & 0xFFFF;
        }
        class22 var13 = null;
        class22 var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = -90 % ((arg0 - 32) / 62);
        if (this.field3197 != null) {
            if (arg4 < this.field3197.length) {
                var15 = this.field3197[arg4];
                if (var15 != 65535) {
                    var13 = this.field3177.method2239(var15 >> 16, (byte) -95);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3190 || class55.field685) && arg3 != -1 && this.field3197.length > arg3) {
                var16 = this.field3197[arg3];
                if (var16 != 65535) {
                    var14 = this.field3177.method2239(var16 >> 16, (byte) -82);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field3195) {
            arg2 |= 0x200;
        }
        if (var9.method165(var10, true)) {
            arg2 |= 0x80;
        }
        if (var9.method166(14360, var10)) {
            arg2 |= 0x100;
        }
        if (var9.method164(256, var10)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method165(var15, true)) {
                arg2 |= 0x80;
            }
            if (var13.method166(14360, var15)) {
                arg2 |= 0x100;
            }
            if (var13.method164(256, var15)) {
                arg2 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method165(arg3, true)) {
                arg2 |= 0x80;
            }
            if (var11.method166(14360, arg3)) {
                arg2 |= 0x100;
            }
            if (var11.method164(256, arg3)) {
                arg2 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method165(var16, true)) {
                arg2 |= 0x80;
            }
            if (var14.method166(14360, var16)) {
                arg2 |= 0x100;
            }
            if (var14.method164(256, var16)) {
                arg2 |= 0x400;
            }
        }
        int var18 = arg2 | 0x20;
        class475 var19 = arg5.method449((byte) 1, var18, true);
        var19.method2860(var11, arg1 - 1, 0, (byte) 77, var7, this.field3195, var10, arg3, var9);
        if (var13 != null) {
            var19.method2860(var14, arg1 - 1, 0, (byte) 39, var7, this.field3195, var15, var16, var13);
        }
        return var19;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BILhp;)V", line = 143)
    private final void method1325(byte arg0, int arg1, class217 arg2) {
        if (arg1 == 1) {
            int var13 = arg2.method1511(-26);
            this.field3204 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3204[var14] = arg2.method1511(-62);
            }
            this.field3181 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3181[var15] = arg2.method1511(-44);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3181[var16] = (arg2.method1511(-106) << 16) + this.field3181[var16];
            }
        } else if (arg1 == 2) {
            this.field3202 = arg2.method1511(87);
        } else if (arg1 == 3) {
            this.field3198 = new boolean[256];
            int var4 = arg2.method1515((byte) 127);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3198[arg2.method1515((byte) 126)] = true;
            }
        } else if (arg1 == 4) {
            this.field3188 = true;
        } else if (arg1 == 5) {
            this.field3175 = arg2.method1515((byte) 123);
        } else if (arg1 == 6) {
            this.field3178 = arg2.method1511(-24);
        } else if (arg1 == 7) {
            this.field3191 = arg2.method1511(77);
        } else if (arg1 == 8) {
            this.field3183 = arg2.method1515((byte) 121);
        } else if (arg1 == 9) {
            this.field3187 = arg2.method1515((byte) 125);
        } else if (arg1 == 10) {
            this.field3176 = arg2.method1515((byte) 127);
        } else if (arg1 == 11) {
            this.field3192 = arg2.method1515((byte) 123);
        } else if (arg1 == 12) {
            int var10 = arg2.method1515((byte) 123);
            this.field3197 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3197[var11] = arg2.method1511(-121);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3197[var12] += arg2.method1511(98) << 16;
            }
        } else if (arg1 == 13) {
            int var6 = arg2.method1511(-87);
            this.field3179 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1515((byte) 124);
                if (var8 > 0) {
                    this.field3179[var7] = new int[var8];
                    this.field3179[var7][0] = arg2.method1548(31529);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field3179[var7][var9] = arg2.method1511(-55);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field3195 = true;
        } else if (arg1 == 15) {
            this.field3190 = true;
        } else if (arg1 == 16) {
            this.field3189 = true;
        }
        int var17 = 12 / ((73 - arg0) / 49);
        field3174++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZII)I", line = 301)
    public final int method1326(int arg0, boolean arg1, int arg2, int arg3) {
        field3196++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field3181[arg0];
        if (arg3 <= 122) {
            return -45;
        }
        class22 var8 = null;
        class22 var9 = this.field3177.method2239(var7 >> 16, (byte) -58);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field3190 || class55.field685) && arg2 != -1 && this.field3181.length > arg2) {
            int var11 = this.field3181[arg2];
            var8 = this.field3177.method2239(var11 >> 16, (byte) -102);
            var6 = var11 & 0xFFFF;
        }
        if (this.field3195) {
            var5 |= 0x200;
        }
        if (var9.method165(var10, true)) {
            var5 |= 0x80;
        }
        if (var9.method166(14360, var10)) {
            var5 |= 0x100;
        }
        if (var9.method164(256, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method165(var6, true)) {
                var5 |= 0x80;
            }
            if (var8.method166(14360, var6)) {
                var5 |= 0x100;
            }
            if (var8.method164(256, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field3197 != null && arg1) {
            if (this.field3197.length > arg0) {
                int var12 = this.field3197[arg0];
                if (var12 != 65535) {
                    class22 var13 = this.field3177.method2239(var12 >> 16, (byte) 110);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method165(var14, true)) {
                            var5 |= 0x80;
                        }
                        if (var13.method166(14360, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method164(256, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field3190 || class55.field685) && arg2 != -1 && arg2 < this.field3197.length) {
                int var15 = this.field3197[arg2];
                if (var15 != 65535) {
                    class22 var16 = this.field3177.method2239(var15 >> 16, (byte) 80);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method165(var17, true)) {
                            var5 |= 0x80;
                        }
                        if (var16.method166(14360, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method164(256, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 431)
    public static final void method1327(byte arg0) {
        field3193++;
        if (class347.field5125 != -1) {
            class219.method1577(class347.field5125, false, 103, -1, -1);
            class347.field5125 = -1;
        }
        int var1 = 78 % ((-arg0 - 40) / 38);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 452)
    public final void method1328(int arg0) {
        if (this.field3176 == -1) {
            if (this.field3198 == null) {
                this.field3176 = 0;
            } else {
                this.field3176 = 2;
            }
        }
        if (this.field3187 == -1) {
            if (this.field3198 == null) {
                this.field3187 = 0;
            } else {
                this.field3187 = 2;
            }
        }
        field3203++;
        if (arg0 <= 75) {
            this.method1332(null, 9, 93, -15, (byte) 118, 19, 120, 90);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILhp;)V", line = 488)
    public final void method1329(int arg0, class217 arg1) {
        if (arg0 > -26) {
            this.field3178 = -66;
        }
        field3199++;
        while (true) {
            int var3 = arg1.method1515((byte) 121);
            if (var3 == 0) {
                return;
            }
            this.method1325((byte) -55, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILfp;)V", line = 516)
    public static final void method1330(int arg0, class214 arg1) {
        if (arg0 != 1024) {
            method1331(-18);
        }
        field3184++;
        if (arg1.field3486 != null) {
            arg1.field3486.field4611 = 0;
        }
        arg1.field3487 = false;
        for (class214 var2 = arg1.method386(); var2 != null; var2 = arg1.method394()) {
            method1330(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V", line = 562)
    public static void method1331(int arg0) {
        field3201 = null;
        if (arg0 != 5883) {
            field3180 = -41;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lt;IIIBIII)Lt;", line = 583)
    public final class475 method1332(class475 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field3185++;
        int var9 = this.field3204[arg7];
        int var10 = this.field3181[arg7];
        class22 var11 = this.field3177.method2239(var10 >> 16, (byte) 125);
        int var12 = var10 & 0xFFFF;
        if (arg2 < 69) {
            this.field3178 = 46;
        }
        if (var11 == null) {
            return arg0.method449(arg4, arg6, true);
        }
        class22 var13 = null;
        if ((this.field3190 || class55.field685) && arg3 != -1 && arg3 < this.field3181.length) {
            int var14 = this.field3181[arg3];
            var13 = this.field3177.method2239(var14 >> 16, (byte) -27);
            arg3 = var14 & 0xFFFF;
        }
        if (this.field3195) {
            arg6 |= 0x200;
        }
        if (var11.method165(var12, true)) {
            arg6 |= 0x80;
        }
        if (var11.method166(14360, var12)) {
            arg6 |= 0x100;
        }
        if (var11.method164(256, var12)) {
            arg6 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method165(arg3, true)) {
                arg6 |= 0x80;
            }
            if (var13.method166(14360, arg3)) {
                arg6 |= 0x100;
            }
            if (var13.method164(256, arg3)) {
                arg6 |= 0x400;
            }
        }
        int var15 = arg6 | 0x20;
        class475 var16 = arg0.method449(arg4, var15, true);
        var16.method2860(var13, arg5 - 1, arg1, (byte) 32, var9, this.field3195, var12, arg3, var11);
        return var16;
    }
}
