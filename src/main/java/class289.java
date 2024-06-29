import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class289 {

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Luaa;")
    private class395 field4194 = new class395(64);

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lgp;")
    private class561 field4190;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4189;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "[Z")
    public static boolean[] field4193;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field4192;

    static {
        new class567("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field4189 = new String[200];
        field4193 = new boolean[200];
        field4191 = 0;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 4)
    public final void method1828(int arg0, int arg1) {
        field4187++;
        class395 var3 = this.field4194;
        synchronized (this.field4194) {
            int var4 = 98 / ((arg1 - 65) / 39);
            this.field4194.method2397(arg0, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 33)
    public final void method1829(int arg0) {
        field4186++;
        if (arg0 == 200) {
            class395 var2 = this.field4194;
            synchronized (this.field4194) {
                this.field4194.method2404((byte) -95);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 47)
    public final void method1830(byte arg0) {
        class395 var2 = this.field4194;
        synchronized (this.field4194) {
            this.field4194.method2406(107);
        }
        if (arg0 > -78) {
            this.method1830((byte) -56);
        }
        field4188++;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)Lhv;", line = 62)
    public final class188 method1831(int arg0, int arg1) {
        field4192++;
        class395 var3 = this.field4194;
        class188 var4;
        synchronized (this.field4194) {
            var4 = (class188) this.field4194.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field4190;
        byte[] var7;
        synchronized (this.field4190) {
            if (arg0 > -9) {
                return null;
            }
            var7 = this.field4190.method3175(arg1, (byte) -53, 11);
        }
        class188 var8 = new class188();
        if (var7 != null) {
            var8.method1255(3, new class268(var7));
        }
        class395 var9 = this.field4194;
        synchronized (this.field4194) {
            this.field4194.method2408(var8, (long) arg1, -124);
            return var8;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Ljc;ILgp;)V", line = 103)
    public class289(class584 arg0, int arg1, class561 arg2) {
        this.field4190 = arg2;
        if (this.field4190 != null) {
            this.field4190.method3164(11, true);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 124)
    public static void method1832(int arg0) {
        if (arg0 >= 99) {
            field4193 = null;
            field4189 = null;
        }
    }
}
