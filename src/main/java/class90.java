import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class90 extends class179 {

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "Z")
    public boolean field1048 = true;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "[[I")
    public static int[][] field1056 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field1043 = -1;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "Lwo;")
    public static class285 field1054;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "[I")
    private int[] field1057;

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "[I")
    public int[] field1060;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field1049;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "[[I")
    private int[][] field1050;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public static void method559(int arg0) {
        field1054 = null;
        if (arg0 <= -87) {
            field1056 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)I")
    public final int method560(int arg0, int arg1) {
        field1059++;
        if (this.field1057 == null || arg0 < 0 || arg0 > this.field1057.length) {
            return -1;
        } else {
            if (arg1 != 0) {
                this.method561(123, (byte) -68, -90);
            }
            return this.field1057[arg0];
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBI)I")
    public final int method561(int arg0, byte arg1, int arg2) {
        field1052++;
        if (this.field1057 == null || arg0 < 0 || this.field1057.length < arg0) {
            return -1;
        } else if (this.field1050[arg0] == null || arg2 < 0 || this.field1050[arg0].length < arg2) {
            return -1;
        } else {
            int var4 = -13 % ((-arg1 - 44) / 59);
            return this.field1050[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public final String method562(boolean arg0) {
        field1046++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1049 == null) {
            return "";
        }
        if (arg0) {
            method559(42);
        }
        var2.append(this.field1049[0]);
        for (int var3 = 1; var3 < this.field1049.length; var3++) {
            var2.append("...");
            var2.append(this.field1049[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lbg;[II)V")
    public final void method563(class242 arg0, int[] arg1, int arg2) {
        field1055++;
        if (arg2 != -1) {
            this.method568(-101);
        }
        if (this.field1057 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1057.length; var4++) {
            if (var4 >= arg1.length) {
                return;
            }
            int var5 = class158.field1847[this.method560(var4, 0)];
            if (var5 > 0) {
                arg0.method1596((long) arg1[var4], 2, var5);
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILbg;I)V")
    private final void method564(int arg0, class242 arg1, int arg2) {
        field1047++;
        if (arg2 == 1) {
            this.field1049 = class349.method2225(-11337, '<', arg1.method1565(-85));
        } else if (arg2 == 2) {
            int var4 = arg1.method1563(-128);
            this.field1060 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1060[var5] = arg1.method1587((byte) -102);
            }
        } else if (arg2 == 3) {
            int var6 = arg1.method1563(-128);
            this.field1057 = new int[var6];
            this.field1050 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1587((byte) -102);
                this.field1057[var7] = var8;
                this.field1050[var7] = new int[class368.field5017[var8]];
                for (int var9 = 0; var9 < class368.field5017[var8]; var9++) {
                    this.field1050[var7][var9] = arg1.method1587((byte) -102);
                }
            }
        } else if (arg2 == 4) {
            this.field1048 = false;
        }
        if (arg0 < 16) {
            this.method563((class242) null, (int[]) null, 96);
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
    public final void method565(int arg0) {
        if (this.field1060 != null) {
            for (int var2 = 0; var2 < this.field1060.length; var2++) {
                this.field1060[var2] = class213.method1307(this.field1060[var2], 32768);
            }
        }
        if (arg0 == 11023) {
            field1053++;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILbg;)V")
    public final void method566(int arg0, class242 arg1) {
        field1045++;
        while (true) {
            int var3 = arg1.method1563(-128);
            if (var3 == 0) {
                if (arg0 == 7) {
                    return;
                } else {
                    this.field1048 = true;
                    return;
                }
            }
            this.method564(arg0 + 37, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lbg;Z)Ljava/lang/String;")
    public final String method567(class242 arg0, boolean arg1) {
        field1058++;
        if (!arg1) {
            return null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1057 != null) {
            for (int var4 = 0; var4 < this.field1057.length; var4++) {
                var3.append(this.field1049[var4]);
                var3.append(class38.method247(-1, arg0.method1581(8, class401.field5531[this.field1057[var4]]), this.field1050[var4], this.field1057[var4]));
            }
        }
        var3.append(this.field1049[this.field1049.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)I")
    public final int method568(int arg0) {
        field1044++;
        if (arg0 == 80) {
            return this.field1057 == null ? 0 : this.field1057.length;
        } else {
            return 43;
        }
    }
}
