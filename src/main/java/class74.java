import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class74 {

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
    private boolean field1132 = false;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    private int field1147 = 32;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "J")
    private long field1135 = class242.method1650(59);

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    private int field1155 = 0;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "[Lga;")
    private class177[] field1156 = new class177[8];

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    private int field1161 = 0;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "J")
    private long field1159 = 0L;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    private int field1153 = 0;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "Z")
    private boolean field1154 = true;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "[Lga;")
    private class177[] field1152 = new class177[8];

    @OriginalMember(owner = "client!td", name = "F", descriptor = "J")
    private long field1158 = 0L;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    private int field1163 = 0;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public int field1160;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lga;")
    private class177 field1128;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[I")
    public int[] field1127;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "[[S")
    public static short[][] field1145;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lub;ILub;)V")
    public static final void method577(class92 arg0, int arg1, class92 arg2) {
        if (arg1 <= 72) {
            method590(62);
        }
        class268.field4237 = arg2;
        class220.field3355 = arg0;
        field1150++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public final synchronized void method578(int arg0) {
        field1144++;
        this.field1154 = true;
        try {
            if (arg0 != 256) {
                this.field1152 = null;
            }
            this.method188();
        } catch (Exception var2) {
            this.method186();
            this.field1158 = class242.method1650(115) + 2000L;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([II)V")
    private final void method579(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class259.field4107) {
            var3 = arg1 << 1;
        }
        class81.method632(arg0, 0, var3);
        this.field1153 -= arg1;
        if (this.field1128 != null && this.field1153 <= 0) {
            this.field1153 += class174.field2695 >> 4;
            class290.method1928(31833, this.field1128);
            this.method584((byte) -85, this.field1128, this.field1128.method866());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class177 var10 = null;
                        class177 var11 = this.field1156[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class34 var12 = var11.field2726;
                                if (var12 == null || var12.field600 <= var8) {
                                    var11.field2725 = true;
                                    int var13 = var11.method162();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field600 += var13;
                                    }
                                    if (var4 >= this.field1147) {
                                        break label107;
                                    }
                                    class177 var14 = var11.method160();
                                    if (var14 != null) {
                                        int var15 = var11.field2724;
                                        while (var14 != null) {
                                            this.method584((byte) -37, var14, var15 * var14.method866() >> 8);
                                            var14 = var11.method152();
                                        }
                                    }
                                    class177 var16 = var11.field2727;
                                    var11.field2727 = null;
                                    if (var10 == null) {
                                        this.field1156[var7] = var16;
                                    } else {
                                        var10.field2727 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1152[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2727;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class177 var18 = this.field1156[var17];
                this.field1156[var17] = this.field1152[var17] = null;
                while (var18 != null) {
                    class177 var19 = var18.field2727;
                    var18.field2727 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1153 < 0) {
            this.field1153 = 0;
        }
        if (this.field1128 != null) {
            this.field1128.method178(arg0, 0, arg1);
        }
        this.field1135 = class242.method1650(45);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method189(Component arg0) throws Exception {
        field1148++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
    public void method184() throws Exception {
        field1141++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final synchronized void method580(boolean arg0) {
        field1131++;
        if (this.field1132) {
            return;
        }
        long var2 = class242.method1650(90);
        try {
            if (var2 > this.field1135 + 500000L) {
                this.field1135 = var2 - 500000L;
            }
            while (var2 > this.field1135 + 5000L) {
                this.method588((byte) -99, 256);
                this.field1135 += (long) (256000 / class174.field2695);
            }
        } catch (Exception var7) {
            this.field1135 = var2;
        }
        if (this.field1127 == null) {
            return;
        }
        try {
            if (this.field1158 != 0L) {
                if (var2 < this.field1158) {
                    return;
                }
                this.method185(this.field1160);
                this.field1154 = true;
                this.field1158 = 0L;
            }
            int var4 = this.method187();
            if (!arg0) {
                int var5 = this.field1162 + this.field1157;
                if (this.field1163 < this.field1155 - var4) {
                    this.field1163 = this.field1155 - var4;
                }
                if ((var5 + 256) > 16384) {
                    var5 = 16128;
                }
                if ((var5 + 256) > this.field1160) {
                    var4 = 0;
                    this.field1160 += 1024;
                    if (this.field1160 > 16384) {
                        this.field1160 = 16384;
                    }
                    this.method186();
                    this.method185(this.field1160);
                    this.field1154 = true;
                    if (this.field1160 < (var5 + 256)) {
                        var5 = this.field1160 - 256;
                        this.field1157 = var5 - this.field1162;
                    }
                }
                while (var4 < var5) {
                    var4 += 256;
                    this.method579(this.field1127, 256);
                    this.method184();
                }
                if (this.field1159 < var2) {
                    if (this.field1154) {
                        this.field1154 = false;
                    } else if (this.field1163 == 0 && this.field1161 == 0) {
                        this.method186();
                        this.field1158 = var2 + 2000L;
                        return;
                    } else {
                        this.field1157 = Math.min(this.field1161, this.field1163);
                        this.field1161 = this.field1163;
                    }
                    this.field1159 = var2 + 2000L;
                    this.field1163 = 0;
                }
                this.field1155 = var4;
            }
        } catch (Exception var6) {
            this.method186();
            this.field1158 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
    public int method187() throws Exception {
        field1149++;
        return this.field1160;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()V")
    public void method186() {
        field1138++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZIII)V")
    public static final void method581(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1136++;
        class154.field2307 = 0L;
        boolean var5 = false;
        int var6 = class194.method1382(true);
        if (var6 > 0 == arg4 <= 0) {
            var5 = true;
        }
        if (~arg4 == arg3 || var6 == 3) {
            arg1 = true;
        }
        if (class4.field59.startsWith("mac") && arg4 > 0) {
            arg1 = true;
        }
        if (arg1 && arg4 > 0) {
            var5 = true;
        }
        class244.method1658(var6, -1, arg4, arg0, arg2, arg1, var5);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public void method185(int arg0) throws Exception {
        field1134++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILnh;IJIIII)Z")
    public static final boolean method582(int arg0, int arg1, int arg2, int arg3, class55 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class171.method1230(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILga;)V")
    public final synchronized void method583(int arg0, class177 arg1) {
        this.field1128 = arg1;
        field1143++;
        if (arg0 != -16385) {
            this.field1147 = 101;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLga;I)V")
    private final void method584(byte arg0, class177 arg1, int arg2) {
        field1130++;
        int var4 = arg2 >> 5;
        class177 var5 = this.field1152[var4];
        int var6 = -23 % ((24 - arg0) / 40);
        if (var5 == null) {
            this.field1156[var4] = arg1;
        } else {
            var5.field2727 = arg1;
        }
        this.field1152[var4] = arg1;
        arg1.field2724 = arg2;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public final synchronized void method585(int arg0) {
        if (class306.field4918 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class306.field4918.field831[var3] == this) {
                    class306.field4918.field831[var3] = null;
                }
                if (class306.field4918.field831[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class306.field4918.field832 = true;
                while (class306.field4918.field823) {
                    class122.method922(50L, (byte) -107);
                }
                class306.field4918 = null;
            }
        }
        field1146++;
        this.method186();
        this.field1127 = null;
        if (arg0 == 8) {
            this.field1132 = true;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
    public void method188() throws Exception {
        field1151++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method586(int arg0, String arg1) {
        if (arg0 != 21321) {
            field1140 = 82;
        }
        field1142++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
    public static final void method587(int arg0, int arg1) {
        field1133++;
        if (arg1 == 22608 && class48.method401(121, arg0)) {
            class306.method2050((byte) -117, -1, class8.field144[arg0]);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
    private final void method588(byte arg0, int arg1) {
        field1129++;
        int var3 = 82 % ((arg0 + 15) / 51);
        this.field1153 -= arg1;
        if (this.field1153 < 0) {
            this.field1153 = 0;
        }
        if (this.field1128 != null) {
            this.field1128.method156(arg1);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method589(byte arg0) {
        int var1 = 87 % ((arg0 + 25) / 58);
        field1145 = null;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public static final void method590(int arg0) {
        field1139++;
        if (class91.field1417) {
            return;
        }
        if (class189.field2972) {
            class248.field3941 = (float) ((int) class248.field3941 + 47 & 0xFFFFFFF0);
        } else {
            class226.field3621 += (12.0F - class226.field3621) / 2.0F;
        }
        class91.field1417 = true;
        class130.field1929 = true;
        if (arg0 != -47) {
            method590(-21);
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
    public final void method591(int arg0) {
        field1137++;
        this.field1154 = true;
        if (arg0 != -7123) {
            method581(71, true, 86, 69, -103);
        }
    }
}
