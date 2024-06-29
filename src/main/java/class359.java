import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class359 {

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    private int field4994 = -1;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    private int field4995 = 0;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    private int field4992 = 0;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    private int field4997 = -1;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "Lsm;")
    private class249 field4993 = new class249();

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "Z")
    private boolean field5001 = false;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    private int field5002 = 0;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    private int field4998 = -1;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "Z")
    private boolean field5005 = true;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "Z")
    private boolean field5003 = true;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "[Lai;")
    private class201[] field5004 = new class201[2];

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Z")
    private boolean field4999 = true;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Lqi;")
    private class458 field4996;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "Lct;")
    private class273 field4991;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "Lai;")
    private class201 field5000;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "Lmn;")
    private class264 field5006;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "()V", line = 3)
    public final void method2147() {
        if (this.field4991 != null) {
            this.field4991 = null;
            this.field5004 = null;
            this.field5006 = null;
            this.field5000 = null;
            this.field4999 = true;
            this.field5005 = true;
            this.field5003 = true;
            if (!this.field4993.method1549(2)) {
                for (class180 var1 = this.field4993.method1544(-85); var1 != this.field4993.field3504; var1 = var1.field2610) {
                    ((class40) var1).method328();
                }
            }
        }
        this.field4997 = this.field4994 = -1;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lwn;)V", line = 31)
    public final void method2148(class40 arg0) {
        this.method2150(arg0, true);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "()V", line = 38)
    public final void method2149() {
        if (!this.method2154()) {
            return;
        }
        opengl var1 = this.field4996.field6330;
        this.field4996.method2704();
        this.field4996.method2653(0);
        this.field4996.method1137();
        int var2 = 0;
        int var3 = 1;
        class40 var5;
        for (class40 var4 = (class40) this.field4993.method1544(-117); var4 != null; var4 = var5) {
            var5 = (class40) this.field4993.method1546((byte) -42);
            int var6 = var4.method330(true);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method324(var7, this.field5004[var2], this.field5000);
                if (var5 == null && var6 - 1 == var7) {
                    this.field4996.method2657(this.field4991);
                    this.field4996.method2650(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field4994);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field4992, this.field4995);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field4992, this.field4995 + this.field4994);
                    var1.glTexCoord2f((float) this.field4997, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4997 + this.field4992, this.field4995 + this.field4994);
                    var1.glTexCoord2f((float) this.field4997, (float) this.field4994);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4997 + this.field4992, this.field4995);
                    var1.glEnd();
                } else {
                    this.field4991.method1714(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field4994);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field4994);
                    var1.glTexCoord2f((float) this.field4997, (float) this.field4994);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field4997, this.field4994);
                    var1.glTexCoord2f((float) this.field4997, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field4997, 0);
                    var1.glEnd();
                }
                var4.method331(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lwn;Z)V", line = 115)
    private final void method2150(class40 arg0, boolean arg1) {
        if (arg1) {
            arg0.method328();
        }
        arg0.field677 = false;
        arg0.method1182(28818);
        this.method2152();
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lqi;)V", line = 361)
    public class359(class458 arg0) {
        this.field4996 = arg0;
        if (this.field4996.field6405 && this.field4996.field6402) {
            this.field4991 = new class273(this.field4996);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Lwn;)Z", line = 136)
    public final boolean method2151(class40 arg0) {
        if (this.field4991 != null) {
            if (arg0.method325() || arg0.method323()) {
                if (this.field4997 != -1 && this.field4994 != -1) {
                    arg0.method327(this.field4997, this.field4994);
                }
                arg0.field677 = true;
                this.field4993.method1553((byte) -123, arg0);
                this.method2152();
                return true;
            }
            arg0.method328();
        }
        return false;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "()V", line = 162)
    private final void method2152() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class40 var4 = (class40) this.field4993.method1544(-109); var4 != null; var4 = (class40) this.field4993.method1546((byte) -42)) {
            int var5 = var4.method326();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method330(true);
            var3 |= var4.method329(39);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4998 != var6) {
            this.field4998 = var6;
            this.field4999 = true;
        }
        int var7 = this.field5002 > 2 ? 2 : this.field5002;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field5003 = this.field4999 = true;
        }
        if (this.field5001 != var3) {
            this.field5001 = var3;
            this.field5005 = true;
        }
        this.field5002 = var2;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII)Z", line = 214)
    public final boolean method2153(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4991 == null || this.field4993.method1549(2)) {
            return false;
        }
        boolean var5 = false;
        if (this.field4997 != arg2 || this.field4994 != arg3) {
            this.field4997 = arg2;
            this.field4994 = arg3;
            for (class180 var6 = this.field4993.method1544(-123); var6 != this.field4993.field3504; var6 = var6.field2610) {
                ((class40) var6).method327(this.field4997, this.field4994);
            }
            this.field4999 = true;
            this.field5005 = true;
        }
        if (this.field5005) {
            if (this.field5006 != null) {
                this.field5006.method1669();
                this.field5006 = null;
            }
            if (this.field5000 != null) {
                this.field5000.method1166();
                this.field5000 = null;
            }
            if (this.field5001) {
                this.field5000 = new class201(this.field4996, 34037, 6402, this.field4997, this.field4994);
            } else {
                this.field5006 = new class264(this.field4996, 6402, this.field4997, this.field4994);
            }
            this.field5003 = true;
            this.field5005 = false;
            var5 = true;
        }
        if (this.field4999) {
            if (this.field5004[0] != null) {
                this.field5004[0].method1166();
                this.field5004[0] = null;
            }
            if (this.field5004[1] != null) {
                this.field5004[1].method1166();
                this.field5004[1] = null;
            }
            this.field5004[0] = new class201(this.field4996, 34037, this.field4998, this.field4997, this.field4994);
            this.field5004[1] = this.field5002 > 1 ? new class201(this.field4996, 34037, this.field4998, this.field4997, this.field4994) : null;
            this.field5003 = true;
            this.field4999 = false;
            var5 = true;
        }
        int var7 = this.field4996.method2685().method1713();
        this.field4996.method2680(this.field4991);
        if (this.field5003) {
            this.field4991.method1712(0);
            this.field4991.method1712(1);
            this.field4991.method1712(8);
            if (this.field5004[0] != null) {
                this.field4991.method1715(0, this.field5004[0]);
            }
            if (this.field5004[1] != null) {
                this.field4991.method1715(1, this.field5004[1]);
            }
            if (this.field5000 != null) {
                this.field4991.method1715(8, this.field5000);
            }
            if (this.field5006 != null) {
                this.field4991.method1716(8, this.field5006);
            }
            this.field4991.method1714(0);
            this.field5003 = false;
            var5 = true;
        }
        if (!var5 || this.field4991.method1719()) {
            this.field4992 = arg0;
            this.field4995 = arg1;
            this.field4996.method2650(-this.field4992, this.field4995 + this.field4994 - var7);
            return true;
        }
        this.field4996.method2657(this.field4991);
        this.field4999 = true;
        this.field5005 = true;
        this.field5003 = true;
        return false;
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "()Z", line = 323)
    private final boolean method2154() {
        return this.field4996.method2685() == this.field4991;
    }
}
