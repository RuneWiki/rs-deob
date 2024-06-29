import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class98 extends class263 {

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "Z")
    private boolean field1509 = true;

    @OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
    private int field1514 = 4096;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    public static int field1510 = -1;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!jl", name = "L", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "Lco;")
    public static class214 field1513;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "[[[J")
    public static long[][][] field1508;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)V", line = 3)
    public static void method759(byte arg0) {
        int var1 = 95 % ((arg0 - -11) / 44);
        field1508 = null;
        field1513 = null;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V", line = 16)
    public class98() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(IB)[[I", line = 22)
    public final int[][] method34(int arg0, byte arg1) {
        if (arg1 > -45) {
            field1512 = 19;
        }
        ++field1515;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int[] var4 = this.method1644(0, 0, arg0 - 1 & class142.field2133);
            int[] var5 = this.method1644(0, 0, arg0);
            int[] var6 = this.method1644(0, 0, class142.field2133 & arg0 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class367.field5597; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field1514;
                int var12 = (var5[var10 + 1 & class83.field1326] + -var5[class83.field1326 & var10 + -1]) * this.field1514;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field1509) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var18;
                var8[var10] = var19;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(III)Z", line = 106)
    public static final boolean method760(int arg0, int arg1, int arg2) {
        int var3 = class500.field7400[arg0][arg1][arg2];
        if (-class520.field7642 == var3) {
            return false;
        } else if (class520.field7642 == var3) {
            return true;
        } else {
            int var4 = arg1 << class9.field75;
            int var5 = arg2 << class9.field75;
            if (class486.method2891(var4 + 1, class249.field3405[arg0].method707(arg1, arg2), var5 + 1) && class486.method2891(class324.field5060 + var4 - 1, class249.field3405[arg0].method707(arg1 + 1, arg2), var5 + 1) && class486.method2891(class324.field5060 + var4 - 1, class249.field3405[arg0].method707(arg1 + 1, arg2 + 1), class324.field5060 + var5 - 1) && class486.method2891(var4 + 1, class249.field3405[arg0].method707(arg1, arg2 + 1), class324.field5060 + var5 - 1) && class486.method2891(class280.field4230 + var4, class249.field3405[arg0].method707(arg1, arg2), var5 + 1) && class486.method2891(class324.field5060 + var4 - 1, class249.field3405[arg0].method707(arg1 + 1, arg2), class280.field4230 + var5) && class486.method2891(class280.field4230 + var4, class249.field3405[arg0].method707(arg1, arg2 + 1), class324.field5060 + var5 - 1) && class486.method2891(class324.field5060 + var4 - 1, class249.field3405[arg0].method707(arg1, arg2), class280.field4230 + var5) && class486.method2891(class280.field4230 + var4, class249.field3405[arg0].method707(arg1, arg2), class280.field4230 + var5)) {
                class500.field7400[arg0][arg1][arg2] = class520.field7642;
                return true;
            } else {
                class500.field7400[arg0][arg1][arg2] = -class520.field7642;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZLgk;)V", line = 143)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field1511;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field1509 = arg2.method2765(112) == 1;
            }
        } else {
            this.field1514 = arg2.method2727((byte) 43);
        }
        if (!arg1) {
            method760(66, -100, -31);
        }
    }
}
