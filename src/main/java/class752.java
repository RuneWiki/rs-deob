import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class752 {

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "Z")
    public boolean field10443 = false;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public int field10449 = -1;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    private int field10452 = 128;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "B")
    public byte field10445 = 0;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    private int field10448 = 0;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    private int field10453 = 128;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    private int field10455 = 0;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    private int field10456 = 0;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    private int field10460 = -1;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field10446;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field10457;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    private int field10459;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public int field10461;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field10462;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    public static int field10463;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
    public static int field10465;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "Lls;")
    public class138 field10454;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "[S")
    private short[] field10447;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "[S")
    private short[] field10450;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "[S")
    private short[] field10464;

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "[S")
    private short[] field10466;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjk;Lha;IIIB)Lka;", line = 9)
    public final class471 method4180(int arg0, class633 arg1, class58 arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var8 = 78 % ((arg6 - 9) / 54);
        field10465++;
        return this.method4184(arg4, 0, arg3, 0, (byte) 5, arg0, arg2, 0, false, 748, arg1, null, arg5, null);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILee;)V", line = 22)
    public final void method4181(int arg0, class675 arg1) {
        while (true) {
            int var3 = arg1.method3750((byte) 35);
            if (var3 == 0) {
                field10446++;
                int var4 = -3 / ((arg0 + 34) / 40);
                return;
            }
            this.method4183(arg1, var3, true);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B[[BLql;)V", line = 58)
    public static final void method4182(byte arg0, byte[][] arg1, class735 arg2) {
        field10444++;
        int var3 = 9 / ((26 - arg0) / 49);
        int[] var4 = new int[] { -1, 0, 0, 0, 0 };
        int var5 = arg1.length;
        for (int var6 = 0; var6 < var5; var6++) {
            byte[] var11 = arg1[var6];
            if (var11 != null) {
                class675 var12 = new class675(var11);
                int var13 = class207.field2720[var6] >> 8;
                int var14 = class207.field2720[var6] & 0xFF;
                int var15 = var13 * 64 - class228.field3063;
                int var16 = var14 * 64 - class3.field30;
                class485.method2904((byte) 78);
                arg2.method2680(var12, var16, var15, 0, class3.field30, class147.field2114, class228.field3063);
                arg2.method4114(var12, -122, var4, class268.field3831, var16, var15);
                if (!arg2.field6356 && (class186.field2513 / 8) == var13 && class557.field7832 / 8 == var14 && var4[0] != -1) {
                    class745.field10351 = class192.field2556.method1979(var4[1], 4, class6.field64, var4[2], var4[3], var4[0]);
                    class175.field2360 = var4[4];
                }
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = (class207.field2720[var7] >> 8) * 64 - class228.field3063;
            int var9 = (class207.field2720[var7] & 0xFF) * 64 - class3.field30;
            byte[] var10 = arg1[var7];
            if (var10 == null && class557.field7832 < 800) {
                class485.method2904((byte) 119);
                arg2.method2687(var9, 64, var8, 64, (byte) 116);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lee;IZ)V", line = 137)
    private final void method4183(class675 arg0, int arg1, boolean arg2) {
        if (arg1 == 1) {
            this.field10459 = arg0.method3757((byte) -65);
        } else if (arg1 == 2) {
            this.field10449 = arg0.method3757((byte) -65);
        } else if (arg1 == 4) {
            this.field10453 = arg0.method3757((byte) -65);
        } else if (arg1 == 5) {
            this.field10452 = arg0.method3757((byte) -65);
        } else if (arg1 == 6) {
            this.field10455 = arg0.method3757((byte) -65);
        } else if (arg1 == 7) {
            this.field10448 = arg0.method3750((byte) 35);
        } else if (arg1 == 8) {
            this.field10456 = arg0.method3750((byte) 35);
        } else if (arg1 == 9) {
            this.field10460 = 8224;
            this.field10445 = 3;
        } else if (arg1 == 10) {
            this.field10443 = true;
        } else if (arg1 == 11) {
            this.field10445 = 1;
        } else if (arg1 == 12) {
            this.field10445 = 4;
        } else if (arg1 == 13) {
            this.field10445 = 5;
        } else if (arg1 == 14) {
            this.field10445 = 2;
            this.field10460 = arg0.method3750((byte) 35) * 256;
        } else if (arg1 == 15) {
            this.field10445 = 3;
            this.field10460 = arg0.method3757((byte) -65);
        } else if (arg1 == 16) {
            this.field10445 = 3;
            this.field10460 = arg0.method3703(126);
        } else if (arg1 == 40) {
            int var6 = arg0.method3750((byte) 35);
            this.field10464 = new short[var6];
            this.field10450 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field10464[var7] = (short) arg0.method3757((byte) -65);
                this.field10450[var7] = (short) arg0.method3757((byte) -65);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method3750((byte) 35);
            this.field10466 = new short[var4];
            this.field10447 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field10466[var5] = (short) arg0.method3757((byte) -65);
                this.field10447[var5] = (short) arg0.method3757((byte) -65);
            }
        }
        if (arg2) {
            field10463++;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIBILha;IZILjk;Ls;ILs;)Lka;", line = 265)
    private final class471 method4184(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class58 arg6, int arg7, boolean arg8, int arg9, class633 arg10, class278 arg11, int arg12, class278 arg13) {
        field10462++;
        int var15 = arg2;
        class709 var16 = this.field10449 == -1 || arg5 == -1 ? null : arg10.method3525(this.field10449, (byte) 87);
        boolean var17 = arg8 & this.field10445 != 0;
        if (var16 != null) {
            var15 = arg2 | var16.method3980(arg12, arg9 + 276, false, arg5);
        }
        if (var17) {
            var15 |= this.field10445 == 3 ? 7 : 2;
        }
        if (this.field10452 != 128) {
            var15 |= 0x2;
        }
        if (this.field10453 != 128 || this.field10455 != 0) {
            var15 |= 0x5;
        }
        class714 var18 = this.field10454.field2001;
        class471 var19;
        synchronized (this.field10454.field2001) {
            var19 = (class471) this.field10454.field2001.method4022((long) (this.field10461 |= arg6.field700 << 29), (byte) 82);
            if (arg9 != 748) {
                this.method4185(null, (byte) -44, 87, -17, -10, -8, null);
            }
        }
        if (var19 == null || arg6.method466(var19.method228(), var15) != 0) {
            if (var19 != null) {
                var15 = arg6.method479(var15, var19.method228());
            }
            int var20 = var15;
            if (this.field10464 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field10466 != null) {
                var20 |= 0x8000;
            }
            class6 var21 = class393.method2470(0, this.field10454.field1994, this.field10459, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field62 < 13) {
                var21.method33(2, true);
            }
            var19 = arg6.method397(var21, var20, this.field10454.field2005, this.field10448 + 64, this.field10456 + 850);
            if (this.field10464 != null) {
                for (int var22 = 0; var22 < this.field10464.length; var22++) {
                    var19.method261(this.field10464[var22], this.field10450[var22]);
                }
            }
            if (this.field10466 != null) {
                for (int var23 = 0; var23 < this.field10466.length; var23++) {
                    var19.method255(this.field10466[var23], this.field10447[var23]);
                }
            }
            var19.method242(var15);
            class714 var24 = this.field10454.field2001;
            synchronized (this.field10454.field2001) {
                this.field10454.field2001.method4018((byte) 127, var19, (long) (this.field10461 |= arg6.field700 << 29));
            }
        }
        class471 var25 = var16 == null ? var19.method226(arg4, var15, true) : var16.method3974(arg4, var15, arg9 - 492, arg5, arg0, var19, 0, arg12);
        if (this.field10453 != 128 || this.field10452 != 128) {
            var25.method258(this.field10453, this.field10452, this.field10453);
        }
        if (this.field10455 != 0) {
            if (this.field10455 == 90) {
                var25.method231(4096);
            }
            if (this.field10455 == 180) {
                var25.method231(8192);
            }
            if (this.field10455 == 270) {
                var25.method231(12288);
            }
        }
        if (var17) {
            var25.method244(this.field10445, this.field10460, arg11, arg13, arg7, arg3, arg1);
        }
        var25.method242(arg2);
        return var25;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lha;BIIIILjk;)Lka;", line = 391)
    public final class471 method4185(class58 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class633 arg6) {
        field10451++;
        if (arg1 != 6) {
            this.field10466 = null;
        }
        return this.method4184(arg4, 0, arg5, 0, (byte) 2, arg3, arg0, 0, false, 748, arg6, null, arg2, null);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIB)I", line = 411)
    public static final int method4186(int arg0, int arg1, byte arg2) {
        field10458++;
        if (class94.field1104 == -1) {
            return 1;
        }
        if (class557.field7812.field6521.method2556(false) != arg1) {
            class615.method3441(class71.field909.method588((byte) 109, class549.field7669), arg1, (byte) -60, true);
            if (arg1 != class557.field7812.field6521.method2556(false)) {
                return -1;
            }
        }
        try {
            Dimension var3 = class366.field5196.getSize();
            class660.method3621(class455.field6428, class71.field909.method588((byte) 90, class549.field7669), true, -31, class478.field6780, class268.field3831);
            class6 var4 = class393.method2470(0, class626.field8695, class94.field1104, 0);
            long var5 = class479.method2864((byte) -85);
            class268.field3831.method424();
            class631.field8724.method339(0, class197.field2617, 0);
            class268.field3831.method483(class631.field8724);
            class268.field3831.method391(var3.width / 2, var3.height / 2, 512, 512);
            class268.field3831.method406(1.0F);
            class268.field3831.method390(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class471 var7 = class268.field3831.method397(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class268.field3831.method429(0);
                class268.field3831.method440();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class542.field7576.method339((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class586.field8250), 0, (var10 + 1) * class586.field8250);
                        var8++;
                        var7.method221(class542.field7576, null, 0);
                        if ((class479.method2864((byte) -60) - var5) >= ((long) arg0)) {
                            break label45;
                        }
                    }
                }
            }
            class268.field3831.method481();
            long var12 = (long) (var8 * 1000) / (class479.method2864((byte) -82) - var5);
            class268.field3831.method429(0);
            if (arg2 == 83) {
                class268.field3831.method440();
                return (int) var12;
            } else {
                return -124;
            }
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ls;IBIILha;IZLjk;ILs;II)Lka;", line = 494)
    public final class471 method4187(class278 arg0, int arg1, byte arg2, int arg3, int arg4, class58 arg5, int arg6, boolean arg7, class633 arg8, int arg9, class278 arg10, int arg11, int arg12) {
        field10457++;
        int var14 = -120 % ((arg2 - 16) / 52);
        return this.method4184(arg11, arg9, arg6, arg1, (byte) 2, arg4, arg5, arg12, arg7, 748, arg8, arg10, arg3, arg0);
    }
}
