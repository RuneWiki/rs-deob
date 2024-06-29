import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class282 extends class179 {

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    private int field4896 = -1;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    public static int field4903 = 0;

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "Z")
    public static boolean field4905 = false;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "Lke;")
    private static class256 field4897 = class316.method2202("Face here", 27626);

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "Lke;")
    public static class256 field4894 = class316.method2202(" est d-Bj-9 dans votre liste d(Wamis)3", 27626);

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "Lke;")
    public static class256 field4908 = field4897;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
    public int field4909;

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "[I")
    public int[] field4899;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)[[I", line = 11)
    public int[][] method55(int arg0, int arg1) {
        field4901++;
        int[][] var3 = this.field3169.method463(arg1, arg0 ^ 0x4A);
        if (arg0 != 75) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field3169.field1080 && this.method1973(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = (class38.field697 == this.field4909 ? arg1 : this.field4909 * arg1 / class38.field697) * this.field4904;
            if (class161.field2858 == this.field4904) {
                for (int var11 = 0; var11 < class161.field2858; var11++) {
                    int var12 = this.field4899[var7++];
                    var5[var11] = class150.method1123(var12, 255) << 4;
                    var6[var11] = class150.method1123(4080, var12 >> 4);
                    var4[var11] = class150.method1123(16711680, var12) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class161.field2858; var8++) {
                    int var9 = this.field4904 * var8 / class161.field2858;
                    int var10 = this.field4899[var7 + var9];
                    var5[var8] = class150.method1123(255, var10) << 4;
                    var6[var8] = class150.method1123(var10 >> 4, 4080);
                    var4[var8] = class150.method1123(4080, var10 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "(I)V", line = 77)
    public final void method704(int arg0) {
        field4907++;
        super.method704(-99);
        this.field4899 = null;
        if (arg0 >= -27) {
            method1974(-77, 64, false);
        }
    }

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "(I)V", line = 89)
    public static void method1972(int arg0) {
        field4897 = null;
        field4908 = null;
        field4894 = null;
        if (arg0 != 1) {
            method1975(90, -95, -57);
        }
    }

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)I", line = 114)
    public final int method1318(int arg0) {
        field4906++;
        return arg0 == 1184 ? this.field4896 : 103;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 148)
    public class282() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILra;I)V", line = 136)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field4893++;
        if (arg0 >= 108 && arg2 == 0) {
            this.field4896 = arg1.method346(-16);
        }
    }

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "(I)Z", line = 152)
    public final boolean method1973(int arg0) {
        field4892++;
        if (this.field4899 != null) {
            return true;
        } else if (arg0 != -1) {
            return false;
        } else if (this.field4896 >= 0) {
            class227 var2 = class70.field1286 >= 0 ? class68.method525(class70.field1286, arg0 ^ 0xFFFFFFD5, this.field4896, class118.field2076) : class182.method1334(arg0 ^ 0xFFFFA2F9, class118.field2076, this.field4896);
            var2.method1547();
            this.field4909 = var2.field2348;
            this.field4904 = var2.field2343;
            this.field4899 = var2.field3921;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZ)I", line = 185)
    public static final int method1974(int arg0, int arg1, boolean arg2) {
        field4902++;
        int var3 = 0;
        if (!arg2) {
            method1977(59, (class4) null);
        }
        while (arg1 > 0) {
            arg1--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(III)V", line = 208)
    public static final void method1975(int arg0, int arg1, int arg2) {
        field4895++;
        class77 var3 = class156.method1158(arg1, false, arg0);
        var3.method584(22992);
        var3.field1455 = arg2;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lgg;I)V", line = 219)
    public static final void method1976(class67 arg0, int arg1) {
        arg0.field1236 = arg0.field1238;
        field4898++;
        if (arg0.field1239 == 0) {
            arg0.field1204 = 0;
            return;
        }
        if (arg0.field1202 != -1 && arg0.field1196 == 0) {
            class117 var2 = class250.method1682(arg0.field1202, true);
            if (arg0.field1219 > 0 && var2.field2058 == 0) {
                arg0.field1204++;
                return;
            }
            if (arg0.field1219 <= 0 && var2.field2041 == 0) {
                arg0.field1204++;
                return;
            }
        }
        int var3 = arg0.field1197;
        int var4 = arg0.field1192;
        int var5 = arg0.field1215[arg0.field1239 - 1] * 128 + (arg0.method515(5373952) * 64);
        int var6 = arg0.field1254[arg0.field1239 - 1] * 128 + arg0.method515(5373952) * 64;
        if ((var5 - var4) > 256 || (var5 - var4) < -256 || var6 - var3 > 256 || (var6 - var3) < -256) {
            arg0.field1197 = var6;
            arg0.field1192 = var5;
            return;
        }
        if (var4 < var5) {
            if (var6 > var3) {
                arg0.field1213 = 1280;
            } else if (var6 >= var3) {
                arg0.field1213 = 1536;
            } else {
                arg0.field1213 = 1792;
            }
        } else if (var5 >= var4) {
            if (var6 > var3) {
                arg0.field1213 = 1024;
            } else if (var6 < var3) {
                arg0.field1213 = 0;
            }
        } else if (var6 > var3) {
            arg0.field1213 = 768;
        } else if (var3 <= var6) {
            arg0.field1213 = 512;
        } else {
            arg0.field1213 = 256;
        }
        int var7 = arg0.field1213 - arg0.field1191 & 0x7FF;
        int var8 = arg0.field1198;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1220;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1249;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1251;
        }
        if (~var8 == arg1) {
            var8 = arg0.field1220;
        }
        boolean var9 = true;
        arg0.field1236 = var8;
        if (arg0 instanceof class279) {
            var9 = ((class279) arg0).field4860.field1384;
        }
        int var10 = 4;
        if (var9) {
            if (arg0.field1213 != arg0.field1191 && arg0.field1233 == -1 && arg0.field1205 != 0) {
                var10 = 2;
            }
            if (arg0.field1239 > 2) {
                var10 = 6;
            }
            if (arg0.field1239 > 3) {
                var10 = 8;
            }
            if (arg0.field1204 > 0 && arg0.field1239 > 1) {
                arg0.field1204--;
                var10 = 8;
            }
        } else {
            if (arg0.field1239 > 1) {
                var10 = 6;
            }
            if (arg0.field1239 > 2) {
                var10 = 8;
            }
            if (arg0.field1204 > 0 && arg0.field1239 > 1) {
                arg0.field1204--;
                var10 = 8;
            }
        }
        if (arg0.field1186[arg0.field1239 - 1]) {
            var10 <<= 0x1;
        }
        if (var6 > var3) {
            arg0.field1197 += var10;
            if (var6 < arg0.field1197) {
                arg0.field1197 = var6;
            }
        } else if (var3 > var6) {
            arg0.field1197 -= var10;
            if (var6 > arg0.field1197) {
                arg0.field1197 = var6;
            }
        }
        if (var5 > var4) {
            arg0.field1192 += var10;
            if (var5 < arg0.field1192) {
                arg0.field1192 = var5;
            }
        } else if (var5 < var4) {
            arg0.field1192 -= var10;
            if (var5 > arg0.field1192) {
                arg0.field1192 = var5;
            }
        }
        if (arg0.field1192 == var5 && arg0.field1197 == var6) {
            if (arg0.field1219 > 0) {
                arg0.field1219--;
            }
            arg0.field1239--;
        }
        if (var10 >= 8 && arg0.field1236 == arg0.field1220 && arg0.field1218 != -1) {
            arg0.field1236 = arg0.field1218;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILff;)V", line = 436)
    public static final void method1977(int arg0, class4 arg1) {
        class106.field1895 = 3;
        field4910++;
        class11.method69((byte) -113, true);
        class29.field422 = 127;
        class70.field1292 = 127;
        class38.field694 = 255;
        class115.field2023 = 0;
        class171.field3050 = true;
        class115.field2026 = true;
        class85.field1537 = true;
        class274.field4743 = 0;
        class193.field3531 = true;
        class11.field165 = true;
        class262 var2 = null;
        class181.field3216 = true;
        class65.field1167 = true;
        class17.field241 = 2;
        class236.field4032 = true;
        class74.field1373 = true;
        class145.field2566 = 0;
        class95.field1695 = true;
        class141.field2479 = 0;
        class281.field4880 = true;
        if (class72.field1328 < 96) {
            class283.method1979(0);
        } else {
            class283.method1979(2);
        }
        class154.field2746 = false;
        class237.field4037 = 0;
        class30.field450 = false;
        class163.field2882 = 0;
        class137.field2392 = false;
        class236.field4024 = 0;
        class31.field505 = true;
        try {
            class82 var3 = arg1.method31(-9, "runescape");
            while (var3.field1500 == 0) {
                class46.method381(1L, 84);
            }
            if (var3.field1500 == 1) {
                var2 = (class262) var3.field1499;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method1839((byte) 119)];
                while (var5.length > var4) {
                    int var6 = var2.method1836(var4, var5.length - var4, var5, (byte) -125);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class84.method619(0, new class41(var5));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method1838(1);
            }
        } catch (Exception var9) {
        }
        if (arg0 < 29) {
            field4897 = (class256) null;
        }
    }
}
