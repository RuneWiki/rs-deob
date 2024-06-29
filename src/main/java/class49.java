import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class49 {

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public int field497 = -1;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Z")
    public boolean field496 = false;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    private int field506 = 0;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
    private int field505 = 128;

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
    private int field508 = -1;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
    private int field517 = 0;

    @OriginalMember(owner = "client!gp", name = "t", descriptor = "B")
    public byte field514 = 0;

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    private int field504 = 0;

    @OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
    private int field510 = 128;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!gp", name = "u", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public int field518;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!gp", name = "q", descriptor = "Lsk;")
    public class622 field511;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Ljava/lang/String;")
    public static String field501;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "[S")
    private short[] field499;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "[S")
    private short[] field502;

    @OriginalMember(owner = "client!gp", name = "o", descriptor = "[S")
    private short[] field509;

    @OriginalMember(owner = "client!gp", name = "s", descriptor = "[S")
    private short[] field513;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method284(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field507++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else {
            if (arg1 != 0) {
                field501 = null;
            }
            return var4 == 2 ? 7 - arg0 : -arg2 + 7;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lha;IIILme;II)Lka;", line = 30)
    public final class472 method285(class60 arg0, int arg1, int arg2, int arg3, class196 arg4, int arg5, int arg6) {
        if (arg2 != 21945) {
            method288(49, -89, -82, -97);
        }
        field512++;
        return this.method287(arg3, arg6, 0, arg1, null, null, 0, (byte) 5, arg4, false, arg0, false, 0, arg5);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lha;Lme;IIIZLs;IILs;IIB)Lka;", line = 43)
    public final class472 method286(class60 arg0, class196 arg1, int arg2, int arg3, int arg4, boolean arg5, class281 arg6, int arg7, int arg8, class281 arg9, int arg10, int arg11, byte arg12) {
        if (arg12 == 2) {
            field515++;
            return this.method287(arg3, arg2, arg7, arg11, arg9, arg6, arg4, (byte) 2, arg1, false, arg0, arg5, arg10, arg8);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIILs;Ls;IBLme;ZLha;ZII)Lka;", line = 58)
    private final class472 method287(int arg0, int arg1, int arg2, int arg3, class281 arg4, class281 arg5, int arg6, byte arg7, class196 arg8, boolean arg9, class60 arg10, boolean arg11, int arg12, int arg13) {
        field498++;
        int var15 = arg0;
        class300 var16 = this.field497 == -1 || arg1 == -1 ? null : arg8.method1090(this.field497, 16383);
        boolean var17 = arg11 & this.field514 != 0;
        if (arg9) {
            this.field508 = 18;
        }
        if (var16 != null) {
            var15 = arg0 | var16.method1798(false, arg1, true, arg3);
        }
        if (var17) {
            var15 |= this.field514 == 3 ? 7 : 2;
        }
        if (this.field505 != 128) {
            var15 |= 0x2;
        }
        if (this.field510 != 128 || this.field517 != 0) {
            var15 |= 0x5;
        }
        class262 var18 = this.field511.field8714;
        class472 var19;
        synchronized (this.field511.field8714) {
            var19 = (class472) this.field511.field8714.method1571(-125, (long) (this.field518 |= arg10.field632 << 29));
        }
        if (var19 == null || arg10.method396(var19.method225(), var15) != 0) {
            if (var19 != null) {
                var15 = arg10.method389(var15, var19.method225());
            }
            int var20 = var15;
            if (this.field513 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field502 != null) {
                var20 |= 0x8000;
            }
            class446 var21 = class317.method1898(0, -9252, this.field511.field8713, this.field503);
            if (var21 == null) {
                return null;
            }
            if (var21.field6189 < 13) {
                var21.method2502(13746, 2);
            }
            var19 = arg10.method407(var21, var20, this.field511.field8717, this.field504 + 64, this.field506 + 850);
            if (this.field513 != null) {
                for (int var22 = 0; var22 < this.field513.length; var22++) {
                    var19.method195(this.field513[var22], this.field509[var22]);
                }
            }
            if (this.field502 != null) {
                for (int var23 = 0; var23 < this.field502.length; var23++) {
                    var19.method211(this.field502[var23], this.field499[var23]);
                }
            }
            var19.method202(var15);
            class262 var24 = this.field511.field8714;
            synchronized (this.field511.field8714) {
                this.field511.field8714.method1574((long) (this.field518 |= arg10.field632 << 29), var19, (byte) -80);
            }
        }
        class472 var25 = var16 == null ? var19.method241(arg7, var15, true) : var16.method1796(arg7, 0, arg1, var15, arg3, (byte) 86, var19, arg13);
        if (this.field510 != 128 || this.field505 != 128) {
            var25.method227(this.field510, this.field505, this.field510);
        }
        if (this.field517 != 0) {
            if (this.field517 == 90) {
                var25.method197(4096);
            }
            if (this.field517 == 180) {
                var25.method197(8192);
            }
            if (this.field517 == 270) {
                var25.method197(12288);
            }
        }
        if (var17) {
            var25.method214(this.field514, this.field508, arg4, arg5, arg6, arg2, arg12);
        }
        var25.method202(arg0);
        return var25;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(IIII)I", line = 177)
    public static final int method288(int arg0, int arg1, int arg2, int arg3) {
        field500++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (arg0 != 7) {
            return -123;
        } else if (var4 == 1) {
            return 4095 - arg3;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILji;)V", line = 201)
    public final void method289(int arg0, class611 arg1) {
        if (arg0 != 0) {
            this.method286(null, null, -47, 65, -101, false, null, 26, 120, null, -16, -44, (byte) -122);
        }
        field516++;
        while (true) {
            int var3 = arg1.method3428((byte) -114);
            if (var3 == 0) {
                return;
            }
            this.method291(arg0 - 120, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)V", line = 222)
    public static void method290(boolean arg0) {
        if (!arg0) {
            field501 = null;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILji;I)V", line = 233)
    private final void method291(int arg0, class611 arg1, int arg2) {
        if (arg2 == 1) {
            this.field503 = arg1.method3402((byte) 127);
        } else if (arg2 == 2) {
            this.field497 = arg1.method3402((byte) 127);
        } else if (arg2 == 4) {
            this.field510 = arg1.method3402((byte) 127);
        } else if (arg2 == 5) {
            this.field505 = arg1.method3402((byte) 127);
        } else if (arg2 == 6) {
            this.field517 = arg1.method3402((byte) 127);
        } else if (arg2 == 7) {
            this.field504 = arg1.method3428((byte) -120);
        } else if (arg2 == 8) {
            this.field506 = arg1.method3428((byte) 62);
        } else if (arg2 == 9) {
            this.field508 = 8224;
            this.field514 = 3;
        } else if (arg2 == 10) {
            this.field496 = true;
        } else if (arg2 == 11) {
            this.field514 = 1;
        } else if (arg2 == 12) {
            this.field514 = 4;
        } else if (arg2 == 13) {
            this.field514 = 5;
        } else if (arg2 == 14) {
            this.field514 = 2;
            this.field508 = arg1.method3428((byte) 91) * 256;
        } else if (arg2 == 15) {
            this.field514 = 3;
            this.field508 = arg1.method3402((byte) 127);
        } else if (arg2 == 16) {
            this.field514 = 3;
            this.field508 = arg1.method3418(-2);
        } else if (arg2 == 40) {
            int var6 = arg1.method3428((byte) 75);
            this.field509 = new short[var6];
            this.field513 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field513[var7] = (short) arg1.method3402((byte) 127);
                this.field509[var7] = (short) arg1.method3402((byte) 127);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method3428((byte) 95);
            this.field502 = new short[var4];
            this.field499 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field502[var5] = (short) arg1.method3402((byte) 127);
                this.field499[var5] = (short) arg1.method3402((byte) 127);
            }
        }
        if (arg0 >= -49) {
            this.field510 = 7;
        }
        field519++;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILme;IIBILha;)Lka;", line = 358)
    public final class472 method292(int arg0, class196 arg1, int arg2, int arg3, byte arg4, int arg5, class60 arg6) {
        int var8 = -58 / ((arg4 - 17) / 42);
        field495++;
        return this.method287(arg2, arg0, 0, arg5, null, null, 0, (byte) 2, arg1, false, arg6, false, 0, arg3);
    }
}
