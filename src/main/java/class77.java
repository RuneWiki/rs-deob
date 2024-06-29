import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class77 extends class16 {

    @OriginalMember(owner = "client!tm", name = "U", descriptor = "I")
    public int field1154 = 1638;

    @OriginalMember(owner = "client!tm", name = "T", descriptor = "I")
    public int field1153 = 4;

    @OriginalMember(owner = "client!tm", name = "X", descriptor = "[B")
    private byte[] field1157 = new byte[512];

    @OriginalMember(owner = "client!tm", name = "S", descriptor = "I")
    public int field1152 = 4;

    @OriginalMember(owner = "client!tm", name = "W", descriptor = "I")
    public int field1156 = 0;

    @OriginalMember(owner = "client!tm", name = "cb", descriptor = "Z")
    public boolean field1162 = true;

    @OriginalMember(owner = "client!tm", name = "kb", descriptor = "I")
    public int field1170 = 4;

    @OriginalMember(owner = "client!tm", name = "bb", descriptor = "Lpm;")
    public static class111 field1161 = new class111(64);

    @OriginalMember(owner = "client!tm", name = "lb", descriptor = "Z")
    public static boolean field1171 = false;

    @OriginalMember(owner = "client!tm", name = "jb", descriptor = "Ljava/lang/String;")
    public static String field1169 = "Loaded config";

    @OriginalMember(owner = "client!tm", name = "ob", descriptor = "I")
    public static int field1174 = 7759444;

    @OriginalMember(owner = "client!tm", name = "nb", descriptor = "[S")
    public static short[] field1173 = new short[] { 17, 32, 39, 45, 25, 43, 49, 44 };

    @OriginalMember(owner = "client!tm", name = "mb", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!tm", name = "Q", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!tm", name = "R", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!tm", name = "V", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!tm", name = "Y", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!tm", name = "Z", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!tm", name = "ab", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!tm", name = "db", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!tm", name = "eb", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!tm", name = "fb", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!tm", name = "ib", descriptor = "Lmf;")
    public static class53 field1168;

    @OriginalMember(owner = "client!tm", name = "gb", descriptor = "[S")
    private short[] field1166;

    @OriginalMember(owner = "client!tm", name = "hb", descriptor = "[S")
    private short[] field1167;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(ZI)[I", line = 9)
    public final int[] method8(boolean arg0, int arg1) {
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (!arg0) {
            this.field1167 = (short[]) null;
        }
        field1164++;
        if (this.field207.field4024) {
            this.method568(var3, arg1, -9);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(B)V", line = 34)
    public final void method55(byte arg0) {
        this.field1157 = class251.method1776(arg0 - 14422, this.field1156);
        field1165++;
        if (arg0 != 0) {
            return;
        }
        this.method566(4);
        for (int var2 = this.field1170 - 1; var2 >= 1; var2--) {
            short var3 = this.field1166[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field1170--;
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V", line = 166)
    public class77() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLim;I)V", line = 66)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg0 != -7) {
            this.method566(90);
        }
        if (arg2 == 0) {
            this.field1162 = arg1.method1399(-1172389784) == 1;
        } else if (arg2 == 1) {
            this.field1170 = arg1.method1399(-1172389784);
        } else if (arg2 == 2) {
            this.field1154 = arg1.method1389(113);
            if (this.field1154 < 0) {
                this.field1166 = new short[this.field1170];
                for (int var5 = 0; var5 < this.field1170; var5++) {
                    this.field1166[var5] = (short) arg1.method1389(class35.method228(arg0, -98));
                }
            }
        } else if (arg2 == 3) {
            this.field1153 = this.field1152 = arg1.method1399(-1172389784);
        } else if (arg2 == 4) {
            this.field1156 = arg1.method1399(-1172389784);
        } else if (arg2 == 5) {
            this.field1153 = arg1.method1399(-1172389784);
        } else if (arg2 == 6) {
            this.field1152 = arg1.method1399(-1172389784);
        }
        field1159++;
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V", line = 170)
    private final void method566(int arg0) {
        field1155++;
        if (this.field1154 > 0) {
            this.field1167 = new short[this.field1170];
            this.field1166 = new short[this.field1170];
            for (int var3 = 0; var3 < this.field1170; var3++) {
                this.field1166[var3] = (short) ((int) (Math.pow((double) ((float) this.field1154 / 4096.0F), (double) var3) * 4096.0D));
                this.field1167[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field1166 != null && this.field1166.length == this.field1170) {
            this.field1167 = new short[this.field1170];
            for (int var2 = 0; var2 < this.field1170; var2++) {
                this.field1167[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        if (arg0 != 4) {
            this.field1170 = -65;
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V", line = 211)
    public static final void method567(int arg0, int arg1) {
        field1150++;
        if (arg1 != -24814) {
            method572(-65);
        }
        class179 var2 = class319.method2220(arg0, (byte) -104, 4);
        var2.method1239(true);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([III)V", line = 230)
    public final void method568(int[] arg0, int arg1, int arg2) {
        field1160++;
        if (arg2 != -9) {
            method570(-40, 83);
        }
        int var4 = class130.field1921[arg1] * this.field1152;
        if (this.field1170 == 1) {
            short var38 = this.field1166[0];
            int var39 = this.field1167[0] << 12;
            int var40 = this.field1153 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = this.field1152 * var39 >> 12;
            int var43 = var41 >> 12;
            int var44 = var41 & 0xFFF;
            int var45 = this.field1157[var43 & 0xFF] & 0xFF;
            int var46 = class231.field3692[var44];
            int var47 = var43 + 1;
            if (var42 <= var47) {
                var47 = 0;
            }
            int var48 = this.field1157[var47 & 0xFF] & 0xFF;
            if (this.field1162) {
                for (int var52 = 0; var52 < class276.field4376; var52++) {
                    int var53 = class27.field396[var52] * this.field1153;
                    int var54 = this.method571(arg2 ^ 0xFFFFFFA9, var45, var44, var46, var40, var48, var39 * var53 >> 12);
                    int var55 = var38 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            } else {
                for (int var49 = 0; var49 < class276.field4376; var49++) {
                    int var50 = class27.field396[var49] * this.field1153;
                    int var51 = this.method571(80, var45, var44, var46, var40, var48, var39 * var50 >> 12);
                    arg0[var49] = var38 * var51 >> 12;
                }
            }
            return;
        }
        short var5 = this.field1166[0];
        if (var5 > 8 || var5 < -8) {
            int var6 = this.field1167[0] << 12;
            int var7 = this.field1153 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field1152 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = this.field1157[var10 & 0xFF] & 0xFF;
            int var12 = var10 + 1;
            if (var12 >= var9) {
                var12 = 0;
            }
            int var13 = var8 & 0xFFF;
            int var14 = this.field1157[var12 & 0xFF] & 0xFF;
            int var15 = class231.field3692[var13];
            for (int var16 = 0; var16 < class276.field4376; var16++) {
                int var17 = class27.field396[var16] * this.field1153;
                int var18 = this.method571(arg2 + 102, var11, var13, var15, var7, var14, var6 * var17 >> 12);
                arg0[var16] = var5 * var18 >> 12;
            }
        }
        for (int var19 = 1; var19 < this.field1170; var19++) {
            short var20 = this.field1166[var19];
            if (var20 > 8 || var20 < -8) {
                int var21 = this.field1167[var19] << 12;
                int var22 = this.field1152 * var21 >> 12;
                int var23 = var4 * var21 >> 12;
                int var24 = this.field1153 * var21 >> 12;
                int var25 = var23 >> 12;
                int var26 = var23 & 0xFFF;
                int var27 = class231.field3692[var26];
                int var28 = this.field1157[var25 & 0xFF] & 0xFF;
                int var29 = var25 + 1;
                if (var22 <= var29) {
                    var29 = 0;
                }
                int var30 = this.field1157[var29 & 0xFF] & 0xFF;
                if (this.field1162 && this.field1170 - 1 == var19) {
                    for (int var31 = 0; var31 < class276.field4376; var31++) {
                        int var32 = class27.field396[var31] * this.field1153;
                        int var33 = this.method571(49, var28, var26, var27, var24, var30, var21 * var32 >> 12);
                        int var34 = arg0[var31] + (var20 * var33 >> 12);
                        arg0[var31] = (var34 >> 1) + 2048;
                    }
                } else {
                    for (int var35 = 0; var35 < class276.field4376; var35++) {
                        int var36 = class27.field396[var35] * this.field1153;
                        int var37 = this.method571(104, var28, var26, var27, var24, var30, var21 * var36 >> 12);
                        arg0[var35] += var20 * var37 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)Llj;", line = 389)
    public static final class56 method569(int arg0, int arg1) {
        int var2 = 100 % ((arg1 + 33) / 51);
        class56 var3 = (class56) class337.field5234.method1619((long) arg0, 112);
        field1163++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class343.field5342.method250(true, 31, arg0);
        class56 var5 = new class56();
        if (var4 != null) {
            var5.method396((byte) -71, arg0, new class192(var4));
        }
        class337.field5234.method1621((long) arg0, 127, var5);
        return var5;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(II)Z", line = 413)
    public static final boolean method570(int arg0, int arg1) {
        field1151++;
        if (class147.field2207 == arg0) {
            return false;
        }
        if (arg1 < 33) {
            method569(15, 77);
        }
        class114.field1704 = new int[4][13][13];
        class132.field2000 = new int[104][104];
        for (int var2 = 0; var2 < 4; var2++) {
            class50.field685[var2] = new class68(104, 104);
        }
        class280.field4416 = new byte[4][104][104];
        class81.field1229 = new byte[4][104][104];
        class116.field1745 = new class256[4][104][104];
        if (class186.field2991) {
            class47.method316(4, 104, 104);
            class32.method211(104, 104);
            class274.field4345 = new class21[13][13];
        }
        class147.field2207 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIIII)I", line = 461)
    private final int method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1158++;
        if (arg0 < 26) {
            field1169 = (String) null;
        }
        int var8 = arg2 - 4096;
        int var9 = arg6 >> 12;
        int var10 = arg6 & 0xFFF;
        int var11 = var10 - 4096;
        int var12 = class231.field3692[var10];
        int var13 = var9 + 1;
        int var14 = var9 & 0xFF;
        if (arg4 <= var13) {
            var13 = 0;
        }
        int var15 = this.field1157[arg1 + var14] & 0x3;
        int var16 = var13 & 0xFF;
        int var17;
        if (var15 <= 1) {
            var17 = var15 == 0 ? arg2 + var10 : -var10 + arg2;
        } else {
            var17 = var15 == 2 ? var10 - arg2 : -arg2 + -var10;
        }
        int var18 = this.field1157[arg1 + var16] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var11 - arg2 : -arg2 + -var11;
        } else {
            var19 = var18 == 0 ? arg2 + var11 : -var11 + arg2;
        }
        int var20 = ((var19 - var17) * var12 >> 12) + var17;
        int var21 = this.field1157[var14 + arg5] & 0x3;
        int var22;
        if (var21 <= 1) {
            var22 = var21 == 0 ? var10 + var8 : -var10 + var8;
        } else {
            var22 = var21 == 2 ? var10 - var8 : -var8 + -var10;
        }
        int var23 = this.field1157[arg5 + var16] & 0x3;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? var11 - var8 : -var8 + -var11;
        } else {
            var24 = var23 == 0 ? var8 + var11 : var8 - var11;
        }
        int var25 = var22 + ((var24 - var22) * var12 >> 12);
        return ((var25 - var20) * arg3 >> 12) + var20;
    }

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "(I)V", line = 539)
    public static void method572(int arg0) {
        field1161 = null;
        field1168 = null;
        field1173 = null;
        if (arg0 <= 7) {
            field1171 = false;
        }
        field1169 = null;
    }
}
