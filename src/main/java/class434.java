import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class434 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    private int field6316 = 0;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    private int field6317 = -1;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    private int field6321 = -1;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    private int field6322 = 0;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Leb;")
    private class395 field6318 = new class395();

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Z")
    private boolean field6323 = true;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Z")
    private boolean field6326 = true;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "[Lqb;")
    private class89[] field6327 = new class89[2];

    @OriginalMember(owner = "client!of", name = "j", descriptor = "Z")
    private boolean field6325 = false;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    private int field6328 = 0;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    private int field6331 = -1;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "Z")
    private boolean field6330 = true;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lks;")
    private class173 field6320;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Ltj;")
    private class442 field6319;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lq;")
    private class211 field6329;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "Lqb;")
    private class89 field6324;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V", line = 5)
    private final void method2659() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class40 var4 = (class40) this.field6318.method2478(1603); var4 != null; var4 = (class40) this.field6318.method2486((byte) -82)) {
            int var5 = var4.method350();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method352(-92);
            var3 |= var4.method349(11509);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field6331 != var6) {
            this.field6331 = var6;
            this.field6326 = true;
        }
        int var7 = this.field6328 > 2 ? 2 : this.field6328;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field6323 = this.field6326 = true;
        }
        if (this.field6325 != var3) {
            this.field6325 = var3;
            this.field6330 = true;
        }
        this.field6328 = var2;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()V", line = 59)
    public final void method2660() {
        if (!this.method2666()) {
            return;
        }
        opengl var1 = this.field6320.field2253;
        this.field6320.method1128();
        this.field6320.method1179(0);
        this.field6320.method162();
        int var2 = 0;
        int var3 = 1;
        class40 var5;
        for (class40 var4 = (class40) this.field6318.method2478(1603); var4 != null; var4 = var5) {
            var5 = (class40) this.field6318.method2486((byte) -82);
            int var6 = var4.method352(-93);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method354(var7, this.field6327[var2], this.field6324);
                if (var5 == null && var6 - 1 == var7) {
                    this.field6320.method1182(this.field6319);
                    this.field6320.method1152(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field6321);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field6316, this.field6322);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field6316, this.field6322 + this.field6321);
                    var1.glTexCoord2f((float) this.field6317, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field6317 + this.field6316, this.field6322 + this.field6321);
                    var1.glTexCoord2f((float) this.field6317, (float) this.field6321);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field6317 + this.field6316, this.field6322);
                    var1.glEnd();
                } else {
                    this.field6319.method2710(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field6321);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field6321);
                    var1.glTexCoord2f((float) this.field6317, (float) this.field6321);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field6317, this.field6321);
                    var1.glTexCoord2f((float) this.field6317, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field6317, 0);
                    var1.glEnd();
                }
                var4.method355(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lks;)V", line = 361)
    public class434(class173 arg0) {
        this.field6320 = arg0;
        if (this.field6320.field2311 && this.field6320.field2359) {
            this.field6319 = new class442(this.field6320);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lgh;)Z", line = 140)
    public final boolean method2661(class40 arg0) {
        if (this.field6319 != null) {
            if (arg0.method351() || arg0.method356()) {
                if (this.field6317 != -1 && this.field6321 != -1) {
                    arg0.method347(this.field6317, this.field6321);
                }
                arg0.field544 = true;
                this.field6318.method2484(0, arg0);
                this.method2659();
                return true;
            }
            arg0.method348();
        }
        return false;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lgh;Z)V", line = 166)
    private final void method2662(class40 arg0, boolean arg1) {
        if (arg1) {
            arg0.method348();
        }
        arg0.field544 = false;
        arg0.method1820(-25246);
        this.method2659();
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Lgh;)V", line = 175)
    public final void method2663(class40 arg0) {
        this.method2662(arg0, true);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "()V", line = 181)
    public final void method2664() {
        if (this.field6319 != null) {
            this.field6319 = null;
            this.field6327 = null;
            this.field6329 = null;
            this.field6324 = null;
            this.field6326 = true;
            this.field6330 = true;
            this.field6323 = true;
            if (!this.field6318.method2473((byte) -126)) {
                for (class264 var1 = this.field6318.method2478(1603); var1 != this.field6318.field5735; var1 = var1.field3906) {
                    ((class40) var1).method348();
                }
            }
        }
        this.field6317 = this.field6321 = -1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)Z", line = 208)
    public final boolean method2665(int arg0, int arg1, int arg2, int arg3) {
        if (this.field6319 == null || this.field6318.method2473((byte) -123)) {
            return false;
        }
        boolean var5 = false;
        if (this.field6317 != arg2 || this.field6321 != arg3) {
            this.field6317 = arg2;
            this.field6321 = arg3;
            for (class264 var6 = this.field6318.method2478(1603); var6 != this.field6318.field5735; var6 = var6.field3906) {
                ((class40) var6).method347(this.field6317, this.field6321);
            }
            this.field6326 = true;
            this.field6330 = true;
        }
        if (this.field6330) {
            if (this.field6329 != null) {
                this.field6329.method1448();
                this.field6329 = null;
            }
            if (this.field6324 != null) {
                this.field6324.method1401();
                this.field6324 = null;
            }
            if (this.field6325) {
                this.field6324 = new class89(this.field6320, 34037, 6402, this.field6317, this.field6321);
            } else {
                this.field6329 = new class211(this.field6320, 6402, this.field6317, this.field6321);
            }
            this.field6323 = true;
            this.field6330 = false;
            var5 = true;
        }
        if (this.field6326) {
            if (this.field6327[0] != null) {
                this.field6327[0].method1401();
                this.field6327[0] = null;
            }
            if (this.field6327[1] != null) {
                this.field6327[1].method1401();
                this.field6327[1] = null;
            }
            this.field6327[0] = new class89(this.field6320, 34037, this.field6331, this.field6317, this.field6321);
            this.field6327[1] = this.field6328 > 1 ? new class89(this.field6320, 34037, this.field6331, this.field6317, this.field6321) : null;
            this.field6323 = true;
            this.field6326 = false;
            var5 = true;
        }
        int var7 = this.field6320.method1155().method1147();
        this.field6320.method1131(this.field6319);
        if (this.field6323) {
            this.field6319.method2711(0);
            this.field6319.method2711(1);
            this.field6319.method2711(8);
            if (this.field6327[0] != null) {
                this.field6319.method2713(0, this.field6327[0]);
            }
            if (this.field6327[1] != null) {
                this.field6319.method2713(1, this.field6327[1]);
            }
            if (this.field6324 != null) {
                this.field6319.method2713(8, this.field6324);
            }
            if (this.field6329 != null) {
                this.field6319.method2716(8, this.field6329);
            }
            this.field6319.method2710(0);
            this.field6323 = false;
            var5 = true;
        }
        if (!var5 || this.field6319.method2709()) {
            this.field6316 = arg0;
            this.field6322 = arg1;
            this.field6320.method1152(-this.field6316, this.field6322 + this.field6321 - var7);
            return true;
        }
        this.field6320.method1182(this.field6319);
        this.field6326 = true;
        this.field6330 = true;
        this.field6323 = true;
        return false;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "()Z", line = 326)
    private final boolean method2666() {
        return this.field6320.method1155() == this.field6319;
    }
}
