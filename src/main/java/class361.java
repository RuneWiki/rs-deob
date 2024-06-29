import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class361 {

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "Luv;")
    private class399 field5211 = new class399();

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "[I")
    public static int[] field5204 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "Luv;")
    private class399 field5213;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "Lxa;")
    public static class424 field5208;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "[[[B")
    public static byte[][][] field5210;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILuv;)V", line = 5)
    public final void method2216(int arg0, class399 arg1) {
        field5207++;
        if (arg1.field5678 != null) {
            arg1.method2357(arg0 ^ 0xDE5);
        }
        arg1.field5683 = this.field5211;
        arg1.field5678 = this.field5211.field5678;
        if (arg0 != 4) {
            this.method2222((byte) 16);
        }
        arg1.field5678.field5683 = arg1;
        arg1.field5683.field5678 = arg1;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V", line = 24)
    public static void method2217(int arg0) {
        int var1 = -31 / ((29 - arg0) / 62);
        field5208 = null;
        field5204 = null;
        field5210 = null;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Luv;", line = 37)
    public final class399 method2218(int arg0) {
        field5200++;
        if (arg0 != 3) {
            this.method2222((byte) -65);
        }
        class399 var2 = this.field5211.field5678;
        if (this.field5211 == var2) {
            this.field5213 = null;
            return null;
        } else {
            this.field5213 = var2.field5678;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Luv;", line = 62)
    public final class399 method2219(byte arg0) {
        field5202++;
        if (arg0 > -81) {
            this.method2223(78);
        }
        class399 var2 = this.field5211.field5683;
        if (this.field5211 == var2) {
            return null;
        } else {
            var2.method2357(3553);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 79)
    public static final void method2220(boolean arg0) {
        class669.field9511.method3144(true);
        if (!arg0) {
            field5201++;
        }
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)I", line = 92)
    public final int method2221(boolean arg0) {
        field5209++;
        int var2 = 0;
        if (arg0) {
            return 15;
        }
        class399 var3 = this.field5211.field5683;
        while (this.field5211 != var3) {
            var3 = var3.field5683;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)Luv;", line = 115)
    public final class399 method2222(byte arg0) {
        field5203++;
        class399 var2 = this.field5213;
        if (arg0 > -25) {
            this.field5213 = null;
        }
        if (this.field5211 == var2) {
            this.field5213 = null;
            return null;
        } else {
            this.field5213 = var2.field5683;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)Z", line = 138)
    public final boolean method2223(int arg0) {
        field5212++;
        if (arg0 != 0) {
            method2217(-71);
        }
        return this.field5211.field5683 == this.field5211;
    }

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)Luv;", line = 150)
    public final class399 method2224(byte arg0) {
        field5206++;
        class399 var2 = this.field5211.field5683;
        if (this.field5211 == var2) {
            this.field5213 = null;
            return null;
        }
        if (arg0 != -112) {
            this.method2219((byte) 11);
        }
        this.field5213 = var2.field5683;
        return var2;
    }

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V", line = 172)
    public final void method2225(int arg0) {
        while (true) {
            class399 var2 = this.field5211.field5683;
            if (this.field5211 == var2) {
                if (arg0 != 29483) {
                    this.field5213 = null;
                }
                field5205++;
                this.field5213 = null;
                return;
            }
            var2.method2357(3553);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Lbg;", line = 200)
    public static final class249 method2226(int arg0, int arg1, int arg2) {
        class651 var3 = class145.field1841[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9234;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 217)
    public class361() {
        this.field5211.field5683 = this.field5211;
        this.field5211.field5678 = this.field5211;
    }
}
