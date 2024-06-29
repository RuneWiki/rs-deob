import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class446 {

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lhda;")
    public static class752 field6123 = new class752(17, -1);

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Lro;")
    public static class2 field6126 = new class2();

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILee;)Lnm;")
    public static final class476 method2555(int arg0, class677 arg1) {
        field6121++;
        class311 var2 = class439.method2534(-1)[arg1.method3821((byte) -16)];
        class512 var3 = class12.method106(-12865)[arg1.method3821((byte) 72)];
        int var4 = arg1.method3771((byte) -10);
        int var5 = arg1.method3771((byte) -10);
        int var6 = arg1.method3807(-1);
        int var7 = arg1.method3807(-1);
        int var8 = arg1.method3771((byte) -10);
        int var9 = arg1.method3799(false);
        if (arg0 < 80) {
            field6123 = null;
        }
        int var10 = arg1.method3799(false);
        return new class476(var2, var3, var4, var5, var6, var7, var8, var9, var10);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
    public static int method2556(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZIII)Z")
    public static final boolean method2557(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            field6124 = 20;
        }
        field6122++;
        for (int var6 = arg4; var6 <= arg0; var6++) {
            for (int var7 = arg1; var7 <= arg3; var7++) {
                if (class689.field9589[var6][var7] == arg5 && class562.field7369[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method2558(int arg0) {
        field6126 = null;
        field6123 = null;
        if (arg0 != 17) {
            method2558(-100);
        }
    }
}
