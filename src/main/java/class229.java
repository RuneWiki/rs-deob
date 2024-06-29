import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class229 {

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field4082 = 2;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field4089 = 2;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
    public static final void method1627(int arg0, int arg1) {
        class241.field4304 = arg0;
        field4085++;
        class32.field811 = -1;
        class32.field811 = -1;
        if (arg1 <= 91) {
            method1633(false, 121, -47);
        }
        class154.method1151((byte) -109);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILdl;Z)I")
    public static final int method1628(int arg0, class31 arg1, boolean arg2) {
        field4084++;
        if (arg1.field797 == null || arg1.field797.length <= arg0) {
            return -2;
        }
        try {
            if (!arg2) {
                method1630(125, false);
            }
            int[] var3 = arg1.field797[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 1) {
                    var9 = class146.field2806[var3[var4++]];
                }
                if (var7 == 2) {
                    var9 = class126.field2453[var3[var4++]];
                }
                if (var7 == 3) {
                    var9 = class29.field557[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class31 var12 = class272.method1858(var11, 65535);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class201.method1425(115, var13).field3096 || class65.field1429)) {
                        for (int var14 = 0; var14 < var12.field806.length; var14++) {
                            if (var13 + 1 == var12.field806[var14]) {
                                var9 += var12.field708[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class142.field2741[var3[var4++]];
                }
                if (var7 == 6) {
                    var9 = class48.field1091[class126.field2453[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class142.field2741[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class247.field4394.field2341;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class76.field1677[var15]) {
                            var9 += class126.field2453[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class31 var18 = class272.method1858(var17, 65535);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class201.method1425(109, var19).field3096 || class65.field1429)) {
                        for (int var20 = 0; var20 < var18.field806.length; var20++) {
                            if ((var19 + 1) == var18.field806[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class220.field3979;
                }
                if (var7 == 12) {
                    var9 = class102.field2075;
                }
                if (var7 == 13) {
                    int var21 = class142.field2741[var3[var4++]];
                    int var22 = var3[var4++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var9 = class61.method555(123, var23);
                }
                if (var7 == 18) {
                    var9 = (class247.field4394.field1360 >> 7) + class22.field421;
                }
                if (var7 == 19) {
                    var9 = (class247.field4394.field1336 >> 7) + class196.field3547;
                }
                if (var7 == 20) {
                    var9 = var3[var4++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var5 += var9;
                    }
                    if (var6 == 1) {
                        var5 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var5 /= var9;
                    }
                    if (var6 == 3) {
                        var5 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)I")
    public static final int method1629(int arg0, int arg1, int arg2) {
        if (arg0 > arg2) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        if (arg1 != -15) {
            field4082 = 104;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        field4083++;
        return arg2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1630(int arg0, boolean arg1) {
        field4080++;
        if (!arg1) {
            field4082 = 117;
        }
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)V")
    public static final void method1631(byte arg0, int arg1) {
        if (arg0 <= 41) {
            method1627(65, -34);
        }
        field4081++;
        class134.field2621.method1642(arg1, 127);
        class49.field1111.method1642(arg1, 79);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static final void method1632(int arg0) {
        field4086++;
        class251.field4438.method1652(-8259);
        class233.field4147.method1652(-8259);
        if (arg0 < 99) {
            field4089 = 112;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZII)I")
    public static final int method1633(boolean arg0, int arg1, int arg2) {
        field4087++;
        int var3 = class169.method1247((byte) 48, arg2 - 1, arg1 + -1) + class169.method1247((byte) 48, arg2 + 1, arg1 + -1) - (-class169.method1247((byte) 48, arg2 + -1, arg1 + 1) - class169.method1247((byte) 48, arg2 + 1, arg1 + 1));
        int var4 = class169.method1247((byte) 48, arg2 - 1, arg1) - (-class169.method1247((byte) 48, arg2 + 1, arg1) - class169.method1247((byte) 48, arg2, arg1 - 1)) + class169.method1247((byte) 48, arg2, arg1 + 1);
        if (!arg0) {
            field4082 = -67;
        }
        int var5 = class169.method1247((byte) 48, arg2, arg1);
        return var4 / 8 + (var3 / 16 + (var5 / 4));
    }
}
