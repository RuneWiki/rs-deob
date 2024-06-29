import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class643 {

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public int field9141;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public int field9133;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
    public int field9142;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public int field9140;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
    public static int[] field9134 = new int[32];

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "Lfc;")
    public static class235 field9139;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "Lln;")
    public static class345 field9138;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)I")
    public static final int method3580(int arg0, int arg1, int arg2) {
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (arg2 != 0) {
            field9138 = null;
        }
        field9136++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lih;")
    public final class643 method3581(byte arg0, int arg1) {
        if (arg0 != 57) {
            method3582(31);
        }
        field9135++;
        return new class643(this.field9140, arg1, this.field9133, this.field9142);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method3582(int arg0) {
        if (arg0 != 1) {
            method3583((byte) 66);
        }
        field9139 = null;
        field9134 = null;
        field9138 = null;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
    public static final void method3583(byte arg0) {
        field9137++;
        if (class274.field3872.method2440((byte) 43, class429.field6020) != 2) {
            return;
        }
        byte var1 = (byte) (class460.field6516 - 4 & 0xFF);
        int var2 = class460.field6516 % class86.field1185;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var17 = 0; var17 < class526.field7212; var17++) {
                class446.field6246[var3][var2][var17] = var1;
            }
        }
        if (class233.field3305 == 3) {
            return;
        }
        int var4 = -6 / ((arg0 - 17) / 57);
        for (int var5 = 0; var5 < 2; var5++) {
            class363.field5181[var5] = -1000000;
            class551.field7457[var5] = 1000000;
            class57.field802[var5] = 0;
            class166.field2516[var5] = 1000000;
            class245.field3496[var5] = 0;
        }
        if (class670.field9445 != 1) {
            int var6 = class203.method1355(class117.field1563, class172.field2572, 4, class233.field3305);
            if (var6 - class628.field8762 < 3200 && (class246.field3501[class233.field3305][class172.field2572 >> 9][class117.field1563 >> 9] & 0x4) != 0) {
                class264.method1606(class117.field1563 >> 9, class658.field9266, false, class172.field2572 >> 9, 1, (byte) -115);
            }
            return;
        }
        if ((class246.field3501[class233.field3305][class253.field3576.field509 >> 9][class253.field3576.field514 >> 9] & 0x4) != 0) {
            class264.method1606(class253.field3576.field514 >> 9, class658.field9266, false, class253.field3576.field509 >> 9, 0, (byte) -115);
        }
        if (class492.field6794 >= 2560) {
            return;
        }
        int var7 = class172.field2572 >> 9;
        int var8 = class117.field1563 >> 9;
        int var9 = class253.field3576.field509 >> 9;
        int var10 = class253.field3576.field514 >> 9;
        int var11;
        if (var9 <= var7) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        int var12;
        if (var10 > var8) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        if (!(var11 != 0 || var12 != 0) || -class86.field1185 >= var11 || class86.field1185 <= var11 || (-class526.field7212) >= var12 || var12 >= class526.field7212) {
            class139.method985((byte) -81, "RC: " + var7 + "," + var8 + " " + var9 + "," + var10 + " " + class511.field6989 + "," + class124.field1726, null);
        } else if (var12 >= var11) {
            int var13 = var11 * 65536 / var12;
            int var14 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var10 < var8) {
                    var8--;
                }
                if ((class246.field3501[class233.field3305][var7][var8] & 0x4) != 0) {
                    class264.method1606(var8, class658.field9266, false, var7, 1, (byte) -115);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var9 > var7) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    if ((class246.field3501[class233.field3305][var7][var8] & 0x4) != 0) {
                        class264.method1606(var8, class658.field9266, false, var7, 1, (byte) -115);
                        return;
                    }
                }
            }
        } else {
            int var15 = var12 * 65536 / var11;
            int var16 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class246.field3501[class233.field3305][var7][var8] & 0x4) != 0) {
                    class264.method1606(var8, class658.field9266, false, var7, 1, (byte) -115);
                    return;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var10 > var8) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    var16 -= 65536;
                    if ((class246.field3501[class233.field3305][var7][var8] & 0x4) != 0) {
                        class264.method1606(var8, class658.field9266, false, var7, 1, (byte) -115);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIII)V")
    public class643(int arg0, int arg1, int arg2, int arg3) {
        this.field9141 = arg1;
        this.field9133 = arg2;
        this.field9142 = arg3;
        this.field9140 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field9134[var1] = var0 - 1;
            var0 += var0;
        }
        field9139 = new class235(107, -1);
    }
}
