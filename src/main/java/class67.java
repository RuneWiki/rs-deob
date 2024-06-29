import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class67 extends class55 {

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "Z")
    private boolean field1048 = false;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "Llg;")
    private class13 field1050 = null;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    private int field1055 = -1;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "Z")
    private boolean field1047 = false;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    private int field1069 = -1;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "I")
    private int field1054 = -32768;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    private int field1044;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    private int field1046;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    private int field1071;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    private int field1053;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    private int field1042;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    private int field1060;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "Lpk;")
    private class103 field1059;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    private int field1063;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1039 = "Connected to update server";

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field1057 = 0;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lgj;")
    private class249 field1043;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "Ltd;")
    public static class74 field1058;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZI)V")
    private final void method538(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method543((class4) null, (byte) 121);
        }
        field1049++;
        label92: while (true) {
            if (this.field1059 == null) {
                if (this.field1047) {
                    return;
                }
                this.method540(false, -1);
                if (this.field1059 == null) {
                    return;
                }
            }
            int var4 = class41.field686 - this.field1061;
            if (var4 > 100 && this.field1059.field1592 > 0) {
                int var5 = this.field1059.field1606.length - this.field1059.field1592;
                while (var5 > this.field1056 && var4 > this.field1059.field1602[this.field1056]) {
                    var4 -= this.field1059.field1602[this.field1056];
                    this.field1056++;
                }
                if (this.field1056 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1059.field1606.length; var7++) {
                        var6 += this.field1059.field1602[var7];
                    }
                    var4 %= var6;
                }
                this.field1063 = this.field1056 + 1;
                if (this.field1063 >= this.field1059.field1606.length) {
                    this.field1063 -= this.field1059.field1592;
                    if (this.field1063 < 0 || this.field1059.field1606.length <= this.field1063) {
                        this.field1063 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field1059.field1602[this.field1056] >= var4) {
                            this.field1061 = class41.field686 - var4;
                            this.field1060 = var4;
                            return;
                        }
                        class136.method1004(arg2, this.field1056, arg0, this.field1059, 255, false);
                        var4 -= this.field1059.field1602[this.field1056];
                        this.field1056++;
                        if (this.field1056 >= this.field1059.field1606.length) {
                            this.field1056 -= this.field1059.field1592;
                            if (this.field1056 < 0 || this.field1059.field1606.length <= this.field1056) {
                                this.field1059 = null;
                                continue label92;
                            }
                        }
                        this.field1063 = this.field1056 + 1;
                    } while (this.field1063 < this.field1059.field1606.length);
                    this.field1063 -= this.field1059.field1592;
                } while (this.field1063 >= 0 && this.field1063 < this.field1059.field1606.length);
                this.field1063 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class249 arg10) {
        class55 var13 = this.method544(-33);
        field1045++;
        if (var13 != null) {
            this.method546(var13, (byte) -63);
            var13.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1043);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)I")
    public static final int method539(byte arg0, int arg1) {
        field1067++;
        if (arg0 <= 61) {
            field1041 = -87;
        }
        if (arg1 > 0) {
            return 1;
        } else if (arg1 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)V")
    private final void method540(boolean arg0, int arg1) {
        int var3 = arg1;
        field1070++;
        boolean var4 = arg0;
        if (arg1 == -1) {
            class295 var5 = class166.method1209(-106, this.field1071);
            class295 var6 = var5;
            if (var5.field4598 != null) {
                var5 = var5.method1956(25748);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4656 != null) {
                if (this.field1059 != null && var5.method1966(this.field1059.field1598, -1)) {
                    return;
                }
                var3 = var5.method1953(-23);
                if (this.field1055 != var5.field4584) {
                    var4 = var5.field4625;
                }
            } else if (var5.field4650 == -1) {
                if (var6 != null && var6.field4656 != null) {
                    if (this.field1059 != null && var6.method1966(this.field1059.field1598, -1)) {
                        return;
                    }
                    var3 = var6.method1953(-65);
                    if (this.field1055 != var6.field4584) {
                        var4 = var6.field4625;
                    }
                } else if (var6 != null && var6.field4650 != -1 && this.field1055 != var6.field4584) {
                    var3 = var6.field4650;
                    var4 = var6.field4625;
                }
            } else if (this.field1055 != var5.field4584) {
                var3 = var5.field4650;
                var4 = var5.field4625;
            }
        }
        if (var3 == -1) {
            this.field1059 = null;
            return;
        }
        if (this.field1059 == null || this.field1059.field1598 != var3) {
            this.field1059 = class250.method1700(var3, -59);
        } else if (this.field1059.field1604 == 0) {
            return;
        }
        if (var4) {
            this.field1056 = (int) ((double) this.field1059.field1606.length * Math.random());
            this.field1060 = (int) ((double) this.field1059.field1602[this.field1056] * Math.random()) + 1;
        } else {
            this.field1056 = 0;
            this.field1060 = 1;
        }
        this.field1063 = this.field1056 + 1;
        if (this.field1063 < 0 || this.field1063 >= this.field1059.field1606.length) {
            this.field1063 = -1;
        }
        this.field1061 = class41.field686 - this.field1060;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method541(int arg0) {
        field1058 = null;
        if (arg0 != 128) {
            field1039 = null;
        }
        field1039 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
    public final void method91(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class55 var6 = null;
        field1051++;
        this.method538(arg4, true, arg3);
        if (!this.field1048) {
            if (var6 == null) {
                var6 = this.method544(-125);
            }
            if (var6 == null) {
                return;
            }
            this.method546(var6, (byte) 122);
        }
        if (this.field1043 != null) {
            this.field1043.method1688(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZ)Lnh;")
    private final class55 method542(byte arg0, boolean arg1) {
        field1072++;
        boolean var3 = class303.field4876 != class233.field3684;
        class295 var4 = class166.method1209(-98, this.field1071);
        if (var4.field4598 != null) {
            var4 = var4.method1956(25748);
        }
        if (var4 == null) {
            this.field1069 = this.field1056;
            this.field1055 = -1;
            return null;
        }
        if (!this.field1047 && this.field1055 != var4.field4584) {
            this.method540(false, -1);
        }
        int var5 = this.field1044 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field4592;
            var7 = var4.field4620;
        } else {
            var6 = var4.field4620;
            var7 = var4.field4592;
        }
        int var8 = (var6 >> 1) + this.field1046;
        int var9 = (var6 + 1 >> 1) + this.field1046;
        int var10 = (var7 >> 1) + this.field1066;
        int var11 = (var7 + 1 >> 1) + this.field1066;
        this.method538(var10 * 128, true, var8 * 128);
        boolean var12 = !var3 && var4.field4608 && (this.field1055 != var4.field4584 || (this.field1069 != this.field1056 || this.field1059 != null && (this.field1059.field1603 || class305.field4896) && this.field1063 != this.field1056) && client.field2386 >= 2);
        if (arg1 && !var12) {
            this.field1055 = var4.field4584;
            this.field1069 = this.field1056;
            return null;
        }
        int[][] var13 = class233.field3684[this.field1053];
        if (arg0 >= -68) {
            this.field1046 = 119;
        }
        int var14 = var13[var8][var10] + var13[var9][var11] + var13[var8][var11] + var13[var9][var10] >> 2;
        int var15 = (this.field1046 << 7) + (var6 << 6);
        int var16 = (this.field1066 << 7) + (var7 << 6);
        boolean var17 = this.field1050 == null;
        int[][] var18 = null;
        if (var3) {
            var18 = class303.field4876[0];
        } else if (this.field1053 < 3) {
            var18 = class233.field3684[this.field1053 + 1];
        }
        class27 var19;
        if (this.field1059 == null) {
            var19 = var4.method1961(var13, (byte) 123, this.field1042, var17 ? class274.field4366 : this.field1050, var16, this.field1044, var14, var12, var18, var15, false);
        } else {
            var19 = var4.method1969(var15, var12, this.field1042, this.field1059, (byte) -111, var18, this.field1060, this.field1063, var14, var13, this.field1056, var16, this.field1044, var17 ? class274.field4366 : this.field1050);
        }
        if (var19 == null) {
            this.field1055 = var4.field4584;
            this.field1069 = this.field1056;
            return null;
        } else {
            this.field1055 = var4.field4584;
            this.field1069 = this.field1056;
            return var19.field466;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lvd;B)V")
    public static final void method543(class4 arg0, byte arg1) {
        field1040++;
        class245 var2 = null;
        try {
            class139 var3 = arg0.method24((byte) -112, "runescape");
            while (var3.field2082 == 0) {
                class122.method922(1L, (byte) -107);
            }
            if (var3.field2082 == 1) {
                var2 = (class245) var3.field2080;
                class31 var4 = class181.method1296(100);
                var2.method1662(var4.field541, (byte) 96, 0, var4.field560);
            }
            if (arg1 > -1) {
                field1058 = null;
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method1663(1);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()I")
    public final int method82() {
        field1064++;
        return this.field1054;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)Lnh;")
    public final class55 method544(int arg0) {
        if (arg0 >= -32) {
            this.method538(125, false, -85);
        }
        field1068++;
        return this.method542((byte) -85, false);
    }

    @OriginalMember(owner = "client!ri", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1065++;
        if (this.field1043 != null) {
            this.field1043.method1691();
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
    public static final void method545(int arg0) {
        if (arg0 == 100) {
            for (int var1 = 0; var1 < 100; var1++) {
                class247.field3933[var1] = true;
            }
            field1062++;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lnh;B)V")
    private final void method546(class55 arg0, byte arg1) {
        class87 var3 = (class87) arg0;
        if ((this.field1043 == null || this.field1043.field3969) && (var3.field1300 != null || var3.field1313 != null)) {
            class295 var4 = class166.method1209(-107, this.field1071);
            if (var4.field4598 != null) {
                var4 = var4.method1956(25748);
            }
            if (var4 != null) {
                this.field1043 = new class249(class41.field686, var4.field4620, var4.field4592);
            }
        }
        if (this.field1043 != null) {
            this.field1043.method1686(var3.field1300, var3.field1313, false, var3.field1291, var3.field1329, var3.field1296);
        }
        int var5 = 63 / ((47 - arg1) / 55);
        field1052++;
        this.field1048 = true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method547(String arg0, byte arg1) {
        field1038++;
        int var2 = arg0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        int var5 = 0;
        if (arg1 != 20) {
            field1039 = null;
        }
        while (var2 > var5) {
            char var6 = arg0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class117.method857(var6, 1);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
            var5++;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(IIIIIIIZLnh;)V")
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class55 arg8) {
        this.field1044 = arg2;
        this.field1046 = arg4;
        this.field1071 = arg0;
        this.field1053 = arg3;
        this.field1042 = arg1;
        this.field1066 = arg5;
        if (arg8 != null) {
            this.field1047 = true;
            if (arg8 instanceof class67) {
                class67 var10 = (class67) arg8;
                this.field1060 = var10.field1060;
                this.field1056 = var10.field1056;
                this.field1059 = var10.field1059;
                this.field1063 = var10.field1063;
                this.field1061 = var10.field1061;
            }
        }
        if (this.field1047) {
            this.method540(false, arg6);
        }
    }
}
