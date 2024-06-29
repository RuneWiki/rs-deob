import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class300 extends Exception {

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "[[B")
    public static byte[][] field4213 = new byte[1000][];

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "Ltj;")
    public static class614 field4214;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1846(int arg0, String arg1, int arg2) {
        field4210++;
        class418.method2478(arg0, "", "", arg1, 0, "", arg2);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method1847(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field4211++;
        if (!arg5) {
            return;
        }
        int var8 = arg3 - arg7;
        int var9 = arg4 + arg7;
        for (int var10 = arg4; var10 < var9; var10++) {
            class223.method1484(class657.field9275[var10], arg2, -97, arg1, arg6);
        }
        for (int var11 = arg3; var11 > var8; var11--) {
            class223.method1484(class657.field9275[var11], arg2, -108, arg1, arg6);
        }
        int var12 = arg2 - arg7;
        int var13 = arg6 + arg7;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class657.field9275[var14];
            class223.method1484(var15, var13, -102, arg1, arg6);
            class223.method1484(var15, var12, -88, arg0, var13);
            class223.method1484(var15, arg2, -120, arg1, var12);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static void method1848(int arg0) {
        if (arg0 < 63) {
            method1846(-29, null, -19);
        }
        field4214 = null;
        field4213 = null;
    }
}
