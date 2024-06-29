import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class414 {

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "Z")
    public static boolean field5679 = false;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field5684 = 0;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lhq;")
    public static class365 field5683 = new class365(64);

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field5686 = 0;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Ljk;")
    public static class117 field5680;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2555(int arg0) {
        class365 var1 = class187.field2165;
        synchronized (class187.field2165) {
            class187.field2165.method2298(0);
        }
        field5681++;
        class365 var2 = class383.field5247;
        synchronized (class383.field5247) {
            class383.field5247.method2298(arg0 ^ arg0);
        }
        class158 var3 = class450.field6285;
        synchronized (class450.field6285) {
            class450.field6285.method1008(arg0 + 7);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 20)
    public static void method2556(int arg0) {
        field5680 = null;
        field5683 = null;
        if (arg0 != 64) {
            method2557((class131) null, (byte) -28);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lbe;B)I", line = 40)
    public static final int method2557(class131 arg0, byte arg1) {
        field5682++;
        int var2 = arg0.field1490;
        class437 var3 = arg0.method1250(109);
        if (arg0.field2423) {
            var2 = arg0.field1470;
        } else if (arg0.field2394 == var3.field6005 || arg0.field2394 == var3.field5987 || arg0.field2394 == var3.field5983 || arg0.field2394 == var3.field6002) {
            var2 = arg0.field1495;
        } else if (arg0.field2394 == var3.field5997 || arg0.field2394 == var3.field5971 || arg0.field2394 == var3.field5966 || arg0.field2394 == var3.field5986) {
            var2 = arg0.field1492;
        }
        int var4 = 0 / ((arg1 - 15) / 53);
        return var2;
    }
}
