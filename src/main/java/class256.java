import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class class256 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public int field4351;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "[I")
    public static int[] field4357 = new int[100];

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lk;")
    public static class36 field4354 = new class36(64);

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lej;")
    public static class204 field4359 = new class204(260);

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Luf;")
    private static class168 field4360 = class148.method1019(-1720, "Created gameworld");

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Luf;")
    public static class168 field4362 = field4360;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Ldk;")
    public static class241 field4358;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Ldk;")
    public static class241 field4361;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BII)V", line = 9)
    public static final void method1752(byte arg0, int arg1, int arg2) {
        int var3 = -85 / ((arg0 - 5) / 57);
        field4355++;
        class261.field4423[arg1] = arg2;
        class215 var4 = (class215) class209.field3458.method493((long) arg1, 116);
        if (var4 == null) {
            class215 var5 = new class215(4611686018427387905L);
            class209.field3458.method490(var5, (long) arg1, true);
        } else if (var4.field3507 != 4611686018427387905L) {
            var4.field3507 = class194.method1368((byte) -8) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 39)
    public static void method1753(byte arg0) {
        field4361 = null;
        field4354 = null;
        field4357 = null;
        int var1 = -13 / ((arg0 - 41) / 47);
        field4358 = null;
        field4362 = null;
        field4360 = null;
        field4359 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(III)V", line = 67)
    public class256(int arg0, int arg1, int arg2) {
        this.field4352 = arg0;
        this.field4356 = arg1;
        this.field4351 = arg2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lg;I)Lg;", line = 83)
    public static final class242 method1754(class242 arg0, int arg1) {
        field4353++;
        class242 var2 = client.method2003(arg0);
        if (var2 == null) {
            var2 = arg0.field4033;
        }
        if (arg1 >= -65) {
            method1754((class242) null, -29);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
    public abstract void method903(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)V")
    public abstract void method905(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(BII)V")
    public abstract void method904(byte arg0, int arg1, int arg2);
}
