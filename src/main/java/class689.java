import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class689 extends class498 {

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "Z")
    private boolean field9581 = false;

    @OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
    public int field9584 = 0;

    @OriginalMember(owner = "client!nha", name = "p", descriptor = "Z")
    public boolean field9588 = false;

    @OriginalMember(owner = "client!nha", name = "q", descriptor = "Lhca;")
    private class244 field9589 = new class244();

    @OriginalMember(owner = "client!nha", name = "s", descriptor = "I")
    private int field9591 = 0;

    @OriginalMember(owner = "client!nha", name = "r", descriptor = "Lmba;")
    public class646 field9590 = new class646();

    @OriginalMember(owner = "client!nha", name = "u", descriptor = "I")
    private int field9593 = 0;

    @OriginalMember(owner = "client!nha", name = "t", descriptor = "Z")
    public boolean field9592 = false;

    @OriginalMember(owner = "client!nha", name = "w", descriptor = "Z")
    private boolean field9595 = false;

    @OriginalMember(owner = "client!nha", name = "v", descriptor = "Lik;")
    public class100 field9594 = new class100();

    @OriginalMember(owner = "client!nha", name = "m", descriptor = "[Lnd;")
    public class502[] field9585 = new class502[8192];

    @OriginalMember(owner = "client!nha", name = "n", descriptor = "[Z")
    private static boolean[] field9586 = new boolean[32];

    @OriginalMember(owner = "client!nha", name = "j", descriptor = "[Z")
    private static boolean[] field9582 = new boolean[8];

    @OriginalMember(owner = "client!nha", name = "x", descriptor = "I")
    public int field9596;

    @OriginalMember(owner = "client!nha", name = "k", descriptor = "J")
    private long field9583;

    @OriginalMember(owner = "client!nha", name = "o", descriptor = "J")
    private long field9587;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "()V")
    public static void method3880() {
        field9586 = null;
        field9582 = null;
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "()V")
    public final void method3881() {
        this.field9588 = true;
        for (class14 var1 = (class14) this.field9590.method3618(-91); var1 != null; var1 = (class14) this.field9590.method3619(0)) {
            if (var1.field130.field2729 == 1) {
                var1.method21(126);
            }
        }
        for (int var2 = 0; var2 < this.field9585.length; var2++) {
            if (this.field9585[var2] != null) {
                this.field9585[var2].method3027();
                this.field9585[var2] = null;
            }
        }
        this.field9584 = 0;
        this.field9589 = new class244();
        this.field9591 = 0;
        this.field9590 = new class646();
        this.field9593 = 0;
        this.method3012(123);
        class139.field1983[class173.field2400] = this;
        class173.field2400 = class173.field2400 + 1 & class253.field3708[class709.field9896];
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lha;J[Lmv;[Lnba;Z)V")
    public final void method3882(class548 arg0, long arg1, class44[] arg2, class491[] arg3, boolean arg4) {
        if (!this.field9588) {
            this.method3889(arg0, arg2, arg4);
            this.method3890(arg3, arg4);
            this.field9587 = arg1;
        }
    }

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "()V")
    public final void method3883() {
        this.field9595 = true;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IZ)Lnha;")
    public static final class689 method3884(int arg0, boolean arg1) {
        if (class409.field5846 == class173.field2400) {
            return new class689(arg0, arg1);
        } else {
            class689 var2 = class139.field1983[class409.field5846];
            class409.field5846 = class409.field5846 + 1 & class253.field3708[class709.field9896];
            var2.method3888(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "()Lik;")
    public final class100 method3885() {
        this.field9594.field1384.method3033((byte) 127);
        for (int var1 = 0; var1 < this.field9585.length; var1++) {
            if (this.field9585[var1] != null && this.field9585[var1].field6990 != null) {
                this.field9594.field1384.method3031(this.field9585[var1], 0);
            }
        }
        return this.field9594;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(J)V")
    public final void method3886(long arg0) {
        this.field9587 = arg0;
    }

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "()V")
    private final void method3887() {
        this.field9581 = false;
    }

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "(IZ)V")
    private final void method3888(int arg0, boolean arg1) {
        client.field6236.method1643(this, -48);
        this.field9587 = arg0;
        this.field9583 = arg0;
        this.field9595 = true;
        this.field9592 = arg1;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lha;[Lmv;Z)V")
    private final void method3889(class548 arg0, class44[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field9586[var4] = false;
        }
        label67: for (class677 var5 = (class677) this.field9589.method1638(false); var5 != null; var5 = (class677) this.field9589.method1645(0)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field9394 || arg1[var8].field547 == var5.field9394) {
                        field9586[var8] = true;
                        var5.method3814(2580);
                        var5.field9390 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field9396 == 0) {
                    var5.method3012(117);
                    this.field9591--;
                } else {
                    var5.field9390 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field9591 != 32; var6++) {
            if (!field9586[var6]) {
                class677 var7 = new class677(arg0, arg1[var6], this, this.field9587);
                this.field9589.method1643(var7, -32);
                this.field9591++;
                field9586[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "([Lnba;Z)V")
    private final void method3890(class491[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field9582[var3] = false;
        }
        label76: for (class14 var4 = (class14) this.field9590.method3618(-93); var4 != null; var4 = (class14) this.field9590.method3619(0)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field136 || arg0[var7].field6902 == var4.field136) {
                        field9582[var7] = true;
                        var4.method64((byte) -92);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method549(6410);
                this.field9593--;
                if (var4.method24(-105)) {
                    var4.method21(100);
                    class119.field1572--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field9593 != 8; var5++) {
            if (!field9582[var5]) {
                class14 var6 = null;
                if (arg0[var5].method2982(3000000).field2729 == 1 && class119.field1572 < 32) {
                    var6 = new class14(arg0[var5], this);
                    class524.field7279.method535((long) arg0[var5].field6903, var6, (byte) -128);
                    class119.field1572++;
                }
                if (var6 == null) {
                    var6 = new class14(arg0[var5], this);
                }
                this.field9590.method3610(9289, var6);
                this.field9593++;
                field9582[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "()V")
    public final void method3891() {
        this.field9581 = true;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIIII)V")
    public final void method3892(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9596 = arg0;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method3893(class548 arg0, long arg1) {
        if (this.field9587 == this.field9583) {
            this.method3887();
        } else {
            this.method3891();
        }
        if (arg1 - this.field9587 > 750L) {
            this.method3881();
            return false;
        }
        int var4 = (int) (arg1 - this.field9583);
        if (this.field9595) {
            for (class677 var5 = (class677) this.field9589.method1638(false); var5 != null; var5 = (class677) this.field9589.method1645(0)) {
                for (int var6 = 0; var6 < var5.field9381.field8343; var6++) {
                    var5.method3815(42, arg1, !this.field9581, arg0, 1);
                }
            }
            this.field9595 = false;
        }
        for (class677 var7 = (class677) this.field9589.method1638(false); var7 != null; var7 = (class677) this.field9589.method1645(0)) {
            var7.method3815(-86, arg1, !this.field9581, arg0, var4);
        }
        this.field9583 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lha;)V")
    public final void method3894(class548 arg0) {
        this.field9594.field1384.method3033((byte) 91);
        for (class677 var2 = (class677) this.field9589.method1638(false); var2 != null; var2 = (class677) this.field9589.method1645(0)) {
            var2.method3812(this.field9583, arg0, false);
        }
    }

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "()Lik;")
    public final class100 method3895() {
        return this.field9594;
    }

    @OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(IZ)V")
    private class689(int arg0, boolean arg1) {
        this.method3888(arg0, arg1);
    }
}
