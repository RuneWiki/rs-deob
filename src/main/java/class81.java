import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class81 {

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    private int field1213 = 0;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    private int field1215 = 0;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "I")
    private int field1225 = 0;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "Z")
    public boolean field1232 = false;

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
    private int field1234 = 128;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    private int field1216 = 128;

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "I")
    private int field1233 = -1;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
    public int field1229 = -1;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "B")
    public byte field1227 = 0;

    @OriginalMember(owner = "client!cba", name = "y", descriptor = "Lvh;")
    public static class125 field1236 = new class125(22, 3);

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    private int field1219;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!cba", name = "l", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!cba", name = "z", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!cba", name = "A", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "Lgw;")
    public class73 field1226;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "[S")
    private short[] field1214;

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "[S")
    private short[] field1221;

    @OriginalMember(owner = "client!cba", name = "t", descriptor = "[S")
    private short[] field1231;

    @OriginalMember(owner = "client!cba", name = "x", descriptor = "[S")
    private short[] field1235;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILek;)V", line = 17)
    public final void method616(int arg0, class465 arg1) {
        if (arg0 != 8637) {
            return;
        }
        field1230++;
        while (true) {
            int var3 = arg1.method2705(-60);
            if (var3 == 0) {
                return;
            }
            this.method621(var3, (byte) 78, arg1);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILoq;ILr;II)Lda;", line = 42)
    public final class397 method617(int arg0, int arg1, class205 arg2, int arg3, class98 arg4, int arg5, int arg6) {
        if (arg6 == 15735) {
            field1228++;
            return this.method623(0, arg5, arg4, arg0, null, (byte) 2, -31, null, 0, arg2, 0, arg1, false, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V", line = 55)
    public static void method618(byte arg0) {
        field1236 = null;
        if (arg0 != 119) {
            method618((byte) 7);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILi;Li;BIILoq;IIZLr;I)Lda;", line = 70)
    public final class397 method619(int arg0, int arg1, class682 arg2, class682 arg3, byte arg4, int arg5, int arg6, class205 arg7, int arg8, int arg9, boolean arg10, class98 arg11, int arg12) {
        field1217++;
        if (arg4 != 2) {
            this.field1216 = 108;
        }
        return this.method623(arg6, arg8, arg11, arg5, arg3, (byte) 2, -114, arg2, arg9, arg7, arg0, arg12, arg10, arg1);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIBILoq;ILr;)Lda;", line = 93)
    public final class397 method620(int arg0, int arg1, byte arg2, int arg3, class205 arg4, int arg5, class98 arg6) {
        int var8 = -22 % ((77 - arg2) / 48);
        field1218++;
        return this.method623(0, arg1, arg6, arg0, null, (byte) 5, -66, null, 0, arg4, 0, arg5, false, arg3);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IBLek;)V", line = 104)
    private final void method621(int arg0, byte arg1, class465 arg2) {
        if (arg1 < 46) {
            this.field1226 = null;
        }
        field1223++;
        if (arg0 == 1) {
            this.field1219 = arg2.method2755((byte) -50);
        } else if (arg0 == 2) {
            this.field1229 = arg2.method2755((byte) -60);
        } else if (arg0 == 4) {
            this.field1234 = arg2.method2755((byte) -98);
        } else if (arg0 == 5) {
            this.field1216 = arg2.method2755((byte) -111);
        } else if (arg0 == 6) {
            this.field1213 = arg2.method2755((byte) -53);
        } else if (arg0 == 7) {
            this.field1215 = arg2.method2705(-82);
        } else if (arg0 == 8) {
            this.field1225 = arg2.method2705(-68);
        } else if (arg0 == 9) {
            this.field1233 = 8224;
            this.field1227 = 3;
        } else if (arg0 == 10) {
            this.field1232 = true;
        } else if (arg0 == 11) {
            this.field1227 = 1;
        } else if (arg0 == 12) {
            this.field1227 = 4;
        } else if (arg0 == 13) {
            this.field1227 = 5;
        } else if (arg0 == 14) {
            this.field1227 = 2;
            this.field1233 = arg2.method2705(-38) * 256;
        } else if (arg0 == 15) {
            this.field1227 = 3;
            this.field1233 = arg2.method2755((byte) -121);
        } else if (arg0 == 16) {
            this.field1227 = 3;
            this.field1233 = arg2.method2691((byte) -67);
        } else if (arg0 == 40) {
            int var4 = arg2.method2705(-62);
            this.field1214 = new short[var4];
            this.field1235 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1235[var5] = (short) arg2.method2755((byte) -92);
                this.field1214[var5] = (short) arg2.method2755((byte) -87);
            }
            return;
        } else if (arg0 == 41) {
            int var6 = arg2.method2705(-47);
            this.field1231 = new short[var6];
            this.field1221 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1221[var7] = (short) arg2.method2755((byte) -101);
                this.field1231[var7] = (short) arg2.method2755((byte) -43);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "([[II)V", line = 236)
    public static final void method622(int[][] arg0, int arg1) {
        field1224++;
        class657.field9275 = arg0;
        if (arg1 != -129) {
            field1236 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILr;ILi;BILi;ILoq;IIZI)Lda;", line = 259)
    private final class397 method623(int arg0, int arg1, class98 arg2, int arg3, class682 arg4, byte arg5, int arg6, class682 arg7, int arg8, class205 arg9, int arg10, int arg11, boolean arg12, int arg13) {
        field1220++;
        int var15 = arg11;
        class606 var16 = this.field1229 == -1 || arg3 == -1 ? null : arg9.method1417(-3585, this.field1229);
        boolean var17 = arg12 & this.field1227 != 0;
        if (var16 != null) {
            var15 = arg11 | var16.method3452((byte) 29, arg1, arg3, false);
        }
        if (var17) {
            var15 |= this.field1227 == 3 ? 7 : 2;
        }
        if (this.field1216 != 128) {
            var15 |= 0x2;
        }
        if (this.field1234 != 128 || this.field1213 != 0) {
            var15 |= 0x5;
        }
        if (arg6 > -28) {
            this.method621(-53, (byte) 109, null);
        }
        class117 var18 = this.field1226.field1171;
        class397 var19;
        synchronized (this.field1226.field1171) {
            var19 = (class397) this.field1226.field1171.method941((long) (this.field1222 |= arg2.field1463 << 29), 0);
        }
        if (var19 == null || arg2.method754(var19.method468(), var15) != 0) {
            if (var19 != null) {
                var15 = arg2.method738(var15, var19.method468());
            }
            int var20 = var15;
            if (this.field1235 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field1221 != null) {
                var20 |= 0x8000;
            }
            class163 var21 = class84.method639(this.field1226.field1170, -4341, this.field1219, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field2677 < 13) {
                var21.method1243(1, 2);
            }
            var19 = arg2.method795(var21, var20, this.field1226.field1172, this.field1215 + 64, this.field1225 + 850);
            if (this.field1235 != null) {
                for (int var22 = 0; var22 < this.field1235.length; var22++) {
                    var19.method464(this.field1235[var22], this.field1214[var22]);
                }
            }
            if (this.field1221 != null) {
                for (int var23 = 0; var23 < this.field1221.length; var23++) {
                    var19.method479(this.field1221[var23], this.field1231[var23]);
                }
            }
            var19.method438(var15);
            class117 var24 = this.field1226.field1171;
            synchronized (this.field1226.field1171) {
                this.field1226.field1171.method949((long) (this.field1222 |= arg2.field1463 << 29), true, var19);
            }
        }
        class397 var25 = var16 == null ? var19.method475(arg5, var15, true) : var16.method3449(arg13, var19, arg5, arg3, 27020, var15, 0, arg1);
        if (this.field1234 != 128 || this.field1216 != 128) {
            var25.method426(this.field1234, this.field1216, this.field1234);
        }
        if (this.field1213 != 0) {
            if (this.field1213 == 90) {
                var25.method474(4096);
            }
            if (this.field1213 == 180) {
                var25.method474(8192);
            }
            if (this.field1213 == 270) {
                var25.method474(12288);
            }
        }
        if (var17) {
            var25.method484(this.field1227, this.field1233, arg7, arg4, arg8, arg10, arg0);
        }
        var25.method438(arg11);
        return var25;
    }
}
