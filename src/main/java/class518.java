import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class518 {

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "S")
    public static short field7051 = 32767;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "[B")
    public static byte[] field7055 = new byte[2048];

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "[I")
    public static int[] field7054 = new int[1];

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    public static int field7056;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "[[B")
    public static byte[][] field7052;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V")
    public static void method2951(int arg0) {
        field7055 = null;
        field7054 = null;
        field7052 = null;
        if (arg0 != 0) {
            method2953(-12, -3, 43);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B[[[Lwg;)V")
    public static final void method2952(byte arg0, class390[][][] arg1) {
        field7056++;
        if (arg0 != 48) {
            method2951(29);
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class390[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class390 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5524 instanceof class526) {
                            ((class526) var6.field5524).method208(-18279);
                        }
                        if (var6.field5533 instanceof class526) {
                            ((class526) var6.field5533).method208(arg0 ^ 0xFFFFB8A9);
                        }
                        if (var6.field5532 instanceof class526) {
                            ((class526) var6.field5532).method208(arg0 ^ 0xFFFFB8A9);
                        }
                        if (var6.field5525 instanceof class526) {
                            ((class526) var6.field5525).method208(-18279);
                        }
                        if (var6.field5529 instanceof class526) {
                            ((class526) var6.field5529).method208(-18279);
                        }
                        for (class467 var7 = var6.field5536; var7 != null; var7 = var7.field6421) {
                            class210 var8 = var7.field6419;
                            if (var8 instanceof class526) {
                                ((class526) var8).method208(arg0 - 18327);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)I")
    public static final int method2953(int arg0, int arg1, int arg2) {
        field7053++;
        int var3 = arg2 >>> 31;
        return arg0 == 0 ? (arg2 + var3) / arg1 - var3 : -122;
    }
}
