import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class124 {

    @OriginalMember(owner = "client!oq", name = "i", descriptor = "Ldq;")
    private class90 field1642 = new class90(256);

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "Ldq;")
    private class90 field1648 = new class90(256);

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "Lct;")
    private class104 field1636;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "Lct;")
    private class104 field1644;

    @OriginalMember(owner = "client!oq", name = "j", descriptor = "Lbn;")
    public static class160 field1643 = new class160(2, 6);

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Lbt;")
    public static class363 field1645 = new class363(64);

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "Lvq;")
    public static class24 field1647 = new class24(97, 6);

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "Lvq;")
    public static class24 field1649 = new class24(11, -2);

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "[I")
    public static int[] field1651 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "Lbn;")
    public static class160 field1650 = new class160(6, 4);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "[[I")
    public static int[][] field1652;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II[I)Lua;", line = 5)
    public final class179 method834(int arg0, int arg1, int[] arg2) {
        if (arg1 != 0) {
            this.field1644 = null;
        }
        field1639++;
        if (this.field1644.method712(false) == 1) {
            return this.method838(-653255412, 0, arg2, arg0);
        } else if (this.field1644.method734(83, arg0) == 1) {
            return this.method838(arg1 - 653255412, arg0, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIB)I", line = 27)
    public static final int method835(int arg0, int arg1, byte arg2) {
        field1635++;
        if (arg1 == 4 || arg1 == 5) {
            return class282.field4149[arg0 & 0x3];
        } else {
            if (arg2 != 97) {
                field1643 = null;
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V", line = 45)
    public static void method836(boolean arg0) {
        field1645 = null;
        field1651 = null;
        field1643 = null;
        field1649 = null;
        if (arg0) {
            method836(false);
        }
        field1647 = null;
        field1650 = null;
        field1652 = null;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "([IIII)Lua;", line = 65)
    private final class179 method837(int[] arg0, int arg1, int arg2, int arg3) {
        field1638++;
        int var5 = arg2 ^ (arg3 >>> 12 | (arg3 & 0x10000FFF) << 4);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class179 var9 = (class179) this.field1648.method609(var7, arg1 + 653255488);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class360 var10 = class360.method2290(this.field1636, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            if (arg1 != -653255412) {
                this.field1636 = null;
            }
            class179 var11 = var10.method2288();
            this.field1648.method606(1, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field2542.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II[II)Lua;", line = 104)
    private final class179 method838(int arg0, int arg1, int[] arg2, int arg3) {
        field1634++;
        int var5 = arg3 ^ ((arg1 & 0x80000FFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class179 var9 = (class179) this.field1648.method609(var7, 44);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            if (arg0 != -653255412) {
                method836(true);
            }
            class194 var10 = (class194) this.field1642.method609(var7, 73);
            if (var10 == null) {
                var10 = class194.method1345(this.field1644, arg1, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field1642.method606(arg0 ^ 0xD9101D0D, var10, var7);
            }
            class179 var11 = var10.method1344(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method1820(-25246);
                this.field1648.method606(arg0 ^ 0xD9101D0D, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I[IB)Lua;", line = 151)
    public final class179 method839(int arg0, int[] arg1, byte arg2) {
        field1640++;
        if (this.field1636.method712(false) == 1) {
            return this.method837(arg1, -653255412, arg0, 0);
        } else if (this.field1636.method734(67, arg0) == 1) {
            return this.method837(arg1, -653255412, 0, arg0);
        } else {
            int var4 = -31 / ((arg2 - 76) / 48);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V", line = 171)
    public static final void method840(int arg0, int arg1, int arg2) {
        field1637++;
        class199 var3 = class271.field4017[arg2][arg1];
        if (var3 != null) {
            class437.field6377 = var3.field2802;
            class31.field436 = var3.field2813;
            class359.field5215 = var3.field2816;
        }
        if (arg0 != -28493) {
            method836(true);
        }
        class152.method1040(0);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lco;", line = 201)
    public static final class200 method841(Throwable arg0, String arg1) {
        field1641++;
        class200 var2;
        if (arg0 instanceof class200) {
            var2 = (class200) arg0;
            var2.field2826 = var2.field2826 + ' ' + arg1;
        } else {
            var2 = new class200(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lct;Lct;)V", line = 237)
    public class124(class104 arg0, class104 arg1) {
        this.field1636 = arg0;
        this.field1644 = arg1;
    }
}
