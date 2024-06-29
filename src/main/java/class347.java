import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class347 {

    @OriginalMember(owner = "client!um", name = "t", descriptor = "Lcg;")
    public class86 field5018 = new class86();

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Lwt;")
    public static class194 field5000 = new class194("M", "M", "M", "M");

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field5015 = 328;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "Liu;")
    public static class390 field5013 = new class390(57, 8);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "Lcg;")
    private class86 field5019;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "[I")
    public static int[] field5004;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "[Lqg;")
    public static class307[] field5011;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Lcg;", line = 5)
    public final class86 method2084(byte arg0) {
        field5006++;
        if (arg0 != 19) {
            return null;
        }
        class86 var2 = this.field5019;
        if (this.field5018 == var2) {
            this.field5019 = null;
            return null;
        } else {
            this.field5019 = var2.field1179;
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)I", line = 28)
    public final int method2085(int arg0) {
        if (arg0 != -18021) {
            return -106;
        }
        field5014++;
        int var2 = 0;
        class86 var3 = this.field5018.field1179;
        while (this.field5018 != var3) {
            var3 = var3.field1179;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLcg;)V", line = 49)
    public final void method2086(byte arg0, class86 arg1) {
        field5010++;
        if (arg1.field1173 != null) {
            arg1.method536(false);
        }
        if (arg0 <= -110) {
            arg1.field1179 = this.field5018;
            arg1.field1173 = this.field5018.field1173;
            arg1.field1173.field1179 = arg1;
            arg1.field1179.field1173 = arg1;
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 69)
    public static void method2087(int arg0) {
        field5004 = null;
        field5013 = null;
        if (arg0 <= 117) {
            method2088(-118);
        }
        field5000 = null;
        field5011 = null;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V", line = 82)
    public static final void method2088(int arg0) {
        if (arg0 < 60) {
            return;
        }
        field5003++;
        if (class371.field5567 != class355.field5129) {
            try {
                class123.method697((byte) 113, "tbrefresh", class114.field1473);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)V", line = 101)
    public final void method2089(int arg0) {
        while (true) {
            class86 var2 = this.field5018.field1179;
            if (this.field5018 == var2) {
                field5001++;
                if (arg0 != 328) {
                    return;
                }
                this.field5019 = null;
                return;
            }
            var2.method536(false);
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)Z", line = 124)
    public final boolean method2090(int arg0) {
        field5009++;
        if (arg0 == 0) {
            return this.field5018.field1179 == this.field5018;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZLum;)V", line = 140)
    public final void method2091(boolean arg0, class347 arg1) {
        this.method2097(arg0, this.field5018.field1179, arg1);
        field5007++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILcg;)V", line = 150)
    public final void method2092(int arg0, class86 arg1) {
        field5008++;
        if (arg1.field1173 != null) {
            arg1.method536(false);
        }
        arg1.field1179 = this.field5018.field1179;
        arg1.field1173 = this.field5018;
        arg1.field1173.field1179 = arg1;
        if (arg0 > -73) {
            this.field5019 = null;
        }
        arg1.field1179.field1173 = arg1;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)Lcg;", line = 169)
    public final class86 method2093(int arg0) {
        field5017++;
        class86 var2 = this.field5018.field1179;
        if (this.field5018 == var2) {
            return null;
        } else if (arg0 == -10805) {
            var2.method536(false);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(I)Lcg;", line = 197)
    public final class86 method2094(int arg0) {
        field4999++;
        class86 var2 = this.field5018.field1173;
        if (arg0 != 8) {
            this.method2086((byte) -30, null);
        }
        if (this.field5018 == var2) {
            this.field5019 = null;
            return null;
        } else {
            this.field5019 = var2.field1173;
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIB)V", line = 219)
    public static final void method2095(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field5002++;
        int var6 = class372.method2266(class7.field131, -20228, class92.field1252, arg1);
        int var7 = class372.method2266(class7.field131, -20228, class92.field1252, arg2);
        int var8 = class372.method2266(class473.field6839, arg5 - 20212, class63.field933, arg4);
        if (arg5 != -16) {
            method2088(-40);
        }
        int var9 = class372.method2266(class473.field6839, -20228, class63.field933, arg3);
        for (int var10 = var6; var10 <= var7; var10++) {
            class238.method1440(class41.field629[var10], arg0, var9, var8, -14726);
        }
    }

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(I)Lcg;", line = 246)
    public final class86 method2096(int arg0) {
        if (arg0 != -21400) {
            field5013 = null;
        }
        field5012++;
        class86 var2 = this.field5018.field1179;
        if (this.field5018 == var2) {
            this.field5019 = null;
            return null;
        } else {
            this.field5019 = var2.field1179;
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZLcg;Lum;)V", line = 266)
    private final void method2097(boolean arg0, class86 arg1, class347 arg2) {
        field5016++;
        class86 var4 = this.field5018.field1173;
        this.field5018.field1173 = arg1.field1173;
        arg1.field1173.field1179 = this.field5018;
        if (arg0) {
            field5013 = null;
        }
        if (this.field5018 != arg1) {
            arg1.field1173 = arg2.field5018.field1173;
            arg1.field1173.field1179 = arg1;
            var4.field1179 = arg2.field5018;
            arg2.field5018.field1173 = var4;
        }
    }

    @OriginalMember(owner = "client!um", name = "i", descriptor = "(I)Lcg;", line = 297)
    public final class86 method2098(int arg0) {
        field5005++;
        if (arg0 != 0) {
            return null;
        }
        class86 var2 = this.field5019;
        if (this.field5018 == var2) {
            this.field5019 = null;
            return null;
        } else {
            this.field5019 = var2.field1173;
            return var2;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 331)
    public class347() {
        this.field5018.field1173 = this.field5018;
        this.field5018.field1179 = this.field5018;
    }
}
