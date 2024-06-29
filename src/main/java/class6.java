import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 extends class222 {

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    private int field91;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    private int field87;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    private int field92;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    private int field95;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Lao;")
    public static class188 field84 = new class188(8, 6);

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "[B")
    public static byte[] field90;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "[I")
    public static int[] field96;

    static {
        int var0 = 0;
        field90 = new byte[32896];
        for (int var1 = 0; ~var1 > -257; ++var1) {
            for (int var2 = 0; var1 >= var2; ++var2) {
                field90[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field93 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V", line = 3)
    public final void method44(int arg0, int arg1, int arg2) {
        ++field94;
        int var4 = this.field91 * arg2 >> 12;
        if (arg1 == 0) {
            int var5 = this.field87 * arg2 >> 12;
            int var6 = this.field92 * arg0 >> 12;
            int var7 = this.field95 * arg0 >> 12;
            class109.method810(super.field3207, var6, var7, var5, var4, -8191);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIIII)V", line = 24)
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (~arg0 == ~arg7 && ~arg4 == ~arg9 && ~arg1 == ~arg2 && arg5 == arg6) {
            class364.method2333(78, arg0, arg6, arg4, arg3, arg1);
        } else {
            int var10 = arg0;
            int var11 = arg4;
            int var12 = arg0 * 3;
            int var13 = arg4 * 3;
            int var14 = arg7 * 3;
            int var15 = arg9 * 3;
            int var16 = arg2 * 3;
            int var17 = arg5 * 3;
            int var18 = -var16 + arg1 + var14 + -arg0;
            int var19 = -arg4 + var15 + -var17 + arg6;
            int var20 = -var14 + var16 + -var14 + var12;
            int var21 = -var15 + var17 + var13 - var15;
            int var22 = var14 - var12;
            int var23 = -var13 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 - -var29 >> 12) + arg0;
                int var34 = (var28 + var32 + var30 >> 12) + arg4;
                class364.method2333(86, var10, var34, var11, arg3, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg8 != 11989) {
            method45(2, 103, 86, 67, -89, -81, 95, -69, 124, 39);
        }
        ++field82;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ICB)C", line = 105)
    public static final char method46(int arg0, char arg1, byte arg2) {
        ++field85;
        if (~arg1 <= -193 && ~arg1 >= -256) {
            if (arg1 >= 192 && ~arg1 >= -199) {
                return 'A';
            }
            if (arg1 == 199) {
                return 'C';
            }
            if (~arg1 <= -201 && arg1 <= 203) {
                return 'E';
            }
            if (arg1 >= 204 && arg1 <= 207) {
                return 'I';
            }
            if (~arg1 == -210 && arg0 != 0) {
                return 'N';
            }
            if (~arg1 <= -211 && arg1 <= 214) {
                return 'O';
            }
            if (~arg1 <= -218 && arg1 <= 220) {
                return 'U';
            }
            if (~arg1 == -222) {
                return 'Y';
            }
            if (~arg1 == -224) {
                return 's';
            }
            if (~arg1 <= -225 && arg1 <= 230) {
                return 'a';
            }
            if (arg1 == 231) {
                return 'c';
            }
            if (arg1 >= 232 && ~arg1 >= -236) {
                return 'e';
            }
            if (arg1 >= 236 && arg1 <= 239) {
                return 'i';
            }
            if (~arg1 == -242 && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 242 && arg1 <= 246) {
                return 'o';
            }
            if (~arg1 <= -250 && arg1 <= 252) {
                return 'u';
            }
            if (arg1 == 253 || arg1 == 255) {
                return 'y';
            }
        }
        if (arg2 >= -106) {
            method46(125, (char) 65513, (byte) -89);
        }
        if (arg1 == 338) {
            return 'O';
        } else if (~arg1 == -340) {
            return 'o';
        } else if (~arg1 == -377) {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)Lcp;", line = 190)
    public static final class507 method47(byte arg0) {
        ++field88;
        class4.field69 = 0;
        if (arg0 != -88) {
            method47((byte) -35);
        }
        return class42.method324(true);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIIII)V", line = 202)
    public class6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field91 = arg0;
        this.field87 = arg2;
        this.field92 = arg1;
        this.field95 = arg3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZ)V", line = 217)
    public final void method48(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method46(-99, 'C', (byte) -105);
        }
        ++field89;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(JI)V", line = 250)
    public static final void method49(long arg0, int arg1) {
        if (class36.field545 != null) {
            if (~class403.field5944 != -2 && class403.field5944 != 5) {
                if (class403.field5944 == 4) {
                    class265.method1700(31074, arg0);
                }
            } else {
                class385.method2423(arg0, 122);
            }
        }
        ++field86;
        class452.method2717(class394.field5821, (byte) 115, (long) class180.field2734);
        if (~class341.field5207 != 0) {
            class471.method2809((byte) -90, class341.field5207);
        }
        for (int var3 = 0; class73.field1232 > var3; ++var3) {
            if (class165.field2473[var3]) {
                class482.field7076[var3] = true;
            }
            class459.field6776[var3] = class165.field2473[var3];
            class165.field2473[var3] = false;
        }
        class35.field537 = class180.field2734;
        int var4 = -59 / ((65 - arg1) / 58);
        if (class394.field5821.method473()) {
            class466.field6856 = true;
        }
        if (class341.field5207 != -1) {
            class73.field1232 = 0;
            class21.method174(2);
        }
        class394.field5821.method492();
        class149.method1066(class394.field5821, -1);
        int var5 = class161.method1168(false);
        if (var5 == -1) {
            var5 = class508.field7429;
        }
        if (~var5 == 0) {
            var5 = class520.field7642;
        }
        class108.method807(var5, true);
        class471.method2811(class95.field1558.field5529, 1, class95.field1558.field5539, class228.field3343, class95.field1558.field5538);
        class228.field3343 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 318)
    public static void method50(int arg0) {
        if (arg0 == -1) {
            field96 = null;
            field84 = null;
            field90 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V", line = 334)
    public final void method51(int arg0, int arg1, int arg2) {
        ++field83;
        int var4 = this.field91 * arg0 >> 12;
        int var5 = this.field87 * arg0 >> 12;
        if (arg2 < -20) {
            int var6 = this.field92 * arg1 >> 12;
            int var7 = this.field95 * arg1 >> 12;
            class54.method390(super.field3207, var5, super.field3210, -1, var6, var4, var7, super.field3216);
        }
    }
}
