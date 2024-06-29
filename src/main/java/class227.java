import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class227 extends class171 {

    @OriginalMember(owner = "client!og", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3436 = "Started 3d Library";

    @OriginalMember(owner = "client!og", name = "y", descriptor = "[I")
    public static int[] field3444 = new int[500];

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field3441 = 0;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "Llc;")
    public static class86 field3445 = new class86(4);

    @OriginalMember(owner = "client!og", name = "w", descriptor = "B")
    public byte field3442;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!og", name = "t", descriptor = "I")
    public int field3439;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "Ljava/lang/String;")
    public String field3437;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "Ljava/lang/String;")
    public String field3440;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)I")
    public static final int method1503(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method1504(int arg0, int arg1, int arg2) {
        field3443++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (arg2 < ~var3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
    public static void method1505(byte arg0) {
        field3445 = null;
        if (arg0 <= 9) {
            method1503(-69, 101);
        }
        field3444 = null;
        field3436 = null;
    }
}
