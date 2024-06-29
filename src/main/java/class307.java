import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class307 extends class310 {

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    private int field4784 = -32768;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Lta;")
    public static class197 field4788 = new class197(64);

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4792 = "Use";

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "S")
    public static short field4794 = 205;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public int field4787;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "[I")
    public static int[] field4795;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V", line = 21)
    public final void method16(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4789++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLjava/lang/StringBuffer;IC)Ljava/lang/StringBuffer;", line = 29)
    public static final StringBuffer method2130(byte arg0, StringBuffer arg1, int arg2, char arg3) {
        field4786++;
        int var4 = arg1.length();
        if (arg0 >= -66) {
            method2130((byte) 33, (StringBuffer) null, -109, '/');
        }
        arg1.setLength(arg2);
        for (int var5 = var4; var5 < arg2; var5++) {
            arg1.setCharAt(var5, arg3);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()I", line = 61)
    public final int method19() {
        field4793++;
        return this.field4784;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V", line = 72)
    public static void method2131(int arg0) {
        field4795 = null;
        field4792 = null;
        field4788 = null;
        if (arg0 != 205) {
            field4795 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIIIJILt;)V", line = 85)
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class254 arg10) {
        class1 var13 = class225.method1603(this.field4785, 0).method1916((class162) null, 0, this.field4787, 0, -1, (byte) -22);
        field4790++;
        if (var13 != null) {
            var13.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field4784 = var13.method19();
        }
    }
}
