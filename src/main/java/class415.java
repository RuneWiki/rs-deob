import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class415 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "Lwl;")
    public static class280 field5733 = new class280();

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field5732;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method2406(String arg0, boolean arg1, int arg2) {
        field5732++;
        if (arg1) {
            class253 var3 = class332.method1911(arg2, (byte) 60, 2);
            var3.method1522(0);
            var3.field3353 = arg0;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    public static void method2407(int arg0) {
        if (arg0 == -30631) {
            field5733 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IB)I")
    public static final int method2408(int arg0, byte arg1) {
        field5735++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        if (arg1 >= -58) {
            field5733 = null;
        }
        int var7 = var6 | var6 >>> 16;
        return arg0 & ~var7;
    }
}
