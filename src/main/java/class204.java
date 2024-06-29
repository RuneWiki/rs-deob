import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class204 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    private int field2755 = -1;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    private int field2759 = -1;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    private int field2757 = 0;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    private int field2760 = 0;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Lld;")
    private class105 field2756 = new class105();

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    private int field2761 = -1;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Z")
    private boolean field2762 = true;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Z")
    private boolean field2763 = true;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    private int field2764 = 0;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "[Lal;")
    private class58[] field2767 = new class58[2];

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Z")
    private boolean field2766 = false;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Z")
    private boolean field2769 = true;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lbf;")
    private class344 field2754;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lua;")
    private class435 field2758;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lpq;")
    private class116 field2765;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lal;")
    private class58 field2768;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Luk;)Z")
    public final boolean method1161(class157 arg0) {
        if (this.field2758 != null) {
            if (arg0.method924() || arg0.method916()) {
                if (this.field2755 != -1 && this.field2759 != -1) {
                    arg0.method922(this.field2755, this.field2759);
                }
                arg0.field2173 = true;
                this.field2756.method641(arg0, (byte) -93);
                this.method1162();
                return true;
            }
            arg0.method921();
        }
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
    private final void method1162() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class157 var4 = (class157) this.field2756.method652((byte) 37); var4 != null; var4 = (class157) this.field2756.method653(77)) {
            int var5 = var4.method917();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method919(120);
            var3 |= var4.method918((byte) -111);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field2761 != var6) {
            this.field2761 = var6;
            this.field2769 = true;
        }
        int var7 = this.field2764 > 2 ? 2 : this.field2764;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field2762 = this.field2769 = true;
        }
        if (this.field2766 != var3) {
            this.field2766 = var3;
            this.field2763 = true;
        }
        this.field2764 = var2;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
    public final void method1163() {
        if (!this.method1165()) {
            return;
        }
        opengl var1 = this.field2754.field4604;
        this.field2754.method2055();
        this.field2754.method1957(0);
        this.field2754.method2006();
        int var2 = 0;
        int var3 = 1;
        class157 var5;
        for (class157 var4 = (class157) this.field2756.method652((byte) 37); var4 != null; var4 = var5) {
            var5 = (class157) this.field2756.method653(49);
            int var6 = var4.method919(102);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method925(var7, this.field2767[var2], this.field2768);
                if (var5 == null && var6 - 1 == var7) {
                    this.field2754.method2063(this.field2758);
                    this.field2754.method2092(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field2759);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field2760, this.field2757);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field2760, this.field2759 + this.field2757);
                    var1.glTexCoord2f((float) this.field2755, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field2760 + this.field2755, this.field2759 + this.field2757);
                    var1.glTexCoord2f((float) this.field2755, (float) this.field2759);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field2760 + this.field2755, this.field2757);
                    var1.glEnd();
                } else {
                    this.field2758.method2563(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field2759);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field2759);
                    var1.glTexCoord2f((float) this.field2755, (float) this.field2759);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field2755, this.field2759);
                    var1.glTexCoord2f((float) this.field2755, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field2755, 0);
                    var1.glEnd();
                }
                var4.method923(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Luk;Z)V")
    private final void method1164(class157 arg0, boolean arg1) {
        if (arg1) {
            arg0.method921();
        }
        arg0.field2173 = false;
        arg0.method2614((byte) -108);
        this.method1162();
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()Z")
    private final boolean method1165() {
        return this.field2754.method2049() == this.field2758;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()V")
    public final void method1166() {
        if (this.field2758 != null) {
            this.field2758 = null;
            this.field2767 = null;
            this.field2765 = null;
            this.field2768 = null;
            this.field2769 = true;
            this.field2763 = true;
            this.field2762 = true;
            if (!this.field2756.method651((byte) -108)) {
                for (class445 var1 = this.field2756.method652((byte) 37); var1 != this.field2756.field1573; var1 = var1.field6046) {
                    ((class157) var1).method921();
                }
            }
        }
        this.field2755 = this.field2759 = -1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)Z")
    public final boolean method1167(int arg0, int arg1, int arg2, int arg3) {
        if (this.field2758 == null || this.field2756.method651((byte) -114)) {
            return false;
        }
        boolean var5 = false;
        if (this.field2755 != arg2 || this.field2759 != arg3) {
            this.field2755 = arg2;
            this.field2759 = arg3;
            for (class445 var6 = this.field2756.method652((byte) 37); var6 != this.field2756.field1573; var6 = var6.field6046) {
                ((class157) var6).method922(this.field2755, this.field2759);
            }
            this.field2769 = true;
            this.field2763 = true;
        }
        if (this.field2763) {
            if (this.field2765 != null) {
                this.field2765.method734();
                this.field2765 = null;
            }
            if (this.field2768 != null) {
                this.field2768.method2366();
                this.field2768 = null;
            }
            if (this.field2766) {
                this.field2768 = new class58(this.field2754, 34037, 6402, this.field2755, this.field2759);
            } else {
                this.field2765 = new class116(this.field2754, 6402, this.field2755, this.field2759);
            }
            this.field2762 = true;
            this.field2763 = false;
            var5 = true;
        }
        if (this.field2769) {
            if (this.field2767[0] != null) {
                this.field2767[0].method2366();
                this.field2767[0] = null;
            }
            if (this.field2767[1] != null) {
                this.field2767[1].method2366();
                this.field2767[1] = null;
            }
            this.field2767[0] = new class58(this.field2754, 34037, this.field2761, this.field2755, this.field2759);
            this.field2767[1] = this.field2764 > 1 ? new class58(this.field2754, 34037, this.field2761, this.field2755, this.field2759) : null;
            this.field2762 = true;
            this.field2769 = false;
            var5 = true;
        }
        int var7 = this.field2754.method2049().method1497();
        this.field2754.method2028(this.field2758);
        if (this.field2762) {
            this.field2758.method2565(0);
            this.field2758.method2565(1);
            this.field2758.method2565(8);
            if (this.field2767[0] != null) {
                this.field2758.method2561(0, this.field2767[0]);
            }
            if (this.field2767[1] != null) {
                this.field2758.method2561(1, this.field2767[1]);
            }
            if (this.field2768 != null) {
                this.field2758.method2561(8, this.field2768);
            }
            if (this.field2765 != null) {
                this.field2758.method2567(8, this.field2765);
            }
            this.field2758.method2563(0);
            this.field2762 = false;
            var5 = true;
        }
        if (!var5 || this.field2758.method2566()) {
            this.field2760 = arg0;
            this.field2757 = arg1;
            this.field2754.method2092(-this.field2760, this.field2759 + this.field2757 - var7);
            return true;
        }
        this.field2754.method2063(this.field2758);
        this.field2769 = true;
        this.field2763 = true;
        this.field2762 = true;
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Luk;)V")
    public final void method1168(class157 arg0) {
        this.method1164(arg0, true);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lbf;)V")
    public class204(class344 arg0) {
        this.field2754 = arg0;
        if (this.field2754.field4656 && this.field2754.field4684) {
            this.field2758 = new class435(this.field2754);
        }
    }
}
