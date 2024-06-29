import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class716 {

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    private int field10089 = -1;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "B")
    public byte field10082 = 0;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    private int field10093 = 128;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    private int field10098 = 0;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    private int field10099 = 0;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    private int field10079 = 0;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    private int field10083 = 128;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Z")
    public boolean field10105 = false;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public int field10096 = -1;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field10084 = 4;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Z")
    public static boolean field10094 = false;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "F")
    public static float field10100;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field10081;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field10087;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field10088;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field10090;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field10091;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public int field10092;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field10095;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    private int field10104;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Lwc;")
    public static class376 field10107;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "Luo;")
    public class668 field10102;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "[Ls;")
    public static class402[] field10106;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "[S")
    private short[] field10085;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[S")
    private short[] field10097;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "[S")
    private short[] field10101;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "[S")
    private short[] field10108;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILtn;)V", line = 3)
    private final void method3972(int arg0, int arg1, class179 arg2) {
        if (arg0 != 0) {
            field10106 = null;
        }
        if (arg1 == 1) {
            this.field10104 = arg2.method1107(false);
        } else if (arg1 == 2) {
            this.field10096 = arg2.method1107(false);
        } else if (arg1 == 4) {
            this.field10093 = arg2.method1107(false);
        } else if (arg1 == 5) {
            this.field10083 = arg2.method1107(false);
        } else if (arg1 == 6) {
            this.field10098 = arg2.method1107(false);
        } else if (arg1 == 7) {
            this.field10079 = arg2.method1094(255);
        } else if (arg1 == 8) {
            this.field10099 = arg2.method1094(arg0 + 255);
        } else if (arg1 == 9) {
            this.field10089 = 8224;
            this.field10082 = 3;
        } else if (arg1 == 10) {
            this.field10105 = true;
        } else if (arg1 == 11) {
            this.field10082 = 1;
        } else if (arg1 == 12) {
            this.field10082 = 4;
        } else if (arg1 == 13) {
            this.field10082 = 5;
        } else if (arg1 == 14) {
            this.field10082 = 2;
            this.field10089 = arg2.method1094(255) * 256;
        } else if (arg1 == 15) {
            this.field10082 = 3;
            this.field10089 = arg2.method1107(false);
        } else if (arg1 == 16) {
            this.field10082 = 3;
            this.field10089 = arg2.method1095((byte) 119);
        } else if (arg1 == 40) {
            int var6 = arg2.method1094(255);
            this.field10097 = new short[var6];
            this.field10101 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field10101[var7] = (short) arg2.method1107(false);
                this.field10097[var7] = (short) arg2.method1107(false);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method1094(255);
            this.field10108 = new short[var4];
            this.field10085 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field10085[var5] = (short) arg2.method1107(false);
                this.field10108[var5] = (short) arg2.method1107(false);
            }
        }
        field10090++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ltn;B)V", line = 128)
    public final void method3973(class179 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1094(255);
            if (var3 == 0) {
                if (arg1 != -102) {
                    return;
                }
                field10088++;
                return;
            }
            this.method3972(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BC)Z", line = 157)
    public static final boolean method3974(byte arg0, char arg1) {
        field10081++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class3.method13(arg1, 248)) {
            return true;
        } else {
            char[] var2 = class203.field2586;
            if (arg0 != 98) {
                return false;
            }
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class137.field1626;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILab;Lab;)V", line = 208)
    public static final void method3975(int arg0, class623 arg1, class623 arg2) {
        if (arg1.field8708 != null) {
            arg1.method3409(60);
        }
        field10087++;
        arg1.field8705 = arg2.field8705;
        arg1.field8708 = arg2;
        arg1.field8708.field8705 = arg1;
        arg1.field8705.field8708 = arg1;
        if (arg0 <= 118) {
            method3981((byte) -113, null);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILha;IIILnaa;Ls;ILs;IZI)Lka;", line = 226)
    public final class219 method3976(int arg0, int arg1, class454 arg2, int arg3, int arg4, int arg5, class93 arg6, class402 arg7, int arg8, class402 arg9, int arg10, boolean arg11, int arg12) {
        field10103++;
        return arg3 <= 66 ? null : this.method3977(arg1, arg2, arg8, arg10, arg7, arg11, arg5, arg4, arg9, arg12, arg6, arg0, 126, (byte) 2);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILha;IILs;ZIILs;ILnaa;IIB)Lka;", line = 250)
    private final class219 method3977(int arg0, class454 arg1, int arg2, int arg3, class402 arg4, boolean arg5, int arg6, int arg7, class402 arg8, int arg9, class93 arg10, int arg11, int arg12, byte arg13) {
        field10080++;
        int var15 = arg3;
        class747 var16 = this.field10096 == -1 || arg0 == -1 ? null : arg10.method643(this.field10096, -64);
        boolean var17 = arg5 & this.field10082 != 0;
        if (var16 != null) {
            var15 = arg3 | var16.method4178(arg0, arg2, -31599, false);
        }
        if (var17) {
            var15 |= this.field10082 == 3 ? 7 : 2;
        }
        if (this.field10083 != 128) {
            var15 |= 0x2;
        }
        if (this.field10093 != 128 || this.field10098 != 0) {
            var15 |= 0x5;
        }
        class114 var18 = this.field10102.field9151;
        class219 var19;
        synchronized (this.field10102.field9151) {
            var19 = (class219) this.field10102.field9151.method778((long) (this.field10092 |= arg1.field6368 << 29), -40);
        }
        if (var19 == null || arg1.method135(var19.method1340(), var15) != 0) {
            if (var19 != null) {
                var15 = arg1.method100(var15, var19.method1340());
            }
            int var20 = var15;
            if (this.field10101 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field10085 != null) {
                var20 |= 0x8000;
            }
            class415 var21 = class566.method3193(true, 0, this.field10104, this.field10102.field9149);
            if (var21 == null) {
                return null;
            }
            if (var21.field5853 < 13) {
                var21.method2458((byte) 115, 2);
            }
            var19 = arg1.method150(var21, var20, this.field10102.field9152, this.field10079 + 64, this.field10099 - -850);
            if (this.field10101 != null) {
                for (int var22 = 0; var22 < this.field10101.length; var22++) {
                    var19.method1362(this.field10101[var22], this.field10097[var22]);
                }
            }
            if (this.field10085 != null) {
                for (int var23 = 0; var23 < this.field10085.length; var23++) {
                    var19.method1368(this.field10085[var23], this.field10108[var23]);
                }
            }
            var19.method1327(var15);
            class114 var24 = this.field10102.field9151;
            synchronized (this.field10102.field9151) {
                this.field10102.field9151.method774((long) (this.field10092 |= arg1.field6368 << 29), -66, var19);
            }
        }
        class219 var25 = var16 == null ? var19.method1337(arg13, var15, true) : var16.method4176(arg2, 0, var15, 2336, var19, arg0, arg9, arg13);
        if (this.field10093 != 128 || this.field10083 != 128) {
            var25.method1377(this.field10093, this.field10083, this.field10093);
        }
        if (this.field10098 != 0) {
            if (this.field10098 == 90) {
                var25.method1358(4096);
            }
            if (this.field10098 == 180) {
                var25.method1358(8192);
            }
            if (this.field10098 == 270) {
                var25.method1358(12288);
            }
        }
        if (var17) {
            var25.method1320(this.field10082, this.field10089, arg8, arg4, arg7, arg11, arg6);
        }
        var25.method1327(arg3);
        return arg12 < 124 ? null : var25;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 381)
    public static void method3978(byte arg0) {
        if (arg0 == 5) {
            field10107 = null;
            field10106 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lnaa;ILha;IIII)Lka;", line = 396)
    public final class219 method3979(class93 arg0, int arg1, class454 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -16341) {
            this.field10096 = 88;
        }
        field10086++;
        return this.method3977(arg1, arg2, arg4, arg6, null, false, 0, 0, null, arg5, arg0, 0, 125, (byte) 5);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lha;Lnaa;IIIIB)Lka;", line = 408)
    public final class219 method3980(class454 arg0, class93 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field10095++;
        if (arg6 < 8) {
            this.method3979(null, 35, null, -33, -126, 9, -92);
        }
        return this.method3977(arg3, arg0, arg4, arg2, null, false, 0, 0, null, arg5, arg1, 0, 125, (byte) 2);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLet;)V", line = 421)
    public static final void method3981(byte arg0, class718 arg1) {
        field10091++;
        if (arg1 == null) {
            return;
        }
        class565.field7906.method3110(arg1, 1);
        class573.field8011++;
        if (arg0 >= -97) {
            return;
        }
        Object var2 = null;
        class359 var5;
        if (arg1.field10127 || "".equals(arg1.field10124)) {
            var5 = new class359(arg1.field10124);
            class1.field1++;
        } else {
            long var3 = arg1.field10131;
            for (var5 = (class359) class124.field1491.method3248(var3, 0); var5 != null && !var5.field5119.equals(arg1.field10124); var5 = (class359) class124.field1491.method3246((byte) 60)) {
            }
            if (var5 == null) {
                var5 = (class359) class131.field1569.method778(var3, 118);
                if (var5 != null && !var5.field5119.equals(arg1.field10124)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class359(arg1.field10124);
                }
                class124.field1491.method3249(var3, var5, (byte) 92);
                class1.field1++;
            }
        }
        if (var5.method2202(-1, arg1)) {
            class36.method321(-101, var5);
        }
    }
}
