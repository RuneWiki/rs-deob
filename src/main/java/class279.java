import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class279 {

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    private int field4402 = 0;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    private int field4408 = 128;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    private int field4400 = 0;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    private int field4418 = 128;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "B")
    public byte field4397 = 0;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "Z")
    public boolean field4419 = false;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    private int field4417 = 0;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    private int field4416 = -1;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public int field4398 = -1;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Lqu;")
    public static class219 field4399 = new class219(31, 3);

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "[I")
    public static int[] field4424 = new int[2];

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "S")
    public static short field4426 = 1;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "Ltq;")
    public static class276 field4428 = new class276(5000);

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    private int field4410;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "Lgs;")
    public class294 field4414;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "[I")
    public static int[] field4422;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "[Lo;")
    public static class139[] field4413;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "[S")
    private short[] field4401;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "[S")
    private short[] field4404;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "[S")
    private short[] field4406;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "[S")
    private short[] field4409;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILya;Lfk;ILya;IIBLza;ZIIII)Le;")
    private final class536 method1871(int arg0, class223 arg1, class244 arg2, int arg3, class223 arg4, int arg5, int arg6, byte arg7, class497 arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        field4427++;
        if (arg10 != -14) {
            return null;
        }
        int var15 = arg12;
        class363 var16 = this.field4398 == -1 || arg11 == -1 ? null : arg2.method1703(this.field4398, -12536);
        boolean var17 = arg9 & this.field4397 != 0;
        if (var16 != null) {
            var15 = arg12 | var16.method2391(arg0, 256, arg11, false);
        }
        if (var17) {
            var15 |= this.field4397 == 3 ? 7 : 2;
        }
        if (this.field4418 != 128) {
            var15 |= 0x2;
        }
        if (this.field4408 != 128 || this.field4417 != 0) {
            var15 |= 0x5;
        }
        class328 var18 = this.field4414.field4645;
        class536 var19;
        synchronized (this.field4414.field4645) {
            var19 = (class536) this.field4414.field4645.method2191((byte) -73, (long) (this.field4407 |= arg8.field7472 << 29));
        }
        if (var19 == null || arg8.method1299(var19.method308(), var15) != 0) {
            if (var19 != null) {
                var15 = arg8.method1294(var15, var19.method308());
            }
            int var20 = var15;
            if (this.field4401 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4406 != null) {
                var20 |= 0x8000;
            }
            class438 var21 = class73.method534(false, this.field4414.field4631, this.field4410, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field6766 < 13) {
                var21.method2770(0, 0);
            }
            var19 = arg8.method1337(var21, var20, this.field4414.field4646, this.field4402 + 64, this.field4400 + 850);
            if (this.field4401 != null) {
                for (int var22 = 0; var22 < this.field4401.length; var22++) {
                    var19.method309(this.field4401[var22], this.field4404[var22]);
                }
            }
            if (this.field4406 != null) {
                for (int var23 = 0; var23 < this.field4406.length; var23++) {
                    var19.method273(this.field4406[var23], this.field4409[var23]);
                }
            }
            var19.method290(var15);
            class328 var24 = this.field4414.field4645;
            synchronized (this.field4414.field4645) {
                this.field4414.field4645.method2188(-127, (long) (this.field4407 |= arg8.field7472 << 29), var19);
            }
        }
        class536 var25 = var16 == null ? var19.method329(arg7, var15, true) : var16.method2390(0, arg7, arg11, (byte) -47, var19, arg0, arg3, var15);
        if (this.field4408 != 128 || this.field4418 != 128) {
            var25.method269(this.field4408, this.field4418, this.field4408);
        }
        if (this.field4417 != 0) {
            if (this.field4417 == 90) {
                var25.method280(4096);
            }
            if (this.field4417 == 180) {
                var25.method280(8192);
            }
            if (this.field4417 == 270) {
                var25.method280(12288);
            }
        }
        if (var17) {
            var25.method307(this.field4397, this.field4416, arg1, arg4, arg13, arg6, arg5);
        }
        var25.method290(arg12);
        return var25;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILza;ILya;Lfk;IIIIILya;IZ)Le;")
    public final class536 method1872(int arg0, class497 arg1, int arg2, class223 arg3, class244 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class223 arg10, int arg11, boolean arg12) {
        if (arg11 != 27968) {
            this.method1878(null, 21, 116, -92, (byte) 10, null, 27);
        }
        field4415++;
        return this.method1871(arg5, arg3, arg4, arg9, arg10, arg8, arg0, (byte) 2, arg1, arg12, arg11 ^ 0xFFFF92B2, arg7, arg2, arg6);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZZ)V")
    public static final void method1873(int arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            class50.field686++;
            class198.method1359(0);
        }
        if (arg0 != 25503) {
            method1873(-82, false, true);
        }
        field4425++;
        if (arg1) {
            class148.field2000++;
            class64.method471((byte) 77);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public static final void method1874(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field4403++;
        if (class422.field6406 == null) {
            return;
        }
        if (class422.field6406.field7458 == 1) {
            class422.field6406 = null;
            return;
        }
        if (class422.field6406.field7458 == 2) {
            class144.method869((byte) -90, class389.field5927, 2, class76.field1140);
            class422.field6406 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(JIZZLjava/lang/String;IILjava/lang/String;III)V")
    public static final void method1875(long arg0, int arg1, boolean arg2, boolean arg3, String arg4, int arg5, int arg6, String arg7, int arg8, int arg9, int arg10) {
        field4421++;
        if (class409.field6204 || class501.field7514 >= 500) {
            return;
        }
        int var12 = arg10 == -1 ? class436.field6587 : arg10;
        class140 var13 = new class140(arg7, arg4, var12, arg9, arg5, arg0, arg6, arg1, arg2, arg3);
        class392.field5958.method2124(var13, (byte) 110);
        if (arg8 > -35) {
            method1875(83L, 27, false, true, null, -11, 61, null, 112, 30, 70);
        }
        class501.field7514++;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public static void method1876(int arg0) {
        field4422 = null;
        field4424 = null;
        field4413 = null;
        field4399 = null;
        field4428 = null;
        int var1 = 14 % ((-arg0 - 20) / 43);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILhw;)V")
    private final void method1877(int arg0, int arg1, class208 arg2) {
        if (arg1 != 0) {
            field4424 = null;
        }
        field4420++;
        if (arg0 == 1) {
            this.field4410 = arg2.method1455(-3387);
        } else if (arg0 == 2) {
            this.field4398 = arg2.method1455(arg1 - 3387);
        } else if (arg0 == 4) {
            this.field4408 = arg2.method1455(-3387);
        } else if (arg0 == 5) {
            this.field4418 = arg2.method1455(arg1 - 3387);
        } else if (arg0 == 6) {
            this.field4417 = arg2.method1455(-3387);
        } else if (arg0 == 7) {
            this.field4402 = arg2.method1445(28);
        } else if (arg0 == 8) {
            this.field4400 = arg2.method1445(109);
        } else if (arg0 == 9) {
            this.field4416 = 8224;
            this.field4397 = 3;
        } else if (arg0 == 10) {
            this.field4419 = true;
        } else if (arg0 == 11) {
            this.field4397 = 1;
        } else if (arg0 == 12) {
            this.field4397 = 4;
        } else if (arg0 == 13) {
            this.field4397 = 5;
        } else if (arg0 == 14) {
            this.field4397 = 2;
            this.field4416 = arg2.method1445(-113) * 256;
        } else if (arg0 == 15) {
            this.field4397 = 3;
            this.field4416 = arg2.method1455(-3387);
            return;
        } else if (arg0 == 16) {
            this.field4397 = 3;
            this.field4416 = arg2.method1436((byte) 106);
            return;
        } else if (arg0 == 40) {
            int var4 = arg2.method1445(-115);
            this.field4404 = new short[var4];
            this.field4401 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4401[var5] = (short) arg2.method1455(arg1 - 3387);
                this.field4404[var5] = (short) arg2.method1455(class229.method1643(arg1, -3387));
            }
            return;
        } else if (arg0 == 41) {
            int var6 = arg2.method1445(-83);
            this.field4406 = new short[var6];
            this.field4409 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4406[var7] = (short) arg2.method1455(-3387);
                this.field4409[var7] = (short) arg2.method1455(-3387);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lza;IIIBLfk;I)Le;")
    public final class536 method1878(class497 arg0, int arg1, int arg2, int arg3, byte arg4, class244 arg5, int arg6) {
        if (arg4 != -38) {
            method1881(-54);
        }
        field4423++;
        return this.method1871(arg3, null, arg5, arg1, null, 0, 0, (byte) 2, arg0, false, -14, arg6, arg2, 0);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZLhw;)V")
    public final void method1879(boolean arg0, class208 arg1) {
        field4412++;
        while (true) {
            int var3 = arg1.method1445(69);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    field4422 = null;
                    return;
                }
            }
            this.method1877(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZLfk;IIILza;I)Le;")
    public final class536 method1880(boolean arg0, class244 arg1, int arg2, int arg3, int arg4, class497 arg5, int arg6) {
        field4405++;
        if (!arg0) {
            method1881(81);
        }
        return this.method1871(arg3, null, arg1, arg2, null, 0, 0, (byte) 5, arg5, false, -14, arg6, arg4, 0);
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
    public static final void method1881(int arg0) {
        field4411++;
        if (arg0 != -25125) {
            method1874(-71);
        }
        if (class2.field29.toLowerCase().indexOf("microsoft") != -1) {
            class280.field4436[221] = 43;
            class280.field4436[188] = 71;
            class280.field4436[189] = 26;
            class280.field4436[220] = 74;
            class280.field4436[192] = 58;
            class280.field4436[222] = 59;
            class280.field4436[219] = 42;
            class280.field4436[223] = 28;
            class280.field4436[191] = 73;
            class280.field4436[187] = 27;
            class280.field4436[186] = 57;
            class280.field4436[190] = 72;
            return;
        }
        class280.field4436[47] = 73;
        class280.field4436[44] = 71;
        class280.field4436[91] = 42;
        class280.field4436[46] = 72;
        class280.field4436[45] = 26;
        class280.field4436[92] = 74;
        class280.field4436[61] = 27;
        if (class2.field34 == null) {
            class280.field4436[192] = 58;
            class280.field4436[222] = 59;
        } else {
            class280.field4436[520] = 59;
            class280.field4436[222] = 58;
            class280.field4436[192] = 28;
        }
        class280.field4436[93] = 43;
        class280.field4436[59] = 57;
    }
}
