import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class288 extends class285 {

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public int field4605 = 0;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public int field4614 = 4;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "[B")
    private byte[] field4604 = new byte[512];

    @OriginalMember(owner = "client!de", name = "db", descriptor = "I")
    public int field4619 = 1638;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    public int field4610 = 4;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
    public int field4622 = 4;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Z")
    public boolean field4608 = true;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Lgi;")
    public static class109 field4609 = new class109(128);

    @OriginalMember(owner = "client!de", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4611 = "M";

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "Lak;")
    public static class172 field4615;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "[S")
    private short[] field4618;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "[S")
    private short[] field4620;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)V", line = 5)
    private final void method2065(byte arg0) {
        field4621++;
        if (this.field4619 > 0) {
            this.field4618 = new short[this.field4610];
            this.field4620 = new short[this.field4610];
            for (int var3 = 0; var3 < this.field4610; var3++) {
                this.field4618[var3] = (short) ((int) (Math.pow((double) ((float) this.field4619 / 4096.0F), (double) var3) * 4096.0D));
                this.field4620[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field4618 != null && this.field4618.length == this.field4610) {
            this.field4620 = new short[this.field4610];
            for (int var2 = 0; var2 < this.field4610; var2++) {
                this.field4620[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0 <= 18) {
            this.method361(-24);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([III)V", line = 53)
    public final void method2066(int[] arg0, int arg1, int arg2) {
        field4612++;
        int var4 = class27.field382[arg2] * this.field4622;
        if (arg1 != 0) {
            return;
        }
        if (this.field4610 == 1) {
            short var38 = this.field4618[0];
            int var39 = this.field4620[0] << 12;
            int var40 = var4 * var39 >> 12;
            int var41 = this.field4614 * var39 >> 12;
            int var42 = this.field4622 * var39 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            int var45 = var40 & 0xFFF;
            if (var42 <= var44) {
                var44 = 0;
            }
            int var46 = this.field4604[var44 & 0xFF] & 0xFF;
            int var47 = class116.field1763[var45];
            int var48 = this.field4604[var43 & 0xFF] & 0xFF;
            if (this.field4608) {
                for (int var49 = 0; var49 < class287.field4599; var49++) {
                    int var50 = class48.field669[var49] * this.field4614;
                    int var51 = this.method2067(var39 * var50 >> 12, var45, var46, var41, 100, var47, var48);
                    int var52 = var38 * var51 >> 12;
                    arg0[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class287.field4599; var53++) {
                    int var54 = class48.field669[var53] * this.field4614;
                    int var55 = this.method2067(var39 * var54 >> 12, var45, var46, var41, 89, var47, var48);
                    arg0[var53] = var38 * var55 >> 12;
                }
            }
            return;
        }
        short var5 = this.field4618[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field4620[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field4622 * var6 >> 12;
            int var9 = this.field4614 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 + 1;
            if (var11 >= var8) {
                var11 = 0;
            }
            int var12 = this.field4604[var10 & 0xFF] & 0xFF;
            int var13 = this.field4604[var11 & 0xFF] & 0xFF;
            int var14 = var7 & 0xFFF;
            int var15 = class116.field1763[var14];
            for (int var16 = 0; var16 < class287.field4599; var16++) {
                int var17 = class48.field669[var16] * this.field4614;
                int var18 = this.method2067(var6 * var17 >> 12, var14, var13, var9, -108, var15, var12);
                arg0[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field4610; var19++) {
            short var20 = this.field4618[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field4620[var19] << 12;
                int var22 = this.field4614 * var21 >> 12;
                int var23 = this.field4622 * var21 >> 12;
                int var24 = var4 * var21 >> 12;
                int var25 = var24 >> 12;
                int var26 = var25 + 1;
                int var27 = this.field4604[var25 & 0xFF] & 0xFF;
                int var28 = var24 & 0xFFF;
                int var29 = class116.field1763[var28];
                if (var26 >= var23) {
                    var26 = 0;
                }
                int var30 = this.field4604[var26 & 0xFF] & 0xFF;
                if (this.field4608 && (this.field4610 - 1) == var19) {
                    for (int var31 = 0; var31 < class287.field4599; var31++) {
                        int var32 = class48.field669[var31] * this.field4614;
                        int var33 = this.method2067(var21 * var32 >> 12, var28, var30, var22, 93, var29, var27);
                        int var34 = (var20 * var33 >> 12) + arg0[var31];
                        arg0[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class287.field4599; var35++) {
                        int var36 = class48.field669[var35] * this.field4614;
                        int var37 = this.method2067(var21 * var36 >> 12, var28, var30, var22, arg1 ^ 0x74, var29, var27);
                        arg0[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)[I", line = 213)
    public final int[] method60(boolean arg0, int arg1) {
        field4623++;
        int[] var3 = this.field4573.method1116(116, arg1);
        if (arg0) {
            if (this.field4573.field2420) {
                this.method2066(var3, 0, arg1);
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLjj;I)V", line = 242)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field4616++;
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            this.field4608 = arg1.method286((byte) -114) == 1;
        } else if (arg2 == 1) {
            this.field4610 = arg1.method286((byte) -87);
        } else if (arg2 == 2) {
            this.field4619 = arg1.method228(true);
            if (this.field4619 < 0) {
                this.field4618 = new short[this.field4610];
                for (int var5 = 0; var5 < this.field4610; var5++) {
                    this.field4618[var5] = (short) arg1.method228(true);
                }
            }
        } else if (arg2 == 3) {
            this.field4614 = this.field4622 = arg1.method286((byte) -81);
        } else if (arg2 == 4) {
            this.field4605 = arg1.method286((byte) -128);
        } else if (arg2 == 5) {
            this.field4614 = arg1.method286((byte) -88);
        } else if (arg2 == 6) {
            this.field4622 = arg1.method286((byte) -98);
        }
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V", line = 336)
    public final void method361(int arg0) {
        this.field4604 = class34.method183(this.field4605, -14115);
        field4624++;
        this.method2065((byte) 29);
        int var2 = 12 / ((arg0 - 42) / 36);
        for (int var3 = this.field4610 - 1; var3 >= 1; var3--) {
            short var4 = this.field4618[var3];
            if (var4 > 8 || var4 < -8) {
                break;
            }
            this.field4610--;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIII)I", line = 371)
    private final int method2067(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4606++;
        int var8 = arg1 - 4096;
        int var9 = 69 % ((arg4 - 57) / 32);
        int var10 = arg0 >> 12;
        int var11 = arg0 & 0xFFF;
        int var12 = class116.field1763[var11];
        int var13 = var11 - 4096;
        int var14 = var10 + 1;
        if (arg3 <= var14) {
            var14 = 0;
        }
        int var15 = var14 & 0xFF;
        int var16 = var10 & 0xFF;
        int var17 = this.field4604[var16 + arg6] & 0x3;
        int var18;
        if (var17 <= 1) {
            var18 = var17 == 0 ? var11 + arg1 : -var11 + arg1;
        } else {
            var18 = var17 == 2 ? var11 - arg1 : -arg1 + -var11;
        }
        int var19 = this.field4604[var15 + arg6] & 0x3;
        int var20;
        if (var19 > 1) {
            var20 = var19 == 2 ? var13 - arg1 : -arg1 + -var13;
        } else {
            var20 = var19 == 0 ? arg1 + var13 : arg1 - var13;
        }
        int var21 = this.field4604[var16 + arg2] & 0x3;
        int var22 = ((var20 - var18) * var12 >> 12) + var18;
        int var23;
        if (var21 <= 1) {
            var23 = var21 == 0 ? var8 + var11 : -var11 + var8;
        } else {
            var23 = var21 == 2 ? var11 - var8 : -var11 - var8;
        }
        int var24 = this.field4604[arg2 + var15] & 0x3;
        int var25;
        if (var24 > 1) {
            var25 = var24 == 2 ? var13 - var8 : -var8 + -var13;
        } else {
            var25 = var24 == 0 ? var8 + var13 : -var13 + var8;
        }
        int var26 = var23 + ((var25 - var23) * var12 >> 12);
        return ((var26 - var22) * arg5 >> 12) + var22;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 499)
    public class288() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V", line = 457)
    public static final void method2068(int arg0, byte arg1) {
        field4617++;
        for (class165 var2 = class60.field839.method458((byte) -16); var2 != null; var2 = class60.field839.method455((byte) 116)) {
            if ((var2.field2744 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method1212((byte) 86);
            }
        }
        int var3 = -53 % ((-arg1 - 7) / 48);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V", line = 478)
    public static void method2069(byte arg0) {
        field4615 = null;
        field4609 = null;
        field4611 = null;
        int var1 = 32 / ((56 - arg0) / 42);
    }
}
