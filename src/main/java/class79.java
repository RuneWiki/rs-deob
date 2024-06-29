import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class79 extends class189 {

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "[I")
    public int[] field1012;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "[Z")
    public boolean[] field1011;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "[I")
    public int[] field1007;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "[[I")
    public int[][] field1010;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field1013 = -2;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "Lem;")
    public static class223 field1006;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method623(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class362.field5135 = arg0;
        class679.field9327 = arg1;
        class661.field9049 = class679.field9327 > 1 && class362.field5135.method441();
        class660.field9038 = arg2;
        class586.field8250 = 0x1 << class660.field9038;
        class197.field2617 = class586.field8250 >> 1;
        Math.sqrt((double) (class197.field2617 * class197.field2617 + class197.field2617 * class197.field2617));
        class634.field8744 = arg3;
        class492.field6939 = arg4;
        class365.field5171 = arg5;
        class453.field6405 = arg6;
        class415.field5856 = class554.method3204(22);
        class146.method1008(-1);
        class656.field8999 = new class165[arg3][class492.field6939][class365.field5171];
        class588.field8292 = new class278[arg3];
        if (arg7) {
            class200.field2636 = new int[class492.field6939][class365.field5171];
            class414.field5823 = new byte[class492.field6939][class365.field5171];
            class130.field1565 = new short[class492.field6939][class365.field5171];
            class480.field6790 = new class165[1][class492.field6939][class365.field5171];
            class135.field1969 = new class278[1];
        } else {
            class200.field2636 = null;
            class414.field5823 = null;
            class130.field1565 = null;
            class480.field6790 = null;
            class135.field1969 = null;
        }
        if (arg8) {
            class488.field6906 = new long[arg3][arg4][arg5];
            class290.field4085 = new class244[65535];
            class543.field7583 = new boolean[65535];
            class101.field1208 = 0;
        } else {
            class488.field6906 = null;
            class290.field4085 = null;
            class543.field7583 = null;
            class101.field1208 = 0;
        }
        class695.method3920(false);
        class710.field9861 = new class105[2];
        class373.field5234 = new class105[2];
        class321.field4433 = new class105[2];
        class110.field1336 = new class105[10000];
        class278.field3928 = 0;
        class499.field7163 = new class105[5000];
        class347.field4911 = 0;
        class448.field6355 = new class524[5000];
        class581.field8200 = 0;
        class589.field8299 = new boolean[class453.field6405 + class453.field6405 + 1][class453.field6405 + class453.field6405 + 1];
        class178.field2384 = new boolean[class453.field6405 + class453.field6405 + 2][class453.field6405 + class453.field6405 + 2];
        class679.field9321 = new int[class453.field6405 + class453.field6405 + 2];
        class471.field6690 = class471.field6691;
        if (class661.field9049) {
            class373.field5239 = new boolean[arg3][class453.field6405 + class453.field6405 + 1][class453.field6405 + class453.field6405 + 1];
            class43.field527 = new boolean[arg3][][];
            if (class682.field9362 != null) {
                class109.method771();
            }
            class682.field9362 = new class73[class679.field9327];
            class362.field5135.method402(class682.field9362.length + 1);
            class362.field5135.method443(0);
            for (int var9 = 0; var9 < class682.field9362.length; var9++) {
                class682.field9362[var9] = new class73(var9 + 1, class362.field5135);
                (new Thread(class682.field9362[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class679.field9327 == 2) {
                var10 = 4;
                class470.field6674 = 2;
            } else if (class679.field9327 == 3) {
                var10 = 6;
                class470.field6674 = 3;
            } else {
                var10 = 8;
                class470.field6674 = 4;
            }
            class668.field9078 = new class351[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class668.field9078[var11] = new class351(class60.field738[class679.field9327 - 2][var11]);
            }
        } else {
            class470.field6674 = 1;
        }
        class549.field7663 = new int[class470.field6674 - 1];
        class552.field7766 = new int[class470.field6674 - 1];
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)V")
    public static void method624(byte arg0) {
        if (arg0 == -27) {
            field1006 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZI)V")
    public static final void method625(boolean arg0, int arg1) {
        if (class268.field3824 == null) {
            class689.method3849(18429);
        }
        field1008++;
        if (arg0) {
            class268.field3824.method3988((byte) 1);
        }
        if (arg1 >= -109) {
            method625(true, 63);
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(I[B)V")
    public class79(int arg0, byte[] arg1) {
        this.field1009 = arg0;
        class675 var3 = new class675(arg1);
        this.field1005 = var3.method3750((byte) 35);
        this.field1012 = new int[this.field1005];
        this.field1011 = new boolean[this.field1005];
        this.field1007 = new int[this.field1005];
        this.field1010 = new int[this.field1005][];
        for (int var4 = 0; var4 < this.field1005; var4++) {
            this.field1007[var4] = var3.method3750((byte) 35);
            if (this.field1007[var4] == 6) {
                this.field1007[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field1005; var5++) {
            this.field1011[var5] = var3.method3750((byte) 35) == 1;
        }
        for (int var6 = 0; var6 < this.field1005; var6++) {
            this.field1012[var6] = var3.method3757((byte) -65);
        }
        for (int var7 = 0; var7 < this.field1005; var7++) {
            this.field1010[var7] = new int[var3.method3750((byte) 35)];
        }
        for (int var8 = 0; var8 < this.field1005; var8++) {
            for (int var9 = 0; var9 < this.field1010[var8].length; var9++) {
                this.field1010[var8][var9] = var3.method3750((byte) 35);
            }
        }
    }
}
