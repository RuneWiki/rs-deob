import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class394 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public int field5596 = -1;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "Z")
    public boolean field5607 = false;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "I")
    private int field5604 = -1;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    private int field5597 = 128;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    private int field5601 = 0;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    private int field5595 = 128;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    private int field5602 = 0;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    private int field5617 = 0;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "B")
    public byte field5606 = 0;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "[S")
    public static short[] field5600 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "Lbd;")
    public static class44 field5599 = new class44("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "Ljava/lang/String;")
    public static String field5615 = null;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "Lkj;")
    public static class405 field5609 = new class405("", 17);

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    private int field5605;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public int field5612;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "Lol;")
    public class192 field5620;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "[S")
    private short[] field5610;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "[S")
    private short[] field5613;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "[S")
    private short[] field5616;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "[S")
    private short[] field5622;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BILwn;)V")
    private final void method2374(byte arg0, int arg1, class519 arg2) {
        field5598++;
        int var4 = 29 % ((arg0 + 2) / 46);
        if (arg1 == 1) {
            this.field5605 = arg2.method3018(566990904);
        } else if (arg1 == 2) {
            this.field5596 = arg2.method3018(566990904);
        } else if (arg1 == 4) {
            this.field5597 = arg2.method3018(566990904);
        } else if (arg1 == 5) {
            this.field5595 = arg2.method3018(566990904);
        } else if (arg1 == 6) {
            this.field5601 = arg2.method3018(566990904);
        } else if (arg1 == 7) {
            this.field5617 = arg2.method3072((byte) -121);
        } else if (arg1 == 8) {
            this.field5602 = arg2.method3072((byte) -124);
        } else if (arg1 == 9) {
            this.field5606 = 3;
            this.field5604 = 8224;
        } else if (arg1 == 10) {
            this.field5607 = true;
        } else if (arg1 == 11) {
            this.field5606 = 1;
        } else if (arg1 == 12) {
            this.field5606 = 4;
        } else if (arg1 == 13) {
            this.field5606 = 5;
        } else if (arg1 == 14) {
            this.field5606 = 2;
            this.field5604 = arg2.method3072((byte) -122) * 256;
        } else if (arg1 == 15) {
            this.field5606 = 3;
            this.field5604 = arg2.method3018(566990904);
        } else if (arg1 == 16) {
            this.field5606 = 3;
            this.field5604 = arg2.method3053(-129);
        } else if (arg1 == 40) {
            int var7 = arg2.method3072((byte) -124);
            this.field5622 = new short[var7];
            this.field5613 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5622[var8] = (short) arg2.method3018(566990904);
                this.field5613[var8] = (short) arg2.method3018(566990904);
            }
        } else if (arg1 == 41) {
            int var5 = arg2.method3072((byte) -120);
            this.field5610 = new short[var5];
            this.field5616 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field5610[var6] = (short) arg2.method3018(566990904);
                this.field5616[var6] = (short) arg2.method3018(566990904);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lwn;I)V")
    public final void method2375(class519 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3072((byte) -125);
            if (var3 == 0) {
                field5618++;
                if (arg1 != 0) {
                    this.field5596 = -2;
                    return;
                }
                return;
            }
            this.method2374((byte) 117, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIBZIIILgj;Lo;Lqa;Lo;I)Lka;")
    private final class336 method2376(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7, int arg8, class457 arg9, class24 arg10, class167 arg11, class24 arg12, int arg13) {
        field5619++;
        int var15 = arg1;
        class183 var16 = this.field5596 == -1 || arg3 == -1 ? null : arg9.method2717(-97, this.field5596);
        boolean var17 = arg5 & this.field5606 != 0;
        if (var16 != null) {
            var15 = arg1 | var16.method1273(arg3, arg2, 128, false);
        }
        if (var17) {
            var15 |= this.field5606 == 3 ? 7 : 2;
        }
        if (this.field5595 != 128) {
            var15 |= 0x2;
        }
        if (this.field5597 != 128 || this.field5601 != 0) {
            var15 |= 0x5;
        }
        class511 var18 = this.field5620.field2800;
        class336 var19;
        synchronized (this.field5620.field2800) {
            var19 = (class336) this.field5620.field2800.method2982(0, (long) (this.field5612 |= arg11.field2503 << 29));
        }
        if (var19 == null || arg11.method252(var19.method1166(), var15) != 0) {
            if (var19 != null) {
                var15 = arg11.method217(var15, var19.method1166());
            }
            int var20 = var15;
            if (this.field5622 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field5610 != null) {
                var20 |= 0x8000;
            }
            class330 var21 = class494.method2904(this.field5620.field2798, 0, this.field5605, -3808);
            if (var21 == null) {
                return null;
            }
            if (var21.field4843 < 13) {
                var21.method2082(102, 0);
            }
            var19 = arg11.method225(var21, var20, this.field5620.field2803, this.field5617 + 64, this.field5602 - -850);
            if (this.field5622 != null) {
                for (int var22 = 0; var22 < this.field5622.length; var22++) {
                    var19.method1163(this.field5622[var22], this.field5613[var22]);
                }
            }
            if (this.field5610 != null) {
                for (int var23 = 0; var23 < this.field5610.length; var23++) {
                    var19.method1138(this.field5610[var23], this.field5616[var23]);
                }
            }
            var19.method1133(var15);
            class511 var24 = this.field5620.field2800;
            synchronized (this.field5620.field2800) {
                this.field5620.field2800.method2981(var19, 103, (long) (this.field5612 |= arg11.field2503 << 29));
            }
        }
        if (arg6 >= -73) {
            this.field5601 = 124;
        }
        class336 var25 = var16 == null ? var19.method1154(arg4, var15, true) : var16.method1270(arg4, (byte) 3, arg3, 0, arg13, arg2, var19, var15);
        if (this.field5597 != 128 || this.field5595 != 128) {
            var25.method1156(this.field5597, this.field5595, this.field5597);
        }
        if (this.field5601 != 0) {
            if (this.field5601 == 90) {
                var25.method1151(4096);
            }
            if (this.field5601 == 180) {
                var25.method1151(8192);
            }
            if (this.field5601 == 270) {
                var25.method1151(12288);
            }
        }
        if (var17) {
            var25.method1165(this.field5606, this.field5604, arg10, arg12, arg8, arg0, arg7);
        }
        var25.method1133(arg1);
        return var25;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public static void method2377(int arg0) {
        field5599 = null;
        if (arg0 == 296431421) {
            field5615 = null;
            field5600 = null;
            field5609 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lqa;ILgj;IIII)Lka;")
    public final class336 method2378(class167 arg0, int arg1, class457 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -19750) {
            this.method2375(null, 103);
        }
        field5614++;
        return this.method2376(0, arg4, arg6, arg5, (byte) 2, false, -87, 0, 0, arg2, null, arg0, null, arg3);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIIILqa;Lo;Lgj;Lo;ZIII)Lka;")
    public final class336 method2379(int arg0, int arg1, int arg2, int arg3, int arg4, class167 arg5, class24 arg6, class457 arg7, class24 arg8, boolean arg9, int arg10, int arg11, int arg12) {
        if (arg2 != 0) {
            this.method2374((byte) 44, -47, null);
        }
        field5621++;
        return this.method2376(arg4, arg0, arg12, arg11, (byte) 2, arg9, -88, arg10, arg1, arg7, arg6, arg5, arg8, arg3);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lgj;IBLqa;III)Lka;")
    public final class336 method2380(class457 arg0, int arg1, byte arg2, class167 arg3, int arg4, int arg5, int arg6) {
        field5603++;
        int var8 = 121 / ((arg2 - 21) / 44);
        return this.method2376(0, arg1, arg5, arg6, (byte) 5, false, -110, 0, 0, arg0, null, arg3, null, arg4);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)Lhu;")
    public static final class88 method2381(byte arg0, int arg1) {
        field5611++;
        class88 var2 = (class88) class520.field7585.method997((byte) -127, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class464.field6744.method2037(0, (byte) 83, arg1);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class88 var4 = class342.method2165(-97, var3);
        if (arg0 > -31) {
            method2377(104);
        }
        class520.field7585.method998((byte) 88, (long) arg1, var4);
        return var4;
    }
}
