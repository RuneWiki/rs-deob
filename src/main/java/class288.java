import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class288 extends class264 {

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "F")
    public static float field4223;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "F")
    public static float field4227;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public int field4215;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public int field4219;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
    public int field4226;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Lct;")
    public static class104 field4221;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "Lkg;")
    public class223 field4217;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "Lkg;")
    public class223 field4224;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "Ljava/lang/String;")
    public String field4216;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "Z")
    public boolean field4213;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field4218;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)Lmj;", line = 5)
    public static final class177 method1929(byte arg0, int arg1) {
        field4225++;
        if (arg0 != 14) {
            method1931(32, (byte) 116);
        }
        return class296.field4310 && class377.field5524 <= arg1 && arg1 <= class323.field4776 ? class388.field5675[arg1 - class377.field5524] : null;
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V", line = 33)
    public static void method1930(int arg0) {
        if (arg0 != -13890) {
            method1931(24, (byte) 99);
        }
        field4221 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IB)V", line = 48)
    public static final void method1931(int arg0, byte arg1) {
        class363 var2 = class283.field4166;
        synchronized (class283.field4166) {
            class283.field4166.method2300(arg0, true);
        }
        field4214++;
        class363 var3 = class272.field4022;
        synchronized (class272.field4022) {
            if (arg1 == 15) {
                class272.field4022.method2300(arg0, true);
            }
        }
    }
}
