import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 {

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lvc;")
    private static class137 field1221 = class45.method325("Loading config )2 ", -46);

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lvc;")
    public static class137 field1232 = field1221;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[B")
    public static byte[] field1229 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "Lqa;")
    public static class105 field1233 = new class105(500);

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Lvc;")
    public static class137 field1244 = class45.method325("blaugr-Un:", -46);

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field1241 = 0;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "Lvc;")
    public static class137 field1247 = null;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field1243 = 0;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "Lqa;")
    public static class105 field1239 = new class105(128);

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field1249 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    private int field1223;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "J")
    private long field1234;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "J")
    private long field1245;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "Lvd;")
    public static class138 field1250;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Lfc;")
    public static class39 field1248;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "Lia;")
    public static class57 field1240;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Z")
    public boolean field1220;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
    private int[] field1214;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
    private int[] field1218;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "[I")
    public static int[] field1246;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static final void method396(int arg0) {
        if (arg0 != 19857) {
            return;
        }
        field1222++;
        if (class78.field1732 != 0 || class78.field1747 != 1) {
            return;
        }
        int var1 = class36.field788 - 25 - 550;
        int var2 = class38.field835 - 4 - 5;
        if (var1 < 0 || var2 < 0 || var1 >= 146 || var2 >= 151) {
            return;
        }
        var1 -= 73;
        var2 -= 75;
        int var3 = class105.field2436 + class120.field2794 & 0x7FF;
        int var4 = class97.field2257[var3];
        int var5 = class97.field2258[var3];
        int var6 = (class78.field1744 + 256) * var4 >> 8;
        int var7 = (class78.field1744 + 256) * var5 >> 8;
        int var8 = var1 * var6 + var2 * var7 >> 11;
        int var9 = class104.field2412.field1672 + var8 >> 7;
        int var10 = var2 * var6 - var1 * var7 >> 11;
        int var11 = class104.field2412.field1646 - var10 >> 7;
        boolean var12 = class88.method653(class104.field2412.field1624[0], var9, 0, 1, 0, true, 0, class104.field2412.field1647[0], -83, var11, 0, 0);
        if (!var12) {
            return;
        }
        class72.field1527.method837(arg0 - 19799, var1);
        class72.field1527.method837(124, var2);
        class72.field1527.method793(class105.field2436, (byte) 59);
        class72.field1527.method837(-68, 57);
        class72.field1527.method837(113, class120.field2794);
        class72.field1527.method837(arg0 ^ 0x4DE2, class78.field1744);
        class72.field1527.method837(-82, 89);
        class72.field1527.method793(class104.field2412.field1672, (byte) 45);
        class72.field1527.method793(class104.field2412.field1646, (byte) 45);
        class72.field1527.method837(58, class23.field544);
        class72.field1527.method837(94, 63);
        return;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IJ)V")
    public static final void method397(int arg0, long arg1) {
        field1226++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg0 < 43) {
            field1243 = 104;
        }
        while (var3 < class80.field1832) {
            if (class68.field1395[var3] == arg1) {
                class21.field443++;
                class80.field1832--;
                class34.field737 = true;
                for (int var4 = var3; var4 < class80.field1832; var4++) {
                    class98.field2270[var4] = class98.field2270[var4 + 1];
                    class83.field1872[var4] = class83.field1872[var4 + 1];
                    class68.field1395[var4] = class68.field1395[var4 + 1];
                    class99.field2320[var4] = class99.field2320[var4 + 1];
                }
                class11.field240 = class112.field2667 + 1;
                class72.field1527.method845(186, 100);
                class72.field1527.method840(false, arg1);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V")
    public final void method398(int arg0, boolean arg1) {
        field1219++;
        if (this.field1220 != arg1) {
            this.method411(this.field1214, -1, 0, arg1, null);
            if (arg0 > -116) {
                field1244 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)Z")
    public static final boolean method399(byte arg0, int arg1, int arg2) {
        field1231++;
        if (arg1 == 0 && class49.field1106 == arg2) {
            return true;
        } else if (arg1 == 1 && class86.field2053 == arg2) {
            return true;
        } else if ((arg1 == 2 || arg1 == 3) && class131.field3040 == arg2) {
            return true;
        } else {
            int var3 = 3 / ((arg0 + 68) / 43);
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILwc;Lwc;I)Lbf;")
    public final class14 method400(int arg0, int arg1, class143 arg2, class143 arg3, int arg4) {
        field1237++;
        if (this.field1223 != -1) {
            return class67.method476(true, this.field1223).method1062(arg3, arg0, arg2, arg4, 1);
        }
        long var6 = this.field1245;
        int[] var8 = this.field1218;
        if (arg2 != null && (arg2.field3372 >= 0 || arg2.field3366 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1218[var9];
            }
            if (arg2.field3372 >= 0) {
                var6 += arg2.field3372 - this.field1218[5] << 8;
                var8[5] = arg2.field3372;
            }
            if (arg2.field3366 >= 0) {
                var6 += arg2.field3366 - this.field1218[3] << 16;
                var8[3] = arg2.field3366;
            }
        }
        class14 var10 = (class14) class85.field1981.method758(var6, (byte) -112);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class34.method250(var21 - 256, false).method740(0)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class39.method286((byte) -29, var21 - 512).method1089(arg1 + 12853, this.field1220)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1234 != -1L) {
                    var10 = (class14) class85.field1981.method758(this.field1234, (byte) -91);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class144[] var13 = new class144[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class144 var19 = class34.method250(var18 - 256, false).method748(arg1 ^ 0xFFFFFD99);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class144 var20 = class39.method286((byte) 127, var18 - 512).method1081(true, this.field1220);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class144 var16 = new class144(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field1214[var17] != 0) {
                        var16.method1114(class23.field541[var17][0], class23.field541[var17][this.field1214[var17]]);
                        if (var17 == 1) {
                            var16.method1114(class78.field1749[0], class78.field1749[this.field1214[var17]]);
                        }
                    }
                }
                var10 = var16.method1113(64, 850, -30, -50, -30);
                class85.field1981.method760(var10, 0, var6);
                this.field1234 = var6;
            }
        }
        if (arg1 != -513) {
            this.method411(null, 46, 59, false, null);
        }
        if (arg2 == null && arg3 == null) {
            return var10;
        }
        class14 var22;
        if (arg2 != null && arg3 != null) {
            var22 = arg2.method1098(arg0, arg4, (byte) 125, arg3, var10);
        } else if (arg2 == null) {
            var22 = arg3.method1102(arg4, var10, (byte) 88);
        } else {
            var22 = arg2.method1102(arg0, var10, (byte) 58);
        }
        return var22;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static final void method401(boolean arg0) {
        field1212++;
        for (int var1 = 0; var1 < class68.field1416; var1++) {
            int var2 = class85.field2036[var1];
            class125 var3 = class102.field2358[var2];
            int var4 = class103.field2391.method838(255);
            if ((var4 & 0x20) != 0) {
                var4 += class103.field2391.method838(255) << 8;
            }
            class116.method899(var3, 125, var2, var4);
        }
        if (arg0) {
            method409(45);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZZ)V")
    public final void method402(int arg0, boolean arg1, boolean arg2) {
        int var4 = this.field1214[arg0];
        field1238++;
        if (arg1) {
            var4++;
            if (var4 >= class23.field541[arg0].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class23.field541[arg0].length - 1;
            }
        }
        if (!arg2) {
            method408(73);
        }
        this.field1214[arg0] = var4;
        this.method403((byte) -71);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    private final void method403(byte arg0) {
        field1225++;
        long var2 = this.field1245;
        this.field1245 = 0L;
        int var4 = this.field1218[5];
        int var5 = this.field1218[9];
        this.field1218[5] = var5;
        this.field1218[9] = var4;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field1245 <<= 0x4;
            if (this.field1218[var6] >= 256) {
                this.field1245 += this.field1218[var6] - 256;
            }
        }
        if (this.field1218[0] >= 256) {
            this.field1245 += this.field1218[0] - 256 >> 4;
        }
        if (this.field1218[1] >= 256) {
            this.field1245 += this.field1218[1] - 256 >> 8;
        }
        int var7 = 12 % ((arg0 + 1) / 55);
        for (int var8 = 0; var8 < 5; var8++) {
            this.field1245 <<= 0x3;
            this.field1245 += this.field1214[var8];
        }
        this.field1218[9] = var5;
        this.field1245 <<= 0x1;
        this.field1218[5] = var4;
        this.field1245 += this.field1220 ? 1 : 0;
        if (var2 != 0L && this.field1245 != var2) {
            class85.field1981.method764(var2, 0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
    public final int method404(byte arg0) {
        if (arg0 != -9) {
            this.method402(53, true, false);
        }
        field1230++;
        return this.field1223 == -1 ? (this.field1218[0] << 15) + this.field1218[1] + (this.field1214[4] << 20) + (this.field1218[11] << 5) + (this.field1218[8] << 10) + (this.field1214[0] << 25) : class67.method476(true, this.field1223).field3248 + 305419896;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Lwd;")
    public final class144 method405(int arg0) {
        field1224++;
        if (this.field1223 != -1) {
            return class67.method476(true, this.field1223).method1061(true);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field1218[var3];
            if (var12 >= 256 && var12 < 512 && !class34.method250(var12 - 256, false).method739(127)) {
                var2 = true;
            }
            if (var12 >= 512 && !class39.method286((byte) 105, var12 - 512).method1086(this.field1220, 124)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class144[] var4 = new class144[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field1218[var6];
            if (var9 >= 256 && var9 < 512) {
                class144 var10 = class34.method250(var9 - 256, false).method742((byte) -12);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class144 var11 = class39.method286((byte) 112, var9 - 512).method1077((byte) 14, this.field1220);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class144 var7 = new class144(var4, var5);
        if (arg0 != 28378) {
            return null;
        }
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field1214[var8] != 0) {
                var7.method1114(class23.field541[var8][0], class23.field541[var8][this.field1214[var8]]);
                if (var8 == 1) {
                    var7.method1114(class78.field1749[0], class78.field1749[this.field1214[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZBI)V")
    public final void method406(boolean arg0, byte arg1, int arg2) {
        field1216++;
        if (arg2 == 1 && this.field1220) {
            return;
        }
        int var4 = this.field1218[class80.field1810[arg2]];
        int var5 = 42 / ((arg1 - 53) / 57);
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        class102 var6;
        do {
            if (arg0) {
                var4++;
                if (var4 >= class115.field2743) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class115.field2743 - 1;
                }
            }
            var6 = class34.method250(var4, false);
        } while (var6 == null || var6.field2387 || var6.field2378 != arg2 + (this.field1220 ? 7 : 0));
        this.field1218[class80.field1810[arg2]] = var4 + 256;
        this.method403((byte) -107);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lqe;I)V")
    public final void method407(class109 arg0, int arg1) {
        arg0.method837(96, this.field1220 ? 1 : 0);
        field1215++;
        for (int var3 = 0; var3 < 7; var3++) {
            int var5 = this.field1218[class80.field1810[var3]];
            if (var5 == 0) {
                arg0.method837(118, -1);
            } else {
                arg0.method837(-88, var5 - 256);
            }
        }
        for (int var4 = arg1; var4 < 5; var4++) {
            arg0.method837(-80, this.field1214[var4]);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static void method408(int arg0) {
        field1233 = null;
        field1248 = null;
        field1232 = null;
        field1221 = null;
        field1229 = null;
        field1250 = null;
        field1246 = null;
        field1244 = null;
        field1247 = null;
        if (arg0 != 0) {
            field1250 = null;
        }
        field1240 = null;
        field1239 = null;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static final void method409(int arg0) {
        int var1 = 6 % ((arg0 - 14) / 33);
        class84.field1894.method763((byte) 71);
        field1233.method763((byte) -125);
        class128.field3005.method763((byte) -119);
        field1213++;
        class115.field2742.method763((byte) -25);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
    public static final void method410(boolean arg0) {
        field1242++;
        if (arg0) {
            method399((byte) 110, -19, -104);
        }
        class84.field1903.method680(-117);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIZ[I)V")
    public final void method411(int[] arg0, int arg1, int arg2, boolean arg3, int[] arg4) {
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class115.field2743; var7++) {
                    class102 var8 = class34.method250(var7, false);
                    if (var8 != null && !var8.field2387 && var8.field2378 == var6 + (arg3 ? 7 : 0)) {
                        arg4[class80.field1810[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        this.field1220 = arg3;
        this.field1214 = arg0;
        this.field1223 = arg1;
        this.field1218 = arg4;
        field1235++;
        this.method403((byte) 98);
        if (arg2 != 0) {
            field1228 = 10;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method412(int arg0, KeyEvent arg1) {
        field1217++;
        if (arg0 != -1) {
            method409(95);
        }
        int var2 = arg1.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }
}
