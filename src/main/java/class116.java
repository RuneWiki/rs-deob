import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class116 {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[I")
    public static int[] field1813 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1818 = 0;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lta;")
    public static class197 field1815 = new class197(100);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[Lom;")
    public static class70[] field1812;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 4)
    public static void method902(int arg0) {
        if (arg0 >= -11) {
            field1813 = (int[]) null;
        }
        field1812 = null;
        field1813 = null;
        field1815 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLlb;)V", line = 20)
    public static final void method903(boolean arg0, class211 arg1) {
        if (arg0) {
            field1811++;
            class158.field2357 = arg1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)Loi;", line = 33)
    public static final class319 method904(byte arg0, int arg1) {
        field1816++;
        class319 var2 = (class319) class87.field1275.method1432((byte) 93, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class100.field1493.method1507(arg1, (byte) -127, 4);
        class319 var4 = new class319();
        if (var3 != null) {
            var4.method2186(new class35(var3), (byte) 81, arg1);
        }
        int var5 = -66 / ((-arg0 - 33) / 37);
        class87.field1275.method1436(false, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I", line = 77)
    public static final int method905(int arg0, int arg1) {
        if (arg0 != 255) {
            method902(36);
        }
        field1814++;
        return arg1 & 0xFF;
    }
}
