import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class278 {

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public int field4040 = -1;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    private int field4056 = -1;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    private int field4055 = 128;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Z")
    public boolean field4042 = false;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    private int field4052 = 0;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    private int field4047 = 0;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    private int field4064 = 128;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    private int field4060 = 0;

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "B")
    public byte field4059 = 0;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "Lbu;")
    public static class21 field4053 = new class21(102, 10);

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field4045;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    private int field4057;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "J")
    public static long field4039;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Lll;")
    public class384 field4051;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[S")
    private short[] field4046;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "[S")
    private short[] field4049;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "[S")
    private short[] field4058;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "[S")
    private short[] field4061;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[B)Z", line = 12)
    public static final boolean method1808(int arg0, byte[] arg1) {
        field4063++;
        class494 var2 = new class494(arg1);
        int var3 = var2.method2964((byte) 109);
        if (var3 != 2) {
            return false;
        } else if (arg0 == 16) {
            boolean var4 = var2.method2964((byte) 52) == 1;
            if (var4) {
                class4.method28(var2, (byte) 80);
            }
            class706.method3994(-65536, var2);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 39)
    public static void method1809(byte arg0) {
        if (arg0 >= 52) {
            field4053 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILso;I)V", line = 54)
    private final void method1810(int arg0, class494 arg1, int arg2) {
        field4050++;
        if (arg0 == 1) {
            this.field4057 = arg1.method2998(true);
        } else if (arg0 == 2) {
            this.field4040 = arg1.method2998(true);
        } else if (arg0 == 4) {
            this.field4064 = arg1.method2998(true);
        } else if (arg0 == 5) {
            this.field4055 = arg1.method2998(true);
        } else if (arg0 == 6) {
            this.field4052 = arg1.method2998(true);
        } else if (arg0 == 7) {
            this.field4060 = arg1.method2964((byte) 107);
        } else if (arg0 == 8) {
            this.field4047 = arg1.method2964((byte) 109);
        } else if (arg0 == 9) {
            this.field4056 = 8224;
            this.field4059 = 3;
        } else if (arg0 == 10) {
            this.field4042 = true;
        } else if (arg0 == 11) {
            this.field4059 = 1;
        } else if (arg0 == 12) {
            this.field4059 = 4;
        } else if (arg0 == 13) {
            this.field4059 = 5;
        } else if (arg0 == 14) {
            this.field4059 = 2;
            this.field4056 = arg1.method2964((byte) 116) * 256;
        } else if (arg0 == 15) {
            this.field4059 = 3;
            this.field4056 = arg1.method2998(true);
        } else if (arg0 == 16) {
            this.field4059 = 3;
            this.field4056 = arg1.method2976(-125);
        } else if (arg0 == 40) {
            int var6 = arg1.method2964((byte) 115);
            this.field4058 = new short[var6];
            this.field4061 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4058[var7] = (short) arg1.method2998(true);
                this.field4061[var7] = (short) arg1.method2998(true);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method2964((byte) 93);
            this.field4049 = new short[var4];
            this.field4046 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4046[var5] = (short) arg1.method2998(true);
                this.field4049[var5] = (short) arg1.method2998(true);
            }
        }
        if (arg2 != -9) {
            method1814(null, 54);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILs;IBZLha;ILs;ILjv;IIII)Lka;", line = 177)
    private final class496 method1811(int arg0, class294 arg1, int arg2, byte arg3, boolean arg4, class65 arg5, int arg6, class294 arg7, int arg8, class86 arg9, int arg10, int arg11, int arg12, int arg13) {
        field4044++;
        int var15 = arg11;
        class607 var16 = this.field4040 == -1 || arg10 == -1 ? null : arg9.method651(this.field4040, (byte) 105);
        boolean var17 = arg4 & this.field4059 != 0;
        if (var16 != null) {
            var15 = arg11 | var16.method3526(arg6, false, 16775, arg10);
        }
        if (var17) {
            var15 |= this.field4059 == 3 ? 7 : 2;
        }
        if (this.field4055 != 128) {
            var15 |= 0x2;
        }
        if (arg8 != -4073) {
            return null;
        }
        if (this.field4064 != 128 || this.field4052 != 0) {
            var15 |= 0x5;
        }
        class652 var18 = this.field4051.field5289;
        class496 var19;
        synchronized (this.field4051.field5289) {
            var19 = (class496) this.field4051.field5289.method3742((byte) 67, (long) (this.field4045 |= arg5.field784 << 29));
        }
        if (var19 == null || arg5.method512(var19.method68(), var15) != 0) {
            if (var19 != null) {
                var15 = arg5.method542(var15, var19.method68());
            }
            int var20 = var15;
            if (this.field4058 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field4046 != null) {
                var20 |= 0x8000;
            }
            class100 var21 = class488.method2912(this.field4051.field5280, (byte) 32, this.field4057, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field1150 < 13) {
                var21.method715((byte) 98, 2);
            }
            var19 = arg5.method480(var21, var20, this.field4051.field5291, this.field4060 + 64, this.field4047 - -850);
            if (this.field4058 != null) {
                for (int var22 = 0; var22 < this.field4058.length; var22++) {
                    var19.method91(this.field4058[var22], this.field4061[var22]);
                }
            }
            if (this.field4046 != null) {
                for (int var23 = 0; var23 < this.field4046.length; var23++) {
                    var19.method81(this.field4046[var23], this.field4049[var23]);
                }
            }
            var19.method111(var15);
            class652 var24 = this.field4051.field5289;
            synchronized (this.field4051.field5289) {
                this.field4051.field5289.method3739((long) (this.field4045 |= arg5.field784 << 29), (byte) 81, var19);
            }
        }
        class496 var25 = var16 == null ? var19.method93(arg3, var15, true) : var16.method3522(var19, arg3, var15, (byte) 125, arg13, arg10, arg6, 0);
        if (this.field4064 != 128 || this.field4055 != 128) {
            var25.method84(this.field4064, this.field4055, this.field4064);
        }
        if (this.field4052 != 0) {
            if (this.field4052 == 90) {
                var25.method92(4096);
            }
            if (this.field4052 == 180) {
                var25.method92(8192);
            }
            if (this.field4052 == 270) {
                var25.method92(12288);
            }
        }
        if (var17) {
            var25.method96(this.field4059, this.field4056, arg7, arg1, arg12, arg0, arg2);
        }
        var25.method111(arg11);
        return var25;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lne;I)Z", line = 294)
    public static final boolean method1812(class336 arg0, int arg1) {
        field4062++;
        if (arg1 != -139215363) {
            field4039 = 13L;
        }
        return class211.field3264 == arg0 || class394.field5419 == arg0 || class189.field2913 == arg0 || class57.field721 == arg0 || class161.field2549 == arg0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Z", line = 307)
    public static final boolean method1813(int arg0, int arg1) {
        int var2 = -100 % ((-arg1 - 51) / 49);
        field4041++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lso;I)Lwd;", line = 344)
    public static final class287 method1814(class494 arg0, int arg1) {
        if (arg1 != 12) {
            field4039 = -122L;
        }
        field4065++;
        class706 var2 = class259.method1689((byte) 4, arg0);
        int var3 = arg0.method2976(-124);
        int var4 = arg0.method2976(-124);
        return new class287(var2.field9843, var2.field9845, var2.field9838, var2.field9832, var2.field9833, var2.field9837, var2.field9834, var2.field9840, var2.field9835, var3, var4);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljv;IIIIBLha;)Lka;", line = 367)
    public final class496 method1815(class86 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class65 arg6) {
        field4066++;
        if (arg5 != -45) {
            this.field4052 = -107;
        }
        return this.method1811(0, null, 0, (byte) 2, false, arg6, arg1, null, arg5 ^ 0xFC4, arg0, arg2, arg3, 0, arg4);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILso;)V", line = 383)
    public final void method1816(int arg0, class494 arg1) {
        while (true) {
            int var3 = arg1.method2964((byte) 117);
            if (var3 == 0) {
                field4043++;
                if (arg0 != -13079) {
                    method1812(null, -105);
                    return;
                }
                return;
            }
            this.method1810(var3, arg1, -9);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIILjv;ZBILha;)Lka;", line = 404)
    public final class496 method1817(int arg0, int arg1, int arg2, class86 arg3, boolean arg4, byte arg5, int arg6, class65 arg7) {
        if (arg4) {
            field4054++;
            return this.method1811(0, null, 0, arg5, false, arg7, arg2, null, -4073, arg3, arg1, arg0, 0, arg6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljv;Lha;Ls;IIIILs;IIZII)Lka;", line = 415)
    public final class496 method1818(class86 arg0, class65 arg1, class294 arg2, int arg3, int arg4, int arg5, int arg6, class294 arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12) {
        if (arg12 == -9) {
            field4048++;
            return this.method1811(arg4, arg7, arg5, (byte) 2, arg10, arg1, arg6, arg2, -4073, arg0, arg11, arg9, arg8, arg3);
        } else {
            return null;
        }
    }
}
