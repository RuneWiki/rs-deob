import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class297 extends class134 {

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "Ljg;")
    public static class177 field4887 = new class177();

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public int field4877;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public int field4878;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public int field4880;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public int field4882;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public int field4884;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public int field4888;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public int field4890;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public int field4891;

    @OriginalMember(owner = "client!oh", name = "B", descriptor = "I")
    public int field4892;

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public int field4894;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2063(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4889++;
        int var7 = arg1 & 0x3;
        if ((arg6 & arg5) == 1) {
            int var8 = arg0;
            arg0 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 1 + 7 - arg0 - arg4;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg3;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2064(String arg0, int arg1) {
        System.out.println("Error: " + class248.method1729(-69, "%0a", arg0, "\n"));
        field4893++;
        if (arg1 < 12) {
            method2065(112);
        }
    }

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public static void method2065(int arg0) {
        field4887 = null;
        int var1 = -33 % ((arg0 + 55) / 49);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method2066(int arg0, int arg1, byte arg2) {
        field4886++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (arg2 <= 25) {
            return null;
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

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[B)Z")
    public static final boolean method2067(int arg0, byte[] arg1) {
        field4895++;
        class202 var2 = new class202(arg1);
        int var3 = var2.method1420((byte) 0);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1420((byte) 0) == 1;
        if (var4) {
            class64.method413(1, var2);
        }
        if (arg0 != -17864) {
            method2066(-89, -2, (byte) 114);
        }
        class70.method442((byte) 123, var2);
        return true;
    }
}
