import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class310 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    private int field5249 = 0;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    private int field5258 = 0;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    private int field5268 = 128;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    private int field5261 = 0;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public int field5250 = -1;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    private int field5257 = 128;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Z")
    public boolean field5269 = false;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "[[I")
    public static int[][] field5253 = new int[104][104];

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field5251 = 0;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Ltl;")
    public static class59 field5266 = class85.method639("::", 9588);

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    private int field5256;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public int field5260;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[S")
    private short[] field5252;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "[S")
    private short[] field5259;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[S")
    private short[] field5264;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "[S")
    private short[] field5265;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Lca;", line = 28)
    public final class57 method2141(int arg0, int arg1) {
        class57 var3 = (class57) class124.field2053.method1483((byte) -74, (long) this.field5260);
        field5255++;
        if (var3 == null) {
            class242 var4 = class242.method1716(class293.field5004, this.field5256, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field5252 != null) {
                for (int var5 = 0; var5 < this.field5252.length; var5++) {
                    var4.method1725(this.field5252[var5], this.field5265[var5]);
                }
            }
            if (this.field5264 != null) {
                for (int var6 = 0; var6 < this.field5264.length; var6++) {
                    var4.method1711(this.field5264[var6], this.field5259[var6]);
                }
            }
            var3 = var4.method1702(this.field5249 + 64, this.field5261 + 850, -30, -50, -30);
            class124.field2053.method1488((long) this.field5260, var3, arg0 ^ 0x64EE);
        }
        class57 var7;
        if (this.field5250 == -1 || arg1 == -1) {
            var7 = var3.method429(true, true);
        } else {
            var7 = class265.method1834((byte) -39, this.field5250).method951(65535, arg1, var3);
        }
        if (this.field5257 != 128 || this.field5268 != 128) {
            var7.method444(this.field5257, this.field5268, this.field5257);
        }
        if (this.field5258 != arg0) {
            if (this.field5258 == 90) {
                var7.method430();
            }
            if (this.field5258 == 180) {
                var7.method438();
            }
            if (this.field5258 == 270) {
                var7.method425();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V", line = 106)
    public static void method2142(boolean arg0) {
        if (!arg0) {
            field5266 = null;
            field5253 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)I", line = 120)
    public static int method2143(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ls;Z)V", line = 134)
    public final void method2144(class170 arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field5254++;
        while (true) {
            int var3 = arg0.method1221(118);
            if (var3 == 0) {
                return;
            }
            this.method2145((byte) -39, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLs;I)V", line = 160)
    private final void method2145(byte arg0, class170 arg1, int arg2) {
        field5262++;
        if (arg2 == 1) {
            this.field5256 = arg1.method1214(arg0 - 18215);
        } else if (arg2 == 2) {
            this.field5250 = arg1.method1214(-18254);
        } else if (arg2 == 4) {
            this.field5257 = arg1.method1214(-18254);
        } else if (arg2 == 5) {
            this.field5268 = arg1.method1214(-18254);
        } else if (arg2 == 6) {
            this.field5258 = arg1.method1214(-18254);
        } else if (arg2 == 7) {
            this.field5249 = arg1.method1221(102);
        } else if (arg2 == 8) {
            this.field5261 = arg1.method1221(arg0 + 152);
        } else if (arg2 == 9) {
            this.field5269 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1221(72);
            this.field5265 = new short[var6];
            this.field5252 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5252[var7] = (short) arg1.method1214(-18254);
                this.field5265[var7] = (short) arg1.method1214(-18254);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1221(74);
            this.field5259 = new short[var4];
            this.field5264 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5264[var5] = (short) arg1.method1214(method2143(arg0, 18283));
                this.field5259[var5] = (short) arg1.method1214(-18254);
            }
        }
        if (arg0 != -39) {
            method2142(true);
        }
    }
}
