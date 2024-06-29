import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class90 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "B")
    private byte field1444;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public int field1446;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1447 = "";

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Ljj;")
    public static class77 field1452;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method664(int arg0) {
        field1447 = null;
        field1452 = null;
        if (arg0 != -5129) {
            field1452 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIIZ)I")
    public static final int method665(boolean arg0, int arg1, int arg2, boolean arg3) {
        field1455++;
        class304 var4 = class75.method579(arg3, arg0, arg2);
        if (!arg0) {
            return -21;
        } else if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && var4.field4510.length > arg1) {
            return var4.field4510[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
    public static final int method666(int arg0, int arg1, int arg2) {
        field1443++;
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 != 8) {
            field1452 = null;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
    public static final void method667() {
        class128.field2002 = 0;
        label212: for (int var0 = 0; var0 < class269.field4061; var0++) {
            class354 var1 = class366.field5302[var0];
            if (class341.field5043 != null) {
                for (int var2 = 0; var2 < class341.field5043.length; var2++) {
                    if (class341.field5043[var2] != -1000000 && (var1.field5160 <= class341.field5043[var2] || var1.field5150 <= class341.field5043[var2]) && (var1.field5156 <= class320.field4775[var2] || var1.field5149 <= class320.field4775[var2]) && (var1.field5156 >= class120.field1880[var2] || var1.field5149 >= class120.field1880[var2]) && (var1.field5165 <= class127.field1990[var2] || var1.field5157 <= class127.field1990[var2]) && (var1.field5165 >= class131.field2052[var2] || var1.field5157 >= class131.field2052[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field5162 == 1) {
                int var3 = var1.field5153 + class272.field4085 - class295.field4418;
                if (var3 >= 0 && var3 <= class272.field4085 + class272.field4085) {
                    int var4 = var1.field5163 + class272.field4085 - class118.field1845;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class272.field4085 + class272.field4085) {
                        continue;
                    }
                    int var5 = var1.field5158 + class272.field4085 - class118.field1845;
                    if (var5 > class272.field4085 + class272.field4085) {
                        var5 = class272.field4085 + class272.field4085;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class334.field4958[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class510.field7387 - var1.field5156;
                        if (var7 > class474.field6913) {
                            var1.field5147 = 1;
                        } else {
                            if (var7 >= -class474.field6913) {
                                continue;
                            }
                            var1.field5147 = 2;
                            var7 = -var7;
                        }
                        var1.field5159 = (var1.field5165 - class14.field161 << 8) / var7;
                        var1.field5164 = (var1.field5157 - class14.field161 << 8) / var7;
                        var1.field5152 = (var1.field5160 - class431.field6195 << 8) / var7;
                        var1.field5148 = (var1.field5150 - class431.field6195 << 8) / var7;
                        class297.field4438[class128.field2002++] = var1;
                    }
                }
            } else if (var1.field5162 == 2) {
                int var8 = var1.field5163 + class272.field4085 - class118.field1845;
                if (var8 >= 0 && var8 <= class272.field4085 + class272.field4085) {
                    int var9 = var1.field5153 + class272.field4085 - class295.field4418;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class272.field4085 + class272.field4085) {
                        continue;
                    }
                    int var10 = var1.field5151 + class272.field4085 - class295.field4418;
                    if (var10 > class272.field4085 + class272.field4085) {
                        var10 = class272.field4085 + class272.field4085;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class334.field4958[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class14.field161 - var1.field5165;
                        if (var12 > class474.field6913) {
                            var1.field5147 = 3;
                        } else {
                            if (var12 >= -class474.field6913) {
                                continue;
                            }
                            var1.field5147 = 4;
                            var12 = -var12;
                        }
                        var1.field5161 = (var1.field5156 - class510.field7387 << 8) / var12;
                        var1.field5155 = (var1.field5149 - class510.field7387 << 8) / var12;
                        var1.field5152 = (var1.field5160 - class431.field6195 << 8) / var12;
                        var1.field5148 = (var1.field5150 - class431.field6195 << 8) / var12;
                        class297.field4438[class128.field2002++] = var1;
                    }
                }
            } else if (var1.field5162 == 4) {
                int var13 = var1.field5160 - class431.field6195;
                if (var13 > class111.field1642) {
                    int var14 = var1.field5163 + class272.field4085 - class118.field1845;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class272.field4085 + class272.field4085) {
                        continue;
                    }
                    int var15 = var1.field5158 + class272.field4085 - class118.field1845;
                    if (var15 > class272.field4085 + class272.field4085) {
                        var15 = class272.field4085 + class272.field4085;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field5153 + class272.field4085 - class295.field4418;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class272.field4085 + class272.field4085) {
                        continue;
                    }
                    int var17 = var1.field5151 + class272.field4085 - class295.field4418;
                    if (var17 > class272.field4085 + class272.field4085) {
                        var17 = class272.field4085 + class272.field4085;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class334.field4958[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field5147 = 5;
                        var1.field5161 = (var1.field5156 - class510.field7387 << 8) / var13;
                        var1.field5155 = (var1.field5149 - class510.field7387 << 8) / var13;
                        var1.field5159 = (var1.field5165 - class14.field161 << 8) / var13;
                        var1.field5164 = (var1.field5157 - class14.field161 << 8) / var13;
                        class297.field4438[class128.field2002++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)I")
    public final int method668(boolean arg0) {
        field1449++;
        if (arg0) {
            this.field1450 = -60;
        }
        return this.field1444 & 0x7;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I")
    public final int method669(int arg0) {
        if (arg0 > -112) {
            return 66;
        } else {
            field1453++;
            return (this.field1444 & 0x8) == 8 ? 1 : 0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V")
    public class90() {
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lwn;)V")
    public class90(class519 arg0) {
        this.field1444 = arg0.method3034((byte) -128);
        this.field1454 = arg0.method3018(566990904);
        this.field1448 = arg0.method3053(-129);
        this.field1446 = arg0.method3053(-129);
        this.field1451 = arg0.method3053(-129);
        this.field1450 = arg0.method3053(-129);
    }
}
