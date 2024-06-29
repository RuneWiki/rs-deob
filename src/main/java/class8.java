import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class8 extends class288 {

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    private int field111 = 3216;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "[I")
    private int[] field112 = new int[3];

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    private int field113 = 3216;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    private int field123 = 4096;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "[I")
    public static int[] field110 = new int[2];

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "Lsj;")
    public static class48 field114 = new class48();

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static int field125 = 0;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field124 = -1;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class8() {
        super(1, true);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field113 = arg0.method1777(-88);
                }
            } else {
                this.field111 = arg0.method1777(-69);
            }
        } else {
            this.field123 = arg0.method1777(-106);
        }
        if (arg1 != -19) {
            this.method16((byte) -31);
        }
        ++field118;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjj;)V")
    public static final void method46(int arg0, class134 arg1) {
        class193.field3091 = arg1;
        ++field126;
        if (arg0 != 255) {
            field114 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BIC)C")
    public static final char method47(byte arg0, int arg1, char arg2) {
        int var3 = 107 % ((arg0 - 18) / 55);
        ++field116;
        if (arg2 >= 192 && ~arg2 >= -256) {
            if (~arg2 <= -193 && ~arg2 >= -199) {
                return 'A';
            }
            if (arg2 == 199) {
                return 'C';
            }
            if (~arg2 <= -201 && ~arg2 >= -204) {
                return 'E';
            }
            if (arg2 >= 204 && arg2 <= 207) {
                return 'I';
            }
            if (~arg2 == -210 && ~arg1 != -1) {
                return 'N';
            }
            if (~arg2 <= -211 && arg2 <= 214) {
                return 'O';
            }
            if (arg2 >= 217 && ~arg2 >= -221) {
                return 'U';
            }
            if (arg2 == 221) {
                return 'Y';
            }
            if (~arg2 == -224) {
                return 's';
            }
            if (arg2 >= 224 && arg2 <= 230) {
                return 'a';
            }
            if (~arg2 == -232) {
                return 'c';
            }
            if (arg2 >= 232 && arg2 <= 235) {
                return 'e';
            }
            if (arg2 >= 236 && ~arg2 >= -240) {
                return 'i';
            }
            if (~arg2 == -242 && arg1 != 0) {
                return 'n';
            }
            if (~arg2 <= -243 && ~arg2 >= -247) {
                return 'o';
            }
            if (~arg2 <= -250 && ~arg2 >= -253) {
                return 'u';
            }
            if (arg2 == 253 || arg2 == 255) {
                return 'y';
            }
        }
        if (~arg2 == -339) {
            return 'O';
        } else if (arg2 == 339) {
            return 'o';
        } else {
            return arg2 == 376 ? 'Y' : arg2;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        if (arg0 != -125) {
            this.method49((byte) 64);
        }
        this.method49((byte) 117);
        ++field122;
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
    public static void method48(int arg0) {
        field110 = null;
        field114 = null;
        if (arg0 != 0) {
            field124 = 93;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        if (arg0 != 0) {
            method50((byte) 115, 99, -107, true, 91);
        }
        ++field115;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int var4 = class232.field3688 * this.field123 >> 12;
            int[] var5 = this.method1931((byte) -119, 0, arg1 + -1 & class144.field2332);
            int[] var6 = this.method1931((byte) -119, 0, arg1);
            int[] var7 = this.method1931((byte) -124, 0, arg1 + 1 & class144.field2332);
            for (int var8 = 0; class186.field2986 > var8; ++var8) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (~var10 < -256) {
                    var10 = 255;
                }
                int var11 = (var6[class34.field422 & var8 + -1] + -var6[var8 + 1 & class34.field422]) * var4 >> 12;
                int var12 = var11 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = 255 & class75.field1030[var12 - -((var10 + 1) * var10 >> 1)];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field112[2] * var14 >> 12;
                int var17 = var11 * var13 >> 8;
                int var18 = this.field112[0] * var17 >> 12;
                int var19 = this.field112[1] * var15 >> 12;
                var3[var8] = var16 + var19 + var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V")
    private final void method49(byte arg0) {
        double var2 = Math.cos((double) ((float) this.field113 / 4096.0F));
        this.field112[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field111 / 4096.0F)));
        this.field112[1] = (int) (Math.cos((double) ((float) this.field111 / 4096.0F)) * var2 * 4096.0D);
        ++field109;
        this.field112[2] = (int) (Math.sin((double) ((float) this.field113 / 4096.0F)) * 4096.0D);
        int var4 = this.field112[0] * this.field112[0] >> 12;
        int var5 = this.field112[1] * this.field112[1] >> 12;
        int var6 = this.field112[2] * this.field112[2] >> 12;
        if (arg0 > 105) {
            int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
            if (~var7 != -1) {
                this.field112[2] = (this.field112[2] << 12) / var7;
                this.field112[0] = (this.field112[0] << 12) / var7;
                this.field112[1] = (this.field112[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BIIZI)V")
    public static final void method50(byte arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field121;
        class159.field2597 = 0L;
        int var5 = class195.method1321(true);
        boolean var6 = false;
        if (~var5 >= -1 != ~arg4 >= -1) {
            var6 = true;
        }
        if (arg0 > -3) {
            method47((byte) 81, 3, (char) 65500);
        }
        if (arg4 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (class255.field4084.startsWith("mac") && arg4 > 0) {
            arg3 = true;
        }
        if (arg3 && arg4 > 0) {
            var6 = true;
        }
        class108.method791(77, var6, arg1, arg4, arg2, var5, arg3);
    }
}
