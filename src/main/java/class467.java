import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class467 {

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field6324 = -1;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public int field6325 = -1;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public int field6318 = -1;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public int field6319;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public int field6320;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public int field6323;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field6326;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public int field6327;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public int field6328;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Lnf;")
    public static class604 field6329;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method2686(int arg0) {
        int var1 = -6 % ((-arg0 - 13) / 47);
        field6329 = null;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static final void method2687(int arg0) {
        field6322++;
        if (arg0 != 1512379690) {
            field6329 = null;
        }
        for (class300 var1 = (class300) class211.field3155.method3589((byte) -128); var1 != null; var1 = (class300) class211.field3155.method3591(0)) {
            class719.method3990(124, false, var1);
        }
        for (class300 var2 = (class300) class488.field6589.method3589((byte) -127); var2 != null; var2 = (class300) class488.field6589.method3591(0)) {
            class719.method3990(-84, true, var2);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
    public static final int method2688(int arg0, int arg1) {
        field6321++;
        return arg0 == -1670 ? arg1 >>> 10 : -66;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Luv;)V")
    public class467(class385 arg0) {
    }
}
