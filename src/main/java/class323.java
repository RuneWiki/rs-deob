import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public abstract class class323 {

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field5227 = 0;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lg;")
    public static class181 field5231 = null;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "[I")
    public static int[] field5237 = new int[100];

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "[C")
    public static char[] field5234 = new char[128];

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Z")
    public static boolean field5230 = false;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public int field5228;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public int field5229;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public int field5232;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public int field5236;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public int field5238;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public int field5239;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lek;")
    public static class206 field5226;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[I")
    public static int[] field5225;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lmh;I)V", line = 9)
    public static final void method2322(class154 arg0, int arg1) {
        if (arg0.field2627 != null) {
            arg0.field2627.field722 = 0;
        }
        arg0.field2626 = false;
        for (class154 var2 = arg0.method829(); var2 != null; var2 = arg0.method825()) {
            method2322(var2, arg1);
        }
        if (arg1 != 3429) {
            method2324((byte) 48);
        }
        field5235++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 34)
    public static void method2323(byte arg0) {
        if (arg0 <= 57) {
            return;
        }
        field5226 = null;
        field5225 = null;
        field5231 = null;
        field5234 = null;
        field5237 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 84)
    public static final void method2324(byte arg0) {
        class136.field2321 = false;
        if (arg0 > -57) {
            field5234 = (char[]) null;
        }
        class52.field1047 = -1;
        field5233++;
        class6.field124 = 1;
        class212.field3516 = 0;
        class11.field363 = -3;
        class110.field2013 = 0;
        class308.field5026 = 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
    public abstract void method34(int arg0, int arg1);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public abstract void method32(int arg0, int arg1, int arg2);
}
