import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class345 {

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "Lvia;")
    private class589 field4837 = new class589();

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "Lqw;")
    public static class84 field4840 = new class84();

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "Lmw;")
    public static class517 field4844 = new class517(15, 8);

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!saa", name = "o", descriptor = "Lffa;")
    public static class198 field4846;

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "Lvia;")
    private class589 field4843;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Lvia;")
    public final class589 method2184(int arg0) {
        field4842++;
        class589 var2 = this.field4837.field8042;
        if (this.field4837 == var2) {
            this.field4843 = null;
            return null;
        }
        if (arg0 < 103) {
            field4844 = null;
        }
        this.field4843 = var2.field8042;
        return var2;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(II)Lnt;")
    public static final class235 method2185(int arg0, int arg1) {
        field4833++;
        class235 var2 = (class235) class583.field7920.method3109((byte) 105, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class272.field3959.method1188(0, -18047, arg1);
        class235 var4 = new class235();
        if (var3 != null) {
            var4.method1489(arg1, new class254(var3), -15766);
        }
        if (arg0 <= 126) {
            return null;
        } else {
            class583.field7920.method3108((long) arg1, 16337, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
    public static final void method2186(byte arg0) throws IOException {
        field4839++;
        if (class710.field9707 != null && class426.field6202 > 0) {
            class15.field150.field3725 = 0;
            while (true) {
                class43 var1 = (class43) class583.field7921.method679((byte) -86);
                if (var1 == null || var1.field459 > (class15.field150.field3789.length - class15.field150.field3725)) {
                    class710.field9707.method137(0, (byte) 109, class15.field150.field3789, class15.field150.field3725);
                    class701.field9282 = 0;
                    class222.field2877 += class15.field150.field3725;
                    break;
                }
                class15.field150.method1716(var1.field457.field3789, var1.field459, 0, true);
                class426.field6202 -= var1.field459;
                var1.method1102((byte) 54);
                var1.field457.method1734(-1);
                var1.method242(9);
            }
        }
        if (arg0 <= 125) {
            method2191(32);
        }
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(B)Z")
    public final boolean method2187(byte arg0) {
        field4835++;
        if (arg0 != 67) {
            field4846 = null;
        }
        return this.field4837.field8044 == this.field4837;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BLvia;)V")
    public final void method2188(byte arg0, class589 arg1) {
        field4834++;
        if (arg1.field8042 != null) {
            arg1.method3310(30305);
        }
        arg1.field8042 = this.field4837.field8042;
        if (arg0 != 31) {
            field4844 = null;
        }
        arg1.field8044 = this.field4837;
        arg1.field8042.field8044 = arg1;
        arg1.field8044.field8042 = arg1;
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(B)Lvia;")
    public final class589 method2189(byte arg0) {
        field4838++;
        if (arg0 < 1) {
            this.field4837 = null;
        }
        class589 var2 = this.field4837.field8044;
        if (this.field4837 == var2) {
            this.field4843 = null;
            return null;
        } else {
            this.field4843 = var2.field8044;
            return var2;
        }
    }

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "(B)I")
    public final int method2190(byte arg0) {
        field4836++;
        int var2 = 0;
        if (arg0 != -91) {
            field4846 = null;
        }
        for (class589 var3 = this.field4837.field8044; var3 != this.field4837; var3 = var3.field8044) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)V")
    public static void method2191(int arg0) {
        field4846 = null;
        if (arg0 != -1) {
            method2185(-127, -63);
        }
        field4844 = null;
        field4840 = null;
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(I)Lvia;")
    public final class589 method2192(int arg0) {
        field4845++;
        class589 var2 = this.field4843;
        if (this.field4837 == var2) {
            this.field4843 = null;
            return null;
        }
        this.field4843 = var2.field8044;
        if (arg0 != 0) {
            this.method2189((byte) 24);
        }
        return var2;
    }

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "(B)Lvia;")
    public final class589 method2193(byte arg0) {
        field4841++;
        class589 var2 = this.field4837.field8044;
        if (this.field4837 == var2) {
            return null;
        }
        var2.method3310(30305);
        if (arg0 != 59) {
            field4840 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
    public final void method2194(boolean arg0) {
        while (true) {
            class589 var2 = this.field4837.field8044;
            if (this.field4837 == var2) {
                field4832++;
                this.field4843 = null;
                if (!arg0) {
                    this.method2184(63);
                    return;
                }
                return;
            }
            var2.method3310(30305);
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "()V")
    public class345() {
        this.field4837.field8042 = this.field4837;
        this.field4837.field8044 = this.field4837;
    }
}
