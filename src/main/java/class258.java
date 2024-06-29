import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class258 {

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "Ljava/lang/String;")
    private String field3275 = "null";

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "C")
    public char field3282;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "C")
    public char field3283;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    private int field3286;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Lng;")
    public static class377 field3279;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Lsga;")
    public class583 field3285;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "Lsga;")
    private class583 field3288;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "[I")
    public static int[] field3281;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)I")
    public final int method1568(int arg0, int arg1) {
        field3287++;
        if (this.field3285 == null) {
            return this.field3286;
        }
        class394 var3 = (class394) this.field3285.method3248((long) arg0, 0);
        if (arg1 <= 42) {
            field3281 = null;
        }
        return var3 == null ? this.field3286 : var3.field5494;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method1569(boolean arg0, String arg1) {
        field3273++;
        if (this.field3285 == null) {
            return false;
        }
        if (arg0) {
            this.method1574(null, (byte) 6, -37);
        }
        if (this.field3288 == null) {
            this.method1570(-60);
        }
        for (class349 var3 = (class349) this.field3288.method3248(class110.method752((byte) -90, arg1), 0); var3 != null; var3 = (class349) this.field3288.method3246((byte) 60)) {
            if (var3.field4523.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    private final void method1570(int arg0) {
        field3276++;
        if (arg0 > -56) {
            field3279 = null;
        }
        this.field3288 = new class583(this.field3285.method3253(-18518));
        for (class739 var2 = (class739) this.field3285.method3245(false); var2 != null; var2 = (class739) this.field3285.method3252(12938)) {
            class349 var3 = new class349(var2.field10338, (int) var2.field8746);
            this.field3288.method3249(class110.method752((byte) -112, var2.field10338), var3, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V")
    public static void method1571(int arg0) {
        field3281 = null;
        if (arg0 == 5) {
            field3279 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method1572(byte arg0, int arg1) {
        field3280++;
        if (this.field3285 == null) {
            return this.field3275;
        }
        class739 var3 = (class739) this.field3285.method3248((long) arg1, 0);
        if (var3 == null) {
            return this.field3275;
        } else {
            if (arg0 >= -29) {
                this.method1574(null, (byte) -128, -114);
            }
            return var3.field10338;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    private final void method1573(byte arg0) {
        int var2 = 121 % ((arg0 - 48) / 55);
        this.field3288 = new class583(this.field3285.method3253(-18518));
        field3284++;
        for (class394 var3 = (class394) this.field3285.method3245(false); var3 != null; var3 = (class394) this.field3285.method3252(12938)) {
            class394 var4 = new class394((int) var3.field8746);
            this.field3288.method3249((long) var3.field5494, var4, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ltn;BI)V")
    private final void method1574(class179 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field3282 = class219.method1370(arg0.method1133(8), 57);
        } else if (arg2 == 2) {
            this.field3283 = class219.method1370(arg0.method1133(8), 4);
        } else if (arg2 == 3) {
            this.field3275 = arg0.method1106(-1);
        } else if (arg2 == 4) {
            this.field3286 = arg0.method1095((byte) 116);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1107(false);
            this.field3285 = new class583(class353.method2103(104, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1095((byte) 126);
                class627 var7;
                if (arg2 == 5) {
                    var7 = new class739(arg0.method1106(-1));
                } else {
                    var7 = new class394(arg0.method1095((byte) 126));
                }
                this.field3285.method3249((long) var6, var7, (byte) -77);
            }
        }
        if (arg1 > -56) {
            this.method1576(null, 73);
        }
        field3277++;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)Z")
    public final boolean method1575(int arg0, int arg1) {
        field3278++;
        if (this.field3285 == null) {
            return false;
        }
        if (this.field3288 == null) {
            this.method1573((byte) -99);
        }
        class394 var3 = (class394) this.field3288.method3248((long) arg0, arg1);
        return var3 != null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ltn;I)V")
    public final void method1576(class179 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1094(255);
            if (var3 == 0) {
                if (arg1 >= -29) {
                    field3281 = null;
                }
                field3274++;
                return;
            }
            this.method1574(arg0, (byte) -58, var3);
        }
    }
}
