import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class431 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lkfa;")
    public static class549 field5693 = new class549(12, 6);

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field5696 = 0;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[Lhq;")
    public static class145[] field5697 = null;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field5694;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static void method2306(byte arg0) {
        field5697 = null;
        field5693 = null;
        int var1 = 37 / ((-arg0 - 56) / 51);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2307(int arg0, int arg1, byte arg2) {
        field5695++;
        if (arg2 == 97) {
            return (arg1 & 0x100) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILql;II)J")
    public static final long method2308(int arg0, class670 arg1, int arg2, int arg3) {
        field5694++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class335 var10 = class195.field2339.method3729(arg1.method444((byte) -117), (byte) 109);
        long var11 = (long) (arg1.method447((byte) -91) | 0x10000 << 14 | arg2 | arg3 << 7 | arg1.method443((byte) 58) << 20);
        if (var10.field4407 == 0) {
            var11 |= var8;
        }
        if (arg0 > -78) {
            method2308(-55, null, -30, -33);
        }
        if (var10.field4402 == 1) {
            var11 |= var4;
        }
        if (var10.field4328) {
            var11 |= var6;
        }
        return var11 | (long) arg1.method444((byte) -76) << 32;
    }
}
