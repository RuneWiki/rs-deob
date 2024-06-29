import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class473 {

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "Z")
    private boolean field7010 = true;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    private int field7001 = -1;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "[Lmc;")
    private class90[] field7013;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "I")
    private int field7008;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    private int field7015;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    private int field7007;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
    private int field7022;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "[Lmc;")
    private class90[] field7004;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "Lmc;")
    private class90 field7009;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "[I")
    public static int[] field7020 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public static int field7012 = -1;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "Ls;")
    public static class186 field7003 = new class186(81, 6);

    @OriginalMember(owner = "client!sv", name = "w", descriptor = "I")
    public static int field7023 = 0;

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    private int field7016;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    private int field7017;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "Lo;")
    private class24 field7021;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZI)V", line = 4)
    public static final void method2822(boolean arg0, int arg1) {
        field7006++;
        int var2 = class62.field1268 - class505.field7374;
        if (var2 >= 100) {
            class510.field7435 = 1;
            return;
        }
        int var3 = (int) class113.field2041;
        if (var3 < class278.field4190 >> 8) {
            var3 = class278.field4190 >> 8;
        }
        if (class122.field2128[4] && (class218.field3418[4] + 128) > var3) {
            var3 = class218.field3418[4] + 128;
        }
        int var4 = (int) class525.field7631 + class496.field7276 & 0x3FFF;
        class406.method2522((byte) -62, class483.method2899(class211.field3371, class15.field266.field6073, class15.field266.field6078, arg0) - 50, arg1, var4, class376.field5501, class215.field3402, (var3 >> 3) * 3 + 600 << 0, var3);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class432.field6435 = (int) ((float) (class432.field6435 - class326.field4942) * var5 + (float) class326.field4942);
        class428.field6406 = (int) ((float) (class428.field6406 - class311.field4699) * var5 + (float) class311.field4699);
        class509.field7427 = (int) ((float) (class509.field7427 - class526.field7653) * var5 + (float) class526.field7653);
        class41.field577 = (int) ((float) (class41.field577 - class192.field3102) * var5 + (float) class192.field3102);
        int var6 = class139.field2325 - class67.field1366;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class139.field2325 = (int) ((float) var6 * var5 + (float) class67.field1366);
        class139.field2325 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLza;I)Z", line = 51)
    public final boolean method2823(byte arg0, class288 arg1, int arg2) {
        field7005++;
        if (this.field7001 != arg2) {
            this.field7001 = arg2;
            int var4 = class184.method1256(arg2, (byte) 105);
            if (var4 > arg2) {
                var4 = class5.method34((byte) -51, arg2);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field7016 != var4) {
                this.field7021 = null;
                this.field7016 = var4;
            }
            if (this.field7013 != null) {
                this.field7017 = 0;
                int[] var5 = new int[this.field7013.length];
                for (int var6 = 0; var6 < this.field7013.length; var6++) {
                    class90 var7 = this.field7013[var6];
                    if (var7.method820(this.field7008, this.field7022, this.field7007, this.field7001)) {
                        var5[this.field7017] = var7.field1803;
                        this.field7004[this.field7017++] = var7;
                    }
                }
                class120.method968(this.field7004, 0, this.field7017 - 1, -27256, var5);
            }
            this.field7010 = true;
        }
        boolean var8 = false;
        if (arg0 >= -6) {
            field7023 = 114;
        }
        if (this.field7010) {
            this.field7010 = false;
            for (int var9 = this.field7017 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field7004[var9].method813(arg1, this.field7009);
                this.field7010 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lza;Lgh;I)V", line = 133)
    public static final void method2824(class288 arg0, class388 arg1, int arg2) {
        if (arg2 != -8435) {
            field7003 = null;
        }
        field7019++;
        boolean var3 = class135.field2271.method1640(arg1.field5739 ? class15.field266.field5343 : null, arg1.field5776, arg1.field5764, arg1.field5688, arg0, arg1.field5811 | 0xFF000000, arg1.field5805, 113) == null;
        if (var3) {
            class459.field6836.method1885(false, new class47(arg1.field5688, arg1.field5776, arg1.field5764, arg1.field5811 | 0xFF000000, arg1.field5805, arg1.field5739));
            class429.method2587(arg1, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V", line = 154)
    public final void method2825(byte arg0) {
        if (this.field7013 != null) {
            for (int var2 = 0; var2 < this.field7013.length; var2++) {
                this.field7013[var2].method816();
            }
        }
        field7018++;
        if (arg0 < 61) {
            this.field7010 = true;
        }
        this.field7021 = null;
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(I[Lmc;IIII)V", line = 309)
    public class473(int arg0, class90[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7013 = arg1;
        this.field7008 = arg3;
        this.field7015 = arg0;
        this.field7007 = arg5;
        this.field7022 = arg4;
        if (arg1 == null) {
            this.field7004 = null;
            this.field7009 = null;
        } else {
            this.field7004 = new class90[arg1.length];
            this.field7009 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)Z", line = 189)
    public static final boolean method2826(int arg0, int arg1) {
        field7014++;
        if (arg1 == 60 || arg1 == 13 || arg1 == 17 || arg1 == 4 || arg1 == 1004) {
            return true;
        } else {
            int var2 = -1 % ((arg0 + 3) / 43);
            return arg1 == 58 || arg1 == 1003;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lza;IIIIIIIII)V", line = 208)
    public final void method2827(class288 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7011++;
        int var11 = arg8 + arg9 & 0x3FFF;
        int var12 = -15 / ((56 - arg7) / 62);
        if (this.field7015 == -1) {
            arg0.method327(arg1, arg6, arg5, arg3, arg4, 0);
        } else {
            class486 var13 = class514.field7467.method105(-125, this.field7015);
            if (this.field7021 == null && class514.field7467.method108(false, this.field7015)) {
                int[] var14 = var13.field7148 ? class514.field7467.method106((byte) 99, false, this.field7016, 0.7F, this.field7015, this.field7016) : class514.field7467.method109(this.field7016, this.field7015, false, false, 0.7F, this.field7016);
                this.field7021 = arg0.method335(var14, 0, this.field7016, this.field7016, this.field7016);
            }
            if (!var13.field7148) {
                arg0.method327(arg1, arg6, arg5, arg3, arg4, 0);
            }
            if (this.field7021 != null) {
                int var15 = var13.field7148 ? 0 : 1;
                int var16 = arg2 * arg3 / -4096;
                int var17;
                for (var17 = arg3 * var11 / 4096 + (arg5 - arg3) / 2; var17 > arg3; var17 -= arg3) {
                }
                while (var17 < 0) {
                    var17 += arg3;
                }
                while (arg3 < var16) {
                    var16 -= arg3;
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                for (int var18 = var17 - arg3; var18 < arg5; var18 += arg3) {
                    for (int var19 = var16 - arg3; var19 < arg3; var19 += arg3) {
                        this.field7021.method163(var18 + arg1, arg6 + var19, arg3, arg3, 1, 0, var15);
                    }
                }
            }
        }
        for (int var20 = this.field7017 - 1; var20 >= 0; var20--) {
            this.field7004[var20].method823(arg0, arg1, arg6, arg5, arg3, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 286)
    public static void method2828(int arg0) {
        field7003 = null;
        field7020 = null;
        if (arg0 != -32340) {
            method2824(null, null, 13);
        }
    }
}
