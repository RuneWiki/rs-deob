import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class187 extends class644 {

    @OriginalMember(owner = "client!qga", name = "t", descriptor = "Z")
    public boolean field2562 = true;

    @OriginalMember(owner = "client!qga", name = "r", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!qga", name = "s", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!qga", name = "u", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!qga", name = "w", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!qga", name = "y", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!qga", name = "A", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!qga", name = "D", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!qga", name = "E", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!qga", name = "G", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!qga", name = "v", descriptor = "Lud;")
    public class36 field2564;

    @OriginalMember(owner = "client!qga", name = "x", descriptor = "[I")
    private int[] field2566;

    @OriginalMember(owner = "client!qga", name = "C", descriptor = "[I")
    public int[] field2571;

    @OriginalMember(owner = "client!qga", name = "F", descriptor = "[Ljava/lang/String;")
    private String[] field2574;

    @OriginalMember(owner = "client!qga", name = "B", descriptor = "[[I")
    private int[][] field2570;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)I", line = 4)
    public final int method1250(byte arg0) {
        if (arg0 != -50) {
            this.field2571 = null;
        }
        field2573++;
        return this.field2566 == null ? 0 : this.field2566.length;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILsl;I)V", line = 19)
    private final void method1251(int arg0, class461 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2574 = class249.method1538('<', 0, arg1.method2574(-1));
        } else if (arg2 == 2) {
            int var9 = arg1.method2600((byte) -128);
            this.field2571 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2571[var10] = arg1.method2566(-2);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method2600((byte) -123);
            this.field2566 = new int[var4];
            this.field2570 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2566(arg0 + 7652);
                class577 var7 = class685.method3845(var6, true);
                if (var7 != null) {
                    this.field2566[var5] = var6;
                    this.field2570[var5] = new int[var7.field8095];
                    for (int var8 = 0; var8 < var7.field8095; var8++) {
                        this.field2570[var5][var8] = arg1.method2566(arg0 + 7652);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field2562 = false;
        }
        if (arg0 != -7654) {
            this.method1257(-88);
        }
        field2575++;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "([IILsl;)V", line = 93)
    public final void method1252(int[] arg0, int arg1, class461 arg2) {
        field2568++;
        if (this.field2566 == null || arg1 != 32768) {
            return;
        }
        for (int var4 = 0; var4 < this.field2566.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = this.method1258(arg1 ^ 0x8066, var4).field8098;
            if (var5 > 0) {
                arg2.method2569((long) arg0[var4], 2, var5);
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "(B)Ljava/lang/String;", line = 129)
    public final String method1253(byte arg0) {
        field2572++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2574 == null) {
            return "";
        }
        var2.append(this.field2574[0]);
        if (arg0 >= -27) {
            this.method1252(null, -47, null);
        }
        for (int var3 = 1; var3 < this.field2574.length; var3++) {
            var2.append("...");
            var2.append(this.field2574[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lsl;I)V", line = 161)
    public final void method1254(class461 arg0, int arg1) {
        field2567++;
        if (arg1 != -1) {
            this.field2574 = null;
        }
        while (true) {
            int var3 = arg0.method2600((byte) -126);
            if (var3 == 0) {
                return;
            }
            this.method1251(arg1 - 7653, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZLsl;)Ljava/lang/String;", line = 182)
    public final String method1255(boolean arg0, class461 arg1) {
        if (!arg0) {
            return null;
        }
        field2569++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2566 != null) {
            for (int var4 = 0; var4 < this.field2566.length; var4++) {
                var3.append(this.field2574[var4]);
                var3.append(this.field2564.method226(false, this.method1258(103, var4), this.field2570[var4], arg1.method2570(class685.method3845(this.field2566[var4], true).field8101, false)));
            }
        }
        var3.append(this.field2574[this.field2574.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(III)I", line = 210)
    public final int method1256(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            return -125;
        }
        field2560++;
        if (this.field2566 == null || arg1 < 0 || this.field2566.length < arg1) {
            return -1;
        } else if (this.field2570[arg1] == null || arg2 < 0 || this.field2570[arg1].length < arg2) {
            return -1;
        } else {
            return this.field2570[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V", line = 230)
    public final void method1257(int arg0) {
        if (arg0 <= 97) {
            return;
        }
        field2563++;
        if (this.field2571 != null) {
            for (int var2 = 0; var2 < this.field2571.length; var2++) {
                this.field2571[var2] = class683.method3840(this.field2571[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)Lfia;", line = 252)
    public final class577 method1258(int arg0, int arg1) {
        field2565++;
        if (this.field2566 == null || arg1 < 0 || this.field2566.length < arg1) {
            return null;
        } else if (arg0 < 8) {
            return null;
        } else {
            return class685.method3845(this.field2566[arg1], true);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IB)V", line = 266)
    public static final void method1259(int arg0, byte arg1) {
        if (arg1 < -29) {
            field2561++;
            class37 var2 = class636.method3571(4, arg0, -106);
            var2.method230(119);
        }
    }
}
