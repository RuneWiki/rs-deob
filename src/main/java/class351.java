import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class351 {

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "Lgk;")
    public class444 field4804 = new class444();

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Lcu;")
    public static class206 field4807 = new class206(30, 3);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "Lgk;")
    private class444 field4809;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)Lgk;")
    public final class444 method2090(int arg0) {
        if (arg0 != 2) {
            field4807 = null;
        }
        field4802++;
        class444 var2 = this.field4809;
        if (this.field4804 == var2) {
            this.field4809 = null;
            return null;
        } else {
            this.field4809 = var2.field6079;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)I")
    public final int method2091(byte arg0) {
        field4806++;
        int var2 = 0;
        int var3 = 63 / ((79 - arg0) / 37);
        for (class444 var4 = this.field4804.field6079; var4 != this.field4804; var4 = var4.field6079) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)Lgk;")
    public final class444 method2092(int arg0) {
        field4805++;
        if (arg0 <= 124) {
            this.field4809 = null;
        }
        class444 var2 = this.field4804.field6079;
        if (this.field4804 == var2) {
            this.field4809 = null;
            return null;
        } else {
            this.field4809 = var2.field6079;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class112 var7 = new class112();
        var7.field1960 = arg1 >> class348.field4782;
        var7.field1953 = arg2 >> class348.field4782;
        var7.field1944 = arg3 >> class348.field4782;
        var7.field1945 = arg4 >> class348.field4782;
        var7.field1948 = arg0;
        var7.field1946 = arg1;
        var7.field1952 = arg2;
        var7.field1942 = arg3;
        var7.field1958 = arg4;
        var7.field1959 = arg5;
        var7.field1956 = arg6;
        class249.field3448[class90.field1369++] = var7;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
    public static void method2094(byte arg0) {
        field4807 = null;
        int var1 = 123 % ((80 - arg0) / 37);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([BI)V")
    public static final void method2095(byte[] arg0, int arg1) {
        field4808++;
        if (arg1 != 3493) {
            field4807 = null;
        }
        class335 var2 = new class335(arg0);
        while (true) {
            int var3 = var2.method2034(255);
            if (var3 == 0) {
                return;
            }
            if (var3 == 2) {
                class346.field4755 = var2.method2001((byte) -83);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
    public final void method2096(int arg0) {
        field4803++;
        if (arg0 > -81) {
            this.field4809 = null;
        }
        while (true) {
            class444 var2 = this.field4804.field6079;
            if (this.field4804 == var2) {
                this.field4809 = null;
                return;
            }
            var2.method2504(95);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lgk;Z)V")
    public final void method2097(class444 arg0, boolean arg1) {
        field4801++;
        if (arg0.field6078 != null) {
            arg0.method2504(-52);
        }
        arg0.field6079 = this.field4804;
        if (arg1) {
            this.method2097(null, true);
        }
        arg0.field6078 = this.field4804.field6078;
        arg0.field6078.field6079 = arg0;
        arg0.field6079.field6078 = arg0;
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
    public class351() {
        this.field4804.field6079 = this.field4804;
        this.field4804.field6078 = this.field4804;
    }
}
