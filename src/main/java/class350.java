import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class350 {

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    private int field5074 = 0;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "Z")
    public boolean field5086 = false;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    private int field5078 = 0;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public int field5089 = -1;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    private int field5075 = 128;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    private int field5084 = 0;

    @OriginalMember(owner = "client!sr", name = "x", descriptor = "B")
    public byte field5097 = 0;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "I")
    private int field5092 = 128;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    private int field5087 = -1;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "[I")
    public static int[] field5077 = new int[1];

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "F")
    public static float field5081;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "I")
    public int field5088;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!sr", name = "u", descriptor = "I")
    private int field5094;

    @OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!sr", name = "w", descriptor = "Lcg;")
    public class452 field5096;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "[S")
    private short[] field5080;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "[S")
    private short[] field5083;

    @OriginalMember(owner = "client!sr", name = "t", descriptor = "[S")
    private short[] field5093;

    @OriginalMember(owner = "client!sr", name = "v", descriptor = "[S")
    private short[] field5095;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lec;Lza;IIIBI)Le;", line = 5)
    public final class285 method2096(class109 arg0, class295 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5082++;
        if (arg5 != 17) {
            method2101(-110);
        }
        return this.method2100(arg0, arg2, arg6, (byte) 79, 0, 0, 0, false, null, arg3, (byte) 5, null, arg1, arg4);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lsv;Z)V", line = 22)
    public final void method2097(class319 arg0, boolean arg1) {
        if (!arg1) {
            this.method2102(-22, 5, -107, null, null, -24, -101);
        }
        while (true) {
            int var3 = arg0.method1869(-105);
            if (var3 == 0) {
                field5079++;
                return;
            }
            this.method2103(var3, (byte) 119, arg0);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V", line = 51)
    public static final void method2098(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -49) {
            field5081 = 1.3220683F;
        }
        field5090++;
        if (arg0 >= arg2) {
            class188.method1259(arg2, (byte) 27, arg0, arg4, class42.field626[arg3]);
        } else {
            class188.method1259(arg0, (byte) 27, arg2, arg4, class42.field626[arg3]);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lya;IIIIILya;Lza;ILec;IIZ)Le;", line = 72)
    public final class285 method2099(class11 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class11 arg6, class295 arg7, int arg8, class109 arg9, int arg10, int arg11, boolean arg12) {
        if (arg2 != 8224) {
            field5081 = 0.38366288F;
        }
        field5098++;
        return this.method2100(arg9, arg1, arg5, (byte) 49, arg3, arg10, arg11, arg12, arg6, arg4, (byte) 2, arg0, arg7, arg8);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lec;IIBIIIZLya;IBLya;Lza;I)Le;", line = 87)
    private final class285 method2100(class109 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7, class11 arg8, int arg9, byte arg10, class11 arg11, class295 arg12, int arg13) {
        field5091++;
        if (arg3 <= 42) {
            return null;
        }
        int var15 = arg2;
        class55 var16 = this.field5089 == -1 || arg13 == -1 ? null : arg0.method831(this.field5089, (byte) 54);
        boolean var17 = arg7 & this.field5097 != 0;
        if (var16 != null) {
            var15 = arg2 | var16.method365(arg9, (byte) -103, false, arg13);
        }
        if (var17) {
            var15 |= this.field5097 == 3 ? 7 : 2;
        }
        if (this.field5075 != 128) {
            var15 |= 0x2;
        }
        if (this.field5092 != 128 || this.field5074 != 0) {
            var15 |= 0x5;
        }
        class473 var18 = this.field5096.field6627;
        class285 var19;
        synchronized (this.field5096.field6627) {
            var19 = (class285) this.field5096.field6627.method2767((long) (this.field5088 |= arg12.field3976 << 29), 0);
        }
        if (var19 == null || arg12.method459(var19.method671(), var15) != 0) {
            if (var19 != null) {
                var15 = arg12.method525(var15, var19.method671());
            }
            int var20 = var15;
            if (this.field5095 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field5083 != null) {
                var20 |= 0x8000;
            }
            class496 var21 = class44.method299(this.field5096.field6623, this.field5094, -6502, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field7253 < 13) {
                var21.method2938(false, 0);
            }
            var19 = arg12.method501(var21, var20, this.field5096.field6628, this.field5084 + 64, this.field5078 + 850);
            if (this.field5095 != null) {
                for (int var22 = 0; var22 < this.field5095.length; var22++) {
                    var19.method667(this.field5095[var22], this.field5080[var22]);
                }
            }
            if (this.field5083 != null) {
                for (int var23 = 0; var23 < this.field5083.length; var23++) {
                    var19.method668(this.field5083[var23], this.field5093[var23]);
                }
            }
            var19.method711(var15);
            class473 var24 = this.field5096.field6627;
            synchronized (this.field5096.field6627) {
                this.field5096.field6627.method2777(-1025, var19, (long) (this.field5088 |= arg12.field3976 << 29));
            }
        }
        class285 var25 = var16 == null ? var19.method697(arg10, var15, true) : var16.method359(arg9, var19, arg13, arg1, var15, 0, (byte) -116, arg10);
        if (this.field5092 != 128 || this.field5075 != 128) {
            var25.method712(this.field5092, this.field5075, this.field5092);
        }
        if (this.field5074 != 0) {
            if (this.field5074 == 90) {
                var25.method704(4096);
            }
            if (this.field5074 == 180) {
                var25.method704(8192);
            }
            if (this.field5074 == 270) {
                var25.method704(12288);
            }
        }
        if (var17) {
            var25.method685(this.field5097, this.field5087, arg11, arg8, arg6, arg4, arg5);
        }
        var25.method711(arg2);
        return var25;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 215)
    public static void method2101(int arg0) {
        if (arg0 != 12288) {
            method2098(46, -35, 1, -47, 28);
        }
        field5077 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIILza;Lec;II)Le;", line = 237)
    public final class285 method2102(int arg0, int arg1, int arg2, class295 arg3, class109 arg4, int arg5, int arg6) {
        if (arg5 < 94) {
            return null;
        } else {
            field5085++;
            return this.method2100(arg4, arg0, arg2, (byte) 123, 0, 0, 0, false, null, arg6, (byte) 2, null, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IBLsv;)V", line = 248)
    private final void method2103(int arg0, byte arg1, class319 arg2) {
        field5076++;
        if (arg0 == 1) {
            this.field5094 = arg2.method1844(-119);
        } else if (arg0 == 2) {
            this.field5089 = arg2.method1844(-124);
        } else if (arg0 == 4) {
            this.field5092 = arg2.method1844(-102);
        } else if (arg0 == 5) {
            this.field5075 = arg2.method1844(-123);
        } else if (arg0 == 6) {
            this.field5074 = arg2.method1844(-118);
        } else if (arg0 == 7) {
            this.field5084 = arg2.method1869(-98);
        } else if (arg0 == 8) {
            this.field5078 = arg2.method1869(-81);
        } else if (arg0 == 9) {
            this.field5097 = 3;
            this.field5087 = 8224;
        } else if (arg0 == 10) {
            this.field5086 = true;
        } else if (arg0 == 11) {
            this.field5097 = 1;
        } else if (arg0 == 12) {
            this.field5097 = 4;
        } else if (arg0 == 13) {
            this.field5097 = 5;
        } else if (arg0 == 14) {
            this.field5097 = 2;
            this.field5087 = arg2.method1869(-72) * 256;
        } else if (arg0 == 15) {
            this.field5097 = 3;
            this.field5087 = arg2.method1844(-102);
        } else if (arg0 == 16) {
            this.field5097 = 3;
            this.field5087 = arg2.method1863(-1);
        } else if (arg0 == 40) {
            int var4 = arg2.method1869(-86);
            this.field5080 = new short[var4];
            this.field5095 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5095[var5] = (short) arg2.method1844(-119);
                this.field5080[var5] = (short) arg2.method1844(-122);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method1869(-114);
            this.field5083 = new short[var6];
            this.field5093 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5083[var7] = (short) arg2.method1844(-128);
                this.field5093[var7] = (short) arg2.method1844(-113);
            }
        }
        if (arg1 <= 97) {
            this.field5088 = 41;
        }
    }
}
