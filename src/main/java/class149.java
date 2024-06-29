import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class149 {

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public int field2301 = -1;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public int field2297 = 128;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Z")
    public boolean field2303 = true;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    private int field2309 = 0;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public static int field2302 = 0;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "Luf;")
    public static class168 field2298 = class148.method1019(-1720, ")4a=");

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "Luf;")
    public static class168 field2310 = class148.method1019(-1720, ")2");

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public int field2305;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public int field2306;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V", line = 4)
    private final void method1022(int arg0, boolean arg1) {
        field2307++;
        double var3 = (double) (arg0 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF96AC) >> 16) / 256.0D;
        double var7 = 0.0D;
        double var9 = var5;
        double var11 = 0.0D;
        double var13 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var15 = var5;
        if (var13 > var5) {
            var15 = var13;
        }
        if (var5 > var13) {
            var9 = var13;
        }
        if (var3 < var9) {
            var9 = var3;
        }
        if (var15 < var3) {
            var15 = var3;
        }
        double var17 = (var9 + var15) / 2.0D;
        if (!arg1) {
            this.field2309 = -74;
        }
        if (var9 != var15) {
            if (var5 == var15) {
                var7 = (var13 - var3) / (var15 - var9);
            } else if (var13 == var15) {
                var7 = (var3 - var5) / (var15 - var9) + 2.0D;
            } else if (var3 == var15) {
                var7 = (var5 - var13) / (var15 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var11 = (var15 - var9) / (var9 + var15);
            }
            if (var17 >= 0.5D) {
                var11 = (var15 - var9) / (2.0D - var15 - var9);
            }
        }
        this.field2306 = (int) (var17 * 256.0D);
        this.field2312 = (int) (var11 * 256.0D);
        if (var17 > 0.5D) {
            this.field2305 = (int) ((1.0D - var17) * var11 * 512.0D);
        } else {
            this.field2305 = (int) (var11 * var17 * 512.0D);
        }
        if (this.field2305 < 1) {
            this.field2305 = 1;
        }
        double var19 = var7 / 6.0D;
        if (this.field2312 < 0) {
            this.field2312 = 0;
        } else if (this.field2312 > 255) {
            this.field2312 = 255;
        }
        this.field2308 = (int) ((double) this.field2305 * var19);
        if (this.field2306 < 0) {
            this.field2306 = 0;
        } else if (this.field2306 > 255) {
            this.field2306 = 255;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILj;I)V", line = 95)
    public final void method1023(int arg0, class153 arg1, int arg2) {
        if (arg2 != -2) {
            this.method1022(86, true);
        }
        while (true) {
            int var4 = arg1.method1042((byte) 118);
            if (var4 == 0) {
                field2313++;
                return;
            }
            this.method1030(-2486, arg0, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IFIIIIZI)[I", line = 120)
    public static final int[] method1024(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field2311++;
        int[] var8 = new int[arg0];
        class52 var9 = new class52();
        var9.field647 = arg2;
        var9.field644 = arg4;
        var9.field649 = arg7;
        var9.field645 = arg6;
        var9.field630 = arg5;
        var9.field642 = (int) (arg1 * 4096.0F);
        var9.method80(false);
        class241.method1658(1, arg0, (byte) 97);
        var9.method290(var8, arg3 - 86, arg3);
        return var8;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB)I", line = 142)
    public static final int method1025(int arg0, int arg1, byte arg2) {
        field2296++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else if (arg2 == -24) {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIJ)Z", line = 179)
    public static final boolean method1026(int arg0, int arg1, int arg2, long arg3) {
        class127 var5 = class92.field1424[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1981 != null && var5.field1981.field363 == arg3) {
            return true;
        } else if (var5.field1979 != null && var5.field1979.field497 == arg3) {
            return true;
        } else if (var5.field1969 != null && var5.field1969.field4926 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1970; var6++) {
                if (var5.field1971[var6].field1407 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 217)
    public static void method1027(byte arg0) {
        field2310 = null;
        field2298 = null;
        if (arg0 <= 81) {
            field2298 = (class168) null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILg;Z)V", line = 229)
    public static final void method1028(int arg0, class242 arg1, boolean arg2) {
        field2300++;
        int var3 = arg1.field4105 == 0 ? arg1.field3989 : arg1.field4105;
        int var4 = -116 % ((arg0 + 50) / 57);
        int var5 = arg1.field4007 == 0 ? arg1.field4057 : arg1.field4007;
        class218.method1509(class272.field4582[arg1.field3996 >> 16], arg2, var3, 0, var5, arg1.field3996);
        if (arg1.field4004 != null) {
            class218.method1509(arg1.field4004, arg2, var3, 0, var5, arg1.field3996);
        }
        class240 var6 = (class240) class26.field319.method493((long) arg1.field3996, 121);
        if (var6 != null) {
            class136.method949(arg2, var5, -103, var6.field3898, var3);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V", line = 259)
    public static final void method1029(byte arg0) {
        if (arg0 != -100) {
            field2298 = (class168) null;
        }
        class71.field951.method1429((byte) 120);
        field2299++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILj;)V", line = 276)
    private final void method1030(int arg0, int arg1, int arg2, class153 arg3) {
        if (arg0 != -2486) {
            return;
        }
        if (arg2 == 1) {
            this.field2309 = arg3.method1088(-30917);
            this.method1022(this.field2309, true);
        } else if (arg2 == 2) {
            this.field2301 = arg3.method1069(arg0 ^ 0xFFFFF677);
            if (this.field2301 == 65535) {
                this.field2301 = -1;
            }
        } else if (arg2 == 3) {
            this.field2297 = arg3.method1069(111);
        } else if (arg2 == 4) {
            this.field2303 = false;
        }
        field2304++;
    }
}
