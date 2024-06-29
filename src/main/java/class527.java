import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class527 {

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public int field7148 = -1;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "Lem;")
    public static class206 field7145 = new class206(15, 16);

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "[I")
    public static int[] field7146 = new int[1000];

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "[I")
    public static int[] field7147 = new int[1000];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    private int field7137;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "J")
    private long field7130;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "J")
    private long field7136;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Lf;")
    public static class702 field7149;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Z")
    public boolean field7135;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "[I")
    private int[] field7128;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[I")
    public int[] field7139;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIILnu;IILks;Lr;BILtq;)Lda;", line = 3)
    public final class55 method2995(int arg0, int arg1, int arg2, int arg3, class549 arg4, int arg5, int arg6, class403 arg7, class166 arg8, byte arg9, int arg10, class582 arg11) {
        field7142++;
        int var13 = arg5;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg5 | 0x20;
            int var22 = arg7.field5667[arg10];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class109 var25 = arg4.method3085(0, var23);
            if (var25 != null) {
                var15 |= var25.method784(var24, (byte) -121);
                var14 |= var25.method785((byte) 81, var24);
                var17 |= var25.method788((byte) 115, var24);
                var16 |= arg7.field5653;
            }
            if ((arg7.field5644 || class553.field7458) && arg3 != -1 && arg7.field5667.length > arg3) {
                int var26 = arg7.field5667[arg3];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class109 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg4.method3085(0, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method784(var28, (byte) 96);
                    var14 |= var29.method785((byte) 100, var28);
                    var17 |= var29.method788((byte) 118, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        if (arg9 != 103) {
            method3001(-114, 121, 1.3857406F, -0.67823046F, 0.44154334F, -95, (byte) 15, -81, null, -0.7370261F, 0.3250627F);
        }
        long var30 = (long) arg2 | (long) arg0 << 32 | (long) (arg6 << 16);
        class663 var32 = class466.field6416;
        class55 var33;
        synchronized (class466.field6416) {
            var33 = (class55) class466.field6416.method3747((byte) -66, var30);
        }
        if (var33 == null || arg8.method134(var33.method422(), var13) != 0) {
            if (var33 != null) {
                var13 = arg8.method114(var13, var33.method422());
            }
            class270[] var35 = new class270[3];
            int var36 = 0;
            if (!arg11.method3317((byte) -81, arg2).method622(-6) || !arg11.method3317((byte) -114, arg6).method622(-6) || !arg11.method3317((byte) -107, arg0).method622(arg9 ^ 0xFFFFFF9D)) {
                return null;
            }
            class270 var37 = arg11.method3317((byte) -124, arg2).method619((byte) 23);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class270 var38 = arg11.method3317((byte) -126, arg6).method619((byte) 19);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class270 var39 = arg11.method3317((byte) -123, arg0).method619((byte) 69);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class270 var41 = new class270(var35, var36);
            var33 = arg8.method106(var41, var40, class279.field3826, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class611.field8470.length; var43++) {
                    if (this.field7139[var42] < class611.field8470[var43][var42].length) {
                        var33.method439(class335.field4509[var43][var42], class611.field8470[var43][var42][this.field7139[var42]]);
                    }
                }
            }
            var33.method452(var13);
            class663 var44 = class466.field6416;
            synchronized (class466.field6416) {
                class466.field6416.method3748(var30, var33, arg9 + 12434);
            }
        }
        if (arg7 == null) {
            return var33;
        } else {
            class55 var45 = var33.method462((byte) 4, var13, true);
            return arg7.method2349(arg10, (byte) 105, arg5, arg3, var45, arg1);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 159)
    public static void method2996(int arg0) {
        field7149 = null;
        if (arg0 == 6668) {
            field7145 = null;
            field7146 = null;
            field7147 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZII)I", line = 172)
    public static final int method2997(boolean arg0, int arg1, int arg2) {
        field7143++;
        if (!arg0) {
            return -19;
        }
        int var3 = class605.method3403(arg1 + 91923, arg2 - -45365, 4, -1) + ((class605.method3403(arg1 + 37821, arg2 + 10294, 2, -1) - 128 >> 1) - 128) + (class605.method3403(arg1, arg2, 1, -1) + -128 >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLtq;Lnp;Lmp;ILks;Lnu;Lr;IIILnf;)Lda;", line = 194)
    public final class55 method2998(boolean arg0, class582 arg1, class454 arg2, class706 arg3, int arg4, class403 arg5, class549 arg6, class166 arg7, int arg8, int arg9, int arg10, class535 arg11) {
        field7141++;
        if (this.field7148 != -1) {
            return arg2.method2584(this.field7148, 1).method3257(arg11, arg5, arg7, arg9, arg6, (byte) 119, arg10, arg4, arg8);
        }
        int var13 = arg9;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg9 | 0x20;
            int var21 = arg5.field5667[arg8];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class109 var25 = arg6.method3085(0, var23);
            if (var25 != null) {
                var15 |= var25.method784(var24, (byte) 35);
                var14 |= var25.method785((byte) 99, var24);
                var17 |= var25.method788((byte) 119, var24);
                var16 |= arg5.field5653;
            }
            if ((arg5.field5644 || class553.field7458) && arg4 != -1 && arg5.field5667.length > arg4) {
                int var26 = arg5.field5667[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class109 var29 = var23 == var27 ? var25 : arg6.method3085(0, var27);
                if (var29 != null) {
                    var15 |= var29.method784(var28, (byte) 25);
                    var14 |= var29.method785((byte) 98, var28);
                    var17 |= var29.method788((byte) 123, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class663 var30 = class466.field6416;
        class55 var31;
        synchronized (class466.field6416) {
            var31 = (class55) class466.field6416.method3747((byte) -66, this.field7130);
        }
        if (var31 == null || arg7.method134(var31.method422(), var13) != 0) {
            if (var31 != null) {
                var13 = arg7.method114(var13, var31.method422());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field7128[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg1.method3317((byte) -116, var35 & 0x3FFFFFFF).method622(-6)) {
                        var33 = true;
                    }
                } else if (!arg3.method3949(0, var35 & 0x3FFFFFFF).method3728(false, this.field7135)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class270[] var36 = new class270[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field7128[var38];
                if ((var39 & 0x40000000) != 0) {
                    class270 var41 = arg3.method3949(0, var39 & 0x3FFFFFFF).method3711(this.field7135, 111);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class270 var40 = arg1.method3317((byte) -81, var39 & 0x3FFFFFFF).method619((byte) 10);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class270 var43 = new class270(var36, var37);
            var31 = arg7.method106(var43, var42, class279.field3826, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class611.field8470.length; var45++) {
                    if (this.field7139[var44] < class611.field8470[var45][var44].length) {
                        var31.method439(class335.field4509[var45][var44], class611.field8470[var45][var44][this.field7139[var44]]);
                    }
                }
            }
            var31.method452(var13);
            class663 var46 = class466.field6416;
            synchronized (class466.field6416) {
                class466.field6416.method3748(this.field7130, var31, 12537);
            }
        }
        if (arg5 == null) {
            return var31;
        }
        if (arg0) {
            method2997(true, -31, 55);
        }
        var31.method462((byte) 4, var13, true);
        return arg5.method2349(arg8, (byte) 105, arg9, arg4, var31, arg10);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILtq;II)V", line = 394)
    public final void method2999(int arg0, class582 arg1, int arg2, int arg3) {
        if (arg0 != 21345) {
            this.field7148 = -17;
        }
        field7134++;
        int var5 = class13.field127[arg3];
        if (arg1.method3317((byte) -107, arg2) != null) {
            this.field7128[var5] = class647.method3617(arg2, Integer.MIN_VALUE);
            this.method3000(698011144);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V", line = 414)
    private final void method3000(int arg0) {
        field7127++;
        this.field7130 = -1L;
        long[] var2 = class422.field5939;
        this.field7130 = var2[(int) (((long) (this.field7137 >> 8) ^ this.field7130) & 0xFFL)] ^ this.field7130 >>> 8;
        this.field7130 = var2[(int) ((this.field7130 ^ (long) this.field7137) & 0xFFL)] ^ this.field7130 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field7130 = var2[(int) (((long) (this.field7128[var3] >> 24) ^ this.field7130) & 0xFFL)] ^ this.field7130 >>> 8;
            this.field7130 = var2[(int) ((this.field7130 ^ (long) (this.field7128[var3] >> 16)) & 0xFFL)] ^ this.field7130 >>> 8;
            this.field7130 = var2[(int) ((this.field7130 ^ (long) (this.field7128[var3] >> 8)) & 0xFFL)] ^ this.field7130 >>> 8;
            this.field7130 = this.field7130 >>> 8 ^ var2[(int) (((long) this.field7128[var3] ^ this.field7130) & 0xFFL)];
        }
        if (arg0 != 698011144) {
            method2996(22);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field7130 = var2[(int) ((this.field7130 ^ (long) this.field7139[var4]) & 0xFFL)] ^ this.field7130 >>> 8;
        }
        this.field7130 = this.field7130 >>> 8 ^ var2[(int) (((long) (this.field7135 ? 1 : 0) ^ this.field7130) & 0xFFL)];
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIFFFIBILgj;FF)[B", line = 452)
    public static final byte[] method3001(int arg0, int arg1, float arg2, float arg3, float arg4, int arg5, byte arg6, int arg7, class588 arg8, float arg9, float arg10) {
        int var11 = -126 / ((arg6 + 11) / 63);
        field7140++;
        byte[] var12 = new byte[arg0 * arg7 * arg1];
        class178.method1233(var12, arg4, arg7, arg9, arg10, arg8, arg1, 0, (byte) -62, arg0, arg3, arg2, arg5);
        return var12;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lvv;[Ltw;)V", line = 468)
    public static final void method3002(class295 arg0, class186[] arg1) {
        if (class520.field7082) {
            int var2 = arg0.method1323(arg1, 101);
            class401.field5619.method183(var2, arg1);
        }
        if (class52.field606 == class409.field5812) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class210) {
                var5 = ((class210) arg0).field2972;
                var6 = ((class210) arg0).field2963;
            } else {
                var5 = arg0.field4042 >> class588.field8259;
                var6 = arg0.field4047 >> class588.field8259;
            }
            class401.field5619.method153(class497.field6766[0].method331(arg0.field4047, (byte) 50, arg0.field4042), class564.method3158(var5, var6), class402.method2346(var5, var6), class130.method921(var5, var6));
        }
        class614 var7 = arg0.method221(class401.field5619, -5);
        if (var7 == null) {
            return;
        }
        var7.field8573 = arg0;
        if (class17.field174) {
            class693 var8 = class300.field4089;
            synchronized (class300.field4089) {
                boolean var9 = false;
                for (class614 var10 = (class614) class300.field4089.method3898((byte) -68); var10 != null; var10 = (class614) class300.field4089.method3902(true)) {
                    if (arg0.field4038 >= var10.field8573.field4038) {
                        class118.method837(var10, var7, (byte) 6);
                        var9 = true;
                        break;
                    }
                }
                if (!var9) {
                    class300.field4089.method3906(var7, (byte) -19);
                }
                return;
            }
        }
        boolean var11 = false;
        for (class614 var12 = (class614) class300.field4089.method3898((byte) -86); var12 != null; var12 = (class614) class300.field4089.method3902(true)) {
            if (arg0.field4038 >= var12.field8573.field4038) {
                class118.method837(var12, var7, (byte) 6);
                var11 = true;
                break;
            }
        }
        if (!var11) {
            class300.field4089.method3906(var7, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V", line = 551)
    public final void method3003(int arg0, boolean arg1) {
        if (arg0 != -1186089456) {
            this.field7148 = 49;
        }
        this.field7135 = arg1;
        field7132++;
        this.method3000(698011144);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z[IB[III)V", line = 563)
    public final void method3004(boolean arg0, int[] arg1, byte arg2, int[] arg3, int arg4, int arg5) {
        if (this.field7137 != arg5) {
            this.field7137 = arg5;
        }
        this.field7135 = arg0;
        field7144++;
        this.field7139 = arg1;
        this.field7128 = arg3;
        this.field7148 = arg4;
        this.method3000(698011144);
        if (arg2 != 101) {
            this.method3008(-106, null, 96, -29, null, null, null, null, -50, true, null, 26, -53, -48, null, null, 104, null, (byte) 90, null, null);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 584)
    public static final void method3005(byte arg0) {
        field7126++;
        class663 var1 = class457.field6346;
        synchronized (class457.field6346) {
            class457.field6346.method3755(19713);
        }
        if (arg0 < -42) {
            class663 var2 = class466.field6416;
            synchronized (class466.field6416) {
                class466.field6416.method3755(19713);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V", line = 603)
    public final void method3006(int arg0, int arg1, int arg2) {
        this.field7139[arg1] = arg0;
        int var4 = -13 % ((arg2 - 60) / 57);
        field7133++;
        this.method3000(698011144);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V", line = 615)
    public static final void method3007(byte arg0) {
        class636.field8803 = null;
        class164.field2361 = null;
        class664.field9316 = null;
        field7138++;
        class181.field2624 = null;
        class273.field3741 = null;
        class492.field6731 = null;
        class382.field5248 = null;
        class116.field1586 = null;
        class628.field8704 = null;
        class619.field8612 = null;
        class428.field5986 = null;
        class186.field2692 = null;
        class636.field8814 = null;
        class606.field8426 = null;
        class671.field9409 = null;
        if (arg0 != -13) {
            field7146 = null;
        }
        class499.field6781 = null;
        class635.field8775 = null;
        class521.field7092 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILnp;IILnf;Lnu;[ILmp;IZ[Lmg;IIILtq;Lks;ILks;BLr;Lvaa;)Lda;", line = 646)
    public final class55 method3008(int arg0, class454 arg1, int arg2, int arg3, class535 arg4, class549 arg5, int[] arg6, class706 arg7, int arg8, boolean arg9, class133[] arg10, int arg11, int arg12, int arg13, class582 arg14, class403 arg15, int arg16, class403 arg17, byte arg18, class166 arg19, class433 arg20) {
        field7129++;
        if (this.field7148 != -1) {
            return arg1.method2584(this.field7148, 1).method3246(arg4, arg2, arg17, arg3, arg15, arg13, arg6, arg11, arg8, arg0, arg10, arg19, arg20, arg16, arg12, arg5, 107);
        }
        int var22 = arg11;
        long var23 = this.field7130;
        int[] var25 = this.field7128;
        if (arg15 != null && (arg15.field5669 >= 0 || arg15.field5659 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field7128[var26];
            }
            if (arg15.field5669 >= 0) {
                if (arg15.field5669 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class647.method3617(1073741824, arg15.field5669);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg15.field5659 >= 0) {
                if (arg15.field5659 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class647.method3617(arg15.field5659, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        if (arg18 <= 98) {
            method3002(null, null);
        }
        boolean var29 = false;
        boolean var30 = arg15 != null || arg17 != null;
        int var31 = arg10 == null ? 0 : arg10.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class306.field4228[var32] = null;
            if (arg10[var32] != null) {
                class403 var33 = arg5.method3090(-96, arg10[var32].field1897);
                if (var33.field5667 != null) {
                    var30 = true;
                    class657.field9139[var32] = var33;
                    int var34 = arg10[var32].field1899;
                    int var35 = arg10[var32].field1896;
                    int var36 = var33.field5667[var34];
                    class306.field4228[var32] = arg5.method3085(0, var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class58.field656[var32] = var37;
                    if (class306.field4228[var32] != null) {
                        var28 |= class306.field4228[var32].method784(var37, (byte) -121);
                        var27 |= class306.field4228[var32].method785((byte) 66, var37);
                        var29 |= class306.field4228[var32].method788((byte) 125, var37);
                    }
                    if ((var33.field5644 || class553.field7458) && var35 != -1 && var33.field5667.length > var35) {
                        class508.field6963[var32] = var33.field5646[var34];
                        class169.field2461[var32] = arg10[var32].field1893;
                        int var38 = var33.field5667[var35];
                        class656.field9124[var32] = arg5.method3085(0, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class674.field9522[var32] = var39;
                        if (class656.field9124[var32] != null) {
                            var28 |= class656.field9124[var32].method784(var39, (byte) 58);
                            var27 |= class656.field9124[var32].method785((byte) 122, var39);
                            var29 |= class656.field9124[var32].method788((byte) 118, var39);
                        }
                    } else {
                        class508.field6963[var32] = 0;
                        class169.field2461[var32] = 0;
                        class656.field9124[var32] = null;
                        class674.field9522[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class109 var43 = null;
        class109 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class109 var48 = null;
        class109 var49 = null;
        if (var30) {
            if (arg15 != null) {
                int var50 = arg15.field5667[arg13];
                int var51 = var50 >>> 16;
                var43 = arg5.method3085(0, var51);
                var40 = var50 & 0xFFFF;
                if (var43 != null) {
                    var28 |= var43.method784(var40, (byte) 19);
                    var27 |= var43.method785((byte) 109, var40);
                    var29 |= var43.method788((byte) 115, var40);
                }
                if ((arg15.field5644 || class553.field7458) && arg2 != -1 && arg15.field5667.length > arg2) {
                    var42 = arg15.field5646[arg13];
                    int var52 = arg15.field5667[arg2];
                    int var53 = var52 >>> 16;
                    var44 = var51 == var53 ? var43 : arg5.method3085(0, var53);
                    var41 = var52 & 0xFFFF;
                    if (var44 != null) {
                        var28 |= var44.method784(var41, (byte) -125);
                        var27 |= var44.method785((byte) 82, var41);
                        var29 |= var44.method788((byte) 124, var41);
                    }
                }
            }
            var22 = arg11 | 0x20;
            if (arg17 != null) {
                int var54 = arg17.field5667[arg0];
                int var55 = var54 >>> 16;
                var45 = var54 & 0xFFFF;
                var48 = arg5.method3085(0, var55);
                if (var48 != null) {
                    var28 |= var48.method784(var45, (byte) -119);
                    var27 |= var48.method785((byte) 121, var45);
                    var29 |= var48.method788((byte) 126, var45);
                }
                if ((arg17.field5644 || class553.field7458) && arg12 != -1 && arg17.field5667.length > arg12) {
                    int var56 = arg17.field5667[arg12];
                    var47 = arg17.field5646[arg0];
                    int var57 = var56 >>> 16;
                    var46 = var56 & 0xFFFF;
                    var49 = var55 == var57 ? var48 : arg5.method3085(0, var57);
                    if (var49 != null) {
                        var28 |= var49.method784(var46, (byte) -7);
                        var27 |= var49.method785((byte) 78, var46);
                        var29 |= var49.method788((byte) 123, var46);
                    }
                }
            }
            if (var28) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var29) {
                var22 |= 0x400;
            }
        }
        class663 var58 = class457.field6346;
        class55 var59;
        synchronized (class457.field6346) {
            var59 = (class55) class457.field6346.method3747((byte) -66, var23);
        }
        class67 var60 = null;
        if (this.field7137 != -1) {
            var60 = arg20.method2482(this.field7137, 115);
        }
        if (var59 == null || arg19.method134(var59.method422(), var22) != 0) {
            if (var59 != null) {
                var22 = arg19.method114(var22, var59.method422());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((var64 & Integer.MIN_VALUE) != 0 && !arg14.method3317((byte) -110, var64 & 0x3FFFFFFF).method624(-105)) {
                        var62 = true;
                    }
                } else if (!arg7.method3949(0, var64 & 0x3FFFFFFF).method3724(this.field7135, 127)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field7136 != -1L) {
                    class663 var82 = class457.field6346;
                    synchronized (class457.field6346) {
                        var59 = (class55) class457.field6346.method3747((byte) -66, this.field7136);
                    }
                }
                if (var59 == null || arg19.method134(var59.method422(), var22) != 0) {
                    return null;
                }
            } else {
                class270[] var65 = new class270[12];
                for (int var66 = 0; var66 < 12; var66++) {
                    int var67 = var25[var66];
                    if ((var67 & 0x40000000) != 0) {
                        class270 var68 = arg7.method3949(0, var67 & 0x3FFFFFFF).method3713(-1611653406, this.field7135);
                        if (var68 != null) {
                            var65[var66] = var68;
                        }
                    } else if ((var67 & Integer.MIN_VALUE) != 0) {
                        class270 var69 = arg14.method3317((byte) -112, var67 & 0x3FFFFFFF).method621(80);
                        if (var69 != null) {
                            var65[var66] = var69;
                        }
                    }
                }
                if (var60 != null && var60.field903 != null) {
                    for (int var70 = 0; var70 < var60.field903.length; var70++) {
                        if (var65[var70] != null) {
                            int var71 = 0;
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            if (var60.field903[var70] != null) {
                                var71 = var60.field903[var70][0];
                                var76 = var60.field903[var70][5] << 3;
                                var73 = var60.field903[var70][2];
                                var74 = var60.field903[var70][3] << 3;
                                var75 = var60.field903[var70][4] << 3;
                                var72 = var60.field903[var70][1];
                            }
                            if (var74 != 0 || var75 != 0 || var76 != 0) {
                                var65[var70].method1636(var74, var76, var75, -23378);
                            }
                            if (var71 != 0 || var72 != 0 || var73 != 0) {
                                var65[var70].method1646((byte) 126, var73, var72, var71);
                            }
                        }
                    }
                }
                class270 var77 = new class270(var65, var65.length);
                int var78 = var22 | 0x4000;
                var59 = arg19.method106(var77, var78, class279.field3826, 64, 850);
                for (int var79 = 0; var79 < 5; var79++) {
                    for (int var80 = 0; var80 < class611.field8470.length; var80++) {
                        if (class611.field8470[var80][var79].length > this.field7139[var79]) {
                            var59.method439(class335.field4509[var80][var79], class611.field8470[var80][var79][this.field7139[var79]]);
                        }
                    }
                }
                if (arg9) {
                    var59.method452(var22);
                    class663 var81 = class457.field6346;
                    synchronized (class457.field6346) {
                        class457.field6346.method3748(var23, var59, 12537);
                    }
                    this.field7136 = var23;
                }
            }
        }
        class55 var83 = var59.method462((byte) 4, var22, true);
        boolean var84 = false;
        if (arg6 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg6[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class392[] var86 = null;
        if (var60 != null) {
            var86 = var60.method566(arg19, 5142);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method449(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var88 < var31) {
            if (class306.field4228[var88] != null) {
                var83.method440(false, class674.field9522[var88], 0, var89, (byte) -61, class169.field2461[var88] - 1, class508.field6963[var88], class656.field9124[var88], null, class58.field656[var88], class306.field4228[var88]);
            }
            var89 <<= 0x1;
            var88++;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg6[var90] != -1) {
                    int var91 = arg6[var90] - arg8;
                    int var92 = var91 & 0x3FFF;
                    class392 var93 = arg19.method168();
                    var93.method685(var92);
                    var83.method449(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method449(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method456(var47, false, var44, arg15.field5652, arg16 - 1, var43, var48, arg3 - 1, var49, var41, var45, var42, var40, (byte) -71, var46);
        } else if (var43 != null) {
            var83.method428((byte) -115, var44, false, arg3 - 1, var41, var40, var43, 0, var42);
        } else if (var48 != null) {
            var83.method428((byte) -78, var49, false, arg16 - 1, var46, var45, var48, 0, var47);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class306.field4228[var95] = null;
            class656.field9124[var95] = null;
            class657.field9139[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIILmp;)V", line = 1195)
    public final void method3009(byte arg0, int arg1, int arg2, class706 arg3) {
        if (arg0 <= 30) {
            this.field7135 = true;
        }
        field7131++;
        if (arg1 == -1) {
            this.field7128[arg2] = 0;
        } else if (arg3.method3949(0, arg1) != null) {
            this.field7128[arg2] = class647.method3617(1073741824, arg1);
            this.method3000(698011144);
        }
    }
}
