import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class590 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "Luaa;")
    private class395 field8382 = new class395(256);

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Lgp;")
    private class561 field8387;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Liu;")
    public static class517 field8385 = new class517(111, 3);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field8384;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static final void method3376(int arg0) {
        if (arg0 != -24608) {
            method3379(true);
        }
        field8381++;
        for (class127 var1 = (class127) class207.field2932.method427(true); var1 != null; var1 = (class127) class207.field2932.method420(false)) {
            if (var1.field2083 == -1) {
                var1.field2070 = 0;
                if (var1.field2074 >= 0 && var1.field2073 >= 0 && var1.field2074 < class146.field2247 && class66.field990 > var1.field2073) {
                    class477.method2757(-16668, var1);
                }
            } else {
                var1.method911(-52);
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public final void method3377(int arg0) {
        class395 var2 = this.field8382;
        synchronized (this.field8382) {
            this.field8382.method2406(-127);
        }
        if (arg0 == 3) {
            field8383++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
    public final void method3378(int arg0, int arg1) {
        if (arg0 != -9981) {
            return;
        }
        class395 var3 = this.field8382;
        synchronized (this.field8382) {
            this.field8382.method2397(arg1, (byte) -123);
        }
        field8386++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static void method3379(boolean arg0) {
        if (!arg0) {
            field8385 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)Lwj;")
    public final class287 method3380(int arg0, byte arg1) {
        field8388++;
        class395 var3 = this.field8382;
        class287 var4;
        synchronized (this.field8382) {
            var4 = (class287) this.field8382.method2407(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field8387;
        byte[] var6;
        synchronized (this.field8387) {
            var6 = this.field8387.method3175(arg0, (byte) -53, 26);
            if (arg1 != -25) {
                field8385 = null;
            }
        }
        class287 var7 = new class287();
        if (var6 != null) {
            var7.method1821((byte) 101, new class268(var6));
        }
        class395 var8 = this.field8382;
        synchronized (this.field8382) {
            this.field8382.method2408(var7, (long) arg0, -127);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljc;ILgp;)V")
    public class590(class584 arg0, int arg1, class561 arg2) {
        this.field8387 = arg2;
        this.field8387.method3164(26, true);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public final void method3381(int arg0) {
        field8384++;
        class395 var2 = this.field8382;
        synchronized (this.field8382) {
            this.field8382.method2404((byte) -57);
        }
        if (arg0 != 26) {
            this.method3377(126);
        }
    }
}
