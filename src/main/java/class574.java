import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class574 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lke;")
    private class443 field8165 = new class443();

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Llj;")
    private class59 field8170 = new class59();

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    private int field8168;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    private int field8175;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lcb;")
    private class78 field8172;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Llu;")
    public static class514 field8169 = class158.method1121(-95);

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Lnn;")
    public static class214 field8171 = new class214(0, -1);

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lpp;")
    public static class464 field8176 = new class464(68, -1);

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "[Z")
    public static boolean[] field8178 = new boolean[5];

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field8167;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field8174;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "Lha;")
    public static class116 field8177;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field8180;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 10)
    public final void method3283(int arg0) {
        if (arg0 != -10132) {
            return;
        }
        this.field8170.method478(0);
        field8167++;
        this.field8172.method739(2048);
        this.field8165 = new class443();
        this.field8168 = this.field8175;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 24)
    public static void method3284(byte arg0) {
        field8177 = null;
        field8180 = null;
        field8171 = null;
        if (arg0 <= 19) {
            method3284((byte) 11);
        }
        field8176 = null;
        field8178 = null;
        field8169 = null;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I)V", line = 136)
    public class574(int arg0) {
        this.field8168 = arg0;
        this.field8175 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field8172 = new class78(var2);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)I", line = 51)
    public static final int method3285(byte arg0) {
        field8173++;
        int var1 = -8 / ((arg0 + 73) / 46);
        return 16;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)Lke;", line = 73)
    public final class443 method3286(int arg0, long arg1) {
        field8174++;
        class443 var4 = (class443) this.field8172.method740(0, arg1);
        if (var4 != null) {
            this.field8170.method477(var4, false);
        }
        return arg0 == -91 ? var4 : null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJLke;)V", line = 102)
    public final void method3287(int arg0, long arg1, class443 arg2) {
        if (this.field8168 == arg0) {
            class443 var5 = this.field8170.method472(true);
            var5.method911(-52);
            var5.method2619(true);
            if (this.field8165 == var5) {
                class443 var6 = this.field8170.method472(true);
                var6.method911(-52);
                var6.method2619(true);
            }
        } else {
            this.field8168--;
        }
        field8166++;
        this.field8172.method737(arg1, (byte) 92, arg2);
        this.field8170.method477(arg2, false);
    }
}
