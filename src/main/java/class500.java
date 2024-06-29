import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class500 extends class513 {

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public int field6995;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public int field6996;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILgaa;FI[BIBFFIIFF)V")
    public static final void method2989(int arg0, class71 arg1, float arg2, int arg3, byte[] arg4, int arg5, byte arg6, float arg7, float arg8, int arg9, int arg10, float arg11, float arg12) {
        for (int var13 = 0; var13 < arg5; var13++) {
            class220.method1436(arg12, arg11, arg9, var13, (byte) -119, arg3, arg0, arg7, arg1, arg8, arg2, arg10, arg5, arg4);
            arg3 += arg9 * arg10;
        }
        if (arg6 <= -91) {
            field6998++;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static final void method2990(int arg0) {
        class378.field5264 = new class6(class138.field1840.method891(arg0 ^ 0x79B11E0F, class369.field4721), "", class565.field8033, 1009, arg0, 0L, 0, 0, true, false, 0L, true);
        field6997++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILkc;IB)V")
    public static final void method2991(int arg0, class655 arg1, int arg2, byte arg3) {
        field6999++;
        int[] var4 = new int[arg3];
        class34.method240(var4, 0, var4.length, arg2);
        class621.method3637(var4, arg1, (byte) -2, arg0);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(II)V")
    public class500(int arg0, int arg1) {
        this.field6995 = arg1;
        this.field6996 = arg0;
    }
}
