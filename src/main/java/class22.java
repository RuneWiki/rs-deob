import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class22 {

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lsf;")
    private static class108 field350 = class140.method973(255, "Oct");

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lsf;")
    private static class108 field348 = class140.method973(255, "Sep");

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Lsf;")
    private static class108 field345 = class140.method973(255, "Feb");

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lsf;")
    private static class108 field352 = class140.method973(255, "May");

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lsf;")
    private static class108 field353 = class140.method973(255, "Dec");

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lsf;")
    private static class108 field344 = class140.method973(255, "Jul");

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lsf;")
    private static class108 field347 = class140.method973(255, "Apr");

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lsf;")
    private static class108 field349 = class140.method973(255, "Aug");

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "Lsf;")
    private static class108 field351 = class140.method973(255, "Jun");

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Lsf;")
    private static class108 field360 = class140.method973(255, "Nov");

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "Lsf;")
    private static class108 field356 = class140.method973(255, "Mar");

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Lsf;")
    public static class108 field361 = class140.method973(255, "logo");

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lsf;")
    private static class108 field357 = class140.method973(255, "Jan");

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "[Lsf;")
    public static class108[] field359 = new class108[] { field357, field345, field356, field347, field352, field351, field344, field349, field348, field350, field360, field353 };

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "F")
    public static float field355;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lrm;I)Lmi;", line = 6)
    public static final class273 method149(class249 arg0, int arg1) {
        if (arg1 != 0) {
            method152((byte) 109);
        }
        field346++;
        return new class273(arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1749(false), arg0.method1731(true));
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 20)
    public static void method150(byte arg0) {
        field344 = null;
        field345 = null;
        field356 = null;
        field357 = null;
        field351 = null;
        if (arg0 <= 60) {
            return;
        }
        field353 = null;
        field350 = null;
        field361 = null;
        field349 = null;
        field348 = null;
        field347 = null;
        field359 = null;
        field352 = null;
        field360 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)V", line = 55)
    public static final void method151(int arg0, boolean arg1) {
        field354++;
        class117 var2 = (class117) class98.field1620.method1676((long) arg0, (byte) -105);
        if (var2 == null) {
            return;
        }
        if (!arg1) {
            field349 = (class108) null;
        }
        for (int var3 = 0; var3 < var2.field2028.length; var3++) {
            var2.field2028[var3] = -1;
            var2.field2036[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 80)
    public static final void method152(byte arg0) {
        field358++;
        for (int var1 = -1; var1 < class43.field569; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class194.field3511[var1];
            }
            class51 var3 = class96.field1558[var2];
            if (var3 != null && var3.field4524 > 0) {
                var3.field4524--;
                if (var3.field4524 == 0) {
                    var3.field4467 = null;
                }
            }
        }
        if (arg0 != -63) {
            method149((class249) null, 7);
        }
        for (int var4 = 0; var4 < class61.field969; var4++) {
            int var5 = class168.field3020[var4];
            class45 var6 = class159.field2863[var5];
            if (var6 != null && var6.field4524 > 0) {
                var6.field4524--;
                if (var6.field4524 == 0) {
                    var6.field4467 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Llj;Z)I", line = 181)
    public static final int method153(class51 arg0, boolean arg1) {
        int var2 = arg0.field739;
        field362++;
        if (arg0.field4472 == arg0.field4455) {
            var2 = arg0.field725;
        } else if (arg0.field4483 == arg0.field4472) {
            var2 = arg0.field745;
        }
        if (arg1) {
            field344 = (class108) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I", line = 216)
    public static final int method154(int arg0) {
        int var1 = -26 % ((arg0 + 60) / 56);
        field343++;
        if ((double) class200.field3621 == 3.0D) {
            return 37;
        } else if ((double) class200.field3621 == 4.0D) {
            return 50;
        } else if ((double) class200.field3621 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }
}
