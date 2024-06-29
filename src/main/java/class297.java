import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class297 extends class6 {

    @OriginalMember(owner = "client!ss", name = "w", descriptor = "I")
    public static int field4078 = -1;

    @OriginalMember(owner = "client!ss", name = "y", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ss", name = "A", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ss", name = "B", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ss", name = "E", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!ss", name = "F", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ss", name = "x", descriptor = "Lmg;")
    public static class101 field4079;

    @OriginalMember(owner = "client!ss", name = "z", descriptor = "Lmn;")
    private class247 field4081;

    @OriginalMember(owner = "client!ss", name = "C", descriptor = "Lla;")
    public static class315 field4084;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "(I)V")
    public static void method1740(int arg0) {
        field4084 = null;
        if (arg0 == -1) {
            field4079 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ZLsi;I)V")
    private final void method1741(boolean arg0, class391 arg1, int arg2) {
        field4083++;
        if (arg2 == 249) {
            int var4 = arg1.method2348(-2);
            if (this.field4081 == null) {
                int var5 = class508.method3034(var4, true);
                this.field4081 = new class247(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method2348(-2) == 1;
                int var8 = arg1.method2338(true);
                class260 var9;
                if (var7) {
                    var9 = new class450(arg1.method2347((byte) 57));
                } else {
                    var9 = new class500(arg1.method2361((byte) -56));
                }
                this.field4081.method1487(-122, (long) var8, var9);
            }
        }
        if (!arg0) {
            this.method1741(true, null, 88);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
    public static final void method1742(int arg0, int arg1) {
        field4080++;
        if (arg0 != -10931) {
            field4084 = null;
        }
        class97 var2 = class348.method2064(arg1, 1, -76);
        var2.method710(arg0 ^ 0xEA6);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILsi;)V")
    public final void method1743(int arg0, class391 arg1) {
        field4088++;
        while (true) {
            int var3 = arg1.method2348(-2);
            if (var3 == 0) {
                if (arg0 == 0) {
                    return;
                } else {
                    method1742(-38, -86);
                    return;
                }
            }
            this.method1741(true, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)I")
    public static final int method1744(int arg0, int arg1, int arg2) {
        int var3 = -81 / ((arg0 + 72) / 49);
        field4086++;
        int var4 = arg1 >>> 24;
        int var5 = 255 - var4;
        int var6 = ((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
        return (((arg2 & 0xFF00) * var5 & 0xFF0000 | (arg2 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var6;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBI)I")
    public final int method1745(int arg0, byte arg1, int arg2) {
        field4087++;
        if (this.field4081 == null) {
            return arg2;
        }
        if (arg1 <= 1) {
            field4078 = 7;
        }
        class500 var4 = (class500) this.field4081.method1492((long) arg0, 6340);
        return var4 == null ? arg2 : var4.field7369;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method1746(int arg0, int arg1, String arg2) {
        field4085++;
        if (this.field4081 == null) {
            return arg2;
        }
        class450 var4 = (class450) this.field4081.method1492((long) arg0, 6340);
        if (arg1 != 0) {
            method1742(112, -19);
        }
        return var4 == null ? arg2 : var4.field6619;
    }
}
