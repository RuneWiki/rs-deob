import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class226 {

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    private int field3073 = 0;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    private int field3074 = -1;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    private int field3072 = -1;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    private int field3076 = 0;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Lmk;")
    private class154 field3070 = new class154();

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "Z")
    private boolean field3077 = true;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "[Ljo;")
    private class218[] field3081 = new class218[2];

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
    private int field3078 = -1;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    private int field3079 = 0;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "Z")
    private boolean field3080 = true;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "Z")
    private boolean field3082 = false;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "Z")
    private boolean field3085 = true;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Lql;")
    private class346 field3075;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Lvr;")
    private class415 field3071;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "Lvf;")
    private class152 field3084;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "Ljo;")
    private class218 field3083;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()V", line = 4)
    public final void method1221() {
        if (!this.method1226()) {
            return;
        }
        opengl var1 = this.field3075.field4697;
        this.field3075.method2106();
        this.field3075.method2044(0);
        this.field3075.method1584();
        int var2 = 0;
        int var3 = 1;
        class78 var5;
        for (class78 var4 = (class78) this.field3070.method814((byte) 90); var4 != null; var4 = var5) {
            var5 = (class78) this.field3070.method827(74);
            int var6 = var4.method435(1);
            for (int var7 = 0; var7 < var6; var7++) {
                var4.method47(var7, this.field3081[var2], this.field3083);
                if (var5 == null && var6 - 1 == var7) {
                    this.field3075.method2100(this.field3071);
                    this.field3075.method2069(0, 0);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, (float) this.field3072);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(this.field3073, this.field3076);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(this.field3073, this.field3076 + this.field3072);
                    var1.glTexCoord2f((float) this.field3074, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field3074 + this.field3073, this.field3076 + this.field3072);
                    var1.glTexCoord2f((float) this.field3074, (float) this.field3072);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field3074 + this.field3073, this.field3076);
                    var1.glEnd();
                } else {
                    this.field3071.method2574(var3);
                    var1.glBegin(7);
                    var1.glTexCoord2f(0.0F, 0.0F);
                    var1.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    var1.glVertex2i(0, 0);
                    var1.glTexCoord2f(0.0F, (float) this.field3072);
                    var1.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    var1.glVertex2i(0, this.field3072);
                    var1.glTexCoord2f((float) this.field3074, (float) this.field3072);
                    var1.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    var1.glVertex2i(this.field3074, this.field3072);
                    var1.glTexCoord2f((float) this.field3074, 0.0F);
                    var1.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    var1.glVertex2i(this.field3074, 0);
                    var1.glEnd();
                }
                var4.method50(var7);
                var3 = var3 + 1 & 0x1;
                var2 = var2 + 1 & 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "()V", line = 81)
    public final void method1222() {
        if (this.field3071 != null) {
            this.field3071 = null;
            this.field3081 = null;
            this.field3084 = null;
            this.field3083 = null;
            this.field3077 = true;
            this.field3085 = true;
            this.field3080 = true;
            if (!this.field3070.method823(125)) {
                for (class338 var1 = this.field3070.method814((byte) 90); var1 != this.field3070.field1942; var1 = var1.field4505) {
                    ((class78) var1).method54();
                }
            }
        }
        this.field3074 = this.field3072 = -1;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "()V", line = 110)
    private final void method1223() {
        int var1 = 0;
        int var2 = 0;
        boolean var3 = false;
        for (class78 var4 = (class78) this.field3070.method814((byte) 90); var4 != null; var4 = (class78) this.field3070.method827(2)) {
            int var5 = var4.method48();
            if (var5 > var1) {
                var1 = var5;
            }
            var2 += var4.method435(1);
            var3 |= var4.method434(false);
        }
        int var6;
        if (var1 == 2) {
            var6 = 34836;
        } else if (var1 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field3078 != var6) {
            this.field3078 = var6;
            this.field3077 = true;
        }
        int var7 = this.field3079 > 2 ? 2 : this.field3079;
        int var8 = var2 > 2 ? 2 : var2;
        if (var7 != var8) {
            this.field3080 = this.field3077 = true;
        }
        if (this.field3082 != var3) {
            this.field3082 = var3;
            this.field3085 = true;
        }
        this.field3079 = var2;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ltk;Z)V", line = 162)
    private final void method1224(class78 arg0, boolean arg1) {
        if (arg1) {
            arg0.method54();
        }
        arg0.field878 = false;
        arg0.method1967(-1);
        this.method1223();
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII)Z", line = 170)
    public final boolean method1225(int arg0, int arg1, int arg2, int arg3) {
        if (this.field3071 == null || this.field3070.method823(125)) {
            return false;
        }
        boolean var5 = false;
        if (this.field3074 != arg2 || this.field3072 != arg3) {
            this.field3074 = arg2;
            this.field3072 = arg3;
            for (class338 var6 = this.field3070.method814((byte) 90); var6 != this.field3070.field1942; var6 = var6.field4505) {
                ((class78) var6).method53(this.field3074, this.field3072);
            }
            this.field3077 = true;
            this.field3085 = true;
        }
        if (this.field3085) {
            if (this.field3084 != null) {
                this.field3084.method809();
                this.field3084 = null;
            }
            if (this.field3083 != null) {
                this.field3083.method234();
                this.field3083 = null;
            }
            if (this.field3082) {
                this.field3083 = new class218(this.field3075, 34037, 6402, this.field3074, this.field3072);
            } else {
                this.field3084 = new class152(this.field3075, 6402, this.field3074, this.field3072);
            }
            this.field3080 = true;
            this.field3085 = false;
            var5 = true;
        }
        if (this.field3077) {
            if (this.field3081[0] != null) {
                this.field3081[0].method234();
                this.field3081[0] = null;
            }
            if (this.field3081[1] != null) {
                this.field3081[1].method234();
                this.field3081[1] = null;
            }
            this.field3081[0] = new class218(this.field3075, 34037, this.field3078, this.field3074, this.field3072);
            this.field3081[1] = this.field3079 > 1 ? new class218(this.field3075, 34037, this.field3078, this.field3074, this.field3072) : null;
            this.field3080 = true;
            this.field3077 = false;
            var5 = true;
        }
        int var7 = this.field3075.method2104().method2065();
        this.field3075.method2102(this.field3071);
        if (this.field3080) {
            this.field3071.method2577(0);
            this.field3071.method2577(1);
            this.field3071.method2577(8);
            if (this.field3081[0] != null) {
                this.field3071.method2578(0, this.field3081[0]);
            }
            if (this.field3081[1] != null) {
                this.field3071.method2578(1, this.field3081[1]);
            }
            if (this.field3083 != null) {
                this.field3071.method2578(8, this.field3083);
            }
            if (this.field3084 != null) {
                this.field3071.method2579(8, this.field3084);
            }
            this.field3071.method2574(0);
            this.field3080 = false;
            var5 = true;
        }
        if (!var5 || this.field3071.method2573()) {
            this.field3073 = arg0;
            this.field3076 = arg1;
            this.field3075.method2069(-this.field3073, this.field3076 + this.field3072 - var7);
            return true;
        }
        this.field3075.method2100(this.field3071);
        this.field3077 = true;
        this.field3085 = true;
        this.field3080 = true;
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "()Z", line = 278)
    private final boolean method1226() {
        return this.field3075.method2104() == this.field3071;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ltk;)Z", line = 281)
    public final boolean method1227(class78 arg0) {
        if (this.field3071 != null) {
            if (arg0.method51() || arg0.method49()) {
                if (this.field3074 != -1 && this.field3072 != -1) {
                    arg0.method53(this.field3074, this.field3072);
                }
                arg0.field878 = true;
                this.field3070.method825(82, arg0);
                this.method1223();
                return true;
            }
            arg0.method54();
        }
        return false;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lql;)V", line = 361)
    public class226(class346 arg0) {
        this.field3075 = arg0;
        if (this.field3075.field4754 && this.field3075.field4808) {
            this.field3071 = new class415(this.field3075);
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Ltk;)V", line = 317)
    public final void method1228(class78 arg0) {
        this.method1224(arg0, true);
    }
}
