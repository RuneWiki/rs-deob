import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class142 {

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field1805 = -1;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Luc;")
    public static class51 field1807 = new class51(100);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "[Lda;")
    public static class193[] field1804;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lsj;Z)Z")
    public static final boolean method983(class248 arg0, boolean arg1) {
        field1802++;
        if (!arg1) {
            field1807 = null;
        }
        if (arg0.field3624 == 205) {
            class87.field1203 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
    public static final void method984(int arg0, int arg1) {
        field1806++;
        int var2 = -20 % ((-arg0 - 70) / 39);
        class440 var3 = class186.method1241(arg1, 2, (byte) 56);
        var3.method2749(13828096);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BLir;)V")
    public static final void method985(byte arg0, class185 arg1) {
        if (arg0 != 70) {
            field1804 = null;
        }
        field1803++;
        class276.field4050 = arg1;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public static void method986(int arg0) {
        if (arg0 != -9111) {
            field1807 = null;
        }
        field1804 = null;
        field1807 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)V")
    public static final void method987(byte arg0, int arg1) {
        field1809++;
        class440 var2 = class186.method1241(arg1, 4, (byte) 56);
        if (arg0 < 69) {
            field1807 = null;
        }
        var2.method2749(13828096);
    }
}
