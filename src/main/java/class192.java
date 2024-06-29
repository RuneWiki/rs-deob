import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class192 {

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
    public static int field3173 = 2;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "Lrl;")
    public static class672 field3171 = new class672(46, 3);

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "Ltr;")
    public static class268 field3180 = new class268(128);

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
    public static int field3183 = 0;

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "J")
    public static long field3184 = 0L;

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "[F")
    public static float[] field3185 = new float[4];

    @OriginalMember(owner = "client!rea", name = "u", descriptor = "[S")
    public static short[] field3186 = new short[256];

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    public int field3170;

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "Lrea;")
    public class192 field3166;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "Lq;")
    public class393 field3175;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(II)Lrea;", line = 5)
    public final class192 method1527(int arg0, int arg1) {
        if (arg0 > -110) {
            method1529((byte) 47);
        }
        field3177++;
        return new class192(this.field3176, arg1);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(Z)V", line = 16)
    public static void method1528(boolean arg0) {
        if (arg0) {
            method1529((byte) -71);
        }
        field3186 = null;
        field3180 = null;
        field3185 = null;
        field3171 = null;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V", line = 29)
    public static final void method1529(byte arg0) {
        field3167++;
        class259.method1833();
        for (int var1 = 0; var1 < 4; var1++) {
            class10.field172[var1].method374(32);
        }
        class145.method1234(-24329);
        class66.method705(0);
        System.gc();
        int var2 = -78 / ((arg0 + 38) / 42);
        class627.field8857.method136();
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)Lmh;", line = 67)
    public final class585 method1530(byte arg0) {
        if (arg0 < 104) {
            field3181 = -89;
        }
        field3172++;
        return class576.method3379(this.field3176, (byte) 102);
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(II)V", line = 77)
    public class192(int arg0, int arg1) {
        this.field3176 = arg0;
        this.field3168 = arg1;
    }
}
