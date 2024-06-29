import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class409 {

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    private int field5642 = -1;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    private int field5640 = -1;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    private int field5643 = 0;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    private int field5644 = 0;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lbb;")
    private class270 field5645 = new class270();

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Z")
    private boolean field5647 = true;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Z")
    private boolean field5650 = true;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Z")
    private boolean field5649 = false;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    private int field5651 = 0;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    private int field5646 = -1;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Z")
    private boolean field5653 = true;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "[Lbj;")
    private class313[] field5654 = new class313[2];

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lh;")
    private class327 field5639;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lao;")
    private class260 field5641;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Lbj;")
    private class313 field5652;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Loh;")
    private class385 field5648;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()V")
    public final void method2535() {
        if (!this.method2537()) {
            return;
        }
        opengl var1 = this.field5639.field4363;
        this.field5639.method2094();
        this.field5639.method2092(0);
        this.field5639.method732();
        int var2 = 0;
        int var3 = 1;
        class16 var5;
        for (class16 var4 = (class16) this.field5645.method1690((byte) -118); var4 != null; var4 = var5) {
            var5 = (class16) this.field5645.method1699((byte) 72);
            int var6 = var4.method90((byte) -99);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method98(var7, this.field5654[var2], this.field5652);
                if (var5 == null && var6 - 1 == var7) {
                    this.field5639.method2103(this.field5641);
                    this.field5639.method2048(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field5640);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field5644, this.field5643);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field5644, this.field5643 + this.field5640);
                    var1.glTexCoord2f((float) this.field5642, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field5644 + this.field5642, this.field5643 + this.field5640);
                    var1.glTexCoord2f((float) this.field5642, (float) this.field5640);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field5644 + this.field5642, this.field5643);
                    var1.glEnd();
                } else {
                    this.field5641.method1646(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field5640);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field5640);
                    var1.glTexCoord2f((float) this.field5642, (float) this.field5640);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field5642, this.field5640);
                    var1.glTexCoord2f((float) this.field5642, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field5642, 0);
                    var1.glEnd();
                }
                var4.method96(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lir;)V")
    public final void method2536(class16 arg0) {
        this.method2541(arg0, true);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()Z")
    private final boolean method2537() {
        return this.field5639.method2084() == this.field5641;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Lir;)Z")
    public final boolean method2538(class16 arg0) {
        if (this.field5641 != null) {
            if (arg0.method92() || arg0.method95()) {
                if (this.field5642 != -1 && this.field5640 != -1) {
                    arg0.method93(this.field5642, this.field5640);
                }
                arg0.field182 = true;
                this.field5645.method1696(false, arg0);
                this.method2539();
                return true;
            }
            arg0.method91();
        }
        return false;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()V")
    private final void method2539() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class16 var4 = (class16) this.field5645.method1690((byte) -123); var4 != null; var4 = (class16) this.field5645.method1699((byte) 58)) {
            int var5 = var4.method89();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method90((byte) -117);
            var3 |= var4.method97(1);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field5646 != var6) {
            this.field5646 = var6;
            this.field5650 = true;
        }
        int var7 = this.field5651 > 2 ? 2 : this.field5651;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field5653 = this.field5650 = true;
        }
        if (this.field5649 != var3) {
            this.field5649 = var3;
            this.field5647 = true;
        }
        this.field5651 = var2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)Z")
    public final boolean method2540(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5641 == null || this.field5645.method1698(0)) {
            return false;
        }
        boolean var5 = false;
        if (this.field5642 != arg2 || this.field5640 != arg3) {
            this.field5642 = arg2;
            this.field5640 = arg3;
            for (class43 var6 = this.field5645.method1690((byte) -115); var6 != this.field5645.field3483; var6 = var6.field508) {
                ((class16) var6).method93(this.field5642, this.field5640);
            }
            this.field5650 = true;
            this.field5647 = true;
        }
        if (this.field5647) {
            if (this.field5648 != null) {
                this.field5648.method2399();
                this.field5648 = null;
            }
            if (this.field5652 != null) {
                this.field5652.method1495();
                this.field5652 = null;
            }
            if (this.field5649) {
                this.field5652 = new class313(this.field5639, 34037, 6402, this.field5642, this.field5640);
            } else {
                this.field5648 = new class385(this.field5639, 6402, this.field5642, this.field5640);
            }
            this.field5653 = true;
            this.field5647 = false;
            var5 = true;
        }
        if (this.field5650) {
            if (this.field5654[0] != null) {
                this.field5654[0].method1495();
                this.field5654[0] = null;
            }
            if (this.field5654[1] != null) {
                this.field5654[1].method1495();
                this.field5654[1] = null;
            }
            this.field5654[0] = new class313(this.field5639, 34037, this.field5646, this.field5642, this.field5640);
            this.field5654[1] = this.field5651 > 1 ? new class313(this.field5639, 34037, this.field5646, this.field5642, this.field5640) : null;
            this.field5653 = true;
            this.field5650 = false;
            var5 = true;
        }
        int var7 = this.field5639.method2084().method511();
        this.field5639.method2117(this.field5641);
        if (this.field5653) {
            this.field5641.method1643(0);
            this.field5641.method1643(1);
            this.field5641.method1643(8);
            if (this.field5654[0] != null) {
                this.field5641.method1640(0, this.field5654[0]);
            }
            if (this.field5654[1] != null) {
                this.field5641.method1640(1, this.field5654[1]);
            }
            if (this.field5652 != null) {
                this.field5641.method1640(8, this.field5652);
            }
            if (this.field5648 != null) {
                this.field5641.method1641(8, this.field5648);
            }
            this.field5641.method1646(0);
            this.field5653 = false;
            var5 = true;
        }
        if (!var5 || this.field5641.method1644()) {
            this.field5644 = arg0;
            this.field5643 = arg1;
            this.field5639.method2048(-this.field5644, this.field5643 + this.field5640 - var7);
            return true;
        }
        this.field5639.method2103(this.field5641);
        this.field5650 = true;
        this.field5647 = true;
        this.field5653 = true;
        return false;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lir;Z)V")
    private final void method2541(class16 arg0, boolean arg1) {
        if (arg1) {
            arg0.method91();
        }
        arg0.field182 = false;
        arg0.method263(false);
        this.method2539();
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "()V")
    public final void method2542() {
        if (this.field5641 != null) {
            this.field5641 = null;
            this.field5654 = null;
            this.field5648 = null;
            this.field5652 = null;
            this.field5650 = true;
            this.field5647 = true;
            this.field5653 = true;
            if (!this.field5645.method1698(0)) {
                for (class43 var1 = this.field5645.method1690((byte) -123); var1 != this.field5645.field3483; var1 = var1.field508) {
                    ((class16) var1).method91();
                }
            }
        }
        this.field5642 = this.field5640 = -1;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lh;)V")
    public class409(class327 arg0) {
        this.field5639 = arg0;
        if (this.field5639.field4405 && this.field5639.field4475) {
            this.field5641 = new class260(this.field5639);
        }
    }
}
