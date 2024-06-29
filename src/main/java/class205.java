import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class205 extends class4 {

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field3284 = -1;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field3283 = 0;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field3291 = 0;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field3287 = 0;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!se", name = "G", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!se", name = "J", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "J")
    public static long field3282;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Lqj;")
    public static class147 field3294;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method1413(byte arg0) {
        field3292++;
        class68.field1113.method534((byte) -126, 113);
        class68.field1113.method1548(-494964184, class259.method1764(0));
        class68.field1113.method1554(class84.field1326, (byte) 89);
        class288.field4557++;
        if (arg0 != -105) {
            method1414(58);
        }
        class68.field1113.method1554(class279.field4423, (byte) 89);
        class68.field1113.method1548(arg0 ^ 0x1D808DBF, class64.field1073);
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
    public static void method1414(int arg0) {
        if (arg0 != 25388) {
            field3283 = 28;
        }
        field3294 = null;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(Z)Z")
    public abstract boolean method1415(boolean arg0);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1416(byte arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)V")
    public static final void method1417(boolean arg0, int arg1) {
        if (arg1 != -10681) {
            field3294 = null;
        }
        field3281++;
        class10.field151 = arg0;
        class233.field3812 = !class257.method1757(-5);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IZ)Lbg;")
    public static final class236 method1418(int arg0, boolean arg1) {
        class236 var2 = (class236) class66.field1086.method480((long) arg0, 80);
        field3289++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class178.field2800.method1357(arg0, 1, -1);
        class236 var4 = new class236();
        if (var3 != null) {
            var4.method1640(new class221(var3), arg0, (byte) -124);
        }
        if (!arg1) {
            field3294 = null;
        }
        class66.field1086.method474((long) arg0, (byte) 75, var4);
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public static final void method1419(byte arg0) {
        if (arg0 != 99) {
            field3291 = -106;
        }
        field3290++;
        class39.field742.method472((byte) -63);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public static final void method1420(int arg0, int arg1, int arg2) {
        field3285++;
        class259 var3 = class213.method1464((byte) -100, arg0, 7);
        var3.method1766(0);
        var3.field4128 = arg1;
        if (arg2 != -520) {
            method1420(98, 120, 8);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(IZ)Z")
    public static final boolean method1421(int arg0, boolean arg1) {
        class14.field250 = arg1;
        field3293++;
        class113.field1876 = arg0 + 1 & 0xFFFF;
        return true;
    }
}
