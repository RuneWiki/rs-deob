import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class189 {

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Z")
    public boolean field2530;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Z")
    public boolean field2525;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "[S")
    public short[] field2526;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    private int field2528;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    private int field2521;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    private int field2523;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    private int field2527;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lbe;")
    public class28 field2518;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sm", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field2536;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1264(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 8)
    private final void method1257(int arg0) {
        int var2 = 37 % ((-arg0 - 58) / 61);
        field2522++;
        int var3 = this.field2520;
        if (var3 == 2) {
            this.field2531 = 0;
            this.field2521 = 2048;
            this.field2523 = 1;
            this.field2527 = 2048;
        } else if (var3 == 3) {
            this.field2531 = 0;
            this.field2527 = 4096;
            this.field2523 = 1;
            this.field2521 = 2048;
        } else if (var3 == 4) {
            this.field2523 = 4;
            this.field2531 = 0;
            this.field2521 = 2048;
            this.field2527 = 2048;
        } else if (var3 == 5) {
            this.field2521 = 2048;
            this.field2527 = 8192;
            this.field2523 = 4;
            this.field2531 = 0;
        } else if (var3 == 12) {
            this.field2521 = 2048;
            this.field2531 = 0;
            this.field2527 = 2048;
            this.field2523 = 2;
        } else if (var3 == 13) {
            this.field2521 = 2048;
            this.field2527 = 8192;
            this.field2523 = 2;
            this.field2531 = 0;
        } else if (var3 == 10) {
            this.field2521 = 512;
            this.field2531 = 1536;
            this.field2523 = 3;
            this.field2527 = 2048;
        } else if (var3 == 11) {
            this.field2521 = 512;
            this.field2523 = 3;
            this.field2527 = 4096;
            this.field2531 = 1536;
        } else if (var3 == 6) {
            this.field2523 = 3;
            this.field2521 = 768;
            this.field2531 = 1280;
            this.field2527 = 2048;
        } else if (var3 == 7) {
            this.field2523 = 3;
            this.field2521 = 768;
            this.field2531 = 1280;
            this.field2527 = 4096;
        } else if (var3 == 8) {
            this.field2523 = 3;
            this.field2527 = 2048;
            this.field2531 = 1024;
            this.field2521 = 1024;
        } else if (var3 == 9) {
            this.field2523 = 3;
            this.field2521 = 1024;
            this.field2531 = 1024;
            this.field2527 = 4096;
        } else if (var3 == 14) {
            this.field2527 = 2048;
            this.field2523 = 1;
            this.field2521 = 768;
            this.field2531 = 1280;
        } else if (var3 == 15) {
            this.field2531 = 1536;
            this.field2527 = 4096;
            this.field2521 = 512;
            this.field2523 = 1;
        } else if (var3 == 16) {
            this.field2527 = 8192;
            this.field2531 = 1792;
            this.field2523 = 1;
            this.field2521 = 256;
        } else {
            this.field2521 = 2048;
            this.field2527 = 2048;
            this.field2523 = 0;
            this.field2531 = 0;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjava/lang/String;)V", line = 206)
    public static final void method1258(int arg0, String arg1) {
        int var2 = 50 % ((arg0 + 71) / 46);
        field2524++;
        if (arg1 == null) {
            return;
        }
        if (!(class454.field6834 < 100 || class335.field5203) || class454.field6834 >= 200) {
            class62.method444(120, class452.field6799.method2705((byte) 69, class257.field3556));
            return;
        }
        String var3 = class467.method2808(-1, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class454.field6834; var4++) {
            String var8 = class467.method2808(-1, class466.field6946[var4]);
            if (var8 != null && var8.equals(var3)) {
                class62.method444(74, arg1 + class499.field7358.method2705((byte) 69, class257.field3556));
                return;
            }
            if (class64.field918[var4] != null) {
                String var9 = class467.method2808(-1, class64.field918[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class62.method444(73, arg1 + class499.field7358.method2705((byte) 69, class257.field3556));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class243.field3404; var5++) {
            String var6 = class467.method2808(-1, class436.field6599[var5]);
            if (var6 != null && var6.equals(var3)) {
                class62.method444(107, class274.field3812.method2705((byte) 69, class257.field3556) + arg1 + class531.field7812.method2705((byte) 69, class257.field3556));
                return;
            }
            if (class317.field4608[var5] != null) {
                String var7 = class467.method2808(-1, class317.field4608[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class62.method444(71, class274.field3812.method2705((byte) 69, class257.field3556) + arg1 + class531.field7812.method2705((byte) 69, class257.field3556));
                    return;
                }
            }
        }
        if (class467.method2808(-1, class56.field800.field1393).equals(var3)) {
            class62.method444(68, class186.field2508.method2705((byte) 69, class257.field3556));
        } else {
            class424.method2582(class455.field6840, -1);
            class308.field4456++;
            class538.field7879.method1072((byte) 102, class436.method2652(arg1, (byte) -81));
            class538.field7879.method1071(-25643, arg1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZII)V", line = 300)
    public final void method1259(boolean arg0, int arg1, int arg2) {
        field2533++;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field2527 * arg1 / 50 + this.field2528 & 0x7FF;
            int var6 = this.field2523;
            if (var6 == 1) {
                var4 = (class428.field6502[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class510.field7489[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        if (arg2 == 2048) {
            this.field2518.method256((byte) 101, (float) ((this.field2521 * var4 >> 11) + this.field2531) / 2048.0F);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)V", line = 375)
    public static final void method1260(byte arg0, int arg1) {
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        if (arg0 < 4) {
            method1263(-23, -23, -40, false);
        }
        field2535++;
        class538.field7897 = arg1;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIII)V", line = 396)
    public final void method1261(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2531 = arg4;
        this.field2523 = arg0;
        if (arg1 != -32) {
            this.method1259(false, 11, -96);
        }
        this.field2521 = arg3;
        this.field2527 = arg2;
        field2532++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZILqa;I)V", line = 412)
    private final void method1262(int arg0, int arg1, int arg2, boolean arg3, int arg4, class165 arg5, int arg6) {
        field2534++;
        this.field2518 = arg5.method815(arg2, arg1, arg6, arg0, arg4, 1.0F);
        if (arg3) {
            method1263(-82, 120, 53, false);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 428)
    protected class189() {
        if (class510.field7489 == null) {
            class103.method670(2048);
        }
        this.method1257(-127);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lqa;Lnj;I)V", line = 440)
    public class189(class165 arg0, class164 arg1, int arg2) {
        if (class510.field7489 == null) {
            class103.method670(2048);
        }
        this.field2519 = arg1.method1087(false);
        this.field2530 = (this.field2519 & 0x10) != 0;
        this.field2525 = (this.field2519 & 0x8) != 0;
        this.field2519 &= 0x7;
        int var4 = arg1.method1074(-635989152) << arg2;
        int var5 = arg1.method1074(-635989152) << arg2;
        int var6 = arg1.method1074(-635989152) << arg2;
        int var7 = arg1.method1087(false);
        int var8 = var7 * 2 + 1;
        this.field2526 = new short[var8];
        for (int var9 = 0; var9 < this.field2526.length; var9++) {
            short var13 = (short) arg1.method1074(-635989152);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > var8 - var14) {
                var15 = var8 - var14;
            }
            this.field2526[var9] = (short) class311.method1956(var15, var14 << 8);
        }
        int var10 = (var7 << class10.field179) + class251.field3501;
        int var11 = class401.field6108 == null ? class179.field2408[class151.method987(false, arg1.method1074(-635989152)) & 0xFFFF] : class401.field6108[arg1.method1074(-635989152)];
        int var12 = arg1.method1087(false);
        this.field2520 = var12 & 0x1F;
        this.field2528 = (var12 & 0xE0) << 3;
        if (this.field2520 != 31) {
            this.method1257(60);
        }
        this.method1262(var10, var6, var4, false, var11, arg0, var5);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ)Z", line = 502)
    public static final boolean method1263(int arg0, int arg1, int arg2, boolean arg3) {
        field2529++;
        boolean var4 = true;
        class68 var5 = (class68) class309.method1938(arg1, arg0, arg2);
        if (var5 != null) {
            var4 &= class229.method1544(-112, var5);
        }
        class68 var6 = (class68) class172.method1169(arg1, arg0, arg2, field2536 == null ? (field2536 = method1264("jt")) : field2536);
        if (var6 != null) {
            var4 &= class229.method1544(21, var6);
        }
        class68 var7 = (class68) class471.method2823(arg1, arg0, arg2);
        if (arg3) {
            method1258(-46, null);
        }
        if (var7 != null) {
            var4 &= class229.method1544(-7, var7);
        }
        return var4;
    }
}
