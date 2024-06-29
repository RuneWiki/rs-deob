import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 extends class501 {

    @OriginalMember(owner = "client!qaa", name = "B", descriptor = "Z")
    public boolean field275 = true;

    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!qaa", name = "r", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!qaa", name = "s", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!qaa", name = "v", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!qaa", name = "w", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!qaa", name = "x", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!qaa", name = "z", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!qaa", name = "C", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!qaa", name = "D", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!qaa", name = "G", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!qaa", name = "I", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!qaa", name = "J", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!qaa", name = "K", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!qaa", name = "H", descriptor = "Lqba;")
    public static class345 field280;

    @OriginalMember(owner = "client!qaa", name = "u", descriptor = "Lgp;")
    public class44 field268;

    @OriginalMember(owner = "client!qaa", name = "t", descriptor = "[I")
    private int[] field267;

    @OriginalMember(owner = "client!qaa", name = "y", descriptor = "[I")
    public int[] field272;

    @OriginalMember(owner = "client!qaa", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field278;

    @OriginalMember(owner = "client!qaa", name = "A", descriptor = "[[I")
    private int[][] field274;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)I")
    public final int method156(int arg0) {
        field277++;
        if (arg0 != -1) {
            method166(-119, null, 53, 90);
        }
        return this.field267 == null ? 0 : this.field267.length;
    }

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "(I)V")
    public final void method157(int arg0) {
        field264++;
        int var2 = 78 / ((71 - arg0) / 47);
        if (this.field272 != null) {
            for (int var3 = 0; var3 < this.field272.length; var3++) {
                this.field272[var3] = class473.method2847(this.field272[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public final String method158(boolean arg0) {
        field283++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field278 == null) {
            return "";
        }
        var2.append(this.field278[0]);
        int var3 = 1;
        if (!arg0) {
            return null;
        }
        while (var3 < this.field278.length) {
            var2.append("...");
            var2.append(this.field278[var3]);
            var3++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IB)V")
    public static final void method159(int arg0, byte arg1) {
        class513.field7337 = new int[arg0];
        class168.field2631 = new int[arg0];
        field270++;
        if (arg1 >= -126) {
            field280 = null;
        }
        class25.field240 = new int[arg0];
        class149.field2208 = new int[arg0];
        class144.field2013 = new int[arg0];
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(IB)Ltda;")
    public final class546 method160(int arg0, byte arg1) {
        field281++;
        if (this.field267 == null || arg0 < 0 || arg0 > this.field267.length) {
            return null;
        } else if (arg1 == 8) {
            return class553.method3342(this.field267[arg0], true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method161(int arg0, int arg1, String[] arg2, int arg3) {
        field279++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg0;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            if (arg3 != -2178) {
                method166(98, null, 97, -67);
            }
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZIFIZIII)[I")
    public static final int[] method162(boolean arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field273++;
        int[] var8 = new int[arg1];
        class596 var9 = new class596();
        var9.field8815 = arg7;
        var9.field8814 = arg4;
        var9.field8805 = arg6;
        var9.field8818 = arg5;
        var9.field8807 = (int) (arg2 * 4096.0F);
        var9.field8809 = arg3;
        var9.method395(-39);
        class82.method620(1, 1647477356, arg1);
        var9.method3527(766389473, var8, 0);
        return arg0 ? var8 : null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IIB)I")
    public final int method163(int arg0, int arg1, byte arg2) {
        field276++;
        if (this.field267 == null || arg0 < 0 || arg0 > this.field267.length) {
            return -1;
        } else if (this.field274[arg0] == null || arg1 < 0 || this.field274[arg0].length < arg1) {
            return -1;
        } else {
            if (arg2 != -65) {
                this.method157(-61);
            }
            return this.field274[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lgw;I)V")
    public final void method164(class148 arg0, int arg1) {
        if (arg1 > -67) {
            return;
        }
        while (true) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 == 0) {
                field282++;
                return;
            }
            this.method167(16, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lgw;I[I)V")
    public final void method165(class148 arg0, int arg1, int[] arg2) {
        field265++;
        int var4 = -72 / ((arg1 - 45) / 55);
        if (this.field267 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field267.length; var5++) {
            if (arg2.length <= var5) {
                return;
            }
            int var6 = this.method160(var5, (byte) 8).field8152;
            if (var6 > 0) {
                arg0.method1044((long) arg2[var5], -127, var6);
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILkda;II)Llg;")
    public static final class352 method166(int arg0, class328 arg1, int arg2, int arg3) {
        field269++;
        byte[] var4 = arg1.method1966(arg0, arg2, true);
        if (arg3 != 1499) {
            field280 = null;
        }
        return var4 == null ? null : new class352(var4);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IILgw;)V")
    private final void method167(int arg0, int arg1, class148 arg2) {
        field271++;
        int var4 = 110 % ((-arg0 - 35) / 35);
        if (arg1 == 1) {
            this.field278 = class587.method3490('<', 111, arg2.method1023(-29153));
        } else if (arg1 == 2) {
            int var5 = arg2.method1032((byte) -33);
            this.field272 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field272[var6] = arg2.method1045(true);
            }
            return;
        } else if (arg1 == 3) {
            int var7 = arg2.method1032((byte) -33);
            this.field267 = new int[var7];
            this.field274 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method1045(true);
                class546 var10 = class553.method3342(var9, true);
                if (var10 != null) {
                    this.field267[var8] = var9;
                    this.field274[var8] = new int[var10.field8156];
                    for (int var11 = 0; var11 < var10.field8156; var11++) {
                        this.field274[var8][var11] = arg2.method1045(true);
                    }
                }
            }
            return;
        } else if (arg1 == 4) {
            this.field275 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)V")
    public static void method168(byte arg0) {
        field280 = null;
        if (arg0 > -46) {
            method166(-111, null, -8, 36);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZLgw;)Ljava/lang/String;")
    public final String method169(boolean arg0, class148 arg1) {
        field266++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field267 != null) {
            for (int var4 = 0; var4 < this.field267.length; var4++) {
                var3.append(this.field278[var4]);
                var3.append(this.field268.method274(arg1.method1022(124, class553.method3342(this.field267[var4], !arg0).field8155), -122, this.method160(var4, (byte) 8), this.field274[var4]));
            }
        }
        var3.append(this.field278[this.field278.length - 1]);
        return arg0 ? null : var3.toString();
    }
}
