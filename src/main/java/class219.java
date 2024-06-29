import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class219 extends class89 {

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Ldq;")
    public static class493 field2791;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lek;")
    private class352 field2788;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lpc;")
    public static class476 field2794;

    static {
        new class335("From", "Von:", "De", "De");
        field2791 = new class493(96, 8);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B[I)Ljava/lang/String;", line = 3)
    public static final String method1344(byte arg0, int[] arg1) {
        if (arg0 != 63) {
            field2794 = null;
        }
        field2787++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class191.field2481;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class521 var5 = class143.field1839.method3020((byte) 116, arg1[var4]);
            if (var5.field7530 != -1) {
                class16 var6 = (class16) class42.field518.method2647(arg0 ^ 0xFFFFFFA1, (long) var5.field7530);
                if (var6 == null) {
                    class311 var7 = class311.method1816(class448.field6413, var5.field7530, 0);
                    if (var7 != null) {
                        var6 = class33.field416.method345(var7, true);
                        class42.field518.method2635((long) var5.field7530, -26591, var6);
                    }
                }
                if (var6 != null) {
                    class101.field1219[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIB)I", line = 63)
    public final int method1345(int arg0, int arg1, byte arg2) {
        field2790++;
        if (arg2 < 104) {
            return 117;
        } else if (this.field2788 == null) {
            return arg1;
        } else {
            class101 var4 = (class101) this.field2788.method2022(-1, (long) arg0);
            return var4 == null ? arg1 : var4.field1222;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 85)
    public static void method1346(int arg0) {
        field2794 = null;
        field2791 = null;
        if (arg0 <= 72) {
            field2795 = -12;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lfh;IB)V", line = 101)
    private final void method1347(class463 arg0, int arg1, byte arg2) {
        if (arg2 != 70) {
            this.method1348(null, (byte) 105);
        }
        field2793++;
        if (arg1 != 249) {
            return;
        }
        int var4 = arg0.method2737(false);
        if (this.field2788 == null) {
            int var5 = class60.method550(arg2 ^ 0x37, var4);
            this.field2788 = new class352(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method2737(false) == 1;
            int var8 = arg0.method2738(-56);
            class383 var9;
            if (var7) {
                var9 = new class441(arg0.method2768((byte) 125));
            } else {
                var9 = new class101(arg0.method2727(-86));
            }
            this.field2788.method2019((byte) -61, var9, (long) var8);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lfh;B)V", line = 152)
    public final void method1348(class463 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2737(false);
            if (var3 == 0) {
                if (arg1 > -89) {
                    field2791 = null;
                }
                field2792++;
                return;
            }
            this.method1347(arg0, var3, (byte) 70);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;", line = 172)
    public final String method1349(String arg0, int arg1, int arg2) {
        field2789++;
        if (this.field2788 == null) {
            return arg0;
        } else {
            class441 var4 = (class441) this.field2788.method2022(-1, (long) arg2);
            int var5 = -39 / ((-arg1 - 91) / 33);
            return var4 == null ? arg0 : var4.field6312;
        }
    }
}
