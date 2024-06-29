import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class64 {

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "Lhm;")
    private class20 field1052 = null;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "Z")
    private boolean field1051;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljd;")
    private class141 field1024;

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "Z")
    private boolean field1042;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1015 = "Loading - please wait.";

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field1013 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!ja", name = "B", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ja", name = "E", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ja", name = "F", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ja", name = "G", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!ja", name = "H", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ja", name = "I", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lvd;")
    public static class135 field1021;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "Lja;")
    public static class64 field1049;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "[Ljava/lang/Object;")
    private Object[] field1048;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1022;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method460(int arg0, boolean arg1) {
        class84.method605((byte) 52);
        field1047++;
        if (class22.field394 != 30 && class22.field394 != 25) {
            return;
        }
        class317.field4933++;
        if (arg0 > class317.field4933 && !arg1) {
            return;
        }
        class317.field4933 = 0;
        if (!class248.field3834 && class127.field2032 != null) {
            class273.field4249++;
            class269.field4191.method246(false, 213);
            try {
                class127.field2032.method136(class269.field4191.field1667, class269.field4191.field1661, (byte) -4, 0);
                class269.field4191.field1667 = 0;
            } catch (IOException var3) {
                class248.field3834 = true;
            }
        }
        class84.method605((byte) 52);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 37)
    public final int method461(String arg0, byte arg1) {
        field1046++;
        if (!this.method475(-127)) {
            return 0;
        }
        if (arg1 != 61) {
            this.field1024 = (class141) null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1052.field375.method720(0, class78.method570(var3, 92));
        return this.method470(var4, false);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BII)Z", line = 56)
    private final boolean method462(byte arg0, int arg1, int arg2) {
        field1026++;
        if (!this.method475(-101)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && arg1 < this.field1052.field370.length && arg2 < this.field1052.field370[arg1]) {
            if (arg0 != 27) {
                this.method480(-25, 2);
            }
            return true;
        } else if (class204.field3242) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)I", line = 80)
    public static final int method463(int arg0, int arg1) {
        if (arg0 != -21724) {
            method471(94);
        }
        field1031++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(BII)Z", line = 93)
    public final boolean method464(byte arg0, int arg1, int arg2) {
        field1033++;
        if (!this.method462((byte) 27, arg1, arg2)) {
            return false;
        } else if (this.field1022[arg1] != null && this.field1022[arg1][arg2] != null) {
            return true;
        } else if (this.field1048[arg1] == null) {
            this.method483((byte) -114, arg1);
            if (this.field1048[arg1] == null) {
                return arg0 < 11 ? false : false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)I", line = 120)
    public final int method465(int arg0, int arg1) {
        field1016++;
        if (this.method480(arg0, 17108)) {
            if (arg1 != 0) {
                this.method474(12);
            }
            return this.field1052.field370[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)I", line = 135)
    public final int method466(byte arg0) {
        field1008++;
        if (this.method475(arg0 ^ 0xFFFFFF84)) {
            if (arg0 != 23) {
                this.method474(-39);
            }
            return this.field1052.field370.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)[B", line = 152)
    public final byte[] method467(int arg0, int arg1, int arg2) {
        if (arg1 <= 64) {
            field1049 = (class64) null;
        }
        field1036++;
        return this.method476(arg2, 31, (int[]) null, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 173)
    public final boolean method468(String arg0, byte arg1, String arg2) {
        field1009++;
        if (!this.method475(-96)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field1052.field375.method720(0, class78.method570(var4, 82));
        if (!this.method480(var6, 17108)) {
            return false;
        }
        if (arg1 > -90) {
            field1053 = -102;
        }
        int var7 = this.field1052.field382[var6].method720(0, class78.method570(var5, 105));
        return this.method464((byte) 47, var6, var7);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 198)
    public final boolean method469(String arg0, int arg1) {
        field1035++;
        if (!this.method475(-123)) {
            return false;
        } else if (arg1 == -1465) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1052.field375.method720(0, class78.method570(var3, 88));
            return this.method491(var4, (byte) -126);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(IZ)I", line = 217)
    private final int method470(int arg0, boolean arg1) {
        field1037++;
        if (!this.method480(arg0, 17108)) {
            return 0;
        } else if (this.field1048[arg0] == null) {
            if (arg1) {
                this.method479(-31);
            }
            return this.field1024.method1075(0, arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 238)
    public static void method471(int arg0) {
        field1021 = null;
        field1015 = null;
        field1049 = null;
        if (arg0 != -21582) {
            method463(-8, -21);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Ljava/lang/String;I)V", line = 250)
    public final void method472(String arg0, int arg1) {
        field1025++;
        if (!this.method475(-106)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field1052.field375.method720(0, class78.method570(var3, 87));
        if (arg1 != -7810) {
            field1015 = (String) null;
        }
        this.method488(false, var4);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI[I)Z", line = 267)
    private final boolean method473(byte arg0, int arg1, int[] arg2) {
        field1023++;
        if (!this.method480(arg1, 17108)) {
            return false;
        } else if (this.field1048[arg1] == null) {
            return false;
        } else {
            int var4 = this.field1052.field376[arg1];
            int[] var5 = this.field1052.field381[arg1];
            int var6 = -58 / ((-arg0 - 91) / 34);
            if (this.field1022[arg1] == null) {
                this.field1022[arg1] = new Object[this.field1052.field370[arg1]];
            }
            Object[] var7 = this.field1022[arg1];
            boolean var8 = true;
            for (int var9 = 0; var9 < var4; var9++) {
                int var10;
                if (var5 == null) {
                    var10 = var9;
                } else {
                    var10 = var5[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var11 = class127.method955(-25419, true, this.field1048[arg1]);
                class101 var12 = new class101(var11);
                var12.method740(-51, 5, arg2, var12.field1661.length);
            } else {
                var11 = class127.method955(-25419, false, this.field1048[arg1]);
            }
            byte[] var13;
            try {
                var13 = class152.method1164(var11, -7457);
            } catch (RuntimeException var32) {
                throw class312.method2155(var32, "T3 - " + (arg2 != null) + "," + arg1 + "," + var11.length + "," + class136.method1047(var11, 52, var11.length) + "," + class136.method1047(var11, 50, var11.length - 2) + "," + this.field1052.field368[arg1] + "," + this.field1052.field366);
            }
            if (this.field1042) {
                this.field1048[arg1] = null;
            }
            if (var4 > 1) {
                int var15 = var13.length;
                int var33 = var15 - 1;
                int var16 = var13[var33] & 0xFF;
                int var17 = var33 - var16 * 4 * var4;
                int[] var18 = new int[var4];
                class101 var19 = new class101(var13);
                var19.field1667 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        if (var5 == null) {
                        }
                        var21 += var19.method775(52);
                        var18[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var18[var24]];
                    var18[var24] = 0;
                }
                var19.field1667 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var19.method775(62);
                        class271.method1959(var13, var25, var23[var28], var18[var28], var27);
                        var25 += var27;
                        var18[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field1051) {
                        var7[var30] = var23[var29];
                    } else {
                        var7[var30] = class179.method1325(false, var23[var29], 4706);
                    }
                }
            } else {
                int var31;
                if (var5 == null) {
                    var31 = 0;
                } else {
                    var31 = var5[0];
                }
                if (this.field1051) {
                    var7[var31] = var13;
                } else {
                    var7[var31] = class179.method1325(false, var13, 4706);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)I", line = 461)
    public final int method474(int arg0) {
        field1032++;
        if (!this.method475(arg0 - 12265)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1048.length; var4++) {
            if (this.field1052.field376[var4] > 0) {
                var2 += 100;
                var3 += this.method470(var4, false);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            if (arg0 != 12173) {
                this.method465(70, 62);
            }
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)Z", line = 500)
    private final boolean method475(int arg0) {
        if (arg0 > -81) {
            return false;
        }
        field1012++;
        if (this.field1052 == null) {
            this.field1052 = this.field1024.method1078((byte) 0);
            if (this.field1052 == null) {
                return false;
            }
            this.field1048 = new Object[this.field1052.field383];
            this.field1022 = new Object[this.field1052.field383][];
        }
        return true;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II[II)[B", line = 522)
    public final byte[] method476(int arg0, int arg1, int[] arg2, int arg3) {
        field1039++;
        if (arg1 != 31) {
            this.method485(12, (byte) 73, -10);
        }
        if (!this.method462((byte) 27, arg0, arg3)) {
            return null;
        }
        if (this.field1022[arg0] == null || this.field1022[arg0][arg3] == null) {
            boolean var5 = this.method473((byte) -128, arg0, arg2);
            if (!var5) {
                this.method483((byte) -114, arg0);
                boolean var6 = this.method473((byte) -126, arg0, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class127.method955(arg1 ^ 0xFFFF9CAA, false, this.field1022[arg0][arg3]);
        if (this.field1051) {
            this.field1022[arg0][arg3] = null;
            if (this.field1052.field370[arg0] == 1) {
                this.field1022[arg0] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)[I", line = 574)
    public final int[] method477(int arg0, int arg1) {
        field1041++;
        if (!this.method480(arg0, 17108)) {
            return null;
        }
        if (arg1 != 0) {
            this.method481(106, 116);
        }
        int[] var3 = this.field1052.field381[arg0];
        if (var3 == null) {
            var3 = new int[this.field1052.field376[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;Ljava/awt/Color;BZ)V", line = 607)
    public static final void method478(int arg0, String arg1, Color arg2, byte arg3, boolean arg4) {
        try {
            Graphics var5 = class2.field7.getGraphics();
            if (class326.field5061 == null) {
                class326.field5061 = new Font("Helvetica", 1, 13);
                class298.field4713 = class2.field7.getFontMetrics(class326.field5061);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class180.field2880, class73.field1127);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class116.field1889 == null) {
                    class116.field1889 = class2.field7.createImage(304, 34);
                }
                Graphics var6 = class116.field1889.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class326.field5061);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - class298.field4713.stringWidth(arg1)) / 2, 22);
                var5.drawImage(class116.field1889, class180.field2880 / 2 - 152, class73.field1127 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class180.field2880 / 2 - 152;
                int var9 = class73.field1127 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 - -2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - (arg0 * 3), 30);
                var5.setFont(class326.field5061);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - class298.field4713.stringWidth(arg1)) / 2 + var8, var9 - -22);
            }
            if (class221.field3544 != null) {
                var5.setFont(class326.field5061);
                var5.setColor(Color.white);
                var5.drawString(class221.field3544, class180.field2880 / 2 - class298.field4713.stringWidth(class221.field3544) / 2, class73.field1127 / 2 + -26);
            }
            if (arg3 < 25) {
                method471(115);
            }
        } catch (Exception var12) {
            class2.field7.repaint();
        }
        field1027++;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)Z", line = 676)
    public final boolean method479(int arg0) {
        field1017++;
        if (!this.method475(-112)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 > -60) {
            this.method461((String) null, (byte) -121);
        }
        for (int var3 = 0; var3 < this.field1052.field385.length; var3++) {
            int var4 = this.field1052.field385[var3];
            if (this.field1048[var4] == null) {
                this.method483((byte) -114, var4);
                if (this.field1048[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(II)Z", line = 711)
    private final boolean method480(int arg0, int arg1) {
        field1020++;
        if (!this.method475(-107)) {
            return false;
        }
        if (arg1 != 17108) {
            this.field1051 = false;
        }
        if (arg0 >= 0 && arg0 < this.field1052.field370.length && this.field1052.field370[arg0] != 0) {
            return true;
        } else if (class204.field3242) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(II)V", line = 740)
    public final void method481(int arg0, int arg1) {
        if (arg1 == 1) {
            field1019++;
            if (this.method480(arg0, 17108) && this.field1022 != null) {
                this.field1022[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 758)
    public final void method482(int arg0) {
        if (arg0 >= -19) {
            return;
        }
        field1030++;
        if (this.field1022 != null) {
            for (int var2 = 0; var2 < this.field1022.length; var2++) {
                this.field1022[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)V", line = 780)
    private final void method483(byte arg0, int arg1) {
        field1044++;
        if (arg0 != -114) {
            return;
        }
        if (this.field1042) {
            this.field1048[arg1] = this.field1024.method1080(125, arg1);
        } else {
            this.field1048[arg1] = class179.method1325(false, this.field1024.method1080(104, arg1), arg0 + 4820);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)[B", line = 796)
    public final byte[] method484(String arg0, String arg1, boolean arg2) {
        field1018++;
        if (!this.method475(-125)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field1052.field375.method720(0, class78.method570(var4, 112));
        if (!this.method480(var6, 17108)) {
            return null;
        }
        if (arg2) {
            this.method470(-86, false);
        }
        int var7 = this.field1052.field382[var6].method720(0, class78.method570(var5, 79));
        return this.method467(var7, 95, var6);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBI)[B", line = 825)
    public final byte[] method485(int arg0, byte arg1, int arg2) {
        field1029++;
        if (!this.method462((byte) 27, arg0, arg2)) {
            return null;
        }
        if (this.field1022[arg0] == null || this.field1022[arg0][arg2] == null) {
            boolean var4 = this.method473((byte) -127, arg0, (int[]) null);
            if (!var4) {
                this.method483((byte) -114, arg0);
                boolean var5 = this.method473((byte) -127, arg0, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        return arg1 > -82 ? (byte[]) null : class127.method955(-25419, false, this.field1022[arg0][arg2]);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(Ljava/lang/String;I)Z", line = 873)
    public final boolean method486(String arg0, int arg1) {
        field1043++;
        if (this.method475(-120)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field1052.field375.method720(arg1 ^ arg1, class78.method570(var3, 105));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 891)
    public final int method487(boolean arg0, String arg1) {
        field1040++;
        if (!this.method475(-88)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field1052.field375.method720(0, class78.method570(var3, 82));
        if (arg0) {
            field1049 = (class64) null;
        }
        return this.method480(var4, 17108) ? var4 : -1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZI)V", line = 915)
    private final void method488(boolean arg0, int arg1) {
        this.field1024.method1082(arg1, (byte) -57);
        field1045++;
        if (arg0) {
            this.method465(-105, 22);
        }
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(II)Z", line = 933)
    public final boolean method489(int arg0, int arg1) {
        field1011++;
        if (!this.method475(-127)) {
            return false;
        } else if (this.field1052.field370.length == 1) {
            return this.method464((byte) 13, 0, arg0);
        } else if (arg1 != 0) {
            return false;
        } else if (!this.method480(arg0, 17108)) {
            return false;
        } else if (this.field1052.field370[arg0] == 1) {
            return this.method464((byte) 107, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IZ)[B", line = 960)
    public final byte[] method490(int arg0, boolean arg1) {
        field1014++;
        if (!arg1) {
            this.field1042 = false;
        }
        if (!this.method475(-103)) {
            return null;
        } else if (this.field1052.field370.length == 1) {
            return this.method467(arg0, 114, 0);
        } else if (!this.method480(arg0, 17108)) {
            return null;
        } else if (this.field1052.field370[arg0] == 1) {
            return this.method467(0, 103, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)Z", line = 992)
    public final boolean method491(int arg0, byte arg1) {
        int var3 = -22 % ((arg1 + 60) / 51);
        field1050++;
        if (!this.method480(arg0, 17108)) {
            return false;
        } else if (this.field1048[arg0] == null) {
            this.method483((byte) -114, arg0);
            return this.field1048[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZIZ)V", line = 1013)
    public final void method492(boolean arg0, int arg1, boolean arg2) {
        field1034++;
        if (!this.method475(-92)) {
            return;
        }
        if (arg1 != 25) {
            this.method486((String) null, 32);
        }
        if (arg2) {
            this.field1052.field382 = null;
            this.field1052.field367 = (int[][]) null;
        }
        if (arg0) {
            this.field1052.field375 = null;
            this.field1052.field372 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)I", line = 1040)
    public final int method493(int arg0) {
        field1038++;
        if (arg0 != -9424) {
            return 12;
        } else if (this.method475(-116)) {
            return this.field1052.field366;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)[F", line = 1060)
    public static final float[] method494(int arg0) {
        field1028++;
        float var1 = class97.method703() + class97.method706();
        int var2 = class97.method704();
        class326.field5062[3] = 1.0F;
        float var3 = (float) ((var2 & 0xFF9E4A) >> 16) / 255.0F;
        int var4 = 92 % ((arg0 - 25) / 43);
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = (float) (var2 >> 8 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class326.field5062[2] = class180.field2886[2] * var5 * var7 * var1;
        class326.field5062[0] = class180.field2886[0] * var3 * var7 * var1;
        class326.field5062[1] = class180.field2886[1] * var6 * var7 * var1;
        return class326.field5062;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Ljd;ZZ)V", line = 1088)
    public class64(class141 arg0, boolean arg1, boolean arg2) {
        this.field1051 = arg2;
        this.field1024 = arg0;
        this.field1042 = arg1;
    }
}
