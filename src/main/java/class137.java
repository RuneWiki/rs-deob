import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class137 {

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "[I")
    public static int[] field2282 = new int[200];

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2285 = 0;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "[[B")
    public static byte[][] field2283;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "[[[B")
    public static byte[][][] field2288;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILoh;)V", line = 7)
    public static final void method1008(int arg0, class15 arg1) {
        field2286++;
        if (arg0 != -1) {
            field2285 = -90;
        }
        class264.field4551 = arg1;
        class261.field4341 = class264.field4551.method95(arg0 + 65, 16);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lan;", line = 23)
    public static final class315 method1009(int arg0) {
        class315 var1 = new class315(class177.field3006, class242.field4027, class226.field3776[0], class23.field424[0], class238.field3967[0], class150.field2562[0], class17.field353[0], class94.field1514);
        class301.method2122((byte) 0);
        if (arg0 >= -32) {
            field2283 = (byte[][]) ((byte[][]) null);
        }
        field2280++;
        return var1;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 40)
    public static void method1010(int arg0) {
        field2283 = (byte[][]) null;
        field2288 = (byte[][][]) null;
        field2282 = null;
        if (arg0 != 0) {
            method1008(-18, (class15) null);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZB)V", line = 60)
    public static final void method1011(boolean arg0, byte arg1) {
        int var2 = -20 % ((29 - arg1) / 33);
        field2287++;
        class70.field1147 = arg0;
        class303.field5201 = !class322.method2236(-7750);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 73)
    public static final void method1012(boolean arg0) {
        field2284++;
        if (arg0) {
            method1009(57);
        }
        if (class133.field2231 < class28.field491) {
            class133.field2231 = (float) ((double) class133.field2231 / 30.0D + (double) class133.field2231);
            if (class28.field491 < class133.field2231) {
                class133.field2231 = class28.field491;
            }
            class95.method649((byte) -126);
        } else if (class28.field491 < class133.field2231) {
            class133.field2231 = (float) ((double) class133.field2231 - (double) class133.field2231 / 30.0D);
            if (class133.field2231 < class28.field491) {
                class133.field2231 = class28.field491;
            }
            class95.method649((byte) -126);
        }
        if (class306.field5228 == -1 || class138.field2299 == -1) {
            return;
        }
        int var1 = class138.field2299 - class236.field3937;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class236.field3937 += var1;
        int var2 = class306.field5228 - class148.field2508;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var2 == 0 && var1 == 0) {
            class138.field2299 = -1;
            class306.field5228 = -1;
        }
        class148.field2508 += var2;
        class95.method649((byte) -126);
    }
}
