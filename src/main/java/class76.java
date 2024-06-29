import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class76 {

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    private int field958 = 128;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    private int field961 = 0;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    private int field968 = 0;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    private int field966 = 128;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "Z")
    public boolean field964 = false;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    private int field953 = -1;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public int field969 = -1;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    private int field973 = 0;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "B")
    public byte field974 = 0;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "[Z")
    public static boolean[] field967 = new boolean[100];

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[Lmv;")
    public static class518[] field952 = new class518[2048];

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "[I")
    public static int[] field960 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "[I")
    public static int[] field975 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "S")
    public static short field978 = 32767;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public int field951;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    private int field977;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Lgv;")
    public class235 field962;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "[S")
    private short[] field954;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "[S")
    private short[] field959;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "[S")
    private short[] field965;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "[S")
    private short[] field971;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 4)
    public static void method434(byte arg0) {
        field967 = null;
        field975 = null;
        if (arg0 != 4) {
            method434((byte) 77);
        }
        field960 = null;
        field952 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lbt;BI)V", line = 25)
    private final void method435(class88 arg0, byte arg1, int arg2) {
        int var4 = -67 % ((12 - arg1) / 51);
        field963++;
        if (arg2 == 1) {
            this.field977 = arg0.method568((byte) 110);
        } else if (arg2 == 2) {
            this.field969 = arg0.method568((byte) 110);
        } else if (arg2 == 4) {
            this.field958 = arg0.method568((byte) 110);
        } else if (arg2 == 5) {
            this.field966 = arg0.method568((byte) 110);
        } else if (arg2 == 6) {
            this.field973 = arg0.method568((byte) 110);
        } else if (arg2 == 7) {
            this.field968 = arg0.method617(2);
        } else if (arg2 == 8) {
            this.field961 = arg0.method617(2);
        } else if (arg2 == 9) {
            this.field953 = 8224;
            this.field974 = 3;
        } else if (arg2 == 10) {
            this.field964 = true;
        } else if (arg2 == 11) {
            this.field974 = 1;
        } else if (arg2 == 12) {
            this.field974 = 4;
        } else if (arg2 == 13) {
            this.field974 = 5;
        } else if (arg2 == 14) {
            this.field974 = 2;
            this.field953 = arg0.method617(2) * 256;
        } else if (arg2 == 15) {
            this.field974 = 3;
            this.field953 = arg0.method568((byte) 110);
        } else if (arg2 == 16) {
            this.field974 = 3;
            this.field953 = arg0.method578(108);
        } else if (arg2 == 40) {
            int var7 = arg0.method617(2);
            this.field965 = new short[var7];
            this.field959 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field965[var8] = (short) arg0.method568((byte) 110);
                this.field959[var8] = (short) arg0.method568((byte) 110);
            }
        } else if (arg2 == 41) {
            int var5 = arg0.method617(2);
            this.field971 = new short[var5];
            this.field954 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field971[var6] = (short) arg0.method568((byte) 110);
                this.field954[var6] = (short) arg0.method568((byte) 110);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILbw;ILqa;Z)Lc;", line = 147)
    public final class507 method436(int arg0, int arg1, int arg2, class329 arg3, int arg4, class129 arg5, boolean arg6) {
        field976++;
        return arg6 ? null : this.method439(false, null, -14076, null, arg5, 0, arg3, (byte) 5, 0, arg0, arg4, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 159)
    public static final void method437(String arg0, byte arg1) {
        field972++;
        if (arg1 > -75) {
            field978 = -11;
        }
        class297.field3851 = arg0;
        if (class172.field2221.field6139 == null) {
            return;
        }
        try {
            String var2 = class172.field2221.field6139.getParameter("cookieprefix");
            String var3 = class172.field2221.field6139.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class445.method2640(class173.method1134(true) + 94608000000L, 2) + "; Max-Age=" + 94608000L;
            }
            class425.method2517(class172.field2221.field6139, (byte) -103, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLbt;)V", line = 196)
    public final void method438(byte arg0, class88 arg1) {
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                int var4 = 6 / ((-arg0 - 22) / 47);
                field970++;
                return;
            }
            this.method435(arg1, (byte) 78, var3);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLna;ILna;Lqa;ILbw;BIIIIII)Lc;", line = 218)
    private final class507 method439(boolean arg0, class251 arg1, int arg2, class251 arg3, class129 arg4, int arg5, class329 arg6, byte arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field955++;
        int var15 = arg10;
        class44 var16 = this.field969 == -1 || arg11 == -1 ? null : arg6.method1962(this.field969, false);
        boolean var17 = arg0 & this.field974 != 0;
        if (var16 != null) {
            var15 = arg10 | var16.method281(arg11, false, arg13, true);
        }
        if (var17) {
            var15 |= this.field974 == 3 ? 7 : 2;
        }
        if (this.field966 != 128) {
            var15 |= 0x2;
        }
        if (this.field958 != 128 || this.field973 != 0) {
            var15 |= 0x5;
        }
        class11 var18 = this.field962.field3073;
        class507 var19;
        synchronized (this.field962.field3073) {
            var19 = (class507) this.field962.field3073.method78((long) (this.field951 |= arg4.field1760 << 29), (byte) -105);
        }
        if (var19 == null || arg4.method880(var19.method475(), var15) != 0) {
            if (var19 != null) {
                var15 = arg4.method885(var15, var19.method475());
            }
            int var20 = var15;
            if (this.field965 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field971 != null) {
                var20 |= 0x8000;
            }
            class420 var21 = class370.method2154(10481, this.field977, 0, this.field962.field3071);
            if (var21 == null) {
                return null;
            }
            if (var21.field5593 < 13) {
                var21.method2466(0, (byte) 125);
            }
            var19 = arg4.method888(var21, var20, this.field962.field3074, this.field968 + 64, this.field961 + 850);
            if (this.field965 != null) {
                for (int var22 = 0; var22 < this.field965.length; var22++) {
                    var19.method478(this.field965[var22], this.field959[var22]);
                }
            }
            if (this.field971 != null) {
                for (int var23 = 0; var23 < this.field971.length; var23++) {
                    var19.method508(this.field971[var23], this.field954[var23]);
                }
            }
            var19.method517(var15);
            class11 var24 = this.field962.field3073;
            synchronized (this.field962.field3073) {
                this.field962.field3073.method88((long) (this.field951 |= arg4.field1760 << 29), arg2 + 14200, var19);
            }
        }
        class507 var25 = var16 == null ? var19.method510(arg7, var15, true) : var16.method288(116, var19, arg13, 0, var15, arg9, arg11, arg7);
        if (this.field958 != 128 || this.field966 != 128) {
            var25.method482(this.field958, this.field966, this.field958);
        }
        if (this.field973 != 0) {
            if (this.field973 == 90) {
                var25.method522(4096);
            }
            if (this.field973 == 180) {
                var25.method522(8192);
            }
            if (this.field973 == 270) {
                var25.method522(12288);
            }
        }
        if (var17) {
            var25.method534(this.field974, this.field953, arg3, arg1, arg5, arg12, arg8);
        }
        var25.method517(arg10);
        if (arg2 != -14076) {
            this.method436(-11, -23, -88, null, -45, null, false);
        }
        return var25;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILna;ILna;ILqa;ZIIIILbw;)Lc;", line = 361)
    public final class507 method440(int arg0, int arg1, class251 arg2, int arg3, class251 arg4, int arg5, class129 arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, class329 arg12) {
        if (arg5 != 8629) {
            this.method440(39, -22, null, 23, null, -105, null, false, -14, -101, -5, 111, null);
        }
        field957++;
        return this.method439(arg7, arg4, -14076, arg2, arg6, arg11, arg12, (byte) 2, arg0, arg8, arg1, arg9, arg3, arg10);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILqa;ILbw;BI)Lc;", line = 388)
    public final class507 method441(int arg0, int arg1, class129 arg2, int arg3, class329 arg4, byte arg5, int arg6) {
        field956++;
        return arg5 == -98 ? this.method439(false, null, -14076, null, arg2, 0, arg4, (byte) 2, 0, arg6, arg1, arg3, 0, arg0) : null;
    }
}
