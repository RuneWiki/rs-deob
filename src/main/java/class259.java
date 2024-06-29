import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class259 {

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lsf;")
    public static class108 field4569 = class140.method973(255, " loggt sich aus)3");

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Z")
    public static boolean field4573 = true;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field4572 = 0;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Lsf;")
    public static class108 field4574 = class140.method973(255, "<col=ff7000>");

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Lsf;")
    public static class108 field4576 = class140.method973(255, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lsf;")
    public static class108 field4575 = class140.method973(255, "::tele ");

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4567;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 10)
    public static void method1838(int arg0) {
        if (arg0 != 0) {
            method1842((byte) -31, (class98) null);
        }
        field4575 = null;
        field4574 = null;
        field4569 = null;
        field4576 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(JII[I)Lsf;", line = 24)
    public static final class108 method1839(long arg0, int arg1, int arg2, int[] arg3) {
        field4571++;
        if (class254.field4419 != null) {
            class108 var5 = class254.field4419.method1624(arg1, arg0, arg3, false);
            if (var5 != null) {
                return var5;
            }
        }
        int var6 = 113 % ((19 - arg2) / 41);
        return arg1 == 5 ? class330.method2259((byte) -46, arg0).method755(8975) : class261.method1851(1, arg0);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lrm;I[B)V", line = 69)
    public final void method1840(class249 arg0, int arg1, byte[] arg2) {
        field4577++;
        if (arg0.field4338[arg0.field4314] != 31 || arg0.field4338[arg0.field4314 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4567 == null) {
            this.field4567 = new Inflater(true);
        }
        try {
            this.field4567.setInput(arg0.field4338, arg0.field4314 + 10, -18 - (arg0.field4314 - arg0.field4338.length));
            this.field4567.inflate(arg2);
        } catch (Exception var6) {
            this.field4567.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4567.reset();
        int var5 = 64 / ((31 - arg1) / 58);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)[Lt;", line = 96)
    public static final class257[] method1841(int arg0) {
        class257[] var1 = new class257[class196.field3546];
        for (int var2 = 0; var2 < class196.field3546; var2++) {
            var1[var2] = new class257(class95.field1519, class197.field3560, class154.field2775[var2], class88.field1383[var2], class155.field2780[var2], class273.field4795[var2], class94.field1512[var2], class321.field5494);
        }
        int var3 = -97 % ((arg0 + 7) / 33);
        field4579++;
        class15.method100(1);
        return var1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLca;)Lca;", line = 123)
    public static final class98 method1842(byte arg0, class98 arg1) {
        class98 var2 = client.method1822(arg1);
        if (arg0 <= 126) {
            return (class98) null;
        }
        field4568++;
        if (var2 == null) {
            var2 = arg1.field1616;
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V", line = 144)
    public class259() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(III)V", line = 168)
    private class259(int arg0, int arg1, int arg2) {
    }
}
