import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class558 extends class363 {

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Z")
    public static boolean field6975 = false;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "S")
    public static short field6982 = 320;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Ldr;")
    public static class675 field6977 = new class675(9, -1);

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field6979;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "Llm;")
    public static class466 field6987;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "Lhd;")
    private class694 field6981;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "Ljava/lang/Object;")
    public static Object field6980;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "[Liba;")
    public static class495[] field6984;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIII)V", line = 8)
    public static final void method2967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6985++;
        if (arg2 >= class292.field3700 && arg0 <= class337.field4186 && arg4 >= class125.field1524 && arg5 <= class377.field4848) {
            class696.method3847(arg4, arg1 - 20970, arg2, arg3, arg5, arg0);
        } else {
            class161.method990(arg2, true, arg3, arg5, arg0, arg4);
        }
        if (arg1 != 249) {
            field6975 = false;
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)I", line = 26)
    public static final int method2968(int arg0) {
        if (arg0 == 19) {
            field6976++;
            return 19;
        } else {
            return -61;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lji;I)V", line = 38)
    public final void method2969(class572 arg0, int arg1) {
        if (arg1 != -8898) {
            return;
        }
        while (true) {
            int var3 = arg0.method3097((byte) 12);
            if (var3 == 0) {
                field6979++;
                return;
            }
            this.method2971(arg0, var3, arg1 ^ 0xFFFFDDC7);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V", line = 62)
    public static void method2970(boolean arg0) {
        field6980 = null;
        field6977 = null;
        field6987 = null;
        if (!arg0) {
            field6980 = null;
        }
        field6984 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lji;II)V", line = 76)
    private final void method2971(class572 arg0, int arg1, int arg2) {
        field6986++;
        if (arg1 != arg2) {
            return;
        }
        int var4 = arg0.method3097((byte) 12);
        if (this.field6981 == null) {
            int var5 = class560.method2979(var4, (byte) 61);
            this.field6981 = new class694(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method3097((byte) 12) == 1;
            int var8 = arg0.method3059(arg2 ^ 0xF8);
            class263 var9;
            if (var7) {
                var9 = new class654(arg0.method3072(255));
            } else {
                var9 = new class319(arg0.method3064(-2031091464));
            }
            this.field6981.method3832(var9, (long) var8, arg2 - 153);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBII)V", line = 119)
    public static final void method2972(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field6978++;
        class243 var5 = class546.method2926(arg1, 8, true);
        var5.method1457(14);
        var5.field3130 = arg3;
        var5.field3135 = arg4;
        if (arg2 > -54) {
            field6984 = null;
        }
        var5.field3132 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)I", line = 136)
    public final int method2973(int arg0, int arg1, int arg2) {
        field6974++;
        if (this.field6981 == null) {
            return arg2;
        }
        class319 var4 = (class319) this.field6981.method3828((long) arg1, (byte) -91);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg0 != 320) {
                this.method2973(11, -53, -65);
            }
            return var4.field3990;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;", line = 167)
    public final String method2974(int arg0, String arg1, byte arg2) {
        field6983++;
        if (this.field6981 == null) {
            return arg1;
        }
        if (arg2 != 101) {
            this.method2971(null, 66, -21);
        }
        class654 var4 = (class654) this.field6981.method3828((long) arg0, (byte) -91);
        return var4 == null ? arg1 : var4.field8913;
    }
}
