import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public abstract class class437 extends class678 {

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "Lbga;")
    public class329 field6309;

    @OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
    public int field6307;

    @OriginalMember(owner = "client!vaa", name = "v", descriptor = "I")
    public static int field6305 = 0;

    @OriginalMember(owner = "client!vaa", name = "y", descriptor = "I")
    public static int field6308 = 0;

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!vaa", name = "u", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!vaa", name = "w", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!vaa", name = "A", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLpl;)I")
    public static final int method2645(byte arg0, class604 arg1) {
        field6306++;
        if (arg1.field8675 == 0) {
            return 0;
        } else if (arg0 >= -89) {
            return -117;
        } else {
            if (arg1.field8770 != -1) {
                class604 var2 = null;
                if (arg1.field8770 < 32768) {
                    class436 var3 = (class436) class208.field3179.method2596((long) arg1.field8770, 94);
                    if (var3 != null) {
                        var2 = var3.field6298;
                    }
                } else if (arg1.field8770 >= 32768) {
                    var2 = class59.field1341[arg1.field8770 - 32768];
                }
                if (var2 != null) {
                    int var4 = arg1.field9806 - var2.field9806;
                    int var5 = arg1.field9815 - var2.field9815;
                    if (var4 != 0 || var5 != 0) {
                        arg1.method3452((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, false);
                    }
                }
            }
            if ((arg1 instanceof class602)) {
                class602 var9 = (class602) arg1;
                if (var9.field8652 != -1 && (var9.field8779 == 0 || var9.field8778 > 0)) {
                    var9.method3452(var9.field8652, false);
                    var9.field8652 = -1;
                }
            } else if (arg1 instanceof class22) {
                class22 var6 = (class22) arg1;
                if (var6.field866 != -1 && (var6.field8779 == 0 || var6.field8778 > 0)) {
                    int var7 = var6.field9806 - ((var6.field866 - class33.field967 - class33.field967) * 256);
                    int var8 = var6.field9815 - ((var6.field860 - class323.field4749 - class323.field4749) * 256);
                    if (var7 != 0 || var8 != 0) {
                        var6.method3452((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, false);
                    }
                    var6.field866 = -1;
                }
            }
            return arg1.method3453((byte) -123);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)B")
    public static final byte method2646(int arg0, int arg1, int arg2) {
        field6302++;
        if (arg1 == 9) {
            return (byte) ((arg0 & arg2) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V")
    public static final void method2647(int arg0, int arg1) {
        field6304++;
        if (class225.method1539(arg1, 4)) {
            class312.method2034(-1, true, class156.field2667[arg1]);
            if (arg0 != 1) {
                method2648((byte) -117, -32, -106);
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(BII)Z")
    public static final boolean method2648(byte arg0, int arg1, int arg2) {
        field6310++;
        if (arg0 != 41) {
            field6308 = 69;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method2649(int arg0);

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lbga;I)V")
    public class437(class329 arg0, int arg1) {
        this.field6309 = arg0;
        this.field6307 = arg1;
    }

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "(I)Z")
    public abstract boolean method2650(int arg0);
}
