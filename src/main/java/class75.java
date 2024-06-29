import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class75 extends class303 {

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    private int field1148 = 0;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    private int field1159 = 4096;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field1160 = 0;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "Lja;")
    public static class64 field1154;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "[[[B")
    public static byte[][][] field1152;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(III)V", line = 8)
    public static final void method559(int arg0, int arg1, int arg2) {
        class278 var3 = class94.method672(arg0, 0);
        field1149++;
        int var4 = var3.field4295;
        int var5 = var3.field4294;
        int var6 = var3.field4299;
        int var7 = class61.field949[var5 - var6];
        if (arg2 != -2145) {
            return;
        }
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class120.method917(arg1 << var6 & var8 | ~var8 & class278.field4304[var4], arg2 ^ 0xFFFFF797, var4);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)[I", line = 36)
    public final int[] method67(int arg0, int arg1) {
        field1157++;
        int[] var3 = this.field4763.method394(arg0 ^ arg0, arg1);
        if (this.field4763.field863) {
            int[] var4 = this.method2107(arg1, 0, 0);
            for (int var5 = 0; var5 < class70.field1108; var5++) {
                int var6 = var4[var5];
                if (this.field1148 > var6) {
                    var3[var5] = this.field1148;
                } else if (var6 > this.field1159) {
                    var3[var5] = this.field1159;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[[I)V", line = 73)
    public static final void method560(int arg0, int[][] arg1) {
        field1150++;
        if (arg0 == -15755) {
            class102.field1729 = arg1;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V", line = 84)
    public static final void method561(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class188.field2994 = arg4;
        class40.field725 = class79.field1208 * arg0 / arg2;
        field1153++;
        class95.field1565 = class279.field4316 * arg1 / arg3;
        class295.field4670 = -1;
        class40.method326(arg4 ^ 0x0);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(BI)V", line = 96)
    public static final void method562(byte arg0, int arg1) {
        class270.field4202 = 1000 / arg1;
        if (arg0 == -50) {
            field1155++;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)[[I", line = 107)
    public final int[][] method74(int arg0, int arg1) {
        field1147++;
        if (arg1 != 82) {
            this.field1159 = -80;
        }
        int[][] var3 = this.field4772.method1175(-126, arg0);
        if (this.field4772.field2488) {
            int[][] var4 = this.method2106(arg0, 0, 89);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class70.field1108; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (var13 < this.field1148) {
                    var8[var11] = this.field1148;
                } else if (var13 <= this.field1159) {
                    var8[var11] = var13;
                } else {
                    var8[var11] = this.field1159;
                }
                if (var12 < this.field1148) {
                    var10[var11] = this.field1148;
                } else if (this.field1159 >= var12) {
                    var10[var11] = var12;
                } else {
                    var10[var11] = this.field1159;
                }
                if (var14 < this.field1148) {
                    var9[var11] = this.field1148;
                } else if (var14 > this.field1159) {
                    var9[var11] = this.field1159;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 184)
    public class75() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IICLjava/lang/StringBuffer;)Ljava/lang/StringBuffer;", line = 190)
    public static final StringBuffer method563(int arg0, int arg1, char arg2, StringBuffer arg3) {
        field1158++;
        int var4 = arg3.length();
        arg3.setLength(arg1);
        for (int var5 = var4; var5 < arg1; var5++) {
            arg3.setCharAt(var5, arg2);
        }
        int var6 = -21 / ((arg0 - 84) / 41);
        return arg3;
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V", line = 214)
    public static void method564(int arg0) {
        field1152 = (byte[][][]) null;
        if (arg0 != 14238) {
            field1151 = -36;
        }
        field1154 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILpe;I)V", line = 230)
    public final void method65(int arg0, class101 arg1, int arg2) {
        field1156++;
        if (arg2 == 0) {
            this.field1148 = arg1.method731(false);
        } else if (arg2 == 1) {
            this.field1159 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field4773 = arg1.method741(arg0 ^ 0xFFFFF06C) == 1;
        }
        if (arg0 != -4004) {
            field1160 = -106;
        }
    }
}
