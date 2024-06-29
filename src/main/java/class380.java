import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class380 extends class386 {

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    private int field5085 = 0;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    private int field5086 = 1;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field5092 = 0;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "Lwo;")
    public static class690 field5091 = new class690(15, 4);

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field5095 = 0;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2199(int arg0, int arg1, byte arg2) {
        ++field5088;
        class232 var3 = class37.field703.method807(0, arg1);
        if (~arg0 == -12) {
            arg0 = 10;
        }
        if (~arg0 <= -6 && ~arg0 >= -9) {
            arg0 = 4;
        }
        if (arg2 != 66) {
            field5094 = -61;
        }
        return var3.method1401((byte) -116, arg0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field5093;
        int var3 = 54 % ((arg1 - 13) / 40);
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int var5 = class562.field8114[arg0];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; class599.field8643 > var7; ++var7) {
                int var8 = class152.field1879[var7];
                int var9 = var8 + -2048 >> 1;
                int var12;
                if (this.field5092 != 0) {
                    int var10 = var9 * var9 - -(var6 * var6) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var12 = (int) ((double) (this.field5086 * var11) * 3.141592653589793D);
                } else {
                    var12 = (-var5 + var8) * this.field5086;
                }
                int var13 = var12 - (var12 & -4096);
                if (this.field5085 != 0) {
                    if (~this.field5085 == -3) {
                        var13 -= 2048;
                        if (~var13 > -1) {
                            var13 = -var13;
                        }
                        var13 = -var13 + 2048 << 1;
                    }
                } else {
                    var13 = class276.field3778[255 & var13 >> 4] + 4096 >> 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(B)V")
    public static void method2200(byte arg0) {
        field5091 = null;
        int var1 = -69 % ((-48 - arg0) / 41);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        ++field5090;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field5086 = arg2.method2229(255);
                }
            } else {
                this.field5085 = arg2.method2229(255);
            }
        } else {
            this.field5092 = arg2.method2229(255);
        }
        if (arg1 <= 111) {
            this.field5085 = 56;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(III)Z")
    public static final boolean method2201(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2199(-91, -119, (byte) -84);
        }
        ++field5087;
        return ~(540800 & arg2) != -1;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
    public class380() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public final void method358(int arg0) {
        class265.method1609((byte) -67);
        if (arg0 <= 0) {
            field5091 = null;
        }
        ++field5089;
    }
}
