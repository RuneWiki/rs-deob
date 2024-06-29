import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class174 extends class162 {

    @OriginalMember(owner = "client!j", name = "J", descriptor = "Z")
    public boolean field2721 = true;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field2714 = new String[100];

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field2723 = 0;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "I")
    public static int field2731 = 0;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "[I")
    public int[] field2717;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "[I")
    private int[] field2727;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "[Ljava/lang/String;")
    private String[] field2722;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "[[I")
    private int[][] field2720;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)I")
    public final int method1166(int arg0) {
        int var2 = 93 % ((arg0 - 56) / 54);
        field2730++;
        return this.field2727 == null ? 0 : this.field2727.length;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIZ)I")
    public final int method1167(int arg0, int arg1, boolean arg2) {
        field2728++;
        if (this.field2727 == null || arg1 < 0 || arg1 > this.field2727.length) {
            return -1;
        } else if (this.field2720[arg1] == null || arg0 < 0 || arg0 > this.field2720[arg1].length) {
            return -1;
        } else {
            if (arg2) {
                this.field2722 = null;
            }
            return this.field2720[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIJIZ)Ljava/lang/String;")
    public static final String method1168(int arg0, int arg1, long arg2, int arg3, boolean arg4) {
        field2726++;
        char var6 = ',';
        char var7 = '.';
        if (~arg0 == arg3) {
            var7 = ',';
            var6 = '.';
        }
        boolean var8 = false;
        if (arg0 == 2) {
            var7 = ' ';
        }
        if (arg2 < 0L) {
            var8 = true;
            arg2 = -arg2;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lma;I)V")
    public final void method1169(class202 arg0, int arg1) {
        field2713++;
        if (arg1 > -51) {
            return;
        }
        while (true) {
            int var3 = arg0.method1420((byte) 0);
            if (var3 == 0) {
                return;
            }
            this.method1172(-109, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lma;B)Ljava/lang/String;")
    public final String method1170(class202 arg0, byte arg1) {
        field2712++;
        if (arg1 != 124) {
            field2731 = -115;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2727 != null) {
            for (int var4 = 0; var4 < this.field2727.length; var4++) {
                var3.append(this.field2722[var4]);
                var3.append(class217.method1518(this.field2727[var4], arg0.method1443((byte) 85, class151.field2351[this.field2727[var4]]), this.field2720[var4], (byte) -1));
            }
        }
        var3.append(this.field2722[this.field2722.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B[ILma;)V")
    public final void method1171(byte arg0, int[] arg1, class202 arg2) {
        field2719++;
        if (arg0 <= 49) {
            field2714 = null;
        }
        if (this.field2727 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field2727.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = class36.field472[this.method1175(var4, (byte) 43)];
            if (var5 > 0) {
                arg2.method1449(var5, (long) arg1[var4], true);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILma;I)V")
    private final void method1172(int arg0, class202 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2722 = class85.method569(-32153, arg1.method1403(-125), '<');
        } else if (arg2 == 2) {
            int var8 = arg1.method1420((byte) 0);
            this.field2717 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2717[var9] = arg1.method1419(67);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method1420((byte) 0);
            this.field2727 = new int[var4];
            this.field2720 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1419(125);
                this.field2727[var5] = var6;
                this.field2720[var5] = new int[class134.field2098[var6]];
                for (int var7 = 0; var7 < class134.field2098[var6]; var7++) {
                    this.field2720[var5][var7] = arg1.method1419(121);
                }
            }
        } else if (arg2 == 4) {
            this.field2721 = false;
        }
        int var10 = -10 % ((-arg0 - 4) / 62);
        field2715++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
    public static void method1173(byte arg0) {
        field2714 = null;
        if (arg0 < 7) {
            field2725 = -91;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public final void method1174(byte arg0) {
        field2732++;
        if (this.field2717 != null) {
            for (int var2 = 0; var2 < this.field2717.length; var2++) {
                this.field2717[var2] = class82.method554(this.field2717[var2], 32768);
            }
        }
        if (arg0 < 25) {
            field2724 = -127;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)I")
    public final int method1175(int arg0, byte arg1) {
        field2729++;
        if (arg1 != 43) {
            this.field2720 = null;
        }
        return this.field2727 == null || arg0 < 0 || this.field2727.length < arg0 ? -1 : this.field2727[arg0];
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public final String method1176(boolean arg0) {
        field2718++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2722 == null) {
            return "";
        } else if (arg0) {
            return null;
        } else {
            var2.append(this.field2722[0]);
            for (int var3 = 1; var3 < this.field2722.length; var3++) {
                var2.append("...");
                var2.append(this.field2722[var3]);
            }
            return var2.toString();
        }
    }
}
