import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "[I")
    private int[] field503;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[B")
    private byte[] field501;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
    private int[] field497;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lpe;")
    private static class109 field499 = class141.method1120("Hidden", 0);

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lpe;")
    public static class109 field498 = class141.method1120("(U3", 0);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lpe;")
    public static class109 field494 = field499;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lpe;")
    public static class109 field500 = null;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lbc;")
    public static class11 field495 = new class11(64);

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field507 = -1;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lpe;")
    public static class109 field510 = class141.method1120("Anmelde)2Limit -Uberschritten)3", 0);

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field509 = -1;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lpe;")
    public static class109 field508 = class141.method1120("auf einer freien Welt zu spielen)3", 0);

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lna;")
    public static class91 field511;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B[BI[BII)I")
    public final int method201(byte arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        if (arg0 >= -71) {
            return -64;
        }
        field506++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg4;
        int var9 = arg5;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field503[var7];
            }
            int var11;
            if ((var11 = this.field503[var7]) < 0) {
                arg1[arg4++] = (byte) ~var11;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field503[var7];
            }
            int var12;
            if ((var12 = this.field503[var7]) < 0) {
                arg1[arg4++] = (byte) ~var12;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field503[var7];
            }
            int var13;
            if ((var13 = this.field503[var7]) < 0) {
                arg1[arg4++] = (byte) ~var13;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field503[var7];
            }
            int var14;
            if ((var14 = this.field503[var7]) < 0) {
                arg1[arg4++] = (byte) ~var14;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field503[var7];
            }
            int var15;
            if ((var15 = this.field503[var7]) < 0) {
                arg1[arg4++] = (byte) ~var15;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field503[var7];
            }
            int var16;
            if ((var16 = this.field503[var7]) < 0) {
                arg1[arg4++] = (byte) ~var16;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field503[var7];
            }
            int var17;
            if ((var17 = this.field503[var7]) < 0) {
                arg1[arg4++] = (byte) ~var17;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field503[var7];
            }
            int var18;
            if ((var18 = this.field503[var7]) < 0) {
                arg1[arg4++] = (byte) ~var18;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method202(int arg0) {
        field510 = null;
        if (arg0 != -1) {
            field498 = null;
        }
        field508 = null;
        field499 = null;
        field494 = null;
        field498 = null;
        field500 = null;
        field495 = null;
        field511 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLpe;)I")
    public static final int method203(byte arg0, class109 arg1) {
        field504++;
        if (class89.field1887 == 1) {
            return 7;
        } else if (arg1.method886(class61.field1213, arg0 ^ 0x10)) {
            return 1;
        } else if (arg1.method886(class94.field2032, arg0 ^ 0x1E)) {
            return 1;
        } else if (arg1.method886(class11.field252, 107)) {
            return 2;
        } else if (arg1.method886(class143.field3132, 113)) {
            return 2;
        } else if (arg1.method886(class60.field1166, 112)) {
            return 3;
        } else if (arg0 != 75) {
            return 34;
        } else if (arg1.method886(class119.field2641, 88)) {
            return 4;
        } else if (arg1.method886(class49.field1011, 95)) {
            return 4;
        } else if (arg1.method886(class66.field1340, 114)) {
            return 5;
        } else if (arg1.method886(class16.field406, 127)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lwa;B)Z")
    public static final boolean method204(class154 arg0, byte arg1) {
        field496++;
        if (arg0.field3483 == null) {
            return false;
        }
        if (arg1 >= -83) {
            method205(null, true, 23, 116, null, null);
        }
        for (int var2 = 0; var2 < arg0.field3483.length; var2++) {
            int var3 = class67.method523(var2, arg0, 122);
            int var4 = arg0.field3389[var2];
            if (arg0.field3483[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field3483[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field3483[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lna;ZIILpe;Lpe;)V")
    public static final void method205(class91 arg0, boolean arg1, int arg2, int arg3, class109 arg4, class109 arg5) {
        int var6 = arg0.method766(-110, arg5);
        field505++;
        int var7 = arg0.method743((byte) 127, arg4, var6);
        if (arg2 != -31711) {
            method203((byte) 121, null);
        }
        class127.method1032(var7, var6, arg0, arg1, (byte) 66, arg3);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB[BI[BI)I")
    public final int method206(int arg0, byte arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field502++;
        int var7 = arg0 + arg5;
        int var8 = 0;
        int var9 = arg3 << 3;
        while (var7 > arg5) {
            int var10 = arg4[arg5] & 0xFF;
            int var11 = this.field497[var10];
            byte var12 = this.field501[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var13 + (var12 + var14 - 1 >> 3);
            var9 += var12;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var8 = class137.method1089(var16, var11 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var8 = var11 >>> var14);
                        if (var15 > var13) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        if (arg1 != -59) {
            method205(null, false, 116, 76, null, null);
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([B)V")
    public class20(byte[] arg0) {
        int var2 = arg0.length;
        this.field503 = new int[8];
        this.field501 = arg0;
        this.field497 = new int[var2];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field497[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class137.method1089(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field503[var14] == 0) {
                            this.field503[var14] = var4;
                        }
                        var14 = this.field503[var14];
                    }
                    if (var14 >= this.field503.length) {
                        int[] var17 = new int[this.field503.length * 2];
                        for (int var18 = 0; var18 < this.field503.length; var18++) {
                            var17[var18] = this.field503[var18];
                        }
                        this.field503 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field503[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
