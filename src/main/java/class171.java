import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class171 {

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field3036 = 0;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "Lvm;")
    public static class297 field3045 = new class297(64);

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "Z")
    public static boolean field3050 = true;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public int field3030;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public int field3031;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public int field3032;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public int field3035;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public int field3037;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public int field3038;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public int field3040;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public int field3042;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public int field3046;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public int field3048;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    public int field3049;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "[[S")
    public static short[][] field3043;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 7)
    public static void method1244(byte arg0) {
        field3043 = (short[][]) null;
        field3045 = null;
        if (arg0 != -29) {
            method1245(-97, (byte) 80);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)I", line = 42)
    public static final int method1245(int arg0, byte arg1) {
        if (arg1 != -2) {
            method1246((byte) -90);
        }
        field3044++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V", line = 67)
    public static final void method1246(byte arg0) {
        int var1 = 123 % ((22 - arg0) / 62);
        class130.field2276 = 0;
        field3029++;
        int var2 = (class121.field2124.field1192 >> 7) + class134.field2336;
        int var3 = (class121.field2124.field1197 >> 7) + class10.field147;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            class130.field2276 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            class130.field2276 = 1;
        }
        if (class130.field2276 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            class130.field2276 = 0;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)Lhk;", line = 90)
    public static final class39 method1247(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class39 var4 = var3.field4643;
            var3.field4643 = null;
            return var4;
        }
    }
}
