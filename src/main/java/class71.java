import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class71 extends class59 {

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "Z")
    public boolean field1036 = true;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "[I")
    public static int[] field1038 = new int[14];

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field1042 = 0;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "[[B")
    public static byte[][] field1037 = new byte[1000][];

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field1052 = 0;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "Lvl;")
    public static class73 field1043;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "[I")
    public int[] field1050;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "[I")
    private int[] field1051;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "[Ljava/lang/String;")
    private String[] field1047;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[[I")
    private int[][] field1041;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILvl;)V")
    public static final void method463(int arg0, class73 arg1) {
        class290.field4672 = arg1;
        field1054++;
        if (arg0 != 29232) {
            method463(-102, (class73) null);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIILsc;IJZ)Z")
    public static final boolean method464(int arg0, int arg1, int arg2, int arg3, int arg4, class248 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class59.method377(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[ILim;)V")
    public final void method465(int arg0, int[] arg1, class170 arg2) {
        field1053++;
        if (arg0 <= 6 || this.field1051 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1051.length; var4++) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = class281.field4580[this.method469(-1, var4)];
            if (var5 > 0) {
                arg2.method1184(8, (long) arg1[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILim;)Ljava/lang/String;")
    public final String method466(int arg0, class170 arg1) {
        if (arg0 != -25161) {
            field1034 = 108;
        }
        field1045++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1051 != null) {
            for (int var4 = 0; var4 < this.field1051.length; var4++) {
                var3.append(this.field1047[var4]);
                var3.append(class251.method1793(arg1.method1198(class211.field3287[this.field1051[var4]], (byte) -123), (byte) -94, this.field1051[var4], this.field1041[var4]));
            }
        }
        var3.append(this.field1047[this.field1047.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)I")
    public final int method467(int arg0, byte arg1, int arg2) {
        field1046++;
        if (this.field1051 == null || arg0 < 0 || this.field1051.length < arg0) {
            return -1;
        } else {
            int var4 = -23 % ((arg1 - 11) / 37);
            return this.field1041[arg0] == null || arg2 < 0 || this.field1041[arg0].length < arg2 ? -1 : this.field1041[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)I")
    public final int method468(byte arg0) {
        if (arg0 != 46) {
            this.method470((byte) 122);
        }
        field1039++;
        return this.field1051 == null ? 0 : this.field1051.length;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
    public final int method469(int arg0, int arg1) {
        field1035++;
        if (this.field1051 == null || arg1 < 0 || this.field1051.length < arg1) {
            return -1;
        } else if (arg0 == -1) {
            return this.field1051[arg1];
        } else {
            return 98;
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(B)Ljava/lang/String;")
    public final String method470(byte arg0) {
        field1044++;
        StringBuffer var2 = new StringBuffer(80);
        int var3 = -1 / ((27 - arg0) / 53);
        if (this.field1047 == null) {
            return "";
        }
        var2.append(this.field1047[0]);
        for (int var4 = 1; var4 < this.field1047.length; var4++) {
            var2.append("...");
            var2.append(this.field1047[var4]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public final void method471(int arg0) {
        field1040++;
        if (arg0 < 15) {
            field1037 = null;
        }
        if (this.field1050 != null) {
            for (int var2 = 0; var2 < this.field1050.length; var2++) {
                this.field1050[var2] = class243.method1723(this.field1050[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILim;I)V")
    private final void method472(int arg0, class170 arg1, int arg2) {
        if (arg2 != 128) {
            this.method467(-105, (byte) -105, -91);
        }
        field1049++;
        if (arg0 == 1) {
            this.field1047 = class261.method1840(arg1.method1195(arg2 ^ 0xFFFFFF7F), -32227, '<');
        } else if (arg0 == 2) {
            int var4 = arg1.method1218(91);
            this.field1050 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1050[var5] = arg1.method1186((byte) -46);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method1218(65);
            this.field1051 = new int[var6];
            this.field1041 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1186((byte) -54);
                this.field1051[var7] = var8;
                this.field1041[var7] = new int[class113.field1656[var8]];
                for (int var9 = 0; var9 < class113.field1656[var8]; var9++) {
                    this.field1041[var7][var9] = arg1.method1186((byte) -47);
                }
            }
        } else if (arg0 == 4) {
            this.field1036 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(B)V")
    public static void method473(byte arg0) {
        field1037 = null;
        if (arg0 == -46) {
            field1043 = null;
            field1038 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lim;I)V")
    public final void method474(class170 arg0, int arg1) {
        field1048++;
        while (true) {
            int var3 = arg0.method1218(62);
            if (var3 == 0) {
                if (arg1 == 8940) {
                    return;
                } else {
                    field1042 = -123;
                    return;
                }
            }
            this.method472(var3, arg0, 128);
        }
    }
}
