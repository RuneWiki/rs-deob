import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class584 extends class325 {

    @OriginalMember(owner = "client!nda", name = "G", descriptor = "Lmga;")
    public static class739 field7795 = new class739(20, 8);

    @OriginalMember(owner = "client!nda", name = "H", descriptor = "Ljava/util/Random;")
    public static Random field7796 = new Random();

    @OriginalMember(owner = "client!nda", name = "I", descriptor = "I")
    public static int field7797 = 0;

    @OriginalMember(owner = "client!nda", name = "J", descriptor = "[I")
    public static int[] field7798 = new int[250];

    @OriginalMember(owner = "client!nda", name = "K", descriptor = "Lnaa;")
    public static class78 field7799 = new class78();

    @OriginalMember(owner = "client!nda", name = "C", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!nda", name = "D", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!nda", name = "E", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!nda", name = "F", descriptor = "Z")
    public static boolean field7794;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)V")
    public static void method3248(int arg0) {
        field7798 = null;
        field7795 = null;
        if (arg0 >= -38) {
            method3248(79);
        }
        field7799 = null;
        field7796 = null;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIII)V")
    public static final void method3249(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7793;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        if (arg4 == 628308897) {
            class138.method1069(class785.field10808[arg2], (byte) -46, -arg3 + arg0, arg0 - -arg3, arg1);
            int var8 = -1;
            while (var6 > var5) {
                var8 += 2;
                ++var5;
                var7 += var8;
                if (~var7 <= -1) {
                    --var6;
                    var7 -= var6 << 1;
                    int[] var9 = class785.field10808[arg2 - -var6];
                    int[] var10 = class785.field10808[-var6 + arg2];
                    int var11 = arg0 + var5;
                    int var12 = -var5 + arg0;
                    class138.method1069(var9, (byte) 109, var12, var11, arg1);
                    class138.method1069(var10, (byte) -117, var12, var11, arg1);
                }
                int var13 = arg0 + var6;
                int var14 = -var6 + arg0;
                int[] var15 = class785.field10808[arg2 + var5];
                int[] var16 = class785.field10808[-var5 + arg2];
                class138.method1069(var15, (byte) 99, var14, var13, arg1);
                class138.method1069(var16, (byte) -47, var14, var13, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        if (arg0 < 21) {
            field7798 = null;
        }
        ++field7791;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (super.field4727.field6067) {
            class278.method1802(var3, 0, class261.field3874, class621.field8370[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
    public class584() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Laj;I)I")
    public static final int method3250(class333 arg0, int arg1) {
        ++field7792;
        int var2 = 0;
        if (arg0.method2104(58, class407.field5894)) {
            ++var2;
        }
        if (arg0.method2104(80, class446.field6260)) {
            ++var2;
        }
        if (arg0.method2104(arg1 ^ -25, class453.field6296)) {
            ++var2;
        }
        if (arg1 != -1) {
            method3248(49);
        }
        if (arg0.method2104(arg1 ^ -109, class62.field893)) {
            ++var2;
        }
        if (arg0.method2104(46, class683.field9621)) {
            ++var2;
        }
        if (arg0.method2104(-96, class359.field5245)) {
            ++var2;
        }
        if (arg0.method2104(62, class352.field5162)) {
            ++var2;
        }
        if (arg0.method2104(arg1 + 47, class441.field6218)) {
            ++var2;
        }
        if (arg0.method2104(arg1 ^ 97, class24.field380)) {
            ++var2;
        }
        if (arg0.method2104(arg1 ^ -38, class163.field2212)) {
            ++var2;
        }
        if (arg0.method2104(-92, class170.field2265)) {
            ++var2;
        }
        if (arg0.method2104(arg1 + 44, class560.field7530)) {
            ++var2;
        }
        if (arg0.method2104(-119, class54.field768)) {
            ++var2;
        }
        if (arg0.method2104(118, class714.field9981)) {
            ++var2;
        }
        if (arg0.method2104(-112, class475.field6611)) {
            ++var2;
        }
        if (arg0.method2104(arg1 ^ -124, class330.field4774)) {
            ++var2;
        }
        return var2;
    }
}
