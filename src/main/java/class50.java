import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class50 {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    private int field1127 = 32;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "J")
    private long field1146 = class111.method874(30351);

    @OriginalMember(owner = "client!de", name = "D", descriptor = "Z")
    private boolean field1150 = true;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    private int field1148 = 0;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "[Loa;")
    private class240[] field1152 = new class240[8];

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    private int field1151 = 0;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    private int field1156 = 0;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "[Loa;")
    private class240[] field1157 = new class240[8];

    @OriginalMember(owner = "client!de", name = "L", descriptor = "J")
    private long field1158 = 0L;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "J")
    private long field1154 = 0L;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    private int field1159 = 0;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Z")
    public static boolean field1136 = true;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lsg;")
    public static class30 field1140 = class167.method1221((byte) 33, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field1139 = 0;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "Lhh;")
    public static class173 field1132 = new class173(5000);

    @OriginalMember(owner = "client!de", name = "N", descriptor = "[I")
    public static int[] field1160 = new int[2];

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "I")
    public int field1153;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public int field1155;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "Lkj;")
    public static class147 field1137;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "Loa;")
    private class240 field1138;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "[I")
    public int[] field1130;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()I")
    public int method488() throws Exception {
        field1144++;
        return this.field1155;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method489(Component arg0) throws Exception {
        field1133++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public final synchronized void method490(int arg0) {
        field1122++;
        if (this.field1130 == null) {
            return;
        }
        long var2 = class111.method874(30351);
        try {
            if (this.field1154 != 0L) {
                if (this.field1154 > var2) {
                    return;
                }
                this.method497(this.field1155);
                this.field1154 = 0L;
                this.field1150 = true;
            }
            int var4 = this.method488();
            int var5 = this.field1153 + this.field1149;
            if (this.field1151 < (this.field1148 - var4)) {
                this.field1151 = this.field1148 - var4;
            }
            if (arg0 + var5 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field1155) {
                this.field1155 += 1024;
                if (this.field1155 > 16384) {
                    this.field1155 = 16384;
                }
                this.method492();
                this.method497(this.field1155);
                if ((var5 + 256) > this.field1155) {
                    var5 = this.field1155 - 256;
                    this.field1149 = var5 - this.field1153;
                }
                this.field1150 = true;
                var4 = 0;
            }
            while (var5 > var4) {
                this.method495(this.field1130, 256);
                this.method491();
                var4 += 256;
            }
            if (var2 > this.field1158) {
                if (this.field1150) {
                    this.field1150 = false;
                } else if (this.field1151 == 0 && this.field1156 == 0) {
                    this.method492();
                    this.field1154 = var2 + 2000L;
                    return;
                } else {
                    this.field1149 = Math.min(this.field1156, this.field1151);
                    this.field1156 = this.field1151;
                }
                this.field1151 = 0;
                this.field1158 = var2 + 2000L;
            }
            this.field1148 = var4;
        } catch (Exception var7) {
            this.method492();
            this.field1154 = var2 + 2000L;
        }
        try {
            if (this.field1146 + 500000L < var2) {
                var2 = this.field1146;
            }
            while (var2 > (this.field1146 + 5000L)) {
                this.method505(256, (byte) -100);
                this.field1146 += (long) (256000 / class121.field2389);
            }
        } catch (Exception var6) {
            this.field1146 = var2;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()V")
    public void method491() throws Exception {
        field1129++;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()V")
    public void method492() {
        field1131++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIIIII)V")
    public static final void method493(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1145++;
        int var7 = arg0 + arg6;
        int var8 = arg5 - arg6;
        int var9 = arg3 - arg6;
        for (int var10 = arg0; var10 < var7; var10++) {
            class194.method1405(true, class121.field2390[var10], arg3, arg2, arg4);
        }
        int var11 = arg2 + arg6;
        for (int var12 = arg5; var12 > var8; var12--) {
            class194.method1405(true, class121.field2390[var12], arg3, arg2, arg4);
        }
        int var13 = var7;
        int var14 = -2 % ((arg1 - 21) / 35);
        while (var8 >= var13) {
            int[] var15 = class121.field2390[var13];
            class194.method1405(true, var15, var11, arg2, arg4);
            class194.method1405(true, var15, arg3, var9, arg4);
            var13++;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
    public final synchronized void method494(boolean arg0) {
        this.field1150 = arg0;
        try {
            this.method496();
        } catch (Exception var2) {
            this.method492();
            this.field1154 = class111.method874(30351) + 2000L;
        }
        field1134++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([II)V")
    private final void method495(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class134.field2618) {
            var3 = arg1 << 1;
        }
        class26.method233(arg0, 0, var3);
        this.field1159 -= arg1;
        if (this.field1138 != null && this.field1159 <= 0) {
            this.field1159 += class121.field2389 >> 4;
            class151.method1116((byte) -72, this.field1138);
            this.method504(this.field1138, this.field1138.method397(), 122);
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
                        class240 var10 = null;
                        class240 var11 = this.field1152[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class162 var12 = var11.field4259;
                                if (var12 == null || var12.field3028 <= var8) {
                                    var11.field4258 = true;
                                    int var13 = var11.method185();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3028 += var13;
                                    }
                                    if (var4 >= this.field1127) {
                                        break label107;
                                    }
                                    class240 var14 = var11.method179();
                                    if (var14 != null) {
                                        int var15 = var11.field4257;
                                        while (var14 != null) {
                                            this.method504(var14, var15 * var14.method397() >> 8, 119);
                                            var14 = var11.method182();
                                        }
                                    }
                                    class240 var16 = var11.field4256;
                                    var11.field4256 = null;
                                    if (var10 == null) {
                                        this.field1152[var7] = var16;
                                    } else {
                                        var10.field4256 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1157[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4256;
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
                class240 var18 = this.field1152[var17];
                this.field1152[var17] = this.field1157[var17] = null;
                while (var18 != null) {
                    class240 var19 = var18.field4256;
                    var18.field4256 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1159 < 0) {
            this.field1159 = 0;
        }
        if (this.field1138 != null) {
            this.field1138.method183(arg0, 0, arg1);
        }
        this.field1146 = class111.method874(30351);
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()V")
    public void method496() throws Exception {
        field1147++;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public void method497(int arg0) throws Exception {
        field1135++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[Ldl;)V")
    public static final void method498(int arg0, int arg1, class31[] arg2) {
        field1141++;
        for (int var3 = arg0; var3 < arg2.length; var3++) {
            class31 var4 = arg2[var3];
            if (var4 != null && var4.field798 == arg1 && (!var4.field671 || !client.method1497(var4))) {
                if (var4.field655 == 0) {
                    if (!var4.field671 && client.method1497(var4) && class259.field4592 != var4) {
                        continue;
                    }
                    method498(0, var4.field638, arg2);
                    if (var4.field732 != null) {
                        method498(0, var4.field638, var4.field732);
                    }
                    class180 var5 = (class180) class143.field2762.method1168(arg0 - 3, (long) var4.field638);
                    if (var5 != null) {
                        class277.method1872((byte) 125, var5.field3335);
                    }
                }
                if (var4.field655 == 6) {
                    if (var4.field778 != -1 || var4.field777 != -1) {
                        boolean var6 = class179.method1307(-1651, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field777;
                        } else {
                            var7 = var4.field778;
                        }
                        if (var7 != -1) {
                            class138 var8 = class193.method1396(-30590, var7);
                            if (var8 != null) {
                                var4.field769 += class195.field3517;
                                while (var4.field769 > var8.field2690[var4.field738]) {
                                    var4.field769 -= var8.field2690[var4.field738];
                                    var4.field738++;
                                    if (var8.field2699.length <= var4.field738) {
                                        var4.field738 -= var8.field2706;
                                        if (var4.field738 < 0 || var4.field738 >= var8.field2699.length) {
                                            var4.field738 = 0;
                                        }
                                    }
                                    class254.method1771(var4, 8);
                                }
                            }
                        }
                    }
                    if (var4.field719 != 0 && !var4.field671) {
                        int var9 = var4.field719 >> 16;
                        int var10 = var4.field719 << 16 >> 16;
                        int var11 = class195.field3517 * var9;
                        int var12 = class195.field3517 * var10;
                        var4.field639 = var4.field639 + var12 & 0x7FF;
                        var4.field685 = var4.field685 + var11 & 0x7FF;
                        class254.method1771(var4, arg0 ^ 0x8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V")
    public final void method499(int arg0) {
        this.field1150 = true;
        if (arg0 <= 106) {
            this.method490(48);
        }
        field1124++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILoa;)V")
    public final synchronized void method500(int arg0, class240 arg1) {
        this.field1138 = arg1;
        field1126++;
        if (arg0 != 19028) {
            method493(117, (byte) -6, -2, 104, 85, 49, -47);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Z")
    public static final boolean method501(int arg0, int arg1) {
        class37.field899 = arg1 + 1 & 0xFFFF;
        if (arg0 != 0) {
            method501(-45, -63);
        }
        class15.field326 = true;
        field1143++;
        return true;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static void method502(int arg0) {
        field1137 = null;
        if (arg0 > 19) {
            field1140 = null;
            field1160 = null;
            field1132 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)Lqc;")
    public static final class4 method503(byte arg0, int arg1) {
        field1128++;
        class4 var2 = (class4) class101.field2060.method1644((byte) -113, (long) arg1);
        if (arg0 < 112) {
            field1139 = -117;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class9.field167.method1115(class77.method686(-4, arg1), (byte) -86, class173.method1275(false, arg1));
        class4 var4 = new class4();
        if (var3 != null) {
            var4.method24(new class8(var3), (byte) -125);
        }
        class101.field2060.method1646((long) arg1, var4, -118);
        return var4;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Loa;II)V")
    private final void method504(class240 arg0, int arg1, int arg2) {
        field1142++;
        if (arg2 <= 91) {
            this.field1130 = null;
        }
        int var4 = arg1 >> 5;
        class240 var5 = this.field1157[var4];
        if (var5 == null) {
            this.field1152[var4] = arg0;
        } else {
            var5.field4256 = arg0;
        }
        this.field1157[var4] = arg0;
        arg0.field4257 = arg1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V")
    private final void method505(int arg0, byte arg1) {
        field1123++;
        this.field1159 -= arg0;
        if (this.field1159 < 0) {
            this.field1159 = 0;
        }
        if (this.field1138 != null) {
            this.field1138.method187(arg0);
        }
        if (arg1 >= -76) {
            method501(-18, -19);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public final synchronized void method506(byte arg0) {
        field1125++;
        if (arg0 < 16) {
            return;
        }
        if (class40.field994 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class40.field994.field4512[var3] == this) {
                    class40.field994.field4512[var3] = null;
                }
                if (class40.field994.field4512[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class40.field994.field4517 = true;
                while (class40.field994.field4522) {
                    class160.method1191(50L, 0);
                }
                class40.field994 = null;
            }
        }
        this.method492();
        this.field1130 = null;
    }
}
