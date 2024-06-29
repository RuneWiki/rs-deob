import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class295 {

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Lfs;")
    private class331 field4109 = new class331();

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lse;")
    public static class138 field4107 = new class138(128);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Lnc;")
    public static class18 field4115;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Lfs;")
    private class331 field4119;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lgj;")
    public static class381 field4112;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "Z")
    public static boolean field4117;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Lfs;")
    public final class331 method1945(byte arg0) {
        int var2 = 96 / ((38 - arg0) / 37);
        field4105++;
        class331 var3 = this.field4119;
        if (this.field4109 == var3) {
            this.field4119 = null;
            return null;
        } else {
            this.field4119 = var3.field4676;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Lfs;")
    public final class331 method1946(int arg0) {
        field4106++;
        if (arg0 != 4) {
            this.method1948((byte) -50);
        }
        class331 var2 = this.field4109.field4676;
        if (this.field4109 == var2) {
            return null;
        } else {
            var2.method2133(-31493);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
    public final int method1947(int arg0) {
        field4118++;
        int var2 = arg0;
        class331 var3 = this.field4109.field4676;
        while (this.field4109 != var3) {
            var3 = var3.field4676;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V")
    public final void method1948(byte arg0) {
        field4111++;
        int var2 = -19 % ((34 - arg0) / 39);
        while (true) {
            class331 var3 = this.field4109.field4676;
            if (this.field4109 == var3) {
                this.field4119 = null;
                return;
            }
            var3.method2133(-31493);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)Lfs;")
    public final class331 method1949(boolean arg0) {
        field4108++;
        class331 var2 = this.field4109.field4676;
        if (this.field4109 == var2) {
            this.field4119 = null;
            return null;
        }
        if (!arg0) {
            this.method1946(43);
        }
        this.field4119 = var2.field4676;
        return var2;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILfs;)V")
    public final void method1950(int arg0, class331 arg1) {
        if (arg1.field4673 != null) {
            arg1.method2133(-31493);
        }
        field4113++;
        int var3 = -37 % ((arg0 + 48) / 49);
        arg1.field4676 = this.field4109;
        arg1.field4673 = this.field4109.field4673;
        arg1.field4673.field4676 = arg1;
        arg1.field4676.field4673 = arg1;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public static void method1951(int arg0) {
        field4107 = null;
        field4115 = null;
        field4112 = null;
        int var1 = -74 % ((arg0 + 46) / 53);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V")
    public static final void method1952(int arg0, int arg1) {
        field4110++;
        class20 var2 = class369.method2351((byte) 124, arg0, arg1);
        var2.method148(-11806);
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class295() {
        this.field4109.field4673 = this.field4109;
        this.field4109.field4676 = this.field4109;
    }
}
