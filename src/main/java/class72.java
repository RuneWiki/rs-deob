import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class72 implements class230 {

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "Lsba;")
    public static class218 field774 = null;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field775 = new String[100];

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "[I")
    public static int[] field776 = new int[1000];

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "Llga;")
    public static class712 field772 = new class712(25, 7);

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "[I")
    public static int[] field773;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "[[B")
    public static byte[][] field779;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
    public static void method533(byte arg0) {
        field776 = null;
        field775 = null;
        if (arg0 != 49) {
            field779 = null;
        }
        field779 = null;
        field773 = null;
        field772 = null;
        field774 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IJLvea;[I)Ljava/lang/String;")
    public final String method534(int arg0, long arg1, class276 arg2, int[] arg3) {
        field778++;
        if (class361.field4781 == arg2) {
            class635 var6 = class26.field193.method4097(arg3[0], 1028602529);
            return var6.method3573((int) arg1, (byte) 43);
        } else if (class266.field3510 == arg2 || class43.field452 == arg2) {
            class697 var7 = class761.field10628.method4169((int) arg1, (byte) -120);
            return var7.field9780;
        } else if (class725.field10124 == arg2 || class585.field8188 == arg2 || class460.field6376 == arg2) {
            return class26.field193.method4097(arg3[0], 1028602529).method3573((int) arg1, (byte) 127);
        } else {
            if (arg0 != 17438) {
                method533((byte) 34);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILji;)Lbp;")
    public static final class389 method535(int arg0, class611 arg1) {
        field777++;
        return arg0 >= -115 ? null : new class389(arg1.method3413(false), arg1.method3413(false), arg1.method3413(false), arg1.method3413(false), arg1.method3385(-125), arg1.method3428((byte) -100));
    }
}
