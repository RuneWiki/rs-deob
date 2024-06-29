import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class372 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    private int field5702 = 0;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public int field5705 = -1;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    private int field5707 = 0;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    private int field5717 = 0;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "B")
    public byte field5721 = 0;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "Z")
    public boolean field5723 = false;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    private int field5709 = -1;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    private int field5716 = 128;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    private int field5726 = 128;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Lud;")
    public static class63 field5712 = new class63("WTQA", 2);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public int field5704;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    private int field5719;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lge;")
    public class13 field5706;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "[S")
    private short[] field5714;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "[S")
    private short[] field5715;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "[S")
    private short[] field5720;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "[S")
    private short[] field5725;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Laj;Lna;IIIIILna;IZZILqa;)Lc;", line = 3)
    public final class201 method2324(class300 arg0, class206 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class206 arg7, int arg8, boolean arg9, boolean arg10, int arg11, class496 arg12) {
        if (arg9) {
            this.method2326(null, false, -52, null, null, -58, false, 43, null, (byte) -35, 90, -119, -112, -92);
        }
        field5703++;
        return this.method2326(arg1, true, arg5, arg0, arg7, arg8, arg10, arg11, arg12, (byte) 2, arg3, arg2, arg6, arg4);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ[BIII)Z", line = 22)
    public static final boolean method2325(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field5713++;
        boolean var6 = arg1;
        class91 var7 = new class91(arg2);
        int var8 = -1;
        label56: while (true) {
            int var9 = var7.method581((byte) 55);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method598(false);
                    if (var13 == 0) {
                        continue label56;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method618((byte) 100) >> 2;
                    int var17 = arg3 + var15;
                    int var18 = arg0 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < arg5 - 1 && var18 < (arg4 - 1)) {
                        class130 var19 = class56.field755.method2031(124, var8);
                        if (var16 != 22 || class96.field1399.field5196 || var19.field1886 != 0 || var19.field1897 == 1 || var19.field1856) {
                            if (!var19.method838((byte) -98)) {
                                var6 = false;
                                class223.field3149++;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method598(false);
                if (var12 == 0) {
                    break;
                }
                var7.method618((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lna;ZILaj;Lna;IZILqa;BIIII)Lc;", line = 104)
    private final class201 method2326(class206 arg0, boolean arg1, int arg2, class300 arg3, class206 arg4, int arg5, boolean arg6, int arg7, class496 arg8, byte arg9, int arg10, int arg11, int arg12, int arg13) {
        field5711++;
        int var15 = arg13;
        class270 var16 = this.field5705 == -1 || arg7 == -1 ? null : arg3.method1934(121, this.field5705);
        boolean var17 = arg6 & this.field5721 != 0;
        if (var16 != null) {
            var15 = arg13 | var16.method1725((byte) -125, false, arg7, arg2);
        }
        if (var17) {
            var15 |= this.field5721 == 3 ? 7 : 2;
        }
        if (this.field5716 != 128) {
            var15 |= 0x2;
        }
        if (this.field5726 != 128 || this.field5702 != 0) {
            var15 |= 0x5;
        }
        class157 var18 = this.field5706.field218;
        class201 var19;
        synchronized (this.field5706.field218) {
            var19 = (class201) this.field5706.field218.method1013((long) (this.field5704 |= arg8.field7242 << 29), (byte) -106);
        }
        if (var19 == null || arg8.method1141(var19.method279(), var15) != 0) {
            if (var19 != null) {
                var15 = arg8.method1130(var15, var19.method279());
            }
            int var20 = var15;
            if (this.field5720 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field5714 != null) {
                var20 |= 0x8000;
            }
            class192 var21 = class143.method956(this.field5719, this.field5706.field213, 0, 22953);
            if (var21 == null) {
                return null;
            }
            if (var21.field2694 < 13) {
                var21.method1348(true, 0);
            }
            var19 = arg8.method1076(var21, var20, this.field5706.field219, this.field5707 + 64, this.field5717 + 850);
            if (this.field5720 != null) {
                for (int var22 = 0; var22 < this.field5720.length; var22++) {
                    var19.method276(this.field5720[var22], this.field5725[var22]);
                }
            }
            if (this.field5714 != null) {
                for (int var23 = 0; var23 < this.field5714.length; var23++) {
                    var19.method280(this.field5714[var23], this.field5715[var23]);
                }
            }
            var19.method297(var15);
            class157 var24 = this.field5706.field218;
            synchronized (this.field5706.field218) {
                this.field5706.field218.method1012(-122, (long) (this.field5704 |= arg8.field7242 << 29), var19);
            }
        }
        class201 var25 = var16 == null ? var19.method292(arg9, var15, true) : var16.method1728(var19, 0, arg5, arg2, 256, arg9, var15, arg7);
        if (this.field5726 != 128 || this.field5716 != 128) {
            var25.method277(this.field5726, this.field5716, this.field5726);
        }
        if (!arg1) {
            return null;
        }
        if (this.field5702 != 0) {
            if (this.field5702 == 90) {
                var25.method290(4096);
            }
            if (this.field5702 == 180) {
                var25.method290(8192);
            }
            if (this.field5702 == 270) {
                var25.method290(12288);
            }
        }
        if (var17) {
            var25.method305(this.field5721, this.field5709, arg4, arg0, arg11, arg12, arg10);
        }
        var25.method297(arg13);
        return var25;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 223)
    public static void method2327(int arg0) {
        field5712 = null;
        if (arg0 != -1) {
            field5708 = -17;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V", line = 238)
    public static final void method2328(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5718++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        class271.method1736(arg0 + arg1, arg2, arg1 - arg0, -11, class23.field356[arg3]);
        int var9 = 18 % ((arg4 + 61) / 56);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var10 = class23.field356[arg3 + var6];
                int[] var11 = class23.field356[arg3 - var6];
                int var12 = arg1 + var5;
                int var13 = arg1 - var5;
                class271.method1736(var12, arg2, var13, -11, var10);
                class271.method1736(var12, arg2, var13, -11, var11);
            }
            int var14 = arg1 + var6;
            int var15 = arg1 - var6;
            int[] var16 = class23.field356[arg3 + var5];
            int[] var17 = class23.field356[arg3 - var5];
            class271.method1736(var14, arg2, var15, -11, var16);
            class271.method1736(var14, arg2, var15, -11, var17);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ltl;II)V", line = 292)
    private final void method2329(class91 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field5719 = arg0.method631(10494);
        } else if (arg1 == 2) {
            this.field5705 = arg0.method631(10494);
        } else if (arg1 == 4) {
            this.field5726 = arg0.method631(10494);
        } else if (arg1 == 5) {
            this.field5716 = arg0.method631(10494);
        } else if (arg1 == 6) {
            this.field5702 = arg0.method631(10494);
        } else if (arg1 == 7) {
            this.field5707 = arg0.method618((byte) 100);
        } else if (arg1 == 8) {
            this.field5717 = arg0.method618((byte) 100);
        } else if (arg1 == 9) {
            this.field5721 = 3;
            this.field5709 = 8224;
        } else if (arg1 == 10) {
            this.field5723 = true;
        } else if (arg1 == 11) {
            this.field5721 = 1;
        } else if (arg1 == 12) {
            this.field5721 = 4;
        } else if (arg1 == 13) {
            this.field5721 = 5;
        } else if (arg1 == 14) {
            this.field5721 = 2;
            this.field5709 = arg0.method618((byte) 100) * 256;
        } else if (arg1 == 15) {
            this.field5721 = 3;
            this.field5709 = arg0.method631(10494);
        } else if (arg1 == 16) {
            this.field5721 = 3;
            this.field5709 = arg0.method626((byte) 100);
        } else if (arg1 == 40) {
            int var4 = arg0.method618((byte) 100);
            this.field5725 = new short[var4];
            this.field5720 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5720[var5] = (short) arg0.method631(class41.method323(arg2, 10494));
                this.field5725[var5] = (short) arg0.method631(10494);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method618((byte) 100);
            this.field5715 = new short[var6];
            this.field5714 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5714[var7] = (short) arg0.method631(10494);
                this.field5715[var7] = (short) arg0.method631(10494);
            }
        }
        if (arg2 == 0) {
            field5701++;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lqa;IBIIILaj;)Lc;", line = 428)
    public final class201 method2330(class496 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class300 arg6) {
        int var8 = -34 % ((10 - arg2) / 60);
        field5722++;
        return this.method2326(null, true, arg3, arg6, null, arg1, false, arg5, arg0, (byte) 5, 0, 0, 0, arg4);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIILqa;Laj;)Lc;", line = 443)
    public final class201 method2331(int arg0, int arg1, int arg2, int arg3, int arg4, class496 arg5, class300 arg6) {
        if (arg0 != 0) {
            this.method2331(-31, -58, 76, 9, -74, null, null);
        }
        field5710++;
        return this.method2326(null, true, arg1, arg6, null, arg4, false, arg2, arg5, (byte) 2, 0, 0, 0, arg3);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ltl;I)V", line = 464)
    public final void method2332(class91 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method618((byte) 100);
            if (var3 == 0) {
                field5724++;
                if (arg1 != 0) {
                    this.method2329(null, -47, 71);
                    return;
                }
                return;
            }
            this.method2329(arg0, var3, 0);
        }
    }
}
