import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class197 {

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Lvi;")
    private class560 field2598 = new class560(64);

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "Lpq;")
    private class159 field2601;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "[I")
    public static int[] field2603 = new int[2];

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V", line = 4)
    public final void method1254(int arg0, int arg1) {
        class560 var3 = this.field2598;
        synchronized (this.field2598) {
            int var4 = 10 / ((-arg0 - 5) / 50);
            this.field2598.method3129(arg1, 14583);
        }
        field2600++;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 18)
    public final void method1255(byte arg0) {
        field2599++;
        class560 var2 = this.field2598;
        synchronized (this.field2598) {
            this.field2598.method3144(true);
        }
        if (arg0 < 41) {
            this.method1255((byte) 111);
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)Lwg;", line = 31)
    public final class579 method1256(int arg0, int arg1) {
        field2604++;
        class560 var3 = this.field2598;
        class579 var4;
        synchronized (this.field2598) {
            var4 = (class579) this.field2598.method3134((long) arg0, -75);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field2601;
        byte[] var6;
        synchronized (this.field2601) {
            var6 = this.field2601.method1087(11, arg0, 1);
        }
        class579 var7 = new class579();
        if (var6 != null) {
            var7.method3258(arg1 + 4042, new class138(var6));
        }
        class560 var8 = this.field2598;
        synchronized (this.field2598) {
            this.field2598.method3130((long) arg0, true, var7);
        }
        if (arg1 != -3934) {
            this.method1255((byte) 111);
        }
        return var7;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)V", line = 66)
    public static void method1257(byte arg0) {
        if (arg0 != -93) {
            field2603 = null;
        }
        field2603 = null;
    }

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)V", line = 83)
    public final void method1258(byte arg0) {
        field2602++;
        if (arg0 == -51) {
            class560 var2 = this.field2598;
            synchronized (this.field2598) {
                this.field2598.method3142(false);
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Luea;ILpq;)V", line = 98)
    public class197(class484 arg0, int arg1, class159 arg2) {
        this.field2601 = arg2;
        if (this.field2601 != null) {
            this.field2601.method1076(11, 0);
        }
    }
}
