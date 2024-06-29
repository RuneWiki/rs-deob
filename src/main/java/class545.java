import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class545 {

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "Lme;")
    private class668 field7081 = new class668(64);

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "Lme;")
    public class668 field7084 = new class668(64);

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "Lpe;")
    private class615 field7080;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Lpe;")
    public class615 field7079;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "[[Z")
    public static boolean[][] field7076 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field7077;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public static int field7082;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "[I")
    public static int[] field7072;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method2889(int arg0) {
        field7072 = null;
        int var1 = 73 / ((arg0 - 36) / 52);
        field7076 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)Lgca;")
    public final class631 method2890(byte arg0, int arg1) {
        field7074++;
        class668 var3 = this.field7081;
        class631 var4;
        synchronized (this.field7081) {
            var4 = (class631) this.field7081.method3655(15, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field7080;
        byte[] var6;
        synchronized (this.field7080) {
            var6 = this.field7080.method3346(-1, 34, arg1);
        }
        class631 var7 = new class631();
        var7.field8807 = this;
        if (var6 != null) {
            var7.method3498(false, new class418(var6));
        }
        int var8 = 84 % ((-arg0 - 70) / 55);
        class668 var9 = this.field7081;
        synchronized (this.field7081) {
            this.field7081.method3650((long) arg1, -125, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)V")
    public final void method2891(int arg0, int arg1, int arg2) {
        field7077++;
        this.field7081 = new class668(arg2);
        if (arg1 != 34) {
            field7072 = null;
        }
        this.field7084 = new class668(arg0);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
    public final void method2892(int arg0) {
        class668 var2 = this.field7081;
        synchronized (this.field7081) {
            this.field7081.method3656((byte) 0);
        }
        field7073++;
        class668 var3 = this.field7084;
        synchronized (this.field7084) {
            this.field7084.method3656((byte) 0);
        }
        int var4 = -45 / ((arg0 - 17) / 58);
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)V")
    public final void method2893(int arg0) {
        field7082++;
        class668 var2 = this.field7081;
        synchronized (this.field7081) {
            this.field7081.method3658(0);
            if (arg0 != 4178) {
                this.field7081 = null;
            }
        }
        class668 var3 = this.field7084;
        synchronized (this.field7084) {
            this.field7084.method3658(0);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(BI)V")
    public final void method2894(byte arg0, int arg1) {
        if (arg0 != 103) {
            this.field7081 = null;
        }
        field7083++;
        class668 var3 = this.field7081;
        synchronized (this.field7081) {
            this.field7081.method3659(-107, arg1);
        }
        class668 var4 = this.field7084;
        synchronized (this.field7084) {
            this.field7084.method3659(arg0 - 224, arg1);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ID)V")
    public static final void method2895(int arg0, double arg1) {
        field7078++;
        int var3 = -106 / ((arg0 + 56) / 44);
        if (class291.field3773 == arg1) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg1) * 255.0D);
            class303.field3968[var4] = var5 > 255 ? 255 : var5;
        }
        class291.field3773 = arg1;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lvd;ILpe;Lpe;)V")
    public class545(class635 arg0, int arg1, class615 arg2, class615 arg3) {
        this.field7080 = arg2;
        this.field7079 = arg3;
        this.field7080.method3341(34, -19046);
    }
}
