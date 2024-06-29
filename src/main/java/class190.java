import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class190 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public int field3035 = -1;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Lve;")
    public static class255 field3036 = class87.method607(104, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "[I")
    public static int[] field3049 = new int[5];

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Z")
    public static boolean field3048 = true;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field3044;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public int field3045;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field3046;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "[I")
    public static int[] field3043;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBI)V", line = 20)
    public static final void method1309(int arg0, byte arg1, int arg2) {
        field3041++;
        if (arg1 != -99) {
            field3037 = -55;
        }
        class76.field1246[arg2] = arg0;
        class15 var3 = (class15) class252.field4244.method280((long) arg2, 29153);
        if (var3 == null) {
            class15 var4 = new class15(class218.method1541(-50) + 500L);
            class252.field4244.method284(true, (long) arg2, var4);
        } else {
            var3.field223 = class218.method1541(-72) + 500L;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZZII)V", line = 57)
    public static final void method1310(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field3042++;
        class309.method2144(99, arg0, arg3, arg2, class242.field4047.length - 1, arg1, arg4);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 66)
    public static void method1311(byte arg0) {
        int var1 = -57 / ((arg0 - 34) / 50);
        field3049 = null;
        field3043 = null;
        field3036 = null;
    }
}
