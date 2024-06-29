import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class105 extends class694 {

    @OriginalMember(owner = "client!co", name = "J", descriptor = "I")
    private int field1411 = 585;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "I")
    public static int field1408 = 0;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "Luc;")
    public static class27 field1410 = new class27(1, 7);

    @OriginalMember(owner = "client!co", name = "K", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!co", name = "M", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!co", name = "N", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!co", name = "O", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!co", name = "P", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1413;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "[I")
    public static int[] field1407;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "[I")
    public static int[] field1409;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IZI)V")
    public static final void method797(int arg0, boolean arg1, int arg2) {
        class86.field1181 = 3;
        ++field1412;
        class208.field3075 = arg0;
        class328.method1994((byte) -104, class680.field9588.field5522, class680.field9588.field5516);
        if (!arg1) {
            class208.method1374(-31847);
            class402.method2295(arg2 + 33578, class110.field1492, false, class683.field9609);
        } else {
            class402.method2295(31644, "", false, "");
        }
        if (arg2 != -1934) {
            field1407 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method798(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 73 % ((32 - arg0) / 43);
        if (~class482.field6703 >= ~arg2 && ~arg5 >= ~class144.field2148 && ~class92.field1219 >= ~arg3 && arg6 <= class631.field8829) {
            class493.method2765(arg1, arg7, arg3, arg5, -1, arg2, arg4, arg6);
        } else {
            class81.method641(arg2, arg1, arg5, arg3, arg7, arg6, (byte) 73, arg4);
        }
        ++field1416;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        if (arg0 < 112) {
            this.field1411 = 96;
        }
        ++field1417;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int var4 = field1409[arg1];
            for (int var5 = 0; ~var5 > ~class465.field6544; ++var5) {
                int var6 = class346.field4994[var5];
                if (~var6 < ~this.field1411 && -this.field1411 + 4096 > var6 && ~var4 < ~(2048 - this.field1411) && var4 < this.field1411 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1411 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (-this.field1411 + 2048 < var6 && 2048 - -this.field1411 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field1411;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1411 + 2048);
                } else if (~this.field1411 >= ~var4 && var4 <= -this.field1411 + 4096) {
                    if (~this.field1411 >= ~var6 && var6 <= -this.field1411 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1411 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field1411;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1411);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        int var4 = -79 / ((arg2 - 58) / 63);
        if (arg0 == 0) {
            this.field1411 = arg1.method743((byte) -87);
        }
        ++field1414;
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public static void method799(byte arg0) {
        field1407 = null;
        field1413 = null;
        field1409 = null;
        if (arg0 > 9) {
            field1410 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)Z")
    public static final boolean method800(byte arg0, int arg1, int arg2) {
        if (arg0 <= 0) {
            field1407 = null;
        }
        ++field1415;
        return (class246.field3501[1][arg2][arg1] & 2) != 0;
    }
}
