import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class464 {

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Z")
    public boolean field6874 = false;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Z")
    public static volatile boolean field6875 = true;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lri;")
    public static class73 field6876 = new class73(97, 3);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "F")
    public static float field6867;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public int field6873;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public int field6877;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lkg;")
    public class177 field6869;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lf;")
    public static class529 field6868;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ldh;I)V")
    public final void method2787(class209 arg0, int arg1) {
        field6871++;
        if (arg1 != -13605) {
            this.method2788(-127, null, 99);
        }
        while (true) {
            int var3 = arg0.method1428(arg1 + 45727);
            if (var3 == 0) {
                return;
            }
            this.method2788(arg1 ^ 0xFFFFCAA5, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILdh;I)V")
    private final void method2788(int arg0, class209 arg1, int arg2) {
        if (arg2 == 1) {
            this.field6877 = arg1.method1450((byte) 68);
        } else if (arg2 == 2) {
            this.field6873 = arg1.method1458((byte) -10);
        } else if (arg2 == 3) {
            this.field6874 = true;
        } else if (arg2 == 4) {
            this.field6877 = -1;
        }
        if (arg0 >= 83) {
            field6872++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method2789(int arg0) {
        if (arg0 <= -76) {
            field6876 = null;
            field6868 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZLqa;I)Lf;")
    public final class529 method2790(int arg0, boolean arg1, class162 arg2, int arg3) {
        field6866++;
        long var5 = (long) ((arg1 ? 262144 : 0) | this.field6877 | arg0 << 16 | arg2.field2371 << 19);
        class529 var7 = (class529) this.field6869.field2612.method1536(var5, arg3 ^ arg3);
        if (var7 != null) {
            return var7;
        } else if (this.field6869.field2602.method2924((byte) -128, this.field6877)) {
            class408 var8 = class408.method2459(this.field6869.field2602, this.field6877, 0);
            if (var8 != null) {
                var8.field6145 = var8.field6148 = var8.field6150 = var8.field6144 = 0;
                if (arg1) {
                    var8.method2462();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method2455();
                }
            }
            class529 var10 = arg2.method1030(var8, true);
            if (var10 != null) {
                this.field6869.field2612.method1542(var10, (byte) 112, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Z")
    public final boolean method2791(int arg0) {
        if (arg0 == 0) {
            field6870++;
            return this.field6869.field2602.method2924((byte) -127, this.field6877);
        } else {
            return false;
        }
    }
}
