import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class62 extends class200 {

    @OriginalMember(owner = "client!ki", name = "Z", descriptor = "I")
    private int field1117 = 4;

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "I")
    private int field1108 = 4;

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "[I")
    public static int[] field1110 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "Lid;")
    public static class149 field1106 = class60.method382("::shiftclick", (byte) 80);

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "I")
    public static int field1115 = -8 + (int) (Math.random() * 17.0D);

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field1107 = 0;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    public static int field1109 = 0;

    @OriginalMember(owner = "client!ki", name = "eb", descriptor = "Lid;")
    public static class149 field1122 = class60.method382("1", (byte) 112);

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ki", name = "ab", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!ki", name = "bb", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ki", name = "cb", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ki", name = "db", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ki", name = "fb", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)Lgh;")
    public static final class24 method389(int arg0) {
        ++field1123;
        if (arg0 != 23410) {
            field1121 = -70;
        }
        return class269.field4848;
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
    public static final void method390(int arg0) {
        ++field1111;
        class14.field206 = new class47[class45.field688.method1531(21296)][];
        class226.field3953 = new boolean[class45.field688.method1531(21296)];
        if (arg0 != 12860) {
            method389(-108);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field1113;
        if (arg1 != 55) {
            field1106 = null;
        }
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int var4 = class137.field2515 / this.field1108;
            int var5 = class276.field4934 / this.field1117;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1368(0, class276.field4934 * var6 / var5, false);
            } else {
                var7 = this.method1368(0, 0, false);
            }
            for (int var8 = 0; ~class137.field2515 < ~var8; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class137.field2515 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)V")
    public static final void method391(byte arg0) {
        ++field1120;
        class71.field1243.method1290((byte) 63);
        class103.field1802.method1290((byte) -96);
        if (arg0 < 85) {
            method389(-118);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class62() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field1117 = arg0.method489((byte) -25);
            }
        } else {
            this.field1108 = arg0.method489((byte) -116);
        }
        ++field1112;
        if (!arg1) {
            method390(-49);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
    public static void method392(boolean arg0) {
        field1106 = null;
        field1110 = null;
        if (arg0) {
            field1122 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        ++field1119;
        int[][] var3 = super.field3632.method965(arg1, 68);
        if (!arg0) {
            return null;
        } else {
            if (super.field3632.field2550) {
                int var4 = class137.field2515 / this.field1108;
                int var5 = class276.field4934 / this.field1117;
                int[][] var7;
                if (var5 > 0) {
                    int var6 = arg1 % var5;
                    var7 = this.method1366(class276.field4934 * var6 / var5, !arg0, 0);
                } else {
                    var7 = this.method1366(0, false, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~var14 > ~class137.field2515; ++var14) {
                    int var16;
                    if (~var4 < -1) {
                        int var15 = var14 % var4;
                        var16 = class137.field2515 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var8[var16];
                    var12[var14] = var9[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)I")
    public static final int method393(int arg0, int arg1) {
        ++field1118;
        int var2 = (1431655765 & arg1) - -(arg1 >>> 1 & 1431655765);
        int var3 = ((-858993459 & var2) >>> 2) + (var2 & 858993459);
        int var4 = (var3 >>> 4) + var3 & 252645135;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg0 != 0) {
            field1106 = null;
        }
        return var6 & 255;
    }
}
