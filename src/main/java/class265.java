import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class265 extends class529 {

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    private int field3354 = 4096;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    private int field3353 = 4096;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
    private int field3359 = 4096;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class265() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILjo;)I")
    public static final int method1595(int arg0, class359 arg1) {
        ++field3357;
        if (arg0 != 9952) {
            method1596(-46, -27L);
        }
        String var2 = class715.method3971((byte) -45, arg1);
        return class111.field1373.method445((byte) 114, class289.field3681, var2);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg1 > 45) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field3353 = arg2.method1107(false);
                    }
                } else {
                    this.field3359 = arg2.method1107(false);
                }
            } else {
                this.field3354 = arg2.method1107(false);
            }
            ++field3356;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)[[I")
    public final int[][] method592(int arg0, int arg1) {
        if (arg1 != 2) {
            method1596(10, -13L);
        }
        ++field3358;
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (super.field7450.field5165) {
            int[][] var4 = this.method3026(0, arg0, 18464);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class304.field3909; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field3354 * var12 >> 12;
                    var9[var11] = this.field3359 * var13 >> 12;
                    var10[var11] = this.field3353 * var14 >> 12;
                } else {
                    var8[var11] = this.field3354;
                    var9[var11] = this.field3359;
                    var10[var11] = this.field3353;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1596(int arg0, long arg1) {
        ++field3355;
        class444.field6221.setTime(new Date(arg1));
        int var3 = class444.field6221.get(7);
        int var4 = class444.field6221.get(5);
        int var5 = class444.field6221.get(2);
        int var6 = class444.field6221.get(1);
        int var7 = class444.field6221.get(11);
        if (arg0 != 10) {
            method1596(-87, -51L);
        }
        int var8 = class444.field6221.get(12);
        int var9 = class444.field6221.get(13);
        return class54.field786[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + class333.field4285[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}
