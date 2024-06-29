import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 extends class134 {

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Llga;")
    public static class712 field105 = new class712(21, -1);

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BB)C")
    public static final char method54(byte arg0, byte arg1) {
        ++field104;
        int var2 = 255 & arg0;
        if (~var2 == -1) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && ~var2 > -161) {
                char var3 = class488.field6684[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            return arg1 < 118 ? '\u0013' : (char) var2;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        ++field96;
        int var3 = -83 / ((arg0 - -26) / 41);
        super.field1708 = arg1;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V")
    public static void method56(int arg0) {
        field105 = null;
        if (arg0 != 16) {
            field105 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(II)I")
    public final int method57(int arg0, int arg1) {
        if (arg1 != 29053) {
            field105 = null;
        }
        ++field101;
        if (super.field1712.method2282((byte) 127)) {
            return 3;
        } else {
            return super.field1712.field5521.method3358((byte) 123) == 0 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lkda;)V")
    public class14(class391 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(ILkda;)V")
    public class14(int arg0, class391 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)I")
    public final int method58(int arg0) {
        ++field95;
        if (arg0 != 0) {
            method56(36);
        }
        return 2;
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
    public static final void method59(int arg0) {
        if (arg0 != 16543) {
            method59(-104);
        }
        ++field99;
        for (class585 var1 = (class585) class604.field8417.method2560(123); var1 != null; var1 = (class585) class604.field8417.method2557(arg0 + -16544)) {
            if (!var1.field8189.method3697(true)) {
                var1.field8189.method595((byte) 44);
                try {
                    var1.field8189.method3699(false);
                } catch (Exception var5) {
                    class760.method4223(var5, -121, "TV: " + var1.field8192);
                    class103.method708((byte) 67, var1.field8192);
                }
                if (!var1.field8187 && !var1.field8185) {
                    class482 var3 = var1.field8189.method3695((byte) -79);
                    if (var3 != null) {
                        class333 var4 = var3.method2707((byte) 92);
                        if (var4 != null) {
                            var4.method1990(arg0 + 255170282, var1.field8183);
                            class143.field1851.method2539(var4);
                            var1.field8187 = true;
                        }
                    }
                }
            } else {
                class103.method708((byte) 67, var1.field8192);
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public final void method60(byte arg0) {
        if (arg0 < 118) {
            this.method61((byte) 45);
        }
        if (super.field1712.method2282((byte) 119)) {
            super.field1708 = 0;
        }
        ++field102;
        if (~super.field1712.field5521.method3358((byte) 120) == -1) {
            super.field1708 = 0;
        }
        if (super.field1708 < 0 || super.field1708 > 2) {
            super.field1708 = this.method58(0);
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)I")
    public final int method61(byte arg0) {
        if (arg0 < 119) {
            field105 = null;
        }
        ++field103;
        return super.field1708;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lha;I)V")
    public static final void method62(class60 arg0, int arg1) {
        for (class550 var2 = (class550) class146.field1891.method113((byte) 15); var2 != null; var2 = (class550) class146.field1891.method119(false)) {
            if (var2.field7792) {
                var2.method3118(arg0);
            }
        }
        if (arg1 < 15) {
            method56(15);
        }
        ++field98;
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)Z")
    public final boolean method63(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field97;
            if (super.field1712.method2282((byte) 106)) {
                return false;
            } else {
                return super.field1712.field5521.method3358((byte) 120) != 0;
            }
        }
    }
}
