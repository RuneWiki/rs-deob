import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class502 {

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field6256 = -1;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Laj;")
    public static class292 field6253;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Loca;", line = 4)
    public static final class247 method2727(int arg0, int arg1) {
        field6252++;
        return arg0 >= ~arg1 && arg1 < 100 ? class691.field9583[arg1] : null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;IBIZ)V", line = 20)
    public static final void method2728(String arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        class557.method2966(arg1, arg4, false, arg3, (byte) 59, null, arg0);
        if (arg2 != 112) {
            field6253 = null;
        }
        field6254++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 38)
    public static void method2729(byte arg0) {
        int var1 = -112 / ((arg0 + 56) / 37);
        field6253 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILpp;BI)V", line = 48)
    public static final void method2730(int arg0, class365 arg1, byte arg2, int arg3) {
        field6255++;
        int[] var4 = new int[4];
        class70.method558(var4, 0, var4.length, arg0);
        class467.method2546(arg1, var4, arg3, 0);
        int var5 = 98 / ((arg2 - 19) / 56);
    }
}
