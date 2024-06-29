import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class417 {

    @OriginalMember(owner = "client!du", name = "e", descriptor = "B")
    public byte field6127 = 0;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    private int field6125 = 128;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "Z")
    public boolean field6123 = false;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public int field6136 = -1;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "I")
    private int field6132 = 128;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    private int field6141 = 0;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    private int field6138 = -1;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    private int field6140 = 0;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "I")
    private int field6146 = 0;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public static int field6143 = 2;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public int field6128;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!du", name = "q", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    private int field6142;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "Lag;")
    public class211 field6133;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "[B")
    public static byte[] field6145;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "[S")
    private short[] field6134;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "[S")
    private short[] field6135;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "[S")
    private short[] field6144;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "[S")
    private short[] field6147;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILha;IIILrca;I)Lka;", line = 6)
    public final class282 method2560(int arg0, class544 arg1, int arg2, int arg3, int arg4, class368 arg5, int arg6) {
        field6130++;
        return arg2 == 0 ? this.method2561((byte) 2, false, null, arg5, arg6, arg2 ^ 0xFFFFFFFB, 0, null, arg3, arg4, 0, 0, arg0, arg1) : null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BZLs;Lrca;IIILs;IIIIILha;)Lka;", line = 20)
    private final class282 method2561(byte arg0, boolean arg1, class339 arg2, class368 arg3, int arg4, int arg5, int arg6, class339 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class544 arg13) {
        field6131++;
        int var15 = arg12;
        class82 var16 = this.field6136 == -1 || arg9 == -1 ? null : arg3.method2358((byte) 119, this.field6136);
        boolean var17 = arg1 & this.field6127 != 0;
        if (var16 != null) {
            var15 = arg12 | var16.method732(false, arg9, arg8, arg5 + 261);
        }
        if (var17) {
            var15 |= this.field6127 == 3 ? 7 : 2;
        }
        if (this.field6125 != 128) {
            var15 |= 0x2;
        }
        if (this.field6132 != 128 || this.field6140 != 0) {
            var15 |= 0x5;
        }
        class14 var18 = this.field6133.field3516;
        class282 var19;
        synchronized (this.field6133.field3516) {
            var19 = (class282) this.field6133.field3516.method80((byte) -68, (long) (this.field6128 |= arg13.field7769 << 29));
        }
        if (var19 == null || arg13.method351(var19.method1044(), var15) != 0) {
            if (var19 != null) {
                var15 = arg13.method273(var15, var19.method1044());
            }
            int var20 = var15;
            if (this.field6135 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field6144 != null) {
                var20 |= 0x8000;
            }
            class352 var21 = class357.method2284(this.field6133.field3506, this.field6142, 0, (byte) -119);
            if (var21 == null) {
                return null;
            }
            if (var21.field5193 < 13) {
                var21.method2235(114, 2);
            }
            var19 = arg13.method301(var21, var20, this.field6133.field3517, this.field6141 + 64, this.field6146 + 850);
            if (this.field6135 != null) {
                for (int var22 = 0; var22 < this.field6135.length; var22++) {
                    var19.method1018(this.field6135[var22], this.field6147[var22]);
                }
            }
            if (this.field6144 != null) {
                for (int var23 = 0; var23 < this.field6144.length; var23++) {
                    var19.method1029(this.field6144[var23], this.field6134[var23]);
                }
            }
            var19.method1014(var15);
            class14 var24 = this.field6133.field3516;
            synchronized (this.field6133.field3516) {
                this.field6133.field3516.method67((long) (this.field6128 |= arg13.field7769 << 29), var19, -6772);
            }
        }
        class282 var25 = var16 == null ? var19.method1025(arg0, var15, true) : var16.method735(arg0, 0, arg4, arg9, 65535, var15, var19, arg8);
        if (this.field6132 != 128 || this.field6125 != 128) {
            var25.method998(this.field6132, this.field6125, this.field6132);
        }
        if (this.field6140 != 0) {
            if (this.field6140 == 90) {
                var25.method1019(4096);
            }
            if (this.field6140 == 180) {
                var25.method1019(8192);
            }
            if (this.field6140 == 270) {
                var25.method1019(12288);
            }
        }
        if (arg5 != -5) {
            return null;
        }
        if (var17) {
            var25.method1030(this.field6127, this.field6138, arg2, arg7, arg10, arg6, arg11);
        }
        var25.method1014(arg12);
        return var25;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILofa;I)V", line = 137)
    private final void method2562(int arg0, class301 arg1, int arg2) {
        if (arg2 == 1) {
            this.field6142 = arg1.method1989((byte) -60);
        } else if (arg2 == 2) {
            this.field6136 = arg1.method1989((byte) -51);
        } else if (arg2 == 4) {
            this.field6132 = arg1.method1989((byte) -87);
        } else if (arg2 == 5) {
            this.field6125 = arg1.method1989((byte) -96);
        } else if (arg2 == 6) {
            this.field6140 = arg1.method1989((byte) -91);
        } else if (arg2 == 7) {
            this.field6141 = arg1.method1987(arg0 ^ 0xFFFFFFA7);
        } else if (arg2 == 8) {
            this.field6146 = arg1.method1987(-114);
        } else if (arg2 == 9) {
            this.field6138 = 8224;
            this.field6127 = 3;
        } else if (arg2 == 10) {
            this.field6123 = true;
        } else if (arg2 == 11) {
            this.field6127 = 1;
        } else if (arg2 == 12) {
            this.field6127 = 4;
        } else if (arg2 == 13) {
            this.field6127 = 5;
        } else if (arg2 == 14) {
            this.field6127 = 2;
            this.field6138 = arg1.method1987(-30) * 256;
        } else if (arg2 == 15) {
            this.field6127 = 3;
            this.field6138 = arg1.method1989((byte) -63);
        } else if (arg2 == 16) {
            this.field6127 = 3;
            this.field6138 = arg1.method1934(-2);
        } else if (arg2 == 40) {
            int var4 = arg1.method1987(-7);
            this.field6135 = new short[var4];
            this.field6147 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6135[var5] = (short) arg1.method1989((byte) -52);
                this.field6147[var5] = (short) arg1.method1989((byte) -121);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method1987(arg0 ^ 0xFFFFFF9E);
            this.field6134 = new short[var6];
            this.field6144 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field6144[var7] = (short) arg1.method1989((byte) -102);
                this.field6134[var7] = (short) arg1.method1989((byte) -49);
            }
        }
        if (arg0 != 6) {
            this.method2565(-34, 93, null, null, null, -116, false, -94, 103, 41, null, 65, (byte) -42);
        }
        field6124++;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lrca;IILha;III)Lka;", line = 263)
    public final class282 method2563(class368 arg0, int arg1, int arg2, class544 arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 0) {
            this.method2564(37, null);
        }
        field6137++;
        return this.method2561((byte) 5, false, null, arg0, arg2, -5, 0, null, arg1, arg5, 0, 0, arg6, arg3);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILofa;)V", line = 279)
    public final void method2564(int arg0, class301 arg1) {
        field6139++;
        if (arg0 != 0) {
            this.method2565(29, -90, null, null, null, 18, true, -68, -6, 122, null, 104, (byte) -6);
        }
        while (true) {
            int var3 = arg1.method1987(-71);
            if (var3 == 0) {
                return;
            }
            this.method2562(arg0 + 6, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(IILs;Lrca;Lha;IZIIILs;IB)Lka;", line = 300)
    public final class282 method2565(int arg0, int arg1, class339 arg2, class368 arg3, class544 arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, class339 arg10, int arg11, byte arg12) {
        if (arg12 != 2) {
            this.field6144 = null;
        }
        field6126++;
        return this.method2561((byte) 2, arg6, arg10, arg3, arg8, -5, arg11, arg2, arg0, arg5, arg1, arg7, arg9, arg4);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 311)
    public static void method2566(int arg0) {
        if (arg0 != -19383) {
            field6143 = 4;
        }
        field6145 = null;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BIZ)V", line = 349)
    public static final void method2567(byte arg0, int arg1, boolean arg2) {
        if (arg2) {
            class540 var3 = class257.method1732(true, class608.field8579, class655.field9332);
            var3.field7707.method1939(arg1, 1134947720);
            class756.method4211(var3, 118);
        } else {
            class464.method2851(class214.field3531, arg1, -1);
        }
        int var4 = 21 / ((arg0 + 50) / 56);
        field6129++;
    }
}
