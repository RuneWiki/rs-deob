import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class556 {

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Laq;")
    private class494 field7712 = new class494(128);

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lgga;")
    private class513 field7716;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "[Lmha;")
    public static class422[] field7710 = new class422[0];

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field7711;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "[[Luf;")
    public static class519[][] field7720;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Z", line = 3)
    public static final boolean method3205(boolean arg0) {
        field7717++;
        if (!arg0) {
            method3208(true);
        }
        return class582.field8375 == 0 ? class233.field3384.method2823(-26617) : true;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V", line = 19)
    public final void method3206(byte arg0, int arg1) {
        class494 var3 = this.field7712;
        synchronized (this.field7712) {
            if (arg0 <= 54) {
                this.field7716 = null;
            }
            this.field7712.method2888(arg1, 127);
        }
        field7714++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 32)
    public static final void method3207(int arg0) {
        for (int var1 = 0; var1 < class57.field884; var1++) {
            class420 var2 = class278.field4014[var1];
            if (var2.field5830 == 3) {
                if (var2.field5817 == null) {
                    var2.field5814 = Integer.MIN_VALUE;
                } else {
                    class234.field3399.method4220(var2.field5817);
                }
            }
        }
        if (arg0 != -4) {
            field7710 = null;
        }
        field7713++;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)V", line = 62)
    public static void method3208(boolean arg0) {
        field7710 = null;
        if (!arg0) {
            field7720 = null;
        }
        field7720 = null;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(Z)V", line = 73)
    public final void method3209(boolean arg0) {
        field7711++;
        class494 var2 = this.field7712;
        synchronized (this.field7712) {
            this.field7712.method2893((byte) -31);
        }
        if (!arg0) {
            field7720 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Lnaa;", line = 92)
    public final class100 method3210(int arg0, int arg1) {
        field7719++;
        class494 var3 = this.field7712;
        class100 var4;
        synchronized (this.field7712) {
            var4 = (class100) this.field7712.method2882((long) arg1, (byte) -44);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field7716;
        byte[] var6;
        synchronized (this.field7716) {
            var6 = this.field7716.method3019(arg0, arg1, 91);
        }
        class100 var7 = new class100();
        if (var6 != null) {
            var7.method835((byte) 49, new class431(var6));
        }
        class494 var8 = this.field7712;
        synchronized (this.field7712) {
            this.field7712.method2890(arg0 ^ 0xFFFFE374, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 125)
    public final void method3211(byte arg0) {
        class494 var2 = this.field7712;
        synchronized (this.field7712) {
            this.field7712.method2881((byte) -29);
        }
        if (arg0 == 107) {
            field7715++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lmca;ILgga;)V", line = 150)
    public class556(class41 arg0, int arg1, class513 arg2) {
        this.field7716 = arg2;
        this.field7716.method3007(-1, 1);
    }
}
