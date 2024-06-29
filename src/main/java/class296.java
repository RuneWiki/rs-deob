import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class296 extends class539 {

    @OriginalMember(owner = "client!saa", name = "r", descriptor = "Luc;")
    public static class27 field4422 = new class27(35, 7);

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "I")
    public int field4417;

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!saa", name = "o", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!saa", name = "q", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!saa", name = "s", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!saa", name = "t", descriptor = "I")
    public int field4424;

    @OriginalMember(owner = "client!saa", name = "u", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!saa", name = "v", descriptor = "I")
    public int field4426;

    @OriginalMember(owner = "client!saa", name = "w", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!saa", name = "x", descriptor = "I")
    public int field4428;

    @OriginalMember(owner = "client!saa", name = "y", descriptor = "I")
    public int field4429;

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "I")
    public int field4430;

    @OriginalMember(owner = "client!saa", name = "A", descriptor = "I")
    public int field4431;

    @OriginalMember(owner = "client!saa", name = "B", descriptor = "I")
    public int field4432;

    @OriginalMember(owner = "client!saa", name = "C", descriptor = "I")
    public int field4433;

    @OriginalMember(owner = "client!saa", name = "D", descriptor = "I")
    public int field4434;

    @OriginalMember(owner = "client!saa", name = "E", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!saa", name = "G", descriptor = "I")
    public int field4436;

    // $FF: synthetic field
    @OriginalMember(owner = "client!saa", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field4437;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(II)Z")
    public static final boolean method1847(int arg0, int arg1) {
        field4420++;
        if (arg0 > -94) {
            field4422 = null;
        }
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(BLoa;)V")
    public static final void method1848(byte arg0, class638 arg1) {
        class45.field669 = new class158[class377.field5333.length];
        field4419++;
        int var2 = 0;
        if (arg0 < 14) {
            return;
        }
        while (var2 < class377.field5333.length) {
            int var3 = class377.field5333[var2];
            class599 var4 = class43.method241(true, class164.field2497, var3);
            class194 var5 = arg1.method405(var4, class543.method2983(class32.field384, var3), true);
            class45.field669[var2] = new class158(var5, var4);
            var2++;
        }
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(II)V")
    public static final void method1849(int arg0, int arg1) {
        field4435++;
        if (arg0 == 0) {
            class679 var2 = class669.method3708(11, arg1, 1403048928);
            var2.method3749(-38);
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IILoa;)Lba;")
    public final class352 method1850(int arg0, int arg1, class638 arg2) {
        field4421++;
        int var4 = class469.field6565[this.field4424];
        class352 var5 = null;
        if (~var4 == arg1) {
            class86 var6 = class171.method1170(this.field4432, this.field4433, this.field4423);
            if (var6 instanceof class563) {
                class563 var7 = (class563) var6;
                if (var7.field7606 != null) {
                    var5 = ((class147) var7.field7606).method548(arg1 - 584, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            class404 var8 = class493.method2759(this.field4432, this.field4433, this.field4423);
            if (var8 instanceof class411) {
                class411 var9 = (class411) var8;
                if (var9.field5817 != null) {
                    var5 = ((class147) var9.field5817).method548(-585, arg0, arg2);
                }
            }
        } else if (var4 == 2) {
            class39 var12 = class410.method2344(this.field4432, this.field4433, this.field4423, field4437 == null ? (field4437 = method1852("uq")) : field4437);
            if (var12 instanceof class68) {
                class68 var13 = (class68) var12;
                if (var13.field937 != null) {
                    var5 = ((class147) var13.field937).method548(arg1 - 584, arg0, arg2);
                }
            }
        } else if (var4 == 3) {
            class348 var10 = class237.method1497(this.field4432, this.field4433, this.field4423);
            if (var10 instanceof class72) {
                class72 var11 = (class72) var10;
                if (var11.field996 != null) {
                    var5 = ((class147) var11.field996).method548(-585, arg0, arg2);
                }
            }
        }
        return var5 == null ? null : var5.method235((byte) 0, arg0, true);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
    public static void method1851(byte arg0) {
        field4422 = null;
        if (arg0 != -101) {
            field4422 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1852(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
