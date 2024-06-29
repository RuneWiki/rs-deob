import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class63 {

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "Lie;")
    public class5 field906 = new class5();

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "Lni;")
    public static class367 field891 = new class367(33, 8);

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "Lla;")
    public static class319 field907 = new class319(84, -2);

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "Luu;")
    public static class191 field895;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "Lie;")
    private class5 field908;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Lie;")
    public final class5 method445(int arg0) {
        if (arg0 != 33) {
            this.method456(null, -102, null);
        }
        field905++;
        class5 var2 = this.field906.field39;
        if (this.field906 == var2) {
            this.field908 = null;
            return null;
        } else {
            this.field908 = var2.field39;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I")
    public final int method446(int arg0) {
        field898++;
        int var2 = 0;
        class5 var3 = this.field906.field39;
        if (arg0 != 4090) {
            this.field906 = null;
        }
        while (this.field906 != var3) {
            var3 = var3.field39;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)Lie;")
    public final class5 method447(int arg0) {
        if (arg0 != 8) {
            this.method453((byte) 109, null);
        }
        field900++;
        class5 var2 = this.field906.field39;
        if (this.field906 == var2) {
            return null;
        } else {
            var2.method25(-13489);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILie;)V")
    public final void method448(int arg0, class5 arg1) {
        if (arg1.field36 != null) {
            arg1.method25(-13489);
        }
        field896++;
        arg1.field39 = this.field906.field39;
        arg1.field36 = this.field906;
        arg1.field36.field39 = arg1;
        arg1.field39.field36 = arg1;
        int var3 = -46 / ((59 - arg0) / 40);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Z")
    public static final boolean method449(int arg0, int arg1, int arg2) {
        if (arg1 != -3463) {
            field895 = null;
        }
        field904++;
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
    public final void method450(byte arg0) {
        while (true) {
            class5 var2 = this.field906.field39;
            if (this.field906 == var2) {
                field901++;
                this.field908 = null;
                if (arg0 != 73) {
                    this.method455(true);
                    return;
                }
                return;
            }
            var2.method25(-13489);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)Lie;")
    public final class5 method451(boolean arg0) {
        field899++;
        class5 var2 = this.field908;
        if (arg0) {
            return null;
        } else if (this.field906 == var2) {
            this.field908 = null;
            return null;
        } else {
            this.field908 = var2.field39;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lps;B)V")
    public final void method452(class63 arg0, byte arg1) {
        field897++;
        if (arg1 >= -120) {
            this.method457(-47);
        }
        this.method456(this.field906.field39, -92, arg0);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLie;)V")
    public final void method453(byte arg0, class5 arg1) {
        field902++;
        if (arg1.field36 != null) {
            arg1.method25(-13489);
        }
        arg1.field36 = this.field906.field36;
        arg1.field39 = this.field906;
        arg1.field36.field39 = arg1;
        arg1.field39.field36 = arg1;
        if (arg0 < 101) {
            method454((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(B)V")
    public static void method454(byte arg0) {
        if (arg0 != 119) {
            field891 = null;
        }
        field891 = null;
        field907 = null;
        field895 = null;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(Z)Z")
    public final boolean method455(boolean arg0) {
        if (!arg0) {
            this.method446(-22);
        }
        field903++;
        return this.field906.field39 == this.field906;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lie;ILps;)V")
    private final void method456(class5 arg0, int arg1, class63 arg2) {
        field892++;
        class5 var4 = this.field906.field36;
        if (arg1 > -69) {
            return;
        }
        this.field906.field36 = arg0.field36;
        arg0.field36.field39 = this.field906;
        if (this.field906 != arg0) {
            arg0.field36 = arg2.field906.field36;
            arg0.field36.field39 = arg0;
            arg2.field906.field36 = var4;
            var4.field39 = arg2.field906;
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
    public class63() {
        this.field906.field39 = this.field906;
        this.field906.field36 = this.field906;
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Lie;")
    public final class5 method457(int arg0) {
        field910++;
        class5 var2 = this.field906.field36;
        if (arg0 != -2) {
            this.method447(-79);
        }
        if (this.field906 == var2) {
            this.field908 = null;
            return null;
        } else {
            this.field908 = var2.field36;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)Lie;")
    public final class5 method458(byte arg0) {
        int var2 = -114 / ((arg0 + 68) / 44);
        field893++;
        class5 var3 = this.field908;
        if (this.field906 == var3) {
            this.field908 = null;
            return null;
        } else {
            this.field908 = var3.field36;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(B)J")
    public static final long method459(byte arg0) {
        field909++;
        if (arg0 != 101) {
            method459((byte) -31);
        }
        return class235.field3332.method385((byte) -71);
    }
}
