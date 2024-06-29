import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class136 implements class121 {

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "[I")
    public static int[] field2388 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "Llc;")
    public static class143 field2386 = class66.method374("(Z", -1);

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field2393 = 0;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "Llc;")
    private static class143 field2390 = class66.method374("Ok", -1);

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[Z")
    public static boolean[] field2384 = new boolean[100];

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "[Z")
    public static boolean[] field2391 = new boolean[100];

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "Llc;")
    public static class143 field2389 = class66.method374("rouge:", -1);

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "Llc;")
    public static class143 field2396 = field2390;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "[Ldh;")
    public static class146[] field2395 = new class146[28];

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "Llc;")
    public static class143 field2387 = class66.method374("Impossible de trouver ", -1);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "[Llc;")
    public static class143[] field2382 = new class143[500];

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Llc;")
    private static class143 field2399 = class66.method374("Loaded config", -1);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Llc;")
    public static class143 field2383 = field2399;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIJ[I)Llc;")
    public final class143 method737(int arg0, int arg1, long arg2, int[] arg3) {
        field2394++;
        if (arg0 == 0) {
            class9 var6 = class195.method1342(arg3[0], false);
            return var6.method75((int) arg2, (byte) 12);
        } else if (arg0 == 1 || arg0 == 10) {
            class148 var8 = class262.method1743((int) arg2, 17366);
            return var8.field2681;
        } else if (arg0 == 6 || arg0 == 7 || arg0 == 11) {
            return class195.method1342(arg3[0], false).method75((int) arg2, (byte) 12);
        } else {
            int var7 = -118 / ((arg1 + 44) / 49);
            return null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZZ)V")
    public static final void method816(boolean arg0, boolean arg1) {
        class238.method1599(class7.field138, class10.field222, -127, class269.field4820, arg1);
        field2398++;
        if (!arg0) {
            field2392 = -69;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
    public static void method817(byte arg0) {
        field2395 = null;
        field2388 = null;
        field2383 = null;
        if (arg0 >= -88) {
            return;
        }
        field2387 = null;
        field2391 = null;
        field2390 = null;
        field2389 = null;
        field2386 = null;
        field2382 = null;
        field2399 = null;
        field2396 = null;
        field2384 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Z")
    public static final boolean method818(int arg0, int arg1) {
        field2385++;
        int var2 = 28 % ((arg1 + 34) / 48);
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static final void method819(boolean arg0) {
        class67.field1280.method824(-122);
        field2397++;
        if (!arg0) {
            method818(-42, 111);
        }
    }
}
