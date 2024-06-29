import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class353 {

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public int field4292 = -1;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    private int field4298 = 128;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    private int field4301 = 0;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "B")
    public byte field4296 = 0;

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
    private int field4308 = 0;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    private int field4295 = 128;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    private int field4300 = -1;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "Z")
    public boolean field4314 = false;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    private int field4305 = 0;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field4307 = 0;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "I")
    public static int field4309 = -1;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    private int field4304;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public int field4306;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Ldv;")
    public class93 field4299;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "[S")
    private short[] field4291;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "[S")
    private short[] field4302;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "[S")
    private short[] field4303;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "[S")
    private short[] field4315;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILmc;I)V")
    private final void method2029(int arg0, class234 arg1, int arg2) {
        field4312++;
        if (arg2 == 1) {
            this.field4304 = arg1.method1553((byte) 13);
        } else if (arg2 == 2) {
            this.field4292 = arg1.method1553((byte) 75);
        } else if (arg2 == 4) {
            this.field4295 = arg1.method1553((byte) 118);
        } else if (arg2 == 5) {
            this.field4298 = arg1.method1553((byte) -127);
        } else if (arg2 == 6) {
            this.field4308 = arg1.method1553((byte) -114);
        } else if (arg2 == 7) {
            this.field4305 = arg1.method1509(true);
        } else if (arg2 == 8) {
            this.field4301 = arg1.method1509(true);
        } else if (arg2 == 9) {
            this.field4300 = 8224;
            this.field4296 = 3;
        } else if (arg2 == 10) {
            this.field4314 = true;
        } else if (arg2 == 11) {
            this.field4296 = 1;
        } else if (arg2 == 12) {
            this.field4296 = 4;
        } else if (arg2 == 13) {
            this.field4296 = 5;
        } else if (arg2 == 14) {
            this.field4296 = 2;
            this.field4300 = arg1.method1509(true) * 256;
        } else if (arg2 == 15) {
            this.field4296 = 3;
            this.field4300 = arg1.method1553((byte) 88);
        } else if (arg2 == 16) {
            this.field4296 = 3;
            this.field4300 = arg1.method1497((byte) 110);
        } else if (arg2 == 40) {
            int var6 = arg1.method1509(true);
            this.field4303 = new short[var6];
            this.field4315 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4315[var7] = (short) arg1.method1553((byte) 57);
                this.field4303[var7] = (short) arg1.method1553((byte) -121);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1509(true);
            this.field4302 = new short[var4];
            this.field4291 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4291[var5] = (short) arg1.method1553((byte) -111);
                this.field4302[var5] = (short) arg1.method1553((byte) -116);
            }
        }
        if (arg0 != 15904) {
            this.method2033(-31, 16, (byte) 114, null, (byte) 73, 83, null, 92);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ls;Lcl;IIIZIIIILs;Lha;B)Lka;")
    public final class299 method2030(class358 arg0, class778 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, class358 arg10, class570 arg11, byte arg12) {
        if (arg12 >= -71) {
            this.field4315 = null;
        }
        field4316++;
        return this.method2031(arg9, arg1, arg3, arg10, arg5, arg7, (byte) 2, arg6, arg4, arg11, false, arg2, arg0, arg8);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILcl;ILs;ZIBIILha;ZILs;I)Lka;")
    private final class299 method2031(int arg0, class778 arg1, int arg2, class358 arg3, boolean arg4, int arg5, byte arg6, int arg7, int arg8, class570 arg9, boolean arg10, int arg11, class358 arg12, int arg13) {
        field4311++;
        if (arg10) {
            field4307 = 57;
        }
        int var15 = arg2;
        class11 var16 = this.field4292 == -1 || arg13 == -1 ? null : arg1.method4265(true, this.field4292);
        boolean var17 = arg4 & this.field4296 != 0;
        if (var16 != null) {
            var15 = arg2 | var16.method47(65535, false, arg5, arg13);
        }
        if (var17) {
            var15 |= this.field4296 == 3 ? 7 : 2;
        }
        if (this.field4298 != 128) {
            var15 |= 0x2;
        }
        if (this.field4295 != 128 || this.field4308 != 0) {
            var15 |= 0x5;
        }
        class536 var18 = this.field4299.field1292;
        class299 var19;
        synchronized (this.field4299.field1292) {
            var19 = (class299) this.field4299.field1292.method2931((long) (this.field4306 |= arg9.field7205 << 29), (byte) -125);
        }
        if (var19 == null || arg9.method941(var19.method1239(), var15) != 0) {
            if (var19 != null) {
                var15 = arg9.method886(var15, var19.method1239());
            }
            int var20 = var15;
            if (this.field4315 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4291 != null) {
                var20 |= 0x8000;
            }
            class615 var21 = class50.method321((byte) -89, 0, this.field4304, this.field4299.field1286);
            if (var21 == null) {
                return null;
            }
            if (var21.field7799 < 13) {
                var21.method3288(103, 2);
            }
            var19 = arg9.method930(var21, var20, this.field4299.field1293, this.field4305 + 64, this.field4301 + 850);
            if (this.field4315 != null) {
                for (int var22 = 0; var22 < this.field4315.length; var22++) {
                    var19.method1265(this.field4315[var22], this.field4303[var22]);
                }
            }
            if (this.field4291 != null) {
                for (int var23 = 0; var23 < this.field4291.length; var23++) {
                    var19.method1270(this.field4291[var23], this.field4302[var23]);
                }
            }
            var19.method1252(var15);
            class536 var24 = this.field4299.field1292;
            synchronized (this.field4299.field1292) {
                this.field4299.field1292.method2918((long) (this.field4306 |= arg9.field7205 << 29), var19, 121);
            }
        }
        class299 var25 = var16 == null ? var19.method1284(arg6, var15, true) : var16.method49(0, arg6, arg11, arg13, var19, var15, 2, arg5);
        if (this.field4295 != 128 || this.field4298 != 128) {
            var25.method1282(this.field4295, this.field4298, this.field4295);
        }
        if (this.field4308 != 0) {
            if (this.field4308 == 90) {
                var25.method1253(4096);
            }
            if (this.field4308 == 180) {
                var25.method1253(8192);
            }
            if (this.field4308 == 270) {
                var25.method1253(12288);
            }
        }
        if (var17) {
            var25.method1234(this.field4296, this.field4300, arg3, arg12, arg8, arg7, arg0);
        }
        var25.method1252(arg2);
        return var25;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIII)V")
    public static final void method2032(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4313++;
        int var6 = -124 % ((-arg1 - 66) / 42);
        if (arg2 >= class498.field6390 && class30.field274 >= arg0 && class80.field1131 <= arg3 && class405.field5375 >= arg4) {
            class30.method129((byte) -70, arg2, arg4, arg5, arg0, arg3);
        } else {
            class82.method513(arg2, -76, arg0, arg3, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBLcl;BILha;I)Lka;")
    public final class299 method2033(int arg0, int arg1, byte arg2, class778 arg3, byte arg4, int arg5, class570 arg6, int arg7) {
        if (arg2 != 84) {
            this.method2034(null, 93);
        }
        field4294++;
        return this.method2031(0, arg3, arg7, null, false, arg1, arg4, 0, 0, arg6, false, arg0, null, arg5);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lmc;I)V")
    public final void method2034(class234 arg0, int arg1) {
        field4293++;
        if (arg1 != 20344) {
            this.method2030(null, null, -65, 28, 80, false, -62, -68, -32, 28, null, null, (byte) 126);
        }
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                return;
            }
            this.method2029(15904, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lcl;IILha;III)Lka;")
    public final class299 method2035(class778 arg0, int arg1, int arg2, class570 arg3, int arg4, int arg5, int arg6) {
        field4297++;
        if (arg6 != 6) {
            this.field4292 = -55;
        }
        return this.method2031(0, arg0, arg1, null, false, arg4, (byte) 2, 0, 0, arg3, false, arg5, null, arg2);
    }
}
