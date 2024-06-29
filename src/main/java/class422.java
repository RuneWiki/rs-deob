import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class422 extends class46 {

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Leo;")
    public static class443 field5837 = new class443(7, 15);

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "[I")
    public static int[] field5848 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lcf;")
    public static class92 field5849 = new class92();

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Ljava/lang/String;")
    public static String field5851 = null;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "C")
    public char field5843;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public int field5838;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public int field5850;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "J")
    public long field5842;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Ljo;")
    public static class233 field5847;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Lpe;")
    public class422 field5844;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Z")
    public boolean field5841;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 3)
    public static final void method2516(int arg0) {
        if (arg0 != 0) {
            method2518(false);
        }
        for (class27 var1 = (class27) class255.field3658.method1768(arg0 + 7); var1 != null; var1 = (class27) class255.field3658.method1768(7)) {
            class89.method753(var1, 68);
        }
        field5834++;
        int var2;
        int var3;
        if (class435.method2628(2)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class259.field3691;
            var2 = class259.field3691;
        }
        client.method546();
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method531();
            client.method544(var4);
            client.method548(var4);
        }
        client.method530();
        client.method542();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)J", line = 47)
    public final long method470(int arg0) {
        field5835++;
        return arg0 == 7 ? this.field5842 : 57L;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V", line = 58)
    public static void method2517(boolean arg0) {
        if (!arg0) {
            return;
        }
        field5847 = null;
        field5837 = null;
        field5851 = null;
        field5849 = null;
        field5848 = null;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)Z", line = 72)
    public final boolean method475(int arg0) {
        field5836++;
        return arg0 == -2 ? this.field5841 : true;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V", line = 85)
    public static final void method2518(boolean arg0) {
        if (!arg0) {
            return;
        }
        class336 var1 = class282.field4052;
        synchronized (class282.field4052) {
            class282.field4052.method2109(-1);
        }
        field5846++;
        class336 var2 = class402.field5517;
        synchronized (class402.field5517) {
            class402.field5517.method2109(-1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I", line = 104)
    public final int method471(int arg0) {
        field5845++;
        return arg0 == -1 ? this.field5838 : -88;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)C", line = 121)
    public final char method477(int arg0) {
        field5840++;
        if (arg0 != 7) {
            field5849 = null;
        }
        return this.field5843;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)I", line = 134)
    public final int method472(byte arg0) {
        if (arg0 <= 67) {
            this.method477(122);
        }
        field5839++;
        return this.field5850;
    }
}
