import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class515 extends class539 {

    @OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
    public int field7039;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public int field7033;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "Luc;")
    public static class27 field7034 = new class27(52, 7);

    @OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
    public static int field7038 = 0;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!tv", name = "r", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
    public static final void method2861(File arg0, String arg1, byte arg2) {
        if (arg2 != 22) {
            method2863(-91);
        }
        class210.field3095.put(arg1, arg0);
        field7032++;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
    public static void method2862(byte arg0) {
        field7034 = null;
        if (arg0 > -73) {
            field7038 = -90;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public static final void method2863(int arg0) {
        if (arg0 != -600309215) {
            field7038 = 120;
        }
        field7036++;
        class178.field2636 = -1;
        class247.field3508 = -1;
        class131.field1794 = -1;
        class124.field1722 = 0;
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(II)V")
    public class515(int arg0, int arg1) {
        this.field7039 = arg1;
        this.field7033 = arg0;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIIIII)V")
    public static final void method2864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7035++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg4 * arg4;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        if (arg2 != -24254) {
            field7037 = -107;
        }
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 - 1) * var15;
        if (arg0 >= class92.field1219 && arg0 <= class631.field8829) {
            int var21 = class355.method2104(class144.field2148, arg1 + arg4, -127, class482.field6703);
            int var22 = class355.method2104(class144.field2148, arg1 - arg4, -114, class482.field6703);
            class548.method3012(var21, (byte) 23, arg5, var22, class476.field6655[arg0]);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var6++;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var23 = arg0 - var7;
            int var24 = arg0 + var7;
            if (var24 >= class92.field1219 && var23 <= class631.field8829) {
                int var25 = class355.method2104(class144.field2148, arg1 + var6, 64, class482.field6703);
                int var26 = class355.method2104(class144.field2148, arg1 - var6, 67, class482.field6703);
                if (var23 >= class92.field1219) {
                    class548.method3012(var25, (byte) 23, arg5, var26, class476.field6655[var23]);
                }
                if (class631.field8829 >= var24) {
                    class548.method3012(var25, (byte) 23, arg5, var26, class476.field6655[var24]);
                }
            }
        }
    }
}
