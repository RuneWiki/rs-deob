import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class65 {

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Z")
    public boolean field1151 = false;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Z")
    public boolean field1160 = false;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public int field1158 = -1;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "Z")
    public boolean field1168 = false;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public int field1156 = -1;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public int field1170 = -1;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public int field1166 = 99;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public int field1173 = -1;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public int field1171 = 2;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Z")
    public boolean field1161 = false;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public int field1169 = 5;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public int field1178 = -1;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Lbf;")
    public static class199 field1165 = new class199(64);

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public static int field1179 = 0;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "Lqk;")
    public static class207 field1183 = class24.method212(255, "ondulation:");

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field1182 = 0;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "Lbi;")
    public static class91 field1177;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[I")
    public int[] field1150;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "[I")
    private int[] field1174;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "[I")
    public int[] field1180;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "[Z")
    public boolean[] field1154;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "[[I")
    public int[][] field1157;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method465(byte arg0) {
        field1183 = null;
        field1177 = null;
        field1165 = null;
        int var1 = 59 % ((arg0 + 19) / 40);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public final void method466(int arg0) {
        if (this.field1178 == -1) {
            if (this.field1154 == null) {
                this.field1178 = 0;
            } else {
                this.field1178 = 2;
            }
        }
        field1176++;
        if (~this.field1170 != arg0) {
            return;
        }
        if (this.field1154 == null) {
            this.field1170 = 0;
        } else {
            this.field1170 = 2;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIZILba;)Lba;")
    public final class166 method467(int arg0, int arg1, boolean arg2, int arg3, class166 arg4) {
        field1164++;
        int var6 = this.field1150[arg0];
        int var7 = this.field1180[arg0];
        class287 var8 = class83.method620((byte) -84, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method275(true, true, true);
        }
        class287 var10 = null;
        class287 var11 = null;
        class287 var12 = null;
        if ((this.field1160 || class99.field1762) && arg1 != -1 && this.field1180.length > arg1) {
            int var13 = this.field1180[arg1];
            var10 = class83.method620((byte) -84, var13 >> 16);
            arg1 = var13 & 0xFFFF;
        }
        int var14 = 0;
        int var15 = 0;
        if (this.field1174 != null) {
            if (arg0 < this.field1174.length) {
                var14 = this.field1174[arg0];
                if (var14 != 65535) {
                    var11 = class83.method620((byte) -84, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field1160 || class99.field1762) && arg1 != -1 && arg1 < this.field1174.length) {
                var15 = this.field1174[arg1];
                if (var15 != 65535) {
                    var12 = class83.method620((byte) -84, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1959((byte) -48, var9);
        boolean var17 = !var8.method1956(var9, -128);
        if (var11 != null) {
            var16 &= !var11.method1959((byte) -48, var14);
            var17 &= !var11.method1956(var14, -72);
        }
        if (var10 != null) {
            var16 &= !var10.method1959((byte) -48, arg1);
            var17 &= !var10.method1956(arg1, -65);
        }
        if (!arg2) {
            method473(64, -125);
        }
        if (var12 != null) {
            var16 &= !var12.method1959((byte) -48, var15);
            var17 &= !var12.method1956(var15, -119);
        }
        class166 var18 = arg4.method275(var16, var17, !this.field1151);
        var18.method1199(var8, var9, var10, arg1, arg3 - 1, var6, this.field1151);
        if (var11 != null) {
            var18.method1199(var11, var14, var12, var15, arg3 - 1, var6, this.field1151);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BII)I")
    public static final int method468(byte arg0, int arg1, int arg2) {
        field1175++;
        class40 var3 = (class40) class177.field3194.method1867((long) arg2, true);
        if (var3 == null) {
            return 0;
        } else {
            if (arg0 >= -28) {
                field1182 = -127;
            }
            return arg1 >= 0 && var3.field804.length > arg1 ? var3.field804[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILba;III)Lba;")
    public final class166 method469(int arg0, int arg1, class166 arg2, int arg3, int arg4, int arg5) {
        field1162++;
        int var7 = this.field1150[arg3];
        int var8 = this.field1180[arg3];
        class287 var9 = class83.method620((byte) -84, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method276(true, true, true);
        }
        int var11 = arg0 & 0x3;
        class287 var12 = null;
        if ((this.field1160 || class99.field1762) && arg5 != -1 && arg5 < this.field1180.length) {
            int var13 = this.field1180[arg5];
            var12 = class83.method620((byte) -84, var13 >> 16);
            arg5 = var13 & 0xFFFF;
        }
        class166 var14;
        if (var12 == null) {
            var14 = arg2.method276(!var9.method1959((byte) -48, var10), !var9.method1956(var10, -38), !this.field1151);
        } else {
            var14 = arg2.method276(!var9.method1959((byte) -48, var10) & !var12.method1959((byte) -48, arg5), !var9.method1956(var10, -126) & !var12.method1956(arg5, -69), !this.field1151);
        }
        if (var11 == 1) {
            var14.method273();
        } else if (var11 == 2) {
            var14.method295();
        } else if (var11 == 3) {
            var14.method285();
        }
        if (arg1 != -22959) {
            this.method471((class149) null, 40);
        }
        var14.method1199(var9, var10, var12, arg5, arg4 - 1, var7, this.field1151);
        if (var11 == 1) {
            var14.method285();
        } else if (var11 == 2) {
            var14.method295();
        } else if (var11 == 3) {
            var14.method273();
        }
        return var14;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILv;I)V")
    private final void method470(int arg0, class149 arg1, int arg2) {
        if (arg2 != -6257) {
            method468((byte) 19, 111, 94);
        }
        field1155++;
        if (arg0 == 1) {
            int var4 = arg1.method1050(1272006568);
            this.field1150 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1150[var5] = arg1.method1050(arg2 + 1272012825);
            }
            this.field1180 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1180[var6] = arg1.method1050(1272006568);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field1180[var7] = (arg1.method1050(1272006568) << 16) + this.field1180[var7];
            }
        } else if (arg0 == 2) {
            this.field1158 = arg1.method1050(1272006568);
        } else if (arg0 == 3) {
            this.field1154 = new boolean[256];
            int var8 = arg1.method1045((byte) 78);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1154[arg1.method1045((byte) 127)] = true;
            }
        } else if (arg0 == 4) {
            this.field1161 = true;
        } else if (arg0 == 5) {
            this.field1169 = arg1.method1045((byte) -73);
        } else if (arg0 == 6) {
            this.field1156 = arg1.method1050(1272006568);
        } else if (arg0 == 7) {
            this.field1173 = arg1.method1050(1272006568);
        } else if (arg0 == 8) {
            this.field1166 = arg1.method1045((byte) -41);
        } else if (arg0 == 9) {
            this.field1170 = arg1.method1045((byte) -55);
        } else if (arg0 == 10) {
            this.field1178 = arg1.method1045((byte) 102);
            return;
        } else if (arg0 == 11) {
            this.field1171 = arg1.method1045((byte) -124);
            return;
        } else if (arg0 == 12) {
            int var10 = arg1.method1045((byte) -109);
            this.field1174 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1174[var11] = arg1.method1050(1272006568);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field1174[var12] = (arg1.method1050(class280.method1901(arg2, -1272012761)) << 16) + this.field1174[var12];
            }
            return;
        } else if (arg0 == 13) {
            int var13 = arg1.method1050(1272006568);
            this.field1157 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg1.method1045((byte) -105);
                if (var15 > 0) {
                    this.field1157[var14] = new int[var15];
                    this.field1157[var14][0] = arg1.method1065((byte) 63);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field1157[var14][var16] = arg1.method1050(1272006568);
                    }
                }
            }
            return;
        } else if (arg0 == 14) {
            this.field1151 = true;
            return;
        } else if (arg0 == 15) {
            this.field1160 = true;
            return;
        } else if (arg0 == 16) {
            this.field1168 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lv;I)V")
    public final void method471(class149 arg0, int arg1) {
        if (arg1 != -2) {
            method465((byte) -43);
        }
        field1153++;
        while (true) {
            int var3 = arg0.method1045((byte) -64);
            if (var3 == 0) {
                return;
            }
            this.method470(var3, arg0, arg1 ^ 0x1871);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIBLba;)Lba;")
    public final class166 method472(int arg0, int arg1, int arg2, byte arg3, class166 arg4) {
        if (arg3 != -70) {
            this.method466(50);
        }
        field1172++;
        int var6 = this.field1150[arg2];
        int var7 = this.field1180[arg2];
        class287 var8 = class83.method620((byte) -84, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method286(true, true, true);
        }
        class287 var10 = null;
        if ((this.field1160 || class99.field1762) && arg0 != -1 && this.field1180.length > arg0) {
            int var11 = this.field1180[arg0];
            var10 = class83.method620((byte) -84, var11 >> 16);
            arg0 = var11 & 0xFFFF;
        }
        class166 var12;
        if (var10 == null) {
            var12 = arg4.method286(!var8.method1959((byte) -48, var9), !var8.method1956(var9, -119), !this.field1151);
        } else {
            var12 = arg4.method286(!var8.method1959((byte) -48, var9) & !var10.method1959((byte) -48, arg0), !var8.method1956(var9, -118) & !var10.method1956(arg0, arg3 ^ 0x17), !this.field1151);
        }
        var12.method1199(var8, var9, var10, arg0, arg1 - 1, var6, this.field1151);
        return var12;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
    public static final void method473(int arg0, int arg1) {
        class86 var2 = class149.field2610;
        synchronized (class149.field2610) {
            class32.field646 = arg1;
        }
        if (arg0 != -28987) {
            method465((byte) 74);
        }
        field1163++;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Lqk;")
    public static final class207 method474(int arg0, int arg1) {
        field1159++;
        class207 var2 = class262.method1815(arg0, (byte) 81);
        for (int var3 = var2.method1450((byte) 80) - 3; var3 > 0; var3 -= 3) {
            var2 = class105.method757(false, new class207[] { var2.method1427(-17195, 0, var3), class126.field2184, var2.method1464(-23886, var3) });
        }
        if (arg1 >= -43) {
            return null;
        } else if (var2.method1450((byte) -114) > 9) {
            return class105.method757(false, new class207[] { class286.field5095, var2.method1427(-17195, 0, var2.method1450((byte) 1) - 8), class56.field1047, class150.field2633, var2, class47.field931 });
        } else if (var2.method1450((byte) -128) > 6) {
            return class105.method757(false, new class207[] { class99.field1774, var2.method1427(-17195, 0, var2.method1450((byte) -127) - 4), class124.field2162, class150.field2633, var2, class47.field931 });
        } else {
            return class105.method757(false, new class207[] { class169.field2975, var2, class5.field75 });
        }
    }
}
