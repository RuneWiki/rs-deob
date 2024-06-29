import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class100 extends class279 {

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public int field1604 = 4;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    public int field1607 = 1638;

    @OriginalMember(owner = "client!hm", name = "U", descriptor = "I")
    public int field1615 = 0;

    @OriginalMember(owner = "client!hm", name = "hb", descriptor = "I")
    public int field1628 = 4;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public int field1601 = 4;

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "Z")
    public boolean field1620 = true;

    @OriginalMember(owner = "client!hm", name = "lb", descriptor = "[B")
    private byte[] field1632 = new byte[512];

    @OriginalMember(owner = "client!hm", name = "cb", descriptor = "I")
    public static int field1623 = 20;

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "Ltl;")
    private static class59 field1619 = class85.method639("Please remove ", 9588);

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    public static int field1606 = 3353893;

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "Ltl;")
    public static class59 field1614 = field1619;

    @OriginalMember(owner = "client!hm", name = "mb", descriptor = "Ltl;")
    public static class59 field1633 = field1619;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "B")
    public static byte field1608;

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "F")
    public static float field1612;

    @OriginalMember(owner = "client!hm", name = "ib", descriptor = "F")
    public static float field1629;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!hm", name = "bb", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!hm", name = "db", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!hm", name = "fb", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!hm", name = "gb", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!hm", name = "jb", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!hm", name = "kb", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!hm", name = "nb", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "Lki;")
    public static class166 field1609;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "[S")
    private short[] field1602;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "[S")
    private short[] field1603;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIII)I", line = 6)
    private final int method755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1626++;
        if (arg4 >= -122) {
            this.field1628 = -99;
        }
        int var8 = arg1 - 4096;
        int var9 = arg0 >> 12;
        int var10 = arg0 & 0xFFF;
        int var11 = class119.field1951[var10];
        int var12 = var10 - 4096;
        int var13 = var9 + 1;
        if (arg2 <= var13) {
            var13 = 0;
        }
        int var14 = var9 & 0xFF;
        int var15 = var13 & 0xFF;
        int var16 = this.field1632[arg6 + var14] & 0x3;
        int var17;
        if (var16 <= 1) {
            var17 = var16 == 0 ? arg1 + var10 : arg1 - var10;
        } else {
            var17 = var16 == 2 ? var10 - arg1 : -arg1 + -var10;
        }
        int var18 = this.field1632[arg6 + var15] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var12 - arg1 : -arg1 + -var12;
        } else {
            var19 = var18 == 0 ? var12 + arg1 : -var12 + arg1;
        }
        int var20 = ((var19 - var17) * var11 >> 12) + var17;
        int var21 = this.field1632[arg3 + var14] & 0x3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 == 0 ? var8 + var10 : -var10 + var8;
        } else {
            var22 = var21 == 2 ? var10 - var8 : -var8 + -var10;
        }
        int var23 = this.field1632[arg3 + var15] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var12 : var8 - var12;
        } else {
            var24 = var23 == 2 ? var12 - var8 : -var8 + -var12;
        }
        int var25 = ((var24 - var22) * var11 >> 12) + var22;
        return ((var25 - var20) * arg5 >> 12) + var20;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IJ)V", line = 80)
    public static final void method756(int arg0, long arg1) {
        field1610++;
        try {
            if (arg0 != 1) {
                field1608 = 54;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIZII)V", line = 98)
    public static final void method757(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1617++;
        if (class253.method1764(arg1, 0)) {
            int var5 = 67 / ((arg0 - 55) / 55);
            class13.method88(true, arg2, class239.field3986[arg1], -1, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IILs;)V", line = 118)
    public final void method51(int arg0, int arg1, class170 arg2) {
        field1631++;
        if (arg0 > -125) {
            this.field1615 = 91;
        }
        if (arg1 == 0) {
            this.field1620 = arg2.method1221(88) == 1;
        } else if (arg1 == 1) {
            this.field1628 = arg2.method1221(126);
        } else if (arg1 == 2) {
            this.field1607 = arg2.method1210(-115);
            if (this.field1607 < 0) {
                this.field1602 = new short[this.field1628];
                for (int var5 = 0; var5 < this.field1628; var5++) {
                    this.field1602[var5] = (short) arg2.method1210(-93);
                }
            }
        } else if (arg1 == 3) {
            this.field1601 = this.field1604 = arg2.method1221(118);
        } else if (arg1 == 4) {
            this.field1615 = arg2.method1221(120);
        } else if (arg1 == 5) {
            this.field1601 = arg2.method1221(74);
        } else if (arg1 == 6) {
            this.field1604 = arg2.method1221(77);
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 221)
    public class100() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(Z)V", line = 228)
    private final void method758(boolean arg0) {
        if (this.field1607 > 0) {
            this.field1603 = new short[this.field1628];
            this.field1602 = new short[this.field1628];
            for (int var3 = 0; var3 < this.field1628; var3++) {
                this.field1602[var3] = (short) ((int) (Math.pow((double) ((float) this.field1607 / 4096.0F), (double) var3) * 4096.0D));
                this.field1603[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field1602 != null && this.field1602.length == this.field1628) {
            this.field1603 = new short[this.field1628];
            for (int var2 = 0; var2 < this.field1628; var2++) {
                this.field1603[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0) {
            this.field1607 = -52;
        }
        field1630++;
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)V", line = 273)
    public static void method759(int arg0) {
        field1619 = null;
        field1609 = null;
        field1633 = null;
        field1614 = null;
        if (arg0 != 19890) {
            field1623 = 15;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZI)[I", line = 290)
    public final int[] method44(boolean arg0, int arg1) {
        if (arg0) {
            method760(76, 10, 4);
        }
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            this.method762(arg1, var3, 2048);
        }
        field1611++;
        return var3;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(III)V", line = 311)
    public static final void method760(int arg0, int arg1, int arg2) {
        field1605++;
        class186 var3 = class67.method561(32, arg0, arg1);
        var3.method1380(3293);
        var3.field3117 = arg2;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjava/awt/Color;Ltl;ZI)V", line = 322)
    public static final void method761(int arg0, Color arg1, class59 arg2, boolean arg3, int arg4) {
        field1616++;
        try {
            Graphics var5 = class160.field2607.getGraphics();
            if (class233.field3846 == null) {
                class233.field3846 = new Font("Helvetica", 1, 13);
                class308.field5236 = class160.field2607.getFontMetrics(class233.field3846);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class152.field2498, class53.field792);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class232.field3823 == null) {
                    class232.field3823 = class160.field2607.createImage(304, 34);
                }
                Graphics var6 = class232.field3823.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
                var6.setFont(class233.field3846);
                var6.setColor(Color.white);
                arg2.method501(22, arg0 ^ arg0, (304 - arg2.method491(0, class308.field5236)) / 2, var6);
                var5.drawImage(class232.field3823, class152.field2498 / 2 - 152, class53.field792 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class152.field2498 / 2 - 152;
                int var9 = class53.field792 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + var8 + 2, var9 - -2, 300 - (arg4 * 3), 30);
                var5.setFont(class233.field3846);
                var5.setColor(Color.white);
                arg2.method501(var9 + 22, arg0 ^ 0x12B5, (304 - arg2.method491(0, class308.field5236)) / 2 + var8, var5);
            }
            if (class255.field4241 != null) {
                var5.setFont(class233.field3846);
                var5.setColor(Color.white);
                class255.field4241.method501(class53.field792 / 2 - 26, 0, class152.field2498 / 2 - class255.field4241.method491(arg0 ^ 0x12B5, class308.field5236) / 2, var5);
            }
        } catch (Exception var12) {
            class160.field2607.repaint();
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 392)
    public final void method319(byte arg0) {
        this.field1632 = class37.method243(this.field1615, 511);
        if (arg0 >= -9) {
            return;
        }
        field1634++;
        this.method758(false);
        for (int var2 = this.field1628 - 1; var2 >= 1; var2--) {
            short var3 = this.field1602[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1628--;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I[II)V", line = 442)
    public final void method762(int arg0, int[] arg1, int arg2) {
        if (arg2 != 2048) {
            return;
        }
        int var4 = class71.field1104[arg0] * this.field1604;
        field1621++;
        if (this.field1628 == 1) {
            short var5 = this.field1602[0];
            int var6 = this.field1603[0] << 12;
            int var7 = this.field1601 * var6 >> 12;
            int var8 = this.field1604 * var6 >> 12;
            int var9 = var4 * var6 >> 12;
            int var10 = var9 >> 12;
            int var11 = this.field1632[var10 & 0xFF] & 0xFF;
            int var12 = var10 + 1;
            int var13 = var9 & 0xFFF;
            if (var12 >= var8) {
                var12 = 0;
            }
            int var14 = this.field1632[var12 & 0xFF] & 0xFF;
            int var15 = class119.field1951[var13];
            if (this.field1620) {
                for (int var19 = 0; var19 < class56.field835; var19++) {
                    int var20 = class31.field430[var19] * this.field1601;
                    int var21 = this.method755(var6 * var20 >> 12, var13, var7, var14, arg2 - 2174, var15, var11);
                    int var22 = var5 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            } else {
                for (int var16 = 0; var16 < class56.field835; var16++) {
                    int var17 = class31.field430[var16] * this.field1601;
                    int var18 = this.method755(var6 * var17 >> 12, var13, var7, var14, -127, var15, var11);
                    arg1[var16] = var5 * var18 >> 12;
                }
            }
            return;
        }
        short var23 = this.field1602[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field1603[0] << 12;
            int var25 = this.field1601 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = this.field1604 * var24 >> 12;
            int var28 = var26 >> 12;
            int var29 = this.field1632[var28 & 0xFF] & 0xFF;
            int var30 = var28 + 1;
            int var31 = var26 & 0xFFF;
            if (var27 <= var30) {
                var30 = 0;
            }
            int var32 = class119.field1951[var31];
            int var33 = this.field1632[var30 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class56.field835; var34++) {
                int var35 = class31.field430[var34] * this.field1601;
                int var36 = this.method755(var24 * var35 >> 12, var31, var25, var33, arg2 ^ 0xFFFFF783, var32, var29);
                arg1[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field1628; var37++) {
            short var38 = this.field1602[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field1603[var37] << 12;
                int var40 = this.field1601 * var39 >> 12;
                int var41 = this.field1604 * var39 >> 12;
                int var42 = var4 * var39 >> 12;
                int var43 = var42 >> 12;
                int var44 = this.field1632[var43 & 0xFF] & 0xFF;
                int var45 = var43 + 1;
                int var46 = var42 & 0xFFF;
                if (var45 >= var41) {
                    var45 = 0;
                }
                int var47 = class119.field1951[var46];
                int var48 = this.field1632[var45 & 0xFF] & 0xFF;
                if (this.field1620 && (this.field1628 - 1) == var37) {
                    for (int var49 = 0; var49 < class56.field835; var49++) {
                        int var50 = class31.field430[var49] * this.field1601;
                        int var51 = this.method755(var39 * var50 >> 12, var46, var40, var48, -124, var47, var44);
                        int var52 = (var38 * var51 >> 12) + arg1[var49];
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class56.field835; var53++) {
                        int var54 = class31.field430[var53] * this.field1601;
                        int var55 = this.method755(var39 * var54 >> 12, var46, var40, var48, -127, var47, var44);
                        arg1[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "(I)V", line = 624)
    public static final void method763(int arg0) {
        field1613++;
        if (arg0 <= 36) {
            method757(-28, -121, false, 21, 45);
        }
        for (int var1 = 0; var1 < class230.field3787; var1++) {
            class139 var2 = class65.method540(var1, (byte) 123);
            if (var2 != null && var2.field2293 == 0) {
                class308.field5244[var1] = 0;
                class116.field1915[var1] = 0;
            }
        }
        class33.field474 = new class94(16);
    }
}
