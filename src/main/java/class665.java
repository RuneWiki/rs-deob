import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class665 {

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "Lme;")
    private class668 field9231 = new class668(64);

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "Lme;")
    public class668 field9235 = new class668(2);

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "Lpe;")
    private class615 field9223;

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "Lpe;")
    public class615 field9226;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "Lnj;")
    public static class415 field9221 = new class415(6, -1);

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "Z")
    public static volatile boolean field9229 = false;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "I")
    public static int field9225 = 0;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "Lra;")
    public static class361 field9228 = new class361(6, 8);

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "Lra;")
    public static class361 field9233 = new class361(38, 14);

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IC)Z")
    public static final boolean method3637(int arg0, char arg1) {
        field9222++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class298.method1760(arg1, (byte) -119)) {
            return true;
        } else {
            char[] var2 = class412.field5314;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class50.field693;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            if (arg0 != 8690) {
                method3640(79);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(ZI)Lwe;")
    public final class114 method3638(boolean arg0, int arg1) {
        field9232++;
        class668 var3 = this.field9231;
        class114 var5;
        synchronized (this.field9231) {
            if (!arg0) {
                return null;
            }
            var5 = (class114) this.field9231.method3655(-26, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class615 var6 = this.field9223;
        byte[] var7;
        synchronized (this.field9223) {
            var7 = this.field9223.method3346(-1, 33, arg1);
        }
        class114 var8 = new class114();
        var8.field1481 = this;
        if (var7 != null) {
            var8.method861(new class418(var7), -1);
        }
        class668 var9 = this.field9231;
        synchronized (this.field9231) {
            this.field9231.method3650((long) arg1, -125, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
    public final void method3639(byte arg0) {
        field9227++;
        class668 var2 = this.field9231;
        synchronized (this.field9231) {
            this.field9231.method3658(0);
            if (arg0 > -109) {
                this.field9223 = null;
            }
        }
        class668 var3 = this.field9235;
        synchronized (this.field9235) {
            this.field9235.method3658(0);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
    public static void method3640(int arg0) {
        field9221 = null;
        field9228 = null;
        if (arg0 != 2) {
            method3637(-106, (char) 65447);
        }
        field9233 = null;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)V")
    public final void method3641(int arg0, int arg1) {
        class668 var3 = this.field9231;
        synchronized (this.field9231) {
            this.field9231.method3659(-121, arg0);
            if (arg1 != 14) {
                this.field9223 = null;
            }
        }
        field9224++;
        class668 var4 = this.field9235;
        synchronized (this.field9235) {
            this.field9235.method3659(-119, arg0);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)V")
    public final void method3642(int arg0) {
        field9230++;
        class668 var2 = this.field9231;
        synchronized (this.field9231) {
            this.field9231.method3656((byte) 0);
        }
        if (arg0 > -79) {
            field9234 = -84;
        }
        class668 var3 = this.field9235;
        synchronized (this.field9235) {
            this.field9235.method3656((byte) 0);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lvd;ILpe;Lpe;)V")
    public class665(class635 arg0, int arg1, class615 arg2, class615 arg3) {
        this.field9223 = arg2;
        this.field9226 = arg3;
        this.field9223.method3341(33, -19046);
    }
}
