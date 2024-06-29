import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class304 {

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field4159 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public int field4160;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lsi;BI)V")
    private final void method1769(class391 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field4155 = arg0.method2353((byte) 73);
            this.field4161 = arg0.method2348(-2);
            this.field4160 = arg0.method2348(-2);
        }
        if (arg1 != 125) {
            this.method1771(null, 71);
        }
        field4158++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)Lqm;")
    public static final class97 method1770(byte arg0) {
        if (arg0 < 69) {
            method1770((byte) 110);
        }
        field4156++;
        class97 var1 = (class97) class518.field7648.method2130(false);
        if (var1 != null) {
            var1.method1565(0);
            var1.method36(0);
            return var1;
        }
        class97 var2;
        do {
            var2 = (class97) class445.field6560.method2130(false);
            if (var2 == null) {
                return null;
            }
            if (var2.method715(71) > class246.method1483(5957)) {
                return null;
            }
            var2.method1565(0);
            var2.method36(0);
        } while ((var2.field115 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lsi;I)V")
    public final void method1771(class391 arg0, int arg1) {
        field4157++;
        while (true) {
            int var3 = arg0.method2348(arg1 ^ 0xFFFF8147);
            if (var3 == 0) {
                if (arg1 == 32441) {
                    return;
                } else {
                    this.field4155 = 112;
                    return;
                }
            }
            this.method1769(arg0, (byte) 125, var3);
        }
    }
}
