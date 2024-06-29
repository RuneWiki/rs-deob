import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class251 {

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public int field3328 = 0;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field3331 = 1406;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILmd;)V", line = 3)
    public final void method1511(int arg0, class379 arg1) {
        field3327++;
        while (true) {
            int var3 = arg1.method2238(255);
            if (var3 == 0) {
                int var4 = 35 / ((arg0 + 1) / 42);
                return;
            }
            this.method1513(arg1, -122, var3);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lit;B)V", line = 24)
    public static final void method1512(class455 arg0, byte arg1) {
        field3330++;
        if (arg0 instanceof class117) {
            class117 var2 = (class117) arg0;
            if (var2.field1661 != null) {
                class152.method1043((byte) -117, var2, class385.field5232.field573 != var2.field573);
            }
        } else if (arg0 instanceof class515) {
            class515 var3 = (class515) arg0;
            class322.method1859(class385.field5232.field573 != var3.field573, 8032, var3);
        }
        if (arg1 != -58) {
            method1512(null, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lmd;II)V", line = 60)
    private final void method1513(class379 arg0, int arg1, int arg2) {
        field3329++;
        if (arg2 == 5) {
            this.field3328 = arg0.method2212((byte) 83);
        }
        if (arg1 > -22) {
            method1512(null, (byte) -102);
        }
    }
}
