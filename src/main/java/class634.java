import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class634 extends class392 {

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "Z")
    public boolean field8811 = true;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field8815;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "Lrh;")
    public class268 field8814;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "[I")
    private int[] field8810;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "[I")
    public int[] field8816;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "[Lufa;")
    public static class680[] field8819;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "[Ljava/lang/String;")
    private String[] field8818;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "[[I")
    private int[][] field8817;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)I")
    public final int method3561(byte arg0) {
        field8802++;
        if (arg0 > -103) {
            this.field8817 = null;
        }
        return this.field8810 == null ? 0 : this.field8810.length;
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)V")
    public final void method3562(byte arg0) {
        field8812++;
        if (this.field8816 != null) {
            for (int var2 = 0; var2 < this.field8816.length; var2++) {
                this.field8816[var2] = class344.method2020(this.field8816[var2], 32768);
            }
        }
        if (arg0 > -115) {
            this.field8817 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILji;)Ljava/lang/String;")
    public final String method3563(int arg0, class611 arg1) {
        field8804++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field8810 != null) {
            for (int var4 = 0; var4 < this.field8810.length; var4++) {
                var3.append(this.field8818[var4]);
                var3.append(this.field8814.method1604(this.method3567(var4, -41), this.field8817[var4], (byte) 70, arg1.method3447(class3.method9(this.field8810[var4], (byte) -65).field3682, false)));
            }
        }
        if (arg0 == 15281) {
            var3.append(this.field8818[this.field8818.length - 1]);
            return var3.toString();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(B)V")
    public static void method3564(byte arg0) {
        if (arg0 != 99) {
            method3568((byte) -118, null);
        }
        field8819 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILji;)V")
    private final void method3565(int arg0, int arg1, class611 arg2) {
        if (arg0 == 1) {
            this.field8818 = class490.method2753(arg2.method3403((byte) 84), '<', false);
        } else if (arg0 == 2) {
            int var9 = arg2.method3428((byte) 117);
            this.field8816 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field8816[var10] = arg2.method3402((byte) 127);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method3428((byte) -103);
            this.field8817 = new int[var4][];
            this.field8810 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method3402((byte) 127);
                class276 var7 = class3.method9(var6, (byte) -96);
                if (var7 != null) {
                    this.field8810[var5] = var6;
                    this.field8817[var5] = new int[var7.field3688];
                    for (int var8 = 0; var8 < var7.field3688; var8++) {
                        this.field8817[var5][var8] = arg2.method3402((byte) 127);
                    }
                }
            }
        } else if (arg0 == 4) {
            this.field8811 = false;
        }
        if (arg1 == -3) {
            field8805++;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lji;[II)V")
    public final void method3566(class611 arg0, int[] arg1, int arg2) {
        field8803++;
        if (arg2 != -3) {
            this.method3571((byte) 4, null);
        }
        if (this.field8810 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field8810.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = this.method3567(var4, arg2 ^ 0x47).field3686;
            if (var5 > 0) {
                arg0.method3412(31498, (long) arg1[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Lvea;")
    public final class276 method3567(int arg0, int arg1) {
        field8813++;
        if (this.field8810 == null || arg0 < 0 || arg0 > this.field8810.length) {
            return null;
        } else {
            int var3 = -91 / ((arg1 - 4) / 44);
            return class3.method9(this.field8810[arg0], (byte) -109);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLji;)Ldt;")
    public static final class243 method3568(byte arg0, class611 arg1) {
        arg1.method3428((byte) -106);
        field8807++;
        if (arg0 >= -41) {
            field8819 = null;
        }
        int var2 = arg1.method3428((byte) -108);
        class243 var3 = class34.method169(var2, 115);
        var3.field3158 = arg1.method3428((byte) 61);
        int var4 = arg1.method3428((byte) -116);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method3428((byte) -104);
            var3.method1(var6, arg1, (byte) -116);
        }
        var3.method85((byte) 66);
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public final String method3569(boolean arg0) {
        field8801++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field8818 == null) {
            return "";
        }
        var2.append(this.field8818[0]);
        if (arg0) {
            return null;
        }
        for (int var3 = 1; var3 < this.field8818.length; var3++) {
            var2.append("...");
            var2.append(this.field8818[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)I")
    public final int method3570(int arg0, int arg1, int arg2) {
        field8809++;
        if (arg0 < 41) {
            return -47;
        } else if (this.field8810 == null || arg2 < 0 || arg2 > this.field8810.length) {
            return -1;
        } else if (this.field8817[arg2] == null || arg1 < 0 || this.field8817[arg2].length < arg1) {
            return -1;
        } else {
            return this.field8817[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(BLji;)V")
    public final void method3571(byte arg0, class611 arg1) {
        if (arg0 >= -81) {
            this.field8810 = null;
        }
        field8815++;
        while (true) {
            int var3 = arg1.method3428((byte) -126);
            if (var3 == 0) {
                return;
            }
            this.method3565(var3, -3, arg1);
        }
    }
}
