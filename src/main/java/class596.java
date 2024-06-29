import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class596 {

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
    private int field8596 = 0;

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "I")
    private int field8599 = 0;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
    private int field8597 = 128;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "Z")
    public boolean field8600 = false;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    private int field8604 = 0;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    private int field8603 = 128;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
    private int field8609 = -1;

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
    public int field8614 = -1;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "B")
    public byte field8607 = 0;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "Ljk;")
    public static class585 field8610 = new class585(52, 4);

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "[I")
    public static int[] field8617 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    private int field8601;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    public int field8606;

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
    public static int field8615;

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!lca", name = "A", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!lca", name = "B", descriptor = "I")
    public static int field8619;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "Lma;")
    public class12 field8612;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "[I")
    public static int[] field8598;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "[I")
    public static int[] field8613;

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "[S")
    private short[] field8594;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "[S")
    private short[] field8602;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "[S")
    private short[] field8605;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "[S")
    private short[] field8608;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 18)
    public static void method3447(int arg0) {
        field8610 = null;
        field8613 = null;
        field8617 = null;
        field8598 = null;
        if (arg0 != 0) {
            field8613 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILun;)V", line = 40)
    public final void method3448(int arg0, class389 arg1) {
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                if (arg0 != -13) {
                    this.method3452(24, 117, null, 109, null, -96, 85);
                }
                field8618++;
                return;
            }
            this.method3451(var3, arg1, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILi;ZILr;BIIIBILi;ILcf;)Lda;", line = 74)
    private final class55 method3449(int arg0, class37 arg1, boolean arg2, int arg3, class165 arg4, byte arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, class37 arg11, int arg12, class559 arg13) {
        field8592++;
        int var15 = arg6;
        class282 var16 = this.field8614 == -1 || arg12 == -1 ? null : arg13.method3273(this.field8614, 0);
        boolean var17 = arg2 & this.field8607 != 0;
        if (var16 != null) {
            var15 = arg6 | var16.method1693(false, -90, arg12, arg7);
        }
        if (var17) {
            var15 |= this.field8607 == 3 ? 7 : 2;
        }
        if (this.field8603 != 128) {
            var15 |= 0x2;
        }
        if (this.field8597 != 128 || this.field8596 != 0) {
            var15 |= 0x5;
        }
        class472 var18 = this.field8612.field208;
        class55 var19;
        synchronized (this.field8612.field208) {
            var19 = (class55) this.field8612.field208.method2766(-121, (long) (this.field8606 |= arg4.field2018 << 29));
        }
        if (var19 == null || arg4.method306(var19.method118(), var15) != 0) {
            if (var19 != null) {
                var15 = arg4.method271(var15, var19.method118());
            }
            int var20 = var15;
            if (this.field8594 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field8605 != null) {
                var20 |= 0x8000;
            }
            class173 var21 = class110.method797((byte) 104, 0, this.field8612.field204, this.field8601);
            if (var21 == null) {
                return null;
            }
            if (var21.field2137 < 13) {
                var21.method1097(2, (byte) -39);
            }
            var19 = arg4.method274(var21, var20, this.field8612.field209, this.field8599 + 64, this.field8604 + 850);
            if (this.field8594 != null) {
                for (int var22 = 0; var22 < this.field8594.length; var22++) {
                    var19.method87(this.field8594[var22], this.field8608[var22]);
                }
            }
            if (this.field8605 != null) {
                for (int var23 = 0; var23 < this.field8605.length; var23++) {
                    var19.method130(this.field8605[var23], this.field8602[var23]);
                }
            }
            var19.method98(var15);
            class472 var24 = this.field8612.field208;
            synchronized (this.field8612.field208) {
                this.field8612.field208.method2772(var19, true, (long) (this.field8606 |= arg4.field2018 << 29));
            }
        }
        if (arg9 <= 13) {
            return null;
        }
        class55 var25 = var16 == null ? var19.method97(arg5, var15, true) : var16.method1699(0, arg7, var15, false, var19, arg10, arg5, arg12);
        if (this.field8597 != 128 || this.field8603 != 128) {
            var25.method70(this.field8597, this.field8603, this.field8597);
        }
        if (this.field8596 != 0) {
            if (this.field8596 == 90) {
                var25.method74(4096);
            }
            if (this.field8596 == 180) {
                var25.method74(8192);
            }
            if (this.field8596 == 270) {
                var25.method74(12288);
            }
        }
        if (var17) {
            var25.method102(this.field8607, this.field8609, arg11, arg1, arg3, arg0, arg8);
        }
        var25.method98(arg6);
        return var25;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;", line = 196)
    public static final String method3450(int arg0, int arg1, int arg2, String[] arg3) {
        field8619++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = arg0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILun;B)V", line = 259)
    private final void method3451(int arg0, class389 arg1, byte arg2) {
        field8595++;
        if (arg2 <= 42) {
            field8613 = null;
        }
        if (arg0 == 1) {
            this.field8601 = arg1.method2260(-27);
        } else if (arg0 == 2) {
            this.field8614 = arg1.method2260(-60);
        } else if (arg0 == 4) {
            this.field8597 = arg1.method2260(-95);
        } else if (arg0 == 5) {
            this.field8603 = arg1.method2260(-105);
        } else if (arg0 == 6) {
            this.field8596 = arg1.method2260(-41);
        } else if (arg0 == 7) {
            this.field8599 = arg1.method2229(255);
        } else if (arg0 == 8) {
            this.field8604 = arg1.method2229(255);
        } else if (arg0 == 9) {
            this.field8607 = 3;
            this.field8609 = 8224;
        } else if (arg0 == 10) {
            this.field8600 = true;
        } else if (arg0 == 11) {
            this.field8607 = 1;
        } else if (arg0 == 12) {
            this.field8607 = 4;
        } else if (arg0 == 13) {
            this.field8607 = 5;
        } else if (arg0 == 14) {
            this.field8607 = 2;
            this.field8609 = arg1.method2229(255) * 256;
        } else if (arg0 == 15) {
            this.field8607 = 3;
            this.field8609 = arg1.method2260(-35);
        } else if (arg0 == 16) {
            this.field8607 = 3;
            this.field8609 = arg1.method2255(255);
        } else if (arg0 == 40) {
            int var6 = arg1.method2229(255);
            this.field8594 = new short[var6];
            this.field8608 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field8594[var7] = (short) arg1.method2260(-72);
                this.field8608[var7] = (short) arg1.method2260(-28);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method2229(255);
            this.field8602 = new short[var4];
            this.field8605 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8605[var5] = (short) arg1.method2260(-73);
                this.field8602[var5] = (short) arg1.method2260(-30);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILr;ILcf;II)Lda;", line = 382)
    public final class55 method3452(int arg0, int arg1, class165 arg2, int arg3, class559 arg4, int arg5, int arg6) {
        if (arg3 != -7) {
            this.method3448(-86, null);
        }
        field8611++;
        return this.method3449(0, null, false, 0, arg2, (byte) 2, arg1, arg6, 0, (byte) 111, arg0, null, arg5, arg4);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIZILi;Lcf;ILr;ZILi;I)Lda;", line = 407)
    public final class55 method3453(int arg0, int arg1, int arg2, boolean arg3, int arg4, class37 arg5, class559 arg6, int arg7, class165 arg8, boolean arg9, int arg10, class37 arg11, int arg12) {
        field8616++;
        if (arg9) {
            method3450(-79, 103, -126, null);
        }
        return this.method3449(arg12, arg11, arg3, arg1, arg8, (byte) 2, arg7, arg2, arg4, (byte) 29, arg10, arg5, arg0, arg6);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILcf;ILr;II)Lda;", line = 425)
    public final class55 method3454(int arg0, int arg1, class559 arg2, int arg3, class165 arg4, int arg5, int arg6) {
        field8593++;
        return arg6 == 0 ? this.method3449(0, null, false, 0, arg4, (byte) 5, arg3, arg1, 0, (byte) 114, arg5, null, arg0, arg2) : null;
    }
}
