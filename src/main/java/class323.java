import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class323 extends class232 {

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "Z")
    public boolean field5542 = true;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "[B")
    private byte[] field5544 = new byte[512];

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "I")
    public int field5551 = 4;

    @OriginalMember(owner = "client!fm", name = "bb", descriptor = "I")
    public int field5554 = 1638;

    @OriginalMember(owner = "client!fm", name = "cb", descriptor = "I")
    public int field5555 = 0;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public int field5543 = 4;

    @OriginalMember(owner = "client!fm", name = "gb", descriptor = "I")
    public int field5559 = 4;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "Z")
    public static boolean field5547 = false;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field5545 = 0;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!fm", name = "db", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!fm", name = "eb", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!fm", name = "fb", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!fm", name = "hb", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "[S")
    private short[] field5550;

    @OriginalMember(owner = "client!fm", name = "ib", descriptor = "[S")
    private short[] field5561;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 159)
    public class323() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)Lem;", line = 12)
    public static final class90 method2227(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class90 var4 = var3.field171;
            var3.field171 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V", line = 26)
    public final void method144(int arg0) {
        this.field5544 = class13.method73(this.field5555, 123);
        field5549++;
        this.method2232(1);
        for (int var2 = this.field5551 - 1; var2 >= 1; var2--) {
            short var3 = this.field5561[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field5551--;
        }
        if (arg0 <= 48) {
            this.field5554 = -28;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBLbc;)V", line = 81)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field5542 = arg2.method1082(-27) == 1;
        } else if (arg0 == 1) {
            this.field5551 = arg2.method1082(-48);
        } else if (arg0 == 2) {
            this.field5554 = arg2.method1052(31521);
            if (this.field5554 < 0) {
                this.field5561 = new short[this.field5551];
                for (int var5 = 0; var5 < this.field5551; var5++) {
                    this.field5561[var5] = (short) arg2.method1052(arg1 + 31540);
                }
            }
        } else if (arg0 == 3) {
            this.field5543 = this.field5559 = arg2.method1082(-46);
        } else if (arg0 == 4) {
            this.field5555 = arg2.method1082(-90);
        } else if (arg0 == 5) {
            this.field5543 = arg2.method1082(arg1 ^ 0x62);
        } else if (arg0 == 6) {
            this.field5559 = arg2.method1082(-117);
        }
        field5557++;
        if (arg1 != -19) {
            method2231(8, -103, 66, 74, 109, -98, -100, -20, (class175) null, -86, true, 56L);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIBI)I", line = 164)
    private final int method2228(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field5548++;
        int var8 = 12 / ((arg5 - 19) / 60);
        int var9 = arg6 - 4096;
        int var10 = arg3 >> 12;
        int var11 = arg3 & 0xFFF;
        int var12 = var11 - 4096;
        int var13 = var10 + 1;
        if (var13 >= arg0) {
            var13 = 0;
        }
        int var14 = class56.field900[var11];
        int var15 = var10 & 0xFF;
        int var16 = var13 & 0xFF;
        int var17 = this.field5544[arg2 + var15] & 0x3;
        int var18;
        if (var17 > 1) {
            var18 = var17 == 2 ? var11 - arg6 : -var11 - arg6;
        } else {
            var18 = var17 == 0 ? var11 + arg6 : -var11 + arg6;
        }
        int var19 = this.field5544[arg2 + var16] & 0x3;
        int var20;
        if (var19 > 1) {
            var20 = var19 == 2 ? var12 - arg6 : -arg6 + -var12;
        } else {
            var20 = var19 == 0 ? arg6 + var12 : -var12 + arg6;
        }
        int var21 = var18 + ((var20 - var18) * var14 >> 12);
        int var22 = this.field5544[arg1 + var15] & 0x3;
        int var23;
        if (var22 > 1) {
            var23 = var22 == 2 ? var11 - var9 : -var9 + -var11;
        } else {
            var23 = var22 == 0 ? var9 + var11 : var9 - var11;
        }
        int var24 = this.field5544[var16 + arg1] & 0x3;
        int var25;
        if (var24 > 1) {
            var25 = var24 == 2 ? var12 - var9 : -var12 - var9;
        } else {
            var25 = var24 == 0 ? var9 + var12 : -var12 + var9;
        }
        int var26 = var23 + ((var25 - var23) * var14 >> 12);
        return ((var26 - var21) * arg4 >> 12) + var21;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 245)
    public static final void method2229(boolean arg0) {
        if (!arg0) {
            method2231(-103, 74, -5, -110, 45, -70, -125, 49, (class175) null, 38, false, 58L);
        }
        field5558++;
        class189.field3166.method2172(!arg0);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(IB)[I", line = 259)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = 110 % ((arg1 + 31) / 55);
        field5552++;
        int[] var4 = this.field4008.method131((byte) -112, arg0);
        if (this.field4008.field256) {
            this.method2233(var4, true, arg0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lhi;BZ)V", line = 280)
    public static final void method2230(class82 arg0, byte arg1, boolean arg2) {
        field5560++;
        if (arg1 < 59) {
            return;
        }
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class138.field2364.method107(arg0, 250);
        int var6 = var3 + 6;
        int var7 = class138.field2364.method128(arg0, 250) * 13;
        if (class147.field2485) {
            class116.method784(var4 - var3, -var3 + var6, var3 + var3 + var5, var7 - -var3 + var3, 0);
            class116.method786(var4 - var3, -var3 + var6, var5 + var3 + var3, var7 - (-var3 + -var3), 16777215);
        } else {
            class320.method2217(var4 - var3, var6 - var3, var3 + var5 + var3, var7 - -var3 + var3, 0);
            class320.method2207(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 - -var3, 16777215);
        }
        class138.field2364.method103(arg0, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class143.method977(var4 - var3, var3 + var5 + var3, var3 + var3 + var7, true, var6 - var3);
        if (!arg2) {
            class69.method434(18643, var6, var7, var4, var5);
        } else if (class147.field2485) {
            class147.method993();
        } else {
            try {
                Graphics var8 = class122.field2134.getGraphics();
                class321.field5534.method1215(0, var8, 0, false);
            } catch (Exception var10) {
                class122.field2134.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIILrm;IZJ)Z", line = 347)
    public static final boolean method2231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class175 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class245.field4255 == class150.field2560;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class89.field1605 || var16 >= class38.field658) {
                    return false;
                }
                class16 var17 = class15.field120[arg0][var15][var16];
                if (var17 != null && var17.field165 >= 5) {
                    return false;
                }
            }
        }
        class69 var18 = new class69();
        var18.field1064 = arg11;
        var18.field1071 = arg0;
        var18.field1067 = arg5;
        var18.field1072 = arg6;
        var18.field1078 = arg7;
        var18.field1075 = arg8;
        var18.field1074 = arg9;
        var18.field1076 = arg1;
        var18.field1080 = arg2;
        var18.field1068 = arg1 + arg3 - 1;
        var18.field1083 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class15.field120[var22][var19][var20] == null) {
                        class15.field120[var22][var19][var20] = new class16(var22, var19, var20);
                    }
                }
                class16 var23 = class15.field120[arg0][var19][var20];
                var23.field158[var23.field165] = var18;
                var23.field174[var23.field165] = var21;
                var23.field155 |= var21;
                var23.field165++;
                if (var13 && class283.field4746[var19][var20] != 0) {
                    var14 = class283.field4746[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class283.field4746[var24][var25] == 0) {
                        class283.field4746[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class164.field2878[class33.field491++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "(I)V", line = 468)
    private final void method2232(int arg0) {
        field5546++;
        if (arg0 != 1) {
            return;
        }
        if (this.field5554 > 0) {
            this.field5550 = new short[this.field5551];
            this.field5561 = new short[this.field5551];
            for (int var3 = 0; var3 < this.field5551; var3++) {
                this.field5561[var3] = (short) ((int) (Math.pow((double) ((float) this.field5554 / 4096.0F), (double) var3) * 4096.0D));
                this.field5550[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field5561 != null && this.field5561.length == this.field5551) {
            this.field5550 = new short[this.field5551];
            for (int var2 = 0; var2 < this.field5551; var2++) {
                this.field5550[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([IZI)V", line = 507)
    public final void method2233(int[] arg0, boolean arg1, int arg2) {
        field5553++;
        int var4 = class273.field4607[arg2] * this.field5559;
        if (!arg1) {
            field5545 = -15;
        }
        if (this.field5551 == 1) {
            int var38 = this.field5550[0] << 12;
            int var39 = this.field5559 * var38 >> 12;
            int var40 = var4 * var38 >> 12;
            int var41 = var40 >> 12;
            int var42 = this.field5544[var41 & 0xFF] & 0xFF;
            short var43 = this.field5561[0];
            int var44 = this.field5543 * var38 >> 12;
            int var45 = var41 + 1;
            int var46 = var40 & 0xFFF;
            if (var45 >= var39) {
                var45 = 0;
            }
            int var47 = class56.field900[var46];
            int var48 = this.field5544[var45 & 0xFF] & 0xFF;
            if (this.field5542) {
                for (int var52 = 0; var52 < class54.field858; var52++) {
                    int var53 = class24.field329[var52] * this.field5543;
                    int var54 = this.method2228(var44, var48, var42, var38 * var53 >> 12, var47, (byte) 104, var46);
                    int var55 = var43 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class54.field858; var49++) {
                    int var50 = class24.field329[var49] * this.field5543;
                    int var51 = this.method2228(var44, var48, var42, var38 * var50 >> 12, var47, (byte) 125, var46);
                    arg0[var49] = var43 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field5561[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field5550[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field5559 * var6 >> 12;
            int var9 = this.field5543 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 + 1;
            int var12 = var7 & 0xFFF;
            if (var8 <= var11) {
                var11 = 0;
            }
            int var13 = class56.field900[var12];
            int var14 = this.field5544[var11 & 0xFF] & 0xFF;
            int var15 = this.field5544[var10 & 0xFF] & 0xFF;
            for (int var16 = 0; var16 < class54.field858; var16++) {
                int var17 = class24.field329[var16] * this.field5543;
                int var18 = this.method2228(var9, var14, var15, var6 * var17 >> 12, var13, (byte) -70, var12);
                arg0[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field5551; var19++) {
            short var20 = this.field5561[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field5550[var19] << 12;
                int var22 = this.field5559 * var21 >> 12;
                int var23 = var4 * var21 >> 12;
                int var24 = var23 >> 12;
                int var25 = this.field5543 * var21 >> 12;
                int var26 = this.field5544[var24 & 0xFF] & 0xFF;
                int var27 = var24 + 1;
                int var28 = var23 & 0xFFF;
                if (var22 <= var27) {
                    var27 = 0;
                }
                int var29 = this.field5544[var27 & 0xFF] & 0xFF;
                int var30 = class56.field900[var28];
                if (this.field5542 && (this.field5551 - 1) == var19) {
                    for (int var31 = 0; var31 < class54.field858; var31++) {
                        int var32 = class24.field329[var31] * this.field5543;
                        int var33 = this.method2228(var25, var29, var26, var21 * var32 >> 12, var30, (byte) 98, var28);
                        int var34 = arg0[var31] + (var20 * var33 >> 12);
                        arg0[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class54.field858; var35++) {
                        int var36 = class24.field329[var35] * this.field5543;
                        int var37 = this.method2228(var25, var29, var26, var21 * var36 >> 12, var30, (byte) -116, var28);
                        arg0[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }
}
