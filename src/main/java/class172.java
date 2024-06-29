import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class172 extends class23 {

    @OriginalMember(owner = "client!tj", name = "eb", descriptor = "I")
    private int field2811 = 3072;

    @OriginalMember(owner = "client!tj", name = "hb", descriptor = "I")
    private int field2814 = 1024;

    @OriginalMember(owner = "client!tj", name = "mb", descriptor = "I")
    private int field2819 = 2048;

    @OriginalMember(owner = "client!tj", name = "Z", descriptor = "I")
    public static int field2806 = -1;

    @OriginalMember(owner = "client!tj", name = "gb", descriptor = "Lqd;")
    public static class40 field2813 = class147.method1106("Verbindung mit Update)2Server)3)3)3", (byte) -56);

    @OriginalMember(owner = "client!tj", name = "Y", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!tj", name = "bb", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!tj", name = "cb", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!tj", name = "db", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!tj", name = "fb", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!tj", name = "ib", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!tj", name = "jb", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!tj", name = "lb", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!tj", name = "ab", descriptor = "Lce;")
    public static class239 field2807;

    @OriginalMember(owner = "client!tj", name = "kb", descriptor = "[Lda;")
    public static class114[] field2817;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 4)
    public final void method61(byte arg0) {
        if (arg0 == 4) {
            field2815++;
            this.field2819 = this.field2811 - this.field2814;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 17)
    public class172() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)[I", line = 27)
    public final int[] method32(byte arg0, int arg1) {
        field2805++;
        if (arg0 != -94) {
            field2807 = (class239) null;
        }
        int[] var3 = this.field403.method724((byte) -61, arg1);
        if (this.field403.field1760) {
            int[] var4 = this.method174(0, 0, arg1);
            for (int var5 = 0; var5 < class52.field1007; var5++) {
                var3[var5] = (var4[var5] * this.field2819 >> 12) + this.field2814;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lbb;Z)V", line = 57)
    public static final void method1267(class86 arg0, boolean arg1) {
        arg0.field1514 = arg0.field1533;
        field2818++;
        if (arg0.field1516 == 0) {
            arg0.field1524 = 0;
            return;
        }
        if (arg0.field1519 != -1 && arg0.field1529 == 0) {
            class300 var2 = class20.method128(80, arg0.field1519);
            if (arg0.field1490 > 0 && var2.field5037 == 0) {
                arg0.field1524++;
                return;
            }
            if (arg0.field1490 <= 0 && var2.field5025 == 0) {
                arg0.field1524++;
                return;
            }
        }
        int var3 = arg0.field1531;
        int var4 = arg0.field1497;
        int var5 = arg0.field1489[arg0.field1516 - 1] * 128 + (arg0.method666(24207) * 64);
        int var6 = arg0.field1532[arg0.field1516 - 1] * 128 + arg0.method666(24207) * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || (var6 - var4) > 256 || (var6 - var4) < -256) {
            arg0.field1531 = var5;
            arg0.field1497 = var6;
            return;
        }
        if (var3 < var5) {
            if (var6 > var4) {
                arg0.field1521 = 1280;
            } else if (var4 > var6) {
                arg0.field1521 = 1792;
            } else {
                arg0.field1521 = 1536;
            }
        } else if (var5 >= var3) {
            if (var6 > var4) {
                arg0.field1521 = 1024;
            } else if (var4 > var6) {
                arg0.field1521 = 0;
            }
        } else if (var4 < var6) {
            arg0.field1521 = 768;
        } else if (var4 > var6) {
            arg0.field1521 = 256;
        } else {
            arg0.field1521 = 512;
        }
        int var7 = arg0.field1521 - arg0.field1507 & 0x7FF;
        int var8 = arg0.field1510;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1500;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1545;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1482;
        }
        int var9 = 4;
        if (var8 == -1) {
            var8 = arg0.field1500;
        }
        arg0.field1514 = var8;
        boolean var10 = arg1;
        if (arg0 instanceof class42) {
            var10 = ((class42) arg0).field796.field2063;
        }
        if (var10) {
            if (arg0.field1521 != arg0.field1507 && arg0.field1537 == -1 && arg0.field1542 != 0) {
                var9 = 2;
            }
            if (arg0.field1516 > 2) {
                var9 = 6;
            }
            if (arg0.field1516 > 3) {
                var9 = 8;
            }
            if (arg0.field1524 > 0 && arg0.field1516 > 1) {
                arg0.field1524--;
                var9 = 8;
            }
        } else {
            if (arg0.field1516 > 1) {
                var9 = 6;
            }
            if (arg0.field1516 > 2) {
                var9 = 8;
            }
            if (arg0.field1524 > 0 && arg0.field1516 > 1) {
                var9 = 8;
                arg0.field1524--;
            }
        }
        if (arg0.field1543[arg0.field1516 - 1]) {
            var9 <<= 0x1;
        }
        if (var3 < var5) {
            arg0.field1531 += var9;
            if (var5 < arg0.field1531) {
                arg0.field1531 = var5;
            }
        } else if (var5 < var3) {
            arg0.field1531 -= var9;
            if (var5 > arg0.field1531) {
                arg0.field1531 = var5;
            }
        }
        if (var4 < var6) {
            arg0.field1497 += var9;
            if (var6 < arg0.field1497) {
                arg0.field1497 = var6;
            }
        } else if (var4 > var6) {
            arg0.field1497 -= var9;
            if (var6 > arg0.field1497) {
                arg0.field1497 = var6;
            }
        }
        if (var9 >= 8 && arg0.field1514 == arg0.field1500 && arg0.field1511 != -1) {
            arg0.field1514 = arg0.field1511;
        }
        if (arg0.field1531 == var5 && arg0.field1497 == var6) {
            arg0.field1516--;
            if (arg0.field1490 > 0) {
                arg0.field1490--;
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILsd;)V", line = 266)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg1 != 0) {
            return;
        }
        field2808++;
        if (arg0 == 0) {
            this.field2814 = arg2.method197(-1);
        } else if (arg0 == 1) {
            this.field2811 = arg2.method197(~arg1);
        } else if (arg0 == 2) {
            this.field415 = arg2.method226(255) == 1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)Lhf;", line = 313)
    public static final class193 method1268(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field216; var4++) {
            class193 var5 = var3.field230[var4];
            if ((var5.field3101 >> 29 & 0x3L) == 2L && var5.field3107 == arg1 && var5.field3108 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V", line = 343)
    public static final void method1269(boolean arg0, int arg1) {
        class291.field4873 = -1;
        field2816++;
        class160.field2677 = -1;
        class110.field1931 = arg1;
        if (!arg0) {
            method1271(12);
        }
        class309.method2113(-31654);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V", line = 358)
    public static void method1270(byte arg0) {
        int var1 = -64 / ((arg0 + 61) / 40);
        field2807 = null;
        field2817 = null;
        field2813 = null;
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V", line = 377)
    public static final void method1271(int arg0) {
        field2810++;
        class271.field4501 = -3;
        class225.field3727 = false;
        if (arg0 <= 48) {
            method1268(-125, 52, 43);
        }
        class242.field4003 = 0;
        class186.field3009 = 0;
        class249.field4111 = -1;
        class54.field1062 = 1;
        class264.field4410 = 0;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[[I", line = 399)
    public final int[][] method17(int arg0, int arg1) {
        int[][] var3 = this.field417.method1251(arg1, 127);
        field2809++;
        if (this.field417.field2751) {
            int[][] var4 = this.method173(0, arg1, (byte) -104);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var4[2];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class52.field1007; var11++) {
                var9[var11] = (var5[var11] * this.field2819 >> 12) + this.field2814;
                var7[var11] = (var6[var11] * this.field2819 >> 12) + this.field2814;
                var10[var11] = this.field2814 + (var8[var11] * this.field2819 >> 12);
            }
        }
        if (arg0 < 30) {
            method1268(-6, -109, 20);
        }
        return var3;
    }
}
