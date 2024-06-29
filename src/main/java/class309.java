import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class309 extends class656 {

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "[I")
    public static int[] field4451 = new int[1];

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public int field4437;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public int field4438;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public int field4443;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public int field4449;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lvfa;")
    public class672 field4435;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lvfa;")
    public class672 field4444;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Ljava/lang/String;")
    public String field4445;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "Z")
    public boolean field4446;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field4439;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 7)
    public static void method1902(int arg0) {
        if (arg0 != -1333244320) {
            field4451 = null;
        }
        field4451 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILjava/lang/String;)Lcc;", line = 20)
    public static final class732 method1903(int arg0, int arg1, String arg2) {
        field4447++;
        if (arg1 != 17509) {
            return null;
        }
        class732 var3;
        try {
            var3 = (class732) Class.forName("gaa").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class108();
        }
        var3.field10139 = arg0;
        var3.field10140 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILwu;)V", line = 44)
    public static final void method1904(int arg0, class376 arg1) {
        class131.field2142 = arg1;
        field4440++;
        if (arg0 < 99) {
            method1906(-55, 19, null);
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(Z)V", line = 55)
    public static final void method1905(boolean arg0) {
        if (arg0) {
            method1903(-62, -31, null);
        }
        field4450++;
        if (!class578.method3169(-108)) {
            return;
        }
        if (class475.field6519 == null) {
            class561.method3113((byte) -107);
        }
        class360.field5083 = 0;
        class432.field5950 = true;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILjava/util/Random;)I", line = 83)
    public static final int method1906(int arg0, int arg1, Random arg2) {
        field4441++;
        if (~arg0 >= arg1) {
            throw new IllegalArgumentException();
        } else if (class538.method2993(arg0, -31218)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class353.method2114(arg0, -429911713, var4);
        }
    }
}
