import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class152 extends class425 {

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public int field2586 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public int field2592 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public int field2584 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public int field2588 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public int field2595 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "I")
    public int field2597 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
    public int field2596 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
    public int field2594 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Lqj;")
    public class473 field2585;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public static int field2593 = 1338;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method1190(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class478.method2906(arg3, (byte) 64, arg1, arg5, arg2, arg4, arg7, arg8, arg6, 0);
        field2591++;
        if (arg0 >= -117) {
            method1191(16);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public static final void method1191(int arg0) {
        field2589++;
        int var1 = class237.field3520;
        int[] var2 = class47.field1140;
        for (int var3 = arg0; var3 < var1; var3++) {
            class602 var9 = class59.field1341[var2[var3]];
            if (var9 != null && var9.field8709 > 0) {
                var9.field8709--;
                if (var9.field8709 == 0) {
                    var9.field8756 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class363.field5389; var4++) {
            long var5 = (long) class367.field5444[var4];
            class436 var7 = (class436) class208.field3179.method2596(var5, 86);
            if (var7 != null) {
                class22 var8 = var7.field6298;
                if (var8.field8709 > 0) {
                    var8.field8709--;
                    if (var8.field8709 == 0) {
                        var8.field8756 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)Z")
    public final boolean method1192(int arg0, int arg1, int arg2) {
        field2590++;
        if (this.field2596 <= arg1 && arg1 <= this.field2595 && arg2 >= this.field2586 && this.field2597 >= arg2) {
            return true;
        } else if (this.field2588 <= arg1 && arg1 <= this.field2592 && arg2 >= this.field2584 && this.field2594 >= arg2) {
            return true;
        } else if (arg0 == -1) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lqj;)V")
    public class152(class473 arg0) {
        this.field2585 = arg0;
    }
}
