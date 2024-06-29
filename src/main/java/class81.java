import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class81 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    private int field1166 = -1;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    private int field1169 = 0;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "Lea;")
    private class243 field1178 = new class243();

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Z")
    public boolean field1180 = false;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    private int field1162;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "[Lde;")
    private class127[] field1176;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[[[I")
    private int[][][] field1167;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static volatile int field1165 = 0;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "B")
    public static byte field1177;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class129 var20 = new class129(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class249.field4410[var21][arg1][arg2] == null) {
                    class249.field4410[var21][arg1][arg2] = new class61(var21, arg1, arg2);
                }
            }
            class249.field4410[arg0][arg1][arg2].field833 = var20;
        } else if (arg3 == 1) {
            class129 var22 = new class129(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class249.field4410[var23][arg1][arg2] == null) {
                    class249.field4410[var23][arg1][arg2] = new class61(var23, arg1, arg2);
                }
            }
            class249.field4410[arg0][arg1][arg2].field833 = var22;
        } else {
            class140 var24 = new class140(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class249.field4410[var25][arg1][arg2] == null) {
                    class249.field4410[var25][arg1][arg2] = new class61(var25, arg1, arg2);
                }
            }
            class249.field4410[arg0][arg1][arg2].field827 = var24;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method507(int arg0) {
        field1163++;
        if (this.field1171 != this.field1162) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -1) {
            for (int var2 = 0; var2 < this.field1162; var2++) {
                this.field1176[var2] = class53.field664;
            }
            return this.field1167;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public final void method508(byte arg0) {
        for (int var2 = 0; var2 < this.field1162; var2++) {
            this.field1167[var2][0] = null;
            this.field1167[var2][1] = null;
            this.field1167[var2][2] = null;
            this.field1167[var2] = null;
        }
        this.field1176 = null;
        field1168++;
        this.field1167 = null;
        if (arg0 < 91) {
            this.method508((byte) -17);
        }
        this.field1178.method1653(-67);
        this.field1178 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILcg;)V")
    public static final void method509(int arg0, class1 arg1) {
        if (arg0 == -1) {
            field1173++;
            class245.field4363 = arg1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLjava/awt/event/KeyEvent;)I")
    public static final int method510(byte arg0, KeyEvent arg1) {
        field1164++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg0 < 14) {
            field1179 = 30;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[[I")
    public final int[][] method511(int arg0, int arg1) {
        if (arg1 != -1) {
            return null;
        }
        field1174++;
        if (this.field1171 == this.field1162) {
            this.field1180 = this.field1176[arg0] == null;
            this.field1176[arg0] = class53.field664;
            return this.field1167[arg0];
        } else if (this.field1162 == 1) {
            this.field1180 = this.field1166 != arg0;
            this.field1166 = arg0;
            return this.field1167[0];
        } else {
            class127 var3 = this.field1176[arg0];
            if (var3 == null) {
                this.field1180 = true;
                if (this.field1162 > this.field1169) {
                    var3 = new class127(arg0, this.field1169);
                    this.field1169++;
                } else {
                    class127 var4 = (class127) this.field1178.method1659((byte) 70);
                    var3 = new class127(arg0, var4.field1798);
                    this.field1176[var4.field1802] = null;
                    var4.method797((byte) 102);
                }
                this.field1176[arg0] = var3;
            } else {
                this.field1180 = false;
            }
            this.field1178.method1663((byte) -68, var3);
            return this.field1167[var3.field1798];
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(III)V")
    public class81(int arg0, int arg1, int arg2) {
        this.field1171 = arg1;
        this.field1162 = arg0;
        this.field1176 = new class127[this.field1171];
        this.field1167 = new int[this.field1162][3][arg2];
    }
}
