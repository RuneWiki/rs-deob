import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class714 extends class388 {

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "Z")
    public boolean field10082 = true;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "F")
    public static float field10075;

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "F")
    public static float field10083;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field10063;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field10066;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public static int field10067;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public static int field10068;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    public static int field10070;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
    public static int field10072;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    public static int field10073;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    public static int field10074;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "Lla;")
    public static class423 field10077;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "Lfm;")
    public class456 field10078;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "[I")
    private int[] field10064;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "[I")
    public int[] field10076;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "[Ljava/lang/String;")
    private String[] field10081;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "[Z")
    public static boolean[] field10080;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "[[I")
    private int[][] field10065;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)I", line = 6)
    public final int method4001(int arg0) {
        field10071++;
        if (this.field10064 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                field10077 = null;
            }
            return this.field10064.length;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIB)I", line = 21)
    public final int method4002(int arg0, int arg1, byte arg2) {
        field10079++;
        if (arg2 != 108) {
            field10077 = null;
        }
        if (this.field10064 == null || arg0 < 0 || this.field10064.length < arg0) {
            return -1;
        } else if (this.field10065[arg0] == null || arg1 < 0 || this.field10065[arg0].length < arg1) {
            return -1;
        } else {
            return this.field10065[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lsl;II)V", line = 40)
    private final void method4003(class479 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field10081 = class330.method2035('<', arg0.method2894(-13192), (byte) 109);
        } else if (arg2 == 2) {
            int var9 = arg0.method2886(true);
            this.field10076 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field10076[var10] = arg0.method2882(arg1 + 2);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method2886(true);
            this.field10064 = new int[var4];
            this.field10065 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2882(-1);
                class703 var7 = class530.method3213(var6, (byte) -120);
                if (var7 != null) {
                    this.field10064[var5] = var6;
                    this.field10065[var5] = new int[var7.field9915];
                    for (int var8 = 0; var8 < var7.field9915; var8++) {
                        this.field10065[var5][var8] = arg0.method2882(-1);
                    }
                }
            }
        } else if (arg2 == 4) {
            this.field10082 = false;
        }
        field10072++;
        if (arg1 != -3) {
            this.method4011((byte) 95);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "([IBLsl;)V", line = 115)
    public final void method4004(int[] arg0, byte arg1, class479 arg2) {
        field10074++;
        if (this.field10064 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field10064.length && arg0.length > var4; var4++) {
            int var5 = this.method4005(var4, (byte) -126).field9917;
            if (var5 > 0) {
                arg2.method2903((long) arg0[var4], var5, -115);
            }
        }
        int var6 = -93 / ((arg1 - 19) / 38);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)Ldj;", line = 144)
    public final class703 method4005(int arg0, byte arg1) {
        field10068++;
        int var3 = 36 / ((-arg1 - 79) / 47);
        return this.field10064 == null || arg0 < 0 || this.field10064.length < arg0 ? null : class530.method3213(this.field10064[arg0], (byte) -80);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V", line = 158)
    public static void method4006(byte arg0) {
        field10080 = null;
        field10077 = null;
        if (arg0 != -32) {
            method4006((byte) 10);
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)Ljava/lang/String;", line = 171)
    public final String method4007(int arg0) {
        field10073++;
        if (arg0 != 60) {
            method4009(false, null, -99, -120);
        }
        StringBuffer var2 = new StringBuffer(80);
        if (this.field10081 == null) {
            return "";
        }
        var2.append(this.field10081[0]);
        for (int var3 = 1; var3 < this.field10081.length; var3++) {
            var2.append("...");
            var2.append(this.field10081[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lsl;I)Ljava/lang/String;", line = 199)
    public final String method4008(class479 arg0, int arg1) {
        field10070++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field10064 != null) {
            for (int var4 = 0; var4 < this.field10064.length; var4++) {
                var3.append(this.field10081[var4]);
                var3.append(this.field10078.method2777(this.method4005(var4, (byte) 100), this.field10065[var4], arg0.method2916(-31066, class530.method3213(this.field10064[var4], (byte) -44).field9913), (byte) 68));
            }
        }
        if (arg1 != 0) {
            this.method4011((byte) 90);
        }
        var3.append(this.field10081[this.field10081.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZLqk;II)V", line = 229)
    public static final void method4009(boolean arg0, class146 arg1, int arg2, int arg3) {
        if (arg0) {
            field10063 = -55;
        }
        field10066++;
        class569 var4 = arg1.method1030(-94, class211.field3164);
        if (var4 == null) {
            return;
        }
        class211.field3164.method297(arg2, arg3, arg2 + arg1.field2016, arg1.field1997 + arg3);
        if (class42.field710 >= 3) {
            class211.field3164.method293(-16777216, var4, arg2, arg3);
        } else {
            class757.field10543.method3138((float) arg1.field2016 / 2.0F + (float) arg2, (float) arg1.field1997 / 2.0F + (float) arg3, 4096, ((int) (-class680.field9668) & 0x3FFF) << 2, var4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILsl;)V", line = 267)
    public final void method4010(int arg0, class479 arg1) {
        field10067++;
        while (true) {
            int var3 = arg1.method2886(true);
            if (var3 == 0) {
                if (arg0 > -13) {
                    this.field10082 = true;
                    return;
                } else {
                    return;
                }
            }
            this.method4003(arg1, -3, var3);
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(B)V", line = 290)
    public final void method4011(byte arg0) {
        field10069++;
        if (arg0 >= -120) {
            field10083 = -1.7025573F;
        }
        if (this.field10076 != null) {
            for (int var2 = 0; var2 < this.field10076.length; var2++) {
                this.field10076[var2] = class430.method2658(this.field10076[var2], 32768);
            }
        }
    }
}
