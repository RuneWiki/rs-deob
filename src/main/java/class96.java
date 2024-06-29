import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class96 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    private int field1183 = 0;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Lwq;")
    private class254 field1188 = null;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    private int field1189 = 0;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    private int field1194 = 0;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Lpea;")
    private class641 field1182;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lpba;")
    private class472 field1184;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "[Lef;")
    private class518[] field1181;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Lvw;")
    public class599 field1190;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field1186 = 0;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Lbc;")
    public static class607 field1179;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)I", line = 5)
    public static final int method529(int arg0, int arg1, int arg2) {
        field1192++;
        if (arg0 == 1 || arg0 == 3) {
            return class635.field8651[arg2 & 0x3];
        } else {
            if (arg1 != 11330) {
                field1186 = -109;
            }
            return class545.field7470[arg2 & 0x3];
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 22)
    public static void method530(byte arg0) {
        field1179 = null;
        int var1 = -126 % ((arg0 + 46) / 52);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIZIIZ)V", line = 31)
    public final void method531(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        if (!arg2) {
            field1179 = null;
        }
        boolean var7 = arg0 & this.field1182.method1901();
        field1180++;
        if (!var7 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
            if (arg4 == 4) {
                arg3 = arg1;
            }
            arg4 = 2;
        }
        if (arg4 != 0 && arg5) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (this.field1189 != arg4) {
            if (this.field1189 != 0) {
                this.field1181[this.field1189 & Integer.MAX_VALUE].method1137(6);
            }
            if (arg4 != 0) {
                this.field1181[arg4 & Integer.MAX_VALUE].method1139(arg5, (byte) 127);
                this.field1181[arg4 & Integer.MAX_VALUE].method1133(arg5, 126);
                this.field1181[Integer.MAX_VALUE & arg4].method1134(arg1, false, arg3);
            }
            this.field1189 = arg4;
            this.field1194 = arg1;
            this.field1188 = null;
            this.field1183 = arg3;
        } else if (this.field1189 != 0) {
            this.field1181[Integer.MAX_VALUE & this.field1189].method1133(arg5, 84);
            if (this.field1194 != arg1 || this.field1183 != arg3) {
                this.field1181[Integer.MAX_VALUE & this.field1189].method1134(arg1, false, arg3);
                this.field1194 = arg1;
                this.field1183 = arg3;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILwq;I)Z", line = 92)
    public final boolean method532(int arg0, class254 arg1, int arg2) {
        field1185++;
        if (this.field1189 == 0) {
            return false;
        }
        if (this.field1188 != arg1) {
            this.field1181[Integer.MAX_VALUE & this.field1189].method1138((byte) 75, arg1, arg0);
            this.field1188 = arg1;
        }
        if (arg2 != 20) {
            method529(63, -104, -70);
        }
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Loa;I)V", line = 113)
    public static final void method533(class689 arg0, int arg1) {
        field1191++;
        int var2 = class544.field7454;
        int var3 = class326.field4744;
        int var4 = class353.field5151;
        int var5 = class169.field2116 - 3;
        byte var6 = 20;
        if (class211.field2758 == null || class486.field6568 == null) {
            if (class39.field510.method1086((byte) 113, class689.field9735) && class39.field510.method1086((byte) 113, class620.field8424)) {
                class211.field2758 = arg0.method1951(class366.method2245(class39.field510, class689.field9735, 0), true);
                class366 var7 = class366.method2245(class39.field510, class620.field8424, 0);
                class486.field6568 = arg0.method1951(var7, true);
                var7.method2256();
                class56.field785 = arg0.method1951(var7, true);
            } else {
                arg0.method1926(var2, var3, var4, var6, 255 - class125.field1605 << 24 | class180.field2246, 1);
            }
        }
        if (class211.field2758 != null && class486.field6568 != null) {
            int var8 = (var4 - (class486.field6568.method1159() * 2)) / class211.field2758.method1159();
            for (int var9 = 0; var9 < var8; var9++) {
                class211.field2758.method2450(class486.field6568.method1159() + var2 + (var9 * class211.field2758.method1159()), var3);
            }
            class486.field6568.method2450(var2, var3);
            class56.field785.method2450(var4 + var2 - class56.field785.method1159(), var3);
        }
        class622.field8452.method1815(class243.field3235.method1491(class350.field5121, (byte) 126), -90, var2 + 3, class580.field8006 | 0xFF000000, var3 + 14, -1);
        arg0.method1926(var2, var3 + var6, var4, var5 - var6, class180.field2246 | -class125.field1605 + arg1 << 24, 1);
        int var10 = class592.field8107.method268((byte) -117);
        int var11 = class592.field8107.method269((byte) -25);
        int var12 = 0;
        for (class69 var13 = (class69) class37.field371.method374((byte) 66); var13 != null; var13 = (class69) class37.field371.method372(-20740)) {
            int var31 = (class179.field2242 - var12 - 1) * 16 + var3 + var6 + 13;
            var12++;
            if (var10 > var2 && var2 + var4 > var10 && var11 > (var31 - 13) && var31 + 4 > var11 && var13.field906) {
                arg0.method1926(var2, var31 - 12, var4, 16, 255 - class552.field7548 << 24 | class658.field9282, 1);
            }
        }
        if ((class485.field6564 == null || class539.field7388 == null || class46.field629 == null) && class39.field510.method1086((byte) 119, class525.field7269) && class39.field510.method1086((byte) 123, class461.field6286) && class39.field510.method1086((byte) 127, class59.field834)) {
            class366 var14 = class366.method2245(class39.field510, class461.field6286, 0);
            class539.field7388 = arg0.method1951(var14, true);
            var14.method2256();
            class581.field8013 = arg0.method1951(var14, true);
            class485.field6564 = arg0.method1951(class366.method2245(class39.field510, class525.field7269, 0), true);
            class366 var15 = class366.method2245(class39.field510, class59.field834, 0);
            class46.field629 = arg0.method1951(var15, true);
            var15.method2256();
            class548.field7494 = arg0.method1951(var15, true);
        }
        if (class485.field6564 != null && class539.field7388 != null && class46.field629 != null) {
            int var16 = (var4 - (class46.field629.method1159() * 2)) / class485.field6564.method1159();
            for (int var17 = 0; var17 < var16; var17++) {
                class485.field6564.method2450(class46.field629.method1159() + var2 + class485.field6564.method1159() * var17, -class485.field6564.method1154() + var5 + var3);
            }
            int var18 = (var5 - (var6 + class46.field629.method1154())) / class539.field7388.method1154();
            for (int var19 = 0; var19 < var18; var19++) {
                class539.field7388.method2450(var2, class539.field7388.method1154() * var19 + var3 + var6);
                class581.field8013.method2450(var4 + var2 - class581.field8013.method1159(), var3 - -var6 - -(var19 * class539.field7388.method1154()));
            }
            class46.field629.method2450(var2, var3 + var5 - class46.field629.method1154());
            class548.field7494.method2450(var2 + var4 - class46.field629.method1159(), var3 + var5 + -class46.field629.method1154());
        }
        int var20 = 0;
        for (class69 var21 = (class69) class37.field371.method374((byte) 109); var21 != null; var21 = (class69) class37.field371.method372(-20740)) {
            int var22 = (class179.field2242 - var20 - 1) * 16 + var3 + var6 + 13;
            int var23 = class580.field8006 | 0xFF000000;
            if (var2 < var10 && var2 + var4 > var10 && var11 > var22 - 13 && var11 < var22 + 4 && var21.field906) {
                var23 = class132.field1682 | 0xFF000000;
            }
            int[] var24 = null;
            if (class431.method2482(var21.field902, 21284)) {
                var24 = class237.field3088.method1349(-1, (int) var21.field900).field9316;
            } else if (var21.field905 != -1) {
                var24 = class237.field3088.method1349(-1, var21.field905).field9316;
            } else if (class668.method3705(var21.field902, false)) {
                class637 var25 = (class637) class77.field955.method2506(arg1 - 214, (long) ((int) var21.field900));
                if (var25 != null) {
                    class676 var26 = var25.field8702;
                    class195 var27 = var26.field9594;
                    if (var27.field2557 != null) {
                        var27 = var27.method1242(class327.field4771, (byte) -32);
                    }
                    if (var27 != null) {
                        var24 = var27.field2574;
                    }
                }
            } else if (class488.method2718(var21.field902, -17)) {
                Object var28 = null;
                class252 var29;
                if (var21.field902 == 1006) {
                    var29 = class578.field7980.method1746((int) var21.field900, (byte) 116);
                } else {
                    var29 = class578.field7980.method1746((int) (var21.field900 >>> 32 & 0x7FFFFFFFL), (byte) 108);
                }
                if (var29.field3391 != null) {
                    var29 = var29.method1568(-1, class327.field4771);
                }
                if (var29 != null) {
                    var24 = var29.field3468;
                }
            }
            String var30 = class192.method1229(arg1 ^ 0xA3, var21);
            if (var24 != null) {
                var30 = var30 + class436.method2511(0, var24);
            }
            class622.field8452.method1816(var2 + 3, var22, var30, class315.field4561, class367.field5293, var23, (byte) 118, 0);
            if (var21.field903) {
                class261.field3605.method2450(var2 + class446.field6129.method3312(-23728, var30) + 5, var22 + -12);
            }
            var20++;
        }
        class8.method53(class326.field4744, class169.field2116, (byte) 62, class353.field5151, class544.field7454);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(III)Z", line = 310)
    public static final boolean method534(int arg0, int arg1, int arg2) {
        if (arg1 != -25442) {
            method534(101, -115, 22);
        }
        field1193++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lpea;)V", line = 357)
    public class96(class641 arg0) {
        this.field1182 = arg0;
        this.field1184 = new class472(arg0);
        this.field1181 = new class518[10];
        this.field1181[1] = new class476(arg0);
        this.field1181[2] = new class438(arg0, this.field1184);
        this.field1181[4] = new class198(arg0, this.field1184);
        this.field1181[5] = new class662(arg0, this.field1184);
        this.field1181[6] = new class581(arg0);
        this.field1181[7] = new class525(arg0);
        this.field1181[3] = this.field1190 = new class599(arg0);
        this.field1181[8] = new class454(arg0, this.field1184);
        this.field1181[9] = new class170(arg0, this.field1184);
        if (!this.field1181[8].method1131(false)) {
            this.field1181[8] = this.field1181[4];
        }
        if (!this.field1181[9].method1131(false)) {
            this.field1181[9] = this.field1181[8];
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)Z", line = 330)
    public final boolean method535(int arg0, int arg1) {
        if (arg1 != 8) {
            method529(101, -82, -87);
        }
        field1187++;
        return this.field1181[arg0].method1131(false);
    }
}
