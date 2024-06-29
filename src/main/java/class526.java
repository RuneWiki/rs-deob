import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class526 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    private int field7403 = -1;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "B")
    public byte field7404 = 0;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    private int field7405 = 0;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    private int field7425 = 128;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    private int field7409 = 128;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public int field7427 = -1;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Z")
    public boolean field7423 = false;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    private int field7422 = 0;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    private int field7410 = 0;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Lsl;")
    public static class427 field7412 = new class427(512);

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field7417 = -1;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "[[I")
    public static int[][] field7418 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!k", name = "r", descriptor = "[I")
    public static int[] field7420 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    private int field7407;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public int field7424;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lop;")
    public class174 field7416;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[S")
    private short[] field7406;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[S")
    private short[] field7408;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "[S")
    private short[] field7413;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "[S")
    private short[] field7419;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lrb;BIIIILr;)Lda;")
    public final class55 method3076(class325 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class167 arg6) {
        if (arg1 == 3) {
            field7414++;
            return this.method3078(arg5, arg2, 0, 0, arg6, -29947, 0, null, arg4, arg3, null, arg0, false, (byte) 2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILi;IZLr;IILi;Lrb;IIBI)Lda;")
    public final class55 method3077(int arg0, class37 arg1, int arg2, boolean arg3, class167 arg4, int arg5, int arg6, class37 arg7, class325 arg8, int arg9, int arg10, byte arg11, int arg12) {
        if (arg11 == -124) {
            field7415++;
            return this.method3078(arg5, arg9, arg12, arg6, arg4, arg11 - 29823, arg10, arg1, arg2, arg0, arg7, arg8, arg3, (byte) 2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIILr;IILi;IILi;Lrb;ZB)Lda;")
    private final class55 method3078(int arg0, int arg1, int arg2, int arg3, class167 arg4, int arg5, int arg6, class37 arg7, int arg8, int arg9, class37 arg10, class325 arg11, boolean arg12, byte arg13) {
        field7421++;
        int var15 = arg0;
        class138 var16 = this.field7427 == -1 || arg8 == -1 ? null : arg11.method2099(this.field7427, true);
        boolean var17 = arg12 & this.field7404 != 0;
        if (var16 != null) {
            var15 = arg0 | var16.method1131(arg1, arg8, false, arg5 + 29947);
        }
        if (var17) {
            var15 |= this.field7404 == 3 ? 7 : 2;
        }
        if (this.field7425 != 128) {
            var15 |= 0x2;
        }
        if (this.field7409 != 128 || this.field7422 != 0) {
            var15 |= 0x5;
        }
        class287 var18 = this.field7416.field2878;
        class55 var19;
        synchronized (this.field7416.field2878) {
            var19 = (class55) this.field7416.field2878.method1900((long) (this.field7424 |= arg4.field2783 << 29), 82);
        }
        if (var19 == null || arg4.method35(var19.method352(), var15) != 0) {
            if (var19 != null) {
                var15 = arg4.method34(var15, var19.method352());
            }
            int var20 = var15;
            if (this.field7406 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field7408 != null) {
                var20 |= 0x8000;
            }
            class519 var21 = class79.method826(this.field7407, 0, arg5 + 34043, this.field7416.field2875);
            if (var21 == null) {
                return null;
            }
            if (var21.field7312 < 13) {
                var21.method3060((byte) -85, 2);
            }
            var19 = arg4.method37(var21, var20, this.field7416.field2879, this.field7405 + 64, this.field7410 + 850);
            if (this.field7406 != null) {
                for (int var22 = 0; var22 < this.field7406.length; var22++) {
                    var19.method365(this.field7406[var22], this.field7419[var22]);
                }
            }
            if (this.field7408 != null) {
                for (int var23 = 0; var23 < this.field7408.length; var23++) {
                    var19.method364(this.field7408[var23], this.field7413[var23]);
                }
            }
            var19.method361(var15);
            class287 var24 = this.field7416.field2878;
            synchronized (this.field7416.field2878) {
                this.field7416.field2878.method1904(var19, (long) (this.field7424 |= arg4.field2783 << 29), -1);
            }
        }
        class55 var25 = var16 == null ? var19.method357(arg13, var15, true) : var16.method1132(arg13, arg9, true, var15, arg1, arg8, 0, var19);
        if (this.field7409 != 128 || this.field7425 != 128) {
            var25.method346(this.field7409, this.field7425, this.field7409);
        }
        if (arg5 != -29947) {
            return null;
        }
        if (this.field7422 != 0) {
            if (this.field7422 == 90) {
                var25.method349(4096);
            }
            if (this.field7422 == 180) {
                var25.method349(8192);
            }
            if (this.field7422 == 270) {
                var25.method349(12288);
            }
        }
        if (var17) {
            var25.method320(this.field7404, this.field7403, arg7, arg10, arg3, arg6, arg2);
        }
        var25.method361(arg0);
        return var25;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BLrb;Lr;IIII)Lda;")
    public final class55 method3079(byte arg0, class325 arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 18) {
            this.method3079((byte) -36, null, null, -103, -74, 81, -93);
        }
        field7426++;
        return this.method3078(arg4, arg5, 0, 0, arg2, -29947, 0, null, arg6, arg3, null, arg1, false, (byte) 5);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLqh;)V")
    public final void method3080(boolean arg0, class61 arg1) {
        if (arg0) {
            this.method3077(11, null, 41, false, null, 35, -123, null, null, 31, 110, (byte) -26, -80);
        }
        while (true) {
            int var3 = arg1.method732(-559537960);
            if (var3 == 0) {
                field7411++;
                return;
            }
            this.method3081(var3, !arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLqh;)V")
    private final void method3081(int arg0, boolean arg1, class61 arg2) {
        if (!arg1) {
            return;
        }
        if (arg0 == 1) {
            this.field7407 = arg2.method723((byte) -25);
        } else if (arg0 == 2) {
            this.field7427 = arg2.method723((byte) -25);
        } else if (arg0 == 4) {
            this.field7409 = arg2.method723((byte) -25);
        } else if (arg0 == 5) {
            this.field7425 = arg2.method723((byte) -25);
        } else if (arg0 == 6) {
            this.field7422 = arg2.method723((byte) -25);
        } else if (arg0 == 7) {
            this.field7405 = arg2.method732(-559537960);
        } else if (arg0 == 8) {
            this.field7410 = arg2.method732(-559537960);
        } else if (arg0 == 9) {
            this.field7404 = 3;
            this.field7403 = 8224;
        } else if (arg0 == 10) {
            this.field7423 = true;
        } else if (arg0 == 11) {
            this.field7404 = 1;
        } else if (arg0 == 12) {
            this.field7404 = 4;
        } else if (arg0 == 13) {
            this.field7404 = 5;
        } else if (arg0 == 14) {
            this.field7404 = 2;
            this.field7403 = arg2.method732(-559537960) * 256;
        } else if (arg0 == 15) {
            this.field7404 = 3;
            this.field7403 = arg2.method723((byte) -25);
        } else if (arg0 == 16) {
            this.field7404 = 3;
            this.field7403 = arg2.method730(105);
        } else if (arg0 == 40) {
            int var6 = arg2.method732(-559537960);
            this.field7419 = new short[var6];
            this.field7406 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7406[var7] = (short) arg2.method723((byte) -25);
                this.field7419[var7] = (short) arg2.method723((byte) -25);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method732(-559537960);
            this.field7408 = new short[var4];
            this.field7413 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7408[var5] = (short) arg2.method723((byte) -25);
                this.field7413[var5] = (short) arg2.method723((byte) -25);
            }
        }
        field7428++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method3082(int arg0) {
        field7412 = null;
        field7418 = null;
        if (arg0 != 843) {
            field7418 = null;
        }
        field7420 = null;
    }
}
