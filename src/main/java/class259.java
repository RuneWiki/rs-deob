import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class259 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lqd;")
    public static class37 field3917 = new class37(2);

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field3924 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3922;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "[[[B")
    public static byte[][][] field3920;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZLjava/util/Random;)I")
    public static final int method1734(int arg0, boolean arg1, Random arg2) {
        field3919++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class109.method716(true, arg0)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            if (arg1) {
                return -95;
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class24.method180(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lgd;")
    public static final class273 method1735(int arg0, int arg1) {
        field3923++;
        class273 var2 = (class273) class289.field4570.method263((byte) 110, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class166.field2420.method1538(class60.method392(arg0, (byte) -92), class245.method1602(arg1 ^ 0x1935, arg0), (byte) 117);
        class273 var4 = new class273();
        var4.field4380 = arg0;
        if (var3 != null) {
            var4.method1843(new class114(var3), (byte) -125);
        }
        if (arg1 != -14667) {
            return null;
        }
        var4.method1842(-44);
        if (var4.field4348 != -1) {
            var4.method1841(method1735(var4.field4364, -14667), method1735(var4.field4348, -14667), 1);
        }
        if (var4.field4368 != -1) {
            var4.method1840((byte) 17, method1735(var4.field4346, -14667), method1735(var4.field4368, -14667));
        }
        if (!class58.field894 && var4.field4344) {
            var4.field4375 = class183.field2617;
            var4.field4372 = class206.field2984;
            var4.field4377 = class248.field3724;
            var4.field4386 = false;
            var4.field4350 = 0;
        }
        class289.field4570.method255((long) arg0, var4, (byte) -127);
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static final void method1736(byte arg0) {
        field3918++;
        if (class257.field3898 > 0) {
            class178.method1157(true);
            return;
        }
        class211.field3037 = class10.field180;
        class10.field180 = null;
        if (arg0 != -13) {
            method1735(50, 68);
        }
        class245.method1608((byte) 84, 40);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V")
    public static void method1737(byte arg0) {
        if (arg0 != -79) {
            method1736((byte) -93);
        }
        field3920 = null;
        field3922 = null;
        field3917 = null;
    }
}
