import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class170 extends class14 {

    @OriginalMember(owner = "client!t", name = "P", descriptor = "[Lqd;")
    public class147[] field3489;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field3483 = 0;

    @OriginalMember(owner = "client!t", name = "O", descriptor = "[I")
    public static int[] field3488 = new int[32768];

    @OriginalMember(owner = "client!t", name = "K", descriptor = "Lea;")
    public static class38 field3484 = class9.method46((byte) 101, " loggt sich aus)3");

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!t", name = "Q", descriptor = "[I")
    public static int[] field3490;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)Z")
    public final boolean method1199(boolean arg0, int arg1) {
        field3486++;
        if (arg0) {
            method1200((byte) -42);
        }
        return this.field3489[arg1].field3061;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public static void method1200(byte arg0) {
        field3484 = null;
        if (arg0 != -46) {
            method1201(-38, -120, -20, 117);
        }
        field3488 = null;
        field3490 = null;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(IIII)Lee;")
    public static final class42 method1201(int arg0, int arg1, int arg2, int arg3) {
        field3487++;
        class42 var4 = new class42();
        var4.field921 = arg1;
        var4.field919 = arg0;
        if (arg3 != -17421) {
            return null;
        }
        class177.field3580.method184(var4, false, (long) arg2);
        class53.method386((byte) 27, arg1);
        class200.method1314(arg1, arg3 ^ 0x443D);
        class43 var5 = class98.method813(arg2, arg3 ^ 0xFFFFABF3);
        if (var5 != null) {
            class172.method1209(var5, -1);
        }
        if (class185.field3689 != null) {
            class172.method1209(class185.field3689, arg3 ^ 0x440C);
            class185.field3689 = null;
        }
        class94.field2121 = 0;
        class169.field3482 = false;
        class45.method326(class151.field3125, class143.field2981, class127.field2727, class36.field765, arg3 ^ 0xFF00BBF3);
        if (class86.field1998 != -1) {
            class65.method460(class86.field1998, 1, -125);
        }
        return var4;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Ldd;Ldd;IZ)V")
    public class170(class32 arg0, class32 arg1, int arg2, boolean arg3) {
        class141 var5 = new class141();
        int var6 = arg0.method213(10000, arg2);
        this.field3489 = new class147[var6];
        int[] var7 = arg0.method203(arg2, (byte) 68);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method215(var7[var8], arg2, 1);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class203 var11 = null;
            for (class203 var12 = (class203) var5.method1020(0); var12 != null; var12 = (class203) var5.method1027((byte) 92)) {
                if (var12.field4000 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method194(var10, 90, 0);
                } else {
                    var13 = arg1.method194(0, 90, var10);
                }
                var11 = new class203(var10, var13);
                var5.method1014((byte) -121, var11);
            }
            this.field3489[var7[var8]] = new class147(var9, var11);
        }
    }
}
