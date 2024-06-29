import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class69 {

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
    public boolean field1070 = false;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    private int field1071 = 128;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public int field1076 = -1;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    private int field1082 = 0;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    private int field1073 = 0;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    private int field1079 = 128;

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Z")
    public boolean field1086 = false;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    private int field1084 = 0;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "[I")
    public static int[] field1080 = new int[256];

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    private int field1074;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[S")
    private short[] field1068;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[S")
    private short[] field1072;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "[S")
    private short[] field1077;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "[S")
    private short[] field1083;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Leb;I)V", line = 4)
    public final void method469(class371 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2429(arg1 + 20081);
            if (var3 == 0) {
                if (arg1 != -20081) {
                    return;
                }
                field1085++;
                return;
            }
            this.method475(arg0, var3, 10);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[Ljava/lang/String;[S)V", line = 29)
    public static final void method470(int arg0, String[] arg1, short[] arg2) {
        field1066++;
        class58.method386(arg1.length - 1, -16901, 0, arg1, arg2);
        if (arg0 <= 22) {
            method470(-1, (String[]) null, (short[]) null);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 47)
    public static void method471(int arg0) {
        if (arg0 == 0) {
            field1080 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIILaa;I)Lhc;", line = 59)
    public final class75 method472(int arg0, int arg1, int arg2, int arg3, class281 arg4, int arg5) {
        field1075++;
        int var7 = arg5;
        class449 var8 = this.field1076 == -1 || arg1 == -1 ? null : class86.method599(false, this.field1076);
        if (var8 != null) {
            var7 = arg5 | var8.method2805(arg3, (byte) 16, false, arg1);
        }
        if (this.field1079 != 128) {
            var7 |= 0x2;
        }
        if (this.field1071 != 128 || this.field1073 != 0) {
            var7 |= 0x5;
        }
        class190 var9 = class439.field6338;
        class75 var10;
        synchronized (class439.field6338) {
            var10 = (class75) class439.field6338.method1246((byte) -30, (long) (this.field1069 |= arg4.field3847 << 29));
        }
        if (var10 == null || arg4.method1732(var10.method533(), var7) != 0) {
            if (var10 != null) {
                var7 = arg4.method1777(var7, var10.method533());
            }
            int var11 = var7;
            if (this.field1072 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field1068 != null) {
                var11 |= 0x4000;
            }
            class279 var12 = class33.method247(class446.field6438, this.field1074, 0, 64);
            if (var12 == null) {
                return null;
            }
            var10 = arg4.method1736(var12, var11, class32.field498, this.field1084 + 64, this.field1082 + 850);
            if (this.field1072 != null) {
                for (int var13 = 0; var13 < this.field1072.length; var13++) {
                    var10.method509(this.field1072[var13], this.field1083[var13]);
                }
            }
            if (this.field1068 != null) {
                for (int var14 = 0; var14 < this.field1068.length; var14++) {
                    var10.method539(this.field1068[var14], this.field1077[var14]);
                }
            }
            var10.method508(var7);
            class190 var15 = class439.field6338;
            synchronized (class439.field6338) {
                class439.field6338.method1247((long) (this.field1069 |= arg4.field3847 << 29), (byte) -103, var10);
            }
        }
        if (arg0 != 850) {
            method474(-87, (class354) null, -5, -12);
        }
        class75 var16 = var8 == null ? var10.method529((byte) 2, var7, true) : var8.method2804((byte) 2, 512, arg2, 0, var7, var10, arg1, arg3);
        if (this.field1071 != 128 || this.field1079 != 128) {
            var16.method528(this.field1071, this.field1079, this.field1071);
        }
        if (this.field1073 != 0) {
            if (this.field1073 == 90) {
                var16.method507(4096);
            }
            if (this.field1073 == 180) {
                var16.method507(8192);
            }
            if (this.field1073 == 270) {
                var16.method507(12288);
            }
        }
        var16.method508(arg5);
        return var16;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 164)
    public static final void method473(byte arg0) {
        field1081++;
        int var1 = 8 / ((arg0 - 65) / 61);
        class377.field5379.method1249(1);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILke;II)V", line = 186)
    public static final void method474(int arg0, class354 arg1, int arg2, int arg3) {
        if (arg0 < 50) {
            return;
        }
        if (arg1.field931 == arg2 && arg2 != -1) {
            class449 var4 = class86.method599(false, arg2);
            int var5 = var4.field6516;
            if (var5 == 1) {
                arg1.field880 = arg3;
                arg1.field864 = 0;
                arg1.field904 = 0;
                arg1.field896 = 0;
                arg1.field916 = 1;
                class27.method218(class307.field4211 == arg1, (byte) -89, var4, arg1.field896, arg1.field6192, arg1.field6197);
            }
            if (var5 == 2) {
                arg1.field864 = 0;
            }
        } else if (arg2 == -1 || arg1.field931 == -1 || class86.method599(false, arg2).field6504 >= class86.method599(false, arg1.field931).field6504) {
            arg1.field931 = arg2;
            arg1.field916 = 1;
            arg1.field947 = arg1.field948;
            arg1.field864 = 0;
            arg1.field904 = 0;
            arg1.field896 = 0;
            arg1.field880 = arg3;
            if (arg1.field931 != -1) {
                class27.method218(class307.field4211 == arg1, (byte) -103, class86.method599(false, arg1.field931), arg1.field896, arg1.field6192, arg1.field6197);
            }
        }
        field1087++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Leb;II)V", line = 237)
    private final void method475(class371 arg0, int arg1, int arg2) {
        field1078++;
        if (arg2 != 10) {
            this.field1072 = null;
        }
        if (arg1 == 1) {
            this.field1074 = arg0.method2403((byte) 113);
        } else if (arg1 == 2) {
            this.field1076 = arg0.method2403((byte) 95);
        } else if (arg1 == 4) {
            this.field1071 = arg0.method2403((byte) 64);
        } else if (arg1 == 5) {
            this.field1079 = arg0.method2403((byte) 112);
        } else if (arg1 == 6) {
            this.field1073 = arg0.method2403((byte) 45);
        } else if (arg1 == 7) {
            this.field1084 = arg0.method2429(0);
        } else if (arg1 == 8) {
            this.field1082 = arg0.method2429(arg2 - 10);
        } else if (arg1 == 9) {
            this.field1070 = true;
        } else if (arg1 == 10) {
            this.field1086 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method2429(0);
            this.field1083 = new short[var6];
            this.field1072 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1072[var7] = (short) arg0.method2403((byte) 81);
                this.field1083[var7] = (short) arg0.method2403((byte) 65);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method2429(0);
            this.field1068 = new short[var4];
            this.field1077 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1068[var5] = (short) arg0.method2403((byte) 112);
                this.field1077[var5] = (short) arg0.method2403((byte) 119);
            }
            return;
        }
    }
}
