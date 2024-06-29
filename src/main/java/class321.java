import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class321 {

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "B")
    public byte field4527 = 0;

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
    private int field4540 = 0;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public int field4528 = -1;

    @OriginalMember(owner = "client!fda", name = "t", descriptor = "I")
    private int field4546 = 0;

    @OriginalMember(owner = "client!fda", name = "q", descriptor = "Z")
    public boolean field4543 = false;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
    private int field4539 = 128;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
    private int field4541 = -1;

    @OriginalMember(owner = "client!fda", name = "u", descriptor = "I")
    private int field4547 = 0;

    @OriginalMember(owner = "client!fda", name = "x", descriptor = "I")
    private int field4550 = 128;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!fda", name = "r", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!fda", name = "w", descriptor = "I")
    private int field4549;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "Lrk;")
    public class33 field4532;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fda", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field4551;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "[S")
    private short[] field4537;

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "[S")
    private short[] field4542;

    @OriginalMember(owner = "client!fda", name = "s", descriptor = "[S")
    private short[] field4545;

    @OriginalMember(owner = "client!fda", name = "v", descriptor = "[S")
    private short[] field4548;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2036(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZIIIILs;IIILha;Ls;Lwg;I)Lka;", line = 15)
    public final class473 method2028(boolean arg0, int arg1, int arg2, int arg3, int arg4, class280 arg5, int arg6, int arg7, int arg8, class60 arg9, class280 arg10, class427 arg11, int arg12) {
        if (arg6 != -2574) {
            method2030(-85);
        }
        field4529++;
        return this.method2035(true, arg2, arg1, arg10, (byte) 2, arg4, arg12, arg7, arg9, arg5, arg8, arg11, arg3, arg0);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILrg;)V", line = 32)
    public final void method2029(int arg0, class645 arg1) {
        field4538++;
        int var3 = -69 % ((46 - arg0) / 35);
        while (true) {
            int var4 = arg1.method3745(-6314);
            if (var4 == 0) {
                return;
            }
            this.method2034(arg1, var4, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V", line = 53)
    public static final void method2030(int arg0) {
        field4544++;
        for (int var1 = 0; var1 < class107.field1497; var1++) {
            class247 var2 = class282.field4007[var1];
            if (var2.field3595 == 3) {
                if (var2.field3599 == null) {
                    var2.field3586 = Integer.MIN_VALUE;
                } else {
                    class171.field2666.method3834(var2.field3599);
                }
            }
        }
        if (arg0 < -18) {
            ;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lha;Lwg;IIIII)Lka;", line = 85)
    public final class473 method2031(class60 arg0, class427 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4533++;
        if (arg2 != 0) {
            this.field4546 = -38;
        }
        return this.method2035(true, arg3, 0, null, (byte) 5, arg4, arg6, 0, arg0, null, arg5, arg1, 0, false);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIILha;ILwg;I)Lka;", line = 101)
    public final class473 method2032(int arg0, int arg1, int arg2, class60 arg3, int arg4, class427 arg5, int arg6) {
        if (arg0 != 256) {
            this.field4528 = -66;
        }
        field4530++;
        return this.method2035(true, arg1, 0, null, (byte) 2, arg2, arg4, 0, arg3, null, arg6, arg5, 0, false);
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/io/File;IZ)V", line = 117)
    public static final void method2033(File arg0, int arg1, boolean arg2) {
        field4531++;
        if (class700.field9652 == null) {
            class602.method3496(-1);
        }
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            if (arg1 == 2) {
                Method var4 = var3.getDeclaredMethod("dumpHeap", field4551 == null ? (field4551 = method2036("java.lang.String")) : field4551, Boolean.TYPE);
                var4.invoke(class700.field9652, arg0.getAbsolutePath(), Boolean.valueOf(arg2));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lrg;IB)V", line = 151)
    private final void method2034(class645 arg0, int arg1, byte arg2) {
        field4535++;
        if (arg2 != 114) {
            method2030(3);
        }
        if (arg1 == 1) {
            this.field4549 = arg0.method3712((byte) -105);
        } else if (arg1 == 2) {
            this.field4528 = arg0.method3712((byte) 88);
        } else if (arg1 == 4) {
            this.field4550 = arg0.method3712((byte) 43);
        } else if (arg1 == 5) {
            this.field4539 = arg0.method3712((byte) -111);
        } else if (arg1 == 6) {
            this.field4540 = arg0.method3712((byte) -116);
        } else if (arg1 == 7) {
            this.field4547 = arg0.method3745(arg2 ^ 0xFFFFE724);
        } else if (arg1 == 8) {
            this.field4546 = arg0.method3745(-6314);
        } else if (arg1 == 9) {
            this.field4527 = 3;
            this.field4541 = 8224;
        } else if (arg1 == 10) {
            this.field4543 = true;
        } else if (arg1 == 11) {
            this.field4527 = 1;
        } else if (arg1 == 12) {
            this.field4527 = 4;
        } else if (arg1 == 13) {
            this.field4527 = 5;
        } else if (arg1 == 14) {
            this.field4527 = 2;
            this.field4541 = arg0.method3745(arg2 ^ 0xFFFFE724) * 256;
        } else if (arg1 == 15) {
            this.field4527 = 3;
            this.field4541 = arg0.method3712((byte) -108);
        } else if (arg1 == 16) {
            this.field4527 = 3;
            this.field4541 = arg0.method3720(-19541);
        } else if (arg1 == 40) {
            int var6 = arg0.method3745(-6314);
            this.field4548 = new short[var6];
            this.field4545 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4548[var7] = (short) arg0.method3712((byte) 17);
                this.field4545[var7] = (short) arg0.method3712((byte) -124);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method3745(-6314);
            this.field4537 = new short[var4];
            this.field4542 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4537[var5] = (short) arg0.method3712((byte) -13);
                this.field4542[var5] = (short) arg0.method3712((byte) 91);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZIILs;BIIILha;Ls;ILwg;IZ)Lka;", line = 277)
    private final class473 method2035(boolean arg0, int arg1, int arg2, class280 arg3, byte arg4, int arg5, int arg6, int arg7, class60 arg8, class280 arg9, int arg10, class427 arg11, int arg12, boolean arg13) {
        field4534++;
        int var15 = arg6;
        if (!arg0) {
            this.method2032(25, 56, -99, null, -31, null, -67);
        }
        class288 var16 = this.field4528 == -1 || arg10 == -1 ? null : arg11.method2663(0, this.field4528);
        boolean var17 = arg13 & this.field4527 != 0;
        if (var16 != null) {
            var15 = arg6 | var16.method1838(65535, arg10, false, arg1);
        }
        if (var17) {
            var15 |= this.field4527 == 3 ? 7 : 2;
        }
        if (this.field4539 != 128) {
            var15 |= 0x2;
        }
        if (this.field4550 != 128 || this.field4540 != 0) {
            var15 |= 0x5;
        }
        class106 var18 = this.field4532.field345;
        class473 var19;
        synchronized (this.field4532.field345) {
            var19 = (class473) this.field4532.field345.method803(121, (long) (this.field4536 |= arg8.field852 << 29));
        }
        if (var19 == null || arg8.method491(var19.method255(), var15) != 0) {
            if (var19 != null) {
                var15 = arg8.method490(var15, var19.method255());
            }
            int var20 = var15;
            if (this.field4548 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4537 != null) {
                var20 |= 0x8000;
            }
            class322 var21 = class342.method2175(this.field4532.field342, 0, this.field4549, (byte) -126);
            if (var21 == null) {
                return null;
            }
            if (var21.field4570 < 13) {
                var21.method2040(2, (byte) 120);
            }
            var19 = arg8.method418(var21, var20, this.field4532.field349, this.field4547 + 64, this.field4546 - -850);
            if (this.field4548 != null) {
                for (int var22 = 0; var22 < this.field4548.length; var22++) {
                    var19.method259(this.field4548[var22], this.field4545[var22]);
                }
            }
            if (this.field4537 != null) {
                for (int var23 = 0; var23 < this.field4537.length; var23++) {
                    var19.method254(this.field4537[var23], this.field4542[var23]);
                }
            }
            var19.method271(var15);
            class106 var24 = this.field4532.field345;
            synchronized (this.field4532.field345) {
                this.field4532.field345.method801(1, var19, (long) (this.field4536 |= arg8.field852 << 29));
            }
        }
        class473 var25 = var16 == null ? var19.method251(arg4, var15, true) : var16.method1836(arg1, arg4, arg5, 32, var15, var19, arg10, 0);
        if (this.field4550 != 128 || this.field4539 != 128) {
            var25.method286(this.field4550, this.field4539, this.field4550);
        }
        if (this.field4540 != 0) {
            if (this.field4540 == 90) {
                var25.method257(4096);
            }
            if (this.field4540 == 180) {
                var25.method257(8192);
            }
            if (this.field4540 == 270) {
                var25.method257(12288);
            }
        }
        if (var17) {
            var25.method270(this.field4527, this.field4541, arg3, arg9, arg12, arg2, arg7);
        }
        var25.method271(arg6);
        return var25;
    }
}
