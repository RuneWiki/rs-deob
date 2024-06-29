import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class454 extends class24 {

    @OriginalMember(owner = "client!li", name = "C", descriptor = "J")
    private long field6310 = -1L;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Ljava/lang/String;")
    private String field6304 = null;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "[I")
    public static int[] field6305 = new int[6];

    @OriginalMember(owner = "client!li", name = "E", descriptor = "Ljw;")
    public static class581 field6312 = new class581(47, 3);

    @OriginalMember(owner = "client!li", name = "G", descriptor = "[I")
    public static int[] field6314 = new int[13];

    @OriginalMember(owner = "client!li", name = "z", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!li", name = "F", descriptor = "Lgw;")
    public static class182 field6313;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "Loba;")
    public static class275 field6306;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lke;I)V")
    public final void method190(class625 arg0, int arg1) {
        if (arg1 == 5) {
            arg0.method3442(this.field6304, arg1 ^ 0xFFFFFF91, this.field6310);
            field6307++;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjp;)V")
    public final void method191(int arg0, class376 arg1) {
        if (arg1.method2398(-1372747256) != 255) {
            arg1.field5459--;
            this.field6310 = arg1.method2366(true);
        }
        if (arg0 >= -56) {
            field6312 = null;
        }
        field6308++;
        this.field6304 = arg1.method2383((byte) 110);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILaj;I)Lvr;")
    public static final class147 method2694(int arg0, class333 arg1, int arg2) {
        if (arg0 != 47) {
            field6306 = null;
        }
        field6309++;
        class147 var3 = (class147) class452.field6286.method1541(arg0 - 57, (long) arg2);
        if (var3 == null) {
            if (class653.field9061) {
                var3 = class379.field5542.method477(class508.method2947(arg1, arg2), true);
            } else {
                var3 = class620.method3407(0, arg1.method2114(arg2, false));
            }
            class452.field6286.method1544(true, var3, (long) arg2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method2695(int arg0) {
        if (arg0 >= -49) {
            method2695(-109);
        }
        field6305 = null;
        field6314 = null;
        field6312 = null;
        field6306 = null;
        field6313 = null;
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(B)V")
    public static final void method2696(byte arg0) {
        field6311++;
        class455 var1 = null;
        try {
            var1 = class70.method618(0, "2");
            class376 var2 = new class376(class637.field8869 * 6 + 3);
            var2.method2380(65280, 1);
            var2.method2415(false, class637.field8869);
            for (int var3 = 0; var3 < class700.field9825.length; var3++) {
                if (class197.field2639[var3]) {
                    var2.method2415(false, var3);
                    var2.method2354(class700.field9825[var3], (byte) 83);
                }
            }
            var1.method2700(0, var2.field5518, 1, var2.field5459);
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2702(-1);
            }
        } catch (Exception var4) {
        }
        class790.field10868 = class302.method1910(0);
        if (arg0 != 9) {
            method2695(-19);
        }
        class79.field1138 = false;
    }
}
