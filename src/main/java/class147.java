import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class147 {

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public int field2374 = -1;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public int field2377 = 128;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    private int field2387 = 0;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Z")
    public boolean field2383 = true;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lwa;")
    public static class418 field2379 = new class418("LIVE", 0);

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "[Z")
    public static boolean[] field2388 = new boolean[200];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public int field2380;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public int field2386;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[BII)V", line = 4)
    public static final void method960(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field2376++;
        if (arg5 <= arg0) {
            return;
        }
        int var6 = arg0 + arg1;
        int var7 = arg5 - arg0 >> 2;
        if (arg4 < 98) {
            field2384 = 119;
        }
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg5 - arg0 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg3[var6++] = 1;
                }
            }
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
            arg3[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBLha;)V", line = 34)
    private final void method961(int arg0, byte arg1, class40 arg2) {
        if (arg0 == 1) {
            this.field2387 = arg2.method224(-2);
            this.method965((byte) -109, this.field2387);
        } else if (arg0 == 2) {
            this.field2374 = arg2.method254((byte) -60);
            if (this.field2374 == 65535) {
                this.field2374 = -1;
            }
        } else if (arg0 == 3) {
            this.field2377 = arg2.method254((byte) -72) << 0;
        } else if (arg0 == 4) {
            this.field2383 = false;
        }
        field2382++;
        int var4 = -14 % ((arg1 - 22) / 50);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Loa;ZBILoa;)I", line = 70)
    public static final int method962(class471 arg0, boolean arg1, byte arg2, int arg3, class471 arg4) {
        field2372++;
        if (arg3 == 1) {
            int var5 = arg4.field4914;
            int var6 = arg0.field4914;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class213.method1311(arg0.method2835(119).field4663, class406.field5898, arg4.method2835(115).field4663, 0);
        } else if (arg3 != 3) {
            if (arg2 < 93) {
                field2379 = null;
            }
            if (arg3 == 4) {
                if (arg4.method2044(false)) {
                    return arg0.method2044(false) ? 0 : 1;
                } else if (arg0.method2044(false)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 5) {
                if (arg4.method2043((byte) 124)) {
                    return arg0.method2043((byte) 124) ? 0 : 1;
                } else if (arg0.method2043((byte) 124)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 6) {
                if (arg4.method2042((byte) 109)) {
                    return arg0.method2042((byte) -116) ? 0 : 1;
                } else if (arg0.method2042((byte) 120)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 7) {
                if (arg4.method2039(1)) {
                    return arg0.method2039(1) ? 0 : 1;
                } else if (arg0.method2039(1)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 8) {
                int var7 = arg4.field7209;
                int var8 = arg0.field7209;
                if (arg1) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg4.field7208 - arg0.field7208;
            }
        } else if (arg4.field7210.equals("-")) {
            if (arg0.field7210.equals("-")) {
                return 0;
            } else if (arg1) {
                return -1;
            } else {
                return 1;
            }
        } else if (arg0.field7210.equals("-")) {
            return arg1 ? 1 : -1;
        } else {
            return class213.method1311(arg0.field7210, class406.field5898, arg4.field7210, 0);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)I", line = 165)
    public static final int method963(byte arg0) {
        field2375++;
        int var1 = -94 / ((arg0 + 58) / 39);
        return 6;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 175)
    public static void method964(int arg0) {
        field2379 = null;
        field2388 = null;
        if (arg0 != 0) {
            method966(64, -104, -41, 112);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V", line = 188)
    private final void method965(byte arg0, int arg1) {
        if (arg0 > -10) {
            method960(-12, -14, 49, null, 61, -75);
        }
        field2381++;
        double var3 = (double) ((arg1 & 0xFF2BA6) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field2386 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field2385 = (int) (var17 * 256.0D);
        if (this.field2386 < 0) {
            this.field2386 = 0;
        } else if (this.field2386 > 255) {
            this.field2386 = 255;
        }
        if (this.field2385 < 0) {
            this.field2385 = 0;
        } else if (this.field2385 > 255) {
            this.field2385 = 255;
        }
        if (var17 > 0.5D) {
            this.field2380 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2380 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2380 < 1) {
            this.field2380 = 1;
        }
        this.field2373 = (int) ((double) this.field2380 * var19);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V", line = 289)
    public static final void method966(int arg0, int arg1, int arg2, int arg3) {
        class268 var4 = class321.field4830[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class431 var5 = var4.field4052;
        class431 var6 = var4.field4051;
        if (var5 != null) {
            var5.field6344 = var5.field6344 * arg3 / (0x10 << class239.field3602 - 7);
            var5.field6342 = var5.field6342 * arg3 / (0x10 << class239.field3602 - 7);
        }
        if (var6 != null) {
            var6.field6344 = var6.field6344 * arg3 / (0x10 << class239.field3602 - 7);
            var6.field6342 = var6.field6342 * arg3 / (0x10 << class239.field3602 - 7);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILha;)V", line = 324)
    public final void method967(int arg0, class40 arg1) {
        field2378++;
        while (true) {
            int var3 = arg1.method257((byte) 47);
            if (var3 == 0) {
                if (arg0 < 79) {
                    this.field2380 = 122;
                    return;
                } else {
                    return;
                }
            }
            this.method961(var3, (byte) 95, arg1);
        }
    }
}
