import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class294 {

    @OriginalMember(owner = "client!co", name = "u", descriptor = "J")
    public long field4289 = 0L;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public int field4269;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public int field4272;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public int field4278;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public int field4280;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public int field4282;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "I")
    public int field4287;

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public int field4288;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "Lfh;")
    public static class140 field4284;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "Lvc;")
    public class260 field4275;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "[I")
    public static int[] field4286;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([SI[Ljava/lang/String;)V", line = 13)
    public static final void method2009(short[] arg0, int arg1, String[] arg2) {
        field4279++;
        int var3 = 86 % ((arg1 + 14) / 40);
        class257.method1784(arg2, true, arg2.length - 1, arg0, 0);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V", line = 25)
    public static final void method2010(boolean arg0) {
        field4270++;
        if (!arg0) {
            method2010(false);
        }
        class240.field3489 = new class329(32);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 43)
    public static final int method2011(Random arg0, int arg1, int arg2) {
        field4274++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class277.method1876((byte) -121, arg1)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = -112 % ((arg2 - 69) / 32);
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var5;
            do {
                var5 = arg0.nextInt();
            } while (var5 >= var4);
            return class137.method1036(var5, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 72)
    public static void method2012(int arg0) {
        field4284 = null;
        if (arg0 == 8856) {
            field4286 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)Ljl;", line = 83)
    public static final class20 method2013(boolean arg0, int arg1) {
        field4271++;
        class20 var2 = (class20) class94.field1212.method1116(17301, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class52.field692.method1089(arg1, (byte) 123, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class20 var4 = class97.method701((byte) 63, var3);
        if (arg0) {
            method2014(84);
        }
        class94.field1212.method1115((long) arg1, 45, var4);
        return var4;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V", line = 116)
    public static final void method2014(int arg0) {
        if (arg0 == -17442) {
            class74.field983 = new class54();
            field4281++;
        }
    }
}
