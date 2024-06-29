import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class356 {

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    private int field5216 = -1;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    private int field5219 = 0;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    private int field5218 = -1;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    private int field5221 = 0;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Lmi;")
    private class408 field5217 = new class408();

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Z")
    private boolean field5225 = true;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "[Leq;")
    private class140[] field5224 = new class140[2];

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
    private boolean field5222 = false;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Z")
    private boolean field5227 = true;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    private int field5228 = -1;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "Z")
    private boolean field5229 = true;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    private int field5226 = 0;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Lih;")
    private class330 field5215;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Lkq;")
    private class89 field5220;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Leq;")
    private class140 field5223;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Lwk;")
    private class428 field5230;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lvr;)V", line = 3)
    public final void method2334(class415 arg0) {
        this.method2335(arg0, true);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lvr;Z)V", line = 6)
    private final void method2335(class415 arg0, boolean arg1) {
        if (arg1) {
            arg0.method2215();
        }
        arg0.field6191 = false;
        arg0.method2574((byte) 125);
        this.method2339();
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()Z", line = 19)
    private final boolean method2336() {
        return this.field5215.method2046() == this.field5220;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "()V", line = 25)
    public final void method2337() {
        if (!this.method2336()) {
            return;
        }
        opengl var1 = this.field5215.field4741;
        this.field5215.method2076();
        this.field5215.method2044(0);
        this.field5215.method2034();
        int var2 = 0;
        int var3 = 1;
        class415 var5;
        for (class415 var4 = (class415) this.field5217.method2649(0); var4 != null; var4 = var5) {
            var5 = (class415) this.field5217.method2656(0);
            int var6 = var4.method2684(0);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method2221(var7, this.field5224[var2], this.field5223);
                if (var5 == null && var6 - 1 == var7) {
                    this.field5215.method2159(this.field5220);
                    this.field5215.method2040(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field5216);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field5219, this.field5221);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field5219, this.field5221 + this.field5216);
                    var1.glTexCoord2f((float) this.field5218, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field5219 + this.field5218, this.field5221 + this.field5216);
                    var1.glTexCoord2f((float) this.field5218, (float) this.field5216);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field5219 + this.field5218, this.field5221);
                    var1.glEnd();
                } else {
                    this.field5220.method552(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field5216);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field5216);
                    var1.glTexCoord2f((float) this.field5218, (float) this.field5216);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field5218, this.field5216);
                    var1.glTexCoord2f((float) this.field5218, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field5218, 0);
                    var1.glEnd();
                }
                var4.method2216(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lih;)V", line = 361)
    public class356(class330 arg0) {
        this.field5215 = arg0;
        if (this.field5215.field4791 && this.field5215.field4796) {
            this.field5220 = new class89(this.field5215);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(Lvr;)Z", line = 106)
    public final boolean method2338(class415 arg0) {
        if (this.field5220 != null) {
            if (arg0.method2218() || arg0.method2219()) {
                if (this.field5218 != -1 && this.field5216 != -1) {
                    arg0.method2220(this.field5218, this.field5216);
                }
                arg0.field6191 = true;
                this.field5217.method2660((byte) -127, arg0);
                this.method2339();
                return true;
            }
            arg0.method2215();
        }
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "()V", line = 132)
    private final void method2339() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class415 var4 = (class415) this.field5217.method2649(0); var4 != null; var4 = (class415) this.field5217.method2656(0)) {
            int var5 = var4.method2217();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method2684(0);
            var3 |= var4.method2683(126);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field5228 != var6) {
            this.field5228 = var6;
            this.field5229 = true;
        }
        int var7 = this.field5226 > 2 ? 2 : this.field5226;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field5225 = this.field5229 = true;
        }
        if (this.field5222 != var3) {
            this.field5222 = var3;
            this.field5227 = true;
        }
        this.field5226 = var2;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "()V", line = 184)
    public final void method2340() {
        if (this.field5220 != null) {
            this.field5220 = null;
            this.field5224 = null;
            this.field5230 = null;
            this.field5223 = null;
            this.field5229 = true;
            this.field5227 = true;
            this.field5225 = true;
            if (!this.field5217.method2657(-102)) {
                for (class393 var1 = this.field5217.method2649(0); var1 != this.field5217.field6108; var1 = var1.field5895) {
                    ((class415) var1).method2215();
                }
            }
        }
        this.field5218 = this.field5216 = -1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)Z", line = 218)
    public final boolean method2341(int arg0, int arg1, int arg2, int arg3) {
        if (this.field5220 == null || this.field5217.method2657(-69)) {
            return false;
        }
        boolean var5 = false;
        if (this.field5218 != arg2 || this.field5216 != arg3) {
            this.field5218 = arg2;
            this.field5216 = arg3;
            for (class393 var6 = this.field5217.method2649(0); var6 != this.field5217.field6108; var6 = var6.field5895) {
                ((class415) var6).method2220(this.field5218, this.field5216);
            }
            this.field5229 = true;
            this.field5227 = true;
        }
        if (this.field5227) {
            if (this.field5230 != null) {
                this.field5230.method2736();
                this.field5230 = null;
            }
            if (this.field5223 != null) {
                this.field5223.method1386();
                this.field5223 = null;
            }
            if (this.field5222) {
                this.field5223 = new class140(this.field5215, 34037, 6402, this.field5218, this.field5216);
            } else {
                this.field5230 = new class428(this.field5215, 6402, this.field5218, this.field5216);
            }
            this.field5225 = true;
            this.field5227 = false;
            var5 = true;
        }
        if (this.field5229) {
            if (this.field5224[0] != null) {
                this.field5224[0].method1386();
                this.field5224[0] = null;
            }
            if (this.field5224[1] != null) {
                this.field5224[1].method1386();
                this.field5224[1] = null;
            }
            this.field5224[0] = new class140(this.field5215, 34037, this.field5228, this.field5218, this.field5216);
            this.field5224[1] = this.field5226 > 1 ? new class140(this.field5215, 34037, this.field5228, this.field5218, this.field5216) : null;
            this.field5225 = true;
            this.field5229 = false;
            var5 = true;
        }
        int var7 = this.field5215.method2046().method554();
        this.field5215.method2103(this.field5220);
        if (this.field5225) {
            this.field5220.method551(0);
            this.field5220.method551(1);
            this.field5220.method551(8);
            if (this.field5224[0] != null) {
                this.field5220.method559(0, this.field5224[0]);
            }
            if (this.field5224[1] != null) {
                this.field5220.method559(1, this.field5224[1]);
            }
            if (this.field5223 != null) {
                this.field5220.method559(8, this.field5223);
            }
            if (this.field5230 != null) {
                this.field5220.method553(8, this.field5230);
            }
            this.field5220.method552(0);
            this.field5225 = false;
            var5 = true;
        }
        if (!var5 || this.field5220.method557()) {
            this.field5219 = arg0;
            this.field5221 = arg1;
            this.field5215.method2040(-this.field5219, this.field5221 + this.field5216 - var7);
            return true;
        }
        this.field5215.method2159(this.field5220);
        this.field5229 = true;
        this.field5227 = true;
        this.field5225 = true;
        return false;
    }
}
