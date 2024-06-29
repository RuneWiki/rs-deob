import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class93 extends class262 {

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    public int field1487 = 4;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    public int field1488 = 0;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public int field1485 = 1638;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "Z")
    public boolean field1495 = true;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "[B")
    private byte[] field1498 = new byte[512];

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
    public int field1502 = 4;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "I")
    public int field1499 = 4;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "[I")
    public static int[] field1493 = new int[500];

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    public static int field1494 = 64;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "[I")
    public static int[] field1500 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!q", name = "S", descriptor = "Lhf;")
    public static class195 field1489 = new class195(64);

    @OriginalMember(owner = "client!q", name = "jb", descriptor = "Lok;")
    public static class146 field1506 = class235.method1724(-12908, "<col=ffffff>");

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "[S")
    private short[] field1486;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "[S")
    private short[] field1497;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[II)V", line = 7)
    public final void method639(int arg0, int[] arg1, int arg2) {
        field1491++;
        int var4 = class312.field5326[arg2] * this.field1487;
        if (arg0 != 255) {
            this.method643(-90, -46, 39, 105, 89, -120, 30);
        }
        if (this.field1502 == 1) {
            int var5 = this.field1486[0] << 12;
            short var6 = this.field1497[0];
            int var7 = this.field1499 * var5 >> 12;
            int var8 = var4 * var5 >> 12;
            int var9 = var8 >> 12;
            int var10 = var8 & 0xFFF;
            int var11 = class261.field4335[var10];
            int var12 = this.field1487 * var5 >> 12;
            int var13 = var9 + 1;
            int var14 = this.field1498[var9 & 0xFF] & 0xFF;
            if (var13 >= var12) {
                var13 = 0;
            }
            int var15 = this.field1498[var13 & 0xFF] & 0xFF;
            if (this.field1495) {
                for (int var19 = 0; var19 < class98.field1598; var19++) {
                    int var20 = class210.field3485[var19] * this.field1499;
                    int var21 = this.method643(var14, 5498, var15, var11, var5 * var20 >> 12, var7, var10);
                    int var22 = var6 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            } else {
                for (int var16 = 0; var16 < class98.field1598; var16++) {
                    int var17 = class210.field3485[var16] * this.field1499;
                    int var18 = this.method643(var14, 5498, var15, var11, var5 * var17 >> 12, var7, var10);
                    arg1[var16] = var6 * var18 >> 12;
                }
            }
            return;
        }
        short var23 = this.field1497[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field1486[0] << 12;
            int var25 = this.field1499 * var24 >> 12;
            int var26 = this.field1487 * var24 >> 12;
            int var27 = var4 * var24 >> 12;
            int var28 = var27 >> 12;
            int var29 = var27 & 0xFFF;
            int var30 = class261.field4335[var29];
            int var31 = var28 + 1;
            if (var31 >= var26) {
                var31 = 0;
            }
            int var32 = this.field1498[var31 & 0xFF] & 0xFF;
            int var33 = this.field1498[var28 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class98.field1598; var34++) {
                int var35 = class210.field3485[var34] * this.field1499;
                int var36 = this.method643(var33, 5498, var32, var30, var24 * var35 >> 12, var25, var29);
                arg1[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field1502; var37++) {
            short var38 = this.field1497[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field1486[var37] << 12;
                int var40 = this.field1487 * var39 >> 12;
                int var41 = var4 * var39 >> 12;
                int var42 = this.field1499 * var39 >> 12;
                int var43 = var41 >> 12;
                int var44 = var41 & 0xFFF;
                int var45 = var43 + 1;
                int var46 = class261.field4335[var44];
                int var47 = this.field1498[var43 & 0xFF] & 0xFF;
                if (var45 >= var40) {
                    var45 = 0;
                }
                int var48 = this.field1498[var45 & 0xFF] & 0xFF;
                if (this.field1495 && this.field1502 - 1 == var37) {
                    for (int var49 = 0; var49 < class98.field1598; var49++) {
                        int var50 = class210.field3485[var49] * this.field1499;
                        int var51 = this.method643(var47, 5498, var48, var46, var39 * var50 >> 12, var42, var44);
                        int var52 = arg1[var49] + (var38 * var51 >> 12);
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class98.field1598; var53++) {
                        int var54 = class210.field3485[var53] * this.field1499;
                        int var55 = this.method643(var47, 5498, var48, var46, var39 * var54 >> 12, var42, var44);
                        arg1[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 489)
    public class93() {
        super(0, true);
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V", line = 173)
    public final void method43(int arg0) {
        field1504++;
        this.field1498 = class211.method1584(this.field1488, (byte) 93);
        this.method641(-66);
        for (int var2 = this.field1502 - 1; var2 >= 1; var2--) {
            short var3 = this.field1497[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1502--;
        }
        if (arg0 != -2) {
            this.method38(-75, (byte) 54);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Loh;Loh;I)V", line = 203)
    public static final void method640(class15 arg0, class15 arg1, int arg2) {
        field1496++;
        if (arg2 != 26714) {
            return;
        }
        class274.field4725 = class211.method1585(arg0, class100.field1618, arg1, (byte) 106, 0);
        if (class271.field4640) {
            class144.field2395 = class170.method1320(arg0, 0, class100.field1618, 86, arg1);
        } else {
            class144.field2395 = (class90) class274.field4725;
        }
        class187.field3109 = class211.method1585(arg0, class196.field3266, arg1, (byte) 106, 0);
        class39.field695 = class211.method1585(arg0, class94.field1512, arg1, (byte) 106, 0);
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V", line = 235)
    private final void method641(int arg0) {
        int var2 = -65 / ((arg0 + 4) / 52);
        field1503++;
        if (this.field1485 > 0) {
            this.field1486 = new short[this.field1502];
            this.field1497 = new short[this.field1502];
            for (int var4 = 0; var4 < this.field1502; var4++) {
                this.field1497[var4] = (short) ((int) (Math.pow((double) ((float) this.field1485 / 4096.0F), (double) var4) * 4096.0D));
                this.field1486[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        } else if (this.field1497 != null && this.field1497.length == this.field1502) {
            this.field1486 = new short[this.field1502];
            for (int var3 = 0; var3 < this.field1502; var3++) {
                this.field1486[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V", line = 275)
    public static void method642(boolean arg0) {
        field1489 = null;
        field1493 = null;
        field1500 = null;
        if (!arg0) {
            field1493 = (int[]) null;
        }
        field1506 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIII)I", line = 294)
    private final int method643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - 4096;
        field1505++;
        int var9 = arg4 >> 12;
        int var10 = var9 + 1;
        int var11 = var9 & 0xFF;
        int var12 = arg4 & 0xFFF;
        if (arg5 <= var10) {
            var10 = 0;
        }
        int var13 = class261.field4335[var12];
        int var14 = var10 & 0xFF;
        int var15 = this.field1498[arg0 + var11] & 0x3;
        int var16;
        if (var15 <= 1) {
            var16 = var15 == 0 ? var12 + arg6 : -var12 + arg6;
        } else {
            var16 = var15 == 2 ? var12 - arg6 : -arg6 + -var12;
        }
        int var17 = var12 - 4096;
        if (arg1 != 5498) {
            return 11;
        }
        int var18 = this.field1498[arg0 + var14] & 0x3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 == 0 ? arg6 + var17 : -var17 + arg6;
        } else {
            var19 = var18 == 2 ? var17 - arg6 : -arg6 + -var17;
        }
        int var20 = this.field1498[arg2 + var11] & 0x3;
        int var21 = ((var19 - var16) * var13 >> 12) + var16;
        int var22;
        if (var20 <= 1) {
            var22 = var20 == 0 ? var8 + var12 : var8 - var12;
        } else {
            var22 = var20 == 2 ? var12 - var8 : -var12 - var8;
        }
        int var23 = this.field1498[arg2 + var14] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var17 - var8 : -var8 + -var17;
        } else {
            var24 = var23 == 0 ? var17 + var8 : var8 - var17;
        }
        int var25 = ((var24 - var22) * var13 >> 12) + var22;
        return ((var25 - var21) * arg3 >> 12) + var21;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lwe;II)V", line = 371)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field1492++;
        if (arg1 != 2048) {
            this.field1502 = 121;
        }
        if (arg2 == 0) {
            this.field1495 = arg0.method368(-105) == 1;
        } else if (arg2 == 1) {
            this.field1502 = arg0.method368(-106);
        } else if (arg2 == 2) {
            this.field1485 = arg0.method343(arg1 ^ 0x6E37);
            if (this.field1485 < 0) {
                this.field1497 = new short[this.field1502];
                for (int var5 = 0; var5 < this.field1502; var5++) {
                    this.field1497[var5] = (short) arg0.method343(26167);
                }
            }
        } else if (arg2 == 3) {
            this.field1499 = this.field1487 = arg0.method368(-128);
        } else if (arg2 == 4) {
            this.field1488 = arg0.method368(31);
        } else if (arg2 == 5) {
            this.field1499 = arg0.method368(-104);
        } else if (arg2 == 6) {
            this.field1487 = arg0.method368(-112);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)[I", line = 466)
    public final int[] method38(int arg0, byte arg1) {
        field1490++;
        int[] var3 = this.field4350.method1532(arg0, (byte) 89);
        if (arg1 >= -85) {
            return (int[]) null;
        } else {
            if (this.field4350.field3333) {
                this.method639(255, var3, arg0);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V", line = 509)
    public static final void method644(int arg0) {
        field1501++;
        class47.field820.method1656(51, 16);
        if (arg0 != 0) {
            method644(15);
        }
        class156.field2609++;
        class47.field820.method332(class157.method1228(1), 92);
        class47.field820.method361(class148.field2518, 1635554120);
        class47.field820.method361(class56.field997, 1635554120);
        class47.field820.method332(class147.field2502, 71);
    }
}
