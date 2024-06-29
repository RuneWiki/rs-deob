import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class59 extends class35 {

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Z")
    public static boolean field946 = true;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "F")
    public float field941;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Ldp;")
    public static class174 field940;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V", line = 7)
    public static final void method454(int arg0, int arg1) {
        field950++;
        class18 var2 = class46.field747;
        synchronized (class46.field747) {
            class46.field747.method104(arg1, (byte) -34);
        }
        class18 var3 = class234.field3391;
        synchronized (class234.field3391) {
            class234.field3391.method104(arg1, (byte) -34);
        }
        class18 var4 = class61.field984;
        synchronized (class61.field984) {
            class61.field984.method104(arg1, (byte) -34);
        }
        class18 var5 = class75.field1286;
        synchronized (class75.field1286) {
            if (arg0 == -2) {
                class75.field1286.method104(arg1, (byte) -34);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 40)
    public static void method455(boolean arg0) {
        field940 = null;
        if (!arg0) {
            method457((byte) -81);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V", line = 51)
    public static final void method456(boolean arg0) {
        field949++;
        class90.field1436 = class269.field4041.field2740 + class269.field4041.field2734 + 2;
        class106.field1749 = class150.field2295.field2734 + class150.field2295.field2740 + 2;
        if (!arg0) {
            class137.field2192 = new String[350 / class90.field1436];
            for (int var1 = 0; var1 < class137.field2192.length; var1++) {
                class137.field2192[var1] = "";
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V", line = 71)
    public static final void method457(byte arg0) {
        field947++;
        class18 var1 = class58.field923;
        synchronized (class58.field923) {
            class58.field923.method106((byte) -104);
        }
        int var2 = 77 % ((arg0 - 89) / 34);
    }
}
