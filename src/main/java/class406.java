import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class406 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Lge;")
    private class511 field5767 = new class511(64);

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lci;")
    private class320 field5771;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[[I")
    public static int[][] field5773 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field5774 = 0;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "[I")
    public static int[] field5778 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lvr;")
    public static class92 field5769 = new class92(6, 0, 4, 2);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5768;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field5777;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lba;")
    public static class269 field5775;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lad;", line = 3)
    public final class299 method2419(int arg0, int arg1) {
        field5777++;
        class511 var3 = this.field5767;
        class299 var4;
        synchronized (this.field5767) {
            var4 = (class299) this.field5767.method2982(0, (long) arg1);
            if (arg0 != 2) {
                field5774 = 46;
            }
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field5771;
        byte[] var6;
        synchronized (this.field5771) {
            var6 = this.field5771.method2037(arg1, (byte) 108, 31);
        }
        class299 var7 = new class299();
        if (var6 != null) {
            var7.method1923(arg0 - 7, new class519(var6));
        }
        class511 var8 = this.field5767;
        synchronized (this.field5767) {
            this.field5767.method2981(var7, arg0 ^ 0x59, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 35)
    public static void method2420(boolean arg0) {
        field5773 = null;
        field5775 = null;
        field5778 = null;
        field5769 = null;
        if (arg0) {
            field5778 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILo;)V", line = 52)
    public static final void method2421(int arg0, class24 arg1) {
        class146.field2262[arg0] = arg1;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V", line = 56)
    public final void method2422(int arg0, int arg1) {
        class511 var3 = this.field5767;
        synchronized (this.field5767) {
            int var4 = -117 % ((-arg0 - 64) / 36);
            this.field5767.method2989(false, arg1);
        }
        field5772++;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V", line = 68)
    public final void method2423(boolean arg0) {
        if (!arg0) {
            method2420(true);
        }
        field5768++;
        class511 var2 = this.field5767;
        synchronized (this.field5767) {
            this.field5767.method2980(-182819096);
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lsn;ILci;)V", line = 113)
    public class406(class453 arg0, int arg1, class320 arg2) {
        this.field5771 = arg2;
        this.field5771.method2030(-10914, 31);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V", line = 98)
    public final void method2424(int arg0) {
        class511 var2 = this.field5767;
        synchronized (this.field5767) {
            this.field5767.method2990((byte) -58);
        }
        if (arg0 != 0) {
            this.field5767 = null;
        }
        field5770++;
    }
}
