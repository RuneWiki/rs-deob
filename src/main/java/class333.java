import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class333 implements class26 {

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "Leu;")
    private class199 field4765;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "[Lrd;")
    private class509[] field4766;

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "[I")
    public static int[] field4774 = new int[2];

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "Lqk;")
    public static class1 field4764 = new class1(62, -1);

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "Z")
    public static boolean field4775 = false;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "Lha;")
    private class473 field4763;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "Z")
    private boolean field4770;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    public final void method109(int arg0) {
        if (arg0 < -103) {
            field4772++;
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(BJ)Z")
    public final boolean method110(byte arg0, long arg1) {
        int var4 = -27 % ((arg0 - 71) / 42);
        field4767++;
        return class683.method3903((byte) 4) >= (long) this.field4765.field2809 + arg1;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(ZI)V")
    public final void method114(boolean arg0, int arg1) {
        boolean var3 = true;
        field4773++;
        class509[] var4 = this.field4766;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class509 var6 = var4[var5];
            if (var6 != null) {
                var6.method939(7998, var3 || this.field4770);
            }
        }
        this.field4770 = false;
        if (arg1 != 30453) {
            field4774 = null;
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)I")
    public final int method111(int arg0) {
        field4762++;
        return arg0 >= -67 ? -28 : this.field4765.field2808;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)V")
    public final void method112(boolean arg0) {
        field4771++;
        if (class111.field1332 != this.field4763) {
            this.field4763 = class111.field1332;
            this.field4770 = true;
        }
        this.field4763.method230(0);
        if (arg0) {
            return;
        }
        class509[] var2 = this.field4766;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class509 var4 = var2[var3];
            if (var4 != null) {
                var4.method938(112);
            }
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
    public static void method2117(byte arg0) {
        field4764 = null;
        field4774 = null;
        if (arg0 != -75) {
            method2117((byte) -52);
        }
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)I")
    public final int method113(int arg0) {
        field4769++;
        int var2 = 0;
        if (arg0 != -7350) {
            this.method112(true);
        }
        class509[] var3 = this.field4766;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class509 var5 = var3[var4];
            if (var5 == null || var5.method941((byte) -79)) {
                var2++;
            }
        }
        return var2 * 100 / this.field4766.length;
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Leu;Lbd;)V")
    public class333(class199 arg0, class482 arg1) {
        this.field4765 = arg0;
        this.field4766 = new class509[this.field4765.field2810.length];
        for (int var3 = 0; var3 < this.field4766.length; var3++) {
            this.field4766[var3] = arg1.method2862(this.field4765.field2810[var3], -1);
        }
    }
}
