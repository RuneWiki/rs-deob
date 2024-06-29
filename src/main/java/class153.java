import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class153 extends class214 {

    @OriginalMember(owner = "client!vt", name = "P", descriptor = "Z")
    public boolean field2190 = true;

    @OriginalMember(owner = "client!vt", name = "J", descriptor = "I")
    public int field2185 = 4;

    @OriginalMember(owner = "client!vt", name = "S", descriptor = "I")
    public int field2193 = 1638;

    @OriginalMember(owner = "client!vt", name = "V", descriptor = "[B")
    private byte[] field2196 = new byte[512];

    @OriginalMember(owner = "client!vt", name = "U", descriptor = "I")
    public int field2195 = 0;

    @OriginalMember(owner = "client!vt", name = "O", descriptor = "I")
    public int field2189 = 4;

    @OriginalMember(owner = "client!vt", name = "Y", descriptor = "I")
    public int field2199 = 4;

    @OriginalMember(owner = "client!vt", name = "W", descriptor = "Ltm;")
    public static class112 field2197;

    @OriginalMember(owner = "client!vt", name = "M", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!vt", name = "N", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!vt", name = "Q", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!vt", name = "R", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!vt", name = "X", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!vt", name = "Z", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!vt", name = "ab", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!vt", name = "bb", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!vt", name = "cb", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!vt", name = "db", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!vt", name = "eb", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!vt", name = "fb", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!vt", name = "gb", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!vt", name = "K", descriptor = "[S")
    private short[] field2186;

    @OriginalMember(owner = "client!vt", name = "T", descriptor = "[S")
    private short[] field2194;

    static {
        new class84("", 73);
        field2197 = new class112("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
        new class112("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        new class112("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "(I)V", line = 4)
    public final void method12(int arg0) {
        ++field2191;
        this.field2196 = class350.method2094(this.field2195, (byte) -119);
        this.method930((byte) 60);
        if (arg0 != 27108) {
            method929(-31);
        }
        for (int var2 = this.field2199 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field2186[var2];
            if (var3 > 8) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field2199;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)[I", line = 33)
    public final int[] method14(byte arg0, int arg1) {
        ++field2202;
        if (arg0 != 123) {
            method929(16);
        }
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            this.method924(119, arg1, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLfr;)Z", line = 62)
    public static final boolean method922(byte arg0, class442 arg1) {
        ++field2192;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field6080) {
            return false;
        } else if (!arg1.method2571(true, class379.field5360)) {
            return false;
        } else {
            int var2 = 109 / ((16 - arg0) / 49);
            if (class255.field3565.method2614((long) arg1.field6081, -84) != null) {
                return false;
            } else {
                return class389.field5487.method2614((long) arg1.field6073, 38) == null;
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIB)Les;", line = 91)
    public static final class75 method923(int arg0, int arg1, int arg2, byte arg3) {
        ++field2203;
        class406 var4 = class455.field6293[arg0][arg2][arg1];
        if (var4 == null) {
            return null;
        } else {
            class75 var5 = null;
            int var6 = 127 / ((arg3 - -76) / 42);
            int var7 = -1;
            for (class146 var8 = var4.field5613; var8 != null; var8 = var8.field2066) {
                class478 var9 = var8.field2062;
                if (var9 instanceof class75) {
                    class75 var10 = (class75) var9;
                    int var11 = (-1 + var10.method206(0)) * 64 + 60;
                    int var12 = -var11 + var10.field6765 >> 7;
                    int var13 = -var11 + var10.field6746 >> 7;
                    int var14 = var10.field6765 + var11 >> 7;
                    int var15 = var10.field6746 + var11 >> 7;
                    if (var12 <= arg2 && ~var13 >= ~arg1 && ~var14 <= ~arg2 && ~arg1 >= ~var15) {
                        int var16 = (var14 + 1 + -arg2) * (var15 + 1 + -arg1);
                        if (var7 < var16) {
                            var5 = var10;
                            var7 = var16;
                        }
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(II[I)V", line = 152)
    public final void method924(int arg0, int arg1, int[] arg2) {
        ++field2207;
        int var4 = class56.field909[arg1] * this.field2189;
        if (arg0 < 101) {
            field2197 = null;
        }
        if (~this.field2199 != -2) {
            short var5 = this.field2186[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field2194[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field2185 * var6 >> 12;
                int var9 = this.field2189 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 - -1;
                int var12 = var7 & 4095;
                if (~var11 <= ~var9) {
                    var11 = 0;
                }
                int var13 = 255 & this.field2196[255 & var10];
                int var14 = 255 & this.field2196[var11 & 255];
                int var15 = class439.field6019[var12];
                for (int var16 = 0; class399.field5585 > var16; ++var16) {
                    int var36 = class436.field5989[var16] * this.field2185;
                    int var37 = this.method925(var12, (byte) -90, var15, var13, var6 * var36 >> 12, var14, var8);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field2199 < ~var17; ++var17) {
                short var18 = this.field2186[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field2194[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field2189 * var19 >> 12;
                    int var22 = this.field2185 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var20 & 4095;
                    if (~var24 <= ~var21) {
                        var24 = 0;
                    }
                    int var26 = this.field2196[var24 & 255] & 255;
                    int var27 = class439.field6019[var25];
                    int var28 = 255 & this.field2196[255 & var23];
                    if (this.field2190 && this.field2199 - 1 == var17) {
                        for (int var29 = 0; var29 < class399.field5585; ++var29) {
                            int var30 = class436.field5989[var29] * this.field2185;
                            int var31 = this.method925(var25, (byte) 90, var27, var28, var19 * var30 >> 12, var26, var22);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~class399.field5585 < ~var33; ++var33) {
                            int var34 = class436.field5989[var33] * this.field2185;
                            int var35 = this.method925(var25, (byte) 72, var27, var28, var19 * var34 >> 12, var26, var22);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field2186[0];
            int var39 = this.field2194[0] << 12;
            int var40 = this.field2185 * var39 >> 12;
            int var41 = this.field2189 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            if (~var41 >= ~var44) {
                var44 = 0;
            }
            int var45 = var42 & 4095;
            int var46 = this.field2196[255 & var44] & 255;
            int var47 = class439.field6019[var45];
            int var48 = this.field2196[255 & var43] & 255;
            if (this.field2190) {
                for (int var49 = 0; class399.field5585 > var49; ++var49) {
                    int var50 = class436.field5989[var49] * this.field2185;
                    int var51 = this.method925(var45, (byte) 74, var47, var48, var39 * var50 >> 12, var46, var40);
                    int var52 = var38 * var51 >> 12;
                    arg2[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class399.field5585; ++var53) {
                    int var54 = class436.field5989[var53] * this.field2185;
                    int var55 = this.method925(var45, (byte) 61, var47, var48, var39 * var54 >> 12, var46, var40);
                    arg2[var53] = var38 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IBIIIII)I", line = 310)
    private final int method925(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2198;
        int var8 = arg4 >> 12;
        int var9 = var8 + 1;
        if (~arg6 >= ~var9) {
            var9 = 0;
        }
        int var10 = arg4 & 4095;
        int var11 = var8 & 255;
        int var12 = var9 & 255;
        int var13 = var10 + -4096;
        int var14 = arg0 + -4096;
        int var15 = this.field2196[arg3 + var11] & 3;
        int var16 = class439.field6019[var10];
        int var17;
        if (var15 <= 1) {
            var17 = var15 != 0 ? -var10 + arg0 : arg0 + var10;
        } else {
            var17 = var15 == 2 ? -arg0 + var10 : -var10 - arg0;
        }
        int var18 = this.field2196[arg3 + var12] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = var18 != 0 ? -var13 + arg0 : arg0 + var13;
        } else {
            var19 = var18 != 2 ? -var13 - arg0 : -arg0 + var13;
        }
        int var20 = -45 % ((arg1 - -31) / 54);
        int var21 = ((-var17 + var19) * var16 >> 12) + var17;
        int var22 = this.field2196[arg5 + var11] & 3;
        int var23;
        if (~var22 < -2) {
            var23 = ~var22 == -3 ? -var14 + var10 : -var10 + -var14;
        } else {
            var23 = ~var22 != -1 ? -var10 + var14 : var10 + var14;
        }
        int var24 = this.field2196[arg5 + var12] & 3;
        int var25;
        if (~var24 < -2) {
            var25 = ~var24 == -3 ? -var14 + var13 : -var13 - var14;
        } else {
            var25 = ~var24 == -1 ? var13 + var14 : -var13 + var14;
        }
        int var26 = ((-var23 + var25) * var16 >> 12) + var23;
        return ((-var21 + var26) * arg2 >> 12) + var21;
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)Lwj;", line = 387)
    public static final class334 method926(byte arg0) {
        ++field2188;
        if (arg0 != -92) {
            field2197 = null;
        }
        class330.field4542 = 0;
        return class256.method1590(arg0 + 13984);
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V", line = 399)
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "(I)V", line = 415)
    public static void method927(int arg0) {
        field2197 = null;
        if (arg0 < 71) {
            field2197 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Llk;II)V", line = 442)
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 == -7) {
                                    this.field2189 = arg0.method2503(true);
                                }
                            } else {
                                this.field2185 = arg0.method2503(true);
                            }
                        } else {
                            this.field2195 = arg0.method2503(true);
                        }
                    } else {
                        this.field2185 = this.field2189 = arg0.method2503(true);
                    }
                } else {
                    this.field2193 = arg0.method2514(9786);
                    if (~this.field2193 > -1) {
                        this.field2186 = new short[this.field2199];
                        for (int var5 = 0; ~var5 > ~this.field2199; ++var5) {
                            this.field2186[var5] = (short) arg0.method2514(9786);
                        }
                    }
                }
            } else {
                this.field2199 = arg0.method2503(true);
            }
        } else {
            this.field2190 = arg0.method2503(true) == 1;
        }
        if (arg1 > -114) {
            this.field2190 = true;
        }
        ++field2200;
    }

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "(I)Z", line = 539)
    public static final boolean method928(int arg0) {
        int var1 = 93 / ((27 - arg0) / 45);
        ++field2201;
        return class96.field1373 != class396.field5558 || ~class159.field2292 <= -3;
    }

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)V", line = 564)
    public static final void method929(int arg0) {
        ++field2205;
        class70.field1032.method656(124);
        if (arg0 >= -10) {
            method923(-86, 67, -5, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "(B)V", line = 575)
    private final void method930(byte arg0) {
        ++field2187;
        if (arg0 != 60) {
            this.field2194 = null;
        }
        if (~this.field2193 < -1) {
            this.field2186 = new short[this.field2199];
            this.field2194 = new short[this.field2199];
            for (int var2 = 0; var2 < this.field2199; ++var2) {
                this.field2186[var2] = (short) ((int) (Math.pow((double) ((float) this.field2193 / 4096.0F), (double) var2) * 4096.0D));
                this.field2194[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2186 != null && this.field2186.length == this.field2199) {
            this.field2194 = new short[this.field2199];
            for (int var3 = 0; ~this.field2199 < ~var3; ++var3) {
                this.field2194[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }
}
