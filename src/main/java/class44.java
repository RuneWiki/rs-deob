import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class44 extends class104 {

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "Z")
    public boolean field535 = true;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
    public static int field521 = -1;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public static int field513 = 2301979;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "Ljava/lang/String;")
    public static String field528 = null;

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
    public static int field527 = 0;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "[I")
    private int[] field515;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "[I")
    public int[] field523;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "[Ljava/lang/String;")
    private String[] field529;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "[S")
    public static short[] field530;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "[[I")
    private int[][] field525;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(BI)I", line = 4)
    public final int method253(byte arg0, int arg1) {
        field524++;
        int var3 = 34 % ((21 - arg0) / 61);
        return this.field515 == null || arg1 < 0 || arg1 > this.field515.length ? -1 : this.field515[arg1];
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V", line = 32)
    public static final void method254(int arg0) {
        class172.field2479.method1237((byte) 111);
        if (arg0 != 26826) {
            field521 = -9;
        }
        field516++;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILp;)V", line = 43)
    public final void method255(int arg0, class107 arg1) {
        if (arg0 != 0) {
            field528 = (String) null;
        }
        while (true) {
            int var3 = arg1.method661(-1);
            if (var3 == 0) {
                field519++;
                return;
            }
            this.method263(60, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII)V", line = 65)
    public static final void method256(int arg0, int arg1, int arg2, int arg3) {
        class96 var4 = class141.method935(arg1, 11, 62);
        var4.method581((byte) -123);
        var4.field1243 = arg3;
        if (arg0 == 80) {
            field518++;
            var4.field1246 = arg2;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lp;B)Ljava/lang/String;", line = 81)
    public final String method257(class107 arg0, byte arg1) {
        StringBuffer var3 = new StringBuffer(80);
        if (this.field515 != null) {
            for (int var4 = 0; var4 < this.field515.length; var4++) {
                var3.append(this.field529[var4]);
                var3.append(class232.method1637(arg0.method657((byte) 97, class48.field575[this.field515[var4]]), this.field515[var4], -15966, this.field525[var4]));
            }
        }
        field531++;
        var3.append(this.field529[this.field529.length - 1]);
        int var5 = 83 % ((-arg1 - 22) / 33);
        return var3.toString();
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)I", line = 110)
    public final int method258(boolean arg0) {
        field533++;
        if (this.field515 == null) {
            return 0;
        } else {
            if (!arg0) {
                field527 = 3;
            }
            return this.field515.length;
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)V", line = 126)
    public final void method259(byte arg0) {
        if (arg0 >= -81) {
            this.field515 = (int[]) null;
        }
        if (this.field523 != null) {
            for (int var2 = 0; var2 < this.field523.length; var2++) {
                this.field523[var2] = class48.method283(this.field523[var2], 32768);
            }
        }
        field532++;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I", line = 146)
    public final int method260(int arg0, int arg1, int arg2) {
        field522++;
        if (this.field515 == null || arg1 < 0 || arg1 > this.field515.length) {
            return -1;
        } else if (arg2 == 0) {
            return this.field525[arg1] == null || arg0 < 0 || this.field525[arg1].length < arg0 ? -1 : this.field525[arg1][arg0];
        } else {
            return -69;
        }
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)Ljava/lang/String;", line = 172)
    public final String method261(byte arg0) {
        StringBuffer var2 = new StringBuffer(80);
        field520++;
        if (this.field529 == null) {
            return "";
        }
        var2.append(this.field529[0]);
        if (arg0 < 43) {
            field513 = -98;
        }
        for (int var3 = 1; var3 < this.field529.length; var3++) {
            var2.append("...");
            var2.append(this.field529[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lp;[IB)V", line = 202)
    public final void method262(class107 arg0, int[] arg1, byte arg2) {
        field534++;
        if (this.field515 == null) {
            return;
        }
        int var4 = -38 / ((arg2 + 73) / 49);
        for (int var5 = 0; var5 < this.field515.length && arg1.length > var5; var5++) {
            int var6 = class138.field1936[this.method253((byte) 97, var5)];
            if (var6 > 0) {
                arg0.method660((long) arg1[var5], false, var6);
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILp;)V", line = 237)
    private final void method263(int arg0, int arg1, class107 arg2) {
        if (arg1 == 1) {
            this.field529 = class319.method2226((byte) -62, arg2.method628(false), '<');
        } else if (arg1 == 2) {
            int var8 = arg2.method661(-1);
            this.field523 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field523[var9] = arg2.method624(14612);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method661(-1);
            this.field525 = new int[var4][];
            this.field515 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method624(arg0 + 14552);
                this.field515[var5] = var6;
                this.field525[var5] = new int[class135.field1862[var6]];
                for (int var7 = 0; var7 < class135.field1862[var6]; var7++) {
                    this.field525[var5][var7] = arg2.method624(14612);
                }
            }
        } else if (arg1 == 4) {
            this.field535 = false;
        }
        if (arg0 == 60) {
            field517++;
        }
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)V", line = 316)
    public static void method264(int arg0) {
        field528 = null;
        if (arg0 >= -43) {
            field513 = 117;
        }
        field530 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Llc;Lkg;IZLlc;)V", line = 332)
    public static final void method265(class175 arg0, class82 arg1, int arg2, boolean arg3, class175 arg4) {
        class236.field3432 = arg4;
        class97.field1270 = arg0;
        class267.field4206 = arg3;
        field514++;
        int var5 = class97.field1270.method1183(8321) - 1;
        class342.field5316 = class97.field1270.method1197(-106, var5) + var5 * 256;
        int var6 = 20 / ((arg2 + 54) / 40);
        class41.field490 = new String[] { null, null, class73.field942, null, null };
        class321.field4935 = new String[] { null, null, null, null, class121.field1696 };
        class139.field1946 = arg1;
    }
}
