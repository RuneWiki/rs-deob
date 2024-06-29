import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class119 {

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[I")
    public static int[] field1677 = new int[2500];

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[Lak;")
    public static class140[] field1679 = new class140[32768];

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "[[B")
    public static byte[][] field1682 = new byte[250][];

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1675 = " ";

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Z")
    public static boolean field1681 = false;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Lrj;")
    public static class8 field1673;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "[[I")
    public static int[][] field1674;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILhc;I)Lge;")
    public static final class72 method792(int arg0, int arg1, class235 arg2, int arg3) {
        field1676++;
        if (class57.method351(arg2, arg0, arg3, (byte) 66)) {
            if (arg1 != 0) {
                field1677 = null;
            }
            return class96.method639((byte) -58);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method793(byte arg0) {
        if (arg0 != -111) {
            field1681 = true;
        }
        field1677 = null;
        field1674 = null;
        field1679 = null;
        field1673 = null;
        field1675 = null;
        field1682 = null;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)Lq;")
    public static final class128 method794(byte arg0) {
        if (arg0 != -109) {
            method792(9, -89, (class235) null, 25);
        }
        int var1 = class50.field729[0] * class39.field576[0];
        field1678++;
        byte[] var2 = class140.field1956[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class9.field79[class235.method1572(255, var2[var4])];
        }
        class128 var5 = new class128(class21.field296, class287.field4535, class273.field4208[0], class198.field2749[0], class50.field729[0], class39.field576[0], var3);
        class15.method88(-15971);
        return var5;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lbb;I)Lbb;")
    public abstract class92 method795(class92 arg0, int arg1);
}
