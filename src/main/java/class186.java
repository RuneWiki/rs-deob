import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class186 extends class95 {

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    private int field3106 = 0;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Lvd;")
    private class126 field3107 = new class126(16);

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    private int field3109 = 0;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "Lmc;")
    private class170 field3110 = new class170();

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "J")
    private long field3115 = 0L;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    private int field3093;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Lci;")
    private class188 field3090;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "Z")
    private boolean field3111;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "Lmc;")
    private class170 field3112;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "Lsf;")
    private class100 field3101;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    private int field3104;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    private int field3094;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "Lci;")
    private class188 field3084;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lvi;")
    private class5 field3092;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "Z")
    private boolean field3117;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "Lee;")
    private class265 field3085;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field3102 = 0;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "Lhm;")
    private class19 field3083;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "Z")
    private boolean field3113;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "[B")
    private byte[] field3086;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 5)
    public final void method1403(int arg0) {
        field3098++;
        if (arg0 != 2) {
            return;
        }
        if (this.field3112 != null) {
            if (this.method735((byte) -106) == null) {
                return;
            }
            if (this.field3111) {
                boolean var6 = true;
                for (class206 var7 = this.field3112.method1250(true); var7 != null; var7 = this.field3112.method1256((byte) -125)) {
                    int var8 = (int) var7.field3488;
                    if (this.field3086[var8] == 0) {
                        this.method1407(var8, false, 1);
                    }
                    if (this.field3086[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method1527(-59);
                    }
                }
                while (this.field3083.field258.length > this.field3109) {
                    if (this.field3083.field258[this.field3109] == 0) {
                        this.field3109++;
                    } else {
                        if (this.field3101.field1668 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3086[this.field3109] == 0) {
                            this.method1407(this.field3109, false, 1);
                        }
                        if (this.field3086[this.field3109] == 0) {
                            var6 = false;
                            class206 var9 = new class206();
                            var9.field3488 = (long) this.field3109;
                            this.field3112.method1251(var9, -125);
                        }
                        this.field3109++;
                    }
                }
                if (var6) {
                    this.field3109 = 0;
                    this.field3111 = false;
                }
            } else if (this.field3113) {
                boolean var2 = true;
                for (class206 var3 = this.field3112.method1250(true); var3 != null; var3 = this.field3112.method1256((byte) -127)) {
                    int var4 = (int) var3.field3488;
                    if (this.field3086[var4] != 1) {
                        this.method1407(var4, false, 2);
                    }
                    if (this.field3086[var4] == 1) {
                        var3.method1527(82);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3109 < this.field3083.field258.length) {
                    if (this.field3083.field258[this.field3109] == 0) {
                        this.field3109++;
                    } else {
                        if (this.field3092.method22((byte) 82)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3086[this.field3109] != 1) {
                            this.method1407(this.field3109, false, 2);
                        }
                        if (this.field3086[this.field3109] != 1) {
                            var2 = false;
                            class206 var5 = new class206();
                            var5.field3488 = (long) this.field3109;
                            this.field3112.method1251(var5, -119);
                        }
                        this.field3109++;
                    }
                }
                if (var2) {
                    this.field3113 = false;
                    this.field3109 = 0;
                }
            } else {
                this.field3112 = null;
            }
        }
        if (!this.field3117 || this.field3115 > class78.method669(arg0 + 2045)) {
            return;
        }
        for (class265 var10 = (class265) this.field3107.method1001((byte) 33); var10 != null; var10 = (class265) this.field3107.method1009(-118)) {
            if (!var10.field4575) {
                if (var10.field4577) {
                    if (!var10.field4580) {
                        throw new RuntimeException();
                    }
                    var10.method1527(arg0 + 81);
                } else {
                    var10.field4577 = true;
                }
            }
        }
        this.field3115 = class78.method669(2047) + 1000L;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)I", line = 187)
    public final int method734(byte arg0, int arg1) {
        class265 var3 = (class265) this.field3107.method1007((long) arg1, -17004);
        field3089++;
        if (arg0 != 35) {
            this.field3083 = (class19) null;
        }
        return var3 == null ? 0 : var3.method1756(-59);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIIIIIFII)[[I", line = 209)
    public static final int[][] method1404(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8) {
        int[][] var9 = new int[arg7][arg1];
        field3108++;
        class42 var10 = new class42();
        var10.field685 = arg4;
        var10.field700 = arg0;
        var10.field689 = (int) (arg6 * 4096.0F);
        var10.field692 = arg2;
        if (arg8 != 19782) {
            method1405(15, 123);
        }
        var10.field690 = arg3;
        var10.method56((byte) -79);
        class145.method1113(arg8 - 19908, arg7, arg1);
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method287(var11, var9[var11], (byte) -41);
        }
        return var9;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)[B", line = 246)
    public final byte[] method736(int arg0, byte arg1) {
        field3114++;
        class265 var3 = this.method1407(arg0, false, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method1751(true);
        var3.method1527(arg1 ^ 0xFFFFFFFB);
        if (arg1 != -35) {
            this.field3093 = -23;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Lhm;", line = 268)
    public final class19 method735(byte arg0) {
        if (arg0 != -106) {
            this.method736(-77, (byte) 81);
        }
        field3100++;
        if (this.field3083 != null) {
            return this.field3083;
        }
        if (this.field3085 == null) {
            if (this.field3092.method24(-75)) {
                return null;
            }
            this.field3085 = this.field3092.method28((byte) 0, 255, this.field3093, true, 28169);
        }
        if (this.field3085.field4575) {
            return null;
        }
        byte[] var2 = this.field3085.method1751(true);
        if (this.field3085 instanceof class283) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3083 = new class19(var2, this.field3094);
                if (this.field3083.field259 != this.field3104) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field3083 = null;
                if (this.field3092.method24(arg0 ^ 0x17)) {
                    this.field3085 = null;
                } else {
                    this.field3085 = this.field3092.method28((byte) 0, 255, this.field3093, true, 28169);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3083 = new class19(var2, this.field3094);
            } catch (RuntimeException var6) {
                this.field3092.method25(false);
                this.field3083 = null;
                if (this.field3092.method24(-86)) {
                    this.field3085 = null;
                } else {
                    this.field3085 = this.field3092.method28((byte) 0, 255, this.field3093, true, 28169);
                }
                return null;
            }
            if (this.field3084 != null) {
                this.field3101.method767(var2, this.field3093, this.field3084, 2);
            }
        }
        if (this.field3090 != null) {
            this.field3106 = 0;
            this.field3086 = new byte[this.field3083.field248];
        }
        this.field3085 = null;
        return this.field3083;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)Ljj;", line = 363)
    public static final class140 method1405(int arg0, int arg1) {
        field3103++;
        class140 var2 = (class140) class203.field3440.method1514(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class286.field4925.method1911(0, arg1, -71);
        } else {
            var3 = class134.field2309.method1911(0, arg1 & 0x7FFF, -98);
        }
        if (arg0 != -20942) {
            field3102 = -69;
        }
        class140 var4 = new class140();
        if (var3 != null) {
            var4.method1085(new class60(var3), (byte) -79);
        }
        if (arg1 >= 32768) {
            var4.method1083((byte) 110);
        }
        class203.field3440.method1509((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 396)
    public final void method732(int arg0, int arg1) {
        field3095++;
        if (this.field3090 == null) {
            return;
        }
        for (class206 var3 = this.field3110.method1250(true); var3 != null; var3 = this.field3110.method1256((byte) -125)) {
            if (((long) arg1) == var3.field3488) {
                return;
            }
        }
        class206 var4 = new class206();
        var4.field3488 = (long) arg1;
        this.field3110.method1251(var4, -124);
        if (arg0 < 71) {
            field3102 = 7;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)I", line = 425)
    public final int method1406(boolean arg0) {
        if (arg0) {
            return -117;
        }
        field3096++;
        if (this.method735((byte) -106) == null) {
            return this.field3085 == null ? 0 : this.field3085.method1756(117);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZI)Lee;", line = 447)
    private final class265 method1407(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return (class265) null;
        }
        field3097++;
        class265 var4 = (class265) this.field3107.method1007((long) arg0, -17004);
        if (var4 != null && arg2 == 0 && !var4.field4580 && var4.field4575) {
            var4.method1527(-58);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3090 == null || this.field3086[arg0] == -1) {
                    if (this.field3092.method24(-27)) {
                        return null;
                    }
                    var4 = this.field3092.method28((byte) 2, this.field3093, arg0, true, 28169);
                } else {
                    var4 = this.field3101.method762(arg0, this.field3090, -29561);
                }
            } else if (arg2 == 1) {
                if (this.field3090 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3101.method769(arg0, (byte) -3, this.field3090);
            } else if (arg2 == 2) {
                if (this.field3090 == null) {
                    throw new RuntimeException();
                }
                if (this.field3086[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3092.method22((byte) 68)) {
                    return null;
                }
                var4 = this.field3092.method28((byte) 2, this.field3093, arg0, false, 28169);
            } else {
                throw new RuntimeException();
            }
            this.field3107.method1004((byte) 73, (long) arg0, var4);
        }
        if (var4.field4575) {
            return null;
        }
        byte[] var5 = var4.method1751(true);
        if (!var4 instanceof class283) {
            try {
                label137: {
                    if (var5 != null && var5.length > 2) {
                        class132.field2278.reset();
                        class132.field2278.update(var5, 0, var5.length - 2);
                        int var6 = (int) class132.field2278.getValue();
                        if (this.field3083.field267[arg0] == var6) {
                            break label137;
                        }
                        throw new RuntimeException();
                    }
                    throw new RuntimeException();
                }
            } catch (RuntimeException var14) {
                this.field3092.method25(arg1);
                var4.method1527(-99);
                if (var4.field4580 && !this.field3092.method24(-25)) {
                    class240 var8 = this.field3092.method28((byte) 2, this.field3093, arg0, true, 28169);
                    this.field3107.method1004((byte) 73, (long) arg0, var8);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3083.field252[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field3083.field252[arg0];
            if (this.field3090 != null) {
                this.field3101.method767(var5, arg0, this.field3090, 2);
                if (this.field3086[arg0] != 1) {
                    this.field3106++;
                    this.field3086[arg0] = 1;
                }
            }
            if (!var4.field4580) {
                var4.method1527(50);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class132.field2278.reset();
            class132.field2278.update(var5, 0, var5.length - 2);
            int var9 = (int) class132.field2278.getValue();
            if (this.field3083.field267[arg0] != var9) {
                throw new RuntimeException();
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3083.field252[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field3086[arg0] != 1) {
                if (this.field3086[arg0] != 0) {
                }
                this.field3106++;
                this.field3086[arg0] = 1;
            }
            if (!var4.field4580) {
                var4.method1527(-114);
            }
            return var4;
        } catch (Exception var13) {
            this.field3086[arg0] = -1;
            var4.method1527(63);
            if (var4.field4580 && !this.field3092.method24(-30)) {
                class240 var12 = this.field3092.method28((byte) 2, this.field3093, arg0, true, 28169);
                this.field3107.method1004((byte) 73, (long) arg0, var12);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBIIIII)V", line = 664)
    public static final void method1408(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class172.field2903 - class144.field2485) * var8 / 100 + class144.field2485;
        int var10 = arg1 * var9 >> 8;
        field3087++;
        int var11 = 2048 - arg0 & 0x7FF;
        int var12 = 0;
        int var13 = 2048 - arg5 & 0x7FF;
        if (arg2 != 10) {
            return;
        }
        int var14 = var10;
        int var15 = 0;
        if (var11 != 0) {
            int var16 = class21.field286[var11];
            int var17 = class21.field288[var11];
            var15 = -var10 * var17 >> 16;
            var14 = var10 * var16 >> 16;
        }
        if (var13 != 0) {
            int var18 = class21.field288[var13];
            var12 = var14 * var18 >> 16;
            int var19 = class21.field286[var13];
            var14 = var14 * var19 >> 16;
        }
        class87.field1433 = arg5;
        class232.field3931 = arg0;
        class245.field4120 = arg3 - var12;
        class228.field3825 = arg7 - var15;
        class9.field121 = arg6 - var14;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)I", line = 726)
    public final int method1409(int arg0) {
        if (arg0 != 0) {
            return 81;
        }
        field3105++;
        if (this.field3083 == null) {
            return 0;
        } else if (this.field3111) {
            class206 var2 = this.field3112.method1250(true);
            return var2 == null ? 0 : (int) var2.field3488;
        } else {
            return this.field3083.field265;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I", line = 751)
    public final int method1410(byte arg0) {
        field3088++;
        if (this.field3083 == null) {
            return 0;
        } else {
            if (arg0 != 107) {
                this.method1409(23);
            }
            return this.field3083.field265;
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V", line = 766)
    public final void method1411(int arg0) {
        field3091++;
        if (this.field3112 == null || this.method735((byte) -106) == null) {
            return;
        }
        class206 var2 = this.field3110.method1250(true);
        if (arg0 < 104) {
            this.field3111 = true;
        }
        while (var2 != null) {
            int var3 = (int) var2.field3488;
            if (var3 < 0 || this.field3083.field248 <= var3 || this.field3083.field258[var3] == 0) {
                var2.method1527(-118);
            } else {
                if (this.field3086[var3] == 0) {
                    this.method1407(var3, false, 1);
                }
                if (this.field3086[var3] == -1) {
                    this.method1407(var3, false, 2);
                }
                if (this.field3086[var3] == 1) {
                    var2.method1527(111);
                }
            }
            var2 = this.field3110.method1256((byte) -125);
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)I", line = 820)
    public final int method1412(int arg0) {
        if (arg0 != -3) {
            this.field3115 = 108L;
        }
        field3082++;
        return this.field3106;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILci;Lci;Lvi;Lsf;IIZ)V", line = 881)
    public class186(int arg0, class188 arg1, class188 arg2, class5 arg3, class100 arg4, int arg5, int arg6, boolean arg7) {
        this.field3093 = arg0;
        this.field3090 = arg1;
        if (this.field3090 == null) {
            this.field3111 = false;
        } else {
            this.field3111 = true;
            this.field3112 = new class170();
        }
        this.field3101 = arg4;
        this.field3104 = arg6;
        this.field3094 = arg5;
        this.field3084 = arg2;
        this.field3092 = arg3;
        this.field3117 = arg7;
        if (this.field3084 != null) {
            this.field3085 = this.field3101.method762(this.field3093, this.field3084, -29561);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V", line = 850)
    public final void method1413(boolean arg0) {
        field3099++;
        if (arg0) {
            this.field3090 = (class188) null;
        }
        if (this.field3090 != null) {
            this.field3113 = true;
            if (this.field3112 == null) {
                this.field3112 = new class170();
            }
        }
    }
}
