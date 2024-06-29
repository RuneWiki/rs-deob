import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class168 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "Lbk;")
    public class59 field2586 = new class59();

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field2596 = 0;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lpd;")
    public static class3 field2588;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lbk;")
    private class59 field2592;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I")
    public static final int method1144(int arg0, int arg1) {
        if (arg0 != 255) {
            method1150(-105L, (byte) -102);
        }
        field2590++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)Lbk;")
    public final class59 method1145(boolean arg0) {
        if (arg0) {
            return null;
        }
        field2593++;
        class59 var2 = this.field2586.field866;
        if (this.field2586 == var2) {
            return null;
        } else {
            var2.method378((byte) -122);
            return var2;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Lbk;")
    public final class59 method1146(int arg0) {
        field2587++;
        int var2 = -23 / ((arg0 - 35) / 48);
        class59 var3 = this.field2586.field866;
        if (this.field2586 == var3) {
            this.field2592 = null;
            return null;
        } else {
            this.field2592 = var3.field866;
            return var3;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public final void method1147(int arg0) {
        while (true) {
            class59 var2 = this.field2586.field866;
            if (this.field2586 == var2) {
                field2595++;
                if (arg0 <= 105) {
                    return;
                }
                this.field2592 = null;
                return;
            }
            var2.method378((byte) -110);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Lbk;")
    public final class59 method1148(byte arg0) {
        if (arg0 != 113) {
            this.method1145(false);
        }
        field2585++;
        class59 var2 = this.field2592;
        if (this.field2586 == var2) {
            this.field2592 = null;
            return null;
        } else {
            this.field2592 = var2.field866;
            return var2;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILbk;)V")
    public final void method1149(int arg0, class59 arg1) {
        if (arg0 != 4336) {
            return;
        }
        if (arg1.field868 != null) {
            arg1.method378((byte) -106);
        }
        arg1.field866 = this.field2586;
        arg1.field868 = this.field2586.field868;
        arg1.field868.field866 = arg1;
        arg1.field866.field868 = arg1;
        field2597++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JB)V")
    public static final void method1150(long arg0, byte arg1) {
        class150.field2218.field2676 = 0;
        field2594++;
        class150.field2218.method1183(21, 984049208);
        class150.field2218.method1160(-25643, arg0);
        class299.field4764 = 1;
        class118.field1706 = 0;
        class130.field1863 = -3;
        if (arg1 > -35) {
            method1151((byte) 79);
        }
        class263.field4267 = 0;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class168() {
        this.field2586.field868 = this.field2586;
        this.field2586.field866 = this.field2586;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static void method1151(byte arg0) {
        field2588 = null;
        if (arg0 < 7) {
            method1144(53, 109);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)I")
    public final int method1152(boolean arg0) {
        field2591++;
        if (!arg0) {
            return 121;
        }
        int var2 = 0;
        for (class59 var3 = this.field2586.field866; var3 != this.field2586; var3 = var3.field866) {
            var2++;
        }
        return var2;
    }
}
