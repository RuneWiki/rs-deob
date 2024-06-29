import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class313 {

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public int field4115 = -1;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "I")
    public int field4131 = 0;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    private int field4121 = -1;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
    public boolean field4117 = true;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public int field4133 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "Z")
    public boolean field4129 = true;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    private int field4125 = -1;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    public int field4134 = -1;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "I")
    public int field4139 = -1;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "Z")
    public boolean field4141 = false;

    @OriginalMember(owner = "client!np", name = "J", descriptor = "I")
    public int field4148 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!np", name = "L", descriptor = "I")
    private int field4150 = -1;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    private int field4123 = -1;

    @OriginalMember(owner = "client!np", name = "K", descriptor = "Z")
    public boolean field4149 = true;

    @OriginalMember(owner = "client!np", name = "O", descriptor = "I")
    private int field4153 = -1;

    @OriginalMember(owner = "client!np", name = "M", descriptor = "I")
    public int field4151 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public int field4144 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!np", name = "R", descriptor = "I")
    public int field4156 = -1;

    @OriginalMember(owner = "client!np", name = "T", descriptor = "[Ljava/lang/String;")
    public String[] field4158 = new String[5];

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    private int field4113;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    private int field4116;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!np", name = "y", descriptor = "I")
    public int field4137;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!np", name = "B", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "I")
    private int field4143;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!np", name = "H", descriptor = "I")
    public int field4146;

    @OriginalMember(owner = "client!np", name = "I", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!np", name = "P", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!np", name = "Q", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!np", name = "S", descriptor = "I")
    private int field4157;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "Lad;")
    private class268 field4132;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "Lki;")
    public class461 field4120;

    @OriginalMember(owner = "client!np", name = "x", descriptor = "Ljava/lang/String;")
    public String field4136;

    @OriginalMember(owner = "client!np", name = "N", descriptor = "Ljava/lang/String;")
    public String field4152;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "[I")
    public int[] field4122;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)I", line = 8)
    public static final int method1713(byte arg0, int arg1) {
        int var2 = -16 / ((-arg0 - 23) / 48);
        field4140++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lwl;B)Z", line = 22)
    public final boolean method1714(class258 arg0, byte arg1) {
        field4118++;
        int var3;
        if (this.field4121 == -1) {
            if (this.field4150 == -1) {
                return true;
            }
            var3 = arg0.method1455((byte) -35, this.field4150);
        } else {
            var3 = arg0.method1454(1633, this.field4121);
        }
        if (var3 < this.field4116 || var3 > this.field4113) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field4123 == -1) {
            if (this.field4153 == -1) {
                return true;
            }
            var5 = arg0.method1455((byte) -35, this.field4153);
        } else {
            var5 = arg0.method1454(1633, this.field4123);
        }
        if (this.field4143 <= var5 && this.field4157 >= var5) {
            int var6 = 104 % ((arg1 + 46) / 38);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIII)V", line = 74)
    public static final void method1715(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 5) {
            return;
        }
        field4124++;
        if (arg3 > arg2) {
            class330.method1834(arg3, class102.field1472[arg0], arg1, arg2, 25084);
        } else {
            class330.method1834(arg2, class102.field1472[arg0], arg1, arg3, 25084);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BLbt;)V", line = 104)
    public final void method1716(byte arg0, class32 arg1) {
        while (true) {
            int var3 = arg1.method201((byte) -118);
            if (var3 == 0) {
                if (arg0 >= -115) {
                    this.method1719((byte) -116, 83, (String) null);
                }
                field4127++;
                return;
            }
            this.method1720(var3, -8, arg1);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BLwm;)Ljd;", line = 131)
    private final class139 method1717(byte arg0, class364 arg1) {
        field4138++;
        int var3 = -73 / ((arg0 - 61) / 55);
        class139 var4 = (class139) this.field4120.field6248.method493((byte) 19, (long) (this.field4125 | 0x20000 | arg1.field4999 << 29));
        if (var4 != null) {
            return var4;
        }
        this.field4120.field6244.method700((byte) 122, this.field4125);
        class325 var5 = class325.method1817(this.field4120.field6244, this.field4125, 0);
        if (var5 != null) {
            var4 = arg1.method2050(var5, true);
            this.field4120.field6248.method505((long) (this.field4125 | 0x20000 | arg1.field4999 << 29), var4, 81);
        }
        return var4;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljg;Lnp;Lwm;I)V", line = 174)
    public static final void method1718(class205 arg0, class313 arg1, class364 arg2, int arg3) {
        field4145++;
        class139 var4 = arg1.method1717((byte) -68, arg2);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method775();
        if (var4.method771() > var5) {
            var5 = var4.method771();
        }
        byte var6 = 10;
        int var7 = arg0.field2776;
        int var8 = arg0.field2772;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg1.field4136 != null) {
            var9 = class93.field1363.method2138(-102, class477.field6584, arg1.field4136, (int[]) null, (class139[]) null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class477.field6584[var12];
                if (var12 < (var9 - 1)) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class310.field4096.method1423(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = var9 * class310.field4096.method1421() + (class310.field4096.method1420() / 2);
        }
        int var15 = var5 / arg3 + arg0.field2776;
        int var16 = arg0.field2772;
        if (var7 < (class55.field746 + var5)) {
            var15 = class55.field746 + 5 - (-(var10 / 2) - var6 - (var5 / 2));
            var7 = class55.field746;
        } else if ((class55.field747 - var5) < var7) {
            var15 = class55.field747 - (var5 / 2 + var6 - (-(var10 / 2) + -5));
            var7 = class55.field747 - var5;
        }
        if ((class55.field751 + var5) > var8) {
            var16 = var5 / 2 + class55.field751 + var6;
            var8 = class55.field751;
        } else if ((class55.field766 - var5) < var8) {
            var16 = class55.field766 - (var5 / 2) - var11 - var6;
            var8 = class55.field766 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg0.field2776), (double) (var8 - arg0.field2772)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method837((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg1.field4136 != null) {
            var19 = var16;
            var18 = var15 - var10 / 2 - 5;
            var20 = var18 + var10 + 10;
            var21 = var16 + class310.field4096.method1421() * var9 + 3;
            if (arg1.field4155 != 0) {
                arg2.method2222(var21 - var16, var18, var16, arg1.field4155, arg3 + 124, -var18 + var20);
            }
            if (arg1.field4130 != 0) {
                arg2.method2219(-16385, var16, var18, var21 - var16, arg1.field4130, var20 - var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class477.field6584[var22];
                if (var22 < var9 - 1) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class310.field4096.method1424(arg2, var23, var15, var16, arg1.field4147, true);
                var16 += class310.field4096.method1421();
            }
        }
        if (arg1.field4134 == -1 && arg1.field4136 == null) {
            return;
        }
        class392 var24 = new class392(arg0);
        int var25 = var5 >> 1;
        var24.field5438 = var8 + var25;
        var24.field5436 = var18;
        var24.field5435 = var19;
        var24.field5446 = var20;
        var24.field5443 = var8 - var25;
        var24.field5447 = var21;
        var24.field5442 = var7 + var25;
        var24.field5440 = var7 - var25;
        class271.field3611.method641(var24, (byte) -93);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;", line = 326)
    public final String method1719(byte arg0, int arg1, String arg2) {
        if (arg0 < 65) {
            this.field4113 = 40;
        }
        field4119++;
        if (this.field4132 == null) {
            return arg2;
        } else {
            class221 var4 = (class221) this.field4132.method1528((long) arg1, 65);
            return var4 == null ? arg2 : var4.field2943;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IILbt;)V", line = 356)
    private final void method1720(int arg0, int arg1, class32 arg2) {
        if (arg0 == 1) {
            this.field4134 = arg2.method215((byte) 100);
        } else if (arg0 == 2) {
            this.field4156 = arg2.method215((byte) 122);
        } else if (arg0 == 3) {
            this.field4136 = arg2.method195(122);
        } else if (arg0 == 4) {
            this.field4147 = arg2.method219(-108);
        } else if (arg0 == 5) {
            this.field4115 = arg2.method219(-117);
        } else if (arg0 == 6) {
            this.field4131 = arg2.method201((byte) -106);
        } else if (arg0 == 7) {
            int var4 = arg2.method201((byte) -118);
            if ((var4 & 0x1) == 0) {
                this.field4149 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field4141 = true;
            }
        } else if (arg0 == 8) {
            this.field4129 = arg2.method201((byte) -125) == 1;
        } else if (arg0 == 9) {
            this.field4150 = arg2.method215((byte) 117);
            if (this.field4150 == 65535) {
                this.field4150 = -1;
            }
            this.field4121 = arg2.method215((byte) 123);
            if (this.field4121 == 65535) {
                this.field4121 = -1;
            }
            this.field4116 = arg2.method222(arg1 + 1032);
            this.field4113 = arg2.method222(1024);
        } else if (arg0 >= 10 && arg0 <= 14) {
            this.field4158[arg0 - 10] = arg2.method195(109);
        } else if (arg0 == 15) {
            int var11 = arg2.method201((byte) -125);
            this.field4122 = new int[var11 * 2];
            for (int var12 = 0; var12 < var11 * 2; var12++) {
                this.field4122[var12] = arg2.method209((byte) 35);
            }
            this.field4137 = arg2.method222(1024);
            this.field4126 = arg2.method222(1024);
        } else if (arg0 == 16) {
            this.field4117 = false;
        } else if (arg0 == 17) {
            this.field4152 = arg2.method195(106);
        } else if (arg0 == 18) {
            this.field4125 = arg2.method215((byte) 114);
        } else if (arg0 == 19) {
            this.field4139 = arg2.method215((byte) 96);
        } else if (arg0 == 20) {
            this.field4153 = arg2.method215((byte) 100);
            if (this.field4153 == 65535) {
                this.field4153 = -1;
            }
            this.field4123 = arg2.method215((byte) 118);
            if (this.field4123 == 65535) {
                this.field4123 = -1;
            }
            this.field4143 = arg2.method222(1024);
            this.field4157 = arg2.method222(1024);
        } else if (arg0 == 21) {
            this.field4130 = arg2.method222(arg1 + 1032);
        } else if (arg0 == 22) {
            this.field4155 = arg2.method222(arg1 + 1032);
        } else if (arg0 == 249) {
            int var5 = arg2.method201((byte) -118);
            if (this.field4132 == null) {
                int var6 = class100.method616(var5, true);
                this.field4132 = new class268(var6);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                boolean var8 = arg2.method201((byte) -111) == 1;
                int var9 = arg2.method219(-110);
                class445 var10;
                if (var8) {
                    var10 = new class221(arg2.method195(-103));
                } else {
                    var10 = new class37(arg2.method222(1024));
                }
                this.field4132.method1525((byte) 19, var10, (long) var9);
            }
        }
        if (arg1 != -8) {
            this.method1717((byte) 77, (class364) null);
        }
        field4114++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 523)
    public final void method1721(int arg0) {
        if (arg0 < 15) {
            method1715(29, 87, -126, -59, 74);
        }
        field4154++;
        if (this.field4122 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4122.length; var2 += 2) {
            if (this.field4122[var2] < this.field4151) {
                this.field4151 = this.field4122[var2];
            } else if (this.field4122[var2] > this.field4133) {
                this.field4133 = this.field4122[var2];
            }
            if (this.field4122[var2 + 1] < this.field4148) {
                this.field4148 = this.field4122[var2 + 1];
            } else if (this.field4122[var2 + 1] > this.field4144) {
                this.field4144 = this.field4122[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIZ)I", line = 561)
    public final int method1722(int arg0, int arg1, boolean arg2) {
        field4128++;
        if (this.field4132 == null) {
            return arg0;
        }
        if (arg2) {
            this.method1719((byte) 69, -98, (String) null);
        }
        class37 var4 = (class37) this.field4132.method1528((long) arg1, 82);
        return var4 == null ? arg0 : var4.field555;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lwm;ZZ)Ljd;", line = 608)
    public final class139 method1723(class364 arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            this.field4143 = -8;
        }
        field4142++;
        int var4 = arg2 ? this.field4156 : this.field4134;
        int var5 = var4 | arg0.field4999 << 29;
        class139 var6 = (class139) this.field4120.field6248.method493((byte) 19, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (this.field4120.field6244.method700((byte) 80, var4)) {
            class325 var7 = class325.method1817(this.field4120.field6244, var4, 0);
            if (var7 != null) {
                var6 = arg0.method2050(var7, true);
                this.field4120.field6248.method505((long) var5, var6, 70);
            }
            return var6;
        } else {
            return null;
        }
    }
}
