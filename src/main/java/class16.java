import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class16 {

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "Lrc;")
    public static class29 field259 = new class29();

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "Lrga;")
    public static class280 field264 = new class280(51, 4);

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "client!tda", name = "j", descriptor = "[I")
    public static int[] field267 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "Lwp;")
    public static class453 field265 = new class453(15, -2);

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!tda", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field261++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)I", line = 13)
    public static final int method111(int arg0) {
        field258++;
        if (arg0 != 783) {
            field266 = -104;
        }
        return class407.field5098.method667((byte) -39);
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)V", line = 27)
    public static void method112(boolean arg0) {
        if (arg0) {
            method111(-100);
        }
        field267 = null;
        field265 = null;
        field259 = null;
        field264 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Les;I)Ltm;", line = 50)
    public static final class529 method113(class630 arg0, int arg1) {
        field260++;
        class130 var2 = class413.method2200(55, arg0);
        int var3 = arg0.method3470(13111);
        int var4 = arg0.method3470(13111);
        int var5 = arg0.method3470(13111);
        int var6 = arg0.method3470(13111);
        int var7 = arg0.method3470(13111);
        if (arg1 < 22) {
            return null;
        } else {
            int var8 = arg0.method3470(13111);
            return new class529(var2.field1625, var2.field1622, var2.field1623, var2.field1616, var2.field1621, var2.field1617, var2.field1619, var2.field1614, var2.field1618, var3, var4, var5, var6, var7, var8);
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(I)V", line = 78)
    public class16(int arg0) {
        this.field262 = arg0;
    }
}
