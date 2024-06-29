import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class276 extends class452 {

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "Z")
    public boolean field4202 = true;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "[I")
    public static int[] field4204 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "Lm;")
    public class130 field4217;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "[I")
    public int[] field4207;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "[I")
    private int[] field4209;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field4206;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field4208;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "[[I")
    private int[][] field4211;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1811(int arg0) {
        field4203++;
        if (class363.field5369 && arg0 == -15267) {
            class177.field2680 = null;
            class23.field283 = null;
            class363.field5369 = false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLhp;)V", line = 23)
    public final void method1812(byte arg0, class217 arg1) {
        if (arg0 <= 120) {
            this.field4211 = null;
        }
        while (true) {
            int var3 = arg1.method1515((byte) 125);
            if (var3 == 0) {
                field4216++;
                return;
            }
            this.method1816(arg1, 60, var3);
        }
    }

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "(I)I", line = 47)
    public final int method1813(int arg0) {
        if (arg0 > -80) {
            this.field4211 = null;
        }
        field4205++;
        return this.field4209 == null ? 0 : this.field4209.length;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lqu;", line = 66)
    public final class65 method1814(byte arg0, int arg1) {
        if (arg0 != -16) {
            this.field4217 = null;
        }
        field4215++;
        return this.field4209 == null || arg1 < 0 || arg1 > this.field4209.length ? null : class452.method2750(this.field4209[arg1], -3020);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 80)
    public final void method1815(boolean arg0) {
        if (!arg0) {
            this.method1816(null, 7, -7);
        }
        if (this.field4207 != null) {
            for (int var2 = 0; var2 < this.field4207.length; var2++) {
                this.field4207[var2] = class264.method1763(this.field4207[var2], 32768);
            }
        }
        field4212++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lhp;II)V", line = 108)
    private final void method1816(class217 arg0, int arg1, int arg2) {
        if (arg1 != 60) {
            this.method1816(null, 30, 38);
        }
        field4201++;
        if (arg2 == 1) {
            this.field4206 = class23.method170(16943, '<', arg0.method1550((byte) 28));
        } else if (arg2 == 2) {
            int var4 = arg0.method1515((byte) 126);
            this.field4207 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4207[var5] = arg0.method1511(-93);
            }
            return;
        } else if (arg2 == 3) {
            int var6 = arg0.method1515((byte) 125);
            this.field4211 = new int[var6][];
            this.field4209 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1511(-111);
                class65 var9 = class452.method2750(var8, -3020);
                if (var9 != null) {
                    this.field4209[var7] = var8;
                    this.field4211[var7] = new int[var9.field844];
                    for (int var10 = 0; var10 < var9.field844; var10++) {
                        this.field4211[var7][var10] = arg0.method1511(112);
                    }
                }
            }
            return;
        } else if (arg2 == 4) {
            this.field4202 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(III)I", line = 184)
    public final int method1817(int arg0, int arg1, int arg2) {
        field4214++;
        if (arg0 >= -19) {
            return -124;
        } else if (this.field4209 == null || arg2 < 0 || this.field4209.length < arg2) {
            return -1;
        } else if (this.field4211[arg2] == null || arg1 < 0 || this.field4211[arg2].length < arg1) {
            return -1;
        } else {
            return this.field4211[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "(I)V", line = 205)
    public static void method1818(int arg0) {
        field4204 = null;
        field4208 = null;
        if (arg0 != 32768) {
            field4204 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "(I)Ljava/lang/String;", line = 218)
    public final String method1819(int arg0) {
        field4210++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4206 == null) {
            return "";
        }
        var2.append(this.field4206[0]);
        for (int var3 = arg0; var3 < this.field4206.length; var3++) {
            var2.append("...");
            var2.append(this.field4206[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILhp;)Ljava/lang/String;", line = 244)
    public final String method1820(int arg0, class217 arg1) {
        field4213++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg0 <= 4) {
            this.field4211 = null;
        }
        if (this.field4209 != null) {
            for (int var4 = 0; var4 < this.field4209.length; var4++) {
                var3.append(this.field4206[var4]);
                var3.append(this.field4217.method962(-93, this.method1814((byte) -16, var4), this.field4211[var4], arg1.method1564(class452.method2750(this.field4209[var4], -3020).field845, -23773)));
            }
        }
        var3.append(this.field4206[this.field4206.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z[ILhp;)V", line = 273)
    public final void method1821(boolean arg0, int[] arg1, class217 arg2) {
        if (!arg0) {
            return;
        }
        field4200++;
        if (this.field4209 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field4209.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = this.method1814((byte) -16, var4).field847;
            if (var5 > 0) {
                arg2.method1546((long) arg1[var4], var5, true);
            }
        }
    }
}
