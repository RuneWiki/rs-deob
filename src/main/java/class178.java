import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class178 extends class238 {

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "Ldk;")
    public static class326 field2550 = new class326("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "I")
    public static int field2554 = 0;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "F")
    public float field2555;

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "I")
    public int field2552;

    @OriginalMember(owner = "client!eo", name = "w", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!eo", name = "x", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "Lkj;")
    public static class366 field2553;

    @OriginalMember(owner = "client!eo", name = "v", descriptor = "[Lpl;")
    public static class426[] field2556;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)V")
    public static final void method1086(byte arg0, int arg1) {
        if (arg0 != 69) {
            method1089(false, 89);
        }
        for (class238 var2 = class34.field443.method2769((byte) 87); var2 != null; var2 = class34.field443.method2768((byte) -88)) {
            if ((var2.field3568 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method1510((byte) -13);
            }
        }
        field2551++;
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V")
    public static void method1087(byte arg0) {
        field2550 = null;
        field2553 = null;
        field2556 = null;
        if (arg0 <= 23) {
            method1089(true, 18);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIB)V")
    public static final void method1088(int arg0, int arg1, byte arg2) {
        if (arg2 < 60) {
            method1086((byte) -98, 69);
        }
        class377.field5427 = arg1 - class395.field5638;
        field2549++;
        class230.field3474 = arg0 - class395.field5623;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)V")
    public static final void method1089(boolean arg0, int arg1) {
        class230.field3474 = -1;
        if (arg0) {
            method1086((byte) -108, 73);
        }
        class220.field3280 = arg1;
        field2548++;
        class230.field3474 = -1;
        class81.method459((byte) 71);
    }
}
