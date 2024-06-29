import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class185 {

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "[I")
    private int[] field2972 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field2979 = -1;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lgv;")
    public class58 field2964;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "[I")
    private int[] field2971;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "[S")
    private short[] field2963;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "[S")
    private short[] field2967;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "[S")
    private short[] field2970;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "[S")
    private short[] field2977;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLnn;)Lnf;", line = 7)
    public static final class410 method1257(byte arg0, class289 arg1) {
        field2973++;
        int var2 = 95 % ((arg0 - 78) / 38);
        return new class410(arg1.method1848((byte) 123), arg1.method1848((byte) 111), arg1.method1848((byte) 121), arg1.method1848((byte) 125), arg1.method1848((byte) 126), arg1.method1848((byte) 123), arg1.method1848((byte) 125), arg1.method1848((byte) 109), arg1.method1863(126), arg1.method1858(-3256));
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)I", line = 17)
    public static final int method1258(byte arg0, int arg1) {
        if (arg0 < 97) {
            return -59;
        }
        field2978++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[BIB)Ljava/lang/String;", line = 56)
    public static final String method1259(int arg0, byte[] arg1, int arg2, byte arg3) {
        field2975++;
        if (arg3 < 120) {
            method1264(-54, 37);
        }
        char[] var4 = new char[arg2];
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg1[arg0 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class146.field2454[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)Lpn;", line = 98)
    public final class528 method1260(boolean arg0) {
        field2980++;
        class528[] var2 = new class528[5];
        int var3 = 0;
        class459 var4 = this.field2964.field1219;
        synchronized (this.field2964.field1219) {
            int var5 = 0;
            if (!arg0) {
                field2974 = -73;
            }
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field2972[var5] != -1) {
                    var2[var3++] = class299.method1926(0, this.field2964.field1219, 0, this.field2972[var5]);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field7668 < 13) {
                var2[var6].method3135((byte) -108, 0);
            }
        }
        class528 var7 = new class528(var2, var3);
        if (this.field2977 != null) {
            for (int var8 = 0; var8 < this.field2977.length; var8++) {
                var7.method3133(this.field2977[var8], this.field2967[var8], 86);
            }
        }
        if (this.field2970 != null) {
            for (int var9 = 0; var9 < this.field2970.length; var9++) {
                var7.method3136(this.field2970[var9], this.field2963[var9], (byte) 34);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[[[BIBII)V", line = 169)
    public static final void method1261(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class374.field5485++;
        class496.field7289 = 0;
        for (int var6 = class110.field2001; var6 < class138.field2320; var6++) {
            class234[][] var17 = class518.field7511[var6];
            for (int var18 = class450.field6693; var18 < class250.field3857; var18++) {
                for (int var19 = class498.field7314; var19 < class531.field7725; var19++) {
                    class234 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class38.field559[var18 + class97.field1894 - class107.field1974][var19 + class97.field1894 - class199.field3222] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field3609 = true;
                            var20.field3617 = true;
                            if (var20.field3607 == null) {
                                var20.field3612 = false;
                            } else {
                                var20.field3612 = true;
                            }
                            class496.field7289++;
                        } else {
                            var20.field3609 = false;
                            var20.field3617 = false;
                            var20.field3616 = 0;
                            if (var18 >= class107.field1974 - 16 && var18 <= class107.field1974 + 16 && var19 >= class199.field3222 - 16 && var19 <= class199.field3222 + 16 && (var20.field3610 != null || var20.field3613 != null || var20.field3605 != null || var20.field3602 != null || var20.field3619 != null || var20.field3607 != null)) {
                                class192.field3104.method1339(-7763, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class520.field7560 == class293.field4481;
        for (int var8 = class110.field2001; var8 < class138.field2320; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class34.field522.method421() && var8 >= arg2 && arg1 != null) {
                int var10 = class38.field559.length;
                if (class38.field559.length + class450.field6693 > class493.field7231) {
                    var10 -= class38.field559.length + class450.field6693 - class493.field7231;
                }
                int var11 = class38.field559[0].length;
                if (class38.field559[0].length + class498.field7314 > class220.field3464) {
                    var11 -= class38.field559[0].length + class498.field7314 - class220.field3464;
                }
                int var12 = class467.field6939;
                while (true) {
                    if (var12 >= var10) {
                        class192.field3104.method1346(var9, 5000, true, class520.field7560[var8], var8);
                        break;
                    }
                    int var13 = class450.field6693 + var12 - class467.field6939;
                    for (int var14 = class483.field7126; var14 < var11; var14++) {
                        class486.field7158[var12][var14] = false;
                        if (class38.field559[var12][var14]) {
                            int var15 = class498.field7314 + var14 - class483.field7126;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class518.field7511[var16][var13][var15] != null && class518.field7511[var16][var13][var15].field3600 == var8) {
                                    class486.field7158[var12][var14] = class518.field7511[var16][var13][var15].field3609;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class192.field3104.method1346(var9, 5000, false, class520.field7560[var8], var8);
            }
            class192.field3104.method1345(-696);
        }
        if (!class406.method2519(true)) {
            class406.method2519(false);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)Lpn;", line = 307)
    public final class528 method1262(int arg0) {
        field2976++;
        if (this.field2971 == null) {
            return null;
        }
        class528[] var2 = new class528[this.field2971.length];
        class459 var3 = this.field2964.field1219;
        synchronized (this.field2964.field1219) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field2971.length) {
                    break;
                }
                var2[var4] = class299.method1926(0, this.field2964.field1219, class509.method3048(arg0, 14489), this.field2971[var4]);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field2971.length; var5++) {
            if (var2[var5].field7668 < 13) {
                var2[var5].method3135((byte) -106, 0);
            }
        }
        if (arg0 != 14489) {
            field2974 = -43;
        }
        class528 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class528(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field2977 != null) {
            for (int var7 = 0; var7 < this.field2977.length; var7++) {
                var6.method3133(this.field2977[var7], this.field2967[var7], 115);
            }
        }
        if (this.field2970 != null) {
            for (int var8 = 0; var8 < this.field2970.length; var8++) {
                var6.method3136(this.field2970[var8], this.field2963[var8], (byte) 34);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Z", line = 385)
    public final boolean method1263(int arg0) {
        if (arg0 <= 91) {
            method1258((byte) -46, -121);
        }
        field2965++;
        boolean var2 = true;
        class459 var3 = this.field2964.field1219;
        synchronized (this.field2964.field1219) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field2972[var4] != -1 && !this.field2964.field1219.method2741(0, 1164, this.field2972[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Ljava/lang/String;", line = 412)
    public static final String method1264(int arg0, int arg1) {
        field2968++;
        String var2 = Integer.toString(arg0);
        int var3 = var2.length() - 3;
        if (arg1 != 1) {
            field2979 = 88;
        }
        while (var3 > 0) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            var3 -= 3;
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class416.field6274.method1977(class146.field2452, 76) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class132.field2214.method1977(class146.field2452, arg1 + 125) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBLnn;)V", line = 454)
    private final void method1265(int arg0, byte arg1, class289 arg2) {
        if (arg1 != 118) {
            return;
        }
        field2981++;
        if (arg0 == 1) {
            arg2.method1858(-3256);
        } else if (arg0 == 2) {
            int var8 = arg2.method1858(arg1 - 3374);
            this.field2971 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2971[var9] = arg2.method1841((byte) 89);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var4 = arg2.method1858(-3256);
                this.field2977 = new short[var4];
                this.field2967 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2977[var5] = (short) arg2.method1841((byte) -118);
                    this.field2967[var5] = (short) arg2.method1841((byte) 27);
                }
                return;
            }
            if (arg0 == 41) {
                int var6 = arg2.method1858(-3256);
                this.field2970 = new short[var6];
                this.field2963 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2970[var7] = (short) arg2.method1841((byte) -122);
                    this.field2963[var7] = (short) arg2.method1841((byte) 37);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field2972[arg0 - 60] = arg2.method1841((byte) -120);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)Z", line = 534)
    public final boolean method1266(int arg0) {
        field2969++;
        if (this.field2971 == null) {
            return true;
        }
        boolean var2 = true;
        class459 var3 = this.field2964.field1219;
        synchronized (this.field2964.field1219) {
            for (int var4 = arg0; var4 < this.field2971.length; var4++) {
                if (!this.field2964.field1219.method2741(0, 1164, this.field2971[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lnn;I)V", line = 559)
    public final void method1267(class289 arg0, int arg1) {
        field2966++;
        if (arg1 > -120) {
            method1261(74, null, -77, (byte) -15, -6, -35);
        }
        while (true) {
            int var3 = arg0.method1858(-3256);
            if (var3 == 0) {
                return;
            }
            this.method1265(var3, (byte) 118, arg0);
        }
    }
}
