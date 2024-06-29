import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class630 {

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "Lqj;")
    private class535 field8525 = new class535(256);

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "Luq;")
    private class172 field8529;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field8530;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "Low;")
    public static class366 field8527;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 4)
    public static void method3475(int arg0) {
        if (arg0 != 1) {
            field8527 = null;
        }
        field8527 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)Lhu;", line = 15)
    public final class142 method3476(int arg0, int arg1) {
        field8530++;
        if (arg1 != -7513) {
            method3475(-46);
        }
        class535 var3 = this.field8525;
        class142 var4;
        synchronized (this.field8525) {
            var4 = (class142) this.field8525.method3109((byte) 120, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class172 var5 = this.field8529;
        byte[] var6;
        synchronized (this.field8529) {
            var6 = this.field8529.method1188(26, arg1 - 10534, arg0);
        }
        class142 var7 = new class142();
        if (var6 != null) {
            var7.method993(new class254(var6), (byte) -73);
        }
        class535 var8 = this.field8525;
        synchronized (this.field8525) {
            this.field8525.method3108((long) arg0, arg1 + 23850, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(II)V", line = 45)
    public final void method3477(int arg0, int arg1) {
        field8528++;
        class535 var3 = this.field8525;
        synchronized (this.field8525) {
            if (arg1 == 256) {
                this.field8525.method3101(false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V", line = 58)
    public static final void method3478(int arg0) {
        class514.field7151 = -1;
        if (arg0 == -19580) {
            class103.field1472 = null;
            field8522++;
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V", line = 71)
    public final void method3479(int arg0) {
        class535 var2 = this.field8525;
        synchronized (this.field8525) {
            this.field8525.method3103(-11294);
            if (arg0 != 26) {
                this.method3477(101, -126);
            }
        }
        field8523++;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V", line = 86)
    public static final void method3480(boolean arg0) {
        class125.field1721.method2255(true, 1, class125.field1721.field5170);
        field8526++;
        class125.field1721.method2255(true, 1, class125.field1721.field5155);
        class125.field1721.method2255(true, 2, class125.field1721.field5168);
        class125.field1721.method2255(true, 2, class125.field1721.field5172);
        class125.field1721.method2255(true, 1, class125.field1721.field5166);
        class125.field1721.method2255(true, 1, class125.field1721.field5147);
        class125.field1721.method2255(!arg0, 1, class125.field1721.field5163);
        class125.field1721.method2255(true, 1, class125.field1721.field5153);
        class125.field1721.method2255(true, 1, class125.field1721.field5134);
        class125.field1721.method2255(true, 1, class125.field1721.field5167);
        class125.field1721.method2255(true, 2, class125.field1721.field5156);
        class125.field1721.method2255(true, 1, class125.field1721.field5160);
        class125.field1721.method2255(true, 2, class125.field1721.field5188);
        class125.field1721.method2255(true, 1, class125.field1721.field5171);
        class125.field1721.method2255(!arg0, 0, class125.field1721.field5174);
        class125.field1721.method2255(true, 0, class125.field1721.field5184);
        class125.field1721.method2255(true, 2, class125.field1721.field5175);
        class125.field1721.method2255(!arg0, 0, class125.field1721.field5144);
        class125.field1721.method2255(true, 0, class125.field1721.field5164);
        if (arg0) {
            field8527 = null;
        }
        class87.method698((byte) -61);
        class125.field1721.method2255(!arg0, 0, class125.field1721.field5182);
        class125.field1721.method2255(true, 4, class125.field1721.field5137);
        class380.method2369((byte) 22);
        class697.method3787(-86);
        class130.field1794 = true;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V", line = 126)
    public final void method3481(byte arg0) {
        if (arg0 < 28) {
            return;
        }
        class535 var2 = this.field8525;
        synchronized (this.field8525) {
            this.field8525.method3113(-127);
        }
        field8524++;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lkw;ILuq;)V", line = 146)
    public class630(class263 arg0, int arg1, class172 arg2) {
        this.field8529 = arg2;
        this.field8529.method1175(26, (byte) 92);
    }
}
