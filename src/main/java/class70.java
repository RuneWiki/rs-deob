import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class70 extends class128 {

    @OriginalMember(owner = "client!de", name = "C", descriptor = "Z")
    public boolean field1139 = true;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "[I")
    public static int[] field1135 = new int[500];

    @OriginalMember(owner = "client!de", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1142 = " has logged out.";

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "Ltm;")
    public static class79 field1146 = new class79(32);

    @OriginalMember(owner = "client!de", name = "z", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "[I")
    public int[] field1137;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "[I")
    private int[] field1149;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "[I")
    public static int[] field1156;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field1141;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "[[I")
    private int[][] field1138;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZI)I", line = 4)
    public final int method664(boolean arg0, int arg1) {
        field1153++;
        if (arg0) {
            return 85;
        } else if (this.field1149 == null || arg1 < 0 || arg1 > this.field1149.length) {
            return -1;
        } else {
            return this.field1149[arg1];
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILpi;)Ljava/lang/String;", line = 23)
    public final String method665(int arg0, class336 arg1) {
        field1136++;
        if (arg0 != 0) {
            this.method670(111, (byte) 45, (class336) null);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1149 != null) {
            for (int var4 = 0; var4 < this.field1149.length; var4++) {
                var3.append(this.field1141[var4]);
                var3.append(class352.method2455(true, arg1.method2325(class92.field1443[this.field1149[var4]], 7), this.field1149[var4], this.field1138[var4]));
            }
        }
        var3.append(this.field1141[this.field1141.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILhn;)V", line = 54)
    public static final void method666(int arg0, class39 arg1) {
        field1152++;
        if (arg0 == -26032) {
            class289.field4608 = arg1;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V", line = 67)
    public static final void method667(int arg0, byte arg1) {
        field1143++;
        class255.field4115 = -1;
        class199.field3404 = -1;
        class95.field1483 = arg0;
        int var2 = -69 / ((arg1 + 23) / 32);
        class218.method1605(0);
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)I", line = 95)
    public final int method668(int arg0) {
        field1155++;
        if (arg0 == -18989) {
            return this.field1149 == null ? 0 : this.field1149.length;
        } else {
            return -7;
        }
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V", line = 109)
    public final void method669(int arg0) {
        if (this.field1137 != null) {
            for (int var2 = 0; var2 < this.field1137.length; var2++) {
                this.field1137[var2] = class144.method1159(this.field1137[var2], 32768);
            }
        }
        field1145++;
        if (arg0 != 32768) {
            method667(-75, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBLpi;)V", line = 130)
    private final void method670(int arg0, byte arg1, class336 arg2) {
        if (arg0 == 1) {
            this.field1141 = class100.method866(arg2.method2365(124), true, '<');
        } else if (arg0 == 2) {
            int var8 = arg2.method2364(-9069);
            this.field1137 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1137[var9] = arg2.method2339((byte) -46);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method2364(arg1 - 9100);
            this.field1138 = new int[var4][];
            this.field1149 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2339((byte) -46);
                this.field1149[var5] = var6;
                this.field1138[var5] = new int[class175.field2991[var6]];
                for (int var7 = 0; var7 < class175.field2991[var6]; var7++) {
                    this.field1138[var5][var7] = arg2.method2339((byte) -46);
                }
            }
        } else if (arg0 == 4) {
            this.field1139 = false;
        }
        if (arg1 == 31) {
            field1147++;
        }
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V", line = 197)
    public static void method671(int arg0) {
        field1142 = null;
        if (arg0 <= 52) {
            method671(-70);
        }
        field1156 = null;
        field1135 = null;
        field1146 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([ILpi;I)V", line = 211)
    public final void method672(int[] arg0, class336 arg1, int arg2) {
        field1154++;
        if (arg2 < 53) {
            field1151 = 79;
        }
        if (this.field1149 == null) {
            return;
        }
        for (int var4 = 0; this.field1149.length > var4 && arg0.length > var4; var4++) {
            int var5 = class269.field4302[this.method664(false, var4)];
            if (var5 > 0) {
                arg1.method2335((byte) -112, var5, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BII)I", line = 257)
    public final int method673(byte arg0, int arg1, int arg2) {
        field1144++;
        if (this.field1149 == null || arg1 < 0 || arg1 > this.field1149.length) {
            return -1;
        } else if (this.field1138[arg1] == null || arg2 < 0 || this.field1138[arg1].length < arg2) {
            return -1;
        } else if (arg0 >= -95) {
            return -91;
        } else {
            return this.field1138[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;ZIZLjava/lang/String;ZBJIII)V", line = 276)
    public static final void method674(String arg0, boolean arg1, int arg2, boolean arg3, String arg4, boolean arg5, byte arg6, long arg7, int arg8, int arg9, int arg10) {
        field1150++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class336 var14 = new class336(128);
        var14.method2370(10, (byte) -20);
        var14.method2359(arg6 ^ 0x3004935A, (arg5 ? 4 : 0) | (arg1 ? 2 : 0) | (arg3 ? 1 : 0));
        var14.method2333(arg7, 61);
        var14.method2320(arg6 ^ 0x1782, var12[0]);
        var14.method2349(true, arg4);
        var14.method2320(-6128, var12[1]);
        var14.method2359(-805606200, class201.field3433);
        var14.method2370(arg9, (byte) -20);
        var14.method2370(arg8, (byte) -20);
        var14.method2320(-6128, var12[2]);
        var14.method2359(-805606200, arg2);
        var14.method2359(-805606200, arg10);
        var14.method2320(-6128, var12[3]);
        var14.method2330(class226.field3809, class137.field2545, 0);
        if (arg6 != -110) {
            return;
        }
        class336 var15 = new class336(350);
        var15.method2349(true, arg0);
        int var16 = 8 - (class283.method1927(true, arg0) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method2370((int) (Math.random() * 255.0D), (byte) -20);
        }
        var15.method2376((byte) -107, var12);
        class341.field5443.field5353 = 0;
        class341.field5443.method2370(22, (byte) -20);
        class341.field5443.method2359(arg6 ^ 0x3004935A, var14.field5353 + var15.field5353 + 2);
        class341.field5443.method2359(arg6 - 805606090, 546);
        class341.field5443.method2345((byte) -99, var14.field5353, var14.field5342, 0);
        class341.field5443.method2345((byte) -69, var15.field5353, var15.field5342, 0);
        class69.field1127 = 1;
        class225.field3792 = 0;
        class108.field1843 = 0;
        class148.field2660 = -3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)Ljava/lang/String;", line = 335)
    public final String method675(byte arg0) {
        StringBuffer var2 = new StringBuffer(80);
        field1157++;
        if (this.field1141 == null) {
            return "";
        }
        var2.append(this.field1141[0]);
        int var3 = 70 / ((28 - arg0) / 50);
        for (int var4 = 1; var4 < this.field1141.length; var4++) {
            var2.append("...");
            var2.append(this.field1141[var4]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLpi;)V", line = 367)
    public final void method676(byte arg0, class336 arg1) {
        while (true) {
            int var3 = arg1.method2364(-9069);
            if (var3 == 0) {
                field1148++;
                if (arg0 > -62) {
                    this.field1149 = (int[]) null;
                }
                return;
            }
            this.method670(var3, (byte) 31, arg1);
        }
    }
}
