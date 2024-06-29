import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lof;")
    public class253 field209 = new class253();

    @OriginalMember(owner = "client!we", name = "d", descriptor = "Lve;")
    public static class184 field208 = new class184(64);

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Ljd;")
    public static class85 field221 = class221.method1499("sch-Utteln:", (byte) 109);

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lve;")
    public static class184 field217 = new class184(64);

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field226 = 0;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Z")
    public static boolean field227 = false;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Ljd;")
    public static class85 field225 = class221.method1499("hitmarks", (byte) -125);

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Ljd;")
    public static class85 field223 = class221.method1499(": ", (byte) 106);

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Ljd;")
    private static class85 field229 = class221.method1499("wave:", (byte) 97);

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Ljd;")
    public static class85 field224 = field229;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "Ljd;")
    public static class85 field228 = field229;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lof;")
    private class253 field216;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lge;")
    public static class68 field214;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lof;I)V")
    public final void method108(class253 arg0, int arg1) {
        if (arg1 != 6266) {
            this.method116((byte) -104, (class253) null);
        }
        field207++;
        if (arg0.field4372 != null) {
            arg0.method1753(137);
        }
        arg0.field4372 = this.field209;
        arg0.field4370 = this.field209.field4370;
        arg0.field4372.field4370 = arg0;
        arg0.field4370.field4372 = arg0;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Z")
    public static final boolean method109(int arg0, int arg1) {
        if (arg0 != -12671) {
            method114(76);
        }
        field213++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lof;")
    public final class253 method110(int arg0) {
        field211++;
        if (arg0 != 64) {
            this.method112(1);
        }
        class253 var2 = this.field209.field4370;
        if (this.field209 == var2) {
            this.field216 = null;
            return null;
        } else {
            this.field216 = var2.field4370;
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)Lof;")
    public final class253 method111(byte arg0) {
        field222++;
        if (arg0 != -29) {
            field228 = null;
        }
        class253 var2 = this.field216;
        if (this.field209 == var2) {
            this.field216 = null;
            return null;
        } else {
            this.field216 = var2.field4372;
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class15() {
        this.field209.field4372 = this.field209;
        this.field209.field4370 = this.field209;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public final void method112(int arg0) {
        while (true) {
            class253 var2 = this.field209.field4370;
            if (this.field209 == var2) {
                int var3 = -9 / ((arg0 - 39) / 48);
                this.field216 = null;
                field218++;
                return;
            }
            var2.method1753(137);
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)Lof;")
    public final class253 method113(int arg0) {
        field215++;
        int var2 = 61 / ((-arg0 - 31) / 41);
        class253 var3 = this.field209.field4372;
        if (this.field209 == var3) {
            this.field216 = null;
            return null;
        } else {
            this.field216 = var3.field4372;
            return var3;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public static void method114(int arg0) {
        field223 = null;
        field217 = null;
        field208 = null;
        field214 = null;
        field224 = null;
        field229 = null;
        field221 = null;
        field228 = null;
        int var1 = 64 % ((56 - arg0) / 33);
        field225 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)Lof;")
    public final class253 method115(byte arg0) {
        class253 var2 = this.field209.field4370;
        if (arg0 < 55) {
            field208 = null;
        }
        field219++;
        if (this.field209 == var2) {
            return null;
        } else {
            var2.method1753(137);
            return var2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLof;)V")
    public final void method116(byte arg0, class253 arg1) {
        if (arg1.field4372 != null) {
            arg1.method1753(137);
        }
        arg1.field4372 = this.field209.field4372;
        if (arg0 == -121) {
            arg1.field4370 = this.field209;
            field212++;
            arg1.field4372.field4370 = arg1;
            arg1.field4370.field4372 = arg1;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(B)Lof;")
    public final class253 method117(byte arg0) {
        field210++;
        class253 var2 = this.field216;
        if (this.field209 == var2) {
            this.field216 = null;
            return null;
        }
        if (arg0 < 42) {
            this.method108((class253) null, 43);
        }
        this.field216 = var2.field4370;
        return var2;
    }
}
