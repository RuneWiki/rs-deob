import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class6 implements class617 {

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "Lki;")
    private class261 field49;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "[Lmv;")
    private class415[] field56;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "F")
    public static float field55 = 1.0F;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "Loa;")
    private class689 field52;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "Z")
    private boolean field59;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I", line = 3)
    public final int method35(int arg0) {
        field54++;
        int var2 = 0;
        class415[] var3 = this.field56;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class415 var5 = var3[var4];
            if (var5 == null || var5.method193(-29581)) {
                var2++;
            }
        }
        if (arg0 != 18342) {
            this.method40(false);
        }
        return var2 * 100 / this.field56.length;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Z", line = 32)
    public final boolean method36(byte arg0) {
        int var2 = 25 / ((12 - arg0) / 32);
        field48++;
        return class556.field7597 >= this.field49.field3596;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)I", line = 48)
    public static final int method37(int arg0) {
        field58++;
        class560 var1 = class445.field6125;
        synchronized (class445.field6125) {
            int var2 = -24 / ((-arg0 - 72) / 44);
            return class445.field6125.method3143(112);
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(Z)V", line = 60)
    public static final void method38(boolean arg0) {
        field47++;
        class527.field7298 = null;
        class316.field4603 = null;
        class572.field7935 = null;
        if (!arg0) {
            field50 = 37;
        }
        class99.field1205 = null;
        class59.field822 = null;
        class422.field5875 = false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 76)
    public final void method39(int arg0) {
        field57++;
        if (class9.field103 != this.field52) {
            this.field59 = true;
            this.field52 = class9.field103;
        }
        this.field52.method806(0);
        class415[] var2 = this.field56;
        if (arg0 < 105) {
            method38(false);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class415 var4 = var2[var3];
            if (var4 != null) {
                var4.method191((byte) -53);
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 109)
    public final void method40(boolean arg0) {
        if (arg0) {
            field53++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lki;Lfda;)V", line = 122)
    public class6(class261 arg0, class609 arg1) {
        this.field49 = arg0;
        this.field56 = new class415[this.field49.field3597.length];
        for (int var3 = 0; var3 < this.field56.length; var3++) {
            this.field56[var3] = arg1.method3360(this.field49.field3597[var3], -407384121);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V", line = 143)
    public final void method41(boolean arg0, int arg1) {
        if (arg1 != 7571) {
            return;
        }
        field60++;
        boolean var3 = true;
        class415[] var4 = this.field56;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class415 var6 = var4[var5];
            if (var6 != null) {
                var6.method277(var3 || this.field59, (byte) -26);
            }
        }
        this.field59 = false;
    }
}
