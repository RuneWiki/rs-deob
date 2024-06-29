import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class152 extends class179 {

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "J")
    public static long field1768 = -1L;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "Ljava/lang/String;")
    public String field1769;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "[C")
    public char[] field1770;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "[C")
    public char[] field1775;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "[I")
    public int[] field1765;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "[I")
    public int[] field1772;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(BI)I", line = 3)
    public static final int method972(byte arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        field1778++;
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        if (arg0 < 27) {
            field1776 = 28;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(B)V", line = 21)
    public final void method973(byte arg0) {
        field1771++;
        if (arg0 > -50) {
            return;
        }
        if (this.field1772 != null) {
            for (int var2 = 0; var2 < this.field1772.length; var2++) {
                this.field1772[var2] = class213.method1307(this.field1772[var2], 32768);
            }
        }
        if (this.field1765 != null) {
            for (int var3 = 0; var3 < this.field1765.length; var3++) {
                this.field1765[var3] = class213.method1307(this.field1765[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lbg;II)V", line = 53)
    private final void method974(class242 arg0, int arg1, int arg2) {
        field1773++;
        if (arg1 != 0) {
            return;
        }
        if (arg2 == 1) {
            this.field1769 = arg0.method1565(-53);
        } else if (arg2 == 2) {
            int var7 = arg0.method1563(-128);
            this.field1770 = new char[var7];
            this.field1765 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1765[var8] = arg0.method1587((byte) -102);
                byte var9 = arg0.method1589(false);
                this.field1770[var8] = var9 == 0 ? 0 : class156.method996(var9, 26);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method1563(-128);
            this.field1775 = new char[var4];
            this.field1772 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1772[var5] = arg0.method1587((byte) -102);
                byte var6 = arg0.method1589(false);
                this.field1775[var5] = var6 == 0 ? 0 : class156.method996(var6, 122);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Luo;B)V", line = 118)
    public static final void method975(class118 arg0, byte arg1) {
        field1767++;
        int var2 = class148.field1735;
        int var3 = -42 / ((-arg1 - 5) / 44);
        int var4 = class76.field941;
        int var5 = class143.field1686;
        int var6 = class194.field2298 - 3;
        byte var7 = 20;
        if (class411.field5666 == null || class35.field386 == null) {
            if (class15.field177.method1797(0, class137.field1548) && class15.field177.method1797(0, class68.field813)) {
                class411.field5666 = arg0.method697(class132.method849(class15.field177, class137.field1548, 0), true);
                class132 var8 = class132.method849(class15.field177, class68.field813, 0);
                class35.field386 = arg0.method697(var8, true);
                var8.method854();
                class234.field3080 = arg0.method697(var8, true);
            } else {
                arg0.method789(var2, var4, var5, var7, class68.field817 | 255 - class365.field4958 << 24, 1);
            }
        }
        if (class411.field5666 != null && class35.field386 != null) {
            int var9 = (var5 - class35.field386.method230() * 2) / class411.field5666.method230();
            for (int var10 = 0; var10 < var9; var10++) {
                class411.field5666.method2659(class35.field386.method230() + var2 + class411.field5666.method230() * var10, var4);
            }
            class35.field386.method2659(var2, var4);
            class234.field3080.method2659(var2 + var5 - class234.field3080.method230(), var4);
        }
        class210.field2544.method206(class414.field5687 | 0xFF000000, var2 + 3, var4 + 14, -1, true, class126.field1409.method434(class373.field5057, -8192));
        arg0.method789(var2, var4 + var7, var5, var6 - var7, class68.field817 | -class365.field4958 + 255 << 24, 1);
        int var11 = class358.field4866.method1860(16);
        int var12 = class358.field4866.method1858(-18493);
        for (int var13 = 0; var13 < class57.field660; var13++) {
            int var27 = (class57.field660 - var13 - 1) * 16 + var4 + var7 + 13;
            if (var11 > var2 && var2 + var5 > var11 && (var27 - 13) < var12 && var12 < (var27 + 4)) {
                arg0.method789(var2, var27 - 12, var5, 16, class104.field1229 | 255 - class431.field5876 << 24, 1);
            }
        }
        if ((class97.field1141 == null || class276.field3574 == null || class446.field6232 == null) && class15.field177.method1797(0, class80.field980) && class15.field177.method1797(0, class275.field3550) && class15.field177.method1797(0, class270.field3501)) {
            class132 var14 = class132.method849(class15.field177, class275.field3550, 0);
            class276.field3574 = arg0.method697(var14, true);
            var14.method854();
            class433.field5910 = arg0.method697(var14, true);
            class97.field1141 = arg0.method697(class132.method849(class15.field177, class80.field980, 0), true);
            class132 var15 = class132.method849(class15.field177, class270.field3501, 0);
            class446.field6232 = arg0.method697(var15, true);
            var15.method854();
            class137.field1567 = arg0.method697(var15, true);
        }
        if (class97.field1141 != null && class276.field3574 != null && class446.field6232 != null) {
            int var16 = (var5 - (class446.field6232.method230() * 2)) / class97.field1141.method230();
            for (int var17 = 0; var17 < var16; var17++) {
                class97.field1141.method2659(class446.field6232.method230() + var2 + (class97.field1141.method230() * var17), -class97.field1141.method237() + var4 + var6);
            }
            int var18 = (var6 - var7 - class446.field6232.method237()) / class276.field3574.method237();
            for (int var19 = 0; var19 < var18; var19++) {
                class276.field3574.method2659(var2, class276.field3574.method237() * var19 + (var4 + var7));
                class433.field5910.method2659(var2 + var5 - class433.field5910.method230(), var4 - -var7 - -(class276.field3574.method237() * var19));
            }
            class446.field6232.method2659(var2, (var4 + var6) - class446.field6232.method237());
            class137.field1567.method2659((var2 + var5) - class446.field6232.method230(), -class446.field6232.method237() + var6 + var4);
        }
        int var20 = 0;
        for (class266 var21 = (class266) class97.field1138.method1690((byte) -110); var21 != null; var21 = (class266) class97.field1138.method1699((byte) 9)) {
            int var22 = (class57.field660 - var20 - 1) * 16 + var4 + var7 + 13;
            int var23 = class414.field5687 | 0xFF000000;
            if (var11 > var2 && var11 < (var2 + var5) && var12 > (var22 - 13) && (var22 + 4) > var12) {
                var23 = class249.field3282 | 0xFF000000;
            }
            int[] var24 = null;
            if (class94.method590(var21.field3424, 45)) {
                var24 = class131.method843((byte) 5, (int) var21.field3427).field716;
            } else if (class213.method1308(var21.field3424, -100)) {
                class298 var25 = class220.field2726[(int) var21.field3427];
                if (var25 != null) {
                    var24 = var25.field3971.field4174;
                }
            } else if (class276.method1737(2, var21.field3424)) {
                if (var21.field3424 == 1011) {
                    var24 = class380.method2361((int) var21.field3427, -29012).field6220;
                } else {
                    var24 = class380.method2361((int) (var21.field3427 >>> 32 & 0x7FFFFFFFL), -29012).field6220;
                }
            }
            String var26 = class302.method1921(false, var21);
            if (var24 != null) {
                var26 = var26 + class337.method2161(var24, (byte) -34);
            }
            var20++;
            class210.field2544.method189(var2 + 3, 0, var22, var26, class53.field621, class192.field2257, var23, (byte) 40);
        }
        class339.method2176(class148.field1735, -110, class76.field941, class143.field1686, class194.field2298);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(CI)I", line = 303)
    public final int method976(char arg0, int arg1) {
        field1764++;
        if (this.field1765 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1765.length; var3++) {
            if (this.field1770[var3] == arg0) {
                return this.field1765[var3];
            }
        }
        if (arg1 != 32768) {
            field1768 = -50L;
        }
        return -1;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(CI)I", line = 329)
    public final int method977(char arg0, int arg1) {
        field1777++;
        if (arg1 <= 92) {
            field1776 = 108;
        }
        if (this.field1772 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1772.length; var3++) {
            if (this.field1775[var3] == arg0) {
                return this.field1772[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lwo;B)V", line = 359)
    public static final void method978(class285 arg0, byte arg1) {
        field1763++;
        class14.field175 = arg0;
        int var2 = -6 / ((-arg1 - 56) / 55);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)V", line = 369)
    public static final void method979(boolean arg0, int arg1) {
        field1774++;
        if (class450.field6293 != arg0) {
            class450.field6293 = arg0;
            class414.method2555(arg1 ^ arg1);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILbg;)V", line = 381)
    public final void method980(int arg0, class242 arg1) {
        if (arg0 != -17494) {
            method975((class118) null, (byte) -109);
        }
        while (true) {
            int var3 = arg1.method1563(-128);
            if (var3 == 0) {
                field1766++;
                return;
            }
            this.method974(arg1, 0, var3);
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(III)V", line = 404)
    public static final void method981(int arg0, int arg1, int arg2) {
        class316 var3 = class347.field4722[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field4268 != null) {
            var3.field4268 = null;
        }
        if (var3.field4269 != null) {
            var3.field4269 = null;
        }
    }
}
