import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class706 {

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    private int field9913 = 0;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public int field9898;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[Ldba;")
    public class101[] field9895;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[I")
    public static int[] field9902 = new int[14];

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field9907 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field9893;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field9896;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field9904;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field9906;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field9909;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field9912;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "J")
    private long field9900;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Ldba;")
    private class101 field9910;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Ldba;")
    private class101 field9911;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field9894;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[Ldba;)I", line = 9)
    public final int method3952(int arg0, class101[] arg1) {
        field9906++;
        int var3 = arg0;
        for (int var4 = 0; var4 < this.field9898; var4++) {
            class101 var5 = this.field9895[var4];
            for (class101 var6 = var5.field1412; var6 != var5; var6 = var6.field1412) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JI)Ldba;", line = 43)
    public final class101 method3953(long arg0, int arg1) {
        this.field9900 = arg0;
        field9912++;
        class101 var4 = this.field9895[(int) (arg0 & (long) (this.field9898 - 1))];
        if (arg1 != 14) {
            return null;
        }
        for (this.field9910 = var4.field1412; this.field9910 != var4; this.field9910 = this.field9910.field1412) {
            if (this.field9910.field1409 == arg0) {
                class101 var5 = this.field9910;
                this.field9910 = this.field9910.field1412;
                return var5;
            }
        }
        this.field9910 = null;
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)[Lur;", line = 79)
    public static final class564[] method3954(int arg0) {
        if (arg0 < 39) {
            return null;
        } else {
            field9908++;
            return new class564[] { class541.field7351, class729.field10123, class523.field7175 };
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Ldba;", line = 92)
    public final class101 method3955(byte arg0) {
        int var2 = -126 / ((arg0 + 27) / 39);
        field9896++;
        if (this.field9913 > 0 && this.field9895[this.field9913 - 1] != this.field9911) {
            class101 var3 = this.field9911;
            this.field9911 = var3.field1412;
            return var3;
        }
        while (this.field9913 < this.field9898) {
            class101 var4 = this.field9895[this.field9913++].field1412;
            if (this.field9895[this.field9913 - 1] != var4) {
                this.field9911 = var4.field1412;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)I", line = 126)
    public final int method3956(byte arg0) {
        field9899++;
        if (arg0 != 105) {
            this.method3953(-119L, 123);
        }
        return this.field9898;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 139)
    public static void method3957(int arg0) {
        if (arg0 == -16326) {
            field9902 = null;
            field9894 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Ldba;", line = 153)
    public final class101 method3958(int arg0) {
        field9897++;
        if (this.field9910 == null) {
            return null;
        }
        if (arg0 != -15797) {
            field9903 = 66;
        }
        class101 var2 = this.field9895[(int) ((long) (this.field9898 - 1) & this.field9900)];
        while (this.field9910 != var2) {
            if (this.field9910.field1409 == this.field9900) {
                class101 var3 = this.field9910;
                this.field9910 = this.field9910.field1412;
                return var3;
            }
            this.field9910 = this.field9910.field1412;
        }
        this.field9910 = null;
        return null;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V", line = 184)
    public final void method3959(int arg0) {
        for (int var2 = arg0; var2 < this.field9898; var2++) {
            class101 var3 = this.field9895[var2];
            while (true) {
                class101 var4 = var3.field1412;
                if (var3 == var4) {
                    break;
                }
                var4.method792((byte) -109);
            }
        }
        field9905++;
        this.field9911 = null;
        this.field9910 = null;
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)Ldba;", line = 214)
    public final class101 method3960(int arg0) {
        field9909++;
        this.field9913 = arg0;
        return this.method3955((byte) -91);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ldr;IZ)V", line = 223)
    public static final void method3961(class751 arg0, int arg1, boolean arg2) {
        if (arg1 < 20) {
            return;
        }
        field9901++;
        class558.field7520.method1263(arg0, (byte) 114);
        if (arg2) {
            class283.method1819(class558.field7520, class396.field5819, arg0, class11.field175, class344.field5072, 1158);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V", line = 241)
    public class706(int arg0) {
        this.field9898 = arg0;
        this.field9895 = new class101[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class101 var3 = this.field9895[var2] = new class101();
            var3.field1416 = var3;
            var3.field1412 = var3;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JLdba;I)V", line = 263)
    public final void method3962(long arg0, class101 arg1, int arg2) {
        field9893++;
        if (arg1.field1416 != null) {
            arg1.method792((byte) -91);
        }
        class101 var5 = this.field9895[(int) ((long) (this.field9898 - 1) & arg0)];
        arg1.field1412 = var5;
        arg1.field1416 = var5.field1416;
        arg1.field1416.field1412 = arg1;
        if (arg2 >= -103) {
            this.method3952(38, null);
        }
        arg1.field1409 = arg0;
        arg1.field1412.field1416 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)I", line = 286)
    public final int method3963(byte arg0) {
        field9904++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field9898; var3++) {
            class101 var5 = this.field9895[var3];
            for (class101 var6 = var5.field1412; var6 != var5; var6 = var6.field1412) {
                var2++;
            }
        }
        int var4 = 106 / ((arg0 - 74) / 41);
        return var2;
    }
}
