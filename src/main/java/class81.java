import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class81 extends class110 {

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    private int field1143 = 1;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    private int field1137 = 204;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    private int field1150 = 1;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "[I")
    public static int[] field1145 = new int[50];

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public static int field1144 = 0;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field1138 = 0;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "Llm;")
    public static class210 field1142;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "Llm;")
    public static class210 field1149;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "[I")
    public static int[] field1140;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "[[Ljf;")
    public static class86[][] field1139;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "[[[B")
    public static byte[][][] field1136;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I", line = 10)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            method544(11);
        }
        field1146++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            for (int var4 = 0; var4 < class124.field1936; var4++) {
                int var5 = class249.field3714[var4];
                int var6 = class177.field2615[arg1];
                int var7 = this.field1150 * var5 >> 12;
                int var8 = var6 % (4096 / this.field1143) * this.field1143;
                int var9 = var5 % (4096 / this.field1150) * this.field1150;
                int var10 = this.field1143 * var6 >> 12;
                if (var8 < this.field1137) {
                    for (var7 -= var10; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field1137 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field1137 > var9) {
                    int var11;
                    for (var11 = var7 - var10; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)Lhg;", line = 97)
    public static final class304 method543(boolean arg0, int arg1) {
        field1148++;
        class304 var2 = (class304) class88.field1301.method2180((long) arg1, (byte) 31);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class12.field139.method1441(arg1, (byte) -44, 1);
        class304 var4 = new class304();
        if (var3 != null) {
            var4.method2107(-15296, new class263(var3), arg1);
        }
        if (arg0) {
            class88.field1301.method2175((long) arg1, var4, 109);
            return var4;
        } else {
            return (class304) null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILre;I)V", line = 125)
    public final void method44(int arg0, class263 arg1, int arg2) {
        field1147++;
        if (arg0 == 0) {
            this.field1150 = arg1.method1787(false);
        } else if (arg0 == 1) {
            this.field1143 = arg1.method1787(false);
        } else if (arg0 == 2) {
            this.field1137 = arg1.method1830((byte) -77);
        }
        if (arg2 > -37) {
            method544(95);
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 193)
    public class81() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V", line = 203)
    public static void method544(int arg0) {
        field1142 = null;
        field1149 = null;
        field1136 = (byte[][][]) null;
        field1140 = null;
        field1139 = (class86[][]) null;
        field1145 = null;
        if (arg0 != 3) {
            method543(false, -93);
        }
    }
}
