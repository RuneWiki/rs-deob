import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public abstract class class358 extends class417 {

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "Lte;")
    public class527 field4874;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Lbn;")
    public static class378 field4870 = new class378(4, 3);

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "Z")
    public boolean field4875;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "[I")
    public static int[] field4871;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2157(int arg0, int arg1, int arg2) {
        field4872++;
        if (arg1 <= 113) {
            field4870 = null;
        }
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIII)V", line = 21)
    public static final void method2159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4868++;
        if (arg1 != 4) {
            method2159(17, 10, -118, 110, 94, -38, -10, -73);
        }
        int var8 = arg2 - arg3;
        int var9 = arg3 + arg4;
        for (int var10 = arg4; var10 < var9; var10++) {
            class140.method969(arg5, 15888, arg7, arg6, class604.field8993[var10]);
        }
        for (int var11 = arg2; var11 > var8; var11--) {
            class140.method969(arg5, 15888, arg7, arg6, class604.field8993[var11]);
        }
        int var12 = arg6 - arg3;
        int var13 = arg3 + arg5;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class604.field8993[var14];
            class140.method969(arg5, arg1 ^ 0x3E14, arg7, var13, var15);
            class140.method969(var13, 15888, arg0, var12, var15);
            class140.method969(var12, arg1 + 15884, arg7, arg6, var15);
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)Z", line = 70)
    public final boolean method2161(int arg0) {
        if (arg0 < 71) {
            return false;
        } else {
            field4869++;
            return false;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 82)
    public static void method2162(byte arg0) {
        field4871 = null;
        field4870 = null;
        int var1 = 122 % ((arg0 - 30) / 50);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)I", line = 93)
    public int method2163(byte arg0) {
        if (arg0 < 81) {
            this.method2165((byte) 36);
        }
        field4866++;
        return 0;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)I", line = 104)
    public final int method2164(boolean arg0) {
        field4873++;
        return arg0 ? -43 : 1;
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Z", line = 117)
    public final boolean method2166(int arg0) {
        if (arg0 < 117) {
            this.field4874 = null;
        }
        field4867++;
        return this.field4875;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lte;)V", line = 129)
    public class358(class527 arg0) {
        this.field4874 = arg0;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZI)V")
    public abstract void method2155(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
    public abstract boolean method2156(int arg0);

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILea;Lea;)V")
    public abstract void method2158(int arg0, int arg1, class468 arg2, class468 arg3);

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)V")
    public abstract void method2160(int arg0, int arg1);

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)V")
    public abstract void method2165(byte arg0);

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(B)Z")
    public abstract boolean method2167(byte arg0);
}
